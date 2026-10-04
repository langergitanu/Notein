package com.aspose.slides.internal.p039be;

import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.internal.p416tb.AbstractC10914up;
import com.aspose.slides.internal.p416tb.C10898dy;
import com.aspose.slides.internal.p416tb.C10922yj;
import com.aspose.slides.p559ms.System.C14113y2;
import com.microsoft.identity.common.java.platform.AbstractDevicePopManager;

/* JADX INFO: renamed from: com.aspose.slides.internal.be.k4 */
/* JADX INFO: loaded from: classes3.dex */
public class C1685k4 extends AbstractC10914up {

    /* JADX INFO: renamed from: k4 */
    private final C1684jd f6392k4;

    /* JADX INFO: renamed from: kk */
    private final C1686kk f6393kk;

    public C1685k4(C10898dy c10898dy, C1684jd c1684jd) {
        super(c10898dy);
        this.f6392k4 = c1684jd;
        this.f6393kk = new C1686kk(c10898dy, c1684jd);
    }

    /* JADX INFO: renamed from: k4 */
    private String m9101k4() {
        int iM9120ix = this.f6392k4.m9120ix();
        if (iM9120ix == 0 || iM9120ix == 1) {
            return "/CIDFontType0";
        }
        if (iM9120ix == 2) {
            return "/CIDFontType2";
        }
        throw new InvalidOperationException("Unexpected font type.");
    }

    @Override // com.aspose.slides.internal.p416tb.AbstractC10914up
    /* JADX INFO: renamed from: k4 */
    public void mo9082k4(C10922yj c10922yj) {
        c10922yj.m52649k4(m52570yj());
        c10922yj.m52676k4(this);
        c10922yj.m52643dy();
        c10922yj.m52666kk("/Type", "/Font");
        c10922yj.m52666kk("/Subtype", m9101k4());
        c10922yj.m52666kk("/BaseFont", C14113y2.m67402k4("/{0}", this.f6392k4.m9127to()));
        c10922yj.m52666kk("/CIDToGIDMap", "/Identity");
        c10922yj.m52666kk("/FontDescriptor", this.f6393kk.m52565c5());
        c10922yj.m52652k4("/DW", 1000);
        c10922yj.m52666kk("/W", this.f6392k4.m9100x1(1000));
        c10922yj.m52650k4("/CIDSystemInfo ");
        c10922yj.m52643dy();
        c10922yj.m52659k4("/Ordering", AbstractDevicePopManager.CertificateProperties.ORGANIZATION_UNIT, true);
        c10922yj.m52659k4("/Registry", "Adobe", true);
        c10922yj.m52652k4("/Supplement", 0);
        c10922yj.m52640c5();
        c10922yj.m52640c5();
        c10922yj.m52678x1();
        this.f6393kk.mo9082k4(c10922yj);
    }
}
