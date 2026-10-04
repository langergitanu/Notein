package com.aspose.slides.internal.p332p7;

import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.facebook.common.callercontext.ContextChain;

/* JADX INFO: loaded from: classes4.dex */
public class rvh extends AbstractC7361bz {

    /* JADX INFO: renamed from: m9 */
    private static final C7017h4 f29753m9 = new C7017h4("concurrent", "prevAc", "nextAc", "cTn", "prevCondLst", "nextCondLst");

    /* JADX INFO: renamed from: du */
    private ei2 f29754du;

    /* JADX INFO: renamed from: h4 */
    private ei2 f29755h4;

    /* JADX INFO: renamed from: k4 */
    private byte f29756k4;

    /* JADX INFO: renamed from: kk */
    private byte f29757kk;

    /* JADX INFO: renamed from: to */
    private lmh f29758to;

    /* JADX INFO: renamed from: x1 */
    private byte f29759x1;

    public rvh() {
        m40568jd();
        this.f29758to = new lmh();
    }

    /* JADX INFO: renamed from: jd */
    private void m40568jd() {
        this.f29756k4 = (byte) -1;
        this.f29759x1 = (byte) -1;
        this.f29757kk = (byte) -1;
    }

    /* JADX INFO: renamed from: du */
    public final byte m40575du() {
        return this.f29757kk;
    }

    /* JADX INFO: renamed from: dy */
    public final ei2 m40576dy() {
        return this.f29755h4;
    }

    /* JADX INFO: renamed from: h4 */
    public final lmh m40577h4() {
        return this.f29758to;
    }

    /* JADX INFO: renamed from: kk */
    public final byte m40580kk() {
        return this.f29756k4;
    }

    /* JADX INFO: renamed from: m9 */
    public final ei2 m40581m9() {
        return this.f29754du;
    }

    /* JADX INFO: renamed from: to */
    public final byte m40582to() {
        return this.f29759x1;
    }

    public rvh(final AbstractC13912i5 abstractC13912i5) {
        m40568jd();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.rvh.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                int iM27428k4 = rvh.f29753m9.m27428k4(str);
                if (iM27428k4 == 0) {
                    rvh.this.f29756k4 = AbstractC7361bz.m29296rv(str2);
                    return true;
                }
                if (iM27428k4 == 1) {
                    rvh.this.f29759x1 = C7874hq.m33573k4(str2);
                    return true;
                }
                if (iM27428k4 != 2) {
                    return false;
                }
                rvh.this.f29757kk = C8755sc.m40882k4(str2);
                return true;
            }
        });
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.rvh.2
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                int iM27428k4 = rvh.f29753m9.m27428k4(abstractC13912i5.mo65023fa());
                if (iM27428k4 == 3) {
                    rvh.this.f29758to = new lmh(abstractC13912i5);
                    return true;
                }
                if (iM27428k4 == 4) {
                    rvh.this.f29754du = new ei2(abstractC13912i5);
                    return true;
                }
                if (iM27428k4 != 5) {
                    return false;
                }
                rvh.this.f29755h4 = new ei2(abstractC13912i5);
                return true;
            }
        });
    }

    /* JADX INFO: renamed from: k4 */
    public final ei2 m40578k4() {
        if (this.f29754du != null) {
            throw new Exception("Only one <prevCondLst> element can be added.");
        }
        ei2 ei2Var = new ei2();
        this.f29754du = ei2Var;
        return ei2Var;
    }

    /* JADX INFO: renamed from: x1 */
    public final ei2 m40583x1() {
        if (this.f29755h4 != null) {
            throw new Exception("Only one <nextCondLst> element can be added.");
        }
        ei2 ei2Var = new ei2();
        this.f29755h4 = ei2Var;
        return ei2Var;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m40584x1(byte b) {
        this.f29757kk = b;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m40579k4(byte b) {
        this.f29756k4 = b;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        byte b = this.f29756k4;
        if (b != -1) {
            c3059ii.m12955x1("concurrent", b == 1 ? "1" : "0");
        }
        byte b2 = this.f29759x1;
        if (b2 != -1) {
            c3059ii.m12955x1("prevAc", C7874hq.m33574k4(b2));
        }
        byte b3 = this.f29757kk;
        if (b3 != -1) {
            c3059ii.m12955x1("nextAc", C8755sc.m40883k4(b3));
        }
        this.f29758to.mo6846k4(ContextChain.TAG_PRODUCT, c3059ii, "cTn");
        ei2 ei2Var = this.f29754du;
        if (ei2Var != null) {
            ei2Var.mo6846k4(ContextChain.TAG_PRODUCT, c3059ii, "prevCondLst");
        }
        ei2 ei2Var2 = this.f29755h4;
        if (ei2Var2 != null) {
            ei2Var2.mo6846k4(ContextChain.TAG_PRODUCT, c3059ii, "nextCondLst");
        }
        c3059ii.mo21898jd();
    }
}
