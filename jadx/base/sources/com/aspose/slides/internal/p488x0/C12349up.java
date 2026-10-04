package com.aspose.slides.internal.p488x0;

import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.internal.p500xi.C12535to;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.x0.up */
/* JADX INFO: loaded from: classes5.dex */
public class C12349up extends C12535to {

    /* JADX INFO: renamed from: c5 */
    private int f41293c5;

    /* JADX INFO: renamed from: du */
    private int f41294du;

    /* JADX INFO: renamed from: dy */
    private int f41295dy;

    /* JADX INFO: renamed from: h4 */
    private C12342m9 f41296h4;

    /* JADX INFO: renamed from: jd */
    private String f41297jd;

    /* JADX INFO: renamed from: k4 */
    private long f41298k4;

    /* JADX INFO: renamed from: kk */
    private long f41299kk;

    /* JADX INFO: renamed from: m9 */
    private int f41300m9;

    /* JADX INFO: renamed from: to */
    private int f41301to;

    /* JADX INFO: renamed from: x1 */
    private long f41302x1;

    /* JADX INFO: renamed from: c5 */
    public final int m57822c5() {
        return this.f41293c5;
    }

    /* JADX INFO: renamed from: du */
    public final void m57823du(int i) {
        this.f41293c5 = i;
    }

    /* JADX INFO: renamed from: dy */
    public final int m57824dy() {
        return this.f41295dy;
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
        return m57832k4((C12349up) obj);
    }

    /* JADX INFO: renamed from: h4 */
    public final C12342m9 m57825h4() {
        return this.f41296h4;
    }

    public int hashCode() {
        int i = ((((((((((int) this.f41298k4) * 397) ^ ((int) this.f41302x1)) * 397) ^ ((int) this.f41299kk)) * 397) ^ this.f41301to) * 397) ^ this.f41294du) * 397;
        C12342m9 c12342m9 = this.f41296h4;
        int iHashCode = (((((((i ^ (c12342m9 != null ? c12342m9.hashCode() : 0)) * 397) ^ this.f41300m9) * 397) ^ this.f41295dy) * 397) ^ this.f41293c5) * 397;
        String str = this.f41297jd;
        return iHashCode ^ (str != null ? str.hashCode() : 0);
    }

    /* JADX INFO: renamed from: jd */
    public final String m57826jd() {
        return this.f41297jd;
    }

    /* JADX INFO: renamed from: k4 */
    public final long m57827k4() {
        return this.f41298k4;
    }

    /* JADX INFO: renamed from: kk */
    public final int m57833kk() {
        return this.f41301to;
    }

    /* JADX INFO: renamed from: m9 */
    public final int m57835m9() {
        return this.f41300m9;
    }

    /* JADX INFO: renamed from: to */
    public final int m57836to() {
        return this.f41294du;
    }

    /* JADX INFO: renamed from: x1 */
    public final long m57838x1() {
        return this.f41302x1;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m57828k4(int i) {
        this.f41301to = i;
    }

    /* JADX INFO: renamed from: kk */
    public final void m57834kk(int i) {
        this.f41300m9 = i;
    }

    /* JADX INFO: renamed from: to */
    public final void m57837to(int i) {
        this.f41295dy = i;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m57839x1(int i) {
        this.f41294du = i;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m57829k4(long j) {
        if ((4294967295L & j) != 1347637059) {
            throw new ArgumentOutOfRangeException("value");
        }
        this.f41298k4 = j;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m57840x1(long j) {
        if ((4294967295L & j) != 1024) {
            throw new ArgumentOutOfRangeException("value");
        }
        this.f41302x1 = j;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m57830k4(C12342m9 c12342m9) {
        this.f41296h4 = c12342m9;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m57831k4(String str) {
        this.f41297jd = str;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m57832k4(C12349up c12349up) {
        return this.f41298k4 == c12349up.f41298k4 && this.f41302x1 == c12349up.f41302x1 && this.f41299kk == c12349up.f41299kk && this.f41301to == c12349up.f41301to && this.f41294du == c12349up.f41294du && C14067j2.m66728k4(this.f41296h4, c12349up.f41296h4) && this.f41300m9 == c12349up.f41300m9 && this.f41295dy == c12349up.f41295dy && this.f41293c5 == c12349up.f41293c5 && C14113y2.m67363du(this.f41297jd, c12349up.f41297jd);
    }
}
