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
public class g3u extends AbstractC7361bz {

    /* JADX INFO: renamed from: jd */
    private static final C7017h4 f23207jd = new C7017h4("text:outline-level", "text:use-outline-level", "text:use-index-marks", "text:use-index-source-styles", "text:index-scope", "text:relative-tab-stop-position", "index-title-template", "table-of-content-entry-template", "index-source-styles");

    /* JADX INFO: renamed from: c5 */
    private List<o8s> f23208c5;

    /* JADX INFO: renamed from: du */
    private int f23209du;

    /* JADX INFO: renamed from: dy */
    private List<t4s> f23210dy;

    /* JADX INFO: renamed from: h4 */
    private byte f23211h4;

    /* JADX INFO: renamed from: k4 */
    private long f23212k4;

    /* JADX INFO: renamed from: kk */
    private byte f23213kk;

    /* JADX INFO: renamed from: m9 */
    private pzs f23214m9;

    /* JADX INFO: renamed from: to */
    private byte f23215to;

    /* JADX INFO: renamed from: x1 */
    private boolean f23216x1;

    public g3u() {
        m32290x1();
    }

    public g3u(final AbstractC13912i5 abstractC13912i5) {
        m32290x1();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.g3u.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                int iM27428k4 = g3u.f23207jd.m27428k4(str);
                if (iM27428k4 == 0) {
                    g3u.this.f23212k4 = AbstractC7361bz.m29295ne(str2);
                    return true;
                }
                if (iM27428k4 == 1) {
                    g3u.this.f23216x1 = C13850af.m65068c5(str2);
                    return true;
                }
                if (iM27428k4 == 2) {
                    g3u.this.f23213kk = AbstractC7361bz.m29296rv(str2);
                    return true;
                }
                if (iM27428k4 == 3) {
                    g3u.this.f23215to = AbstractC7361bz.m29296rv(str2);
                    return true;
                }
                if (iM27428k4 == 4) {
                    g3u.this.f23209du = k7a.m35179k4(str2);
                    return true;
                }
                if (iM27428k4 != 5) {
                    return false;
                }
                g3u.this.f23211h4 = AbstractC7361bz.m29296rv(str2);
                return true;
            }
        });
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.g3u.2
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                AbstractC7361bz t4sVar;
                List list;
                int iM27428k4 = g3u.f23207jd.m27428k4(abstractC13912i5.mo65023fa());
                if (iM27428k4 == 6) {
                    g3u.this.f23214m9 = new pzs(abstractC13912i5);
                    return true;
                }
                if (iM27428k4 == 7) {
                    t4sVar = new t4s(abstractC13912i5);
                    list = g3u.this.f23210dy;
                } else {
                    if (iM27428k4 != 8) {
                        return false;
                    }
                    t4sVar = new o8s(abstractC13912i5);
                    list = g3u.this.f23208c5;
                }
                list.addItem(t4sVar);
                return true;
            }
        });
    }

    /* JADX INFO: renamed from: x1 */
    private void m32290x1() {
        this.f23212k4 = 4294967295L;
        this.f23216x1 = true;
        this.f23213kk = (byte) -1;
        this.f23215to = (byte) -1;
        this.f23209du = 0;
        this.f23211h4 = (byte) -1;
        this.f23210dy = new List<>();
        this.f23208c5 = new List<>();
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        long j = this.f23212k4;
        if ((j & 4294967295L) != 4294967295L) {
            c3059ii.m12955x1("text:outline-level", C13850af.m65147x1(j));
        }
        boolean z = this.f23216x1;
        String str3 = TelemetryEventStrings.Value.FALSE;
        if (!z) {
            c3059ii.m12955x1("text:use-outline-level", z ? TelemetryEventStrings.Value.TRUE : TelemetryEventStrings.Value.FALSE);
        }
        byte b = this.f23213kk;
        if (b != -1) {
            c3059ii.m12955x1("text:use-index-marks", b == 1 ? TelemetryEventStrings.Value.TRUE : TelemetryEventStrings.Value.FALSE);
        }
        byte b2 = this.f23215to;
        if (b2 != -1) {
            c3059ii.m12955x1("text:use-index-source-styles", b2 == 1 ? TelemetryEventStrings.Value.TRUE : TelemetryEventStrings.Value.FALSE);
        }
        int i = this.f23209du;
        if (i != 0) {
            c3059ii.m12955x1("text:index-scope", k7a.m35180k4(i));
        }
        byte b3 = this.f23211h4;
        if (b3 != -1) {
            if (b3 == 1) {
                str3 = TelemetryEventStrings.Value.TRUE;
            }
            c3059ii.m12955x1("text:relative-tab-stop-position", str3);
        }
        pzs pzsVar = this.f23214m9;
        if (pzsVar != null) {
            pzsVar.mo6846k4("text", c3059ii, "index-title-template");
        }
        List.Enumerator<o8s> it = this.f23210dy.iterator();
        while (it.hasNext()) {
            try {
                it.next().mo6846k4("text", c3059ii, "table-of-content-entry-template");
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
            it.dispose();
        }
        it = this.f23208c5.iterator();
        while (it.hasNext()) {
            try {
                it.next().mo6846k4("text", c3059ii, "index-source-styles");
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        c3059ii.mo21898jd();
    }
}
