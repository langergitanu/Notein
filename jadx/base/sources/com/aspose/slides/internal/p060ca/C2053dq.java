package com.aspose.slides.internal.p060ca;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p080dd.C3152yj;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.C14080ne;

/* JADX INFO: renamed from: com.aspose.slides.internal.ca.dq */
/* JADX INFO: loaded from: classes3.dex */
public class C2053dq extends AbstractC2119hu implements InterfaceC2087fj {

    /* JADX INFO: renamed from: m9 */
    private static final C7017h4 f7080m9 = new C7017h4("version", "Notice", "FullName", "FamilyName", "Weight", "FontBBox", "UniqueID", "XUID", "charset", "Encoding", "CharStrings", "Private", "Copyright", "isFixedPitch", "ItalicAngle", "UnderlinePosition", "UnderlineThickness", "PaintType", "CharstringType", "FontMatrix", "StrokeWidth", "SyntheticBase", "PostScript", "BaseFontName", "BaseFontBlend", "ROS", "CIDFontVersion", "CIDFontRevision", "CIDFontType", "CIDCount", "UIDBase", "FDArray", "FDSelect", "FontName");

    /* JADX INFO: renamed from: du */
    private C2274ri f7081du;

    /* JADX INFO: renamed from: h4 */
    private C2300t6 f7082h4;

    /* JADX INFO: renamed from: k4 */
    private C3152yj f7083k4;

    /* JADX INFO: renamed from: kk */
    private boolean f7084kk;

    /* JADX INFO: renamed from: to */
    private boolean f7085to;

    /* JADX INFO: renamed from: x1 */
    private List<Integer> f7086x1;

    public C2053dq(InterfaceC2416zz interfaceC2416zz, C2300t6 c2300t6, boolean z) {
        super(interfaceC2416zz);
        this.f7082h4 = c2300t6;
        this.f7083k4 = new C3152yj();
        this.f7086x1 = new List<>();
        this.f7085to = z;
        m10377bz();
    }

    /* JADX INFO: renamed from: bz */
    private void m10377bz() {
    }

    /* JADX INFO: renamed from: ak */
    public final void m10378ak() {
        double dM11123to = mo10370tq().m11123to();
        this.f7082h4.f7941ts = C7019kk.m27438h4(Double.valueOf(dM11123to), 14);
        if (this.f7085to) {
            byte[] bArrM10307k4 = C2028c6.m10307k4(C7019kk.m27462to(Double.valueOf(dM11123to), 14) + m10388e0().f7828du);
            mo10383c6().write(bArrM10307k4, 0, bArrM10307k4.length);
            mo10383c6().writeByte((byte) 12);
            mo10383c6().writeByte((byte) 36);
            mo10396k4(true);
        }
    }

    /* JADX INFO: renamed from: ar */
    public final void m10379ar() {
        double dM11123to = mo10370tq().m11123to();
        this.f7082h4.f7920bv = C7019kk.m27435du(Double.valueOf(dM11123to), 14);
    }

    /* JADX INFO: renamed from: b3 */
    public final void m10380b3() {
        double dM11123to = mo10370tq().m11123to();
        this.f7082h4.f7951xk = C7019kk.m27438h4(Double.valueOf(dM11123to), 14);
    }

    /* JADX INFO: renamed from: bv */
    public final void m10381bv() {
        double dM11123to = mo10370tq().m11123to();
        double dM11123to2 = mo10370tq().m11123to();
        double dM11123to3 = mo10370tq().m11123to();
        this.f7082h4.f7935lr = C7019kk.m27435du(Double.valueOf(dM11123to3), 14);
        this.f7082h4.f7952yd = C7019kk.m27435du(Double.valueOf(dM11123to2), 14);
        this.f7082h4.f7919b3 = C7019kk.m27435du(Double.valueOf(dM11123to), 14) & 4294967295L;
        this.f7082h4.f7933k4 = true;
    }

    /* JADX INFO: renamed from: c5 */
    public final void m10382c5() {
        double dM11123to = mo10370tq().m11123to();
        this.f7082h4.f7942u4 = C7019kk.m27438h4(Double.valueOf(dM11123to), 14);
        if (this.f7085to) {
            byte[] bArrM10307k4 = C2028c6.m10307k4(C7019kk.m27462to(Double.valueOf(dM11123to), 14) + m10388e0().f7833x1);
            mo10383c6().write(bArrM10307k4, 0, bArrM10307k4.length);
            mo10383c6().writeByte((byte) 15);
            mo10396k4(true);
        }
    }

    @Override // com.aspose.slides.internal.p060ca.InterfaceC2087fj
    /* JADX INFO: renamed from: c6 */
    public final C3152yj mo10383c6() {
        return this.f7083k4;
    }

    /* JADX INFO: renamed from: ck */
    public final void m10384ck() {
        double dM11123to = mo10370tq().m11123to();
        this.f7082h4.f7947wl = C7019kk.m27438h4(Double.valueOf(dM11123to), 14);
        if (this.f7085to) {
            byte[] bArrM10307k4 = C2028c6.m10307k4(C7019kk.m27462to(Double.valueOf(dM11123to), 14) + m10388e0().f7832to);
            mo10383c6().write(bArrM10307k4, 0, bArrM10307k4.length);
            mo10383c6().writeByte((byte) 18);
            mo10396k4(true);
        }
    }

    /* JADX INFO: renamed from: dq */
    public final void m10385dq() {
        double dM11123to = mo10370tq().m11123to();
        this.f7082h4.f7928e0 = C7019kk.m27438h4(Double.valueOf(dM11123to), 14);
        if (this.f7085to) {
            byte[] bArrM10307k4 = C2028c6.m10307k4(C7019kk.m27462to(Double.valueOf(dM11123to), 14) + m10388e0().f7831kk);
            mo10383c6().write(bArrM10307k4, 0, bArrM10307k4.length);
            mo10383c6().writeByte((byte) 12);
            mo10383c6().writeByte((byte) 37);
            mo10396k4(true);
        }
    }

    /* JADX INFO: renamed from: du */
    public final void m10386du() {
        double dM11123to = mo10370tq().m11123to();
        this.f7082h4.f7936m9 = C7019kk.m27435du(Double.valueOf(dM11123to), 14);
    }

    /* JADX INFO: renamed from: dy */
    public final void m10387dy() {
        this.f7082h4.f7931ix = new double[mo10370tq().m11120k4()];
        for (int length = this.f7082h4.f7931ix.length - 1; length >= 0; length--) {
            this.f7082h4.f7931ix[length] = mo10370tq().m11123to();
        }
    }

    /* JADX INFO: renamed from: e0 */
    public final C2274ri m10388e0() {
        return this.f7081du;
    }

    /* JADX INFO: renamed from: fa */
    public final void m10389fa() {
        double dM11123to = mo10370tq().m11123to();
        double dM11123to2 = mo10370tq().m11123to();
        this.f7082h4.f7938qq = C7019kk.m27438h4(Double.valueOf(dM11123to2), 14);
        this.f7082h4.f7918ar = C7019kk.m27435du(Double.valueOf(dM11123to), 14) & 4294967295L;
        if (this.f7085to) {
            byte[] bArrM10307k4 = C2028c6.m10307k4(C7019kk.m27462to(Double.valueOf(dM11123to), 14) + m10388e0().f7829h4);
            mo10383c6().write(bArrM10307k4, 0, bArrM10307k4.length);
            mo10383c6().writeByte((byte) 18);
            mo10396k4(true);
        }
    }

    /* JADX INFO: renamed from: h4 */
    public final void m10390h4() {
        double dM11123to = mo10370tq().m11123to();
        double dM11123to2 = mo10370tq().m11123to();
        double dM11123to3 = mo10370tq().m11123to();
        double dM11123to4 = mo10370tq().m11123to();
        this.f7082h4.f7950x6 = new C2054dt(dM11123to4, dM11123to3, dM11123to2, dM11123to);
    }

    /* JADX INFO: renamed from: ix */
    public final void m10391ix() {
        double dM11123to = mo10370tq().m11123to();
        this.f7082h4.f7944up = C7019kk.m27462to(Double.valueOf(dM11123to), 14);
    }

    /* JADX INFO: renamed from: jd */
    public final void m10392jd() {
        double dM11123to = mo10370tq().m11123to();
        this.f7082h4.f7945uz = C7019kk.m27438h4(Double.valueOf(dM11123to), 14);
        if (this.f7085to) {
            byte[] bArrM10307k4 = C2028c6.m10307k4(C7019kk.m27462to(Double.valueOf(dM11123to), 14) + m10388e0().f7830k4);
            mo10383c6().write(bArrM10307k4, 0, bArrM10307k4.length);
            mo10383c6().writeByte((byte) 16);
            mo10396k4(true);
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m10393k4() {
        double dM11123to = mo10370tq().m11123to();
        this.f7082h4.f7949x1 = C7019kk.m27435du(Double.valueOf(dM11123to), 14);
    }

    /* JADX INFO: renamed from: kk */
    public final void m10397kk() {
        double dM11123to = mo10370tq().m11123to();
        this.f7082h4.f7926du = C7019kk.m27435du(Double.valueOf(dM11123to), 14);
    }

    /* JADX INFO: renamed from: ks */
    public final void m10398ks() {
        double dM11123to = mo10370tq().m11123to();
        this.f7082h4.f7922c5 = C7019kk.m27438h4(Double.valueOf(dM11123to), 14);
    }

    /* JADX INFO: renamed from: lr */
    public final void m10399lr() {
        double dM11123to = mo10370tq().m11123to();
        this.f7082h4.f7917ak = C7019kk.m27438h4(Double.valueOf(dM11123to), 14);
    }

    /* JADX INFO: renamed from: m9 */
    public final void m10400m9() {
        double dM11123to = mo10370tq().m11123to();
        this.f7082h4.f7939rv = C7019kk.m27438h4(Double.valueOf(dM11123to), 14);
    }

    /* JADX INFO: renamed from: ne */
    public final void m10401ne() {
        double dM11123to = mo10370tq().m11123to();
        this.f7082h4.f7929fa = C7019kk.m27462to(Double.valueOf(dM11123to), 14);
    }

    /* JADX INFO: renamed from: qq */
    public final void m10402qq() {
        double dM11123to = mo10370tq().m11123to();
        this.f7082h4.f7946v4 = C7019kk.m27435du(Double.valueOf(dM11123to), 14);
    }

    /* JADX INFO: renamed from: rv */
    public final void m10403rv() {
        double dM11123to = mo10370tq().m11123to();
        this.f7082h4.f7932jd = C7019kk.m27438h4(Double.valueOf(dM11123to), 14);
    }

    /* JADX INFO: renamed from: to */
    public final void m10404to() {
        double dM11123to = mo10370tq().m11123to();
        this.f7082h4.f7930h4 = C7019kk.m27435du(Double.valueOf(dM11123to), 14);
    }

    @Override // com.aspose.slides.internal.p060ca.InterfaceC2087fj
    /* JADX INFO: renamed from: ts */
    public final boolean mo10405ts() {
        return this.f7084kk;
    }

    /* JADX INFO: renamed from: u4 */
    public final void m10406u4() {
        double dM11123to = mo10370tq().m11123to();
        double dM11123to2 = mo10370tq().m11123to();
        double dM11123to3 = mo10370tq().m11123to();
        double dM11123to4 = mo10370tq().m11123to();
        double dM11123to5 = mo10370tq().m11123to();
        this.f7082h4.f7953yj = new C2372xo(new double[]{mo10370tq().m11123to(), dM11123to5, dM11123to4, dM11123to3, dM11123to2, dM11123to});
    }

    /* JADX INFO: renamed from: um */
    public final void m10407um() {
    }

    /* JADX INFO: renamed from: up */
    public final void m10408up() {
        double dM11123to = mo10370tq().m11123to();
        this.f7082h4.f7940to = C7019kk.m27435du(Double.valueOf(dM11123to), 14);
    }

    /* JADX INFO: renamed from: uz */
    public final void m10409uz() {
        double dM11123to = mo10370tq().m11123to();
        this.f7082h4.f7937ne = C7019kk.m27438h4(Double.valueOf(dM11123to), 14);
    }

    /* JADX INFO: renamed from: v4 */
    public final void m10410v4() {
        double dM11123to = mo10370tq().m11123to();
        this.f7082h4.f7948wy = C7019kk.m27438h4(Double.valueOf(dM11123to), 14);
    }

    /* JADX INFO: renamed from: wl */
    public final void m10411wl() {
        double dM11123to = mo10370tq().m11123to();
        this.f7082h4.f7940to = C7019kk.m27435du(Double.valueOf(dM11123to), 14);
    }

    /* JADX INFO: renamed from: wy */
    public final void m10412wy() {
        double dM11123to = mo10370tq().m11123to();
        this.f7082h4.f7923c6 = C7019kk.m27438h4(Double.valueOf(dM11123to), 14);
    }

    /* JADX INFO: renamed from: x1 */
    public final void m10413x1() {
        double dM11123to = mo10370tq().m11123to();
        this.f7082h4.f7934kk = C7019kk.m27435du(Double.valueOf(dM11123to), 14);
    }

    /* JADX INFO: renamed from: x6 */
    public final void m10414x6() {
        double dM11123to = mo10370tq().m11123to();
        this.f7082h4.f7924ck = C7019kk.m27438h4(Double.valueOf(dM11123to), 14);
    }

    /* JADX INFO: renamed from: xk */
    public final void m10415xk() {
        double dM11123to = mo10370tq().m11123to();
        this.f7082h4.f7921bz = C7019kk.m27435du(Double.valueOf(dM11123to), 14);
    }

    /* JADX INFO: renamed from: yd */
    public final void m10416yd() {
        double dM11123to = mo10370tq().m11123to();
        this.f7082h4.f7925dq = C7019kk.m27438h4(Double.valueOf(dM11123to), 14);
    }

    /* JADX INFO: renamed from: yj */
    public final void m10417yj() {
        double dM11123to = mo10370tq().m11123to();
        this.f7082h4.f7927dy = C14080ne.m66961k4(Double.valueOf(dM11123to));
    }

    /* JADX INFO: renamed from: k4 */
    public final void m10394k4(C2274ri c2274ri) {
        this.f7081du = c2274ri;
    }

    @Override // com.aspose.slides.internal.p060ca.AbstractC2119hu
    /* JADX INFO: renamed from: k4 */
    public void mo10395k4(String str) {
        switch (f7080m9.m27428k4(str)) {
            case 0:
                m10393k4();
                break;
            case 1:
                m10413x1();
                break;
            case 2:
                m10397kk();
                break;
            case 3:
                m10404to();
                break;
            case 4:
                m10386du();
                break;
            case 5:
                m10390h4();
                break;
            case 6:
                m10400m9();
                break;
            case 7:
                m10387dy();
                break;
            case 8:
                m10382c5();
                break;
            case 9:
                m10392jd();
                break;
            case 10:
                m10384ck();
                break;
            case 11:
                m10389fa();
                break;
            case 12:
                m10408up();
                break;
            case 13:
                m10417yj();
                break;
            case 14:
                m10398ks();
                break;
            case 15:
                m10403rv();
                break;
            case 16:
                m10414x6();
                break;
            case 17:
                m10401ne();
                break;
            case 18:
                m10391ix();
                break;
            case 19:
                m10406u4();
                break;
            case 20:
                m10409uz();
                break;
            case 21:
                m10411wl();
                break;
            case 22:
                m10402qq();
                break;
            case 23:
                m10379ar();
                break;
            case 24:
                m10407um();
                break;
            case 25:
                m10381bv();
                break;
            case 26:
                m10410v4();
                break;
            case 27:
                m10399lr();
                break;
            case 28:
                m10416yd();
                break;
            case 29:
                m10380b3();
                break;
            case 30:
                m10412wy();
                break;
            case 31:
                m10378ak();
                break;
            case 32:
                m10385dq();
                break;
            case 33:
                m10415xk();
                break;
        }
    }

    @Override // com.aspose.slides.internal.p060ca.InterfaceC2087fj
    /* JADX INFO: renamed from: k4 */
    public final void mo10396k4(boolean z) {
        this.f7084kk = z;
    }
}
