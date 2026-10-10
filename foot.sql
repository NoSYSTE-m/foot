create table joueurs (
    id_joueur int primary key,
    nom varchar(50),
    prenom varchar(50),
    age int
);

rename joueur to joueurs;

create table equipe_p_joueur (
    id_equipe int not null,
    id_joueur int primary key,
    constraint fk_equipe foreign key (id_equipe) references equipes(id_equipe),
    constraint fk_joueur foreign key (id_joueur) references joueurs(id_joueur)
);

create table equipes (
    id_equipe int primary key,
    nom varchar(50)
);

create table remplacants (
    id_joueur int,
    id_place int,
    constraint fk_joueurs foreign key (id_joueur) references joueurs(id_joueur),
    constraint fk_places foreign key (id_place) references places(id_place)
);

create table places(
    id_place int primary key,
    i_joueur int,
    nom_place varchar(50)
);