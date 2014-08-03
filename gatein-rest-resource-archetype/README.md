GateIn RESTful resource
------

An archetype for an easy/quick way to have a rest based resource container for the GateIn portal.

### How to install
#### Install from OSSRH
* You may can wait for the archetype to be availble on OSS open repo ;)
#### Build and generate the archetype locally
###### Clone the git project
* _~ git clone git@github.com:wisebrains/wise-archetypes.git_
* Then move to the project directory.

###### Install the Maven archetype into your local repository
* _~ mvn install_

###### Generate your application from installed archetype
Go to a custom directory where you will hold your project, let's pretend it is _$DIR_
* _~ mvn archetype:generate -DarchetypeGroupId=org.wisebrains.archetypes
                            -DarchetypeArtifactId=gatein-rest-resource-archetype
                            -DDarchetypeVersion=1.0
                            -DgroupId=<your.groupid>
                            -DartifactId=<your-artifactId>_

###### Package your application inside an Application Server
* _~ cd $DIR_
* _~ mvn package -DjarBuildPath=$SERVER_LIB_DIR_

Where _$SERVER_LIB_DIR_ stands for your server libraries full path e.g. for a Tomcat container it should be the _lib_ directory under server home.




