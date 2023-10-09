import { Route } from 'react-router-dom'
import AllMeetupsPage from './pages/AllMeetups';
import NewMeetupsPage from './pages/NewMeetup';
import FavoritesPage from './pages/Favorites';

function App() {  //this function return jsx code
    // localhost:3000/Products
    // mypage.com/products

  
  return (
  <div> 
    <Route path='/'>
      <AllMeetupsPage/>
    </Route>
    <Route path='/NewMeetup'>
      <NewMeetupsPage/>
    </Route>
    <Route path='/Favorites'>
      <FavoritesPage></FavoritesPage>
    </Route>
  </div> 
  );
}

export default App;


