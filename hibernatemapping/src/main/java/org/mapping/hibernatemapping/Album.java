package org.mapping.hibernatemapping;
import lombok.Getter;
import lombok.Setter;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

@Table(name="album_table")

public class Album {
	
	@Id
	@Column(name="albumid")
	public int albumid;
	@Column(name="albumname")
	public String albumname;
	@Embedded
	public Singer singer;
	@OneToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY,mappedBy = "Album")
	
	Singer

}
