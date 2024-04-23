module co.edu.uniquindio.patronesdiseno.patronesdisenofx {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;

    opens co.edu.uniquindio.patronesdiseno.patronesdisenofx to javafx.fxml;
    exports co.edu.uniquindio.patronesdiseno.patronesdisenofx;
    opens co.edu.uniquindio.patronesdiseno.patronesdisenofx.Iterator;
    exports co.edu.uniquindio.patronesdiseno.patronesdisenofx.Iterator;
}