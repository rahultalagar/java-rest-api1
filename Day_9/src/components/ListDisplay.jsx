function ListDisplay() {
  const users = ["A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T" , "U", "V", "W", "X", "Y", "Z"];
  return (
    <>
      {users.map((user) => (
        <div>{user}</div>
      ))}
    </>
  );
}
export default ListDisplay;
