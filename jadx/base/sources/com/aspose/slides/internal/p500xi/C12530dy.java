package com.aspose.slides.internal.p500xi;

import Oooo0.C20855OooooOO;
import androidx.datastore.preferences.protobuf.C21791OooO0o0;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.exceptions.NotImplementedException;
import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.aspose.slides.internal.p132fj.C4047sv;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p353q7.C9763ck;
import com.aspose.slides.internal.p353q7.C9790ts;
import com.aspose.slides.internal.p475wh.AbstractC12008jd;
import com.aspose.slides.internal.p475wh.C12004dy;
import com.aspose.slides.internal.p475wh.C12007ix;
import com.aspose.slides.internal.p475wh.C12013m9;
import com.aspose.slides.internal.p475wh.C12014ne;
import com.aspose.slides.internal.p475wh.C12015qq;
import com.aspose.slides.internal.p475wh.C12017to;
import com.aspose.slides.internal.p475wh.C12018u4;
import com.aspose.slides.internal.p475wh.C12019um;
import com.aspose.slides.internal.p475wh.C12025x6;
import com.aspose.slides.internal.p488x0.C12348um;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.C14116yg;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.xi.dy */
/* JADX INFO: loaded from: classes5.dex */
public class C12530dy {
    /* JADX INFO: renamed from: k4 */
    public static float m58325k4(C12025x6 c12025x6, String str, C12013m9 c12013m9, int i, float f) {
        float f2;
        float fM56895kk = c12025x6.m56895kk();
        C12004dy c12004dyM56651x1 = c12013m9.m56651x1();
        int iM56642jd = c12013m9.m56642jd();
        float fM56526du = c12004dyM56651x1.m56526du(iM56642jd);
        float fM56638du = c12013m9.m56638du() / fM56526du;
        int iM56536x1 = c12004dyM56651x1.m56536x1(iM56642jd);
        int iM56532kk = c12004dyM56651x1.m56532kk(iM56642jd);
        C9790ts c9790tsMo48031k4 = C9763ck.m48030to().mo48031k4(c12013m9.m56648m9(), c12013m9.m56642jd());
        if (c9790tsMo48031k4 != null) {
            fM56895kk = C20855OooooOO.OooO00o(c9790tsMo48031k4.m48191jd() - iM56536x1, c12013m9.m56638du(), fM56526du, fM56895kk);
            iM56536x1 = c9790tsMo48031k4.m48191jd();
            iM56532kk = c9790tsMo48031k4.m48177ck();
        }
        int i2 = iM56532kk + iM56536x1;
        if ((i & 24) == 24) {
            f2 = iM56536x1;
        } else {
            if ((i & 8) != 8) {
                return fM56895kk;
            }
            f2 = i2;
        }
        return fM56895kk - (f2 * fM56638du);
    }

    /* JADX INFO: renamed from: x1 */
    public static C12025x6 m58337x1(C12025x6 c12025x6, String str, C12013m9 c12013m9, AbstractC12008jd abstractC12008jd, int i, float f) {
        return new C12025x6(m58326k4(c12025x6.Clone(), str, c12013m9, abstractC12008jd, i, f), m58325k4(c12025x6.Clone(), str, c12013m9, i, f));
    }

    /* JADX INFO: renamed from: k4 */
    public static float m58326k4(C12025x6 c12025x6, String str, C12013m9 c12013m9, AbstractC12008jd abstractC12008jd, int i, float f) {
        float fM56897x1 = c12025x6.m56897x1();
        float fM58327k4 = m58327k4(str, abstractC12008jd, c12013m9) * f;
        return (i & 6) == 6 ? fM56897x1 - (fM58327k4 / 2.0f) : (i & 2) == 2 ? fM56897x1 - fM58327k4 : fM56897x1;
    }

    /* JADX INFO: renamed from: k4 */
    private static float m58327k4(String str, AbstractC12008jd abstractC12008jd, C12013m9 c12013m9) {
        if (C14113y2.m67411k4(str)) {
            return 0.0f;
        }
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != 8203) {
                C12019um c12019um = new C12019um(C12019um.m56799c5());
                c12019um.m56817kk(c12019um.m56816kk() | 2048);
                c12019um.m56814k4(new C12017to[]{new C12017to(0, str.length())});
                C12018u4[] c12018u4ArrMo17558k4 = abstractC12008jd.mo17558k4(str, c12013m9, C12007ix.m56544k4(C12014ne.f40546k4).Clone(), c12019um);
                if (c12018u4ArrMo17558k4.length <= 0) {
                    return 0.0f;
                }
                C12007ix c12007ixClone = c12018u4ArrMo17558k4[0].m56749k4(abstractC12008jd).Clone();
                if (c12007ixClone.m56570m9().m56696k4()) {
                    C12015qq c12015qqClone = abstractC12008jd.mo17490k4(str, c12013m9, new C12025x6(), c12019um).Clone();
                    if (c12015qqClone.m56696k4()) {
                        throw new NotImplementedException();
                    }
                    c12007ixClone.m56576x1(c12015qqClone.m56699x1());
                }
                return c12007ixClone.m56550c5();
            }
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: k4 */
    public static long m58328k4(long j, long j2, byte b) {
        int i = (int) (j2 & 255);
        int i2 = b & 255;
        int i3 = (int) (j2 & 65280);
        int i4 = (int) (((j2 & 4294967295L) >> 16) & 255);
        return ((((((long) (((((((int) (j & 65280)) - i3) * i2) / 255) + i3) & 65280)) & 4294967295L) | (((((long) C21791OooO0o0.OooO00o(((int) (j & 255)) - i, i2, 255, i)) & 4294967295L) | 4278190080L) & 4294967295L)) & 4294967295L) | (((long) (((((((int) (((j & 4294967295L) >> 16) & 255)) - i4) * i2) / 255) + i4) << 16)) & 4294967295L)) & 4294967295L;
    }

    /* JADX INFO: renamed from: k4 */
    public static C12348um m58329k4(C12348um c12348um) {
        return new C12348um(C7019kk.m27435du(Double.valueOf(C14116yg.m67497to(((c12348um.m57816k4() & 4294967295L) / 72.0f) * 25.4f)), 14), C7019kk.m27435du(Double.valueOf(C14116yg.m67497to(((4294967295L & c12348um.m57820x1()) / 72.0f) * 25.4f)), 14));
    }

    /* JADX INFO: renamed from: k4 */
    public static boolean m58330k4(byte[] bArr, byte[] bArr2) {
        if (bArr == bArr2) {
            return true;
        }
        if (bArr == null || bArr2 == null || bArr.length != bArr2.length) {
            return false;
        }
        for (int i = 0; i < bArr.length; i++) {
            if (bArr[i] != bArr2[i]) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: k4 */
    public static boolean m58331k4(float[] fArr, float[] fArr2) {
        if (fArr == fArr2) {
            return true;
        }
        if (fArr == null || fArr2 == null || fArr.length != fArr2.length) {
            return false;
        }
        for (int i = 0; i < fArr.length; i++) {
            if (fArr[i] != fArr2[i]) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: k4 */
    public static boolean m58332k4(int[] iArr, int[] iArr2) {
        if (iArr == iArr2) {
            return true;
        }
        if (iArr == null || iArr2 == null || iArr.length != iArr2.length) {
            return false;
        }
        for (int i = 0; i < iArr.length; i++) {
            if (iArr[i] != iArr2[i]) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: k4 */
    public static boolean m58333k4(long[] jArr, long[] jArr2) {
        if (jArr == jArr2) {
            return true;
        }
        if (jArr == null || jArr2 == null || jArr.length != jArr2.length) {
            return false;
        }
        for (int i = 0; i < jArr.length; i++) {
            if (jArr[i] != jArr2[i]) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: k4 */
    public static <T> boolean m58334k4(T[] tArr, T[] tArr2) {
        if (tArr == tArr2) {
            return true;
        }
        if (tArr == null || tArr2 == null || tArr.length != tArr2.length) {
            return false;
        }
        for (int i = 0; i < tArr.length; i++) {
            if (!tArr[i].equals(tArr2[i])) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: k4 */
    public static boolean m58335k4(short[] sArr, short[] sArr2) {
        if (sArr == sArr2) {
            return true;
        }
        if (sArr == null || sArr2 == null || sArr.length != sArr2.length) {
            return false;
        }
        for (int i = 0; i < sArr.length; i++) {
            if (sArr[i] != sArr2[i]) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0034, code lost:
    
        r6 = ((com.aspose.slides.internal.p543z9.C13474jd) r5).m62659x1();
     */
    /* JADX WARN: Finally extract failed */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static byte[] m58336k4(AbstractC3150x6 abstractC3150x6) {
        long position = abstractC3150x6.getPosition();
        try {
            abstractC3150x6.setPosition(0L);
            AbstractC12536x1 abstractC12536x1M58363k4 = AbstractC12536x1.m58363k4(abstractC3150x6);
            try {
                byte[] bArrM62659x1 = null;
                if (abstractC12536x1M58363k4.mo13625x1() == 1) {
                    IGenericEnumerator<C12535to> it = abstractC12536x1M58363k4.m58364k4().iterator();
                    while (true) {
                        try {
                            if (!it.hasNext()) {
                                break;
                            }
                            C4047sv c4047sv = (C4047sv) it.next();
                            if (c4047sv.m16063ks() == 65535) {
                                break;
                            }
                        } catch (Throwable th) {
                            if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                                it.dispose();
                            }
                            throw th;
                        }
                    }
                    if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                        it.dispose();
                    }
                }
                abstractC12536x1M58363k4.dispose();
                return bArrM62659x1;
            } catch (Throwable th2) {
                if (abstractC12536x1M58363k4 != null) {
                    abstractC12536x1M58363k4.dispose();
                }
                throw th2;
            }
        } finally {
            abstractC3150x6.setPosition(position);
        }
    }
}
