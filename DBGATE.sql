drop database if exists dbgate;
create database if not exists dbgate;
use dbgate;


-- -----------------------------------------------------
-- Tabela `Cliente`
-- ----------------------------------------------------- 
create table Cliente(

	cpfCliente varchar(14) not null,
	nomeCliente varchar (30) not null,
	enderecoCliente varchar(30) not null,
	telefoneCliente varchar(16) not null,
	dscCargo varchar(30) not null,
	statusInadimplencia bool,

primary key(cpfCliente))
ENGINE = InnoDB
DEFAULT CHARSET = utf8mb4;




-- -----------------------------------------------------
-- Tabela `Cargo`
-- -----------------------------------------------------
create table Cargo(

	idCargo int not null,
	dscCargo int not null,
	fk_cpfCliente varchar(14) not null,

constraint foreign key(fk_cpfCliente) references Cliente(cpfCliente),
primary key(idCargo))
ENGINE = InnoDB
DEFAULT CHARSET = utf8mb4;


-- -----------------------------------------------------
-- Tabela `Perfil`
-- -----------------------------------------------------
create table Perfil(
	
    idPerfil int not null,
	dscPerfil varchar(30) not null,

primary key(idPerfil))
ENGINE = InnoDB
DEFAULT CHARSET = utf8mb4;


-- -----------------------------------------------------
-- Tabela `Funcionario`
-- -----------------------------------------------------
create table Funcionario(

	cpfFuncionario varchar(14) not null,
	nomeFuncionario varchar(30) not null,
	enderecoFuncionario varchar(300) not null,
	telefoneFuncionario varchar(16) not null,
	dscPerfil varchar(30) not null,
    login varchar(10) not null,
    senha varchar(10) not null,
	

primary key(cpfFuncionario))
ENGINE = InnoDB
DEFAULT CHARSET = utf8mb4;


-- -----------------------------------------------------
-- Tabela `Inadimplencia`
-- -----------------------------------------------------
create table Inadimplencia(
	
    idInadimplencia int not null,
	valorInadimplencia double not null,
	dataInicio date not null,
	dataVencimento date not null,
	fk_cpfCliente varchar(14) not null,

	constraint foreign key(fk_cpfCliente) references Cliente(cpfCliente),
primary key(idInadimplencia))
ENGINE = InnoDB
DEFAULT CHARSET = utf8mb4;


-- -----------------------------------------------------
-- Tabela `Setor`
-- -----------------------------------------------------
create table Setor(
	
    idSetor int not null,
	dscSetor int not null,

primary key (idSetor))
ENGINE = Innodb
DEFAULT CHARSET = utf8mb4;


-- -----------------------------------------------------
-- Tabela `Vaga`
-- -----------------------------------------------------
create table Vaga(
	
    statusVaga varchar(30) not null,
	idVaga int not null,
	dscVaga varchar(30) not null,
	fk_idSetor int not null,

constraint foreign key(fk_idSetor) references Setor(idSetor),
primary key(idVaga))
ENGINE = InnoDB
DEFAULT CHARSET = utf8mb4;


-- -----------------------------------------------------
-- Tabela `EntradaVeiculo`
-- -----------------------------------------------------
create table EntradaVeiculo(
	
    idTicket int not null,
	horaEntrada time not null,
	placaVeiculo varchar(8) not null,
	dataEntrada date not null,
	fk_cpfCliente varchar(14) not null,

constraint foreign key(fk_cpfCliente) references Cliente(cpfCliente),
primary key(idTicket))
ENGINE = InnoDB
DEFAULT CHARSET = utf8mb4;


-- -----------------------------------------------------
-- Tabela `Ticket`
-- -----------------------------------------------------
create table Ticket(

	idTicket int not null,
	fk_cpfCliente varchar(14) not null,

constraint foreign key(fk_cpfCliente) references Cliente(cpfCliente),
primary key(idTicket))
ENGINE = InnoDB
DEFAULT CHARSET = utf8mb4;


-- -----------------------------------------------------
-- Tabela `Ocorrencia`
-- ----------------------------------------------------- 
create table Ocorrencia(

	idOcorrencia int not null,
	nomeSupervisor varchar(30) not null,
	horaOcorrencia time not null,
	dscOcorrencia varchar(30) not null,
    fk_idTicket int not null,
    constraint foreign key(fk_idTicket) references Ticket(idTicket),

primary key(idOcorrencia))
ENGINE = InnoDB
DEFAULT CHARSET = utf8mb4;


-- -----------------------------------------------------
-- Tabela `SaidaVeiculo`
-- -----------------------------------------------------
create table SaidaVeiculo(
	
    idSaidaVeiculo int not null,
	placaVeiculo int not null,
	horaSaida time not null,
	valor double not null,
	fk_idTicket int not null,

constraint foreign key(fk_idTicket) references Ticket(idTicket),
primary key(idSaidaVeiculo))
ENGINE = InnoDB
DEFAULT CHARSET = utf8mb4;


-- -----------------------------------------------------
-- Tabela `Pagamento`
-- -----------------------------------------------------
create table Pagamento(

	idPagamento int not null,
	placaVeiculo int not null,
    fk_idTicket int not null,
    constraint foreign key(fk_idTicket) references Ticket(idTicket),

primary key(idPagamento))
ENGINE = InnoDB
DEFAULT CHARSET = utf8mb4;


-- -----------------------------------------------------
-- Tabela `ValorEstacionamento`
-- -----------------------------------------------------
create table ValorEstacionamento(

	idValor int not null,
	taxaFixa int not null,
	dataAtualizacao date not null,

primary key(idValor))
ENGINE = InnoDB
DEFAULT CHARSET = utf8mb4;