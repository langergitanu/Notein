package com.aspose.slides.internal.p443ul;

import com.aspose.slides.PatternStyle;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.internal.p294n9.AbstractC6747ar;
import com.aspose.slides.internal.p416tb.AbstractC10914up;
import com.aspose.slides.internal.p416tb.C10898dy;
import com.aspose.slides.internal.p416tb.C10922yj;
import com.aspose.slides.internal.p456v5.C11605dy;
import com.aspose.slides.internal.p456v5.C11609m9;
import com.aspose.slides.internal.p505xn.C12563k4;
import com.aspose.slides.internal.p505xn.C12565ks;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.C14116yg;
import com.google.common.primitives.UnsignedBytes;

/* JADX INFO: renamed from: com.aspose.slides.internal.ul.x1 */
/* JADX INFO: loaded from: classes4.dex */
public class C11447x1 extends AbstractC10914up {

    /* JADX INFO: renamed from: c5 */
    private byte[] f39005c5;

    /* JADX INFO: renamed from: du */
    private int f39006du;

    /* JADX INFO: renamed from: dy */
    private byte[] f39007dy;

    /* JADX INFO: renamed from: h4 */
    private int f39008h4;

    /* JADX INFO: renamed from: k4 */
    private final byte[] f39009k4;

    /* JADX INFO: renamed from: kk */
    private final C11605dy f39010kk;

    /* JADX INFO: renamed from: m9 */
    private byte[] f39011m9;

    /* JADX INFO: renamed from: to */
    private int f39012to;

    /* JADX INFO: renamed from: jd */
    private static final byte[] f39004jd = {40, -65, 78, 94, 78, 117, -118, 65, 100, 0, 78, 86, -1, -6, 1, 8, PatternStyle.Divot, PatternStyle.Divot, 0, -74, -48, 104, 62, UnsignedBytes.MAX_POWER_OF_TWO, PatternStyle.Shingle, 12, -87, -2, 100, 83, 105, 122};

    /* JADX INFO: renamed from: ck */
    private static final byte[] f39003ck = {115, 65, 108, 84};

    public C11447x1(C10898dy c10898dy, byte[] bArr) {
        super(c10898dy);
        this.f39009k4 = new byte[5];
        this.f39010kk = new C11605dy();
        C11444k4 c11444k4M52635yj = c10898dy.m52464x1().m52635yj();
        m54505k4(c11444k4M52635yj.m54501to());
        int iM54500kk = c11444k4M52635yj.m54500kk();
        this.f39008h4 = iM54500kk;
        int i = this.f39006du;
        this.f39008h4 = (iM54500kk | ((i == 3 || i == 4) ? -3904 : -64)) & (-4);
        byte[] bArrMo26677to = C12565ks.m58630x1(c11444k4M52635yj.m54499k4()) ? AbstractC6747ar.m26635ix().mo26677to(c11444k4M52635yj.m54499k4()) : C12563k4.f42075k4;
        m54507k4(bArrMo26677to, C12565ks.m58630x1(c11444k4M52635yj.m54502x1()) ? AbstractC6747ar.m26635ix().mo26677to(c11444k4M52635yj.m54502x1()) : bArr);
        m54508x1(bArr, bArrMo26677to);
        m54506k4(bArr);
    }

    /* JADX INFO: renamed from: x1 */
    private void m54508x1(byte[] bArr, byte[] bArr2) {
        this.f39007dy = new byte[this.f39012to / 8];
        C11609m9 c11609m9 = new C11609m9();
        byte[] bArrM54509x1 = m54509x1(bArr2);
        c11609m9.m54689k4(bArrM54509x1, bArrM54509x1.length);
        byte[] bArr3 = this.f39011m9;
        c11609m9.m54689k4(bArr3, bArr3.length);
        int i = this.f39008h4;
        c11609m9.m54689k4(new byte[]{(byte) i, (byte) (i >> 8), (byte) (i >> 16), (byte) (i >> 24)}, 4);
        if (bArr != null) {
            c11609m9.m54689k4(bArr, bArr.length);
        }
        c11609m9.m54687du();
        byte[] bArrM54688h4 = c11609m9.m54688h4();
        byte[] bArr4 = new byte[this.f39007dy.length];
        AbstractC14092to.m67216k4(AbstractC14092to.m67208k4((Object) bArrM54688h4), 0, AbstractC14092to.m67208k4((Object) bArr4), 0, this.f39007dy.length);
        int i2 = this.f39006du;
        if (i2 == 3 || i2 == 4) {
            C11609m9 c11609m92 = new C11609m9();
            for (int i3 = 0; i3 < 50; i3++) {
                try {
                    AbstractC14092to.m67216k4(AbstractC14092to.m67208k4((Object) c11609m92.m19588x1(bArr4)), 0, AbstractC14092to.m67208k4((Object) bArr4), 0, this.f39007dy.length);
                } finally {
                    c11609m92.dispose();
                }
            }
        }
        AbstractC14092to.m67216k4(AbstractC14092to.m67208k4((Object) bArr4), 0, AbstractC14092to.m67208k4((Object) this.f39007dy), 0, this.f39007dy.length);
    }

    /* JADX INFO: renamed from: k4 */
    public final C11445kk m54510k4(int i, int i2) {
        byte[] bArr = this.f39009k4;
        bArr[0] = (byte) i;
        bArr[1] = (byte) (i >> 8);
        bArr[2] = (byte) (i >> 16);
        bArr[3] = (byte) i2;
        bArr[4] = (byte) (i2 >> 8);
        C11609m9 c11609m9 = new C11609m9();
        byte[] bArr2 = this.f39007dy;
        c11609m9.m54689k4(bArr2, bArr2.length);
        byte[] bArr3 = this.f39009k4;
        c11609m9.m54689k4(bArr3, bArr3.length);
        if (this.f39006du == 4) {
            c11609m9.m54689k4(f39003ck, this.f39009k4.length);
        }
        c11609m9.m54687du();
        byte[] bArrM54688h4 = c11609m9.m54688h4();
        int length = this.f39007dy.length + 5;
        return new C11445kk(bArrM54688h4, length <= 16 ? length : 16);
    }

    /* JADX INFO: renamed from: k4 */
    private void m54505k4(int i) {
        int i2;
        if (i == 0) {
            this.f39012to = 40;
            i2 = 2;
        } else {
            if (i != 1) {
                throw new ArgumentException("Invalid encryption mode.");
            }
            this.f39012to = 128;
            i2 = 3;
        }
        this.f39006du = i2;
    }

    /* JADX INFO: renamed from: x1 */
    private static byte[] m54509x1(byte[] bArr) {
        byte[] bArr2 = new byte[32];
        if (bArr == null || bArr.length == 0) {
            AbstractC14092to.m67216k4(AbstractC14092to.m67208k4((Object) f39004jd), 0, AbstractC14092to.m67208k4((Object) bArr2), 0, 32);
            return bArr2;
        }
        AbstractC14092to.m67216k4(AbstractC14092to.m67208k4((Object) bArr), 0, AbstractC14092to.m67208k4((Object) bArr2), 0, C14116yg.m67507x1(bArr.length, 32));
        if (bArr.length < 32) {
            AbstractC14092to.m67216k4(AbstractC14092to.m67208k4((Object) f39004jd), 0, AbstractC14092to.m67208k4((Object) bArr2), bArr.length, 32 - bArr.length);
        }
        return bArr2;
    }

    @Override // com.aspose.slides.internal.p416tb.AbstractC10914up
    /* JADX INFO: renamed from: k4 */
    public void mo9082k4(C10922yj c10922yj) {
        c10922yj.m52676k4(this);
        c10922yj.m52643dy();
        c10922yj.m52650k4("/Filter /Standard");
        c10922yj.m52666kk("/O", C14113y2.m67402k4("<{0}>", C12565ks.m58611k4(this.f39011m9)));
        c10922yj.m52666kk("/U", C14113y2.m67402k4("<{0}>", C12565ks.m58611k4(this.f39005c5)));
        c10922yj.m52652k4("/P", this.f39008h4);
        c10922yj.m52652k4("/R", this.f39006du);
        int i = this.f39006du;
        if (i == 2) {
            c10922yj.m52652k4("/V", 1);
        } else {
            if (i != 3) {
                throw new InvalidOperationException("Unexpected encryption method.");
            }
            c10922yj.m52652k4("/V", 2);
            c10922yj.m52652k4("/Length", 128);
        }
        c10922yj.m52640c5();
        c10922yj.m52678x1();
    }

    /* JADX INFO: renamed from: k4 */
    private void m54506k4(byte[] bArr) {
        byte[] bArr2;
        this.f39005c5 = new byte[32];
        int i = this.f39006du;
        if (i != 3 && i != 4) {
            this.f39010kk.m54657x1(this.f39007dy);
            this.f39010kk.m54656k4(f39004jd, this.f39005c5);
            return;
        }
        C11609m9 c11609m9 = new C11609m9();
        byte[] bArr3 = f39004jd;
        c11609m9.m54689k4(bArr3, bArr3.length);
        c11609m9.m54689k4(bArr, bArr.length);
        c11609m9.m54687du();
        byte[] bArrM54688h4 = c11609m9.m54688h4();
        AbstractC14092to.m67216k4(AbstractC14092to.m67208k4((Object) bArrM54688h4), 0, AbstractC14092to.m67208k4((Object) this.f39005c5), 0, 16);
        for (int i2 = 16; i2 < 32; i2++) {
            this.f39005c5[i2] = 0;
        }
        for (int i3 = 0; i3 < 20; i3++) {
            int i4 = 0;
            while (true) {
                bArr2 = this.f39007dy;
                if (i4 < bArr2.length) {
                    bArrM54688h4[i4] = (byte) ((bArr2[i4] & 255) ^ i3);
                    i4++;
                }
            }
            this.f39010kk.m54658x1(bArrM54688h4, 0, bArr2.length);
            this.f39010kk.m54654k4(this.f39005c5, 0, 16);
        }
    }

    /* JADX INFO: renamed from: k4 */
    private void m54507k4(byte[] bArr, byte[] bArr2) {
        this.f39011m9 = new byte[32];
        byte[] bArrM54509x1 = m54509x1(bArr2);
        if (bArr2 == null || bArr2.length == 0) {
            bArrM54509x1 = m54509x1(bArr);
        }
        byte[] bArrM19588x1 = new C11609m9().m19588x1(bArrM54509x1);
        byte[] bArrM54509x12 = m54509x1(bArr);
        int i = this.f39006du;
        if (i != 3 && i != 4) {
            this.f39010kk.m54658x1(bArrM19588x1, 0, 5);
            this.f39010kk.m54656k4(bArrM54509x12, this.f39011m9);
            return;
        }
        int i2 = this.f39012to / 8;
        byte[] bArr3 = new byte[i2];
        C11609m9 c11609m9 = new C11609m9();
        for (int i3 = 0; i3 < 50; i3++) {
            try {
                AbstractC14092to.m67216k4(AbstractC14092to.m67208k4((Object) c11609m9.m19586kk(bArrM19588x1, 0, i2)), 0, AbstractC14092to.m67208k4((Object) bArrM19588x1), 0, i2);
            } catch (Throwable th) {
                c11609m9.dispose();
                throw th;
            }
        }
        c11609m9.dispose();
        AbstractC14092to.m67216k4(AbstractC14092to.m67208k4((Object) bArrM54509x12), 0, AbstractC14092to.m67208k4((Object) this.f39011m9), 0, 32);
        for (int i4 = 0; i4 < 20; i4++) {
            for (int i5 = 0; i5 < i2; i5++) {
                bArr3[i5] = (byte) ((bArrM19588x1[i5] & 255) ^ i4);
            }
            this.f39010kk.m54657x1(bArr3);
            this.f39010kk.m54653k4(this.f39011m9);
        }
    }
}
