package wood.mike

import org.gradle.api.DefaultTask;
import org.gradle.api.tasks.TaskAction;

/**
 * A task must extend DefaultTask and have public void method annotated with @TaskAction
 *
 * You must register the task in build.gradle like:
 * tasks.register('hello', HelloTask)
 *
 * Then execute like:
 * ./gradlew hello
 */
class HelloTask extends DefaultTask {
    @TaskAction
    void run() {
        System.out.println("Hello from task " + getPath() + "!");
    }
}