package pl.lodz.p.domain.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "test_script")
public class TestScript {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "test_script_seq_gen")
	@SequenceGenerator(name = "test_script_seq_gen", sequenceName = "test_script_seq")
	private Integer id;
	@Column
	private String name;
	@Column
	private String description;
	@Column
	private String path;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

}
