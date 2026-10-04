package com.aspose.slides.internal.p332p7;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.C14044b3;
import com.aspose.slides.p559ms.System.IDisposable;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.aspose.slides.p559ms.System.Xml.C13850af;
import com.google.mlkit.p567nl.translate.TranslateLanguage;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public class ipw extends AbstractC7361bz {

    /* JADX INFO: renamed from: ks */
    private static final C7017h4 f24867ks = new C7017h4("r", "spans", "s", "customFormat", TranslateLanguage.HAITIAN_CREOLE, "hidden", "customHeight", "outlineLevel", "collapsed", "thickTop", "thickBot", "ph", "c", "extLst");

    /* JADX INFO: renamed from: c5 */
    private boolean f24868c5;

    /* JADX INFO: renamed from: ck */
    private boolean f24869ck;

    /* JADX INFO: renamed from: du */
    private double f24870du;

    /* JADX INFO: renamed from: dy */
    private byte f24871dy;

    /* JADX INFO: renamed from: fa */
    private boolean f24872fa;

    /* JADX INFO: renamed from: h4 */
    private boolean f24873h4;

    /* JADX INFO: renamed from: jd */
    private boolean f24874jd;

    /* JADX INFO: renamed from: k4 */
    private long f24875k4;

    /* JADX INFO: renamed from: kk */
    private long f24876kk;

    /* JADX INFO: renamed from: m9 */
    private boolean f24877m9;

    /* JADX INFO: renamed from: to */
    private boolean f24878to;

    /* JADX INFO: renamed from: up */
    private List<sw4> f24879up;

    /* JADX INFO: renamed from: x1 */
    private String f24880x1;

    /* JADX INFO: renamed from: yj */
    private g3j f24881yj;

    public ipw() {
        m34366h4();
    }

    /* JADX INFO: renamed from: h4 */
    private void m34366h4() {
        this.f24875k4 = 4294967295L;
        this.f24876kk = 0L;
        this.f24878to = false;
        this.f24870du = Double.NaN;
        this.f24873h4 = false;
        this.f24877m9 = false;
        this.f24871dy = (byte) 0;
        this.f24868c5 = false;
        this.f24874jd = false;
        this.f24869ck = false;
        this.f24872fa = false;
        this.f24879up = new List<>();
    }

    /* JADX INFO: renamed from: kk */
    public final boolean m34383kk() {
        return this.f24873h4;
    }

    /* JADX INFO: renamed from: x1 */
    public final long m34385x1() {
        return this.f24875k4;
    }

    public ipw(final AbstractC13912i5 abstractC13912i5) {
        m34366h4();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.ipw.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                switch (ipw.f24867ks.m27428k4(str)) {
                    case 0:
                        ipw.this.f24875k4 = AbstractC7361bz.m29295ne(str2);
                        break;
                    case 1:
                        ipw.this.f24880x1 = str2;
                        break;
                    case 2:
                        ipw.this.f24876kk = AbstractC7361bz.m29295ne(str2);
                        break;
                    case 3:
                        ipw.this.f24878to = C13850af.m65068c5(str2);
                        break;
                    case 4:
                        ipw.this.f24870du = AbstractC7361bz.m29300yj(str2);
                        break;
                    case 5:
                        ipw.this.f24873h4 = C13850af.m65068c5(str2);
                        break;
                    case 6:
                        ipw.this.f24877m9 = C13850af.m65068c5(str2);
                        break;
                    case 7:
                        ipw.this.f24871dy = C13850af.m65126rv(str2);
                        break;
                    case 8:
                        ipw.this.f24868c5 = C13850af.m65068c5(str2);
                        break;
                    case 9:
                        ipw.this.f24874jd = C13850af.m65068c5(str2);
                        break;
                    case 10:
                        ipw.this.f24869ck = C13850af.m65068c5(str2);
                        break;
                    case 11:
                        ipw.this.f24872fa = C13850af.m65068c5(str2);
                        break;
                }
                return true;
            }
        });
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.ipw.2
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                int iM27428k4 = ipw.f24867ks.m27428k4(abstractC13912i5.mo65023fa());
                if (iM27428k4 == 12) {
                    ipw.this.f24879up.addItem(new sw4(abstractC13912i5));
                    return true;
                }
                if (iM27428k4 != 13) {
                    return false;
                }
                ipw.this.f24881yj = new g3j(abstractC13912i5);
                return true;
            }
        });
    }

    /* JADX INFO: renamed from: to */
    public final sw4[] m34384to() {
        return this.f24879up.toArray(new sw4[0]);
    }

    /* JADX INFO: renamed from: k4 */
    public final sw4 m34380k4() {
        sw4 sw4Var = new sw4();
        this.f24879up.addItem(sw4Var);
        return sw4Var;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m34381k4(long j) {
        this.f24875k4 = j;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        long j = this.f24875k4;
        if ((j & 4294967295L) != 4294967295L) {
            c3059ii.m12955x1("r", C13850af.m65147x1(j));
        }
        String str3 = this.f24880x1;
        if (str3 != null) {
            c3059ii.m12955x1("spans", str3);
        }
        long j2 = this.f24876kk;
        if ((4294967295L & j2) != 0) {
            c3059ii.m12955x1("s", C13850af.m65147x1(j2));
        }
        boolean z = this.f24878to;
        if (z) {
            c3059ii.m12955x1("customFormat", z ? "1" : "0");
        }
        if (!C14044b3.m66437kk(this.f24870du)) {
            c3059ii.m12955x1(TranslateLanguage.HAITIAN_CREOLE, C13850af.m65101k4(this.f24870du));
        }
        boolean z2 = this.f24873h4;
        if (z2) {
            c3059ii.m12955x1("hidden", z2 ? "1" : "0");
        }
        boolean z3 = this.f24877m9;
        if (z3) {
            c3059ii.m12955x1("customHeight", z3 ? "1" : "0");
        }
        byte b = this.f24871dy;
        if ((b & 255) != 0) {
            c3059ii.m12955x1("outlineLevel", C13850af.m65145x1(b));
        }
        boolean z4 = this.f24868c5;
        if (z4) {
            c3059ii.m12955x1("collapsed", z4 ? "1" : "0");
        }
        boolean z5 = this.f24874jd;
        if (z5) {
            c3059ii.m12955x1("thickTop", z5 ? "1" : "0");
        }
        boolean z6 = this.f24869ck;
        if (z6) {
            c3059ii.m12955x1("thickBot", z6 ? "1" : "0");
        }
        boolean z7 = this.f24872fa;
        if (z7) {
            c3059ii.m12955x1("ph", z7 ? "1" : "0");
        }
        List.Enumerator<sw4> it = this.f24879up.iterator();
        while (it.hasNext()) {
            try {
                it.next().mo6846k4("ssml", c3059ii, "c");
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        g3j g3jVar = this.f24881yj;
        if (g3jVar != null) {
            g3jVar.mo6846k4("ssml", c3059ii, "extLst");
        }
        c3059ii.mo21898jd();
    }

    /* JADX INFO: renamed from: k4 */
    public final void m34382k4(boolean z) {
        this.f24873h4 = z;
    }
}
