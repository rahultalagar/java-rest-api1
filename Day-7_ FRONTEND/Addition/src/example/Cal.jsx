import { useState } from "react";
import "./cal.css";

function Cal(){
     const [expression, setExpression] =useState("");
         const [result, setResult]= useState("");
         
 const calculator =() => {
    try{
        setResult(eval(expression));
    } catch {
        setResult("Invalid expression");
    } 
 };
  return (
    <div className="calculator-container">
        <h2>Calculator</h2>
        <input
          type="text"
          value={expression}
          onChange={(e) => setExpression(e.target.value)}
          placeholder="e.g. 5 + 3 * 2"
        />
        <button className="btn" onClick={calculator}>Calculate</button>
        <h1 className="result">{result}</h1>
    </div>
  );
}
export default Cal;