package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.C14064he;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.aspose.slides.p559ms.System.Xml.C13850af;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.hz */
/* JADX INFO: loaded from: classes4.dex */
public class C7892hz extends AbstractC7361bz {

    /* JADX INFO: renamed from: kk */
    private static final C7017h4 f24417kk = new C7017h4("ang", "scaled");

    /* JADX INFO: renamed from: k4 */
    private float f24418k4;

    /* JADX INFO: renamed from: x1 */
    private byte f24419x1;

    public C7892hz() {
        m33743to();
    }

    /* JADX INFO: renamed from: to */
    private void m33743to() {
        this.f24418k4 = Float.NaN;
        this.f24419x1 = (byte) -1;
    }

    /* JADX INFO: renamed from: x1 */
    public final byte m33747x1() {
        return this.f24419x1;
    }

    public C7892hz(AbstractC13912i5 abstractC13912i5) {
        m33743to();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.hz.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                int iM27428k4 = C7892hz.f24417kk.m27428k4(str);
                if (iM27428k4 == 0) {
                    C7892hz.this.f24418k4 = C13850af.m65151yj(str2) / 60000.0f;
                    return true;
                }
                if (iM27428k4 != 1) {
                    return false;
                }
                C7892hz.this.f24419x1 = AbstractC7361bz.m29296rv(str2);
                return true;
            }
        });
        AbstractC7361bz.m29298x1(abstractC13912i5);
    }

    /* JADX INFO: renamed from: k4 */
    public final float m33744k4() {
        return this.f24418k4;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m33745k4(byte b) {
        this.f24419x1 = b;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m33746k4(float f) {
        this.f24418k4 = f;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        if (!C14064he.m66715kk(this.f24418k4)) {
            OooO00o.OooO00o(this.f24418k4 * 60000.0f, 14, c3059ii, "ang");
        }
        byte b = this.f24419x1;
        if (b != -1) {
            c3059ii.m12955x1("scaled", b == 1 ? "1" : "0");
        }
        c3059ii.mo21898jd();
    }
}
