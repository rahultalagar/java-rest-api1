import { Link } from "react-router-dom";

export default function About() {
    return (
        <>
        <div>About Us</div>
        
        <Link to={"/"}>Home</Link>
        <Link to={"/contact"}>Contact Us</Link>
        </>
    )
}