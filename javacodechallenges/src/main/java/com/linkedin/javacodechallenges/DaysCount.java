package com.linkedin.javacodechallenges;

import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;

public class DaysCount {
  public static LocalDate calculate100Days(LocalDate today){
    Period hundredDays = Period.ofDays(100);
    return today.plus(hundredDays);

  }
  public static void main (String [] ars)
  {
    LocalDate today = LocalDate.now(ZoneId.of("America/New_York"));
    System.out.println ("100 Days from now is ... " + calculate100Days(today));
  }
}
