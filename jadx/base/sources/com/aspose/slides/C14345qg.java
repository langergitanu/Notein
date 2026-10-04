package com.aspose.slides;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.NullReferenceException;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.C14116yg;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.qg */
/* JADX INFO: loaded from: classes3.dex */
class C14345qg extends AbstractC0753ak {
    /* JADX INFO: renamed from: c5 */
    private void m69563c5(bay bayVar) {
        List.Enumerator<bay> it = bayVar.m4110x1().iterator();
        while (it.hasNext()) {
            try {
                bay next = it.next();
                z2c z2cVarM69571k4 = m69571k4(next.m4074dy());
                if (z2cVarM69571k4 != null) {
                    double dM74256kk = z2cVarM69571k4.m74256kk(0);
                    double dM74256kk2 = z2cVarM69571k4.m74256kk(1);
                    z2c z2cVarM4074dy = next.m4074dy();
                    double dM74256kk3 = z2cVarM4074dy.m74256kk(0);
                    double dM74256kk4 = z2cVarM4074dy.m74256kk(1);
                    z2cVarM4074dy.m74248k4(8, dM74256kk3 - dM74256kk);
                    z2cVarM4074dy.m74248k4(9, dM74256kk4 - dM74256kk2);
                }
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
    }

    /* JADX INFO: renamed from: ck */
    private void m69564ck(bay bayVar) {
        List.Enumerator<bay> it = bayVar.m4110x1().iterator();
        while (it.hasNext()) {
            try {
                bay next = it.next();
                if (m69576yj(next)) {
                    z2c z2cVarM4074dy = next.m4074dy();
                    z2c z2cVarM69571k4 = m69571k4(z2cVarM4074dy);
                    if (z2cVarM69571k4 == null) {
                        throw new NullReferenceException("MasterShape couldn't be empty.");
                    }
                    tbp tbpVarClone = z2cVarM69571k4.m74243k4().m4066ar().Clone();
                    double dM74256kk = z2cVarM4074dy.m74256kk(8) * tbpVarClone.f49090k4;
                    double dM74256kk2 = z2cVarM4074dy.m74256kk(9) * tbpVarClone.f49091x1;
                    tbp tbpVarClone2 = z2cVarM69571k4.m74238h4().Clone();
                    z2cVarM4074dy.m74252k4(new tbp(tbpVarClone2.f49090k4 + dM74256kk, tbpVarClone2.f49091x1 + dM74256kk2));
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
    }

    /* JADX INFO: renamed from: dy */
    private C0741ac m69565dy() {
        return (C0741ac) m3643k4();
    }

    /* JADX INFO: renamed from: fa */
    private tbp m69566fa(bay bayVar) {
        double dM4072du = bayVar.m4072du(61);
        if (dM4072du == 0.0d) {
            dM4072du = bayVar.m4069c5().m4072du(61);
        }
        double d = dM4072du;
        double dM4072du2 = bayVar.m4072du(15);
        if (dM4072du2 == 0.0d) {
            dM4072du2 = bayVar.m4069c5().m4072du(15);
        }
        double d2 = dM4072du2;
        return m69565dy().m3474kk() != 0.0d ? yz6.m74162k4(m69565dy().m3474kk(), d, d2) : new tbp(d, d2);
    }

    /* JADX INFO: renamed from: jd */
    private void m69567jd(bay bayVar) {
        List.Enumerator<bay> it = bayVar.m4110x1().iterator();
        while (it.hasNext()) {
            try {
                bay next = it.next();
                if (!m69576yj(next)) {
                    z2c z2cVarM4074dy = next.m4074dy();
                    z2cVarM4074dy.m74270to(C14116yg.m67491kk(z2cVarM4074dy.m74225c5(), bayVar.m4074dy().m74233dy()));
                    z2cVarM4074dy.m74263m9(C14116yg.m67491kk(z2cVarM4074dy.m74274up(), bayVar.m4074dy().m74236fa()));
                    int iM5212x1 = next.m4077jd().m3643k4().m5212x1();
                    int iM5210k4 = next.m4077jd().m3643k4().m5210k4();
                    tbp tbpVarClone = m69574up(next).Clone();
                    double dM74269to = tbpVarClone.f49090k4;
                    double dM74231du = tbpVarClone.f49091x1;
                    if (next.m4077jd().mo3639du()) {
                        if (iM5210k4 == 0 && !next.m4112x1(18) && !next.m4112x1(24)) {
                            dM74269to = z2cVarM4074dy.m74269to();
                        }
                        if (iM5212x1 == 0 && !next.m4112x1(32) && !next.m4112x1(1)) {
                            dM74231du = z2cVarM4074dy.m74231du();
                        }
                    }
                    z2cVarM4074dy.m74252k4(new tbp(dM74269to, dM74231du));
                    tbp tbpVarClone2 = AbstractC0753ak.m3632k4(next, iM5210k4, iM5212x1).Clone();
                    z2cVarM4074dy.m74246k4(tbpVarClone2.f49090k4, tbpVarClone2.f49091x1);
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
    }

    /* JADX INFO: renamed from: k4 */
    private static double m69568k4(bay bayVar, double d, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, double[] dArr) {
        dArr[0] = 0.0d;
        if (bayVar.m4112x1(i)) {
            double dM67475k4 = C14116yg.m67475k4(bayVar.m4072du(i2) + bayVar.m4072du(i));
            if ((bayVar.m4112x1(i3) && bayVar.m4072du(i3) != 0.0d) || bayVar.m4072du(i4) != 0.0d) {
                dArr[0] = bayVar.m4072du(i4) + bayVar.m4072du(i3) + dArr[0];
                return dM67475k4;
            }
            if (bayVar.m4112x1(i5) && bayVar.m4072du(i5) != 0.0d) {
                dArr[0] = ((bayVar.m4072du(i6) + bayVar.m4072du(i5)) - dM67475k4) + dArr[0];
                return dM67475k4;
            }
            if (bayVar.m4112x1(i7) && bayVar.m4072du(i7) != 0.0d) {
                dArr[0] = ((bayVar.m4072du(i8) + bayVar.m4072du(i7)) - (dM67475k4 / 2.0d)) + dArr[0];
            }
            return dM67475k4;
        }
        if ((bayVar.m4112x1(i3) && bayVar.m4072du(i3) != 0.0d) || bayVar.m4072du(i4) != 0.0d) {
            double dM67475k42 = C14116yg.m67475k4((!bayVar.m4112x1(i5) || bayVar.m4072du(i5) == 0.0d) ? (!bayVar.m4112x1(i7) || bayVar.m4072du(i7) == 0.0d) ? (d - (bayVar.m4072du(i3) + bayVar.m4072du(i4))) + bayVar.m4072du(i6) : ((bayVar.m4072du(i7) + bayVar.m4072du(i8)) - (bayVar.m4072du(i3) + bayVar.m4072du(i4))) * 2.0d : (bayVar.m4072du(i5) + bayVar.m4072du(i6)) - (bayVar.m4072du(i3) + bayVar.m4072du(i4)));
            dArr[0] = bayVar.m4072du(i4) + bayVar.m4072du(i3);
            return dM67475k42;
        }
        if (!bayVar.m4112x1(i5) || bayVar.m4072du(i5) == 0.0d) {
            if (!bayVar.m4112x1(i7) || bayVar.m4072du(i7) == 0.0d) {
                bayVar.m4111x1(i, d);
                return d;
            }
            dArr[0] = bayVar.m4072du(i7);
            return 0.0d;
        }
        if (!bayVar.m4112x1(i7) || bayVar.m4072du(i7) == 0.0d) {
            return C14116yg.m67475k4(bayVar.m4072du(i5) + bayVar.m4072du(i6));
        }
        double dM67475k43 = C14116yg.m67475k4(((bayVar.m4072du(i7) + bayVar.m4072du(i8)) - (bayVar.m4072du(i5) + bayVar.m4072du(i6))) * 2.0d);
        dArr[0] = C14116yg.m67475k4(((bayVar.m4072du(i7) + bayVar.m4072du(i8)) * 2.0d) - (bayVar.m4072du(i5) + bayVar.m4072du(i6)));
        return dM67475k43;
    }

    /* JADX INFO: renamed from: kk */
    private static tbp m69573kk(bay bayVar, tbp tbpVar) {
        double[] dArr = {0.0d};
        double dM69568k4 = m69568k4(bayVar, tbpVar.f49090k4, 61, 63, 18, 20, 24, 26, 8, 9, dArr);
        double d = dArr[0];
        bayVar.m4074dy().m74248k4(0, d);
        dArr[0] = d;
        double dM69568k42 = m69568k4(bayVar, tbpVar.f49091x1, 15, 17, 32, 34, 1, 6, 10, 11, dArr);
        bayVar.m4074dy().m74248k4(1, dArr[0]);
        return new tbp(dM69568k4, dM69568k42);
    }

    /* JADX INFO: renamed from: up */
    private static tbp m69574up(bay bayVar) {
        double dM67491kk;
        double dM67491kk2;
        z2c z2cVarM4074dy = bayVar.m4074dy();
        if (bayVar.m4077jd().mo3651to()) {
            dM67491kk = (z2cVarM4074dy.m74233dy() - z2cVarM4074dy.m74262m9()) / 2.0d;
            dM67491kk2 = (z2cVarM4074dy.m74236fa() - z2cVarM4074dy.m74228ck()) / 2.0d;
        } else {
            dM67491kk = 0.0d;
            if (bayVar.m4077jd().mo3639du()) {
                dM67491kk = C14116yg.m67491kk(0.0d, (z2cVarM4074dy.m74241jd() - z2cVarM4074dy.m74262m9()) / 2.0d);
                dM67491kk2 = C14116yg.m67491kk(0.0d, (z2cVarM4074dy.m74290yj() - z2cVarM4074dy.m74228ck()) / 2.0d);
            } else {
                dM67491kk2 = 0.0d;
            }
        }
        return new tbp(dM67491kk + z2cVarM4074dy.m74256kk(0), dM67491kk2 + z2cVarM4074dy.m74256kk(1));
    }

    /* JADX INFO: renamed from: x1 */
    private void m69575x1(bay bayVar, tbp tbpVar) {
        boolean z;
        tbp tbpVarClone = m69573kk(bayVar, tbpVar.Clone()).Clone();
        bayVar.m4074dy().m74263m9(tbpVarClone.f49091x1);
        bayVar.m4074dy().m74270to(tbpVarClone.f49090k4);
        boolean z2 = true;
        if (bayVar.m4077jd().mo3651to()) {
            if (!bayVar.m4112x1(61)) {
                bayVar.m4095kk(61, tbpVarClone.f49090k4);
            }
            if (!bayVar.m4112x1(15)) {
                bayVar.m4095kk(15, tbpVarClone.f49091x1);
            }
            if (bayVar.m4074dy().m74236fa() == tbpVarClone.f49091x1 && bayVar.m4074dy().m74233dy() == tbpVarClone.f49090k4) {
                z2 = false;
            }
        } else {
            double dM67491kk = C14116yg.m67491kk(bayVar.m4074dy().m74241jd(), bayVar.m4074dy().m74262m9());
            double dM67491kk2 = C14116yg.m67491kk(bayVar.m4074dy().m74290yj(), bayVar.m4074dy().m74274up());
            double d = dM67491kk != 0.0d ? tbpVarClone.f49090k4 / dM67491kk : 1.0d;
            double d2 = dM67491kk2 != 0.0d ? tbpVarClone.f49091x1 / dM67491kk2 : 1.0d;
            if (AbstractC0753ak.m3633k4(d)) {
                bayVar.m4085k4(d, 61);
                z = true;
            } else {
                z = false;
            }
            if (AbstractC0753ak.m3633k4(d2)) {
                bayVar.m4085k4(d2, 15);
            } else {
                z2 = z;
            }
        }
        if (z2) {
            bayVar.m4105um();
            bayVar.m4065ak();
        }
    }

    /* JADX INFO: renamed from: yj */
    private static boolean m69576yj(bay bayVar) {
        return bayVar.m4074dy().m74287x6() && bayVar.m4074dy().m74230dq() != null;
    }

    @Override // com.aspose.slides.AbstractC0753ak
    /* JADX INFO: renamed from: h4 */
    public boolean mo3642h4(bay bayVar) {
        return m69572k4(bayVar, false, (List<bay>) null);
    }

    /* JADX INFO: renamed from: k4 */
    private double m69569k4(bay bayVar, bay bayVar2, uus uusVar) {
        boolean z = true;
        if (uusVar.m71926m9() != 1) {
            return bayVar.m4072du(uusVar.m71918dy());
        }
        bay bayVarM4082k4 = bayVar.m4082k4();
        int iM71924kk = uusVar.m71924kk();
        if (yz6.m74166k4(uusVar.m71918dy()) && ((iM71924kk == 32 || iM71924kk == 18) && bayVarM4082k4 != null && C7019kk.m27469x1(bayVarM4082k4.m4077jd(), uxg.class))) {
            double dM74256kk = bayVar.m4074dy().m74256kk(uusVar.m71918dy() == 61 ? 10 : 11);
            jof jofVarClone = m69570k4(bayVar, bayVar2).Clone();
            jof jofVarClone2 = m69570k4(bayVar, (bay) null).Clone();
            if (iM71924kk != 18 ? jofVarClone.m63459jd() >= jofVarClone2.m63459jd() : jofVarClone.m63453c5() >= jofVarClone2.m63453c5()) {
                z = false;
            }
            if (dM74256kk != 0.0d && z) {
                return dM74256kk;
            }
        } else if (yz6.m74166k4(uusVar.m71918dy()) && bayVarM4082k4 != null && C7019kk.m27469x1(bayVarM4082k4.m4077jd(), C14288pj.class)) {
            double dM74256kk2 = bayVar.m4074dy().m74256kk(uusVar.m71918dy() == 61 ? 13 : 14);
            if (dM74256kk2 != 0.0d) {
                return bayVar.m4072du(uusVar.m71918dy()) * dM74256kk2;
            }
        }
        return bayVar.m4075h4(uusVar.m71918dy());
    }

    /* JADX INFO: renamed from: dy */
    public final void m69577dy(bay bayVar) {
        double d;
        tbp tbpVarClone = m69566fa(bayVar).Clone();
        m69572k4(bayVar, true, (List<bay>) null);
        List.Enumerator<bay> it = bayVar.m4110x1().iterator();
        while (it.hasNext()) {
            try {
                bay next = it.next();
                tbp tbpVarClone2 = m69573kk(next, tbpVarClone.Clone()).Clone();
                next.m4074dy().m74259kk(tbpVarClone2.f49090k4);
                next.m4074dy().m74239h4(tbpVarClone2.f49091x1);
                double d2 = tbpVarClone.f49090k4 / tbpVarClone2.f49090k4;
                double d3 = tbpVarClone.f49091x1 / tbpVarClone2.f49091x1;
                double dM67491kk = C14116yg.m67491kk(d2, d3);
                if (next.m4112x1(61) || !C7019kk.m27469x1(next.m4077jd(), lma.class)) {
                    d = d2;
                } else {
                    d = d2;
                    next.m4095kk(61, tbpVarClone2.f49090k4);
                }
                if (!next.m4112x1(15) && C7019kk.m27469x1(next.m4077jd(), lma.class)) {
                    next.m4095kk(15, tbpVarClone2.f49091x1);
                }
                if (AbstractC0753ak.m3633k4(dM67491kk)) {
                    if (next.m4077jd().mo3639du()) {
                        if (next.m4112x1(61)) {
                            next.m4087k4(61, next.m4078k4(61) * dM67491kk);
                        }
                        if (next.m4112x1(15)) {
                            next.m4087k4(15, next.m4078k4(15) * dM67491kk);
                        }
                    } else if (bayVar.m4082k4() == null) {
                        if (next.m4112x1(61) && AbstractC0753ak.m3633k4(d)) {
                            next.m4087k4(61, next.m4078k4(61) * d);
                        }
                        if (next.m4112x1(15) && AbstractC0753ak.m3633k4(d3)) {
                            next.m4087k4(15, next.m4078k4(15) * d3);
                        }
                    }
                    m69573kk(next, tbpVarClone.Clone()).CloneTo(tbpVarClone2);
                    next.m4074dy().m74259kk(tbpVarClone2.f49090k4);
                    next.m4074dy().m74239h4(tbpVarClone2.f49091x1);
                }
                m69572k4(bayVar, true, (List<bay>) null);
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
    }

    /* JADX INFO: renamed from: k4 */
    private static jof m69570k4(bay bayVar, bay bayVar2) {
        boolean z;
        double d;
        boolean z2;
        if (bayVar.m4110x1().size() == 0) {
            return new jof();
        }
        List.Enumerator<bay> it = bayVar.m4110x1().iterator();
        double dM67491kk = Double.MAX_VALUE;
        double dM67491kk2 = Double.MAX_VALUE;
        while (true) {
            try {
                z = false;
                if (!it.hasNext()) {
                    break;
                }
                bay next = it.next();
                if (next != bayVar2) {
                    dM67491kk = C14116yg.m67491kk(dM67491kk, next.m4074dy().m74256kk(0));
                    dM67491kk2 = C14116yg.m67491kk(dM67491kk2, next.m4074dy().m74256kk(1));
                }
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
            it.dispose();
        }
        if (dM67491kk == Double.MAX_VALUE || dM67491kk2 == Double.MAX_VALUE) {
            return new jof();
        }
        it = bayVar.m4110x1().iterator();
        double dM67502x1 = 0.0d;
        double dM67502x12 = 0.0d;
        while (it.hasNext()) {
            try {
                bay next2 = it.next();
                if (next2 != bayVar2) {
                    z2c z2cVarM4074dy = next2.m4074dy();
                    double dM67491kk3 = C14116yg.m67491kk(z2cVarM4074dy.m74241jd(), z2cVarM4074dy.m74233dy());
                    d = dM67491kk;
                    double dM67491kk4 = C14116yg.m67491kk(z2cVarM4074dy.m74290yj(), z2cVarM4074dy.m74236fa());
                    z2 = false;
                    dM67502x1 = C14116yg.m67502x1(dM67502x1, dM67491kk3 + (z2cVarM4074dy.m74256kk(0) - d));
                    dM67502x12 = C14116yg.m67502x1(dM67502x12, (z2cVarM4074dy.m74256kk(1) - dM67491kk2) + dM67491kk4);
                } else {
                    d = dM67491kk;
                    z2 = z;
                }
                z = z2;
                dM67491kk = d;
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        double d2 = dM67491kk;
        return new jof(d2, dM67491kk2, d2 + dM67502x1, dM67502x12 + dM67491kk2);
    }

    /* JADX INFO: renamed from: k4 */
    private z2c m69571k4(z2c z2cVar) {
        z2c z2cVarM74230dq = z2cVar.m74230dq();
        if (z2cVarM74230dq != null) {
            bay bayVarM74243k4 = z2cVarM74230dq.m74243k4();
            while (true) {
                bayVarM74243k4 = bayVarM74243k4.m4082k4();
                if (!z2cVarM74230dq.m74243k4().m4077jd().mo3651to() || bayVarM74243k4 == null || !bayVarM74243k4.m4077jd().mo3651to()) {
                    break;
                }
                z2cVarM74230dq = bayVarM74243k4.m4074dy();
            }
        }
        return z2cVarM74230dq;
    }

    @Override // com.aspose.slides.AbstractC0753ak
    /* JADX INFO: renamed from: k4 */
    public boolean mo3646k4(bay bayVar) {
        tbp tbpVarClone = m69566fa(bayVar).Clone();
        List<bay> list = new List<>();
        List.Enumerator<bay> it = bayVar.m4110x1().iterator();
        while (it.hasNext()) {
            try {
                bay next = it.next();
                m69572k4(bayVar, false, list);
                m69575x1(next, tbpVarClone.Clone());
                list.addItem(next);
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        jof jofVarClone = m69570k4(bayVar, (bay) null).Clone();
        bayVar.m4074dy().m74232du(jofVarClone.m63453c5());
        bayVar.m4074dy().m74234dy(jofVarClone.m63459jd());
        bayVar.m4074dy().m74259kk(jofVarClone.m63453c5());
        bayVar.m4074dy().m74239h4(jofVarClone.m63459jd());
        m69563c5(bayVar);
        m69567jd(bayVar);
        m69564ck(bayVar);
        bayVar.m4074dy().m74237g8();
        AbstractC0753ak.m3638x1(bayVar, m69565dy().m5210k4(), m69565dy().m5212x1());
        if (mo3647k4(bayVar, new tbp(bayVar.m4101to(61), bayVar.m4101to(15)).Clone())) {
            bayVar.m4105um();
            return false;
        }
        if (bayVar.m4082k4() != null && C7019kk.m27469x1(bayVar.m4082k4().m4077jd(), uxg.class) && mo3647k4(bayVar, tbpVarClone.Clone())) {
            bayVar.m4074dy().m74248k4(12, m69565dy().m3474kk());
            bayVar.m4105um();
            return false;
        }
        if (bayVar.m4082k4() == null || !C7019kk.m27469x1(bayVar.m4082k4().m4077jd(), C14288pj.class)) {
            return true;
        }
        tbp tbpVar = new tbp(bayVar.m4072du(61), bayVar.m4072du(15));
        if (!mo3647k4(bayVar, tbpVar.Clone())) {
            return true;
        }
        double dM74241jd = tbpVar.f49090k4 / bayVar.m4074dy().m74241jd();
        double dM74290yj = tbpVar.f49091x1 / bayVar.m4074dy().m74290yj();
        if (AbstractC0753ak.m3633k4(dM74241jd)) {
            bayVar.m4074dy().m74248k4(13, dM74241jd);
        }
        if (AbstractC0753ak.m3633k4(dM74290yj)) {
            bayVar.m4074dy().m74248k4(14, dM74290yj);
        }
        bayVar.m4105um();
        return false;
    }

    @Override // com.aspose.slides.AbstractC0753ak
    /* JADX INFO: renamed from: k4 */
    public boolean mo3647k4(bay bayVar, tbp tbpVar) {
        List.Enumerator<bay> it;
        double dM74241jd = tbpVar.f49090k4 / bayVar.m4074dy().m74241jd();
        double dM74290yj = tbpVar.f49091x1 / bayVar.m4074dy().m74290yj();
        if (m69565dy().m3474kk() != 0.0d) {
            double dM67491kk = C14116yg.m67491kk(dM74241jd, dM74290yj);
            if (!AbstractC0753ak.m3633k4(dM67491kk)) {
                return false;
            }
            it = bayVar.m4110x1().iterator();
            while (it.hasNext()) {
                try {
                    it.next().m4086k4(dM67491kk, 61, 15, 18, 32);
                } finally {
                    if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                        it.dispose();
                    }
                }
            }
            return true;
        }
        if (AbstractC0753ak.m3633k4(dM74241jd)) {
            List.Enumerator<bay> it2 = bayVar.m4110x1().iterator();
            while (it2.hasNext()) {
                try {
                    it2.next().m4085k4(dM74241jd, 61);
                } finally {
                    if (C7019kk.m27456k4((Iterator) it2, (Class<IDisposable>) IDisposable.class)) {
                        it2.dispose();
                    }
                }
            }
            if (C7019kk.m27456k4((Iterator) it2, (Class<IDisposable>) IDisposable.class)) {
                it2.dispose();
            }
            return true;
        }
        if (!AbstractC0753ak.m3633k4(dM74290yj)) {
            return false;
        }
        it = bayVar.m4110x1().iterator();
        while (it.hasNext()) {
            try {
                it.next().m4085k4(dM74290yj, 15);
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
            it.dispose();
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x0100  */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private boolean m69572k4(bay bayVar, boolean z, List<bay> list) {
        uus[] uusVarArr;
        int i;
        int i2;
        int i3;
        int i4;
        boolean z2;
        bay bayVar2 = bayVar;
        List<bay> list2 = list;
        if (bayVar2.m4104u4() == null) {
            return true;
        }
        C14334qa c14334qa = new C14334qa();
        uus[] uusVarArrM70181du = bayVar2.m4104u4().m70181du();
        int length = uusVarArrM70181du.length;
        int i5 = 0;
        boolean z3 = true;
        while (i5 < length) {
            uus uusVar = uusVarArrM70181du[i5];
            bay bayVarM71929x1 = uusVar.m71929x1(bayVar2);
            if (bayVarM71929x1 != null) {
                List.Enumerator<bay> it = uusVar.m71923k4(bayVar2).iterator();
                while (it.hasNext()) {
                    try {
                        bay next = it.next();
                        if (list2 == null || !list2.containsItem(next) || !yz6.m74166k4(uusVar.m71924kk())) {
                            double dM4079k4 = bayVarM71929x1.m4079k4(uusVar);
                            uus[] uusVarArr2 = uusVarArrM70181du;
                            double dM69569k4 = m69569k4(bayVarM71929x1, next, uusVar) * dM4079k4;
                            if (dM69569k4 != 0.0d) {
                                double dM4072du = next.m4072du(uusVar.m71924kk());
                                i3 = length;
                                C0702a3 c0702a3M69466k4 = c14334qa.m69466k4(next, uusVar.m71924kk());
                                if (AbstractC0753ak.m3634k4(dM4072du, dM69569k4)) {
                                    int iM71928up = uusVar.m71928up();
                                    i4 = i5;
                                    if (iM71928up == 0 || iM71928up == 1) {
                                        z2 = z3;
                                        c0702a3M69466k4.m3173kk(dM69569k4);
                                    } else if (iM71928up == 2) {
                                        c0702a3M69466k4.m3173kk(dM69569k4);
                                        if (next == bayVarM71929x1) {
                                            C0702a3 c0702a3M69466k42 = c14334qa.m69466k4(bayVarM71929x1, uusVar.m71918dy());
                                            z2 = z3;
                                            if (AbstractC0753ak.m3634k4(c0702a3M69466k4.m3172kk(), c0702a3M69466k42.m3172kk() * dM4079k4) && c0702a3M69466k4.m3172kk() < c0702a3M69466k42.m3172kk() * dM4079k4) {
                                                c0702a3M69466k42.m3173kk(c0702a3M69466k4.m3172kk() / dM4079k4);
                                                if (z) {
                                                    bayVarM71929x1.m4111x1(uusVar.m71918dy(), c0702a3M69466k42.m3172kk());
                                                } else {
                                                    bayVarM71929x1.m4095kk(uusVar.m71918dy(), c0702a3M69466k42.m3172kk());
                                                }
                                            }
                                        }
                                    } else if (iM71928up == 3) {
                                        c0702a3M69466k4.m3171k4(dM69569k4);
                                    } else if (iM71928up == 4) {
                                        c0702a3M69466k4.m3175x1(dM69569k4);
                                    }
                                    if (AbstractC0753ak.m3634k4(dM4072du, c0702a3M69466k4.m3172kk())) {
                                        if (z) {
                                            next.m4111x1(uusVar.m71924kk(), c0702a3M69466k4.m3172kk());
                                        } else {
                                            next.m4095kk(uusVar.m71924kk(), c0702a3M69466k4.m3172kk());
                                            if (next.m4077jd().mo3645k4(uusVar.m71924kk()) || yz6.m74172kk(uusVar.m71924kk())) {
                                                z3 = z2 & (next.m4072du(uusVar.m71924kk()) != dM69569k4);
                                            }
                                            list2 = list;
                                            length = i3;
                                            i5 = i4;
                                            uusVarArrM70181du = uusVarArr2;
                                        }
                                    }
                                } else {
                                    i4 = i5;
                                }
                                z2 = z3;
                                if (AbstractC0753ak.m3634k4(dM4072du, c0702a3M69466k4.m3172kk())) {
                                }
                            } else {
                                i3 = length;
                                i4 = i5;
                                z2 = z3;
                            }
                            z3 = z2;
                            list2 = list;
                            length = i3;
                            i5 = i4;
                            uusVarArrM70181du = uusVarArr2;
                        }
                    } catch (Throwable th) {
                        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                            it.dispose();
                        }
                        throw th;
                    }
                }
                uusVarArr = uusVarArrM70181du;
                i = length;
                i2 = i5;
                boolean z4 = z3;
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
                z3 = z4;
            } else {
                uusVarArr = uusVarArrM70181du;
                i = length;
                i2 = i5;
            }
            i5 = i2 + 1;
            bayVar2 = bayVar;
            list2 = list;
            length = i;
            uusVarArrM70181du = uusVarArr;
        }
        return z3;
    }
}
