package com.aspose.slides.internal.p217k4;

/* JADX INFO: renamed from: com.aspose.slides.internal.k4.x6 */
/* JADX INFO: loaded from: classes.dex */
public class C5605x6 extends C5598um {

    /* JADX INFO: renamed from: k4 */
    public int f15434k4;

    /* JADX INFO: renamed from: x1 */
    public int f15435x1;

    public C5605x6() {
    }

    @Override // java.lang.Throwable
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer("MismatchedNotSetException(");
        stringBuffer.append(m22991x1());
        stringBuffer.append(" not in [");
        stringBuffer.append(this.f15434k4);
        stringBuffer.append(",");
        stringBuffer.append(this.f15435x1);
        stringBuffer.append("])");
        return stringBuffer.toString();
    }

    public C5605x6(int i, int i2, InterfaceC5607yj interfaceC5607yj) {
        super(interfaceC5607yj);
        this.f15434k4 = i;
        this.f15435x1 = i2;
    }
}
