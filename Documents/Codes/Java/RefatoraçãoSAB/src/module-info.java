module RefatoracaoSAB {
    requires java.base;
    requires org.junit.jupiter.api;

    exports com.refatoracaoSab;
    opens com.refatoracaoSab to org.junit.platform.commons;
}