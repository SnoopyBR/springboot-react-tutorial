import React from 'react';
import { render as _render } from 'react-dom';
import client from './client';

class App extends React.Component{


     constructor(props){
         super(props); 
         this.state = {employees:[]};
     }

    componentDidMount(){
        console.log('running componentDidMount'); 
        client({method: 'GET', path: '/api/employees'}).then(response =>{
            console.log(response);
            this.setState({
                employees : response.entity._embedded.employees
                
            });
            console.log(employees)
        });
    }

    render(){
        return (
            <EmployeeList employees = {this.state.employees}/>
        )
    }

}

class EmployeeList extends React.Component{
    render (){
        const employees = this.props.employees.map(employee => {
            return   <Employee key={employee._links.self.href} employee = {employee}/>
        });

        return (
            <table>
                <tbody>
                    <tr>
                        <th>First Name</th>
                        <th>Last Name</th>
                        <th>Description</th>
                    </tr>

                    {employees}
                </tbody>
            </table>                
        )
    }
}

class Employee extends React.Component {
    render(){
        return(
            <tr>
                <td>{this.props.employee.firstName}</td>
                <td>{this.props.employee.lastName}</td>
                <td>{this.props.employee.description}</td>
            </tr>
        )
    }
}

_render(
    <App />,
    document.getElementById('react')
)