package com.aspose.slides.internal.p036b6;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p243l6.C6005k4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p437u9.C11292du;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.C14057f9;
import com.aspose.slides.p559ms.System.C14081nv;
import com.aspose.slides.p559ms.System.C14093tq;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.C14114y9;
import com.aspose.slides.p559ms.System.C14116yg;
import com.aspose.slides.p559ms.System.IDisposable;
import com.aspose.words.StyleIdentifier;
import com.huawei.hms.network.embedded.C18177fb;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.b6.uz */
/* JADX INFO: loaded from: classes3.dex */
public class C1653uz extends C1634k4 {
    public C1653uz(long j, long j2, long j3) {
        super("cmap", j, j2, j3);
    }

    /* JADX INFO: renamed from: k4 */
    private int m8975k4(int i) {
        return i > 32767 ? i - 65536 : i < -32767 ? i + 65536 : i;
    }

    /* JADX INFO: renamed from: x1 */
    private void m8983x1(C1655vh c1655vh, C1640ne[] c1640neArr) {
        c1655vh.m8995k4(12);
        c1655vh.m8995k4(0);
        c1655vh.m8999k4(((long) ((c1640neArr.length * 12) + 16)) & 4294967295L);
        c1655vh.m8999k4(0L);
        c1655vh.m8999k4(((long) c1640neArr.length) & 4294967295L);
        for (C1640ne c1640ne : c1640neArr) {
            c1655vh.m8999k4(c1640ne.m8892k4());
            c1655vh.m8999k4(c1640ne.m8899x1());
            c1655vh.m8999k4(c1640ne.m8895kk());
        }
    }

    public C1653uz(Dictionary<String, Object> dictionary) {
        super("cmap");
        this.f6307dy = dictionary;
    }

    @Override // com.aspose.slides.internal.p036b6.C1634k4
    /* JADX INFO: renamed from: k4 */
    public long mo8701k4(C1627f9 c1627f9) {
        List.Enumerator<Integer> it;
        boolean z;
        long j;
        List<C1657wl> list = new List<>();
        int i = 0;
        while (true) {
            if (i >= c1627f9.m8785m9().length) {
                break;
            }
            List<Integer> listM8764kk = c1627f9.m8785m9()[i].m8764kk();
            if (listM8764kk.size() > 0) {
                it = listM8764kk.iterator();
                while (it.hasNext()) {
                    try {
                        int iIntValue = ((Integer) C7019kk.m27464to(it.next(), Integer.TYPE)).intValue();
                        C1657wl c1657wl = new C1657wl();
                        c1657wl.m9024k4(iIntValue != 65535 ? ((long) i) & 4294967295L : 0L);
                        c1657wl.m9026x1(((long) iIntValue) & 4294967295L);
                        list.addItem(c1657wl);
                    } finally {
                    }
                }
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
            i++;
        }
        list.sort();
        this.f6307dy.addItem("unicodes", list.toArray(new C1657wl[0]));
        C1640ne[] c1640neArrM8981k4 = m8981k4(list, 65535);
        long length = (c1640neArrM8981k4.length * 8) + 24;
        c1627f9.m8775h4().get_Item("cmap").m8840k4("format4Segments", c1640neArrM8981k4);
        c1627f9.m8775h4().get_Item("cmap").m8840k4("format4Size", Long.valueOf(length & 4294967295L));
        c1627f9.m8775h4().get_Item("cmap").m8840k4("format0Segments", m8982k4(list));
        c1627f9.m8775h4().get_Item("cmap").m8840k4("format0Size", (Object) 262L);
        it = list.iterator();
        while (true) {
            try {
                if (!it.hasNext()) {
                    z = false;
                    break;
                }
                if ((it.next().m9025x1() & 4294967295L) > C18177fb.f54859s) {
                    z = true;
                    break;
                }
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        c1627f9.m8775h4().get_Item("cmap").m8840k4("hasGLyphsOver2Bytes", Boolean.valueOf(z));
        if (z) {
            C1640ne[] c1640neArrM8981k42 = m8981k4(list, 0);
            long length2 = ((long) ((c1640neArrM8981k42.length * 12) + 16)) & 4294967295L;
            c1627f9.m8775h4().get_Item("cmap").m8840k4("format12Segments", c1640neArrM8981k42);
            c1627f9.m8775h4().get_Item("cmap").m8840k4("format12Size", Long.valueOf(length2));
            j = length2;
        } else {
            j = 0;
        }
        return (((((long) ((z ? 32 : 24) + 4)) + 262) & 4294967295L) + (length & 4294967295L) + (j & 4294967295L)) & 4294967295L;
    }

    /* JADX WARN: Removed duplicated region for block: B:89:0x023d  */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private Dictionary<String, Object> m8976k4(List<C1650u4> list, C1627f9 c1627f9) {
        int i;
        int i2;
        int iM8825kk;
        int iM8825kk2;
        long j;
        long j2;
        String strM67465x1;
        Object objValueOf;
        Dictionary<String, Object> dictionary = new Dictionary<>();
        List.Enumerator<C1650u4> it = list.iterator();
        C1650u4 c1650u4 = null;
        C1650u4 c1650u42 = null;
        C1650u4 c1650u43 = null;
        C1650u4 c1650u44 = null;
        C1650u4 c1650u45 = null;
        while (true) {
            try {
                i = 2;
                i2 = 65535;
                if (!it.hasNext()) {
                    break;
                }
                C1650u4 next = it.next();
                if ((next.m8952to() & 65535) == 0) {
                    c1650u4 = next;
                } else if ((next.m8952to() & 65535) == 2 && (next.m8935k4() & 65535) == 3 && (next.m8958x1() & 65535) == 3) {
                    c1650u43 = next;
                } else if ((next.m8952to() & 65535) == 4 && (next.m8935k4() & 65535) == 3 && (next.m8958x1() & 65535) == 1) {
                    c1650u44 = next;
                } else if ((next.m8952to() & 65535) == 12 && (next.m8935k4() & 65535) == 3 && (next.m8958x1() & 65535) == 10) {
                    c1650u45 = next;
                } else if ((next.m8952to() & 65535) == 14 && (next.m8935k4() & 65535) == 0 && (next.m8958x1() & 65535) == 5) {
                    c1650u42 = next;
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
        if (c1650u4 != null) {
            int length = c1650u4.m8932h4().length;
            for (int i3 = 0; i3 < length; i3++) {
                dictionary.set_Item(C14057f9.m66591x1(i3), Long.valueOf(c1650u4.m8932h4()[i3]));
            }
        }
        if (c1650u42 != null) {
            int length2 = c1650u42.m8956u4().length;
            for (int i4 = 0; i4 < length2; i4++) {
                C1640ne c1640ne = c1650u42.m8956u4()[i4];
                dictionary.set_Item(C14114y9.m67465x1(c1640ne.m8892k4()), Long.valueOf(c1640ne.m8899x1()));
            }
        }
        long j3 = 1;
        long j4 = 4294967295L;
        if (c1650u45 != null) {
            long jM8933ix = c1650u45.m8933ix();
            for (long j5 = 0; (j5 & 4294967295L) < (jM8933ix & 4294967295L); j5++) {
                C1640ne c1640ne2 = c1650u45.m8956u4()[(int) j5];
                long jM8895kk = c1640ne2.m8895kk();
                long jM8899x1 = c1640ne2.m8899x1();
                for (long jM8892k4 = c1640ne2.m8892k4(); (jM8892k4 & 4294967295L) <= (jM8899x1 & 4294967295L); jM8892k4++) {
                    dictionary.set_Item(C14114y9.m67465x1(jM8892k4), Long.valueOf(jM8895kk));
                    jM8895kk++;
                }
            }
        } else if (c1650u44 != null) {
            int iM8922ck = (c1650u44.m8922ck() & 65535) / 2;
            long jM8962x6 = (((c1650u44.m8962x6() & 4294967295L) - (c1650u44.m8947ks() & 4294967295L)) & 4294967295L) / 2;
            int i5 = 0;
            while (i5 < iM8922ck) {
                long j6 = c1650u44.m8929fa()[i5] & i2;
                int i6 = i;
                int i7 = i2;
                long j7 = c1650u44.m8957up()[i5] & i2;
                while (true) {
                    long j8 = j6 & j4;
                    if (j8 <= (j7 & j4)) {
                        if ((c1650u44.m8951rv()[i5] & i7) == 0) {
                            j = j3;
                            dictionary.set_Item(C14114y9.m67465x1(j6), Long.valueOf(((j8 + ((long) (c1650u44.m8963yj()[i5] & i7))) & j4) % 65536));
                            j2 = j4;
                        } else {
                            j = j3;
                            j2 = j4;
                            long j9 = c1650u44.m8932h4()[(int) (((((long) (((c1650u44.m8951rv()[i5] & i7) / i6) + i5)) + ((j8 - ((long) (c1650u44.m8929fa()[i5] & i7))) & j2)) & j2) - (jM8962x6 & j2))] & j2;
                            if (j9 != 0) {
                                strM67465x1 = C14114y9.m67465x1(j6);
                                objValueOf = Long.valueOf(((j9 + ((long) (c1650u44.m8963yj()[i5] & i7))) & j2) % 65536);
                            } else {
                                strM67465x1 = C14114y9.m67465x1(j6);
                                objValueOf = 0;
                            }
                            dictionary.set_Item(strM67465x1, objValueOf);
                        }
                        j6 += j;
                        j3 = j;
                        j4 = j2;
                    }
                }
                i5++;
                i = i6;
                i2 = i7;
            }
            if (dictionary.containsKey("65535")) {
                dictionary.removeItemByKey("65535");
                return dictionary;
            }
        } else if (c1650u43 != null) {
            int[] iArrM8928dy = c1650u43.m8928dy();
            C1632ix[] c1632ixArrM8921c5 = c1650u43.m8921c5();
            int[] iArrM8934jd = c1650u43.m8934jd();
            long jLongValue = ((Long) C7019kk.m27464to(c1627f9.m8777k4("maxp").get_Item("numGlyphs"), Long.TYPE)).longValue();
            for (int i8 = 0; i8 < 256; i8++) {
                int i9 = iArrM8928dy[i8];
                if ((i9 & 65535) != 0) {
                    int i10 = i9 & 65535;
                    int iM8827x1 = c1632ixArrM8921c5[i10].m8827x1() & 65535;
                    for (int i11 = 0; i11 < iM8827x1; i11++) {
                        if (c1632ixArrM8921c5[i10].m8826to() + i11 >= iArrM8934jd.length) {
                            iM8825kk = 0;
                        } else {
                            iM8825kk = iArrM8934jd[c1632ixArrM8921c5[i10].m8826to() + i11] & 65535;
                            if (iM8825kk != 0) {
                                iM8825kk += c1632ixArrM8921c5[i10].m8825kk() & 65535;
                            }
                        }
                        if (iM8825kk != 0 && iM8825kk < (jLongValue & 4294967295L)) {
                            dictionary.set_Item(C14057f9.m66591x1(((i8 << 8) | ((c1632ixArrM8921c5[i10].m8824k4() & 65535) + i11)) % 65535), Integer.valueOf(iM8825kk));
                        }
                    }
                } else if (i8 < c1650u43.m8948m9() && i8 >= (c1632ixArrM8921c5[0].m8824k4() & 65535) && i8 < (c1632ixArrM8921c5[0].m8824k4() & 65535) + (c1632ixArrM8921c5[0].m8827x1() & 65535)) {
                    if ((i8 - (c1632ixArrM8921c5[0].m8824k4() & 65535)) + c1632ixArrM8921c5[0].m8826to() >= iArrM8934jd.length) {
                        iM8825kk2 = 0;
                    } else {
                        iM8825kk2 = iArrM8934jd[(i8 - (c1632ixArrM8921c5[0].m8824k4() & 65535)) + c1632ixArrM8921c5[0].m8826to()] & 65535;
                        if (iM8825kk2 != 0) {
                            iM8825kk2 += c1632ixArrM8921c5[0].m8825kk() & 65535;
                        }
                    }
                    if (iM8825kk2 != 0 && iM8825kk2 < (jLongValue & 4294967295L)) {
                        dictionary.set_Item(C14057f9.m66591x1(i8), Integer.valueOf(iM8825kk2));
                    }
                }
            }
        }
        return dictionary;
    }

    @Override // com.aspose.slides.internal.p036b6.C1634k4
    /* JADX INFO: renamed from: k4 */
    public Dictionary<String, Object> mo8703k4(C1636kp c1636kp, C1627f9 c1627f9) {
        C1636kp c1636kp2 = c1636kp;
        long j = this.f6313x1;
        c1636kp2.m8868k4(j);
        List<C1650u4> list = new List<>();
        c1636kp2.m8874to();
        int iM8874to = c1636kp2.m8874to() & 65535;
        int i = 0;
        long jM8865k4 = c1636kp2.m8865k4();
        while (i < iM8874to) {
            long j2 = jM8865k4 & 4294967295L;
            C1650u4 c1650u4 = new C1650u4(c1636kp2.m8876x1(new C14093tq<>(Long.valueOf(jM8865k4))), c1636kp2.m8876x1(new C14093tq<>(Long.valueOf(2 + j2))), c1636kp2.m8875to(new C14093tq<>(Long.valueOf(4 + j2))));
            m8977k4(c1636kp2, c1627f9, c1650u4, j);
            list.addItem(c1650u4);
            jM8865k4 = (j2 + 8) & 4294967295L;
            i++;
            c1636kp2 = c1636kp;
        }
        return m8976k4(list, c1627f9);
    }

    /* JADX INFO: renamed from: k4 */
    private void m8977k4(C1636kp c1636kp, C1627f9 c1627f9, C1650u4 c1650u4, long j) {
        long j2;
        long j3;
        long j4;
        long j5 = 4294967295L;
        long jM8943kk = (j & 4294967295L) + (c1650u4.m8943kk() & 4294967295L);
        c1650u4.m8936k4(c1636kp.m8876x1(new C14093tq<>(Long.valueOf(jM8943kk & 4294967295L))));
        int i = 65535;
        if ((c1650u4.m8952to() & 65535) == 0) {
            c1650u4.m8937k4(c1636kp.m8874to() & 65535);
            c1650u4.m8960x1(c1636kp.m8874to() & 65535);
            List list = new List();
            int iM8923du = ((int) c1650u4.m8923du()) - 6;
            for (int i2 = 0; i2 < iM8923du; i2++) {
                list.addItem(new Long(c1636kp.m8870kk() & 255));
            }
            c1650u4.m8940k4(C11292du.m54269kk(list));
            return;
        }
        if ((c1650u4.m8952to() & 65535) == 2) {
            c1650u4.m8937k4(c1636kp.m8874to() & 65535);
            c1650u4.m8960x1(c1636kp.m8874to() & 65535);
            int[] iArr = new int[256];
            short s = -1;
            short s2 = 0;
            int i3 = 0;
            while (s2 < 256) {
                int iM8874to = (c1636kp.m8874to() & 65535) / 8;
                int i4 = iM8874to & 65535;
                iArr[s2] = i4;
                long j6 = j5;
                if ((iM8874to & 65535) > (i3 & 65535)) {
                    s = s2;
                    i3 = i4;
                }
                s2 = (short) (s2 + 1);
                j5 = j6;
            }
            long j7 = j5;
            int i5 = i3 & 65535;
            C1632ix[] c1632ixArr = new C1632ix[i5];
            int i6 = 0;
            while (i6 <= i5) {
                c1632ixArr[i6] = new C1632ix(c1636kp.m8874to(), c1636kp.m8874to(), c1636kp.m8874to(), (((c1636kp.m8874to() & r30) - ((i5 - i6) * 8)) - 2) / 2);
                i6++;
                i = i;
            }
            long jM8923du = ((((((jM8943kk & j7) + (c1650u4.m8923du() & j7)) & j7) - (c1636kp.m8865k4() & j7)) & j7) / 2) & j7;
            int[] iArr2 = new int[(int) jM8923du];
            for (int i7 = 0; i7 < jM8923du; i7++) {
                iArr2[i7] = c1636kp.m8874to();
            }
            c1650u4.m8939k4(iArr);
            c1650u4.m8938k4(s);
            c1650u4.m8941k4(c1632ixArr);
            c1650u4.m8961x1(iArr2);
            return;
        }
        if ((c1650u4.m8952to() & 65535) == 4) {
            c1650u4.m8937k4(c1636kp.m8874to() & 65535);
            c1650u4.m8960x1(c1636kp.m8874to() & 65535);
            c1650u4.m8959x1(c1636kp.m8874to());
            c1650u4.m8944kk(c1636kp.m8874to());
            c1650u4.m8953to(c1636kp.m8874to());
            c1650u4.m8924du(c1636kp.m8874to());
            int iM8922ck = (c1650u4.m8922ck() & 65535) / 2;
            int[] iArr3 = new int[iM8922ck];
            for (int i8 = 0; i8 < iM8922ck; i8++) {
                iArr3[i8] = c1636kp.m8874to();
            }
            c1650u4.m8955to(iArr3);
            c1650u4.m8930h4(c1636kp.m8874to());
            int[] iArr4 = new int[iM8922ck];
            for (int i9 = 0; i9 < iM8922ck; i9++) {
                iArr4[i9] = c1636kp.m8874to();
            }
            c1650u4.m8946kk(iArr4);
            int[] iArr5 = new int[iM8922ck];
            for (int i10 = 0; i10 < iM8922ck; i10++) {
                iArr5[i10] = c1636kp.m8874to();
            }
            c1650u4.m8926du(iArr5);
            c1650u4.m8945kk(c1636kp.m8865k4());
            int[] iArr6 = new int[iM8922ck];
            for (int i11 = 0; i11 < iM8922ck; i11++) {
                iArr6[i11] = c1636kp.m8874to();
            }
            c1650u4.m8931h4(iArr6);
            long jM8923du2 = (((c1650u4.m8923du() & 4294967295L) - (((c1636kp.m8865k4() & 4294967295L) - (jM8943kk & 4294967295L)) & 4294967295L)) & 4294967295L) / 2;
            c1650u4.m8954to(c1636kp.m8865k4());
            long j8 = jM8923du2 & 4294967295L;
            long[] jArr = new long[(int) j8];
            for (int i12 = 0; i12 < j8; i12++) {
                jArr[i12] = c1636kp.m8874to() & 65535;
            }
            c1650u4.m8940k4(jArr);
            return;
        }
        if ((c1650u4.m8952to() & 65535) == 6) {
            c1650u4.m8937k4(c1636kp.m8874to() & 65535);
            c1650u4.m8960x1(c1636kp.m8874to() & 65535);
            c1650u4.m8949m9(c1636kp.m8874to());
            c1650u4.m8927dy(c1636kp.m8874to());
            c1650u4.m8954to(c1636kp.m8865k4());
            int iM8950ne = c1650u4.m8950ne() & 65535;
            long[] jArr2 = new long[iM8950ne];
            for (int i13 = 0; i13 < iM8950ne; i13++) {
                jArr2[i13] = c1636kp.m8874to() & 65535;
            }
            c1650u4.m8940k4(jArr2);
            return;
        }
        if ((c1650u4.m8952to() & 65535) == 12) {
            c1650u4.m8920c5(c1636kp.m8874to());
            c1650u4.m8937k4(c1636kp.m8860h4());
            c1650u4.m8960x1(c1636kp.m8860h4());
            c1650u4.m8925du(c1636kp.m8860h4());
            long jM8933ix = c1650u4.m8933ix() & 4294967295L;
            C1640ne[] c1640neArr = new C1640ne[(int) jM8933ix];
            for (int i14 = 0; i14 < jM8933ix; i14++) {
                long jM8860h4 = c1636kp.m8860h4();
                long jM8860h42 = c1636kp.m8860h4();
                long jM8860h43 = c1636kp.m8860h4();
                C1640ne c1640ne = new C1640ne(jM8860h4, jM8860h42);
                c1640ne.m8896kk(jM8860h43);
                c1640neArr[i14] = c1640ne;
            }
            c1650u4.m8942k4(c1640neArr);
            return;
        }
        if ((c1650u4.m8952to() & 65535) != 14) {
            C6005k4.m24259k4(C14113y2.m67408k4("not support cmap format:", C14081nv.m67070x1(c1650u4.m8952to())));
            return;
        }
        c1650u4.m8937k4(c1636kp.m8860h4());
        long jM8860h44 = c1636kp.m8860h4();
        List list2 = new List();
        int i15 = 0;
        while (i15 < (jM8860h44 & 4294967295L)) {
            long jM8857du = c1636kp.m8857du();
            long jM8860h45 = c1636kp.m8860h4();
            long jM8860h46 = c1636kp.m8860h4();
            long j9 = jM8860h45 & 4294967295L;
            if (j9 != 0) {
                long jM8875to = c1636kp.m8875to(new C14093tq<>(Long.valueOf((jM8943kk & 4294967295L) + j9)));
                int i16 = 0;
                while (i16 < (jM8875to & 4294967295L)) {
                    long jM8857du2 = c1636kp.m8857du();
                    long j10 = jM8860h44;
                    C1640ne c1640ne2 = new C1640ne(jM8857du2, ((jM8857du2 & 4294967295L) + ((long) (c1636kp.m8870kk() & 255))) & 4294967295L);
                    c1640ne2.m8898to(jM8857du);
                    list2.addItem(c1640ne2);
                    i16++;
                    jM8860h44 = j10;
                    jM8943kk = jM8943kk;
                }
                j2 = jM8860h44;
                j3 = jM8943kk;
                j4 = jM8857du;
            } else {
                j2 = jM8860h44;
                j3 = jM8943kk;
                j4 = jM8857du;
            }
            long j11 = jM8860h46 & 4294967295L;
            if (j11 != 0) {
                long jM8875to2 = c1636kp.m8875to(new C14093tq<>(Long.valueOf((j3 & 4294967295L) + j11)));
                for (int i17 = 0; i17 < (jM8875to2 & 4294967295L); i17++) {
                    C1640ne c1640ne3 = new C1640ne(c1636kp.m8857du(), c1636kp.m8874to() & 65535);
                    c1640ne3.m8898to(j4);
                    list2.addItem(c1640ne3);
                }
            }
            i15++;
            jM8860h44 = j2;
            jM8943kk = j3;
        }
        c1650u4.m8942k4((C1640ne[]) list2.toArray(new C1640ne[0]));
    }

    /* JADX INFO: renamed from: k4 */
    private void m8978k4(C1655vh c1655vh, int i, int i2, long j) {
        c1655vh.m8995k4(i);
        c1655vh.m8995k4(i2);
        c1655vh.m8999k4(j);
    }

    @Override // com.aspose.slides.internal.p036b6.C1634k4
    /* JADX INFO: renamed from: k4 */
    public void mo8702k4(C1655vh c1655vh, C1627f9 c1627f9) {
        C1653uz c1653uz;
        C1655vh c1655vh2;
        boolean zBooleanValue = ((Boolean) C7019kk.m27464to(c1627f9.m8775h4().get_Item("cmap").m8837k4("hasGLyphsOver2Bytes"), Boolean.TYPE)).booleanValue();
        c1655vh.m8995k4(0);
        c1655vh.m8995k4(zBooleanValue ? 4 : 3);
        long j = (zBooleanValue ? 32 : 24) + 4;
        long j2 = j & 4294967295L;
        Object objM8837k4 = c1627f9.m8775h4().get_Item("cmap").m8837k4("format4Size");
        Class cls = Long.TYPE;
        long jLongValue = ((Long) C7019kk.m27464to(objM8837k4, cls)).longValue();
        long jLongValue2 = ((Long) C7019kk.m27464to(c1627f9.m8775h4().get_Item("cmap").m8837k4("format0Size"), cls)).longValue();
        m8978k4(c1655vh, 0, 3, j2);
        long j3 = ((j & 4294967295L) + (jLongValue & 4294967295L)) & 4294967295L;
        m8978k4(c1655vh, 1, 0, j3);
        m8978k4(c1655vh, 3, 1, j2);
        if (zBooleanValue) {
            c1653uz = this;
            c1655vh2 = c1655vh;
            c1653uz.m8978k4(c1655vh2, 3, 10, (j3 + (jLongValue2 & 4294967295L)) & 4294967295L);
        } else {
            c1653uz = this;
            c1655vh2 = c1655vh;
        }
        c1653uz.m8979k4(c1655vh2, (C1640ne[]) C7019kk.m27458kk(c1627f9.m8775h4().get_Item("cmap").m8837k4("format4Segments"), C1640ne[].class));
        c1653uz.m8980k4(c1655vh2, (C1657wl[]) C7019kk.m27458kk(c1627f9.m8775h4().get_Item("cmap").m8837k4("format0Segments"), C1657wl[].class));
        if (zBooleanValue) {
            c1653uz.m8983x1(c1655vh2, (C1640ne[]) C7019kk.m27458kk(c1627f9.m8775h4().get_Item("cmap").m8837k4("format12Segments"), C1640ne[].class));
        }
    }

    /* JADX INFO: renamed from: k4 */
    private void m8979k4(C1655vh c1655vh, C1640ne[] c1640neArr) {
        c1655vh.m8995k4(4);
        c1655vh.m8995k4(((c1640neArr.length * 8) + 24) & 65535);
        c1655vh.m8995k4(0);
        int length = c1640neArr.length + 1;
        double dM67490kk = C14116yg.m67490kk(C14116yg.m67511yj(length) / C14116yg.m67511yj(2.0d));
        double dM67469du = C14116yg.m67469du(2.0d, dM67490kk) * 2.0d;
        int i = length * 2;
        c1655vh.m8995k4(i & 65535);
        c1655vh.m8995k4(C7019kk.m27457kk(Double.valueOf(dM67469du), 14));
        c1655vh.m8995k4(C7019kk.m27457kk(Double.valueOf(dM67490kk), 14));
        c1655vh.m8995k4(C7019kk.m27457kk(Double.valueOf(((double) i) - dM67469du), 14));
        for (C1640ne c1640ne : c1640neArr) {
            c1655vh.m8995k4((int) (C18177fb.f54859s & c1640ne.m8899x1()));
        }
        c1655vh.m8995k4(65535);
        c1655vh.m8995k4(0);
        for (C1640ne c1640ne2 : c1640neArr) {
            c1655vh.m8995k4((int) (c1640ne2.m8892k4() & C18177fb.f54859s));
        }
        c1655vh.m8995k4(65535);
        for (C1640ne c1640ne3 : c1640neArr) {
            c1655vh.m8995k4(c1640ne3.m8897to() & 65535);
        }
        c1655vh.m8995k4(1);
        int length2 = c1640neArr.length;
        int i2 = 0;
        while (true) {
            c1655vh.m8995k4(0);
            if (i2 >= length2) {
                return;
            } else {
                i2++;
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    private void m8980k4(C1655vh c1655vh, C1657wl[] c1657wlArr) {
        c1655vh.m8995k4(0);
        c1655vh.m8995k4(StyleIdentifier.SUBTLE_REFERENCE);
        c1655vh.m8995k4(0);
        int iM9025x1 = -1;
        if (c1657wlArr.length > 0) {
            C1635kk c1635kk = new C1635kk(C1657wl.class, AbstractC14092to.m67204k4((Object[]) c1657wlArr));
            while (true) {
                C1657wl c1657wl = (C1657wl) c1635kk.m8849kk();
                if (c1657wl == null) {
                    break;
                }
                while (true) {
                    iM9025x1++;
                    if (iM9025x1 < (c1657wl.m9025x1() & 4294967295L)) {
                        c1655vh.m8989k4((byte) 0);
                    }
                }
                c1655vh.m8989k4((byte) c1657wl.m9023k4());
                iM9025x1 = (int) c1657wl.m9025x1();
            }
        }
        while (true) {
            iM9025x1++;
            if (iM9025x1 >= 256) {
                return;
            } else {
                c1655vh.m8989k4((byte) 0);
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    private C1640ne[] m8981k4(List<C1657wl> list, int i) {
        int iM8975k4;
        List list2 = new List();
        C1640ne c1640ne = new C1640ne();
        List.Enumerator<C1657wl> it = list.iterator();
        C1657wl c1657wl = null;
        while (it.hasNext()) {
            try {
                C1657wl next = it.next();
                if (i == 0 || (next.m9025x1() & 4294967295L) <= i) {
                    if (c1657wl == null || (next.m9025x1() & 4294967295L) != (((c1657wl.m9025x1() & 4294967295L) + 1) & 4294967295L) || (next.m9023k4() & 4294967295L) != (((c1657wl.m9023k4() & 4294967295L) + 1) & 4294967295L)) {
                        if (c1657wl != null) {
                            c1640ne.m8900x1(c1657wl.m9025x1());
                            list2.addItem(c1640ne);
                            c1640ne = new C1640ne();
                            c1640ne.m8894k4(next.m9025x1());
                            c1640ne.m8896kk(next.m9023k4());
                            iM8975k4 = m8975k4((int) ((next.m9023k4() & 4294967295L) - (4294967295L & next.m9025x1())));
                        } else {
                            c1640ne.m8894k4(next.m9025x1());
                            c1640ne.m8896kk(next.m9023k4());
                            iM8975k4 = m8975k4((int) ((next.m9023k4() & 4294967295L) - (4294967295L & next.m9025x1())));
                        }
                        c1640ne.m8893k4(iM8975k4);
                    }
                    c1657wl = next;
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
        if (c1657wl != null) {
            c1640ne.m8900x1(c1657wl.m9025x1());
            list2.addItem(c1640ne);
        }
        return (C1640ne[]) list2.toArray(new C1640ne[0]);
    }

    /* JADX INFO: renamed from: k4 */
    private C1657wl[] m8982k4(List<C1657wl> list) {
        List list2 = new List();
        List.Enumerator<C1657wl> it = list.iterator();
        while (it.hasNext()) {
            try {
                C1657wl next = it.next();
                if ((next.m9025x1() & 4294967295L) < 256) {
                    C1657wl c1657wl = new C1657wl();
                    c1657wl.m9026x1(next.m9025x1());
                    c1657wl.m9024k4(next.m9023k4());
                    list2.addItem(c1657wl);
                }
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        list2.sort();
        return (C1657wl[]) list2.toArray(new C1657wl[0]);
    }
}
