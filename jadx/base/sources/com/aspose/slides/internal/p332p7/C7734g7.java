package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.g7 */
/* JADX INFO: loaded from: classes4.dex */
public class C7734g7 extends AbstractC7361bz {

    /* JADX INFO: renamed from: m9 */
    private static final C7017h4 f23262m9 = new C7017h4("v:ext", "id", "on", "offset", "origin", "matrix");

    /* JADX INFO: renamed from: du */
    private String f23263du;

    /* JADX INFO: renamed from: h4 */
    private String f23264h4;

    /* JADX INFO: renamed from: k4 */
    private int f23265k4;

    /* JADX INFO: renamed from: kk */
    private int f23266kk;

    /* JADX INFO: renamed from: to */
    private String f23267to;

    /* JADX INFO: renamed from: x1 */
    private String f23268x1;

    public C7734g7() {
        m32338x1();
    }

    public C7734g7(AbstractC13912i5 abstractC13912i5) {
        m32338x1();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.g7.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                int iM27428k4 = C7734g7.f23262m9.m27428k4(str);
                if (iM27428k4 == 0) {
                    C7734g7.this.f23265k4 = dmv.m30455k4(str2);
                    return true;
                }
                if (iM27428k4 == 1) {
                    C7734g7.this.f23268x1 = str2;
                    return true;
                }
                if (iM27428k4 == 2) {
                    C7734g7.this.f23266kk = C9369zh.m45616k4(str2);
                    return true;
                }
                if (iM27428k4 == 3) {
                    C7734g7.this.f23267to = str2;
                    return true;
                }
                if (iM27428k4 == 4) {
                    C7734g7.this.f23263du = str2;
                    return true;
                }
                if (iM27428k4 != 5) {
                    return false;
                }
                C7734g7.this.f23264h4 = str2;
                return true;
            }
        });
        AbstractC7361bz.m29298x1(abstractC13912i5);
    }

    /* JADX INFO: renamed from: x1 */
    private void m32338x1() {
        this.f23265k4 = 0;
        this.f23266kk = 0;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        int i = this.f23265k4;
        if (i != 0) {
            c3059ii.m12955x1("v:ext", dmv.m30456k4(i));
        }
        String str3 = this.f23268x1;
        if (str3 != null) {
            c3059ii.m12955x1("id", str3);
        }
        int i2 = this.f23266kk;
        if (i2 != 0) {
            c3059ii.m12955x1("on", C9369zh.m45617k4(i2));
        }
        String str4 = this.f23267to;
        if (str4 != null) {
            c3059ii.m12955x1("offset", str4);
        }
        String str5 = this.f23263du;
        if (str5 != null) {
            c3059ii.m12955x1("origin", str5);
        }
        String str6 = this.f23264h4;
        if (str6 != null) {
            c3059ii.m12955x1("matrix", str6);
        }
        c3059ii.mo21898jd();
    }
}
