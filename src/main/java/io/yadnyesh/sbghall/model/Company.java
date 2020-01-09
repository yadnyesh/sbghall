package io.yadnyesh.sbghall.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Embeddable
public class Company {

	@Column(name="company_name")
	private String name;
	private String catchPhrase;
	private String bs;
}
