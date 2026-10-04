package com.aspose.slides.internal.p023ak;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.internal.p022ai.C1378kk;
import com.aspose.slides.internal.p048bv.InterfaceC1858du;
import com.aspose.slides.internal.p097e0.C3513ck;
import com.aspose.slides.internal.p294n9.C6765kp;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p380ri.C10010du;
import com.aspose.slides.p559ms.System.AbstractC14092to;

/* JADX INFO: renamed from: com.aspose.slides.internal.ak.dy */
/* JADX INFO: loaded from: classes3.dex */
public class C1384dy extends C1390x1 {
    /* JADX INFO: renamed from: du */
    private static boolean m8189du(int i) {
        return i == 2 || i == 3 || i == 6 || i == 7 || i == 8 || i == 15;
    }

    /* JADX INFO: renamed from: h4 */
    private static boolean m8190h4(int i) {
        int iM8222k4 = C1386k4.m8222k4(i);
        if (iM8222k4 == 12) {
            return true;
        }
        switch (iM8222k4) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                return true;
            default:
                return false;
        }
    }

    /* JADX INFO: renamed from: k4 */
    private static int m8191k4(int i) {
        return (i & 1) != 0 ? 4 : 1;
    }

    /* JADX INFO: renamed from: kk */
    private static void m8207kk(int[] iArr, int i, int[] iArr2) {
        int length = iArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            int i3 = iArr[i2];
            if (i3 == 17 || i3 == 16) {
                iArr2[i2] = i;
                for (int i4 = i2 - 1; i4 >= 0; i4--) {
                    int i5 = iArr[i4];
                    if (!m8189du(i5)) {
                        if (i5 == 18) {
                            iArr2[i4] = i;
                        }
                    }
                }
            }
        }
        for (int length2 = iArr.length; length2 > 0; length2--) {
            int i6 = length2 - 1;
            int i7 = iArr[i6];
            if (!m8189du(i7)) {
                if (i7 != 18) {
                    break;
                } else {
                    iArr2[i6] = i;
                }
            }
        }
        int length3 = iArr.length;
        for (int i8 = 0; i8 < length3; i8++) {
            if (m8189du(iArr[i8])) {
                if (i8 == 0) {
                    iArr2[i8] = i;
                } else {
                    iArr2[i8] = iArr2[i8 - 1];
                }
            }
        }
    }

    /* JADX INFO: renamed from: to */
    private static boolean m8210to(int i) {
        switch (i) {
            case 16:
            case 17:
            case 18:
            case 19:
                return true;
            default:
                return false;
        }
    }

    /* JADX INFO: renamed from: x1 */
    private static int m8211x1(int i) {
        return i & (-129);
    }

    /* JADX INFO: renamed from: k4 */
    private static int m8192k4(int i, int i2) {
        return i > i2 ? i : i2;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0023  */
    /* JADX INFO: renamed from: kk */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void m8208kk(int[] iArr, int[] iArr2, int[] iArr3, int i, int i2, int i3, int i4, int i5) {
        while (i < i2) {
            int i6 = iArr[i];
            int i7 = iArr3[i];
            int i8 = 1;
            if ((i7 & 1) == 0) {
                if (i6 != 4) {
                    i8 = 2;
                    if (i6 != 12 && i6 != 9) {
                        i8 = 0;
                    }
                }
            } else if (i6 != 1 && i6 != 9 && i6 != 12) {
            }
            iArr3[i] = i7 + i8;
            i++;
        }
    }

    /* JADX INFO: renamed from: x1 */
    private static int m8212x1(int i, int i2) {
        if (i < 55296 || i > 56319) {
            throw new ArgumentException("bad high surrogate");
        }
        if (i2 < 56320 || i2 > 57343) {
            throw new ArgumentException("bad low surrogate");
        }
        return (((i & 1023) << 10) | (i2 & 1023)) + 65536;
    }

    /* JADX INFO: renamed from: k4 */
    private static int m8193k4(int[] iArr, int i) {
        int length = iArr.length;
        int iM8211x1 = m8211x1(iArr[i]);
        int i2 = 0;
        while (i < length && m8211x1(iArr[i]) == iM8211x1) {
            i2++;
            i++;
        }
        return i2;
    }

    /* JADX INFO: renamed from: kk */
    private static boolean m8209kk(int i) {
        return i == 1 || i == 4 || i == 5;
    }

    /* JADX INFO: renamed from: x1 */
    private static int m8213x1(int[] iArr, int i) {
        int length = iArr.length;
        int i2 = 0;
        while (i < length && iArr[i] == 15) {
            i2++;
            i++;
        }
        return i2;
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x000d  */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static int m8194k4(int[] iArr, int i, int[] iArr2, int[] iArr3, int i2, int i3, int i4, int i5) {
        int iM8192k4;
        int iM8192k42;
        int iM8191k4 = m8191k4(m8192k4(i5, i4));
        if (i3 == iArr.length) {
            iM8192k42 = m8192k4(i4, i);
        } else {
            int i6 = i3;
            while (true) {
                if (i6 >= iArr.length) {
                    iM8192k4 = -1;
                    break;
                }
                if (iArr[i6] != 15) {
                    iM8192k4 = m8192k4(i4, iArr3[i6]);
                    break;
                }
                i6++;
            }
            if (iM8192k4 >= 0) {
                iM8192k42 = iM8192k4;
            }
        }
        int iM8191k42 = m8191k4(iM8192k42);
        m8198k4(iArr, iArr2, iArr3, i2, i3, i4, iM8191k4, iM8191k42);
        m8215x1(iArr, iArr2, iArr3, i2, i3, i4, iM8191k4, iM8191k42);
        m8208kk(iArr, iArr2, iArr3, i2, i3, i4, iM8191k4, iM8191k42);
        return m8200k4(iArr, i2, i3) ? i5 : i4;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x006d  */
    /* JADX INFO: renamed from: x1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void m8214x1(int[] iArr, int i, int[] iArr2) {
        int i2;
        int[] iArr3 = new int[61];
        int length = iArr.length;
        int i3 = i;
        int i4 = 0;
        int i5 = 0;
        while (i4 < length) {
            int i6 = iArr[i4];
            if (i6 == 2 || i6 == 3 || i6 == 6 || i6 == 7) {
                int i7 = (i6 == 6 || i6 == 7) ? ((i3 & (-129)) + 1) | 1 : ((i3 & (-129)) + 2) & (-2);
                if (i7 < 62) {
                    int i8 = i5 + 1;
                    iArr3[i5] = i3;
                    i3 = (i6 == 3 || i6 == 7) ? i7 | 128 : i7 & (-129);
                    i5 = i8;
                }
            } else {
                if (i6 != 8) {
                    if (i6 == 16) {
                        i3 = i;
                        i2 = i3;
                        i5 = 0;
                    }
                } else if (i5 > 0) {
                    i5--;
                    i2 = iArr3[i5];
                }
                if (i6 != 2 || i6 == 3 || i6 == 6 || i6 == 7 || i6 == 8) {
                    iArr[i4] = 15;
                } else if (i6 != 15 && (i3 & 128) != 0) {
                    iArr[i4] = m8191k4(i3);
                }
                iArr2[i4] = i3;
                i4++;
                i3 = i2;
            }
            i2 = i3;
            if (i6 != 2) {
                iArr[i4] = 15;
            }
            iArr2[i4] = i3;
            i4++;
            i3 = i2;
        }
    }

    /* JADX INFO: renamed from: k4 */
    private static int m8195k4(int[] iArr, int[] iArr2, int i, int i2) {
        int length = iArr.length;
        while (i < length && m8201k4(iArr, iArr2, i)) {
            i += m8193k4(iArr2, i);
        }
        return i < length ? m8211x1(iArr2[i]) : i2;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0060 A[SYNTHETIC] */
    /* JADX INFO: renamed from: x1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void m8215x1(int[] iArr, int[] iArr2, int[] iArr3, int i, int i2, int i3, int i4, int i5) {
        int i6;
        for (int i7 = i; i7 < i2; i7++) {
            int i8 = iArr[i7];
            int i9 = 4;
            if (m8210to(i8)) {
                int i10 = i7 + 1;
                if (i10 == i2 && iArr[i7] == 18) {
                    i6 = iArr[i7 - 1];
                    if (i6 != 1 && i6 != 4) {
                        if (i6 == 12 || i6 == 9) {
                            i6 = 4;
                        }
                    }
                    while (i10 < i2) {
                    }
                    i9 = i6;
                    if (i4 != i9) {
                    }
                } else {
                    i6 = i5;
                    while (i10 < i2) {
                        int i11 = iArr[i10];
                        if (i11 == 1 || i11 == 4) {
                            i9 = i11;
                            break;
                        } else {
                            if (i11 == 12 || i11 == 9) {
                                break;
                            }
                            if (!m8210to(i11) && !m8189du(i11)) {
                                break;
                            } else {
                                i10++;
                            }
                        }
                    }
                    i9 = i6;
                    if (i4 != i9) {
                        iArr[i7] = i4;
                        m8196k4(iArr, i, i2, i7, i4);
                    }
                }
            } else if (i8 == 1 || i8 == 4) {
                i4 = i8;
            } else if (i8 == 12 || i8 == 9) {
                i4 = 4;
            }
        }
        for (int i12 = i; i12 < i2; i12++) {
            if (m8210to(iArr[i12])) {
                int iM8191k4 = m8191k4(m8211x1(iArr2[i12]));
                iArr[i12] = iM8191k4;
                m8196k4(iArr, i, i2, i12, iM8191k4);
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    private static void m8196k4(int[] iArr, int i, int i2, int i3, int i4) {
        if (i3 < i || i3 >= i2) {
            throw new ArgumentException();
        }
        for (int i5 = i3 - 1; i5 >= i && iArr[i5] == 15; i5--) {
            iArr[i5] = i4;
        }
        while (true) {
            i3++;
            if (i3 >= i2 || iArr[i3] != 15) {
                return;
            } else {
                iArr[i3] = i4;
            }
        }
    }

    /* JADX INFO: renamed from: x1 */
    private static int[] m8216x1(int[] iArr) {
        int[] iArr2 = new int[iArr.length];
        int length = iArr.length;
        for (int i = 0; i < length; i++) {
            int i2 = iArr[i];
            iArr2[i] = i2 >= 0 ? C1386k4.m8222k4(i2) : 20;
        }
        return iArr2;
    }

    /* JADX INFO: renamed from: k4 */
    private static void m8197k4(int[] iArr, int i, int[] iArr2, int[] iArr3) {
        int iM8193k4;
        if (iArr3.length != iArr.length) {
            throw new ArgumentException("levels sequence length must match classes sequence length");
        }
        if (iArr3.length != iArr2.length) {
            throw new ArgumentException("levels sequence length must match embeddings sequence length");
        }
        int length = iArr2.length;
        int iM8194k4 = i;
        for (int i2 = 0; i2 < length; i2 = iM8193k4) {
            int iM8195k4 = m8195k4(iArr, iArr2, i2, iM8194k4);
            iM8193k4 = i2;
            while (iM8193k4 < length) {
                if (iArr3[iM8193k4] == iM8195k4) {
                    iM8193k4++;
                } else if (!m8201k4(iArr, iArr2, iM8193k4)) {
                    break;
                } else {
                    iM8193k4 += m8193k4(iArr2, iM8193k4);
                }
            }
            int[] iArr4 = iArr;
            int i3 = i;
            int[] iArr5 = iArr2;
            int[] iArr6 = iArr3;
            iM8194k4 = m8194k4(iArr4, i3, iArr5, iArr6, i2, iM8193k4, iM8195k4, iM8194k4);
            iArr = iArr4;
            i = i3;
            iArr2 = iArr5;
            iArr3 = iArr6;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:114:0x0083 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0082  */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void m8198k4(int[] iArr, int[] iArr2, int[] iArr3, int i, int i2, int i3, int i4, int i5) {
        int i6;
        int i7;
        int i8 = i4;
        for (int i9 = i; i9 < i2; i9++) {
            int i10 = iArr[i9];
            if (i10 == 14) {
                iArr[i9] = i8;
            } else if (i10 != 15) {
                i8 = i10;
            }
        }
        int i11 = i4;
        for (int i12 = i; i12 < i2; i12++) {
            int i13 = iArr[i12];
            if (i13 == 9) {
                if (i11 == 5) {
                    iArr[i12] = 12;
                }
            } else if (m8209kk(i13)) {
                i11 = i13;
            }
        }
        for (int i14 = i; i14 < i2; i14++) {
            if (iArr[i14] == 5) {
                iArr[i14] = 4;
            }
        }
        int i15 = i4;
        for (int i16 = i; i16 < i2; i16++) {
            int i17 = iArr[i16];
            if (i17 == 10) {
                int i18 = i16 + 1;
                while (true) {
                    if (i18 >= i2) {
                        i7 = i17;
                        i17 = i5;
                        break;
                    } else {
                        i17 = iArr[i18];
                        if (i17 != 15) {
                            i7 = i17;
                            break;
                        }
                        i18++;
                    }
                }
                if (i15 == 9 && i17 == 9) {
                    iArr[i16] = 9;
                }
            } else {
                if (i17 == 13) {
                    int i19 = i16 + 1;
                    while (true) {
                        if (i19 >= i2) {
                            i7 = i17;
                            i17 = i5;
                            break;
                        } else {
                            i17 = iArr[i19];
                            if (i17 != 15) {
                                i7 = i17;
                                break;
                            }
                            i19++;
                        }
                    }
                    if (i15 == 9 && i17 == 9) {
                        iArr[i16] = 9;
                    } else if (i15 == 12 && i17 == 12) {
                        iArr[i16] = 12;
                    }
                }
                if (i17 == 15) {
                    i15 = i17;
                }
            }
            i17 = i7;
            if (i17 == 15) {
            }
        }
        int i20 = i4;
        for (int i21 = i; i21 < i2; i21++) {
            int i22 = iArr[i21];
            if (i22 == 11) {
                int i23 = i21 + 1;
                while (true) {
                    if (i23 >= i2) {
                        i6 = i5;
                        break;
                    }
                    i6 = iArr[i23];
                    if (i6 != 15 && i6 != 11) {
                        break;
                    } else {
                        i23++;
                    }
                }
                if (i20 == 9 || i6 == 9) {
                    iArr[i21] = 9;
                }
            } else if (i22 != 15 && i22 != 11) {
                i20 = i22;
            }
        }
        for (int i24 = i; i24 < i2; i24++) {
            int i25 = iArr[i24];
            if (i25 == 11 || i25 == 10 || i25 == 13) {
                iArr[i24] = 19;
                m8196k4(iArr, i, i2, i24, 19);
            }
        }
        while (i < i2) {
            int i26 = iArr[i];
            if (i26 == 9) {
                if (i4 == 1) {
                    iArr[i] = 1;
                }
            } else if (i26 == 1 || i26 == 4) {
                i4 = i26;
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: k4 */
    private static boolean m8199k4(InterfaceC1858du interfaceC1858du, int[] iArr) {
        if (iArr.length != interfaceC1858du.mo9715m9()) {
            throw new ArgumentException("characters array length must match input sequence length");
        }
        int length = iArr.length;
        int i = 0;
        boolean z = false;
        while (i < length) {
            int iMo9716to = interfaceC1858du.mo9716to(i);
            if (iMo9716to >= 55296) {
                if (iMo9716to < 56320) {
                    int i2 = i + 1;
                    if (i2 >= length) {
                        throw new ArgumentException("truncated surrogate pair");
                    }
                    char cMo9716to = interfaceC1858du.mo9716to(i2);
                    if (cMo9716to < 56320 || cMo9716to > 57343) {
                        throw new ArgumentException("isolated high surrogate");
                    }
                    iMo9716to = m8212x1(iMo9716to, cMo9716to);
                } else if (iMo9716to < 57344) {
                    throw new ArgumentException("isolated low surrogate");
                }
            }
            if (!z && m8190h4(iMo9716to)) {
                z = true;
            }
            if ((16711680 & iMo9716to) == 0) {
                iArr[i] = iMo9716to;
                i++;
            } else {
                int i3 = i + 1;
                iArr[i] = iMo9716to;
                i += 2;
                iArr[i3] = -1;
            }
        }
        return z;
    }

    /* JADX INFO: renamed from: k4 */
    private static boolean m8200k4(int[] iArr, int i, int i2) {
        while (i < i2) {
            if (!m8189du(iArr[i])) {
                return false;
            }
            i++;
        }
        return true;
    }

    /* JADX INFO: renamed from: k4 */
    private static boolean m8201k4(int[] iArr, int[] iArr2, int i) {
        int iM8193k4 = m8193k4(iArr2, i);
        return iM8193k4 > 0 && m8213x1(iArr, i) >= iM8193k4;
    }

    /* JADX INFO: renamed from: k4 */
    public static int[] m8202k4(InterfaceC1858du interfaceC1858du, C1378kk c1378kk, List<C1385h4> list) {
        int iM8219kk;
        int iMo9715m9 = interfaceC1858du.mo9715m9();
        int[] iArr = new int[iMo9715m9];
        if (!m8199k4(interfaceC1858du, iArr) && c1378kk != C1378kk.f5983x1) {
            return null;
        }
        int[] iArrM8204k4 = m8204k4(iArr, c1378kk == C1378kk.f5983x1 ? 1 : 0, new int[iMo9715m9]);
        List list2 = new List();
        int i = 0;
        for (int i2 = 0; i2 < list.size(); i2++) {
            if (C7019kk.m27469x1(list.get_Item(i2).m8217k4(), C3513ck.class)) {
                C3513ck c3513ck = (C3513ck) C7019kk.m27452k4((Object) list.get_Item(i2).m8217k4(), C3513ck.class);
                C6765kp c6765kp = new C6765kp();
                boolean z = false;
                for (int iM8221x1 = list.get_Item(i2).m8221x1(); iM8221x1 < list.get_Item(i2).m8219kk(); iM8221x1++) {
                    if (interfaceC1858du.mo9716to(iM8221x1) > 8238 || interfaceC1858du.mo9716to(iM8221x1) < 8234) {
                        c6765kp.m26780k4(interfaceC1858du.mo9716to(iM8221x1));
                        list2.addItem(Integer.valueOf(iArrM8204k4[iM8221x1]));
                    } else {
                        z = true;
                    }
                }
                if (z) {
                    c3513ck.m14141du(c6765kp.toString());
                    list.set_Item(i2, new C1385h4(c3513ck, i, c6765kp.m26807x1() + i));
                }
                iM8219kk = c6765kp.m26807x1();
            } else {
                for (int iM8219kk2 = list.get_Item(i2).m8219kk() - 1; iM8219kk2 >= list.get_Item(i2).m8221x1(); iM8219kk2--) {
                    list2.addItem(Integer.valueOf(iArrM8204k4[iM8219kk2]));
                }
                list.set_Item(i2, new C1385h4(list.get_Item(i2).m8217k4(), i, (list.get_Item(i2).m8219kk() + i) - list.get_Item(i2).m8221x1()));
                iM8219kk = list.get_Item(i2).m8219kk() - list.get_Item(i2).m8221x1();
            }
            i = iM8219kk + i;
        }
        return C10010du.m49140k4(list2);
    }

    /* JADX INFO: renamed from: k4 */
    private static int[] m8203k4(int[] iArr) {
        int length = iArr.length;
        int[] iArr2 = new int[length];
        AbstractC14092to.m67216k4(AbstractC14092to.m67208k4((Object) iArr), 0, AbstractC14092to.m67208k4((Object) iArr2), 0, length);
        return iArr2;
    }

    /* JADX INFO: renamed from: k4 */
    public static int[] m8204k4(int[] iArr, int i, int[] iArr2) {
        return m8206k4(iArr, m8216x1(iArr), i, iArr2, false);
    }

    /* JADX INFO: renamed from: k4 */
    private static int[] m8205k4(int[] iArr, int[] iArr2) {
        int length = iArr2.length;
        for (int i = 0; i < length; i++) {
            iArr2[i] = m8211x1(iArr[i]);
        }
        return iArr2;
    }

    /* JADX INFO: renamed from: k4 */
    public static int[] m8206k4(int[] iArr, int[] iArr2, int i, int[] iArr3, boolean z) {
        int[] iArrM8203k4 = m8203k4(iArr2);
        int[] iArr4 = new int[iArr3.length];
        m8214x1(iArrM8203k4, i, iArr4);
        m8197k4(iArrM8203k4, i, iArr4, m8205k4(iArr4, iArr3));
        if (z) {
            m8207kk(iArr2, i, iArr3);
        }
        return iArr3;
    }
}
