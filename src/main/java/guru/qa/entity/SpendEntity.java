package guru.qa.entity;

import guru.qa.data.Category;

public class SpendEntity {
    private int id;
    private int accountId;
    private Category spendCategory;
    private int spend;
    private String description;

    public int getId() {
        return id;
    }

    public int getAccountId() {
        return accountId;
    }

    public Category getSpendCategory() {
        return spendCategory;
    }

    public int getSpend() {
        return spend;
    }

    public String getDescription() { return description; }

    public SpendEntity setId(int id) {
        this.id = id;
        return this;
    }

    public SpendEntity setAccountId(int accountId) {
        this.accountId = accountId;
        return this;
    }

    public SpendEntity setSpendCategory(Category spendCategory) {
        this.spendCategory = spendCategory;
        return this;
    }

    public SpendEntity setSpend(int spend) {
        this.spend = spend;
        return this;
    }

    public SpendEntity setDescription(String description) {
        this.description = description;
        return this;
    }
}
