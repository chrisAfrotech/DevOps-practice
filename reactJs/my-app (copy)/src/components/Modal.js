function Modal(props) {   //name of function in react must start with capital letter
    
  function cancelHandler() {
    props.onCancel();
  }
  function confirmHandler() {
    props.onConfirm();
  }

    return (
    <div className="modal">
        <p>Are you sure?</p>    
        <button className="btn btn--alt" onClick={cancelHandler}>
          Cancel
        </button>
        <button className="btn" onClick={confirmHandler}>
          Confirm
        </button>
    </div>
  ); 
}

export default Modal;