package com.aspose.slides;

/* JADX INFO: loaded from: classes3.dex */
public class CellInvalidFormulaException extends PptxEditException {

    /* JADX INFO: renamed from: k4 */
    private String f1292k4;

    public CellInvalidFormulaException() {
    }

    public final String getReference() {
        return this.f1292k4;
    }

    public CellInvalidFormulaException(String str) {
        super(str);
    }

    public CellInvalidFormulaException(String str, RuntimeException runtimeException) {
        super(str, runtimeException);
    }

    public CellInvalidFormulaException(String str, String str2) {
        this(str);
        this.f1292k4 = str2;
    }
}
