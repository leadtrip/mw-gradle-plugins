### This project tests out various methods of adding Gradle plugins to a project.

##### Build script (build.gradle)
There's a WhatsTheTimePlugin defined in build.gradle along with an extension interface to get the properties defined in the relevant block.
Run the plugin's task with

`./gradlew -q whatsthetime`

#### buildSrc - custom task and plugin
The HelloTask is defined in buildSrc/src/main/groovy and registered in build.gradle, run the task with:

`./gradlew hello`

The DayOfWeek plugin is also defined in buildSrc, the plugin is applied in build.gradle, run the plugin's task with:

`./gradlew dayOfWeek`

#### Standalone project
Follow the instructions on the [file-based-plugin](https://github.com/leadtrip/file-based-plugin) to deploy to your local maven repo first.

The plugin has already been applied and configured appropriately in build.gradle, run the plugin's task with:

`./gradlew createFile`