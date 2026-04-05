import { useState } from "react";

function TrueFalse() {
    const [count,setcount]= useState(true);

    const SwitchFunction = () =>{
        setcount(!count);
    };

    return (
        <>
         <div>
            {count && <div>True</div>}
            {!count && <div>False</div>}

           <button onClick={SwitchFunction}>update state</button>
         </div>

        </>
    );
} 
export default TrueFalse;