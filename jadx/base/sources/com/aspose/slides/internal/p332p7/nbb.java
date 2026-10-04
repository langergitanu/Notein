package com.aspose.slides.internal.p332p7;

import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.facebook.common.callercontext.ContextChain;
import com.google.firebase.messaging.Constants;

/* JADX INFO: loaded from: classes4.dex */
public class nbb extends AbstractC7361bz {

    /* JADX INFO: renamed from: m9 */
    private static final C7017h4 f27195m9 = new C7017h4("clrSpc", "dir", "cBhvr", "by", Constants.MessagePayloadKeys.FROM, "to");

    /* JADX INFO: renamed from: du */
    private C7447cx f27196du;

    /* JADX INFO: renamed from: h4 */
    private C7447cx f27197h4;

    /* JADX INFO: renamed from: k4 */
    private byte f27198k4;

    /* JADX INFO: renamed from: kk */
    private no7 f27199kk;

    /* JADX INFO: renamed from: to */
    private r7t f27200to;

    /* JADX INFO: renamed from: x1 */
    private byte f27201x1;

    public nbb() {
        m37343ck();
        this.f27199kk = new no7();
    }

    /* JADX INFO: renamed from: ck */
    private void m37343ck() {
        this.f27198k4 = (byte) -1;
        this.f27201x1 = (byte) -1;
    }

    /* JADX INFO: renamed from: c5 */
    public final C7447cx m37351c5() {
        return this.f27197h4;
    }

    /* JADX INFO: renamed from: du */
    public final byte m37352du() {
        return this.f27201x1;
    }

    /* JADX INFO: renamed from: dy */
    public final C7447cx m37353dy() {
        return this.f27196du;
    }

    /* JADX INFO: renamed from: h4 */
    public final no7 m37354h4() {
        return this.f27199kk;
    }

    /* JADX INFO: renamed from: kk */
    public final C7447cx m37357kk() {
        if (this.f27197h4 != null) {
            throw new Exception("Only one <to> element can be added.");
        }
        C7447cx c7447cx = new C7447cx();
        this.f27197h4 = c7447cx;
        return c7447cx;
    }

    /* JADX INFO: renamed from: m9 */
    public final r7t m37358m9() {
        return this.f27200to;
    }

    /* JADX INFO: renamed from: to */
    public final byte m37359to() {
        return this.f27198k4;
    }

    public nbb(final AbstractC13912i5 abstractC13912i5) {
        m37343ck();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.nbb.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                int iM27428k4 = nbb.f27195m9.m27428k4(str);
                if (iM27428k4 == 0) {
                    nbb.this.f27198k4 = C9140wt.m44031k4(str2);
                    return true;
                }
                if (iM27428k4 != 1) {
                    return false;
                }
                nbb.this.f27201x1 = C8050k1.m35075k4(str2);
                return true;
            }
        });
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.nbb.2
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                int iM27428k4 = nbb.f27195m9.m27428k4(abstractC13912i5.mo65023fa());
                if (iM27428k4 == 2) {
                    nbb.this.f27199kk = new no7(abstractC13912i5);
                    return true;
                }
                if (iM27428k4 == 3) {
                    nbb.this.f27200to = new r7t(abstractC13912i5);
                    return true;
                }
                if (iM27428k4 == 4) {
                    nbb.this.f27196du = new C7447cx(abstractC13912i5);
                    return true;
                }
                if (iM27428k4 != 5) {
                    return false;
                }
                nbb.this.f27197h4 = new C7447cx(abstractC13912i5);
                return true;
            }
        });
    }

    /* JADX INFO: renamed from: x1 */
    public final C7447cx m37360x1() {
        if (this.f27196du != null) {
            throw new Exception("Only one <from> element can be added.");
        }
        C7447cx c7447cx = new C7447cx();
        this.f27196du = c7447cx;
        return c7447cx;
    }

    /* JADX INFO: renamed from: k4 */
    public final r7t m37355k4() {
        if (this.f27200to != null) {
            throw new Exception("Only one <by> element can be added.");
        }
        r7t r7tVar = new r7t();
        this.f27200to = r7tVar;
        return r7tVar;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m37361x1(byte b) {
        this.f27201x1 = b;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m37356k4(byte b) {
        this.f27198k4 = b;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        byte b = this.f27198k4;
        if (b != -1) {
            c3059ii.m12955x1("clrSpc", C9140wt.m44032k4(b));
        }
        byte b2 = this.f27201x1;
        if (b2 != -1) {
            c3059ii.m12955x1("dir", C8050k1.m35076k4(b2));
        }
        this.f27199kk.mo6846k4(ContextChain.TAG_PRODUCT, c3059ii, "cBhvr");
        r7t r7tVar = this.f27200to;
        if (r7tVar != null) {
            r7tVar.mo6846k4(ContextChain.TAG_PRODUCT, c3059ii, "by");
        }
        C7447cx c7447cx = this.f27196du;
        if (c7447cx != null) {
            c7447cx.mo6846k4(ContextChain.TAG_PRODUCT, c3059ii, Constants.MessagePayloadKeys.FROM);
        }
        C7447cx c7447cx2 = this.f27197h4;
        if (c7447cx2 != null) {
            c7447cx2.mo6846k4(ContextChain.TAG_PRODUCT, c3059ii, "to");
        }
        c3059ii.mo21898jd();
    }
}
