package jyotiprakash.com.next;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import jyotiprakash.com.next.Pages.Home;

import static jyotiprakash.com.next.Pages.AddTask.TASK_NAME;
import static jyotiprakash.com.next.Utils.CustomAssertions.shouldDisplayNewTaskInTheList;

/**
 * Created by Daniel Blokus on 30.09.2017.
 */

@RunWith(AndroidJUnit4.class)
public class TasksTest {
    @Rule
    public ActivityTestRule<MainActivity> mActivityTestRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void createDefaultTask_ShouldDisplayHomeView() {
        new Home().navigateToAddTask().addTask();
        shouldDisplayNewTaskInTheList(TASK_NAME);
    }
}
