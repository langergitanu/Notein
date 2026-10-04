package com.aspose.slides.internal.p104ec;

import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.internal.p080dd.C3134k4;
import com.aspose.slides.internal.p080dd.C3149x1;

/* JADX INFO: renamed from: com.aspose.slides.internal.ec.yj */
/* JADX INFO: loaded from: classes3.dex */
public class C3664yj extends AbstractC3629m4 {

    /* JADX INFO: renamed from: ck */
    private C3649uz f10162ck;

    /* JADX INFO: renamed from: du */
    private C3638rv f10163du;

    /* JADX INFO: renamed from: fa */
    private int f10165fa;

    /* JADX INFO: renamed from: jd */
    private C3654wl f10167jd;

    /* JADX INFO: renamed from: k4 */
    private final int f10168k4;

    /* JADX INFO: renamed from: kk */
    private C3618ix f10169kk;

    /* JADX INFO: renamed from: to */
    private C3635qq f10171to;

    /* JADX INFO: renamed from: x1 */
    private C3631ne f10172x1;

    /* JADX INFO: renamed from: h4 */
    private C3646u4 f10166h4 = new C3646u4();

    /* JADX INFO: renamed from: m9 */
    private C3658x6 f10170m9 = new C3658x6();

    /* JADX INFO: renamed from: dy */
    private C3626ks f10164dy = new C3626ks();

    /* JADX INFO: renamed from: c5 */
    private C3596ar f10161c5 = new C3596ar();

    public C3664yj(int i) {
        this.f10168k4 = i;
        this.f10172x1 = new C3631ne(i);
        this.f10171to = new C3635qq(i);
        this.f10163du = new C3638rv(i);
    }

    /* JADX INFO: renamed from: k4 */
    public final C3635qq m14860k4() {
        return this.f10171to;
    }

    /* JADX INFO: renamed from: kk */
    public final C3596ar m14861kk() {
        return this.f10161c5;
    }

    /* JADX INFO: renamed from: x1 */
    public final C3646u4 m14862x1() {
        return this.f10166h4;
    }

    public C3664yj(int i, String str) {
        this.f10168k4 = i;
        C3631ne c3631ne = new C3631ne(i);
        this.f10172x1 = c3631ne;
        c3631ne.m14782k4(str);
        C3618ix c3618ix = new C3618ix(i);
        this.f10169kk = c3618ix;
        c3618ix.m14760k4(str);
        C3635qq c3635qq = new C3635qq(i, str);
        this.f10171to = c3635qq;
        c3635qq.m14785k4(str);
        this.f10163du = new C3638rv(i, "");
        this.f10161c5.m14693k4(true);
    }

    @Override // com.aspose.slides.internal.p104ec.AbstractC3629m4
    /* JADX INFO: renamed from: k4 */
    public void mo14692k4(C3134k4 c3134k4) {
        this.f10172x1.mo14692k4(c3134k4);
        if ((C3623k4.m14763k4(c3134k4) & 65535) == 71) {
            C3618ix c3618ix = new C3618ix(this.f10168k4);
            this.f10169kk = c3618ix;
            c3618ix.mo14692k4(c3134k4);
        }
        this.f10171to.mo14692k4(c3134k4);
        this.f10163du.mo14692k4(c3134k4);
        this.f10166h4.mo14692k4(c3134k4);
        this.f10170m9.mo14692k4(c3134k4);
        this.f10164dy.mo14692k4(c3134k4);
        this.f10161c5.mo14692k4(c3134k4);
        if ((C3623k4.m14763k4(c3134k4) & 65535) == 37) {
            C3654wl c3654wl = new C3654wl();
            this.f10167jd = c3654wl;
            c3654wl.mo14692k4(c3134k4);
        }
        if ((C3623k4.m14763k4(c3134k4) & 65535) == 40) {
            C3649uz c3649uz = new C3649uz();
            this.f10162ck = c3649uz;
            c3649uz.mo14692k4(c3134k4);
        }
        int iM13382u4 = c3134k4.m13382u4();
        this.f10165fa = iM13382u4;
        if ((iM13382u4 & 65535) != 43) {
            throw new InvalidOperationException();
        }
        c3134k4.m13384uz();
    }

    @Override // com.aspose.slides.internal.p104ec.AbstractC3629m4
    /* JADX INFO: renamed from: k4 */
    public void mo14697k4(C3149x1 c3149x1) {
        this.f10172x1.mo14697k4(c3149x1);
        C3618ix c3618ix = this.f10169kk;
        if (c3618ix != null) {
            c3618ix.mo14697k4(c3149x1);
        }
        this.f10171to.mo14697k4(c3149x1);
        this.f10163du.mo14697k4(c3149x1);
        this.f10166h4.mo14697k4(c3149x1);
        this.f10170m9.mo14697k4(c3149x1);
        this.f10164dy.mo14697k4(c3149x1);
        this.f10161c5.mo14697k4(c3149x1);
        C3654wl c3654wl = this.f10167jd;
        if (c3654wl != null) {
            c3654wl.mo14697k4(c3149x1);
        }
        C3649uz c3649uz = this.f10162ck;
        if (c3649uz != null) {
            c3649uz.mo14697k4(c3149x1);
        }
        c3149x1.m13446k4(43);
        c3149x1.m13447k4(0L);
    }
}
