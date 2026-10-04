package com.aspose.slides.internal.p486wy;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p023ak.C1383du;
import com.aspose.slides.internal.p034b3.C1606x1;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.C14116yg;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.wy.jd */
/* JADX INFO: loaded from: classes5.dex */
public class C12317jd extends C12314dy {

    /* JADX INFO: renamed from: ck */
    public List<C12314dy> f41182ck = new List<>();

    /* JADX INFO: renamed from: fa */
    protected boolean f41183fa;

    /* JADX INFO: renamed from: up */
    protected int f41184up;

    /* JADX INFO: renamed from: yj */
    private int f41185yj;

    /* JADX INFO: renamed from: c5 */
    private void m57590c5(int i) {
        if (i >= 0) {
            int iM8672m9 = m8672m9();
            if (iM8672m9 < 0) {
                m8676to(i);
            } else if (i < iM8672m9) {
                m8676to(i);
            }
        }
    }

    @Override // com.aspose.slides.internal.p486wy.C12314dy
    /* JADX INFO: renamed from: ar */
    public int mo57569ar() {
        return this.f41185yj - this.f41184up;
    }

    /* JADX INFO: renamed from: d_ */
    public List<C12314dy> mo57566d_() {
        return this.f41182ck;
    }

    @Override // com.aspose.slides.internal.p486wy.C12314dy, com.aspose.slides.internal.p034b3.C1606x1
    /* JADX INFO: renamed from: k4 */
    public void mo8582k4(C1606x1 c1606x1) {
        if (this.f41182ck.size() == 0) {
            this.f41183fa = m8678x1() == 0;
        }
        C12314dy c12314dy = (C12314dy) c1606x1;
        this.f41182ck.addItem(c12314dy);
        c12314dy.mo8680x1((C1606x1) this);
        if (this.f41183fa) {
            m57583yj(c12314dy.m8659f_());
        }
        m57590c5(c12314dy.m8672m9());
        int iMo57575qq = c12314dy.mo57575qq();
        this.f41184up = C14116yg.m67507x1(this.f41184up, iMo57575qq);
        this.f41185yj = C14116yg.m67483k4(this.f41185yj, c12314dy.mo57569ar() + iMo57575qq);
    }

    @Override // com.aspose.slides.internal.p486wy.C12314dy
    /* JADX INFO: renamed from: qq */
    public int mo57575qq() {
        return m57577um() + this.f41184up;
    }

    @Override // com.aspose.slides.internal.p486wy.C12314dy
    /* JADX INFO: renamed from: x1 */
    public List<C1383du> mo57580x1(List<C1383du> list) {
        List.Enumerator<C12314dy> it = mo57566d_().iterator();
        while (it.hasNext()) {
            try {
                list = it.next().mo57580x1(list);
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        return list;
    }

    @Override // com.aspose.slides.internal.p486wy.C12314dy
    /* JADX INFO: renamed from: k4 */
    public boolean mo57567k4(double d, int i, int i2) {
        int size = this.f41182ck.size();
        int iM8678x1 = 0;
        boolean zMo57567k4 = false;
        for (int i3 = 0; i3 < size; i3++) {
            C12314dy c12314dy = this.f41182ck.get_Item(i3);
            zMo57567k4 |= c12314dy.mo57567k4(d, i, i2);
            iM8678x1 += c12314dy.m8678x1();
        }
        m8679x1(iM8678x1);
        return zMo57567k4;
    }
}
