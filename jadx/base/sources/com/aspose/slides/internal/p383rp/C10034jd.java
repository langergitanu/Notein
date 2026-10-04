package com.aspose.slides.internal.p383rp;

import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.C14044b3;
import com.aspose.slides.p559ms.System.C14057f9;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.rp.jd */
/* JADX INFO: loaded from: classes4.dex */
public class C10034jd {

    /* JADX INFO: renamed from: k4 */
    private int f36084k4;

    /* JADX INFO: renamed from: x1 */
    private int f36085x1;

    public C10034jd() {
    }

    public boolean equals(Object obj) {
        return m49309k4(this, (C10034jd) C7019kk.m27452k4(obj, C10034jd.class));
    }

    public int hashCode() {
        return this.f36085x1 ^ this.f36084k4;
    }

    /* JADX INFO: renamed from: k4 */
    public int m49310k4() {
        return this.f36084k4;
    }

    /* JADX INFO: renamed from: kk */
    public double m49311kk() {
        return C7019kk.m27433c5(Integer.valueOf(this.f36085x1), 9) / ((double) this.f36084k4);
    }

    public String toString() {
        return C14113y2.m67407k4(C14044b3.m66433k4(m49311kk(), "F2"), " (", C14057f9.m66591x1(this.f36085x1), "/", C14057f9.m66591x1(this.f36084k4), C7019kk.m27446k4(')'));
    }

    /* JADX INFO: renamed from: x1 */
    public int m49312x1() {
        return this.f36085x1;
    }

    public C10034jd(int i, int i2) {
        this.f36085x1 = i;
        this.f36084k4 = i2;
    }

    /* JADX INFO: renamed from: k4 */
    public static boolean m49309k4(C10034jd c10034jd, C10034jd c10034jd2) {
        return (C14067j2.m66729x1(c10034jd, null) || C14067j2.m66729x1(c10034jd2, null)) ? C14067j2.m66729x1(c10034jd, null) && C14067j2.m66729x1(c10034jd2, null) : c10034jd.f36085x1 == c10034jd2.f36085x1 && c10034jd.f36084k4 == c10034jd2.f36084k4;
    }
}
