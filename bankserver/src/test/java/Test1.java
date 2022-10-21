import com.demo.entity.ApSend;
import org.junit.Test;
import org.springframework.context.annotation.Description;

/**
 *
 * 这个类的信息：
 *
 * @author luxingdong
 * @ceratetime ${DATE}
 * @describe
 */
public class Test1 {
    
    /**
     * 
     * 这个方法的信息:
     * 
     * @author luxingdong
     * @paramtype [java.lang.String, int]
     * @return com.demo.entity.ApSend
     * @createtime 2022/10/19
     * @describe 方法名:test1
     */
    public ApSend test1(String a, int b){
        return ApSend.builder().build();
    }



    /**
     * 
     * 这个方法的信息:
     * 
     * @author luxingdong
     * @paramtype [java.lang.String]
     * @return java.lang.String
     * @createtime 2022/10/19
     * @describe 方法名:test2
     */
    public String test2(String a){
        return "asdasd";
    }

    private void ifelse(Object a,Object b){
        if (a.equals(b)){
            System.out.println("相等");
        }else {
            System.out.println("不相等");
        }
    }

    @Test
    public void test3(){
        ApSend build = ApSend.builder().build();
        ifelse(build,build);
        System.out.println(build);
    }

    @Test
    public void test4(){
        annotationtest.Test1 test1 = new annotationtest.Test1();
        System.out.println(test1);
    }

}
