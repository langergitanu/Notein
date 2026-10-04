package com.aspose.words;

import androidx.appcompat.view.menu.C21505OooO0Oo;
import java.util.ArrayList;
import o000o0o.C24611OooO00o;

/* JADX INFO: loaded from: classes6.dex */
final class zzJT {
    private static void zzW(zzJU zzju, zzJU zzju2) throws Exception {
        zzU6.zzSU(com.aspose.words.internal.zzZKN.format("\n{{\n Myers for DiffText():\n{0}\n{1}\n{2}\n}}\n", zzYWU.zzZ(zzju), zzYWU.zzZ(zzju2), zzYWU.zzV(zzju, zzju2)));
    }

    private static ArrayList<zzJS> zzX(zzJU zzju, zzJU zzju2) {
        ArrayList<zzJS> arrayList = new ArrayList<>();
        int i = 0;
        int i2 = 0;
        while (true) {
            int i3 = zzju.zzci;
            if (i >= i3 && i2 >= zzju2.zzci) {
                return arrayList;
            }
            if (i >= i3 || zzju.zzZiR[i] || i2 >= zzju2.zzci || zzju2.zzZiR[i2]) {
                int i4 = i;
                while (i4 < zzju.zzci && (i2 >= zzju2.zzci || zzju.zzZiR[i4])) {
                    i4++;
                }
                int i5 = i2;
                while (i5 < zzju2.zzci && (i4 >= zzju.zzci || zzju2.zzZiR[i5])) {
                    i5++;
                }
                if (i < i4 || i2 < i5) {
                    zzJS zzjs = new zzJS();
                    zzjs.zzZiQ = i;
                    zzjs.zzZiP = i2;
                    zzjs.zzZiO = i4 - i;
                    zzjs.zzZiN = i5 - i2;
                    com.aspose.words.internal.zzZQG.zzZ(arrayList, zzjs);
                }
                i = i4;
                i2 = i5;
            } else {
                i++;
                i2++;
            }
        }
    }

    private static zzJU[] zzY(zzVD zzvd, zzVD zzvd2, boolean z) throws Exception {
        zzJU zzju = new zzJU(zzZ(zzvd, z));
        zzJU zzju2 = new zzJU(zzZ(zzvd2, z));
        if (zzju.zzZiS.length + zzju2.zzZiS.length < Math.sqrt(1.048576E9d)) {
            zzY(zzju, zzju2);
        } else {
            zzYWT.zzT(zzju, zzju2);
        }
        if (zzU6.zzZtG) {
            zzW(zzju, zzju2);
        }
        return new zzJU[]{zzju, zzju2};
    }

    public static ArrayList<zzJS> zzZ(zzVD zzvd, zzVD zzvd2, boolean z) throws Exception {
        zzJU[] zzjuArrZzY = zzY(zzvd, zzvd2, z);
        return zzX(zzjuArrZzY[0], zzjuArrZzY[1]);
    }

    public static ArrayList<zzJS> zzZ(int[] iArr, int[] iArr2, zzX9 zzx9, zzX9 zzx92) {
        ArrayList<zzJS> arrayListZzX;
        char c = ((double) (iArr.length + iArr2.length)) < Math.sqrt(1.048576E9d) ? (char) 3 : (char) 5;
        zzJU zzju = new zzJU(iArr);
        zzJU zzju2 = new zzJU(iArr2);
        if (c != 5) {
            zzY(zzju, zzju2);
        } else {
            zzYWT.zzT(zzju, zzju2);
        }
        if (zzx9 != null && zzx92 != null) {
            arrayListZzX = zzZ(zzju, zzju2, zzx9, zzx92);
        } else {
            arrayListZzX = zzX(zzju, zzju2);
        }
        boolean z = zzU6.zzZtG;
        return arrayListZzX;
    }

    private static void zzY(zzJU zzju, zzJU zzju2) {
        ArrayList<int[]> arrayListZzZ = zzZ(zzju, zzju2);
        if (arrayListZzZ.size() < 2) {
            return;
        }
        int i = zzju.zzci;
        int i2 = zzju2.zzci;
        int size = arrayListZzZ.size() - 2;
        while (true) {
            if (i <= 0 && i2 <= 0) {
                return;
            }
            int i3 = i - i2;
            int[] iArr = arrayListZzZ.get(size);
            int i4 = -size;
            boolean z = i3 == i4 || (i3 != size && iArr[((i3 + (-1)) - i4) / 2] < iArr[C24611OooO00o.OooO00o(i3, 1, i4, 2)]);
            int i5 = z ? i3 + 1 : i3 - 1;
            int i6 = iArr[(i5 - i4) / 2];
            int i7 = i6 - i5;
            int i8 = z ? i6 : i6 + 1;
            int i9 = i8 - i3;
            if (z) {
                if (i9 > 0) {
                    zzju2.zzZiR[i9 - 1] = true;
                }
            } else if (i8 > 0) {
                zzju.zzZiR[i8 - 1] = true;
            }
            size--;
            i = i6;
            i2 = i7;
        }
    }

    private static int[] zzZ(zzVD zzvd, boolean z) {
        int[] iArr = new int[zzvd.getLength()];
        for (int i = 0; i < zzvd.getLength(); i++) {
            char lowerCase = zzvd.get(i);
            if (z) {
                lowerCase = Character.toLowerCase(lowerCase);
            }
            iArr[i] = lowerCase;
        }
        return iArr;
    }

    private static ArrayList<int[]> zzZ(zzJU zzju, zzJU zzju2) {
        int i = zzju.zzci;
        int i2 = zzju2.zzci;
        ArrayList<int[]> arrayList = new ArrayList<>();
        int[] iArrZzZ = {0};
        arrayList.add(iArrZzZ);
        for (int i3 = 0; i3 <= i + i2; i3++) {
            iArrZzZ = zzZ(i3, iArrZzZ, zzju, zzju2);
            arrayList.add(iArrZzZ);
            int length = iArrZzZ.length - 1;
            int i4 = iArrZzZ[length];
            if (i4 >= i || i4 == 0) {
                while (length > 0 && iArrZzZ[length] == 0) {
                    length--;
                }
                int i5 = length * 2;
                int i6 = iArrZzZ[length];
                int i7 = i6 - (i5 + (-i3));
                if (i6 >= i && i7 >= i2) {
                    break;
                }
            }
        }
        return arrayList;
    }

    private static int[] zzZ(int i, int[] iArr, zzJU zzju, zzJU zzju2) {
        int i2 = zzju.zzci;
        int i3 = zzju2.zzci;
        int[] iArr2 = new int[i + 1];
        int i4 = -i;
        int i5 = i4;
        int i6 = 0;
        while (i5 <= i) {
            boolean z = i5 == i4 || (i5 != i && iArr[i6 + (-1)] < iArr[i6]);
            int i7 = iArr[z ? i6 : i6 - 1];
            if (!z) {
                i7++;
            }
            int i8 = i7 - i5;
            while (i7 < i2 && i8 < i3 && zzju.zzZiS[i7] == zzju2.zzZiS[i8]) {
                i7++;
                i8++;
            }
            iArr2[i6] = i7;
            i6++;
            if (i7 >= i2 && i8 >= i3) {
                break;
            }
            i5 += 2;
        }
        return iArr2;
    }

    private static ArrayList<zzJS> zzZ(zzJU zzju, zzJU zzju2, zzX9 zzx9, zzX9 zzx92) {
        int i;
        zzJS zzjs;
        int i2;
        int weight;
        int i3;
        int weight2;
        int i4;
        int i5;
        zzJU zzju3 = zzju;
        zzJU zzju4 = zzju2;
        int i6 = 0;
        int i7 = 1;
        boolean z = zzx9 != null;
        ArrayList<zzJS> arrayList = new ArrayList<>();
        com.aspose.words.internal.zzD4 zzd4 = new com.aspose.words.internal.zzD4();
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        while (true) {
            int i11 = zzju3.zzci;
            if (i6 >= i11 && i8 >= zzju4.zzci) {
                return arrayList;
            }
            if (i6 < i11 && !zzju3.zzZiR[i6] && i8 < zzju4.zzci && !zzju4.zzZiR[i8]) {
                int i12 = zzju3.zzZiS[i6];
                int weight3 = z ? zzx9.zzOG(i12).getWeight() : i7;
                if (weight3 == i7) {
                    i9++;
                    i10++;
                } else {
                    int i13 = zzd4.get(i12);
                    int i14 = com.aspose.words.internal.zzD4.zzWm(i13) ? i7 : i13 + 1;
                    if (i14 < weight3) {
                        zzd4.set(i12, i14);
                    } else {
                        i9++;
                        i10++;
                        zzd4.set(i12, i14 - weight3);
                    }
                }
                i6++;
                i8++;
            } else {
                int i15 = i9;
                int i16 = i10;
                int i17 = i16;
                int i18 = i6;
                int i19 = i15;
                while (i18 < zzju3.zzci && (i8 >= zzju4.zzci || zzju3.zzZiR[i18])) {
                    int i20 = zzju3.zzZiS[i18];
                    if (z) {
                        i3 = i6;
                        weight2 = zzx9.zzOG(i20).getWeight();
                    } else {
                        i3 = i6;
                        weight2 = i7;
                    }
                    if (weight2 == i7) {
                        i19++;
                        i4 = i7;
                    } else {
                        int i21 = zzd4.get(i20);
                        if (com.aspose.words.internal.zzD4.zzWm(i21)) {
                            i4 = i7;
                        } else {
                            i4 = i7;
                            i7 = i21 + 1;
                        }
                        if (i7 < weight2) {
                            zzd4.set(i20, i7);
                        } else {
                            int i22 = i7;
                            if ((i18 - i3) + 1 >= weight2 || i16 != i17 || i19 != i15 || i16 >= zzx92.getCount()) {
                                i5 = weight2;
                            } else {
                                i5 = weight2;
                                if (zzx9.zzOH(i19).zze0 == zzx92.zzOH(i16).zze0) {
                                    i15++;
                                    i17++;
                                    i16++;
                                }
                            }
                            i19++;
                            zzd4.set(i20, i22 - i5);
                        }
                    }
                    i18++;
                    i6 = i3;
                    i7 = i4;
                }
                int i23 = i7;
                int i24 = i8;
                while (i24 < zzju4.zzci && (i18 >= zzju3.zzci || zzju4.zzZiR[i24])) {
                    int i25 = zzju4.zzZiS[i24];
                    if (z) {
                        weight = zzx92.zzOG(i25).getWeight();
                        i2 = i23;
                    } else {
                        i2 = i23;
                        weight = i2;
                    }
                    if (weight == i2) {
                        i16++;
                    } else {
                        int i26 = zzd4.get(i25);
                        int i27 = com.aspose.words.internal.zzD4.zzWm(i26) ? 1 : i26 + 1;
                        if (i27 < weight) {
                            zzd4.set(i25, i27);
                        } else {
                            int i28 = i27;
                            if ((i24 - i8) + 1 < weight && i16 == i17 && i19 == i15 && i19 < zzx9.getCount() && zzx9.zzOH(i19).zze0 == zzx92.zzOH(i16).zze0) {
                                i15++;
                                i17++;
                                i19++;
                            }
                            i16++;
                            zzd4.set(i25, i28 - weight);
                        }
                    }
                    i24++;
                    zzju3 = zzju;
                    zzju4 = zzju2;
                    i23 = 1;
                }
                if (i15 < i19 || i17 < i16) {
                    if (arrayList.size() > 0) {
                        i = 1;
                        zzJS zzjs2 = (zzJS) C21505OooO0Oo.OooO00o(1, arrayList);
                        int i29 = zzjs2.zzZiQ;
                        int i30 = zzjs2.zzZiO;
                        if (i15 - (i29 + i30) == 0) {
                            zzjs2.zzZiO = (i19 - i15) + i30;
                            zzjs2.zzZiN = (i16 - i17) + zzjs2.zzZiN;
                            zzjs = null;
                        } else {
                            zzjs = new zzJS(i15, i17, i19 - i15, i16 - i17);
                        }
                    } else {
                        i = 1;
                        zzjs = new zzJS(i15, i17, i19 - i15, i16 - i17);
                    }
                    if (zzjs != null) {
                        com.aspose.words.internal.zzZQG.zzZ(arrayList, zzjs);
                    }
                } else {
                    i = 1;
                }
                zzju4 = zzju2;
                i7 = i;
                i8 = i24;
                i6 = i18;
                i9 = i19;
                i10 = i16;
                zzju3 = zzju;
            }
        }
    }
}
