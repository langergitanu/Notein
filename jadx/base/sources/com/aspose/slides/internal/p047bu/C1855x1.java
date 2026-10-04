package com.aspose.slides.internal.p047bu;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.internal.p086dl.C3180k4;
import com.aspose.slides.internal.p171hq.C4616ca;
import com.aspose.slides.internal.p171hq.C4681zj;
import com.aspose.slides.internal.p251li.AbstractC6068lr;
import com.aspose.slides.internal.p251li.C6045bz;
import com.aspose.slides.internal.p251li.C6062j2;
import com.aspose.slides.internal.p251li.C6075ri;
import com.aspose.slides.internal.p251li.C6076rv;
import com.aspose.slides.internal.p251li.C6077s7;
import com.aspose.slides.internal.p251li.C6080t6;
import com.aspose.slides.internal.p251li.C6085um;
import com.aspose.slides.internal.p251li.C6090vj;
import com.aspose.slides.internal.p251li.C6097xk;
import com.aspose.slides.internal.p251li.C6098xw;
import com.aspose.slides.internal.p251li.C6099yd;
import com.aspose.slides.internal.p251li.C6100yj;
import com.aspose.slides.internal.p298nh.AbstractC6888dy;
import com.aspose.slides.internal.p298nh.AbstractC6897x1;
import com.aspose.slides.internal.p298nh.C6885c5;
import com.aspose.slides.internal.p298nh.C6889fa;
import com.aspose.slides.internal.p298nh.C6895to;
import com.aspose.slides.internal.p298nh.C6896up;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p349q3.C9723vw;
import com.aspose.slides.internal.p349q3.C9743yj;
import com.aspose.slides.internal.p472w8.C11896dy;
import com.aspose.slides.internal.p472w8.C11913yj;
import com.aspose.slides.internal.p475wh.AbstractC12002ck;
import com.aspose.slides.internal.p475wh.AbstractC12008jd;
import com.aspose.slides.internal.p475wh.C12007ix;
import com.aspose.slides.internal.p475wh.C12009k4;
import com.aspose.slides.internal.p475wh.C12014ne;
import com.aspose.slides.internal.p475wh.C12018u4;
import com.aspose.slides.internal.p475wh.C12025x6;
import com.aspose.slides.p559ms.System.C14116yg;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.bu.x1 */
/* JADX INFO: loaded from: classes3.dex */
public class C1855x1 extends AbstractC1852k4 {

    /* JADX INFO: renamed from: du */
    private List<C6045bz> f6703du;

    /* JADX INFO: renamed from: h4 */
    private List<Object> f6704h4;

    /* JADX INFO: renamed from: kk */
    private C1854to f6705kk;

    /* JADX INFO: renamed from: to */
    private C9743yj f6706to;

    /* JADX INFO: renamed from: x1 */
    private AbstractC12008jd f6707x1;

    public C1855x1(C3180k4 c3180k4) {
        super(c3180k4);
        this.f6705kk = new C1854to();
        this.f6706to = null;
        this.f6703du = null;
        this.f6704h4 = new List<>();
        this.f6707x1 = AbstractC12008jd.m56582k4((AbstractC12002ck) new C12009k4(1, 1));
        C9743yj c9743yj = new C9743yj();
        this.f6706to = c9743yj;
        c9743yj.m47885k4(726027589L);
        List<C6045bz> list = new List<>();
        this.f6703du = list;
        this.f6706to.m47886k4(list.toArray(new C6045bz[0]));
        this.f6706to.m47888kk();
        m9684k4(this.f6706to);
    }

    /* JADX INFO: renamed from: dy */
    private void m9671dy() {
        int iM47290dy = (int) this.f6706to.m47290dy();
        List.Enumerator<C6045bz> it = this.f6703du.iterator();
        while (it.hasNext()) {
            try {
                iM47290dy += it.next().mo24441m9();
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        this.f6706to.m47886k4(this.f6703du.toArray(new C6045bz[0]));
        this.f6706to.m47292to(((long) iM47290dy) & 4294967295L);
        C9743yj c9743yj = this.f6706to;
        c9743yj.m47762c5(((int) c9743yj.m47290dy()) + 12);
        m9689k4().m13624up();
    }

    /* JADX INFO: renamed from: h4 */
    private float m9672h4() {
        return 96.0f;
    }

    /* JADX INFO: renamed from: k4 */
    private byte m9673k4(AbstractC6888dy abstractC6888dy, C6885c5 c6885c5) {
        if (c6885c5 != null) {
            abstractC6888dy = new C6895to(C1853kk.m9662k4(abstractC6888dy, c6885c5));
        }
        if (this.f6705kk.m9668k4(abstractC6888dy)) {
            return this.f6705kk.m9670x1(abstractC6888dy);
        }
        byte bM9669kk = this.f6705kk.m9669kk(abstractC6888dy);
        C6097xk c6097xk = new C6097xk();
        c6097xk.m24693k4((byte) 5);
        c6097xk.m24694k4(C1853kk.m9657k4(abstractC6888dy));
        c6097xk.m24700x1(bM9669kk);
        c6097xk.m24446uz();
        m9681k4(c6097xk);
        return bM9669kk;
    }

    /* JADX INFO: renamed from: kk */
    private byte m9686kk(C12018u4 c12018u4) {
        if (this.f6705kk.m9668k4(c12018u4)) {
            return this.f6705kk.m9670x1(c12018u4);
        }
        byte bM9669kk = this.f6705kk.m9669kk(c12018u4);
        C6097xk c6097xk = new C6097xk();
        c6097xk.m24693k4((byte) 4);
        c6097xk.m24694k4(C1853kk.m9652k4(c12018u4));
        c6097xk.m24700x1(bM9669kk);
        c6097xk.m24446uz();
        m9681k4(c6097xk);
        return bM9669kk;
    }

    /* JADX INFO: renamed from: m9 */
    private float m9687m9() {
        return 96.0f;
    }

    @Override // com.aspose.slides.p559ms.System.IDisposable
    public void dispose() {
        m9671dy();
        this.f6706to = null;
        this.f6703du = null;
        this.f6704h4 = null;
        this.f6705kk = null;
    }

    @Override // com.aspose.slides.internal.p298nh.AbstractC6890h4
    /* JADX INFO: renamed from: du */
    public C11913yj mo9688du() {
        return this.f6707x1.mo17577u4();
    }

    @Override // com.aspose.slides.internal.p298nh.AbstractC6890h4
    /* JADX INFO: renamed from: to */
    public int mo9703to() {
        return this.f6707x1.mo17566ks();
    }

    @Override // com.aspose.slides.internal.p298nh.AbstractC6890h4
    /* JADX INFO: renamed from: x1 */
    public C12018u4 mo9704x1() {
        return this.f6707x1.mo17480h4();
    }

    /* JADX INFO: renamed from: k4 */
    private byte m9674k4(C6889fa c6889fa) {
        if (this.f6705kk.m9668k4(c6889fa)) {
            return this.f6705kk.m9670x1(c6889fa);
        }
        byte bM9669kk = this.f6705kk.m9669kk(c6889fa);
        C6097xk c6097xk = new C6097xk();
        c6097xk.m24693k4((byte) 2);
        c6097xk.m24694k4(C1853kk.m9654k4(c6889fa));
        c6097xk.m24700x1(bM9669kk);
        c6097xk.m24446uz();
        m9681k4(c6097xk);
        return bM9669kk;
    }

    @Override // com.aspose.slides.internal.p298nh.AbstractC6890h4
    /* JADX INFO: renamed from: kk */
    public int mo9701kk() {
        return this.f6707x1.mo17477dy();
    }

    @Override // com.aspose.slides.internal.p298nh.AbstractC6890h4
    /* JADX INFO: renamed from: x1 */
    public void mo9705x1(int i) {
        if (this.f6707x1.mo17566ks() != i) {
            this.f6707x1.mo17476du(i);
            C6062j2 c6062j2 = new C6062j2();
            c6062j2.m24533k4((byte) this.f6707x1.mo17566ks());
            c6062j2.m24446uz();
            m9681k4(c6062j2);
        }
    }

    /* JADX INFO: renamed from: k4 */
    private byte m9675k4(C11896dy c11896dy) {
        if (this.f6705kk.m9668k4(c11896dy)) {
            return this.f6705kk.m9670x1(c11896dy);
        }
        byte bM9669kk = this.f6705kk.m9669kk(c11896dy);
        C6097xk c6097xk = new C6097xk();
        c6097xk.m24693k4((byte) 3);
        c6097xk.m24694k4(C1853kk.m9660k4(c11896dy));
        c6097xk.m24700x1(bM9669kk);
        c6097xk.m24446uz();
        m9681k4(c6097xk);
        return bM9669kk;
    }

    @Override // com.aspose.slides.internal.p298nh.AbstractC6890h4
    /* JADX INFO: renamed from: kk */
    public void mo9702kk(int i) {
        if (this.f6707x1.mo17603x6() != i) {
            this.f6707x1.mo17481h4(i);
            C6077s7 c6077s7 = new C6077s7();
            c6077s7.m24615k4((byte) this.f6707x1.mo17603x6());
            c6077s7.m24616k4(this.f6707x1.mo17603x6() == 4 || this.f6707x1.mo17603x6() == 2);
            c6077s7.m24446uz();
            m9681k4(c6077s7);
        }
    }

    @Override // com.aspose.slides.internal.p298nh.AbstractC6890h4
    /* JADX INFO: renamed from: x1 */
    public void mo9706x1(C12018u4 c12018u4) {
        mo9700k4(c12018u4, 0);
    }

    /* JADX INFO: renamed from: k4 */
    private static float m9676k4(float f, int i, int i2) {
        return m9677k4(f, i, i2, 96.0f, 96.0f);
    }

    /* JADX INFO: renamed from: k4 */
    private static float m9677k4(float f, int i, int i2, float f2, float f3) {
        if ((i == 1 || i == 2 || i == 0) && ((i2 == 1 || i2 == 2 || i2 == 0) && C14116yg.m67480k4(f2 - f3) < 0.001d)) {
            return f;
        }
        switch (i) {
            case 0:
            case 1:
            case 2:
                f /= f2;
                break;
            case 3:
                f /= 72.0f;
                break;
            case 4:
                break;
            case 5:
                f /= 300.0f;
                break;
            case 6:
                f /= 25.4f;
                break;
            default:
                throw new ArgumentException("Invalid GraphicsUnit");
        }
        switch (i2) {
            case 0:
            case 2:
                return f * f3;
            case 1:
                return f * f3;
            case 3:
                return f * 72.0f;
            case 4:
                return f;
            case 5:
                return f * 300.0f;
            case 6:
                return f * 25.4f;
            default:
                throw new ArgumentException("Invalid GraphicsUnit");
        }
    }

    /* JADX INFO: renamed from: k4 */
    private int m9678k4(AbstractC6897x1 abstractC6897x1) {
        byte bM9670x1;
        if (C7019kk.m27469x1(abstractC6897x1, C6896up.class)) {
            return ((C6896up) abstractC6897x1).m27024x1().m56506h4();
        }
        if (this.f6705kk.m9668k4(abstractC6897x1)) {
            bM9670x1 = this.f6705kk.m9670x1(abstractC6897x1);
        } else {
            byte bM9669kk = this.f6705kk.m9669kk(abstractC6897x1);
            C6097xk c6097xk = new C6097xk();
            c6097xk.m24693k4((byte) 1);
            c6097xk.m24694k4(C1853kk.m9658k4(abstractC6897x1));
            c6097xk.m24700x1(bM9669kk);
            c6097xk.m24446uz();
            m9681k4(c6097xk);
            bM9670x1 = bM9669kk;
        }
        return bM9670x1 & 255;
    }

    /* JADX INFO: renamed from: k4 */
    private long m9679k4(C6885c5 c6885c5) {
        if (c6885c5 == null) {
            return 4294967295L;
        }
        if (this.f6705kk.m9668k4(c6885c5)) {
            return this.f6705kk.m9670x1(c6885c5) & 255;
        }
        long jM9669kk = this.f6705kk.m9669kk(c6885c5) & 255;
        C6097xk c6097xk = new C6097xk();
        c6097xk.m24693k4((byte) 8);
        c6097xk.m24694k4(C1853kk.m9651k4(c6885c5));
        c6097xk.m24700x1((byte) jM9669kk);
        c6097xk.m24446uz();
        m9681k4(c6097xk);
        return jM9669kk;
    }

    /* JADX INFO: renamed from: k4 */
    public final C3180k4 m9689k4() {
        return (C3180k4) this.f6698k4;
    }

    /* JADX INFO: renamed from: k4 */
    private static C12007ix m9680k4(C12007ix c12007ix, int i, int i2) {
        return new C12007ix(m9676k4(c12007ix.m56557jd(), i, i2), m9676k4(c12007ix.m56551ck(), i, i2), m9676k4(c12007ix.m56550c5(), i, i2), m9676k4(c12007ix.m56575x1(), i, i2));
    }

    /* JADX INFO: renamed from: k4 */
    public final C12007ix m9690k4(C12018u4 c12018u4) {
        if (c12018u4 != null) {
            return c12018u4.m56749k4(this.f6707x1);
        }
        throw new ArgumentNullException("region");
    }

    @Override // com.aspose.slides.internal.p298nh.AbstractC6890h4
    /* JADX INFO: renamed from: k4 */
    public void mo9691k4(int i) {
        if (this.f6707x1.mo17477dy() != i) {
            this.f6707x1.mo17495k4(i);
            C6090vj c6090vj = new C6090vj();
            c6090vj.m24666k4((byte) this.f6707x1.mo17477dy());
            c6090vj.m24446uz();
            m9681k4(c6090vj);
        }
    }

    /* JADX INFO: renamed from: k4 */
    private void m9681k4(C6045bz c6045bz) {
        this.f6703du.addItem(c6045bz);
    }

    @Override // com.aspose.slides.internal.p298nh.AbstractC6890h4
    /* JADX INFO: renamed from: k4 */
    public void mo9692k4(AbstractC6888dy abstractC6888dy, C12014ne c12014ne, float f, float f2, float f3, float f4, int i) {
        mo9693k4(abstractC6888dy, c12014ne.Clone(), f, f2, f3, f4, i, null);
    }

    @Override // com.aspose.slides.internal.p298nh.AbstractC6890h4
    /* JADX INFO: renamed from: k4 */
    public void mo9693k4(AbstractC6888dy abstractC6888dy, C12014ne c12014ne, float f, float f2, float f3, float f4, int i, C6885c5 c6885c5) {
        C12007ix c12007ix = new C12007ix(f, f2, f3, f4);
        m9680k4(c12007ix.Clone(), i, 2).CloneTo(c12007ix);
        C12025x6[] c12025x6ArrM9685k4 = m9685k4(C12007ix.m56544k4(c12014ne).Clone());
        if (i != 1 && i != 2 && i != 0) {
            float fMo13501dy = abstractC6888dy.mo13501dy() / m9672h4();
            float fMo13500c5 = abstractC6888dy.mo13500c5() / m9687m9();
            c12007ix = new C12007ix(c12007ix.m56557jd() * fMo13501dy, c12007ix.m56551ck() * fMo13500c5, c12007ix.m56550c5() * fMo13501dy, c12007ix.m56575x1() * fMo13500c5);
        }
        m9682k4(abstractC6888dy, c12025x6ArrM9685k4, c12007ix.Clone(), c6885c5);
    }

    /* JADX INFO: renamed from: k4 */
    private void m9682k4(AbstractC6888dy abstractC6888dy, C12025x6[] c12025x6Arr, C12007ix c12007ix, C6885c5 c6885c5) {
        if (abstractC6888dy == null) {
            throw new ArgumentNullException("image");
        }
        if (c12025x6Arr == null) {
            throw new ArgumentNullException("destPoints");
        }
        if (c12025x6Arr.length != 3) {
            throw new ArgumentException("The destPoints parameter should specify three points of a parallelogram.");
        }
        C6100yj c6100yj = new C6100yj();
        c6100yj.m24716k4(m9673k4(abstractC6888dy, c6885c5));
        c6100yj.m24719k4(false);
        c6100yj.m24728x1(false);
        c6100yj.m24723kk(false);
        c6100yj.m24717k4(m9679k4(c6885c5));
        c6100yj.m24722kk(2);
        c6100yj.m24718k4(new C4616ca(c12007ix.Clone()));
        c6100yj.m24727x1(3L);
        c6100yj.m24720k4(new C4681zj[]{new C4681zj(c12025x6Arr[0].Clone()), new C4681zj(c12025x6Arr[1].Clone()), new C4681zj(c12025x6Arr[2].Clone())});
        c6100yj.m24446uz();
        m9681k4(c6100yj);
    }

    @Override // com.aspose.slides.internal.p298nh.AbstractC6890h4
    /* JADX INFO: renamed from: k4 */
    public void mo9694k4(C6889fa c6889fa, C11896dy c11896dy) {
        if (c6889fa == null) {
            throw new ArgumentNullException("pen");
        }
        if (c11896dy == null) {
            throw new ArgumentNullException("path");
        }
        if (c11896dy.m55573x1().m55672k4() == null || c11896dy.m55573x1().m55672k4().length == 0) {
            return;
        }
        C6076rv c6076rv = new C6076rv();
        c6076rv.m24611k4(m9674k4(c6889fa) & 255);
        c6076rv.m24610k4(m9675k4(c11896dy));
        c6076rv.m24446uz();
        m9681k4(c6076rv);
    }

    /* JADX INFO: renamed from: k4 */
    private void m9683k4(AbstractC6897x1 abstractC6897x1, AbstractC6068lr abstractC6068lr) {
        abstractC6068lr.m24575k4(C7019kk.m27469x1(abstractC6897x1, C6896up.class));
        abstractC6068lr.m24577to(m9678k4(abstractC6897x1));
        abstractC6068lr.m24446uz();
        m9681k4(abstractC6068lr);
    }

    @Override // com.aspose.slides.internal.p298nh.AbstractC6890h4
    /* JADX INFO: renamed from: k4 */
    public void mo9695k4(AbstractC6897x1 abstractC6897x1, C11896dy c11896dy) {
        if (abstractC6897x1 == null) {
            throw new ArgumentNullException("brush");
        }
        if (c11896dy == null) {
            throw new ArgumentNullException("path");
        }
        if (c11896dy.m55573x1().m55672k4() == null || c11896dy.m55573x1().m55672k4().length == 0) {
            return;
        }
        C6085um c6085um = new C6085um();
        c6085um.m24641k4(m9675k4(c11896dy));
        m9683k4(abstractC6897x1, c6085um);
    }

    @Override // com.aspose.slides.internal.p298nh.AbstractC6890h4
    /* JADX INFO: renamed from: k4 */
    public void mo9696k4(AbstractC6897x1 abstractC6897x1, C12007ix c12007ix) {
        m9697k4(abstractC6897x1, new C12007ix[]{c12007ix});
    }

    /* JADX INFO: renamed from: k4 */
    public void m9697k4(AbstractC6897x1 abstractC6897x1, C12007ix[] c12007ixArr) {
        if (abstractC6897x1 == null) {
            throw new ArgumentNullException("brush");
        }
        if (c12007ixArr == null) {
            throw new ArgumentNullException("rects");
        }
        C6099yd c6099yd = new C6099yd();
        c6099yd.m24706k4(((long) c12007ixArr.length) & 4294967295L);
        C4616ca[] c4616caArr = new C4616ca[c12007ixArr.length];
        for (int i = 0; i < c12007ixArr.length; i++) {
            c4616caArr[i] = new C4616ca(c12007ixArr[i].Clone());
        }
        c6099yd.m24707k4(c4616caArr);
        m9683k4(abstractC6897x1, c6099yd);
    }

    /* JADX INFO: renamed from: k4 */
    private void m9684k4(C9723vw c9723vw) {
        m9689k4().m58364k4().insertItem(m9689k4().m58364k4().size() - 2, c9723vw);
        m9689k4().m13624up();
    }

    @Override // com.aspose.slides.internal.p298nh.AbstractC6890h4
    /* JADX INFO: renamed from: k4 */
    public void mo9698k4(C11913yj c11913yj) {
        this.f6707x1.mo17588x1(c11913yj);
        C6075ri c6075ri = new C6075ri();
        c6075ri.m24607k4(C1853kk.m9661k4(this.f6707x1.mo17577u4()));
        c6075ri.m24446uz();
        m9681k4(c6075ri);
    }

    @Override // com.aspose.slides.internal.p298nh.AbstractC6890h4
    /* JADX INFO: renamed from: k4 */
    public void mo9699k4(C12007ix c12007ix, int i) {
        this.f6707x1.mo17519k4(c12007ix.Clone(), i);
        C6080t6 c6080t6 = new C6080t6();
        c6080t6.m24625k4(new C4616ca(c12007ix.Clone()));
        c6080t6.m24629x1((byte) i);
        c6080t6.m24446uz();
        m9681k4(c6080t6);
    }

    @Override // com.aspose.slides.internal.p298nh.AbstractC6890h4
    /* JADX INFO: renamed from: k4 */
    public void mo9700k4(C12018u4 c12018u4, int i) {
        if (c12018u4 == null) {
            throw new ArgumentNullException("region");
        }
        this.f6707x1.mo17523k4(c12018u4, i);
        C6098xw c6098xw = new C6098xw();
        c6098xw.m24701du(m9686kk(c12018u4));
        c6098xw.m24704x1((byte) i);
        c6098xw.m24446uz();
        m9681k4(c6098xw);
    }

    /* JADX INFO: renamed from: k4 */
    private C12025x6[] m9685k4(C12007ix c12007ix) {
        return new C12025x6[]{new C12025x6(c12007ix.m56557jd(), c12007ix.m56551ck()), new C12025x6(c12007ix.m56550c5() + c12007ix.m56557jd(), c12007ix.m56551ck()), new C12025x6(c12007ix.m56557jd(), c12007ix.m56575x1() + c12007ix.m56551ck())};
    }
}
