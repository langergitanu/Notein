package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerable;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.C14116yg;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
abstract class eca extends AbstractC14770x9 {

    /* JADX INFO: renamed from: k4 */
    protected byte f4733k4 = 2;

    /* JADX INFO: renamed from: kk */
    private double f4734kk;

    /* JADX INFO: renamed from: to */
    private String f4735to;

    /* JADX INFO: renamed from: x1 */
    protected double f4736x1;

    /* JADX INFO: renamed from: k4 */
    public static double m5402k4(IGenericEnumerable<C0886d8> iGenericEnumerable) {
        IGenericEnumerator<C0886d8> it = iGenericEnumerable.iterator();
        double dM67475k4 = 0.0d;
        while (it.hasNext()) {
            try {
                dM67475k4 += C14116yg.m67475k4(it.next().m4989k4());
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        return dM67475k4;
    }

    /* JADX INFO: renamed from: kk */
    private double m5405kk(double d) {
        return d - C14116yg.m67478k4(d, this.f4733k4 & 255, (short) 1);
    }

    /* JADX INFO: renamed from: x1 */
    private static int m5406x1(IGenericEnumerable<C0886d8> iGenericEnumerable) {
        IGenericEnumerator<C0886d8> it = iGenericEnumerable.iterator();
        int i = 0;
        while (it.hasNext()) {
            try {
                C0886d8 next = it.next();
                if (next.m4989k4() == 0.0d && !next.m4983dy()) {
                    i++;
                }
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        return i;
    }

    /* JADX INFO: renamed from: dy */
    public final boolean m5408dy() {
        return mo5413kk().length == 0;
    }

    /* JADX INFO: renamed from: kk */
    public abstract cdv[] mo5413kk();

    /* JADX INFO: renamed from: m9 */
    public final double m5414m9() {
        return this.f4734kk;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m5409k4(double d) {
        this.f4734kk = d;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m5415x1(double d) {
        mo5410k4(d, mo5413kk());
    }

    /* JADX INFO: renamed from: x1 */
    private void m5407x1(String str) {
        if (str != null && C14113y2.m67359c5(str, "%") && C14113y2.m67359c5(str, ".")) {
            this.f4733k4 = (byte) ((C14113y2.m67364dy(str, "%") - C14113y2.m67364dy(str, ".")) + 1);
        }
    }

    /* JADX INFO: renamed from: k4 */
    public void mo5410k4(double d, cdv[] cdvVarArr) {
        short s;
        this.f4736x1 = d;
        double dM67478k4 = 0.0d;
        this.f4734kk = 0.0d;
        int i = 0;
        while (true) {
            s = 1;
            if (i >= cdvVarArr.length) {
                break;
            }
            cdv cdvVar = cdvVarArr[i];
            double dM67475k4 = C14116yg.m67475k4(cdvVar.m4553jd());
            this.f4734kk += dM67475k4;
            cdvVar.m4554k4(dM67475k4 / d);
            dM67478k4 += C14116yg.m67478k4(cdvVar.m4552c5(), this.f4733k4 & 255, (short) 1);
            i++;
        }
        double d2 = 1.0d;
        if (dM67478k4 > 1.0d) {
            cdv[] cdvVarArrM5404k4 = m5404k4(com.aspose.slides.Collections.Generic.OooO00o.OooO00o(dM67478k4 - 1.0d, 100.0d, 14), cdvVarArr, false);
            int length = cdvVarArrM5404k4.length;
            int i2 = 0;
            while (i2 < length) {
                double d3 = d2;
                cdv cdvVar2 = cdvVarArrM5404k4[i2];
                cdvVar2.m4554k4(C14116yg.m67478k4(cdvVar2.m4552c5(), this.f4733k4 & 255, s));
                cdvVar2.m4554k4(C14116yg.m67477k4(cdvVar2.m4552c5() - C14116yg.m67469du(0.1d, this.f4733k4 & 255), this.f4733k4 & 255));
                i2++;
                d2 = d3;
                cdvVarArrM5404k4 = cdvVarArrM5404k4;
                s = 1;
            }
        }
        double d4 = d2;
        if (dM67478k4 >= d4 || (this.f4733k4 & 255) >= 3) {
            return;
        }
        for (cdv cdvVar3 : m5404k4(com.aspose.slides.Collections.Generic.OooO00o.OooO00o(d4 - dM67478k4, 100.0d, 14), cdvVarArr, true)) {
            cdvVar3.m4554k4(C14116yg.m67478k4(cdvVar3.m4552c5(), this.f4733k4 & 255, (short) 1));
            cdvVar3.m4554k4(C14116yg.m67477k4(C14116yg.m67469du(0.1d, this.f4733k4 & 255) + cdvVar3.m4552c5(), this.f4733k4 & 255));
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m5411k4(IGenericEnumerable<C0886d8> iGenericEnumerable, double[] dArr, double[] dArr2) {
        int iM5406x1 = m5406x1(iGenericEnumerable);
        dArr[0] = iM5406x1 > 0 ? 0.001d : 0.0d;
        dArr2[0] = iM5406x1 > 0 ? 360.0d - (((double) iM5406x1) * 0.001d) : 360.0d;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m5412k4(String str) {
        this.f4735to = str;
        m5407x1(str);
    }

    /* JADX INFO: renamed from: k4 */
    public static boolean m5403k4(eh0 eh0Var, C0886d8 c0886d8) {
        if (eh0Var == null) {
            throw new ArgumentNullException("sector");
        }
        if (c0886d8 == null) {
            throw new ArgumentNullException("dataPoint");
        }
        if (c0886d8.m4983dy() && eh0Var.m4552c5() == 0.0d) {
            return (!c0886d8.m4979c5() || c0886d8.m5012up().m64941c5().m69834fa().mo268du().m5189yj()) && c0886d8.m5012up().m64941c5().m69834fa().getDisplayBlanksAs() != 0;
        }
        return true;
    }

    /* JADX INFO: renamed from: k4 */
    private cdv[] m5404k4(int i, cdv[] cdvVarArr, boolean z) {
        cdv[] cdvVarArr2 = new cdv[i];
        for (cdv cdvVar : cdvVarArr) {
            if (cdvVar.m4552c5() >= 0.01d || z) {
                int i2 = 0;
                while (true) {
                    if (i2 >= i) {
                        break;
                    }
                    if (cdvVarArr2[i2] == null) {
                        cdvVarArr2[i2] = cdvVar;
                        break;
                    }
                    double dM5405kk = m5405kk(cdvVar.m4552c5());
                    double dM5405kk2 = m5405kk(cdvVarArr2[i2].m4552c5());
                    if ((z && dM5405kk > dM5405kk2) || (!z && dM5405kk < dM5405kk2)) {
                        break;
                    }
                    i2++;
                }
                cdv cdvVar2 = cdvVar;
                while (true) {
                    if (i2 >= i) {
                        break;
                    }
                    cdv cdvVar3 = cdvVarArr2[i2];
                    if (cdvVar3 == null) {
                        cdvVarArr2[i2] = cdvVar;
                        break;
                    }
                    cdvVarArr2[i2] = cdvVar2;
                    i2++;
                    cdvVar2 = cdvVar3;
                }
            }
        }
        return cdvVarArr2;
    }
}
