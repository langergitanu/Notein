package com.aspose.slides.internal.p381rm;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.exceptions.NotImplementedException;
import com.aspose.slides.exceptions.OutOfMemoryException;
import com.aspose.slides.internal.p106ef.AbstractC3675du;
import com.aspose.slides.internal.p106ef.C3678kk;
import com.aspose.slides.internal.p106ef.C3679m9;
import com.aspose.slides.internal.p135fp.C4090du;
import com.aspose.slides.internal.p135fp.C4095jd;
import com.aspose.slides.internal.p135fp.C4098ks;
import com.aspose.slides.internal.p135fp.C4101qq;
import com.aspose.slides.internal.p135fp.C4103to;
import com.aspose.slides.internal.p135fp.C4104u4;
import com.aspose.slides.internal.p135fp.C4108v4;
import com.aspose.slides.internal.p135fp.C4109wl;
import com.aspose.slides.internal.p135fp.C4111x6;
import com.aspose.slides.internal.p135fp.C4112yj;
import com.aspose.slides.internal.p225ke.C5664k4;
import com.aspose.slides.internal.p225ke.C5665kk;
import com.aspose.slides.internal.p225ke.C5666m9;
import com.aspose.slides.internal.p225ke.C5667to;
import com.aspose.slides.internal.p225ke.C5668x1;
import com.aspose.slides.internal.p291n4.C6739k4;
import com.aspose.slides.internal.p322oo.C7128k4;
import com.aspose.slides.internal.p475wh.C12014ne;
import com.aspose.slides.internal.p519y5.C12797k4;
import com.aspose.slides.internal.p550zi.C13609qq;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.C14116yg;

/* JADX INFO: renamed from: com.aspose.slides.internal.rm.x1 */
/* JADX INFO: loaded from: classes4.dex */
public class C10020x1 {

    /* JADX INFO: renamed from: c5 */
    private int f36065c5;

    /* JADX INFO: renamed from: du */
    private AbstractC3675du f36066du;

    /* JADX INFO: renamed from: dy */
    private C4112yj f36067dy;

    /* JADX INFO: renamed from: h4 */
    private boolean f36068h4;

    /* JADX INFO: renamed from: k4 */
    private short[][] f36069k4;

    /* JADX INFO: renamed from: kk */
    private C7128k4 f36070kk;

    /* JADX INFO: renamed from: m9 */
    private C6739k4 f36071m9;

    /* JADX INFO: renamed from: to */
    private C12797k4 f36072to;

    /* JADX INFO: renamed from: x1 */
    private C12014ne f36073x1;

    public C10020x1(C12014ne c12014ne, C6739k4 c6739k4, C4101qq c4101qq, C13609qq c13609qq) {
        this(c12014ne.Clone(), c6739k4, c13609qq);
        this.f36067dy.m16462k4(new C4104u4(c4101qq));
    }

    /* JADX INFO: renamed from: c5 */
    private List<C4109wl> m49242c5() {
        List<C4109wl> list = new List<>();
        for (int i = 0; i < 4; i++) {
            C4109wl c4109wl = new C4109wl();
            c4109wl.f11269x1 = new int[]{i};
            list.addItem(c4109wl);
        }
        return list;
    }

    /* JADX INFO: renamed from: ck */
    private List<C4109wl> m49243ck() {
        List<C4109wl> list = new List<>();
        for (int i = 0; i < 4; i++) {
            C4109wl c4109wl = new C4109wl((byte) 0, (byte) 0, 0, 1, 1);
            c4109wl.f11269x1 = new int[]{i};
            list.addItem(c4109wl);
        }
        for (int i2 = 0; i2 < 4; i2++) {
            C4109wl c4109wl2 = new C4109wl((byte) 1, (byte) 5, 0, 2, 1);
            c4109wl2.f11269x1 = new int[]{i2};
            list.addItem(c4109wl2);
        }
        for (int i3 = 0; i3 < 4; i3++) {
            C4109wl c4109wl3 = new C4109wl((byte) 6, (byte) 63, 0, 2, 1);
            c4109wl3.f11269x1 = new int[]{i3};
            list.addItem(c4109wl3);
        }
        for (int i4 = 0; i4 < 4; i4++) {
            C4109wl c4109wl4 = new C4109wl((byte) 1, (byte) 63, 2, 1, 1);
            c4109wl4.f11269x1 = new int[]{i4};
            list.addItem(c4109wl4);
        }
        for (int i5 = 0; i5 < 4; i5++) {
            C4109wl c4109wl5 = new C4109wl((byte) 0, (byte) 0, 1, 0, 1);
            c4109wl5.f11269x1 = new int[]{i5};
            list.addItem(c4109wl5);
        }
        for (int i6 = 0; i6 < 4; i6++) {
            C4109wl c4109wl6 = new C4109wl((byte) 1, (byte) 63, 1, 0, 1);
            c4109wl6.f11269x1 = new int[]{i6};
            list.addItem(c4109wl6);
        }
        return list;
    }

    /* JADX INFO: renamed from: du */
    private static C4095jd[] m49244du() {
        return new C4095jd[]{new C4095jd((byte) 0, (byte) 1, (byte) 1, (byte) 0, (byte) 0, (byte) 0), new C4095jd((byte) 1, (byte) 1, (byte) 1, (byte) 0, (byte) 0, (byte) 0), new C4095jd((byte) 2, (byte) 1, (byte) 1, (byte) 0, (byte) 0, (byte) 0)};
    }

    /* JADX INFO: renamed from: dy */
    private C4090du[] m49245dy() {
        this.f36070kk.m27671k4();
        this.f36066du.mo14880to();
        boolean z = this.f36067dy.m16469x1().f11269x1.length != 1;
        int iM23130x1 = z ? this.f36065c5 : C5666m9.m23130x1(this.f36067dy.m16453du().m16348c5() & 65535, 8);
        for (int i = 0; i < iM23130x1; i++) {
            for (int i2 = 0; i2 < this.f36067dy.m16453du().m16352h4(); i2++) {
                this.f36066du.mo14882x1(this.f36070kk.m27672k4(z ? m49250k4(i2, i) : m49258x1(i2, i)));
            }
        }
        return this.f36066du.mo14878k4();
    }

    /* JADX INFO: renamed from: fa */
    private List<C4109wl> m49246fa() {
        List<C4109wl> list = new List<>();
        for (int i = 0; i < 3; i++) {
            C4109wl c4109wl = new C4109wl((byte) 0, (byte) 0, 0, 1, 1);
            c4109wl.f11269x1 = new int[]{i};
            list.addItem(c4109wl);
        }
        for (int i2 = 0; i2 < 3; i2++) {
            C4109wl c4109wl2 = new C4109wl((byte) 1, (byte) 5, 0, 2, 1);
            c4109wl2.f11269x1 = new int[]{i2};
            list.addItem(c4109wl2);
        }
        for (int i3 = 0; i3 < 3; i3++) {
            C4109wl c4109wl3 = new C4109wl((byte) 6, (byte) 63, 0, 2, 1);
            c4109wl3.f11269x1 = new int[]{i3};
            list.addItem(c4109wl3);
        }
        for (int i4 = 0; i4 < 3; i4++) {
            C4109wl c4109wl4 = new C4109wl((byte) 1, (byte) 63, 2, 1, 1);
            c4109wl4.f11269x1 = new int[]{i4};
            list.addItem(c4109wl4);
        }
        for (int i5 = 0; i5 < 3; i5++) {
            C4109wl c4109wl5 = new C4109wl((byte) 0, (byte) 0, 1, 0, 1);
            c4109wl5.f11269x1 = new int[]{i5};
            list.addItem(c4109wl5);
        }
        for (int i6 = 0; i6 < 3; i6++) {
            C4109wl c4109wl6 = new C4109wl((byte) 1, (byte) 63, 1, 0, 1);
            c4109wl6.f11269x1 = new int[]{i6};
            list.addItem(c4109wl6);
        }
        return list;
    }

    /* JADX INFO: renamed from: h4 */
    private static C4095jd[] m49247h4() {
        return new C4095jd[]{new C4095jd((byte) 1, (byte) 2, (byte) 2, (byte) 0, (byte) 0, (byte) 0), new C4095jd((byte) 2, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1), new C4095jd((byte) 3, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1)};
    }

    /* JADX INFO: renamed from: ix */
    private C4109wl[] m49248ix() {
        List list = new List(10);
        list.addItem(new C4109wl((byte) 0, (byte) 0, 0, 1, new int[]{0, 1, 2}));
        list.addItem(new C4109wl((byte) 1, (byte) 5, 0, 2, new int[]{0}));
        list.addItem(new C4109wl((byte) 1, (byte) 63, 0, 1, new int[]{2}));
        list.addItem(new C4109wl((byte) 1, (byte) 63, 0, 1, new int[]{1}));
        list.addItem(new C4109wl((byte) 6, (byte) 63, 0, 2, new int[]{0}));
        list.addItem(new C4109wl((byte) 1, (byte) 63, 2, 1, new int[]{0}));
        list.addItem(new C4109wl((byte) 0, (byte) 0, 1, 0, new int[]{0, 1, 2}));
        list.addItem(new C4109wl((byte) 1, (byte) 63, 1, 0, new int[]{2}));
        list.addItem(new C4109wl((byte) 1, (byte) 63, 1, 0, new int[]{1}));
        list.addItem(new C4109wl((byte) 1, (byte) 63, 1, 0, new int[]{0}));
        return (C4109wl[]) list.toArray(new C4109wl[0]);
    }

    /* JADX INFO: renamed from: jd */
    private List<C4109wl> m49249jd() {
        List<C4109wl> list = new List<>();
        C4109wl c4109wl = new C4109wl();
        c4109wl.f11269x1 = new int[]{0, 1, 2};
        list.addItem(c4109wl);
        return list;
    }

    /* JADX INFO: renamed from: k4 */
    private C4111x6 m49250k4(int i, int i2) {
        C4109wl c4109wl = this.f36067dy.m16452c5().get_Item(this.f36067dy.f11279k4);
        C4111x6 c4111x6 = new C4111x6(this.f36067dy.m16457k4());
        short[][] sArr = new short[C5667to.f15657x1][];
        int i3 = 0;
        while (true) {
            int[] iArr = c4109wl.f11269x1;
            if (i3 >= iArr.length) {
                break;
            }
            int i4 = iArr[i3];
            if (sArr[i4] == null) {
                sArr[i4] = new short[c4109wl.m16446to() * c4109wl.m16438du() * C5667to.f15654k4];
            }
            i3++;
        }
        int iM16446to = 0;
        for (int iM16438du = c4109wl.m16438du() * i2 * 8; iM16438du < c4109wl.m16438du() * (i2 + 1) * 8; iM16438du++) {
            int i5 = 0;
            while (true) {
                int[] iArr2 = c4109wl.f11269x1;
                if (i5 < iArr2.length) {
                    System.arraycopy(this.f36069k4[iArr2[i5]], ((c4109wl.m16446to() * i) + (this.f36067dy.m16456jd() * iM16438du)) * 8, sArr[c4109wl.f11269x1[i5]], iM16446to, c4109wl.m16446to() * 8);
                    i5++;
                }
            }
            iM16446to += c4109wl.m16446to() * 8;
        }
        int i6 = 0;
        int i7 = 0;
        while (true) {
            int[] iArr3 = c4109wl.f11269x1;
            if (i6 >= iArr3.length) {
                return c4111x6;
            }
            int i8 = iArr3[i6];
            C4095jd c4095jd = this.f36067dy.m16453du().m16362x1()[c4109wl.f11269x1[i6]];
            short[][] sArr2 = new short[c4109wl.m16438du() * 8][];
            for (int i9 = 0; i9 < c4109wl.m16438du() * 8; i9++) {
                sArr2[i9] = new short[c4109wl.m16446to() * 8];
                System.arraycopy(sArr[i8 & 255], c4109wl.m16438du() * i9 * 8, sArr2[i9], 0, c4109wl.m16446to() * 8);
            }
            short[][] sArrMo59486k4 = this.f36072to.m59487k4(c4095jd.m16317h4() & 255).mo59486k4(sArr2);
            for (int i10 = 0; i10 < c4095jd.m16310c5(); i10++) {
                for (int i11 = 0; i11 < c4095jd.m16320jd(); i11++) {
                    c4111x6.m16451k4()[i7] = new C4103to();
                    int i12 = 0;
                    for (int i13 = 0; i13 < 8; i13++) {
                        for (int i14 = 0; i14 < 8; i14++) {
                            c4111x6.m16451k4()[i7].m16394k4()[i12] = sArrMo59486k4[(i10 * 8) + i13][(i11 * 8) + i14];
                            i12++;
                        }
                    }
                    i7++;
                }
            }
            i6++;
        }
    }

    /* JADX INFO: renamed from: ks */
    private List<C4109wl> m49251ks() {
        List<C4109wl> list = new List<>();
        C4109wl c4109wl = new C4109wl();
        c4109wl.f11269x1 = new int[]{0, 1, 2};
        list.addItem(c4109wl);
        return list;
    }

    /* JADX INFO: renamed from: m9 */
    private void m49252m9() {
    }

    /* JADX INFO: renamed from: ne */
    private void m49253ne() {
        m49261k4().m16471x1(new Dictionary<>());
        m49261k4().m16459k4(new Dictionary<>());
        m49261k4().m16455h4().set_Item((byte) 0, C4108v4.m16429k4((byte) 0, C5668x1.f15664jd, this.f36071m9.m26523dy(), true));
        m49261k4().m16455h4().set_Item((byte) 1, C4108v4.m16429k4((byte) 1, C5668x1.f15660du, this.f36071m9.m26523dy(), true));
    }

    /* JADX INFO: renamed from: rv */
    private void m49254rv() {
        m49261k4().m16471x1(new Dictionary<>());
        m49261k4().m16459k4(new Dictionary<>());
        m49261k4().m16455h4().set_Item((byte) 0, C4108v4.m16429k4((byte) 0, C5664k4.f15649k4, this.f36071m9.m26523dy(), true));
        m49261k4().m16455h4().set_Item((byte) 1, C4108v4.m16429k4((byte) 1, C5664k4.f15650x1, this.f36071m9.m26523dy(), true));
    }

    /* JADX INFO: renamed from: to */
    private static C4095jd[] m49255to() {
        return new C4095jd[]{new C4095jd((byte) 1, (byte) 1, (byte) 1, (byte) 0, (byte) 0, (byte) 0), new C4095jd((byte) 2, (byte) 1, (byte) 1, (byte) 0, (byte) 1, (byte) 1), new C4095jd((byte) 3, (byte) 1, (byte) 1, (byte) 0, (byte) 1, (byte) 1), new C4095jd((byte) 4, (byte) 1, (byte) 1, (byte) 0, (byte) 0, (byte) 0)};
    }

    /* JADX INFO: renamed from: u4 */
    private void m49256u4() {
        C4109wl c4109wl = this.f36067dy.m16452c5().get_Item(this.f36067dy.f11279k4);
        if (c4109wl.f11269x1.length == 1) {
            this.f36067dy.m16453du().m16361x1(C5666m9.m23130x1(65535 & this.f36067dy.m16453du().m16351dy(), 8));
            C4112yj c4112yj = this.f36067dy;
            c4112yj.m16465kk(c4112yj.m16453du().m16362x1()[c4109wl.f11269x1[0]].m16316fa() & 255);
            this.f36067dy.m16453du().m16362x1()[c4109wl.f11269x1[0]].m16328m9(1);
            this.f36067dy.m16453du().m16362x1()[c4109wl.f11269x1[0]].m16319h4(1);
            this.f36067dy.m16453du().m16362x1()[c4109wl.f11269x1[0]].m16326kk(1);
            this.f36067dy.m16453du().m16362x1()[c4109wl.f11269x1[0]].m16331to(1);
            c4109wl.m16443k4(new int[1]);
            c4109wl.m16445kk()[0] = c4109wl.f11269x1[0];
            this.f36067dy.m16458k4(1);
            c4109wl.m16444kk(1);
            c4109wl.m16447to(1);
        } else {
            this.f36067dy.m16453du().m16361x1(C5666m9.m23130x1(this.f36067dy.m16453du().m16351dy() & 65535, this.f36067dy.m16453du().m16359to() * 8));
            C4112yj c4112yj2 = this.f36067dy;
            c4112yj2.m16465kk(C5666m9.m23130x1(c4112yj2.m16453du().m16348c5() & 65535, this.f36067dy.m16453du().m16358m9() * 8));
            this.f36067dy.m16458k4(0);
            c4109wl.m16444kk(0);
            c4109wl.m16447to(0);
            for (int i = 0; i < c4109wl.f11269x1.length; i++) {
                C4095jd c4095jd = this.f36067dy.m16453du().m16362x1()[c4109wl.f11269x1[i]];
                c4095jd.m16328m9(c4095jd.m16329to() & 255);
                c4095jd.m16319h4(c4095jd.m16316fa() & 255);
                c4109wl.m16444kk(C14116yg.m67483k4(c4109wl.m16446to(), c4095jd.m16329to() & 255));
                c4109wl.m16447to(C14116yg.m67483k4(c4109wl.m16438du(), c4095jd.m16316fa() & 255));
                c4095jd.m16314du(c4095jd.m16320jd() * c4095jd.m16310c5());
                c4095jd.f11197k4 = C5666m9.m23130x1((this.f36067dy.m16453du().m16351dy() & 65535) * (c4095jd.m16329to() & 255), this.f36067dy.m16453du().m16359to() * 8);
                c4095jd.m16334x1(C5666m9.m23130x1((this.f36067dy.m16453du().m16348c5() & 65535) * (c4095jd.m16316fa() & 255), this.f36067dy.m16453du().m16358m9() * 8));
                int iM16320jd = c4095jd.f11197k4 % c4095jd.m16320jd();
                if (iM16320jd == 0) {
                    iM16320jd = c4095jd.m16320jd();
                }
                c4095jd.m16326kk(iM16320jd);
                int iM16312du = c4095jd.m16312du() % c4095jd.m16310c5();
                if (iM16312du == 0) {
                    iM16312du = c4095jd.m16310c5();
                }
                c4095jd.m16331to(iM16312du);
                int iM16315dy = c4095jd.m16315dy();
                while (true) {
                    int i2 = iM16315dy - 1;
                    if (iM16315dy > 0) {
                        int iM16457k4 = this.f36067dy.m16457k4();
                        this.f36067dy.m16458k4(iM16457k4 + 1);
                        c4109wl.m16445kk()[iM16457k4] = c4109wl.f11269x1[i];
                        iM16315dy = i2;
                    }
                }
            }
        }
        C4095jd[] c4095jdArr = new C4095jd[this.f36067dy.m16469x1().f11269x1.length];
        for (int i3 = 0; i3 < this.f36067dy.m16469x1().f11269x1.length; i3++) {
            c4095jdArr[i3] = this.f36067dy.m16453du().m16362x1()[this.f36067dy.m16469x1().f11269x1[i3]];
        }
        this.f36072to = new C12797k4(c4095jdArr, this.f36067dy.m16453du().m16359to(), this.f36067dy.m16453du().m16358m9());
        if (this.f36068h4) {
            for (C4090du c4090du : m49245dy()) {
                this.f36067dy.m16464kk().set_Item(Byte.valueOf(c4090du.f11165k4), c4090du);
            }
        }
        for (C4090du c4090du2 : this.f36067dy.m16464kk().getValues()) {
            if (!c4090du2.m16272c5()) {
                C4090du.m16265k4(this.f36067dy.m16466m9().m16395k4(), new C4090du[]{c4090du2});
            }
        }
    }

    /* JADX INFO: renamed from: up */
    private void m49257up() {
        m49261k4().m16471x1(new Dictionary<>());
        m49261k4().m16459k4(new Dictionary<>());
        m49261k4().m16455h4().set_Item((byte) 0, C4108v4.m16429k4((byte) 0, C5668x1.f15664jd, this.f36071m9.m26523dy(), true));
    }

    /* JADX INFO: renamed from: x1 */
    private C4111x6 m49258x1(int i, int i2) {
        int i3 = this.f36067dy.m16452c5().get_Item(this.f36067dy.f11279k4).f11269x1[0];
        C4111x6 c4111x6 = new C4111x6(1);
        short[] sArr = new short[C5667to.f15654k4];
        int i4 = 0;
        for (int i5 = i2 * 8; i5 < (i2 + 1) * 8; i5++) {
            System.arraycopy(this.f36069k4[i3], ((this.f36067dy.m16456jd() * i5) + i) * 8, sArr, i4, 8);
            i4 += 8;
        }
        c4111x6.m16451k4()[0] = new C4103to();
        c4111x6.m16451k4()[0].m16393k4(sArr);
        return c4111x6;
    }

    /* JADX INFO: renamed from: x6 */
    private void m49259x6() {
        m49261k4().m16471x1(new Dictionary<>());
        m49261k4().m16459k4(new Dictionary<>());
        m49261k4().m16455h4().set_Item((byte) 0, C4108v4.m16429k4((byte) 0, C5665kk.f15651k4, this.f36071m9.m26523dy(), true));
        m49261k4().m16455h4().set_Item((byte) 1, C4108v4.m16429k4((byte) 1, C5665kk.f15652x1, this.f36071m9.m26523dy(), true));
    }

    /* JADX INFO: renamed from: yj */
    private void m49260yj() {
        m49261k4().m16464kk().set_Item((byte) 0, new C4090du((byte) 0, (byte) 0, C5668x1.f15661dy, C5668x1.f15658c5));
        m49261k4().m16464kk().set_Item((byte) 1, new C4090du((byte) 1, (byte) 0, C5668x1.f15666kk, C5668x1.f15668to));
        m49261k4().m16464kk().set_Item((byte) 16, new C4090du((byte) 0, (byte) 1, C5668x1.f15663h4, C5668x1.f15667m9));
        m49261k4().m16464kk().set_Item((byte) 17, new C4090du((byte) 1, (byte) 1, C5668x1.f15665k4, C5668x1.f15669x1));
    }

    /* JADX INFO: renamed from: kk */
    public C12014ne m49266kk() {
        return this.f36073x1;
    }

    public C10020x1(C12014ne c12014ne, C6739k4 c6739k4, C13609qq c13609qq) {
        C12014ne c12014ne2 = new C12014ne();
        this.f36073x1 = c12014ne2;
        c12014ne.CloneTo(c12014ne2);
        m49264k4(c6739k4);
        m49265k4(new short[c13609qq.m62786du()][]);
        for (int i = 0; i < c13609qq.m62786du(); i++) {
            try {
                m49267x1()[i] = new short[m49261k4().m16467to() * m49261k4().m16456jd() * C5667to.f15654k4];
            } catch (OutOfMemoryError e) {
                throw new OutOfMemoryException("FrameworkException: Not enough memory to process jpeg file.", e);
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    public C4112yj m49261k4() {
        return this.f36067dy;
    }

    /* JADX INFO: renamed from: x1 */
    public short[][] m49267x1() {
        return this.f36069k4;
    }

    /* JADX INFO: renamed from: k4 */
    public void m49262k4(C4101qq c4101qq) {
        this.f36067dy.f11279k4 = 0;
        while (true) {
            C4112yj c4112yj = this.f36067dy;
            if (c4112yj.f11279k4 >= c4112yj.m16452c5().size()) {
                m49252m9();
                return;
            }
            m49256u4();
            this.f36070kk.m27671k4();
            this.f36066du.mo14879kk();
            boolean z = this.f36067dy.m16469x1().f11269x1.length != 1;
            C4109wl.m16437k4(c4101qq, m49261k4().m16453du(), m49261k4().m16452c5().get_Item(this.f36067dy.f11279k4));
            int iM23130x1 = z ? this.f36065c5 : C5666m9.m23130x1(this.f36067dy.m16453du().m16348c5() & 65535, 8);
            for (int i = 0; i < iM23130x1; i++) {
                for (int i2 = 0; i2 < this.f36067dy.m16453du().m16352h4(); i2++) {
                    this.f36066du.mo14877k4(this.f36070kk.m27672k4(z ? m49250k4(i2, i) : m49258x1(i2, i)));
                }
            }
            this.f36066du.mo14881x1();
            this.f36067dy.f11279k4++;
        }
    }

    /* JADX INFO: renamed from: k4 */
    public void m49263k4(C4112yj c4112yj) {
        this.f36067dy = c4112yj;
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x0255 A[LOOP:0: B:61:0x0253->B:62:0x0255, LOOP_END] */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void m49264k4(C6739k4 c6739k4) {
        C4112yj c4112yj;
        C4098ks c4098ks;
        C4112yj c4112yj2;
        C4098ks c4098ks2;
        C4112yj c4112yj3;
        List<C4109wl> listM49242c5;
        this.f36071m9 = c6739k4;
        m49263k4(new C4112yj());
        this.f36067dy.m16463k4(this.f36071m9);
        this.f36070kk = new C7128k4(m49261k4());
        int iM26532m9 = c6739k4.m26532m9();
        if (iM26532m9 != 0) {
            if (iM26532m9 != 1) {
                if (iM26532m9 == 2) {
                    m49254rv();
                    this.f36068h4 = true;
                    int iM26524h4 = this.f36071m9.m26524h4();
                    if (iM26524h4 == 0) {
                        this.f36066du = new C3678kk(m49261k4());
                        c4112yj = this.f36067dy;
                        c4098ks = new C4098ks((byte) -64, m49255to());
                        c4112yj.m16461k4(c4098ks);
                        c4112yj3 = this.f36067dy;
                        listM49242c5 = m49242c5();
                    } else {
                        if (iM26524h4 != 1) {
                            throw new ArgumentOutOfRangeException("CompressionType");
                        }
                        this.f36066du = new C3679m9(this.f36067dy);
                        c4112yj2 = this.f36067dy;
                        c4098ks2 = new C4098ks((byte) -62, m49255to());
                        c4112yj2.m16461k4(c4098ks2);
                        c4112yj3 = this.f36067dy;
                        listM49242c5 = m49243ck();
                    }
                } else if (iM26532m9 != 3) {
                    if (iM26532m9 != 4) {
                        throw new ArgumentOutOfRangeException("ColorType");
                    }
                    m49257up();
                    this.f36068h4 = true;
                    int iM26524h42 = this.f36071m9.m26524h4();
                    if (iM26524h42 == 0) {
                        this.f36066du = new C3678kk(this.f36067dy);
                        this.f36067dy.m16461k4(new C4098ks((byte) -64, m49244du()));
                        c4112yj3 = this.f36067dy;
                        listM49242c5 = m49249jd();
                    } else {
                        if (iM26524h42 != 1) {
                            throw new ArgumentOutOfRangeException("CompressionType");
                        }
                        this.f36066du = new C3679m9(this.f36067dy);
                        this.f36067dy.m16461k4(new C4098ks((byte) -62, m49244du()));
                        c4112yj3 = this.f36067dy;
                        listM49242c5 = m49246fa();
                    }
                } else {
                    if (this.f36071m9.m26521c5() == null || this.f36071m9.m26525jd() == null) {
                        throw new ArgumentException("Icc profiles needed to perform saving in CMYK format.");
                    }
                    m49259x6();
                    this.f36068h4 = true;
                    int iM26524h43 = this.f36071m9.m26524h4();
                    if (iM26524h43 == 0) {
                        this.f36066du = new C3678kk(m49261k4());
                        c4112yj = this.f36067dy;
                        c4098ks = new C4098ks((byte) -64, m49255to());
                        c4112yj.m16461k4(c4098ks);
                        c4112yj3 = this.f36067dy;
                        listM49242c5 = m49242c5();
                    } else {
                        if (iM26524h43 != 1) {
                            throw new ArgumentOutOfRangeException("CompressionType");
                        }
                        this.f36066du = new C3679m9(this.f36067dy);
                        c4112yj2 = this.f36067dy;
                        c4098ks2 = new C4098ks((byte) -62, m49255to());
                        c4112yj2.m16461k4(c4098ks2);
                        c4112yj3 = this.f36067dy;
                        listM49242c5 = m49243ck();
                    }
                }
                c4112yj3.m16460k4(listM49242c5);
            } else {
                m49253ne();
                this.f36068h4 = false;
                int iM26524h44 = this.f36071m9.m26524h4();
                if (iM26524h44 == 0) {
                    this.f36066du = new C3678kk(m49261k4());
                    this.f36067dy.m16461k4(new C4098ks((byte) -64, m49247h4()));
                    this.f36068h4 = false;
                    this.f36067dy.m16460k4(m49251ks());
                } else {
                    if (iM26524h44 != 1) {
                        throw new ArgumentOutOfRangeException("CompressionType");
                    }
                    this.f36066du = new C3679m9(m49261k4());
                    this.f36067dy.m16461k4(new C4098ks((byte) -62, m49247h4()));
                    this.f36067dy.m16460k4(new List<>(AbstractC14092to.m67204k4((Object[]) m49248ix())));
                    this.f36068h4 = true;
                }
            }
            this.f36067dy.m16453du().m16360to(m49266kk().m56663c5() & 65535);
            this.f36067dy.m16453du().m16349du(m49266kk().m56683x1() & 65535);
            for (C4095jd c4095jd : this.f36067dy.m16453du().m16362x1()) {
                this.f36067dy.m16453du().m16355k4(C14116yg.m67483k4(this.f36067dy.m16453du().m16359to(), c4095jd.m16329to() & 255));
                this.f36067dy.m16453du().m16357kk(C14116yg.m67483k4(this.f36067dy.m16453du().m16358m9(), c4095jd.m16316fa() & 255));
            }
            this.f36065c5 = C5666m9.m23130x1(this.f36067dy.m16453du().m16348c5() & 65535, this.f36067dy.m16453du().m16358m9() * 8);
            int iM23129to = C5666m9.m23129to(this.f36067dy.m16453du().m16348c5() & 65535, this.f36067dy.m16453du().m16358m9() * 8);
            int iM23129to2 = C5666m9.m23129to(this.f36067dy.m16453du().m16351dy() & 65535, this.f36067dy.m16453du().m16359to() * 8);
            this.f36067dy.m16470x1(C5666m9.m23130x1(iM23129to, 8));
            this.f36067dy.m16468to(C5666m9.m23130x1(iM23129to2, 8));
        }
        m49253ne();
        this.f36068h4 = false;
        int iM26524h45 = this.f36071m9.m26524h4();
        if (iM26524h45 != 0) {
            if (iM26524h45 == 1) {
                throw new NotImplementedException();
            }
            throw new ArgumentOutOfRangeException("CompressionType");
        }
        this.f36066du = new C3678kk(m49261k4());
        this.f36067dy.m16461k4(new C4098ks((byte) -64, new C4095jd[1]));
        this.f36068h4 = false;
        this.f36067dy.m16453du().m16362x1()[0] = new C4095jd((byte) 1, (byte) 2, (byte) 2, (byte) 0, (byte) 0, (byte) 0);
        this.f36067dy.m16460k4(new List<>());
        this.f36067dy.m16452c5().addItem(new C4109wl());
        this.f36067dy.m16452c5().get_Item(0).f11269x1 = new int[]{0};
        m49260yj();
        this.f36067dy.m16453du().m16360to(m49266kk().m56663c5() & 65535);
        this.f36067dy.m16453du().m16349du(m49266kk().m56683x1() & 65535);
        while (i < r0) {
        }
        this.f36065c5 = C5666m9.m23130x1(this.f36067dy.m16453du().m16348c5() & 65535, this.f36067dy.m16453du().m16358m9() * 8);
        int iM23129to3 = C5666m9.m23129to(this.f36067dy.m16453du().m16348c5() & 65535, this.f36067dy.m16453du().m16358m9() * 8);
        int iM23129to22 = C5666m9.m23129to(this.f36067dy.m16453du().m16351dy() & 65535, this.f36067dy.m16453du().m16359to() * 8);
        this.f36067dy.m16470x1(C5666m9.m23130x1(iM23129to3, 8));
        this.f36067dy.m16468to(C5666m9.m23130x1(iM23129to22, 8));
    }

    /* JADX INFO: renamed from: k4 */
    public void m49265k4(short[][] sArr) {
        this.f36069k4 = sArr;
    }
}
