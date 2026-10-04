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
public class gni extends AbstractC7361bz {

    /* JADX INFO: renamed from: k4 */
    public static final int f23544k4 = se2.m40990k4("document");

    /* JADX INFO: renamed from: ne */
    private static final C7017h4 f23545ne = new C7017h4("text:index-scope", "text:relative-tab-stop-position", "text:ignore-case", "text:main-entry-style-name", "text:alphabetical-separators", "text:combine-entries", "text:combine-entries-with-dash", "text:combine-entries-with-pp", "text:use-keys-as-entries", "text:capitalize-entries", "text:comma-separated", "fo:language", "fo:country", "text:sort-algorithm", "index-title-template", "alphabetical-index-entry-template");

    /* JADX INFO: renamed from: c5 */
    private boolean f23546c5;

    /* JADX INFO: renamed from: ck */
    private boolean f23547ck;

    /* JADX INFO: renamed from: du */
    private String f23548du;

    /* JADX INFO: renamed from: dy */
    private boolean f23549dy;

    /* JADX INFO: renamed from: fa */
    private boolean f23550fa;

    /* JADX INFO: renamed from: h4 */
    private boolean f23551h4;

    /* JADX INFO: renamed from: jd */
    private boolean f23552jd;

    /* JADX INFO: renamed from: kk */
    private boolean f23553kk;

    /* JADX INFO: renamed from: ks */
    private String f23554ks;

    /* JADX INFO: renamed from: m9 */
    private boolean f23555m9;

    /* JADX INFO: renamed from: rv */
    private pzs f23556rv;

    /* JADX INFO: renamed from: to */
    private boolean f23557to;

    /* JADX INFO: renamed from: up */
    private String f23558up;

    /* JADX INFO: renamed from: x1 */
    private int f23559x1;

    /* JADX INFO: renamed from: x6 */
    private List<oei> f23560x6;

    /* JADX INFO: renamed from: yj */
    private String f23561yj;

    public gni() {
        m32686x1();
    }

    public gni(final AbstractC13912i5 abstractC13912i5) {
        m32686x1();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.gni.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                switch (gni.f23545ne.m27428k4(str)) {
                    case 0:
                        gni.this.f23559x1 = se2.m40990k4(str2);
                        break;
                    case 1:
                        gni.this.f23553kk = C13850af.m65068c5(str2);
                        break;
                    case 2:
                        gni.this.f23557to = C13850af.m65068c5(str2);
                        break;
                    case 3:
                        gni.this.f23548du = str2;
                        break;
                    case 4:
                        gni.this.f23551h4 = C13850af.m65068c5(str2);
                        break;
                    case 5:
                        gni.this.f23555m9 = C13850af.m65068c5(str2);
                        break;
                    case 6:
                        gni.this.f23549dy = C13850af.m65068c5(str2);
                        break;
                    case 7:
                        gni.this.f23546c5 = C13850af.m65068c5(str2);
                        break;
                    case 8:
                        gni.this.f23552jd = C13850af.m65068c5(str2);
                        break;
                    case 9:
                        gni.this.f23547ck = C13850af.m65068c5(str2);
                        break;
                    case 10:
                        gni.this.f23550fa = C13850af.m65068c5(str2);
                        break;
                    case 11:
                        gni.this.f23558up = str2;
                        break;
                    case 12:
                        gni.this.f23561yj = str2;
                        break;
                    case 13:
                        gni.this.f23554ks = str2;
                        break;
                }
                return true;
            }
        });
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.gni.2
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                int iM27428k4 = gni.f23545ne.m27428k4(abstractC13912i5.mo65023fa());
                if (iM27428k4 == 14) {
                    gni.this.f23556rv = new pzs(abstractC13912i5);
                    return true;
                }
                if (iM27428k4 != 15) {
                    return false;
                }
                gni.this.f23560x6.addItem(new oei(abstractC13912i5));
                return true;
            }
        });
    }

    /* JADX INFO: renamed from: x1 */
    private void m32686x1() {
        this.f23559x1 = f23544k4;
        this.f23553kk = true;
        this.f23557to = false;
        this.f23551h4 = false;
        this.f23555m9 = true;
        this.f23549dy = false;
        this.f23546c5 = true;
        this.f23552jd = false;
        this.f23547ck = false;
        this.f23550fa = false;
        this.f23560x6 = new List<>();
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        int i = this.f23559x1;
        if (i != f23544k4) {
            c3059ii.m12955x1("text:index-scope", se2.m40991k4(i));
        }
        boolean z = this.f23553kk;
        String str3 = TelemetryEventStrings.Value.FALSE;
        if (!z) {
            c3059ii.m12955x1("text:relative-tab-stop-position", z ? TelemetryEventStrings.Value.TRUE : TelemetryEventStrings.Value.FALSE);
        }
        boolean z2 = this.f23557to;
        if (z2) {
            c3059ii.m12955x1("text:ignore-case", z2 ? TelemetryEventStrings.Value.TRUE : TelemetryEventStrings.Value.FALSE);
        }
        String str4 = this.f23548du;
        if (str4 != null) {
            c3059ii.m12955x1("text:main-entry-style-name", str4);
        }
        boolean z3 = this.f23551h4;
        if (z3) {
            c3059ii.m12955x1("text:alphabetical-separators", z3 ? TelemetryEventStrings.Value.TRUE : TelemetryEventStrings.Value.FALSE);
        }
        boolean z4 = this.f23555m9;
        if (!z4) {
            c3059ii.m12955x1("text:combine-entries", z4 ? TelemetryEventStrings.Value.TRUE : TelemetryEventStrings.Value.FALSE);
        }
        boolean z5 = this.f23549dy;
        if (z5) {
            c3059ii.m12955x1("text:combine-entries-with-dash", z5 ? TelemetryEventStrings.Value.TRUE : TelemetryEventStrings.Value.FALSE);
        }
        boolean z6 = this.f23546c5;
        if (!z6) {
            c3059ii.m12955x1("text:combine-entries-with-pp", z6 ? TelemetryEventStrings.Value.TRUE : TelemetryEventStrings.Value.FALSE);
        }
        boolean z7 = this.f23552jd;
        if (z7) {
            c3059ii.m12955x1("text:use-keys-as-entries", z7 ? TelemetryEventStrings.Value.TRUE : TelemetryEventStrings.Value.FALSE);
        }
        boolean z8 = this.f23547ck;
        if (z8) {
            c3059ii.m12955x1("text:capitalize-entries", z8 ? TelemetryEventStrings.Value.TRUE : TelemetryEventStrings.Value.FALSE);
        }
        boolean z9 = this.f23550fa;
        if (z9) {
            if (z9) {
                str3 = TelemetryEventStrings.Value.TRUE;
            }
            c3059ii.m12955x1("text:comma-separated", str3);
        }
        String str5 = this.f23558up;
        if (str5 != null) {
            c3059ii.m12955x1("fo:language", str5);
        }
        String str6 = this.f23561yj;
        if (str6 != null) {
            c3059ii.m12955x1("fo:country", str6);
        }
        String str7 = this.f23554ks;
        if (str7 != null) {
            c3059ii.m12955x1("text:sort-algorithm", str7);
        }
        pzs pzsVar = this.f23556rv;
        if (pzsVar != null) {
            pzsVar.mo6846k4("text", c3059ii, "index-title-template");
        }
        List.Enumerator<oei> it = this.f23560x6.iterator();
        while (it.hasNext()) {
            try {
                it.next().mo6846k4("text", c3059ii, "alphabetical-index-entry-template");
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        c3059ii.mo21898jd();
    }
}
