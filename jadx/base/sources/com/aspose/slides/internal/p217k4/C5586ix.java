package com.aspose.slides.internal.p217k4;

/* JADX INFO: renamed from: com.aspose.slides.internal.k4.ix */
/* JADX INFO: loaded from: classes.dex */
public class C5586ix extends C5598um {

    /* JADX INFO: renamed from: k4 */
    public int f15392k4;

    public C5586ix() {
        this.f15392k4 = 0;
    }

    @Override // java.lang.Throwable
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer("MismatchedTokenException(");
        stringBuffer.append(m22991x1());
        stringBuffer.append("!=");
        stringBuffer.append(this.f15392k4);
        stringBuffer.append(")");
        return stringBuffer.toString();
    }

    public C5586ix(int i, InterfaceC5607yj interfaceC5607yj) {
        super(interfaceC5607yj);
        this.f15392k4 = i;
    }
}
