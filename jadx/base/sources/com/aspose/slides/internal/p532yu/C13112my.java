package com.aspose.slides.internal.p532yu;

import com.aspose.slides.Collections.ArrayList;
import com.aspose.slides.p559ms.System.Xml.C13890ei;

/* JADX INFO: renamed from: com.aspose.slides.internal.yu.my */
/* JADX INFO: loaded from: classes5.dex */
public final class C13112my extends C13192rv {

    /* JADX INFO: renamed from: du */
    private int[][] f44117du;

    /* JADX INFO: renamed from: h4 */
    private C12930cj f44118h4;

    public C13112my(int[][] iArr, C12930cj c12930cj, int i, boolean z, boolean z2) {
        super(i, z, z2);
        this.f44117du = iArr;
        this.f44118h4 = c12930cj;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033 A[PHI: r1
      0x0033: PHI (r1v7 java.lang.String) = (r1v6 java.lang.String), (r1v9 java.lang.String) binds: [B:17:0x003f, B:14:0x0031] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.aspose.slides.internal.p532yu.C13192rv
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ArrayList mo60049k4(C13190rs c13190rs, boolean z) {
        String strMo60242c5;
        int[] iArr = this.f44117du[c13190rs.f44267up.f44119k4];
        ArrayList arrayList = null;
        if (iArr != null) {
            for (int i = 0; i < iArr.length - 1; i++) {
                if (iArr[i] != -1) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    AbstractC12950dp abstractC12950dp = (AbstractC12950dp) this.f44118h4.m60138k4(i);
                    if (abstractC12950dp == null) {
                        strMo60242c5 = this.f44118h4.m60141x1(i);
                        if (strMo60242c5.length() != 0) {
                            arrayList.addItem(strMo60242c5);
                        }
                    } else {
                        strMo60242c5 = abstractC12950dp.mo60242c5();
                        if (!arrayList.contains(strMo60242c5)) {
                        }
                    }
                }
            }
        }
        return arrayList;
    }

    @Override // com.aspose.slides.internal.p532yu.C13192rv
    /* JADX INFO: renamed from: x1 */
    public boolean mo60053x1(C13190rs c13190rs) {
        return c13190rs.f44270yj;
    }

    @Override // com.aspose.slides.internal.p532yu.C13192rv
    /* JADX INFO: renamed from: k4 */
    public ArrayList mo60050k4(C13190rs c13190rs, boolean z, C13129ny c13129ny) {
        AbstractC12950dp abstractC12950dp;
        ArrayList arrayList = new ArrayList();
        int[] iArr = this.f44117du[c13190rs.f44267up.f44119k4];
        if (iArr != null) {
            for (int i = 0; i < iArr.length - 1; i++) {
                if (iArr[i] != -1 && (abstractC12950dp = (AbstractC12950dp) this.f44118h4.m60138k4(i)) != null) {
                    C13192rv.m61454k4(abstractC12950dp, c13129ny, arrayList);
                }
            }
        }
        return arrayList;
    }

    @Override // com.aspose.slides.internal.p532yu.C13192rv
    /* JADX INFO: renamed from: k4 */
    public Object mo60051k4(C13890ei c13890ei, C13190rs c13190rs, int[] iArr) {
        int iM60135k4 = this.f44118h4.m60135k4(c13890ei);
        int[][] iArr2 = this.f44117du;
        C13114n0 c13114n0 = c13190rs.f44267up;
        int i = iArr2[c13114n0.f44119k4][iM60135k4];
        iArr[0] = 0;
        if (i != -1) {
            c13114n0.f44119k4 = i;
            c13190rs.f44270yj = iArr2[i][this.f44118h4.m60134k4()] > 0;
            return this.f44118h4.m60138k4(iM60135k4);
        }
        if (m61459to() && c13190rs.f44270yj) {
            return null;
        }
        c13190rs.f44261kk = false;
        iArr[0] = -1;
        return null;
    }

    @Override // com.aspose.slides.internal.p532yu.C13192rv
    /* JADX INFO: renamed from: k4 */
    public void mo60052k4(C13190rs c13190rs) {
        c13190rs.f44267up.f44119k4 = 0;
        c13190rs.f44270yj = this.f44117du[0][this.f44118h4.m60134k4()] > 0;
    }
}
