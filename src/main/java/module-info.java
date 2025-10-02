module co.edu.uniquindio.fx10 {
    requires javafx.controls;
    requires javafx.fxml;

    opens co.edu.uniquindio.fx10 to javafx.fxml;
    opens co.edu.uniquindio.fx10.controlador to javafx.fxml;
    opens co.edu.uniquindio.fx10.modelo to javafx.base;
    
    exports co.edu.uniquindio.fx10;
    exports co.edu.uniquindio.fx10.controlador;
    exports co.edu.uniquindio.fx10.modelo;
}

