package com.aspose.slides.internal.p060ca;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.internal.p060ca.C2073ep;
import com.aspose.slides.internal.p314oc.AbstractC7020m9;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.C14058fa;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.words.StyleIdentifier;
import com.google.common.base.Ascii;
import com.google.common.primitives.SignedBytes;
import com.google.common.primitives.UnsignedBytes;
import com.huawei.hms.network.embedded.C18177fb;

/* JADX INFO: renamed from: com.aspose.slides.internal.ca.r5 */
/* JADX INFO: loaded from: classes3.dex */
public class C2271r5 {

    /* JADX INFO: renamed from: du */
    private C2364x6 f7793du;

    /* JADX INFO: renamed from: h4 */
    private C2364x6 f7794h4;

    /* JADX INFO: renamed from: k4 */
    private byte[] f7795k4;

    /* JADX INFO: renamed from: kk */
    private byte[] f7796kk;

    /* JADX INFO: renamed from: to */
    private C2364x6 f7797to;

    /* JADX INFO: renamed from: x1 */
    private byte[] f7798x1;

    /* JADX INFO: renamed from: com.aspose.slides.internal.ca.r5$du */
    public static class du extends kk {

        /* JADX INFO: renamed from: c5 */
        public short[] f7799c5;

        /* JADX INFO: renamed from: jd */
        public short[] f7800jd;

        /* JADX INFO: renamed from: k4 */
        public int[] f7801k4;

        private du() {
        }

        @Override // com.aspose.slides.internal.p060ca.C2271r5.kk
        /* JADX INFO: renamed from: k4 */
        public int mo11331k4() {
            if (this.f7810x1 <= 0) {
                return 0;
            }
            return (this.f7800jd.length * 2) + (this.f7799c5.length * 2) + (this.f7801k4.length * 2) + 12 + this.f7805dy.length + this.f7808m9.length;
        }

        @Override // com.aspose.slides.internal.p060ca.C2271r5.kk
        /* JADX INFO: renamed from: k4 */
        public void mo11332k4(C2214ne c2214ne) {
            short s = this.f7810x1;
            if (s <= 0) {
                return;
            }
            c2214ne.m11172k4(s);
            c2214ne.m11172k4(this.f7807kk);
            c2214ne.m11172k4(this.f7809to);
            c2214ne.m11172k4(this.f7804du);
            c2214ne.m11172k4(this.f7806h4);
            int i = 0;
            int i2 = 0;
            while (true) {
                int[] iArr = this.f7801k4;
                if (i2 >= iArr.length) {
                    break;
                }
                c2214ne.m11173kk(iArr[i2]);
                i2++;
            }
            c2214ne.m11173kk(this.f7805dy.length & 65535);
            int i3 = 0;
            while (true) {
                byte[] bArr = this.f7805dy;
                if (i3 >= bArr.length) {
                    break;
                }
                c2214ne.m11169k4(bArr[i3]);
                i3++;
            }
            int i4 = 0;
            while (true) {
                byte[] bArr2 = this.f7808m9;
                if (i4 >= bArr2.length) {
                    break;
                }
                c2214ne.m11169k4(bArr2[i4]);
                i4++;
            }
            int i5 = 0;
            while (true) {
                short[] sArr = this.f7799c5;
                if (i5 >= sArr.length) {
                    break;
                }
                c2214ne.m11172k4(sArr[i5]);
                i5++;
            }
            while (true) {
                short[] sArr2 = this.f7800jd;
                if (i >= sArr2.length) {
                    return;
                }
                c2214ne.m11172k4(sArr2[i]);
                i++;
            }
        }
    }

    /* JADX INFO: renamed from: com.aspose.slides.internal.ca.r5$k4 */
    public static class k4 extends kk {

        /* JADX INFO: renamed from: k4 */
        public int f7802k4;

        public k4() {
            this.f7810x1 = (short) -1;
        }

        @Override // com.aspose.slides.internal.p060ca.C2271r5.kk
        /* JADX INFO: renamed from: k4 */
        public void mo11332k4(C2214ne c2214ne) {
            c2214ne.m11172k4(this.f7810x1);
            c2214ne.m11172k4(this.f7807kk);
            c2214ne.m11172k4(this.f7809to);
            c2214ne.m11172k4(this.f7804du);
            c2214ne.m11172k4(this.f7806h4);
            int i = 0;
            int i2 = 0;
            while (true) {
                byte[] bArr = this.f7808m9;
                if (i2 >= bArr.length) {
                    break;
                }
                c2214ne.m11169k4(bArr[i2]);
                i2++;
            }
            c2214ne.m11173kk(this.f7805dy.length & 65535);
            while (true) {
                byte[] bArr2 = this.f7805dy;
                if (i >= bArr2.length) {
                    return;
                }
                c2214ne.m11169k4(bArr2[i]);
                i++;
            }
        }
    }

    /* JADX INFO: renamed from: com.aspose.slides.internal.ca.r5$kk */
    public static abstract class kk {

        /* JADX INFO: renamed from: k4 */
        private static final byte[] f7803k4 = new byte[0];

        /* JADX INFO: renamed from: du */
        public short f7804du;

        /* JADX INFO: renamed from: dy */
        public byte[] f7805dy = f7803k4;

        /* JADX INFO: renamed from: h4 */
        public short f7806h4;

        /* JADX INFO: renamed from: kk */
        public short f7807kk;

        /* JADX INFO: renamed from: m9 */
        public byte[] f7808m9;

        /* JADX INFO: renamed from: to */
        public short f7809to;

        /* JADX INFO: renamed from: x1 */
        public short f7810x1;

        /* JADX INFO: renamed from: k4 */
        public int mo11331k4() {
            return this.f7808m9.length + 12 + this.f7805dy.length;
        }

        /* JADX INFO: renamed from: k4 */
        public abstract void mo11332k4(C2214ne c2214ne);
    }

    /* JADX INFO: renamed from: com.aspose.slides.internal.ca.r5$to */
    public static class to extends AbstractC7020m9<to> {

        /* JADX INFO: renamed from: k4 */
        public short f7811k4;

        /* JADX INFO: renamed from: x1 */
        public short f7812x1;

        public to() {
        }

        /* JADX INFO: renamed from: x1 */
        private boolean m11333x1(to toVar) {
            return toVar.f7811k4 == this.f7811k4 && toVar.f7812x1 == this.f7812x1;
        }

        public Object clone() {
            return Clone();
        }

        public boolean equals(Object obj) {
            if (C14067j2.m66729x1(null, obj)) {
                return false;
            }
            if (C14067j2.m66729x1(this, obj)) {
                return true;
            }
            if (obj instanceof to) {
                return m11333x1((to) obj);
            }
            return false;
        }

        @Override // com.aspose.slides.p559ms.System.AbstractC14079na
        /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
        public to Clone() {
            to toVar = new to();
            CloneTo(toVar);
            return toVar;
        }

        public to(short s, short s2) {
            this.f7811k4 = s;
            this.f7812x1 = s2;
        }

        @Override // com.aspose.slides.p559ms.System.AbstractC14079na
        /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
        public void CloneTo(to toVar) {
            toVar.f7811k4 = this.f7811k4;
            toVar.f7812x1 = this.f7812x1;
        }
    }

    /* JADX INFO: renamed from: com.aspose.slides.internal.ca.r5$x1 */
    public static class x1 {

        /* JADX INFO: renamed from: c5 */
        public int f7813c5;

        /* JADX INFO: renamed from: ck */
        public short f7814ck;

        /* JADX INFO: renamed from: du */
        public short f7815du;

        /* JADX INFO: renamed from: dy */
        public int f7816dy;

        /* JADX INFO: renamed from: fa */
        public int f7817fa;

        /* JADX INFO: renamed from: h4 */
        public short f7818h4;

        /* JADX INFO: renamed from: jd */
        public short f7819jd;

        /* JADX INFO: renamed from: k4 */
        public byte[] f7820k4;

        /* JADX INFO: renamed from: kk */
        public byte[] f7821kk;

        /* JADX INFO: renamed from: m9 */
        public short f7822m9;

        /* JADX INFO: renamed from: to */
        public short f7823to;

        /* JADX INFO: renamed from: up */
        public short f7824up;

        /* JADX INFO: renamed from: x1 */
        public boolean f7825x1;
    }

    public C2271r5(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.f7795k4 = bArr;
        this.f7798x1 = bArr2;
        this.f7796kk = bArr3;
        this.f7797to = new C2364x6(bArr);
        this.f7793du = new C2364x6(bArr2);
        this.f7794h4 = new C2364x6(bArr3);
    }

    /* JADX INFO: renamed from: k4 */
    private static int m11315k4(C2364x6 c2364x6) {
        int iM11668dy;
        byte bM11668dy = c2364x6.m11668dy();
        if (bM11668dy == -3) {
            iM11668dy = (c2364x6.m11668dy() & 255) | (((c2364x6.m11668dy() & 255) << 8) & 65535);
        } else if (bM11668dy == -1) {
            iM11668dy = (c2364x6.m11668dy() & 255) + StyleIdentifier.MEDIUM_GRID_1_ACCENT_6;
        } else {
            if (bM11668dy != -2) {
                return bM11668dy & 255;
            }
            iM11668dy = (c2364x6.m11668dy() & 255) + 506;
        }
        return iM11668dy & 65535;
    }

    /* JADX INFO: renamed from: x1 */
    private static short m11328x1(C2364x6 c2364x6) {
        short s;
        int iM11668dy;
        byte bM11668dy = c2364x6.m11668dy();
        if (bM11668dy == -3) {
            iM11668dy = ((c2364x6.m11668dy() & 255) | (((c2364x6.m11668dy() & 255) << 8) & 65535)) & 65535;
        } else {
            if (bM11668dy == -6) {
                bM11668dy = c2364x6.m11668dy();
                s = -1;
            } else {
                s = 1;
            }
            iM11668dy = ((short) (bM11668dy == -1 ? (c2364x6.m11668dy() & 255) + 250 : bM11668dy == -2 ? (c2364x6.m11668dy() & 255) + 500 : bM11668dy & 255)) * s;
        }
        return (short) iM11668dy;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v4 */
    /* JADX WARN: Type inference failed for: r14v5 */
    /* JADX INFO: renamed from: k4 */
    private du m11316k4(short s) {
        boolean z;
        int i;
        to toVar = new to();
        toVar.f7811k4 = Short.MAX_VALUE;
        toVar.f7812x1 = Short.MAX_VALUE;
        to toVar2 = new to();
        toVar2.f7811k4 = Short.MIN_VALUE;
        toVar2.f7812x1 = Short.MIN_VALUE;
        if (s == Short.MAX_VALUE) {
            short sM11673m9 = this.f7797to.m11673m9();
            toVar.f7811k4 = this.f7797to.m11673m9();
            toVar.f7812x1 = this.f7797to.m11673m9();
            toVar2.f7811k4 = this.f7797to.m11673m9();
            toVar2.f7812x1 = this.f7797to.m11673m9();
            z = true;
            i = sM11673m9;
        } else {
            z = false;
            i = s;
        }
        du duVar = new du();
        duVar.f7810x1 = i;
        duVar.f7801k4 = new int[i];
        int iM11315k4 = 0;
        for (int i2 = 0; i2 < i; i2++) {
            iM11315k4 = ((iM11315k4 & 65535) + (m11315k4(this.f7797to) & 65535)) & 65535;
            duVar.f7801k4[i2] = iM11315k4;
        }
        if ((iM11315k4 & 65535) > 0 || i > 0) {
            iM11315k4++;
        }
        int i3 = iM11315k4 & 65535;
        duVar.f7808m9 = new byte[i3];
        duVar.f7799c5 = new short[i3];
        duVar.f7800jd = new short[i3];
        byte[] bArr = new byte[i3];
        for (int i4 = 0; i4 < i3; i4++) {
            bArr[i4] = this.f7797to.m11668dy();
        }
        to toVar3 = new to();
        for (int i5 = 0; i5 < i3; i5++) {
            byte[] bArr2 = {0};
            to toVarClone = m11318k4(bArr[i5], bArr2).Clone();
            duVar.f7808m9[i5] = bArr2[0];
            short[] sArr = duVar.f7799c5;
            short s2 = toVarClone.f7811k4;
            sArr[i5] = s2;
            short[] sArr2 = duVar.f7800jd;
            short s3 = toVarClone.f7812x1;
            sArr2[i5] = s3;
            short s4 = (short) (toVar3.f7811k4 + s2);
            toVar3.f7811k4 = s4;
            short s5 = (short) (toVar3.f7812x1 + s3);
            toVar3.f7812x1 = s5;
            if (!z) {
                if (toVar.f7811k4 > s4) {
                    toVar.f7811k4 = s4;
                }
                if (toVar.f7812x1 > s5) {
                    toVar.f7812x1 = s5;
                }
                short s6 = toVar2.f7811k4;
                short s7 = toVar3.f7811k4;
                if (s6 < s7) {
                    toVar2.f7811k4 = s7;
                }
                short s8 = toVar2.f7812x1;
                short s9 = toVar3.f7812x1;
                if (s8 < s9) {
                    toVar2.f7812x1 = s9;
                }
            }
        }
        duVar.f7807kk = toVar.f7811k4;
        duVar.f7809to = toVar.f7812x1;
        duVar.f7804du = toVar2.f7811k4;
        duVar.f7806h4 = toVar2.f7812x1;
        if (i > 0) {
            m11322k4(duVar);
        }
        return duVar;
    }

    /* JADX INFO: renamed from: x1 */
    private short[] m11329x1(int i) {
        short[] sArr = new short[i];
        int i2 = 0;
        while (i2 < i) {
            byte b = this.f7798x1[this.f7793du.m11670k4()];
            if (b == -5) {
                short s = sArr[i2 - 2];
                C2364x6 c2364x6 = this.f7793du;
                c2364x6.m11671k4(c2364x6.m11670k4() + 1);
                sArr[i2] = s;
                int i3 = i2 + 2;
                sArr[i2 + 1] = m11328x1(this.f7793du);
                i2 += 3;
                sArr[i3] = s;
            } else if (b == -4) {
                short s2 = sArr[i2 - 2];
                C2364x6 c2364x62 = this.f7793du;
                c2364x62.m11671k4(c2364x62.m11670k4() + 1);
                sArr[i2] = s2;
                sArr[i2 + 1] = m11328x1(this.f7793du);
                sArr[i2 + 2] = s2;
                int i4 = i2 + 4;
                sArr[i2 + 3] = m11328x1(this.f7793du);
                i2 += 5;
                sArr[i4] = s2;
            } else {
                sArr[i2] = m11328x1(this.f7793du);
                i2++;
            }
        }
        return sArr;
    }

    /* JADX INFO: renamed from: k4 */
    private k4 m11317k4() {
        int iM11669h4;
        C2364x6 c2364x6;
        int iM11670k4;
        C2364x6 c2364x62;
        int iM11670k42;
        k4 k4Var = new k4();
        k4Var.f7807kk = this.f7797to.m11673m9();
        k4Var.f7809to = this.f7797to.m11673m9();
        k4Var.f7804du = this.f7797to.m11673m9();
        k4Var.f7806h4 = this.f7797to.m11673m9();
        int iM11670k43 = this.f7797to.m11670k4();
        do {
            k4Var.f7802k4++;
            iM11669h4 = this.f7797to.m11669h4();
            C2364x6 c2364x63 = this.f7797to;
            c2364x63.m11671k4(c2364x63.m11670k4() + 2);
            if ((iM11669h4 & 1) == 1) {
                c2364x6 = this.f7797to;
                iM11670k4 = c2364x6.m11670k4() + 4;
            } else {
                c2364x6 = this.f7797to;
                iM11670k4 = c2364x6.m11670k4() + 2;
            }
            c2364x6.m11671k4(iM11670k4);
            if ((iM11669h4 & 8) == 8) {
                c2364x62 = this.f7797to;
                iM11670k42 = c2364x62.m11670k4() + 2;
            } else if ((iM11669h4 & 64) == 64) {
                c2364x62 = this.f7797to;
                iM11670k42 = c2364x62.m11670k4() + 4;
            } else if ((iM11669h4 & 128) == 128) {
                C2364x6 c2364x64 = this.f7797to;
                c2364x64.m11671k4(c2364x64.m11670k4() + 8);
            }
            c2364x62.m11671k4(iM11670k42);
        } while ((iM11669h4 & 32) == 32);
        k4Var.f7808m9 = new byte[this.f7797to.m11670k4() - iM11670k43];
        C14058fa.m66593k4(AbstractC14092to.m67208k4((Object) this.f7795k4), iM11670k43, AbstractC14092to.m67208k4((Object) k4Var.f7808m9), 0, k4Var.f7808m9.length);
        if ((iM11669h4 & 256) == 256) {
            m11322k4(k4Var);
        }
        return k4Var;
    }

    /* JADX INFO: renamed from: k4 */
    private to m11318k4(byte b, byte[] bArr) {
        int i;
        int i2 = 0;
        bArr[0] = 0;
        if ((b & UnsignedBytes.MAX_POWER_OF_TWO) == 0) {
            bArr[0] = (byte) 1;
        }
        C2073ep.k4 k4VarClone = C2073ep.m10494k4(b & Ascii.DEL).Clone();
        byte b2 = (byte) ((k4VarClone.f7179k4 & 255) - 1);
        int iM11668dy = 0;
        while (true) {
            i = b2 & 255;
            if (i2 >= i) {
                break;
            }
            iM11668dy = (iM11668dy << 8) | (this.f7797to.m11668dy() & 255);
            i2++;
        }
        int i3 = i * 8;
        byte b3 = k4VarClone.f7183x1;
        int i4 = (iM11668dy >> (i3 - (b3 & 255))) & ((1 << (b3 & 255)) - 1);
        int i5 = i3 - (b3 & 255);
        byte b4 = k4VarClone.f7180kk;
        int i6 = i4 + (k4VarClone.f7182to & 65535);
        int i7 = (((1 << (b4 & 255)) - 1) & (iM11668dy >> (i5 - (b4 & 255)))) + (k4VarClone.f7177du & 65535);
        if (k4VarClone.f7178h4) {
            i6 = -i6;
        }
        if (k4VarClone.f7181m9) {
            i7 = -i7;
        }
        return new to((short) i6, (short) i7);
    }

    /* JADX INFO: renamed from: k4 */
    public final x1 m11330k4(int i, C1995aa c1995aa) {
        kk[] kkVarArrM11327k4 = m11327k4(i);
        long jMo11331k4 = 0;
        boolean z = false;
        int i2 = 0;
        while (true) {
            if (i2 >= i) {
                break;
            }
            long j = jMo11331k4 & 4294967295L;
            if (((j / 2) & 4294967295L) > C18177fb.f54859s) {
                z = true;
                break;
            }
            jMo11331k4 = (j + (((long) ((kkVarArrM11327k4[i2].mo11331k4() + 3) & (-4))) & 4294967295L)) & 4294967295L;
            i2++;
        }
        return m11319k4(kkVarArrM11327k4, z, c1995aa);
    }

    /* JADX INFO: renamed from: k4 */
    private x1 m11319k4(kk[] kkVarArr, boolean z, C1995aa c1995aa) {
        kk kkVar = kkVarArr[0];
        x1 x1Var = new x1();
        x1Var.f7820k4 = m11325k4(kkVarArr);
        x1Var.f7825x1 = z;
        x1Var.f7821kk = m11323k4(z, kkVarArr);
        x1Var.f7823to = kkVar.f7804du;
        x1Var.f7815du = kkVar.f7806h4;
        x1Var.f7822m9 = kkVar.f7809to;
        x1Var.f7816dy = kkVar.f7805dy.length & 65535;
        k4 k4Var = (k4) C7019kk.m27452k4((Object) kkVar, k4.class);
        if (k4Var != null) {
            x1Var.f7813c5 = k4Var.f7802k4;
        }
        short sM10134x1 = c1995aa.m10134x1(0);
        int iM10133k4 = c1995aa.m10133k4(0);
        short s = kkVar.f7804du;
        short s2 = kkVar.f7807kk;
        x1Var.f7819jd = sM10134x1;
        x1Var.f7817fa = iM10133k4;
        x1Var.f7814ck = (short) (((iM10133k4 & 65535) - sM10134x1) - (s - s2));
        x1Var.f7824up = (short) ((s - s2) + sM10134x1);
        for (int i = 1; i < kkVarArr.length; i++) {
            kk kkVar2 = kkVarArr[i];
            short s3 = kkVar2.f7804du;
            if (s3 > x1Var.f7823to) {
                x1Var.f7823to = s3;
            }
            short s4 = kkVar2.f7806h4;
            if (s4 > x1Var.f7815du) {
                x1Var.f7815du = s4;
            }
            short s5 = kkVar2.f7807kk;
            if (s5 < x1Var.f7818h4) {
                x1Var.f7818h4 = s5;
            }
            short s6 = kkVar2.f7809to;
            if (s6 < x1Var.f7822m9) {
                x1Var.f7822m9 = s6;
            }
            int i2 = x1Var.f7816dy & 65535;
            byte[] bArr = kkVar2.f7805dy;
            if (i2 < bArr.length) {
                x1Var.f7816dy = bArr.length & 65535;
            }
            if (C7019kk.m27469x1(kkVar2, k4.class)) {
                x1Var.f7813c5 = ((k4) kkVar2).f7802k4;
            }
            short sM10134x12 = c1995aa.m10134x1(i);
            int iM10133k42 = c1995aa.m10133k4(i);
            int i3 = iM10133k42 & 65535;
            short s7 = kkVar2.f7804du;
            short s8 = kkVar2.f7807kk;
            short s9 = (short) ((i3 - sM10134x12) - (s7 - s8));
            short s10 = (short) ((s7 - s8) + sM10134x12);
            if (sM10134x12 < x1Var.f7819jd) {
                x1Var.f7819jd = sM10134x12;
            }
            if (s9 < x1Var.f7814ck) {
                x1Var.f7814ck = s9;
            }
            if (i3 > (x1Var.f7817fa & 65535)) {
                x1Var.f7817fa = iM10133k42;
            }
            if (s10 > x1Var.f7824up) {
                x1Var.f7824up = s10;
            }
        }
        return x1Var;
    }

    /* JADX INFO: renamed from: k4 */
    private static void m11320k4(List<Byte> list, byte b) {
        list.addItem(Byte.valueOf(b));
    }

    /* JADX INFO: renamed from: k4 */
    private static void m11321k4(List<Byte> list, short s) {
        list.addItem(Byte.valueOf((byte) ((s >> 8) & 255)));
        list.addItem(Byte.valueOf((byte) (s & 255)));
    }

    /* JADX INFO: renamed from: k4 */
    private void m11322k4(kk kkVar) {
        byte[] bArr;
        int iM11315k4 = m11315k4(this.f7797to);
        int iM11315k42 = m11315k4(this.f7797to);
        int i = iM11315k4 & 65535;
        int i2 = 0;
        if (i > 0) {
            byte[] bArrM11326k4 = m11326k4(m11329x1(i));
            int length = bArrM11326k4.length + (iM11315k42 & 65535);
            bArr = new byte[length];
            while (i2 < bArrM11326k4.length) {
                bArr[i2] = bArrM11326k4[i2];
                i2++;
            }
            while (i2 < length) {
                bArr[i2] = this.f7794h4.m11668dy();
                i2++;
            }
        } else {
            int i3 = iM11315k42 & 65535;
            bArr = new byte[i3];
            while (i2 < i3) {
                bArr[i2] = this.f7794h4.m11668dy();
                i2++;
            }
        }
        kkVar.f7805dy = bArr;
    }

    /* JADX INFO: renamed from: k4 */
    private static byte[] m11323k4(boolean z, kk[] kkVarArr) {
        byte[] bArr = new byte[(kkVarArr.length + 1) * (z ? 4 : 2)];
        C2214ne c2214ne = new C2214ne(bArr);
        int i = 0;
        long jMo11331k4 = 0;
        while (i <= kkVarArr.length) {
            if (z) {
                c2214ne.m11171k4(jMo11331k4);
            } else {
                c2214ne.m11173kk((int) (((jMo11331k4 & 4294967295L) / 2) & C18177fb.f54859s));
            }
            jMo11331k4 = ((jMo11331k4 & 4294967295L) + ((i < kkVarArr.length ? ((long) ((kkVarArr[i].mo11331k4() + 3) & (-4))) & 4294967295L : 0L) & 4294967295L)) & 4294967295L;
            i++;
        }
        return bArr;
    }

    /* JADX INFO: renamed from: k4 */
    private byte[] m11324k4(int[] iArr, short[] sArr) {
        int i;
        byte b;
        int i2;
        int i3 = iArr[0];
        List list = new List(sArr.length * 2);
        boolean z = false;
        while (true) {
            i = iArr[0];
            if (i < sArr.length) {
                if (z) {
                    short s = sArr[i];
                    if (s >= 0 && s <= 255) {
                        break;
                    }
                    m11321k4((List<Byte>) list, s);
                    iArr[0] = iArr[0] + 1;
                } else {
                    short s2 = sArr[i];
                    if (s2 >= 0 && s2 <= 255) {
                        m11320k4((List<Byte>) list, (byte) s2);
                    } else {
                        if (i3 != i) {
                            break;
                        }
                        m11321k4((List<Byte>) list, s2);
                        z = true;
                    }
                    iArr[0] = iArr[0] + 1;
                }
            } else {
                break;
            }
        }
        byte b2 = (byte) (i - i3);
        int i4 = b2 & 255;
        if (z) {
            if (i4 <= 8) {
                i2 = i4 + 183;
                b = (byte) i2;
            } else {
                b = 65;
            }
        } else if (i4 <= 8) {
            i2 = i4 + 175;
            b = (byte) i2;
        } else {
            b = SignedBytes.MAX_POWER_OF_TWO;
        }
        list.insertItem(0, Byte.valueOf(b));
        if ((b2 & 255) > 8) {
            list.insertItem(1, Byte.valueOf(b2));
        }
        return C2027c5.m10303k4((List<Byte>) list);
    }

    /* JADX INFO: renamed from: k4 */
    private static byte[] m11325k4(kk[] kkVarArr) {
        int iMo11331k4 = 0;
        for (kk kkVar : kkVarArr) {
            iMo11331k4 += (kkVar.mo11331k4() + 3) & (-4);
        }
        byte[] bArr = new byte[iMo11331k4];
        C2214ne c2214ne = new C2214ne(bArr);
        for (kk kkVar2 : kkVarArr) {
            kkVar2.mo11332k4(c2214ne);
            c2214ne.m11170k4(c2214ne.m11168k4() + (((kkVar2.mo11331k4() + 3) & (-4)) - kkVar2.mo11331k4()));
        }
        return bArr;
    }

    /* JADX INFO: renamed from: k4 */
    private byte[] m11326k4(short[] sArr) {
        List list = new List();
        int i = 0;
        while (i < sArr.length) {
            int[] iArr = {i};
            list.addRange(AbstractC14092to.m67254x1(AbstractC14092to.m67208k4((Object) m11324k4(iArr, sArr))));
            i = iArr[0];
        }
        return C2027c5.m10303k4((List<Byte>) list);
    }

    /* JADX INFO: renamed from: k4 */
    private kk[] m11327k4(int i) {
        kk[] kkVarArr = new kk[i];
        for (int i2 = 0; i2 < i; i2++) {
            short sM11673m9 = this.f7797to.m11673m9();
            kkVarArr[i2] = sM11673m9 < 0 ? m11317k4() : m11316k4(sM11673m9);
        }
        if (this.f7797to.m11670k4() != this.f7797to.m11675x1()) {
            throw new InvalidOperationException("Invalid length of glyph data array");
        }
        if (this.f7793du.m11670k4() != this.f7793du.m11675x1()) {
            throw new InvalidOperationException("Invalid length of glyph push data array");
        }
        if (this.f7794h4.m11670k4() != this.f7794h4.m11675x1()) {
            throw new InvalidOperationException("Invalid length of glyph instructions array");
        }
        this.f7797to.m11671k4(0);
        this.f7793du.m11671k4(0);
        this.f7794h4.m11671k4(0);
        return kkVarArr;
    }
}
