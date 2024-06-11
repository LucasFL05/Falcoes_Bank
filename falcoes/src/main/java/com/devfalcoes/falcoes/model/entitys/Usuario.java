package com.devfalcoes.falcoes.model.entitys;

import lombok.Data;

@Data
public abstract class Usuario {

	String nome;
	String unidade;
	String cargo;
	String classes;
	Integer falcoritos;
}
