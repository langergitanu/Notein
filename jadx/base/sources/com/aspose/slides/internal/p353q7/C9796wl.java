package com.aspose.slides.internal.p353q7;

import OooOO0.OooO0OO;
import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p080dd.C3152yj;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p505xn.C12561ix;
import com.aspose.slides.internal.p505xn.C12564kk;
import com.aspose.slides.internal.p505xn.C12565ks;
import com.aspose.slides.internal.p505xn.C12570to;
import com.aspose.slides.internal.p505xn.C12572up;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.q7.wl */
/* JADX INFO: loaded from: classes4.dex */
public class C9796wl {

    /* JADX INFO: renamed from: du */
    private C3152yj f35487du;

    /* JADX INFO: renamed from: h4 */
    private C3152yj f35488h4;

    /* JADX INFO: renamed from: k4 */
    private C12564kk f35489k4;

    /* JADX INFO: renamed from: kk */
    private int[] f35490kk;

    /* JADX INFO: renamed from: m9 */
    private C3152yj f35491m9;

    /* JADX INFO: renamed from: to */
    private C12572up f35492to;

    /* JADX INFO: renamed from: x1 */
    private boolean f35493x1;

    public C9796wl(C12564kk c12564kk, boolean z) {
        this.f35489k4 = c12564kk;
        this.f35493x1 = z;
    }

    /* JADX INFO: renamed from: du */
    private void m48269du() {
        C3152yj c3152yj = new C3152yj();
        this.f35487du = c3152yj;
        C12570to c12570to = new C12570to(c3152yj);
        int i = 0;
        if (this.f35493x1) {
            while (i < this.f35492to.m58673k4()) {
                c12570to.m58671x1(this.f35492to.m58676x1(i) / 2);
                i++;
            }
        } else {
            while (i < this.f35492to.m58673k4()) {
                c12570to.m58668k4(this.f35492to.m58676x1(i));
                i++;
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    private static int m48270k4(int i) {
        int i2 = (i & 1) != 0 ? 4 : 2;
        return (i & 8) != 0 ? i2 + 2 : (i & 64) != 0 ? i2 + 4 : (i & 128) != 0 ? i2 + 8 : i2;
    }

    /* JADX INFO: renamed from: to */
    private float m48277to() {
        short sM58605to = this.f35489k4.m58605to();
        return (sM58605to >> 14) + ((sM58605to & 16383) / 16383);
    }

    /* JADX INFO: renamed from: kk */
    public final C3152yj m48282kk() {
        return this.f35491m9;
    }

    /* JADX INFO: renamed from: x1 */
    public final C3152yj m48283x1() {
        return this.f35488h4;
    }

    /* JADX INFO: renamed from: k4 */
    public final int m48278k4(C9788t6 c9788t6, C9788t6 c9788t62, C9792um c9792um, C12561ix c12561ix) {
        m48275k4(c9788t6);
        m48276k4(c9788t62, c9792um, c12561ix);
        m48269du();
        return this.f35492to.m58673k4() - 1;
    }

    /* JADX INFO: renamed from: k4 */
    public final Dictionary<Long, C9786ss> m48279k4(C9788t6 c9788t6, C9788t6 c9788t62, List<Long> list, int i) {
        Dictionary<Long, C9786ss> dictionary = new Dictionary<>();
        m48275k4(c9788t6);
        List.Enumerator<Long> it = list.iterator();
        while (it.hasNext()) {
            try {
                Long l = (Long) C7019kk.m27464to(it.next(), Long.TYPE);
                long jLongValue = l.longValue();
                C9786ss c9786ss = new C9786ss(i);
                C9788t6 c9788t63 = c9788t62;
                m48272k4((int) jLongValue, c9788t63, c9786ss, 1.0f, 1.0f);
                dictionary.set_Item(l, c9786ss);
                c9788t62 = c9788t63;
            } finally {
            }
        }
        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
            it.dispose();
        }
        return dictionary;
    }

    /* JADX INFO: renamed from: k4 */
    public final Dictionary<Integer, C9786ss> m48280k4(C9788t6 c9788t6, C9788t6 c9788t62, C12561ix c12561ix, int i) {
        m48275k4(c9788t6);
        Dictionary<Integer, C9786ss> dictionary = new Dictionary<>();
        C12561ix c12561ixM48271k4 = m48271k4(c12561ix);
        int i2 = 0;
        while (i2 < c12561ixM48271k4.m58582k4()) {
            C9786ss c9786ss = new C9786ss(i);
            C9788t6 c9788t63 = c9788t62;
            m48272k4(((Integer) C7019kk.m27464to(c12561ixM48271k4.m58586kk(i2), Integer.TYPE)).intValue(), c9788t63, c9786ss, 1.0f, 1.0f);
            dictionary.set_Item(Integer.valueOf(i2), c9786ss);
            i2++;
            c9788t62 = c9788t63;
        }
        return dictionary;
    }

    /* JADX INFO: renamed from: k4 */
    public final C3152yj m48281k4() {
        return this.f35487du;
    }

    /* JADX INFO: renamed from: k4 */
    private static C12561ix m48271k4(C12561ix c12561ix) {
        C12561ix c12561ix2 = new C12561ix();
        for (int i = 0; i < c12561ix.m58582k4(); i++) {
            c12561ix2.m58585k4(((Integer) C7019kk.m27464to(c12561ix.m58586kk(i), Integer.TYPE)).intValue(), Integer.valueOf(c12561ix.m58587to(i)));
        }
        return c12561ix2;
    }

    /* JADX INFO: renamed from: k4 */
    private void m48272k4(int i, C9788t6 c9788t6, C9786ss c9786ss, float f, float f2) {
        this.f35489k4.m58602k4().setPosition(c9788t6.f35382kk + this.f35490kk[i]);
        short sM58605to = this.f35489k4.m58605to();
        this.f35489k4.m58602k4().setPosition(this.f35489k4.m58602k4().getPosition() - 2);
        if (sM58605to < 0) {
            m48274k4(c9786ss, c9788t6);
        } else {
            m48273k4(c9786ss, f, f2);
        }
    }

    /* JADX INFO: renamed from: k4 */
    private void m48273k4(C9786ss c9786ss, float f, float f2) {
        boolean z;
        int iM58605to = this.f35489k4.m58605to();
        c9786ss.m48141k4(this.f35489k4.m58605to());
        c9786ss.m48149x1(this.f35489k4.m58605to());
        c9786ss.m48144kk(this.f35489k4.m58605to());
        c9786ss.m48146to(this.f35489k4.m58605to());
        int[] iArr = new int[iM58605to];
        for (int i = 0; i < iM58605to; i++) {
            iArr[i] = 65535 & this.f35489k4.m58600du();
        }
        int i2 = 0;
        int i3 = 0;
        while (true) {
            z = true;
            if (i2 >= iM58605to) {
                break;
            }
            int i4 = iArr[i2];
            if (i3 < i4) {
                i3 = i4;
            }
            i3++;
            i2++;
        }
        this.f35489k4.m58603k4(this.f35489k4.m58600du() & 65535);
        byte[] bArr = new byte[i3];
        int i5 = 0;
        while (i5 < i3) {
            byte bM58601h4 = this.f35489k4.m58601h4();
            bArr[i5] = bM58601h4;
            if (C12565ks.m58635x1(bM58601h4)[3]) {
                int iM58601h4 = this.f35489k4.m58601h4() & 255;
                for (int i6 = 0; i6 < iM58601h4; i6++) {
                    i5++;
                    bArr[i5] = bM58601h4;
                }
            }
            i5++;
        }
        int[] iArr2 = new int[i3];
        int i7 = 0;
        while (true) {
            if (i7 >= i3) {
                break;
            }
            boolean[] zArrM58635x1 = C12565ks.m58635x1(bArr[i7]);
            if (zArrM58635x1[1]) {
                iArr2[i7] = (this.f35489k4.m58601h4() & 255) * (zArrM58635x1[4] ? 1 : -1);
            } else {
                iArr2[i7] = zArrM58635x1[4] ? iArr2[i7] : this.f35489k4.m58605to();
            }
            i7++;
        }
        int[] iArr3 = new int[i3];
        for (int i8 = 0; i8 < i3; i8++) {
            boolean[] zArrM58635x12 = C12565ks.m58635x1(bArr[i8]);
            if (zArrM58635x12[2]) {
                iArr3[i8] = (this.f35489k4.m58601h4() & 255) * (zArrM58635x12[5] ? 1 : -1);
            } else {
                iArr3[i8] = zArrM58635x12[5] ? iArr3[i8] : this.f35489k4.m58605to();
            }
        }
        int i9 = 0;
        int i10 = 0;
        while (i9 < i3) {
            boolean[] zArrM58635x13 = C12565ks.m58635x1(bArr[i9]);
            boolean z2 = iArr[i10] == i9 ? z : false;
            if (z2) {
                i10++;
            }
            c9786ss.m48138du().m48137k4(OooO0OO.OooO0OO(iArr2[i9], f, 13), OooO0OO.OooO0OO(iArr3[i9], f2, 13), zArrM58635x13[0], z2);
            i9++;
            z = true;
        }
    }

    /* JADX INFO: renamed from: k4 */
    private void m48274k4(C9786ss c9786ss, C9788t6 c9788t6) {
        int iM58600du;
        int iM58601h4;
        int iM58601h42;
        float fM48277to;
        float fM48277to2;
        this.f35489k4.m58605to();
        c9786ss.m48141k4(this.f35489k4.m58605to());
        c9786ss.m48149x1(this.f35489k4.m58605to());
        c9786ss.m48144kk(this.f35489k4.m58605to());
        c9786ss.m48146to(this.f35489k4.m58605to());
        while (true) {
            iM58600du = this.f35489k4.m58600du();
            int iM58600du2 = this.f35489k4.m58600du() & 65535;
            if ((iM58600du & 1) != 0) {
                iM58601h4 = this.f35489k4.m58600du() & 65535;
                iM58601h42 = this.f35489k4.m58600du() & 65535;
            } else {
                iM58601h4 = this.f35489k4.m58601h4() & 255;
                iM58601h42 = this.f35489k4.m58601h4() & 255;
            }
            if ((iM58600du & 8) != 0) {
                m48277to();
                fM48277to = 1.0f;
                fM48277to2 = 1.0f;
            } else if ((iM58600du & 64) != 0) {
                fM48277to = m48277to();
                fM48277to2 = m48277to();
            } else {
                if ((iM58600du & 128) != 0) {
                    m48277to();
                    m48277to();
                    m48277to();
                    m48277to();
                }
                fM48277to = 1.0f;
                fM48277to2 = 1.0f;
            }
            long position = this.f35489k4.m58602k4().getPosition();
            if ((iM58600du & 2) != 0 && (iM58600du & 4) != 0) {
                if ((32768 & iM58601h42) != 0) {
                    iM58601h42 = (-((iM58601h42 ^ 65535) + 1)) * 10;
                }
                c9786ss.m48138du().m48136k4(((short) iM58601h4) * 10, iM58601h42);
            }
            C9786ss c9786ss2 = c9786ss;
            C9788t6 c9788t62 = c9788t6;
            m48272k4(iM58600du2, c9788t62, c9786ss2, fM48277to, fM48277to2);
            this.f35489k4.m58602k4().setPosition(position);
            if ((iM58600du & 32) == 0) {
                break;
            }
            c9788t6 = c9788t62;
            c9786ss = c9786ss2;
        }
        if ((iM58600du & 256) != 0) {
            this.f35489k4.m58603k4(this.f35489k4.m58600du() & 65535);
        }
    }

    /* JADX INFO: renamed from: k4 */
    private void m48275k4(C9788t6 c9788t6) {
        this.f35489k4.m58602k4().setPosition(c9788t6.f35382kk);
        boolean z = this.f35493x1;
        int i = 0;
        int i2 = c9788t6.f35383to;
        if (z) {
            int i3 = i2 / 2;
            this.f35490kk = new int[i3];
            while (i < i3) {
                this.f35490kk[i] = (this.f35489k4.m58600du() & 65535) * 2;
                i++;
            }
            return;
        }
        int i4 = i2 / 4;
        this.f35490kk = new int[i4];
        while (i < i4) {
            this.f35490kk[i] = this.f35489k4.m58606x1();
            i++;
        }
    }

    /* JADX INFO: renamed from: k4 */
    private void m48276k4(C9788t6 c9788t6, C9792um c9792um, C12561ix c12561ix) {
        int iM58600du;
        int iIntValue;
        C12561ix c12561ixM48271k4 = m48271k4(c12561ix);
        this.f35492to = new C12572up();
        C3152yj c3152yj = new C3152yj();
        this.f35488h4 = c3152yj;
        C12570to c12570to = new C12570to(c3152yj);
        C3152yj c3152yj2 = new C3152yj();
        this.f35491m9 = c3152yj2;
        C12570to c12570to2 = new C12570to(c3152yj2);
        for (int i = 0; i < c12561ixM48271k4.m58582k4(); i++) {
            this.f35492to.m58675kk((int) c12570to.m58666k4().getPosition());
            Object objM58586kk = c12561ixM48271k4.m58586kk(i);
            Class cls = Integer.TYPE;
            int iIntValue2 = ((Integer) C7019kk.m27464to(objM58586kk, cls)).intValue();
            this.f35489k4.m58602k4().setPosition(c9788t6.f35382kk + this.f35490kk[iIntValue2]);
            int[] iArr = this.f35490kk;
            int i2 = iArr[iIntValue2 + 1] - iArr[iIntValue2];
            if (i2 > 0) {
                short sM58605to = this.f35489k4.m58605to();
                if (sM58605to < 0) {
                    c12570to.m58671x1(sM58605to);
                    byte[] bArrM58603k4 = this.f35489k4.m58603k4(8);
                    c12570to.m58670k4(bArrM58603k4, 0, bArrM58603k4.length);
                    do {
                        iM58600du = this.f35489k4.m58600du();
                        int i3 = iM58600du & 65535;
                        c12570to.m58671x1(i3);
                        int iM58600du2 = this.f35489k4.m58600du() & 65535;
                        Object objM58580du = c12561ix.m58580du(iM58600du2);
                        if (objM58580du != null) {
                            iIntValue = ((Integer) C7019kk.m27464to(objM58580du, cls)).intValue();
                        } else {
                            int iM58587to = c12561ixM48271k4.m58587to(c12561ixM48271k4.m58582k4() - 1) + 1;
                            c12561ix.m58585k4(iM58600du2, Integer.valueOf(iM58587to));
                            c12561ixM48271k4.m58585k4(iM58587to, Integer.valueOf(iM58600du2));
                            iIntValue = iM58587to;
                        }
                        byte[] bArrM58603k42 = this.f35489k4.m58603k4(m48270k4(i3));
                        c12570to.m58671x1(iIntValue);
                        c12570to.m58670k4(bArrM58603k42, 0, bArrM58603k42.length);
                    } while ((iM58600du & 32) != 0);
                    if ((iM58600du & 256) != 0) {
                        int iM58600du3 = this.f35489k4.m58600du() & 65535;
                        byte[] bArrM58603k43 = this.f35489k4.m58603k4(iM58600du3);
                        c12570to.m58671x1(iM58600du3);
                        c12570to.m58670k4(bArrM58603k43, 0, bArrM58603k43.length);
                    }
                } else {
                    this.f35489k4.m58602k4().setPosition(this.f35489k4.m58602k4().getPosition() - 2);
                    byte[] bArrM58603k44 = this.f35489k4.m58603k4(i2);
                    c12570to.m58670k4(bArrM58603k44, 0, bArrM58603k44.length);
                }
                if (C12565ks.m58618k4(c12570to.m58666k4().getPosition())) {
                    c12570to.m58667k4((byte) 0);
                }
            }
            c9792um.m48252k4(iIntValue2).Clone().m47981k4(c12570to2);
        }
        this.f35492to.m58675kk((int) c12570to.m58666k4().getPosition());
    }
}
