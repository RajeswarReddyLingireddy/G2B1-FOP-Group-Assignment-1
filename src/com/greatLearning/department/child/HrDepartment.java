package com.greatLearning.department.child;

import com.greatLearning.department.parent.SuperDepartment;

public class HrDepartment extends SuperDepartment {

    @Override
    public String departmentName(){
        return "HR Department";
    }
    @Override
    public String getTodaysWork(){
        return "Fill today’s timesheet and mark your attendance";
    }
    @Override
    public String getWorkDeadline(){
        return "Complete by EOD";
    }

    public String doActivity(){
        return "team Lunch";
    }
}
