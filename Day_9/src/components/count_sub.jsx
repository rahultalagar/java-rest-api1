import { useState } from "react";

function App(){
  const [count,setcount]= useState(0);

  const incremntCounter = () =>{
    setcount(count+1);
  };

  const decrementCounter = () =>{
    setcount(count-1);
  };

  const multiplayCounter = () =>{
    setcount(count*2);
  };
  const divideCounter = () =>{
    setcount(count/2);
  };

  return(
    <>
    <div>
      Tottal Count: {count}</div>
      <button onClick={incremntCounter}>Add +1</button>
      <button onClick={decrementCounter}>Sub -1</button>
      <button onClick={multiplayCounter}>Multiplay *2</button>
      <button onClick={divideCounter}>Divide /2</button>
    </>
  );
}
export default App;