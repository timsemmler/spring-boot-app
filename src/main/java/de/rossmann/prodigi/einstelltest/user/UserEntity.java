package de.rossmann.prodigi.einstelltest.user;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@Table(name = "USER")
@EqualsAndHashCode(of = "username")
public class UserEntity {
    @Id
    private String username;
}
