package guru.qa.db;

import guru.qa.entity.AccountEntity;

import java.util.List;

public interface AccountRepository {
    List<AccountEntity> getAll();
    AccountEntity getByName(String accountName);
    AccountEntity addAccount(AccountEntity account);

    void updateAccount (AccountEntity account);
}
