package com.greatLearning.department.child;

import com.greatLearning.department.parent.SuperDepartment;

public class TechDepartment extends SuperDepartment {

    @Override
    public String departmentName(){
        return "Tech Department";
    }
    @Override
    public String getTodaysWork(){
        return "Complete coding of module 1";
    }
    @Override
    public String getWorkDeadline(){
        return "Complete by EOD";
    }

    public String getTechStackInformation(){
        return "core Java";
    }
}
