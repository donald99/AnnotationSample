package d.annotation.Javapoet;

import javax.lang.model.element.Element;
import javax.lang.model.element.ElementKind;
import javax.lang.model.element.Name;
import javax.lang.model.element.VariableElement;
import javax.lang.model.type.TypeMirror;

public class BindViewField {

    private VariableElement variableElement;

    private int viewId;

    /**
     * 使用 Element 初始化当前类
     *
     * @param element element
     */
    public BindViewField(Element element) {
        if (element.getKind() != ElementKind.FIELD) {
            throw new IllegalArgumentException("Only field can be annotated with %s" + BindView.class.getSimpleName());
        }
        variableElement = (VariableElement) element;
        BindView bindView = variableElement.getAnnotation(BindView.class);
        viewId = bindView.id();
        if (viewId < 0) {
            throw new IllegalArgumentException("The id must > 0");
        }
    }

    public Name getFieldName() {
        return variableElement.getSimpleName();
    }

    public int getViewId() {
        return viewId;
    }

    public TypeMirror getFieldType() {
        return variableElement.asType();
    }
}
