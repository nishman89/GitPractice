package com.sparta.nam.basics;

public class Selection {

                priority = priority + "Amber";
                break;
            default:
                priority = "Error";
                break;
        }
        return priority;
    }

    public static String getGradeIfElse(int mark){

        if(mark >= 85){
            return "Distinction";
        }  if (mark >= 65){
            return "Pass";
        }  {
            return "Fail";
        }
    }

    // Conditional operator
    public static String getGradeConditionalOperator(int mark){
        String grade = mark >= 65 ? "Pass" : "Fail";
        return grade;
    }
}
