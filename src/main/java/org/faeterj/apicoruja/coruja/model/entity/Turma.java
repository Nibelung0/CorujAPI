package org.faeterj.apicoruja.coruja.model.entity;

import javax.persistence.*;

@Entity
@Table(name="turma")
public class Turma {

    @Id
    @Column(name="turma_id")
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;

    @Column(name="codigo")
    private String codigo;

    @Column(name="sala")
    private String sala;

    @Column(name="turno")
    private char turno; // M = Manhã, T = Tarde, N = Noite, D = Diurno

    // ==================================================================

    public Turma ( ) {
    
    }

    public Turma (Long id, String codigo, String sala, char turno) {
        this.id     = id;
        this.codigo = codigo;
        this.sala   = sala;
        this.turno  = turno;
    }

    // ====================================================================
  
	public Long getId ( ) {
		return id;
	}
	
	public void setId (Long id) {
		this.id = id;
	}

	// ---------------------------------------------------
	
	public String getCodigo ( ) {
		return codigo;
	}
	
	public void setCodigo (String codigo) {
		this.codigo = codigo;
	}

	// ---------------------------------------------------
	
	public String getSala ( ) {
		return sala;
	}
	
	public void setSala (String sala) {
		this.sala = sala;
	}

	// ---------------------------------------------------
	
	public char getTurno ( ) {
		return turno;
	}
	
	public void setTurno (char turno) {
		this.turno = turno;
	}
  
}

// OK
