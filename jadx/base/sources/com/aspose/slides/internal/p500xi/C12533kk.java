package com.aspose.slides.internal.p500xi;

import com.aspose.slides.C22200OooO0o0;
import com.aspose.slides.internal.p260ly.C6291yj;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p475wh.C12003du;
import com.aspose.slides.internal.p488x0.C12341ks;
import com.aspose.slides.internal.p488x0.C12354yj;
import com.aspose.slides.p559ms.System.AbstractC14092to;

/* JADX INFO: renamed from: com.aspose.slides.internal.xi.kk */
/* JADX INFO: loaded from: classes5.dex */
public class C12533kk {

    /* JADX INFO: renamed from: k4 */
    private C12003du[] f41966k4;

    /* JADX INFO: renamed from: x1 */
    private byte[] f41967x1;

    public C12533kk(C12003du[] c12003duArr) {
        this.f41966k4 = c12003duArr;
        this.f41967x1 = new byte[c12003duArr.length];
    }

    /* JADX INFO: renamed from: k4 */
    public static C12533kk m58350k4(C6291yj c6291yj) {
        if (c6291yj == null) {
            return null;
        }
        C12003du[] c12003duArr = (C12003du[]) AbstractC14092to.m67212k4(AbstractC14092to.m67205k4(C7019kk.m27443k4((Class<?>) C12003du.class), c6291yj.m25736x1()));
        byte[] bArr = new byte[c6291yj.m25736x1()];
        for (int i = 0; i < (c6291yj.m25736x1() & 65535); i++) {
            C12003du.m56396k4(c6291yj.m25735to()[i].m25582h4()).CloneTo(c12003duArr[i]);
        }
        return new C12533kk(c12003duArr);
    }

    /* JADX INFO: renamed from: kk */
    public final int m58353kk() {
        return this.f41966k4.length;
    }

    /* JADX INFO: renamed from: x1 */
    public final C12003du[] m58354x1() {
        return this.f41966k4;
    }

    public C12533kk(C12003du[] c12003duArr, byte[] bArr) {
        this.f41966k4 = c12003duArr;
        this.f41967x1 = bArr;
    }

    /* JADX INFO: renamed from: k4 */
    public static C12533kk m58351k4(C12354yj c12354yj) {
        if (c12354yj == null) {
            return null;
        }
        C12003du[] c12003duArr = (C12003du[]) AbstractC14092to.m67212k4(AbstractC14092to.m67205k4(C7019kk.m27443k4((Class<?>) C12003du.class), c12354yj.m57894x1()));
        byte[] bArr = new byte[c12354yj.m57894x1()];
        for (int i = 0; i < (c12354yj.m57894x1() & 65535); i++) {
            C12341ks c12341ks = c12354yj.m57893kk()[i];
            c12341ks.m57762h4().CloneTo(c12003duArr[i]);
            bArr[i] = c12341ks.m57763k4();
        }
        return new C12533kk(c12003duArr, bArr);
    }

    public C12533kk(C12003du[] c12003duArr, byte[] bArr, int i) {
        if (i >= c12003duArr.length) {
            this.f41966k4 = c12003duArr;
            this.f41967x1 = bArr;
            return;
        }
        C12003du[] c12003duArr2 = (C12003du[]) C22200OooO0o0.OooO00o(C12003du.class, i);
        byte[] bArr2 = new byte[i];
        for (int i2 = 0; i2 < i; i2++) {
            c12003duArr[i2].CloneTo(c12003duArr2[i2]);
            bArr2[i2] = bArr[i2];
        }
        this.f41966k4 = c12003duArr2;
        this.f41967x1 = bArr2;
    }

    /* JADX INFO: renamed from: k4 */
    public final byte[] m58352k4() {
        return this.f41967x1;
    }
}
