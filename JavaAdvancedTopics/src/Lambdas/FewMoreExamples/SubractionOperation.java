package Lambdas.FewMoreExamples;

public class SubractionOperation implements MathematicalOperation{
    @Override
    public Integer operate(Integer o1, Integer o2) {
        return o1-o2;
    }
}
