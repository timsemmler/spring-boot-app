package de.rossmann.todo.domain;

import javax.persistence.*;

@Entity
public class Tasklist {

    @Id
    @GeneratedValue
    Long id;

    @Column(name = "Bezeichnung")
    String bezeichnung;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBezeichnung() {
        return bezeichnung;
    }

    public void setBezeichnung(String bezeichnung) {
        this.bezeichnung = bezeichnung;
    }

}
