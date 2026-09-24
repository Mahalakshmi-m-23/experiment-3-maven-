package com.example.maven_github_Lak_demo;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
public class Lak_Test {
@Test
void testTotal()
{
	assertEquals(225,Lak_Maven.calculateTotal(75,68,82));
}
@Test
void testAverage()
{
    assertEquals(75.0,Lak_Maven.calculateAverage(75,68,82));
}
@Test
void testPass()
{
	assertTrue(Lak_Maven.isPass(75.0));
}
@Test
void testFail()
{
	assertFalse(Lak_Maven.isPass(35.0));
}
}
