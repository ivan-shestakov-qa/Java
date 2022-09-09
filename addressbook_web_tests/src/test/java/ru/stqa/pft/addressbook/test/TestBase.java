package ru.stqa.pft.addressbook.test;

import org.junit.After;
import org.junit.Before;
import ru.stqa.pft.addressbook.appmanager.ApplicetionManager;

public class TestBase {

    protected final ApplicetionManager app = new ApplicetionManager();

    @Before
    public void setUp() {
        app.init();
    }

    @After
    public void tearDown() {
        app.stop();
    }

}
