package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.internal.p077d8.C3085sv;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p463vm.C11697x1;
import com.aspose.slides.internal.p475wh.C12003du;
import com.aspose.slides.internal.p475wh.C12013m9;
import com.aspose.slides.internal.p475wh.C12015qq;
import com.aspose.slides.p559ms.System.AbstractC14041ai;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.C14064he;
import com.aspose.slides.p559ms.System.C14080ne;
import com.aspose.slides.p559ms.System.C14084qq;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.IDisposable;
import com.aspose.words.ControlChar;
import com.microsoft.identity.common.java.cache.CacheKeyValueDelegate;
import com.orion.notein.richeditor.utils.p606io.IOUtils;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
class nxm extends xhm {

    /* JADX INFO: renamed from: h4 */
    private int f47640h4;

    /* JADX INFO: renamed from: kk */
    private Object f47641kk;

    /* JADX INFO: renamed from: m9 */
    private AbstractC14763x3 f47642m9;

    /* JADX INFO: renamed from: to */
    private boolean f47643to;

    /* JADX INFO: renamed from: x1 */
    private Object f47644x1;

    /* JADX INFO: renamed from: du */
    private float f47638du = Float.NaN;

    /* JADX INFO: renamed from: dy */
    private String[] f47639dy = {"m/d/yyyy"};

    /* JADX INFO: renamed from: c5 */
    private C12015qq f47637c5 = new C12015qq();

    public nxm(Object obj, AbstractC14763x3 abstractC14763x3) {
        this.f47642m9 = abstractC14763x3;
        m68256k4(obj);
        m68261x1(obj);
    }

    /* JADX INFO: renamed from: k4 */
    public static C14084qq m68243k4(double d, boolean z) {
        if (d > 2958465.99d) {
            return C14084qq.f47293kk;
        }
        if (z) {
            d += 1462.0d;
        }
        if (d < 60.0d) {
            d += 1.0d;
        }
        return C14084qq.m67111m9(d);
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x0170  */
    /* JADX INFO: renamed from: rv */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private String m68245rv() {
        C0968ex c0968exM538to;
        String numberFormat = this.f47642m9.m73026k4().m73384dy().getNumberFormat();
        if (this.f47642m9.m73026k4().m73384dy().isNumberFormatLinkedToSource()) {
            ChartCategoryCollection chartCategoryCollection = (ChartCategoryCollection) (this.f47642m9.f49908x1.get_Item(0).m64945h4().getPlotOnSecondAxis() ? this.f47642m9.m73026k4().m73423wy().m69834fa().getChartData().getSecondaryCategories() : this.f47642m9.m73026k4().m73423wy().m69834fa().getChartData().getCategories());
            if (C14113y2.m67411k4(chartCategoryCollection.m538to().m5743k4())) {
                numberFormat = "General";
            } else {
                c0968exM538to = chartCategoryCollection.m538to();
                numberFormat = c0968exM538to.m5743k4();
            }
        } else if ("".equals(numberFormat) || "General".equals(numberFormat)) {
            ChartCategoryCollection chartCategoryCollection2 = (ChartCategoryCollection) (this.f47642m9.f49908x1.get_Item(0).m64945h4().getPlotOnSecondAxis() ? this.f47642m9.m73026k4().m73423wy().m69834fa().getChartData().getSecondaryCategories() : this.f47642m9.m73026k4().m73423wy().m69834fa().getChartData().getCategories());
            if (!"".equals(chartCategoryCollection2.m538to().m5743k4()) && !"General".equals(chartCategoryCollection2.m538to().m5743k4())) {
                c0968exM538to = chartCategoryCollection2.m538to();
                numberFormat = c0968exM538to.m5743k4();
            }
        }
        C14084qq c14084qqClone = m68243k4(C14080ne.m66998m9(m68259m9()), false).Clone();
        String str = "yyyy";
        if (!"".equals(numberFormat)) {
            if (!m68244k4(numberFormat)) {
                numberFormat = C11697x1.m55252to().m55261du().m55193ne();
            }
            try {
                c14084qqClone.m67140k4(numberFormat);
                str = numberFormat;
            } catch (RuntimeException e) {
                C3085sv.m13082k4(e);
                if (this.f47642m9.m73026k4().m73384dy().getBaseUnitScale() == 1) {
                    str = "m/d/yyyy";
                } else if (this.f47642m9.m73026k4().m73384dy().getBaseUnitScale() == 2) {
                }
            }
        } else if (this.f47642m9.m73026k4().m73384dy().getBaseUnitScale() == 1) {
            str = "M/d/yyyy";
        } else if (this.f47642m9.m73026k4().m73384dy().getBaseUnitScale() == 2) {
            str = "MMM-yy";
        }
        return "General".equals(str) ? m68259m9().toString() : C14337qc.m69515k4((Object) c14084qqClone.Clone(), str, false);
    }

    /* JADX INFO: renamed from: x6 */
    private String m68246x6() {
        if (!C7019kk.m27469x1(this.f47642m9, nzw.class)) {
            return this.f47642m9.m73026k4().m73384dy().getNumberFormat();
        }
        ChartCategoryCollection chartCategoryCollection = (ChartCategoryCollection) (this.f47642m9.f49908x1.get_Item(0).m64945h4().getPlotOnSecondAxis() ? this.f47642m9.m73026k4().m73423wy().m69834fa().getChartData().getSecondaryCategories() : this.f47642m9.m73026k4().m73423wy().m69834fa().getChartData().getCategories());
        String strM5743k4 = C14113y2.m67411k4(chartCategoryCollection.m538to().m5743k4()) ? "General" : chartCategoryCollection.m538to().m5743k4();
        return !m68244k4(strM5743k4) ? C11697x1.m55252to().m55261du().m55193ne() : strM5743k4;
    }

    @Override // com.aspose.slides.AbstractC14770x9
    /* JADX INFO: renamed from: O_ */
    public int mo3480O_() {
        return 5;
    }

    /* JADX INFO: renamed from: c5 */
    public final boolean m68247c5() {
        return this.f47643to;
    }

    /* JADX INFO: renamed from: ck */
    public final String m68248ck() {
        return C7019kk.m27469x1(this.f47642m9, ValueAxisBase.class) ? C0841c4.m4467k4(Double.valueOf(((Double) C7019kk.m27464to(m68259m9(), Double.TYPE)).doubleValue() * this.f47642m9.m73026k4().m73379dq()), this.f47642m9) : C0841c4.m4468k4(m68250dy(), this.f47642m9.m73026k4());
    }

    @Override // com.aspose.slides.xhm
    /* JADX INFO: renamed from: du */
    public C12003du mo4317du() {
        return C13729ki.m63876k4(m68259m9(), this.f47642m9.m73026k4().m73384dy().getNumberFormat(), this.f47642m9.m73026k4().m73413to().Clone());
    }

    /* JADX INFO: renamed from: dy */
    public final Object m68250dy() {
        return this.f47641kk;
    }

    /* JADX INFO: renamed from: fa */
    public final float m68251fa() {
        return this.f47638du;
    }

    @Override // com.aspose.slides.xhm
    /* JADX INFO: renamed from: h4 */
    public float mo4318h4() {
        return !C14064he.m66715kk(m68251fa()) ? m68251fa() : this.f47642m9.m73026k4().m73386h4();
    }

    /* JADX INFO: renamed from: jd */
    public final String m68253jd() {
        return (!C7019kk.m27469x1(this.f47642m9, AbstractC14464sp.class) || m68247c5()) ? C7019kk.m27469x1(m68259m9(), String.class) ? (String) m68259m9() : C14337qc.m69515k4(m68259m9(), m68246x6(), false) : m68245rv();
    }

    /* JADX INFO: renamed from: kk */
    public final oju m68258kk(C14713vw c14713vw) {
        String strM68253jd = m68253jd();
        return strM68253jd == null ? oju.f47834kk : m73363k4(strM68253jd, c14713vw.m72555k4(), c14713vw.m72556x1());
    }

    /* JADX INFO: renamed from: m9 */
    public final Object m68259m9() {
        return this.f47644x1;
    }

    @Override // com.aspose.slides.xhm
    /* JADX INFO: renamed from: to */
    public C12013m9 mo4321to() {
        return this.f47642m9.m73026k4().m73425x1();
    }

    /* JADX INFO: renamed from: up */
    public final int m68260up() {
        return this.f47640h4;
    }

    @Override // com.aspose.slides.xhm, com.aspose.slides.AbstractC14770x9
    /* JADX INFO: renamed from: x1 */
    public void mo3482x1() {
        if (mo3221T_()) {
            super.mo3482x1();
        }
    }

    /* JADX INFO: renamed from: du */
    public final C12015qq m68249du(C14713vw c14713vw) {
        C12015qq c12015qq;
        if (!this.f47637c5.m56696k4()) {
            return this.f47637c5;
        }
        String strM68253jd = m68253jd();
        float f = 0.0f;
        if (strM68253jd == null) {
            c12015qq = new C12015qq(0.0f, 0.0f);
        } else {
            if (C7019kk.m27469x1(this.f47642m9, AbstractC14265p3.class) && ((AbstractC14265p3) this.f47642m9).m68931v4() && this.f47642m9.m73026k4().m73376bv() == 1) {
                strM68253jd = C14113y2.m67401k4(strM68253jd, CacheKeyValueDelegate.CACHE_VALUE_SEPARATOR, "- ");
            }
            float f2 = 0.0f;
            for (String str : C14113y2.m67416k4(C14113y2.m67401k4(C14113y2.m67401k4(strM68253jd, IOUtils.LINE_SEPARATOR_UNIX, " "), IOUtils.LINE_SEPARATOR_WINDOWS, " "), new char[]{ControlChar.SPACE_CHAR}, (short) 1)) {
                oju ojuVarClone = m73363k4(str, c14713vw.m72555k4(), c14713vw.m72556x1()).Clone();
                float f3 = ojuVarClone.f47836k4;
                if (f3 > f) {
                    f = f3;
                }
                float f4 = ojuVarClone.f47837x1;
                if (f4 > f2) {
                    f2 = f4;
                }
            }
            c12015qq = new C12015qq(f, f2);
        }
        this.f47637c5 = c12015qq;
        return c12015qq;
    }

    /* JADX INFO: renamed from: h4 */
    public final oju m68252h4(C14713vw c14713vw) {
        return m73363k4(m68248ck(), c14713vw.m72555k4(), c14713vw.m72556x1());
    }

    /* JADX INFO: renamed from: k4 */
    public final void m68254k4(float f) {
        this.f47638du = f;
    }

    @Override // com.aspose.slides.AbstractC14770x9
    /* JADX INFO: renamed from: to */
    public void mo3230to(C14713vw c14713vw) {
    }

    @Override // com.aspose.slides.AbstractC14770x9
    /* JADX INFO: renamed from: x1 */
    public void mo3231x1(C14713vw c14713vw) {
    }

    /* JADX INFO: renamed from: k4 */
    public final void m68255k4(int i) {
        this.f47640h4 = i;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m68261x1(Object obj) {
        this.f47641kk = obj;
    }

    @Override // com.aspose.slides.xhm
    /* JADX INFO: renamed from: k4 */
    public void mo4319k4(AutoShape autoShape) {
        m73365k4(this.f47642m9.m73026k4().m73384dy().getTextFormat());
        if (this.f47642m9.m73026k4().m73384dy().getTextFormat().getTextBlockFormat().getTextVerticalType() != -1) {
            autoShape.getTextFrame().getTextFrameFormat().setTextVerticalType(this.f47642m9.m73026k4().m73384dy().getTextFormat().getTextBlockFormat().getTextVerticalType());
        }
        IGenericEnumerator<IParagraph> it = autoShape.getTextFrame().getParagraphs().iterator();
        while (it.hasNext()) {
            try {
                IParagraphFormat paragraphFormat = it.next().getParagraphFormat();
                if (this.f47642m9.m73026k4().m73384dy().getTextFormat().getParagraphFormat().getAlignment() != -1) {
                    paragraphFormat.setAlignment(this.f47642m9.m73026k4().m73384dy().getTextFormat().getParagraphFormat().getAlignment());
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
        oju ojuVar = new oju();
        if (C14113y2.m67411k4(m68253jd()) && c14713vw.m72555k4() == 0.0f && c14713vw.m72556x1() == 0.0f) {
            AutoShape autoShape = ((xhm) this).f50079k4;
            ojuVar = new oju(0.0f, autoShape != null ? autoShape.getHeight() : 0.0f);
        } else {
            (C7019kk.m27469x1(this.f47642m9, ValueAxisBase.class) ? m68252h4(c14713vw) : m68258kk(c14713vw)).CloneTo(ojuVar);
        }
        m73214k4(ojuVar.Clone());
    }

    /* JADX INFO: renamed from: k4 */
    public final void m68256k4(Object obj) {
        this.f47644x1 = obj;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m68257k4(boolean z) {
        this.f47643to = z;
    }

    /* JADX INFO: renamed from: k4 */
    private boolean m68244k4(final String str) {
        return !AbstractC14092to.m67242k4((Object[]) this.f47639dy, (AbstractC14041ai) new AbstractC14041ai<String>() { // from class: com.aspose.slides.nxm.1
            @Override // com.aspose.slides.p559ms.System.AbstractC14041ai
            /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
            public boolean invoke(String str2) {
                return C14113y2.m67363du(str2, str);
            }
        });
    }
}
