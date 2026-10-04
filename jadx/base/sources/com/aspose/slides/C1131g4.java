package com.aspose.slides;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.C14116yg;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.g4 */
/* JADX INFO: loaded from: classes3.dex */
class C1131g4 extends AbstractC0753ak {
    /* JADX INFO: renamed from: c5 */
    private static bay m6413c5(bay bayVar) {
        if (C7019kk.m27469x1(bayVar.m4077jd(), cpm.class) && bayVar.m4076h4().size() > 0) {
            return bayVar;
        }
        List.Enumerator<bay> it = bayVar.m4110x1().iterator();
        while (it.hasNext()) {
            try {
                bay bayVarM6413c5 = m6413c5(it.next());
                if (bayVarM6413c5 != null) {
                    return bayVarM6413c5;
                }
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        if (!C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
            return null;
        }
        it.dispose();
        return null;
    }

    /* JADX INFO: renamed from: jd */
    private bay m6415jd(bay bayVar) {
        for (bay bayVarM4082k4 = bayVar.m4082k4(); bayVarM4082k4 != null; bayVarM4082k4 = bayVarM4082k4.m4082k4()) {
            if (C7019kk.m27469x1(bayVarM4082k4.m4077jd(), C14240ok.class)) {
                return bayVarM4082k4;
            }
        }
        return bayVar.m4069c5();
    }

    /* JADX INFO: renamed from: k4 */
    private List<tbp> m6416k4(tbp tbpVar, double d, jof jofVar) {
        List<tbp> list = new List<>();
        tbp[] tbpVarArrM63467ks = jofVar.m63467ks();
        tbp tbpVarClone = tbpVarArrM63467ks[0].Clone();
        int i = 1;
        while (i <= tbpVarArrM63467ks.length) {
            tbp tbpVarClone2 = (i < tbpVarArrM63467ks.length ? tbpVarArrM63467ks[i] : tbpVarArrM63467ks[0]).Clone();
            tbp tbpVar2 = new tbp();
            tbp[] tbpVarArr = {tbpVar2};
            boolean zM74167k4 = yz6.m74167k4(tbpVar.Clone(), d, tbpVarClone.Clone(), tbpVarClone2.Clone(), tbpVarArr);
            tbpVarArr[0].CloneTo(tbpVar2);
            if (zM74167k4) {
                list.addItem(tbpVar2.Clone());
            }
            tbpVarArr[0] = tbpVar2;
            boolean zM74167k42 = yz6.m74167k4(tbpVar.Clone(), d, tbpVarClone2.Clone(), tbpVarClone.Clone(), tbpVarArr);
            tbpVarArr[0].CloneTo(tbpVar2);
            if (zM74167k42) {
                list.addItem(tbpVar2.Clone());
            }
            tbpVarClone2.CloneTo(tbpVarClone);
            i++;
        }
        return list;
    }

    /* JADX INFO: renamed from: x1 */
    private static bay m6427x1(bay bayVar, String str) {
        bay bayVarM4084k4;
        C14244on c14244onM68720c5 = bayVar.m4073du().m68720c5();
        bay bayVarM4084k42 = bayVar.m4084k4(str, c14244onM68720c5);
        if (bayVarM4084k42 != null) {
            return bayVarM4084k42;
        }
        if (bayVar.m4073du().m5149yj() == 6) {
            do {
                bayVar = bayVar.m4094kk();
                if (bayVar != null) {
                    bayVarM4084k4 = bayVar.m4084k4(str, (C14244on) null);
                }
            } while (bayVarM4084k4 == null);
            return bayVarM4084k4;
        }
        for (bay bayVarM4082k4 = bayVar.m4082k4(); bayVarM4082k4 != null; bayVarM4082k4 = bayVarM4082k4.m4082k4()) {
            bay bayVarM4084k43 = bayVarM4082k4.m4084k4(str, c14244onM68720c5);
            if (bayVarM4084k43 != null) {
                return bayVarM4084k43;
            }
        }
        int iM5146rv = c14244onM68720c5.m5146rv();
        for (bay bayVarM4082k42 = bayVar.m4082k4(); bayVarM4082k42 != null && iM5146rv - 1 <= bayVarM4082k42.m4073du().m5146rv(); bayVarM4082k42 = bayVarM4082k42.m4082k4()) {
            List.Enumerator<bay> it = bayVarM4082k42.m4110x1().iterator();
            while (it.hasNext()) {
                try {
                    bay next = it.next();
                    if (C14113y2.m67363du(next.m4099m9().mo4816J_(), str) && iM5146rv == next.m4073du().m5146rv()) {
                        return next;
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
        }
        return null;
    }

    @Override // com.aspose.slides.AbstractC0753ak
    /* JADX INFO: renamed from: du */
    public boolean mo3639du() {
        return false;
    }

    /* JADX INFO: renamed from: dy */
    public final double m6428dy(bay bayVar) {
        z2c[] z2cVarArr = {null};
        z2c[] z2cVarArr2 = {null};
        m6426k4(bayVar, m6414dy(), z2cVarArr, z2cVarArr2);
        z2c z2cVar = z2cVarArr[0];
        z2c z2cVar2 = z2cVarArr2[0];
        if (z2cVar == null || z2cVar2 == null) {
            return Double.NaN;
        }
        return m6421k4(bayVar, z2cVar, z2cVar2).m63457fa();
    }

    @Override // com.aspose.slides.AbstractC0753ak
    /* JADX INFO: renamed from: kk */
    public tbp mo3648kk(bay bayVar) {
        return tbp.f49088kk;
    }

    /* JADX INFO: renamed from: dy */
    private C13659it m6414dy() {
        return (C13659it) m3643k4();
    }

    /* JADX INFO: renamed from: k4 */
    private static bay m6417k4(bay bayVar, String str) {
        C14244on c14244onM68724jd = bayVar.m4073du().m68724jd();
        bay bayVarM4084k4 = bayVar.m4084k4(str, c14244onM68724jd);
        if (bayVarM4084k4 != null) {
            return bayVarM4084k4;
        }
        bay bayVarM4102to = bayVar.m4102to();
        while (bayVarM4102to != null && bayVarM4102to != bayVar) {
            bay bayVarM4084k42 = bayVarM4102to.m4084k4(str, (C14244on) null);
            if (bayVarM4084k42 != null) {
                return bayVarM4084k42;
            }
            bayVarM4102to = bayVarM4102to.m4102to();
            if (bayVarM4102to == null && bayVar.m4082k4() != null) {
                bayVarM4102to = bayVar.m4082k4().m4110x1().get_Item(0);
            }
        }
        return bayVar.m4069c5().m4084k4(str, c14244onM68724jd);
    }

    @Override // com.aspose.slides.AbstractC0753ak
    /* JADX INFO: renamed from: kk */
    public boolean mo3649kk() {
        return m6414dy().m63101du() == 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0139  */
    @Override // com.aspose.slides.AbstractC0753ak
    /* JADX INFO: renamed from: x1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void mo3653x1(bay bayVar) {
        jof jofVarM6419k4;
        z2c[] z2cVarArr = {null};
        z2c[] z2cVarArr2 = {null};
        m6426k4(bayVar, m6414dy(), z2cVarArr, z2cVarArr2);
        z2c z2cVar = z2cVarArr[0];
        z2c z2cVar2 = z2cVarArr2[0];
        if (z2cVar == null || z2cVar2 == null) {
            return;
        }
        jof jofVarClone = m6421k4(bayVar, z2cVar, z2cVar2).Clone();
        double dM4072du = bayVar.m4072du(7);
        if (dM4072du == 0.0d || dM4072du >= jofVarClone.m63457fa()) {
            bayVar.m4095kk(7, jofVarClone.m63457fa());
        } else {
            tbp tbpVarClone = jofVarClone.m63454ck().Clone();
            tbp tbpVar = new tbp(jofVarClone.m63455du() - tbpVarClone.f49090k4, jofVarClone.m63458h4() - tbpVarClone.f49091x1);
            tbp tbpVar2 = new tbp(jofVarClone.m63468m9() - tbpVarClone.f49090k4, jofVarClone.m63456dy() - tbpVarClone.f49091x1);
            double dM63457fa = jofVarClone.m63457fa() / 2.0d;
            tbp.m71052k4(tbpVar, dM63457fa).CloneTo(tbpVar);
            tbp.m71052k4(tbpVar2, dM63457fa).CloneTo(tbpVar2);
            double d = dM4072du / 2.0d;
            double d2 = tbpVarClone.f49090k4;
            double d3 = (tbpVar.f49090k4 * d) + d2;
            double d4 = tbpVarClone.f49091x1;
            jofVarClone = new jof(d3, (tbpVar.f49091x1 * d) + d4, (tbpVar2.f49090k4 * d) + d2, (tbpVar2.f49091x1 * d) + d4);
        }
        m3652to(bayVar);
        z2c z2cVarM4074dy = bayVar.m4074dy();
        z2cVarM4074dy.m74229ck(0.0d);
        z2cVarM4074dy.m74280x1().mo1214P_().m67983k4((byte) -1);
        z2cVarM4074dy.m74280x1().mo1214P_().m67991x1((byte) -1);
        C14838y9 c14838y9M6425k4 = m6425k4(bayVar, jofVarClone.Clone());
        int shapeType = bayVar.m4074dy().m74280x1().getShapeType();
        jof jofVar = new jof();
        if (m6414dy().m63102dy() == 0) {
            jofVarM6419k4 = m6418k4(bayVar, c14838y9M6425k4);
        } else {
            if (m6414dy().m63102dy() != 1) {
                if (m6414dy().m63102dy() == 2 || m6414dy().m63102dy() == 3) {
                    jofVarM6419k4 = m6419k4(bayVar, c14838y9M6425k4, m6424k4(m6415jd(z2cVar.m74243k4()).m4074dy()).Clone().Clone());
                }
                if (shapeType != -1) {
                    z2cVarM4074dy.m74280x1().m2817k4(shapeType);
                }
                z2cVarM4074dy.m74245k4(OooOO0.OooO00o(z2cVarM4074dy.m74233dy(), z2cVarM4074dy.m74262m9(), 2.0d, jofVar.m63460k4()));
                z2cVarM4074dy.m74282x1(OooOO0.OooO00o(z2cVarM4074dy.m74236fa(), z2cVarM4074dy.m74228ck(), 2.0d, jofVar.m63473x1()));
                z2cVarM4074dy.m74259kk(jofVar.m63453c5());
                z2cVarM4074dy.m74239h4(jofVar.m63459jd());
                tbp tbpVarClone2 = tbp.m71054k4(bayVar.m4108wl(), bayVar.m4100qq()).Clone();
                double dM74233dy = tbpVarClone2.f49090k4 * z2cVarM4074dy.m74233dy();
                double dM74236fa = tbpVarClone2.f49091x1 * z2cVarM4074dy.m74236fa();
                z2cVarM4074dy.m74246k4(dM74233dy, dM74236fa);
                z2cVarM4074dy.m74283x1(dM74233dy, dM74236fa);
            }
            jofVarM6419k4 = m6420k4(bayVar, c14838y9M6425k4, z2cVar, z2cVar2);
        }
        jofVarM6419k4.CloneTo(jofVar);
        if (shapeType != -1) {
        }
        z2cVarM4074dy.m74245k4(OooOO0.OooO00o(z2cVarM4074dy.m74233dy(), z2cVarM4074dy.m74262m9(), 2.0d, jofVar.m63460k4()));
        z2cVarM4074dy.m74282x1(OooOO0.OooO00o(z2cVarM4074dy.m74236fa(), z2cVarM4074dy.m74228ck(), 2.0d, jofVar.m63473x1()));
        z2cVarM4074dy.m74259kk(jofVar.m63453c5());
        z2cVarM4074dy.m74239h4(jofVar.m63459jd());
        tbp tbpVarClone22 = tbp.m71054k4(bayVar.m4108wl(), bayVar.m4100qq()).Clone();
        double dM74233dy2 = tbpVarClone22.f49090k4 * z2cVarM4074dy.m74233dy();
        double dM74236fa2 = tbpVarClone22.f49091x1 * z2cVarM4074dy.m74236fa();
        z2cVarM4074dy.m74246k4(dM74233dy2, dM74236fa2);
        z2cVarM4074dy.m74283x1(dM74233dy2, dM74236fa2);
    }

    /* JADX INFO: renamed from: k4 */
    private jof m6418k4(bay bayVar, C14838y9 c14838y9) {
        jof jofVar = new jof();
        if (m6414dy().m63101du() == 1) {
            C1150gl.m6759x1(bayVar.m4074dy().m74280x1(), c14838y9).CloneTo(jofVar);
        } else {
            C1150gl.m6749k4(bayVar.m4074dy().m74280x1(), c14838y9).CloneTo(jofVar);
            if (m6414dy().m63104jd()) {
                bayVar.m4074dy().m74244k4((byte) 5);
            }
            if (m6414dy().m63100ck()) {
                bayVar.m4074dy().m74281x1((byte) 5);
            }
        }
        bayVar.m4074dy().m74229ck(yz6.m74170kk(c14838y9.m73760jd().m63472up() + bayVar.m4074dy().m74255kk()));
        return jofVar;
    }

    /* JADX INFO: renamed from: k4 */
    private jof m6419k4(bay bayVar, C14838y9 c14838y9, tbp tbpVar) {
        C0956em c0956em = new C0956em(bayVar.m4112x1(12) ? bayVar.m4072du(12) : c14838y9.m73760jd().m63457fa(), c14838y9.m73760jd().Clone(), c14838y9.m73759h4(), c14838y9.m73766m9(), m6414dy().m63102dy() == 3, tbpVar.Clone());
        jof jofVar = new jof();
        if (m6414dy().m63101du() != 0) {
            C1150gl.m6748k4(bayVar.m4074dy().m74280x1(), c0956em.Clone(), c14838y9).CloneTo(jofVar);
            return jofVar;
        }
        C1150gl.m6747k4(bayVar.m4074dy().m74280x1(), c0956em.Clone()).CloneTo(jofVar);
        if (!c0956em.m5596m9() ? m6414dy().m63104jd() : m6414dy().m63100ck()) {
            bayVar.m4074dy().m74244k4((byte) 5);
        }
        if (!c0956em.m5596m9() ? m6414dy().m63100ck() : m6414dy().m63104jd()) {
            bayVar.m4074dy().m74281x1((byte) 5);
        }
        return jofVar;
    }

    /* JADX INFO: renamed from: k4 */
    private jof m6420k4(bay bayVar, C14838y9 c14838y9, z2c z2cVar, z2c z2cVar2) {
        jof jofVarClone = c14838y9.m73760jd().Clone();
        tbp[] tbpVarArrM6755k4 = C1150gl.m6755k4(bayVar, jofVarClone.Clone(), z2cVar, z2cVar2, m6414dy().m63099c5());
        double dM73759h4 = c14838y9.m73759h4();
        double dM73766m9 = c14838y9.m73766m9();
        tbp tbpVar = tbpVarArrM6755k4[0];
        double d = tbpVar.f49090k4;
        double d2 = tbpVar.f49091x1;
        tbp tbpVar2 = tbpVarArrM6755k4[1];
        jof jofVar = new jof(d, d2, tbpVar2.f49090k4, tbpVar2.f49091x1);
        tbp tbpVarClone = jofVar.m63477yj().Clone();
        tbpVarArrM6755k4[0] = new tbp(tbpVarArrM6755k4[0].f49090k4 - (C14116yg.m67491kk(dM73759h4, jofVar.m63457fa()) * tbpVarClone.f49090k4), tbpVarArrM6755k4[0].f49091x1 - (C14116yg.m67491kk(dM73759h4, jofVar.m63457fa()) * tbpVarClone.f49091x1));
        int length = tbpVarArrM6755k4.length;
        int i = length - 1;
        tbp tbpVar3 = tbpVarArrM6755k4[i];
        double d3 = tbpVar3.f49090k4;
        double d4 = tbpVar3.f49091x1;
        tbp tbpVar4 = tbpVarArrM6755k4[length - 2];
        jof jofVar2 = new jof(d3, d4, tbpVar4.f49090k4, tbpVar4.f49091x1);
        tbp tbpVarClone2 = jofVar2.m63477yj().Clone();
        tbpVarArrM6755k4[i] = new tbp(tbpVarArrM6755k4[i].f49090k4 - (C14116yg.m67491kk(dM73766m9, jofVar2.m63457fa()) * tbpVarClone2.f49090k4), tbpVarArrM6755k4[i].f49091x1 - (C14116yg.m67491kk(dM73766m9, jofVar2.m63457fa()) * tbpVarClone2.f49091x1));
        if (m6414dy().m63104jd()) {
            bayVar.m4074dy().m74244k4((byte) 5);
        }
        if (m6414dy().m63100ck()) {
            bayVar.m4074dy().m74281x1((byte) 5);
        }
        C1150gl.m6753k4(bayVar.m4074dy().m74280x1(), new tbp(jofVarClone.m63460k4(), jofVarClone.m63473x1()), tbpVarArrM6755k4);
        return C1150gl.m6750k4(tbpVarArrM6755k4);
    }

    /* JADX INFO: renamed from: k4 */
    private jof m6421k4(bay bayVar, z2c z2cVar, z2c z2cVar2) {
        jof jofVar = new jof(0.0d, 0.0d, Double.MAX_VALUE, Double.MAX_VALUE);
        for (int i : m6414dy().m63103h4()) {
            for (int i2 : m6414dy().m63106m9()) {
                jof jofVarClone = m6422k4(bayVar, z2cVar, z2cVar2, i, i2).Clone();
                if (jofVarClone.m63457fa() < jofVar.m63457fa()) {
                    jofVarClone.CloneTo(jofVar);
                }
            }
        }
        return jofVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x014b, code lost:
    
        r3.CloneTo(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0188, code lost:
    
        r3.CloneTo(r0);
     */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private jof m6422k4(bay bayVar, z2c z2cVar, z2c z2cVar2, int i, int i2) {
        if (i != 10 || i2 != 10) {
            tbp tbpVarClone = m6423k4(bayVar, z2cVar, i, z2cVar2.m74235e0().m63454ck().Clone()).Clone();
            tbp tbpVarClone2 = m6423k4(bayVar, z2cVar, i, m6423k4(bayVar, z2cVar2, i2, z2cVar.m74235e0().m63454ck().Clone()).Clone().Clone()).Clone();
            tbp tbpVarClone3 = m6423k4(bayVar, z2cVar2, i2, tbpVarClone.Clone()).Clone();
            return new jof(tbpVarClone2.f49090k4, tbpVarClone2.f49091x1, tbpVarClone3.f49090k4, tbpVarClone3.f49091x1);
        }
        z2c z2cVarM4074dy = m6415jd(z2cVar.m74243k4()).m4074dy();
        jof jofVarClone = z2cVarM4074dy.m74235e0().Clone();
        tbp tbpVarClone4 = m6424k4(z2cVarM4074dy).Clone();
        double dM4072du = bayVar.m4112x1(12) ? bayVar.m4072du(12) : jofVarClone.m63457fa();
        jof jofVarClone2 = z2cVar.m74235e0().Clone();
        jof jofVarClone3 = z2cVar2.m74235e0().Clone();
        double dM63472up = new jof(tbpVarClone4.Clone(), jofVarClone2.m63454ck().Clone()).m63472up();
        double dM63472up2 = new jof(tbpVarClone4.Clone(), jofVarClone3.m63454ck().Clone()).m63472up() - dM63472up;
        if (dM63472up2 < 0.0d) {
            dM63472up2 += 360.0d;
        }
        double d = 360.0d - dM63472up;
        double d2 = dM63472up2 % 360.0d;
        double dM67475k4 = C14116yg.m67475k4(dM4072du) / 2.0d;
        List<tbp> listM6416k4 = m6416k4(tbpVarClone4.Clone(), dM67475k4, jofVarClone2.Clone());
        List<tbp> listM6416k42 = m6416k4(tbpVarClone4.Clone(), dM67475k4, jofVarClone3.Clone());
        tbp tbpVarClone5 = m6423k4(bayVar, z2cVar, 4, jofVarClone3.m63454ck().Clone()).Clone();
        tbp tbpVarClone6 = m6423k4(bayVar, z2cVar2, 4, jofVarClone2.m63454ck().Clone()).Clone();
        if (z2cVar.m74243k4().m5147up().m71873kk().m28384u4() == 0 && z2cVar.m74243k4().m5147up().m71873kk().m28363ix() == 0 && z2cVar2.m74243k4().m5147up().m71873kk().m28384u4() == 0 && z2cVar2.m74243k4().m5147up().m71873kk().m28363ix() == 0) {
            List.Enumerator<tbp> it = listM6416k4.iterator();
            while (true) {
                try {
                    if (!it.hasNext()) {
                        break;
                    }
                    tbp next = it.next();
                    double dM63472up3 = (new jof(tbpVarClone4.Clone(), next.Clone()).m63472up() + d) % 360.0d;
                    if (d2 - dM63472up3 > -9.999999747378752E-6d && dM63472up3 >= -9.999999747378752E-6d) {
                        break;
                    }
                } finally {
                }
            }
            if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                it.dispose();
            }
            it = listM6416k42.iterator();
            while (true) {
                try {
                    if (!it.hasNext()) {
                        break;
                    }
                    tbp next2 = it.next();
                    double dM63472up4 = (new jof(tbpVarClone4.Clone(), next2.Clone()).m63472up() + d) % 360.0d;
                    if (d2 - dM63472up4 > -9.999999747378752E-6d && dM63472up4 >= -9.999999747378752E-6d) {
                        break;
                    }
                } finally {
                }
            }
            if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                it.dispose();
            }
        }
        return new jof(tbpVarClone5.f49090k4, tbpVarClone5.f49091x1, tbpVarClone6.f49090k4, tbpVarClone6.f49091x1);
    }

    /* JADX INFO: renamed from: k4 */
    private tbp m6423k4(bay bayVar, z2c z2cVar, int i, tbp tbpVar) {
        jof jofVarClone = z2cVar.m74235e0().Clone();
        switch (i) {
            case 0:
                return (z2cVar.m74280x1() == null || z2cVar.m74280x1().getShapeType() != 35) ? yz6.m74163k4(jofVarClone.Clone(), tbpVar.Clone()) : yz6.m74179x1(jofVarClone.Clone(), tbpVar.Clone());
            case 1:
                return new tbp(jofVarClone.m63454ck().f49090k4, jofVarClone.m63470to());
            case 2:
                return new tbp(jofVarClone.m63460k4(), jofVarClone.m63470to());
            case 3:
                return new tbp(jofVarClone.m63464kk(), jofVarClone.m63470to());
            case 4:
                return jofVarClone.m63454ck();
            case 5:
                return new tbp(jofVarClone.m63460k4(), jofVarClone.m63454ck().f49091x1);
            case 6:
                return new tbp(jofVarClone.m63464kk(), jofVarClone.m63454ck().f49091x1);
            case 7:
                return new tbp(jofVarClone.m63454ck().f49090k4, jofVarClone.m63473x1());
            case 8:
                return new tbp(jofVarClone.m63460k4(), jofVarClone.m63473x1());
            case 9:
                return new tbp(jofVarClone.m63464kk(), jofVarClone.m63473x1());
            default:
                return tbp.f49088kk;
        }
    }

    /* JADX INFO: renamed from: k4 */
    private tbp m6424k4(z2c z2cVar) {
        jof jofVarClone = z2cVar.m74235e0().Clone();
        double dM74256kk = z2cVar.m74256kk(6);
        if (dM74256kk == 0.0d) {
            dM74256kk = jofVarClone.m63454ck().f49090k4;
        }
        double dM74256kk2 = z2cVar.m74256kk(7);
        if (dM74256kk2 == 0.0d) {
            dM74256kk2 = jofVarClone.m63454ck().f49091x1;
        }
        return new tbp(dM74256kk, dM74256kk2);
    }

    /* JADX INFO: renamed from: k4 */
    private C14838y9 m6425k4(bay bayVar, jof jofVar) {
        double dM4072du;
        C14838y9 c14838y9 = new C14838y9(jofVar.Clone());
        double dM4072du2 = bayVar.m4112x1(3) ? bayVar.m4072du(3) : jofVar.m63457fa() * 0.22d;
        double dM4072du3 = bayVar.m4112x1(14) ? bayVar.m4072du(14) : jofVar.m63457fa() * 0.25d;
        c14838y9.m73761k4(bayVar.m4112x1(31) ? bayVar.m4072du(31) / 2.0d : bayVar.m4072du(15) * 0.3d);
        bayVar.m4095kk(31, c14838y9.m73764kk());
        m3652to(bayVar);
        if (bayVar.m4112x1(16)) {
            c14838y9.m73769x1(C14116yg.m67502x1(c14838y9.m73764kk(), bayVar.m4072du(16) / 2.0d));
            if (m6414dy().m63102dy() == 3) {
                c14838y9.m73769x1((c14838y9.m73767to() - c14838y9.m73764kk()) + c14838y9.m73767to());
            }
        } else {
            c14838y9.m73769x1(C14116yg.m67502x1(c14838y9.m73764kk(), bayVar.m4072du(15) * (m6414dy().m63102dy() == 0 ? 0.5d : 0.75d)));
        }
        if (bayVar.m4112x1(62)) {
            dM4072du = bayVar.m4072du(62);
        } else {
            double dM67502x1 = C14116yg.m67502x1(0.0d, (bayVar.m4072du(7) - dM4072du2) - dM4072du3);
            double dM4072du4 = bayVar.m4072du(15);
            if (m6414dy().m63102dy() != 3) {
                dM4072du4 = C14116yg.m67491kk(dM67502x1, dM4072du4);
            }
            if (dM4072du4 != 0.0d) {
                dM67502x1 = dM4072du4;
            }
            dM4072du = dM67502x1 * 0.5d;
        }
        c14838y9.m73765kk(dM4072du);
        c14838y9.m73762k4(m6414dy().m63104jd());
        c14838y9.m73770x1(m6414dy().m63100ck());
        c14838y9.m73768to(dM4072du2);
        c14838y9.m73757du(dM4072du3);
        return c14838y9;
    }

    /* JADX INFO: renamed from: k4 */
    private static void m6426k4(bay bayVar, C13659it c13659it, z2c[] z2cVarArr, z2c[] z2cVarArr2) {
        bay bayVarM6417k4;
        bay bayVarM6427x1;
        z2cVarArr[0] = null;
        z2cVarArr2[0] = null;
        String strM63105kk = c13659it.m63105kk();
        if (!C14113y2.m67411k4(strM63105kk) && (bayVarM6427x1 = m6427x1(bayVar, strM63105kk)) != null) {
            z2cVarArr[0] = bayVarM6427x1.m4074dy();
        }
        if (z2cVarArr[0] == null && bayVar.m4073du().m5149yj() == 5) {
            if (bayVar.m4073du().mo5141fa().m5149yj() == 3) {
                z2cVarArr[0] = bayVar.m4069c5().m4074dy();
            } else {
                z2cVarArr[0] = bayVar.m4069c5().m4083k4(bayVar.m4073du().mo5141fa().m5144ks()).m4074dy();
            }
        }
        if (z2cVarArr[0] == null) {
            C14244on c14244onM68720c5 = bayVar.m4073du().m68720c5();
            bay bayVarM4094kk = bayVar.m4094kk();
            if (bayVarM4094kk == null && bayVar.m4082k4() != null) {
                bayVarM4094kk = bayVar.m4082k4().m4110x1().get_Item(bayVar.m4082k4().m4110x1().size() - 1);
            }
            while (true) {
                if (bayVarM4094kk != null && bayVarM4094kk != bayVar) {
                    if (bayVarM4094kk.m4073du() == c14244onM68720c5 && bayVarM4094kk.m4076h4().size() > 0) {
                        z2cVarArr[0] = bayVarM4094kk.m4074dy();
                        break;
                    }
                    bayVarM4094kk = bayVarM4094kk.m4094kk();
                    if (bayVarM4094kk == null && bayVar.m4082k4() != null) {
                        bayVarM4094kk = bayVar.m4082k4().m4110x1().get_Item(bayVar.m4082k4().m4110x1().size() - 1);
                    }
                } else {
                    break;
                }
            }
        }
        String strM63107to = c13659it.m63107to();
        if (!C14113y2.m67411k4(strM63107to) && (bayVarM6417k4 = m6417k4(bayVar, strM63107to)) != null) {
            z2cVarArr2[0] = bayVarM6417k4.m4074dy();
        }
        if (z2cVarArr2[0] == null) {
            bay bayVarM4102to = bayVar.m4102to();
            if (bayVarM4102to == null && bayVar.m4082k4() != null) {
                bayVarM4102to = bayVar.m4082k4().m4110x1().get_Item(0);
            }
            while (bayVarM4102to != null && bayVarM4102to != bayVar) {
                bay bayVarM6413c5 = m6413c5(bayVarM4102to);
                if (bayVarM6413c5 != null) {
                    z2cVarArr2[0] = bayVarM6413c5.m4074dy();
                    return;
                }
                bayVarM4102to = bayVarM4102to.m4102to();
                if (bayVarM4102to == null && bayVar.m4082k4() != null) {
                    bayVarM4102to = bayVar.m4082k4().m4110x1().get_Item(0);
                }
            }
        }
    }

    @Override // com.aspose.slides.AbstractC0753ak
    /* JADX INFO: renamed from: k4 */
    public boolean mo3646k4(bay bayVar) {
        bayVar.m4074dy().m74259kk(bayVar.m4072du(61));
        bayVar.m4074dy().m74239h4(bayVar.m4072du(15));
        return true;
    }
}
