package com.aspose.slides.internal.p217k4;

/* JADX INFO: renamed from: com.aspose.slides.internal.k4.uz */
/* JADX INFO: loaded from: classes.dex */
public class C5600uz extends C5586ix {

    /* JADX INFO: renamed from: x1 */
    public Object f15430x1;

    public C5600uz() {
    }

    /* JADX INFO: renamed from: k4 */
    public int m22992k4() {
        return this.f15392k4;
    }

    @Override // com.aspose.slides.internal.p217k4.C5586ix, java.lang.Throwable
    public String toString() {
        StringBuffer stringBuffer;
        if (this.f15430x1 != null && this.f15424h4 != null) {
            stringBuffer = new StringBuffer("MissingTokenException(inserted ");
            stringBuffer.append(this.f15430x1);
            stringBuffer.append(" at ");
        } else {
            if (this.f15424h4 == null) {
                return "MissingTokenException";
            }
            stringBuffer = new StringBuffer("MissingTokenException(at ");
        }
        stringBuffer.append(this.f15424h4.mo22924x1());
        stringBuffer.append(")");
        return stringBuffer.toString();
    }

    public C5600uz(int i, InterfaceC5607yj interfaceC5607yj, Object obj) {
        super(i, interfaceC5607yj);
        this.f15430x1 = obj;
    }
}
