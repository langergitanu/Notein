package com.aspose.slides.internal.p511xu;

import com.aspose.slides.internal.p135fp.C4106up;
import com.aspose.slides.internal.p225ke.C5666m9;
import com.aspose.slides.internal.p225ke.C5667to;
import com.aspose.slides.internal.p381rm.C10019k4;

/* JADX INFO: renamed from: com.aspose.slides.internal.xu.to */
/* JADX INFO: loaded from: classes5.dex */
public class C12677to extends AbstractC12675k4 {
    public C12677to(C4106up c4106up) {
        super(c4106up);
    }

    @Override // com.aspose.slides.internal.p511xu.InterfaceC12676kk
    /* JADX INFO: renamed from: k4 */
    public byte[] mo58826k4(short[] sArr, int i) {
        byte[] bArr;
        int[] iArr;
        byte[] bArr2;
        int[] iArr2;
        int i2;
        C12677to c12677to = this;
        int i3 = C5667to.f15654k4;
        byte[] bArr3 = new byte[i3];
        int[] iArr3 = new int[i3];
        int[] iArr4 = c12677to.f42151k4.get_Item(Integer.valueOf(i)).f42153k4;
        int i4 = 8;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        while (i4 > 0) {
            int i8 = i5 + 8;
            if (sArr[i8] == 0 && sArr[i5 + 16] == 0 && sArr[i5 + 24] == 0 && sArr[i5 + 32] == 0 && sArr[i5 + 40] == 0 && sArr[i5 + 48] == 0 && sArr[i5 + 56] == 0) {
                int iM58825k4 = c12677to.m58825k4(sArr[i5], iArr4[i6]) << 2;
                iArr3[i7] = iM58825k4;
                iArr3[i7 + 8] = iM58825k4;
                iArr3[i7 + 16] = iM58825k4;
                iArr3[i7 + 24] = iM58825k4;
                iArr3[i7 + 32] = iM58825k4;
                iArr3[i7 + 40] = iM58825k4;
                iArr3[i7 + 48] = iM58825k4;
                iArr3[i7 + 56] = iM58825k4;
                i5++;
                i6++;
                i7++;
                iArr = iArr3;
                bArr2 = bArr3;
                iArr2 = iArr4;
                i2 = i4;
            } else {
                int iM58825k42 = c12677to.m58825k4(sArr[i5 + 16], iArr4[i6 + 16]);
                int iM58825k43 = c12677to.m58825k4(sArr[i5 + 48], iArr4[i6 + 48]);
                int i9 = (iM58825k42 + iM58825k43) * 4433;
                int i10 = (iM58825k43 * (-15137)) + i9;
                int i11 = (iM58825k42 * 6270) + i9;
                int iM58825k44 = c12677to.m58825k4(sArr[i5], iArr4[i6]);
                int iM58825k45 = c12677to.m58825k4(sArr[i5 + 32], iArr4[i6 + 32]);
                int i12 = (iM58825k44 + iM58825k45) << 13;
                int i13 = (iM58825k44 - iM58825k45) << 13;
                int i14 = i12 + i11;
                int i15 = i12 - i11;
                int i16 = i13 + i10;
                int i17 = i13 - i10;
                int iM58825k46 = c12677to.m58825k4(sArr[i5 + 56], iArr4[i6 + 56]);
                int iM58825k47 = c12677to.m58825k4(sArr[i5 + 40], iArr4[i6 + 40]);
                iArr = iArr3;
                int iM58825k48 = c12677to.m58825k4(sArr[i5 + 24], iArr4[i6 + 24]);
                int iM58825k49 = c12677to.m58825k4(sArr[i8], iArr4[i6 + 8]);
                bArr2 = bArr3;
                int i18 = iM58825k46 + iM58825k48;
                iArr2 = iArr4;
                int i19 = iM58825k47 + iM58825k49;
                i2 = i4;
                int i20 = (i18 + i19) * 9633;
                int i21 = (iM58825k46 + iM58825k49) * (-7373);
                int i22 = (iM58825k47 + iM58825k48) * (-20995);
                int i23 = (i18 * (-16069)) + i20;
                int i24 = (i19 * (-3196)) + i20;
                int i25 = i21 + i23 + (iM58825k46 * 2446);
                int i26 = i22 + i24 + (iM58825k47 * 16819);
                int i27 = i22 + i23 + (iM58825k48 * 25172);
                int i28 = i21 + i24 + (iM58825k49 * 12299);
                iArr[i7] = C5666m9.m23127k4(i14 + i28, 11);
                iArr[i7 + 56] = C5666m9.m23127k4(i14 - i28, 11);
                iArr[i7 + 8] = C5666m9.m23127k4(i16 + i27, 11);
                iArr[i7 + 48] = C5666m9.m23127k4(i16 - i27, 11);
                iArr[i7 + 16] = C5666m9.m23127k4(i17 + i26, 11);
                iArr[i7 + 40] = C5666m9.m23127k4(i17 - i26, 11);
                iArr[i7 + 24] = C5666m9.m23127k4(i15 + i25, 11);
                iArr[i7 + 32] = C5666m9.m23127k4(i15 - i25, 11);
                i5++;
                i6++;
                i7++;
            }
            i4 = i2 - 1;
            c12677to = this;
            bArr3 = bArr2;
            iArr3 = iArr;
            iArr4 = iArr2;
        }
        int[] iArr5 = iArr3;
        byte[] bArr4 = bArr3;
        byte[] bArrM16369x1 = C10019k4.m49185h4().m16369x1();
        int iM16366k4 = C10019k4.m49185h4().m16366k4() + 128;
        int i29 = 0;
        int i30 = 0;
        while (i30 < 8) {
            int i31 = iArr5[i29 + 1];
            if (i31 == 0 && iArr5[i29 + 2] == 0 && iArr5[i29 + 3] == 0 && iArr5[i29 + 4] == 0 && iArr5[i29 + 5] == 0 && iArr5[i29 + 6] == 0 && iArr5[i29 + 7] == 0) {
                byte b = bArrM16369x1[(C5666m9.m23127k4(iArr5[i29], 5) + iM16366k4) & 1023];
                bArr4[i30] = b;
                bArr4[i30 + 8] = b;
                bArr4[i30 + 16] = b;
                bArr4[i30 + 24] = b;
                bArr4[i30 + 32] = b;
                bArr4[i30 + 40] = b;
                bArr4[i30 + 48] = b;
                bArr4[i30 + 56] = b;
                i29 += 8;
                bArr = bArrM16369x1;
            } else {
                int i32 = iArr5[i29 + 2];
                int i33 = iArr5[i29 + 6];
                int i34 = (i32 + i33) * 4433;
                int i35 = (i33 * (-15137)) + i34;
                int i36 = (i32 * 6270) + i34;
                int i37 = iArr5[i29];
                int i38 = iArr5[i29 + 4];
                int i39 = (i37 + i38) << 13;
                int i40 = (i37 - i38) << 13;
                int i41 = i39 + i36;
                int i42 = i39 - i36;
                int i43 = i40 + i35;
                int i44 = i40 - i35;
                int i45 = iArr5[i29 + 7];
                int i46 = iArr5[i29 + 5];
                int i47 = iArr5[i29 + 3];
                int i48 = i45 + i47;
                int i49 = i46 + i31;
                bArr = bArrM16369x1;
                int i50 = (i48 + i49) * 9633;
                int i51 = (i45 + i31) * (-7373);
                int i52 = (i46 + i47) * (-20995);
                int i53 = (i48 * (-16069)) + i50;
                int i54 = (i49 * (-3196)) + i50;
                int i55 = i51 + i53 + (i45 * 2446);
                int i56 = i52 + i54 + (i46 * 16819);
                int i57 = i52 + i53 + (i47 * 25172);
                int i58 = i51 + i54 + (i31 * 12299);
                bArr4[i30] = bArr[(C5666m9.m23127k4(i41 + i58, 18) + iM16366k4) & 1023];
                bArr4[i30 + 56] = bArr[(C5666m9.m23127k4(i41 - i58, 18) + iM16366k4) & 1023];
                bArr4[i30 + 8] = bArr[(C5666m9.m23127k4(i43 + i57, 18) + iM16366k4) & 1023];
                bArr4[i30 + 48] = bArr[(C5666m9.m23127k4(i43 - i57, 18) + iM16366k4) & 1023];
                bArr4[i30 + 16] = bArr[(C5666m9.m23127k4(i44 + i56, 18) + iM16366k4) & 1023];
                bArr4[i30 + 40] = bArr[(C5666m9.m23127k4(i44 - i56, 18) + iM16366k4) & 1023];
                bArr4[i30 + 24] = bArr[(C5666m9.m23127k4(i42 + i55, 18) + iM16366k4) & 1023];
                bArr4[i30 + 32] = bArr[(C5666m9.m23127k4(i42 - i55, 18) + iM16366k4) & 1023];
                i29 += 8;
            }
            i30++;
            bArrM16369x1 = bArr;
        }
        return bArr4;
    }
}
