package com.aspose.slides;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p077d8.C3085sv;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p314oc.InterfaceC7014c5;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.C14044b3;
import com.aspose.slides.p559ms.System.C14116yg;
import com.aspose.words.StyleIdentifier;

/* JADX INFO: renamed from: com.aspose.slides.ok */
/* JADX INFO: loaded from: classes3.dex */
class C14240ok extends AbstractC0753ak {

    /* JADX INFO: renamed from: k4 */
    private double f47838k4;

    /* JADX INFO: renamed from: com.aspose.slides.ok$k4 */
    public static class k4 {

        /* JADX INFO: renamed from: k4 */
        private double f47839k4;

        /* JADX INFO: renamed from: kk */
        private double f47840kk;

        /* JADX INFO: renamed from: x1 */
        private double f47841x1;

        public k4(double d, double d2, double d3, double d4, boolean z) {
            double d5 = d3 - 90.0d;
            this.f47841x1 = d5;
            if (d5 < 0.0d) {
                this.f47841x1 = d5 + 360.0d;
            }
            this.f47840kk = d4;
            jof jofVarClone = m68650k4(m68651k4(this.f47841x1, d4), z).Clone();
            this.f47839k4 = C14116yg.m67491kk(d / (jofVarClone.m63453c5() != 0.0d ? jofVarClone.m63453c5() : 1.0d), d2 / (jofVarClone.m63459jd() != 0.0d ? jofVarClone.m63459jd() : 1.0d));
        }

        /* JADX INFO: renamed from: k4 */
        public final double m68652k4() {
            return this.f47839k4;
        }

        /* JADX INFO: renamed from: k4 */
        private static double m68649k4(double d) {
            if (d == 0.0d) {
                return d;
            }
            if (d > 0.0d && d <= 90.0d) {
                return 90.0d;
            }
            if (d <= 90.0d || d > 180.0d) {
                return (d <= 180.0d || d > 270.0d) ? 360.0d : 270.0d;
            }
            return 180.0d;
        }

        /* JADX INFO: renamed from: k4 */
        private static jof m68650k4(double[] dArr, boolean z) {
            jof jofVar = new jof(0.0d, 0.0d, 0.0d, 0.0d);
            tbp tbpVar = new tbp(C14116yg.m67470dy(C14240ok.m68640kk(dArr[0])), C14116yg.m67495m9(C14240ok.m68640kk(dArr[0])));
            new tbp();
            for (int i = 1; i < dArr.length; i++) {
                tbp tbpVar2 = new tbp(C14116yg.m67470dy(C14240ok.m68640kk(dArr[i])), C14116yg.m67495m9(C14240ok.m68640kk(dArr[i])));
                if (i != 1 || z) {
                    jof.m63452x1(jofVar, new jof(tbpVar.f49090k4, tbpVar.f49091x1, tbpVar2.f49090k4, tbpVar2.f49091x1)).CloneTo(jofVar);
                } else {
                    jofVar = new jof(tbpVar.f49090k4, tbpVar.f49091x1, tbpVar2.f49090k4, tbpVar2.f49091x1);
                }
                tbpVar2.CloneTo(tbpVar);
            }
            return jofVar;
        }

        /* JADX INFO: renamed from: k4 */
        private static double[] m68651k4(double d, double d2) {
            double d3;
            if (d2 == 360.0d) {
                return new double[]{d};
            }
            List list = new List();
            if (d2 > 0.0d) {
                d3 = d2 + d;
            } else {
                d = C14240ok.m68644x1(d + d2, false);
                d3 = d - d2;
            }
            list.addItem(Double.valueOf(d));
            while (d < d3) {
                double dM68649k4 = m68649k4(C14240ok.m68644x1(d, false));
                if (((double) (d > 360.0d ? StyleIdentifier.LIST_TABLE_4_ACCENT_5 : 0)) + dM68649k4 < C14240ok.m68644x1(d3, true) && !list.containsItem(Double.valueOf(dM68649k4))) {
                    list.addItem(Double.valueOf(dM68649k4));
                }
                d += 90.0d;
            }
            double dM68644x1 = C14240ok.m68644x1(d3, false);
            if (list.containsItem(Double.valueOf(dM68644x1))) {
                list.addItem(Double.valueOf(C14240ok.m68644x1(dM68644x1, false)));
            }
            return C3085sv.m13105to((List<Double>) list);
        }

        /* JADX INFO: renamed from: k4 */
        public final double[] m68653k4(int i, boolean z, double[] dArr) {
            double d;
            double dM68644x1 = this.f47841x1;
            double d2 = this.f47840kk;
            int i2 = 0;
            if (d2 > 0.0d) {
                d = d2 + dM68644x1;
            } else {
                dM68644x1 = C14240ok.m68644x1(d2 + dM68644x1, false);
                d = dM68644x1 - this.f47840kk;
            }
            if (z) {
                i--;
            }
            List list = new List();
            if (z) {
                list.addItem(Double.valueOf(Double.NaN));
            }
            if (i > 0) {
                dArr[0] = (d - dM68644x1) / ((C14116yg.m67475k4(this.f47840kk) == 360.0d || i == 1) ? i : i - 1);
                for (int i3 = 0; i3 < i; i3++) {
                    list.addItem(Double.valueOf(C14240ok.m68644x1(dM68644x1, false)));
                    dM68644x1 += dArr[0];
                }
                if (this.f47840kk < 0.0d) {
                    int size = list.size();
                    double[] dArr2 = new double[size];
                    if (z) {
                        dArr2[0] = ((Double) list.get_Item(0)).doubleValue();
                        i2 = 1;
                    }
                    if (this.f47840kk == -360.0d) {
                        dArr2[i2] = ((Double) list.get_Item(i2)).doubleValue();
                        i2++;
                    }
                    int i4 = size - 1;
                    while (i2 < size) {
                        dArr2[i2] = ((Double) list.get_Item(i4)).doubleValue();
                        i4--;
                        i2++;
                    }
                    return dArr2;
                }
            } else {
                dArr[0] = 0.0d;
            }
            return C3085sv.m13105to((List<Double>) list);
        }
    }

    static {
        C7019kk.m27454k4(jof.class, (InterfaceC7014c5) new InterfaceC7014c5<jof>() { // from class: com.aspose.slides.ok.1
            @Override // com.aspose.slides.internal.p314oc.InterfaceC7014c5
            /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
            public jof mo838x1() {
                return new jof();
            }
        });
        C7019kk.m27454k4(tbp.class, (InterfaceC7014c5) new InterfaceC7014c5<tbp>() { // from class: com.aspose.slides.ok.2
            @Override // com.aspose.slides.internal.p314oc.InterfaceC7014c5
            /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
            public tbp mo838x1() {
                return new tbp();
            }
        });
    }

    /* JADX INFO: renamed from: c5 */
    private C0824bn m68630c5() {
        return (C0824bn) m3643k4();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: kk */
    public static double m68640kk(double d) {
        return m68644x1(d, false) * 0.017453292519943295d;
    }

    /* JADX INFO: renamed from: to */
    private static tbp m68642to(double d) {
        if (C14044b3.m66437kk(d)) {
            return tbp.f49088kk;
        }
        double dM68640kk = m68640kk(d);
        return new tbp(C14116yg.m67470dy(dM68640kk), C14116yg.m67495m9(dM68640kk));
    }

    /* JADX INFO: renamed from: dy */
    public final double m68646dy() {
        return this.f47838k4;
    }

    /* JADX INFO: renamed from: dy */
    private static tbp m68631dy(bay bayVar) {
        double dM74154k4 = yz6.m74154k4(100.0d);
        double dM74241jd = (bayVar.m4074dy().m74233dy() == 0.0d && C7019kk.m27469x1(bayVar.m4077jd(), cpm.class)) ? dM74154k4 : bayVar.m4074dy().m74241jd();
        if (bayVar.m4074dy().m74236fa() != 0.0d || !C7019kk.m27469x1(bayVar.m4077jd(), cpm.class)) {
            dM74154k4 = bayVar.m4074dy().m74290yj();
        }
        return new tbp(dM74241jd, dM74154k4);
    }

    /* JADX INFO: renamed from: k4 */
    private static double m68633k4(jof jofVar, double d, double d2) {
        return C14116yg.m67491kk(C14116yg.m67491kk(1.0d, d / jofVar.m63453c5()), C14116yg.m67491kk(1.0d, d2 / jofVar.m63459jd()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x1 */
    public static double m68644x1(double d, boolean z) {
        if (!z) {
            d %= 360.0d;
        }
        return d < 0.0d ? d + 360.0d : d;
    }

    @Override // com.aspose.slides.AbstractC0753ak
    /* JADX INFO: renamed from: kk */
    public tbp mo3648kk(bay bayVar) {
        z2c z2cVarM4074dy = bayVar.m4074dy();
        tbp tbpVar = new tbp(z2cVarM4074dy.m74256kk(2), z2cVarM4074dy.m74256kk(3));
        return tbpVar.m71067x1() == 0.0d ? super.mo3648kk(bayVar) : tbpVar;
    }

    /* JADX INFO: renamed from: k4 */
    private static double m68634k4(jof jofVar, jof jofVar2) {
        tbp[] tbpVarArrM63467ks = jofVar.m63467ks();
        tbp[] tbpVarArrM63467ks2 = jofVar2.m63467ks();
        jof jofVar3 = new jof();
        double dM63457fa = Double.MAX_VALUE;
        for (tbp tbpVar : tbpVarArrM63467ks) {
            for (tbp tbpVar2 : tbpVarArrM63467ks2) {
                jof jofVar4 = new jof(tbpVar.Clone(), tbpVar2.Clone());
                if (dM63457fa > jofVar4.m63457fa()) {
                    dM63457fa = jofVar4.m63457fa();
                    jofVar4.CloneTo(jofVar3);
                }
            }
        }
        for (tbp tbpVar3 : tbpVarArrM63467ks2) {
            double dM68635k4 = m68635k4(jofVar2.Clone(), tbpVar3.Clone(), tbpVarArrM63467ks);
            if (dM68635k4 < dM63457fa) {
                dM63457fa = dM68635k4;
            }
        }
        return dM63457fa;
    }

    /* JADX INFO: renamed from: kk */
    private static boolean m68641kk(jof jofVar, jof jofVar2, double d) {
        if (C14116yg.m67502x1(C14116yg.m67502x1(jofVar.m63453c5(), jofVar.m63459jd()), C14116yg.m67502x1(jofVar2.m63453c5(), jofVar2.m63459jd())) / 2.0d < d) {
            return m68645x1(jofVar.Clone(), jofVar2.Clone(), d);
        }
        if (d < 0.0d) {
            jof jofVarClone = jof.m63451k4(jofVar.m63462k4(d), jofVar2).Clone();
            return (jofVarClone.m63453c5() == 0.0d || jofVarClone.m63459jd() == 0.0d) ? false : true;
        }
        jof jofVarClone2 = jof.m63451k4(jofVar, jofVar2).Clone();
        if (jofVarClone2.m63453c5() == 0.0d || jofVarClone2.m63459jd() == 0.0d) {
            return d > 0.0d && m68634k4(jofVar.Clone(), jofVar2.Clone()) <= d;
        }
        return true;
    }

    @Override // com.aspose.slides.AbstractC0753ak
    /* JADX INFO: renamed from: x1 */
    public boolean mo3654x1() {
        return true;
    }

    /* JADX INFO: renamed from: k4 */
    private static double m68635k4(jof jofVar, tbp tbpVar, tbp[] tbpVarArr) {
        List<ezv> listM63461k4 = jofVar.m63461k4(tbpVar.f49090k4, tbpVar.f49091x1);
        tbp[] tbpVarArr2 = (tbp[]) AbstractC14092to.m67212k4(AbstractC14092to.m67205k4(C7019kk.m27443k4((Class<?>) tbp.class), listM63461k4.size()));
        int i = 0;
        for (int i2 = 0; i2 < listM63461k4.size(); i2++) {
            tbpVarArr2[i2] = new tbp(tbpVar.f49090k4 + ((double) listM63461k4.get_Item(i2).m5791k4()), tbpVar.f49091x1 + ((double) listM63461k4.get_Item(i2).m5794x1()));
        }
        tbp tbpVarClone = tbpVarArr[0].Clone();
        double d = Double.MAX_VALUE;
        int i3 = 1;
        while (i3 <= tbpVarArr.length) {
            tbp tbpVarClone2 = (i3 < tbpVarArr.length ? tbpVarArr[i3] : tbpVarArr[i]).Clone();
            int length = tbpVarArr2.length;
            int i4 = i;
            while (i4 < length) {
                tbp tbpVar2 = tbpVarArr2[i4];
                tbp tbpVar3 = new tbp();
                tbp[] tbpVarArr3 = {tbpVar3};
                int i5 = i;
                int i6 = yz6.m74160k4(tbpVarClone2.Clone(), tbpVarClone.Clone(), tbpVar.Clone(), tbpVar2.Clone(), tbpVarArr3) == 1 ? 1 : i5;
                tbpVarArr3[i5].CloneTo(tbpVar3);
                if (i6 != 0) {
                    double dM74157k4 = yz6.m74157k4(tbpVar.Clone(), tbpVar3.Clone());
                    if (dM74157k4 < d) {
                        d = dM74157k4;
                    }
                }
                i4++;
                i = i5;
            }
            tbpVarClone2.CloneTo(tbpVarClone);
            i3++;
        }
        return d;
    }

    /* JADX INFO: renamed from: x1 */
    private static boolean m68645x1(jof jofVar, jof jofVar2, double d) {
        jofVar.m63474x1(0.5d).CloneTo(jofVar);
        jofVar2.m63474x1(0.5d).CloneTo(jofVar2);
        double d2 = Double.MAX_VALUE;
        int i = 0;
        while (i < 360) {
            double d3 = ((double) i) * 0.017453292519943295d;
            tbp tbpVar = new tbp((C14116yg.m67470dy(d3) * jofVar2.m63453c5()) + jofVar2.m63454ck().f49090k4, (C14116yg.m67495m9(d3) * jofVar2.m63459jd()) + jofVar2.m63454ck().f49091x1);
            if (yz6.m74173kk(jofVar.Clone(), tbpVar.Clone())) {
                return true;
            }
            tbp tbpVar2 = new tbp();
            tbp[] tbpVarArr = {tbpVar2};
            int i2 = i;
            double dM74158k4 = yz6.m74158k4(new tbp(jofVar.m63453c5(), jofVar.m63459jd()), new tbp(tbpVar.f49090k4 - jofVar.m63454ck().f49090k4, tbpVar.f49091x1 - jofVar.m63454ck().f49091x1), tbpVarArr);
            tbpVarArr[0].CloneTo(tbpVar2);
            if (dM74158k4 < d2) {
                d2 = dM74158k4;
            }
            i = i2 + 1;
        }
        return d2 < d;
    }

    /* JADX INFO: renamed from: k4 */
    private static double m68636k4(tbp tbpVar, double d, tbp tbpVar2, double d2) {
        return yz6.m74157k4(tbpVar.Clone(), tbpVar2.Clone()) - (d + d2);
    }

    @Override // com.aspose.slides.AbstractC0753ak
    /* JADX INFO: renamed from: k4 */
    public void mo3644k4(bay bayVar, double d) {
        bayVar.m4086k4(d, 29, 30);
    }

    /* JADX INFO: renamed from: k4 */
    private void m68637k4(bay bayVar, double d, double d2, double d3, tbp tbpVar, double d4) {
        z2c z2cVarM4074dy = bayVar.m4074dy();
        int iM28363ix = bayVar.m5147up().m71873kk().m28363ix();
        int iM28384u4 = bayVar.m5147up().m71873kk().m28384u4();
        if (iM28363ix == 0 && iM28384u4 == 0) {
            return;
        }
        tbp tbpVarClone = m68631dy(bayVar).Clone();
        jof jofVar = new jof(m68642to(iM28384u4 != 0 ? (((((double) iM28384u4) / 100000.0d) / d4) * d2) + d : d).Clone(), d3 * (iM28363ix != 0 ? ((double) iM28363ix) / 100000.0d : 1.0d), tbpVarClone.f49090k4, tbpVarClone.f49091x1);
        bayVar.m4074dy().m74248k4(2, (jofVar.m63460k4() + tbpVar.f49090k4) - z2cVarM4074dy.m74238h4().f49090k4);
        bayVar.m4074dy().m74248k4(3, (jofVar.m63473x1() + tbpVar.f49091x1) - z2cVarM4074dy.m74238h4().f49091x1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r31v1 */
    @Override // com.aspose.slides.AbstractC0753ak
    /* JADX INFO: renamed from: k4 */
    public boolean mo3646k4(bay bayVar) {
        boolean z;
        C0824bn c0824bn;
        jof[] jofVarArr;
        C14240ok c14240ok = this;
        bay bayVar2 = bayVar;
        C0824bn c0824bnM68630c5 = c14240ok.m68630c5();
        List<bay> listM4068bv = bayVar2.m4068bv();
        int size = listM4068bv.size();
        boolean z2 = true;
        if (size == 0) {
            return true;
        }
        double dM4270du = c0824bnM68630c5.m4270du() == 0.0d ? 360.0d : c0824bnM68630c5.m4270du();
        double dM4273to = c0824bnM68630c5.m4273to();
        double dM4273to2 = c0824bnM68630c5.m4273to();
        if (dM4273to < 0.0d) {
            dM4273to2 += 360.0d;
        }
        double dM4072du = bayVar2.m4072du(61);
        double dM4072du2 = bayVar2.m4072du(15);
        k4 k4Var = new k4(dM4072du, dM4072du2, dM4273to2, dM4270du, c0824bnM68630c5.m4271h4());
        double dM68652k4 = k4Var.m68652k4();
        double dM4072du3 = bayVar2.m4072du(29);
        double[] dArr = {c14240ok.f47838k4};
        double[] dArrM68653k4 = k4Var.m68653k4(size, c0824bnM68630c5.m4271h4(), dArr);
        c14240ok.f47838k4 = dArr[0];
        double[] dArr2 = new double[size];
        jof[] jofVarArr2 = (jof[]) C22200OooO0o0.OooO00o(jof.class, size);
        boolean z3 = true;
        int i = 0;
        while (i < size) {
            boolean z4 = z2;
            bay bayVar3 = listM4068bv.get_Item(i);
            boolean z5 = z3 & ((bayVar3.m4074dy().m74280x1() == null || bayVar3.m4074dy().m74280x1().getShapeType() != 35) ? false : z4);
            dArr2[i] = bayVar3.m4112x1(29) ? bayVar3.m4072du(29) : dM4072du3;
            tbp tbpVarClone = m68631dy(bayVar3).Clone();
            int i2 = i;
            jofVarArr2[i2] = new jof(m68642to(dArrM68653k4[i]).Clone(), dM68652k4, tbpVarClone.f49090k4, tbpVarClone.f49091x1);
            i = i2 + 1;
            z3 = z5;
            z2 = z4;
        }
        ?? r31 = z2;
        if (c0824bnM68630c5.m4271h4()) {
            bay bayVar4 = listM4068bv.get_Item(0);
            dArr2[0] = bayVar4.m4112x1(30) ? bayVar4.m4072du(30) : bayVar2.m4072du(30);
        }
        if (size > r31) {
            boolean zM68639k4 = c14240ok.m68639k4(jofVarArr2, dArr2, z3);
            double d = 0.98d;
            double d2 = zM68639k4 ? dM68652k4 * 1.02d : dM68652k4 * 0.98d;
            while (d2 > 1.0E-5d) {
                double d3 = d;
                if (!AbstractC0753ak.m3633k4(m68633k4(new jof(AbstractC14092to.m67204k4((Object[]) jofVarArr2)), dM4072du, dM4072du2))) {
                    break;
                }
                int i3 = 0;
                while (i3 < size) {
                    tbp tbpVarClone2 = m68631dy(listM4068bv.get_Item(i3)).Clone();
                    int i4 = i3;
                    jofVarArr2[i4] = new jof(m68642to(dArrM68653k4[i3]).Clone(), d2, tbpVarClone2.f49090k4, tbpVarClone2.f49091x1);
                    i3 = i4 + 1;
                    c0824bnM68630c5 = c0824bnM68630c5;
                }
                c0824bn = c0824bnM68630c5;
                z = true;
                boolean zM68639k42 = c14240ok.m68639k4(jofVarArr2, dArr2, z3);
                if (zM68639k42 != zM68639k4) {
                    break;
                }
                d2 = zM68639k42 ? d2 * 1.02d : d2 * d3;
                d = d3;
                c0824bnM68630c5 = c0824bn;
            }
            c0824bn = c0824bnM68630c5;
            z = true;
            dM68652k4 = d2;
        } else {
            z = r31 == true ? 1 : 0;
            c0824bn = c0824bnM68630c5;
        }
        jof jofVar = new jof(AbstractC14092to.m67204k4((Object[]) jofVarArr2));
        z2c z2cVarM4074dy = bayVar2.m4074dy();
        z2cVarM4074dy.m74232du(jofVar.m63453c5());
        z2cVarM4074dy.m74234dy(jofVar.m63459jd());
        tbp tbpVar = new tbp(-jofVar.m63460k4(), -jofVar.m63473x1());
        double dM67491kk = C14116yg.m67491kk(1.0d, m68633k4(jofVar.Clone(), dM4072du, dM4072du2));
        int i5 = 0;
        while (i5 < size) {
            bay bayVar5 = listM4068bv.get_Item(i5);
            z2c z2cVarM4074dy2 = bayVar5.m4074dy();
            double dM63460k4 = (jofVarArr2[i5].m63460k4() - z2cVarM4074dy2.m74238h4().f49090k4) + tbpVar.f49090k4;
            double d4 = dM67491kk;
            double dM63473x1 = (jofVarArr2[i5].m63473x1() - z2cVarM4074dy2.m74238h4().f49091x1) + tbpVar.f49091x1;
            if (c0824bn.m4272kk()) {
                jofVarArr = jofVarArr2;
                z2cVarM4074dy2.m74229ck(m68644x1(dArrM68653k4[i5] + 90.0d, false));
            } else {
                jofVarArr = jofVarArr2;
            }
            z2cVarM4074dy2.m74246k4(dM63460k4, dM63473x1);
            bayVar5.m4103to(61, z2cVarM4074dy2.m74241jd() * d4);
            bayVar5.m4103to(15, z2cVarM4074dy2.m74290yj() * d4);
            c14240ok = this;
            double d5 = dM68652k4;
            c14240ok.m68637k4(bayVar5, dArrM68653k4[i5], c14240ok.f47838k4, d5, tbpVar.Clone(), ((double) bayVar2.m4110x1().size()) / ((double) size));
            i5++;
            bayVar2 = bayVar;
            dM68652k4 = d5;
            dM67491kk = d4;
            jofVarArr2 = jofVarArr;
        }
        double d6 = dM67491kk;
        jof[] jofVarArr3 = jofVarArr2;
        double d7 = dM68652k4;
        for (int i6 = 0; i6 < size; i6++) {
            bay bayVar6 = listM4068bv.get_Item(i6);
            jof jofVarClone = jofVarArr3[i6].Clone();
            jof jofVarClone2 = bayVar6.m4074dy().m74235e0().Clone();
            double dM63453c5 = jofVarClone.m63453c5() - jofVarClone2.m63453c5();
            double dM63459jd = jofVarClone.m63459jd() - jofVarClone2.m63459jd();
            if (dM63453c5 != 0.0d || dM63459jd != 0.0d) {
                bayVar6.m4074dy().m74246k4(dM63453c5 / 2.0d, dM63459jd / 2.0d);
            }
        }
        z2cVarM4074dy.m74237g8();
        if (AbstractC0753ak.m3633k4(d6)) {
            bayVar.m4086k4(d6, 29, 30);
            bayVar.m4105um();
            return false;
        }
        AbstractC0753ak.m3638x1(bayVar, c0824bn.m5210k4(), c0824bn.m5212x1());
        bayVar.m4103to(12, 2.0d * d7);
        tbp tbpVarClone3 = listM4068bv.get_Item(0).m4074dy().m74235e0().m63454ck().Clone();
        tbp tbpVarClone4 = m68642to(dArrM68653k4[0]).Clone();
        tbp tbpVar2 = new tbp(tbpVarClone3.f49090k4 - (tbpVarClone4.f49090k4 * d7), tbpVarClone3.f49091x1 - (tbpVarClone4.f49091x1 * d7));
        bayVar.m4074dy().m74248k4(6, tbpVar2.f49090k4);
        bayVar.m4074dy().m74248k4(7, tbpVar2.f49091x1);
        return z;
    }

    /* JADX INFO: renamed from: k4 */
    private static boolean m68638k4(jof jofVar, jof jofVar2, double d) {
        return (!(jofVar.m63453c5() == jofVar.m63459jd() && jofVar2.m63459jd() == jofVar2.m63453c5()) && d >= 0.0d) ? m68645x1(jofVar.Clone(), jofVar2.Clone(), d) : m68636k4(jofVar.m63454ck().Clone(), C14116yg.m67502x1(jofVar.m63453c5(), jofVar.m63459jd()) / 2.0d, jofVar2.m63454ck().Clone(), C14116yg.m67502x1(jofVar2.m63453c5(), jofVar2.m63459jd()) / 2.0d) - d < 0.0d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [int] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [int] */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX INFO: renamed from: k4 */
    private boolean m68639k4(jof[] jofVarArr, double[] dArr, boolean z) {
        boolean zM4271h4 = m68630c5().m4271h4();
        if (zM4271h4) {
            double d = dArr[0];
            jof jofVarClone = jofVarArr[0].Clone();
            for (int i = 1; i < jofVarArr.length; i++) {
                jof jofVarClone2 = jofVarArr[i].Clone();
                jof jofVarClone3 = jofVarClone.Clone();
                jof jofVarClone4 = jofVarClone2.Clone();
                if (z ? m68638k4(jofVarClone3, jofVarClone4, d) : m68641kk(jofVarClone3, jofVarClone4, d)) {
                    return true;
                }
            }
        }
        for (?? r3 = zM4271h4; r3 < jofVarArr.length; r3++) {
            jof jofVarClone5 = jofVarArr[r3].Clone();
            for (?? r5 = zM4271h4; r5 < jofVarArr.length; r5++) {
                jof jofVarClone6 = jofVarArr[r5].Clone();
                if (r5 != r3) {
                    jof jofVarClone7 = jofVarClone5.Clone();
                    jof jofVarClone8 = jofVarClone6.Clone();
                    if (z ? m68638k4(jofVarClone7, jofVarClone8, dArr[r3]) : m68641kk(jofVarClone7, jofVarClone8, dArr[r3])) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
