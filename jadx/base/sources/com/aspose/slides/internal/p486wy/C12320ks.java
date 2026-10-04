package com.aspose.slides.internal.p486wy;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p034b3.C1606x1;
import com.aspose.slides.internal.p294n9.C6765kp;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p380ri.C10018x1;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.wy.ks */
/* JADX INFO: loaded from: classes5.dex */
public class C12320ks extends AbstractC12318k4 {
    public C12320ks() {
    }

    /* JADX INFO: renamed from: k4 */
    private static int m57600k4(int[] iArr) {
        if (iArr == null) {
            return -1;
        }
        int i = Integer.MAX_VALUE;
        for (int i2 : iArr) {
            if (i2 >= 0 && i2 < i) {
                i = i2;
            }
        }
        if (i == Integer.MAX_VALUE) {
            return -1;
        }
        return i;
    }

    /* JADX INFO: renamed from: ne */
    private void m57602ne(int i) {
        if (i >= 0) {
            int iM8672m9 = m8672m9();
            if (iM8672m9 < 0) {
                m8676to(i);
            } else if (i < iM8672m9) {
                m8676to(i);
            }
        }
    }

    /* JADX INFO: renamed from: b3 */
    public String mo57603b3() {
        C6765kp c6765kp = new C6765kp();
        List.Enumerator<C12314dy> it = ((C12317jd) this).f41182ck.iterator();
        while (it.hasNext()) {
            try {
                C12314dy next = it.next();
                c6765kp.m26792k4(C7019kk.m27469x1(next, C12326x6.class) ? ((C12326x6) next).m57617u4() : ((C12327yj) next).m57623u4());
            } catch (Throwable th) {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
                throw th;
            }
        }
        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
            it.dispose();
        }
        return c6765kp.toString();
    }

    @Override // com.aspose.slides.internal.p034b3.C1606x1
    public String toString() {
        C6765kp c6765kp = new C6765kp(super.toString());
        c6765kp.m26792k4(" {text=\"");
        c6765kp.m26792k4(C10018x1.m49176k4(mo57603b3()));
        c6765kp.m26792k4("\"");
        c6765kp.m26792k4("}");
        return c6765kp.toString();
    }

    /* JADX INFO: renamed from: yd */
    public final void m57608yd() {
        ((C12317jd) this).f41182ck.clear();
    }

    public C12320ks(int i, int i2, int i3) {
        super(i, i2, i3);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m57604k4(char c, int i, boolean z, int i2, int i3) {
        C12327yj c12327yj = new C12327yj(i2, i3, c, z);
        c12327yj.m8679x1(i);
        mo8582k4((C1606x1) c12327yj);
        c12327yj.mo8680x1((C1606x1) this);
        m57602ne(i3);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m57605k4(String str, int i) {
        m57607k4(str, 0, null, null, null, i);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m57606k4(String str, int i, int i2) {
        m57607k4(str, 0, null, m57601k4(i2, str.length()), null, i);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m57607k4(String str, int i, int[] iArr, int[] iArr2, int[][] iArr3, int i2) {
        int iM57600k4 = m57600k4(iArr2);
        C12326x6 c12326x6 = new C12326x6(i2, iM57600k4, str, iArr, iArr2, iArr3);
        c12326x6.m8679x1(i);
        mo8582k4((C1606x1) c12326x6);
        c12326x6.mo8680x1((C1606x1) this);
        m57602ne(iM57600k4);
    }

    /* JADX INFO: renamed from: k4 */
    private int[] m57601k4(int i, int i2) {
        if (i < 0) {
            return null;
        }
        int[] iArr = new int[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            iArr[i3] = i;
        }
        return iArr;
    }
}
