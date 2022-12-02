#include <iostream>
using namespace std;

int main(int argc, const char** argv) {
struct {
  string brand;
  string model;
  int year;
} myCar1, myCar2; // We can add variables by separating them with a comma here

// Put data into the first structure
myCar1.brand = "BMW";
myCar1.model = "X5";
myCar1.year = 1999;

// Put data into the second structure
myCar2.brand = "Ford";
myCar2.model = "Mustang";
myCar2.year = 1969;

// Print the structure members
cout << myCar1.brand << " " << myCar1.model << " " << myCar1.year << "\n";
cout << myCar2.brand << " " << myCar2.model << " " << myCar2.year << "\n";

// for (int i = 0; i < 10; i++) {
//   if (i == 4) {
//     continue;
//   }
//   cout << i << "\n";
// }

for (int i = 0; i < 10; i++) {
  if (i == 4) {
    break;
  }
  cout << i << "\n";
}

// to declare arrays 
string cars[4] = {"Volvo", "BMW", "Ford", "Mazda"};
for (string i : cars) {
  cout << i << "\n";
}
cout << cars[0] <<endl;
cout << sizeof(cars)<<"\n";

//Multidimensional Arrays
string letters[2][4] = {
  { "A", "B", "C", "D" },
  { "E", "F", "G", "H" }
};

for (int i = 0; i < 2; i++) {
  for (int j = 0; j < 4; j++) {
    cout << letters[i][j] << "\n";
  }
}

    return 0;
}