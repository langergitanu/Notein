package com.aspose.slides.internal.p039be;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Specialized.OooO00o;
import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.aspose.slides.internal.p085dk.C3177m9;
import com.aspose.slides.internal.p294n9.C6765kp;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p346pw.C9574to;
import com.aspose.slides.internal.p353q7.C9787sv;
import com.aspose.slides.internal.p353q7.C9790ts;
import com.aspose.slides.internal.p353q7.C9797wp;
import com.aspose.slides.internal.p416tb.C10894bv;
import com.aspose.slides.internal.p416tb.C10898dy;
import com.aspose.slides.internal.p416tb.C10921yd;
import com.aspose.slides.internal.p416tb.C10922yj;
import com.aspose.slides.internal.p420th.C10963ks;
import com.aspose.slides.internal.p475wh.C12016rv;
import com.aspose.slides.internal.p505xn.C12561ix;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.C14116yg;
import com.aspose.slides.p559ms.System.C14117yj;

/* JADX INFO: renamed from: com.aspose.slides.internal.be.jd */
/* JADX INFO: loaded from: classes3.dex */
public class C1684jd extends AbstractC1689x1 {

    /* JADX INFO: renamed from: du */
    private final C10894bv f6389du;

    /* JADX INFO: renamed from: h4 */
    private final C9787sv f6390h4;

    /* JADX INFO: renamed from: to */
    private final C1685k4 f6391to;

    public C1684jd(C10898dy c10898dy, int i, C9790ts c9790ts, int i2, int i3) {
        super(c10898dy, i, c9790ts, i2);
        this.f6391to = new C1685k4(c10898dy, this);
        this.f6389du = new C10894bv(c10898dy);
        m9122k4(C3177m9.m13599k4(i3, 4));
        C9787sv c9787sv = new C9787sv(c9790ts, m9128u4(), !m9128u4() && c10898dy.m52464x1().m52604ck() == 0);
        this.f6390h4 = c9787sv;
        c9787sv.m48151k4(65);
    }

    /* JADX INFO: renamed from: ar */
    private C12561ix m9090ar() {
        C12561ix c12561ix = new C12561ix();
        for (int i = 0; i < this.f6390h4.m48157x1().m58582k4(); i++) {
            c12561ix.m58588x1(((Integer) C7019kk.m27464to(this.f6390h4.m48157x1().m58586kk(i), Integer.TYPE)).intValue(), Integer.valueOf(this.f6390h4.m48157x1().m58587to(i)));
        }
        return c12561ix;
    }

    /* JADX INFO: renamed from: kk */
    private void m9093kk(C10922yj c10922yj) {
        this.f6389du.m52434x1("/CIDInit /ProcSet findresource begin");
        this.f6389du.m52434x1("11 dict begin");
        this.f6389du.m52434x1("begincmap");
        this.f6389du.m52434x1("/CIDSystemInfo");
        this.f6389du.m52434x1("<< /Registry (Adobe)");
        this.f6389du.m52434x1("/Ordering (UCS)");
        this.f6389du.m52434x1("/Supplement 0");
        this.f6389du.m52434x1(">> def");
        this.f6389du.m52434x1("/CMapName /Adobe-Identity-UCS def");
        this.f6389du.m52434x1("/CMapType 2 def");
        this.f6389du.m52434x1("1 begincodespacerange");
        this.f6389du.m52434x1("<0000><FFFF>");
        this.f6389du.m52434x1("endcodespacerange");
        m9094qq();
        this.f6389du.m52434x1("endcmap");
        this.f6389du.m52434x1("CMapName currentdict /CMap defineresource pop");
        this.f6389du.m52434x1("end");
        this.f6389du.m52434x1("end");
        this.f6389du.mo9082k4(c10922yj);
    }

    /* JADX INFO: renamed from: qq */
    private void m9094qq() {
        C12561ix c12561ixM9090ar = m9090ar();
        this.f6389du.m52435x1("{0} beginbfchar", C9574to.m46742k4(c12561ixM9090ar.m58582k4()));
        for (int i = 0; i < c12561ixM9090ar.m58582k4(); i++) {
            this.f6389du.m52436x1("<{0}><{1}>", C9574to.m46744kk(c12561ixM9090ar.m58587to(i)), C9574to.m46744kk(((Integer) C7019kk.m27464to(c12561ixM9090ar.m58586kk(i), Integer.TYPE)).intValue()));
        }
        this.f6389du.m52434x1("endbfchar");
    }

    @Override // com.aspose.slides.internal.p039be.AbstractC1689x1
    /* JADX INFO: renamed from: k4 */
    public void mo9087k4(AbstractC3150x6 abstractC3150x6) {
        this.f6390h4.m48154k4(abstractC3150x6, false, m9128u4());
    }

    /* JADX INFO: renamed from: x1 */
    public final String m9100x1(int i) {
        C6765kp c6765kpOooO00o = OooO00o.OooO00o("[");
        for (int i2 = 0; i2 < this.f6390h4.m48157x1().m58582k4(); i2++) {
            int iM58587to = this.f6390h4.m48157x1().m58587to(i2);
            int iIntValue = ((Integer) C7019kk.m27464to(this.f6390h4.m48157x1().m58586kk(i2), Integer.TYPE)).intValue();
            int iM9121k4 = m9121k4(((AbstractC1689x1) this).f6405k4.m48221m9().m48107x1(iM58587to).m48285kk());
            if (iM9121k4 != i && iM9121k4 < 32767) {
                c6765kpOooO00o.m26792k4(C9574to.m46742k4(iIntValue));
                c6765kpOooO00o.m26792k4("[");
                c6765kpOooO00o.m26792k4(C9574to.m46742k4(iM9121k4));
                c6765kpOooO00o.m26792k4("]");
            }
        }
        c6765kpOooO00o.m26792k4("]");
        return c6765kpOooO00o.toString();
    }

    @Override // com.aspose.slides.internal.p416tb.AbstractC10914up
    /* JADX INFO: renamed from: k4 */
    public void mo9082k4(C10922yj c10922yj) {
        m9095x1(c10922yj);
        this.f6391to.mo9082k4(c10922yj);
        m9093kk(c10922yj);
    }

    /* JADX INFO: renamed from: k4 */
    private boolean m9091k4(C10921yd c10921yd, int i) {
        if (i >= 0) {
            c10921yd.m52647k4(i);
        }
        return i <= 0;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m9096k4(C10963ks c10963ks, String str, C10921yd c10921yd) {
        if (m9092k4(str) && ((AbstractC1689x1) this).f6405k4.m48248yd() != null) {
            return m9097k4(str, c10921yd, c10963ks);
        }
        c10921yd.m52650k4("[");
        c10921yd.m52650k4("(");
        boolean zM9098k4 = m9098k4(str, c10921yd, c10963ks.m52994k4());
        c10921yd.m52672x1(")");
        c10921yd.m52672x1("]");
        c10921yd.m52672x1("TJ");
        return zM9098k4;
    }

    /* JADX INFO: renamed from: k4 */
    private boolean m9092k4(String str) {
        int i = 0;
        while (i < str.length()) {
            int iCharAt = str.charAt(i);
            if (C14117yj.m67514du(str.charAt(i))) {
                char cCharAt = str.charAt(i);
                i++;
                iCharAt = C14117yj.m67525k4(cCharAt, str.charAt(i));
            }
            if (((AbstractC1689x1) this).f6405k4.m48221m9().m48107x1(iCharAt).m48285kk() == 0) {
                return true;
            }
            i++;
        }
        return false;
    }

    /* JADX INFO: renamed from: x1 */
    private void m9095x1(C10922yj c10922yj) {
        c10922yj.m52676k4(this);
        c10922yj.m52643dy();
        c10922yj.m52666kk("/Type", "/Font");
        c10922yj.m52666kk("/Subtype", "/Type0");
        c10922yj.m52666kk("/Encoding", "/Identity-H");
        c10922yj.m52666kk("/BaseFont", C14113y2.m67402k4("/{0}", m9127to()));
        c10922yj.m52666kk("/DescendantFonts", C14113y2.m67402k4("[{0}]", this.f6391to.m52565c5()));
        c10922yj.m52666kk("/ToUnicode", this.f6389du.m52565c5());
        c10922yj.m52640c5();
        c10922yj.m52678x1();
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m9097k4(String str, C10921yd c10921yd, C10963ks c10963ks) {
        float f;
        int i;
        int i2;
        boolean z;
        boolean z2;
        float f2;
        String str2;
        float fM48175c5;
        float fM56713x1;
        float f3;
        float fM56708k4;
        String str3 = str;
        float fM23114dy = c10963ks.m53005x1().m23114dy();
        float fM53007x6 = c10963ks.m53007x6();
        int i3 = 0;
        boolean z3 = false;
        float f4 = 0.0f;
        int i4 = Integer.MIN_VALUE;
        float fM48196k4 = 0.0f;
        double dM48193k4 = 0.0d;
        int i5 = Integer.MIN_VALUE;
        float f5 = 0.0f;
        float f6 = 0.0f;
        while (i3 < str3.length()) {
            int iCharAt = str3.charAt(i3);
            if (C14117yj.m67514du(str3.charAt(i3))) {
                char cCharAt = str3.charAt(i3);
                i3++;
                iCharAt = C14117yj.m67525k4(cCharAt, str3.charAt(i3));
            }
            int iM48287x1 = ((AbstractC1689x1) this).f6405k4.m48221m9().m48107x1(iCharAt).m48287x1();
            int iM48151k4 = this.f6390h4.m48151k4(iCharAt);
            int i6 = i3;
            if (iM48151k4 >= 0) {
                if (i6 > 0) {
                    dM48193k4 = fM53007x6;
                }
                if (((AbstractC1689x1) this).f6405k4.m48220lr() != null) {
                    z = z3;
                    f = fM53007x6;
                    f2 = f4;
                    dM48193k4 = ((((AbstractC1689x1) this).f6405k4.m48193k4(((long) i5) & 4294967295L, ((long) iM48287x1) & 4294967295L) / ((double) ((AbstractC1689x1) this).f6405k4.m48175c5())) * ((double) fM23114dy)) + dM48193k4;
                } else {
                    f = fM53007x6;
                    f2 = f4;
                    z = z3;
                }
                double d = dM48193k4;
                if (((AbstractC1689x1) this).f6405k4.m48248yd() != null) {
                    i2 = iCharAt;
                    long j = ((long) iM48287x1) & 4294967295L;
                    i = iM48287x1;
                    if (((AbstractC1689x1) this).f6405k4.m48248yd().m48264k4().containsKey(Long.valueOf(j))) {
                        if (i5 != Integer.MIN_VALUE) {
                            float fM48196k42 = ((AbstractC1689x1) this).f6405k4.m48196k4(i4, fM23114dy);
                            if (fM48196k42 > 0.0f) {
                                f6 = fM48196k42;
                            }
                            Dictionary<Integer, C12016rv> dictionary = ((AbstractC1689x1) this).f6405k4.m48248yd().m48264k4().get_Item(Long.valueOf(j));
                            int i7 = 0;
                            while (!dictionary.containsKey(Integer.valueOf(i7)) && dictionary.size() > 0) {
                                i7++;
                            }
                            long j2 = ((long) i5) & 4294967295L;
                            int i8 = i7;
                            if (((AbstractC1689x1) this).f6405k4.m48248yd().m48267x1().containsKey(Long.valueOf(j2))) {
                                Dictionary<Integer, C12016rv> dictionary2 = ((AbstractC1689x1) this).f6405k4.m48248yd().m48267x1().get_Item(Long.valueOf(j2));
                                C12016rv c12016rv = new C12016rv();
                                if (dictionary2.containsKey(Integer.valueOf(i8))) {
                                    dictionary2.get_Item(Integer.valueOf(i8)).CloneTo(c12016rv);
                                    fM56708k4 = ((c12016rv.m56708k4() - dictionary.get_Item(Integer.valueOf(i8)).m56708k4()) / ((AbstractC1689x1) this).f6405k4.m48175c5()) * fM23114dy;
                                    fM56713x1 = ((c12016rv.m56713x1() - dictionary.get_Item(Integer.valueOf(i8)).m56713x1()) / ((AbstractC1689x1) this).f6405k4.m48175c5()) * fM23114dy;
                                    f3 = (fM48196k4 + fM56708k4) - fM48196k42;
                                } else {
                                    f3 = fM48196k4 - fM48196k42;
                                    fM56708k4 = 0.0f;
                                    fM56713x1 = 0.0f;
                                }
                                fM48175c5 = fM56713x1;
                                f5 = fM56708k4;
                            } else {
                                fM48175c5 = ((dictionary.containsKey(0) ? 150.0f : -150.0f) / ((AbstractC1689x1) this).f6405k4.m48175c5()) * fM23114dy * ((((AbstractC1689x1) this).f6405k4.m48183dy() & 1) != 0 ? 2.0f : 1.0f);
                                float fM48196k43 = fM48196k42 == 0.0f ? fM48196k4 : ((((AbstractC1689x1) this).f6405k4.m48196k4(i4, fM23114dy) / 2.0f) + (fM48196k4 - fM48196k42)) - ((dictionary.get_Item(Integer.valueOf(i8)).m56708k4() / ((AbstractC1689x1) this).f6405k4.m48175c5()) * fM23114dy);
                                fM56713x1 = f2 + fM48175c5;
                                f5 = (fM48196k43 - fM48196k4) + fM48196k42 + f5;
                                f3 = fM48196k43;
                            }
                            c10921yd.m52650k4(C14113y2.m67401k4(C14113y2.m67402k4("{0} {1} Td ", Double.valueOf(C14116yg.m67477k4(f3, 1)), Double.valueOf(C14116yg.m67477k4(fM48175c5, 1))), ",", "."));
                            c10921yd.m52650k4("(");
                            c10921yd.m52647k4(iM48151k4);
                            c10921yd.m52650k4(")Tj ");
                            f4 = fM56713x1;
                            fM48196k4 = 0.0f;
                        } else {
                            c10921yd.m52650k4("(");
                            c10921yd.m52647k4(iM48151k4);
                            c10921yd.m52650k4(")Tj ");
                            f4 = f2;
                        }
                        dM48193k4 = d;
                        z2 = true;
                    } else {
                        str2 = "(";
                    }
                } else {
                    i = iM48287x1;
                    i2 = iCharAt;
                    str2 = "(";
                }
                if (f5 == 0.0f && f2 == 0.0f) {
                    if (d != 0.0d) {
                        c10921yd.m52650k4(C14113y2.m67401k4(C14113y2.m67402k4("{0} {1} Td ", Double.valueOf(C14116yg.m67477k4(((double) fM48196k4) + d, 1)), 0), ",", "."));
                        fM48196k4 = 0.0f;
                    }
                    dM48193k4 = d;
                    z2 = true;
                } else {
                    z2 = true;
                    c10921yd.m52650k4(C14113y2.m67401k4(C14113y2.m67402k4("{0} {1} Td ", Double.valueOf(C14116yg.m67477k4(((double) (f6 - f5)) + d, 1)), Double.valueOf(C14116yg.m67477k4(-f2, 1))), ",", "."));
                    dM48193k4 = 0.0d;
                    fM48196k4 = 0.0f;
                    f5 = 0.0f;
                    f2 = 0.0f;
                }
                c10921yd.m52650k4(str2);
                c10921yd.m52647k4(iM48151k4);
                c10921yd.m52650k4(")Tj ");
                f4 = f2;
            } else {
                f = fM53007x6;
                i = iM48287x1;
                i2 = iCharAt;
                z = z3;
                z2 = true;
            }
            z3 = iM48151k4 <= 0 ? z2 : z;
            int i9 = i2;
            fM48196k4 += ((AbstractC1689x1) this).f6405k4.m48196k4(i9, fM23114dy);
            i3 = i6 + 1;
            str3 = str;
            i4 = i9;
            fM53007x6 = f;
            i5 = i;
        }
        return z3;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m9098k4(String str, C10921yd c10921yd, boolean z) {
        double d;
        int i = 0;
        boolean z2 = false;
        int i2 = Integer.MIN_VALUE;
        double dM48193k4 = 0.0d;
        while (i < str.length()) {
            int iCharAt = str.charAt(i);
            if (C14117yj.m67514du(str.charAt(i))) {
                char cCharAt = str.charAt(i);
                i++;
                iCharAt = C14117yj.m67525k4(cCharAt, str.charAt(i));
            }
            int iM48287x1 = ((AbstractC1689x1) this).f6405k4.m48221m9().m48107x1(iCharAt).m48287x1();
            int iM48151k4 = this.f6390h4.m48151k4(iCharAt);
            if (iM48151k4 >= 0) {
                if (i2 == Integer.MIN_VALUE || !z || ((AbstractC1689x1) this).f6405k4.m48220lr() == null) {
                    d = 0.0d;
                } else {
                    d = 0.0d;
                    dM48193k4 = ((AbstractC1689x1) this).f6405k4.m48193k4(((long) i2) & 4294967295L, ((long) iM48287x1) & 4294967295L);
                }
                if (dM48193k4 != d) {
                    c10921yd.m52650k4(C14113y2.m67402k4(") {0} (", Integer.valueOf(-com.aspose.slides.Collections.Generic.OooO00o.OooO00o(dM48193k4 / ((double) ((AbstractC1689x1) this).f6405k4.m48175c5()), 1000.0d, 14))));
                }
                c10921yd.m52647k4(iM48151k4);
            }
            if (iM48151k4 <= 0) {
                z2 = true;
            }
            i++;
            i2 = iM48287x1;
        }
        return z2;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m9099k4(int[] iArr, C10921yd c10921yd) {
        boolean z = false;
        for (int i : iArr) {
            C9797wp c9797wpM48105to = this.f6390h4.m48156kk().m48221m9().m48105to(i);
            if (m9091k4(c10921yd, this.f6390h4.m48152k4(c9797wpM48105to, c9797wpM48105to.m48284k4()))) {
                z = true;
            }
        }
        return z;
    }

    @Override // com.aspose.slides.internal.p039be.AbstractC1689x1
    /* JADX INFO: renamed from: k4 */
    public byte[] mo9089k4() {
        int iM27462to = C7019kk.m27462to(Double.valueOf(C14116yg.m67501x1(((double) this.f6390h4.m48157x1().m58582k4()) / 8.0d)), 14);
        byte[] bArr = new byte[iM27462to];
        for (int i = 0; i < iM27462to; i++) {
            bArr[i] = -1;
        }
        return bArr;
    }
}
