package guru.springframework.diexample.service;

import guru.springframework.diexample.repositories.LegacyRepo;

public class LegacyGreetingService {
    public String getGreeting() {
        LegacyRepo legacyRepo = new LegacyRepo();

        return  legacyRepo.queryDatabase();
    }
}
