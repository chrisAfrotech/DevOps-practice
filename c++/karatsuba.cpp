#include <bits/stdc++.h> 

using namespace std; 


void add_poly(int P[], int P1[], int P2[], int n){
	//Addition de polynomes
	for (int i=0; i<n; i++)
		P[i] = P1[i] + P2[i];
}

void init_poly(int P[], int n){
	for (int i=0; i<n; i++)
		P[i] = 0;
}

void karatsuba(int tresult[], int P[], int Q[], int n){
	//n est le degre de chacun des deux polynomes et n+1 est la taille des tableaux
	int nd = n/2 + 1, i ;

	if (n<=2){
		init_poly(tresult, n*2);
		for (i=0; i<=n; i++)
			for (int j=0; j<=n; j++)
				tresult[i+j] += P[i]*Q[j];
		
	}else{
		if (n%2==0){
			//Si n est paire
			const int taille_d = nd, taille_poly = 2*nd;
			int Rs[taille_poly], R1[taille_poly], R2[taille_poly], R3[taille_poly];
			int Ps[taille_d], P1[taille_d], P2[taille_d], Qs[taille_d], Q1[taille_d], Q2[taille_d];

			//Initialisation de chacun des sous polynomes R1, R2, R3, P1, P2, Q1, Q2 
			init_poly(R1, taille_poly);
			init_poly(R2, taille_poly);
			init_poly(R3, taille_poly);
			init_poly(P1, taille_d);
			init_poly(P2, taille_d);
			init_poly(Q1, taille_d);
			init_poly(Q2, taille_d);

			//Remplissage des polynomes P1, P2, Q1 et Q2
			for (int i=0; i<nd; i++){
				P1[i] = P[i];
				Q1[i] = Q[i];
			}
			for (int i=0; i<nd-1; i++){
				P2[i] = P[i+nd];
				Q2[i] = Q[i+nd];
			}

			//Calcule de R1 et R2 par appel récursif de karatsuba
			karatsuba(R1, P1, Q1, nd-1);
			karatsuba(R2, P2, Q2, nd-1);
			//Calcule de R3
			add_poly(Ps, P1, P2, nd);
			add_poly(Qs, Q1, Q2, nd);
			karatsuba(R3, Ps, Qs, nd-1);

			//Calcul du resultat du produit final de P1 et P2 avec les polynomes R1, R2, R3;
			for (i=0; i<taille_poly; i++){
				tresult[i+nd] += R3[i] - R2[i] - R1[i];
				tresult[i+2*nd] += R2[i];
				tresult[i] += R1[i];
			}
		}
		else{
			//si n est impaire
			const int taille_d = nd, taille_poly = n+1;
			int Rs[taille_poly], R1[taille_poly], R2[taille_poly], R3[taille_poly];
			int P1[taille_d], P2[taille_d], Q1[taille_d], Q2[taille_d];

			//Initialisation de chacun des sous polynomes R1, R2, R3, P1, P2, Q1, Q2 
			init_poly(R1, taille_poly);
			init_poly(R2, taille_poly);
			init_poly(R3, taille_poly);
			init_poly(P1, taille_d);
			init_poly(P2, taille_d);
			init_poly(Q1, taille_d);
			init_poly(Q2, taille_d);

			//Remplissage des polynomes P1, P2, Q1 et Q2
			for (int i=0; i<nd; i++){
				P1[i] = P[i];
				P2[i] = P[i+nd];
				Q1[i] = Q[i];
				Q2[i] = Q[i+nd];
			}
			
			//Calcule de R1 et R2 par appel récursif de karatsuba
			karatsuba(R1, P1, Q1, nd-1);
			karatsuba(R2, P2, Q2, nd-1);
			//Calcule de R3
			add_poly(P1, P1, P2, nd);
			add_poly(Q1, Q1, Q2, nd);
			karatsuba(R3, P1, Q1, nd-1);			

			//Remplissage des polynomes P1, P2, Q1 et Q2
			for (i=0; i<taille_poly; i++){
				tresult[i+nd] += R3[i] - R2[i] - R1[i];
				tresult[i+2*nd] += R2[i];
				tresult[i] += R1[i];
			}
			
		}
	}

}



int main()
{
    int taille_p;
    printf("Entrez la taille des deux polynomes : \n");
    printf("Degré de p : ");
    scanf("%d", &taille_p);

    const int t1 = taille_p+1, t2 = 2*taille_p +2;
    int p1[t1], p2[t1], pr[t2];

    
    //Les différentes entrées
    printf("Entrez les coéfficients des monomes du polynome P1 : \n");
    for (int i=0; i<t1; i++ ){
    	printf("monome de degre %d : ", i);
    	scanf("%d", &p1[i]);
    }
    printf("Entrez les coéfficients des monomes du polynome P2 : \n");
    for (int i=0; i<t1; i++ ){
    	printf("monome de degre %d : ", i);
    	scanf("%d", &p2[i]);
    }

    //Initialisation du resultat
    for (int i=0; i<t2; i++){
    	pr[i] = 0;
    }
    //Initialisation du resultat
    init_poly(pr, t2);
    //Multiplication des deux polynomes
    printf("Au debut n = %d \n", taille_p);
    karatsuba(pr, p1, p2, taille_p);

    //Affichage du resultat
    printf("Affichage du resulat : \n");
    for (int i=0; i<t2-1; i++)
    	printf("monome %d \t = %d \n", i, pr[i]);

}

