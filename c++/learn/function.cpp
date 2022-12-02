#include <iostream>
using namespace std;

//function must be declared before the main function and nothing where again
void myFunction(int);
int myFunction(int, int);

int main(int argc, const char** argv) {
    
    myFunction(6);
    cout<< myFunction(5, 3)<<endl;

return 0;

}

//function implementations...
void myFunction(int rad) {
    cout << "I just got executed!\t" << rad <<"\n";
}

int myFunction(int x, int y) {
  return x + y;
}