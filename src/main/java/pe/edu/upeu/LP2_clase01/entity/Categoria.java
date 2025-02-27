package pe.edu.upeu.LP2_clase01.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Entity
@Table(name = "tbl_categorias")

public class Categoria {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	@Column(name = "id")
	private Long id;
	@Column(name = "nombre")

	private String nombre;
	@Column(name = "estado")

	private char estado;

}
