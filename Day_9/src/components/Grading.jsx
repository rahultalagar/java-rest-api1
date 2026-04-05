import { useState } from "react";

function Grading(){

    const[totalMarks,settotalMarks] = useState(0);
    const[grade,setGrade] = useState("");

    const CalGrade = () => {
        
        if(totalMarks >=90)
        {
            setGrade(<h1> A+</h1>);

        } else if(totalMarks >=80)
        {
            setGrade(<h1> A </h1>);
        } else if(totalMarks >=75)
        {
            setGrade(<h1> B+ </h1>);

        } else if(totalMarks >=70)
        {
            setGrade(<h1> B </h1>);

        } else if(totalMarks >=65){

            setGrade(<h1> C +</h1>);

        } else if(totalMarks >=60)
        {
            setGrade(<h1> C </h1>);
        } else if(totalMarks >=35)
        {
            setGrade(<h1> D </h1>);
        } else 
        {
            setGrade(<h1> Fail </h1>);
        }

    }

    return (
       <>
       <input
       type="number"
        value={totalMarks}
       onChange={(e) => settotalMarks(Number(e.target.value))}
        />
        <button onClick={CalGrade}>Check Your Grade</button>
        {grade}
       </>

    );


}
export default Grading;
