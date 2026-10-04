package com.aspose.slides;

/* JADX INFO: loaded from: classes3.dex */
public class CellInvalidReferenceException extends PptxEditException {

    /* JADX INFO: renamed from: k4 */
    private String f1293k4;

    public CellInvalidReferenceException() {
    }

    public final String getReference() {
        return this.f1293k4;
    }

    public CellInvalidReferenceException(String str) {
        super(str);
    }

    public CellInvalidReferenceException(String str, RuntimeException runtimeException) {
        super(str, runtimeException);
    }

    public CellInvalidReferenceException(String str, String str2) {
        this(str);
        this.f1293k4 = str2;
    }
}
