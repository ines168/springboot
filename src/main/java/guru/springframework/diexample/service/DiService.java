package guru.springframework.diexample.service;

import guru.springframework.diexample.repositories.DiRepo;

public class DiService {
    private DiRepo repo;

    public DiService(DiRepo repo) {
        this.repo = repo;
    }

    public String getGreeting() {
        return repo.queryDatabase();
    }
}
