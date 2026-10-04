package com.aspose.slides.internal.p016a8;

import com.aspose.slides.internal.p066cl.InterfaceC2623jd;
import com.aspose.slides.internal.p066cl.InterfaceC2624k4;
import com.aspose.slides.internal.p066cl.InterfaceC2625kk;

/* JADX INFO: renamed from: com.aspose.slides.internal.a8.kk */
/* JADX INFO: loaded from: classes3.dex */
public class C1306kk {

    /* JADX INFO: renamed from: c5 */
    private int f5751c5;

    /* JADX INFO: renamed from: du */
    private InterfaceC2624k4 f5752du;

    /* JADX INFO: renamed from: dy */
    private int f5753dy;

    /* JADX INFO: renamed from: h4 */
    private InterfaceC2623jd f5754h4;

    /* JADX INFO: renamed from: k4 */
    private int f5755k4;

    /* JADX INFO: renamed from: kk */
    private int f5756kk;

    /* JADX INFO: renamed from: m9 */
    private InterfaceC2625kk f5757m9;

    /* JADX INFO: renamed from: to */
    private int f5758to;

    /* JADX INFO: renamed from: x1 */
    private int f5759x1;

    public C1306kk(int i, int i2, int i3, int i4, InterfaceC2624k4 interfaceC2624k4) {
        this.f5755k4 = i;
        this.f5759x1 = i2;
        this.f5756kk = i3;
        this.f5758to = i4;
        this.f5752du = interfaceC2624k4;
        InterfaceC2623jd interfaceC2623jdMo11977fa = interfaceC2624k4.mo11977fa();
        this.f5754h4 = interfaceC2623jdMo11977fa;
        this.f5757m9 = interfaceC2623jdMo11977fa.mo11972x1();
        this.f5753dy = m7788kk();
        this.f5751c5 = m7789to();
    }

    /* JADX INFO: renamed from: kk */
    private int m7788kk() {
        return this.f5754h4.mo11967k4() * ((this.f5752du.mo11975du() * this.f5759x1) + this.f5755k4);
    }

    /* JADX INFO: renamed from: to */
    private int m7789to() {
        return this.f5754h4.mo11967k4() * (this.f5752du.mo11975du() - this.f5756kk);
    }

    /* JADX INFO: renamed from: k4 */
    public int m7790k4() {
        InterfaceC2625kk interfaceC2625kk = this.f5757m9;
        int i = this.f5753dy;
        this.f5753dy = i + 1;
        return interfaceC2625kk.mo11994k4(i);
    }

    /* JADX INFO: renamed from: x1 */
    public void m7792x1() {
        this.f5753dy += this.f5751c5;
    }

    /* JADX INFO: renamed from: k4 */
    public void m7791k4(int i) {
        InterfaceC2625kk interfaceC2625kk = this.f5757m9;
        int i2 = this.f5753dy;
        this.f5753dy = i2 + 1;
        interfaceC2625kk.mo11996k4(i2, i);
    }
}
