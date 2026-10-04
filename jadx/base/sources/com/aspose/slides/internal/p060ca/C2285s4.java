package com.aspose.slides.internal.p060ca;

import com.aspose.slides.C22208OooOo0;
import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.EndOfStreamException;
import com.aspose.slides.internal.p060ca.C2068ei;
import com.aspose.slides.internal.p080dd.C3152yj;
import com.aspose.slides.internal.p314oc.AbstractC7020m9;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.C14116yg;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.ca.s4 */
/* JADX INFO: loaded from: classes3.dex */
public class C2285s4 extends C2236ov {

    /* JADX INFO: renamed from: k4 */
    private List<byte[]> f7853k4;

    /* JADX INFO: renamed from: x1 */
    private Dictionary<String, Integer> f7854x1;

    /* JADX INFO: renamed from: com.aspose.slides.internal.ca.s4$k4 */
    public static class k4 extends AbstractC7020m9<k4> {

        /* JADX INFO: renamed from: k4 */
        public byte f7855k4;

        /* JADX INFO: renamed from: kk */
        public int f7856kk;

        /* JADX INFO: renamed from: x1 */
        public int f7857x1;

        /* JADX INFO: renamed from: x1 */
        private boolean m11373x1(k4 k4Var) {
            return k4Var.f7855k4 == this.f7855k4 && k4Var.f7857x1 == this.f7857x1 && k4Var.f7856kk == this.f7856kk;
        }

        public Object clone() {
            return Clone();
        }

        public boolean equals(Object obj) {
            if (C14067j2.m66729x1(null, obj)) {
                return false;
            }
            if (C14067j2.m66729x1(this, obj)) {
                return true;
            }
            if (obj instanceof k4) {
                return m11373x1((k4) obj);
            }
            return false;
        }

        @Override // com.aspose.slides.p559ms.System.AbstractC14079na
        /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
        public k4 Clone() {
            k4 k4Var = new k4();
            CloneTo(k4Var);
            return k4Var;
        }

        @Override // com.aspose.slides.p559ms.System.AbstractC14079na
        /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
        public void CloneTo(k4 k4Var) {
            k4Var.f7855k4 = this.f7855k4;
            k4Var.f7857x1 = this.f7857x1;
            k4Var.f7856kk = this.f7856kk;
        }
    }

    /* JADX INFO: renamed from: com.aspose.slides.internal.ca.s4$x1 */
    public static class x1 {

        /* JADX INFO: renamed from: k4 */
        private List<k4> f7858k4;

        private x1() {
            this.f7858k4 = new List<>();
        }

        /* JADX INFO: renamed from: k4 */
        public final int m11376k4() {
            return this.f7858k4.size();
        }

        /* JADX INFO: renamed from: k4 */
        public final k4 m11377k4(int i) {
            return this.f7858k4.get_Item(i);
        }

        /* JADX INFO: renamed from: k4 */
        public final void m11378k4(k4 k4Var) {
            this.f7858k4.addItem(k4Var.Clone());
        }
    }

    public C2285s4(C2092fz c2092fz, C2132iq c2132iq) {
        super(c2092fz, c2132iq);
        this.f7853k4 = new List<>();
        this.f7854x1 = new Dictionary<>();
    }

    /* JADX INFO: renamed from: kk */
    private static String m11367kk(C2068ei c2068ei) {
        if (c2068ei.m10480to() == C2068ei.k4.f7163k4) {
            return null;
        }
        return C14113y2.m67402k4("{0}-{1}", Integer.valueOf(c2068ei.m10480to().m10486k4().hashCode()), Integer.valueOf(((C2334v6) c2068ei.m10480to().m10488x1()).m11556k4()));
    }

    /* JADX INFO: renamed from: k4 */
    public C2068ei mo10130k4(int i) {
        return m11368x1(i);
    }

    /* JADX INFO: renamed from: x1 */
    public final int m11372x1(C2068ei c2068ei) {
        return this.f7854x1.get_Item(m11367kk(c2068ei)).intValue();
    }

    public C2285s4(C2377xv c2377xv, long j, long j2, long j3) {
        super(c2377xv, j, j2, j3);
        this.f7853k4 = new List<>();
        this.f7854x1 = new Dictionary<>();
    }

    /* JADX INFO: renamed from: x1 */
    private C2068ei m11368x1(int i) {
        C2068ei c2068ei;
        C2212n9 c2212n9 = new C2212n9(!m11217b3() ? m11223yd().mo11249k4(i) : new C2350wl(this.f7853k4.get_Item(i)));
        try {
            try {
                C2068ei[] c2068eiArr = {null};
                m11365k4(c2212n9, i, c2068eiArr, new int[]{0});
                c2068ei = c2068eiArr[0];
                c2068ei.m10484x1((int) m11221lr().m10572kk().m11015x1());
            } catch (EndOfStreamException e) {
                C2244ph.m11243k4(C14113y2.m67402k4("parsing of glyph#{0} failed. exception: {1}", Integer.valueOf(i), e.toString()));
                c2068ei = new C2068ei();
                c2068ei.m10484x1((int) m11221lr().m10572kk().m11015x1());
                c2068ei.m10472k4(1);
            }
            return c2068ei;
        } finally {
            c2212n9.dispose();
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m11369k4(int i, C2398z1 c2398z1) {
        int i2;
        C2212n9 c2212n9 = new C2212n9(m11223yd().mo11249k4(i));
        try {
            long jM11197k4 = m11221lr().m10550h4().mo11195k4().m11197k4(i);
            if (C14116yg.m67482k4(((int) m11221lr().m10550h4().mo11195k4().m11197k4(i + 1)) - ((int) jM11197k4)) <= 0) {
                return;
            }
            c2212n9.m11159k4(((m11222wy() & 4294967295L) + (jM11197k4 & 4294967295L)) & 4294967295L);
            if (c2212n9.m11147c5() >= 0) {
                return;
            }
            c2212n9.m11159k4(c2212n9.m11154k4() + 8);
            do {
                int iM11151fa = c2212n9.m11151fa();
                C2334v6 c2334v6 = new C2334v6(c2212n9.m11151fa() & 65535);
                if (!c2398z1.m11785x1(c2334v6)) {
                    c2398z1.m11782k4(c2334v6);
                }
                i2 = iM11151fa & 32;
                if (i2 == 0) {
                    return;
                }
                int i3 = (iM11151fa & 1) != 0 ? 4 : 2;
                if ((iM11151fa & 8) != 0) {
                    i3 += 2;
                } else if ((iM11151fa & 64) != 0) {
                    i3 += 4;
                }
                if ((iM11151fa & 128) != 0) {
                    i3 += 8;
                }
                c2212n9.m11159k4(c2212n9.m11154k4() + ((long) i3));
            } while (i2 != 0);
        } finally {
            c2212n9.dispose();
        }
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:157:0x049e  */
    /* JADX WARN: Removed duplicated region for block: B:193:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r11v0 */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v14 */
    /* JADX WARN: Type inference failed for: r11v18 */
    /* JADX WARN: Type inference failed for: r11v19 */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r11v45 */
    /* JADX WARN: Type inference failed for: r11v46 */
    /* JADX WARN: Type inference failed for: r11v47 */
    /* JADX WARN: Type inference failed for: r15v2, types: [com.aspose.slides.internal.ca.s4$x1] */
    /* JADX WARN: Type inference failed for: r24v0 */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m11370k4(C2068ei c2068ei, byte[][] bArr, boolean[] zArr) {
        int i;
        boolean z;
        int i2;
        int i3;
        Iterator it;
        ?? r11;
        C3152yj c3152yj;
        String strM11367kk = m11367kk(c2068ei);
        int i4 = 65535;
        if (strM11367kk != null && this.f7854x1.containsKey(strM11367kk)) {
            bArr[0] = this.f7853k4.get_Item(this.f7854x1.get_Item(strM11367kk).intValue() & 65535);
            zArr[0] = false;
            return;
        }
        int i5 = 1;
        if (c2068ei.m10465du() == 1) {
            byte[] bArr2 = new byte[0];
            bArr[0] = bArr2;
            this.f7853k4.addItem(bArr2);
            zArr[0] = true;
            if (strM11367kk != null) {
                this.f7854x1.set_Item(strM11367kk, Integer.valueOf(65535 & (this.f7853k4.size() - 1)));
                return;
            }
            return;
        }
        List list = new List();
        C2396yw c2396yw = (C2396yw) C7019kk.m27452k4((Object) c2068ei, C2396yw.class);
        if (c2396yw == null && m11223yd().m11704to() != null && c2068ei.m10480to() != C2068ei.k4.f7163k4 && m11223yd().m11704to() == c2068ei.m10480to().m10486k4()) {
            c3152yj = new C3152yj();
            try {
                C2362x4 c2362x4 = new C2362x4(c3152yj);
                try {
                    byte[] bArrM10487kk = c2068ei.m10480to().m10487kk();
                    bArr[0] = bArrM10487kk;
                    c2362x4.m11657k4(bArrM10487kk);
                } finally {
                }
            } finally {
            }
        } else {
            if (c2396yw == null || c2396yw.m11778x1().size() <= 0) {
                Iterator it2 = c2068ei.m10468h4().m10362k4().iterator();
                AnonymousClass1 anonymousClass1 = null;
                int i6 = 0;
                int i7 = 0;
                ?? r112 = 0;
                while (it2.hasNext()) {
                    InterfaceC2196mi interfaceC2196mi = (InterfaceC2196mi) it2.next();
                    ?? r113 = r112;
                    if (C7019kk.m27469x1(interfaceC2196mi, C2387yg.class)) {
                        i2 = i4;
                        i3 = i5;
                        it = it2;
                        r11 = anonymousClass1;
                    } else {
                        if (r112 == 0) {
                            x1 x1Var = new x1();
                            list.addItem(x1Var);
                            r113 = x1Var;
                        }
                        ?? r15 = r113;
                        C2140j6 c2140j6 = (C2140j6) C7019kk.m27452k4((Object) interfaceC2196mi, C2140j6.class);
                        if (c2140j6 != null) {
                            int[] iArr = {i6};
                            int[] iArr2 = {i7};
                            m11366k4(r15, C7019kk.m27462to(Double.valueOf(c2140j6.m10807k4()), 14), C7019kk.m27462to(Double.valueOf(c2140j6.m10810x1()), 14), (byte) 1, iArr, iArr2);
                            i6 = iArr[0];
                            i7 = iArr2[0];
                        } else {
                            C2090fu c2090fu = (C2090fu) C7019kk.m27452k4((Object) interfaceC2196mi, C2090fu.class);
                            if (c2090fu != null) {
                                int[] iArr3 = {i6};
                                int[] iArr4 = {i7};
                                m11366k4(r15, C7019kk.m27462to(Double.valueOf(c2090fu.m10534k4()), 14), C7019kk.m27462to(Double.valueOf(c2090fu.m10539x1()), 14), (byte) 1, iArr3, iArr4);
                                i6 = iArr3[0];
                                i7 = iArr4[0];
                            } else {
                                C2264qn c2264qn = (C2264qn) C7019kk.m27452k4((Object) interfaceC2196mi, C2264qn.class);
                                if (c2264qn != null) {
                                    int[] iArr5 = new int[i5];
                                    iArr5[0] = i6;
                                    i2 = i4;
                                    int[] iArr6 = new int[i5];
                                    iArr6[0] = i7;
                                    i3 = i5;
                                    it = it2;
                                    m11366k4(r15, C22208OooOo0.OooO00o((c2264qn.m11297k4() * 3.0d) + ((double) i6), 4.0d, 14), C22208OooOo0.OooO00o((c2264qn.m11304x1() * 3.0d) + ((double) i7), 4.0d, 14), (byte) 0, iArr5, iArr6);
                                    int i8 = iArr5[0];
                                    int i9 = iArr6[0];
                                    iArr5[0] = i8;
                                    iArr6[0] = i9;
                                    m11366k4(r15, C7019kk.m27462to(Double.valueOf((c2264qn.m11295h4() + (c2264qn.m11302to() * 3.0d)) / 4.0d), 14), C7019kk.m27462to(Double.valueOf((c2264qn.m11301m9() + (c2264qn.m11293du() * 3.0d)) / 4.0d), 14), (byte) 0, iArr5, iArr6);
                                    int i10 = iArr5[0];
                                    int i11 = iArr6[0];
                                    iArr5[0] = i10;
                                    iArr6[0] = i11;
                                    m11366k4(r15, C7019kk.m27462to(Double.valueOf(c2264qn.m11295h4()), 14), C7019kk.m27462to(Double.valueOf(c2264qn.m11301m9()), 14), (byte) 1, iArr5, iArr6);
                                    i6 = iArr5[0];
                                    i7 = iArr6[0];
                                }
                                r11 = r15;
                            }
                        }
                        i2 = i4;
                        i3 = i5;
                        it = it2;
                        r11 = r15;
                    }
                    i4 = i2;
                    i5 = i3;
                    it2 = it;
                    anonymousClass1 = null;
                    r112 = r11;
                }
                i = i4;
                z = i5;
                C3152yj c3152yj2 = new C3152yj();
                try {
                    C2362x4 c2362x42 = new C2362x4(c3152yj2);
                    try {
                        if (list.size() > 0) {
                            c2362x42.m11651k4((short) list.size());
                            c2362x42.m11651k4(C7019kk.m27468x1(Double.valueOf(c2068ei.m10467fa().m10418k4()), 14));
                            c2362x42.m11651k4(C7019kk.m27468x1(Double.valueOf(c2068ei.m10467fa().m10424x1()), 14));
                            c2362x42.m11651k4(C7019kk.m27468x1(Double.valueOf(c2068ei.m10467fa().m10420kk()), 14));
                            c2362x42.m11651k4(C7019kk.m27468x1(Double.valueOf(c2068ei.m10467fa().m10422to()), 14));
                            List.Enumerator it3 = list.iterator();
                            int iM11376k4 = 0;
                            while (it3.hasNext()) {
                                try {
                                    iM11376k4 += ((x1) it3.next()).m11376k4();
                                    c2362x42.m11647k4((iM11376k4 - 1) & i);
                                } catch (Throwable th) {
                                    if (C7019kk.m27456k4((Iterator) it3, (Class<IDisposable>) IDisposable.class)) {
                                        it3.dispose();
                                    }
                                    throw th;
                                }
                            }
                            if (C7019kk.m27456k4((Iterator) it3, (Class<IDisposable>) IDisposable.class)) {
                                it3.dispose();
                            }
                            c2362x42.m11647k4(0);
                            List.Enumerator it4 = list.iterator();
                            while (it4.hasNext()) {
                                try {
                                    x1 x1Var2 = (x1) it4.next();
                                    for (int i12 = 0; i12 < x1Var2.m11376k4(); i12++) {
                                        c2362x42.m11665x1(x1Var2.m11377k4(i12).Clone().f7855k4);
                                    }
                                } catch (Throwable th2) {
                                    if (C7019kk.m27456k4((Iterator) it4, (Class<IDisposable>) IDisposable.class)) {
                                        it4.dispose();
                                    }
                                    throw th2;
                                }
                            }
                            if (C7019kk.m27456k4((Iterator) it4, (Class<IDisposable>) IDisposable.class)) {
                                it4.dispose();
                            }
                            List.Enumerator it5 = list.iterator();
                            while (it5.hasNext()) {
                                try {
                                    x1 x1Var3 = (x1) it5.next();
                                    for (int i13 = 0; i13 < x1Var3.m11376k4(); i13++) {
                                        c2362x42.m11651k4((short) x1Var3.m11377k4(i13).Clone().f7857x1);
                                    }
                                } catch (Throwable th3) {
                                    if (C7019kk.m27456k4((Iterator) it5, (Class<IDisposable>) IDisposable.class)) {
                                        it5.dispose();
                                    }
                                    throw th3;
                                }
                            }
                            if (C7019kk.m27456k4((Iterator) it5, (Class<IDisposable>) IDisposable.class)) {
                                it5.dispose();
                            }
                            List.Enumerator it6 = list.iterator();
                            while (it6.hasNext()) {
                                try {
                                    x1 x1Var4 = (x1) it6.next();
                                    for (int i14 = 0; i14 < x1Var4.m11376k4(); i14++) {
                                        c2362x42.m11651k4((short) x1Var4.m11377k4(i14).Clone().f7856kk);
                                    }
                                } catch (Throwable th4) {
                                    if (C7019kk.m27456k4((Iterator) it6, (Class<IDisposable>) IDisposable.class)) {
                                        it6.dispose();
                                    }
                                    throw th4;
                                }
                            }
                            if (C7019kk.m27456k4((Iterator) it6, (Class<IDisposable>) IDisposable.class)) {
                                it6.dispose();
                            }
                        }
                        c2362x42.dispose();
                        c3152yj2.close();
                        bArr[0] = c3152yj2.toArray();
                        this.f7853k4.addItem(bArr[0]);
                        zArr[0] = z;
                        if (strM11367kk == null) {
                            this.f7854x1.set_Item(strM11367kk, Integer.valueOf((this.f7853k4.size() - 1) & i));
                            return;
                        }
                        return;
                    } catch (Throwable th5) {
                        throw th5;
                    }
                } finally {
                }
            }
            c3152yj = new C3152yj();
            try {
                C2362x4 c2362x43 = new C2362x4(c3152yj);
                try {
                    c2362x43.m11651k4((short) -1);
                    c2362x43.m11651k4(C7019kk.m27468x1(Double.valueOf(c2068ei.m10467fa().m10418k4()), 14));
                    c2362x43.m11651k4(C7019kk.m27468x1(Double.valueOf(c2068ei.m10467fa().m10424x1()), 14));
                    c2362x43.m11651k4(C7019kk.m27468x1(Double.valueOf(c2068ei.m10467fa().m10420kk()), 14));
                    c2362x43.m11651k4(C7019kk.m27468x1(Double.valueOf(c2068ei.m10467fa().m10422to()), 14));
                    int i15 = 0;
                    while (i15 < c2396yw.m11778x1().size()) {
                        C2411zm c2411zm = c2396yw.m11778x1().get_Item(i15);
                        c2362x43.m11647k4(i15 < c2396yw.m11778x1().size() - 1 ? 163 : 131);
                        c2362x43.m11647k4(this.f7854x1.get_Item(m11367kk(c2396yw.m11778x1().get_Item(i15).m11827k4())).intValue());
                        int iM27462to = C7019kk.m27462to(Double.valueOf(c2411zm.m11828x1().m11682du()), 14);
                        int iM27462to2 = C7019kk.m27462to(Double.valueOf(c2411zm.m11828x1().m11684h4()), 14);
                        c2362x43.m11651k4((short) iM27462to);
                        c2362x43.m11651k4((short) iM27462to2);
                        c2362x43.m11645k4(c2411zm.m11828x1().m11686k4());
                        c2362x43.m11645k4(c2411zm.m11828x1().m11694x1());
                        c2362x43.m11645k4(c2411zm.m11828x1().m11690kk());
                        c2362x43.m11645k4(c2411zm.m11828x1().m11692to());
                        i15++;
                    }
                    c2362x43.dispose();
                    c3152yj.close();
                    bArr[0] = c3152yj.toArray();
                } finally {
                }
            } catch (Throwable th6) {
                throw th6;
            }
        }
        c3152yj.dispose();
        i = 65535;
        z = true;
        this.f7853k4.addItem(bArr[0]);
        zArr[0] = z;
        if (strM11367kk == null) {
        }
    }

    /* JADX INFO: renamed from: k4 */
    private void m11363k4(C2212n9 c2212n9, int i, C2068ei c2068ei, long j, short s) {
        int i2;
        int i3;
        if (s == 0) {
            c2068ei.mo10475k4(C2216ni.m11177x1());
            return;
        }
        C2216ni c2216niM11176kk = C2216ni.m11176kk();
        c2068ei.mo10475k4(c2216niM11176kk);
        c2216niM11176kk.f7669k4 = s;
        c2216niM11176kk.f7673x1 = new int[s];
        for (int i4 = 0; i4 < s; i4++) {
            c2216niM11176kk.f7673x1[i4] = c2212n9.m11151fa();
        }
        int iM11151fa = c2212n9.m11151fa() & 65535;
        byte[] bArr = new byte[iM11151fa];
        for (int i5 = 0; i5 < iM11151fa; i5++) {
            bArr[i5] = c2212n9.m11148ck();
        }
        c2216niM11176kk.f7672to = 0;
        for (int i6 : c2216niM11176kk.f7673x1) {
            int i7 = i6 & 65535;
            if (c2216niM11176kk.f7672to < i7) {
                c2216niM11176kk.f7672to = i7;
            }
        }
        int i8 = c2216niM11176kk.f7672to + 1;
        c2216niM11176kk.f7672to = i8;
        c2216niM11176kk.f7671m9 = new boolean[i8];
        c2216niM11176kk.f7667dy = new boolean[i8];
        c2216niM11176kk.f7670kk = new byte[i8];
        int i9 = 0;
        while (true) {
            i2 = c2216niM11176kk.f7672to;
            if (i9 >= i2) {
                break;
            }
            byte bM11148ck = c2212n9.m11148ck();
            c2216niM11176kk.f7670kk[i9] = bM11148ck;
            if ((bM11148ck & 8) != 0) {
                int iM11148ck = c2212n9.m11148ck() & 255;
                for (int i10 = 0; i10 < iM11148ck; i10++) {
                    i9++;
                    c2216niM11176kk.f7670kk[i9] = bM11148ck;
                }
            }
            i9++;
        }
        short[] sArr = new short[i2];
        c2216niM11176kk.f7666du = new double[i2];
        int i11 = 0;
        while (true) {
            i3 = c2216niM11176kk.f7672to;
            if (i11 >= i3) {
                break;
            }
            byte b = c2216niM11176kk.f7670kk[i11];
            int i12 = b & 2;
            int i13 = b & 16;
            if (i12 != 0) {
                if (i13 != 0) {
                    sArr[i11] = (short) (c2212n9.m11148ck() & 255);
                } else {
                    sArr[i11] = (short) (-(c2212n9.m11148ck() & 255));
                }
            } else if (i13 != 0) {
                sArr[i11] = 0;
            } else {
                sArr[i11] = c2212n9.m11147c5();
            }
            double[] dArr = c2216niM11176kk.f7666du;
            if (i11 == 0) {
                dArr[i11] = sArr[i11];
            } else {
                dArr[i11] = ((double) sArr[i11]) + dArr[i11 - 1];
            }
            i11++;
        }
        short[] sArr2 = new short[i3];
        c2216niM11176kk.f7668h4 = new double[i3];
        for (int i14 = 0; i14 < c2216niM11176kk.f7672to; i14++) {
            byte b2 = c2216niM11176kk.f7670kk[i14];
            int i15 = b2 & 4;
            int i16 = b2 & 32;
            if (i15 != 0) {
                if (i16 != 0) {
                    sArr2[i14] = (short) (c2212n9.m11148ck() & 255);
                } else {
                    sArr2[i14] = (short) (-(c2212n9.m11148ck() & 255));
                }
            } else if (i16 != 0) {
                sArr2[i14] = 0;
            } else {
                sArr2[i14] = c2212n9.m11147c5();
            }
            double[] dArr2 = c2216niM11176kk.f7668h4;
            if (i14 == 0) {
                dArr2[i14] = sArr2[i14];
            } else {
                dArr2[i14] = ((double) sArr2[i14]) + dArr2[i14 - 1];
            }
        }
        long jM11154k4 = c2212n9.m11154k4();
        long j2 = j & 4294967295L;
        c2212n9.m11159k4(((m11222wy() & 4294967295L) + j2) & 4294967295L);
        c2068ei.m10474k4(new C2068ei.k4(m11223yd(), new C2334v6(i), c2212n9.m11160k4((int) ((jM11154k4 & 4294967295L) - (((m11222wy() & 4294967295L) + j2) & 4294967295L)))));
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0155 A[EDGE_INSN: B:61:0x0155->B:42:0x0155 BREAK  A[LOOP:0: B:3:0x0011->B:63:?], SYNTHETIC] */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void m11364k4(C2212n9 c2212n9, int i, int[] iArr, C2396yw c2396yw) {
        int iM11151fa;
        short sM11162m9;
        short sM11162m92;
        double dM11150dy;
        C2068ei c2068ei;
        iArr[0] = iArr[0] + 1;
        do {
            iM11151fa = c2212n9.m11151fa();
            int iM11151fa2 = c2212n9.m11151fa();
            C2372xo c2372xo = new C2372xo();
            if ((iM11151fa & 1) != 0) {
                sM11162m9 = c2212n9.m11147c5();
                sM11162m92 = c2212n9.m11147c5();
            } else {
                sM11162m9 = c2212n9.m11162m9();
                sM11162m92 = c2212n9.m11162m9();
            }
            if ((iM11151fa & 8) != 0) {
                c2372xo.m11688k4(c2212n9.m11150dy());
                dM11150dy = c2372xo.m11686k4();
            } else {
                if ((iM11151fa & 64) != 0) {
                    c2372xo.m11688k4(c2212n9.m11150dy());
                } else {
                    if ((iM11151fa & 128) != 0) {
                        c2372xo.m11688k4(c2212n9.m11150dy());
                        c2372xo.m11695x1(c2212n9.m11150dy());
                        c2372xo.m11691kk(c2212n9.m11150dy());
                    }
                    c2372xo.m11683du(C14116yg.m67502x1(C14116yg.m67475k4(c2372xo.m11686k4()), C14116yg.m67475k4(c2372xo.m11694x1())));
                    c2372xo.m11685h4(C14116yg.m67502x1(C14116yg.m67475k4(c2372xo.m11690kk()), C14116yg.m67475k4(c2372xo.m11692to())));
                    if (C14116yg.m67475k4(C14116yg.m67475k4(c2372xo.m11686k4()) - C14116yg.m67475k4(c2372xo.m11690kk())) <= 0.0d) {
                        c2372xo.m11683du(c2372xo.m11682du() * 2.0d);
                    }
                    if (C14116yg.m67475k4(C14116yg.m67475k4(c2372xo.m11690kk()) - C14116yg.m67475k4(c2372xo.m11692to())) <= 0.0d) {
                        c2372xo.m11685h4(c2372xo.m11684h4() * 2.0d);
                    }
                    if ((iM11151fa & 2) != 0) {
                        c2372xo.m11683du(c2372xo.m11682du() * ((double) sM11162m9));
                        c2372xo.m11685h4(c2372xo.m11684h4() * ((double) sM11162m92));
                    }
                    long jM11154k4 = c2212n9.m11154k4();
                    if (iArr[0] >= 50) {
                        break;
                    }
                    int i2 = iM11151fa2 & 65535;
                    if (i != i2) {
                        if (C7019kk.m27469x1(m11223yd(), C2248po.class)) {
                            AbstractC2011be abstractC2011beMo11249k4 = ((C2248po) m11223yd()).mo11249k4(i2);
                            if (abstractC2011beMo11249k4 != null) {
                                C2212n9 c2212n92 = new C2212n9(abstractC2011beMo11249k4);
                                C2068ei[] c2068eiArr = {null};
                                m11365k4(c2212n92, i2, c2068eiArr, iArr);
                                c2068ei = c2068eiArr[0];
                            } else {
                                c2068ei = null;
                            }
                        } else {
                            C2068ei[] c2068eiArr2 = {null};
                            m11365k4(c2212n9, i2, c2068eiArr2, iArr);
                            c2068ei = c2068eiArr2[0];
                        }
                        if (c2068ei != null) {
                            c2396yw.m11778x1().m10718k4(new C2411zm(c2068ei, c2372xo));
                        }
                    }
                    c2212n9.m11159k4(jM11154k4);
                }
                dM11150dy = c2212n9.m11150dy();
            }
            c2372xo.m11693to(dM11150dy);
            c2372xo.m11683du(C14116yg.m67502x1(C14116yg.m67475k4(c2372xo.m11686k4()), C14116yg.m67475k4(c2372xo.m11694x1())));
            c2372xo.m11685h4(C14116yg.m67502x1(C14116yg.m67475k4(c2372xo.m11690kk()), C14116yg.m67475k4(c2372xo.m11692to())));
            if (C14116yg.m67475k4(C14116yg.m67475k4(c2372xo.m11686k4()) - C14116yg.m67475k4(c2372xo.m11690kk())) <= 0.0d) {
            }
            if (C14116yg.m67475k4(C14116yg.m67475k4(c2372xo.m11690kk()) - C14116yg.m67475k4(c2372xo.m11692to())) <= 0.0d) {
            }
            if ((iM11151fa & 2) != 0) {
            }
            long jM11154k42 = c2212n9.m11154k4();
            if (iArr[0] >= 50) {
            }
        } while ((iM11151fa & 32) != 0);
        if ((iM11151fa & 256) != 0) {
            int iM11147c5 = c2212n9.m11147c5();
            byte[] bArr = new byte[iM11147c5];
            for (int i3 = 0; i3 < iM11147c5; i3++) {
                bArr[i3] = c2212n9.m11148ck();
            }
            ((C2216ni) c2396yw.mo10477kk()).f7665c5 = bArr;
            try {
                if (m11223yd().m11703kk().m10749k4()) {
                    C2003ar c2003ar = new C2003ar(m11221lr().m10576rv().m11349k4(), m11221lr().m10576rv().m11223yd());
                    c2003ar.m10222x1();
                    c2003ar.f6978k4.m11555k4(c2396yw);
                    new C2003ar(c2396yw, m11223yd(), c2003ar.f6978k4).m10222x1();
                }
            } catch (RuntimeException e) {
                if (C2063e8.m10448k4().m10449kk() != 1) {
                    throw e;
                }
                C2006b1.m10229k4().m10231x1().mo10237k4().mo10503k4(e);
            }
        }
        c2396yw.m10474k4(new C2068ei.k4(m11223yd(), new C2334v6(i), null));
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x01bd  */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void m11365k4(C2212n9 c2212n9, int i, C2068ei[] c2068eiArr, int[] iArr) {
        long jM11197k4;
        long j;
        double d;
        double d2;
        double d3;
        char c;
        double d4;
        double dM11596x1;
        short sM10854x1;
        long jM11197k42 = 0;
        if (C7019kk.m27469x1(m11223yd(), C2248po.class) || m11217b3()) {
            jM11197k4 = c2212n9.m11165x1() & 4294967295L;
        } else {
            jM11197k42 = m11221lr().m10550h4().mo11195k4().m11197k4(i);
            jM11197k4 = m11221lr().m10550h4().mo11195k4().m11197k4(i + 1);
        }
        C2054dt c2054dt = new C2054dt();
        if (m11221lr().m10552jd() != null) {
            if (m11221lr().m10552jd().m10846k4().m10855k4() == 1) {
                j = 4294967295L;
                dM11596x1 = m11221lr().m10552jd().m10846k4().m10856k4(0).m10851k4() & 65535;
                if (m11221lr().m10552jd().m10847x1().length > 0) {
                    sM10854x1 = m11221lr().m10552jd().m10847x1()[0];
                    double d5 = sM10854x1;
                    d2 = dM11596x1;
                    d = d5;
                }
                d2 = dM11596x1;
                d = 0.0d;
            } else {
                j = 4294967295L;
                if (i <= m11221lr().m10552jd().m10846k4().m10855k4() - 1) {
                    dM11596x1 = m11221lr().m10552jd().m10846k4().m10856k4(i).m10851k4() & 65535;
                    sM10854x1 = m11221lr().m10552jd().m10846k4().m10856k4(i).m10854x1();
                } else if (m11221lr().m10545c5() != null) {
                    dM11596x1 = m11221lr().m10545c5().m11596x1() & 65535;
                    int iM10855k4 = i - m11221lr().m10552jd().m10846k4().m10855k4();
                    if (iM10855k4 >= 0 && iM10855k4 < m11221lr().m10552jd().m10847x1().length) {
                        sM10854x1 = m11221lr().m10552jd().m10847x1()[iM10855k4];
                    }
                    d2 = dM11596x1;
                    d = 0.0d;
                }
                double d52 = sM10854x1;
                d2 = dM11596x1;
                d = d52;
            }
            if (C14116yg.m67482k4(((int) jM11197k4) - ((int) jM11197k42)) <= 0) {
                c2212n9.m11159k4(((m11222wy() & j) + (jM11197k42 & j)) & j);
                d3 = d;
                short sM11147c5 = c2212n9.m11147c5();
                short sM11152h4 = c2212n9.m11152h4();
                short sM11152h42 = c2212n9.m11152h4();
                short sM11152h43 = c2212n9.m11152h4();
                short sM11152h44 = c2212n9.m11152h4();
                C2054dt c2054dt2 = new C2054dt();
                c2054dt2.m10419k4(sM11152h4);
                c2054dt2.m10421kk(sM11152h43);
                double d6 = sM11152h42;
                c2054dt2.m10425x1(d6);
                c2054dt2.m10423to(sM11152h44);
                if (sM11147c5 > -1) {
                    C2068ei c2068ei = new C2068ei();
                    c2068eiArr[0] = c2068ei;
                    m11363k4(c2212n9, i, c2068ei, jM11197k42, sM11147c5);
                } else {
                    C2396yw c2396yw = new C2396yw();
                    c2068eiArr[0] = c2396yw;
                    m11364k4(c2212n9, i, iArr, c2396yw);
                    if (iArr[0] >= 50) {
                        c2068eiArr[0].m10472k4(1);
                    }
                }
                c2054dt = c2054dt2;
                c = 0;
                d4 = d6;
            } else {
                d3 = d;
                C2068ei c2068ei2 = new C2068ei();
                c2068eiArr[0] = c2068ei2;
                c = 0;
                c2068ei2.m10474k4(new C2068ei.k4(m11223yd(), new C2334v6(i), new byte[0]));
                c2068eiArr[0].mo10475k4(C2216ni.m11177x1());
                d4 = 0.0d;
            }
            c2068eiArr[c].m10470k4(d3);
            c2068eiArr[c].m10483x1(0.0d);
            c2068eiArr[c].m10478kk(d2);
            c2068eiArr[c].m10481to(d4);
            c2068eiArr[c].m10473k4(c2054dt);
        }
        j = 4294967295L;
        d = 0.0d;
        d2 = 0.0d;
        if (C14116yg.m67482k4(((int) jM11197k4) - ((int) jM11197k42)) <= 0) {
        }
        c2068eiArr[c].m10470k4(d3);
        c2068eiArr[c].m10483x1(0.0d);
        c2068eiArr[c].m10478kk(d2);
        c2068eiArr[c].m10481to(d4);
        c2068eiArr[c].m10473k4(c2054dt);
    }

    /* JADX INFO: renamed from: k4 */
    private static void m11366k4(x1 x1Var, int i, int i2, byte b, int[] iArr, int[] iArr2) {
        k4 k4Var = new k4();
        k4Var.f7855k4 = (byte) ((b & 255) | (k4Var.f7855k4 & 255));
        k4Var.f7857x1 = i - iArr[0];
        k4Var.f7856kk = i2 - iArr2[0];
        x1Var.m11378k4(k4Var.Clone());
        iArr[0] = i;
        iArr2[0] = i2;
    }

    @Override // com.aspose.slides.internal.p060ca.C2236ov
    /* JADX INFO: renamed from: k4 */
    public void mo10132k4(byte[][] bArr, long[] jArr, long[] jArr2) throws Throwable {
        if (!m11217b3()) {
            super.mo10132k4(bArr, jArr, jArr2);
            return;
        }
        C3152yj c3152yj = new C3152yj();
        try {
            C2362x4 c2362x4 = new C2362x4(c3152yj, true);
            try {
                List.Enumerator<byte[]> it = this.f7853k4.iterator();
                while (it.hasNext()) {
                    try {
                        c2362x4.m11657k4(it.next());
                    } finally {
                    }
                }
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
                m11219k4(c2362x4, c3152yj, bArr, jArr, jArr2);
                c2362x4.dispose();
                c3152yj.dispose();
            } catch (Throwable th) {
                c2362x4.dispose();
                throw th;
            }
        } catch (Throwable th2) {
            c3152yj.dispose();
            throw th2;
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m11371k4(C2068ei c2068ei) {
        if (c2068ei.m10480to() == C2068ei.k4.f7163k4) {
            return false;
        }
        return this.f7854x1.containsKey(m11367kk(c2068ei));
    }
}
