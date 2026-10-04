package com.aspose.slides.internal.p498xe;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.internal.p080dd.C3149x1;
import com.aspose.slides.internal.p100e4.C3570m9;
import com.aspose.slides.p559ms.System.C14042ak;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.xe.du */
/* JADX INFO: loaded from: classes5.dex */
public class C12504du extends AbstractC12511kk {

    /* JADX INFO: renamed from: du */
    private int f41840du;

    /* JADX INFO: renamed from: dy */
    private long f41841dy;

    /* JADX INFO: renamed from: h4 */
    private int f41842h4;

    /* JADX INFO: renamed from: k4 */
    private int f41843k4;

    /* JADX INFO: renamed from: kk */
    private long f41844kk;

    /* JADX INFO: renamed from: m9 */
    private long f41845m9;

    /* JADX INFO: renamed from: to */
    private long f41846to;

    /* JADX INFO: renamed from: x1 */
    private int f41847x1;

    /* JADX INFO: renamed from: du */
    public final void m58085du(int i) {
        this.f41840du = i;
    }

    /* JADX INFO: renamed from: dy */
    public final long m58087dy() {
        return this.f41846to;
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
        return m58091k4((C12504du) obj);
    }

    /* JADX INFO: renamed from: h4 */
    public final int m58088h4() {
        return this.f41847x1;
    }

    public int hashCode() {
        return (((((((((((((this.f41843k4 * 397) ^ this.f41847x1) * 397) ^ ((int) this.f41844kk)) * 397) ^ ((int) this.f41846to)) * 397) ^ this.f41840du) * 397) ^ this.f41842h4) * 397) ^ ((int) this.f41845m9)) * 397) ^ ((int) this.f41841dy);
    }

    @Override // com.aspose.slides.internal.p498xe.AbstractC12511kk
    /* JADX INFO: renamed from: k4 */
    public void mo58090k4(C3149x1 c3149x1) {
        c3149x1.m13447k4(m58172k4());
        c3149x1.m13455x1(this.f41843k4);
        c3149x1.m13455x1(this.f41847x1);
        c3149x1.m13446k4(m58176x1());
        c3149x1.m13446k4(m58175kk() & 65535);
        c3149x1.m13447k4(this.f41844kk & 4294967295L);
        c3149x1.m13447k4(this.f41846to);
        c3149x1.m13455x1(this.f41840du);
        c3149x1.m13455x1(this.f41842h4);
        c3149x1.m13447k4(this.f41845m9);
        c3149x1.m13447k4(this.f41841dy);
    }

    /* JADX INFO: renamed from: kk */
    public final void m58092kk(int i) {
        if (i <= 0) {
            throw new ArgumentException("This value MUST be positive.");
        }
        this.f41843k4 = i;
    }

    /* JADX INFO: renamed from: m9 */
    public final long m58094m9() {
        return this.f41844kk;
    }

    /* JADX INFO: renamed from: to */
    public final int m58095to() {
        return this.f41843k4;
    }

    public String toString() {
        return C14113y2.m67402k4("{0}, Width: {1}, Height: {2}, Compression: {3}, ImageSize: {4}, XPelsPerMeter: {5}, YPelsPerMeter: {6}, ColorUsed: {7}, ColorImportant: {8}", super.toString(), Integer.valueOf(this.f41843k4), Integer.valueOf(this.f41847x1), C14042ak.m66410k4(C3570m9.class, this.f41844kk), Long.valueOf(this.f41846to), Integer.valueOf(this.f41840du), Integer.valueOf(this.f41842h4), Long.valueOf(this.f41845m9), Long.valueOf(this.f41841dy));
    }

    /* JADX INFO: renamed from: x1 */
    public final void m58098x1(long j) {
        this.f41844kk = j;
    }

    /* JADX INFO: renamed from: du */
    public final void m58086du(long j) {
        this.f41841dy = j;
    }

    /* JADX INFO: renamed from: h4 */
    public final void m58089h4(int i) {
        this.f41842h4 = i;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m58091k4(C12504du c12504du) {
        return this.f41843k4 == c12504du.f41843k4 && this.f41847x1 == c12504du.f41847x1 && this.f41844kk == c12504du.f41844kk && this.f41846to == c12504du.f41846to && this.f41840du == c12504du.f41840du && this.f41842h4 == c12504du.f41842h4 && this.f41845m9 == c12504du.f41845m9 && this.f41841dy == c12504du.f41841dy && m58176x1() == c12504du.m58176x1() && m58175kk() == c12504du.m58175kk() && m58172k4() == c12504du.m58172k4();
    }

    /* JADX INFO: renamed from: kk */
    public final void m58093kk(long j) {
        this.f41846to = j;
    }

    /* JADX INFO: renamed from: to */
    public final void m58096to(int i) {
        if (i == 0) {
            throw new ArgumentException("This value MUST NOT be zero.");
        }
        this.f41847x1 = i;
    }

    /* JADX INFO: renamed from: to */
    public final void m58097to(long j) {
        this.f41845m9 = j;
    }
}
