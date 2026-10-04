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
public class hj8 extends AbstractC7361bz {

    /* JADX INFO: renamed from: jd */
    private static final C7017h4 f24190jd = new C7017h4("style:row-height", "style:min-row-height", "style:use-optimal-row-height", "fo:background-color", "fo:break-before", "fo:break-after", "fo:keep-together", "background-image");

    /* JADX INFO: renamed from: c5 */
    private List<C8249m9> f24191c5;

    /* JADX INFO: renamed from: du */
    private int f24192du;

    /* JADX INFO: renamed from: dy */
    private fq4 f24193dy;

    /* JADX INFO: renamed from: h4 */
    private int f24194h4;

    /* JADX INFO: renamed from: k4 */
    private String f24195k4;

    /* JADX INFO: renamed from: kk */
    private byte f24196kk;

    /* JADX INFO: renamed from: m9 */
    private int f24197m9;

    /* JADX INFO: renamed from: to */
    private String f24198to;

    /* JADX INFO: renamed from: x1 */
    private String f24199x1;

    public hj8() {
        m33493kk();
    }

    public hj8(AbstractC13912i5 abstractC13912i5) {
        m33493kk();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.hj8.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                switch (hj8.f24190jd.m27428k4(str)) {
                    case 0:
                        hj8.this.f24195k4 = str2;
                        break;
                    case 1:
                        hj8.this.f24199x1 = str2;
                        break;
                    case 2:
                        hj8.this.f24196kk = AbstractC7361bz.m29296rv(str2);
                        break;
                    case 3:
                        hj8.this.f24198to = str2;
                        break;
                    case 4:
                        hj8.this.f24192du = klc.m35482k4(str2);
                        break;
                    case 5:
                        hj8.this.f24194h4 = ev2.m31399k4(str2);
                        break;
                    case 6:
                        hj8.this.f24197m9 = erk.m31250k4(str2);
                        break;
                }
                return true;
            }
        });
        if (abstractC13912i5.mo65048u4()) {
            return;
        }
        String strMo65023fa = abstractC13912i5.mo65023fa();
        while (abstractC13912i5.mo65026h4()) {
            while (true) {
                if (abstractC13912i5.mo65028jd() != 15 || !C14113y2.m67363du(abstractC13912i5.mo65023fa(), strMo65023fa)) {
                    if (abstractC13912i5.mo65028jd() == 1) {
                        if (f24190jd.m27428k4(abstractC13912i5.mo65023fa()) == 7) {
                            this.f24193dy = new fq4(abstractC13912i5);
                            break;
                        }
                        this.f24191c5.addItem(new C8249m9(abstractC13912i5));
                        if (abstractC13912i5.mo65015ar()) {
                            break;
                        }
                    } else {
                        break;
                    }
                } else {
                    return;
                }
            }
        }
    }

    /* JADX INFO: renamed from: kk */
    private void m33493kk() {
        this.f24196kk = (byte) -1;
        this.f24192du = 0;
        this.f24194h4 = 0;
        this.f24197m9 = 0;
        this.f24191c5 = new List<>();
    }

    /* JADX INFO: renamed from: k4 */
    public final String m33497k4() {
        return this.f24195k4;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m33498k4(String str) {
        this.f24195k4 = str;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        String str3 = this.f24195k4;
        if (str3 != null) {
            c3059ii.m12955x1("style:row-height", str3);
        }
        String str4 = this.f24199x1;
        if (str4 != null) {
            c3059ii.m12955x1("style:min-row-height", str4);
        }
        byte b = this.f24196kk;
        if (b != -1) {
            c3059ii.m12955x1("style:use-optimal-row-height", b == 1 ? TelemetryEventStrings.Value.TRUE : TelemetryEventStrings.Value.FALSE);
        }
        String str5 = this.f24198to;
        if (str5 != null) {
            c3059ii.m12955x1("fo:background-color", str5);
        }
        int i = this.f24192du;
        if (i != 0) {
            c3059ii.m12955x1("fo:break-before", klc.m35483k4(i));
        }
        int i2 = this.f24194h4;
        if (i2 != 0) {
            c3059ii.m12955x1("fo:break-after", ev2.m31400k4(i2));
        }
        int i3 = this.f24197m9;
        if (i3 != 0) {
            c3059ii.m12955x1("fo:keep-together", erk.m31251k4(i3));
        }
        fq4 fq4Var = this.f24193dy;
        if (fq4Var != null) {
            fq4Var.mo6846k4("style", c3059ii, "background-image");
        }
        List.Enumerator<C8249m9> it = this.f24191c5.iterator();
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
