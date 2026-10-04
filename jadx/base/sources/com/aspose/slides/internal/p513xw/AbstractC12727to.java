package com.aspose.slides.internal.p513xw;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.internal.p034b3.C1594m9;
import com.aspose.slides.internal.p034b3.C1606x1;
import com.aspose.slides.internal.p048bv.InterfaceC1861h4;
import com.aspose.slides.internal.p048bv.InterfaceC1866m9;
import com.aspose.slides.internal.p048bv.InterfaceC1870up;
import com.aspose.slides.internal.p097e0.AbstractC3511c5;
import com.aspose.slides.internal.p097e0.AbstractC3524ks;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p409sv.C10765ar;
import com.aspose.slides.internal.p409sv.C10771dq;
import com.aspose.slides.internal.p462vj.C11663ks;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.xw.to */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC12727to extends AbstractC12707k4 {

    /* JADX INFO: renamed from: c5 */
    private Dictionary<String, C10765ar> f42373c5;

    /* JADX INFO: renamed from: ck */
    private int f42374ck;

    /* JADX INFO: renamed from: du */
    protected List<InterfaceC12711lr> f42375du;

    /* JADX INFO: renamed from: dy */
    protected InterfaceC1866m9<InterfaceC12711lr> f42376dy;

    /* JADX INFO: renamed from: fa */
    private int f42377fa;

    /* JADX INFO: renamed from: h4 */
    protected InterfaceC1866m9<AbstractC3511c5> f42378h4;

    /* JADX INFO: renamed from: jd */
    private boolean f42379jd;

    /* JADX INFO: renamed from: m9 */
    public InterfaceC12711lr f42380m9;

    /* JADX INFO: renamed from: to */
    protected InterfaceC12711lr f42381to;

    public AbstractC12727to() {
        this.f42374ck = -1;
        this.f42377fa = Integer.MAX_VALUE;
    }

    /* JADX INFO: renamed from: h4 */
    private static void m59222h4(C12717os c12717os) {
        if (c12717os == null || c12717os.m59073du() < 0) {
            throw new ArgumentException("Only non-null Positions with an index can be checked");
        }
    }

    /* JADX INFO: renamed from: a_ */
    public void m59223a_(List<InterfaceC12711lr> list) {
        if (list == null || list.size() == 0) {
            return;
        }
        List.Enumerator<InterfaceC12711lr> it = list.iterator();
        while (it.hasNext()) {
            try {
                mo54975kk(it.next());
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
    }

    /* JADX INFO: renamed from: ar */
    public C12736vj mo58913ar() {
        return mo54979qq().mo58913ar();
    }

    @Override // com.aspose.slides.internal.p513xw.InterfaceC12711lr
    /* JADX INFO: renamed from: bv */
    public List<InterfaceC12711lr> mo54971bv() {
        if (this.f42375du == null) {
            this.f42375du = new List<>(10);
        }
        return this.f42375du;
    }

    /* JADX INFO: renamed from: ix */
    public final boolean m59224ix() {
        return this.f42376dy.mo9764x1();
    }

    /* JADX INFO: renamed from: k4 */
    public final List<InterfaceC12711lr> m59225k4(int i) {
        if (this.f42378h4 == null) {
            return null;
        }
        List<InterfaceC12711lr> list = new List<>(i);
        while (this.f42378h4.mo9764x1() && list.size() < i) {
            AbstractC3511c5 abstractC3511c5Mo9760kk = this.f42378h4.mo9760kk();
            if (C7019kk.m27469x1(abstractC3511c5Mo9760kk, AbstractC3511c5.class)) {
                AbstractC3511c5 abstractC3511c5M58916k4 = abstractC3511c5Mo9760kk;
                if (C7019kk.m27469x1(abstractC3511c5M58916k4, C10771dq.class)) {
                    abstractC3511c5M58916k4 = mo54979qq().m58916k4((C10771dq) abstractC3511c5M58916k4);
                }
                if (abstractC3511c5M58916k4 != null) {
                    mo54979qq().m58927yd().mo59024k4(abstractC3511c5M58916k4, list);
                    List.Enumerator<InterfaceC12711lr> it = list.iterator();
                    while (it.hasNext()) {
                        try {
                            C11663ks c11663ks = (C11663ks) C7019kk.m27452k4(it.next(), C11663ks.class);
                            if (c11663ks != null) {
                                c11663ks.f39361jd = this;
                            }
                        } catch (Throwable th) {
                            if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                                it.dispose();
                            }
                            throw th;
                        }
                    }
                    if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                        it.dispose();
                    }
                } else {
                    continue;
                }
            }
        }
        return list;
    }

    /* JADX INFO: renamed from: kk */
    public final void m59228kk(C1594m9 c1594m9) {
        m59226k4(c1594m9);
        m59237x1(c1594m9);
    }

    @Override // com.aspose.slides.internal.p513xw.AbstractC12707k4, com.aspose.slides.internal.p513xw.InterfaceC12711lr
    /* JADX INFO: renamed from: ks */
    public void mo49027ks() {
        this.f42379jd = false;
        this.f42380m9 = null;
        this.f42376dy = new C12739wp(this);
        List.Enumerator<InterfaceC12711lr> it = mo54971bv().iterator();
        while (it.hasNext()) {
            try {
                it.next().mo49027ks();
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        AbstractC3524ks abstractC3524ks = this.f42282kk;
        if (abstractC3524ks != null) {
            this.f42373c5 = abstractC3524ks.m14330v4();
        }
        this.f42374ck = -1;
    }

    /* JADX INFO: renamed from: lr */
    public final void m59231lr() {
        if (this.f42282kk != null) {
            mo54979qq().m58915du(this.f42282kk.mo14334yd());
        }
    }

    @Override // com.aspose.slides.internal.p513xw.AbstractC12707k4, com.aspose.slides.internal.p513xw.InterfaceC12711lr
    /* JADX INFO: renamed from: m9 */
    public InterfaceC12711lr mo54977m9() {
        return this.f42381to;
    }

    /* JADX INFO: renamed from: ne */
    public final InterfaceC12711lr m59232ne() {
        InterfaceC12711lr interfaceC12711lr = this.f42380m9;
        if (interfaceC12711lr != null && !interfaceC12711lr.mo54980wl()) {
            return this.f42380m9;
        }
        if (!this.f42376dy.mo9764x1()) {
            return null;
        }
        InterfaceC12711lr interfaceC12711lrMo9760kk = this.f42376dy.mo9760kk();
        this.f42380m9 = interfaceC12711lrMo9760kk;
        interfaceC12711lrMo9760kk.mo49031x6();
        return this.f42380m9;
    }

    @Override // com.aspose.slides.internal.p513xw.InterfaceC12711lr
    /* JADX INFO: renamed from: qq */
    public C12703j2 mo54979qq() {
        return this.f42381to.mo54979qq();
    }

    /* JADX INFO: renamed from: to */
    public final void m59233to(C12717os c12717os) {
        if (c12717os != null && c12717os.m59077to() == this && m59230kk(c12717os)) {
            m59231lr();
            this.f42375du = null;
            this.f42380m9 = null;
            this.f42376dy = null;
            this.f42373c5 = null;
            InterfaceC12711lr interfaceC12711lrMo54977m9 = this.f42381to;
            while (!C7019kk.m27469x1(interfaceC12711lrMo54977m9, C12719qq.class) && !C7019kk.m27469x1(interfaceC12711lrMo54977m9, C12703j2.class)) {
                interfaceC12711lrMo54977m9 = interfaceC12711lrMo54977m9.mo54977m9();
            }
            if (C7019kk.m27469x1(interfaceC12711lrMo54977m9, C12719qq.class)) {
                this.f42282kk.m14326lr();
                this.f42378h4 = null;
            }
        }
    }

    public String toString() {
        String string = super.toString();
        AbstractC3524ks abstractC3524ks = this.f42282kk;
        return C14113y2.m67408k4(string, abstractC3524ks != null ? C14113y2.m67408k4("{fobj = ", abstractC3524ks.toString(), "}") : C14113y2.f47374k4);
    }

    /* JADX INFO: renamed from: u4 */
    public final InterfaceC12711lr m59234u4() {
        return this.f42376dy.mo9760kk();
    }

    /* JADX INFO: renamed from: um */
    public final C12737w6 m59235um() {
        return mo54979qq().mo58913ar().m59332x1();
    }

    /* JADX INFO: renamed from: uz */
    public final InterfaceC12711lr m59236uz() {
        return this.f42376dy.mo9756du();
    }

    /* JADX INFO: renamed from: v4 */
    public void mo54817v4() {
        if (this.f42282kk != null) {
            mo54979qq().m58922kk(this.f42282kk.mo14334yd());
        }
    }

    @Override // com.aspose.slides.internal.p513xw.InterfaceC12711lr
    /* JADX INFO: renamed from: wl */
    public boolean mo54980wl() {
        return this.f42379jd;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m59237x1(C1594m9 c1594m9) {
        if (this.f42282kk.m14333xk()) {
            c1594m9.m8603k4(this.f42282kk.m14319dq());
        }
    }

    @Override // com.aspose.slides.internal.p513xw.InterfaceC12711lr
    /* JADX INFO: renamed from: x6 */
    public void mo49031x6() {
    }

    public AbstractC12727to(AbstractC3524ks abstractC3524ks) {
        super(abstractC3524ks);
        this.f42374ck = -1;
        this.f42377fa = Integer.MAX_VALUE;
        if (abstractC3524ks == null) {
            throw new InvalidOperationException("Null formatting object found.");
        }
        this.f42373c5 = abstractC3524ks.m14330v4();
        this.f42378h4 = abstractC3524ks.mo14080ck();
        this.f42376dy = new C12739wp(this);
    }

    @Override // com.aspose.slides.internal.p513xw.InterfaceC12711lr
    /* JADX INFO: renamed from: k4 */
    public List<InterfaceC1861h4> mo54772k4(List<InterfaceC1861h4> list, int i) {
        return null;
    }

    @Override // com.aspose.slides.internal.p513xw.InterfaceC12711lr
    /* JADX INFO: renamed from: kk */
    public void mo54975kk(InterfaceC12711lr interfaceC12711lr) {
        if (interfaceC12711lr == null) {
            return;
        }
        interfaceC12711lr.mo54974k4(this);
        if (this.f42375du == null) {
            this.f42375du = new List<>(10);
        }
        this.f42375du.addItem(interfaceC12711lr);
    }

    @Override // com.aspose.slides.internal.p513xw.InterfaceC12711lr
    /* JADX INFO: renamed from: x1 */
    public void mo48960x1(C1606x1 c1606x1) {
    }

    @Override // com.aspose.slides.internal.p513xw.InterfaceC12711lr
    /* JADX INFO: renamed from: k4 */
    public List<InterfaceC1861h4> mo48950k4(C12724ss c12724ss, int i) {
        m59229kk(true);
        return null;
    }

    /* JADX INFO: renamed from: kk */
    public void m59229kk(boolean z) {
        this.f42379jd = z;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m59238x1(InterfaceC12711lr interfaceC12711lr) {
        InterfaceC12711lr interfaceC12711lrMo9760kk;
        this.f42380m9 = interfaceC12711lr;
        this.f42376dy = new C12739wp(this);
        do {
            interfaceC12711lrMo9760kk = this.f42376dy.mo9760kk();
            this.f42380m9 = interfaceC12711lrMo9760kk;
        } while (interfaceC12711lrMo9760kk != interfaceC12711lr);
    }

    @Override // com.aspose.slides.internal.p513xw.InterfaceC12711lr
    /* JADX INFO: renamed from: k4 */
    public C1606x1 mo48951k4(C1606x1 c1606x1) {
        return null;
    }

    /* JADX INFO: renamed from: kk */
    public final boolean m59230kk(C12717os c12717os) {
        m59222h4(c12717os);
        return c12717os.m59073du() == this.f42374ck && mo54980wl();
    }

    @Override // com.aspose.slides.internal.p513xw.InterfaceC12711lr
    /* JADX INFO: renamed from: x1 */
    public boolean mo54981x1(int i) {
        m59223a_(m59225k4((i + 1) - this.f42375du.size()));
        return i < this.f42375du.size();
    }

    @Override // com.aspose.slides.internal.p513xw.InterfaceC12711lr
    /* JADX INFO: renamed from: k4 */
    public C12717os mo54973k4(C12717os c12717os) {
        if (c12717os.m59073du() >= 0) {
            throw new InvalidOperationException("Position already got its index");
        }
        int i = this.f42374ck + 1;
        this.f42374ck = i;
        c12717os.m59076kk(i);
        return c12717os;
    }

    /* JADX INFO: renamed from: x1 */
    public final boolean m59239x1(C12717os c12717os) {
        m59222h4(c12717os);
        if (c12717os.m59073du() == this.f42377fa) {
            return true;
        }
        if (c12717os.m59073du() >= this.f42377fa) {
            return false;
        }
        this.f42377fa = c12717os.m59073du();
        return true;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m59226k4(C1594m9 c1594m9) {
        c1594m9.m8605x1(this.f42282kk.m14318c6());
    }

    @Override // com.aspose.slides.internal.p513xw.InterfaceC12711lr
    /* JADX INFO: renamed from: k4 */
    public void mo49023k4(InterfaceC1870up<C12717os> interfaceC1870up, C12724ss c12724ss) {
    }

    @Override // com.aspose.slides.internal.p513xw.InterfaceC12711lr
    /* JADX INFO: renamed from: k4 */
    public void mo54974k4(InterfaceC12711lr interfaceC12711lr) {
        this.f42381to = interfaceC12711lr;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m59227k4(boolean z, boolean z2, boolean z3) {
        if (this.f42373c5 != null) {
            m59235um().m59344k4(this.f42373c5, z, z2, z3);
        }
    }
}
