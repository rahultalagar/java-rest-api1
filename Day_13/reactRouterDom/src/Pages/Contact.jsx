import { Link } from "react-router-dom";
function Contact() {
  return (
    <div>
      <h1>Contact</h1>
      <p>
        You can contact us at{" "}
        <a href="mailto:info@company.com">info@company.com</a>
      </p>
      <Link to="/">Home</Link>
    </div>
  );
}

export default Contact;