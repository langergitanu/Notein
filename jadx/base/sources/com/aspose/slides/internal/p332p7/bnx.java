package com.aspose.slides.internal.p332p7;

import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.facebook.common.callercontext.ContextChain;

/* JADX INFO: loaded from: classes4.dex */
public class bnx extends AbstractC7361bz {

    /* JADX INFO: renamed from: to */
    private static final C7017h4 f20636to = new C7017h4("evt", "delay", "tgtEl", "tn", "rtn");

    /* JADX INFO: renamed from: k4 */
    private byte f20637k4;

    /* JADX INFO: renamed from: kk */
    private C7394ca f20638kk;

    /* JADX INFO: renamed from: x1 */
    private String f20639x1;

    public bnx() {
        m29005du();
    }

    /* JADX INFO: renamed from: du */
    private void m29005du() {
        this.f20637k4 = (byte) -1;
    }

    /* JADX INFO: renamed from: k4 */
    public final byte m29010k4() {
        return this.f20637k4;
    }

    /* JADX INFO: renamed from: kk */
    public final C7394ca m29013kk() {
        return this.f20638kk;
    }

    /* JADX INFO: renamed from: x1 */
    public final String m29014x1() {
        return this.f20639x1;
    }

    public bnx(final AbstractC13912i5 abstractC13912i5) {
        m29005du();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.bnx.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                int iM27428k4 = bnx.f20636to.m27428k4(str);
                if (iM27428k4 == 0) {
                    bnx.this.f20637k4 = C8982uw.m42584k4(str2);
                    return true;
                }
                if (iM27428k4 != 1) {
                    return false;
                }
                bnx.this.f20639x1 = str2;
                return true;
            }
        });
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.bnx.2
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                bnx bnxVar;
                C7394ca c7394ca;
                int iM27428k4 = bnx.f20636to.m27428k4(abstractC13912i5.mo65023fa());
                if (iM27428k4 == 2) {
                    bnxVar = bnx.this;
                    c7394ca = new C7394ca("tgtEl", new ycb(abstractC13912i5));
                } else if (iM27428k4 == 3) {
                    bnxVar = bnx.this;
                    c7394ca = new C7394ca("tn", new vsk(abstractC13912i5));
                } else {
                    if (iM27428k4 != 4) {
                        return false;
                    }
                    bnxVar = bnx.this;
                    c7394ca = new C7394ca("rtn", new fdb(abstractC13912i5));
                }
                bnxVar.f20638kk = c7394ca;
                return true;
            }
        });
    }

    /* JADX INFO: renamed from: x1 */
    public final void m29015x1(String str) {
        this.f20639x1 = str;
    }

    /* JADX INFO: renamed from: k4 */
    public final C7394ca m29011k4(String str) {
        C7394ca c7394ca;
        if (this.f20638kk != null) {
            throw new Exception("Trigger already is initialized.");
        }
        int iM27428k4 = f20636to.m27428k4(str);
        if (iM27428k4 == 2) {
            c7394ca = new C7394ca("tgtEl", new ycb());
        } else if (iM27428k4 == 3) {
            c7394ca = new C7394ca("tn", new vsk());
        } else {
            if (iM27428k4 != 4) {
                throw new Exception(C14113y2.m67408k4("Wrong element: ", str));
            }
            c7394ca = new C7394ca("rtn", new fdb());
        }
        this.f20638kk = c7394ca;
        return this.f20638kk;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m29012k4(byte b) {
        this.f20637k4 = b;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        byte b = this.f20637k4;
        if (b != -1) {
            c3059ii.m12955x1("evt", C8982uw.m42585k4(b));
        }
        String str3 = this.f20639x1;
        if (str3 != null) {
            c3059ii.m12955x1("delay", str3);
        }
        C7394ca c7394ca = this.f20638kk;
        if (c7394ca != null) {
            int iM27428k4 = f20636to.m27428k4(c7394ca.m29539k4());
            if (iM27428k4 == 2) {
                ((ycb) this.f20638kk.m29541kk()).mo6846k4(ContextChain.TAG_PRODUCT, c3059ii, this.f20638kk.m29539k4());
            } else if (iM27428k4 == 3) {
                ((vsk) this.f20638kk.m29541kk()).mo6846k4(ContextChain.TAG_PRODUCT, c3059ii, this.f20638kk.m29539k4());
            } else if (iM27428k4 == 4) {
                ((fdb) this.f20638kk.m29541kk()).mo6846k4(ContextChain.TAG_PRODUCT, c3059ii, this.f20638kk.m29539k4());
            }
        }
        c3059ii.mo21898jd();
    }
}
