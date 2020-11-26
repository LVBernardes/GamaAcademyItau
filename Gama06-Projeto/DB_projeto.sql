create database proj_agendamento;

use proj_agendamento;

create table itmn032_agencia(
   id integer not null auto_increment,
   nome_agencia varchar(100),
   hora_inicio  integer,
   hora_fim     integer,
   
   constraint pk_agencia primary key (id)
);

create table itmn032_agendamento(
   num_seq integer not null auto_increment,
   nome_cli  varchar(100),
   email_cli varchar(100),
   celular_cli varchar(20),
   data_agendamento date,
   hora_agendamento varchar(10),
   observacao varchar(255),
   id_agencia integer not null,
   constraint pk_agendamento primary key (num_seq),
   constraint fk_agencia foreign key (id_agencia) references itmn032_agencia(id)
);

create table tbl_usuario(
   id_user   integer not null auto_increment,
   nome      varchar(100),
   email     varchar(100),
   racf      varchar(7),
   senha     varchar(50),
   link_foto varchar(255),
   
   constraint pk_usuario primary key(id_user)
);


insert into proj_agendamento.tbl_usuario 
	values 
    (null,"Leandro","leandro@leandro.com","7654321","0000",""),
    (null,"Isidro","isidro@isidro.com","1234567","1234","");
    
    
select * from proj_agendamento.tbl_usuario;