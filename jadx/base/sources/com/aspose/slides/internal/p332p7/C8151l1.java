package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.l1 */
/* JADX INFO: loaded from: classes4.dex */
public class C8151l1 extends AbstractC7361bz {

    /* JADX INFO: renamed from: du */
    private static final C7017h4 f26041du = new C7017h4("v:ext", "idsrc", "iddest", "idcntr");

    /* JADX INFO: renamed from: k4 */
    private int f26042k4;

    /* JADX INFO: renamed from: kk */
    private String f26043kk;

    /* JADX INFO: renamed from: to */
    private String f26044to;

    /* JADX INFO: renamed from: x1 */
    private String f26045x1;

    public C8151l1() {
        m35814to();
    }

    /* JADX INFO: renamed from: to */
    private void m35814to() {
        this.f26042k4 = 0;
    }

    /* JADX INFO: renamed from: x1 */
    public final String m35820x1() {
        return this.f26043kk;
    }

    public C8151l1(AbstractC13912i5 abstractC13912i5) {
        m35814to();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.l1.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                int iM27428k4 = C8151l1.f26041du.m27428k4(str);
                if (iM27428k4 == 0) {
                    C8151l1.this.f26042k4 = dmv.m30455k4(str2);
                    return true;
                }
                if (iM27428k4 == 1) {
                    C8151l1.this.f26045x1 = str2;
                    return true;
                }
                if (iM27428k4 == 2) {
                    C8151l1.this.f26043kk = str2;
                    return true;
                }
                if (iM27428k4 != 3) {
                    return false;
                }
                C8151l1.this.f26044to = str2;
                return true;
            }
        });
        AbstractC7361bz.m29298x1(abstractC13912i5);
    }

    /* JADX INFO: renamed from: k4 */
    public final String m35816k4() {
        return this.f26045x1;
    }

    /* JADX INFO: renamed from: kk */
    public final void m35819kk(String str) {
        this.f26044to = str;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m35821x1(String str) {
        this.f26043kk = str;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m35817k4(int i) {
        this.f26042k4 = i;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m35818k4(String str) {
        this.f26045x1 = str;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        int i = this.f26042k4;
        if (i != 0) {
            c3059ii.m12955x1("v:ext", dmv.m30456k4(i));
        }
        String str3 = this.f26045x1;
        if (str3 != null) {
            c3059ii.m12955x1("idsrc", str3);
        }
        String str4 = this.f26043kk;
        if (str4 != null) {
            c3059ii.m12955x1("iddest", str4);
        }
        String str5 = this.f26044to;
        if (str5 != null) {
            c3059ii.m12955x1("idcntr", str5);
        }
        c3059ii.mo21898jd();
    }
}
