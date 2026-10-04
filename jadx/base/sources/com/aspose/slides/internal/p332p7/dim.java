package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.aspose.slides.p559ms.System.Xml.C13850af;

/* JADX INFO: loaded from: classes4.dex */
public class dim extends AbstractC7361bz {

    /* JADX INFO: renamed from: du */
    private static final C7017h4 f21661du = new C7017h4("text:style-name", "style:leader-char", "style:type", "style:position");

    /* JADX INFO: renamed from: k4 */
    private String f21662k4;

    /* JADX INFO: renamed from: kk */
    private int f21663kk;

    /* JADX INFO: renamed from: to */
    private String f21664to;

    /* JADX INFO: renamed from: x1 */
    private char f21665x1;

    public dim() {
        m30369x1();
    }

    public dim(AbstractC13912i5 abstractC13912i5) {
        m30369x1();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.dim.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                int iM27428k4 = dim.f21661du.m27428k4(str);
                if (iM27428k4 == 0) {
                    dim.this.f21662k4 = str2;
                    return true;
                }
                if (iM27428k4 == 1) {
                    dim.this.f21665x1 = C13850af.m65075jd(str2);
                    return true;
                }
                if (iM27428k4 == 2) {
                    dim.this.f21663kk = shm.m41022k4(str2);
                    return true;
                }
                if (iM27428k4 != 3) {
                    return false;
                }
                dim.this.f21664to = str2;
                return true;
            }
        });
        AbstractC7361bz.m29298x1(abstractC13912i5);
    }

    /* JADX INFO: renamed from: x1 */
    private void m30369x1() {
        this.f21665x1 = (char) 0;
        this.f21663kk = 0;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        String str3 = this.f21662k4;
        if (str3 != null) {
            c3059ii.m12955x1("text:style-name", str3);
        }
        char c = this.f21665x1;
        if (c != 0) {
            c3059ii.m12955x1("style:leader-char", C13850af.m65100k4(c));
        }
        c3059ii.m12955x1("style:type", shm.m41023k4(this.f21663kk));
        c3059ii.m12955x1("style:position", this.f21664to);
        c3059ii.mo21898jd();
    }
}
