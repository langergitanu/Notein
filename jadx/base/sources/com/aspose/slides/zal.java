package com.aspose.slides;

import Oooo0.C20856OooooOo;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p475wh.C12003du;
import com.aspose.slides.internal.p475wh.C12013m9;
import com.aspose.slides.p559ms.System.C14057f9;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
class zal {

    /* JADX INFO: renamed from: k4 */
    C1189h8 f50511k4;

    /* JADX INFO: renamed from: kk */
    private List<s8k> f50512kk;

    /* JADX INFO: renamed from: to */
    private C14365qy f50513to;

    /* JADX INFO: renamed from: x1 */
    private boolean f50514x1 = true;

    public zal(Legend legend, C14365qy c14365qy) {
        this.f50513to = c14365qy;
        this.f50511k4 = new C1189h8((Format) legend.getFormat(), c14365qy, legend);
        if (ChartTypeCharacterizer.is3DChart(c14365qy.m69834fa().getType())) {
            this.f50512kk = new List<>();
            m74380k4(legend, c14365qy);
        }
    }

    /* JADX INFO: renamed from: rv */
    private boolean m74371rv() {
        List.Enumerator<s8k> it = m74386up().iterator();
        while (it.hasNext()) {
            try {
                s8k next = it.next();
                if (next.m70489x1() == 1) {
                    C13847mr c13847mrM70488to = next.m70488to();
                    if (c13847mrM70488to != null && ChartTypeCharacterizer.m766m9(c13847mrM70488to.m64945h4().getType()) && c13847mrM70488to.m64945h4().getFormat().getLine().getDashStyle() != 0 && c13847mrM70488to.m64945h4().getFormat().getLine().getDashStyle() != -1) {
                        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                            it.dispose();
                        }
                        return true;
                    }
                } else {
                    z3t z3tVarM70487kk = next.m70487kk();
                    if (z3tVarM70487kk != null && z3tVarM70487kk.m74307kk().getFormat().getLine().getDashStyle() != 0 && z3tVarM70487kk.m74307kk().getFormat().getLine().getDashStyle() != -1) {
                        return true;
                    }
                }
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        if (!C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
            return false;
        }
        it.dispose();
        return false;
    }

    /* JADX INFO: renamed from: c5 */
    public final float m74372c5() {
        float fM74374du = m74374du() * 0.25f;
        if (fM74374du < 2.0f) {
            return -2.0f;
        }
        return -fM74374du;
    }

    /* JADX INFO: renamed from: ck */
    public final float m74373ck() {
        m74382kk().m56639dy();
        float fM74374du = m74374du() * (m74379k4().m56639dy() <= 6.0f ? 0.0f : (m74382kk().m56639dy() * 0.02f) + 0.01f);
        if (fM74374du > 10.0f) {
            return -10.0f;
        }
        return -fM74374du;
    }

    /* JADX INFO: renamed from: du */
    public final int m74374du() {
        return C0840c3.m4431k4(m74382kk());
    }

    /* JADX INFO: renamed from: dy */
    public final int m74375dy() {
        int iM63759kk = kc0.m63759kk(m74374du() * (m74379k4().m56639dy() <= 6.0f ? 0.6f : 0.465f));
        if (iM63759kk < 3) {
            return 3;
        }
        return iM63759kk;
    }

    /* JADX INFO: renamed from: fa */
    public final boolean m74376fa() {
        return gfh.m6622k4(this.f50513to.m69834fa());
    }

    /* JADX INFO: renamed from: h4 */
    public final int m74377h4() {
        return kc0.m63759kk(C0840c3.m4431k4(m74382kk()) * 0.2f);
    }

    /* JADX INFO: renamed from: jd */
    public final int m74378jd() {
        return m74371rv() ? 24 : 18;
    }

    /* JADX INFO: renamed from: k4 */
    public final C12013m9 m74379k4() {
        Chart chartM69834fa = this.f50513to.m69834fa();
        return chartM69834fa.m509k4(((Legend) C7019kk.m27452k4((Object) chartM69834fa.getLegend(), Legend.class)).getTextFormat());
    }

    /* JADX INFO: renamed from: kk */
    public final C12013m9 m74382kk() {
        return C12013m9.m56630k4(m74379k4().m56651x1(), (m74379k4().m56639dy() * 0.75f) / im9.m7679k4(), m74379k4().m56642jd());
    }

    /* JADX INFO: renamed from: ks */
    public final int m74383ks() {
        List.Enumerator<s8k> it = this.f50512kk.iterator();
        int i = 0;
        while (it.hasNext()) {
            try {
                if (!it.next().m70479du().getHide()) {
                    i++;
                }
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        return i;
    }

    /* JADX INFO: renamed from: m9 */
    public final int m74384m9() {
        int iM63759kk = kc0.m63759kk(C0840c3.m4431k4(m74382kk()) * 0.2f);
        if (iM63759kk < 4) {
            return 4;
        }
        return iM63759kk;
    }

    /* JADX INFO: renamed from: to */
    public final boolean m74385to() {
        return this.f50514x1;
    }

    /* JADX INFO: renamed from: up */
    public final List<s8k> m74386up() {
        return this.f50512kk;
    }

    /* JADX INFO: renamed from: x1 */
    public final C12003du m74387x1() {
        Chart chartM69834fa = this.f50513to.m69834fa();
        return chartM69834fa.m507k4(((Legend) C7019kk.m27452k4((Object) chartM69834fa.getLegend(), Legend.class)).getTextFormat(), chartM69834fa.m506k4(chartM69834fa.getStyle() + 1 <= 40 ? (byte) 0 : (byte) 1).Clone().Clone());
    }

    /* JADX INFO: renamed from: yj */
    public final boolean m74388yj() {
        if (m74386up() == null) {
            return false;
        }
        List.Enumerator<s8k> it = m74386up().iterator();
        while (it.hasNext()) {
            try {
                s8k next = it.next();
                if (next.m70489x1() == 2) {
                    return true;
                }
                if (next.m70489x1() == 1 && ChartTypeCharacterizer.m766m9(next.m70488to().m64945h4().getType())) {
                    if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                        it.dispose();
                    }
                    return true;
                }
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
            it.dispose();
        }
        return false;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m74380k4(Legend legend, C14365qy c14365qy) {
        if (c14365qy.m69834fa().getChartData().getSeries().size() == 0) {
            return;
        }
        List<C13847mr> listM69865up = c14365qy.m69865up();
        int i = 0;
        if (gfh.m6622k4(c14365qy.m69834fa()) || ChartTypeCharacterizer.isChartTypePie(c14365qy.m69834fa().getChartData().getSeries().get_Item(0).getType()) || ChartTypeCharacterizer.isChartTypeDoughnut(c14365qy.m69834fa().getChartData().getSeries().get_Item(0).getType())) {
            while (i < c14365qy.m69834fa().getLegend().getEntries().getCount()) {
                m74386up().addItem(new s8k((LegendEntryProperties) legend.getEntries().get_Item(i)));
                i++;
            }
            return;
        }
        if (C14164n2.m67859x1(c14365qy.m69834fa())) {
            m74386up().clear();
            C13847mr c13847mr = c14365qy.m69865up().get_Item(0);
            List list = new List();
            C12003du[] c12003duArrM73773k4 = y9j.m73773k4(c14365qy.m69834fa());
            if (c14365qy.m69863u4() == null || c14365qy.m69863u4().f50098m9.size() <= 0) {
                for (int i2 = 0; i2 < c12003duArrM73773k4.length; i2++) {
                    list.addItem(C14057f9.m66591x1(i2));
                }
            } else {
                list.clear();
                C14787xi c14787xiM69863u4 = c14365qy.m69863u4();
                String str = C14113y2.f47374k4;
                for (int size = c14365qy.m69863u4().f50098m9.size() - 1; size >= 0; size--) {
                    Double d = (Double) C7019kk.m27464to(c14365qy.m69863u4().f50098m9.get_Item(size), Double.TYPE);
                    d.doubleValue();
                    list.addItem(c14787xiM69863u4.m73385fa() ? C13729ki.m63880k4((Object) d, str, false) : C0841c4.m4468k4(d, c14787xiM69863u4));
                }
            }
            while (i < list.size() - 1) {
                int iOooO00o = (legend.getPosition() == 1 || legend.getPosition() == 2) ? C20856OooooOo.OooO00o(2, i, list) : i;
                String strM67402k4 = C14113y2.m67402k4("{0}-{1}", list.get_Item(iOooO00o), list.get_Item(iOooO00o + 1));
                s8k s8kVar = new s8k((LegendEntryProperties) legend.getEntries().get_Item(c13847mr.m64963x1()));
                s8kVar.m70486k4(strM67402k4);
                s8kVar.m70482k4(1);
                s8kVar.m70484k4(c13847mr);
                s8kVar.m70483k4(c12003duArrM73773k4[iOooO00o].Clone());
                m74386up().addItem(s8kVar);
                i++;
            }
            return;
        }
        boolean z = true;
        for (int i3 = 0; i3 < listM69865up.size(); i3++) {
            C13847mr c13847mr2 = c14365qy.m69865up().get_Item(i3);
            if (i3 == 0 && c13847mr2.m64945h4().getPlotOnSecondAxis()) {
                z = false;
            }
            LegendEntryProperties legendEntryProperties = (LegendEntryProperties) legend.getEntries().get_Item(c13847mr2.m64963x1());
            if (!legendEntryProperties.getHide() && c13847mr2.m64944dy().size() > 0) {
                s8k s8kVar2 = new s8k(legendEntryProperties);
                s8kVar2.m70486k4(c13847mr2.m64957kk());
                s8kVar2.m70482k4(1);
                s8kVar2.m70484k4(c13847mr2);
                m74386up().addItem(s8kVar2);
            }
            if ((!c13847mr2.m64945h4().getPlotOnSecondAxis() && z) || (c13847mr2.m64945h4().getPlotOnSecondAxis() && !z)) {
                List.Enumerator<z3t> it = c13847mr2.m64943du().iterator();
                while (it.hasNext()) {
                    try {
                        z3t next = it.next();
                        s8k s8kVar3 = new s8k((Chart) legend.getChart());
                        s8kVar3.m70486k4(next.m74308to());
                        s8kVar3.m70482k4(2);
                        s8kVar3.m70484k4(c13847mr2);
                        s8kVar3.m70485k4(next);
                        m74386up().addItem(s8kVar3);
                    } finally {
                        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                            it.dispose();
                        }
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m74381k4(boolean z) {
        this.f50514x1 = z;
    }
}
