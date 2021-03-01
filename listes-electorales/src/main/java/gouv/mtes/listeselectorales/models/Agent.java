package gouv.mtes.listeselectorales.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "agent")
public class Agent {
	@Id
	private Long id;
	private String nom;
	private String prenom;
}
