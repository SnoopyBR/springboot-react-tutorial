import React, { useEffect, useState } from 'react';
import {FiDelete} from 'react-icons/fi';

import api from '../../services/api';

export default function Employee() {
    
    const [employees,setEmployees] = useState([]);
    useEffect(()=>{

        api.get('employees')
        .then(response =>{
            //response._embedded.employees
            console.log(response);
            setEmployees(response.data._embedded.employees);
        })

        
    },[]);

    return (
        <table>
            <tbody>
                <tr>
                    <th>First Name</th>
                    <th>Last Name</th>
                    <th>Description</th>
                    <th>Actions</th>
                </tr>
                {console.log(employees),
                employees.map(employee =>(
                    
                    <tr key= {employee._links.self.href}>
                        <td>{employee.firstName}</td>
                        <td>{employee.lastName}</td>
                        <td>{employee.description}</td>
                        <td><a name="" id="employee._links.self.href" className="btn btn-danger" href="#" role="button"><FiDelete /></a></td>
                    </tr>
                ))}

            </tbody>
        </table>
    )
}