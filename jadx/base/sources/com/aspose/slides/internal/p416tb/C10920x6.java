package com.aspose.slides.internal.p416tb;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.internal.p201j8.InterfaceC5218x1;
import com.aspose.slides.internal.p223ka.C5656k4;
import com.aspose.slides.internal.p323op.C7131h4;
import com.aspose.slides.internal.p323op.C7134m9;
import com.aspose.slides.internal.p443ul.C11444k4;
import com.aspose.slides.internal.p479wm.C12210k4;
import com.aspose.slides.internal.p505xn.C12565ks;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.tb.x6 */
/* JADX INFO: loaded from: classes4.dex */
public class C10920x6 {

    /* JADX INFO: renamed from: c5 */
    private boolean f37976c5;

    /* JADX INFO: renamed from: ck */
    private boolean f37977ck;

    /* JADX INFO: renamed from: ix */
    private InterfaceC5218x1 f37982ix;

    /* JADX INFO: renamed from: k4 */
    private C11444k4 f37984k4;

    /* JADX INFO: renamed from: kk */
    private int f37985kk;

    /* JADX INFO: renamed from: to */
    private int f37990to;

    /* JADX INFO: renamed from: uz */
    private C12210k4<C7134m9, C7131h4> f37993uz;

    /* JADX INFO: renamed from: x1 */
    private int f37994x1;

    /* JADX INFO: renamed from: du */
    private int f37978du = 3;

    /* JADX INFO: renamed from: h4 */
    private int f37981h4 = 0;

    /* JADX INFO: renamed from: m9 */
    private boolean f37987m9 = true;

    /* JADX INFO: renamed from: dy */
    private int f37979dy = 95;

    /* JADX INFO: renamed from: jd */
    private int f37983jd = 0;

    /* JADX INFO: renamed from: fa */
    private boolean f37980fa = true;

    /* JADX INFO: renamed from: up */
    private boolean f37992up = false;

    /* JADX INFO: renamed from: yj */
    private C10907m9 f37996yj = new C10907m9();

    /* JADX INFO: renamed from: ks */
    private C10919x1 f37986ks = new C10919x1();

    /* JADX INFO: renamed from: rv */
    private int f37989rv = 2;

    /* JADX INFO: renamed from: x6 */
    private C5656k4 f37995x6 = C5656k4.f15509cw;

    /* JADX INFO: renamed from: ne */
    private boolean f37988ne = false;

    /* JADX INFO: renamed from: u4 */
    private long f37991u4 = 8;

    /* JADX INFO: renamed from: c5 */
    public final int m52603c5() {
        return this.f37979dy;
    }

    /* JADX INFO: renamed from: ck */
    public final int m52604ck() {
        return this.f37983jd;
    }

    /* JADX INFO: renamed from: du */
    public final int m52605du() {
        return this.f37990to;
    }

    /* JADX INFO: renamed from: dy */
    public final boolean m52606dy() {
        return this.f37987m9;
    }

    /* JADX INFO: renamed from: fa */
    public final C10907m9 m52607fa() {
        return this.f37996yj;
    }

    /* JADX INFO: renamed from: h4 */
    public final int m52608h4() {
        return this.f37978du;
    }

    /* JADX INFO: renamed from: ix */
    public final C10919x1 m52609ix() {
        return this.f37986ks;
    }

    /* JADX INFO: renamed from: jd */
    public final boolean m52610jd() {
        return this.f37976c5;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m52611k4() {
        if (m52628up()) {
            if (m52620ks()) {
                throw new ArgumentException("You have requested both PDF/A compliance and PDF encryption but these options cannot be used together.");
            }
            if (m52608h4() == 2) {
                throw new ArgumentException("LZW text compression algorithm does not conforms with PDF/A standard.");
            }
            if (m52621m9() == 3 || m52621m9() == 4) {
                throw new ArgumentException("LZW image compression algorithms does not conforms with PDF/A standard.");
            }
        }
        C11444k4 c11444k4 = this.f37984k4;
        if (c11444k4 != null) {
            if (!C12565ks.m58630x1(c11444k4.m54499k4()) && !C12565ks.m58630x1(this.f37984k4.m54502x1())) {
                throw new ArgumentException("You have requested PDF encryption, but not specified either a user password or an owner password.");
            }
            if (C14113y2.m67363du(this.f37984k4.m54499k4(), this.f37984k4.m54502x1())) {
                throw new ArgumentException("The PDF user password and owner password cannot be the same. Please enter different passwords.");
            }
        }
    }

    /* JADX INFO: renamed from: kk */
    public final int m52618kk() {
        return this.f37994x1;
    }

    /* JADX INFO: renamed from: ks */
    public final boolean m52620ks() {
        return this.f37984k4 != null;
    }

    /* JADX INFO: renamed from: m9 */
    public final int m52621m9() {
        return this.f37981h4;
    }

    /* JADX INFO: renamed from: ne */
    public final boolean m52622ne() {
        return this.f37977ck;
    }

    /* JADX INFO: renamed from: qq */
    public final C12210k4<C7134m9, C7131h4> m52623qq() {
        return this.f37993uz;
    }

    /* JADX INFO: renamed from: rv */
    public final C5656k4 m52624rv() {
        return this.f37995x6;
    }

    /* JADX INFO: renamed from: to */
    public final int m52625to() {
        return this.f37985kk;
    }

    /* JADX INFO: renamed from: u4 */
    public final int m52627u4() {
        return this.f37989rv;
    }

    /* JADX INFO: renamed from: up */
    public final boolean m52628up() {
        switch (this.f37983jd) {
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 10:
                return true;
            case 9:
            default:
                return false;
        }
    }

    /* JADX INFO: renamed from: uz */
    public final InterfaceC5218x1 m52629uz() {
        return this.f37982ix;
    }

    /* JADX INFO: renamed from: wl */
    public final long m52630wl() {
        return this.f37991u4;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m52631x1(int i) {
        if (i < 0 || i > 100) {
            throw new ArgumentException("value");
        }
        this.f37979dy = i;
    }

    /* JADX INFO: renamed from: x6 */
    public final boolean m52634x6() {
        return this.f37988ne;
    }

    /* JADX INFO: renamed from: yj */
    public final C11444k4 m52635yj() {
        return this.f37984k4;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m52612k4(int i) {
        this.f37978du = i;
    }

    /* JADX INFO: renamed from: kk */
    public final void m52619kk(int i) {
        this.f37983jd = i;
    }

    /* JADX INFO: renamed from: to */
    public final void m52626to(int i) {
        this.f37989rv = i;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m52632x1(boolean z) {
        this.f37988ne = z;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m52613k4(InterfaceC5218x1 interfaceC5218x1) {
        this.f37982ix = interfaceC5218x1;
    }

    /* JADX INFO: renamed from: x1 */
    public final boolean m52633x1() {
        int i = this.f37983jd;
        return i == 3 || i == 5 || i == 7 || i == 9 || i == 10;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m52614k4(C5656k4 c5656k4) {
        this.f37995x6 = c5656k4;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m52615k4(C11444k4 c11444k4) {
        this.f37984k4 = c11444k4;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m52616k4(C12210k4<C7134m9, C7131h4> c12210k4) {
        this.f37993uz = c12210k4;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m52617k4(boolean z) {
        this.f37987m9 = z;
    }
}
