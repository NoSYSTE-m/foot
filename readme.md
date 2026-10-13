oracle
    -table joueur
        *id jooueur
        *nom
    -table equipe
        *id equipe
        *id joueur
        *nom equipe
    -table equipe_p_joueur
        *id equipe
        *id joueur
    -table remplacant
        *id joueur
        *id place
        
    -place
        *id place 
        *id joueur
        *nom place

class
    -joueur
    -equipe
    -dessin
    -fenetre
    -main
    -listener
    -connexion
    -donneesplaces
    -
fenetrage
    -terrain
    -joueur
    -