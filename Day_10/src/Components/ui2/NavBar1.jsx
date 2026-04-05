import { FaFacebook } from "react-icons/fa";
import { ImInstagram } from "react-icons/im";
import { LiaLinkedinIn } from "react-icons/lia";

function NavBar1() {
  return (
    
      <div className="absolute top-0 left-0 w-full flex justify-between px-5 py-3 text-amber-50 z-20">
        <div className="flex gap-5 font-bold text-2xl">
          <div>SteveEditor </div>
        </div>

        <div className="flex gap-5">
          <div>Main</div>
          <div>About </div>
          <div>Program</div>
          <div>Price</div>
          <div>Contact Us</div>
        </div>

        <div className="flex gap-5">
          <div className="flex gap-5 text-lg"> 
            <FaFacebook className="text-2xl cursor-pointer hover:text-lime-400 transition" />
            <ImInstagram className="text-2xl cursor-pointer hover:text-lime-400 transition" />
            <LiaLinkedinIn className="text-2xl cursor-pointer hover:text-lime-400 transition" />
          </div>

        </div>
      </div>
    
  );
}

export default NavBar1;
