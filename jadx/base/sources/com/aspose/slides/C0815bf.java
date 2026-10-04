package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p332p7.C7917ia;
import com.aspose.slides.internal.p332p7.C9038vg;
import com.aspose.slides.internal.p332p7.C9192xf;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.bf */
/* JADX INFO: loaded from: classes3.dex */
class C0815bf {
    /* JADX INFO: renamed from: k4 */
    public static void m4162k4(C1162gu c1162gu, C9038vg c9038vg, gnb gnbVar) {
        if (c1162gu == null) {
            throw new ArgumentNullException("formatOverrides");
        }
        if (c9038vg == null || c9038vg.m43095k4() == null) {
            return;
        }
        for (C7917ia c7917ia : c9038vg.m43095k4()) {
            if (c7917ia != null) {
                C14197nq c14197nq = new C14197nq(c1162gu);
                C0818bi.m4212k4(c14197nq, c7917ia, gnbVar);
                c1162gu.m6907k4(c14197nq);
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static void m4163k4(C1162gu c1162gu, C9192xf c9192xf, u8s u8sVar) {
        if (c1162gu == null) {
            throw new ArgumentNullException("formatOverrides");
        }
        C9038vg c9038vg = new C9038vg();
        com.aspose.slides.Collections.Generic.IGenericCollection<C14197nq> iGenericCollectionM6905k4 = c1162gu.m6905k4();
        if (iGenericCollectionM6905k4 != null) {
            IGenericEnumerator<C14197nq> it = iGenericCollectionM6905k4.iterator();
            while (it.hasNext()) {
                try {
                    C14197nq next = it.next();
                    C7917ia c7917ia = new C7917ia();
                    C0818bi.m4213k4(next, c7917ia, u8sVar);
                    c9038vg.m43094k4(c7917ia);
                } finally {
                    if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                        it.dispose();
                    }
                }
            }
        }
        c9192xf.m44320k4(c9038vg);
    }
}
