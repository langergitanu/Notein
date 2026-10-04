package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.aspose.slides.p559ms.System.Xml.C13850af;

/* JADX INFO: loaded from: classes4.dex */
public class fkw extends AbstractC7361bz {

    /* JADX INFO: renamed from: kk */
    private boolean f22842kk;

    /* JADX INFO: renamed from: to */
    private boolean f22843to;

    /* JADX INFO: renamed from: x1 */
    private int f22844x1;

    /* JADX INFO: renamed from: k4 */
    public static final int f22841k4 = C9162x0.m44156k4("l");

    /* JADX INFO: renamed from: du */
    private static final C7017h4 f22840du = new C7017h4("dir", "isContent", "isInverted");

    public fkw() {
        m31810du();
    }

    /* JADX INFO: renamed from: du */
    private void m31810du() {
        this.f22844x1 = f22841k4;
        this.f22842kk = false;
        this.f22843to = false;
    }

    /* JADX INFO: renamed from: k4 */
    public final int m31815k4() {
        return this.f22844x1;
    }

    /* JADX INFO: renamed from: kk */
    public final boolean m31818kk() {
        return this.f22843to;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m31819x1(boolean z) {
        this.f22843to = z;
    }

    public fkw(AbstractC13912i5 abstractC13912i5) {
        m31810du();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.fkw.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                int iM27428k4 = fkw.f22840du.m27428k4(str);
                if (iM27428k4 == 0) {
                    fkw.this.f22844x1 = C9162x0.m44156k4(str2);
                    return true;
                }
                if (iM27428k4 == 1) {
                    fkw.this.f22842kk = C13850af.m65068c5(str2);
                    return true;
                }
                if (iM27428k4 != 2) {
                    return false;
                }
                fkw.this.f22843to = C13850af.m65068c5(str2);
                return true;
            }
        });
        AbstractC7361bz.m29298x1(abstractC13912i5);
    }

    /* JADX INFO: renamed from: x1 */
    public final boolean m31820x1() {
        return this.f22842kk;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m31816k4(int i) {
        this.f22844x1 = i;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        int i = this.f22844x1;
        if (i != f22841k4) {
            c3059ii.m12955x1("dir", C9162x0.m44157k4(i));
        }
        boolean z = this.f22842kk;
        if (z) {
            c3059ii.m12955x1("isContent", z ? "1" : "0");
        }
        boolean z2 = this.f22843to;
        if (z2) {
            c3059ii.m12955x1("isInverted", z2 ? "1" : "0");
        }
        c3059ii.mo21898jd();
    }

    /* JADX INFO: renamed from: k4 */
    public final void m31817k4(boolean z) {
        this.f22842kk = z;
    }
}
