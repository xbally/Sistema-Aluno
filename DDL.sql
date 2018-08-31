/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Author:  gabri
 * Created: Aug 21, 2018
 */


CREATE TABLE Aluno(
codaluno serial PRIMaRY KEY,
CPF varchar(11),
nome varchar(50),
dataMatricula date,
dataNascimento date,
filiacao varchar(50),
CONSTRAINT ukCPFc UNIQUE (CPF)
);

CREATE TABLE Curso(
codcurso serial PRIMARY KEY,
nomeCurso varchar(50),
dataInicio date,
nivel int
);


CREATE TABLE Disciplina(
coddisciplina serial PRIMARY KEY,
nomeDisciplina varchar(50),
cargaHoraria float,
ementa varchar(50)
);

CREATE TABLE curso_disciplina(
curso int,
disciplina int,
CONSTRAINT pkcurso_disciplina PRIMARY KEY(curso, disciplina),
FOREIGN KEY (curso) REFERENCES Curso(codcurso),
FOREIGN KEY (disciplina) REFERENCES Disciplina(coddisciplina)
);

CREATE TABLE curso_aluno(
aluno int,
curso int,
CONSTRAINT pkcurso_aluno PRIMARY KEY(aluno,curso),
FOREIGN KEY (aluno) REFERENCES Aluno(codaluno),
FOREIGN KEY (curso) REFERENCES Curso(codcurso)
);

CREATE TABLE disciplina_aluno(
aluno int,
disciplina int,
periodo int,
dataDisciplina date,
CONSTRAINT pkdisciplina_aluno PRIMARY KEY(aluno, disciplina),
FOREIGN KEY (aluno)	REFERENCES Aluno(codaluno),
FOREIGN KEY (disciplina) REFERENCES Disciplina(coddisciplina)
);