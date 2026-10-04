package com.aspose.slides;

import OooOoO.C20503OooO00o;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.KeyValuePair;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p077d8.C3085sv;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p475wh.C12003du;
import com.aspose.slides.internal.p475wh.C12007ix;
import com.aspose.slides.internal.p475wh.C12015qq;
import com.aspose.slides.p559ms.System.C14064he;
import com.aspose.slides.p559ms.System.C14080ne;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.C14116yg;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
class ygk extends AbstractC14770x9 {

    /* JADX INFO: renamed from: du */
    private boolean f50347du;

    /* JADX INFO: renamed from: h4 */
    private float f50350h4;

    /* JADX INFO: renamed from: k4 */
    private final C14365qy f50352k4;

    /* JADX INFO: renamed from: kk */
    private float f50353kk;

    /* JADX INFO: renamed from: m9 */
    private int f50354m9;

    /* JADX INFO: renamed from: to */
    private float f50355to;

    /* JADX INFO: renamed from: x1 */
    private a4w[] f50356x1;

    /* JADX INFO: renamed from: dy */
    private float f50348dy = Float.NaN;

    /* JADX INFO: renamed from: c5 */
    private float f50345c5 = Float.NaN;

    /* JADX INFO: renamed from: jd */
    private float f50351jd = Float.NaN;

    /* JADX INFO: renamed from: ck */
    private float f50346ck = Float.NaN;

    /* JADX INFO: renamed from: fa */
    private float f50349fa = Float.NaN;

    /* JADX WARN: Removed duplicated region for block: B:54:0x011f A[PHI: r1
      0x011f: PHI (r1v10 com.aspose.slides.Collections.Generic.List$Enumerator<com.aspose.slides.mr>) = 
      (r1v9 com.aspose.slides.Collections.Generic.List$Enumerator<com.aspose.slides.mr>)
      (r1v30 com.aspose.slides.Collections.Generic.List$Enumerator<com.aspose.slides.mr>)
     binds: [B:53:0x011d, B:16:0x007c] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ygk(C14365qy c14365qy) {
        List.Enumerator<C13847mr> it;
        this.f50354m9 = 0;
        this.f50352k4 = c14365qy;
        if (c14365qy.m69865up().size() > 0) {
            this.f50347du = m73875k4(c14365qy.m69834fa().getChartData().getSeries());
            List<C13847mr> listM73870k4 = m73870k4(c14365qy.m69865up());
            C13847mr c13847mr = listM73870k4.get_Item(0);
            List list = new List();
            if (this.f50347du) {
                it = c13847mr.m64944dy().iterator();
                while (it.hasNext()) {
                    try {
                        C0886d8 c0886d8 = (C0886d8) it.next();
                        LegendEntryProperties legendEntryProperties = (LegendEntryProperties) c0886d8.m4988jd().getRelatedLegendEntry();
                        if (!legendEntryProperties.getHide()) {
                            list.addItem(new C14222oc(legendEntryProperties, c0886d8));
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
            } else {
                for (int i = 0; i < listM73870k4.size(); i++) {
                    LegendEntryProperties legendEntryProperties2 = (LegendEntryProperties) c14365qy.m69865up().get_Item(i).m64945h4().getRelatedLegendEntry();
                    if (!legendEntryProperties2.getHide()) {
                        list.addItem(new alv(legendEntryProperties2, listM73870k4.get_Item(i)));
                    }
                }
                it = listM73870k4.iterator();
                while (it.hasNext()) {
                    try {
                        List.Enumerator<z3t> it2 = it.next().m64943du().iterator();
                        while (it2.hasNext()) {
                            try {
                                z3t next = it2.next();
                                LegendEntryProperties legendEntryProperties3 = (LegendEntryProperties) next.m74307kk().getRelatedLegendEntry();
                                if (!legendEntryProperties3.getHide()) {
                                    list.addItem(new wpc(legendEntryProperties3, next));
                                    if (this.f50354m9 != 2) {
                                        this.f50354m9 = 2;
                                    }
                                }
                            } catch (Throwable th) {
                                if (C7019kk.m27456k4((Iterator) it2, (Class<IDisposable>) IDisposable.class)) {
                                    it2.dispose();
                                }
                                throw th;
                            }
                        }
                        if (C7019kk.m27456k4((Iterator) it2, (Class<IDisposable>) IDisposable.class)) {
                            it2.dispose();
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                }
            }
            if (c13847mr.m64945h4().getType() == 74 || c13847mr.m64945h4().getType() == 75) {
                list.clear();
                ChartCategoryCollection chartCategoryCollection = (ChartCategoryCollection) c14365qy.m69834fa().getChartData().getCategories();
                if (chartCategoryCollection.size() == 0 || chartCategoryCollection.m539x1()) {
                    int i2 = 0;
                    while (i2 < c14365qy.m69834fa().getChartData().getSeries().get_Item(0).getDataPoints().size()) {
                        ChartDataPointLevel chartDataPointLevel = (ChartDataPointLevel) c14365qy.m69834fa().getChartData().getSeries().get_Item(0).getDataPoints().get_Item(i2).getDataPointLevels().get_Item(0);
                        i2++;
                        list.addItem(new C14698vq(new LegendEntryProperties((Legend) c14365qy.m69834fa().getLegend()), chartDataPointLevel, C14113y2.m67402k4("Branch {0}", Integer.valueOf(i2)), c14365qy));
                    }
                } else {
                    int groupingLevelCount = chartCategoryCollection.getGroupingLevelCount() - 1;
                    List<KeyValuePair<Integer, String>> listM532k4 = chartCategoryCollection.m532k4(groupingLevelCount);
                    for (int i3 = 0; i3 < listM532k4.size(); i3++) {
                        list.addItem(new C14698vq(new LegendEntryProperties((Legend) c14365qy.m69834fa().getLegend()), (ChartDataPointLevel) c13847mr.m64945h4().getDataPoints().get_Item(listM532k4.get_Item(i3).getKey().intValue()).getDataPointLevels().get_Item(groupingLevelCount), listM532k4.get_Item(i3).getValue(), c14365qy));
                    }
                }
            }
            if (c13847mr.m64945h4().getType() == 79) {
                list.clear();
                list.addItem(new alv(new LegendEntryProperties((Legend) c14365qy.m69834fa().getLegend()), c13847mr, "Increase"));
                list.addItem(new alv(new LegendEntryProperties((Legend) c14365qy.m69834fa().getLegend()), c13847mr, "Decrease"));
                list.addItem(new alv(new LegendEntryProperties((Legend) c14365qy.m69834fa().getLegend()), c13847mr, "Total"));
            }
            a4w[] a4wVarArr = (a4w[]) list.toArray(new a4w[0]);
            this.f50356x1 = a4wVarArr;
            for (a4w a4wVar : a4wVarArr) {
                m73215k4(a4wVar);
            }
        }
    }

    /* JADX INFO: renamed from: fa */
    private void m73869fa() {
        a4w[] a4wVarArr = this.f50356x1;
        int length = a4wVarArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            int iMo6844to = a4wVarArr[i].m3223dy().mo6844to();
            if (iMo6844to == 2) {
                this.f50354m9 = 2;
                break;
            }
            if (iMo6844to == 1 && this.f50354m9 != 1) {
                this.f50354m9 = 1;
            }
            i++;
        }
        int length2 = this.f50356x1.length;
        float fM67481k4 = 0.0f;
        for (int i2 = 0; i2 < length2; i2++) {
            fM67481k4 = C14116yg.m67481k4(r0[i2].m3228m9().m74300dy().m56638du(), fM67481k4);
        }
        this.f50350h4 = fM67481k4;
    }

    /* JADX INFO: renamed from: k4 */
    private List<C13847mr> m73870k4(List<C13847mr> list) {
        List<C13847mr> list2 = new List<>();
        C13847mr c13847mr = list.get_Item(0);
        List list3 = new List();
        int i = 0;
        while (i < list.size()) {
            int i2 = i + 1;
            boolean z = i2 == list.size();
            boolean z2 = list.get_Item(i).m64945h4().getType() != c13847mr.m64945h4().getType();
            if (z) {
                if (!z2) {
                    list3.addItem(list.get_Item(i));
                }
                if (m73883k4(c13847mr)) {
                    list3.reverse();
                }
                list2.addRange(list3);
                if (z2) {
                    list2.addItem(list.get_Item(i));
                }
            } else {
                if (z2) {
                    if (m73883k4(c13847mr)) {
                        list3.reverse();
                    }
                    list2.addRange(list3);
                    c13847mr = list.get_Item(i);
                    list3.clear();
                }
                list3.addItem(list.get_Item(i));
            }
            i = i2;
        }
        return list2;
    }

    /* JADX INFO: renamed from: kk */
    private C14713vw m73884kk(C14713vw c14713vw) {
        return new C14713vw(c14713vw.m72555k4() - ((m73893dy() ? 3.6f : 0.0f) * 2.0f), (c14713vw.m72556x1() - m73885ks()) - m73886rv());
    }

    /* JADX INFO: renamed from: ks */
    private float m73885ks() {
        return this.f50351jd;
    }

    /* JADX INFO: renamed from: rv */
    private float m73886rv() {
        return this.f50346ck;
    }

    /* JADX INFO: renamed from: up */
    private boolean m73887up() {
        Legend legendM73890yj = m73890yj();
        return (C14064he.m66715kk(legendM73890yj.getX()) || C14064he.m66715kk(legendM73890yj.getY()) || C14064he.m66715kk(legendM73890yj.getWidth()) || C14064he.m66715kk(legendM73890yj.getHeight())) ? false : true;
    }

    /* JADX INFO: renamed from: x1 */
    private C12015qq m73888x1(a4w[] a4wVarArr, float f, C14713vw c14713vw) {
        a4w[] a4wVarArr2 = a4wVarArr;
        int i = 0;
        int[] iArr = {0};
        int[] iArr2 = {0};
        C12015qq c12015qqClone = m73873k4(a4wVarArr2, c14713vw, iArr, iArr2).Clone();
        int i2 = iArr[0];
        int i3 = iArr2[0];
        float f2 = 0.2f * f;
        float f3 = i3;
        float fM67504x1 = C14116yg.m67504x1(C14116yg.m67481k4(5.0f, 3.0f + f2), (c14713vw.m72555k4() - (c12015qqClone.m56699x1() * f3)) / f3);
        float f4 = f2 + 3.5f;
        float fM73885ks = m73885ks();
        int i4 = 0;
        int i5 = 0;
        while (i4 < i2 && i5 < a4wVarArr2.length) {
            float fM56699x1 = 0.0f;
            int i6 = i;
            while (i6 < i3 && i5 < a4wVarArr2.length) {
                a4w a4wVar = a4wVarArr2[i5];
                a4wVar.m73208du(fM56699x1);
                int i7 = i3;
                a4wVar.m73212h4(C20503OooO00o.OooO0O0(c12015qqClone.m56697kk(), a4wVar.m73203ak(), 2.0f, fM73885ks));
                a4wVar.m73217kk(c12015qqClone.m56699x1());
                a4wVar.m73222to(c12015qqClone.m56697kk());
                a4wVar.m73220ss();
                fM56699x1 += c12015qqClone.m56699x1() + fM67504x1;
                a4wVar.m3227k4(fM73885ks > c14713vw.m72556x1());
                i6++;
                i5++;
                a4wVarArr2 = a4wVarArr;
                i3 = i7;
            }
            fM73885ks += c12015qqClone.m56697kk() + f4;
            i4++;
            a4wVarArr2 = a4wVarArr;
            i3 = i3;
            i = 0;
        }
        return new C12015qq((fM67504x1 * (i3 - 1)) + (c12015qqClone.m56699x1() * f3), (f4 * (i2 - 1)) + (c12015qqClone.m56697kk() * i2) + m73885ks() + m73886rv());
    }

    /* JADX INFO: renamed from: yj */
    private Legend m73890yj() {
        return (Legend) this.f50352k4.m69834fa().getLegend();
    }

    @Override // com.aspose.slides.AbstractC14770x9
    /* JADX INFO: renamed from: O_ */
    public int mo3480O_() {
        return 11;
    }

    /* JADX INFO: renamed from: c5 */
    public final int m73891c5() {
        return this.f50354m9;
    }

    /* JADX INFO: renamed from: ck */
    public final float m73892ck() {
        return this.f50350h4 * 0.36f;
    }

    /* JADX INFO: renamed from: dy */
    public final boolean m73893dy() {
        int iM73896to = m73896to();
        return iM73896to == 1 || iM73896to == 2 || iM73896to == 4;
    }

    /* JADX INFO: renamed from: jd */
    public final float m73894jd() {
        return this.f50350h4;
    }

    /* JADX INFO: renamed from: m9 */
    public final boolean m73895m9() {
        return m73890yj().getOverlay();
    }

    /* JADX INFO: renamed from: to */
    public final int m73896to() {
        return m73890yj().getPosition();
    }

    /* JADX INFO: renamed from: k4 */
    private C12015qq m73871k4(a4w[] a4wVarArr, float f, C14713vw c14713vw) {
        float fM73225wy = 0.0f;
        float fM67481k4 = 0.0f;
        for (a4w a4wVar : a4wVarArr) {
            fM73225wy += a4wVar.m73225wy();
            fM67481k4 = C14116yg.m67481k4(fM67481k4, a4wVar.m73203ak());
        }
        if (fM73225wy > c14713vw.m72555k4()) {
            return m73888x1(a4wVarArr, f, c14713vw);
        }
        float fM73885ks = m73885ks();
        boolean z = this.f50352k4.m69865up().size() == 1 && ChartTypeCharacterizer.isChartTypePie(this.f50352k4.m69865up().get_Item(0).m64945h4().getType());
        float fM67504x1 = C14116yg.m67504x1((f * 0.4f) + 2.0f, (c14713vw.m72555k4() - fM73225wy) / a4wVarArr.length);
        float fM73225wy2 = fM67504x1;
        for (a4w a4wVar2 : a4wVarArr) {
            if (a4wVar2.mo3221T_()) {
                a4wVar2.m73208du(fM73225wy2);
                a4wVar2.m73212h4(C20503OooO00o.OooO0O0(fM67481k4, a4wVar2.m73203ak(), 2.0f, fM73885ks));
                fM73225wy2 += a4wVar2.m73225wy() + fM67504x1;
            }
            a4wVar2.m73220ss();
        }
        float f2 = fM73225wy2 - fM67504x1;
        if (!z) {
            f2 += fM67504x1;
        }
        return new C12015qq(f2, m73885ks() + fM67481k4 + m73886rv());
    }

    @Override // com.aspose.slides.AbstractC14770x9
    /* JADX INFO: renamed from: to */
    public void mo3230to(C14713vw c14713vw) {
        if (this.f50356x1.length == 0) {
            m73217kk(0.0f);
            m73222to(0.0f);
        }
        if (m73887up()) {
            alc alcVar = (alc) c14713vw;
            this.f50353kk = alcVar.m3660kk();
            this.f50355to = alcVar.m3661m9();
            C14713vw c14713vw2 = new C14713vw(this.f50353kk, this.f50355to - 4.0f);
            for (a4w a4wVar : this.f50356x1) {
                a4wVar.m3227k4(false);
                a4wVar.m73210fa(c14713vw2);
            }
            m73889x1(this.f50356x1, new C14713vw(alcVar.m3660kk(), alcVar.m3661m9()));
        }
    }

    @Override // com.aspose.slides.AbstractC14770x9
    /* JADX INFO: renamed from: x1 */
    public void mo3482x1() {
        C12007ix c12007ix = new C12007ix(m73218lr().m73227xk(), m73218lr().m73206c6(), m73218lr().m73225wy(), m73218lr().m73203ak());
        C14851yl c14851yl = new C14851yl(this.f50352k4);
        c14851yl.m73924k4(c12007ix.Clone());
        try {
            C12007ix c12007ixClone = (m73887up() ? new C12007ix(m73227xk(), m73206c6(), this.f50353kk, this.f50355to) : m73209e0()).Clone();
            ILegend legend = this.f50352k4.m69834fa().getLegend();
            if (c12007ixClone.m56550c5() > 0.0f && c12007ixClone.m56575x1() > 0.0f) {
                im9.m7720x1(C12003du.f40505to.Clone(), C12003du.f40505to.Clone(), this.f50352k4, c12007ixClone.Clone(), (LineFormat) legend.getFormat().getLine(), (FillFormat) legend.getFormat().getFill(), legend.getFormat().getEffect());
                if (!im9.m7716k4(c12007ixClone.Clone(), c12007ixClone.Clone(), this.f50352k4, m73890yj().getFormat().getEffect3D(), (FillFormat) legend.getFormat().getFill(), (LineFormat) legend.getFormat().getLine(), C12003du.f40505to.Clone(), C12003du.f40505to.Clone())) {
                    im9.m7700k4(C12003du.f40505to.Clone(), C12003du.f40505to.Clone(), this.f50352k4, c12007ixClone.Clone(), (LineFormat) legend.getFormat().getLine(), (FillFormat) legend.getFormat().getFill(), legend.getFormat().getEffect());
                }
            }
            c14851yl.m73923k4();
        } catch (Throwable th) {
            c14851yl.m73923k4();
            throw th;
        }
    }

    /* JADX INFO: renamed from: k4 */
    private C12015qq m73872k4(a4w[] a4wVarArr, C14713vw c14713vw) {
        float fM67481k4 = 0.0f;
        float fM67481k42 = 0.0f;
        for (a4w a4wVar : a4wVarArr) {
            fM67481k4 = C14116yg.m67481k4(fM67481k4, a4wVar.m73203ak());
            fM67481k42 = C14116yg.m67481k4(fM67481k42, a4wVar.m73225wy());
        }
        float fM73885ks = m73885ks();
        float fM67481k43 = m73874k4(fM67481k4 / 2.0f) ? 2.0f : C14116yg.m67481k4(2.0f, (1.0f / fM67481k4) * 20.0f) + 4.0f;
        float fM67481k44 = 0.0f;
        float fM67481k45 = 0.0f;
        for (a4w a4wVar2 : a4wVarArr) {
            float fM67481k46 = C14116yg.m67481k4(0.0f, (m73892ck() - a4wVar2.m73203ak()) / 2.0f);
            float f = fM67481k4 - fM67481k46;
            a4wVar2.m73208du(2.88f);
            a4wVar2.m73212h4(fM67481k46 + fM73885ks);
            if (a4wVar2.m73203ak() + fM73885ks < c14713vw.m72556x1() || m73887up()) {
                fM67481k44 = C14116yg.m67481k4(fM67481k44, a4wVar2.m73205bz() + a4wVar2.m73225wy());
                fM67481k45 = (fM73885ks + fM67481k4) + fM67481k43 < c14713vw.m72556x1() ? C14116yg.m67481k4(fM67481k45, a4wVar2.m73219qm() + f) : C14116yg.m67481k4(fM67481k45, C14116yg.m67481k4(a4wVar2.m73203ak(), (((c14713vw.m72556x1() - fM73885ks) - fM67481k43) - a4wVar2.m73203ak()) / 2.0f) + a4wVar2.m73219qm());
            } else {
                a4wVar2.m3227k4(true);
            }
            fM73885ks += fM67481k4 + fM67481k43;
            a4wVar2.m73220ss();
        }
        return new C12015qq(fM67481k44 + 2.88f, fM67481k45 + m73886rv());
    }

    @Override // com.aspose.slides.AbstractC14770x9
    /* JADX INFO: renamed from: x1 */
    public void mo3231x1(C14713vw c14713vw) {
        if (this.f50356x1.length == 0) {
            return;
        }
        C12015qq c12015qq = new C12015qq();
        C14713vw c14713vwM73884kk = m73884kk(c14713vw);
        int i = 0;
        if (c14713vwM73884kk.m72555k4() == 0.0f || c14713vwM73884kk.m72556x1() == 0.0f) {
            a4w[] a4wVarArr = this.f50356x1;
            int length = a4wVarArr.length;
            while (i < length) {
                a4wVarArr[i].m73220ss();
                i++;
            }
            m73217kk(0.0f);
            m73222to(0.0f);
            return;
        }
        (m73893dy() ? m73872k4(this.f50356x1, c14713vwM73884kk) : m73871k4(this.f50356x1, this.f50349fa, c14713vwM73884kk)).CloneTo(c12015qq);
        m73217kk(C14064he.m66715kk(c12015qq.m56699x1()) ? 0.0f : c12015qq.m56699x1());
        m73222to(C14064he.m66715kk(c12015qq.m56697kk()) ? 0.0f : c12015qq.m56697kk());
        a4w[] a4wVarArr2 = this.f50356x1;
        int length2 = a4wVarArr2.length;
        while (i < length2) {
            a4wVarArr2[i].m73220ss();
            i++;
        }
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [double, int] */
    /* JADX WARN: Type inference failed for: r0v8, types: [int, java.lang.StringBuffer] */
    /* JADX WARN: Type inference failed for: r0v9, types: [double, int] */
    /* JADX WARN: Type inference failed for: r9v4, types: [java.lang.StringBuffer] */
    /* JADX INFO: renamed from: k4 */
    private C12015qq m73873k4(a4w[] a4wVarArr, C14713vw c14713vw, int[] iArr, int[] iArr2) {
        float fM67481k4 = 0.0f;
        float fM67481k42 = 0.0f;
        for (a4w a4wVar : a4wVarArr) {
            fM67481k4 = C14116yg.m67481k4(fM67481k4, a4wVar.m73225wy());
            fM67481k42 = C14116yg.m67481k4(fM67481k42, a4wVar.m73203ak() * 0.93f);
        }
        if (fM67481k4 == 0.0f) {
            fM67481k4 = 1.0f;
        }
        iArr[0] = StringBuffer.append((int) (a4wVarArr.length / C14080ne.m66994m9(Double.valueOf(C14116yg.m67490kk(C14116yg.m67481k4(c14713vw.m72555k4() / fM67481k4, 1.0f))))));
        iArr2[0] = StringBuffer.append((int) (a4wVarArr.length / ((float) r0)));
        return new C12015qq(fM67481k4, fM67481k42);
    }

    /* JADX INFO: renamed from: x1 */
    private void m73889x1(a4w[] a4wVarArr, C14713vw c14713vw) {
        float f;
        a4w[] a4wVarArr2 = a4wVarArr;
        float fM73225wy = 0.0f;
        float fM67481k4 = 0.0f;
        for (a4w a4wVar : a4wVarArr2) {
            fM73225wy += a4wVar.m73225wy();
            fM67481k4 = C14116yg.m67481k4(fM67481k4, a4wVar.m73203ak());
        }
        float f2 = 2.0f;
        if (fM73225wy <= c14713vw.m72555k4()) {
            float fM72555k4 = (c14713vw.m72555k4() - fM73225wy) / (a4wVarArr2.length + 1);
            float fM73225wy2 = fM72555k4;
            for (a4w a4wVar2 : a4wVarArr2) {
                a4wVar2.m73208du(fM73225wy2);
                a4wVar2.m73212h4((c14713vw.m72556x1() - fM67481k4) / 2.0f);
                fM73225wy2 += a4wVar2.m73225wy() + fM72555k4;
            }
            return;
        }
        for (a4w a4wVar3 : this.f50356x1) {
            a4wVar3.m73210fa(new C14713vw(c14713vw.m72555k4() - 3.0f, c14713vw.m72556x1()));
        }
        int[] iArr = {0};
        int[] iArr2 = {0};
        C12015qq c12015qqClone = m73873k4(a4wVarArr2, c14713vw, iArr, iArr2).Clone();
        int i = iArr[0];
        int i2 = iArr2[0];
        if (m73893dy() && i > 1 && i2 > 1) {
            C14713vw c14713vw2 = new C14713vw((c14713vw.m72555k4() - 3.0f) - (i2 * 3.6f), c14713vw.m72556x1());
            iArr[0] = i;
            iArr2[0] = i2;
            m73873k4(a4wVarArr2, c14713vw2, iArr, iArr2).CloneTo(c12015qqClone);
            i = iArr[0];
            i2 = iArr2[0];
        }
        float fM72555k42 = c14713vw.m72555k4() / i2;
        int iM67507x1 = C14116yg.m67507x1(C7019kk.m27462to(Double.valueOf(C14116yg.m67490kk(((double) (c14713vw.m72556x1() / (C14116yg.m67481k4(c12015qqClone.m56697kk(), c14713vw.m72556x1() / i) * 0.87f))) + 1.0E-5d)), 14), a4wVarArr2.length);
        if (iM67507x1 == 0) {
            iM67507x1 = 1;
        }
        float fM72556x1 = c14713vw.m72556x1() / iM67507x1;
        boolean z = c14713vw.m72555k4() * 0.87f < c12015qqClone.m56699x1() && c14713vw.m72556x1() * 0.87f <= fM72556x1;
        double d = (-fM72556x1) * 0.034999996f;
        int i3 = 0;
        int i4 = 0;
        while (i4 < i && i3 < a4wVarArr2.length) {
            int i5 = 0;
            float f3 = 0.0f;
            while (true) {
                f = f2;
                if (i5 >= i2 || i3 >= a4wVarArr2.length) {
                    break;
                }
                a4w a4wVar4 = a4wVarArr2[i3];
                a4wVar4.m73208du(((fM72555k42 - c12015qqClone.m56699x1()) / f) + f3);
                a4wVar4.m73212h4((float) (((double) ((fM72556x1 - c12015qqClone.m56697kk()) / f)) + d));
                a4wVar4.m3227k4(z || ((double) fM72556x1) + d > ((double) c14713vw.m72556x1()));
                f3 += fM72555k42;
                i5++;
                i3++;
                a4wVarArr2 = a4wVarArr;
                f2 = f;
            }
            d += (double) fM72556x1;
            i4++;
            a4wVarArr2 = a4wVarArr;
            f2 = f;
        }
    }

    @Override // com.aspose.slides.AbstractC14770x9
    /* JADX INFO: renamed from: k4 */
    public void mo3225k4(C14713vw c14713vw) {
        if (this.f50356x1.length == 0) {
            return;
        }
        m73869fa();
        float fM67481k4 = 0.0f;
        float fM67481k42 = 0.0f;
        for (a4w a4wVar : this.f50356x1) {
            C12015qq c12015qqClone = a4wVar.m3228m9().m74301m9().Clone();
            fM67481k4 = C14116yg.m67481k4(fM67481k4, c12015qqClone.m56697kk());
            fM67481k42 = C14116yg.m67481k4(fM67481k42, c12015qqClone.m56699x1());
        }
        this.f50349fa = fM67481k4;
        float f = 3.0f;
        if (m73891c5() == 0) {
            this.f50351jd = 3.0f;
        } else {
            this.f50351jd = m73874k4(fM67481k4) ? 0.0f : 3.0f;
            if (m73874k4(fM67481k4)) {
                f = 0.0f;
            }
        }
        this.f50346ck = f;
        C14713vw c14713vwM73884kk = m73884kk(c14713vw);
        for (a4w a4wVar2 : this.f50356x1) {
            a4wVar2.m73210fa(c14713vwM73884kk);
        }
        if (m73891c5() != 0) {
            float fM67481k43 = 0.0f;
            for (a4w a4wVar3 : this.f50356x1) {
                fM67481k43 = C14116yg.m67481k4(fM67481k43, a4wVar3.m73203ak());
            }
            if (m73874k4(fM67481k43)) {
                this.f50346ck = 0.0f;
                this.f50351jd = 0.0f;
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    private boolean m73874k4(float f) {
        return m73891c5() != 0 && f > 90.0f;
    }

    /* JADX INFO: renamed from: k4 */
    public static boolean m73875k4(IChartSeriesCollection iChartSeriesCollection) {
        if (iChartSeriesCollection.size() != 1) {
            IGenericEnumerator<IChartSeries> it = iChartSeriesCollection.iterator();
            boolean z = true;
            boolean zIsChartTypePie = true;
            while (it.hasNext()) {
                try {
                    IChartSeries next = it.next();
                    int type = next.getType();
                    if (z) {
                        z &= ChartTypeCharacterizer.isChartTypeDoughnut(type) && next.isColorVaried();
                    }
                    if (zIsChartTypePie) {
                        zIsChartTypePie &= ChartTypeCharacterizer.isChartTypePie(type);
                    }
                    if (!z && !zIsChartTypePie) {
                        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                            it.dispose();
                        }
                        return false;
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
            return true;
        }
        IChartSeries iChartSeries = iChartSeriesCollection.get_Item(0);
        int type2 = iChartSeries.getType();
        if (ChartTypeCharacterizer.isChartTypePie(type2) || ChartTypeCharacterizer.isChartTypeDoughnut(type2) || iChartSeries.isColorVaried()) {
            return true;
        }
        if (!ChartTypeCharacterizer.isChartTypeArea(type2) && !ChartTypeCharacterizer.isChartTypeStock(type2) && iChartSeries.getDataPoints().size() > 0) {
            IMarker marker = iChartSeries.getMarker();
            IFormat format = iChartSeries.getFormat();
            IGenericEnumerator<IChartDataPoint> it2 = iChartSeries.getDataPoints().iterator();
            while (it2.hasNext()) {
                try {
                    ChartDataPoint chartDataPoint = (ChartDataPoint) it2.next();
                    if (m73878k4(format, chartDataPoint.m586k4(), false) || m73881k4(marker, chartDataPoint.m599x1())) {
                        return true;
                    }
                } finally {
                    if (C7019kk.m27456k4((Iterator) it2, (Class<IDisposable>) IDisposable.class)) {
                        it2.dispose();
                    }
                }
            }
            if (C7019kk.m27456k4((Iterator) it2, (Class<IDisposable>) IDisposable.class)) {
                it2.dispose();
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: k4 */
    private static boolean m73876k4(IColorFormat iColorFormat, IColorFormat iColorFormat2) {
        return ((iColorFormat == iColorFormat2 || iColorFormat.getColorType() == iColorFormat2.getColorType()) && ((ColorFormat) iColorFormat).m1084to().m56506h4() == ((ColorFormat) iColorFormat2).m1084to().m56506h4()) ? false : true;
    }

    /* JADX INFO: renamed from: k4 */
    private static boolean m73877k4(IFillFormat iFillFormat, IFillFormat iFillFormat2) {
        if (iFillFormat2.getFillType() == -1) {
            return false;
        }
        if (iFillFormat.getFillType() != iFillFormat2.getFillType()) {
            return true;
        }
        byte fillType = iFillFormat2.getFillType();
        return fillType != 1 ? fillType != 2 ? fillType != 3 ? fillType == 4 && iFillFormat.getPictureFillFormat().getPicture() != iFillFormat2.getPictureFillFormat().getPicture() : m73882k4(iFillFormat.getPatternFormat(), iFillFormat2.getPatternFormat()) : m73879k4(iFillFormat.getGradientFormat(), iFillFormat2.getGradientFormat()) : m73876k4(iFillFormat.getSolidFillColor(), iFillFormat2.getSolidFillColor());
    }

    /* JADX INFO: renamed from: k4 */
    private static boolean m73878k4(IFormat iFormat, IFormat iFormat2, boolean z) {
        if (iFormat == iFormat2 || iFormat == null || iFormat2 == null) {
            return false;
        }
        return z ? m73877k4(iFormat.getFill(), iFormat2.getFill()) || m73880k4(iFormat.getLine(), iFormat2.getLine()) : (iFormat2.getFill().getFillType() == -1 && iFormat2.getLine().isFormatNotDefined()) ? false : true;
    }

    /* JADX INFO: renamed from: k4 */
    private static boolean m73879k4(IGradientFormat iGradientFormat, IGradientFormat iGradientFormat2) {
        if (iGradientFormat.getGradientDirection() != iGradientFormat2.getGradientDirection() || iGradientFormat.getGradientShape() != iGradientFormat2.getGradientShape() || iGradientFormat.getLinearGradientAngle() != iGradientFormat2.getLinearGradientAngle() || iGradientFormat.getLinearGradientScaled() != iGradientFormat2.getLinearGradientScaled() || iGradientFormat.getTileFlip() != iGradientFormat2.getTileFlip() || iGradientFormat.getGradientStops().size() != iGradientFormat2.getGradientStops().size()) {
            return true;
        }
        for (int i = 0; i < iGradientFormat.getGradientStops().size(); i++) {
            IGradientStop iGradientStop = iGradientFormat.getGradientStops().get_Item(i);
            IGradientStop iGradientStop2 = iGradientFormat2.getGradientStops().get_Item(i);
            if (!C3085sv.m13089k4(iGradientStop.getPosition(), iGradientStop2.getPosition()) || m73876k4(iGradientStop.getColor(), iGradientStop2.getColor())) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: k4 */
    private static boolean m73880k4(ILineFormat iLineFormat, ILineFormat iLineFormat2) {
        if (iLineFormat2.isFormatNotDefined()) {
            return false;
        }
        if (iLineFormat.getAlignment() != iLineFormat2.getAlignment() || iLineFormat.getBeginArrowheadLength() != iLineFormat2.getBeginArrowheadLength() || iLineFormat.getBeginArrowheadStyle() != iLineFormat2.getBeginArrowheadStyle() || iLineFormat.getBeginArrowheadWidth() != iLineFormat2.getBeginArrowheadWidth() || iLineFormat.getCapStyle() != iLineFormat2.getCapStyle() || iLineFormat.getDashStyle() != iLineFormat2.getDashStyle() || iLineFormat.getEndArrowheadLength() != iLineFormat2.getEndArrowheadLength() || iLineFormat.getEndArrowheadStyle() != iLineFormat2.getEndArrowheadStyle() || iLineFormat.getEndArrowheadWidth() != iLineFormat2.getEndArrowheadWidth() || iLineFormat.getJoinStyle() != iLineFormat2.getJoinStyle() || !C3085sv.m13089k4(iLineFormat.getMiterLimit(), iLineFormat2.getMiterLimit()) || iLineFormat.getStyle() != iLineFormat2.getStyle() || iLineFormat.getFillFormat().getFillType() != iLineFormat2.getFillFormat().getFillType()) {
            return true;
        }
        byte fillType = iLineFormat.getFillFormat().getFillType();
        if (fillType == 1) {
            return m73876k4(iLineFormat.getFillFormat().getSolidFillColor(), iLineFormat2.getFillFormat().getSolidFillColor());
        }
        if (fillType == 2) {
            return m73879k4(iLineFormat.getFillFormat().getGradientFormat(), iLineFormat2.getFillFormat().getGradientFormat());
        }
        if (fillType != 3) {
            return false;
        }
        return m73882k4(iLineFormat.getFillFormat().getPatternFormat(), iLineFormat2.getFillFormat().getPatternFormat());
    }

    /* JADX INFO: renamed from: k4 */
    private static boolean m73881k4(IMarker iMarker, IMarker iMarker2) {
        if (iMarker == iMarker2 || iMarker == null || iMarker2 == null) {
            return false;
        }
        if (iMarker.getSize() == iMarker2.getSize() || iMarker2.getSize() == 0) {
            return !(iMarker.getSymbol() == iMarker2.getSymbol() || iMarker2.getSymbol() == -1) || m73878k4(iMarker.getFormat(), iMarker2.getFormat(), true);
        }
        return true;
    }

    /* JADX INFO: renamed from: k4 */
    private static boolean m73882k4(IPatternFormat iPatternFormat, IPatternFormat iPatternFormat2) {
        return iPatternFormat.getPatternStyle() != iPatternFormat2.getPatternStyle() || m73876k4(iPatternFormat.getBackColor(), iPatternFormat2.getBackColor()) || m73876k4(iPatternFormat.getForeColor(), iPatternFormat2.getForeColor());
    }

    /* JADX INFO: renamed from: k4 */
    private boolean m73883k4(C13847mr c13847mr) {
        if (m73893dy() && ((ChartTypeCharacterizer.isChartTypeColumn(c13847mr.m64945h4().getType()) || ChartTypeCharacterizer.isChartTypeLine(c13847mr.m64945h4().getType())) && (ChartTypeCharacterizer.m758dy(c13847mr.m64945h4().getType()) || ChartTypeCharacterizer.m761jd(c13847mr.m64945h4().getType())))) {
            return true;
        }
        if (c13847mr.m64945h4().getType() != 34 || this.f50347du) {
            return false;
        }
        boolean plotOnSecondAxis = c13847mr.m64945h4().getPlotOnSecondAxis();
        IAxesManager axes = c13847mr.m64941c5().m69834fa().getAxes();
        return !(plotOnSecondAxis ? axes.getSecondaryVerticalAxis() : axes.getVerticalAxis()).isPlotOrderReversed();
    }
}
