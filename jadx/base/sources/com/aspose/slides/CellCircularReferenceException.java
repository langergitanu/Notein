package com.aspose.slides;

/* JADX INFO: loaded from: classes3.dex */
public class CellCircularReferenceException extends PptxEditException {

    /* JADX INFO: renamed from: k4 */
    private String f1266k4;

    public CellCircularReferenceException() {
    }

    public final String getReference() {
        return this.f1266k4;
    }

    public CellCircularReferenceException(String str) {
        super(str);
    }

    public CellCircularReferenceException(String str, RuntimeException runtimeException) {
        super(str, runtimeException);
    }

    public CellCircularReferenceException(String str, String str2) {
        this(str);
        this.f1266k4 = str2;
    }
}
