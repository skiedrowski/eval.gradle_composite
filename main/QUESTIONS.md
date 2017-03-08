# Version handling
We should declare all dependency versions in one central file to avoid having version differences 
between main and projects.

# Avoid packing an "overwritten" class twice
Either while creating the ear/war (how to apply that to exploded war/ear during development), similar to the gradle flavour variant?
Or by avoiding overrides (use Interfaces/CDI/whatever).

# Apply jvm-project-template?
reduces duplications 

# cannot build (and therefore run) via IntelliJ
Error:Unable to make the module: eval.gradle_composite.nasa, related gradle configuration was not found. Please, re-import the Gradle project and try again.
Error:Unable to make the module: eval.gradle_composite.main, related gradle configuration was not found. Please, re-import the Gradle project and try again.

Running via `./gradlew run` works like a charm.

# use mockito-kotlin
https://github.com/nhaarman/mockito-kotlin

# use single git repo or one per project + main?