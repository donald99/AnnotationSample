package dom.annotation;

public class Person {

    @Column(name = "18")
    private int age;

    @Column(name = "liushengwen")
    private String name;

    @WrappedMethod()
    public String getPersonInfo() {
        return "Age：" + age + "  name:" + name;
    }
}