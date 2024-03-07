package io.github.companybteamdelta.telegrammgmt.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "configs")
public class ConfigRecord {

    @Id
    String record_name;

    @Setter
    String record_value;

}
