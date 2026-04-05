function Hero1() {
  return (
    <div className="h-screen bg-[url('/images/galaxy.jpg')] bg-cover bg-center">
      <section className="flex w-full justify-center items-center h-full text-white ">
        <div className="text-center flex flex-col items-center ">
          <div className="text-6xl pb-5 font-extrabold">
            EDIT LIKE A PRO <br /> AND MAKE MONEY
          </div>

          <div className="text-gray-300 mt-6 text-lg max-w-xl text-center pb-5 font-semibold">
            This is an intensive program designed for those who want to master
            the skills of professional editing and graphic design
          </div>

          <div className="px-5 py-2  w-50 bg-lime-400 rounded-full text-black  hover:bg-yellow-500">
            Order
          </div>

          <div className="flex gap-8 mt-20">
            <div className="-rotate-12 bg-black/70 text-white px-6 py-3 rounded-xl shadow-lg flex items-center gap-3">
              <div className="bg-purple-600 px-2 py-1 rounded text-xs">PR</div>
              <div>Premiere Pro</div>
            </div>

            <div className="rotate-6 bg-black/70 text-white px-6 py-3 rounded-xl shadow-lg flex items-center gap-3">
              <div className="bg-blue-600 px-2 py-1 rounded text-xs">PS</div>
              <div>Photoshop</div>
            </div>

            <div className="rotate-12 bg-black/70 text-white px-6 py-3 rounded-xl shadow-lg flex items-center gap-3">
              <div className="bg-indigo-600 px-2 py-1 rounded text-xs">AE</div>
              <div>After Effects</div>
            </div>
          </div>
          
        </div>
      </section>
    </div>
  );
}
export default Hero1;
