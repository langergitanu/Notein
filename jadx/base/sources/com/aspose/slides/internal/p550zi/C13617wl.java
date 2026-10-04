package com.aspose.slides.internal.p550zi;

import com.aspose.slides.Collections.Generic.IGenericList;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.exceptions.OutOfMemoryException;
import com.aspose.slides.internal.p299ni.InterfaceC6902dy;
import com.aspose.slides.internal.p299ni.InterfaceC6905jd;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p475wh.C12014ne;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14116yg;

/* JADX INFO: renamed from: com.aspose.slides.internal.zi.wl */
/* JADX INFO: loaded from: classes5.dex */
public class C13617wl {
    /* JADX INFO: renamed from: k4 */
    private static IGenericList<C12014ne> m62834k4(IGenericList<C12014ne> iGenericList, int i) {
        List list = new List(iGenericList.size() * 2);
        for (C12014ne c12014ne : iGenericList) {
            int iM56663c5 = c12014ne.m56663c5();
            C12014ne c12014neClone = c12014ne.Clone();
            if (iM56663c5 > 1) {
                for (C12014ne c12014ne2 : m62835k4(c12014neClone, i)) {
                    if (c12014ne2.m56663c5() > 0 && c12014ne2.m56683x1() > 0) {
                        list.addItem(c12014ne2.Clone());
                    }
                }
            } else {
                list.addItem(c12014neClone);
            }
        }
        return list;
    }

    /* JADX INFO: renamed from: x1 */
    private static IGenericList<C12014ne> m62843x1(IGenericList<C12014ne> iGenericList, int i) {
        List list = new List();
        for (C12014ne c12014ne : iGenericList) {
            int iM56683x1 = c12014ne.m56683x1();
            C12014ne c12014neClone = c12014ne.Clone();
            if (iM56683x1 > 1) {
                for (C12014ne c12014ne2 : m62844x1(c12014neClone, i)) {
                    if (c12014ne2.m56663c5() > 0 && c12014ne2.m56683x1() > 0) {
                        list.addItem(c12014ne2.Clone());
                    }
                }
            } else {
                list.addItem(c12014neClone);
            }
        }
        return list;
    }

    /* JADX INFO: renamed from: k4 */
    private static IGenericList<C12014ne> m62835k4(C12014ne c12014ne, int i) {
        List list = new List(c12014ne.m56663c5() / i);
        int iM56681to = c12014ne.m56681to();
        while (iM56681to < c12014ne.m56668h4()) {
            int i2 = iM56681to + i;
            list.addItem(new C12014ne(iM56681to, c12014ne.m56666dy(), i2 < c12014ne.m56668h4() ? i : c12014ne.m56668h4() - iM56681to, c12014ne.m56683x1()).Clone());
            iM56681to = i2;
        }
        return list;
    }

    /* JADX INFO: renamed from: x1 */
    private static IGenericList<C12014ne> m62844x1(C12014ne c12014ne, int i) {
        C12014ne c12014neClone;
        List list = new List(c12014ne.m56683x1() / i);
        if (i >= c12014ne.m56683x1()) {
            c12014neClone = c12014ne.Clone();
        } else {
            int iM56683x1 = c12014ne.m56683x1() % i;
            int iM56670k4 = c12014ne.m56670k4();
            if (iM56683x1 > 0) {
                iM56670k4 = c12014ne.m56666dy() + ((c12014ne.m56683x1() / i) * i);
            }
            int iM56666dy = c12014ne.m56666dy();
            while (iM56666dy < iM56670k4) {
                list.addItem(new C12014ne(c12014ne.m56681to(), iM56666dy, c12014ne.m56663c5(), i).Clone());
                iM56666dy += i;
            }
            if (iM56683x1 <= 0) {
                return list;
            }
            c12014neClone = new C12014ne(c12014ne.m56681to(), iM56670k4, c12014ne.m56663c5(), iM56683x1).Clone();
        }
        list.addItem(c12014neClone);
        return list;
    }

    /* JADX INFO: renamed from: k4 */
    private static void m62836k4(InterfaceC6902dy interfaceC6902dy, IGenericList<C12014ne> iGenericList) {
        boolean z = false;
        boolean z2 = false;
        while (iGenericList.size() > 0) {
            C12014ne c12014neClone = iGenericList.get_Item(0).Clone();
            iGenericList.removeAt(0);
            try {
                interfaceC6902dy.mo9818k4(c12014neClone.Clone());
            } catch (OutOfMemoryError unused) {
                IGenericList<C12014ne>[] iGenericListArr = {iGenericList};
                boolean[] zArr = {z};
                boolean[] zArr2 = {z2};
                m62842k4(c12014neClone.Clone(), iGenericListArr, zArr, zArr2);
                IGenericList<C12014ne> iGenericList2 = iGenericListArr[0];
                boolean z3 = zArr[0];
                boolean z4 = zArr2[0];
                z = z3;
                iGenericList = iGenericList2;
                z2 = z4;
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    private static void m62837k4(InterfaceC6905jd interfaceC6905jd, IGenericList<C12014ne> iGenericList) {
        InterfaceC6905jd interfaceC6905jd2;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        while (iGenericList.size() > 0) {
            C12014ne c12014neClone = iGenericList.get_Item(0).Clone();
            iGenericList.removeAt(0);
            try {
                if (C13619x1.m62867x1(interfaceC6905jd.m27036x1(c12014neClone.Clone()))) {
                    interfaceC6905jd.mo9818k4(c12014neClone.Clone());
                    interfaceC6905jd2 = interfaceC6905jd;
                } else {
                    IGenericList<C12014ne>[] iGenericListArr = {iGenericList};
                    boolean[] zArr = {z};
                    boolean[] zArr2 = {z2};
                    boolean[] zArr3 = {z3};
                    interfaceC6905jd2 = interfaceC6905jd;
                    try {
                        m62838k4(interfaceC6905jd2, c12014neClone.Clone(), iGenericListArr, zArr, zArr2, zArr3);
                        iGenericList = iGenericListArr[0];
                        z = zArr[0];
                        z2 = zArr2[0];
                        z3 = zArr3[0];
                    } catch (OutOfMemoryError unused) {
                        IGenericList<C12014ne>[] iGenericListArr2 = {iGenericList};
                        boolean[] zArr4 = {z2};
                        boolean[] zArr5 = {z3};
                        m62842k4(c12014neClone.Clone(), iGenericListArr2, zArr4, zArr5);
                        IGenericList<C12014ne> iGenericList2 = iGenericListArr2[0];
                        boolean z4 = zArr4[0];
                        z3 = zArr5[0];
                        z2 = z4;
                        iGenericList = iGenericList2;
                    }
                }
            } catch (OutOfMemoryError unused2) {
                interfaceC6905jd2 = interfaceC6905jd;
            }
            interfaceC6905jd = interfaceC6905jd2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x005d A[PHI: r5 r8
      0x005d: PHI (r5v3 int) = (r5v2 int), (r5v1 int) binds: [B:17:0x0052, B:8:0x002d] A[DONT_GENERATE, DONT_INLINE]
      0x005d: PHI (r8v6 int) = (r8v3 int), (r8v7 int) binds: [B:17:0x0052, B:8:0x002d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void m62838k4(InterfaceC6905jd interfaceC6905jd, C12014ne c12014ne, IGenericList<C12014ne>[] iGenericListArr, boolean[] zArr, boolean[] zArr2, boolean[] zArr3) {
        if (zArr[0]) {
            m62842k4(c12014ne.Clone(), iGenericListArr, zArr2, zArr3);
            return;
        }
        long jM27035kk = interfaceC6905jd.m27035kk(c12014ne.Clone());
        long jM27034k4 = interfaceC6905jd.m27034k4();
        int iM56683x1 = c12014ne.m56683x1();
        int iM56663c5 = c12014ne.m56663c5();
        iGenericListArr[0].insertItem(0, c12014ne.Clone());
        while (true) {
            if (iM56683x1 <= 1) {
                if (!zArr3[0]) {
                    iGenericListArr[0] = m62843x1(iGenericListArr[0], 1);
                    zArr3[0] = true;
                }
                if (iM56663c5 <= 1) {
                    zArr2[0] = true;
                    break;
                }
                iM56663c5 /= 2;
                if (iM56663c5 < 1) {
                    zArr2[0] = true;
                    break;
                } else if (C13619x1.m62867x1(((long) iM56663c5) * jM27034k4)) {
                    iGenericListArr[0] = m62834k4(iGenericListArr[0], iM56663c5);
                    break;
                }
            } else {
                iM56683x1 /= 2;
                if (!C13619x1.m62867x1(((long) iM56683x1) * jM27035kk)) {
                    if (iM56683x1 <= 1 && iM56663c5 <= 1) {
                        break;
                    }
                } else {
                    iGenericListArr[0] = m62843x1(iGenericListArr[0], iM56683x1);
                    break;
                }
            }
        }
        zArr[0] = true;
    }

    /* JADX INFO: renamed from: k4 */
    public static void m62839k4(C12014ne c12014ne, int i, int i2, InterfaceC6902dy interfaceC6902dy) {
        if (c12014ne.m56670k4() > i2) {
            throw new ArgumentOutOfRangeException("fullHeight", "The rectangle bottom is more than full height.");
        }
        if (c12014ne.m56668h4() > i) {
            throw new ArgumentOutOfRangeException("fullWidth", "The rectangle right is more than full width.");
        }
        m62841k4(c12014ne.Clone(), interfaceC6902dy, 1, i, i2);
    }

    /* JADX INFO: renamed from: k4 */
    public static void m62840k4(C12014ne c12014ne, InterfaceC6902dy interfaceC6902dy) {
        m62841k4(c12014ne.Clone(), interfaceC6902dy, 0, 0, 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0096  */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void m62841k4(C12014ne c12014ne, InterfaceC6902dy interfaceC6902dy, int i, int i2, int i3) {
        int iM67483k4;
        if (interfaceC6902dy == null) {
            throw new ArgumentNullException("partialProcessor");
        }
        if (c12014ne.m56663c5() <= 0) {
            throw new ArgumentOutOfRangeException("areaToProcess", "The processing area widht must be positive and more than 0.");
        }
        if (c12014ne.m56683x1() <= 0) {
            throw new ArgumentOutOfRangeException("areaToProcess", "The processing area height must be positive and more than 0.");
        }
        if (c12014ne.m56681to() < 0) {
            throw new ArgumentOutOfRangeException("areaToProcess", "The processing area left must be positive.");
        }
        if (c12014ne.m56666dy() < 0) {
            throw new ArgumentOutOfRangeException("areaToProcess", "The processing area top must be positive.");
        }
        List list = new List();
        if (i == 1) {
            int iM56670k4 = c12014ne.m56670k4();
            int i4 = 4;
            if (c12014ne.m56683x1() >= 8) {
                iM67483k4 = 4;
                if (iM67483k4 == 4) {
                    for (int i5 = 1; i5 < iM56670k4; i5 += 2) {
                        list.addItem(new C12014ne(0, i5, i2, 1));
                    }
                    iM56670k4 = i3;
                }
                if (iM67483k4 >= 3) {
                    int i6 = 2;
                    int i7 = 0;
                    while (i6 < iM56670k4) {
                        list.insertItem(i7, new C12014ne(0, i6, i2, 1));
                        i6 += 4;
                        i7++;
                    }
                    iM56670k4 = i3;
                }
                if (iM67483k4 < 2) {
                    int i8 = 0;
                    while (i4 < iM56670k4) {
                        list.insertItem(i8, new C12014ne(0, i4, i2, 1));
                        i4 += 8;
                        i8++;
                    }
                } else {
                    i3 = iM56670k4;
                }
                if (iM67483k4 >= 1) {
                    int i9 = 0;
                    int i10 = 0;
                    while (i9 < i3) {
                        list.insertItem(i10, new C12014ne(0, i9, i2, 1));
                        i9 += 8;
                        i10++;
                    }
                }
            } else {
                iM67483k4 = 0;
                for (int iM56666dy = c12014ne.m56666dy(); iM56666dy < iM56670k4; iM56666dy++) {
                    if (iM56666dy % 2 == 1) {
                        iM67483k4 = 4;
                        break;
                    }
                    if (iM56666dy % 4 == 2) {
                        iM67483k4 = 3;
                    } else {
                        int i11 = iM56666dy % 8;
                        if (i11 == 4) {
                            iM67483k4 = C14116yg.m67483k4(iM67483k4, 2);
                        } else if (i11 == 0) {
                            iM67483k4 = C14116yg.m67483k4(iM67483k4, 1);
                        }
                    }
                }
                if (iM67483k4 == 4) {
                }
                if (iM67483k4 >= 3) {
                }
                if (iM67483k4 < 2) {
                }
                if (iM67483k4 >= 1) {
                }
            }
        } else {
            list.addItem(c12014ne.Clone());
        }
        InterfaceC6905jd interfaceC6905jd = (InterfaceC6905jd) C7019kk.m27452k4((Object) interfaceC6902dy, InterfaceC6905jd.class);
        if (C14067j2.m66729x1(interfaceC6905jd, null)) {
            m62836k4(interfaceC6902dy, list);
        } else {
            m62837k4(interfaceC6905jd, (IGenericList<C12014ne>) list);
        }
    }

    /* JADX INFO: renamed from: k4 */
    private static void m62842k4(C12014ne c12014ne, IGenericList<C12014ne>[] iGenericListArr, boolean[] zArr, boolean[] zArr2) {
        if (zArr[0]) {
            throw new OutOfMemoryException();
        }
        if (!zArr2[0]) {
            zArr2[0] = true;
            iGenericListArr[0].insertItem(0, c12014ne.Clone());
            iGenericListArr[0] = m62843x1(iGenericListArr[0], 1);
        } else {
            iGenericListArr[0].insertItem(0, c12014ne.Clone());
            if (c12014ne.m56663c5() / 2 >= 1) {
                iGenericListArr[0] = m62834k4(iGenericListArr[0], c12014ne.m56663c5() / 2);
            } else {
                zArr[0] = true;
            }
        }
    }
}
