package pe.elizabeth.test.backend.rest;

import org.springframework.web.bind.annotation.*;
import pe.elizabeth.test.backend.dto.ResponseDTO;
import pe.elizabeth.test.backend.dto.UserDTO;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @PostMapping
    public ResponseDTO agregarUsuario(@RequestBody UserDTO user){
        return null;
    }

    @PutMapping ("/{id}")
    public ResponseDTO modificarUsuario( @PathVariable("id") Integer id,
                                         @RequestBody UserDTO user){
        return null;
    }
    @DeleteMapping("/{id}")
    public ResponseDTO eliminarUsuario (@PathVariable("id") Integer id){
        return null;
    }

    @GetMapping
    public List<UserDTO> listarUsuarios (){
        return new ArrayList<>();
    }

}
