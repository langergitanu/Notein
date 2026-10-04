package com.aspose.slides.internal.p060ca;

/* JADX INFO: renamed from: com.aspose.slides.internal.ca.o1 */
/* JADX INFO: loaded from: classes3.dex */
public class C2223o1 implements InterfaceC2269qx {

    /* JADX INFO: renamed from: k4 */
    private C2189m6 f7678k4;

    /* JADX INFO: renamed from: kk */
    private InterfaceC2203mx f7679kk;

    /* JADX INFO: renamed from: to */
    private int f7680to;

    /* JADX INFO: renamed from: x1 */
    private AbstractC2320ug f7681x1;

    public C2223o1(C2189m6 c2189m6, AbstractC2320ug abstractC2320ug, int i, InterfaceC2203mx interfaceC2203mx) {
        this.f7678k4 = c2189m6;
        this.f7681x1 = abstractC2320ug;
        this.f7679kk = interfaceC2203mx;
        this.f7680to = i;
    }

    /* JADX INFO: renamed from: k4 */
    public final C2126i9 m11183k4(C2379xz c2379xz, int i, int i2) {
        C2004au c2004auM11110k4 = this.f7678k4.m11110k4(i2);
        if (c2004auM11110k4 == null) {
            return null;
        }
        for (C2126i9 c2126i9 : c2004auM11110k4.m10223x1()) {
            if (C2143je.m10831k4(c2379xz, i, c2126i9.m10712to(), this.f7678k4.m11112to(), true) && C2143je.m10831k4(c2379xz, i, c2126i9.m10713x1(), this.f7678k4.m11111kk(), false) && C2143je.m10831k4(c2379xz, i, c2126i9.m10709du(), this.f7678k4.m11109du(), true)) {
                return c2126i9;
            }
        }
        return null;
    }

    @Override // com.aspose.slides.internal.p060ca.InterfaceC2269qx
    /* JADX INFO: renamed from: k4 */
    public final boolean mo10531k4(C2379xz c2379xz, int[] iArr) {
        if (this.f7678k4.m11113x1().m11550kk(c2379xz.m11712k4(iArr[0]).m10719k4()) == -1) {
            return false;
        }
        C2126i9 c2126i9M11183k4 = m11183k4(c2379xz, iArr[0], this.f7678k4.m11112to().m10521x1(c2379xz.m11712k4(iArr[0]).m10719k4()));
        if (c2126i9M11183k4 == null) {
            return false;
        }
        return m11182k4(c2379xz, iArr, c2126i9M11183k4);
    }

    /* JADX INFO: renamed from: k4 */
    private boolean m11182k4(C2379xz c2379xz, int[] iArr, C2126i9 c2126i9) {
        int i = 0;
        while (i < c2126i9.m10711kk() && iArr[0] < c2379xz.m11721x1()) {
            while (C2143je.m10830k4(c2379xz.m11712k4(iArr[0]).m10719k4(), c2379xz.m11710h4().m10758x1().m10578u4(), this.f7681x1)) {
                int i2 = iArr[0] + 1;
                iArr[0] = i2;
                if (i2 == c2379xz.m11721x1()) {
                    return true;
                }
            }
            int i3 = iArr[0];
            if (!this.f7679kk.mo11134k4(this.f7680to, c2126i9.m10710k4(i).m11418x1() & 65535).mo11104k4(c2379xz, iArr, c2126i9.m10711kk() + iArr[0])) {
                iArr[0] = iArr[0] + 1;
                i++;
            } else {
                i += iArr[0] - i3;
            }
        }
        return true;
    }
}
