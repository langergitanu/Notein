package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.huawei.hms.network.embedded.C18437z2;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.n2 */
/* JADX INFO: loaded from: classes4.dex */
public class C8305n2 extends AbstractC7361bz {

    /* JADX INFO: renamed from: to */
    private static final C7017h4 f27085to = new C7017h4(C18437z2.f56754h, "w", "len");

    /* JADX INFO: renamed from: k4 */
    private byte f27086k4;

    /* JADX INFO: renamed from: kk */
    private byte f27087kk;

    /* JADX INFO: renamed from: x1 */
    private byte f27088x1;

    public C8305n2() {
        m37201du();
    }

    /* JADX INFO: renamed from: du */
    private void m37201du() {
        this.f27086k4 = (byte) -1;
        this.f27088x1 = (byte) -1;
        this.f27087kk = (byte) -1;
    }

    /* JADX INFO: renamed from: k4 */
    public final byte m37206k4() {
        return this.f27086k4;
    }

    /* JADX INFO: renamed from: kk */
    public final byte m37208kk() {
        return this.f27087kk;
    }

    /* JADX INFO: renamed from: x1 */
    public final byte m37210x1() {
        return this.f27088x1;
    }

    public C8305n2(AbstractC13912i5 abstractC13912i5) {
        m37201du();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.n2.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                int iM27428k4 = C8305n2.f27085to.m27428k4(str);
                if (iM27428k4 == 0) {
                    C8305n2.this.f27086k4 = C8698rq.m40150k4(str2);
                    return true;
                }
                if (iM27428k4 == 1) {
                    C8305n2.this.f27088x1 = C7240af.m28199k4(str2);
                    return true;
                }
                if (iM27428k4 != 2) {
                    return false;
                }
                C8305n2.this.f27087kk = C8606qk.m39523k4(str2);
                return true;
            }
        });
        AbstractC7361bz.m29298x1(abstractC13912i5);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m37207k4(byte b) {
        this.f27086k4 = b;
    }

    /* JADX INFO: renamed from: kk */
    public final void m37209kk(byte b) {
        this.f27087kk = b;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m37211x1(byte b) {
        this.f27088x1 = b;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        byte b = this.f27086k4;
        if (b != -1) {
            c3059ii.m12955x1(C18437z2.f56754h, C8698rq.m40151k4(b));
        }
        byte b2 = this.f27088x1;
        if (b2 != -1) {
            c3059ii.m12955x1("w", C7240af.m28200k4(b2));
        }
        byte b3 = this.f27087kk;
        if (b3 != -1) {
            c3059ii.m12955x1("len", C8606qk.m39524k4(b3));
        }
        c3059ii.mo21898jd();
    }
}
