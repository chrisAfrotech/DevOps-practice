//There is normally two ways to create react components
/*we can use javascript classcomponents or functions (which is the must used)*/

//pascal casing
function Message(){
    //JSX: Javascript XML
    const name = 'christophe';
    if (name)
        return <h1>Hello {name}</h1>
    return <h1>Hello world</h1> 
}

export default Message;