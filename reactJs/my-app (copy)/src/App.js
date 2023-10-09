import Todo from "./components/Todo";

function App() {  //this function return jsx code
  return (
    <div> 
      <h1>My Todos</h1>
      <Todo text="Learn react"/>
      <Todo text="Master react"/>
      <Todo text="Explore the full react course"/>
    </div> 
  );
}

export default App;


