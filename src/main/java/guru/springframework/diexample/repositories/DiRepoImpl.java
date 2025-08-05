package guru.springframework.diexample.repositories;

import guru.springframework.diexample.database.DataStore;

public class DiRepoImpl implements Repo {
    private DataStore store;

    public DiRepoImpl(DataStore store) {
        this.store = store;
    }

    public String queryDatabase() {
        return store.queryDatabase();
    }
}
