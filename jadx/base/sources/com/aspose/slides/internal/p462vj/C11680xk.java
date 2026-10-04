package com.aspose.slides.internal.p462vj;

import com.aspose.slides.internal.p409sv.C10793wy;
import com.aspose.slides.internal.p486wy.C12314dy;
import com.aspose.slides.internal.p486wy.C12320ks;
import com.aspose.slides.internal.p486wy.C12322rv;
import com.aspose.slides.internal.p513xw.C12724ss;
import com.aspose.slides.internal.p513xw.C12737w6;

/* JADX INFO: renamed from: com.aspose.slides.internal.vj.xk */
/* JADX INFO: loaded from: classes4.dex */
public class C11680xk extends AbstractC11678x1 {
    public C11680xk(C10793wy c10793wy) {
        super(c10793wy);
    }

    /* JADX INFO: renamed from: wy */
    private C12314dy m55028wy() {
        C12320ks c12322rv;
        C12737w6 c12737w6M58918k4 = mo54979qq().m58918k4(((AbstractC11678x1) this).f39487c5.m52273f9());
        int iM55026yd = m55026yd();
        if (c12737w6M58918k4 != null) {
            String strM59338h4 = c12737w6M58918k4.m59338h4();
            c12322rv = new C12320ks();
            int iM55024k4 = m55024k4(strM59338h4);
            c12322rv.m8676to(iM55026yd);
            c12322rv.m57606k4(strM59338h4, 0, iM55026yd);
            c12322rv.m8679x1(iM55024k4);
            ((AbstractC11678x1) this).f39488ck = true;
        } else {
            c12322rv = new C12322rv(((AbstractC11678x1) this).f39487c5.m52273f9(), ((AbstractC11678x1) this).f39489jd);
            int iM55024k42 = m55024k4("MMM");
            c12322rv.m8676to(iM55026yd);
            c12322rv.m8679x1(iM55024k42);
            ((AbstractC11678x1) this).f39488ck = false;
        }
        m55025k4(c12322rv);
        return c12322rv;
    }

    @Override // com.aspose.slides.internal.p462vj.AbstractC11681yd
    /* JADX INFO: renamed from: x1 */
    public C12314dy mo54818x1(C12724ss c12724ss) {
        C12314dy c12314dyM55028wy = m55028wy();
        ((AbstractC11681yd) this).f39494fa = c12314dyM55028wy;
        return c12314dyM55028wy;
    }
}
