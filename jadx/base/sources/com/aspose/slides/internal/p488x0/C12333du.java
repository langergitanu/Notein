package com.aspose.slides.internal.p488x0;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.internal.p080dd.C3149x1;
import com.aspose.slides.internal.p377r9.C9987m9;
import com.aspose.slides.p559ms.System.C14042ak;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.x0.du */
/* JADX INFO: loaded from: classes5.dex */
public class C12333du extends AbstractC12340kk {

    /* JADX INFO: renamed from: du */
    private int f41216du;

    /* JADX INFO: renamed from: dy */
    private long f41217dy;

    /* JADX INFO: renamed from: h4 */
    private int f41218h4;

    /* JADX INFO: renamed from: k4 */
    private int f41219k4;

    /* JADX INFO: renamed from: kk */
    private long f41220kk;

    /* JADX INFO: renamed from: m9 */
    private long f41221m9;

    /* JADX INFO: renamed from: to */
    private long f41222to;

    /* JADX INFO: renamed from: x1 */
    private int f41223x1;

    /* JADX INFO: renamed from: c5 */
    public final int m57648c5() {
        return this.f41216du;
    }

    /* JADX INFO: renamed from: ck */
    public final long m57649ck() {
        return this.f41221m9;
    }

    /* JADX INFO: renamed from: du */
    public final void m57650du(int i) {
        this.f41216du = i;
    }

    /* JADX INFO: renamed from: dy */
    public final long m57652dy() {
        return this.f41222to;
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
        return m57658k4((C12333du) obj);
    }

    /* JADX INFO: renamed from: fa */
    public final long m57653fa() {
        return this.f41217dy;
    }

    /* JADX INFO: renamed from: h4 */
    public final int m57654h4() {
        return this.f41223x1;
    }

    public int hashCode() {
        return (((((((((((((this.f41219k4 * 397) ^ this.f41223x1) * 397) ^ ((int) this.f41220kk)) * 397) ^ ((int) this.f41222to)) * 397) ^ this.f41216du) * 397) ^ this.f41218h4) * 397) ^ ((int) this.f41221m9)) * 397) ^ ((int) this.f41217dy);
    }

    /* JADX INFO: renamed from: jd */
    public final int m57656jd() {
        return this.f41218h4;
    }

    @Override // com.aspose.slides.internal.p488x0.AbstractC12340kk
    /* JADX INFO: renamed from: k4 */
    public void mo57657k4(C3149x1 c3149x1) {
        c3149x1.m13447k4(m57756k4());
        c3149x1.m13455x1(this.f41219k4);
        c3149x1.m13455x1(this.f41223x1);
        c3149x1.m13446k4(m57760x1());
        c3149x1.m13446k4(m57759kk() & 65535);
        c3149x1.m13447k4(this.f41220kk & 4294967295L);
        c3149x1.m13447k4(this.f41222to);
        c3149x1.m13455x1(this.f41216du);
        c3149x1.m13455x1(this.f41218h4);
        c3149x1.m13447k4(this.f41221m9);
        c3149x1.m13447k4(this.f41217dy);
    }

    /* JADX INFO: renamed from: kk */
    public final void m57659kk(int i) {
        if (i <= 0) {
            throw new ArgumentException("This value MUST be positive.");
        }
        this.f41219k4 = i;
    }

    /* JADX INFO: renamed from: m9 */
    public final long m57661m9() {
        return this.f41220kk;
    }

    /* JADX INFO: renamed from: to */
    public final int m57662to() {
        return this.f41219k4;
    }

    public String toString() {
        return C14113y2.m67402k4("{0}, Width: {1}, Height: {2}, Compression: {3}, ImageSize: {4}, XPelsPerMeter: {5}, YPelsPerMeter: {6}, ColorUsed: {7}, ColorImportant: {8}", super.toString(), Integer.valueOf(this.f41219k4), Integer.valueOf(this.f41223x1), C14042ak.m66410k4(C9987m9.class, this.f41220kk), Long.valueOf(this.f41222to), Integer.valueOf(this.f41216du), Integer.valueOf(this.f41218h4), Long.valueOf(this.f41221m9), Long.valueOf(this.f41217dy));
    }

    /* JADX INFO: renamed from: x1 */
    public final void m57665x1(long j) {
        this.f41220kk = j;
    }

    /* JADX INFO: renamed from: du */
    public final void m57651du(long j) {
        this.f41217dy = j;
    }

    /* JADX INFO: renamed from: h4 */
    public final void m57655h4(int i) {
        this.f41218h4 = i;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m57658k4(C12333du c12333du) {
        return this.f41219k4 == c12333du.f41219k4 && this.f41223x1 == c12333du.f41223x1 && this.f41220kk == c12333du.f41220kk && this.f41222to == c12333du.f41222to && this.f41216du == c12333du.f41216du && this.f41218h4 == c12333du.f41218h4 && this.f41221m9 == c12333du.f41221m9 && this.f41217dy == c12333du.f41217dy && m57760x1() == c12333du.m57760x1() && m57759kk() == c12333du.m57759kk() && m57756k4() == c12333du.m57756k4();
    }

    /* JADX INFO: renamed from: kk */
    public final void m57660kk(long j) {
        this.f41222to = j;
    }

    /* JADX INFO: renamed from: to */
    public final void m57663to(int i) {
        if (i == 0) {
            throw new ArgumentException("This value MUST NOT be zero.");
        }
        this.f41223x1 = i;
    }

    /* JADX INFO: renamed from: to */
    public final void m57664to(long j) {
        this.f41221m9 = j;
    }
}
