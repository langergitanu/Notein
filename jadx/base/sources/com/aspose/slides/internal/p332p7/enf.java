package com.aspose.slides.internal.p332p7;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.IDisposable;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.microsoft.identity.common.java.telemetry.TelemetryEventStrings;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public class enf extends AbstractC7361bz {

    /* JADX INFO: renamed from: m9 */
    private static final C7017h4 f22305m9 = new C7017h4("style:column-width", "style:rel-column-width", "style:use-optimal-column-width", "fo:break-before", "fo:break-after");

    /* JADX INFO: renamed from: du */
    private int f22306du;

    /* JADX INFO: renamed from: h4 */
    private List<C8249m9> f22307h4;

    /* JADX INFO: renamed from: k4 */
    private String f22308k4;

    /* JADX INFO: renamed from: kk */
    private byte f22309kk;

    /* JADX INFO: renamed from: to */
    private int f22310to;

    /* JADX INFO: renamed from: x1 */
    private String f22311x1;

    public enf() {
        m31167kk();
    }

    /* JADX INFO: renamed from: kk */
    private void m31167kk() {
        this.f22309kk = (byte) -1;
        this.f22310to = 0;
        this.f22306du = 0;
        this.f22307h4 = new List<>();
    }

    public enf(AbstractC13912i5 abstractC13912i5) {
        m31167kk();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.enf.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                int iM27428k4 = enf.f22305m9.m27428k4(str);
                if (iM27428k4 == 0) {
                    enf.this.f22308k4 = str2;
                    return true;
                }
                if (iM27428k4 == 1) {
                    enf.this.f22311x1 = str2;
                    return true;
                }
                if (iM27428k4 == 2) {
                    enf.this.f22309kk = AbstractC7361bz.m29296rv(str2);
                    return true;
                }
                if (iM27428k4 == 3) {
                    enf.this.f22310to = klc.m35482k4(str2);
                    return true;
                }
                if (iM27428k4 != 4) {
                    return false;
                }
                enf.this.f22306du = ev2.m31399k4(str2);
                return true;
            }
        });
        if (abstractC13912i5.mo65048u4()) {
            return;
        }
        String strMo65023fa = abstractC13912i5.mo65023fa();
        while (abstractC13912i5.mo65026h4()) {
            do {
                if (abstractC13912i5.mo65028jd() == 15 && C14113y2.m67363du(abstractC13912i5.mo65023fa(), strMo65023fa)) {
                    return;
                }
                if (abstractC13912i5.mo65028jd() == 1) {
                    f22305m9.m27428k4(abstractC13912i5.mo65023fa());
                    this.f22307h4.addItem(new C8249m9(abstractC13912i5));
                }
            } while (!abstractC13912i5.mo65015ar());
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final String m31171k4() {
        return this.f22308k4;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m31172k4(String str) {
        this.f22308k4 = str;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        String str3 = this.f22308k4;
        if (str3 != null) {
            c3059ii.m12955x1("style:column-width", str3);
        }
        String str4 = this.f22311x1;
        if (str4 != null) {
            c3059ii.m12955x1("style:rel-column-width", str4);
        }
        byte b = this.f22309kk;
        if (b != -1) {
            c3059ii.m12955x1("style:use-optimal-column-width", b == 1 ? TelemetryEventStrings.Value.TRUE : TelemetryEventStrings.Value.FALSE);
        }
        int i = this.f22310to;
        if (i != 0) {
            c3059ii.m12955x1("fo:break-before", klc.m35483k4(i));
        }
        int i2 = this.f22306du;
        if (i2 != 0) {
            c3059ii.m12955x1("fo:break-after", ev2.m31400k4(i2));
        }
        List.Enumerator<C8249m9> it = this.f22307h4.iterator();
        while (it.hasNext()) {
            try {
                it.next().mo6846k4("", c3059ii, "");
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        c3059ii.mo21898jd();
    }
}
