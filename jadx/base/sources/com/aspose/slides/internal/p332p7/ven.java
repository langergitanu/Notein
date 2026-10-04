package com.aspose.slides.internal.p332p7;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.IDisposable;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.orion.notein.domain.models.note.NoteMeta;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public class ven extends AbstractC7361bz {

    /* JADX INFO: renamed from: m9 */
    private static final C7017h4 f31795m9 = new C7017h4("chart:dimension", "chart:name", "chart:style-name", NoteMeta.PROPERTY_TITLE, "categories", "grid");

    /* JADX INFO: renamed from: du */
    private oow f31796du;

    /* JADX INFO: renamed from: h4 */
    private List<jj3> f31797h4;

    /* JADX INFO: renamed from: k4 */
    private int f31798k4;

    /* JADX INFO: renamed from: kk */
    private String f31799kk;

    /* JADX INFO: renamed from: to */
    private nci f31800to;

    /* JADX INFO: renamed from: x1 */
    private String f31801x1;

    public ven() {
        m43008dy();
    }

    /* JADX INFO: renamed from: dy */
    private void m43008dy() {
        this.f31798k4 = 0;
        this.f31797h4 = new List<>();
    }

    /* JADX INFO: renamed from: du */
    public final oow m43016du() {
        return this.f31796du;
    }

    /* JADX INFO: renamed from: h4 */
    public final jj3[] m43017h4() {
        return this.f31797h4.toArray(new jj3[0]);
    }

    /* JADX INFO: renamed from: k4 */
    public final int m43018k4() {
        return this.f31798k4;
    }

    /* JADX INFO: renamed from: kk */
    public final String m43019kk() {
        return this.f31799kk;
    }

    /* JADX INFO: renamed from: to */
    public final nci m43020to() {
        return this.f31800to;
    }

    /* JADX INFO: renamed from: x1 */
    public final String m43021x1() {
        return this.f31801x1;
    }

    public ven(final AbstractC13912i5 abstractC13912i5) {
        m43008dy();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.ven.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                int iM27428k4 = ven.f31795m9.m27428k4(str);
                if (iM27428k4 == 0) {
                    ven.this.f31798k4 = c7d.m29449k4(str2);
                    return true;
                }
                if (iM27428k4 == 1) {
                    ven.this.f31801x1 = str2;
                    return true;
                }
                if (iM27428k4 != 2) {
                    return false;
                }
                ven.this.f31799kk = str2;
                return true;
            }
        });
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.ven.2
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                int iM27428k4 = ven.f31795m9.m27428k4(abstractC13912i5.mo65023fa());
                if (iM27428k4 == 3) {
                    ven.this.f31800to = new nci(abstractC13912i5);
                    return true;
                }
                if (iM27428k4 == 4) {
                    ven.this.f31796du = new oow(abstractC13912i5);
                    return true;
                }
                if (iM27428k4 != 5) {
                    return false;
                }
                ven.this.f31797h4.addItem(new jj3(abstractC13912i5));
                return true;
            }
        });
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        c3059ii.m12955x1("chart:dimension", c7d.m29450k4(this.f31798k4));
        String str3 = this.f31801x1;
        if (str3 != null) {
            c3059ii.m12955x1("chart:name", str3);
        }
        String str4 = this.f31799kk;
        if (str4 != null) {
            c3059ii.m12955x1("chart:style-name", str4);
        }
        nci nciVar = this.f31800to;
        if (nciVar != null) {
            nciVar.mo6846k4("chart", c3059ii, NoteMeta.PROPERTY_TITLE);
        }
        oow oowVar = this.f31796du;
        if (oowVar != null) {
            oowVar.mo6846k4("chart", c3059ii, "categories");
        }
        List.Enumerator<jj3> it = this.f31797h4.iterator();
        while (it.hasNext()) {
            try {
                it.next().mo6846k4("chart", c3059ii, "grid");
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        c3059ii.mo21898jd();
    }
}
