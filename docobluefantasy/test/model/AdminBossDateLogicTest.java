package model;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.After;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import bean.Boss;
import dao.BossDAO;

@FixMethodOrder (MethodSorters.NAME_ASCENDING)
public class AdminBossDateLogicTest {

	private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));

    }

    @After
    public void cleanUpStreams() {
        System.setOut(System.out);

    }

    @Test
    public void stage1_ExecuteInsertTest() {

    	Boss bossInsert = new Boss("JUnitテスト01", 9999, 999999, "JUnitテスト02");

    	BossDAO bossDAO = new BossDAO();

    	boolean propriety = bossDAO.insertDB(bossInsert);

    	assertTrue(propriety);

    }

    @Test
    public void stage2_executeUpdateTest() {

    	Boss bossOriginal = new Boss("JUnitテスト01", 0, 0, null);

    	Boss bossUpdate = new Boss("新JUnitテスト01", 123456789, 123456789, "新JUnitテスト02");

    	BossDAO bossDAO = new BossDAO();

    	boolean propriety = bossDAO.updateDB(bossOriginal,bossUpdate);

    	assertTrue(propriety);

    }

    @Test
    public void stage3_executeDeleteTest() {

    	Boss bossDelete = new Boss("新JUnitテスト01", 0, 0, null);

    	BossDAO bossDAO = new BossDAO();

    	boolean propriety = bossDAO.deleteDB(bossDelete);

    	assertTrue(propriety);

    }

}
