package com.aspose.slides.internal.p075d5;

import com.aspose.slides.C22200OooO0o0;
import com.aspose.slides.internal.p019ac.C1360yj;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p475wh.C12003du;
import com.aspose.slides.internal.p498xe.C12512ks;
import com.aspose.slides.internal.p498xe.C12525yj;
import com.aspose.slides.p559ms.System.AbstractC14092to;

/* JADX INFO: renamed from: com.aspose.slides.internal.d5.kk */
/* JADX INFO: loaded from: classes3.dex */
public class C3021kk {

    /* JADX INFO: renamed from: k4 */
    private C12003du[] f8853k4;

    /* JADX INFO: renamed from: x1 */
    private byte[] f8854x1;

    public C3021kk(C12003du[] c12003duArr) {
        this.f8853k4 = c12003duArr;
        this.f8854x1 = new byte[c12003duArr.length];
    }

    /* JADX INFO: renamed from: k4 */
    public static C3021kk m12711k4(C1360yj c1360yj) {
        if (c1360yj == null) {
            return null;
        }
        C12003du[] c12003duArr = (C12003du[]) AbstractC14092to.m67212k4(AbstractC14092to.m67205k4(C7019kk.m27443k4((Class<?>) C12003du.class), c1360yj.m8055k4()));
        byte[] bArr = new byte[c1360yj.m8055k4()];
        for (int i = 0; i < (c1360yj.m8055k4() & 65535); i++) {
            C12003du.m56396k4(c1360yj.m8059kk()[i].m7942k4()).CloneTo(c12003duArr[i]);
        }
        return new C3021kk(c12003duArr);
    }

    /* JADX INFO: renamed from: kk */
    public final int m12714kk() {
        return this.f8853k4.length;
    }

    /* JADX INFO: renamed from: x1 */
    public final C12003du[] m12715x1() {
        return this.f8853k4;
    }

    public C3021kk(C12003du[] c12003duArr, byte[] bArr) {
        this.f8853k4 = c12003duArr;
        this.f8854x1 = bArr;
    }

    /* JADX INFO: renamed from: k4 */
    public static C3021kk m12712k4(C12525yj c12525yj) {
        if (c12525yj == null) {
            return null;
        }
        C12003du[] c12003duArr = (C12003du[]) AbstractC14092to.m67212k4(AbstractC14092to.m67205k4(C7019kk.m27443k4((Class<?>) C12003du.class), c12525yj.m58297x1()));
        byte[] bArr = new byte[c12525yj.m58297x1()];
        for (int i = 0; i < (c12525yj.m58297x1() & 65535); i++) {
            C12512ks c12512ks = c12525yj.m58296kk()[i];
            c12512ks.m58178h4().CloneTo(c12003duArr[i]);
            bArr[i] = c12512ks.m58179k4();
        }
        return new C3021kk(c12003duArr, bArr);
    }

    public C3021kk(C12003du[] c12003duArr, byte[] bArr, int i) {
        if (i >= c12003duArr.length) {
            this.f8853k4 = c12003duArr;
            this.f8854x1 = bArr;
            return;
        }
        C12003du[] c12003duArr2 = (C12003du[]) C22200OooO0o0.OooO00o(C12003du.class, i);
        byte[] bArr2 = new byte[i];
        for (int i2 = 0; i2 < i; i2++) {
            c12003duArr[i2].CloneTo(c12003duArr2[i2]);
            bArr2[i2] = bArr[i2];
        }
        this.f8853k4 = c12003duArr2;
        this.f8854x1 = bArr2;
    }

    /* JADX INFO: renamed from: k4 */
    public final byte[] m12713k4() {
        return this.f8854x1;
    }
}
