import { useState } from "react";
import axios from "axios";

function App() {
  const [num1, setNum1] = useState("");
  const [num2, setNum2] = useState("");
  const [result, setResult] = useState(null);

  const handleAddition = (e) => {
    e.preventDefault();
    axios.post("http://localhost:8081/addition", {
        num1: parseInt(num1),
        num2: parseInt(num2),
      })

      .then((res) => {
        console.log(res.data.data);
        setResult(res.data.data);
      })
      .catch((err) => console.log(err));
  };

  return (
    <div style={{ padding: "20px" }}>
      <h2>Addition Calculator</h2>
      <form onSubmit={handleAddition}>
        <div>
          <label>
            Number 1:
            <input
              type="number"
              value={num1}
              onChange={(e) => setNum1(e.target.value)}
              required
            />
          </label>
        </div>

        <div>
          <label>
            Number 2:
            <input
              type="number"
              value={num2}
              onChange={(e) => setNum2(e.target.value)}
              required
            />
          </label>
        </div>
        <button type="submit">Add</button>
      </form>
     

      {result !== null && (
  <div>
    <h3>Result:</h3>
    <p>
      {result.num1} + {result.num2} = {result.result}
    </p>
  </div>
)}
    </div>
  );
}

export default App;
