package com.novasystem.web.gugudan;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class  GugudanMainTest {

  //@Test(timeout=5000)  : 시간단위 : 밀리초
  //@Test(expected=RuntimeException.class) : RuntimeException이 발생해야 성공
  //@Ignore(value=”test”)

  //@Before 해당 테스트 클래스의 객체를 초기화하는 작업
  //@After 해당 테스트  실행 수 실행

  //@BeforeClass 테스트 클래스 실행 전 한번 실행
  //@AfterClass 테스트 클래스 실행 후 한번 실행
  @Test
  public void testSum1( ) {
    GugudanMain gugu = new GugudanMain();
    boolean result = gugu.gogoGugu(2);
    assertEquals(true,  result);
  }

  @Test
  public void testSum2( ) {
    GugudanMain gugu = new GugudanMain();
    boolean result = gugu.gogoGugu(2);
    assertEquals(true,  result);
  }

  @Test
  public void testSum3( ) {
    GugudanMain gugu = new GugudanMain();
    boolean result = gugu.gogoGugu(2);
    assertEquals(true,  result);
  }
}
