GateIn RESTful Resource Container
------

An archetype for an easy/quick way to have a rest based resource container for the GateIn portal.

### How to install

For the installation part, either refer to _Install from OSSRH_ or _Build and generate the archetype locally_ chapters.

#### Install from OSSRH
Generate your project using the remote repository:
* ```mvn archetype:generate -DarchetypeGroupId=com.github.wisebrains.archetypes \
                            -DarchetypeArtifactId=gatein-rest-resource-archetype \
                            -DarchetypeVersion=1.1 \
                            -DgroupId=your-groupId
                            -DartifactId=your-artifactId```


#### Build and generate the archetype locally

###### Clone the git project
* ```git clone git@github.com:wisebrains/wise-archetypes.git```
* Then move to the project directory.

###### Install the Maven archetype into your local repository
* ```mvn install```

###### Generate your application from installed archetype
* Go to a custom directory where you will hold your project, let's pretend it is _$DIR_
* ```mvn archetype:generate -DarchetypeGroupId=com.github.wisebrains.archetypes \
                            -DarchetypeArtifactId=gatein-rest-resource-archetype \
                            -DDarchetypeVersion=1.1 \
                            -DgroupId=your.groupId \
                            -DartifactId=your-artifactId```

_Note_: As you may already noticed, the used version is the 1.1 one, that said, it may not be the latest one and this README guide may be outdated.
So you can always refer to the tags version to check out for the latest one.

#### Package your application inside an Application Server
* ```cd $DIR```
* ```mvn package -DjarBuildPath=$SERVER_LIB_DIR```

Where _$SERVER_LIB_DIR_ stands for your server libraries full path e.g. for a Tomcat container it should be the _lib_ directory under server home.




