package com.aspose.slides.internal.p392s4;

import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.s4.rv */
/* JADX INFO: loaded from: classes4.dex */
final class C10144rv {

    /* JADX INFO: renamed from: c5 */
    C10138h4 f36489c5;

    /* JADX INFO: renamed from: du */
    public byte[] f36491du;

    /* JADX INFO: renamed from: dy */
    public long f36492dy;

    /* JADX INFO: renamed from: fa */
    private long f36493fa;

    /* JADX INFO: renamed from: h4 */
    public int f36494h4;

    /* JADX INFO: renamed from: k4 */
    public byte[] f36496k4;

    /* JADX INFO: renamed from: kk */
    public int f36497kk;

    /* JADX INFO: renamed from: m9 */
    public int f36498m9;

    /* JADX INFO: renamed from: to */
    public long f36499to;

    /* JADX INFO: renamed from: x1 */
    public int f36501x1;

    /* JADX INFO: renamed from: up */
    private int f36500up = 6;

    /* JADX INFO: renamed from: jd */
    public int f36495jd = 15;

    /* JADX INFO: renamed from: ck */
    public int f36490ck = 0;

    public C10144rv() {
        if (m49903du() != 0) {
            throw new InvalidOperationException("CompressorException: Cannot initialize for deflate.");
        }
    }

    /* JADX INFO: renamed from: du */
    private int m49903du() {
        return m49904x1(true);
    }

    /* JADX INFO: renamed from: k4 */
    public int m49905k4(int i, boolean z) {
        m49909k4(i);
        return m49904x1(z);
    }

    /* JADX INFO: renamed from: kk */
    public int m49911kk() {
        C10138h4 c10138h4 = this.f36489c5;
        if (c10138h4 == null) {
            throw new InvalidOperationException("CompressorException: No Deflate State!");
        }
        int iM49874x1 = c10138h4.m49874x1();
        this.f36489c5 = null;
        return iM49874x1;
    }

    /* JADX INFO: renamed from: to */
    public void m49912to() {
        C10138h4 c10138h4 = this.f36489c5;
        int i = c10138h4.f36387du;
        int i2 = this.f36498m9;
        if (i > i2) {
            i = i2;
        }
        if (i == 0) {
            return;
        }
        byte[] bArr = c10138h4.f36413to;
        int length = bArr.length;
        int i3 = c10138h4.f36394h4;
        if (length > i3) {
            byte[] bArr2 = this.f36491du;
            int length2 = bArr2.length;
            int i4 = this.f36494h4;
            if (length2 > i4 && bArr.length >= i3 + i && bArr2.length >= i4 + i) {
                System.arraycopy(bArr, i3, bArr2, i4, i);
                this.f36494h4 += i;
                C10138h4 c10138h42 = this.f36489c5;
                c10138h42.f36394h4 += i;
                this.f36492dy += (long) i;
                this.f36498m9 -= i;
                int i5 = c10138h42.f36387du - i;
                c10138h42.f36387du = i5;
                if (i5 == 0) {
                    c10138h42.f36394h4 = 0;
                    return;
                }
                return;
            }
        }
        throw new InvalidOperationException(C14113y2.m67402k4("CompressorException: Invalid State. (pending.Length={0}, pendingCount={1})", C7019kk.m27466x1(this.f36489c5.f36413to.length), C7019kk.m27466x1(this.f36489c5.f36387du)));
    }

    /* JADX INFO: renamed from: x1 */
    public int m49913x1() {
        return this.f36500up;
    }

    /* JADX INFO: renamed from: x1 */
    private int m49904x1(boolean z) {
        C10138h4 c10138h4 = new C10138h4();
        this.f36489c5 = c10138h4;
        c10138h4.m49861k4(z);
        return this.f36489c5.m49857k4(this, m49913x1());
    }

    /* JADX INFO: renamed from: k4 */
    public int m49906k4(boolean z) {
        C10138h4 c10138h4 = this.f36489c5;
        if (c10138h4 != null) {
            return c10138h4.m49875x1(z);
        }
        throw new InvalidOperationException("CompressorException: No Deflate State!");
    }

    /* JADX INFO: renamed from: k4 */
    public int m49907k4(byte[] bArr, int i, int i2) {
        int i3 = this.f36497kk;
        if (i3 <= i2) {
            i2 = i3;
        }
        if (i2 == 0) {
            return 0;
        }
        this.f36497kk = i3 - i2;
        if (this.f36489c5.m49864k4()) {
            m49910k4(C10140k4.m49893k4(m49908k4() & 4294967295L, this.f36496k4, this.f36501x1, i2) & 4294967295L);
        }
        System.arraycopy(this.f36496k4, this.f36501x1, bArr, i, i2);
        this.f36501x1 += i2;
        this.f36499to += (long) i2;
        return i2;
    }

    /* JADX INFO: renamed from: k4 */
    public long m49908k4() {
        return this.f36493fa;
    }

    /* JADX INFO: renamed from: k4 */
    public void m49909k4(int i) {
        this.f36500up = i;
    }

    /* JADX INFO: renamed from: k4 */
    public void m49910k4(long j) {
        this.f36493fa = j;
    }
}
