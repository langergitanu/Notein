package com.aspose.slides.internal.p482wr;

import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.wr.xk */
/* JADX INFO: loaded from: classes5.dex */
public final class C12278xk {

    /* JADX INFO: renamed from: c5 */
    public String f41121c5;

    /* JADX INFO: renamed from: ck */
    public C12277x6 f41122ck;

    /* JADX INFO: renamed from: du */
    public byte[] f41123du;

    /* JADX INFO: renamed from: dy */
    public long f41124dy;

    /* JADX INFO: renamed from: fa */
    public long f41125fa;

    /* JADX INFO: renamed from: h4 */
    public int f41126h4;

    /* JADX INFO: renamed from: jd */
    public C12258jd f41127jd;

    /* JADX INFO: renamed from: k4 */
    public byte[] f41128k4;

    /* JADX INFO: renamed from: kk */
    public int f41129kk;

    /* JADX INFO: renamed from: m9 */
    public int f41131m9;

    /* JADX INFO: renamed from: to */
    public long f41132to;

    /* JADX INFO: renamed from: x1 */
    public int f41134x1;

    /* JADX INFO: renamed from: up */
    public int f41133up = 6;

    /* JADX INFO: renamed from: yj */
    public int f41135yj = 15;

    /* JADX INFO: renamed from: ks */
    public int f41130ks = 0;

    /* JADX INFO: renamed from: k4 */
    public final int m57526k4() {
        C12277x6 c12277x6 = this.f41122ck;
        if (c12277x6 == null) {
            throw new C12250c6("No Inflate State!");
        }
        int iM57523kk = c12277x6.m57523kk();
        this.f41122ck = null;
        return iM57523kk;
    }

    /* JADX INFO: renamed from: kk */
    public final void m57531kk() {
        C12258jd c12258jd = this.f41127jd;
        int i = c12258jd.f40862du;
        int i2 = this.f41131m9;
        if (i > i2) {
            i = i2;
        }
        if (i == 0) {
            return;
        }
        byte[] bArr = c12258jd.f40874kk;
        int length = bArr.length;
        int i3 = c12258jd.f40887to;
        if (length > i3) {
            byte[] bArr2 = this.f41123du;
            int length2 = bArr2.length;
            int i4 = this.f41126h4;
            if (length2 > i4 && bArr.length >= i3 + i && bArr2.length >= i4 + i) {
                AbstractC14092to.m67216k4(AbstractC14092to.m67208k4((Object) bArr), this.f41127jd.f40887to, AbstractC14092to.m67208k4((Object) this.f41123du), this.f41126h4, i);
                this.f41126h4 += i;
                C12258jd c12258jd2 = this.f41127jd;
                c12258jd2.f40887to += i;
                this.f41124dy += (long) i;
                this.f41131m9 -= i;
                int i5 = c12258jd2.f40862du - i;
                c12258jd2.f40862du = i5;
                if (i5 == 0) {
                    c12258jd2.f40887to = 0;
                    return;
                }
                return;
            }
        }
        throw new C12250c6(C14113y2.m67402k4("Invalid State. (pending.Length={0}, pendingCount={1})", Integer.valueOf(this.f41127jd.f40874kk.length), Integer.valueOf(this.f41127jd.f40862du)));
    }

    /* JADX INFO: renamed from: x1 */
    public final int m57532x1() {
        C12258jd c12258jd = this.f41127jd;
        if (c12258jd == null) {
            throw new C12250c6("No Deflate State!");
        }
        int iM57234c5 = c12258jd.m57234c5();
        this.f41127jd = null;
        return iM57234c5;
    }

    /* JADX INFO: renamed from: k4 */
    public final int m57527k4(int i) {
        C12277x6 c12277x6 = this.f41122ck;
        if (c12277x6 != null) {
            return c12277x6.m57520k4(i);
        }
        throw new C12250c6("No Inflate State!");
    }

    /* JADX INFO: renamed from: x1 */
    public final int m57533x1(int i) {
        C12258jd c12258jd = this.f41127jd;
        if (c12258jd != null) {
            return c12258jd.m57255m9(i);
        }
        throw new C12250c6("No Deflate State!");
    }

    /* JADX INFO: renamed from: k4 */
    public final int m57528k4(int i, boolean z) {
        this.f41135yj = i;
        if (this.f41127jd != null) {
            throw new C12250c6("You may not call InitializeInflate() after calling InitializeDeflate().");
        }
        C12277x6 c12277x6 = new C12277x6(z);
        this.f41122ck = c12277x6;
        return c12277x6.m57521k4(this, i);
    }

    /* JADX INFO: renamed from: x1 */
    public final int m57534x1(int i, boolean z) {
        this.f41133up = i;
        return m57525x1(z);
    }

    /* JADX INFO: renamed from: x1 */
    private int m57525x1(boolean z) {
        if (this.f41122ck != null) {
            throw new C12250c6("You may not call InitializeDeflate() after calling InitializeInflate().");
        }
        C12258jd c12258jd = new C12258jd();
        this.f41127jd = c12258jd;
        c12258jd.m57262x1(z);
        return this.f41127jd.m57240k4(this, this.f41133up, this.f41135yj, this.f41130ks);
    }

    /* JADX INFO: renamed from: k4 */
    public final int m57529k4(boolean z) {
        return m57528k4(this.f41135yj, z);
    }

    /* JADX INFO: renamed from: k4 */
    public final int m57530k4(byte[] bArr, int i, int i2) {
        int i3 = this.f41129kk;
        if (i3 <= i2) {
            i2 = i3;
        }
        if (i2 == 0) {
            return 0;
        }
        this.f41129kk = i3 - i2;
        if (this.f41127jd.m57256m9()) {
            this.f41125fa = C12276x1.m57519k4(this.f41125fa, this.f41128k4, this.f41134x1, i2);
        }
        AbstractC14092to.m67216k4(AbstractC14092to.m67208k4((Object) this.f41128k4), this.f41134x1, AbstractC14092to.m67208k4((Object) bArr), i, i2);
        this.f41134x1 += i2;
        this.f41132to += (long) i2;
        return i2;
    }
}
