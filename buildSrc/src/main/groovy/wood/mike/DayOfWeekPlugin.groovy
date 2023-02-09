package wood.mike

import org.gradle.api.Plugin
import org.gradle.api.Project

import java.time.LocalDate
import java.time.format.TextStyle

/**
 * Plugin just prints the current day of the week, it's applied in build.gradle, execute with
   ./gradlew dayOfWeek
 */
class DayOfWeekPlugin implements Plugin<Project>{
    @Override
    void apply(Project project) {
        project.getTasks().register('dayOfWeek', {
            println LocalDate.now().getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.default)
        })
    }
}
