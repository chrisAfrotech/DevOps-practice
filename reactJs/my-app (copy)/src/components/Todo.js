import { useState } from "react";
import Modal from "./Modal";
import Backdrop from "./Backdrop";

function Todo(props) {   //name of function in react must start with capital letter
    const [modalIsOpen, setModalIsOpen] = useState(false);     //react hooks
    
    function deleteHandler() {
        setModalIsOpen(true);
        console.log('clicked!')
        console.log(props.text);
    }
    function closeModalHandler(){
        setModalIsOpen(false);
    }
    
    return (
    <div className="card">
        <h2>{props.text}</h2>
        <div className="actions">
            <button className="btn" onClick={deleteHandler}>Delete</button>
        </div>
        {modalIsOpen && <Modal onCancel={closeModalHandler} onConfirm={closeModalHandler}/>}
        {modalIsOpen && <Backdrop onCancel={closeModalHandler} />}
    </div>    
  ); 
}

export default Todo;