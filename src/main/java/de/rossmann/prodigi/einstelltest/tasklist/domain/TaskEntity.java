package de.rossmann.prodigi.einstelltest.tasklist.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Data
@Table(name = "TASK")
@EqualsAndHashCode(of = "id")
public class TaskEntity {
    @Id
    @GeneratedValue
    private Long id;
    @ManyToOne
    @JoinColumn(nullable = false, name ="TASKLIST" )
    @JsonIgnore
    private TaskListEntity taskList;
    private String name;
    private String beschreibung;
    private LocalDate erledigtAm;
    private boolean erledigt;
}
