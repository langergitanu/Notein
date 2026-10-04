package com.aspose.slides.internal.p332p7;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.IDisposable;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.aspose.slides.p559ms.System.Xml.C13850af;
import com.microsoft.identity.common.java.telemetry.TelemetryEventStrings;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public class q1h extends AbstractC7361bz {

    /* JADX INFO: renamed from: ne */
    private static final C7017h4 f28712ne = new C7017h4("table:structure-protected", "table:protection-key", "tracked-changes", "variable-decls", "sequence-decls", "user-field-decls", "dde-connection-decls", "alphabetical-index-auto-mark-file", "calculation-settings", "content-validations", "label-ranges", "table", "named-expressions", "database-ranges", "data-pilot-tables", "consolidation", "dde-links");

    /* JADX INFO: renamed from: c5 */
    private a4u f28713c5;

    /* JADX INFO: renamed from: ck */
    private bwt f28714ck;

    /* JADX INFO: renamed from: du */
    private ht5 f28715du;

    /* JADX INFO: renamed from: dy */
    private au9 f28716dy;

    /* JADX INFO: renamed from: fa */
    private List<n6p> f28717fa;

    /* JADX INFO: renamed from: h4 */
    private ge7 f28718h4;

    /* JADX INFO: renamed from: jd */
    private ozy f28719jd;

    /* JADX INFO: renamed from: k4 */
    private boolean f28720k4;

    /* JADX INFO: renamed from: kk */
    private h3w f28721kk;

    /* JADX INFO: renamed from: ks */
    private tl4 f28722ks;

    /* JADX INFO: renamed from: m9 */
    private klp f28723m9;

    /* JADX INFO: renamed from: rv */
    private scx f28724rv;

    /* JADX INFO: renamed from: to */
    private wyh f28725to;

    /* JADX INFO: renamed from: up */
    private fam f28726up;

    /* JADX INFO: renamed from: x1 */
    private String f28727x1;

    /* JADX INFO: renamed from: x6 */
    private vo4 f28728x6;

    /* JADX INFO: renamed from: yj */
    private n7b f28729yj;

    public q1h() {
        m39312x1();
    }

    /* JADX INFO: renamed from: x1 */
    private void m39312x1() {
        this.f28720k4 = false;
        this.f28717fa = new List<>();
    }

    public q1h(final AbstractC13912i5 abstractC13912i5) {
        m39312x1();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.q1h.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                int iM27428k4 = q1h.f28712ne.m27428k4(str);
                if (iM27428k4 == 0) {
                    q1h.this.f28720k4 = C13850af.m65068c5(str2);
                    return true;
                }
                if (iM27428k4 != 1) {
                    return false;
                }
                q1h.this.f28727x1 = str2;
                return true;
            }
        });
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.q1h.2
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                switch (q1h.f28712ne.m27428k4(abstractC13912i5.mo65023fa())) {
                    case 2:
                        q1h.this.f28721kk = new h3w(abstractC13912i5);
                        return true;
                    case 3:
                        q1h.this.f28725to = new wyh(abstractC13912i5);
                        return true;
                    case 4:
                        q1h.this.f28715du = new ht5(abstractC13912i5);
                        return true;
                    case 5:
                        q1h.this.f28718h4 = new ge7(abstractC13912i5);
                        return true;
                    case 6:
                        q1h.this.f28723m9 = new klp(abstractC13912i5);
                        return true;
                    case 7:
                        q1h.this.f28716dy = new au9(abstractC13912i5);
                        return true;
                    case 8:
                        q1h.this.f28713c5 = new a4u(abstractC13912i5);
                        return true;
                    case 9:
                        q1h.this.f28719jd = new ozy(abstractC13912i5);
                        return true;
                    case 10:
                        q1h.this.f28714ck = new bwt(abstractC13912i5);
                        return true;
                    case 11:
                        q1h.this.f28717fa.addItem(new n6p(abstractC13912i5));
                        return true;
                    case 12:
                        q1h.this.f28726up = new fam(abstractC13912i5);
                        return true;
                    case 13:
                        q1h.this.f28729yj = new n7b(abstractC13912i5);
                        return true;
                    case 14:
                        q1h.this.f28722ks = new tl4(abstractC13912i5);
                        return true;
                    case 15:
                        q1h.this.f28724rv = new scx(abstractC13912i5);
                        return true;
                    case 16:
                        q1h.this.f28728x6 = new vo4(abstractC13912i5);
                        return true;
                    default:
                        return false;
                }
            }
        });
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        boolean z = this.f28720k4;
        if (z) {
            c3059ii.m12955x1("table:structure-protected", z ? TelemetryEventStrings.Value.TRUE : TelemetryEventStrings.Value.FALSE);
        }
        c3059ii.m12955x1("table:protection-key", this.f28727x1);
        h3w h3wVar = this.f28721kk;
        if (h3wVar != null) {
            h3wVar.mo6846k4("table", c3059ii, "tracked-changes");
        }
        wyh wyhVar = this.f28725to;
        if (wyhVar != null) {
            wyhVar.mo6846k4("text", c3059ii, "variable-decls");
        }
        ht5 ht5Var = this.f28715du;
        if (ht5Var != null) {
            ht5Var.mo6846k4("text", c3059ii, "sequence-decls");
        }
        ge7 ge7Var = this.f28718h4;
        if (ge7Var != null) {
            ge7Var.mo6846k4("text", c3059ii, "user-field-decls");
        }
        klp klpVar = this.f28723m9;
        if (klpVar != null) {
            klpVar.mo6846k4("text", c3059ii, "dde-connection-decls");
        }
        au9 au9Var = this.f28716dy;
        if (au9Var != null) {
            au9Var.mo6846k4("text", c3059ii, "alphabetical-index-auto-mark-file");
        }
        a4u a4uVar = this.f28713c5;
        if (a4uVar != null) {
            a4uVar.mo6846k4("table", c3059ii, "calculation-settings");
        }
        ozy ozyVar = this.f28719jd;
        if (ozyVar != null) {
            ozyVar.mo6846k4("table", c3059ii, "content-validations");
        }
        bwt bwtVar = this.f28714ck;
        if (bwtVar != null) {
            bwtVar.mo6846k4("table", c3059ii, "label-ranges");
        }
        List.Enumerator<n6p> it = this.f28717fa.iterator();
        while (it.hasNext()) {
            try {
                it.next().mo6846k4("table", c3059ii, "table");
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        fam famVar = this.f28726up;
        if (famVar != null) {
            famVar.mo6846k4("table", c3059ii, "named-expressions");
        }
        n7b n7bVar = this.f28729yj;
        if (n7bVar != null) {
            n7bVar.mo6846k4("table", c3059ii, "database-ranges");
        }
        tl4 tl4Var = this.f28722ks;
        if (tl4Var != null) {
            tl4Var.mo6846k4("table", c3059ii, "data-pilot-tables");
        }
        scx scxVar = this.f28724rv;
        if (scxVar != null) {
            scxVar.mo6846k4("table", c3059ii, "consolidation");
        }
        vo4 vo4Var = this.f28728x6;
        if (vo4Var != null) {
            vo4Var.mo6846k4("table", c3059ii, "dde-links");
        }
        c3059ii.mo21898jd();
    }
}
