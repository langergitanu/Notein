package com.aspose.slides.internal.p129fe;

import com.aspose.slides.internal.p175i1.AbstractC4786k4;
import com.aspose.slides.internal.p475wh.AbstractC12002ck;
import com.aspose.slides.p559ms.System.C14112xw;

/* JADX INFO: renamed from: com.aspose.slides.internal.fe.k4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3983k4 {

    /* JADX INFO: renamed from: du */
    private C14112xw f10821du;

    /* JADX INFO: renamed from: h4 */
    private int f10822h4;

    /* JADX INFO: renamed from: k4 */
    private int f10823k4;

    /* JADX INFO: renamed from: kk */
    private int f10824kk;

    /* JADX INFO: renamed from: to */
    private int f10825to;

    /* JADX INFO: renamed from: x1 */
    private int f10826x1;

    public C3983k4() {
    }

    /* JADX INFO: renamed from: du */
    public int m15715du() {
        return this.f10824kk;
    }

    /* JADX INFO: renamed from: k4 */
    public int m15716k4() {
        return this.f10826x1;
    }

    /* JADX INFO: renamed from: kk */
    public int m15720kk() {
        return this.f10825to;
    }

    /* JADX INFO: renamed from: to */
    public C14112xw m15721to() {
        return this.f10821du;
    }

    /* JADX INFO: renamed from: x1 */
    public int m15722x1() {
        return this.f10823k4;
    }

    public C3983k4(int i, int i2, int i3, int i4, int i5, byte[] bArr) {
        this.f10826x1 = i2;
        this.f10823k4 = i;
        this.f10824kk = i4;
        this.f10825to = i3;
        this.f10822h4 = i5;
        this.f10821du = new C14112xw(AbstractC4786k4.m19846k4(bArr));
    }

    /* JADX INFO: renamed from: k4 */
    public static int m15713k4(int i, int i2) {
        int i3 = i * i2;
        return ((i3 / 32) * 4) + (i3 % 32 <= 0 ? 0 : 4);
    }

    /* JADX INFO: renamed from: k4 */
    public static int m15714k4(int i, int i2, int i3) {
        if (i2 >= 8) {
            return i3 - (i * (i2 >> 3));
        }
        int i4 = 8 / i2;
        return i3 - ((i / i4) + (i % i4 == 0 ? 0 : 1));
    }

    /* JADX INFO: renamed from: k4 */
    public void m15717k4(int i, int i2, int[] iArr) {
        if (i < 0 || i > this.f10823k4 - 1 || i2 < 0 || i2 > this.f10826x1 - 1) {
            throw new ArrayIndexOutOfBoundsException("x or y out of locked area");
        }
        int iM56311k4 = AbstractC12002ck.m56311k4(this.f10825to) >> 3;
        if (iM56311k4 == 0) {
            return;
        }
        int i3 = this.f10824kk;
        byte[] bArr = (byte[]) this.f10821du.m67356kk().m19850k4();
        int i4 = (i2 * i3) + (i * iM56311k4);
        int i5 = 0;
        while (i5 < iM56311k4) {
            iArr[i5] = bArr[i4];
            i5++;
            i4++;
        }
    }

    /* JADX INFO: renamed from: k4 */
    public void m15718k4(C3983k4 c3983k4) {
        c3983k4.f10826x1 = this.f10826x1;
        c3983k4.f10823k4 = this.f10823k4;
        c3983k4.f10825to = this.f10825to;
        c3983k4.f10822h4 = this.f10822h4;
        c3983k4.f10824kk = this.f10824kk;
        c3983k4.f10821du = new C14112xw(m15721to().m67356kk());
    }

    /* JADX INFO: renamed from: k4 */
    public void m15719k4(C14112xw c14112xw) {
        this.f10821du = c14112xw;
    }
}
