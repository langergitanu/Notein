package com.aspose.slides.internal.p019ac;

import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.internal.p498xe.C12521uz;
import com.aspose.slides.p559ms.System.C14067j2;

/* JADX INFO: renamed from: com.aspose.slides.internal.ac.uz */
/* JADX INFO: loaded from: classes3.dex */
public class C1356uz extends AbstractC1349ne {

    /* JADX INFO: renamed from: du */
    private C12521uz f5878du;

    /* JADX INFO: renamed from: k4 */
    private long f5879k4;

    /* JADX INFO: renamed from: kk */
    private long f5880kk;

    /* JADX INFO: renamed from: to */
    private long f5881to;

    /* JADX INFO: renamed from: x1 */
    private long f5882x1;

    public boolean equals(Object obj) {
        if (C14067j2.m66729x1(null, obj)) {
            return false;
        }
        if (C14067j2.m66729x1(this, obj)) {
            return true;
        }
        if (C14067j2.m66727k4(obj) != C14067j2.m66727k4(this)) {
            return false;
        }
        return m8000k4((C1356uz) obj);
    }

    public int hashCode() {
        int i = ((((((((int) this.f5879k4) * 397) ^ ((int) this.f5882x1)) * 397) ^ ((int) this.f5880kk)) * 397) ^ ((int) this.f5881to)) * 397;
        C12521uz c12521uz = this.f5878du;
        return i ^ (c12521uz != null ? c12521uz.hashCode() : 0);
    }

    /* JADX INFO: renamed from: k4 */
    public final long m7997k4() {
        return this.f5880kk;
    }

    /* JADX INFO: renamed from: kk */
    public final void m8001kk(long j) {
        this.f5880kk = j;
    }

    /* JADX INFO: renamed from: to */
    public final void m8002to(long j) {
        this.f5881to = j;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m8003x1(long j) {
        if ((4294967295L & j) != 1) {
            throw new ArgumentOutOfRangeException("value");
        }
        this.f5882x1 = j;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m7998k4(long j) {
        if ((4294967295L & j) != 32) {
            throw new ArgumentOutOfRangeException("value");
        }
        this.f5879k4 = j;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m7999k4(C12521uz c12521uz) {
        this.f5878du = c12521uz;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m8000k4(C1356uz c1356uz) {
        return this.f5879k4 == c1356uz.f5879k4 && this.f5882x1 == c1356uz.f5882x1 && this.f5880kk == c1356uz.f5880kk && this.f5881to == c1356uz.f5881to && C14067j2.m66728k4(this.f5878du, c1356uz.f5878du);
    }
}
