package com.aspose.slides;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p077d8.C3085sv;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p332p7.C7943in;
import com.aspose.slides.internal.p472w8.C11896dy;
import com.aspose.slides.internal.p475wh.C12003du;
import com.aspose.slides.internal.p475wh.C12007ix;
import com.aspose.slides.internal.p475wh.C12025x6;
import com.aspose.slides.p559ms.System.AbstractC14074ks;
import com.aspose.slides.p559ms.System.C14044b3;
import com.aspose.slides.p559ms.System.C14064he;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
abstract class zsm extends AbstractC14770x9 {

    /* JADX INFO: renamed from: du */
    private fml f50714du;

    /* JADX INFO: renamed from: h4 */
    private z3t f50715h4;

    /* JADX INFO: renamed from: k4 */
    List<g2y> f50716k4 = new List<>();

    /* JADX INFO: renamed from: kk */
    private double f50717kk;

    /* JADX INFO: renamed from: m9 */
    private cs8 f50718m9;

    /* JADX INFO: renamed from: to */
    private double f50719to;

    /* JADX INFO: renamed from: x1 */
    private double[] f50720x1;

    public zsm(z3t z3tVar, fml fmlVar) {
        this.f50715h4 = z3tVar;
        this.f50714du = fmlVar;
        if (z3tVar.m74307kk().getDisplayEquation() || z3tVar.m74307kk().getDisplayRSquaredValue()) {
            cs8 cs8Var = new cs8(this);
            this.f50718m9 = cs8Var;
            m73215k4(cs8Var);
        }
        if (m74786fa()) {
            m74795x1(z3tVar.m74307kk().getIntercept());
        }
    }

    @Override // com.aspose.slides.AbstractC14770x9
    /* JADX INFO: renamed from: O_ */
    public int mo3480O_() {
        return 4;
    }

    /* JADX INFO: renamed from: c5 */
    public final double[] m74783c5() {
        return this.f50720x1;
    }

    /* JADX INFO: renamed from: ck */
    public final fml m74784ck() {
        return this.f50714du;
    }

    /* JADX INFO: renamed from: dy */
    public final void m74785dy() {
        List.Enumerator<g2y> it = this.f50716k4.iterator();
        while (it.hasNext()) {
            try {
                g2y next = it.next();
                if (m74784ck().m6216ks().f45394x1.m73026k4().m73384dy().isLogarithmic()) {
                    next.m6408x1(m74784ck().m6216ks().f45394x1.m73026k4().m73391k4(next.m6406m9()));
                }
                if (m74784ck().m6216ks().f45392kk.m73026k4().m73384dy().isLogarithmic()) {
                    next.m6405k4(m74784ck().m6216ks().f45394x1.m73026k4().m73391k4(next.m6407to()));
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
    }

    /* JADX INFO: renamed from: fa */
    public final boolean m74786fa() {
        return !C14044b3.m66437kk(m74792m9().m74307kk().getIntercept());
    }

    /* JADX INFO: renamed from: jd */
    public final double m74787jd() {
        return this.f50717kk;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m74788k4(double d) {
        this.f50717kk = d;
    }

    /* JADX INFO: renamed from: kk */
    public final void m74791kk(double[] dArr, double[] dArr2) {
        List.Enumerator<g2y> it = this.f50716k4.iterator();
        while (it.hasNext()) {
            try {
                g2y next = it.next();
                if (!C14044b3.m66437kk(next.m6406m9())) {
                    if (next.m6406m9() > dArr2[0]) {
                        dArr2[0] = next.m6406m9();
                    }
                    if (next.m6406m9() < dArr[0]) {
                        dArr[0] = next.m6406m9();
                    }
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
    }

    /* JADX INFO: renamed from: m9 */
    public final z3t m74792m9() {
        return this.f50715h4;
    }

    /* JADX INFO: renamed from: to */
    public final void m74793to() {
        double[][] dArr = {null};
        double[][] dArr2 = {null};
        m74790k4(dArr, dArr2);
        mo4799k4(dArr[0], dArr2[0]);
    }

    /* JADX INFO: renamed from: up */
    public final double m74794up() {
        return this.f50719to;
    }

    @Override // com.aspose.slides.AbstractC14770x9
    /* JADX INFO: renamed from: x1 */
    public void mo3482x1() {
        List<C12025x6> list = new List<>();
        List.Enumerator<g2y> it = this.f50716k4.iterator();
        while (it.hasNext()) {
            try {
                list.addItem(it.next().m73223ts().Clone());
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        list.sort(new AbstractC14074ks<C12025x6>() { // from class: com.aspose.slides.zsm.1
            @Override // com.aspose.slides.p559ms.System.AbstractC14074ks
            /* JADX INFO: renamed from: k4, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
            public int mo1193k4(C12025x6 c12025x6, C12025x6 c12025x62) {
                return C14064he.m66709k4(c12025x6.m56897x1(), c12025x62.m56897x1());
            }
        });
        C12007ix c12007ix = new C12007ix(m73228yd().m73227xk(), m73228yd().m73206c6(), m73228yd().m73225wy(), m73228yd().m73203ak());
        C14851yl c14851yl = new C14851yl(m74792m9().m74304k4().m64941c5());
        c14851yl.m73924k4(c12007ix.Clone());
        try {
            m74782k4(list, m74792m9(), m74792m9().m74307kk().getTrendlineType() != 3, m74792m9().m74304k4().m64941c5());
        } finally {
            c14851yl.m73923k4();
        }
    }

    /* JADX INFO: renamed from: k4 */
    private void m74782k4(List<C12025x6> list, z3t z3tVar, boolean z, C14365qy c14365qy) {
        C12025x6[] array = list.toArray(new C12025x6[0]);
        if (array.length > 1) {
            C11896dy c11896dy = new C11896dy();
            if (z) {
                c11896dy.m55582x1(array);
            } else {
                c11896dy.m55564kk(array);
            }
            im9.m7693k4(z3tVar.m74309x1().Clone(), C12003du.f40505to.Clone(), c14365qy, c11896dy, (Format) z3tVar.m74307kk().getFormat());
        }
    }

    /* JADX INFO: renamed from: x1 */
    public final void m74795x1(double d) {
        this.f50719to = d;
    }

    @Override // com.aspose.slides.AbstractC14770x9
    /* JADX INFO: renamed from: k4 */
    public void mo3225k4(C14713vw c14713vw) {
        cs8 cs8Var = this.f50718m9;
        if (cs8Var != null) {
            cs8Var.m73210fa(c14713vw);
        }
        List.Enumerator<g2y> it = this.f50716k4.iterator();
        while (it.hasNext()) {
            try {
                it.next().m73210fa(c14713vw);
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
    }

    @Override // com.aspose.slides.AbstractC14770x9
    /* JADX INFO: renamed from: x1 */
    public void mo3231x1(C14713vw c14713vw) {
        g2y g2yVar = this.f50716k4.get_Item(0);
        List.Enumerator<g2y> it = this.f50716k4.iterator();
        while (it.hasNext()) {
            try {
                g2y next = it.next();
                if (ChartTypeCharacterizer.isChartTypeBar(m74784ck().m6220yj().m64945h4().getType())) {
                    next.m73208du(m74784ck().m6216ks().f45392kk.mo4964k4(next.m6406m9()));
                    next.m73212h4(m74784ck().m6216ks().f45394x1.mo4964k4(next.m6407to()));
                    if (next.m73219qm() < g2yVar.m73219qm()) {
                        g2yVar = next;
                    }
                } else {
                    next.m73212h4(m74784ck().m6216ks().f45394x1.mo4964k4(next.m6406m9()));
                    next.m73208du(m74784ck().m6216ks().f45392kk.mo4964k4(next.m6407to()));
                    if (C7019kk.m27469x1(m74784ck().m6216ks().f45392kk, C1195hd.class) && (m74784ck().m6216ks().f45392kk.m73026k4().m73375b3() || m74784ck().m6220yj().m64941c5().m69834fa().hasDataTable())) {
                        next.m73208du((((C1195hd) C7019kk.m27452k4((Object) m74784ck().m6216ks().f45392kk, C1195hd.class)).m7099um() / 2.0f) + next.m73205bz());
                    }
                    if (next.m73205bz() > g2yVar.m73205bz()) {
                        g2yVar = next;
                    }
                }
                next.m73220ss();
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
        cs8 cs8Var = this.f50718m9;
        if (cs8Var != null) {
            cs8Var.m73208du((g2yVar.m73205bz() - this.f50718m9.m73225wy()) - 4.0f);
            this.f50718m9.m73212h4(g2yVar.m73219qm() - (this.f50718m9.m73203ak() / 2.0f));
            C7943in c7943inM70588k4 = m74792m9().m74307kk().m3026k4().m70588k4();
            if (c7943inM70588k4 != null && c7943inM70588k4.m34316x1() != null && c7943inM70588k4.m34316x1().m29941ck() != null && c7943inM70588k4.m34316x1().m29944fa() != null) {
                double dM29595k4 = c7943inM70588k4.m34316x1().m29941ck().m29595k4();
                double dM29595k42 = c7943inM70588k4.m34316x1().m29944fa().m29595k4();
                float fM69867v4 = m74792m9().m74304k4().m64941c5().m69867v4();
                float fM69852lr = m74792m9().m74304k4().m64941c5().m69852lr();
                cs8 cs8Var2 = this.f50718m9;
                cs8Var2.m73208du(cs8Var2.m73205bz() + ((float) (((double) fM69867v4) * dM29595k4)));
                cs8 cs8Var3 = this.f50718m9;
                cs8Var3.m73212h4(cs8Var3.m73219qm() + ((float) (((double) fM69852lr) * dM29595k42)));
            }
            this.f50718m9.m73220ss();
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m74789k4(double[] dArr) {
        this.f50720x1 = dArr;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m74796x1(double[] dArr, double[] dArr2) {
        if (ChartTypeCharacterizer.isChartTypeBar(m74784ck().m6220yj().m64945h4().getType())) {
            m74791kk(dArr, dArr2);
            return;
        }
        List.Enumerator<g2y> it = this.f50716k4.iterator();
        while (it.hasNext()) {
            try {
                g2y next = it.next();
                if (!C14044b3.m66437kk(next.m6407to())) {
                    if (next.m6407to() > dArr2[0]) {
                        dArr2[0] = next.m6407to();
                    }
                    if (next.m6407to() < dArr[0]) {
                        dArr[0] = next.m6407to();
                    }
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
    }

    /* JADX INFO: renamed from: k4 */
    public void mo4799k4(double[] dArr, double[] dArr2) {
        double[][] dArrM70089k4;
        double[][] dArr3 = new double[dArr2.length][];
        for (int i = 0; i < dArr2.length; i++) {
            dArr3[i] = new double[]{dArr[i]};
        }
        if (m74786fa()) {
            for (int i2 = 0; i2 < dArr2.length; i2++) {
                dArr2[i2] = dArr2[i2] - m74794up();
            }
            dArrM70089k4 = rgn.m70093x1(dArr2, dArr3);
        } else {
            dArrM70089k4 = rgn.m70089k4(dArr2, dArr3);
        }
        int length = dArrM70089k4[0].length;
        double[] dArr4 = new double[length];
        for (int i3 = 0; i3 < length; i3++) {
            dArr4[i3] = dArrM70089k4[0][i3];
            if (i3 == length - 1 && m74786fa()) {
                dArr4[i3] = m74794up();
            }
        }
        m74788k4(dArrM70089k4[2][0]);
        m74789k4(dArr4);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m74790k4(double[][] dArr, double[][] dArr2) {
        List list = new List();
        List list2 = new List();
        List.Enumerator<AbstractC1164gw> it = m74784ck().f5072x1.iterator();
        while (it.hasNext()) {
            try {
                AbstractC1164gw next = it.next();
                if (!next.m6926yj().m4983dy()) {
                    list.addItem(Double.valueOf(next.m6923up()));
                    list2.addItem(Double.valueOf(next.m6918fa()));
                }
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        dArr[0] = C3085sv.m13105to((List<Double>) list);
        dArr2[0] = C3085sv.m13105to((List<Double>) list2);
    }
}
