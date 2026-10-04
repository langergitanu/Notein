package com.aspose.slides.internal.p060ca;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.SortedList;
import com.aspose.slides.internal.p060ca.C2271r5;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.C14058fa;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.C14116yg;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.ca.vt */
/* JADX INFO: loaded from: classes3.dex */
public class C2340vt {

    /* JADX INFO: renamed from: k4 */
    private byte[] f8116k4;

    /* JADX INFO: renamed from: kk */
    private byte[] f8117kk;

    /* JADX INFO: renamed from: x1 */
    private byte[] f8118x1;

    public C2340vt(C2292sl c2292sl) {
        this.f8116k4 = C2238p4.m11227k4(c2292sl.f7903x1);
        this.f8118x1 = C2238p4.m11227k4(c2292sl.f7901kk);
        this.f8117kk = C2238p4.m11227k4(c2292sl.f7902to);
    }

    /* JADX INFO: renamed from: k4 */
    private static long m11563k4(C2364x6 c2364x6, int i) {
        long jM11674to = 0;
        for (int i2 = 0; i2 < i; i2 += 4) {
            jM11674to = ((jM11674to & 4294967295L) + (c2364x6.m11674to() & 4294967295L)) & 4294967295L;
        }
        return jM11674to;
    }

    /* JADX INFO: renamed from: x1 */
    private byte[] m11566x1(C2056dv[] c2056dvArr) {
        long j;
        long j2;
        int length = (c2056dvArr.length * 16) + 12;
        int length2 = c2056dvArr.length;
        int i = 0;
        while (true) {
            j = 4294967292L;
            j2 = 1;
            if (i >= length2) {
                break;
            }
            length += (int) (4294967292L & ((((c2056dvArr[i].f7101yj.f7569to & 4294967295L) + 4) & 4294967295L) - 1));
            i++;
        }
        byte[] bArr = new byte[length];
        int length3 = (c2056dvArr.length * 16) + 12;
        C2364x6 c2364x6 = new C2364x6(bArr);
        int length4 = c2056dvArr.length;
        int i2 = 0;
        boolean z = false;
        while (i2 < length4) {
            long j3 = j;
            C2056dv c2056dv = c2056dvArr[i2];
            long j4 = j2;
            if ("CFF ".equals(c2056dv.f7101yj.f7567k4)) {
                z = true;
            }
            c2056dv.f7101yj.f7568kk = ((long) length3) & 4294967295L;
            c2364x6.m11671k4(length3);
            C14058fa.m66593k4(AbstractC14092to.m67208k4((Object) c2056dv.f7100ks), 0, AbstractC14092to.m67208k4((Object) bArr), length3, c2056dv.f7100ks.length);
            C2175ld c2175ld = c2056dv.f7101yj;
            c2175ld.f7570x1 = m11563k4(c2364x6, (int) c2175ld.f7569to);
            length3 += (int) (((((c2056dv.f7101yj.f7569to & 4294967295L) + 4) & 4294967295L) - j4) & j3);
            i2++;
            j = j3;
            j2 = j4;
        }
        int iM27457kk = C7019kk.m27457kk(Double.valueOf(C14116yg.m67494ks(c2056dvArr.length) / C14116yg.m67494ks(2.0d)), 14);
        int iM27457kk2 = C7019kk.m27457kk(Double.valueOf(C14116yg.m67469du(2.0d, iM27457kk & 65535)), 14);
        C2214ne c2214ne = new C2214ne(bArr);
        c2214ne.m11174x1(z ? 1330926671 : 65536);
        c2214ne.m11173kk(c2056dvArr.length & 65535);
        int i3 = iM27457kk2 & 65535;
        c2214ne.m11173kk((i3 * 16) & 65535);
        c2214ne.m11173kk(iM27457kk);
        c2214ne.m11173kk(((c2056dvArr.length - i3) * 16) & 65535);
        SortedList sortedList = new SortedList();
        for (C2056dv c2056dv2 : c2056dvArr) {
            sortedList.addItem(Long.valueOf(C2335ve.m11557k4(c2056dv2.f7101yj.f7567k4)), c2056dv2);
        }
        IGenericEnumerator<T> it = sortedList.getKeys().iterator();
        C2358x0 c2358x0 = null;
        while (it.hasNext()) {
            try {
                Long l = (Long) C7019kk.m27464to(it.next(), Long.TYPE);
                l.longValue();
                C2056dv c2056dv3 = (C2056dv) sortedList.get_Item(l);
                c2214ne.m11171k4(C2335ve.m11557k4(c2056dv3.f7101yj.f7567k4));
                c2214ne.m11171k4(c2056dv3.f7101yj.f7570x1);
                c2214ne.m11171k4(c2056dv3.f7101yj.f7568kk);
                c2214ne.m11171k4(c2056dv3.f7101yj.f7569to);
                if ("head".equals(c2056dv3.f7101yj.f7567k4)) {
                    c2358x0 = (C2358x0) c2056dv3;
                }
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        c2214ne.m11170k4((int) ((c2358x0.f7101yj.f7568kk & 4294967295L) + 8));
        c2364x6.m11671k4(0);
        c2214ne.m11171k4((2981146554L - (m11563k4(c2364x6, c2364x6.m11675x1()) & 4294967295L)) & 4294967295L);
        return bArr;
    }

    /* JADX INFO: renamed from: k4 */
    public final byte[] m11567k4() {
        return m11566x1(m11564k4(new C2071en(this.f8116k4)));
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0116 A[SYNTHETIC] */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private C2056dv[] m11564k4(C2071en c2071en) {
        C2056dv[] c2056dvArr;
        C2056dv[] c2056dvArr2 = new C2056dv[c2071en.f7176x1];
        C2175ld[] c2175ldArr = c2071en.f7172h4;
        int length = c2175ldArr.length;
        C2312tu c2312tu = null;
        C2169kw c2169kw = null;
        C2358x0 c2358x0 = null;
        C2390yk c2390yk = null;
        int i = 0;
        boolean z = false;
        int i2 = 0;
        boolean z2 = false;
        int i3 = 0;
        int i4 = 0;
        boolean z3 = false;
        int i5 = 0;
        int i6 = 0;
        while (true) {
            C2175ld[] c2175ldArr2 = c2175ldArr;
            c2056dvArr = c2056dvArr2;
            if (i >= length) {
                break;
            }
            int i7 = length;
            C2175ld c2175ld = c2175ldArr2[i];
            int i8 = i;
            boolean z4 = z;
            int i9 = (int) c2175ld.f7569to;
            byte[] bArr = new byte[i9];
            int i10 = i2;
            int i11 = i3;
            int i12 = i4;
            boolean z5 = z3;
            C14058fa.m66593k4(AbstractC14092to.m67208k4((Object) this.f8116k4), (int) c2175ld.f7568kk, AbstractC14092to.m67208k4((Object) bArr), 0, i9);
            if ("head".equals(c2175ld.f7567k4)) {
                C2358x0 c2358x02 = new C2358x0(bArr);
                c2056dvArr[i11] = c2358x02;
                c2358x0 = c2358x02;
            } else {
                if ("loca".equals(c2175ld.f7567k4)) {
                    i2 = i10;
                    i6 = i11;
                } else if ("cvt ".equals(c2175ld.f7567k4)) {
                    c2056dvArr[i11] = new C2056dv(c2175ld.f7567k4, C2262qk.m11292k4(bArr));
                } else if ("maxp".equals(c2175ld.f7567k4)) {
                    C2169kw c2169kw2 = new C2169kw(bArr);
                    c2056dvArr[i11] = c2169kw2;
                    c2169kw = c2169kw2;
                } else if ("hdmx".equals(c2175ld.f7567k4)) {
                    z2 = true;
                    i2 = i10;
                    i4 = i11;
                    if (c2056dvArr[i11] == null) {
                        c2056dvArr[i11] = new C2056dv(c2175ld.f7567k4, bArr);
                    }
                    i3 = i11 + 1;
                    i = i8 + 1;
                    c2175ldArr = c2175ldArr2;
                    c2056dvArr2 = c2056dvArr;
                    length = i7;
                    z = z4;
                    z3 = z5;
                } else if ("hhea".equals(c2175ld.f7567k4)) {
                    C2312tu c2312tu2 = new C2312tu(bArr);
                    c2056dvArr[i11] = c2312tu2;
                    c2312tu = c2312tu2;
                } else if ("hmtx".equals(c2175ld.f7567k4)) {
                    z4 = true;
                    i2 = i11;
                } else if ("glyf".equals(c2175ld.f7567k4)) {
                    z5 = true;
                    i2 = i10;
                    i5 = i11;
                } else if ("VDMX".equals(c2175ld.f7567k4)) {
                    c2056dvArr[i11] = new C2056dv(c2175ld.f7567k4, C2157k8.m10912k4(bArr));
                } else if ("OS/2".equals(c2175ld.f7567k4)) {
                    C2390yk c2390yk2 = new C2390yk(bArr);
                    c2056dvArr[i11] = c2390yk2;
                    c2390yk = c2390yk2;
                }
                i4 = i12;
                if (c2056dvArr[i11] == null) {
                }
                i3 = i11 + 1;
                i = i8 + 1;
                c2175ldArr = c2175ldArr2;
                c2056dvArr2 = c2056dvArr;
                length = i7;
                z = z4;
                z3 = z5;
            }
            i2 = i10;
            i4 = i12;
            if (c2056dvArr[i11] == null) {
            }
            i3 = i11 + 1;
            i = i8 + 1;
            c2175ldArr = c2175ldArr2;
            c2056dvArr2 = c2056dvArr;
            length = i7;
            z = z4;
            z3 = z5;
        }
        int i13 = i2;
        int i14 = i4;
        boolean z6 = z3;
        if (z) {
            c2056dvArr[i13] = new C1995aa(c2312tu.f7995m9 & 65535, c2056dvArr[i13].f7100ks);
        }
        if (z2) {
            c2056dvArr[i14] = new C2056dv("hdmx", C2273r9.m11337k4((C1995aa) c2056dvArr[i13], c2056dvArr[i14].f7100ks, c2169kw.f7531x1, c2358x0.f8198to));
        }
        c2358x0.m11638k4(z2);
        if (z6) {
            C2271r5.x1 x1VarM11330k4 = new C2271r5(c2056dvArr[i5].f7100ks, this.f8118x1, this.f8117kk).m11330k4(65535 & c2169kw.f7531x1, (C1995aa) c2056dvArr[i13]);
            c2056dvArr[i6] = new C2056dv("loca", x1VarM11330k4.f7821kk);
            c2056dvArr[i5] = new C2056dv("glyf", x1VarM11330k4.f7820k4);
            c2358x0.m11633du(x1VarM11330k4.f7825x1 ? (short) 1 : (short) 0);
            c2358x0.m11639kk(x1VarM11330k4.f7823to);
            c2358x0.m11640to(x1VarM11330k4.f7815du);
            c2358x0.m11637k4(x1VarM11330k4.f7818h4);
            c2358x0.m11642x1(x1VarM11330k4.f7822m9);
            c2169kw.m10991x1(x1VarM11330k4.f7813c5);
            c2169kw.m10990k4(x1VarM11330k4.f7816dy);
            c2312tu.m11461k4(x1VarM11330k4.f7817fa);
            c2312tu.m11463kk(x1VarM11330k4.f7819jd);
            c2312tu.m11464to(x1VarM11330k4.f7814ck);
            c2312tu.m11459du(x1VarM11330k4.f7824up);
            short sM11460k4 = c2312tu.m11460k4();
            short s = x1VarM11330k4.f7815du;
            if (sM11460k4 > s) {
                c2312tu.m11462k4(s);
            }
            short sM11465x1 = c2312tu.m11465x1();
            short s2 = x1VarM11330k4.f7822m9;
            if (sM11465x1 < s2) {
                c2312tu.m11466x1(s2);
            }
        }
        if (c2390yk.m11773x1() > 0) {
            c2390yk.m11772k4(c2358x0.m11641x1());
        }
        return m11565k4(c2056dvArr);
    }

    /* JADX INFO: renamed from: k4 */
    private static C2056dv[] m11565k4(C2056dv[] c2056dvArr) {
        String[] strArr = {"head", "hhea", "maxp", "OS/2", "hmtx", "LTSH", "VDMX", "hdmx", "cmap", "fpgm", "prep", "cvt ", "loca", "glyf", "kern", "name", "post", "gasp"};
        C2056dv[] c2056dvArr2 = new C2056dv[c2056dvArr.length];
        int i = 0;
        for (int i2 = 0; i2 < 18; i2++) {
            String str = strArr[i2];
            int i3 = 0;
            while (true) {
                if (i3 >= c2056dvArr.length) {
                    break;
                }
                if (C14113y2.m67363du(c2056dvArr[i3].f7101yj.f7567k4, str)) {
                    c2056dvArr2[i] = c2056dvArr[i3];
                    i++;
                    break;
                }
                i3++;
            }
        }
        for (int i4 = 0; i4 < c2056dvArr.length; i4++) {
            String str2 = c2056dvArr[i4].f7101yj.f7567k4;
            int i5 = 0;
            while (true) {
                if (i5 >= i) {
                    c2056dvArr2[i] = c2056dvArr[i4];
                    i++;
                    break;
                }
                if (C14113y2.m67363du(str2, c2056dvArr2[i5].f7101yj.f7567k4)) {
                    break;
                }
                i5++;
            }
        }
        return c2056dvArr2;
    }
}
