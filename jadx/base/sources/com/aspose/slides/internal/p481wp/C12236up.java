package com.aspose.slides.internal.p481wp;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p048bv.InterfaceC1861h4;
import com.aspose.slides.internal.p097e0.AbstractC3511c5;
import com.aspose.slides.internal.p150gi.C4265c5;
import com.aspose.slides.internal.p294n9.C6765kp;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p371qw.C9951dy;
import com.aspose.slides.internal.p513xw.C12691dq;
import com.aspose.slides.internal.p513xw.C12715ne;
import com.aspose.slides.p559ms.System.C14116yg;

/* JADX INFO: renamed from: com.aspose.slides.internal.wp.up */
/* JADX INFO: loaded from: classes5.dex */
public class C12236up extends C12220dy {

    /* JADX INFO: renamed from: c5 */
    private int f40737c5;

    /* JADX INFO: renamed from: ck */
    private List<C12220dy[]> f40738ck;

    /* JADX INFO: renamed from: dy */
    private List<InterfaceC1861h4> f40739dy;

    /* JADX INFO: renamed from: fa */
    private int f40740fa;

    /* JADX INFO: renamed from: jd */
    private int f40741jd;

    /* JADX INFO: renamed from: ks */
    private C12691dq f40742ks;

    /* JADX INFO: renamed from: m9 */
    private C9951dy f40743m9;

    /* JADX INFO: renamed from: ne */
    private int f40744ne;

    /* JADX INFO: renamed from: rv */
    private C12691dq f40745rv;

    /* JADX INFO: renamed from: up */
    private boolean f40746up;

    /* JADX INFO: renamed from: x6 */
    private int f40747x6;

    /* JADX INFO: renamed from: yj */
    private int f40748yj;

    public C12236up(C12234u4 c12234u4, int i) {
        super(c12234u4, 0, 0);
        this.f40740fa = -1;
        C12691dq c12691dq = C12691dq.f42215k4;
        this.f40742ks = c12691dq;
        this.f40745rv = c12691dq;
        this.f40747x6 = 9;
        this.f40744ne = 9;
        this.f40741jd = i;
        this.f40746up = c12234u4.mo57086e0().m57102zj();
        this.f40748yj = c12234u4.mo57086e0().m57081ai().m17274jd().mo9877dy().mo9884to() / 2;
    }

    /* JADX INFO: renamed from: ar */
    public final C12691dq m57121ar() {
        return this.f40742ks;
    }

    /* JADX INFO: renamed from: bv */
    public final int m57122bv() {
        return this.f40747x6;
    }

    /* JADX INFO: renamed from: du */
    public final int m57123du(int i) {
        return m57142x1(m57034h4().m57117sv() - 1, i);
    }

    /* JADX INFO: renamed from: dy */
    public final void m57124dy(int i) {
        this.f40744ne = i;
    }

    /* JADX INFO: renamed from: h4 */
    public final void m57125h4(int i) {
        this.f40737c5 = i;
    }

    /* JADX INFO: renamed from: ix */
    public final int m57126ix() {
        return this.f40737c5;
    }

    /* JADX INFO: renamed from: k4 */
    public final int m57127k4(int i, int i2) {
        int iM17159kk;
        if (!this.f40746up) {
            int iM67483k4 = 0;
            for (C12220dy c12220dy : this.f40738ck.get_Item(i)) {
                iM67483k4 = C14116yg.m67483k4(iM67483k4, c12220dy.m57036k4(i2).m17172to());
            }
            return iM67483k4 / 2;
        }
        if (m57034h4() == null) {
            return 0;
        }
        C4265c5 c4265c5Mo57067vj = m57034h4().mo57067vj();
        if (i2 == 0 || i2 == 1) {
            iM17159kk = c4265c5Mo57067vj.m17159kk(false);
        } else {
            if (i2 != 2 || c4265c5Mo57067vj.m17155k4(0).m17171kk().mo17183jd()) {
                return 0;
            }
            iM17159kk = c4265c5Mo57067vj.m17159kk(true);
        }
        return iM17159kk + this.f40748yj;
    }

    @Override // com.aspose.slides.internal.p481wp.C12220dy
    /* JADX INFO: renamed from: kk */
    public boolean mo57045kk() {
        return true;
    }

    /* JADX INFO: renamed from: ks */
    public final List<InterfaceC1861h4> m57131ks() {
        return this.f40739dy;
    }

    /* JADX INFO: renamed from: m9 */
    public final void m57132m9(int i) {
        this.f40747x6 = i;
    }

    /* JADX INFO: renamed from: ne */
    public final List<C12220dy[]> m57133ne() {
        return this.f40738ck;
    }

    /* JADX INFO: renamed from: qq */
    public final void m57134qq() {
        this.f40743m9 = new C9951dy(this.f40652k4, this);
    }

    /* JADX INFO: renamed from: rv */
    public final int m57135rv() {
        return m57123du(0) + m57127k4(0, 0);
    }

    @Override // com.aspose.slides.internal.p481wp.C12220dy
    public String toString() {
        C6765kp c6765kp = new C6765kp(super.toString());
        c6765kp.m26792k4(" rowIndex=").m26805kk(this.f40737c5);
        c6765kp.m26792k4(" colIndex=").m26805kk(this.f40741jd);
        return c6765kp.toString();
    }

    /* JADX INFO: renamed from: u4 */
    public final int m57136u4() {
        return this.f40741jd;
    }

    /* JADX INFO: renamed from: um */
    public final C12691dq m57137um() {
        return this.f40745rv;
    }

    /* JADX INFO: renamed from: up */
    public final AbstractC12228lr m57138up() {
        AbstractC3511c5 abstractC3511c5M14115s_ = this.f40652k4.m14115s_();
        if (C7019kk.m27469x1(abstractC3511c5M14115s_, C12243yd.class)) {
            abstractC3511c5M14115s_ = abstractC3511c5M14115s_.m14115s_();
        }
        return (AbstractC12228lr) abstractC3511c5M14115s_;
    }

    /* JADX INFO: renamed from: uz */
    public final int[] m57139uz() {
        int[] iArr = new int[2];
        if (m57034h4() != null) {
            if (m57034h4().mo57086e0().m57102zj()) {
                iArr[0] = m57034h4().mo57067vj().m17153k4(false);
                iArr[1] = m57034h4().mo57067vj().m17165x1(false);
                return iArr;
            }
            for (int i = 0; i < this.f40738ck.size(); i++) {
                C12220dy[] c12220dyArr = this.f40738ck.get_Item(i);
                iArr[0] = C14116yg.m67483k4(iArr[0], c12220dyArr[0].f40655to.m57056x1().m17172to());
                iArr[1] = C14116yg.m67483k4(iArr[1], c12220dyArr[c12220dyArr.length - 1].f40648du.m57056x1().m17172to());
            }
        }
        return iArr;
    }

    /* JADX INFO: renamed from: v4 */
    public final int m57140v4() {
        return this.f40744ne;
    }

    /* JADX INFO: renamed from: wl */
    public final boolean m57141wl() {
        return m57034h4().m57111g8() > 1 || m57034h4().m57117sv() > 1;
    }

    /* JADX INFO: renamed from: x1 */
    public final int m57142x1(int i, int i2) {
        int iM17161to;
        if (!this.f40746up) {
            int iM67483k4 = 0;
            for (C12220dy c12220dy : this.f40738ck.get_Item(i)) {
                iM67483k4 = C14116yg.m67483k4(iM67483k4, c12220dy.m57050x1(i2).m17172to());
            }
            return iM67483k4 / 2;
        }
        if (m57034h4() == null) {
            return 0;
        }
        C4265c5 c4265c5Mo57067vj = m57034h4().mo57067vj();
        if (i2 == 0 || i2 == 1) {
            iM17161to = c4265c5Mo57067vj.m17161to(false);
        } else {
            if (i2 != 2 || c4265c5Mo57067vj.m17155k4(1).m17171kk().mo17183jd()) {
                return 0;
            }
            iM17161to = c4265c5Mo57067vj.m17161to(true);
        }
        return iM17161to + this.f40748yj;
    }

    /* JADX INFO: renamed from: x6 */
    public final int m57144x6() {
        int iM59059k4 = C12715ne.m59059k4(this.f40739dy);
        this.f40740fa = iM59059k4;
        return iM59059k4;
    }

    /* JADX INFO: renamed from: yj */
    public final C9951dy m57145yj() {
        return this.f40743m9;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m57128k4(List<InterfaceC1861h4> list) {
        this.f40739dy = list;
    }

    @Override // com.aspose.slides.internal.p481wp.C12220dy
    /* JADX INFO: renamed from: x1 */
    public C12236up mo57051x1() {
        return this;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m57129k4(C12691dq c12691dq) {
        this.f40742ks = c12691dq;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m57143x1(C12691dq c12691dq) {
        this.f40745rv = c12691dq;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m57130k4(C12220dy[] c12220dyArr) {
        if (this.f40738ck == null) {
            this.f40738ck = new List<>();
        }
        this.f40738ck.addItem(c12220dyArr);
    }
}
