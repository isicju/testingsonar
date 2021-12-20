package com.reporting;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NonNull;

public class Main {
    public static void main(String[] args) {
        String kek = null;
        User user = User.builder().age(12).build();
        System.out.println(user.getId().length());
        User user2 = new User(null, 12);
    }

    @Builder
    @AllArgsConstructor
    @Data
    static class User {
        @NonNull
        private String id;

        private int age;

    }
}
