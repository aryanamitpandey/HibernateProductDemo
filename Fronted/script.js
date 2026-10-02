//   function updateStudent() {
//             const newStudent = {
//                 name: document.getElementById('newName').value,
//                 email: document.getElementById('newEmail').value
//             };
//             const oldStudentId = document.getElementById('oldStudentId').value;

//             fetch(`http://localhost:8080/students/update?oldStudentId=${oldStudentId}`, {
//                 method: 'PUT',
//                 headers: {
//                     'Content-Type': 'application/json'
//                 },
//                 body: JSON.stringify(newStudent)
//             })
//             .then(response => response.json())
//             .then(data => {
//                 console.log('Success:', data);
//                 alert('Student updated successfully!');
//             })
//             .catch((error) => {
//                 console.error('Error:', error);
//                 alert('Error updating student.');
//             });
//         }

const fetchUsers = async () => {
  try {
    const response = await fetch('http://localhost:8081/api/student/1');
    
    if (!response.ok) {
      throw new Error(`HTTP error! Status: ${response.status}`);
    }
    
    const data = await response.json(); // Parses the JSON response
    console.log(data);
  } catch (error) {
    console.error('Error fetching data:', error);
  }
};
