package com.aspose.slides.internal.p322oo;

import com.aspose.slides.internal.p135fp.C4095jd;
import com.aspose.slides.internal.p135fp.C4103to;
import com.aspose.slides.internal.p135fp.C4108v4;
import com.aspose.slides.internal.p135fp.C4111x6;
import com.aspose.slides.internal.p135fp.C4112yj;
import com.aspose.slides.internal.p225ke.C5666m9;
import com.aspose.slides.internal.p225ke.C5667to;

/* JADX INFO: renamed from: com.aspose.slides.internal.oo.k4 */
/* JADX INFO: loaded from: classes4.dex */
public class C7128k4 {

    /* JADX INFO: renamed from: k4 */
    private final C4112yj f19234k4;

    /* JADX INFO: renamed from: x1 */
    private final int[][] f19236x1 = new int[4][];

    /* JADX INFO: renamed from: kk */
    private final C4108v4[] f19235kk = new C4108v4[10];

    public C7128k4(C4112yj c4112yj) {
        this.f19234k4 = c4112yj;
        for (int i = 0; i < 4; i++) {
            this.f19236x1[i] = null;
        }
    }

    /* JADX INFO: renamed from: k4 */
    public void m27671k4() {
        int i = 0;
        for (int i2 = 0; i2 < this.f19234k4.m16453du().m16362x1().length; i2++) {
            C4095jd c4095jd = this.f19234k4.m16453du().m16362x1()[i2];
            byte bM16311ck = c4095jd.m16311ck();
            C4108v4 c4108v4 = this.f19234k4.m16455h4().get_Item(Byte.valueOf(bM16311ck));
            int[][] iArr = this.f19236x1;
            int i3 = bM16311ck & 255;
            if (iArr[i3] == null) {
                iArr[i3] = new int[C5667to.f15654k4];
                for (int i4 = 0; i4 < C5667to.f15654k4; i4++) {
                    this.f19236x1[i3][i4] = (c4108v4.f11261x1[i4] & 65535) << 3;
                }
            }
            for (int i5 = 0; i5 < (c4095jd.m16329to() & 255); i5++) {
                for (int i6 = 0; i6 < (c4095jd.m16316fa() & 255); i6++) {
                    this.f19235kk[i] = c4108v4;
                    i++;
                }
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    private static int[] m27670k4(int[] iArr) {
        int i;
        int i2 = 7;
        int i3 = 0;
        while (true) {
            i = 2;
            if (i2 < 0) {
                break;
            }
            int i4 = iArr[i3];
            int i5 = i3 + 7;
            int i6 = iArr[i5];
            int i7 = i4 + i6;
            int i8 = i4 - i6;
            int i9 = i3 + 1;
            int i10 = iArr[i9];
            int i11 = i3 + 6;
            int i12 = iArr[i11];
            int i13 = i10 + i12;
            int i14 = i10 - i12;
            int i15 = i3 + 2;
            int i16 = iArr[i15];
            int i17 = i3 + 5;
            int i18 = iArr[i17];
            int i19 = i16 + i18;
            int i20 = i16 - i18;
            int i21 = i3 + 3;
            int i22 = iArr[i21];
            int i23 = i3 + 4;
            int i24 = iArr[i23];
            int i25 = i22 + i24;
            int i26 = i22 - i24;
            int i27 = i7 + i25;
            int i28 = i7 - i25;
            int i29 = i13 + i19;
            int i30 = i13 - i19;
            iArr[i3] = (i27 + i29) << 2;
            iArr[i23] = (i27 - i29) << 2;
            int i31 = (i30 + i28) * 4433;
            iArr[i15] = C5666m9.m23127k4((i28 * 6270) + i31, 11);
            iArr[i11] = C5666m9.m23127k4((i30 * (-15137)) + i31, 11);
            int i32 = i26 + i14;
            int i33 = i20 + i8;
            int i34 = (i32 + i33) * 9633;
            int i35 = (i26 + i8) * (-7373);
            int i36 = (i20 + i14) * (-20995);
            int i37 = (i32 * (-16069)) + i34;
            int i38 = (i33 * (-3196)) + i34;
            iArr[i5] = C5666m9.m23127k4((i26 * 2446) + i35 + i37, 11);
            iArr[i17] = C5666m9.m23127k4((i20 * 16819) + i36 + i38, 11);
            iArr[i21] = C5666m9.m23127k4((i14 * 25172) + i36 + i37, 11);
            iArr[i9] = C5666m9.m23127k4((i8 * 12299) + i35 + i38, 11);
            i3 += 8;
            i2--;
        }
        int i39 = 0;
        int i40 = 7;
        while (i40 >= 0) {
            int i41 = iArr[i39];
            int i42 = i39 + 56;
            int i43 = iArr[i42];
            int i44 = i41 + i43;
            int i45 = i41 - i43;
            int i46 = i39 + 8;
            int i47 = iArr[i46];
            int i48 = i39 + 48;
            int i49 = iArr[i48];
            int i50 = i47 + i49;
            int i51 = i47 - i49;
            int i52 = i39 + 16;
            int i53 = iArr[i52];
            int i54 = i39 + 40;
            int i55 = iArr[i54];
            int i56 = i53 + i55;
            int i57 = i53 - i55;
            int i58 = i39 + 24;
            int i59 = iArr[i58];
            int i60 = i39 + 32;
            int i61 = iArr[i60];
            int i62 = i59 + i61;
            int i63 = i59 - i61;
            int i64 = i44 + i62;
            int i65 = i44 - i62;
            int i66 = i50 + i56;
            int i67 = i50 - i56;
            iArr[i39] = C5666m9.m23127k4(i64 + i66, i);
            iArr[i60] = C5666m9.m23127k4(i64 - i66, i);
            int i68 = (i67 + i65) * 4433;
            iArr[i52] = C5666m9.m23127k4((i65 * 6270) + i68, 15);
            iArr[i48] = C5666m9.m23127k4((i67 * (-15137)) + i68, 15);
            int i69 = i63 + i51;
            int i70 = i57 + i45;
            int i71 = (i69 + i70) * 9633;
            int i72 = (i63 + i45) * (-7373);
            int i73 = (i57 + i51) * (-20995);
            int i74 = (i69 * (-16069)) + i71;
            int i75 = (i70 * (-3196)) + i71;
            iArr[i42] = C5666m9.m23127k4((i63 * 2446) + i72 + i74, 15);
            iArr[i54] = C5666m9.m23127k4((i57 * 16819) + i73 + i75, 15);
            iArr[i58] = C5666m9.m23127k4((i51 * 25172) + i73 + i74, 15);
            iArr[i46] = C5666m9.m23127k4((i45 * 12299) + i72 + i75, 15);
            i39++;
            i40--;
            i = 2;
        }
        return iArr;
    }

    /* JADX INFO: renamed from: k4 */
    public C4103to[] m27672k4(C4111x6 c4111x6) {
        int i;
        for (int i2 = 0; i2 < c4111x6.m16451k4().length; i2++) {
            int[] iArr = new int[C5667to.f15654k4];
            for (int i3 = 0; i3 < C5667to.f15654k4; i3++) {
                iArr[i3] = c4111x6.m16451k4()[i2].m16394k4()[i3] - 128;
            }
            int[] iArrM27670k4 = m27670k4(iArr);
            for (int i4 = 0; i4 < C5667to.f15654k4; i4++) {
                int i5 = this.f19236x1[this.f19235kk[i2].m16434x1() & 255][i4];
                int i6 = iArrM27670k4[i4];
                if (i6 < 0) {
                    int i7 = (-i6) + (i5 >> 1);
                    i = -(i7 >= i5 ? i7 / i5 : 0);
                } else {
                    int i8 = i6 + (i5 >> 1);
                    i = i8 >= i5 ? i8 / i5 : 0;
                }
                c4111x6.m16451k4()[i2].m16394k4()[i4] = (short) i;
            }
        }
        return c4111x6.m16451k4();
    }
}
