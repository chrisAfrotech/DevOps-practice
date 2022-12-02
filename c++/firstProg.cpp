#include <iostream> //directives de preprocesseur

int main() {
    std::cout << "Hello world" << std::endl;
    std::cout << "Hello world2" << std::flush;
    std::cout << "Hello world3\n";
     std::cout << "Hello world4";
    return 0;
}


// GCC compilation in c/ c++
// Preprocessing: 
//     cmd: gcc -E fileName.c -o OutputFileName.i
//     -It will delete first all the comments
//     -add code of head files
//     -Manage the processor directives

// Compilation: (Must talk of compilation for assembly pro language and not in c language)
//     cmd: gcc -s fileName.c >> convert it in assembly language

// Assembly:
//     cmd: gcc -c fileName.c >> binary file

// Linking: possibility to make the fusion of all object file we have and add head file 
//     cmd: gcc main.o other.o -o prog (compile main.c and other.c source file into prog)
//          gcc *.c -o prog2 (compile all source file into prog2)

//         gcc -Wall *.c -o prog (Activate warming)
//         gcc -Wall -Wextra *.c -o prog (Activate specific warming)
//         gcc -Wall -Wextra -Werror *.c -o prog (wil lock the program if there is a warming)

//      To compile finally:
//          g++ -std=c++17 -Wall -Wextra -Werror firstProg.cpp -o firstProg


/*
********Affichage de console**********
    std::out : affichage standard (en memoire tampon)
    std::cerr : erreurs (Affichage direct)
    std::clog : journalisation (en memoire tampon)

    std::endl : retour a la ligne(\n) + flush
    std::flush

    \n: retour a la ligne
    \t: tabulation
    \\: afficher antislash
*/

/*
    **********Variables***************

*/