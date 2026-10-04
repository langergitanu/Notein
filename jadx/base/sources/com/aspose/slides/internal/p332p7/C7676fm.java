package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.fm */
/* JADX INFO: loaded from: classes4.dex */
public class C7676fm extends AbstractC7361bz {

    /* JADX INFO: renamed from: h4 */
    private static final C7017h4 f22860h4 = new C7017h4("connectorLines", "meanLine", "meanMarker", "nonoutliers", "outliers");

    /* JADX INFO: renamed from: du */
    private byte f22861du;

    /* JADX INFO: renamed from: k4 */
    private byte f22862k4;

    /* JADX INFO: renamed from: kk */
    private byte f22863kk;

    /* JADX INFO: renamed from: to */
    private byte f22864to;

    /* JADX INFO: renamed from: x1 */
    private byte f22865x1;

    public C7676fm() {
        m31840m9();
    }

    /* JADX INFO: renamed from: m9 */
    private void m31840m9() {
        this.f22862k4 = (byte) -1;
        this.f22865x1 = (byte) -1;
        this.f22863kk = (byte) -1;
        this.f22864to = (byte) -1;
        this.f22861du = (byte) -1;
    }

    /* JADX INFO: renamed from: du */
    public final byte m31843du() {
        return this.f22861du;
    }

    /* JADX INFO: renamed from: k4 */
    public final byte m31845k4() {
        return this.f22862k4;
    }

    /* JADX INFO: renamed from: kk */
    public final byte m31847kk() {
        return this.f22863kk;
    }

    /* JADX INFO: renamed from: to */
    public final byte m31849to() {
        return this.f22864to;
    }

    /* JADX INFO: renamed from: x1 */
    public final byte m31851x1() {
        return this.f22865x1;
    }

    public C7676fm(AbstractC13912i5 abstractC13912i5) {
        m31840m9();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.fm.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                int iM27428k4 = C7676fm.f22860h4.m27428k4(str);
                if (iM27428k4 == 0) {
                    C7676fm.this.f22862k4 = AbstractC7361bz.m29296rv(str2);
                    return true;
                }
                if (iM27428k4 == 1) {
                    C7676fm.this.f22865x1 = AbstractC7361bz.m29296rv(str2);
                    return true;
                }
                if (iM27428k4 == 2) {
                    C7676fm.this.f22863kk = AbstractC7361bz.m29296rv(str2);
                    return true;
                }
                if (iM27428k4 == 3) {
                    C7676fm.this.f22864to = AbstractC7361bz.m29296rv(str2);
                    return true;
                }
                if (iM27428k4 != 4) {
                    return false;
                }
                C7676fm.this.f22861du = AbstractC7361bz.m29296rv(str2);
                return true;
            }
        });
        AbstractC7361bz.m29298x1(abstractC13912i5);
    }

    /* JADX INFO: renamed from: du */
    public final void m31844du(byte b) {
        this.f22861du = b;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m31846k4(byte b) {
        this.f22862k4 = b;
    }

    /* JADX INFO: renamed from: kk */
    public final void m31848kk(byte b) {
        this.f22863kk = b;
    }

    /* JADX INFO: renamed from: to */
    public final void m31850to(byte b) {
        this.f22864to = b;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m31852x1(byte b) {
        this.f22865x1 = b;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        byte b = this.f22862k4;
        if (b != -1) {
            c3059ii.m12955x1("connectorLines", b == 1 ? "1" : "0");
        }
        byte b2 = this.f22865x1;
        if (b2 != -1) {
            c3059ii.m12955x1("meanLine", b2 == 1 ? "1" : "0");
        }
        byte b3 = this.f22863kk;
        if (b3 != -1) {
            c3059ii.m12955x1("meanMarker", b3 == 1 ? "1" : "0");
        }
        byte b4 = this.f22864to;
        if (b4 != -1) {
            c3059ii.m12955x1("nonoutliers", b4 == 1 ? "1" : "0");
        }
        byte b5 = this.f22861du;
        if (b5 != -1) {
            c3059ii.m12955x1("outliers", b5 == 1 ? "1" : "0");
        }
        c3059ii.mo21898jd();
    }
}
