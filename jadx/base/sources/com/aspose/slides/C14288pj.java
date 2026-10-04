package com.aspose.slides;

import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.AbstractC14092to;

/* JADX INFO: renamed from: com.aspose.slides.pj */
/* JADX INFO: loaded from: classes3.dex */
class C14288pj extends AbstractC0753ak {
    /* JADX INFO: renamed from: dy */
    private C1193hb m69107dy() {
        return (C1193hb) m3643k4();
    }

    /* JADX INFO: renamed from: k4 */
    private static tbp m69109k4(bay bayVar, bay bayVar2) {
        C14238oi c14238oi = (C14238oi) C7019kk.m27452k4((Object) bayVar2.m4077jd(), C14238oi.class);
        double dM74256kk = bayVar2.m4074dy().m74256kk(4);
        double dM74256kk2 = bayVar2.m4074dy().m74256kk(5);
        return (c14238oi == null || (dM74256kk == 0.0d && dM74256kk2 == 0.0d)) ? tbp.f49088kk : new tbp((bayVar.m4074dy().m74262m9() / 2.0d) - dM74256kk, (bayVar.m4074dy().m74228ck() / 2.0d) - dM74256kk2);
    }

    /* JADX INFO: renamed from: dy */
    public static boolean m69108dy(bay bayVar) {
        return bayVar.m4071dq() || bayVar.m4110x1().size() > 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x00af, code lost:
    
        if (r2 != false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00b1, code lost:
    
        r0 = r3.f49090k4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00b5, code lost:
    
        r0 = r3.f49091x1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00f0, code lost:
    
        if (r2 != false) goto L46;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0085  */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private tbp m69110k4(bay bayVar, bay bayVar2, double d, double d2, boolean z) {
        double d3;
        double dM74228ck;
        double dM74262m9;
        double dM74228ck2;
        tbp tbpVarClone;
        double dM74262m92 = 0.0d;
        if (bayVar == null || bayVar2 == null || !m69108dy(bayVar) || !m69108dy(bayVar2)) {
            d3 = 0.0d;
        } else {
            boolean z2 = m69107dy().m7092kk() == 1 || m69107dy().m7092kk() == 2;
            int iM7092kk = m69107dy().m7092kk();
            if (iM7092kk == 1) {
                dM74228ck = bayVar.m4074dy().m74228ck() + d;
            } else if (iM7092kk != 2) {
                if (iM7092kk == 3) {
                    dM74262m9 = bayVar.m4074dy().m74262m9() + d;
                } else if (iM7092kk != 4) {
                    dM74262m9 = 0.0d;
                    d3 = 0.0d;
                    if (z) {
                        tbp tbpVarClone2 = m69109k4(bayVar, bayVar2).Clone();
                        if (z2) {
                            dM74262m92 = tbpVarClone2.f49090k4;
                        } else {
                            dM74228ck2 = tbpVarClone2.f49091x1;
                            d3 = dM74228ck2;
                        }
                    } else {
                        int iM7093to = m69107dy().m7093to();
                        if (iM7093to == 0) {
                            dM74228ck2 = bayVar.m4074dy().m74228ck() * d2;
                        } else if (iM7093to == 1) {
                            dM74228ck2 = bayVar.m4074dy().m74228ck() - ((bayVar.m4074dy().m74228ck() * d2) + bayVar2.m4074dy().m74228ck());
                        } else if (iM7093to == 2) {
                            dM74262m92 = bayVar.m4074dy().m74262m9() * d2;
                        } else if (iM7093to == 3) {
                            dM74262m92 = (-(bayVar2.m4074dy().m74262m9() - bayVar.m4074dy().m74262m9())) - (bayVar.m4074dy().m74262m9() * d2);
                        } else if (iM7093to == 4) {
                            tbpVarClone = m69109k4(bayVar, bayVar2).Clone();
                            if (tbpVarClone.m71067x1() <= 0.0d) {
                                jof jofVar = new jof(AbstractC14092to.m67204k4((Object[]) bayVar2.m4074dy().m74227c6()));
                                z2c z2cVarM4074dy = bayVar2.m4074dy();
                                if (z2) {
                                    dM74262m92 = OooOO0.OooO00o(bayVar.m4074dy().m74262m9(), jofVar.m63453c5(), 2.0d, z2cVarM4074dy.m74269to() - jofVar.m63460k4());
                                } else {
                                    dM74228ck2 = OooOO0.OooO00o(bayVar.m4074dy().m74228ck(), jofVar.m63459jd(), 2.0d, z2cVarM4074dy.m74231du() - jofVar.m63473x1());
                                }
                            }
                        } else if (iM7093to == 5) {
                            tbpVarClone = m69109k4(bayVar, bayVar2).Clone();
                            if (tbpVarClone.m71067x1() <= 0.0d) {
                                z2c z2cVarM4074dy2 = bayVar.m4074dy();
                                if (z2) {
                                    dM74262m92 = (z2cVarM4074dy2.m74262m9() - bayVar2.m4074dy().m74262m9()) / 2.0d;
                                } else {
                                    dM74228ck2 = (z2cVarM4074dy2.m74228ck() - bayVar2.m4074dy().m74228ck()) / 2.0d;
                                }
                            }
                        }
                        d3 = dM74228ck2;
                    }
                    dM74262m92 = dM74262m9;
                } else {
                    dM74262m9 = (-bayVar2.m4074dy().m74262m9()) - d;
                }
                d3 = 0.0d;
                if (z) {
                }
                dM74262m92 = dM74262m9;
            } else {
                dM74228ck = (-bayVar2.m4074dy().m74228ck()) - d;
            }
            d3 = dM74228ck;
            dM74262m9 = 0.0d;
            if (z) {
            }
            dM74262m92 = dM74262m9;
        }
        return new tbp(dM74262m92, d3);
    }

    @Override // com.aspose.slides.AbstractC0753ak
    /* JADX INFO: renamed from: k4 */
    public boolean mo3645k4(int i) {
        return i == 30 || i == 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x011e  */
    @Override // com.aspose.slides.AbstractC0753ak
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean mo3646k4(bay bayVar) {
        boolean z;
        double d;
        double d2;
        tbp tbpVar;
        double d3;
        double d4;
        tbp tbpVar2;
        double dM4072du = bayVar.m4072du(30);
        double dM4072du2 = bayVar.m4072du(0);
        bay bayVar2 = bayVar.m4110x1().size() > 0 ? bayVar.m4110x1().get_Item(0) : null;
        if (bayVar2 != null) {
            bay bayVar3 = bayVar.m4110x1().size() > 1 ? bayVar.m4110x1().get_Item(1) : null;
            bay bayVar4 = bayVar.m4110x1().size() > 2 ? bayVar.m4110x1().get_Item(2) : null;
            tbp tbpVarClone = tbp.f49088kk.Clone();
            bay bayVar5 = bayVar2;
            bay bayVar6 = bayVar3;
            tbp tbpVarClone2 = m69110k4(bayVar5, bayVar3, dM4072du, dM4072du2, false).Clone();
            tbp tbpVarClone3 = m69110k4(bayVar5, bayVar4, dM4072du, dM4072du2, true).Clone();
            if (bayVar6 == null || !m69108dy(bayVar6)) {
                d = Double.MAX_VALUE;
                d2 = Double.MAX_VALUE;
            } else {
                d = Double.MAX_VALUE;
                d2 = tbpVarClone2.f49090k4;
                if (Double.MAX_VALUE <= d2) {
                    d2 = Double.MAX_VALUE;
                }
                double d5 = tbpVarClone2.f49091x1;
                if (Double.MAX_VALUE > d5) {
                    d = d5;
                }
            }
            if (bayVar4 == null || !m69108dy(bayVar4)) {
                z = true;
            } else {
                if (bayVar6 != null) {
                    int iM7092kk = m69107dy().m7092kk();
                    if (iM7092kk == 1) {
                        z = true;
                        tbpVar = new tbp(tbpVarClone2.f49090k4, tbpVarClone2.f49091x1 + bayVar4.m4074dy().m74228ck() + dM4072du);
                    } else if (iM7092kk != 2) {
                        if (iM7092kk != 3) {
                            if (iM7092kk == 4) {
                                tbpVar2 = new tbp((tbpVarClone2.f49090k4 - dM4072du) - bayVar4.m4074dy().m74262m9(), tbpVarClone2.f49091x1);
                            }
                            z = true;
                            d3 = tbpVarClone2.f49090k4;
                            if (d2 > d3) {
                                d2 = d3;
                            }
                            d4 = tbpVarClone2.f49091x1;
                            if (d > d4) {
                                d = d4;
                            }
                        } else {
                            tbpVar2 = new tbp(tbpVarClone2.f49090k4 + dM4072du + bayVar4.m4074dy().m74262m9(), tbpVarClone2.f49091x1);
                        }
                        tbpVarClone2 = tbpVar2;
                        z = true;
                        d3 = tbpVarClone2.f49090k4;
                        if (d2 > d3) {
                        }
                        d4 = tbpVarClone2.f49091x1;
                        if (d > d4) {
                        }
                    } else {
                        z = true;
                        tbpVar = new tbp(tbpVarClone2.f49090k4, (tbpVarClone2.f49091x1 - bayVar4.m4074dy().m74228ck()) - dM4072du);
                    }
                    tbpVarClone2 = tbpVar;
                    d3 = tbpVarClone2.f49090k4;
                    if (d2 > d3) {
                    }
                    d4 = tbpVarClone2.f49091x1;
                    if (d > d4) {
                    }
                } else {
                    z = true;
                }
                double d6 = tbpVarClone3.f49090k4;
                if (d2 > d6) {
                    d2 = d6;
                }
                double d7 = tbpVarClone3.f49091x1;
                if (d > d7) {
                    d = d7;
                }
            }
            double d8 = tbpVarClone.f49090k4;
            if (d2 > d8) {
                d2 = d8;
            }
            double d9 = tbpVarClone.f49091x1;
            if (d > d9) {
                d = d9;
            }
            bayVar5.m4074dy().m74246k4(tbpVarClone.f49090k4 - d2, tbpVarClone.f49091x1 - d);
            if (bayVar6 != null) {
                bayVar6.m4074dy().m74246k4(tbpVarClone2.f49090k4 - d2, tbpVarClone2.f49091x1 - d);
            }
            if (bayVar4 != null) {
                bayVar4.m4074dy().m74246k4(tbpVarClone3.f49090k4 - d2, tbpVarClone3.f49091x1 - d);
            }
        } else {
            z = true;
        }
        bayVar.m4074dy().m74237g8();
        return z;
    }
}
