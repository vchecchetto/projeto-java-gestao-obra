module gestaodeobras.projetogestaodeobras {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;

    opens gestaodeobras.projetogestaodeobras to javafx.fxml;
    exports gestaodeobras.projetogestaodeobras;
}