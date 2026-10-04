package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.facebook.common.callercontext.ContextChain;
import com.huawei.hms.network.embedded.C18437z2;

/* JADX INFO: loaded from: classes4.dex */
public class zv9 extends AbstractC7361bz {

    /* JADX INFO: renamed from: to */
    private static final C7017h4 f34174to = new C7017h4(C18437z2.f56754h, "cmd", "cBhvr");

    /* JADX INFO: renamed from: k4 */
    private byte f34175k4;

    /* JADX INFO: renamed from: kk */
    private no7 f34176kk;

    /* JADX INFO: renamed from: x1 */
    private String f34177x1;

    public zv9() {
        m45961du();
        this.f34176kk = new no7();
    }

    /* JADX INFO: renamed from: du */
    private void m45961du() {
        this.f34175k4 = (byte) -1;
    }

    /* JADX INFO: renamed from: k4 */
    public final byte m45966k4() {
        return this.f34175k4;
    }

    /* JADX INFO: renamed from: kk */
    public final no7 m45969kk() {
        return this.f34176kk;
    }

    /* JADX INFO: renamed from: x1 */
    public final String m45970x1() {
        return this.f34177x1;
    }

    public zv9(final AbstractC13912i5 abstractC13912i5) {
        m45961du();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.zv9.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                int iM27428k4 = zv9.f34174to.m27428k4(str);
                if (iM27428k4 == 0) {
                    zv9.this.f34175k4 = C8825sz.m41450k4(str2);
                    return true;
                }
                if (iM27428k4 != 1) {
                    return false;
                }
                zv9.this.f34177x1 = str2;
                return true;
            }
        });
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.zv9.2
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                if (zv9.f34174to.m27428k4(abstractC13912i5.mo65023fa()) != 2) {
                    return false;
                }
                zv9.this.f34176kk = new no7(abstractC13912i5);
                return true;
            }
        });
    }

    /* JADX INFO: renamed from: k4 */
    public final void m45967k4(byte b) {
        this.f34175k4 = b;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m45968k4(String str) {
        this.f34177x1 = str;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        byte b = this.f34175k4;
        if (b != -1) {
            c3059ii.m12955x1(C18437z2.f56754h, C8825sz.m41451k4(b));
        }
        String str3 = this.f34177x1;
        if (str3 != null) {
            c3059ii.m12955x1("cmd", str3);
        }
        this.f34176kk.mo6846k4(ContextChain.TAG_PRODUCT, c3059ii, "cBhvr");
        c3059ii.mo21898jd();
    }
}
