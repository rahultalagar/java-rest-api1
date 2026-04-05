import { useState } from "react";

function GuessNumber() {
  const [number, setNumber] = useState(3);
  const [guess, setGuess] = useState("");
  const [result, setResult] = useState("Guess it");

  const GuessNumberequl = () => {
    
    if (number == guess) {
      setResult(<div> your guess is correct</div>);
    } else {
      setResult(<div> your guess is wrong</div>);
    }
  };

  return (
    <>
      <div>
        <input
          type="number"
          value={guess}
          onChange={(e) => setGuess(Number(e.target.value))}
        />

        <button onClick={GuessNumberequl}>update state</button>
        <h1>{result}</h1>
      </div>
    </>
  );
}
export default GuessNumber;
