function Passfail() {
    const [marks, setMarks] = React.useState("");
    const [result, setResult] = React.useState("");

    const schema =z.number().min(0).max(100);

    function checkResult(){
         const parsedNumber = Number(marks);
         const validation =schema.safeParse(parsedNumber);

            if(!validation.success){
               setResult("invalid input");
               return;
            }
            if(parsedNumber >= 35){
                setResult("Pass");
            }else{
                setResult("Fail");
            }
    }

}