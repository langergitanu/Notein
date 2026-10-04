package com.aspose.slides.internal.p488x0;

import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.exceptions.NotImplementedException;
import com.aspose.slides.internal.p102e8.C3585h4;
import com.aspose.slides.internal.p500xi.C12535to;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.x0.fa */
/* JADX INFO: loaded from: classes5.dex */
public class C12335fa extends C12535to {

    /* JADX INFO: renamed from: c5 */
    private int f41229c5;

    /* JADX INFO: renamed from: du */
    private int f41230du;

    /* JADX INFO: renamed from: dy */
    private int f41231dy;

    /* JADX INFO: renamed from: h4 */
    private C12342m9 f41232h4;

    /* JADX INFO: renamed from: jd */
    private String f41233jd;

    /* JADX INFO: renamed from: k4 */
    private long f41234k4;

    /* JADX INFO: renamed from: kk */
    private long f41235kk;

    /* JADX INFO: renamed from: m9 */
    private int f41236m9;

    /* JADX INFO: renamed from: to */
    private int f41237to;

    /* JADX INFO: renamed from: x1 */
    private long f41238x1;

    /* JADX INFO: renamed from: c5 */
    public final int m57676c5() {
        return this.f41229c5;
    }

    /* JADX INFO: renamed from: du */
    public final void m57677du(int i) {
        this.f41229c5 = i;
    }

    /* JADX INFO: renamed from: dy */
    public final int m57678dy() {
        return this.f41231dy;
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
        return m57687k4((C12335fa) obj);
    }

    /* JADX INFO: renamed from: h4 */
    public final C12342m9 m57679h4() {
        return this.f41232h4;
    }

    public int hashCode() {
        int i = ((((((((((int) this.f41234k4) * 397) ^ ((int) this.f41238x1)) * 397) ^ ((int) this.f41235kk)) * 397) ^ this.f41237to) * 397) ^ this.f41230du) * 397;
        C12342m9 c12342m9 = this.f41232h4;
        int iHashCode = (((((((i ^ (c12342m9 != null ? c12342m9.hashCode() : 0)) * 397) ^ this.f41236m9) * 397) ^ this.f41231dy) * 397) ^ this.f41229c5) * 397;
        String str = this.f41233jd;
        return iHashCode ^ (str != null ? str.hashCode() : 0);
    }

    /* JADX INFO: renamed from: jd */
    public final String m57680jd() {
        return this.f41233jd;
    }

    /* JADX INFO: renamed from: k4 */
    public final long m57681k4() {
        return this.f41234k4;
    }

    /* JADX INFO: renamed from: kk */
    public final int m57688kk() {
        return this.f41237to;
    }

    /* JADX INFO: renamed from: m9 */
    public final int m57690m9() {
        return this.f41236m9;
    }

    /* JADX INFO: renamed from: to */
    public final int m57691to() {
        return this.f41230du;
    }

    /* JADX INFO: renamed from: x1 */
    public final long m57693x1() {
        return this.f41238x1;
    }

    /* JADX INFO: renamed from: k4 */
    public final Object m57682k4(C3585h4 c3585h4) {
        throw new NotImplementedException();
    }

    /* JADX INFO: renamed from: kk */
    public final void m57689kk(int i) {
        this.f41236m9 = i;
    }

    /* JADX INFO: renamed from: to */
    public final void m57692to(int i) {
        this.f41231dy = i;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m57694x1(int i) {
        this.f41230du = i;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m57683k4(int i) {
        this.f41237to = i;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m57695x1(long j) {
        if ((4294967295L & j) != 1024) {
            throw new ArgumentOutOfRangeException("value");
        }
        this.f41238x1 = j;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m57684k4(long j) {
        if ((4294967295L & j) != 1347637059) {
            throw new ArgumentOutOfRangeException("value");
        }
        this.f41234k4 = j;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m57685k4(C12342m9 c12342m9) {
        this.f41232h4 = c12342m9;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m57686k4(String str) {
        this.f41233jd = str;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m57687k4(C12335fa c12335fa) {
        return this.f41234k4 == c12335fa.f41234k4 && this.f41238x1 == c12335fa.f41238x1 && this.f41235kk == c12335fa.f41235kk && this.f41237to == c12335fa.f41237to && this.f41230du == c12335fa.f41230du && C14067j2.m66728k4(this.f41232h4, c12335fa.f41232h4) && this.f41236m9 == c12335fa.f41236m9 && this.f41231dy == c12335fa.f41231dy && this.f41229c5 == c12335fa.f41229c5 && C14113y2.m67363du(this.f41233jd, c12335fa.f41233jd);
    }
}
