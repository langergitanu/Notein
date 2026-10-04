package com.aspose.slides.internal.p135fp;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p080dd.C3152yj;
import com.aspose.slides.internal.p385rr.C10052k4;
import com.huawei.hms.network.embedded.C18177fb;

/* JADX INFO: renamed from: com.aspose.slides.internal.fp.du */
/* JADX INFO: loaded from: classes.dex */
public class C4090du {

    /* JADX INFO: renamed from: c5 */
    private int[] f11158c5;

    /* JADX INFO: renamed from: ck */
    private int[] f11159ck;

    /* JADX INFO: renamed from: du */
    private int[] f11160du;

    /* JADX INFO: renamed from: dy */
    private byte f11161dy;

    /* JADX INFO: renamed from: fa */
    private short[] f11162fa;

    /* JADX INFO: renamed from: h4 */
    private byte[] f11163h4;

    /* JADX INFO: renamed from: jd */
    private int[] f11164jd;

    /* JADX INFO: renamed from: k4 */
    public byte f11165k4;

    /* JADX INFO: renamed from: kk */
    private int[] f11166kk;

    /* JADX INFO: renamed from: m9 */
    private byte[] f11167m9;

    /* JADX INFO: renamed from: to */
    private int[] f11168to;

    /* JADX INFO: renamed from: up */
    private boolean f11169up;

    /* JADX INFO: renamed from: x1 */
    private byte[] f11170x1;

    /* JADX INFO: renamed from: yj */
    private int[] f11171yj;

    public C4090du() {
        this.f11166kk = new int[256];
        this.f11168to = new int[256];
        this.f11167m9 = new byte[256];
        this.f11158c5 = new int[256];
        this.f11164jd = new int[256];
        this.f11170x1 = new byte[17];
    }

    /* JADX INFO: renamed from: ks */
    private void m16267ks() {
        this.f11163h4 = new byte[257];
        byte b = 0;
        byte b2 = 1;
        while (true) {
            int i = b2 & 255;
            if (i > 16) {
                this.f11163h4[b & 255] = 0;
                this.f11161dy = b;
                return;
            }
            int i2 = 1;
            while (i2 <= (this.f11170x1[i] & 255)) {
                this.f11163h4[b & 255] = b2;
                i2++;
                b = (byte) (b + 1);
            }
            b2 = (byte) (b2 + 1);
        }
    }

    /* JADX INFO: renamed from: rv */
    private void m16268rv() {
        this.f11162fa = new short[18];
        this.f11159ck = new int[18];
        this.f11171yj = new int[18];
        int i = 0;
        for (int i2 = 1; i2 <= 16; i2++) {
            byte b = this.f11170x1[i2];
            if ((b & 255) != 0) {
                int[] iArr = this.f11171yj;
                int[] iArr2 = this.f11160du;
                iArr[i2] = i - iArr2[i];
                i += b & 255;
                this.f11159ck[i2] = iArr2[i - 1];
            } else {
                this.f11159ck[i2] = -1;
            }
        }
        this.f11159ck[17] = Integer.MAX_VALUE;
    }

    /* JADX INFO: renamed from: up */
    private void m16269up() {
        this.f11160du = new int[257];
        int i = 0;
        int i2 = this.f11163h4[0] & 255;
        int i3 = 0;
        while ((this.f11163h4[i] & 255) != 0) {
            while ((this.f11163h4[i] & 255) == i2) {
                this.f11160du[i] = i3;
                i3++;
                i++;
            }
            i3 <<= 1;
            i2++;
        }
    }

    /* JADX INFO: renamed from: x6 */
    private void m16270x6() {
        this.f11166kk = new int[257];
        this.f11168to = new int[257];
        for (int i = 0; i < (this.f11161dy & 255); i++) {
            int i2 = this.f11167m9[i] & 255;
            this.f11166kk[i2] = this.f11160du[i];
            this.f11168to[i2] = this.f11163h4[i] & 255;
        }
    }

    /* JADX INFO: renamed from: yj */
    private void m16271yj() {
        int i = 0;
        C10052k4.m49681k4(m16277h4(), 0, m16277h4().length);
        for (int i2 = 1; i2 <= 8; i2++) {
            int i3 = 1;
            while (i3 <= (this.f11170x1[i2] & 255)) {
                int i4 = 8 - i2;
                int i5 = this.f11160du[i] << i4;
                for (int i6 = 1 << i4; i6 > 0; i6--) {
                    this.f11158c5[i5] = (short) i2;
                    this.f11164jd[i5] = this.f11167m9[i] & 255;
                    i5++;
                }
                i3++;
                i++;
            }
        }
    }

    /* JADX INFO: renamed from: c5 */
    public boolean m16272c5() {
        return this.f11169up;
    }

    /* JADX INFO: renamed from: ck */
    public int[] m16273ck() {
        return this.f11171yj;
    }

    /* JADX INFO: renamed from: du */
    public byte[] m16274du() {
        return this.f11167m9;
    }

    /* JADX INFO: renamed from: dy */
    public int[] m16275dy() {
        return this.f11159ck;
    }

    /* JADX INFO: renamed from: fa */
    public void m16276fa() {
        m16267ks();
        m16269up();
        m16268rv();
        m16270x6();
        m16271yj();
    }

    /* JADX INFO: renamed from: h4 */
    public int[] m16277h4() {
        return this.f11158c5;
    }

    /* JADX INFO: renamed from: jd */
    public byte m16278jd() {
        return (byte) ((this.f11165k4 & 255) >> 4);
    }

    /* JADX INFO: renamed from: k4 */
    public void m16279k4(byte b) {
        this.f11165k4 = (byte) ((b & 255) | (this.f11165k4 & 240));
    }

    /* JADX INFO: renamed from: kk */
    public int[] m16281kk() {
        return this.f11166kk;
    }

    /* JADX INFO: renamed from: m9 */
    public int[] m16282m9() {
        return this.f11164jd;
    }

    /* JADX INFO: renamed from: to */
    public int[] m16283to() {
        return this.f11168to;
    }

    /* JADX INFO: renamed from: x1 */
    public byte m16284x1() {
        return (byte) (this.f11165k4 & 15);
    }

    public C4090du(byte b, byte b2, byte[] bArr, byte[] bArr2) {
        this.f11166kk = new int[256];
        this.f11168to = new int[256];
        this.f11167m9 = new byte[256];
        this.f11158c5 = new int[256];
        this.f11164jd = new int[256];
        m16279k4(b2);
        m16285x1(b);
        this.f11170x1 = bArr;
        this.f11167m9 = bArr2;
        m16276fa();
    }

    /* JADX INFO: renamed from: k4 */
    public static void m16265k4(C4101qq c4101qq, C4090du[] c4090duArr) {
        C3152yj c3152yj = new C3152yj();
        c4101qq.m62855k4((byte) -1);
        c4101qq.m62855k4((byte) -60);
        for (C4090du c4090du : c4090duArr) {
            c3152yj.writeByte(c4090du.f11165k4);
            int i = 0;
            for (int i2 = 1; i2 <= 16; i2++) {
                c3152yj.writeByte(c4090du.f11170x1[i2]);
                i += c4090du.f11170x1[i2] & 255;
            }
            for (int i3 = 0; i3 < i; i3++) {
                c3152yj.writeByte(c4090du.f11167m9[i3]);
            }
            c4090du.f11169up = true;
        }
        c4101qq.m16370k4((int) ((c3152yj.getLength() + 2) & C18177fb.f54859s));
        c4101qq.m62857k4(c3152yj.toArray());
    }

    /* JADX INFO: renamed from: x1 */
    public void m16285x1(byte b) {
        this.f11165k4 = (byte) (((b & 255) << 4) | (this.f11165k4 & 255));
    }

    /* JADX INFO: renamed from: k4 */
    public byte[] m16280k4() {
        return this.f11170x1;
    }

    /* JADX INFO: renamed from: k4 */
    public static C4090du[] m16266k4(C4094ix c4094ix) {
        List list = new List();
        int[] iArr = {0};
        c4094ix.m16302k4(iArr);
        int i = iArr[0];
        int i2 = 2;
        while (i2 < i) {
            C4090du c4090du = new C4090du();
            int[] iArr2 = {0};
            c4094ix.m16309x1(iArr2);
            c4090du.f11165k4 = (byte) iArr2[0];
            int i3 = 0;
            for (int i4 = 1; i4 <= 16; i4++) {
                int[] iArr3 = {0};
                c4094ix.m16309x1(iArr3);
                byte b = (byte) iArr3[0];
                c4090du.f11170x1[i4] = b;
                i3 += b & 255;
            }
            int i5 = i2 + 17;
            for (int i6 = 0; i6 < i3; i6++) {
                int[] iArr4 = {0};
                c4094ix.m16309x1(iArr4);
                c4090du.f11167m9[i6] = (byte) iArr4[0];
            }
            i2 = i5 + i3;
            c4090du.m16276fa();
            list.addItem(c4090du);
        }
        return (C4090du[]) list.toArray(new C4090du[0]);
    }
}
