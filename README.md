1. What is M2_HOME? How to setup Maven?

M2_HOME is the environment variable that you set up for your system to point to when looking for its Maven installation. This can be set up by setting the M2_HOME path variable to point to the directory which houses the Maven bin folder. 

 
 2. What is settings.xml file for?

This xml file is what is used to configure the Maven execution. Inside this file, many things can be adjusted such as setting up the location of local and remote repositories, profiles, properties, and other various configurations.


3. How to work with maven profile?

Profiles essentially hold the specific configurations that were set up. These profiles can be specified globally, based on project, or even based on user. These profiles can also be set up in such a way that they can be invoked explicitly through the command line, or implicitly based on factors such as operating system.


4. Describe maven project structure.     

The maven project structure has the src directory which contains the main directory. Within the main directory there can be a resources directory containing project resources, and then also a java directory which contains all of the java packages from your code. There is also a target directory which contains the compiled classes from your code, including a JAR file after your project is built successfully. Lastly there is a pom.xml file that contains configurations for your current maven project.
               

5. Describe maven lifecycle. Each step.

The maven lifecycle starts with validating the project by making sure all of the necessary information is available for your project to run. Then the compile step compiles all of the source code for your project. The test step then tests the compiled source code using the appropriate testing framework. The package step then takes all of the compiled code and packages it in a distributable file such as a JAR, and moves all of the compiled code into the target folder. The verify step checks the results of integration tests. Lastly the install step installs the package into the local repository and then the deploy step copies the final package to the remote repository for sharing with other developers.



6. What do you know about pom.xml file structure?

The pom.xml file contains information about the project's configurations. The minimum required structure for a pom.xml file contains the project root, the model version, the group id, the artifact id, and the version number. There can be a number of other configuration requirements such as properties, plugins, and dependencies. 


7. What do you know about local/remote repositories?

The local repository is a directory located on your computer that houses all of your different projects and source code that can be easily accessed by the user. A remote repository is a directory hosted by a server that a user can upload to, which allows them to easily share their projects with other developers or team members.

 
 8. What is target directory?

The target directory of a maven project houses all of the build output. This includes all of the compiled source code of the project.


9. How to work with maven plugin?

Maven plugins can be added to the project’s pom.xml file and can then be used to execute specific goals during the maven lifecycle.


10. What Maven flags do you know?

Maven flags are command line options that can be executed with the maven command. Any of the lifecycle steps can be executed from the command line.There are other helpful flags such as mvn -help, which displays all of the available maven options, mvn -version which displays the current maven version, and mvn -archetype which generates a maven project using an archetype template.
