create table joueurs (
    id_joueur int primary key,
    nom varchar(50),
    prenom varchar(50),
    numero int,
    id_place int,
    id_equipe int,
    age int);


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

create table places (
    id_place int primary key,
    nom_place varchar(50)
);

create table historiques (
    id_joueur int;
    action varchar(100);
)

select j.nom, j.id_equipe from joueurs j join equipes e on e.id_equipe=j.id_equipe;


