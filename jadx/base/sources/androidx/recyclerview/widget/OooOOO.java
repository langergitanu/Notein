package androidx.recyclerview.widget;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class OooOOO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final OooO00o f65876OooO00o = new OooO00o();

    public class OooO00o implements Comparator<OooO0OO> {
        @Override // java.util.Comparator
        public final int compare(OooO0OO oooO0OO, OooO0OO oooO0OO2) {
            return oooO0OO.f65877OooO00o - oooO0OO2.f65877OooO00o;
        }
    }

    public static abstract class OooO0O0 {
        public abstract boolean OooO00o(int i, int i2);

        public abstract boolean OooO0O0(int i, int i2);

        public Object OooO0OO(int i, int i2) {
            return null;
        }

        public abstract int OooO0Oo();

        public abstract int OooO0o0();
    }

    public static class OooO0OO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final int f65877OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final int f65878OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final int f65879OooO0OO;

        public OooO0OO(int i, int i2, int i3) {
            this.f65877OooO00o = i;
            this.f65878OooO0O0 = i2;
            this.f65879OooO0OO = i3;
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.OooOOO$OooO0Oo, reason: case insensitive filesystem */
    public static class C22035OooO0Oo {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final ArrayList f65880OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final int[] f65881OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final int[] f65882OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final OooO0O0 f65883OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final int f65884OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final int f65885OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final boolean f65886OooO0oO;

        public C22035OooO0Oo(OooO0O0 oooO0O0, ArrayList arrayList, int[] iArr, int[] iArr2) {
            int[] iArr3;
            int[] iArr4;
            OooO0O0 oooO0O02;
            int i;
            OooO0OO oooO0OO;
            int i2;
            this.f65880OooO00o = arrayList;
            this.f65881OooO0O0 = iArr;
            this.f65882OooO0OO = iArr2;
            Arrays.fill(iArr, 0);
            Arrays.fill(iArr2, 0);
            this.f65883OooO0Oo = oooO0O0;
            int iOooO0o0 = oooO0O0.OooO0o0();
            this.f65885OooO0o0 = iOooO0o0;
            int iOooO0Oo = oooO0O0.OooO0Oo();
            this.f65884OooO0o = iOooO0Oo;
            this.f65886OooO0oO = true;
            OooO0OO oooO0OO2 = arrayList.isEmpty() ? null : (OooO0OO) arrayList.get(0);
            if (oooO0OO2 == null || oooO0OO2.f65877OooO00o != 0 || oooO0OO2.f65878OooO0O0 != 0) {
                arrayList.add(0, new OooO0OO(0, 0, 0));
            }
            arrayList.add(new OooO0OO(iOooO0o0, iOooO0Oo, 0));
            Iterator it = arrayList.iterator();
            while (true) {
                boolean zHasNext = it.hasNext();
                iArr3 = this.f65882OooO0OO;
                iArr4 = this.f65881OooO0O0;
                oooO0O02 = this.f65883OooO0Oo;
                if (!zHasNext) {
                    break;
                }
                OooO0OO oooO0OO3 = (OooO0OO) it.next();
                for (int i3 = 0; i3 < oooO0OO3.f65879OooO0OO; i3++) {
                    int i4 = oooO0OO3.f65877OooO00o + i3;
                    int i5 = oooO0OO3.f65878OooO0O0 + i3;
                    int i6 = oooO0O02.OooO00o(i4, i5) ? 1 : 2;
                    iArr4[i4] = (i5 << 4) | i6;
                    iArr3[i5] = (i4 << 4) | i6;
                }
            }
            if (this.f65886OooO0oO) {
                Iterator it2 = arrayList.iterator();
                int i7 = 0;
                while (it2.hasNext()) {
                    OooO0OO oooO0OO4 = (OooO0OO) it2.next();
                    while (true) {
                        i = oooO0OO4.f65877OooO00o;
                        if (i7 < i) {
                            if (iArr4[i7] == 0) {
                                int size = arrayList.size();
                                int i8 = 0;
                                int i9 = 0;
                                while (true) {
                                    if (i8 < size) {
                                        oooO0OO = (OooO0OO) arrayList.get(i8);
                                        while (true) {
                                            i2 = oooO0OO.f65878OooO0O0;
                                            if (i9 < i2) {
                                                if (iArr3[i9] == 0 && oooO0O02.OooO0O0(i7, i9)) {
                                                    int i10 = oooO0O02.OooO00o(i7, i9) ? 8 : 4;
                                                    iArr4[i7] = (i9 << 4) | i10;
                                                    iArr3[i9] = i10 | (i7 << 4);
                                                } else {
                                                    i9++;
                                                }
                                            }
                                        }
                                    }
                                    i9 = oooO0OO.f65879OooO0OO + i2;
                                    i8++;
                                }
                            }
                            i7++;
                        }
                    }
                    i7 = oooO0OO4.f65879OooO0OO + i;
                }
            }
        }

        public static OooO0o OooO0O0(ArrayDeque arrayDeque, int i, boolean z) {
            OooO0o oooO0o;
            Iterator it = arrayDeque.iterator();
            while (true) {
                if (!it.hasNext()) {
                    oooO0o = null;
                    break;
                }
                oooO0o = (OooO0o) it.next();
                if (oooO0o.f65887OooO00o == i && oooO0o.f65889OooO0OO == z) {
                    it.remove();
                    break;
                }
            }
            while (it.hasNext()) {
                OooO0o oooO0o2 = (OooO0o) it.next();
                if (z) {
                    oooO0o2.f65888OooO0O0--;
                } else {
                    oooO0o2.f65888OooO0O0++;
                }
            }
            return oooO0o;
        }

        public final void OooO00o(OooOo oooOo) {
            int[] iArr;
            OooO0O0 oooO0O0;
            int i;
            int i2;
            ArrayList arrayList;
            C22035OooO0Oo c22035OooO0Oo = this;
            C22029OooO0o0 c22029OooO0o0 = oooOo instanceof C22029OooO0o0 ? (C22029OooO0o0) oooOo : new C22029OooO0o0(oooOo);
            ArrayDeque arrayDeque = new ArrayDeque();
            ArrayList arrayList2 = c22035OooO0Oo.f65880OooO00o;
            boolean z = true;
            int size = arrayList2.size() - 1;
            int i3 = c22035OooO0Oo.f65885OooO0o0;
            int i4 = c22035OooO0Oo.f65884OooO0o;
            int i5 = i3;
            while (size >= 0) {
                OooO0OO oooO0OO = (OooO0OO) arrayList2.get(size);
                int i6 = oooO0OO.f65877OooO00o;
                int i7 = oooO0OO.f65879OooO0OO;
                int i8 = i6 + i7;
                int i9 = oooO0OO.f65878OooO0O0;
                int i10 = i9 + i7;
                while (true) {
                    iArr = c22035OooO0Oo.f65881OooO0O0;
                    oooO0O0 = c22035OooO0Oo.f65883OooO0Oo;
                    boolean z2 = z;
                    i = 0;
                    if (i5 <= i8) {
                        break;
                    }
                    i5--;
                    int i11 = iArr[i5];
                    if ((i11 & 12) != 0) {
                        arrayList = arrayList2;
                        int i12 = i11 >> 4;
                        OooO0o oooO0oOooO0O0 = OooO0O0(arrayDeque, i12, false);
                        if (oooO0oOooO0O0 != null) {
                            int i13 = (i3 - oooO0oOooO0O0.f65888OooO0O0) - 1;
                            c22029OooO0o0.OooO0Oo(i5, i13);
                            if ((i11 & 4) != 0) {
                                c22029OooO0o0.OooO00o(i13, z2 ? 1 : 0, oooO0O0.OooO0OO(i5, i12));
                            }
                        } else {
                            arrayDeque.add(new OooO0o(i5, (i3 - i5) - (z2 ? 1 : 0), z2));
                        }
                    } else {
                        arrayList = arrayList2;
                        c22029OooO0o0.OooO0OO(i5, z2 ? 1 : 0);
                        i3--;
                    }
                    arrayList2 = arrayList;
                    z = true;
                }
                ArrayList arrayList3 = arrayList2;
                while (i4 > i10) {
                    i4--;
                    int i14 = c22035OooO0Oo.f65882OooO0OO[i4];
                    if ((i14 & 12) != 0) {
                        int i15 = i14 >> 4;
                        OooO0o oooO0oOooO0O02 = OooO0O0(arrayDeque, i15, true);
                        if (oooO0oOooO0O02 == null) {
                            arrayDeque.add(new OooO0o(i4, i3 - i5, false));
                            i2 = 0;
                        } else {
                            i2 = 0;
                            c22029OooO0o0.OooO0Oo((i3 - oooO0oOooO0O02.f65888OooO0O0) - 1, i5);
                            if ((i14 & 4) != 0) {
                                c22029OooO0o0.OooO00o(i5, 1, oooO0O0.OooO0OO(i15, i4));
                            }
                        }
                    } else {
                        i2 = i;
                        c22029OooO0o0.OooO0O0(i5, 1);
                        i3++;
                    }
                    c22035OooO0Oo = this;
                    i = i2;
                }
                i5 = oooO0OO.f65877OooO00o;
                int i16 = i5;
                int i17 = i9;
                while (i < i7) {
                    if ((iArr[i16] & 15) == 2) {
                        c22029OooO0o0.OooO00o(i16, 1, oooO0O0.OooO0OO(i16, i17));
                    }
                    i16++;
                    i17++;
                    i++;
                }
                size--;
                c22035OooO0Oo = this;
                z = true;
                i4 = i9;
                arrayList2 = arrayList3;
            }
            c22029OooO0o0.OooO0o0();
        }
    }

    public static class OooO0o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final int f65887OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public int f65888OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final boolean f65889OooO0OO;

        public OooO0o(int i, int i2, boolean z) {
            this.f65887OooO00o = i;
            this.f65888OooO0O0 = i2;
            this.f65889OooO0OO = z;
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.OooOOO$OooO0o0, reason: case insensitive filesystem */
    public static abstract class AbstractC22036OooO0o0<T> {
        public abstract boolean OooO00o(T t, T t2);

        public abstract boolean OooO0O0(T t, T t2);

        public Object OooO0OO(T t, T t2) {
            return null;
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.OooOOO$OooO0oO, reason: case insensitive filesystem */
    public static class C22037OooO0oO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public int f65890OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public int f65891OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public int f65892OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f65893OooO0Oo;

        public final int OooO00o() {
            return this.f65893OooO0Oo - this.f65892OooO0OO;
        }

        public final int OooO0O0() {
            return this.f65891OooO0O0 - this.f65890OooO00o;
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.OooOOO$OooO0oo, reason: case insensitive filesystem */
    public static class C22038OooO0oo {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public int f65894OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public int f65895OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public int f65896OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f65897OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public boolean f65898OooO0o0;

        public final int OooO00o() {
            return Math.min(this.f65896OooO0OO - this.f65894OooO00o, this.f65897OooO0Oo - this.f65895OooO0O0);
        }
    }

    public static C22035OooO0Oo OooO00o(OooO0O0 oooO0O0) {
        int i;
        C22038OooO0oo c22038OooO0oo;
        int i2;
        C22037OooO0oO c22037OooO0oO;
        int i3;
        int i4;
        C22038OooO0oo c22038OooO0oo2;
        C22038OooO0oo c22038OooO0oo3;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int iOooO0o0 = oooO0O0.OooO0o0();
        int iOooO0Oo = oooO0O0.OooO0Oo();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        C22037OooO0oO c22037OooO0oO2 = new C22037OooO0oO();
        int i14 = 0;
        c22037OooO0oO2.f65890OooO00o = 0;
        c22037OooO0oO2.f65891OooO0O0 = iOooO0o0;
        c22037OooO0oO2.f65892OooO0OO = 0;
        c22037OooO0oO2.f65893OooO0Oo = iOooO0Oo;
        arrayList2.add(c22037OooO0oO2);
        int i15 = iOooO0o0 + iOooO0Oo;
        int i16 = 1;
        int i17 = (((i15 + 1) / 2) * 2) + 1;
        int[] iArr = new int[i17];
        int i18 = i17 / 2;
        int[] iArr2 = new int[i17];
        ArrayList arrayList3 = new ArrayList();
        while (!arrayList2.isEmpty()) {
            C22037OooO0oO c22037OooO0oO3 = (C22037OooO0oO) arrayList2.remove(arrayList2.size() - i16);
            if (c22037OooO0oO3.OooO0O0() < i16 || c22037OooO0oO3.OooO00o() < i16) {
                i = i18;
                c22038OooO0oo = null;
            } else {
                int iOooO00o = ((c22037OooO0oO3.OooO00o() + c22037OooO0oO3.OooO0O0()) + i16) / 2;
                int i19 = i16 + i18;
                iArr[i19] = c22037OooO0oO3.f65890OooO00o;
                iArr2[i19] = c22037OooO0oO3.f65891OooO0O0;
                int i20 = i14;
                while (i20 < iOooO00o) {
                    int i21 = Math.abs(c22037OooO0oO3.OooO0O0() - c22037OooO0oO3.OooO00o()) % 2 == i16 ? i16 : i14;
                    int iOooO0O0 = c22037OooO0oO3.OooO0O0() - c22037OooO0oO3.OooO00o();
                    int i22 = -i20;
                    int i23 = i22;
                    while (true) {
                        if (i23 > i20) {
                            i3 = i14;
                            i = i18;
                            i4 = iOooO00o;
                            c22038OooO0oo2 = null;
                            break;
                        }
                        if (i23 == i22 || (i23 != i20 && iArr[i23 + 1 + i18] > iArr[(i23 - 1) + i18])) {
                            i9 = iArr[i23 + 1 + i18];
                            i10 = i9;
                        } else {
                            i9 = iArr[(i23 - 1) + i18];
                            i10 = i9 + 1;
                        }
                        i = i18;
                        int i24 = ((i10 - c22037OooO0oO3.f65890OooO00o) + c22037OooO0oO3.f65892OooO0OO) - i23;
                        if (i20 == 0 || i10 != i9) {
                            i11 = i10;
                            i12 = i24;
                        } else {
                            i11 = i10;
                            i12 = i24 - 1;
                        }
                        int i25 = i23;
                        int i26 = i24;
                        int i27 = i11;
                        i4 = iOooO00o;
                        while (i27 < c22037OooO0oO3.f65891OooO0O0 && i26 < c22037OooO0oO3.f65893OooO0Oo && oooO0O0.OooO0O0(i27, i26)) {
                            i27++;
                            i26++;
                        }
                        iArr[i25 + i] = i27;
                        if (i21 != 0) {
                            int i28 = iOooO0O0 - i25;
                            i13 = i21;
                            if (i28 >= i22 + 1 && i28 <= i20 - 1 && iArr2[i28 + i] <= i27) {
                                c22038OooO0oo2 = new C22038OooO0oo();
                                c22038OooO0oo2.f65894OooO00o = i9;
                                c22038OooO0oo2.f65895OooO0O0 = i12;
                                c22038OooO0oo2.f65896OooO0OO = i27;
                                c22038OooO0oo2.f65897OooO0Oo = i26;
                                i3 = 0;
                                c22038OooO0oo2.f65898OooO0o0 = false;
                                break;
                            }
                        } else {
                            i13 = i21;
                        }
                        i23 = i25 + 2;
                        i14 = 0;
                        i18 = i;
                        iOooO00o = i4;
                        i21 = i13;
                    }
                    if (c22038OooO0oo2 != null) {
                        c22038OooO0oo = c22038OooO0oo2;
                        break;
                    }
                    int i29 = (c22037OooO0oO3.OooO0O0() - c22037OooO0oO3.OooO00o()) % 2 == 0 ? 1 : i3;
                    int iOooO0O02 = c22037OooO0oO3.OooO0O0() - c22037OooO0oO3.OooO00o();
                    int i30 = i22;
                    while (true) {
                        if (i30 > i20) {
                            c22038OooO0oo3 = null;
                            break;
                        }
                        if (i30 == i22 || (i30 != i20 && iArr2[i30 + 1 + i] < iArr2[(i30 - 1) + i])) {
                            i5 = iArr2[i30 + 1 + i];
                            i6 = i5;
                        } else {
                            i5 = iArr2[(i30 - 1) + i];
                            i6 = i5 - 1;
                        }
                        int i31 = c22037OooO0oO3.f65893OooO0Oo - ((c22037OooO0oO3.f65891OooO0O0 - i6) - i30);
                        int i32 = (i20 == 0 || i6 != i5) ? i31 : i31 + 1;
                        int i33 = i29;
                        while (i6 > c22037OooO0oO3.f65890OooO00o && i31 > c22037OooO0oO3.f65892OooO0OO) {
                            i7 = iOooO0O02;
                            if (!oooO0O0.OooO0O0(i6 - 1, i31 - 1)) {
                                break;
                            }
                            i6--;
                            i31--;
                            iOooO0O02 = i7;
                        }
                        i7 = iOooO0O02;
                        iArr2[i30 + i] = i6;
                        if (i33 != 0 && (i8 = i7 - i30) >= i22 && i8 <= i20 && iArr[i8 + i] >= i6) {
                            c22038OooO0oo3 = new C22038OooO0oo();
                            c22038OooO0oo3.f65894OooO00o = i6;
                            c22038OooO0oo3.f65895OooO0O0 = i31;
                            c22038OooO0oo3.f65896OooO0OO = i5;
                            c22038OooO0oo3.f65897OooO0Oo = i32;
                            c22038OooO0oo3.f65898OooO0o0 = true;
                            break;
                        }
                        i30 += 2;
                        i29 = i33;
                        iOooO0O02 = i7;
                    }
                    if (c22038OooO0oo3 != null) {
                        c22038OooO0oo = c22038OooO0oo3;
                        break;
                    }
                    i20++;
                    i18 = i;
                    iOooO00o = i4;
                    i16 = 1;
                    i14 = 0;
                }
                i = i18;
                c22038OooO0oo = null;
            }
            if (c22038OooO0oo != null) {
                if (c22038OooO0oo.OooO00o() > 0) {
                    int i34 = c22038OooO0oo.f65897OooO0Oo;
                    int i35 = c22038OooO0oo.f65895OooO0O0;
                    int i36 = i34 - i35;
                    int i37 = c22038OooO0oo.f65896OooO0OO;
                    int i38 = c22038OooO0oo.f65894OooO00o;
                    int i39 = i37 - i38;
                    arrayList.add(i36 != i39 ? c22038OooO0oo.f65898OooO0o0 ? new OooO0OO(i38, i35, c22038OooO0oo.OooO00o()) : i36 > i39 ? new OooO0OO(i38, i35 + 1, c22038OooO0oo.OooO00o()) : new OooO0OO(i38 + 1, i35, c22038OooO0oo.OooO00o()) : new OooO0OO(i38, i35, i39));
                }
                if (arrayList3.isEmpty()) {
                    c22037OooO0oO = new C22037OooO0oO();
                    i2 = 1;
                } else {
                    i2 = 1;
                    c22037OooO0oO = (C22037OooO0oO) arrayList3.remove(arrayList3.size() - 1);
                }
                c22037OooO0oO.f65890OooO00o = c22037OooO0oO3.f65890OooO00o;
                c22037OooO0oO.f65892OooO0OO = c22037OooO0oO3.f65892OooO0OO;
                c22037OooO0oO.f65891OooO0O0 = c22038OooO0oo.f65894OooO00o;
                c22037OooO0oO.f65893OooO0Oo = c22038OooO0oo.f65895OooO0O0;
                arrayList2.add(c22037OooO0oO);
                c22037OooO0oO3.f65891OooO0O0 = c22037OooO0oO3.f65891OooO0O0;
                c22037OooO0oO3.f65893OooO0Oo = c22037OooO0oO3.f65893OooO0Oo;
                c22037OooO0oO3.f65890OooO00o = c22038OooO0oo.f65896OooO0OO;
                c22037OooO0oO3.f65892OooO0OO = c22038OooO0oo.f65897OooO0Oo;
                arrayList2.add(c22037OooO0oO3);
            } else {
                i2 = 1;
                arrayList3.add(c22037OooO0oO3);
            }
            i18 = i;
            i16 = i2;
            i14 = 0;
        }
        Collections.sort(arrayList, f65876OooO00o);
        return new C22035OooO0Oo(oooO0O0, arrayList, iArr, iArr2);
    }
}
