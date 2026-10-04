package com.aspose.slides.internal.p498xe;

import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.exceptions.NotImplementedException;
import com.aspose.slides.internal.p075d5.C3023to;
import com.aspose.slides.internal.p143g4.C4201h4;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.xe.fa */
/* JADX INFO: loaded from: classes5.dex */
public class C12506fa extends C3023to {

    /* JADX INFO: renamed from: c5 */
    private int f41853c5;

    /* JADX INFO: renamed from: du */
    private int f41854du;

    /* JADX INFO: renamed from: dy */
    private int f41855dy;

    /* JADX INFO: renamed from: h4 */
    private C12513m9 f41856h4;

    /* JADX INFO: renamed from: jd */
    private String f41857jd;

    /* JADX INFO: renamed from: k4 */
    private long f41858k4;

    /* JADX INFO: renamed from: kk */
    private long f41859kk;

    /* JADX INFO: renamed from: m9 */
    private int f41860m9;

    /* JADX INFO: renamed from: to */
    private int f41861to;

    /* JADX INFO: renamed from: x1 */
    private long f41862x1;

    /* JADX INFO: renamed from: du */
    public final void m58105du(int i) {
        this.f41853c5 = i;
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
        return m58111k4((C12506fa) obj);
    }

    public int hashCode() {
        int i = ((((((((((int) this.f41858k4) * 397) ^ ((int) this.f41862x1)) * 397) ^ ((int) this.f41859kk)) * 397) ^ this.f41861to) * 397) ^ this.f41854du) * 397;
        C12513m9 c12513m9 = this.f41856h4;
        int iHashCode = (((((((i ^ (c12513m9 != null ? c12513m9.hashCode() : 0)) * 397) ^ this.f41860m9) * 397) ^ this.f41855dy) * 397) ^ this.f41853c5) * 397;
        String str = this.f41857jd;
        return iHashCode ^ (str != null ? str.hashCode() : 0);
    }

    /* JADX INFO: renamed from: k4 */
    public final Object m58106k4(C4201h4 c4201h4) {
        throw new NotImplementedException();
    }

    /* JADX INFO: renamed from: kk */
    public final void m58112kk(int i) {
        this.f41860m9 = i;
    }

    /* JADX INFO: renamed from: to */
    public final void m58113to(int i) {
        this.f41855dy = i;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m58114x1(int i) {
        this.f41854du = i;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m58107k4(int i) {
        this.f41861to = i;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m58115x1(long j) {
        if ((4294967295L & j) != 1024) {
            throw new ArgumentOutOfRangeException("value");
        }
        this.f41862x1 = j;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m58108k4(long j) {
        if ((4294967295L & j) != 1347637059) {
            throw new ArgumentOutOfRangeException("value");
        }
        this.f41858k4 = j;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m58109k4(C12513m9 c12513m9) {
        this.f41856h4 = c12513m9;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m58110k4(String str) {
        this.f41857jd = str;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m58111k4(C12506fa c12506fa) {
        return this.f41858k4 == c12506fa.f41858k4 && this.f41862x1 == c12506fa.f41862x1 && this.f41859kk == c12506fa.f41859kk && this.f41861to == c12506fa.f41861to && this.f41854du == c12506fa.f41854du && C14067j2.m66728k4(this.f41856h4, c12506fa.f41856h4) && this.f41860m9 == c12506fa.f41860m9 && this.f41855dy == c12506fa.f41855dy && this.f41853c5 == c12506fa.f41853c5 && C14113y2.m67363du(this.f41857jd, c12506fa.f41857jd);
    }
}
