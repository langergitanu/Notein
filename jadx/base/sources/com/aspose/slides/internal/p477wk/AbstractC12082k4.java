package com.aspose.slides.internal.p477wk;

import com.aspose.slides.internal.p016a8.C1307to;
import com.aspose.slides.internal.p016a8.C1308x1;
import com.aspose.slides.internal.p066cl.InterfaceC2623jd;
import com.aspose.slides.internal.p066cl.InterfaceC2624k4;
import com.aspose.slides.internal.p066cl.InterfaceC2625kk;
import com.aspose.slides.internal.p066cl.InterfaceC2627to;
import com.aspose.slides.internal.p129fe.C3983k4;
import com.aspose.slides.internal.p475wh.AbstractC12002ck;
import com.aspose.slides.internal.p475wh.C12009k4;

/* JADX INFO: renamed from: com.aspose.slides.internal.wk.k4 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC12082k4 {

    /* JADX INFO: renamed from: du */
    protected int f40616du;

    /* JADX INFO: renamed from: dy */
    protected int f40617dy;

    /* JADX INFO: renamed from: h4 */
    protected int f40618h4;

    /* JADX INFO: renamed from: k4 */
    protected C12009k4 f40619k4;

    /* JADX INFO: renamed from: kk */
    protected int f40620kk;

    /* JADX INFO: renamed from: m9 */
    protected int f40621m9;

    /* JADX INFO: renamed from: to */
    protected int f40622to;

    /* JADX INFO: renamed from: x1 */
    protected C12083kk f40623x1;

    public AbstractC12082k4(C12009k4 c12009k4, C12083kk c12083kk) {
        this.f40619k4 = c12009k4;
        this.f40623x1 = c12083kk;
        this.f40616du = c12083kk.m56957k4().m56669jd();
        this.f40618h4 = c12083kk.m56957k4().m56664ck();
        this.f40621m9 = c12083kk.m56957k4().m56663c5();
        this.f40617dy = c12083kk.m56957k4().m56683x1();
        if (m56943k4(m56951kk(), m56944c5(), this.f40616du)) {
            this.f40616du = 0;
            this.f40621m9 = this.f40619k4.mo15760yj();
        }
        this.f40622to = C3983k4.m15713k4(this.f40621m9, m56948jd());
        this.f40620kk = C3983k4.m15714k4(this.f40621m9, m56948jd(), this.f40622to);
    }

    /* JADX INFO: renamed from: c5 */
    public int m56944c5() {
        return this.f40623x1.m56958kk();
    }

    /* JADX INFO: renamed from: du */
    public InterfaceC2623jd m56945du() {
        return m56954to().mo11977fa();
    }

    /* JADX INFO: renamed from: dy */
    public int m56946dy() {
        return this.f40623x1.m56959x1();
    }

    /* JADX INFO: renamed from: h4 */
    public InterfaceC2625kk m56947h4() {
        return m56954to().mo11977fa().mo11972x1();
    }

    /* JADX INFO: renamed from: jd */
    public int m56948jd() {
        return AbstractC12002ck.m56311k4(m56944c5());
    }

    /* JADX INFO: renamed from: k4 */
    public Object m56949k4(InterfaceC2623jd interfaceC2623jd) {
        return interfaceC2623jd.mo11971kk();
    }

    /* JADX INFO: renamed from: kk */
    public int m56951kk() {
        return this.f40619k4.mo15753jd();
    }

    /* JADX INFO: renamed from: m9 */
    public byte[] m56953m9() {
        return ((InterfaceC2627to) m56947h4()).mo11998kk();
    }

    /* JADX INFO: renamed from: to */
    public InterfaceC2624k4 m56954to() {
        return this.f40619k4.m56608x1();
    }

    /* JADX INFO: renamed from: x1 */
    public C1308x1 m56955x1(byte[] bArr) {
        return new C1308x1(this.f40616du, this.f40618h4, this.f40621m9, this.f40617dy, mo56952kk(bArr));
    }

    /* JADX INFO: renamed from: k4 */
    public boolean m56950k4(int i) {
        return (i & 1) != 0;
    }

    /* JADX INFO: renamed from: kk */
    public C1307to mo56952kk(byte[] bArr) {
        return new C1307to(this.f40621m9, this.f40620kk, bArr);
    }

    /* JADX INFO: renamed from: x1 */
    public boolean m56956x1(int i) {
        return (i & 2) != 0;
    }

    /* JADX INFO: renamed from: k4 */
    private boolean m56943k4(int i, int i2, int i3) {
        if (i != i2) {
            return false;
        }
        if (i3 == 0) {
            return true;
        }
        if (i2 == 196865 && i3 % 8 == 0) {
            return true;
        }
        return i2 == 197634 && i3 % 2 == 0;
    }
}
