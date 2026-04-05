import { useState } from "react";

function Prime2() {
  const [number, setNumber] = useState(0);
  const [result, setResult] = useState([]);

  const isprime = () => {
    const num = number.split(" ").map(Number);

    const output = num.map((num) => {
      if (num <= 1) return `${num} is not a prime number`;

      for (let i = 2; i < num; i++) {
        if (num % i === 0) {
          return `${num} is not a prime number`;
        }
      }
      return `${num} is a prime number`;
    });
    setResult(output);
  };

  return (
    <>
      <div>
        <Strong>Prime Number checker</Strong>
      </div>

      <input
        type="text"
        placeholder="Enter Number Like 1 2 3 4"
        value={number}
        onChange={(e) => setNumber(e.target.value)}
      />
      <button onClick={isprime}>Check</button>

      {result.map((res, index) => (
        <div key={index}>{res}</div>
      ))}
    </>
  );
}
export default Prime2;
