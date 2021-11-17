package com.matteoveroni.helloweld.producers;

import com.matteoveroni.helloweld.dto.User;
import jakarta.enterprise.inject.Produces;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class RandomUserProducer {

    private final Random random = new Random();
    private final List<String> names = Arrays.asList("Mario", "Sara", "John", "Jude");
    private final List<Integer> ages = Arrays.asList(22, 14, 74, 45);

    @Produces
    public User produceRandomUser() {
        int randomNameIndex = random.nextInt(names.size());
        String randomName = names.get(randomNameIndex);

        int randomAgeIndex = random.nextInt(names.size());
        Integer randomAge = ages.get(randomAgeIndex);

        return new User(randomName, randomAge);
    }
}
