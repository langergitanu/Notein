package com.aspose.slides.internal.p332p7;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.IDisposable;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.aspose.slides.p559ms.System.Xml.C13850af;
import com.huawei.hms.network.embedded.C18437z2;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public class xjy extends AbstractC7361bz {

    /* JADX INFO: renamed from: ix */
    private static final C7017h4 f32878ix = new C7017h4(C18437z2.f56754h, "dxfId", "priority", "stopIfTrue", "aboveAverage", "percent", "bottom", "operator", "text", "timePeriod", "rank", "stdDev", "equalAverage", "formula", "colorScale", "dataBar", "iconSet", "extLst");

    /* JADX INFO: renamed from: c5 */
    private String f32879c5;

    /* JADX INFO: renamed from: ck */
    private long f32880ck;

    /* JADX INFO: renamed from: du */
    private boolean f32881du;

    /* JADX INFO: renamed from: dy */
    private int f32882dy;

    /* JADX INFO: renamed from: fa */
    private int f32883fa;

    /* JADX INFO: renamed from: h4 */
    private boolean f32884h4;

    /* JADX INFO: renamed from: jd */
    private int f32885jd;

    /* JADX INFO: renamed from: k4 */
    private int f32886k4;

    /* JADX INFO: renamed from: kk */
    private int f32887kk;

    /* JADX INFO: renamed from: ks */
    private iq8 f32888ks;

    /* JADX INFO: renamed from: m9 */
    private boolean f32889m9;

    /* JADX INFO: renamed from: ne */
    private g3j f32890ne;

    /* JADX INFO: renamed from: rv */
    private tx4 f32891rv;

    /* JADX INFO: renamed from: to */
    private boolean f32892to;

    /* JADX INFO: renamed from: up */
    private boolean f32893up;

    /* JADX INFO: renamed from: x1 */
    private long f32894x1;

    /* JADX INFO: renamed from: x6 */
    private nd1 f32895x6;

    /* JADX INFO: renamed from: yj */
    private List<String> f32896yj;

    public xjy() {
        m44450x1();
    }

    public xjy(final AbstractC13912i5 abstractC13912i5) {
        m44450x1();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.xjy.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                switch (xjy.f32878ix.m27428k4(str)) {
                    case 0:
                        xjy.this.f32886k4 = x6o.m44224k4(str2);
                        break;
                    case 1:
                        xjy.this.f32894x1 = AbstractC7361bz.m29295ne(str2);
                        break;
                    case 2:
                        xjy.this.f32887kk = C13850af.m65151yj(str2);
                        break;
                    case 3:
                        xjy.this.f32892to = C13850af.m65068c5(str2);
                        break;
                    case 4:
                        xjy.this.f32881du = C13850af.m65068c5(str2);
                        break;
                    case 5:
                        xjy.this.f32884h4 = C13850af.m65068c5(str2);
                        break;
                    case 6:
                        xjy.this.f32889m9 = C13850af.m65068c5(str2);
                        break;
                    case 7:
                        xjy.this.f32882dy = zqr.m45912k4(str2);
                        break;
                    case 8:
                        xjy.this.f32879c5 = str2;
                        break;
                    case 9:
                        xjy.this.f32885jd = nlw.m37706k4(str2);
                        break;
                    case 10:
                        xjy.this.f32880ck = AbstractC7361bz.m29295ne(str2);
                        break;
                    case 11:
                        xjy.this.f32883fa = C13850af.m65151yj(str2);
                        break;
                    case 12:
                        xjy.this.f32893up = C13850af.m65068c5(str2);
                        break;
                }
                return true;
            }
        });
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.xjy.2
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                switch (xjy.f32878ix.m27428k4(abstractC13912i5.mo65023fa())) {
                    case 13:
                        String strMo65052v4 = abstractC13912i5.mo65052v4();
                        if (abstractC13912i5.mo65048u4()) {
                            return true;
                        }
                        while (abstractC13912i5.mo65028jd() != 15) {
                            abstractC13912i5.mo65026h4();
                            strMo65052v4 = C14113y2.m67400k4(strMo65052v4, abstractC13912i5.mo65052v4());
                        }
                        xjy.this.f32896yj.addItem(strMo65052v4);
                        return true;
                    case 14:
                        xjy.this.f32888ks = new iq8(abstractC13912i5);
                        return true;
                    case 15:
                        xjy.this.f32891rv = new tx4(abstractC13912i5);
                        return true;
                    case 16:
                        xjy.this.f32895x6 = new nd1(abstractC13912i5);
                        return true;
                    case 17:
                        xjy.this.f32890ne = new g3j(abstractC13912i5);
                        return true;
                    default:
                        return false;
                }
            }
        });
    }

    /* JADX INFO: renamed from: x1 */
    private void m44450x1() {
        this.f32886k4 = 0;
        this.f32894x1 = 4294967295L;
        this.f32892to = false;
        this.f32881du = true;
        this.f32884h4 = false;
        this.f32889m9 = false;
        this.f32882dy = 0;
        this.f32885jd = 0;
        this.f32880ck = 4294967295L;
        this.f32883fa = 0;
        this.f32893up = false;
        this.f32896yj = new List<>();
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) throws Throwable {
        C3059ii c3059ii2;
        c3059ii.mo12953k4(str, str2, (String) null);
        int i = this.f32886k4;
        if (i != 0) {
            c3059ii.m12955x1(C18437z2.f56754h, x6o.m44225k4(i));
        }
        long j = this.f32894x1;
        if ((j & 4294967295L) != 4294967295L) {
            c3059ii.m12955x1("dxfId", C13850af.m65147x1(j));
        }
        c3059ii.m12955x1("priority", C13850af.m65103k4(this.f32887kk));
        boolean z = this.f32892to;
        if (z) {
            c3059ii.m12955x1("stopIfTrue", z ? "1" : "0");
        }
        boolean z2 = this.f32881du;
        if (!z2) {
            c3059ii.m12955x1("aboveAverage", z2 ? "1" : "0");
        }
        boolean z3 = this.f32884h4;
        if (z3) {
            c3059ii.m12955x1("percent", z3 ? "1" : "0");
        }
        boolean z4 = this.f32889m9;
        if (z4) {
            c3059ii.m12955x1("bottom", z4 ? "1" : "0");
        }
        int i2 = this.f32882dy;
        if (i2 != 0) {
            c3059ii.m12955x1("operator", zqr.m45913k4(i2));
        }
        String str3 = this.f32879c5;
        if (str3 != null) {
            c3059ii.m12955x1("text", str3);
        }
        int i3 = this.f32885jd;
        if (i3 != 0) {
            c3059ii.m12955x1("timePeriod", nlw.m37707k4(i3));
        }
        long j2 = this.f32880ck;
        if ((j2 & 4294967295L) != 4294967295L) {
            c3059ii.m12955x1("rank", C13850af.m65147x1(j2));
        }
        int i4 = this.f32883fa;
        if (i4 != 0) {
            c3059ii.m12955x1("stdDev", C13850af.m65103k4(i4));
        }
        boolean z5 = this.f32893up;
        if (z5) {
            c3059ii.m12955x1("equalAverage", z5 ? "1" : "0");
        }
        List.Enumerator<String> it = this.f32896yj.iterator();
        while (it.hasNext()) {
            try {
                c3059ii2 = c3059ii;
            } catch (Throwable th) {
                th = th;
            }
            try {
                m29301k4("ssml", c3059ii2, "formula", it.next(), true);
                c3059ii = c3059ii2;
            } catch (Throwable th2) {
                th = th2;
                Throwable th3 = th;
                if (!C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    throw th3;
                }
                it.dispose();
                throw th3;
            }
        }
        C3059ii c3059ii3 = c3059ii;
        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
            it.dispose();
        }
        iq8 iq8Var = this.f32888ks;
        if (iq8Var != null) {
            iq8Var.mo6846k4("ssml", c3059ii3, "colorScale");
        }
        tx4 tx4Var = this.f32891rv;
        if (tx4Var != null) {
            tx4Var.mo6846k4("ssml", c3059ii3, "dataBar");
        }
        nd1 nd1Var = this.f32895x6;
        if (nd1Var != null) {
            nd1Var.mo6846k4("ssml", c3059ii3, "iconSet");
        }
        g3j g3jVar = this.f32890ne;
        if (g3jVar != null) {
            g3jVar.mo6846k4("ssml", c3059ii3, "extLst");
        }
        c3059ii3.mo21898jd();
    }
}
