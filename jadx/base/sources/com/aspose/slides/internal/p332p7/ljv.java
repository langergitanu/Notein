package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.aspose.slides.p559ms.System.Xml.C13850af;

/* JADX INFO: loaded from: classes4.dex */
public class ljv extends AbstractC7361bz {

    /* JADX INFO: renamed from: ck */
    private static final C7017h4 f26359ck = new C7017h4("diagonalUp", "diagonalDown", "outline", "left", "right", "top", "bottom", "diagonal", "vertical", "horizontal");

    /* JADX INFO: renamed from: c5 */
    private hn7 f26360c5;

    /* JADX INFO: renamed from: du */
    private hn7 f26361du;

    /* JADX INFO: renamed from: dy */
    private hn7 f26362dy;

    /* JADX INFO: renamed from: h4 */
    private hn7 f26363h4;

    /* JADX INFO: renamed from: jd */
    private hn7 f26364jd;

    /* JADX INFO: renamed from: k4 */
    private byte f26365k4;

    /* JADX INFO: renamed from: kk */
    private boolean f26366kk;

    /* JADX INFO: renamed from: m9 */
    private hn7 f26367m9;

    /* JADX INFO: renamed from: to */
    private hn7 f26368to;

    /* JADX INFO: renamed from: x1 */
    private byte f26369x1;

    public ljv() {
        m36201x1();
    }

    public ljv(final AbstractC13912i5 abstractC13912i5) {
        m36201x1();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.ljv.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                int iM27428k4 = ljv.f26359ck.m27428k4(str);
                if (iM27428k4 == 0) {
                    ljv.this.f26365k4 = AbstractC7361bz.m29296rv(str2);
                    return true;
                }
                if (iM27428k4 == 1) {
                    ljv.this.f26369x1 = AbstractC7361bz.m29296rv(str2);
                    return true;
                }
                if (iM27428k4 != 2) {
                    return false;
                }
                ljv.this.f26366kk = C13850af.m65068c5(str2);
                return true;
            }
        });
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.ljv.2
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                switch (ljv.f26359ck.m27428k4(abstractC13912i5.mo65023fa())) {
                    case 3:
                        ljv.this.f26368to = new hn7(abstractC13912i5);
                        return true;
                    case 4:
                        ljv.this.f26361du = new hn7(abstractC13912i5);
                        return true;
                    case 5:
                        ljv.this.f26363h4 = new hn7(abstractC13912i5);
                        return true;
                    case 6:
                        ljv.this.f26367m9 = new hn7(abstractC13912i5);
                        return true;
                    case 7:
                        ljv.this.f26362dy = new hn7(abstractC13912i5);
                        return true;
                    case 8:
                        ljv.this.f26360c5 = new hn7(abstractC13912i5);
                        return true;
                    case 9:
                        ljv.this.f26364jd = new hn7(abstractC13912i5);
                        return true;
                    default:
                        return false;
                }
            }
        });
    }

    /* JADX INFO: renamed from: x1 */
    private void m36201x1() {
        this.f26365k4 = (byte) -1;
        this.f26369x1 = (byte) -1;
        this.f26366kk = true;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        byte b = this.f26365k4;
        if (b != -1) {
            c3059ii.m12955x1("diagonalUp", b == 1 ? "1" : "0");
        }
        byte b2 = this.f26369x1;
        if (b2 != -1) {
            c3059ii.m12955x1("diagonalDown", b2 == 1 ? "1" : "0");
        }
        boolean z = this.f26366kk;
        if (!z) {
            c3059ii.m12955x1("outline", z ? "1" : "0");
        }
        hn7 hn7Var = this.f26368to;
        if (hn7Var != null) {
            hn7Var.mo6846k4("ssml", c3059ii, "left");
        }
        hn7 hn7Var2 = this.f26361du;
        if (hn7Var2 != null) {
            hn7Var2.mo6846k4("ssml", c3059ii, "right");
        }
        hn7 hn7Var3 = this.f26363h4;
        if (hn7Var3 != null) {
            hn7Var3.mo6846k4("ssml", c3059ii, "top");
        }
        hn7 hn7Var4 = this.f26367m9;
        if (hn7Var4 != null) {
            hn7Var4.mo6846k4("ssml", c3059ii, "bottom");
        }
        hn7 hn7Var5 = this.f26362dy;
        if (hn7Var5 != null) {
            hn7Var5.mo6846k4("ssml", c3059ii, "diagonal");
        }
        hn7 hn7Var6 = this.f26360c5;
        if (hn7Var6 != null) {
            hn7Var6.mo6846k4("ssml", c3059ii, "vertical");
        }
        hn7 hn7Var7 = this.f26364jd;
        if (hn7Var7 != null) {
            hn7Var7.mo6846k4("ssml", c3059ii, "horizontal");
        }
        c3059ii.mo21898jd();
    }
}
