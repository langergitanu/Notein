package com.aspose.slides.internal.p498xe;

import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.internal.p075d5.C3023to;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.xe.up */
/* JADX INFO: loaded from: classes5.dex */
public class C12520up extends C3023to {

    /* JADX INFO: renamed from: c5 */
    private int f41917c5;

    /* JADX INFO: renamed from: du */
    private int f41918du;

    /* JADX INFO: renamed from: dy */
    private int f41919dy;

    /* JADX INFO: renamed from: h4 */
    private C12513m9 f41920h4;

    /* JADX INFO: renamed from: jd */
    private String f41921jd;

    /* JADX INFO: renamed from: k4 */
    private long f41922k4;

    /* JADX INFO: renamed from: kk */
    private long f41923kk;

    /* JADX INFO: renamed from: m9 */
    private int f41924m9;

    /* JADX INFO: renamed from: to */
    private int f41925to;

    /* JADX INFO: renamed from: x1 */
    private long f41926x1;

    /* JADX INFO: renamed from: du */
    public final void m58238du(int i) {
        this.f41917c5 = i;
    }

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
        return m58243k4((C12520up) obj);
    }

    public int hashCode() {
        int i = ((((((((((int) this.f41922k4) * 397) ^ ((int) this.f41926x1)) * 397) ^ ((int) this.f41923kk)) * 397) ^ this.f41925to) * 397) ^ this.f41918du) * 397;
        C12513m9 c12513m9 = this.f41920h4;
        int iHashCode = (((((((i ^ (c12513m9 != null ? c12513m9.hashCode() : 0)) * 397) ^ this.f41924m9) * 397) ^ this.f41919dy) * 397) ^ this.f41917c5) * 397;
        String str = this.f41921jd;
        return iHashCode ^ (str != null ? str.hashCode() : 0);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m58239k4(int i) {
        this.f41925to = i;
    }

    /* JADX INFO: renamed from: kk */
    public final void m58244kk(int i) {
        this.f41924m9 = i;
    }

    /* JADX INFO: renamed from: to */
    public final void m58245to(int i) {
        this.f41919dy = i;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m58246x1(int i) {
        this.f41918du = i;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m58240k4(long j) {
        if ((4294967295L & j) != 1347637059) {
            throw new ArgumentOutOfRangeException("value");
        }
        this.f41922k4 = j;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m58247x1(long j) {
        if ((4294967295L & j) != 1024) {
            throw new ArgumentOutOfRangeException("value");
        }
        this.f41926x1 = j;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m58241k4(C12513m9 c12513m9) {
        this.f41920h4 = c12513m9;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m58242k4(String str) {
        this.f41921jd = str;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m58243k4(C12520up c12520up) {
        return this.f41922k4 == c12520up.f41922k4 && this.f41926x1 == c12520up.f41926x1 && this.f41923kk == c12520up.f41923kk && this.f41925to == c12520up.f41925to && this.f41918du == c12520up.f41918du && C14067j2.m66728k4(this.f41920h4, c12520up.f41920h4) && this.f41924m9 == c12520up.f41924m9 && this.f41919dy == c12520up.f41919dy && this.f41917c5 == c12520up.f41917c5 && C14113y2.m67363du(this.f41921jd, c12520up.f41921jd);
    }
}
