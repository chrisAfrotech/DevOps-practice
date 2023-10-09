// let a : number;
// let b : string;
// let c : boolean;
// let d : any; //use when we don't know the exact type of a variable ans ts set it by defalut to variables
// let e : number[] = [1,2,3,4,];
// let f : any[] = [1, true, 'a', false];

// const ColorRed = 0;
// const ColorGreen = 1;
// const ColorBlue = 2;

// enum Color {Red = 0, Green = 1, Blue = 2, Purple=3 }
// let backgroundColor = Color.Purple;

// type assertion
// let messages;
// messages = 'abc';
// let endsWithC = (<string>messages).endsWith('c');
// let alternativeWay = (message as string).endsWith('c');

// // Arrow function in js
// let colog = function(message){
//     console.log(message);  
//     }
// //ts
// let doLog = () => console.log();  

// custom types 
// use interfaces for more lisibility for function with more params
class Point{
    x: number;
    y: number;

    //Those following functions are called method of this class
    draw(){
        console.log('x: ' + this.x + ', y: ' +this.y);
        
    }

    getDistance(another: Point){
        //...
    }
}

//Now to call those method 

let point = new Point;
point.x = 1;
point.y = 2;
point.draw();


