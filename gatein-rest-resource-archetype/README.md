GateIn RESTful resource
------

An archetype for and easy/quick way to have a rest based resource container for the GateIn portal.

##### How to install
###### Clone the git project
* _~ git clone git@github.com:tmarwen/wise-archetypes.git_
* Then move to the project directory

###### Install the Maven archetype into your local repository
* _~ mvn install_

###### Generate your application from installed archetype
Go to a custom directory where you will hold your project, let's pretend it is _$DIR_
* _~ mvn archetype:generate -DarchetypeGroupId=org.wisebrains.archetypes
                            -DarchetypeGroupId=gatein-rest-resource-archetype
                            -DDarchetypeVersion=1.0
                            -DgroupId=<your.groupid>
                            -DartifactId=<your-artifactId>_

###### Package your application inside an Application Server
* _~ cd $DIR_
* _~ mvn package -DjarBuildPath=$SERVER_LIB_DIR_

Where _$SERVER_LIB_DIR_ stands for your server libraries full path e.g. for a Tomcat container it should be the _lib_ directory under server home.




