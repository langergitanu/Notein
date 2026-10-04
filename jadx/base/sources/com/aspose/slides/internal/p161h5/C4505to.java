package com.aspose.slides.internal.p161h5;

import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.h5.to */
/* JADX INFO: loaded from: classes.dex */
public final class C4505to {

    /* JADX INFO: renamed from: c5 */
    public String f12501c5;

    /* JADX INFO: renamed from: ck */
    C4501ks f12502ck;

    /* JADX INFO: renamed from: du */
    public byte[] f12503du;

    /* JADX INFO: renamed from: dy */
    public long f12504dy;

    /* JADX INFO: renamed from: fa */
    long f12505fa;

    /* JADX INFO: renamed from: h4 */
    public int f12506h4;

    /* JADX INFO: renamed from: jd */
    C4494dy f12507jd;

    /* JADX INFO: renamed from: k4 */
    public byte[] f12508k4;

    /* JADX INFO: renamed from: kk */
    public int f12509kk;

    /* JADX INFO: renamed from: m9 */
    public int f12511m9;

    /* JADX INFO: renamed from: to */
    public long f12512to;

    /* JADX INFO: renamed from: x1 */
    public int f12514x1;

    /* JADX INFO: renamed from: up */
    public int f12513up = 6;

    /* JADX INFO: renamed from: yj */
    public int f12515yj = 15;

    /* JADX INFO: renamed from: ks */
    public int f12510ks = 0;

    /* JADX INFO: renamed from: k4 */
    public int m18576k4() {
        C4501ks c4501ks = this.f12502ck;
        if (c4501ks == null) {
            throw new C4493du("No Inflate State!");
        }
        int iM18564kk = c4501ks.m18564kk();
        this.f12502ck = null;
        return iM18564kk;
    }

    /* JADX INFO: renamed from: kk */
    public void m18581kk() {
        C4494dy c4494dy = this.f12507jd;
        int i = c4494dy.f12377du;
        int i2 = this.f12511m9;
        if (i > i2) {
            i = i2;
        }
        if (i == 0) {
            return;
        }
        byte[] bArr = c4494dy.f12390kk;
        int length = bArr.length;
        int i3 = c4494dy.f12403to;
        if (length > i3) {
            byte[] bArr2 = this.f12503du;
            int length2 = bArr2.length;
            int i4 = this.f12506h4;
            if (length2 > i4 && bArr.length >= i3 + i && bArr2.length >= i4 + i) {
                System.arraycopy(bArr, i3, bArr2, i4, i);
                this.f12506h4 += i;
                C4494dy c4494dy2 = this.f12507jd;
                c4494dy2.f12403to += i;
                this.f12504dy += (long) i;
                this.f12511m9 -= i;
                int i5 = c4494dy2.f12377du - i;
                c4494dy2.f12377du = i5;
                if (i5 == 0) {
                    c4494dy2.f12403to = 0;
                    return;
                }
                return;
            }
        }
        throw new C4493du(C14113y2.m67402k4("Invalid State. (pending.Length={0}, pendingCount={1})", Integer.valueOf(this.f12507jd.f12390kk.length), Integer.valueOf(this.f12507jd.f12377du)));
    }

    /* JADX INFO: renamed from: x1 */
    public int m18582x1() {
        if (this.f12507jd == null) {
            throw new C4493du("No Deflate State!");
        }
        this.f12507jd = null;
        return 0;
    }

    /* JADX INFO: renamed from: k4 */
    public int m18577k4(int i) {
        C4501ks c4501ks = this.f12502ck;
        if (c4501ks != null) {
            return c4501ks.m18561k4(i);
        }
        throw new C4493du("No Inflate State!");
    }

    /* JADX INFO: renamed from: x1 */
    public int m18583x1(int i) {
        C4494dy c4494dy = this.f12507jd;
        if (c4494dy != null) {
            return c4494dy.m18521du(i);
        }
        throw new C4493du("No Deflate State!");
    }

    /* JADX INFO: renamed from: k4 */
    public int m18578k4(int i, boolean z) {
        this.f12515yj = i;
        if (this.f12507jd != null) {
            throw new C4493du("You may not call InitializeInflate() after calling InitializeDeflate().");
        }
        C4501ks c4501ks = new C4501ks(z);
        this.f12502ck = c4501ks;
        return c4501ks.m18562k4(this, i);
    }

    /* JADX INFO: renamed from: x1 */
    public int m18584x1(int i, boolean z) {
        this.f12513up = i;
        return m18575x1(z);
    }

    /* JADX INFO: renamed from: x1 */
    private int m18575x1(boolean z) {
        if (this.f12502ck != null) {
            throw new C4493du("You may not call InitializeDeflate() after calling InitializeInflate().");
        }
        C4494dy c4494dy = new C4494dy();
        this.f12507jd = c4494dy;
        c4494dy.m18546x1(z);
        return this.f12507jd.m18526k4(this, this.f12513up, this.f12515yj, this.f12510ks);
    }

    /* JADX INFO: renamed from: k4 */
    public int m18579k4(boolean z) {
        return m18578k4(this.f12515yj, z);
    }

    /* JADX INFO: renamed from: k4 */
    public int m18580k4(byte[] bArr, int i, int i2) {
        int i3 = this.f12509kk;
        if (i3 <= i2) {
            i2 = i3;
        }
        if (i2 == 0) {
            return 0;
        }
        this.f12509kk = i3 - i2;
        if (this.f12507jd.m18540m9()) {
            this.f12505fa = C4499k4.m18555k4(this.f12505fa, this.f12508k4, this.f12514x1, i2);
        }
        System.arraycopy(this.f12508k4, this.f12514x1, bArr, i, i2);
        this.f12514x1 += i2;
        this.f12512to += (long) i2;
        return i2;
    }
}
