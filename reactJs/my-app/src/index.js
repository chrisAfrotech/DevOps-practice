import React from 'react';
import ReactDOM from 'react-dom/client';
import { BrowserRouter } from 'react-router-dom';

import './index.css';
import App from './App';

const root = ReactDOM.createRoot(document.getElementById('root'));  //this is showing where our app is going to be render
  root.render(
    <BrowserRouter> 
      <App/> 
    </BrowserRouter> //this code is called jsx code which is to import html code in js file

    
  );
