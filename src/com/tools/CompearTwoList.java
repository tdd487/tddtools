package com.tools;

import java.math.BigDecimal;
import java.util.List;

public class CompearTwoList {

    /**
     * 比较两个list是否一样，不考虑顺序
     * @param aList 数组一
     * @param bList 数组二
     * @return boolean true为一样，false为不一样
     * */
    public static boolean equals(List aList, List bList) {

        for(int i = 0;i<aList.size();i++){
            for(int j = 0;j<bList.size();j++) {
                if(aList.get(i).equals(bList.get(j))){
                    return true;
                }
            }
        }

        return false;
    }
}
