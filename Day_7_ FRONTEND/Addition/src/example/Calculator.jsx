import { useState } from "react";

 

 function Calculator() {
    const [num1,setNum1] =useState(0);
    const [num2,setNum2] = useState(0);
    const [result,setResult] = useState(0);

    const handleadd= ()=>{
            setResult(Number(num1) + Number(num2));
     };

     const handlesub= ()=>{
            setResult(Number(num1) - Number(num2));
     };

     const handlemulti= ()=>{
            setResult(Number(num1) * Number(num2));
     };

     const handledivi= ()=>{
            setResult(Number(num1) / Number(num2));
     };
     
     const handlemodule= ()=>{
            setResult(Number(num1) %Number(num2));
     };

     return(
        <>
          <input  
           type="number" 
           value={num1}
            onChange={(e) => setNum1(e.target.value)}
       />

          <input type="number"
          value={num2}
          onChange ={(e) => setNum2(e.target.value)}
          />
          <button onClick={handleadd}> + </button>
          <button onClick={handlesub}> - </button>
          <button onClick={handlemulti}> * </button>
          <button onClick={handledivi}> / </button>
          <button onClick={handlemodule}> % </button>
          <h1>{result}</h1>

          </>
     );

}
export default Calculator;