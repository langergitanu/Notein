package com.aspose.slides.internal.p486wy;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p023ak.C1383du;
import com.aspose.slides.internal.p502xk.C12541k4;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.wy.x6 */
/* JADX INFO: loaded from: classes5.dex */
public class C12326x6 extends C12314dy {

    /* JADX INFO: renamed from: ck */
    protected String f41199ck;

    /* JADX INFO: renamed from: fa */
    protected int[] f41200fa;

    /* JADX INFO: renamed from: ks */
    protected boolean f41201ks;

    /* JADX INFO: renamed from: up */
    protected int[] f41202up;

    /* JADX INFO: renamed from: yj */
    protected int[][] f41203yj;

    /* JADX INFO: renamed from: com.aspose.slides.internal.wy.x6$k4 */
    public static class k4 {
        /* JADX INFO: renamed from: k4 */
        public static String m57622k4(String str) {
            char[] cArrM67365dy = C14113y2.m67365dy(str);
            AbstractC14092to.m67248to(AbstractC14092to.m67208k4((Object) cArrM67365dy));
            return C14113y2.m67405k4(cArrM67365dy);
        }
    }

    public C12326x6(int i, int i2, String str, int[] iArr, int[] iArr2, int[][] iArr3) {
        this(i, i2, str, iArr, iArr2, iArr3, false);
    }

    /* JADX INFO: renamed from: k4 */
    private static void m57611k4(int[] iArr) {
        int length = iArr.length;
        int i = length / 2;
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = (length - i2) - 1;
            int i4 = iArr[i3];
            iArr[i3] = iArr[i2];
            iArr[i2] = i4;
        }
    }

    /* JADX INFO: renamed from: b3 */
    public final boolean m57616b3() {
        return this.f41201ks;
    }

    /* JADX INFO: renamed from: u4 */
    public final String m57617u4() {
        return this.f41199ck;
    }

    /* JADX INFO: renamed from: uz */
    public final int[] m57618uz() {
        return this.f41200fa;
    }

    /* JADX INFO: renamed from: wl */
    public final int[] m57619wl() {
        return this.f41202up;
    }

    @Override // com.aspose.slides.internal.p486wy.C12314dy
    /* JADX INFO: renamed from: x1 */
    public List<C1383du> mo57580x1(List<C1383du> list) {
        list.addItem(m57619wl() != null ? new C1383du(this, m57619wl()) : new C1383du(this, -1, this.f41199ck.length()));
        return list;
    }

    /* JADX INFO: renamed from: yd */
    public final void m57621yd() {
        if (this.f41199ck.length() > 0) {
            this.f41199ck = C12541k4.m58367k4(this.f41199ck);
        }
    }

    public C12326x6(int i, int i2, String str, int[] iArr, int[] iArr2, int[][] iArr3, boolean z) {
        super(i, i2);
        int length = str != null ? str.length() : 0;
        this.f41199ck = str;
        this.f41200fa = m57613k4(iArr, length);
        this.f41202up = m57614k4(iArr2, i2, length);
        this.f41203yj = m57615k4(iArr3, length);
        this.f41201ks = z;
    }

    /* JADX INFO: renamed from: k4 */
    private static void m57612k4(int[][] iArr) {
        int length = iArr.length;
        int i = length / 2;
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = (length - i2) - 1;
            int[] iArr2 = iArr[i3];
            iArr[i3] = iArr[i2];
            iArr[i2] = iArr2;
        }
    }

    /* JADX INFO: renamed from: x1 */
    public final void m57620x1(boolean z) {
        if (this.f41199ck.length() > 0) {
            this.f41199ck = k4.m57622k4(this.f41199ck);
            int[] iArr = this.f41202up;
            if (iArr != null) {
                m57611k4(iArr);
            }
            int[][] iArr2 = this.f41203yj;
            if (iArr2 != null) {
                m57612k4(iArr2);
            }
            this.f41201ks = !this.f41201ks;
            if (z) {
                this.f41199ck = C12541k4.m58367k4(this.f41199ck);
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    private static int[] m57613k4(int[] iArr, int i) {
        if (iArr == null || iArr.length == i) {
            return iArr;
        }
        int[] iArr2 = new int[i];
        int length = iArr.length;
        for (int i2 = 0; i2 < length && i2 < i; i2++) {
            iArr2[i2] = iArr[i2];
        }
        return iArr2;
    }

    /* JADX INFO: renamed from: k4 */
    private static int[] m57614k4(int[] iArr, int i, int i2) {
        if (iArr == null && i >= 0) {
            iArr = new int[i2];
            for (int i3 = 0; i3 < i2; i3++) {
                iArr[i3] = i;
            }
        }
        return m57613k4(iArr, i2);
    }

    /* JADX INFO: renamed from: k4 */
    private static int[][] m57615k4(int[][] iArr, int i) {
        if (iArr == null || iArr.length == i) {
            return iArr;
        }
        int[][] iArr2 = new int[i][];
        int length = iArr.length;
        for (int i2 = 0; i2 < length && i2 < i; i2++) {
            iArr2[i2] = iArr[i2];
        }
        return iArr2;
    }
}
