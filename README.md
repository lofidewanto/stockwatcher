# stockwatcher
Learning from GWT tutorial on StockWatcher using Maven instead of Eclipse plugin.

## Run in the development

### Build all first

cd stockwatcher-webapp

mvn clean package

Result: 

![Build Result](build-result.png?raw=true "Build Result")

### Run Client GWT

cd stockwatcher-webapp

mvn gwt:codeserver -pl *-client -am

### Run Server Jetty

cd stockwatcher-webapp

mvn jetty:run -pl *-server -am -Denv=dev

### Start Webapp

http://localhost:8080/

![StockWatcher UI](stockwatcher-ui.png?raw=true "StockWatcher UI")