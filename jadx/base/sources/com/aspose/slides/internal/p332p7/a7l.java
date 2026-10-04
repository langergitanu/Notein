package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.aspose.slides.p559ms.System.Xml.C13850af;

/* JADX INFO: loaded from: classes4.dex */
public class a7l extends AbstractC7361bz {

    /* JADX INFO: renamed from: du */
    private static final C7017h4 f19863du = new C7017h4("draw:id", "svg:x", "svg:y", "draw:align");

    /* JADX INFO: renamed from: k4 */
    private long f19864k4;

    /* JADX INFO: renamed from: kk */
    private String f19865kk;

    /* JADX INFO: renamed from: to */
    private int f19866to;

    /* JADX INFO: renamed from: x1 */
    private String f19867x1;

    public a7l() {
        m27978x1();
    }

    public a7l(AbstractC13912i5 abstractC13912i5) {
        m27978x1();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.a7l.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                int iM27428k4 = a7l.f19863du.m27428k4(str);
                if (iM27428k4 == 0) {
                    a7l.this.f19864k4 = AbstractC7361bz.m29295ne(str2);
                    return true;
                }
                if (iM27428k4 == 1) {
                    a7l.this.f19867x1 = str2;
                    return true;
                }
                if (iM27428k4 == 2) {
                    a7l.this.f19865kk = str2;
                    return true;
                }
                if (iM27428k4 != 3) {
                    return false;
                }
                a7l.this.f19866to = vge.m43100k4(str2);
                return true;
            }
        });
        AbstractC7361bz.m29298x1(abstractC13912i5);
    }

    /* JADX INFO: renamed from: x1 */
    private void m27978x1() {
        this.f19866to = 0;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        c3059ii.m12955x1("draw:id", C13850af.m65147x1(this.f19864k4));
        c3059ii.m12955x1("svg:x", this.f19867x1);
        c3059ii.m12955x1("svg:y", this.f19865kk);
        int i = this.f19866to;
        if (i != 0) {
            c3059ii.m12955x1("draw:align", vge.m43101k4(i));
        }
        c3059ii.mo21898jd();
    }
}
