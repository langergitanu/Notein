package com.aspose.slides;

import androidx.appcompat.widget.C21532OooOOo;
import com.aspose.slides.internal.p151gj.C4317dy;
import com.aspose.slides.internal.p475wh.C12007ix;
import com.aspose.slides.internal.p475wh.C12025x6;
import com.aspose.slides.p559ms.System.C14116yg;

/* JADX INFO: loaded from: classes3.dex */
class yz6 {
    /* JADX INFO: renamed from: du */
    private static double m74152du(double d) {
        if (d < 0.0d) {
            d += 360.0d;
        }
        return d > 270.0d ? 360.0d - d : d >= 180.0d ? (d - 180.0d) + 1.0E-4d : d > 90.0d ? 180.0d - d : d;
    }

    /* JADX INFO: renamed from: h4 */
    private static double m74153h4(double d) {
        return d * d;
    }

    /* JADX INFO: renamed from: k4 */
    public static double m74154k4(double d) {
        return (d * 360.0d) / 127.0d;
    }

    /* JADX INFO: renamed from: kk */
    public static double m74170kk(double d) {
        double d2 = d % 360.0d;
        return d2 < 0.0d ? d2 + 360.0d : d2;
    }

    /* JADX INFO: renamed from: to */
    private static double m74174to(double d, double d2) {
        return C14116yg.m67496rv((d2 * d2) + (d * d));
    }

    /* JADX INFO: renamed from: x1 */
    public static double m74176x1(double d) {
        return (d / 360.0d) * 127.0d;
    }

    /* JADX INFO: renamed from: k4 */
    private static double m74155k4(double d, double d2, double d3, double d4) {
        double d5 = d * d2;
        double d6 = d3 - 1.0d;
        double dM74174to = d4 < 0.0d ? 0.0d : m74174to(d5, d3) - 1.0d;
        double d7 = 0.0d;
        for (int i = 0; i < 10; i++) {
            d7 = (d6 + dM74174to) / 2.0d;
            if (d7 == d6 || d7 == dM74174to) {
                break;
            }
            double dM74153h4 = (m74153h4(d5 / (d7 + d)) + m74153h4(d3 / (d7 + 1.0d))) - 1.0d;
            if (dM74153h4 <= 0.0d) {
                if (dM74153h4 >= 0.0d) {
                    break;
                }
                dM74174to = d7;
            } else {
                d6 = d7;
            }
        }
        return d7;
    }

    /* JADX INFO: renamed from: kk */
    private static boolean m74171kk(double d, double d2) {
        return d <= d2 + 0.001d && d >= d2 - 0.001d;
    }

    /* JADX INFO: renamed from: to */
    public static boolean m74175to(double d) {
        return d < 0.9999d;
    }

    /* JADX INFO: renamed from: x1 */
    public static int m74177x1(tbp tbpVar, tbp tbpVar2, tbp tbpVar3, tbp tbpVar4, tbp[] tbpVarArr) {
        double d = tbpVar.f49090k4;
        double d2 = d - tbpVar2.f49090k4;
        double d3 = tbpVar4.f49091x1;
        double d4 = tbpVar3.f49091x1;
        double d5 = (d3 - d4) * d2;
        double d6 = tbpVar.f49091x1;
        double d7 = d6 - tbpVar2.f49091x1;
        double d8 = tbpVar4.f49090k4;
        double d9 = tbpVar3.f49090k4;
        double d10 = d5 - ((d8 - d9) * d7);
        double d11 = ((d3 - d4) * (d - d9)) - ((d8 - d9) * (d6 - d4));
        if (C14116yg.m67475k4(d10) < 1.0E-7d) {
            tbp.f49088kk.CloneTo(tbpVarArr[0]);
            return 0;
        }
        double d12 = d11 / d10;
        double d13 = tbpVar.f49090k4;
        double dOooO0O0 = C21532OooOOo.OooO0O0(tbpVar2.f49090k4, d13, d12, d13);
        double d14 = tbpVar.f49091x1;
        tbpVarArr[0] = new tbp(dOooO0O0, C21532OooOOo.OooO0O0(tbpVar2.f49091x1, d14, d12, d14));
        return 1;
    }

    /* JADX INFO: renamed from: k4 */
    private static double m74156k4(double d, double d2, double d3, double d4, double[] dArr, double[] dArr2) {
        if (d4 <= 0.0d) {
            double d5 = d * d3;
            double dM74153h4 = m74153h4(d) - m74153h4(d2);
            if (d5 >= dM74153h4) {
                dArr[0] = d;
                dArr2[0] = 0.0d;
                return C14116yg.m67475k4(d3 - d);
            }
            double d6 = d5 / dM74153h4;
            dArr[0] = d * d6;
            dArr2[0] = C14116yg.m67496rv(1.0d - (d6 * d6)) * d2;
            return C14116yg.m67496rv(m74153h4(dArr[0] - d3) + m74153h4(dArr2[0]));
        }
        if (d3 <= 0.0d) {
            dArr[0] = 0.0d;
            dArr2[0] = d2;
            return C14116yg.m67475k4(d4 - d2);
        }
        double d7 = d3 / d;
        double d8 = d4 / d2;
        double dM74153h42 = (m74153h4(d7) + m74153h4(d8)) - 1.0d;
        if (dM74153h42 == 0.0d) {
            dArr[0] = d3;
            dArr2[0] = d4;
            return 0.0d;
        }
        double dM74153h43 = m74153h4(d / d2);
        double dM74155k4 = m74155k4(dM74153h43, d7, d8, dM74153h42);
        dArr[0] = (dM74153h43 * d3) / (dM74153h43 + dM74155k4);
        dArr2[0] = d4 / (dM74155k4 + 1.0d);
        return C14116yg.m67496rv(m74153h4(dArr[0] - d3) + m74153h4(dArr2[0] - d4));
    }

    /* JADX INFO: renamed from: kk */
    public static boolean m74172kk(int i) {
        return i >= 35 && i <= 60;
    }

    /* JADX INFO: renamed from: x1 */
    private static tbp m74178x1(double d, double d2, double d3) {
        double d4;
        double d5;
        tbp tbpVar;
        tbp tbpVar2 = new tbp();
        double d6 = (d3 < 0.0d ? d3 + 360.0d : d3) % 360.0d;
        if (m74171kk(d6, 0.0d) || m74171kk(d6, 180.0d)) {
            return new tbp(d, d2);
        }
        if (m74171kk(d6, 90.0d) || m74171kk(d6, 270.0d)) {
            return new tbp(d2, d);
        }
        double dM74152du = m74152du(d6) * 0.017453292519943295d;
        double dM67470dy = C14116yg.m67470dy(dM74152du);
        double dM67495m9 = C14116yg.m67495m9(dM74152du);
        double dM67502x1 = C14116yg.m67502x1(d, d2);
        double dM67491kk = C14116yg.m67491kk(d, d2);
        int i = 0;
        while (true) {
            double d7 = i;
            if (d7 > 100.0d) {
                return tbpVar2;
            }
            double d8 = ((100.0d - d7) / 100.0d) * dM67502x1;
            double d9 = (dM67502x1 - d8) / dM67470dy;
            double d10 = d8 / dM67495m9;
            double d11 = d10 * dM67470dy;
            double d12 = ((d9 * dM67495m9) + d11) - dM67491kk;
            double d13 = d12 * dM67470dy;
            double d14 = (dM67491kk - d11) + (d13 * dM67470dy);
            if (d12 < 0.0d || d14 > dM67491kk || d14 < 0.0d) {
                d4 = dM67495m9;
                d5 = dM67470dy;
            } else {
                double d15 = d12 * dM67495m9;
                new tbp();
                if (d < d2) {
                    d4 = dM67495m9;
                    d5 = dM67470dy;
                    tbpVar = new tbp(d10 - d13, d9 - d15);
                } else {
                    d4 = dM67495m9;
                    d5 = dM67470dy;
                    tbpVar = new tbp(d9 - d15, d10 - d13);
                }
                if (tbpVar.f49091x1 * tbpVar.f49090k4 > tbpVar2.f49090k4 * tbpVar2.f49091x1) {
                    tbpVar.CloneTo(tbpVar2);
                }
            }
            i++;
            dM67495m9 = d4;
            dM67470dy = d5;
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static double m74157k4(tbp tbpVar, tbp tbpVar2) {
        double d = tbpVar2.f49090k4 - tbpVar.f49090k4;
        double d2 = tbpVar2.f49091x1 - tbpVar.f49091x1;
        return C14116yg.m67496rv((d2 * d2) + (d * d));
    }

    /* JADX INFO: renamed from: kk */
    public static boolean m74173kk(jof jofVar, tbp tbpVar) {
        double d = tbpVar.f49090k4 - jofVar.m63454ck().f49090k4;
        double d2 = tbpVar.f49091x1 - jofVar.m63454ck().f49091x1;
        return ((d2 * d2) / (jofVar.m63459jd() * jofVar.m63459jd())) + ((d * d) / (jofVar.m63453c5() * jofVar.m63453c5())) <= 1.0d;
    }

    /* JADX INFO: renamed from: x1 */
    public static tbp m74179x1(jof jofVar, tbp tbpVar) {
        double dM67502x1 = C14116yg.m67502x1(jofVar.m63453c5(), jofVar.m63459jd()) / 2.0d;
        tbp tbpVarClone = jofVar.m63454ck().Clone();
        tbp tbpVarClone2 = tbp.m71060x1(tbpVar, tbpVarClone).Clone();
        tbp tbpVarClone3 = (m74165k4(tbpVarClone2.m71067x1(), 1.0E-6d) ? tbp.f49088kk : tbp.m71058x1(tbpVarClone2.m71066to(), dM67502x1)).Clone();
        return new tbp(tbpVarClone.f49090k4 + tbpVarClone3.f49090k4, tbpVarClone.f49091x1 + tbpVarClone3.f49091x1);
    }

    /* JADX INFO: renamed from: k4 */
    public static double m74158k4(tbp tbpVar, tbp tbpVar2, tbp[] tbpVarArr) {
        double d;
        double d2;
        double d3 = tbpVar.f49090k4;
        double d4 = tbpVar.f49091x1;
        double d5 = tbpVar2.f49090k4;
        double d6 = tbpVar2.f49091x1;
        if (d4 > d3) {
            d6 = d5;
            d5 = d6;
            d2 = d3;
            d = d4;
        } else {
            d = d3;
            d2 = d4;
        }
        double[] dArr = {0.0d};
        double[] dArr2 = {0.0d};
        double dM74156k4 = m74156k4(d, d2, C14116yg.m67475k4(d5), C14116yg.m67475k4(d6), dArr, dArr2);
        double d7 = dArr[0];
        double d8 = dArr2[0];
        if (d5 < 0.0d) {
            d7 = -d7;
        }
        if (d6 < 0.0d) {
            d8 = -d8;
        }
        (tbpVar.f49090k4 < tbpVar.f49091x1 ? new tbp(d8, d7) : new tbp(d7, d8)).CloneTo(tbpVarArr[0]);
        return dM74156k4;
    }

    /* JADX INFO: renamed from: x1 */
    public static boolean m74180x1(double d, double d2) {
        if (d == 0.0d && d2 == 0.0d) {
            return false;
        }
        double dM67475k4 = C14116yg.m67475k4(d);
        double dM67475k42 = C14116yg.m67475k4(d2);
        return m74175to(C14116yg.m67491kk(dM67475k4, dM67475k42) / C14116yg.m67502x1(dM67475k4, dM67475k42));
    }

    /* JADX INFO: renamed from: k4 */
    private static int m74159k4(jof jofVar, double d, double d2) {
        int i = d < jofVar.m63460k4() ? 1 : d > jofVar.m63464kk() ? 16 : 0;
        return d2 < jofVar.m63473x1() ? i | 4096 : d2 > jofVar.m63470to() ? i | 256 : i;
    }

    /* JADX INFO: renamed from: x1 */
    public static boolean m74181x1(int i) {
        return i == 22 || i == 27;
    }

    /* JADX INFO: renamed from: k4 */
    public static int m74160k4(tbp tbpVar, tbp tbpVar2, tbp tbpVar3, tbp tbpVar4, tbp[] tbpVarArr) {
        double d = tbpVar.f49090k4;
        double d2 = tbpVar2.f49090k4;
        double d3 = tbpVar4.f49091x1;
        double d4 = tbpVar3.f49091x1;
        double d5 = (d3 - d4) * (d - d2);
        double d6 = tbpVar.f49091x1;
        double d7 = tbpVar2.f49091x1;
        double d8 = tbpVar4.f49090k4;
        double d9 = tbpVar3.f49090k4;
        double d10 = d5 - ((d8 - d9) * (d6 - d7));
        double d11 = ((d3 - d4) * (d - d9)) - ((d8 - d9) * (d6 - d4));
        double d12 = ((d6 - d4) * (d - d2)) - ((d - d9) * (d6 - d7));
        if (C14116yg.m67475k4(d10) < 1.0E-7d) {
            tbp.f49088kk.CloneTo(tbpVarArr[0]);
            return 0;
        }
        double d13 = d11 / d10;
        double d14 = d12 / d10;
        if (-1.0E-7d > d13 || d13 > 1.0000001d || -1.0E-7d > d14) {
            tbp.f49088kk.CloneTo(tbpVarArr[0]);
            return -1;
        }
        double d15 = tbpVar.f49090k4;
        double dOooO0O0 = C21532OooOOo.OooO0O0(tbpVar2.f49090k4, d15, d13, d15);
        double d16 = tbpVar.f49091x1;
        tbpVarArr[0] = new tbp(dOooO0O0, C21532OooOOo.OooO0O0(tbpVar2.f49091x1, d16, d13, d16));
        return 1;
    }

    /* JADX INFO: renamed from: k4 */
    private static jof m74161k4(tbp tbpVar, double d) {
        C4317dy c4317dy = new C4317dy();
        c4317dy.m17338k4((float) d, new C12025x6((float) (tbpVar.f49090k4 / 2.0d), (float) (tbpVar.f49091x1 / 2.0d)));
        C12007ix c12007ixClone = c4317dy.m17332k4(new C12007ix(0.0f, 0.0f, (float) tbpVar.f49090k4, (float) tbpVar.f49091x1)).Clone();
        return new jof(c12007ixClone.m56557jd(), c12007ixClone.m56551ck(), c12007ixClone.m56556h4(), c12007ixClone.m56558k4());
    }

    /* JADX INFO: renamed from: k4 */
    public static tbp m74162k4(double d, double d2, double d3) {
        double d4;
        double d5;
        if (d2 == 0.0d || d3 == 0.0d) {
            return new tbp(d2, d3);
        }
        if (d < 1.0d) {
            d5 = d * d3;
            d4 = d3;
        } else if (d == 1.0d) {
            d5 = d2 < d3 ? d2 : d3;
            d4 = d5;
        } else {
            d4 = d2 / d;
            d5 = d2;
        }
        double dM67491kk = C14116yg.m67491kk(1.0d, d2 / d5);
        double dM67491kk2 = C14116yg.m67491kk(1.0d, d3 / d4);
        return new tbp(C14116yg.m67491kk(dM67491kk, dM67491kk2) * d5, C14116yg.m67491kk(dM67491kk, dM67491kk2) * d4);
    }

    /* JADX INFO: renamed from: k4 */
    public static tbp m74163k4(jof jofVar, tbp tbpVar) {
        double d;
        double d2;
        double dM63460k4 = jofVar.m63460k4();
        double dM63464kk = jofVar.m63464kk();
        double dM63473x1 = jofVar.m63473x1();
        double dM63470to = jofVar.m63470to();
        double dOooO00o = OooOO0.OooO00o(dM63464kk, dM63460k4, 2.0d, dM63460k4);
        double d3 = dM63470to;
        double dOooO00o2 = OooOO0.OooO00o(d3, dM63473x1, 2.0d, dM63473x1);
        double d4 = tbpVar.f49090k4;
        double d5 = tbpVar.f49091x1;
        int iM74159k4 = m74159k4(jofVar.Clone(), dOooO00o, dOooO00o2);
        double d6 = dOooO00o;
        double d7 = d4;
        double d8 = dOooO00o2;
        int iM74159k42 = m74159k4(jofVar.Clone(), d4, d5);
        int iM74159k43 = iM74159k4;
        while ((iM74159k43 | iM74159k42) != 0 && (iM74159k43 & iM74159k42) == 0) {
            int i = iM74159k43 != 0 ? iM74159k43 : iM74159k42;
            double d9 = dM63460k4;
            if ((i & 4096) == 4096) {
                d = (((dM63473x1 - d8) * (d7 - d6)) / (d5 - d8)) + d6;
                d2 = d3;
                d3 = dM63473x1;
            } else if ((i & 256) == 256) {
                d = (((d3 - d8) * (d7 - d6)) / (d5 - d8)) + d6;
                d2 = d3;
            } else if ((i & 16) == 16) {
                d2 = d3;
                d3 = (((dM63464kk - d6) * (d5 - d8)) / (d7 - d6)) + d8;
                d = dM63464kk;
            } else if ((i & 1) == 1) {
                d2 = d3;
                d3 = (((d9 - d6) * (d5 - d8)) / (d7 - d6)) + d8;
                d = d9;
            } else {
                d = 0.0d;
                d2 = d3;
                d3 = 0.0d;
            }
            if (i == iM74159k43) {
                iM74159k43 = m74159k4(jofVar.Clone(), d, d3);
                d6 = d;
                d8 = d3;
            } else {
                iM74159k42 = m74159k4(jofVar.Clone(), d, d3);
                d7 = d;
                d5 = d3;
            }
            dM63460k4 = d9;
            d3 = d2;
        }
        return new tbp(d7, d5);
    }

    /* JADX INFO: renamed from: k4 */
    public static tbp m74164k4(tbp tbpVar, double d, jof[] jofVarArr) {
        tbp tbpVarClone = m74178x1(tbpVar.f49090k4, tbpVar.f49091x1, d).Clone();
        m74161k4(tbpVarClone.Clone(), d).CloneTo(jofVarArr[0]);
        return tbpVarClone;
    }

    /* JADX INFO: renamed from: k4 */
    public static boolean m74165k4(double d, double d2) {
        return C14116yg.m67475k4(d) <= d2;
    }

    /* JADX INFO: renamed from: k4 */
    public static boolean m74166k4(int i) {
        return i == 61 || i == 15;
    }

    /* JADX INFO: renamed from: k4 */
    public static boolean m74167k4(tbp tbpVar, double d, tbp tbpVar2, tbp tbpVar3, tbp[] tbpVarArr) {
        tbp tbpVar4 = new tbp(tbpVar3.f49090k4 - tbpVar2.f49090k4, tbpVar3.f49091x1 - tbpVar2.f49091x1);
        tbp tbpVar5 = new tbp();
        tbp[] tbpVarArr2 = {tbpVar5};
        boolean z = m74177x1(tbpVar.Clone(), new tbp(tbpVar.f49090k4 + tbpVar4.m71064k4().f49090k4, tbpVar.f49091x1 + tbpVar4.m71064k4().f49091x1), tbpVar2.Clone(), tbpVar3.Clone(), tbpVarArr2) > 0;
        tbpVarArr2[0].CloneTo(tbpVar5);
        if (z) {
            double dM74157k4 = m74157k4(tbpVar5.Clone(), tbpVar.Clone());
            double dM67496rv = C14116yg.m67496rv((d * d) - (dM74157k4 * dM74157k4));
            tbp tbpVarClone = tbpVar4.m71066to().Clone();
            tbpVarArr[0] = new tbp(tbpVar5.f49090k4 - (tbpVarClone.f49090k4 * dM67496rv), tbpVar5.f49091x1 - (tbpVarClone.f49091x1 * dM67496rv));
            if (m74169k4(tbpVar2.Clone(), tbpVar3.Clone(), tbpVarArr[0].Clone())) {
                return true;
            }
        }
        tbp.f49088kk.CloneTo(tbpVarArr[0]);
        return false;
    }

    /* JADX INFO: renamed from: k4 */
    public static boolean m74168k4(tbp tbpVar, tbp tbpVar2, double d) {
        return C14116yg.m67475k4(tbpVar.f49090k4 - tbpVar2.f49090k4) <= d && C14116yg.m67475k4(tbpVar.f49091x1 - tbpVar2.f49091x1) <= d;
    }

    /* JADX INFO: renamed from: k4 */
    public static boolean m74169k4(tbp tbpVar, tbp tbpVar2, tbp tbpVar3) {
        if (m74168k4(tbpVar.Clone(), tbpVar3.Clone(), 9.999999747378752E-6d) || m74168k4(tbpVar2.Clone(), tbpVar3.Clone(), 9.999999747378752E-6d)) {
            return true;
        }
        tbp tbpVarClone = tbp.m71060x1(tbpVar2, tbpVar).Clone();
        tbp tbpVarClone2 = tbp.m71060x1(tbpVar3, tbpVar).Clone();
        tbp tbpVarClone3 = tbp.m71060x1(tbpVar3, tbpVar2).Clone();
        double d = tbpVarClone.f49090k4;
        double d2 = tbpVarClone2.f49091x1;
        double d3 = tbpVarClone2.f49090k4;
        double d4 = tbpVarClone.f49091x1;
        return m74165k4((d * d2) - (d3 * d4), 1.0E-7d) && (d2 * d4) + (d3 * d) > -1.0E-7d && (d4 * tbpVarClone3.f49091x1) + (d * tbpVarClone3.f49090k4) < 1.0E-7d;
    }
}
