package com.aspose.slides;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p332p7.C7254aj;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.C14116yg;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.ak */
/* JADX INFO: loaded from: classes3.dex */
abstract class AbstractC0753ak extends wsu {

    /* JADX INFO: renamed from: k4 */
    private AbstractC0910dq f3919k4;

    /* JADX INFO: renamed from: kk */
    private m6r f3920kk;

    /* JADX INFO: renamed from: x1 */
    private List<bay> f3921x1;

    /* JADX INFO: renamed from: k4 */
    public static AbstractC0753ak m3631k4(C7254aj c7254aj) {
        AbstractC0753ak c14345qg;
        switch (c7254aj.m28285k4()) {
            case 0:
                c14345qg = new C14345qg();
                break;
            case 1:
                c14345qg = new C1131g4();
                break;
            case 2:
                c14345qg = new C14240ok();
                break;
            case 3:
                c14345qg = new C14238oi();
                break;
            case 4:
                c14345qg = new C14288pj();
                break;
            case 5:
                c14345qg = new lma();
                break;
            case 6:
                c14345qg = new xyf();
                break;
            case 7:
                c14345qg = new uxg();
                break;
            case 8:
                c14345qg = new kvo();
                break;
            case 9:
                c14345qg = new cpm();
                break;
            default:
                throw new PptxException("Unsuppotred SmartArt layout algorithm");
        }
        c14345qg.f3919k4 = AbstractC0910dq.m5207k4(c7254aj);
        return c14345qg;
    }

    /* JADX INFO: renamed from: du */
    public boolean mo3639du() {
        return !mo3651to();
    }

    /* JADX INFO: renamed from: h4 */
    public final m6r m3641h4() {
        if (this.f3920kk == null) {
            this.f3920kk = (m6r) m72918k4(m6r.class);
        }
        return this.f3920kk;
    }

    /* JADX INFO: renamed from: k4 */
    public abstract boolean mo3646k4(bay bayVar);

    /* JADX INFO: renamed from: kk */
    public tbp mo3648kk(bay bayVar) {
        tbp tbpVarClone = tbp.m71054k4(bayVar.m4108wl(), bayVar.m4100qq()).Clone();
        return new tbp(tbpVarClone.f49090k4 * bayVar.m4074dy().m74233dy(), tbpVarClone.f49091x1 * bayVar.m4074dy().m74236fa());
    }

    /* JADX INFO: renamed from: m9 */
    public final List<bay> m3650m9() {
        if (this.f3921x1 == null) {
            this.f3921x1 = new List<>();
        }
        return this.f3921x1;
    }

    /* JADX INFO: renamed from: to */
    public boolean mo3651to() {
        return false;
    }

    @Override // com.aspose.slides.wsu
    public String toString() {
        return C14113y2.m67408k4(C14067j2.m66727k4(this).mo48540du(), " - ", m3641h4() != null ? m3641h4().mo4816J_() : C14113y2.f47374k4);
    }

    /* JADX INFO: renamed from: x1 */
    public void mo3653x1(bay bayVar) {
    }

    /* JADX INFO: renamed from: m9 */
    public static boolean m3637m9(bay bayVar) {
        if (bayVar.m4071dq()) {
            return true;
        }
        if (bayVar.m4110x1().size() <= 0) {
            return false;
        }
        if (bayVar.m4074dy().m74233dy() == 0.0d && bayVar.m4072du(61) == 0.0d) {
            return false;
        }
        return (bayVar.m4074dy().m74236fa() == 0.0d && bayVar.m4072du(15) == 0.0d) ? false : true;
    }

    /* JADX INFO: renamed from: x1 */
    public static void m3638x1(bay bayVar, int i, int i2) {
        tbp tbpVarClone = m3632k4(bayVar, i, i2).Clone();
        bayVar.m4074dy().m74252k4(new tbp(i == 0 ? bayVar.m4074dy().m74269to() : tbpVarClone.f49090k4, i2 == 0 ? bayVar.m4074dy().m74231du() : tbpVarClone.f49091x1).Clone());
    }

    /* JADX INFO: renamed from: du */
    public boolean mo3640du(bay bayVar) {
        if (bayVar.m4104u4() == null) {
            return true;
        }
        boolean z = true;
        for (uus uusVar : bayVar.m4104u4().m70184to()) {
            bay bayVarM71929x1 = uusVar.m71929x1(bayVar);
            if (bayVarM71929x1 != null && m3637m9(bayVarM71929x1)) {
                double dM4079k4 = bayVar.m4079k4(uusVar);
                double dM4075h4 = bayVarM71929x1.m4075h4(uusVar.m71918dy()) * dM4079k4;
                if (m3634k4(dM4075h4, bayVarM71929x1.m4078k4(uusVar.m71918dy()) * dM4079k4)) {
                    double dM4072du = bayVar.m4072du(uusVar.m71924kk());
                    if (uusVar.m71928up() == 2 && m3634k4(dM4075h4, dM4072du) && mo3645k4(uusVar.m71924kk())) {
                        bayVar.m4095kk(uusVar.m71924kk(), dM4075h4);
                        z &= bayVar.m4072du(uusVar.m71924kk()) != dM4075h4;
                    }
                }
            }
        }
        return z;
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00c6 A[Catch: all -> 0x0069, TryCatch #0 {all -> 0x0069, blocks: (B:11:0x0032, B:13:0x0038, B:15:0x005e, B:21:0x006c, B:23:0x007c, B:29:0x0091, B:31:0x0098, B:33:0x00a2, B:45:0x00d1, B:47:0x00db, B:36:0x00ad, B:38:0x00b4, B:43:0x00ca, B:44:0x00ce, B:42:0x00c6), top: B:66:0x0032 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00db A[Catch: all -> 0x0069, TRY_LEAVE, TryCatch #0 {all -> 0x0069, blocks: (B:11:0x0032, B:13:0x0038, B:15:0x005e, B:21:0x006c, B:23:0x007c, B:29:0x0091, B:31:0x0098, B:33:0x00a2, B:45:0x00d1, B:47:0x00db, B:36:0x00ad, B:38:0x00b4, B:43:0x00ca, B:44:0x00ce, B:42:0x00c6), top: B:66:0x0032 }] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00fa A[SYNTHETIC] */
    /* JADX INFO: renamed from: h4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean mo3642h4(bay bayVar) {
        uus[] uusVarArr;
        int i;
        uus[] uusVarArr2;
        if (bayVar.m4104u4() == null) {
            return true;
        }
        C14334qa c14334qa = new C14334qa();
        uus[] uusVarArrM70181du = bayVar.m4104u4().m70181du();
        int length = uusVarArrM70181du.length;
        int i2 = 0;
        boolean z = true;
        while (i2 < length) {
            uus uusVar = uusVarArrM70181du[i2];
            bay bayVarM71929x1 = uusVar.m71929x1(bayVar);
            if (bayVarM71929x1 == null || !m3637m9(bayVarM71929x1)) {
                uusVarArr = uusVarArrM70181du;
                i = i2;
            } else {
                List.Enumerator<bay> it = uusVar.m71923k4(bayVar).iterator();
                while (it.hasNext()) {
                    try {
                        bay next = it.next();
                        double dM4079k4 = bayVar.m4079k4(uusVar);
                        int i3 = i2;
                        double dM4072du = bayVarM71929x1.m4072du(uusVar.m71918dy()) * dM4079k4;
                        if (m3634k4(dM4072du, dM4079k4 * bayVarM71929x1.m4078k4(uusVar.m71918dy())) || uusVar.m71928up() == 4) {
                            uusVarArr2 = uusVarArrM70181du;
                            double dM4072du2 = next.m4072du(uusVar.m71924kk());
                            if (m3634k4(dM4072du, dM4072du2)) {
                                C0702a3 c0702a3M69466k4 = c14334qa.m69466k4(next, uusVar.m71924kk());
                                int iM71928up = uusVar.m71928up();
                                if (iM71928up == 2) {
                                    c0702a3M69466k4.m3173kk(dM4072du);
                                    if (m3634k4(c0702a3M69466k4.m3172kk(), dM4072du)) {
                                        next.m4095kk(uusVar.m71924kk(), c0702a3M69466k4.m3172kk());
                                        z &= next.m4072du(uusVar.m71924kk()) != dM4072du;
                                    }
                                } else {
                                    if (iM71928up == 3) {
                                        c0702a3M69466k4.m3171k4(dM4072du);
                                    } else if (iM71928up == 4) {
                                        c0702a3M69466k4.m3175x1(dM4072du);
                                    } else if ((uusVar.m71927to() != 3 || !yz6.m74166k4(uusVar.m71924kk()) || !yz6.m74166k4(uusVar.m71918dy())) && uusVar.m71926m9() != 1 && (C14116yg.m67475k4(dM4072du2) > C14116yg.m67475k4(dM4072du) || dM4072du2 == 0.0d)) {
                                    }
                                    if (m3634k4(c0702a3M69466k4.m3172kk(), dM4072du)) {
                                    }
                                }
                            }
                        } else {
                            uusVarArr2 = uusVarArrM70181du;
                        }
                        uusVarArrM70181du = uusVarArr2;
                        i2 = i3;
                    } catch (Throwable th) {
                        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                            it.dispose();
                        }
                        throw th;
                    }
                }
                uusVarArr = uusVarArrM70181du;
                i = i2;
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
            i2 = i + 1;
            uusVarArrM70181du = uusVarArr;
        }
        return z;
    }

    /* JADX INFO: renamed from: k4 */
    public final AbstractC0910dq m3643k4() {
        return this.f3919k4;
    }

    /* JADX INFO: renamed from: kk */
    public boolean mo3649kk() {
        return true;
    }

    /* JADX INFO: renamed from: to */
    public boolean m3652to(bay bayVar) {
        if (bayVar.m4104u4() == null) {
            return false;
        }
        C14334qa c14334qa = new C14334qa();
        boolean z = false;
        for (uus uusVar : bayVar.m4104u4().m70183kk()) {
            double dM4079k4 = bayVar.m4079k4(uusVar);
            double dM4072du = bayVar.m4072du(uusVar.m71918dy()) * dM4079k4;
            if (m3634k4(dM4072du, bayVar.m4078k4(uusVar.m71918dy()) * dM4079k4) && !m3636k4(bayVar, uusVar.m71924kk())) {
                C0702a3 c0702a3M69466k4 = c14334qa.m69466k4(bayVar, uusVar.m71924kk());
                int iM71928up = uusVar.m71928up();
                if (iM71928up == 3) {
                    c0702a3M69466k4.m3171k4(dM4072du);
                } else if (iM71928up != 4) {
                    c0702a3M69466k4.m3173kk(dM4072du);
                } else {
                    c0702a3M69466k4.m3175x1(dM4072du);
                }
                bayVar.m4095kk(uusVar.m71924kk(), c0702a3M69466k4.m3172kk());
                z = true;
            }
        }
        return z;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0046  */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static tbp m3632k4(bay bayVar, int i, int i2) {
        double d;
        z2c z2cVarM4074dy = bayVar.m4074dy();
        tbp tbpVar = new tbp(z2cVarM4074dy.m74262m9(), z2cVarM4074dy.m74228ck());
        tbp tbpVar2 = new tbp(z2cVarM4074dy.m74241jd(), z2cVarM4074dy.m74290yj());
        tbp tbpVar3 = new tbp(z2cVarM4074dy.m74225c5(), z2cVarM4074dy.m74274up());
        double d2 = tbpVar3.f49090k4;
        double d3 = 0.0d;
        if (d2 < tbpVar2.f49090k4) {
            d = 0.0d;
        } else if (i == 2) {
            d = (d2 - tbpVar.f49090k4) / 2.0d;
        } else if (i == 3) {
            d = d2 - tbpVar.f49090k4;
        }
        double d4 = tbpVar3.f49091x1;
        if (d4 >= tbpVar2.f49091x1) {
            if (i2 == 2) {
                d3 = (d4 - tbpVar.f49091x1) / 2.0d;
            } else if (i2 == 3) {
                d3 = d4 - tbpVar.f49091x1;
            }
        }
        return new tbp(d, d3);
    }

    /* JADX INFO: renamed from: x1 */
    public boolean mo3654x1() {
        return false;
    }

    /* JADX INFO: renamed from: k4 */
    public void mo3644k4(bay bayVar, double d) {
    }

    /* JADX INFO: renamed from: k4 */
    public static boolean m3633k4(double d) {
        return d < 0.9999d;
    }

    /* JADX INFO: renamed from: k4 */
    public static boolean m3634k4(double d, double d2) {
        return yz6.m74180x1(d, d2);
    }

    /* JADX INFO: renamed from: k4 */
    public boolean mo3645k4(int i) {
        return false;
    }

    /* JADX INFO: renamed from: k4 */
    private static boolean m3635k4(int i, bay bayVar, bay bayVar2) {
        if (bayVar.m4104u4() != null) {
            for (uus uusVar : bayVar.m4104u4().m70181du()) {
                if (uusVar.m71924kk() == i && uusVar.m71923k4(bayVar).containsItem(bayVar2)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: k4 */
    private static boolean m3636k4(bay bayVar, int i) {
        if (yz6.m74166k4(i)) {
            return false;
        }
        for (bay bayVarM4082k4 = bayVar.m4082k4(); bayVarM4082k4 != null; bayVarM4082k4 = bayVarM4082k4.m4082k4()) {
            if (m3635k4(i, bayVarM4082k4, bayVar)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: k4 */
    public boolean mo3647k4(bay bayVar, tbp tbpVar) {
        double dM74241jd = tbpVar.f49090k4 / bayVar.m4074dy().m74241jd();
        double dM74290yj = tbpVar.f49091x1 / bayVar.m4074dy().m74290yj();
        List.Enumerator<bay> it = bayVar.m4110x1().iterator();
        while (it.hasNext()) {
            try {
                bay next = it.next();
                if (m3633k4(dM74241jd)) {
                    next.m4085k4(dM74241jd, 61);
                }
                if (m3633k4(dM74290yj)) {
                    next.m4085k4(dM74290yj, 15);
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
        return m3633k4(dM74241jd) || m3633k4(dM74290yj);
    }
}
