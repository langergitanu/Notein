package com.aspose.slides.internal.p558zz;

import com.aspose.slides.exceptions.ArithmeticException;
import com.aspose.slides.internal.p080dd.C3148wl;

/* JADX INFO: renamed from: com.aspose.slides.internal.zz.kk */
/* JADX INFO: loaded from: classes5.dex */
public class C13640kk {

    /* JADX INFO: renamed from: k4 */
    private long f45316k4;

    /* JADX INFO: renamed from: kk */
    private C3148wl f45317kk;

    /* JADX INFO: renamed from: x1 */
    private boolean f45318x1;

    public C13640kk(C3148wl c3148wl) {
        this.f45317kk = c3148wl;
    }

    /* JADX INFO: renamed from: du */
    public final long m62983du() {
        return ((long) m62989m9()) & 4294967295L;
    }

    /* JADX INFO: renamed from: dy */
    public final int m62984dy() {
        return m62989m9();
    }

    /* JADX INFO: renamed from: h4 */
    public final int m62985h4() {
        long jM62983du = m62983du();
        if ((jM62983du & 2147483648L) != 2147483648L) {
            return (int) (((long) ((int) jM62983du)) & 2147483647L);
        }
        throw new ArithmeticException("Long value too large to fit into an integer.");
    }

    /* JADX INFO: renamed from: k4 */
    public final long m62986k4(long j) {
        m62987k4().mo13437k4().setPosition(m62987k4().mo13437k4().getPosition() + j);
        return j;
    }

    /* JADX INFO: renamed from: kk */
    public final long m62988kk() {
        return this.f45317kk.mo13437k4().getPosition();
    }

    /* JADX INFO: renamed from: m9 */
    public final int m62989m9() {
        return (m62991x1() << 24) | (m62991x1() << 16) | (m62991x1() << 8) | m62991x1();
    }

    /* JADX INFO: renamed from: to */
    public final int m62990to() {
        return ((m62991x1() << 8) | m62991x1()) & 65535;
    }

    /* JADX INFO: renamed from: x1 */
    public final int m62991x1() {
        if (!this.f45318x1 || this.f45317kk.mo13437k4().getPosition() < this.f45316k4) {
            return ((byte) m62987k4().mo13437k4().readByte()) & 255;
        }
        return -1;
    }

    public C13640kk(C3148wl c3148wl, int i) {
        this(c3148wl);
        this.f45316k4 = i;
        this.f45318x1 = true;
    }

    /* JADX INFO: renamed from: k4 */
    public final C3148wl m62987k4() {
        return this.f45317kk;
    }
}
