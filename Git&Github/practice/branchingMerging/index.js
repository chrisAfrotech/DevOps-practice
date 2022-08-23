// Play music functionality

const soundCloud = document.querySelector('.sound-cloud');
const off = document.querySelector('#off');
const on = document.querySelector('#on');
const myAudio = document.querySelector('#myAudio');

off.addEventListener('click', () => soundTrack('off'));
on.addEventListener('click', () => soundTrack('on'));

const soundTrack = (soundState) => {
    if(soundState === 'off'){
        on.style.display = 'block';
        off.style.display = 'none';
        soundCloud.style.color = "#08fdd8";
        myAudio.play();
    }
    else if(soundState === 'on'){
        on.style.display = 'none';
        off.style.display = 'block';
        soundCloud.style.color = "#f50057";
        myAudio.pause();
    }
};


/*************open close dashboard button *************/
const btnBars = document.querySelector('.bars');
const btnTimes = document.querySelector('.times');
const SideNav = document.querySelector('.aside');


btnBars.addEventListener('click', () => myFunc('open'));
btnTimes.addEventListener('click', () => myFunc('close'));

const myFunc = (navCondition) => {
    if(navCondition === 'open'){
        SideNav.classList.add('show-nav');
        btnTimes.style.display = "block";
        btnBars.style.display = "none";
    }
    else if(navCondition === 'close'){
            SideNav.classList.remove('show-nav');
            btnTimes.style.display = "none";
            btnBars.style.display = "block";
    }
};

// /****************Animation text boing on hover***************/
// const elements = document.querySelectorAll('.boing');
//     for(let i = 0; i<=elements.lenght; i++)
//     {
//         elements[i].addEventListener('animationend',function(e){
//             elements[i].classList.remove('animated');
//         });

//         elements[i].addEventListener('mouseover ',function(e){
//             elements[i].classList.add('animated');
//         });
//     }

document.querySelectorAll(".boing>span").forEach((element) => {
    element.addEventListener("mouseover", (e) => bounce(e.target));
});

function bounce(letter) {
    if (!letter.classList.contains("bounce")) {
        letter.classList.add("bounce");
        setTimeout(
            function () {
                letter.classList.remove("bounce");
            },
           2000
        );
    }
}


// Section about 
const  Texts = [
    'HTML','CSS', 'JAVASCRIPT',
    'SASS','MONGOOSE', 'VUEJS',
    'GIT','C++', 'NODEJS',
    'PACKET TRACER','IOT', 'GITHUB',
    'JQUERRY','JAVA', 'EXPRESS',
    'miongoDb','Mysql','Devops', 'Bi'
];

var TagCloud = TagCloud('.sphere', Texts, {

// sphere radius in px
radius:230,

// animation speed
maxSpeed:'normal',
initSpeed:'fast',

// rolling direction
direction:500,

//interaction with mouse
keep: true,

});

// giving color to each text in sphere 
var color = '#08fdd8';
document.querySelector('.sphere').style.color = color;
