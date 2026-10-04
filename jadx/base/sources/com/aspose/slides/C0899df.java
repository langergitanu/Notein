package com.aspose.slides;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p077d8.C3068ks;
import com.aspose.slides.internal.p294n9.C6765kp;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.df */
/* JADX INFO: loaded from: classes3.dex */
final class C0899df {

    /* JADX INFO: renamed from: du */
    private long f4587du;

    /* JADX INFO: renamed from: dy */
    private boolean f4588dy;

    /* JADX INFO: renamed from: h4 */
    private long f4589h4;

    /* JADX INFO: renamed from: kk */
    String f4590kk;

    /* JADX INFO: renamed from: m9 */
    private long f4591m9;

    /* JADX INFO: renamed from: to */
    private byte f4592to;

    /* JADX INFO: renamed from: k4 */
    static final C3068ks f4585k4 = new C3068ks("*/", "+-", "+/", "?:", "abs", "at2", "cat2", "cos", "max", "min", "mod", "pin", "sat2", "sin", "sqrt", "tan", "val");

    /* JADX INFO: renamed from: x1 */
    static final int[] f4586x1 = {3, 3, 3, 3, 1, 2, 3, 2, 2, 2, 3, 3, 3, 2, 1, 2, 1};

    /* JADX INFO: renamed from: c5 */
    private static final C7017h4 f4584c5 = new C7017h4("*/", "+-", "+/", "?:", "abs", "at2", "cat2", "cos", "max", "min", "mod", "pin", "sat2", "sin", "sqrt", "tan", "val");

    public C0899df(String str, byte b, long j, long j2, long j3) {
        this.f4590kk = str;
        this.f4592to = b;
        this.f4587du = j;
        this.f4589h4 = j2;
        this.f4591m9 = j3;
    }

    /* JADX INFO: renamed from: k4 */
    private static long m5076k4(String str, Dictionary<String, Integer> dictionary, List<C0899df> list, int[] iArr) {
        int length = str.length();
        while (true) {
            int i = iArr[0];
            if (i >= length || str.charAt(i) != ' ') {
                break;
            }
            iArr[0] = iArr[0] + 1;
        }
        int i2 = iArr[0];
        while (true) {
            int i3 = iArr[0];
            if (i3 >= length || str.charAt(i3) == ' ') {
                break;
            }
            iArr[0] = iArr[0] + 1;
        }
        return C13760l2.m64252k4(C14113y2.m67443x1(str, i2, iArr[0] - i2), dictionary, list);
    }

    /* JADX INFO: renamed from: du */
    public final long m5078du() {
        return this.f4591m9;
    }

    /* JADX INFO: renamed from: h4 */
    public final byte m5079h4() {
        return this.f4592to;
    }

    /* JADX INFO: renamed from: kk */
    public final long m5083kk() {
        return this.f4587du;
    }

    /* JADX INFO: renamed from: to */
    public final long m5085to() {
        return this.f4589h4;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m5086x1(long j) {
        this.f4589h4 = j;
    }

    public C0899df(String str, byte b, long j, long j2, long j3, boolean z) {
        this(str, b, j, j2, j3);
        this.f4588dy = z;
    }

    /* JADX INFO: renamed from: k4 */
    public final String m5080k4() {
        return this.f4590kk;
    }

    /* JADX INFO: renamed from: kk */
    public final void m5084kk(long j) {
        this.f4591m9 = j;
    }

    /* JADX INFO: renamed from: x1 */
    public final boolean m5087x1() {
        return this.f4588dy;
    }

    public C0899df(String str, String str2, Dictionary<String, Integer> dictionary, List<C0899df> list) {
        this.f4590kk = str;
        byte[] bArr = {this.f4592to};
        long[] jArr = {this.f4587du};
        long[] jArr2 = {this.f4589h4};
        long[] jArr3 = {this.f4591m9};
        m5077k4(str2, dictionary, list, bArr, new int[]{0}, jArr, jArr2, jArr3);
        this.f4592to = bArr[0];
        this.f4587du = jArr[0];
        this.f4589h4 = jArr2[0];
        this.f4591m9 = jArr3[0];
    }

    /* JADX INFO: renamed from: k4 */
    public final String m5081k4(C0899df[] c0899dfArr, C13791lr[] c13791lrArr, String[] strArr) {
        C6765kp c6765kp = new C6765kp(32);
        switch (f4584c5.m27428k4(f4585k4.m12964k4(this.f4592to & 255))) {
            case 0:
                c6765kp.m26796k4("{0}*{1}/{2}", C13760l2.m64253k4(this.f4587du, c0899dfArr, c13791lrArr, strArr), C13760l2.m64253k4(this.f4589h4, c0899dfArr, c13791lrArr, strArr), C13760l2.m64253k4(this.f4591m9, c0899dfArr, c13791lrArr, strArr));
                break;
            case 1:
                c6765kp.m26796k4("{0}+{1}-{2}", C13760l2.m64253k4(this.f4587du, c0899dfArr, c13791lrArr, strArr), C13760l2.m64253k4(this.f4589h4, c0899dfArr, c13791lrArr, strArr), C13760l2.m64253k4(this.f4591m9, c0899dfArr, c13791lrArr, strArr));
                break;
            case 2:
                c6765kp.m26796k4("{0}+{1}/{2}", C13760l2.m64253k4(this.f4587du, c0899dfArr, c13791lrArr, strArr), C13760l2.m64253k4(this.f4589h4, c0899dfArr, c13791lrArr, strArr), C13760l2.m64253k4(this.f4591m9, c0899dfArr, c13791lrArr, strArr));
                break;
            case 3:
                c6765kp.m26796k4("if({0},{1},{2})", C13760l2.m64253k4(this.f4587du, c0899dfArr, c13791lrArr, strArr), C13760l2.m64253k4(this.f4589h4, c0899dfArr, c13791lrArr, strArr), C13760l2.m64253k4(this.f4591m9, c0899dfArr, c13791lrArr, strArr));
                break;
            case 4:
                c6765kp.m26796k4("abs({0})", C13760l2.m64253k4(this.f4587du, c0899dfArr, c13791lrArr, strArr));
                break;
            case 5:
                c6765kp.m26796k4("atan2({0},{1})", C13760l2.m64253k4(this.f4587du, c0899dfArr, c13791lrArr, strArr), C13760l2.m64253k4(this.f4589h4, c0899dfArr, c13791lrArr, strArr));
                break;
            case 6:
                c6765kp.m26796k4("{0}*(cos(atan({2} / {1}))", C13760l2.m64253k4(this.f4587du, c0899dfArr, c13791lrArr, strArr), C13760l2.m64253k4(this.f4589h4, c0899dfArr, c13791lrArr, strArr), C13760l2.m64253k4(this.f4591m9, c0899dfArr, c13791lrArr, strArr));
                break;
            case 7:
                c6765kp.m26796k4("{0}*cos({1})", C13760l2.m64253k4(this.f4587du, c0899dfArr, c13791lrArr, strArr), C13760l2.m64253k4(this.f4589h4, c0899dfArr, c13791lrArr, strArr));
                break;
            case 8:
                c6765kp.m26796k4("max({0},{1})", C13760l2.m64253k4(this.f4587du, c0899dfArr, c13791lrArr, strArr), C13760l2.m64253k4(this.f4589h4, c0899dfArr, c13791lrArr, strArr));
                break;
            case 9:
                c6765kp.m26796k4("min({0},{1})", C13760l2.m64253k4(this.f4587du, c0899dfArr, c13791lrArr, strArr), C13760l2.m64253k4(this.f4589h4, c0899dfArr, c13791lrArr, strArr));
                break;
            case 10:
                c6765kp.m26796k4("sqrt({0}*{0} + {1}{1} + {2}{2})", C13760l2.m64253k4(this.f4587du, c0899dfArr, c13791lrArr, strArr), C13760l2.m64253k4(this.f4589h4, c0899dfArr, c13791lrArr, strArr), C13760l2.m64253k4(this.f4591m9, c0899dfArr, c13791lrArr, strArr));
                break;
            case 11:
                c6765kp.m26796k4("if({0},{1},{2})", C13760l2.m64253k4(this.f4587du, c0899dfArr, c13791lrArr, strArr), C13760l2.m64253k4(this.f4589h4, c0899dfArr, c13791lrArr, strArr), C13760l2.m64253k4(this.f4591m9, c0899dfArr, c13791lrArr, strArr));
                break;
            case 12:
                c6765kp.m26796k4("{0}*(sin(atan({2} / {1}))", C13760l2.m64253k4(this.f4587du, c0899dfArr, c13791lrArr, strArr), C13760l2.m64253k4(this.f4589h4, c0899dfArr, c13791lrArr, strArr), C13760l2.m64253k4(this.f4591m9, c0899dfArr, c13791lrArr, strArr));
                break;
            case 13:
                c6765kp.m26796k4("{0}*sin({1})", C13760l2.m64253k4(this.f4587du, c0899dfArr, c13791lrArr, strArr), C13760l2.m64253k4(this.f4589h4, c0899dfArr, c13791lrArr, strArr));
                break;
            case 14:
                c6765kp.m26796k4("sqrt({0})", C13760l2.m64253k4(this.f4587du, c0899dfArr, c13791lrArr, strArr));
                break;
            case 15:
                c6765kp.m26796k4("{0}*tan({1})", C13760l2.m64253k4(this.f4587du, c0899dfArr, c13791lrArr, strArr), C13760l2.m64253k4(this.f4589h4, c0899dfArr, c13791lrArr, strArr));
                break;
            case 16:
                c6765kp.m26796k4("{0}", C13760l2.m64253k4(this.f4587du, c0899dfArr, c13791lrArr, strArr));
                break;
            default:
                c6765kp.m26792k4("0");
                break;
        }
        return c6765kp.toString();
    }

    /* JADX INFO: renamed from: k4 */
    public final void m5082k4(long j) {
        this.f4587du = j;
    }

    /* JADX INFO: renamed from: k4 */
    public static void m5077k4(String str, Dictionary<String, Integer> dictionary, List<C0899df> list, byte[] bArr, int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        int length = str.length();
        int i = 0;
        while (i < length && str.charAt(i) != ' ') {
            i++;
        }
        int iM12963k4 = f4585k4.m12963k4(C14113y2.m67443x1(str, 0, i));
        bArr[0] = (byte) iM12963k4;
        iArr[0] = f4586x1[iM12963k4];
        int[] iArr2 = {i};
        jArr[0] = m5076k4(str, dictionary, list, iArr2);
        int i2 = iArr2[0];
        if (iArr[0] <= 1) {
            jArr3[0] = 0;
            jArr2[0] = 0;
            return;
        }
        iArr2[0] = i2;
        jArr2[0] = m5076k4(str, dictionary, list, iArr2);
        int i3 = iArr2[0];
        if (iArr[0] <= 2) {
            jArr3[0] = 0;
        } else {
            iArr2[0] = i3;
            jArr3[0] = m5076k4(str, dictionary, list, iArr2);
        }
    }
}
