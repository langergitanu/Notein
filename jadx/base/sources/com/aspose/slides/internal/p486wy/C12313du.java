package com.aspose.slides.internal.p486wy;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.wy.du */
/* JADX INFO: loaded from: classes5.dex */
public class C12313du extends C12317jd {

    /* JADX INFO: renamed from: yj */
    private int f41169yj;

    /* JADX INFO: renamed from: c5 */
    public final void m57565c5(int i) {
        this.f41169yj = i;
    }

    @Override // com.aspose.slides.internal.p486wy.C12317jd
    /* JADX INFO: renamed from: d_ */
    public List<C12314dy> mo57566d_() {
        int iM8678x1 = m8678x1() / this.f41169yj;
        List<C12314dy> list = new List<>();
        for (int i = 0; i < iM8678x1; i++) {
            list.addRange(((C12317jd) this).f41182ck);
        }
        return list;
    }

    @Override // com.aspose.slides.internal.p034b3.C1606x1
    /* JADX INFO: renamed from: e_ */
    public int mo8658e_() {
        List.Enumerator<C12314dy> it = mo57566d_().iterator();
        int iMo8658e_ = 0;
        while (it.hasNext()) {
            try {
                C12314dy next = it.next();
                if (iMo8658e_ < next.mo8658e_()) {
                    iMo8658e_ = next.mo8658e_();
                }
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        return iMo8658e_;
    }

    @Override // com.aspose.slides.internal.p486wy.C12317jd, com.aspose.slides.internal.p486wy.C12314dy
    /* JADX INFO: renamed from: k4 */
    public boolean mo57567k4(double d, int i, int i2) {
        m8679x1(((C12314dy) this).f41173jd.m57584k4(d) + m8678x1());
        return false;
    }

    /* JADX INFO: renamed from: u4 */
    public final int m57568u4() {
        return this.f41169yj;
    }
}
