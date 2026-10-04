package com.aspose.slides.internal.p532yu;

import com.aspose.slides.Collections.ArrayList;
import com.aspose.slides.p559ms.System.Xml.C13890ei;

/* JADX INFO: renamed from: com.aspose.slides.internal.yu.av */
/* JADX INFO: loaded from: classes5.dex */
public final class C12901av extends C13192rv {

    /* JADX INFO: renamed from: c5 */
    private int f43417c5;

    /* JADX INFO: renamed from: du */
    private C13047jd f43418du;

    /* JADX INFO: renamed from: dy */
    private C12979f7 f43419dy;

    /* JADX INFO: renamed from: h4 */
    private C13047jd[] f43420h4;

    /* JADX INFO: renamed from: m9 */
    private C12930cj f43421m9;

    public C12901av(C13047jd c13047jd, C13047jd[] c13047jdArr, C12930cj c12930cj, C12979f7 c12979f7, int i, int i2, boolean z, boolean z2) {
        super(i2, z, z2);
        this.f43418du = c13047jd;
        this.f43420h4 = c13047jdArr;
        this.f43421m9 = c12930cj;
        this.f43419dy = c12979f7;
        this.f43417c5 = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0042 A[PHI: r2
      0x0042: PHI (r2v5 java.lang.String) = (r2v4 java.lang.String), (r2v7 java.lang.String) binds: [B:12:0x0040, B:9:0x0035] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.aspose.slides.internal.p532yu.C13192rv
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ArrayList mo60049k4(C13190rs c13190rs, boolean z) {
        String strMo60242c5;
        C13047jd c13047jd = c13190rs.f44262ks[c13190rs.f44267up.f44120kk];
        ArrayList arrayList = null;
        for (int iM61003to = c13047jd.m61003to(-1); iM61003to != -1; iM61003to = c13047jd.m61003to(iM61003to)) {
            if (arrayList == null) {
                arrayList = new ArrayList();
            }
            AbstractC12950dp abstractC12950dp = (AbstractC12950dp) this.f43419dy.m60616k4(iM61003to).f43530x1;
            if (abstractC12950dp == null) {
                strMo60242c5 = this.f43421m9.m60141x1(this.f43419dy.m60616k4(iM61003to).f43529k4);
                if (strMo60242c5.length() != 0) {
                    arrayList.addItem(strMo60242c5);
                }
            } else {
                strMo60242c5 = abstractC12950dp.mo60242c5();
                if (!arrayList.contains(strMo60242c5)) {
                }
            }
        }
        return arrayList;
    }

    @Override // com.aspose.slides.internal.p532yu.C13192rv
    /* JADX INFO: renamed from: x1 */
    public boolean mo60053x1(C13190rs c13190rs) {
        return c13190rs.f44262ks[c13190rs.f44267up.f44120kk].m60999k4(this.f43417c5);
    }

    @Override // com.aspose.slides.internal.p532yu.C13192rv
    /* JADX INFO: renamed from: k4 */
    public ArrayList mo60050k4(C13190rs c13190rs, boolean z, C13129ny c13129ny) {
        ArrayList arrayList = new ArrayList();
        C13047jd c13047jd = c13190rs.f44262ks[c13190rs.f44267up.f44120kk];
        for (int iM61003to = c13047jd.m61003to(-1); iM61003to != -1; iM61003to = c13047jd.m61003to(iM61003to)) {
            AbstractC12950dp abstractC12950dp = (AbstractC12950dp) this.f43419dy.m60616k4(iM61003to).f43530x1;
            if (abstractC12950dp != null) {
                C13192rv.m61454k4(abstractC12950dp, c13129ny, arrayList);
            }
        }
        return arrayList;
    }

    @Override // com.aspose.slides.internal.p532yu.C13192rv
    /* JADX INFO: renamed from: k4 */
    public Object mo60051k4(C13890ei c13890ei, C13190rs c13190rs, int[] iArr) {
        Object obj;
        C13047jd[] c13047jdArr = c13190rs.f44262ks;
        int i = c13190rs.f44267up.f44120kk;
        C13047jd c13047jd = c13047jdArr[i];
        int i2 = (i + 1) % 2;
        C13047jd c13047jd2 = c13047jdArr[i2];
        c13047jd2.m61005x1();
        int iM60135k4 = this.f43421m9.m60135k4(c13890ei);
        iArr[0] = 0;
        int iM61003to = c13047jd.m61003to(-1);
        while (true) {
            if (iM61003to == -1) {
                obj = null;
                break;
            }
            if (iM60135k4 == this.f43419dy.m60616k4(iM61003to).f43529k4) {
                c13047jd2.m61007x1(this.f43420h4[iM61003to]);
                obj = this.f43419dy.m60616k4(iM61003to).f43530x1;
                break;
            }
            iM61003to = c13047jd.m61003to(iM61003to);
        }
        if (!c13047jd2.m61004to()) {
            c13190rs.f44267up.f44120kk = i2;
            return obj;
        }
        if (m61459to() && c13047jd.m60999k4(this.f43417c5)) {
            return null;
        }
        c13190rs.f44261kk = false;
        iArr[0] = -1;
        return null;
    }

    @Override // com.aspose.slides.internal.p532yu.C13192rv
    /* JADX INFO: renamed from: k4 */
    public void mo60052k4(C13190rs c13190rs) {
        c13190rs.f44262ks[0] = this.f43418du.m61000kk();
        c13190rs.f44262ks[1] = new C13047jd(this.f43418du.m60997k4());
        c13190rs.f44267up.f44120kk = 0;
    }
}
