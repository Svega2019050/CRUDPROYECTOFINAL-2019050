Drop database if exists DBProyecto;
Create database DBProyecto;
Use DBProyecto;

create  table Persona(
	codigoPersona int not null auto_increment,
    DPI varchar(15) not null,
    nombrePersona varchar(200) not null,
    primary key PK_codigoPersona (codigoPersona)
);

insert into Persona(DPI, nombrePersona) values ("124578","Josue Tumax");
insert into Persona(DPI, nombrePersona) values ("968574","Carlos Ruano");
insert into Persona(DPI, nombrePersona) values ("159585","Jose Gonzales");