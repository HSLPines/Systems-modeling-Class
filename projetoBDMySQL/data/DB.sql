
create schema modelagemSistemas;
use modelagemSistemas;

create table venda(
	id int auto_increment primary key,
    vendedor varchar(50),
    total decimal
);
