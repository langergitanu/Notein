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
public class g9n extends AbstractC7361bz {

    /* JADX INFO: renamed from: c5 */
    private static final C7017h4 f23283c5 = new C7017h4("text:prefix", "text:suffix", "text:numbered-entries", "text:sort-by-position", "fo:language", "fo:country", "text:sort-algorithm", "sort-key");

    /* JADX INFO: renamed from: du */
    private String f23284du;

    /* JADX INFO: renamed from: dy */
    private List<dnm> f23285dy;

    /* JADX INFO: renamed from: h4 */
    private String f23286h4;

    /* JADX INFO: renamed from: k4 */
    private String f23287k4;

    /* JADX INFO: renamed from: kk */
    private boolean f23288kk;

    /* JADX INFO: renamed from: m9 */
    private String f23289m9;

    /* JADX INFO: renamed from: to */
    private boolean f23290to;

    /* JADX INFO: renamed from: x1 */
    private String f23291x1;

    public g9n() {
        m32364x1();
    }

    public g9n(final AbstractC13912i5 abstractC13912i5) {
        m32364x1();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.g9n.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                switch (g9n.f23283c5.m27428k4(str)) {
                    case 0:
                        g9n.this.f23287k4 = str2;
                        break;
                    case 1:
                        g9n.this.f23291x1 = str2;
                        break;
                    case 2:
                        g9n.this.f23288kk = C13850af.m65068c5(str2);
                        break;
                    case 3:
                        g9n.this.f23290to = C13850af.m65068c5(str2);
                        break;
                    case 4:
                        g9n.this.f23284du = str2;
                        break;
                    case 5:
                        g9n.this.f23286h4 = str2;
                        break;
                    case 6:
                        g9n.this.f23289m9 = str2;
                        break;
                }
                return true;
            }
        });
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.g9n.2
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                if (g9n.f23283c5.m27428k4(abstractC13912i5.mo65023fa()) != 7) {
                    return false;
                }
                g9n.this.f23285dy.addItem(new dnm(abstractC13912i5));
                return true;
            }
        });
    }

    /* JADX INFO: renamed from: x1 */
    private void m32364x1() {
        this.f23288kk = false;
        this.f23290to = true;
        this.f23285dy = new List<>();
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        String str3 = this.f23287k4;
        if (str3 != null) {
            c3059ii.m12955x1("text:prefix", str3);
        }
        String str4 = this.f23291x1;
        if (str4 != null) {
            c3059ii.m12955x1("text:suffix", str4);
        }
        boolean z = this.f23288kk;
        String str5 = TelemetryEventStrings.Value.FALSE;
        if (z) {
            c3059ii.m12955x1("text:numbered-entries", z ? TelemetryEventStrings.Value.TRUE : TelemetryEventStrings.Value.FALSE);
        }
        boolean z2 = this.f23290to;
        if (!z2) {
            if (z2) {
                str5 = TelemetryEventStrings.Value.TRUE;
            }
            c3059ii.m12955x1("text:sort-by-position", str5);
        }
        String str6 = this.f23284du;
        if (str6 != null) {
            c3059ii.m12955x1("fo:language", str6);
        }
        String str7 = this.f23286h4;
        if (str7 != null) {
            c3059ii.m12955x1("fo:country", str7);
        }
        String str8 = this.f23289m9;
        if (str8 != null) {
            c3059ii.m12955x1("text:sort-algorithm", str8);
        }
        List.Enumerator<dnm> it = this.f23285dy.iterator();
        while (it.hasNext()) {
            try {
                it.next().mo6846k4("text", c3059ii, "sort-key");
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        c3059ii.mo21898jd();
    }
}
