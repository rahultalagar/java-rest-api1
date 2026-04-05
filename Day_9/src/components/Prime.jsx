import { useState } from "react";

function Prime() {
  const [number, setNumber] = useState("");
  const [result, setResult] = useState("");

  const isPrime = () => {
    if (number <= 1) {
      setResult(<div>Not a prime number</div>);
         return;

    }
    for (let i = 2; i < number; i++) {

      if (number % i === 0) {
        setResult(<div>Not a prime number</div>);
         return;
      }       
    
       
    }
    setResult(<div>Is a prime number</div>);
    
  };
  return (
    <>
    <div> prime number checker</div>
      <input
        type="number"
        value={number}
        onChange={(e) => setNumber(Number(e.target.value))}
        />
         <button onClick={isPrime}>Check Prime</button>
          {result}
      
    </>
  );
}
export default Prime;
