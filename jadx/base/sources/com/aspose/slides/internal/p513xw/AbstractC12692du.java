package com.aspose.slides.internal.p513xw;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.OooO0O0;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.internal.p034b3.C1584du;
import com.aspose.slides.internal.p034b3.C1587h4;
import com.aspose.slides.internal.p034b3.C1595ne;
import com.aspose.slides.internal.p034b3.InterfaceC1599u4;
import com.aspose.slides.internal.p057c6.InterfaceC1986to;
import com.aspose.slides.internal.p406ss.AbstractC10334k4;
import com.aspose.slides.internal.p409sv.C10765ar;
import com.aspose.slides.internal.p409sv.C10771dq;

/* JADX INFO: renamed from: com.aspose.slides.internal.xw.du */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC12692du extends AbstractC12727to implements InterfaceC12740wy {

    /* JADX INFO: renamed from: c5 */
    protected C1584du f42219c5;

    /* JADX INFO: renamed from: ck */
    protected AbstractC10334k4 f42220ck;

    /* JADX INFO: renamed from: fa */
    protected C12736vj f42221fa;

    /* JADX INFO: renamed from: jd */
    protected C1595ne f42222jd;

    /* JADX INFO: renamed from: up */
    protected int f42223up;

    /* JADX INFO: renamed from: yj */
    protected int f42224yj;

    public AbstractC12692du(C1584du c1584du, AbstractC10334k4 abstractC10334k4) {
        super(abstractC10334k4);
        this.f42223up = 0;
        this.f42224yj = 0;
        this.f42219c5 = c1584du;
        this.f42222jd = c1584du.m8550du();
        this.f42220ck = abstractC10334k4;
    }

    @Override // com.aspose.slides.internal.p513xw.AbstractC12727to
    /* JADX INFO: renamed from: ar */
    public C12736vj mo58913ar() {
        return this.f42221fa;
    }

    /* JADX INFO: renamed from: b3 */
    public final int m58914b3() {
        return this.f42223up;
    }

    /* JADX INFO: renamed from: du */
    public final void m58915du(String str) {
        this.f42222jd.m8613x1(str);
    }

    /* JADX INFO: renamed from: k4 */
    public final C10771dq m58916k4(C10771dq c10771dq) {
        int iM8572k4;
        C1587h4 c1587h4M8557kk = this.f42219c5.m8557kk();
        String strM52343ts = c10771dq.m52343ts();
        int iM52215e0 = c10771dq.m52215e0();
        int iM52214bz = c10771dq.m52214bz();
        C10765ar c10765arM59342k4 = m59235um().m59342k4(strM52343ts, iM52215e0);
        if (c10765arM59342k4 == null && iM52214bz != 104) {
            boolean z = iM52214bz == 34;
            int iM8574kk = c1587h4M8557kk.m8574kk();
            while (true) {
                iM8572k4 = c1587h4M8557kk.m8572k4(iM8574kk) - 1;
                if (iM8572k4 >= 0 || !z || iM8574kk <= 1) {
                    break;
                }
                iM8574kk--;
            }
            while (iM8572k4 >= 0) {
                c10765arM59342k4 = c1587h4M8557kk.m8573k4(iM8574kk, iM8572k4).m59342k4(strM52343ts, 74);
                if (c10765arM59342k4 != null) {
                    break;
                }
                iM8572k4--;
                if (iM8572k4 < 0 && z && iM8574kk > 1) {
                    iM8574kk--;
                    iM8572k4 = c1587h4M8557kk.m8572k4(iM8574kk) - 1;
                }
            }
        }
        if (c10765arM59342k4 == null) {
            return null;
        }
        c10771dq.m52344x1(c10765arM59342k4);
        return c10771dq;
    }

    /* JADX INFO: renamed from: k4 */
    public abstract C12736vj mo58917k4(int i, boolean z);

    /* JADX INFO: renamed from: kk */
    public final void m58922kk(String str) {
        if (str == null || str.length() <= 0) {
            return;
        }
        this.f42222jd.m8610k4(str, this.f42221fa.m59332x1());
    }

    @Override // com.aspose.slides.internal.p513xw.AbstractC12727to, com.aspose.slides.internal.p513xw.AbstractC12707k4, com.aspose.slides.internal.p513xw.InterfaceC12711lr
    /* JADX INFO: renamed from: ks */
    public void mo49027ks() {
        throw new InvalidOperationException();
    }

    /* JADX INFO: renamed from: to */
    public C12736vj mo58923to(boolean z) {
        if (this.f42221fa != null) {
            mo58925wy();
        }
        int i = this.f42223up + 1;
        this.f42223up = i;
        this.f42221fa = mo58917k4(i, z);
        m58922kk(this.f42220ck.mo14126yj().mo14334yd());
        m58922kk(this.f42220ck.mo14334yd());
        return this.f42221fa;
    }

    /* JADX INFO: renamed from: wy */
    public void mo58925wy() {
        this.f42222jd.m8607k4(this.f42221fa.m59332x1());
        this.f42219c5.m8557kk().mo8489k4(this.f42221fa.m59332x1());
        this.f42221fa = null;
    }

    /* JADX INFO: renamed from: x1 */
    public final C12737w6 m58926x1(String str) {
        List<C12737w6> listM8612to = this.f42222jd.m8612to(str);
        if (listM8612to == null || listM8612to.size() <= 0) {
            return null;
        }
        return (C12737w6) OooO0O0.OooO00o(listM8612to, 1);
    }

    @Override // com.aspose.slides.internal.p513xw.AbstractC12727to, com.aspose.slides.internal.p513xw.InterfaceC12711lr
    /* JADX INFO: renamed from: x6 */
    public void mo49031x6() {
        int iM50360e0 = this.f42220ck.m50360e0();
        this.f42224yj = iM50360e0;
        this.f42223up = iM50360e0 - 1;
    }

    /* JADX INFO: renamed from: yd */
    public final InterfaceC12746yd m58927yd() {
        return this.f42219c5.m8559to();
    }

    /* JADX INFO: renamed from: k4 */
    public final C12737w6 m58918k4(String str) {
        List<C12737w6> listM8612to = this.f42222jd.m8612to(str);
        if (listM8612to == null || listM8612to.size() <= 0) {
            return null;
        }
        return listM8612to.get_Item(0);
    }

    /* JADX INFO: renamed from: to */
    public final boolean m58924to(String str) {
        if (this.f42222jd.m8611kk(str)) {
            return true;
        }
        this.f42222jd.m8608k4(str);
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0037  */
    @Override // com.aspose.slides.internal.p513xw.InterfaceC12740wy
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void mo58919k4(InterfaceC1986to interfaceC1986to) {
        int iM50358bz = this.f42220ck.m50358bz();
        if (interfaceC1986to != null && iM50358bz == 9) {
            if (interfaceC1986to.m10115du() != 0) {
                int iM10115du = interfaceC1986to.m10115du();
                iM50358bz = iM10115du == 11 ? 40 : iM10115du == 10 ? 41 : 88;
            } else {
                int iMo9884to = interfaceC1986to.mo9884to();
                if (iMo9884to <= 0) {
                    iMo9884to = 1;
                }
                if (iMo9884to % 2 == 0) {
                }
            }
        }
        if (iM50358bz != 43 ? !(iM50358bz != 99 ? iM50358bz != 40 ? iM50358bz != 41 || this.f42223up % 2 != 0 : this.f42223up % 2 == 0 : ((this.f42223up - this.f42224yj) + 1) % 2 != 0) : ((this.f42223up - this.f42224yj) + 1) % 2 != 0) {
            this.f42221fa = mo58923to(true);
        }
        if (this.f42221fa != null) {
            mo58925wy();
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m58920k4(C12736vj c12736vj) {
        this.f42221fa = c12736vj;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m58921k4(String str, InterfaceC1599u4 interfaceC1599u4) {
        this.f42221fa.m59332x1().m59348k4(str, interfaceC1599u4);
        this.f42222jd.m8609k4(str, (InterfaceC1599u4) this.f42221fa.m59332x1());
    }
}
