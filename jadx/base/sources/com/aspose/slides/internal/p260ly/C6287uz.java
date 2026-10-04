package com.aspose.slides.internal.p260ly;

import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.internal.p488x0.C12350uz;
import com.aspose.slides.p559ms.System.C14067j2;

/* JADX INFO: renamed from: com.aspose.slides.internal.ly.uz */
/* JADX INFO: loaded from: classes4.dex */
public class C6287uz extends AbstractC6280ne {

    /* JADX INFO: renamed from: du */
    private C12350uz f17862du;

    /* JADX INFO: renamed from: k4 */
    private long f17863k4;

    /* JADX INFO: renamed from: kk */
    private long f17864kk;

    /* JADX INFO: renamed from: to */
    private long f17865to;

    /* JADX INFO: renamed from: x1 */
    private long f17866x1;

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
        return m25657k4((C6287uz) obj);
    }

    /* JADX INFO: renamed from: h4 */
    public final C12350uz m25653h4() {
        return this.f17862du;
    }

    public int hashCode() {
        int i = ((((((((int) this.f17863k4) * 397) ^ ((int) this.f17866x1)) * 397) ^ ((int) this.f17864kk)) * 397) ^ ((int) this.f17865to)) * 397;
        C12350uz c12350uz = this.f17862du;
        return i ^ (c12350uz != null ? c12350uz.hashCode() : 0);
    }

    /* JADX INFO: renamed from: k4 */
    public final long m25654k4() {
        return this.f17863k4;
    }

    /* JADX INFO: renamed from: kk */
    public final long m25658kk() {
        return this.f17864kk;
    }

    /* JADX INFO: renamed from: to */
    public final long m25660to() {
        return this.f17865to;
    }

    /* JADX INFO: renamed from: x1 */
    public final long m25662x1() {
        return this.f17866x1;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m25655k4(long j) {
        if ((4294967295L & j) != 32) {
            throw new ArgumentOutOfRangeException("value");
        }
        this.f17863k4 = j;
    }

    /* JADX INFO: renamed from: kk */
    public final void m25659kk(long j) {
        this.f17864kk = j;
    }

    /* JADX INFO: renamed from: to */
    public final void m25661to(long j) {
        this.f17865to = j;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m25663x1(long j) {
        if ((4294967295L & j) != 1) {
            throw new ArgumentOutOfRangeException("value");
        }
        this.f17866x1 = j;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m25656k4(C12350uz c12350uz) {
        this.f17862du = c12350uz;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m25657k4(C6287uz c6287uz) {
        return this.f17863k4 == c6287uz.f17863k4 && this.f17866x1 == c6287uz.f17866x1 && this.f17864kk == c6287uz.f17864kk && this.f17865to == c6287uz.f17865to && C14067j2.m66728k4(this.f17862du, c6287uz.f17862du);
    }
}
