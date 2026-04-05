function Background() {
  return (
    <div className="relative h-screen bg-black overflow-hidden">

      {/* Top Right Glow */}
      <div className="absolute top-0 right-0 w-[500px] h-[500px] bg-white opacity-30 blur-[120px] rounded-full"></div>

      {/* Bottom Left Glow */}
      <div className="absolute bottom-0 left-0 w-[400px] h-[400px] bg-green-500 opacity-30 blur-[120px] rounded-full"></div>

      {/* Center Glow */}
      <div className="absolute top-1/3 left-1/3 w-[300px] h-[300px] bg-gray-400 opacity-20 blur-[100px] rounded-full"></div>

    </div>
  );
}

export default Background;