package com.aspose.slides.internal.p217k4;

/* JADX INFO: renamed from: com.aspose.slides.internal.k4.ne */
/* JADX INFO: loaded from: classes.dex */
public class C5593ne extends C5598um {

    /* JADX INFO: renamed from: k4 */
    public C5582du f15416k4;

    public C5593ne() {
    }

    @Override // java.lang.Throwable
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer("MismatchedSetException(");
        stringBuffer.append(m22991x1());
        stringBuffer.append("!=");
        stringBuffer.append(this.f15416k4);
        stringBuffer.append(")");
        return stringBuffer.toString();
    }

    public C5593ne(C5582du c5582du, InterfaceC5607yj interfaceC5607yj) {
        super(interfaceC5607yj);
        this.f15416k4 = c5582du;
    }
}
