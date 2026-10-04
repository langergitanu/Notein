package com.aspose.slides.internal.p245la;

import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p515xz.C12757x1;
import com.aspose.slides.internal.p550zi.C13618wy;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.C14069jd;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.words.StyleIdentifier;

/* JADX INFO: renamed from: com.aspose.slides.internal.la.to */
/* JADX INFO: loaded from: classes.dex */
public class C6019to {

    /* JADX INFO: renamed from: du */
    private byte f17053du;

    /* JADX INFO: renamed from: dy */
    private boolean f17054dy;

    /* JADX INFO: renamed from: h4 */
    private byte f17055h4;

    /* JADX INFO: renamed from: k4 */
    private final byte[] f17056k4;

    /* JADX INFO: renamed from: kk */
    private int f17057kk;

    /* JADX INFO: renamed from: m9 */
    private byte f17058m9;

    /* JADX INFO: renamed from: to */
    private int f17059to;

    /* JADX INFO: renamed from: x1 */
    private final byte[] f17060x1;

    public C6019to(int i, int i2, byte b, byte b2, byte b3) {
        this(new byte[]{71, 73, 70, 56, 57, 97}, i, i2, b, b2, b3);
    }

    /* JADX INFO: renamed from: du */
    public int m24319du() {
        return 2 << (C7019kk.m27462to(Byte.valueOf(this.f17053du), 6) & 7);
    }

    /* JADX INFO: renamed from: k4 */
    public byte m24320k4() {
        return this.f17055h4;
    }

    /* JADX INFO: renamed from: kk */
    public int m24324kk() {
        return this.f17059to;
    }

    /* JADX INFO: renamed from: to */
    public boolean m24325to() {
        return (C7019kk.m27462to(Byte.valueOf(this.f17053du), 6) & 128) != 0;
    }

    /* JADX INFO: renamed from: x1 */
    public int m24326x1() {
        return this.f17057kk;
    }

    public C6019to(byte[] bArr, int i, int i2, byte b, byte b2, byte b3) {
        if (bArr == null) {
            throw new ArgumentNullException("formatVersion");
        }
        if (bArr.length != 6) {
            throw new ArgumentOutOfRangeException("formatVersion", "Expected exactly 6 bytes.");
        }
        byte[] bArr2 = new byte[3];
        this.f17056k4 = bArr2;
        byte[] bArr3 = new byte[3];
        this.f17060x1 = bArr3;
        AbstractC14092to.m67220k4(AbstractC14092to.m67208k4((Object) bArr), AbstractC14092to.m67208k4((Object) bArr2), 3);
        AbstractC14092to.m67216k4(AbstractC14092to.m67208k4((Object) bArr), 3, AbstractC14092to.m67208k4((Object) bArr3), 0, 3);
        this.f17057kk = i;
        this.f17059to = i2;
        this.f17053du = b;
        this.f17055h4 = b2;
        this.f17058m9 = b3;
    }

    /* JADX INFO: renamed from: k4 */
    public static byte m24317k4(int i, boolean z, boolean z2, byte b) {
        byte bM27462to = 0;
        while (i > 3) {
            i >>= 1;
            bM27462to = (byte) (bM27462to + 1);
        }
        if (z2) {
            bM27462to = (byte) (C7019kk.m27462to(Byte.valueOf(bM27462to), 6) | 8);
        }
        if (C7019kk.m27462to(Byte.valueOf(b), 6) > 7) {
            throw new ArgumentOutOfRangeException("colorResolution", "The color resolution must be in 0-7 range.");
        }
        byte bM27462to2 = (byte) (C7019kk.m27462to(Byte.valueOf(bM27462to), 6) | C7019kk.m27462to(Byte.valueOf(C7019kk.m27442k4(Integer.valueOf(C7019kk.m27462to(Byte.valueOf(b), 6) << 4), 9)), 6));
        return z ? (byte) (C7019kk.m27462to(Byte.valueOf(bM27462to2), 6) | 128) : bM27462to2;
    }

    /* JADX INFO: renamed from: k4 */
    public static C6019to m24318k4(C13618wy c13618wy, boolean z) {
        c13618wy.m62851jd();
        byte[] bArr = new byte[6];
        int iM62860x1 = c13618wy.m62860x1(bArr);
        if (iM62860x1 != 6) {
            if (z) {
                return null;
            }
            throw new C12757x1(C14113y2.m67402k4("Cannot deserialize data from stream. There is not enough bytes to read from. Expected: {0} bytes but loaded: {1} bytes", C7019kk.m27466x1(6), C7019kk.m27466x1(iM62860x1)));
        }
        if (C7019kk.m27462to(Byte.valueOf(bArr[0]), 6) != 71 || C7019kk.m27462to(Byte.valueOf(bArr[1]), 6) != 73 || C7019kk.m27462to(Byte.valueOf(bArr[2]), 6) != 70 || C7019kk.m27462to(Byte.valueOf(bArr[3]), 6) != 56 || ((C7019kk.m27462to(Byte.valueOf(bArr[4]), 6) != 57 && C7019kk.m27462to(Byte.valueOf(bArr[4]), 6) != 55) || C7019kk.m27462to(Byte.valueOf(bArr[5]), 6) != 97)) {
            if (z) {
                return null;
            }
            throw new C12757x1("The GIF version is not supported.");
        }
        byte[] bArr2 = new byte[7];
        int iM62860x12 = c13618wy.m62860x1(bArr2);
        if (iM62860x12 == 7) {
            return new C6019to(bArr, C14069jd.m66769k4(bArr2, 0), C14069jd.m66769k4(bArr2, 2), bArr2[4], bArr2[5], bArr2[6]);
        }
        if (z) {
            return null;
        }
        throw new C12757x1(C14113y2.m67402k4("Cannot deserialize dat from stream. There is not enough bytes to read from. Expected: {0} bytes but loaded: {1} bytes", C7019kk.m27466x1(7), C7019kk.m27466x1(iM62860x12)));
    }

    /* JADX INFO: renamed from: k4 */
    public void m24321k4(int i) {
        if (i != m24319du()) {
            byte b = 0;
            while (i > 3) {
                i >>= 1;
                b = (byte) (b + 1);
            }
            byte bM27462to = (byte) (C7019kk.m27462to(Byte.valueOf(this.f17053du), 6) & StyleIdentifier.LIGHT_GRID_ACCENT_6);
            this.f17053du = bM27462to;
            this.f17053du = (byte) (C7019kk.m27462to(Byte.valueOf(bM27462to), 6) | C7019kk.m27462to(Byte.valueOf(b), 6));
            this.f17054dy = true;
        }
    }

    /* JADX INFO: renamed from: k4 */
    public void m24322k4(C13618wy c13618wy) {
        if (c13618wy == null) {
            throw new ArgumentNullException("stream");
        }
        c13618wy.m62856k4(0L);
        c13618wy.m62857k4(this.f17056k4);
        c13618wy.m62857k4(this.f17060x1);
        c13618wy.m62857k4(C14069jd.m66775k4(this.f17057kk));
        c13618wy.m62857k4(C14069jd.m66775k4(this.f17059to));
        c13618wy.m62855k4(this.f17053du);
        c13618wy.m62855k4(this.f17055h4);
        c13618wy.m62855k4(this.f17058m9);
        this.f17054dy = false;
    }

    /* JADX INFO: renamed from: k4 */
    public void m24323k4(boolean z) {
        if (z != m24325to()) {
            this.f17053du = (byte) (z ? C7019kk.m27462to(Byte.valueOf(this.f17053du), 6) | 128 : C7019kk.m27462to(Byte.valueOf(this.f17053du), 6) & 127);
            this.f17054dy = true;
        }
    }
}
