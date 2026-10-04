package com.aspose.slides.internal.p060ca;

import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.ca.gr */
/* JADX INFO: loaded from: classes3.dex */
public class C2102gr implements InterfaceC2269qx {

    /* JADX INFO: renamed from: k4 */
    private C2260qh f7280k4;

    /* JADX INFO: renamed from: kk */
    private InterfaceC2203mx f7281kk;

    /* JADX INFO: renamed from: to */
    private int f7282to;

    /* JADX INFO: renamed from: x1 */
    private AbstractC2320ug f7283x1;

    public C2102gr(C2260qh c2260qh, AbstractC2320ug abstractC2320ug, int i, InterfaceC2203mx interfaceC2203mx) {
        this.f7280k4 = c2260qh;
        this.f7283x1 = abstractC2320ug;
        this.f7281kk = interfaceC2203mx;
        this.f7282to = i;
    }

    /* JADX INFO: renamed from: k4 */
    private C2365x7 m10648k4(C2379xz c2379xz, int i, int i2) {
        C2376xu<C2365x7> c2376xuM11279k4 = this.f7280k4.m11279k4(i2);
        if (c2376xuM11279k4 == null) {
            return null;
        }
        for (C2365x7 c2365x7 : (C2365x7[]) c2376xuM11279k4.m11701x1()) {
            if (C2143je.m10831k4(c2379xz, i, c2365x7.m11678to(), this.f7280k4.m11280kk(), true)) {
                return c2365x7;
            }
        }
        return null;
    }

    @Override // com.aspose.slides.internal.p060ca.InterfaceC2269qx
    /* JADX INFO: renamed from: k4 */
    public final boolean mo10531k4(C2379xz c2379xz, int[] iArr) {
        if (!this.f7280k4.m11282x1().m11551x1(c2379xz.m11712k4(iArr[0]).m10719k4())) {
            return false;
        }
        C2365x7 c2365x7M10648k4 = m10648k4(c2379xz, iArr[0], this.f7280k4.m11280kk().m10521x1(c2379xz.m11712k4(iArr[0]).m10719k4()));
        if (c2365x7M10648k4 == null) {
            return false;
        }
        for (int i = 0; i < c2365x7M10648k4.m11677kk(); i++) {
            int iM11417k4 = iArr[0] + (c2365x7M10648k4.m11676k4(i).m11417k4() & 65535);
            if (iM11417k4 > c2379xz.m11721x1()) {
                throw new C2243pd(C14113y2.m67402k4("Incorrect sequence index in Lookup record #{0} in lookup {1}", Integer.valueOf(i), this.f7280k4.m11281to()));
            }
            this.f7281kk.mo11134k4(this.f7282to, 65535 & c2365x7M10648k4.m11676k4(i).m11418x1()).mo11104k4(c2379xz, new int[]{iM11417k4}, c2365x7M10648k4.m11679x1() + iArr[0]);
        }
        iArr[0] = (c2365x7M10648k4.m11679x1() - 1) + iArr[0];
        return true;
    }
}
