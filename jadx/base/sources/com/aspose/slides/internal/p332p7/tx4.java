package com.aspose.slides.internal.p332p7;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.aspose.slides.p559ms.System.Xml.C13850af;

/* JADX INFO: loaded from: classes4.dex */
public class tx4 extends AbstractC7361bz {

    /* JADX INFO: renamed from: h4 */
    private static final C7017h4 f30940h4 = new C7017h4("minLength", "maxLength", "showValue", "cfvo", "color");

    /* JADX INFO: renamed from: du */
    private bz0 f30941du;

    /* JADX INFO: renamed from: k4 */
    private long f30942k4;

    /* JADX INFO: renamed from: kk */
    private boolean f30943kk;

    /* JADX INFO: renamed from: to */
    private List<jio> f30944to;

    /* JADX INFO: renamed from: x1 */
    private long f30945x1;

    public tx4() {
        m41984to();
        this.f30944to.addItem(new jio());
        this.f30944to.addItem(new jio());
        this.f30941du = new bz0();
    }

    /* JADX INFO: renamed from: to */
    private void m41984to() {
        this.f30942k4 = 10L;
        this.f30945x1 = 90L;
        this.f30943kk = true;
        this.f30944to = new List<>();
    }

    public tx4(final AbstractC13912i5 abstractC13912i5) {
        m41984to();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.tx4.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                int iM27428k4 = tx4.f30940h4.m27428k4(str);
                if (iM27428k4 == 0) {
                    tx4.this.f30942k4 = AbstractC7361bz.m29295ne(str2);
                    return true;
                }
                if (iM27428k4 == 1) {
                    tx4.this.f30945x1 = AbstractC7361bz.m29295ne(str2);
                    return true;
                }
                if (iM27428k4 != 2) {
                    return false;
                }
                tx4.this.f30943kk = C13850af.m65068c5(str2);
                return true;
            }
        });
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.tx4.2
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                int iM27428k4 = tx4.f30940h4.m27428k4(abstractC13912i5.mo65023fa());
                if (iM27428k4 == 3) {
                    tx4.this.f30944to.addItem(new jio(abstractC13912i5));
                    return true;
                }
                if (iM27428k4 != 4) {
                    return false;
                }
                tx4.this.f30941du = new bz0(abstractC13912i5);
                return true;
            }
        });
    }

    /* JADX INFO: renamed from: x1 */
    public final jio m41987x1() {
        return this.f30944to.get_Item(1);
    }

    /* JADX INFO: renamed from: k4 */
    public final jio m41986k4() {
        return this.f30944to.get_Item(0);
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        long j = this.f30942k4;
        if ((j & 4294967295L) != 10) {
            c3059ii.m12955x1("minLength", C13850af.m65147x1(j));
        }
        long j2 = this.f30945x1;
        if ((4294967295L & j2) != 90) {
            c3059ii.m12955x1("maxLength", C13850af.m65147x1(j2));
        }
        boolean z = this.f30943kk;
        if (!z) {
            c3059ii.m12955x1("showValue", z ? "1" : "0");
        }
        m41986k4().mo6846k4("ssml", c3059ii, "cfvo");
        m41987x1().mo6846k4("ssml", c3059ii, "cfvo");
        this.f30941du.mo6846k4("ssml", c3059ii, "color");
        c3059ii.mo21898jd();
    }
}
