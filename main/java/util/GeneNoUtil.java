package util;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by 三 on 2016/1/10.
 */
public class GeneNoUtil {

    //生成项目编号的工具类
    public static String GetDate(String type,String number){
        String tempStr="";
        Date dt = new Date();
        //最后的aa表示“上午”或“下午”    HH表示24小时制    如果换成hh表示12小时制
        //  SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss aa");
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
        tempStr=sdf.format(dt);
        tempStr=type+tempStr+number;
        return tempStr;
    }

    //截取编号工具类获取当前日最大编号数+1
    public static String DealNo(String type,String no){
        String tempStr="";int temp;
        int startIndex=type.length()+8;//编号+20160110（8）
        tempStr=no.substring(startIndex);
        temp= Integer.valueOf(tempStr)+1;
        tempStr=temp+"";
        return tempStr;
    }
    public static void main(String[] args) {
        //1：项目 2：其他
        System.out.println("生成编号——"+ GeneNoUtil.GetDate("1", "10086"));
        //1：项目 2：其他
        System.out.println("处理编号——"+ GeneNoUtil.DealNo("1", "12016011010086"));
    }
}
