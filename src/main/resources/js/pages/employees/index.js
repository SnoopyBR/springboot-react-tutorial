import React, { useEffect, useState } from 'react';
import {FiDelete} from 'react-icons/fi';

import api from '../../services/api';

export default function Employee() {
    
    const [employees,setEmployees] = useState([]);
    useEffect(()=>{

        api.get('employees', { params: { size: 2 }})
        .then(response =>{
            //response._embedded.employees
            console.log("reponse - >" , response);
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
                {
                employees.map(employee =>(
                    
                    <tr key= {employee._links.self.href}>
                        <td>{employee.firstName}</td>
                        <td>{employee.lastName}</td>
                        <td>{employee.description}</td>
                        
                    </tr>
                ))}

            </tbody>
        </table>
    )
}