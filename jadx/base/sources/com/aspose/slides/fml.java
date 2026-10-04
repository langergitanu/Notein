package com.aspose.slides;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.C14044b3;
import com.aspose.slides.p559ms.System.C14116yg;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
abstract class fml extends AbstractC14770x9 {

    /* JADX INFO: renamed from: c5 */
    private ixg f5064c5;

    /* JADX INFO: renamed from: k4 */
    private C13847mr f5068k4;

    /* JADX INFO: renamed from: x1 */
    List<AbstractC1164gw> f5072x1 = new List<>();

    /* JADX INFO: renamed from: kk */
    protected List<C14177nd> f5069kk = new List<>();

    /* JADX INFO: renamed from: to */
    protected List<klm> f5071to = new List<>();

    /* JADX INFO: renamed from: du */
    protected List<zsm> f5065du = new List<>();

    /* JADX INFO: renamed from: h4 */
    protected List<lyj> f5067h4 = new List<>();

    /* JADX INFO: renamed from: m9 */
    protected List<mfd> f5070m9 = new List<>();

    /* JADX INFO: renamed from: dy */
    protected List<wm6> f5066dy = new List<>();

    public fml(ixg ixgVar, C13847mr c13847mr) {
        this.f5068k4 = c13847mr;
        this.f5064c5 = ixgVar;
    }

    /* JADX INFO: renamed from: c5 */
    private void m6201c5() {
        AbstractC1164gw abstractC1164gw;
        double dM6918fa;
        boolean z = ChartTypeCharacterizer.isChartTypeColumn(m6220yj().m64945h4().getType()) || ChartTypeCharacterizer.isChartTypeBar(m6220yj().m64945h4().getType());
        for (int i = 0; i < this.f5072x1.size(); i++) {
            double dM4989k4 = 0.0d;
            double dM4989k42 = 0.0d;
            for (int i2 = 0; i2 < m6216ks().f45391k4.indexOf(this); i2++) {
                if (m6216ks().f45391k4.get_Item(i2).f5072x1.size() - 1 >= i) {
                    AbstractC1164gw abstractC1164gw2 = m6216ks().f45391k4.get_Item(i2).f5072x1.get_Item(i);
                    if (abstractC1164gw2.m6926yj().m4989k4() > 0.0d || !z) {
                        dM4989k4 += abstractC1164gw2.m6926yj().m4989k4();
                    } else {
                        dM4989k42 += abstractC1164gw2.m6926yj().m4989k4();
                    }
                }
            }
            if (this.f5072x1.get_Item(i).m6926yj().m4989k4() >= 0.0d || !z) {
                abstractC1164gw = this.f5072x1.get_Item(i);
                dM6918fa = this.f5072x1.get_Item(i).m6918fa() + dM4989k4;
            } else {
                abstractC1164gw = this.f5072x1.get_Item(i);
                dM6918fa = this.f5072x1.get_Item(i).m6918fa() + dM4989k42;
            }
            abstractC1164gw.m6920k4(dM6918fa);
        }
    }

    /* JADX INFO: renamed from: du */
    private void m6202du(double[] dArr, double[] dArr2) {
        List.Enumerator<wm6> it = this.f5066dy.iterator();
        while (it.hasNext()) {
            try {
                wm6 next = it.next();
                if (next.m64190jd() > dArr2[0]) {
                    dArr2[0] = next.m64190jd();
                }
                if (next.m64184c5() < dArr[0]) {
                    dArr[0] = next.m64184c5();
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

    /* JADX INFO: renamed from: dy */
    private void m6203dy() {
        m6201c5();
        for (int i = 0; i < this.f5072x1.size(); i++) {
            this.f5072x1.get_Item(i).m6920k4(C14116yg.m67477k4((1.0d / m6213k4(i)) * this.f5072x1.get_Item(i).m6918fa(), 10));
            if (C14044b3.m66437kk(this.f5072x1.get_Item(i).m6918fa())) {
                this.f5072x1.get_Item(i).m6920k4(0.0d);
            }
        }
    }

    /* JADX INFO: renamed from: m9 */
    private void m6206m9() {
        List.Enumerator<wm6> it;
        int iM762k4 = ChartTypeCharacterizer.m762k4(m6220yj().m64945h4().getType());
        if (iM762k4 == 2 || iM762k4 == 3) {
            if (m6216ks().f45394x1.m73026k4().m73384dy().isLogarithmic()) {
                for (int i = 0; i < this.f5072x1.size(); i++) {
                    if (this.f5072x1.get_Item(i).m6918fa() == 0.0d) {
                        this.f5072x1.get_Item(i).m6926yj().m5018x1(true);
                        this.f5072x1.get_Item(i).mo63967x1(false);
                    } else {
                        this.f5072x1.get_Item(i).m6920k4(m6216ks().f45394x1.m73026k4().m73391k4(this.f5072x1.get_Item(i).m6918fa()));
                    }
                }
            }
        } else if (iM762k4 != 4) {
            if (iM762k4 == 5) {
                if (m6216ks().f45394x1.m73026k4().m73384dy().isLogarithmic()) {
                    for (int i2 = 0; i2 < this.f5072x1.size(); i2++) {
                        if (this.f5072x1.get_Item(i2).m6918fa() == 0.0d) {
                            this.f5072x1.get_Item(i2).m6926yj().m5018x1(true);
                            this.f5072x1.get_Item(i2).mo63967x1(false);
                        } else {
                            this.f5072x1.get_Item(i2).m6920k4(m6216ks().f45394x1.m73026k4().m73391k4(this.f5072x1.get_Item(i2).m6918fa()));
                        }
                    }
                }
                if (m6216ks().f45392kk.m73026k4().m73384dy().isLogarithmic()) {
                    for (int i3 = 0; i3 < this.f5072x1.size(); i3++) {
                        if (this.f5072x1.get_Item(i3).m6923up() == 0.0d) {
                            this.f5072x1.get_Item(i3).m6926yj().m5018x1(true);
                            this.f5072x1.get_Item(i3).mo63967x1(false);
                        } else {
                            this.f5072x1.get_Item(i3).m6924x1(m6216ks().f45392kk.m73026k4().m73391k4(this.f5072x1.get_Item(i3).m6923up()));
                        }
                    }
                }
            }
        } else if (m6216ks().f45392kk.m73026k4().m73384dy().isLogarithmic()) {
            for (int i4 = 0; i4 < this.f5072x1.size(); i4++) {
                if (this.f5072x1.get_Item(i4).m6918fa() == 0.0d) {
                    this.f5072x1.get_Item(i4).m6926yj().m5018x1(true);
                    this.f5072x1.get_Item(i4).mo63967x1(false);
                } else {
                    this.f5072x1.get_Item(i4).m6920k4(m6216ks().f45392kk.m73026k4().m73391k4(this.f5072x1.get_Item(i4).m6918fa()));
                }
            }
        }
        if (m6216ks().f45394x1.m73026k4().m73384dy().isLogarithmic()) {
            it = this.f5066dy.iterator();
            while (it.hasNext()) {
                try {
                    wm6 next = it.next();
                    if (next.m64184c5() != 0.0d) {
                        next.m64186du(m6216ks().f45394x1.m73026k4().m73391k4(next.m64184c5()));
                    }
                    if (next.m64190jd() != 0.0d) {
                        next.m64189h4(m6216ks().f45394x1.m73026k4().m73391k4(next.m64190jd()));
                    }
                } finally {
                }
            }
            if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                it.dispose();
            }
        }
        if (m6216ks().f45392kk.m73026k4().m73384dy().isLogarithmic()) {
            List.Enumerator<mfd> it2 = this.f5070m9.iterator();
            while (it2.hasNext()) {
                try {
                    mfd next2 = it2.next();
                    if (next2.m64184c5() != 0.0d) {
                        next2.m64186du(m6216ks().f45392kk.m73026k4().m73391k4(next2.m64184c5()));
                    }
                    if (next2.m64190jd() != 0.0d) {
                        next2.m64189h4(m6216ks().f45392kk.m73026k4().m73391k4(next2.m64190jd()));
                    }
                } finally {
                }
            }
            if (C7019kk.m27456k4((Iterator) it2, (Class<IDisposable>) IDisposable.class)) {
                it2.dispose();
            }
        }
        it = this.f5065du.iterator();
        while (it.hasNext()) {
            try {
                it.next().m74785dy();
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
            it.dispose();
        }
    }

    /* JADX INFO: renamed from: to */
    private void m6208to() {
        boolean z;
        AbstractC14763x3 abstractC14763x3 = ChartTypeCharacterizer.m762k4(m6220yj().m64945h4().getType()) == 2 ? m6216ks().f45392kk : null;
        if (ChartTypeCharacterizer.m762k4(m6220yj().m64945h4().getType()) == 4) {
            abstractC14763x3 = m6216ks().f45394x1;
        }
        if (C7019kk.m27469x1(abstractC14763x3, AbstractC14464sp.class)) {
            List<C1210hn> listM69871x1 = abstractC14763x3.m73026k4().m73419up() == 0 ? m6220yj().m64941c5().m69871x1() : m6220yj().m64941c5().m69848kk();
            for (int i = 0; i < this.f5072x1.size() && i < listM69871x1.size(); i++) {
                double dM70702x1 = AbstractC14464sp.m70702x1(listM69871x1.get_Item(i).m7238x1());
                this.f5072x1.get_Item(i).m6926yj().m5016x1(dM70702x1);
                if (!this.f5072x1.get_Item(i).m6926yj().m4983dy() && !"".equals(listM69871x1.get_Item(i).m7238x1().toString())) {
                    this.f5072x1.get_Item(i).m6924x1(dM70702x1);
                }
            }
        } else if (C7019kk.m27469x1(abstractC14763x3, AbstractC14265p3.class)) {
            for (int i2 = 0; i2 < this.f5072x1.size(); i2++) {
                this.f5072x1.get_Item(i2).m6924x1(((double) i2) + 1.0d);
            }
        }
        if (ChartTypeCharacterizer.m762k4(m6220yj().m64945h4().getType()) == 5) {
            int i3 = 0;
            boolean z2 = false;
            while (true) {
                z = true;
                if (i3 >= this.f5072x1.size()) {
                    break;
                }
                if (!z2 && !this.f5072x1.get_Item(i3).m6926yj().m4983dy()) {
                    z2 = true;
                }
                if (!this.f5072x1.get_Item(i3).m6926yj().m4983dy() && !C14044b3.m66437kk(this.f5072x1.get_Item(i3).m6923up())) {
                    z = false;
                    break;
                }
                i3++;
            }
            if (z && z2) {
                for (int i4 = 0; i4 < this.f5072x1.size(); i4++) {
                    this.f5072x1.get_Item(i4).m6924x1(((double) i4) + 1.0d);
                    if (C7019kk.m27469x1(m6216ks().f45392kk, AbstractC14265p3.class)) {
                        this.f5072x1.get_Item(i4).m6924x1(this.f5072x1.get_Item(i4).m6923up() + 0.5d);
                    }
                }
            }
        }
    }

    @Override // com.aspose.slides.AbstractC14770x9
    /* JADX INFO: renamed from: O_ */
    public int mo3480O_() {
        return 2;
    }

    @Override // com.aspose.slides.AbstractC14770x9
    /* JADX INFO: renamed from: U_ */
    public void mo5524U_() {
        if (mo3221T_()) {
            for (AbstractC14770x9 abstractC14770x9 : m73204b3()) {
                abstractC14770x9.mo5524U_();
            }
        }
    }

    /* JADX INFO: renamed from: ck */
    public final void m6209ck() {
        List.Enumerator<zsm> it = this.f5065du.iterator();
        while (it.hasNext()) {
            try {
                it.next().m73220ss();
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
    }

    /* JADX INFO: renamed from: fa */
    public final void m6210fa() {
        List.Enumerator<mfd> it = this.f5066dy.iterator();
        while (it.hasNext()) {
            try {
                wm6 next = it.next();
                next.m72828yj();
                next.m73220ss();
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
            it.dispose();
        }
        it = this.f5070m9.iterator();
        while (it.hasNext()) {
            try {
                mfd next2 = it.next();
                next2.m64871yj();
                next2.m73220ss();
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
    }

    /* JADX INFO: renamed from: h4 */
    public final void m6211h4(C14713vw c14713vw) {
        List.Enumerator<mfd> it = this.f5066dy.iterator();
        while (it.hasNext()) {
            try {
                it.next().m73210fa(c14713vw);
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
            it.dispose();
        }
        it = this.f5070m9.iterator();
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

    /* JADX INFO: renamed from: jd */
    public void m6212jd() {
        zsm c14893zl;
        zsm zsmVar;
        if (ChartTypeCharacterizer.m758dy(m6220yj().m64945h4().getType())) {
            m6201c5();
        } else if (ChartTypeCharacterizer.m761jd(m6220yj().m64945h4().getType())) {
            m6203dy();
        }
        m6208to();
        List.Enumerator<AbstractC1164gw> it = this.f5072x1.iterator();
        while (it.hasNext()) {
            try {
                AbstractC1164gw next = it.next();
                if (next.m6926yj().m4980ck() != null && !next.m6926yj().m4983dy()) {
                    mfd mfdVar = new mfd(next);
                    this.f5070m9.addItem(mfdVar);
                    m73215k4(mfdVar);
                }
                if (next.m6926yj().m4984fa() != null && !next.m6926yj().m4983dy()) {
                    wm6 wm6Var = new wm6(next);
                    this.f5066dy.addItem(wm6Var);
                    m73215k4(wm6Var);
                }
            } finally {
            }
        }
        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
            it.dispose();
        }
        if (m6220yj().m64943du().size() > 0 && this.f5072x1.size() > 1) {
            it = m6220yj().m64943du().iterator();
            while (it.hasNext()) {
                try {
                    z3t next2 = it.next();
                    int trendlineType = next2.m74307kk().getTrendlineType();
                    if (trendlineType == 0) {
                        c14893zl = new C14893zl(next2, this);
                    } else if (trendlineType == 1) {
                        c14893zl = new c4b(next2, this);
                    } else if (trendlineType == 2) {
                        c14893zl = new vbi(next2, this);
                    } else if (trendlineType == 3) {
                        c14893zl = new os6(next2, this);
                    } else if (trendlineType == 4) {
                        c14893zl = new cre(next2, this);
                    } else if (trendlineType != 5) {
                        zsmVar = null;
                        this.f5065du.addItem(zsmVar);
                        m73215k4(zsmVar);
                    } else {
                        c14893zl = new wdy(next2, this);
                    }
                    zsmVar = c14893zl;
                    this.f5065du.addItem(zsmVar);
                    m73215k4(zsmVar);
                } finally {
                }
            }
            if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                it.dispose();
            }
        }
        m6206m9();
    }

    /* JADX INFO: renamed from: k4 */
    public final double m6213k4(int i) {
        double dM67475k4 = 0.0d;
        for (AbstractC1164gw abstractC1164gw : m6216ks().m63152k4(i)) {
            dM67475k4 += C14116yg.m67475k4(abstractC1164gw.m6926yj().m4989k4());
        }
        if (dM67475k4 == 0.0d) {
            return 1.0d;
        }
        return dM67475k4;
    }

    /* JADX INFO: renamed from: kk */
    public final void m6215kk(double[] dArr, double[] dArr2) {
        m6217to(dArr, dArr2);
        m6204dy(dArr, dArr2);
        m6207m9(dArr, dArr2);
    }

    /* JADX INFO: renamed from: ks */
    public final ixg m6216ks() {
        return this.f5064c5;
    }

    /* JADX INFO: renamed from: up */
    public final boolean m6218up() {
        List.Enumerator<AbstractC1164gw> it = this.f5072x1.iterator();
        while (it.hasNext()) {
            try {
                if (!it.next().m6926yj().m4983dy()) {
                    if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                        it.dispose();
                    }
                    return false;
                }
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
    }

    /* JADX INFO: renamed from: x1 */
    public final void m6219x1(double[] dArr, double[] dArr2) {
        mo3716k4(dArr, dArr2);
        m6202du(dArr, dArr2);
        m6205h4(dArr, dArr2);
    }

    /* JADX INFO: renamed from: yj */
    public final C13847mr m6220yj() {
        return this.f5068k4;
    }

    /* JADX INFO: renamed from: dy */
    private void m6204dy(double[] dArr, double[] dArr2) {
        if (ChartTypeCharacterizer.isChartTypeBar(m6220yj().m64945h4().getType())) {
            m6202du(dArr, dArr2);
            return;
        }
        List.Enumerator<mfd> it = this.f5070m9.iterator();
        while (it.hasNext()) {
            try {
                mfd next = it.next();
                if (next.m64190jd() > dArr2[0]) {
                    dArr2[0] = next.m64190jd();
                }
                if (next.m64184c5() < dArr[0]) {
                    dArr[0] = next.m64184c5();
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

    /* JADX INFO: renamed from: h4 */
    private void m6205h4(double[] dArr, double[] dArr2) {
        List.Enumerator<zsm> it = this.f5065du.iterator();
        while (it.hasNext()) {
            try {
                it.next().m74791kk(dArr, dArr2);
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
    }

    /* JADX INFO: renamed from: m9 */
    private void m6207m9(double[] dArr, double[] dArr2) {
        List.Enumerator<zsm> it = this.f5065du.iterator();
        while (it.hasNext()) {
            try {
                it.next().m74796x1(dArr, dArr2);
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final double m6214k4(int i, int i2) {
        AbstractC1164gw[] abstractC1164gwArrM63152k4 = m6216ks().m63152k4(i);
        double dM67475k4 = 0.0d;
        for (int i3 = 0; i3 <= i2; i3++) {
            dM67475k4 += C14116yg.m67475k4(abstractC1164gwArrM63152k4[i3].m6926yj().m4989k4());
        }
        return dM67475k4;
    }

    /* JADX INFO: renamed from: to */
    public final void m6217to(double[] dArr, double[] dArr2) {
        if (ChartTypeCharacterizer.isChartTypeBar(m6220yj().m64945h4().getType())) {
            mo3716k4(dArr, dArr2);
            return;
        }
        double dM6923up = this.f5072x1.get_Item(0).m6923up();
        dArr[0] = dM6923up;
        dArr2[0] = dM6923up;
        if (this.f5072x1.size() > 1) {
            for (int i = 1; i < this.f5072x1.size(); i++) {
                if (!this.f5072x1.get_Item(i).m6926yj().m4983dy()) {
                    double dM6923up2 = this.f5072x1.get_Item(i).m6923up();
                    double d = dArr2[0];
                    if (dM6923up2 > d || C14044b3.m66437kk(d)) {
                        dArr2[0] = this.f5072x1.get_Item(i).m6923up();
                    }
                    double dM6923up3 = this.f5072x1.get_Item(i).m6923up();
                    double d2 = dArr[0];
                    if (dM6923up3 < d2 || C14044b3.m66437kk(d2)) {
                        dArr[0] = this.f5072x1.get_Item(i).m6923up();
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    public void mo3716k4(double[] dArr, double[] dArr2) {
        double dM6918fa = this.f5072x1.get_Item(0).m6918fa();
        dArr[0] = dM6918fa;
        dArr2[0] = dM6918fa;
        if (this.f5072x1.size() > 1) {
            for (int i = 1; i < this.f5072x1.size(); i++) {
                if (this.f5072x1.get_Item(i).m6926yj().m4983dy()) {
                    if (ChartTypeCharacterizer.m758dy(m6220yj().m64945h4().getType())) {
                    }
                } else {
                    C14044b3.m66430k4(this.f5072x1.get_Item(i).m6918fa(), dArr2[0]);
                }
                if (this.f5072x1.get_Item(i).m6918fa() > dArr2[0]) {
                    dArr2[0] = this.f5072x1.get_Item(i).m6918fa();
                }
                if (this.f5072x1.get_Item(i).m6918fa() < dArr[0]) {
                    dArr[0] = this.f5072x1.get_Item(i).m6918fa();
                }
            }
        }
    }
}
