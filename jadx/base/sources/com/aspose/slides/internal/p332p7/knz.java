package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;

/* JADX INFO: loaded from: classes4.dex */
public class knz extends AbstractC7361bz {

    /* JADX INFO: renamed from: h4 */
    private static final C7017h4 f25837h4 = new C7017h4("name", "showFirstColumn", "showLastColumn", "showRowStripes", "showColumnStripes");

    /* JADX INFO: renamed from: du */
    private byte f25838du;

    /* JADX INFO: renamed from: k4 */
    private String f25839k4;

    /* JADX INFO: renamed from: kk */
    private byte f25840kk;

    /* JADX INFO: renamed from: to */
    private byte f25841to;

    /* JADX INFO: renamed from: x1 */
    private byte f25842x1;

    public knz() {
        m35571x1();
    }

    public knz(AbstractC13912i5 abstractC13912i5) {
        m35571x1();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.knz.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                int iM27428k4 = knz.f25837h4.m27428k4(str);
                if (iM27428k4 == 0) {
                    knz.this.f25839k4 = str2;
                    return true;
                }
                if (iM27428k4 == 1) {
                    knz.this.f25842x1 = AbstractC7361bz.m29296rv(str2);
                    return true;
                }
                if (iM27428k4 == 2) {
                    knz.this.f25840kk = AbstractC7361bz.m29296rv(str2);
                    return true;
                }
                if (iM27428k4 == 3) {
                    knz.this.f25841to = AbstractC7361bz.m29296rv(str2);
                    return true;
                }
                if (iM27428k4 != 4) {
                    return false;
                }
                knz.this.f25838du = AbstractC7361bz.m29296rv(str2);
                return true;
            }
        });
        AbstractC7361bz.m29298x1(abstractC13912i5);
    }

    /* JADX INFO: renamed from: x1 */
    private void m35571x1() {
        this.f25842x1 = (byte) -1;
        this.f25840kk = (byte) -1;
        this.f25841to = (byte) -1;
        this.f25838du = (byte) -1;
    }

    /* JADX INFO: renamed from: kk */
    public final void m35573kk(byte b) {
        this.f25841to = b;
    }

    /* JADX INFO: renamed from: to */
    public final void m35574to(byte b) {
        this.f25838du = b;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m35575x1(byte b) {
        this.f25840kk = b;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m35572k4(byte b) {
        this.f25842x1 = b;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        String str3 = this.f25839k4;
        if (str3 != null) {
            c3059ii.m12955x1("name", str3);
        }
        byte b = this.f25842x1;
        if (b != -1) {
            c3059ii.m12955x1("showFirstColumn", b == 1 ? "1" : "0");
        }
        byte b2 = this.f25840kk;
        if (b2 != -1) {
            c3059ii.m12955x1("showLastColumn", b2 == 1 ? "1" : "0");
        }
        byte b3 = this.f25841to;
        if (b3 != -1) {
            c3059ii.m12955x1("showRowStripes", b3 == 1 ? "1" : "0");
        }
        byte b4 = this.f25838du;
        if (b4 != -1) {
            c3059ii.m12955x1("showColumnStripes", b4 == 1 ? "1" : "0");
        }
        c3059ii.mo21898jd();
    }
}
