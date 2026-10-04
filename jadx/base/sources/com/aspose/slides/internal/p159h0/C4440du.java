package com.aspose.slides.internal.p159h0;

import androidx.core.graphics.OooO0OO;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.h0.du */
/* JADX INFO: loaded from: classes.dex */
class C4440du {

    /* JADX INFO: renamed from: k4 */
    private List<C4433bv> f12200k4 = new List<>();

    public C4440du(C4453kk c4453kk, float f, float f2, boolean z, C4459os[] c4459osArr, boolean[] zArr, int i) throws Throwable {
        int[] iArr;
        int[] iArr2;
        float f3;
        int i2;
        C4483x1 c4483x1;
        C4459os c4459os;
        Class<C4489zj> cls;
        float f4;
        C4483x1 c4483x12;
        C4459os c4459os2;
        Class<C4489zj> cls2 = C4489zj.class;
        if (c4459osArr == null) {
            throw new ArgumentNullException("bevelAnchorPoints");
        }
        int i3 = 2;
        if (c4459osArr.length < 2) {
            throw new ArgumentException("The size of the point array must be greater than 1");
        }
        boolean[] zArr2 = zArr == null ? new boolean[c4459osArr.length] : zArr;
        if (zArr2.length != c4459osArr.length) {
            throw new ArgumentException("The size of the anchorPoints[] and bevelSoothingFlags[] array must be the same");
        }
        c4459osArr[0].m18286k4(0.0f);
        c4459osArr[0].m18291x1(0.0f);
        c4459osArr[c4459osArr.length - 1].m18286k4(1.0f);
        char c = 5;
        char c2 = 4;
        char c3 = 3;
        int[] iArr3 = new int[6];
        if (z) {
            iArr3[0] = 1;
            iArr3[1] = 2;
            iArr3[2] = 0;
            iArr3[3] = 2;
            iArr3[4] = 1;
            iArr3[5] = 3;
            iArr = new int[]{1, 2};
            iArr2 = iArr3;
            f3 = f2;
        } else {
            iArr3[0] = 0;
            iArr3[1] = 2;
            iArr3[2] = 1;
            iArr3[3] = 3;
            iArr3[4] = 1;
            iArr3[5] = 2;
            iArr = new int[]{2, 1};
            iArr2 = iArr3;
            f3 = -f2;
        }
        int[] iArr4 = iArr;
        int length = c4459osArr.length;
        int i4 = length - 1;
        C4459os c4459osClone = c4453kk.m18237kk().m18463x1().Clone();
        C4459os c4459osClone2 = c4453kk.m18237kk().m18461kk().Clone();
        C4459os c4459osClone3 = C4459os.m18282x1(c4459osClone2, c4459osClone).Clone();
        IGenericEnumerator<C4452k4> it = c4453kk.iterator();
        while (it.hasNext()) {
            try {
                C4452k4 next = it.next();
                char c4 = c;
                List<C4483x1> listM18226x1 = next.m18226x1();
                int i5 = i3;
                char c5 = c2;
                char c6 = c3;
                int i6 = 0;
                int i7 = 0;
                int i8 = 0;
                while (i7 < listM18226x1.size()) {
                    try {
                        C4483x1 c4483x13 = listM18226x1.get_Item(i7);
                        i7++;
                        C4483x1 c4483x14 = listM18226x1.get_Item(i7 % listM18226x1.size());
                        i8 += c4483x13.m18441dy() != c4483x14.m18441dy() ? i4 * 4 : (i4 * 4) - 1;
                        i6 += c4483x13.m18441dy() != c4483x14.m18441dy() ? i4 * 6 : (i4 * 6) - 3;
                    } catch (Throwable th) {
                        th = th;
                        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                            it.dispose();
                        }
                        throw th;
                    }
                }
                C4489zj[] c4489zjArr = (C4489zj[]) AbstractC14092to.m67212k4(AbstractC14092to.m67205k4(C7019kk.m27443k4((Class<?>) cls2), i8));
                C4489zj[] c4489zjArr2 = (C4489zj[]) AbstractC14092to.m67212k4(AbstractC14092to.m67205k4(C7019kk.m27443k4((Class<?>) cls2), i8));
                C4459os[] c4459osArr2 = (C4459os[]) AbstractC14092to.m67212k4(AbstractC14092to.m67205k4(C7019kk.m27443k4((Class<?>) C4459os.class), i8));
                int[] iArr5 = new int[i6];
                int i9 = 0;
                int i10 = 0;
                int i11 = 0;
                while (i9 < listM18226x1.size()) {
                    C4483x1 c4483x15 = listM18226x1.get_Item(i9);
                    i9++;
                    boolean[] zArr3 = zArr2;
                    C4483x1 c4483x16 = listM18226x1.get_Item(i9 % listM18226x1.size());
                    int i12 = length;
                    int i13 = 0;
                    while (i13 < i4) {
                        int i14 = i4;
                        if (i13 >= i12 - 2) {
                            i2 = i13;
                            if (c4483x15.m18441dy() == c4483x16.m18441dy()) {
                                iArr5[i11] = i10 + iArr2[0];
                                int i15 = i11 + 2;
                                iArr5[i11 + 1] = i10 + iArr2[1];
                                i11 += 3;
                                iArr5[i15] = i10 + iArr2[i5];
                                C4459os c4459osClone4 = c4483x15.m18444k4(c4459osArr[i2].m18285k4()).Clone();
                                C4459os c4459osClone5 = c4483x16.m18444k4(c4459osArr[i2].m18285k4()).Clone();
                                int i16 = i2 + 1;
                                C4459os c4459osClone6 = c4483x15.m18444k4(c4459osArr[i16].m18285k4()).Clone();
                                float fM18404k4 = f + C4479w6.m18404k4(0.0f, f3, c4459osArr[i2].m18290x1());
                                C4459os c4459os3 = c4459osArr[i16];
                                c4459os2 = c4459osClone;
                                float fM18404k42 = f + C4479w6.m18404k4(0.0f, f3, c4459os3.m18290x1());
                                cls = cls2;
                                c4459os = c4459osClone2;
                                c4489zjArr[i10] = new C4489zj(c4459osClone4.m18285k4(), c4459osClone4.m18290x1(), fM18404k4);
                                int i17 = i10 + 1;
                                c4489zjArr[i17] = new C4489zj(c4459osClone5.m18285k4(), c4459osClone5.m18290x1(), fM18404k4);
                                int i18 = i10 + 2;
                                c4489zjArr[i18] = new C4489zj(c4459osClone6.m18285k4(), c4459osClone6.m18290x1(), fM18404k42);
                                C4489zj c4489zjClone = C4489zj.m18502to(C4489zj.m18504x1(c4489zjArr[i10 + iArr4[0]], c4489zjArr[i10]).Clone(), C4489zj.m18504x1(c4489zjArr[i10 + iArr4[1]], c4489zjArr[i10]).Clone()).m18510to().Clone();
                                c4489zjClone.CloneTo(c4489zjArr2[i10]);
                                c4489zjClone.CloneTo(c4489zjArr2[i17]);
                                c4489zjClone.CloneTo(c4489zjArr2[i18]);
                                i10 += 3;
                                c4483x12 = c4483x15;
                                f4 = f3;
                                c4483x1 = c4483x16;
                            }
                            i13 = i2 + 1;
                            i4 = i14;
                            c4459osClone = c4459os2;
                            c4483x15 = c4483x12;
                            f3 = f4;
                            cls2 = cls;
                            c4459osClone2 = c4459os;
                            c4483x16 = c4483x1;
                        } else {
                            i2 = i13;
                        }
                        c4459os2 = c4459osClone;
                        cls = cls2;
                        c4459os = c4459osClone2;
                        iArr5[i11] = i10 + iArr2[0];
                        iArr5[i11 + 1] = i10 + iArr2[1];
                        iArr5[i11 + 2] = i10 + iArr2[i5];
                        iArr5[i11 + 3] = i10 + iArr2[c6];
                        int i19 = i11 + 5;
                        iArr5[i11 + 4] = i10 + iArr2[c5];
                        i11 += 6;
                        iArr5[i19] = i10 + iArr2[c4];
                        C4459os c4459osClone7 = c4483x15.m18444k4(c4459osArr[i2].m18285k4()).Clone();
                        C4459os c4459osClone8 = c4483x16.m18444k4(c4459osArr[i2].m18285k4()).Clone();
                        int i20 = i2 + 1;
                        C4459os c4459osClone9 = c4483x15.m18444k4(c4459osArr[i20].m18285k4()).Clone();
                        C4459os c4459osClone10 = c4483x16.m18444k4(c4459osArr[i20].m18285k4()).Clone();
                        c4483x12 = c4483x15;
                        float fM18404k43 = f + C4479w6.m18404k4(0.0f, f3, c4459osArr[i2].m18290x1());
                        float fM18404k44 = f + C4479w6.m18404k4(0.0f, f3, c4459osArr[i20].m18290x1());
                        f4 = f3;
                        c4483x1 = c4483x16;
                        c4489zjArr[i10] = new C4489zj(c4459osClone7.m18285k4(), c4459osClone7.m18290x1(), fM18404k43);
                        int i21 = i10 + 1;
                        c4489zjArr[i21] = new C4489zj(c4459osClone8.m18285k4(), c4459osClone8.m18290x1(), fM18404k43);
                        int i22 = i10 + 2;
                        c4489zjArr[i22] = new C4489zj(c4459osClone9.m18285k4(), c4459osClone9.m18290x1(), fM18404k44);
                        int i23 = i10 + 3;
                        c4489zjArr[i23] = new C4489zj(c4459osClone10.m18285k4(), c4459osClone10.m18290x1(), fM18404k44);
                        C4489zj c4489zjClone2 = C4489zj.m18502to(C4489zj.m18504x1(c4489zjArr[i10 + iArr4[0]], c4489zjArr[i10]).Clone(), C4489zj.m18504x1(c4489zjArr[i10 + iArr4[1]], c4489zjArr[i10]).Clone()).m18510to().Clone();
                        c4489zjClone2.CloneTo(c4489zjArr2[i10]);
                        c4489zjClone2.CloneTo(c4489zjArr2[i21]);
                        c4489zjClone2.CloneTo(c4489zjArr2[i22]);
                        c4489zjClone2.CloneTo(c4489zjArr2[i23]);
                        i10 += 4;
                        i13 = i2 + 1;
                        i4 = i14;
                        c4459osClone = c4459os2;
                        c4483x15 = c4483x12;
                        f3 = f4;
                        cls2 = cls;
                        c4459osClone2 = c4459os;
                        c4483x16 = c4483x1;
                    }
                    length = i12;
                    zArr2 = zArr3;
                }
                float f5 = f3;
                int i24 = i4;
                boolean[] zArr4 = zArr2;
                int i25 = length;
                C4459os c4459os4 = c4459osClone;
                Class<C4489zj> cls3 = cls2;
                C4459os c4459os5 = c4459osClone2;
                for (int i26 = 0; i26 < i8; i26++) {
                    C4489zj c4489zjClone3 = c4489zjArr[i26].Clone();
                    c4459osArr2[i26].m18286k4(c4459osClone3.m18285k4() > 0.0f ? (c4489zjClone3.m18506k4() - c4459os4.m18285k4()) / c4459osClone3.m18285k4() : 0.0f);
                    c4459osArr2[i26].m18291x1(c4459osClone3.m18290x1() > 0.0f ? (c4459os5.m18290x1() - c4489zjClone3.m18511x1()) / c4459osClone3.m18290x1() : 0.0f);
                }
                i4 = i24;
                m18153k4(next, i4, zArr4, c4489zjArr2, z);
                m18152k4(next, i4, i, c4489zjArr2);
                C4433bv c4433bv = new C4433bv(i5);
                c4433bv.m18082k4(c4489zjArr);
                c4433bv.m18080k4(iArr5);
                c4433bv.m18086x1(c4489zjArr2);
                c4433bv.m18081k4(c4459osArr2);
                this.f12200k4.addItem(c4433bv);
                i3 = i5;
                length = i25;
                c = c4;
                c2 = c5;
                c3 = c6;
                zArr2 = zArr4;
                c4459osClone = c4459os4;
                f3 = f5;
                cls2 = cls3;
                c4459osClone2 = c4459os5;
            } catch (Throwable th2) {
                th = th2;
            }
        }
        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
            it.dispose();
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final List<C4433bv> m18155k4() {
        return this.f12200k4;
    }

    /* JADX INFO: renamed from: k4 */
    private void m18152k4(C4452k4 c4452k4, int i, int i2, C4489zj[] c4489zjArr) {
        int i3;
        C4489zj c4489zj;
        if (i2 == -1) {
            return;
        }
        List<C4483x1> listM18226x1 = c4452k4.m18226x1();
        boolean[] zArrM18154k4 = m18154k4(c4452k4, i2);
        int i4 = 0;
        int i5 = 0;
        while (i4 < listM18226x1.size()) {
            int i6 = i4 + 1;
            int size = i6 % listM18226x1.size();
            C4483x1 c4483x1 = listM18226x1.get_Item(i4);
            C4483x1 c4483x12 = listM18226x1.get_Item(size);
            boolean z = c4483x1.m18441dy() == c4483x12.m18441dy();
            int i7 = !z ? i * 4 : (i * 4) - 1;
            if (zArrM18154k4[size]) {
                for (int i8 = 0; i8 < i; i8++) {
                    int i9 = (i8 * 4) + i5;
                    int i10 = i9 + 1;
                    int i11 = i9 + i7;
                    C4489zj c4489zjClone = C4489zj.m18499k4(c4489zjArr[i10], c4489zjArr[i11 % c4489zjArr.length]).m18510to().Clone();
                    c4489zjClone.CloneTo(c4489zjArr[i10]);
                    c4489zjClone.CloneTo(c4489zjArr[i11 % c4489zjArr.length]);
                    if (i8 != i - 1) {
                        int i12 = i9 + 3;
                        int i13 = i9 + 2 + i7;
                        C4489zj c4489zjClone2 = C4489zj.m18499k4(c4489zjArr[i12], c4489zjArr[i13 % c4489zjArr.length]).m18510to().Clone();
                        c4489zjClone2.CloneTo(c4489zjArr[i12]);
                        c4489zjClone2.CloneTo(c4489zjArr[i13 % c4489zjArr.length]);
                    }
                }
                C4489zj c4489zjClone3 = c4489zjArr[((i - 1) * 4) + i5 + 2].Clone();
                C4469to c4469toM18441dy = c4483x1.m18441dy();
                C4489zj c4489zjM18340m9 = c4483x1.m18441dy().m18340m9();
                if (z) {
                    c4469toM18441dy.m18336k4(C4489zj.m18499k4(c4489zjM18340m9, c4489zjClone3).Clone());
                } else {
                    c4469toM18441dy.m18336k4(C4489zj.m18499k4(c4489zjM18340m9, c4489zjClone3).Clone());
                    c4483x12.m18441dy().m18336k4(C4489zj.m18499k4(c4483x12.m18441dy().m18340m9(), c4489zjClone3).Clone());
                }
            }
            i5 += i7;
            i4 = i6;
        }
        int i14 = 4;
        int i15 = 0;
        int i16 = 0;
        while (i15 < listM18226x1.size()) {
            int i17 = i15 + 1;
            int size2 = i17 % listM18226x1.size();
            C4483x1 c4483x13 = listM18226x1.get_Item(i15);
            C4483x1 c4483x14 = listM18226x1.get_Item(size2);
            boolean z2 = c4483x13.m18441dy() == c4483x14.m18441dy();
            int i18 = i * 4;
            if (z2) {
                i18--;
            }
            if (zArrM18154k4[size2]) {
                i3 = i14;
                int iOooO00o = OooO0OO.OooO00o(i, 1, i3, i16);
                C4489zj c4489zjM18510to = c4483x13.m18441dy().m18340m9().m18510to();
                if (z2) {
                    c4489zj = c4489zjArr[iOooO00o + 2];
                } else {
                    c4489zjM18510to.CloneTo(c4489zjArr[iOooO00o + 2]);
                    c4489zjM18510to = c4483x14.m18441dy().m18340m9().m18510to();
                    c4489zj = c4489zjArr[iOooO00o + 3];
                }
                c4489zjM18510to.CloneTo(c4489zj);
            } else {
                i3 = i14;
            }
            i16 += i18;
            i15 = i17;
            i14 = i3;
        }
    }

    /* JADX INFO: renamed from: k4 */
    private void m18153k4(C4452k4 c4452k4, int i, boolean[] zArr, C4489zj[] c4489zjArr, boolean z) {
        int i2;
        List<C4483x1> listM18226x1 = c4452k4.m18226x1();
        C4489zj c4489zj = new C4489zj(0.0f, 0.0f, z ? 1.0f : -1.0f);
        int i3 = 0;
        int i4 = 0;
        while (i3 < listM18226x1.size()) {
            int i5 = i3 + 1;
            int size = i5 % listM18226x1.size();
            C4483x1 c4483x1 = listM18226x1.get_Item(i3);
            C4483x1 c4483x12 = listM18226x1.get_Item(size);
            boolean z2 = c4483x1.m18441dy() == c4483x12.m18441dy();
            int i6 = i * 4;
            if (z2) {
                i6--;
            }
            int i7 = 0;
            while (true) {
                i2 = i - 1;
                if (i7 >= i2) {
                    break;
                }
                int i8 = (i7 * 4) + i4 + 2;
                i7++;
                if (zArr[i7]) {
                    int i9 = i8 + 1;
                    int i10 = i8 + 2;
                    int i11 = i8 + 3;
                    C4489zj c4489zjClone = C4489zj.m18499k4(C4489zj.m18499k4(C4489zj.m18499k4(c4489zjArr[i8], c4489zjArr[i9]), c4489zjArr[i10]), c4489zjArr[i11]).m18510to().Clone();
                    c4489zjClone.CloneTo(c4489zjArr[i8]);
                    c4489zjClone.CloneTo(c4489zjArr[i9]);
                    c4489zjClone.CloneTo(c4489zjArr[i10]);
                    c4489zjClone.CloneTo(c4489zjArr[i11]);
                }
            }
            if (zArr[0]) {
                C4489zj c4489zjClone2 = new C4489zj(c4483x12.m18452x1().m18290x1() - c4483x1.m18452x1().m18290x1(), c4483x1.m18452x1().m18285k4() - c4483x12.m18452x1().m18285k4(), 0.0f).m18510to().Clone();
                c4489zjClone2.CloneTo(c4489zjArr[i4]);
                c4489zjClone2.CloneTo(c4489zjArr[i4 + 1]);
            }
            if (zArr[i]) {
                int i12 = (i2 * 4) + i4 + 2;
                c4489zj.CloneTo(c4489zjArr[i12]);
                if (!z2) {
                    c4489zj.CloneTo(c4489zjArr[i12 + 1]);
                }
            }
            i4 += i6;
            i3 = i5;
        }
    }

    /* JADX INFO: renamed from: k4 */
    private boolean[] m18154k4(C4452k4 c4452k4, int i) {
        List<C4483x1> listM18226x1 = c4452k4.m18226x1();
        int size = listM18226x1.size();
        boolean[] zArr = new boolean[size];
        if (i != -1) {
            if (i == 2) {
                for (int i2 = 0; i2 < listM18226x1.size(); i2++) {
                    zArr[i2] = true;
                }
            } else if (i != 0) {
                if (i == 1) {
                    int i3 = 0;
                    while (i3 < size) {
                        int i4 = i3 + 1;
                        int i5 = i4 % size;
                        zArr[i5] = C4459os.m18280kk(C4459os.m18282x1(listM18226x1.get_Item(i5).m18452x1(), listM18226x1.get_Item(i3).m18452x1()).Clone(), C4459os.m18282x1(listM18226x1.get_Item((i3 + 2) % size).m18452x1(), listM18226x1.get_Item(i5).m18452x1()).Clone()) > 0.7071068f;
                        i3 = i4;
                    }
                }
            } else if (c4452k4.m18225to().m18145kk()) {
                int i6 = 0;
                while (i6 < listM18226x1.size()) {
                    int i7 = i6 + 1;
                    int i8 = i7 % size;
                    zArr[i8] = listM18226x1.get_Item(i6).m18451to() == 2 && listM18226x1.get_Item(i8).m18451to() == 2;
                    i6 = i7;
                }
            } else {
                int i9 = 0;
                while (i9 < listM18226x1.size()) {
                    int i10 = i9 + 1;
                    zArr[i9] = listM18226x1.get_Item(i9).m18451to() == 2 && listM18226x1.get_Item(i10 % size).m18451to() == 2;
                    i9 = i10;
                }
            }
        }
        return zArr;
    }
}
