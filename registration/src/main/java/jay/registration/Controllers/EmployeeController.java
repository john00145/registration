package jay.registration.Controllers;

import jay.registration.Models.Employee;
import jay.registration.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    // List
    @GetMapping("/employee")
    public String listIndex(Model model){
        model.addAttribute("employees", employeeService.getAllEmployees());
        return "views/backend/employee/index";
    }

    // Add New
    @GetMapping(value = "/add-employee")
    public String addCustomer(Model model, Employee employee){
        model.addAttribute("employee", employee);
        return "views/backend/employee/create";
    }

    // Save
    @PostMapping(value = "/create-employee")
    public String createEmployee(Employee employee) {
        employeeService.saveEmployee(employee);
        return "redirect:/employee";
    }

    // Delete
    @RequestMapping(value = "/delete-employee/{id}")
    public String deleteEmployee(@PathVariable(name = "id") long id){
        employeeService.deleteEmployee(id);
        return "redirect:/employee";
    }

    // Edit
    @GetMapping(value = "/edit-employee/{id}")
    public String updateEmployee(@PathVariable(value = "id")long id, Model model){
        Employee employee = employeeService.getEmployeeById(id).get();
        model.addAttribute("employee", employee);
        return "views/backend/employee/update";
    }


}
