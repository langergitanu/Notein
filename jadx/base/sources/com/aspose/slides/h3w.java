package com.aspose.slides;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.KeyValuePair;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.internal.p314oc.AbstractC7020m9;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p475wh.C12003du;
import com.aspose.slides.internal.p475wh.C12007ix;
import com.aspose.slides.p559ms.System.C14051ck;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14116yg;
import com.aspose.slides.p559ms.System.IDisposable;
import com.aspose.slides.p559ms.System.InterfaceC14089ss;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
class h3w extends AbstractC14770x9 {

    /* JADX INFO: renamed from: k4 */
    private final C14365qy f5393k4;

    /* JADX INFO: renamed from: kk */
    private final List<AbstractC14770x9> f5394kk = new List<>();

    /* JADX INFO: renamed from: x1 */
    private final C14237oh f5395x1;

    /* JADX INFO: renamed from: com.aspose.slides.h3w$k4 */
    public static class C1184k4 extends AbstractC7020m9<C1184k4> implements InterfaceC14089ss<C1184k4> {

        /* JADX INFO: renamed from: k4 */
        int f5396k4;

        /* JADX INFO: renamed from: x1 */
        boolean f5397x1;

        public C1184k4() {
            this.f5396k4 = 0;
            this.f5397x1 = false;
        }

        public Object clone() {
            return Clone();
        }

        @Override // com.aspose.slides.p559ms.System.InterfaceC14089ss
        public boolean equals(Object obj) {
            return !C14067j2.m66729x1(null, obj) && C7019kk.m27469x1(obj, C1184k4.class) && m6994k4(((C1184k4) C7019kk.m27464to(obj, C1184k4.class)).Clone());
        }

        public int hashCode() {
            return (this.f5396k4 * 397) ^ C14051ck.m66552k4(this.f5397x1);
        }

        @Override // com.aspose.slides.p559ms.System.AbstractC14079na
        /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
        public C1184k4 Clone() {
            C1184k4 c1184k4 = new C1184k4();
            CloneTo(c1184k4);
            return c1184k4;
        }

        @Override // com.aspose.slides.p559ms.System.AbstractC14079na
        /* JADX INFO: renamed from: x1, reason: merged with bridge method [inline-methods] */
        public void CloneTo(C1184k4 c1184k4) {
            c1184k4.f5396k4 = this.f5396k4;
            c1184k4.f5397x1 = this.f5397x1;
        }

        public C1184k4(int i, boolean z) {
            this.f5396k4 = i;
            this.f5397x1 = z;
        }

        /* JADX INFO: renamed from: k4 */
        public final boolean m6994k4(C1184k4 c1184k4) {
            return this.f5396k4 == c1184k4.f5396k4 && this.f5397x1 == c1184k4.f5397x1;
        }
    }

    public h3w(C14365qy c14365qy, C14237oh c14237oh) {
        this.f5393k4 = c14365qy;
        this.f5395x1 = c14237oh;
        m6986k4(m6989x1(c14365qy.m69865up()));
    }

    /* JADX INFO: renamed from: c5 */
    private AbstractC14763x3 m6978c5() {
        if (m6992to().m68559m9() != null && m6992to().m68559m9().m73026k4().m73384dy().isVisible()) {
            if (m6992to().m68551du() != null && m6992to().m68551du().m73026k4().m73384dy().isVisible()) {
                if (m6992to().m68551du().m73022ix() == m6992to().m68559m9().m73022ix() && m6992to().m68551du().m73026k4().m73384dy().isPlotOrderReversed() != m6992to().m68559m9().m73026k4().m73384dy().isPlotOrderReversed()) {
                    return m6992to().m68551du();
                }
                return m6992to().m68551du();
            }
            return m6992to().m68559m9();
        }
        return m6992to().m68551du();
    }

    /* JADX INFO: renamed from: dy */
    private AbstractC14763x3 m6979dy() {
        if (m6992to().m68561to() == null) {
            return m6992to().m68554h4();
        }
        if (m6992to().m68554h4() == null) {
            return m6992to().m68561to();
        }
        if (!m6992to().m68554h4().m73026k4().m73384dy().isVisible() && m6992to().m68554h4().m73022ix() == m6992to().m68561to().m73022ix() && m6992to().m68554h4().m73026k4().m73384dy().isPlotOrderReversed() == m6992to().m68561to().m73026k4().m73384dy().isPlotOrderReversed()) {
            return m6992to().m68561to();
        }
        return m6992to().m68554h4();
    }

    /* JADX INFO: renamed from: jd */
    private AbstractC14763x3 m6980jd() {
        if (m6992to().m68551du() == null) {
            return m6992to().m68559m9();
        }
        if (m6992to().m68559m9() == null) {
            return m6992to().m68551du();
        }
        if (!m6992to().m68559m9().m73026k4().m73384dy().isVisible() && C14067j2.m66727k4(m6992to().m68559m9()) == C14067j2.m66727k4(m6992to().m68551du()) && m6992to().m68559m9().m73022ix() == m6992to().m68551du().m73022ix() && m6992to().m68559m9().m73026k4().m73384dy().isPlotOrderReversed() == m6992to().m68551du().m73026k4().m73384dy().isPlotOrderReversed()) {
            return m6992to().m68551du();
        }
        return m6992to().m68559m9();
    }

    /* JADX INFO: renamed from: k4 */
    private static int m6981k4(int i) {
        if (i == 29) {
            return 26;
        }
        if (i == 67) {
            return 66;
        }
        switch (i) {
            case 22:
                return 19;
            case 23:
                return 20;
            case 24:
                return 21;
            default:
                return i;
        }
    }

    /* JADX INFO: renamed from: m9 */
    private AbstractC14763x3 m6988m9() {
        if (m6992to().m68554h4() != null && m6992to().m68554h4().m73026k4().m73384dy().isVisible()) {
            if (m6992to().m68561to() != null && m6992to().m68561to().m73026k4().m73384dy().isVisible()) {
                if (m6992to().m68561to().m73022ix() == m6992to().m68554h4().m73022ix() && m6992to().m68561to().m73026k4().m73384dy().isPlotOrderReversed() != m6992to().m68554h4().m73026k4().m73384dy().isPlotOrderReversed()) {
                    return m6992to().m68561to();
                }
                return m6992to().m68561to();
            }
            return m6992to().m68554h4();
        }
        return m6992to().m68561to();
    }

    /* JADX INFO: renamed from: x1 */
    private static List<KeyValuePair<C1184k4, List<C13847mr>>> m6989x1(List<C13847mr> list) {
        List<C13847mr> value;
        Dictionary dictionary = new Dictionary();
        List<KeyValuePair<C1184k4, List<C13847mr>>> list2 = new List<>();
        List.Enumerator<C13847mr> it = list.iterator();
        while (it.hasNext()) {
            try {
                C13847mr next = it.next();
                C1184k4 c1184k4 = new C1184k4(m6981k4(next.m64945h4().getType()), next.m64945h4().getPlotOnSecondAxis());
                if (dictionary.containsKey(c1184k4.Clone())) {
                    value = list2.get_Item(((Integer) dictionary.get_Item(c1184k4.Clone())).intValue()).getValue();
                } else {
                    dictionary.addItem(c1184k4.Clone(), Integer.valueOf(list2.size()));
                    List<C13847mr> list3 = new List<>();
                    list2.addItem(new KeyValuePair<>(c1184k4.Clone(), list3));
                    value = list3;
                }
                value.addItem(next);
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
        List.Enumerator<KeyValuePair<C1184k4, List<C13847mr>>> it2 = list2.iterator();
        while (it2.hasNext()) {
            try {
                it2.next().getValue().sort(new C14433s4());
            } finally {
                if (C7019kk.m27456k4((Iterator) it2, (Class<IDisposable>) IDisposable.class)) {
                    it2.dispose();
                }
            }
        }
        return list2;
    }

    @Override // com.aspose.slides.AbstractC14770x9
    /* JADX INFO: renamed from: O_ */
    public int mo3480O_() {
        return 0;
    }

    @Override // com.aspose.slides.AbstractC14770x9
    /* JADX INFO: renamed from: V_ */
    public void mo3030V_() {
        ((ChartPlotArea) C7019kk.m27452k4((Object) this.f5393k4.m69834fa().getPlotArea(), ChartPlotArea.class)).m710k4(m73227xk() - m73228yd().m73227xk());
        ((ChartPlotArea) C7019kk.m27452k4((Object) this.f5393k4.m69834fa().getPlotArea(), ChartPlotArea.class)).m713x1(m73206c6() - m73228yd().m73206c6());
        ((ChartPlotArea) C7019kk.m27452k4((Object) this.f5393k4.m69834fa().getPlotArea(), ChartPlotArea.class)).m711kk(m73225wy());
        ((ChartPlotArea) C7019kk.m27452k4((Object) this.f5393k4.m69834fa().getPlotArea(), ChartPlotArea.class)).m712to(m73203ak());
    }

    /* JADX INFO: renamed from: to */
    public final C14237oh m6992to() {
        return this.f5395x1;
    }

    /* JADX INFO: renamed from: k4 */
    private List<ixg> m6982k4(AbstractC14763x3 abstractC14763x3) {
        List<ixg> list = new List<>();
        List.Enumerator<AbstractC14770x9> it = this.f5394kk.iterator();
        while (it.hasNext()) {
            try {
                AbstractC14770x9 next = it.next();
                if (C7019kk.m27469x1(next, ixg.class)) {
                    ixg ixgVar = (ixg) next;
                    if (ixgVar.f45394x1 == abstractC14763x3 || ixgVar.f45392kk == abstractC14763x3) {
                        list.addItem(ixgVar);
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
        return list;
    }

    /* JADX INFO: renamed from: x1 */
    private mxy m6990x1(ChartSeries chartSeries, mxy mxyVar) {
        float fM72555k4 = mxyVar.m72555k4();
        float fM72556x1 = mxyVar.m72556x1();
        if (m6987k4(chartSeries)) {
            fM72556x1 -= fM72556x1 * 0.128f;
            fM72555k4 -= 0.128f * fM72555k4;
        }
        if (fM72555k4 < 4.0f) {
            fM72555k4 = 4.0f;
        }
        if (fM72556x1 < 4.0f) {
            fM72556x1 = 4.0f;
        }
        mxy mxyVarM67813k4 = mxyVar.m67813k4(fM72555k4, fM72556x1);
        return (chartSeries.getType() == 28 || chartSeries.getType() == 31) ? mxyVarM67813k4 : mxyVarM67813k4.m67812h4();
    }

    /* JADX INFO: renamed from: k4 */
    private mxy m6983k4(ChartSeries chartSeries, mxy mxyVar) {
        return (ChartTypeCharacterizer.isChartTypePie(chartSeries.getType()) || ChartTypeCharacterizer.isChartTypeDoughnut(chartSeries.getType())) ? m6990x1(chartSeries, mxyVar) : mxyVar;
    }

    @Override // com.aspose.slides.AbstractC14770x9
    /* JADX INFO: renamed from: x1 */
    public void mo3482x1() {
        if (this.f5394kk.size() > 0) {
            AbstractC14770x9 abstractC14770x9 = this.f5394kk.get_Item(0);
            if (abstractC14770x9.m73225wy() == 0.0f && abstractC14770x9.m73203ak() == 0.0f) {
                return;
            }
            if (!ChartTypeCharacterizer.isChartTypePie(this.f5393k4.m69834fa().getType()) && !ChartTypeCharacterizer.isChartTypeDoughnut(this.f5393k4.m69834fa().getType())) {
                this.f5393k4.f48440k4.f5460x1 = new C12007ix(abstractC14770x9.m73227xk(), abstractC14770x9.m73206c6(), abstractC14770x9.m73225wy(), abstractC14770x9.m73203ak());
                this.f5393k4.f48440k4.m7072k4();
            } else {
                C12007ix c12007ix = new C12007ix(abstractC14770x9.m73227xk(), abstractC14770x9.m73206c6(), abstractC14770x9.m73225wy(), abstractC14770x9.m73203ak());
                ChartPlotArea chartPlotArea = (ChartPlotArea) this.f5393k4.m69834fa().getPlotArea();
                if (im9.m7716k4(c12007ix.Clone(), c12007ix.Clone(), this.f5393k4, chartPlotArea.getFormat().getEffect3D(), (FillFormat) chartPlotArea.getFormat().getFill(), (LineFormat) chartPlotArea.getFormat().getLine(), C12003du.f40505to.Clone(), C12003du.f40505to.Clone())) {
                    return;
                }
                im9.m7720x1(C12003du.f40505to.Clone(), C12003du.f40505to.Clone(), this.f5393k4, c12007ix.Clone(), (LineFormat) chartPlotArea.getFormat().getLine(), (FillFormat) chartPlotArea.getFormat().getFill(), chartPlotArea.getFormat().getEffect());
                im9.m7700k4(C12003du.f40505to.Clone(), C12003du.f40505to.Clone(), this.f5393k4, c12007ix.Clone(), (LineFormat) chartPlotArea.getFormat().getLine(), (FillFormat) chartPlotArea.getFormat().getFill(), chartPlotArea.getFormat().getEffect());
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    private mxy m6984k4(mxy mxyVar) {
        if (!((ChartPlotArea) this.f5393k4.m69834fa().getPlotArea()).isLocationAutocalculated()) {
            return mxyVar;
        }
        float fM72555k4 = mxyVar.m72555k4();
        float fM72556x1 = mxyVar.m72556x1();
        List.Enumerator<C13847mr> it = this.f5393k4.m69865up().iterator();
        while (it.hasNext()) {
            try {
                mxy mxyVarM6983k4 = m6983k4(it.next().m64945h4(), mxyVar);
                fM72555k4 = C14116yg.m67504x1(fM72555k4, mxyVarM6983k4.m72555k4());
                fM72556x1 = C14116yg.m67504x1(fM72556x1, mxyVarM6983k4.m72556x1());
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        return mxyVar.m67813k4(fM72555k4, fM72556x1);
    }

    @Override // com.aspose.slides.AbstractC14770x9
    /* JADX INFO: renamed from: x1 */
    public void mo3231x1(C14713vw c14713vw) {
        mxy mxyVar = (mxy) c14713vw;
        mxy mxyVarM6984k4 = m6984k4(mxyVar);
        float fM67814to = mxyVarM6984k4.m67814to() - mxyVar.m67814to();
        float fM67811du = mxyVarM6984k4.m67811du() - mxyVar.m67811du();
        List.Enumerator<AbstractC14770x9> it = this.f5394kk.iterator();
        while (it.hasNext()) {
            try {
                AbstractC14770x9 next = it.next();
                next.m73208du(fM67814to);
                next.m73212h4(fM67811du);
                next.m73220ss();
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        for (AbstractC14770x9 abstractC14770x9 : m73204b3()) {
            abstractC14770x9.m73220ss();
        }
    }

    /* JADX INFO: renamed from: k4 */
    private AbstractC14770x9 m6985k4(int i, C13847mr[] c13847mrArr) {
        AbstractC14763x3 abstractC14763x3M6988m9;
        AbstractC14763x3 abstractC14763x3M6978c5;
        boolean zIsChartTypeRadar = ChartTypeCharacterizer.isChartTypeRadar(c13847mrArr[0].m64945h4().getType());
        if (c13847mrArr[0].m64945h4().getPlotOnSecondAxis()) {
            abstractC14763x3M6988m9 = m6979dy();
            abstractC14763x3M6978c5 = m6980jd();
            if (zIsChartTypeRadar) {
                abstractC14763x3M6988m9 = m6992to().m68552dy();
                abstractC14763x3M6978c5 = m6992to().m68555jd();
            }
        } else {
            abstractC14763x3M6988m9 = m6988m9();
            abstractC14763x3M6978c5 = m6978c5();
            if (zIsChartTypeRadar) {
                abstractC14763x3M6988m9 = m6992to().m68552dy();
                abstractC14763x3M6978c5 = m6992to().m68548c5();
            }
        }
        if (!zIsChartTypeRadar && ((m6992to().m68551du() == null || !m6992to().m68551du().m73026k4().m73384dy().isVisible()) && ((m6992to().m68554h4() == null || !m6992to().m68554h4().m73026k4().m73384dy().isVisible()) && !c13847mrArr[0].m64945h4().getPlotOnSecondAxis()))) {
            abstractC14763x3M6978c5 = m6992to().m68551du();
        }
        if (i == 0 || i == 1 || i == 2) {
            return new C0849cc(c13847mrArr, abstractC14763x3M6978c5, abstractC14763x3M6988m9);
        }
        if (i != 26) {
            if (i == 28) {
                return new l4q(c13847mrArr[0]);
            }
            if (i != 29) {
                if (i == 31) {
                    return new C14750wt(c13847mrArr[0]);
                }
                if (i == 32 || i == 34 || i == 35) {
                    return new C0915dt(c13847mrArr, abstractC14763x3M6978c5, abstractC14763x3M6988m9);
                }
                switch (i) {
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                        return new zwj(c13847mrArr, abstractC14763x3M6978c5, abstractC14763x3M6988m9);
                    default:
                        switch (i) {
                            case 47:
                            case 48:
                            case 49:
                                return new C0829bs(c13847mrArr, abstractC14763x3M6978c5, abstractC14763x3M6988m9);
                            default:
                                switch (i) {
                                    case 53:
                                    case 54:
                                    case 55:
                                    case 56:
                                    case 57:
                                        return new x3l(c13847mrArr, abstractC14763x3M6978c5, abstractC14763x3M6988m9);
                                    case 58:
                                    case 59:
                                    case 60:
                                    case 61:
                                        return new ks0(c13847mrArr, abstractC14763x3M6978c5, abstractC14763x3M6988m9);
                                    default:
                                        switch (i) {
                                            case 66:
                                            case 67:
                                                return new C14840ya(c13847mrArr);
                                            case 68:
                                            case 69:
                                                return new C14266p4(c13847mrArr, abstractC14763x3M6978c5, abstractC14763x3M6988m9);
                                            case 70:
                                            case 71:
                                            case 72:
                                                return new mip(c13847mrArr, abstractC14763x3M6978c5, abstractC14763x3M6988m9);
                                            default:
                                                switch (i) {
                                                    case 74:
                                                        return new ilt(c13847mrArr[0]);
                                                    case 75:
                                                        return new fov(c13847mrArr[0]);
                                                    case 76:
                                                        return new C14216o6(c13847mrArr, abstractC14763x3M6978c5, abstractC14763x3M6988m9);
                                                    case 77:
                                                        return new lwh(c13847mrArr, abstractC14763x3M6978c5, abstractC14763x3M6988m9);
                                                    case 78:
                                                        return new C13740kn(c13847mrArr, abstractC14763x3M6978c5, abstractC14763x3M6988m9);
                                                    case 79:
                                                        return new zoh(c13847mrArr, abstractC14763x3M6978c5, abstractC14763x3M6988m9);
                                                    case 80:
                                                        return new C13671j3(c13847mrArr[0], abstractC14763x3M6978c5);
                                                    default:
                                                        return null;
                                                }
                                        }
                                }
                        }
                }
            }
        }
        return new pbg(c13847mrArr[0]);
    }

    /* JADX INFO: renamed from: k4 */
    private void m6986k4(List<KeyValuePair<C1184k4, List<C13847mr>>> list) {
        List.Enumerator<KeyValuePair<C1184k4, List<C13847mr>>> it = list.iterator();
        while (it.hasNext()) {
            try {
                KeyValuePair<C1184k4, List<C13847mr>> next = it.next();
                AbstractC14770x9 abstractC14770x9M6985k4 = m6985k4(next.getKey().f5396k4, next.getValue().toArray(new C13847mr[0]));
                if (abstractC14770x9M6985k4 != null) {
                    this.f5394kk.addItem(abstractC14770x9M6985k4);
                    m73215k4(abstractC14770x9M6985k4);
                }
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
    }

    @Override // com.aspose.slides.AbstractC14770x9
    /* JADX INFO: renamed from: k4 */
    public void mo3225k4(C14713vw c14713vw) {
        mxy mxyVarM6984k4 = m6984k4((mxy) c14713vw);
        List.Enumerator<AbstractC14770x9> it = this.f5394kk.iterator();
        while (it.hasNext()) {
            try {
                it.next().m73210fa(mxyVarM6984k4);
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m6991k4(AbstractC14763x3 abstractC14763x3, double[] dArr, double[] dArr2) {
        double d;
        double d2;
        List<ixg> listM6982k4 = m6982k4(abstractC14763x3);
        double d3 = 0.0d;
        if (listM6982k4.size() == 0) {
            dArr[0] = 0.0d;
            dArr2[0] = 0.0d;
            return;
        }
        if (listM6982k4.get_Item(0).f45394x1 == abstractC14763x3) {
            listM6982k4.get_Item(0).m63151k4(dArr, dArr2);
        } else {
            listM6982k4.get_Item(0).m63154x1(dArr, dArr2);
        }
        if (listM6982k4.size() > 1) {
            double d4 = 0.0d;
            for (int i = 1; i < listM6982k4.size(); i++) {
                if (listM6982k4.get_Item(i).f45394x1 == abstractC14763x3) {
                    double[] dArr3 = {d3};
                    double[] dArr4 = {d4};
                    listM6982k4.get_Item(i).m63151k4(dArr3, dArr4);
                    d = dArr3[0];
                    d2 = dArr4[0];
                } else {
                    double[] dArr5 = {d3};
                    double[] dArr6 = {d4};
                    listM6982k4.get_Item(i).m63154x1(dArr5, dArr6);
                    d = dArr5[0];
                    d2 = dArr6[0];
                }
                d3 = d;
                d4 = d2;
                if (d3 < dArr[0]) {
                    dArr[0] = d3;
                }
                if (d4 > dArr2[0]) {
                    dArr2[0] = d4;
                }
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    private static boolean m6987k4(ChartSeries chartSeries) {
        int position;
        if (chartSeries == null) {
            throw new ArgumentNullException("series");
        }
        IDataLabelCollection labels = chartSeries.getLabels();
        if (labels.isVisible() && labels.getCount() != 0) {
            return chartSeries.getType() == 66 || chartSeries.getType() == 67 || (position = labels.getDefaultDataLabelFormat().getPosition()) == 6 || position == 1 || position == -1;
        }
        return false;
    }
}
