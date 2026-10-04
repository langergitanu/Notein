package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.se */
/* JADX INFO: loaded from: classes4.dex */
public class C8766se extends AbstractC7361bz {

    /* JADX INFO: renamed from: du */
    private static final C7017h4 f30091du = new C7017h4("max", "min", "majorUnit", "minorUnit");

    /* JADX INFO: renamed from: k4 */
    private String f30092k4;

    /* JADX INFO: renamed from: kk */
    private String f30093kk;

    /* JADX INFO: renamed from: to */
    private String f30094to;

    /* JADX INFO: renamed from: x1 */
    private String f30095x1;

    public C8766se() {
    }

    /* JADX INFO: renamed from: k4 */
    public final String m40982k4() {
        return this.f30092k4;
    }

    /* JADX INFO: renamed from: kk */
    public final String m40984kk() {
        return this.f30093kk;
    }

    /* JADX INFO: renamed from: to */
    public final String m40986to() {
        return this.f30094to;
    }

    /* JADX INFO: renamed from: x1 */
    public final String m40988x1() {
        return this.f30095x1;
    }

    public C8766se(AbstractC13912i5 abstractC13912i5) {
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.se.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                int iM27428k4 = C8766se.f30091du.m27428k4(str);
                if (iM27428k4 == 0) {
                    C8766se.this.f30092k4 = str2;
                    return true;
                }
                if (iM27428k4 == 1) {
                    C8766se.this.f30095x1 = str2;
                    return true;
                }
                if (iM27428k4 == 2) {
                    C8766se.this.f30093kk = str2;
                    return true;
                }
                if (iM27428k4 != 3) {
                    return false;
                }
                C8766se.this.f30094to = str2;
                return true;
            }
        });
        AbstractC7361bz.m29298x1(abstractC13912i5);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m40983k4(String str) {
        this.f30092k4 = str;
    }

    /* JADX INFO: renamed from: kk */
    public final void m40985kk(String str) {
        this.f30093kk = str;
    }

    /* JADX INFO: renamed from: to */
    public final void m40987to(String str) {
        this.f30094to = str;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m40989x1(String str) {
        this.f30095x1 = str;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        String str3 = this.f30092k4;
        if (str3 != null) {
            c3059ii.m12955x1("max", str3);
        }
        String str4 = this.f30095x1;
        if (str4 != null) {
            c3059ii.m12955x1("min", str4);
        }
        String str5 = this.f30093kk;
        if (str5 != null) {
            c3059ii.m12955x1("majorUnit", str5);
        }
        String str6 = this.f30094to;
        if (str6 != null) {
            c3059ii.m12955x1("minorUnit", str6);
        }
        c3059ii.mo21898jd();
    }
}
