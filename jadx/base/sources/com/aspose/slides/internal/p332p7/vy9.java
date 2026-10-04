package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.aspose.slides.p559ms.System.Xml.C13850af;
import com.facebook.common.callercontext.ContextChain;
import com.huawei.hms.network.embedded.C18437z2;

/* JADX INFO: loaded from: classes4.dex */
public class vy9 extends AbstractC7361bz {

    /* JADX INFO: renamed from: c5 */
    private dnu f32060c5;

    /* JADX INFO: renamed from: du */
    private byte f32061du;

    /* JADX INFO: renamed from: dy */
    private boolean f32062dy;

    /* JADX INFO: renamed from: h4 */
    private byte f32063h4;

    /* JADX INFO: renamed from: m9 */
    private long f32064m9;

    /* JADX INFO: renamed from: to */
    private byte f32065to;

    /* JADX INFO: renamed from: k4 */
    public static final byte f32057k4 = C9203xi.m44411k4("obj");

    /* JADX INFO: renamed from: x1 */
    public static final byte f32059x1 = C9317yw.m45190k4("horz");

    /* JADX INFO: renamed from: kk */
    public static final byte f32058kk = C8473ou.m38449k4("full");

    /* JADX INFO: renamed from: jd */
    private static final C7017h4 f32056jd = new C7017h4(C18437z2.f56754h, "orient", "sz", "idx", "hasCustomPrompt", "extLst");

    public vy9() {
        m43342dy();
    }

    /* JADX INFO: renamed from: dy */
    private void m43342dy() {
        this.f32065to = f32057k4;
        this.f32061du = f32059x1;
        this.f32063h4 = f32058kk;
        this.f32064m9 = 0L;
        this.f32062dy = false;
    }

    /* JADX INFO: renamed from: du */
    public final boolean m43350du() {
        return this.f32062dy;
    }

    /* JADX INFO: renamed from: h4 */
    public final AbstractC7414ck m43351h4() {
        return this.f32060c5;
    }

    /* JADX INFO: renamed from: k4 */
    public final byte m43352k4() {
        return this.f32065to;
    }

    /* JADX INFO: renamed from: kk */
    public final byte m43357kk() {
        return this.f32063h4;
    }

    /* JADX INFO: renamed from: to */
    public final long m43359to() {
        return this.f32064m9;
    }

    /* JADX INFO: renamed from: x1 */
    public final byte m43360x1() {
        return this.f32061du;
    }

    public vy9(final AbstractC13912i5 abstractC13912i5) {
        m43342dy();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.vy9.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                int iM27428k4 = vy9.f32056jd.m27428k4(str);
                if (iM27428k4 == 0) {
                    vy9.this.f32065to = C9203xi.m44411k4(str2);
                    return true;
                }
                if (iM27428k4 == 1) {
                    vy9.this.f32061du = C9317yw.m45190k4(str2);
                    return true;
                }
                if (iM27428k4 == 2) {
                    vy9.this.f32063h4 = C8473ou.m38449k4(str2);
                    return true;
                }
                if (iM27428k4 == 3) {
                    vy9.this.f32064m9 = AbstractC7361bz.m29295ne(str2);
                    return true;
                }
                if (iM27428k4 != 4) {
                    return false;
                }
                vy9.this.f32062dy = C13850af.m65068c5(str2);
                return true;
            }
        });
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.vy9.2
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                if (vy9.f32056jd.m27428k4(abstractC13912i5.mo65023fa()) != 5) {
                    return false;
                }
                vy9.this.f32060c5 = new dnu(abstractC13912i5);
                return true;
            }
        });
    }

    /* JADX INFO: renamed from: kk */
    public final void m43358kk(byte b) {
        this.f32063h4 = b;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m43361x1(byte b) {
        this.f32061du = b;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m43353k4(byte b) {
        this.f32065to = b;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m43354k4(long j) {
        this.f32064m9 = j;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m43355k4(AbstractC7414ck abstractC7414ck) {
        this.f32060c5 = (dnu) abstractC7414ck;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        byte b = this.f32065to;
        if (b != f32057k4) {
            c3059ii.m12955x1(C18437z2.f56754h, C9203xi.m44412k4(b));
        }
        byte b2 = this.f32061du;
        if (b2 != f32059x1) {
            c3059ii.m12955x1("orient", C9317yw.m45191k4(b2));
        }
        byte b3 = this.f32063h4;
        if (b3 != f32058kk) {
            c3059ii.m12955x1("sz", C8473ou.m38450k4(b3));
        }
        long j = this.f32064m9;
        if ((4294967295L & j) != 0) {
            c3059ii.m12955x1("idx", C13850af.m65147x1(j));
        }
        boolean z = this.f32062dy;
        if (z) {
            c3059ii.m12955x1("hasCustomPrompt", z ? "1" : "0");
        }
        dnu dnuVar = this.f32060c5;
        if (dnuVar != null) {
            dnuVar.mo6846k4(ContextChain.TAG_PRODUCT, c3059ii, "extLst");
        }
        c3059ii.mo21898jd();
    }

    /* JADX INFO: renamed from: k4 */
    public final void m43356k4(boolean z) {
        this.f32062dy = z;
    }
}
