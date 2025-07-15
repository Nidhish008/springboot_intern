import { useState } from "react";
import axios from "axios";

const Signup = () => {
  const [name, setName] = useState("");
  const [email, setEmail] = useState("");
  const [password, setPassword] = useState("");
  const [userName, setUserName] = useState("");
  const [role, setRole] = useState(""); // Updated from roles to role (single selection)

  async function addNewEmployee(e) {
    e.preventDefault();

    const req = await axios.post("http://localhost:3001/api/auth", {
      name,
      email,
      password,
      userName,
      roles: [role], // backend expects an array
    });

    console.log(req.data);
    if (req.data) {
      alert(req.data);
    } else {
      alert("Failed");
    }
  }

  return (
    <section>
      <h2>SignUp</h2>
      <div>
        <form onSubmit={addNewEmployee}>
          <label htmlFor="name">Employee Name: </label>
          <input
            type="text"
            id="name"
            value={name}
            onChange={(e) => setName(e.target.value)}
          /><br /><br />

          <label htmlFor="email">Employee Email: </label>
          <input
            type="email"
            id="email"
            value={email}
            onChange={(e) => setEmail(e.target.value)}
          /><br /><br />

          <label htmlFor="password">Employee Password: </label>
          <input
            type="password"
            id="password"
            value={password}
            onChange={(e) => setPassword(e.target.value)}
          /><br /><br />

          <label htmlFor="userName">Employee UserName: </label>
          <input
            type="text"
            id="userName"
            value={userName}
            onChange={(e) => setUserName(e.target.value)}
          /><br /><br />

          <label>Employee Role: </label><br />
          <input
            type="radio"                                                     
            id="role_user"
            name="role"
            value="ROLE_USER"
            onChange={(e) => setRole(e.target.value)}
            checked={role === "ROLE_USER"}
          />
          <label htmlFor="role_user">ROLE_USER</label><br />

          <input
            type="radio"
            id="role_admin"
            name="role"
            value="ROLE_ADMIN"
            onChange={(e) => setRole(e.target.value)}
            checked={role === "ROLE_ADMIN"}
          />
          <label htmlFor="role_admin">ROLE_ADMIN</label><br /><br />

          <button type="submit">Submit</button><br /><br />
        </form>
      </div>
    </section>
  );
};

export default Signup;
