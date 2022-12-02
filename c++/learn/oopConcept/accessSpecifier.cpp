#include <iostream>
using namespace std;

class MyClass {
    public:    // Public access specifier
        int x;   // Public attribute
    private:   // Private access specifier which members cannot be accessed (or viewed) from outside the class.
        int y;   // Private attribute
    protected:   // protected access specifier which members cannot be accessed from outside the class, however, they can be accessed in inherited classes.
        int z;   // protected attribute
};

int main() {
  MyClass myObj;    
  myObj.x = 25;  // Allowed (public)
//   myObj.y = 50;  // Not allowed (private)
//   myObj.z = 50;  // Not allowed (protected)
  return 0;
}