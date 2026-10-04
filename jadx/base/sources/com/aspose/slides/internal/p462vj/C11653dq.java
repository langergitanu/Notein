package com.aspose.slides.internal.p462vj;

import com.aspose.slides.internal.p409sv.C10764ak;
import com.aspose.slides.internal.p486wy.C12314dy;
import com.aspose.slides.internal.p486wy.C12320ks;
import com.aspose.slides.internal.p486wy.C12322rv;
import com.aspose.slides.internal.p513xw.C12724ss;
import com.aspose.slides.internal.p513xw.InterfaceC12711lr;

/* JADX INFO: renamed from: com.aspose.slides.internal.vj.dq */
/* JADX INFO: loaded from: classes4.dex */
public class C11653dq extends AbstractC11678x1 {
    public C11653dq(C10764ak c10764ak) {
        super(c10764ak);
        ((AbstractC11678x1) this).f39487c5 = c10764ak;
    }

    /* JADX INFO: renamed from: to */
    private C12314dy m54823to(InterfaceC12711lr interfaceC12711lr) {
        C12320ks c12320ks;
        int iM55026yd = m55026yd();
        if (mo54979qq().m58924to(((AbstractC11678x1) this).f39487c5.m52273f9())) {
            String strM59338h4 = mo54979qq().m58926x1(((AbstractC11678x1) this).f39487c5.m52273f9()).m59338h4();
            C12320ks c12320ks2 = new C12320ks();
            int iM55024k4 = m55024k4(strM59338h4);
            c12320ks2.m8676to(iM55026yd);
            c12320ks2.m57606k4(strM59338h4, 0, iM55026yd);
            c12320ks2.m8679x1(iM55024k4);
            ((AbstractC11678x1) this).f39488ck = true;
            c12320ks = c12320ks2;
        } else {
            C12322rv c12322rv = new C12322rv(((AbstractC11678x1) this).f39487c5.m52273f9(), ((AbstractC11678x1) this).f39489jd, false);
            mo54979qq().m58921k4(((AbstractC11678x1) this).f39487c5.m52273f9(), c12322rv);
            int iM55024k42 = m55024k4("MMM");
            c12322rv.m8676to(iM55026yd);
            c12322rv.m8679x1(iM55024k42);
            ((AbstractC11678x1) this).f39488ck = false;
            c12320ks = c12322rv;
        }
        m55025k4(c12320ks);
        return c12320ks;
    }

    @Override // com.aspose.slides.internal.p462vj.AbstractC11681yd
    /* JADX INFO: renamed from: x1 */
    public C12314dy mo54818x1(C12724ss c12724ss) {
        C12314dy c12314dyM54823to = m54823to(this.f42381to);
        ((AbstractC11681yd) this).f39494fa = c12314dyM54823to;
        return c12314dyM54823to;
    }
}
