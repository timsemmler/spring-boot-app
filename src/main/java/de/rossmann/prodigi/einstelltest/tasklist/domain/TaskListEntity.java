package de.rossmann.prodigi.einstelltest.tasklist.domain;

import de.rossmann.prodigi.einstelltest.user.UserEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import javax.persistence.*;
import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Data
@Table(name = "TASKLIST", uniqueConstraints = @UniqueConstraint(columnNames = {"name", "USER"}))
@EqualsAndHashCode(of = "id")
@ToString(exclude ="tasks")
public class TaskListEntity {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    @ManyToOne
    @JoinColumn(name = "USER")
    private UserEntity user;
    @OneToMany(mappedBy = "taskList")
    private Set<TaskEntity> tasks = new LinkedHashSet<>();
}
