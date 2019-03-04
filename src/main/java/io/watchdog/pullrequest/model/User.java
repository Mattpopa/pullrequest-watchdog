package io.watchdog.pullrequest.model;

import lombok.*;
import lombok.experimental.FieldDefaults;

/**
 * @author vladclaudiubulimac on 2019-03-01.
 */

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class User {

    String username;
    String name;

}
