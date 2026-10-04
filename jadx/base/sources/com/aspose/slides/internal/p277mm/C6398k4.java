package com.aspose.slides.internal.p277mm;

import com.aspose.slides.internal.p244l7.C6012x1;
import com.aspose.slides.internal.p347px.AbstractC9588jd;
import com.aspose.slides.internal.p347px.C9579bv;
import com.aspose.slides.internal.p347px.C9580c5;
import com.aspose.slides.internal.p347px.C9589k4;
import com.aspose.slides.internal.p347px.C9599um;
import com.aspose.slides.internal.p347px.C9606x6;
import com.aspose.slides.internal.p498xe.C12524x6;

/* JADX INFO: renamed from: com.aspose.slides.internal.mm.k4 */
/* JADX INFO: loaded from: classes4.dex */
public class C6398k4 {
    /* JADX INFO: renamed from: k4 */
    public static C9579bv m26254k4(C9580c5 c9580c5, C6012x1.k4 k4Var) {
        C9579bv c9579bvM26255k4 = m26255k4(C9589k4.m46842k4(), k4Var);
        return c9579bvM26255k4 == null ? m26255k4(C9599um.m46881k4(), k4Var) : c9579bvM26255k4;
    }

    /* JADX INFO: renamed from: k4 */
    private static C9579bv m26255k4(AbstractC9588jd abstractC9588jd, C6012x1.k4 k4Var) {
        C9579bv c9579bvMo46817kk;
        int iM26265kk = C6400x1.m26265kk(k4Var);
        C12524x6 c12524x6 = new C12524x6(k4Var.f17019up);
        byte bM58292x1 = c12524x6.m58292x1();
        byte bM58291kk = c12524x6.m58291kk();
        if ((bM58291kk == 2 && (bM58292x1 == 0 || bM58292x1 == 2)) || (bM58291kk == 0 && bM58292x1 == 0)) {
            c9579bvMo46817kk = abstractC9588jd.mo46817kk("Arial", iM26265kk);
            if (c9579bvMo46817kk != null) {
                return c9579bvMo46817kk;
            }
        } else {
            c9579bvMo46817kk = null;
        }
        if ((bM58291kk == 2 || bM58291kk == 0) && bM58292x1 == 1 && (c9579bvMo46817kk = abstractC9588jd.mo46817kk("Times New Roman", iM26265kk)) != null) {
            return c9579bvMo46817kk;
        }
        for (C9606x6 c9606x6 : abstractC9588jd.mo46819x1()) {
            C9579bv c9579bvMo46818x1 = abstractC9588jd.mo46818x1(c9606x6.m46918k4(), iM26265kk);
            byte[] bArrM46793ks = c9579bvMo46818x1.m46793ks();
            boolean z = (bArrM46793ks[3] & 255) == 9;
            byte b = bArrM46793ks[1];
            boolean z2 = (b & 255) == 11 || (b & 255) == 12 || (b & 255) == 13;
            boolean z3 = (z2 || (b & 255) == 1) ? false : true;
            if (bM58292x1 == 0 ? bM58291kk == 0 || (bM58291kk == 1 ? z : !(bM58291kk != 2 || z)) : bM58292x1 == 1 ? !(!z3 || (bM58291kk != 0 && (bM58291kk == 1 ? !z : bM58291kk != 2 || z))) : !(bM58292x1 == 2 ? !z2 || (bM58291kk != 0 && (bM58291kk == 1 ? !z : bM58291kk != 2 || z)) : bM58292x1 == 3 ? !z : bM58292x1 == 4 ? (bArrM46793ks[0] & 255) != 3 || (bM58291kk != 0 && (bM58291kk == 1 ? !z : bM58291kk != 2 || z)) : bM58292x1 != 5 || (bArrM46793ks[0] & 255) != 4 || (bM58291kk != 0 && (bM58291kk == 1 ? !z : bM58291kk != 2 || z)))) {
                c9579bvMo46817kk = c9579bvMo46818x1;
            }
            if (c9579bvMo46817kk != null) {
                return c9579bvMo46817kk;
            }
        }
        return abstractC9588jd.mo46813k4(iM26265kk);
    }
}
