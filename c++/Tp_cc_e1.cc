#include <bits/stdc++.h> 
#include <string.h>

using namespace std; 


class Montre {
    public:
    Montre();
    Montre(const Montre &montre_acopier);
    Montre(int heures = 13, int minutes = 45);
    ~Montre();

    int getHeure(){
        return this->heures;
    }

    int getMinutes(){
        return this->minutes;
    }

    private:
    int heures;
    int minutes;

    void avance_heure(){
        if (this->minutes<60){
            this->minutes += 1;
        }else if (this->heures<24) {
            this->heures += 1;
            this->minutes = 0; 
        }else{
            this->heures = 0;
            this->minutes = 0;
        }
    }
};

/*Montre::Montre(const Montre &montre_acopier){
    heures = montre_acopier.heures;
    minutes = montre_acopier.minutes;
};*/


Montre::Montre(int heures=13, int minutes=45){
    this->heures = heures;
    this->minutes = minutes;
    cout <<heures <<"h"<<minutes<<"\n";
};



class Personne{
    public:
    Personne();
    Personne(string nom);
    ~Personne();

    void setMontre(Montre * montre){
        if (this->montre != NULL)
            this->montre = montre;
    }

    Montre * delete_montre(){
        if (this->montre != NULL){
            Montre * m = this->montre;
            this->montre = NULL;
            return m;
        }
        return this->montre;
    }

    string donne_heure(){
        if (this->montre != NULL){
            string s_heure = to_string(this->montre->getHeure());
            string s_minute = to_string(this->montre->getMinutes());
            return s_heure+"h"+s_minute;
        }
        return "";
    }

    void demande_heure(Personne autre_personne){
        string heure_voisin = autre_personne.donne_heure();
        cout <<"L'heure de mon voisin est : " << heure_voisin;
    }

    private:
    string nom;
    Montre * montre = NULL;
};

/*
3 -
attribuer un nombre entier unique (indice) à chaque montre et chaque montre créée sera le clone de la précédente
avec son indice +1
*/

int main(){

    return 0;
}


