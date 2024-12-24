@echo off
set JAVA_OPTS=-Xms64m -Xmx128m -XX:+UseSerialGC -XX:MaxMetaspaceSize=64m -XX:CompressedClassSpaceSize=32m -XX:MaxDirectMemorySize=32m -Xss512k
set PATH_TO_FX=C:\javafx-sdk-23.0.1\lib

call mvn dependency:build-classpath -Dmdep.outputFile=classpath.txt
set /p CP=<classpath.txt

java %JAVA_OPTS% --module-path "%PATH_TO_FX%" --add-modules javafx.controls,javafx.fxml -cp "target/classes;%CP%" com.mouad.frontend.App

del classpath.txt
