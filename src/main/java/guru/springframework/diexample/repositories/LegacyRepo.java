package guru.springframework.diexample.repositories;

import guru.springframework.diexample.database.FakeDataStore;

public class LegacyRepo {
    public  String queryDatabase() {
        FakeDataStore store = new FakeDataStore();
        store.setUser("ic");
        store.setPassword("password");
        store.setUrl("jdbc_mysql://localhost:3306/test");

        return store.queryDatabase();
    }
}
