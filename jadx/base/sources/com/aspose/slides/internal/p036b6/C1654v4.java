package com.aspose.slides.internal.p036b6;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p437u9.C11292du;
import com.aspose.slides.p559ms.System.C14046bv;
import com.aspose.slides.p559ms.System.C14116yg;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.b6.v4 */
/* JADX INFO: loaded from: classes3.dex */
public class C1654v4 extends C1634k4 {
    public C1654v4(Dictionary<String, Object> dictionary) {
        super("glyf");
        this.f6307dy = dictionary;
        if (dictionary == null) {
            this.f6307dy = new Dictionary<>();
        }
    }

    /* JADX INFO: renamed from: k4 */
    private int m8984k4(C1625dy c1625dy) {
        List.Enumerator<C1620c5> it = c1625dy.m8770x1().iterator();
        int i = 10;
        while (it.hasNext()) {
            try {
                C1622ck c1622ckM8718x1 = it.next().m8718x1();
                i = ((c1622ckM8718x1.m8734du() & 255) < 0 || (c1622ckM8718x1.m8734du() & 255) > 127 || (c1622ckM8718x1.m8736h4() & 255) < 0 || (c1622ckM8718x1.m8736h4() & 255) > 127) ? i + 8 : i + 6;
                if ((c1622ckM8718x1.m8744x1() & 255) != 0 || (c1622ckM8718x1.m8740kk() & 255) != 0) {
                    i += 8;
                } else if ((c1622ckM8718x1.m8738k4() & 255) != 1 || (c1622ckM8718x1.m8742to() & 255) != 1) {
                    i += c1622ckM8718x1.m8738k4() == c1622ckM8718x1.m8742to() ? 2 : 4;
                }
            } catch (Throwable th) {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
                throw th;
            }
        }
        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
            it.dispose();
        }
        return i;
    }

    /* JADX INFO: renamed from: x1 */
    private int m8986x1(C1625dy c1625dy, C1618bv c1618bv) {
        if (c1625dy.m8758k4().size() == 0) {
            return 0;
        }
        int size = (c1625dy.m8758k4().size() * 2) + 12 + c1618bv.m8709kk().length;
        double[] dArrM8710to = c1618bv.m8710to();
        int length = dArrM8710to.length;
        int i = 0;
        while (true) {
            int i2 = 1;
            if (i >= length) {
                break;
            }
            double d = dArrM8710to[i];
            if (0.0d > d || d > 255.0d) {
                i2 = 2;
            }
            size += i2;
            i++;
        }
        double[] dArrM8704du = c1618bv.m8704du();
        int length2 = dArrM8704du.length;
        for (int i3 = 0; i3 < length2; i3++) {
            double d2 = dArrM8704du[i3];
            size += (0.0d > d2 || d2 > 255.0d) ? 2 : 1;
        }
        return size;
    }

    @Override // com.aspose.slides.internal.p036b6.C1634k4
    /* JADX INFO: renamed from: k4 */
    public long mo8701k4(C1627f9 c1627f9) {
        List list = new List();
        long j = 0;
        for (C1625dy c1625dy : c1627f9.m8785m9()) {
            C1618bv c1618bv = new C1618bv();
            if (!c1625dy.m8757jd()) {
                c1618bv = m8985k4(c1625dy, c1618bv);
            }
            int iM8984k4 = c1625dy.m8757jd() ? m8984k4(c1625dy) : m8986x1(c1625dy, c1618bv);
            int i = iM8984k4 % 4;
            int i2 = i != 0 ? (4 - i) + iM8984k4 : iM8984k4;
            c1618bv.m8706k4(iM8984k4);
            c1618bv.m8712x1(i2);
            list.addItem(c1618bv);
            j = ((j & 4294967295L) + (((long) i2) & 4294967295L)) & 4294967295L;
        }
        this.f6307dy.addItem("glyfs", list.toArray(new C1618bv[0]));
        this.f6307dy.addItem("tableSize", Long.valueOf(j));
        c1627f9.m8775h4().get_Item("head").m8840k4("indexToLocFormat", Short.valueOf((j & 4294967295L) > 65536 ? (short) 1 : (short) 0));
        return j;
    }

    /* JADX INFO: renamed from: k4 */
    private C1618bv m8985k4(C1625dy c1625dy, C1618bv c1618bv) {
        int i;
        List list;
        List list2;
        int i2;
        int i3;
        if (c1625dy.m8758k4().size() == 0) {
            return c1618bv;
        }
        List list3 = new List();
        List list4 = new List();
        List list5 = new List();
        List<C1624du> listM8758k4 = c1625dy.m8758k4();
        int size = listM8758k4.size();
        C1631h4 c1631h4 = null;
        boolean z = true;
        for (int i4 = 0; i4 < size; i4++) {
            C1624du c1624du = listM8758k4.get_Item(i4);
            int size2 = c1624du.m8750x1().size();
            int i5 = 0;
            while (i5 < size2) {
                C1631h4 c1631h42 = c1624du.m8750x1().get_Item(i5);
                double dM8817kk = c1631h42.m8817kk();
                if (z) {
                    list4.addItem(Double.valueOf(dM8817kk));
                    list5.addItem(Double.valueOf(c1631h42.m8818to()));
                    z = false;
                } else {
                    list4.addItem(Double.valueOf(C14116yg.m67477k4(dM8817kk - c1631h4.m8817kk(), 5)));
                    list5.addItem(Double.valueOf(C14116yg.m67477k4(c1631h42.m8818to() - c1631h4.m8818to(), 5)));
                }
                list3.addItem(Integer.valueOf(c1631h42.m8819x1() ? 1 : 0));
                i5++;
                c1631h4 = c1631h42;
            }
        }
        List list6 = new List();
        List list7 = new List();
        List list8 = new List();
        int i6 = 0;
        int i7 = 0;
        int size3 = -1;
        while (i6 < list3.size()) {
            int iIntValue = ((Integer) list3.get_Item(i6)).intValue();
            double dDoubleValue = ((Double) list4.get_Item(i6)).doubleValue();
            double dDoubleValue2 = ((Double) list5.get_Item(i6)).doubleValue();
            if (i6 == 0) {
                if (-255.0d > dDoubleValue || dDoubleValue > 255.0d) {
                    i = i6;
                } else {
                    i = i6;
                    int i8 = (int) ((((long) iIntValue) & 4294967295L) + 2);
                    if (dDoubleValue >= 0.0d) {
                        i8 = (int) ((((long) i8) & 4294967295L) + 16);
                    }
                    iIntValue = i8;
                    dDoubleValue = C14116yg.m67475k4(dDoubleValue);
                }
                if (-255.0d <= dDoubleValue2 && dDoubleValue2 <= 255.0d) {
                    int i9 = (int) ((((long) iIntValue) & 4294967295L) + 4);
                    if (dDoubleValue2 >= 0.0d) {
                        i9 = (int) ((((long) i9) & 4294967295L) + 32);
                    }
                    iIntValue = i9;
                    dDoubleValue2 = C14116yg.m67475k4(dDoubleValue2);
                }
                list6.addItem(Integer.valueOf(iIntValue));
                list7.addItem(Double.valueOf(dDoubleValue));
                list8.addItem(Double.valueOf(dDoubleValue2));
                list = list3;
                list2 = list4;
                i7 = iIntValue;
            } else {
                i = i6;
                if (dDoubleValue == 0.0d) {
                    i2 = (int) ((((long) iIntValue) & 4294967295L) + 16);
                    list = list3;
                    list2 = list4;
                } else {
                    if (-255.0d > dDoubleValue || dDoubleValue > 255.0d) {
                        list = list3;
                        list2 = list4;
                    } else {
                        list = list3;
                        list2 = list4;
                        int i10 = (int) ((((long) iIntValue) & 4294967295L) + 2);
                        if (dDoubleValue > 0.0d) {
                            i10 = (int) ((((long) i10) & 4294967295L) + 16);
                        }
                        iIntValue = i10;
                        dDoubleValue = C14116yg.m67475k4(dDoubleValue);
                    }
                    list7.addItem(Double.valueOf(dDoubleValue));
                    i2 = iIntValue;
                }
                if (dDoubleValue2 == 0.0d) {
                    i3 = (int) ((((long) i2) & 4294967295L) + 32);
                } else {
                    if (-255.0d <= dDoubleValue2 && dDoubleValue2 <= 255.0d) {
                        int i11 = (int) ((((long) i2) & 4294967295L) + 4);
                        i2 = dDoubleValue2 > 0.0d ? (int) ((((long) i11) & 4294967295L) + 32) : i11;
                        dDoubleValue2 = C14116yg.m67475k4(dDoubleValue2);
                    }
                    list8.addItem(Double.valueOf(dDoubleValue2));
                    i3 = i2;
                }
                if (i3 != i7) {
                    list6.addItem(Integer.valueOf(i3));
                    i7 = i3;
                    size3 = -1;
                } else if (-1 == size3) {
                    size3 = list6.size() - 1;
                    list6.set_Item(size3, Integer.valueOf((int) ((((long) ((Integer) list6.get_Item(size3)).intValue()) & 4294967295L) | 8)));
                    list6.addItem(1);
                } else {
                    int i12 = size3 + 1;
                    list6.set_Item(i12, Integer.valueOf(((Integer) list6.get_Item(i12)).intValue() + 1));
                }
            }
            List list9 = list;
            i6 = i + 1;
            list3 = list9;
            list4 = list2;
        }
        c1618bv.m8708k4(C11292du.m54271x1(list6));
        c1618bv.m8707k4(C11292du.m54270to(list7));
        c1618bv.m8713x1(C11292du.m54270to(list8));
        return c1618bv;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0124 A[PHI: r21
      0x0124: PHI (r21v9 com.aspose.slides.internal.b6.bv[]) = (r21v8 com.aspose.slides.internal.b6.bv[]), (r21v10 com.aspose.slides.internal.b6.bv[]) binds: [B:43:0x0119, B:40:0x0114] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0189  */
    @Override // com.aspose.slides.internal.p036b6.C1634k4
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void mo8702k4(C1655vh c1655vh, C1627f9 c1627f9) {
        int i;
        C1618bv[] c1618bvArr;
        long j;
        C1625dy c1625dy;
        C1618bv[] c1618bvArr2;
        long j2;
        long j3;
        int i2;
        Byte bValueOf;
        Byte bValueOf2;
        int i3 = 0;
        while (i3 < c1627f9.m8785m9().length) {
            C1625dy c1625dy2 = c1627f9.m8785m9()[i3];
            if (c1625dy2.m8757jd() || c1625dy2.m8758k4().size() != 0) {
                int iM8748k4 = -1;
                c1655vh.m9005k4(c1625dy2.m8757jd() ? (short) -1 : (short) c1625dy2.m8758k4().size());
                c1655vh.m9005k4(C7019kk.m27468x1(Double.valueOf(c1625dy2.m8768to()), 14));
                c1655vh.m9005k4(C7019kk.m27468x1(Double.valueOf(c1625dy2.m8756h4()), 14));
                c1655vh.m9005k4(C7019kk.m27468x1(Double.valueOf(c1625dy2.m8753du()), 14));
                c1655vh.m9005k4(C7019kk.m27468x1(Double.valueOf(c1625dy2.m8767m9()), 14));
                C1618bv[] c1618bvArr3 = (C1618bv[]) C7019kk.m27458kk(c1627f9.m8775h4().get_Item("glyf").m8837k4("glyfs"), C1618bv[].class);
                long j4 = 4294967295L;
                if (c1625dy2.m8757jd()) {
                    int size = c1625dy2.m8770x1().size();
                    int i4 = 0;
                    while (i4 < size) {
                        C1620c5 c1620c5 = c1625dy2.m8770x1().get_Item(i4);
                        int i5 = i4 < size + (-1) ? (int) ((((long) 6) & j4) + 32) : 6;
                        C1622ck c1622ckM8718x1 = c1620c5.m8718x1();
                        byte bM8738k4 = c1622ckM8718x1.m8738k4();
                        byte bM8744x1 = c1622ckM8718x1.m8744x1();
                        long j5 = j4;
                        byte bM8740kk = c1622ckM8718x1.m8740kk();
                        byte bM8742to = c1622ckM8718x1.m8742to();
                        byte bM8734du = c1622ckM8718x1.m8734du();
                        byte bM8736h4 = c1622ckM8718x1.m8736h4();
                        int i6 = bM8734du & 255;
                        int i7 = i3;
                        if (i6 < 0 || i6 > 127) {
                            c1625dy = c1625dy2;
                        } else {
                            c1625dy = c1625dy2;
                            int i8 = bM8736h4 & 255;
                            if (i8 < 0 || i8 > 127) {
                            }
                            if ((bM8744x1 & 255) == 0 || (bM8740kk & 255) != 0) {
                                c1618bvArr2 = c1618bvArr3;
                                j2 = ((long) i5) & j5;
                                j3 = 128;
                            } else {
                                int i9 = bM8738k4 & 255;
                                if (i9 == 1) {
                                    c1618bvArr2 = c1618bvArr3;
                                    if ((bM8742to & 255) == 1) {
                                        if (i9 != 1 || (bM8742to & 255) != 1) {
                                            j2 = ((long) i5) & j5;
                                            j3 = 64;
                                        }
                                    }
                                    c1655vh.m8995k4(i5 & 65535);
                                    c1655vh.m8995k4(c1620c5.m8715k4() & 65535);
                                    if ((i5 & 1) != 0) {
                                        c1655vh.m9005k4((short) i6);
                                        c1655vh.m9005k4((short) (bM8736h4 & 255));
                                    } else {
                                        c1655vh.m8989k4(bM8734du);
                                        c1655vh.m8989k4(bM8736h4);
                                    }
                                    if ((i5 & 8) != 0) {
                                        bValueOf2 = Byte.valueOf(bM8738k4);
                                        i2 = 6;
                                    } else {
                                        if ((i5 & 64) != 0) {
                                            bValueOf = Byte.valueOf(bM8738k4);
                                            i2 = 6;
                                        } else if ((i5 & 128) != 0) {
                                            i2 = 6;
                                            c1655vh.m9005k4(C7019kk.m27468x1(C14116yg.m67487k4(C14046bv.m66451du(C7019kk.m27440jd(Byte.valueOf(bM8738k4), 6), C7019kk.m27440jd(16384, 9)).Clone()), 15));
                                            c1655vh.m9005k4(C7019kk.m27468x1(C14116yg.m67487k4(C14046bv.m66451du(C7019kk.m27440jd(Byte.valueOf(bM8744x1), 6), C7019kk.m27440jd(16384, 9)).Clone()), 15));
                                            bValueOf = Byte.valueOf(bM8740kk);
                                        } else {
                                            i4++;
                                            j4 = j5;
                                            i3 = i7;
                                            c1625dy2 = c1625dy;
                                            c1618bvArr3 = c1618bvArr2;
                                        }
                                        c1655vh.m9005k4(C7019kk.m27468x1(C14116yg.m67487k4(C14046bv.m66451du(C7019kk.m27440jd(bValueOf, i2), C7019kk.m27440jd(16384, 9)).Clone()), 15));
                                        bValueOf2 = Byte.valueOf(bM8742to);
                                    }
                                    c1655vh.m9005k4(C7019kk.m27468x1(C14116yg.m67487k4(C14046bv.m66451du(C7019kk.m27440jd(bValueOf2, i2), C7019kk.m27440jd(16384, 9)).Clone()), 15));
                                    i4++;
                                    j4 = j5;
                                    i3 = i7;
                                    c1625dy2 = c1625dy;
                                    c1618bvArr3 = c1618bvArr2;
                                } else {
                                    c1618bvArr2 = c1618bvArr3;
                                }
                                if (bM8738k4 == bM8742to) {
                                    j2 = ((long) i5) & j5;
                                    j3 = 8;
                                }
                            }
                            i5 = (int) (j2 + j3);
                            c1655vh.m8995k4(i5 & 65535);
                            c1655vh.m8995k4(c1620c5.m8715k4() & 65535);
                            if ((i5 & 1) != 0) {
                            }
                            if ((i5 & 8) != 0) {
                            }
                            c1655vh.m9005k4(C7019kk.m27468x1(C14116yg.m67487k4(C14046bv.m66451du(C7019kk.m27440jd(bValueOf2, i2), C7019kk.m27440jd(16384, 9)).Clone()), 15));
                            i4++;
                            j4 = j5;
                            i3 = i7;
                            c1625dy2 = c1625dy;
                            c1618bvArr3 = c1618bvArr2;
                        }
                        i5 = (int) ((((long) i5) & j5) + 1);
                        if ((bM8744x1 & 255) == 0) {
                            c1618bvArr2 = c1618bvArr3;
                            j2 = ((long) i5) & j5;
                            j3 = 128;
                            i5 = (int) (j2 + j3);
                        }
                        c1655vh.m8995k4(i5 & 65535);
                        c1655vh.m8995k4(c1620c5.m8715k4() & 65535);
                        if ((i5 & 1) != 0) {
                        }
                        if ((i5 & 8) != 0) {
                        }
                        c1655vh.m9005k4(C7019kk.m27468x1(C14116yg.m67487k4(C14046bv.m66451du(C7019kk.m27440jd(bValueOf2, i2), C7019kk.m27440jd(16384, 9)).Clone()), 15));
                        i4++;
                        j4 = j5;
                        i3 = i7;
                        c1625dy2 = c1625dy;
                        c1618bvArr3 = c1618bvArr2;
                    }
                    i = i3;
                    c1618bvArr = c1618bvArr3;
                    j = j4;
                } else {
                    i = i3;
                    c1618bvArr = c1618bvArr3;
                    j = 4294967295L;
                    List.Enumerator<C1624du> it = c1625dy2.m8758k4().iterator();
                    while (it.hasNext()) {
                        try {
                            iM8748k4 += it.next().m8748k4();
                            c1655vh.m8995k4(iM8748k4 & 65535);
                        } finally {
                            if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                                it.dispose();
                            }
                        }
                    }
                    c1655vh.m8995k4(0);
                    for (int i10 : c1618bvArr[i].m8709kk()) {
                        c1655vh.m8989k4((byte) i10);
                    }
                    for (double d : c1618bvArr[i].m8710to()) {
                        if (0.0d > d || d > 255.0d) {
                            c1655vh.m9005k4(C7019kk.m27468x1(Double.valueOf(d), 14));
                        } else {
                            c1655vh.m8989k4(C7019kk.m27442k4(Double.valueOf(d), 14));
                        }
                    }
                    for (double d2 : c1618bvArr[i].m8704du()) {
                        if (0.0d > d2 || d2 > 255.0d) {
                            c1655vh.m9005k4(C7019kk.m27468x1(Double.valueOf(d2), 14));
                        } else {
                            c1655vh.m8989k4(C7019kk.m27442k4(Double.valueOf(d2), 14));
                        }
                    }
                }
                int iM8705k4 = c1618bvArr[i].m8705k4() % 4;
                if (iM8705k4 != 0) {
                    c1655vh.m9013x1(((long) (4 - iM8705k4)) & j);
                }
            } else {
                i = i3;
            }
            i3 = i + 1;
        }
    }
}
