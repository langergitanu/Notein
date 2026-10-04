package com.aspose.slides.internal.p076d6;

import com.aspose.slides.PatternStyle;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.internal.p174hz.AbstractC4715g8;
import com.aspose.slides.internal.p174hz.AbstractC4720he;
import com.aspose.slides.internal.p174hz.AbstractC4745rv;
import com.aspose.slides.internal.p174hz.C4773yd;
import com.aspose.slides.internal.p294n9.AbstractC6747ar;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p463vm.C11697x1;
import com.aspose.slides.internal.p525yi.AbstractC12835to;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.C14058fa;
import com.aspose.slides.p559ms.System.C14069jd;
import com.aspose.slides.p559ms.System.C14084qq;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.C14116yg;
import com.google.common.primitives.SignedBytes;

/* JADX INFO: renamed from: com.aspose.slides.internal.d6.x1 */
/* JADX INFO: loaded from: classes3.dex */
public class C3031x1 {

    /* JADX INFO: renamed from: k4 */
    private static byte[] f8881k4 = {75, 71, 83, 33, SignedBytes.MAX_POWER_OF_TWO, 35, 36, 37};

    /* JADX INFO: renamed from: x1 */
    private static byte[] f8882x1 = {-86, -45, -76, PatternStyle.UpwardDiagonal, -75, 20, 4, -18};

    /* JADX INFO: renamed from: k4 */
    public static void m12761k4(C3026h4 c3026h4, int i, String str, String str2, String str3, byte[][] bArr, byte[][] bArr2) {
        bArr[0] = null;
        if (i == 0) {
            bArr[0] = m12766k4(str2, c3026h4.m12740to());
            bArr2[0] = m12769x1(str2, c3026h4.m12740to());
            return;
        }
        if (i == 1) {
            if ((c3026h4.m12749k4() & 524288) != 0) {
                m12762k4(str2, c3026h4.m12740to(), bArr, bArr2);
                return;
            } else {
                bArr[0] = m12766k4(str2, c3026h4.m12740to());
                bArr2[0] = m12769x1(str2, c3026h4.m12740to());
                return;
            }
        }
        if (i != 2) {
            if (i != 3) {
                throw new InvalidOperationException();
            }
            bArr2[0] = m12763k4(c3026h4, str, str2, str3);
        } else {
            int iM12749k4 = c3026h4.m12749k4() & 524288;
            byte[] bArrM12740to = c3026h4.m12740to();
            if (iM12749k4 != 0) {
                m12762k4(str2, bArrM12740to, bArr, bArr2);
            } else {
                bArr2[0] = m12769x1(str2, bArrM12740to);
            }
        }
    }

    /* JADX INFO: renamed from: x1 */
    public static byte[] m12769x1(String str, byte[] bArr) {
        return m12768k4(bArr, m12764k4(str));
    }

    /* JADX INFO: renamed from: k4 */
    public static void m12762k4(String str, byte[] bArr, byte[][] bArr2, byte[][] bArr3) {
        byte[] bArr4 = new byte[8];
        AbstractC4720he.m19622k4().mo19624k4(bArr4);
        int length = bArr.length + 8;
        byte[] bArr5 = new byte[length];
        AbstractC14092to.m67208k4((Object) bArr).copyTo(AbstractC14092to.m67208k4((Object) bArr5), 0);
        AbstractC14092to.m67208k4((Object) bArr4).copyTo(AbstractC14092to.m67208k4((Object) bArr5), bArr.length);
        bArr2[0] = new byte[24];
        AbstractC14092to.m67208k4((Object) bArr4).copyTo(AbstractC14092to.m67208k4((Object) bArr2[0]), 0);
        byte[] bArrM19588x1 = AbstractC4715g8.m19610du().m19588x1(bArr5);
        byte[] bArr6 = new byte[8];
        AbstractC14092to.m67227k4(bArrM19588x1, bArr6, 8);
        bArr3[0] = m12769x1(str, bArr6);
        AbstractC14092to.m67225k4(bArr4, 0, 8);
        AbstractC14092to.m67225k4(bArr5, 0, length);
        AbstractC14092to.m67225k4(bArr6, 0, 8);
        AbstractC14092to.m67225k4(bArrM19588x1, 0, bArrM19588x1.length);
    }

    /* JADX INFO: renamed from: k4 */
    public static byte[] m12763k4(C3026h4 c3026h4, String str, String str2, String str3) {
        byte[] bArrM12764k4 = m12764k4(str2);
        byte[] bArrMo26677to = AbstractC6747ar.m26643rv().mo26677to(C14113y2.m67371jd(str));
        byte[] bArrMo26677to2 = AbstractC6747ar.m26643rv().mo26677to(str3);
        byte[] bArr = new byte[bArrMo26677to.length + bArrMo26677to2.length];
        AbstractC14092to.m67208k4((Object) bArrMo26677to).copyTo(AbstractC14092to.m67208k4((Object) bArr), 0);
        AbstractC14092to.m67226k4(bArrMo26677to2, 0, bArr, bArrMo26677to.length, bArrMo26677to2.length);
        C4773yd c4773yd = new C4773yd(bArrM12764k4);
        byte[] bArrM19588x1 = c4773yd.m19588x1(bArr);
        AbstractC14092to.m67225k4(bArrM12764k4, 0, bArrM12764k4.length);
        c4773yd.m19583ck();
        C4773yd c4773yd2 = new C4773yd(bArrM19588x1);
        long jM67130fa = C14084qq.m67081jd().Clone().m67130fa() - 504911232000000000L;
        byte[] bArr2 = new byte[8];
        AbstractC4720he.m19622k4().mo19624k4(bArr2);
        int length = c3026h4.m12739h4().length + 28;
        byte[] bArr3 = new byte[length];
        bArr3[0] = 1;
        bArr3[1] = 1;
        C14058fa.m66596k4(C14069jd.m66786x1(jM67130fa), 0, bArr3, 8, 8);
        C14058fa.m66596k4(bArr2, 0, bArr3, 16, 8);
        C14058fa.m66596k4(c3026h4.m12739h4(), 0, bArr3, 28, c3026h4.m12739h4().length);
        byte[] bArrM12740to = c3026h4.m12740to();
        int length2 = bArrM12740to.length + length;
        byte[] bArr4 = new byte[length2];
        AbstractC14092to.m67208k4((Object) bArrM12740to).copyTo(AbstractC14092to.m67208k4((Object) bArr4), 0);
        AbstractC14092to.m67208k4((Object) bArr3).copyTo(AbstractC14092to.m67208k4((Object) bArr4), bArrM12740to.length);
        byte[] bArrM19588x12 = c4773yd2.m19588x1(bArr4);
        byte[] bArr5 = new byte[bArrM19588x12.length + length];
        AbstractC14092to.m67208k4((Object) bArrM19588x12).copyTo(AbstractC14092to.m67208k4((Object) bArr5), 0);
        AbstractC14092to.m67208k4((Object) bArr3).copyTo(AbstractC14092to.m67208k4((Object) bArr5), bArrM19588x12.length);
        AbstractC14092to.m67225k4(bArrM19588x1, 0, bArrM19588x1.length);
        c4773yd2.m19583ck();
        AbstractC14092to.m67225k4(bArr2, 0, 8);
        AbstractC14092to.m67225k4(bArr3, 0, length);
        AbstractC14092to.m67225k4(bArr4, 0, length2);
        AbstractC14092to.m67225k4(bArrM19588x12, 0, bArrM19588x12.length);
        return bArr5;
    }

    /* JADX INFO: renamed from: k4 */
    public static byte[] m12764k4(String str) {
        byte[] bArr = new byte[21];
        AbstractC12835to abstractC12835toM59678du = AbstractC12835to.m59678du();
        byte[] bArrMo26677to = str == null ? new byte[0] : AbstractC6747ar.m26643rv().mo26677to(str);
        byte[] bArrM19588x1 = abstractC12835toM59678du.m19588x1(bArrMo26677to);
        C14058fa.m66596k4(bArrM19588x1, 0, bArr, 0, 16);
        AbstractC14092to.m67225k4(bArrMo26677to, 0, bArrMo26677to.length);
        AbstractC14092to.m67225k4(bArrM19588x1, 0, bArrM19588x1.length);
        return bArr;
    }

    /* JADX INFO: renamed from: k4 */
    public static byte[] m12765k4(String str, int i) {
        byte[] bArr = new byte[7];
        AbstractC6747ar.m26650yj().mo26659k4(C14113y2.m67444x1(str, C11697x1.m55252to()), i, C14116yg.m67507x1(str.length() - i, 7), bArr, 0);
        byte[] bArrM12767k4 = m12767k4(bArr, 0);
        AbstractC14092to.m67225k4(bArr, 0, 7);
        return bArrM12767k4;
    }

    /* JADX INFO: renamed from: k4 */
    public static byte[] m12766k4(String str, byte[] bArr) {
        byte[] bArr2 = new byte[21];
        AbstractC4745rv abstractC4745rvM19718kk = AbstractC4745rv.m19718kk();
        abstractC4745rvM19718kk.m19687kk(2);
        if (str == null || str.length() < 1) {
            C14058fa.m66596k4(f8882x1, 0, bArr2, 0, 8);
        } else {
            abstractC4745rvM19718kk.mo19688kk(m12765k4(str, 0));
            abstractC4745rvM19718kk.m19689ks().mo19562k4(f8881k4, 0, 8, bArr2, 0);
        }
        if (str == null || str.length() < 8) {
            C14058fa.m66596k4(f8882x1, 0, bArr2, 8, 8);
        } else {
            abstractC4745rvM19718kk.mo19688kk(m12765k4(str, 7));
            abstractC4745rvM19718kk.m19689ks().mo19562k4(f8881k4, 0, 8, bArr2, 8);
        }
        abstractC4745rvM19718kk.m19690m9();
        return m12768k4(bArr, bArr2);
    }

    /* JADX INFO: renamed from: k4 */
    public static byte[] m12767k4(byte[] bArr, int i) {
        byte b = bArr[i];
        int i2 = i + 1;
        int i3 = i + 2;
        int i4 = i + 3;
        int i5 = i + 4;
        int i6 = i + 5;
        int i7 = i + 6;
        return new byte[]{b, C7019kk.m27442k4(Integer.valueOf((C7019kk.m27462to(Byte.valueOf(b), 6) << 7) | (C7019kk.m27462to(Byte.valueOf(bArr[i2]), 6) >> 1)), 9), C7019kk.m27442k4(Integer.valueOf((C7019kk.m27462to(Byte.valueOf(bArr[i2]), 6) << 6) | (C7019kk.m27462to(Byte.valueOf(bArr[i3]), 6) >> 2)), 9), C7019kk.m27442k4(Integer.valueOf((C7019kk.m27462to(Byte.valueOf(bArr[i3]), 6) << 5) | (C7019kk.m27462to(Byte.valueOf(bArr[i4]), 6) >> 3)), 9), C7019kk.m27442k4(Integer.valueOf((C7019kk.m27462to(Byte.valueOf(bArr[i4]), 6) << 4) | (C7019kk.m27462to(Byte.valueOf(bArr[i5]), 6) >> 4)), 9), C7019kk.m27442k4(Integer.valueOf((C7019kk.m27462to(Byte.valueOf(bArr[i5]), 6) << 3) | (C7019kk.m27462to(Byte.valueOf(bArr[i6]), 6) >> 5)), 9), C7019kk.m27442k4(Integer.valueOf((C7019kk.m27462to(Byte.valueOf(bArr[i7]), 6) >> 6) | (C7019kk.m27462to(Byte.valueOf(bArr[i6]), 6) << 2)), 9), C7019kk.m27442k4(Integer.valueOf(C7019kk.m27462to(Byte.valueOf(bArr[i7]), 6) << 1), 9)};
    }

    /* JADX INFO: renamed from: k4 */
    public static byte[] m12768k4(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = new byte[24];
        AbstractC4745rv abstractC4745rvM19718kk = AbstractC4745rv.m19718kk();
        abstractC4745rvM19718kk.m19687kk(2);
        abstractC4745rvM19718kk.mo19688kk(m12767k4(bArr2, 0));
        abstractC4745rvM19718kk.m19689ks().mo19562k4(bArr, 0, 8, bArr3, 0);
        abstractC4745rvM19718kk.mo19688kk(m12767k4(bArr2, 7));
        abstractC4745rvM19718kk.m19689ks().mo19562k4(bArr, 0, 8, bArr3, 8);
        abstractC4745rvM19718kk.mo19688kk(m12767k4(bArr2, 14));
        abstractC4745rvM19718kk.m19689ks().mo19562k4(bArr, 0, 8, bArr3, 16);
        return bArr3;
    }
}
