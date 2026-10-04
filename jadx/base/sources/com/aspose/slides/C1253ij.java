package com.aspose.slides;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.List;

/* JADX INFO: renamed from: com.aspose.slides.ij */
/* JADX INFO: loaded from: classes3.dex */
class C1253ij {

    /* JADX INFO: renamed from: k4 */
    private C14843yd f5715k4;

    /* JADX INFO: renamed from: x1 */
    private long f5716x1;

    public C1253ij(long j, long j2, long j3) {
        this.f5715k4 = new C14843yd(j, j2);
        this.f5716x1 = j3;
    }

    /* JADX INFO: renamed from: k4 */
    public C14843yd m7640k4() {
        return this.f5715k4;
    }

    /* JADX INFO: renamed from: x1 */
    public long m7642x1() {
        return this.f5716x1;
    }

    public C1253ij(String str, String str2, String str3, Dictionary<String, Integer> dictionary, List<C0899df> list) {
        this.f5715k4 = new C14843yd(str, str2, dictionary, list);
        this.f5716x1 = C13760l2.m64252k4(str3, dictionary, list);
    }

    /* JADX INFO: renamed from: k4 */
    public void m7641k4(long j) {
        this.f5716x1 = j;
    }
}
