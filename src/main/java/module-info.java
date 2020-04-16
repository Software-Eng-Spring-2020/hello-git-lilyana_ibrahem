module tjrebe.tjrebe1 {
    requires javafx.controls;
    requires javafx.fxml;

    opens il.ac.haifa.cs.sweng.HelloGit to javafx.fxml;
    exports il.ac.haifa.cs.sweng.HelloGit;
}