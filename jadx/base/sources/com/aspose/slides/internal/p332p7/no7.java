package com.aspose.slides.internal.p332p7;

import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.facebook.common.callercontext.ContextChain;
import com.google.firebase.messaging.Constants;

/* JADX INFO: loaded from: classes4.dex */
public class no7 extends AbstractC7361bz {

    /* JADX INFO: renamed from: fa */
    private static final C7017h4 f27499fa = new C7017h4("additive", "accumulate", "xfrmType", Constants.MessagePayloadKeys.FROM, "to", "by", "rctx", "override", "cTn", "tgtEl", "attrNameLst");

    /* JADX INFO: renamed from: c5 */
    private lmh f27500c5;

    /* JADX INFO: renamed from: ck */
    private sd0 f27501ck;

    /* JADX INFO: renamed from: du */
    private String f27502du;

    /* JADX INFO: renamed from: dy */
    private byte f27503dy;

    /* JADX INFO: renamed from: h4 */
    private String f27504h4;

    /* JADX INFO: renamed from: jd */
    private ycb f27505jd;

    /* JADX INFO: renamed from: k4 */
    private byte f27506k4;

    /* JADX INFO: renamed from: kk */
    private byte f27507kk;

    /* JADX INFO: renamed from: m9 */
    private String f27508m9;

    /* JADX INFO: renamed from: to */
    private String f27509to;

    /* JADX INFO: renamed from: x1 */
    private byte f27510x1;

    public no7() {
        m37751jd();
        this.f27500c5 = new lmh();
        this.f27505jd = new ycb();
    }

    /* JADX INFO: renamed from: jd */
    private void m37751jd() {
        this.f27506k4 = (byte) -1;
        this.f27510x1 = (byte) -1;
        this.f27507kk = (byte) -1;
        this.f27503dy = (byte) -1;
    }

    /* JADX INFO: renamed from: du */
    public final byte m37763du() {
        return this.f27503dy;
    }

    /* JADX INFO: renamed from: dy */
    public final sd0 m37764dy() {
        return this.f27501ck;
    }

    /* JADX INFO: renamed from: h4 */
    public final lmh m37765h4() {
        return this.f27500c5;
    }

    /* JADX INFO: renamed from: kk */
    public final byte m37769kk() {
        return this.f27510x1;
    }

    /* JADX INFO: renamed from: m9 */
    public final ycb m37771m9() {
        return this.f27505jd;
    }

    /* JADX INFO: renamed from: x1 */
    public final byte m37774x1() {
        return this.f27506k4;
    }

    public no7(final AbstractC13912i5 abstractC13912i5) {
        m37751jd();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.no7.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                switch (no7.f27499fa.m27428k4(str)) {
                    case 0:
                        no7.this.f27506k4 = C8301n0.m37184k4(str2);
                        break;
                    case 1:
                        no7.this.f27510x1 = C7511dt.m30570k4(str2);
                        break;
                    case 2:
                        no7.this.f27507kk = C7411cj.m29633k4(str2);
                        break;
                    case 3:
                        no7.this.f27509to = str2;
                        break;
                    case 4:
                        no7.this.f27502du = str2;
                        break;
                    case 5:
                        no7.this.f27504h4 = str2;
                        break;
                    case 6:
                        no7.this.f27508m9 = str2;
                        break;
                    case 7:
                        no7.this.f27503dy = C8402o3.m37973k4(str2);
                        break;
                }
                return true;
            }
        });
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.no7.2
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                switch (no7.f27499fa.m27428k4(abstractC13912i5.mo65023fa())) {
                    case 8:
                        no7.this.f27500c5 = new lmh(abstractC13912i5);
                        return true;
                    case 9:
                        no7.this.f27505jd = new ycb(abstractC13912i5);
                        return true;
                    case 10:
                        no7.this.f27501ck = new sd0(abstractC13912i5);
                        return true;
                    default:
                        return false;
                }
            }
        });
    }

    /* JADX INFO: renamed from: to */
    public final String m37772to() {
        return this.f27508m9;
    }

    /* JADX INFO: renamed from: k4 */
    public final sd0 m37766k4() {
        if (this.f27501ck != null) {
            throw new Exception("Only one <attrNameLst> element can be added.");
        }
        sd0 sd0Var = new sd0();
        this.f27501ck = sd0Var;
        return sd0Var;
    }

    /* JADX INFO: renamed from: kk */
    public final void m37770kk(byte b) {
        this.f27507kk = b;
    }

    /* JADX INFO: renamed from: to */
    public final void m37773to(byte b) {
        this.f27503dy = b;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m37775x1(byte b) {
        this.f27510x1 = b;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m37767k4(byte b) {
        this.f27506k4 = b;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m37768k4(String str) {
        this.f27508m9 = str;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        byte b = this.f27506k4;
        if (b != -1) {
            c3059ii.m12955x1("additive", C8301n0.m37185k4(b));
        }
        byte b2 = this.f27510x1;
        if (b2 != -1) {
            c3059ii.m12955x1("accumulate", C7511dt.m30571k4(b2));
        }
        byte b3 = this.f27507kk;
        if (b3 != -1) {
            c3059ii.m12955x1("xfrmType", C7411cj.m29634k4(b3));
        }
        String str3 = this.f27509to;
        if (str3 != null) {
            c3059ii.m12955x1(Constants.MessagePayloadKeys.FROM, str3);
        }
        String str4 = this.f27502du;
        if (str4 != null) {
            c3059ii.m12955x1("to", str4);
        }
        String str5 = this.f27504h4;
        if (str5 != null) {
            c3059ii.m12955x1("by", str5);
        }
        String str6 = this.f27508m9;
        if (str6 != null) {
            c3059ii.m12955x1("rctx", str6);
        }
        byte b4 = this.f27503dy;
        if (b4 != -1) {
            c3059ii.m12955x1("override", C8402o3.m37974k4(b4));
        }
        this.f27500c5.mo6846k4(ContextChain.TAG_PRODUCT, c3059ii, "cTn");
        this.f27505jd.mo6846k4(ContextChain.TAG_PRODUCT, c3059ii, "tgtEl");
        sd0 sd0Var = this.f27501ck;
        if (sd0Var != null) {
            sd0Var.mo6846k4(ContextChain.TAG_PRODUCT, c3059ii, "attrNameLst");
        }
        c3059ii.mo21898jd();
    }
}
