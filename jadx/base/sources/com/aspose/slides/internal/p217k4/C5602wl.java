package com.aspose.slides.internal.p217k4;

/* JADX INFO: renamed from: com.aspose.slides.internal.k4.wl */
/* JADX INFO: loaded from: classes.dex */
public class C5602wl extends C5598um {

    /* JADX INFO: renamed from: k4 */
    public String f15431k4;

    /* JADX INFO: renamed from: kk */
    public int f15432kk;

    /* JADX INFO: renamed from: x1 */
    public int f15433x1;

    public C5602wl() {
    }

    @Override // java.lang.Throwable
    public String toString() {
        StringBuffer stringBuffer;
        String str;
        if (this.f15427to instanceof InterfaceC5585h4) {
            stringBuffer = new StringBuffer("NoViableAltException('");
            stringBuffer.append((char) m22991x1());
            str = "'@[";
        } else {
            stringBuffer = new StringBuffer("NoViableAltException(");
            stringBuffer.append(m22991x1());
            str = "@[";
        }
        stringBuffer.append(str);
        stringBuffer.append(this.f15431k4);
        stringBuffer.append("])");
        return stringBuffer.toString();
    }

    public C5602wl(String str, int i, int i2, InterfaceC5607yj interfaceC5607yj) {
        super(interfaceC5607yj);
        this.f15431k4 = str;
        this.f15433x1 = i;
        this.f15432kk = i2;
    }
}
