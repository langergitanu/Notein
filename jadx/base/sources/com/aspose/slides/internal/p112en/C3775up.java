package com.aspose.slides.internal.p112en;

import OooO0O0.C20395OooO0o0;
import com.aspose.slides.exceptions.IOException;
import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.aspose.slides.internal.p255lq.C6221x1;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.C14116yg;

/* JADX INFO: renamed from: com.aspose.slides.internal.en.up */
/* JADX INFO: loaded from: classes.dex */
public class C3775up {
    /* JADX WARN: Removed duplicated region for block: B:23:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0110  */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m15099k4(int i, int i2, int i3, int i4, AbstractC3150x6 abstractC3150x6, AbstractC3150x6 abstractC3150x62, int i5) {
        int i6;
        if (i == 1) {
            C6221x1.m25204k4(abstractC3150x6, abstractC3150x62, i5);
            return;
        }
        int i7 = i2 * i3;
        int i8 = 8;
        int i9 = (i7 + 7) / 8;
        int iOooO0O0 = C20395OooO0o0.OooO0O0(i4, i7, 7, 8);
        byte[] bArr = new byte[iOooO0O0];
        byte[] bArr2 = new byte[iOooO0O0];
        byte[] bArr3 = new byte[i5];
        int i10 = i;
        while (abstractC3150x6.getLength() - abstractC3150x6.getPosition() > 0) {
            if (i >= 10) {
                int i11 = abstractC3150x6.readByte();
                if (i11 == -1) {
                    return;
                } else {
                    i10 = i11 + 10;
                }
            }
            int i12 = 0;
            while (i12 < iOooO0O0) {
                int i13 = abstractC3150x6.read(bArr, i12, iOooO0O0 - i12);
                if (i13 > 0) {
                    i12 += i13;
                } else {
                    if (i10 == 2) {
                        switch (i10) {
                            case 11:
                                i6 = i8;
                                for (int i14 = 0; i14 < iOooO0O0; i14++) {
                                    int i15 = i14 - i9;
                                    bArr[i14] = (byte) ((bArr[i14] & 255) + ((i15 >= 0 ? bArr[i15] : (byte) 0) & 255));
                                }
                                break;
                            case 12:
                                i6 = i8;
                                for (int i16 = 0; i16 < iOooO0O0; i16++) {
                                    bArr[i16] = (byte) (((bArr[i16] & 255) + (bArr2[i16] & 255)) & 255);
                                }
                                break;
                            case 13:
                                i6 = i8;
                                for (int i17 = 0; i17 < iOooO0O0; i17++) {
                                    bArr[i17] = (byte) ((C7019kk.m27462to(Double.valueOf(C14116yg.m67490kk(((i17 - i9 >= 0 ? bArr[r10] & 255 : 0) + (bArr2[i17] & 255)) / 2)), 14) + (bArr[i17] & 255)) & 255);
                                }
                                break;
                            case 14:
                                int i18 = 0;
                                while (i18 < iOooO0O0) {
                                    int i19 = bArr[i18] & 255;
                                    int i20 = i18 - i9;
                                    int i21 = i20 >= 0 ? bArr[i20] & 255 : 0;
                                    int i22 = bArr2[i18] & 255;
                                    int i23 = i20 >= 0 ? bArr2[i20] & 255 : 0;
                                    int i24 = (i21 + i22) - i23;
                                    int iM67482k4 = C14116yg.m67482k4(i24 - i21);
                                    int i25 = i8;
                                    int iM67482k42 = C14116yg.m67482k4(i24 - i22);
                                    int iM67482k43 = C14116yg.m67482k4(i24 - i23);
                                    if (iM67482k4 <= iM67482k42 && iM67482k4 <= iM67482k43) {
                                        bArr[i18] = (byte) ((i19 + i21) & 255);
                                    } else if (iM67482k42 <= iM67482k43) {
                                        bArr[i18] = (byte) ((i19 + i22) & 255);
                                    } else {
                                        bArr[i18] = (byte) ((i19 + i23) & 255);
                                    }
                                    i18++;
                                    i8 = i25;
                                }
                                continue;
                        }
                        i8 = i6;
                    } else {
                        i6 = i8;
                        if (i3 == 16) {
                            for (int i26 = 0; i26 < iOooO0O0; i26 += 2) {
                                int i27 = i26 + 1;
                                int i28 = i26 - i9;
                                int i29 = ((bArr[i26] & 255) << 8) + (bArr[i27] & 255) + (i28 >= 0 ? ((bArr[i28] & 255) << 8) + (bArr[i28 + 1] & 255) : 0);
                                bArr[i26] = (byte) ((i29 >> 8) & 255);
                                bArr[i27] = (byte) (i29 & 255);
                            }
                            i8 = i6;
                        } else {
                            i8 = i6;
                            if (i3 != i8) {
                                throw new IOException(C14113y2.m67402k4("TIFF-Predictor with {0} bits per component not supported", Integer.valueOf(i3)));
                            }
                            for (int i30 = 0; i30 < iOooO0O0; i30++) {
                                int i31 = i30 - i9;
                                bArr[i30] = (byte) ((bArr[i30] & 255) + (i31 >= 0 ? bArr[i31] & 255 : 0));
                            }
                        }
                    }
                    AbstractC14092to.m67216k4(AbstractC14092to.m67208k4((Object) bArr), 0, AbstractC14092to.m67208k4((Object) bArr2), 0, iOooO0O0);
                    abstractC3150x62.write(bArr, 0, iOooO0O0);
                }
            }
            if (i10 == 2) {
            }
            AbstractC14092to.m67216k4(AbstractC14092to.m67208k4((Object) bArr), 0, AbstractC14092to.m67208k4((Object) bArr2), 0, iOooO0O0);
            abstractC3150x62.write(bArr, 0, iOooO0O0);
        }
    }
}
