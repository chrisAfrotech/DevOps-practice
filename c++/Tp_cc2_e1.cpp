#include <iostream>

using namespace std;

//creation of a class list
class Liste {       // The class declaration
    public:
        Liste();    //default constructor
        Liste(const Liste &ListeOfCopie);   //copie constructor of the class
        virtual int getListeLenght(int) = 0;   // pure virtual function that return the lenght list
        virtual bool getListeSort(bool) = 0;    //pure virtual class that indicate if the list is sorted or not
        int addInteger(int);   //function that add integer to the list

    private:             // Access specifier
        int liste[100];       //private attribute array with maximum size 100
        int taille = 0;        //private Attribute taille innittialise at 0
};


// Derived classes
//function that return the lenght of the list
int Liste::getListeLenght(int taille){
  return this->taille;
}

//function that indicate if the list is sort or not
int Liste::getListeSort(bool ){
    for (int i=0; i<n-1; i++){
        if (liste[i]>liste[i+1])
        {
            return False;
        }
    }
    return True;
}

//function that add integer to the list
int Liste::addInteger(int tab){
     if(liste[i] < 100)
 {
     liste[i] = liste[i] + 1;
     return;
 }
}

int main(int argc, const char** argv) {
    Liste myObj;
    cout<<"exercise1 done"<<endl;

    return 0;
}