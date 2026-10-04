package com.aspose.slides.internal.p462vj;

import com.aspose.slides.internal.p034b3.C1583dq;
import com.aspose.slides.internal.p034b3.C1604wl;
import com.aspose.slides.internal.p034b3.C1606x1;
import com.aspose.slides.internal.p057c6.C1982jd;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p409sv.C10772du;
import com.aspose.slides.internal.p486wy.C12314dy;
import com.aspose.slides.internal.p486wy.C12317jd;
import com.aspose.slides.internal.p486wy.C12319kk;
import com.aspose.slides.internal.p513xw.C12703j2;
import com.aspose.slides.internal.p513xw.C12712m2;

/* JADX INFO: renamed from: com.aspose.slides.internal.vj.m9 */
/* JADX INFO: loaded from: classes4.dex */
public class C11665m9 extends C11674uz {
    public C11665m9(C10772du c10772du) {
        super(c10772du);
    }

    /* JADX INFO: renamed from: k4 */
    public static void m54912k4(C1606x1 c1606x1, C10772du c10772du, C12703j2 c12703j2) {
        C12712m2.m59047k4(c1606x1, c10772du.m52226wp());
        if (!c10772du.m52220gi()) {
            if (c10772du.m52223s7()) {
                String strM10107k4 = C1982jd.m10107k4(c10772du.m52221kp());
                boolean z = c10772du.m52218f9() == 190;
                if (strM10107k4.length() > 0) {
                    c1606x1.m8667k4(2, new C1583dq.x1(strM10107k4, z));
                    return;
                }
                return;
            }
            return;
        }
        String strM52224ss = c10772du.m52224ss();
        C1604wl c1604wl = new C1604wl(strM52224ss, c1606x1);
        c1604wl.m8651k4(strM52224ss, c12703j2.m58918k4(strM52224ss));
        if (c1604wl.mo8591kk()) {
            return;
        }
        c12703j2.m58921k4(strM52224ss, c1604wl);
        if (C7019kk.m27469x1(c1606x1, C12319kk.class)) {
            ((C12319kk) c1606x1).m57598k4(c1604wl);
        }
    }

    @Override // com.aspose.slides.internal.p462vj.C11674uz
    /* JADX INFO: renamed from: to */
    public C12314dy mo54913to(boolean z) {
        C12314dy c12314dyMo54913to = super.mo54913to(z);
        m54912k4(c12314dyMo54913to, (C10772du) this.f42282kk, mo54979qq());
        return c12314dyMo54913to;
    }

    @Override // com.aspose.slides.internal.p462vj.C11674uz
    /* JADX INFO: renamed from: yd */
    public C12317jd mo54914yd() {
        return new C12319kk();
    }
}
