package guru.qa.db.implementation;

import guru.qa.db.AccountEntityRowMapper;
import guru.qa.db.AccountRepository;
import guru.qa.db.DataSourceProvider;
import guru.qa.entity.AccountEntity;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.lang.Nullable;

import javax.sql.DataSource;
import java.util.List;

public class PostgresAccountRepository implements AccountRepository {
    private static final JdbcTemplate template =
            new JdbcTemplate((DataSource) DataSourceProvider.INSTANCE.getDatasource());
    @Override
    public List<AccountEntity> getAll() {
        return template.query("SELECT * FROM account;", new AccountEntityRowMapper());
    }

    @Override
    public AccountEntity getByName(String accountName) {
        try {
            return template.queryForObject("SELECT * FROM account WHERE name = ?;", new AccountEntityRowMapper(), accountName);
        } catch (EmptyResultDataAccessException e) {
            return null;
        }
    }

    @Override
    @Nullable
    public AccountEntity addAccount(AccountEntity account) {
        template.update("INSERT INTO account (name, value ) VALUES (?, ?);", account.getName(), account.getValue());
        return account;
    }

    @Override
    public void updateAccount(AccountEntity account) {
        template.update("UPDATE account SET name = ?, value = ?;", account.getName(), account.getValue());
    }
}
