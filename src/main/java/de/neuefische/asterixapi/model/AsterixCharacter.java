package de.neuefische.asterixapi.model;

import lombok.With;

@With
public record AsterixCharacter(
        String id,
        String name,
        int age,
        String profession
) {
}
