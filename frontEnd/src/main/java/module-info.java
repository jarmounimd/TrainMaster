module com.mouad.frontend {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;
    requires java.net.http;
    requires com.fasterxml.jackson.databind;
    requires kafka.clients;
    requires org.json;
    requires org.slf4j;
    requires de.jensd.fx.glyphs.fontawesome;
    requires org.apache.httpcomponents.client5.httpclient5;
    requires org.apache.httpcomponents.core5.httpcore5;

    opens com.mouad.frontend to javafx.fxml;
    opens com.mouad.frontend.Controllers to javafx.fxml;
    opens com.mouad.frontend.Controllers.Admin to javafx.fxml;
    opens com.mouad.frontend.Controllers.Client to javafx.fxml;
    opens com.mouad.frontend.Models to javafx.fxml;
    opens com.mouad.frontend.Services to kafka.clients, com.fasterxml.jackson.databind;
    opens com.mouad.frontend.Utils to org.apache.httpcomponents.client5.httpclient5;
    
    exports com.mouad.frontend;
    exports com.mouad.frontend.Controllers;
    exports com.mouad.frontend.Controllers.Admin;
    exports com.mouad.frontend.Controllers.Client;
    exports com.mouad.frontend.Models;
    exports com.mouad.frontend.Utils;
    exports com.mouad.frontend.Services;
}