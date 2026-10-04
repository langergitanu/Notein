package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.aspose.slides.p559ms.System.Xml.C13850af;

/* JADX INFO: loaded from: classes4.dex */
public class orj extends AbstractC7361bz {

    /* JADX INFO: renamed from: dy */
    private static final C7017h4 f28065dy = new C7017h4("name", "xfId", "builtinId", "iLevel", "hidden", "customBuiltin", "extLst");

    /* JADX INFO: renamed from: du */
    private byte f28066du;

    /* JADX INFO: renamed from: h4 */
    private byte f28067h4;

    /* JADX INFO: renamed from: k4 */
    private String f28068k4;

    /* JADX INFO: renamed from: kk */
    private long f28069kk;

    /* JADX INFO: renamed from: m9 */
    private g3j f28070m9;

    /* JADX INFO: renamed from: to */
    private long f28071to;

    /* JADX INFO: renamed from: x1 */
    private long f28072x1;

    public orj() {
        m38421x1();
    }

    public orj(final AbstractC13912i5 abstractC13912i5) {
        m38421x1();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.orj.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                int iM27428k4 = orj.f28065dy.m27428k4(str);
                if (iM27428k4 == 0) {
                    orj.this.f28068k4 = str2;
                    return true;
                }
                if (iM27428k4 == 1) {
                    orj.this.f28072x1 = AbstractC7361bz.m29295ne(str2);
                    return true;
                }
                if (iM27428k4 == 2) {
                    orj.this.f28069kk = AbstractC7361bz.m29295ne(str2);
                    return true;
                }
                if (iM27428k4 == 3) {
                    orj.this.f28071to = AbstractC7361bz.m29295ne(str2);
                    return true;
                }
                if (iM27428k4 == 4) {
                    orj.this.f28066du = AbstractC7361bz.m29296rv(str2);
                    return true;
                }
                if (iM27428k4 != 5) {
                    return false;
                }
                orj.this.f28067h4 = AbstractC7361bz.m29296rv(str2);
                return true;
            }
        });
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.orj.2
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                if (orj.f28065dy.m27428k4(abstractC13912i5.mo65023fa()) != 6) {
                    return false;
                }
                orj.this.f28070m9 = new g3j(abstractC13912i5);
                return true;
            }
        });
    }

    /* JADX INFO: renamed from: x1 */
    private void m38421x1() {
        this.f28069kk = 4294967295L;
        this.f28071to = 4294967295L;
        this.f28066du = (byte) -1;
        this.f28067h4 = (byte) -1;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        String str3 = this.f28068k4;
        if (str3 != null) {
            c3059ii.m12955x1("name", str3);
        }
        c3059ii.m12955x1("xfId", C13850af.m65147x1(this.f28072x1));
        long j = this.f28069kk;
        if ((j & 4294967295L) != 4294967295L) {
            c3059ii.m12955x1("builtinId", C13850af.m65147x1(j));
        }
        long j2 = this.f28071to;
        if ((j2 & 4294967295L) != 4294967295L) {
            c3059ii.m12955x1("iLevel", C13850af.m65147x1(j2));
        }
        byte b = this.f28066du;
        if (b != -1) {
            c3059ii.m12955x1("hidden", b == 1 ? "1" : "0");
        }
        byte b2 = this.f28067h4;
        if (b2 != -1) {
            c3059ii.m12955x1("customBuiltin", b2 == 1 ? "1" : "0");
        }
        g3j g3jVar = this.f28070m9;
        if (g3jVar != null) {
            g3jVar.mo6846k4("ssml", c3059ii, "extLst");
        }
        c3059ii.mo21898jd();
    }
}
