package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerable;
import com.aspose.slides.Collections.Generic.IGenericList;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.C14044b3;
import com.aspose.slides.p559ms.System.C14046bv;
import com.aspose.slides.p559ms.System.C14051ck;
import com.aspose.slides.p559ms.System.C14057f9;
import com.aspose.slides.p559ms.System.C14080ne;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.IDisposable;
import com.huawei.hms.network.embedded.C18241k5;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
class a9h implements InterfaceC1124fx {

    /* JADX INFO: renamed from: c5 */
    private int f3854c5;

    /* JADX INFO: renamed from: ck */
    private boolean f3855ck;

    /* JADX INFO: renamed from: du */
    List<InterfaceC1124fx> f3856du;

    /* JADX INFO: renamed from: dy */
    private InterfaceC14836y7 f3857dy;

    /* JADX INFO: renamed from: fa */
    private boolean f3858fa;

    /* JADX INFO: renamed from: h4 */
    com.aspose.slides.internal.p332p7.qy7 f3859h4;

    /* JADX INFO: renamed from: jd */
    private int f3860jd;

    /* JADX INFO: renamed from: k4 */
    Object f3861k4;

    /* JADX INFO: renamed from: kk */
    String f3862kk;

    /* JADX INFO: renamed from: m9 */
    boolean f3863m9;

    /* JADX INFO: renamed from: to */
    InterfaceC1124fx f3864to;

    /* JADX INFO: renamed from: up */
    private Double f3865up;

    /* JADX INFO: renamed from: x1 */
    byte f3866x1;

    /* JADX INFO: renamed from: yj */
    private int f3867yj;

    public a9h(InterfaceC14836y7 interfaceC14836y7) {
        m3420k4(interfaceC14836y7);
        this.f3866x1 = (byte) 1;
    }

    /* JADX INFO: renamed from: ar */
    private void m3417ar() {
        Double d = this.f3865up;
        if (d == null) {
            m3440k4((Object) null);
        } else if (this.f3866x1 == 0) {
            this.f3861k4 = Boolean.valueOf(d.doubleValue() != 0.0d);
        } else {
            this.f3861k4 = d;
        }
    }

    /* JADX INFO: renamed from: bv */
    private void m3418bv() {
        String strMo3437k4 = this.f3864to.mo3437k4(1);
        if (m3432fa() == 1) {
            m3421k4(strMo3437k4);
        } else {
            m3421k4(m3419k4(strMo3437k4, 1, new IGenericList[]{null}).mo3872k4(mo3428c5()));
        }
    }

    /* JADX INFO: renamed from: k4 */
    private InterfaceC0782az m3419k4(String str, int i, IGenericList<InterfaceC0761as>[] iGenericListArr) {
        List list = new List();
        list.addRange(i == 0 ? tst.m71299kk() : tst.m71301x1());
        list.addRange(tst.m71300to());
        list.addRange(tst.m71298k4());
        C14699vr c14699vr = new C14699vr(new C1219hp(list, str), mo3452x1(), mo3443kk(), i, mo3436k4().mo5429x1());
        InterfaceC0782az interfaceC0782azM72507kk = c14699vr.m72507kk();
        if (interfaceC0782azM72507kk == null) {
            throw new CellInvalidFormulaException(c14699vr.m72506k4(), mo3438k4(0, true));
        }
        iGenericListArr[0] = c14699vr.m72508x1();
        return interfaceC0782azM72507kk;
    }

    /* JADX INFO: renamed from: qq */
    private void m3422qq() {
        byte b;
        Object obj = this.f3861k4;
        if (obj == null) {
            this.f3866x1 = (byte) 1;
            return;
        }
        if (C7019kk.m27469x1(obj, String.class)) {
            b = C14386rf.m70084k4().containsItem((String) this.f3861k4) ? (byte) 2 : (byte) 3;
        } else {
            if (!C7019kk.m27469x1(this.f3861k4, Boolean.class)) {
                this.f3866x1 = (byte) 1;
                return;
            }
            b = 0;
        }
        this.f3866x1 = b;
    }

    /* JADX INFO: renamed from: u4 */
    private void m3423u4() {
        this.f3861k4 = null;
        this.f3865up = null;
        this.f3866x1 = (byte) 1;
    }

    /* JADX INFO: renamed from: um */
    private void m3424um() {
        Double d;
        if (this.f3861k4 == null) {
            d = new Double(0.0d);
        } else {
            this.f3865up = null;
            byte bMo3431dy = mo3431dy();
            if (bMo3431dy == 0) {
                d = new Double(((Boolean) this.f3861k4).booleanValue() ? 1.0d : 0.0d);
            } else if (bMo3431dy == 1) {
                d = new Double(C14080ne.m66903fa(this.f3861k4));
            } else if (bMo3431dy != 3 && bMo3431dy != 4 && bMo3431dy != 5) {
                return;
            } else {
                d = sk2.m70655k4((String) this.f3861k4, mo3436k4().mo5425k4());
            }
        }
        this.f3865up = d;
    }

    /* JADX INFO: renamed from: uz */
    private void m3425uz() {
        boolean zM67411k4 = C14113y2.m67411k4(m3455x6());
        InterfaceC1124fx interfaceC1124fx = this.f3864to;
        if (interfaceC1124fx != null) {
            interfaceC1124fx.mo3439k4(this);
            this.f3864to = null;
        } else if (m3456yj()) {
            this.f3856du.get_Item(0).mo3435jd();
            this.f3856du = null;
        }
        this.f3862kk = null;
        this.f3859h4 = null;
        if (zM67411k4) {
            return;
        }
        mo3436k4().mo5425k4().mo5386kk().mo67820k4(mo3436k4().mo5429x1(), mo3428c5());
    }

    /* JADX INFO: renamed from: v4 */
    private void m3426v4() {
        String message;
        int iM67728x1;
        if (this.f3858fa || C14113y2.m67411k4(m3455x6())) {
            return;
        }
        m3423u4();
        byte bMo3431dy = 1;
        this.f3855ck = true;
        IGenericList<InterfaceC0761as>[] iGenericListArr = {null};
        InterfaceC0782az interfaceC0782azM3419k4 = m3419k4(m3455x6(), m3432fa(), iGenericListArr);
        IGenericList<InterfaceC0761as> iGenericList = iGenericListArr[0];
        if (iGenericList != null && iGenericList.size() > 0) {
            mo3436k4().mo5425k4().mo5386kk().mo67821k4(mo3436k4().mo5429x1(), mo3428c5(), iGenericList);
            mo3436k4().mo5425k4().mo5386kk().mo67822kk(mo3436k4().mo5429x1(), mo3428c5());
        }
        mtk mtkVar = new mtk(0.0d);
        try {
            interfaceC0782azM3419k4.mo3871k4(new C1095fc(this)).CloneTo(mtkVar);
            if (mtkVar.m67728x1() != 3) {
                this.f3861k4 = mtkVar.m67722k4();
                this.f3858fa = true;
            }
            iM67728x1 = mtkVar.m67728x1();
        } catch (mdp e) {
            message = e.getMessage();
        }
        if (iM67728x1 == 0) {
            this.f3866x1 = (byte) 0;
        } else if (iM67728x1 == 1) {
            this.f3866x1 = bMo3431dy;
        } else {
            if (iM67728x1 == 2) {
                bMo3431dy = 4;
            } else if (iM67728x1 == 3) {
                C0909dp c0909dpMo3723x1 = ((InterfaceC0761as) mtkVar.m67722k4()).mo3723x1(mo3428c5());
                if (c0909dpMo3723x1 == null) {
                    message = "#VALUE!";
                    this.f3861k4 = message;
                    this.f3866x1 = (byte) 2;
                } else {
                    InterfaceC1124fx interfaceC1124fxMo5426k4 = mo3436k4().mo5425k4().mo5384k4(c0909dpMo3723x1.mo3720k4()).mo5426k4(c0909dpMo3723x1.m5204x1().m4031x1(), c0909dpMo3723x1.m5202kk().m5607x1());
                    this.f3861k4 = interfaceC1124fxMo5426k4.mo3449to() == null ? 0 : interfaceC1124fxMo5426k4.mo3449to();
                    bMo3431dy = interfaceC1124fxMo5426k4.mo3431dy();
                }
            }
            this.f3866x1 = bMo3431dy;
        }
        this.f3855ck = false;
    }

    /* JADX INFO: renamed from: wl */
    private void m3427wl() {
        if (this.f3859h4 != null) {
            throw new CellUnsupportedDataException(C14113y2.m67402k4("The cell {0} contains an unsupported formula.", mo3438k4(m3432fa(), true)));
        }
    }

    @Override // com.aspose.slides.InterfaceC1124fx
    /* JADX INFO: renamed from: c5 */
    public final C0909dp mo3428c5() {
        return new C0909dp(mo3452x1(), mo3443kk(), mo3436k4().mo5429x1());
    }

    @Override // com.aspose.slides.InterfaceC1124fx
    /* JADX INFO: renamed from: ck */
    public final IGenericEnumerable<InterfaceC1124fx> mo3429ck() {
        return this.f3856du;
    }

    @Override // com.aspose.slides.InterfaceC1124fx
    /* JADX INFO: renamed from: du */
    public final Boolean mo3430du() {
        if (this.f3855ck) {
            throw new CellCircularReferenceException("", mo3438k4(0, true));
        }
        if (mo3449to() == null) {
            return Boolean.FALSE;
        }
        byte bMo3431dy = mo3431dy();
        if (bMo3431dy == 0) {
            return (Boolean) mo3449to();
        }
        if (bMo3431dy == 1) {
            return new Boolean(((Double) C7019kk.m27464to(mo3449to(), Double.TYPE)).doubleValue() != 0.0d);
        }
        if (bMo3431dy != 3 && bMo3431dy != 4 && bMo3431dy != 5) {
            return null;
        }
        boolean[] zArr = {false};
        boolean zM66556k4 = C14051ck.m66556k4((String) mo3449to(), zArr);
        boolean z = zArr[0];
        if (zM66556k4) {
            return Boolean.valueOf(z);
        }
        return null;
    }

    @Override // com.aspose.slides.InterfaceC1124fx
    /* JADX INFO: renamed from: dy */
    public final byte mo3431dy() {
        if (this.f3855ck) {
            throw new CellCircularReferenceException("", mo3438k4(0, true));
        }
        if (!this.f3858fa) {
            m3426v4();
        }
        if (this.f3861k4 == null && this.f3865up == null) {
            m3427wl();
        }
        return this.f3866x1;
    }

    /* JADX INFO: renamed from: fa */
    public final int m3432fa() {
        return this.f3867yj;
    }

    @Override // com.aspose.slides.InterfaceC1124fx
    /* JADX INFO: renamed from: h4 */
    public final Double mo3433h4() {
        if (this.f3855ck) {
            throw new CellCircularReferenceException("", mo3438k4(0, true));
        }
        if (!this.f3858fa) {
            m3426v4();
        }
        Double d = this.f3865up;
        if (d != null) {
            return d;
        }
        if (this.f3861k4 != null) {
            m3424um();
            return this.f3865up;
        }
        if (d == null) {
            m3424um();
        }
        return this.f3865up;
    }

    /* JADX INFO: renamed from: ix */
    public final void m3434ix() {
        this.f3858fa = false;
    }

    @Override // com.aspose.slides.InterfaceC1124fx
    /* JADX INFO: renamed from: jd */
    public final void mo3435jd() {
        m3421k4(this.f3864to.mo3437k4(1));
        this.f3867yj = 1;
        List<InterfaceC1124fx> list = new List<>(this.f3864to.mo3429ck());
        this.f3856du = list;
        this.f3864to = null;
        list.removeItem(this);
        List.Enumerator<InterfaceC1124fx> it = this.f3856du.iterator();
        while (it.hasNext()) {
            try {
                it.next().mo3454x1(this);
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        if (this.f3856du.size() == 0) {
            this.f3856du = null;
        }
    }

    @Override // com.aspose.slides.InterfaceC1124fx
    /* JADX INFO: renamed from: kk */
    public final int mo3443kk() {
        return this.f3860jd;
    }

    /* JADX INFO: renamed from: ks */
    public final boolean m3445ks() {
        return this.f3864to != null || m3456yj();
    }

    @Override // com.aspose.slides.InterfaceC1124fx
    /* JADX INFO: renamed from: m9 */
    public final String mo3446m9() {
        if (this.f3855ck) {
            throw new CellCircularReferenceException("", mo3438k4(0, true));
        }
        if (!this.f3858fa) {
            m3426v4();
        }
        if (mo3449to() == null) {
            return "";
        }
        byte bMo3431dy = mo3431dy();
        if (bMo3431dy == 0) {
            return C14113y2.m67358c5(mo3449to().toString());
        }
        if (bMo3431dy == 1) {
            Object objMo3449to = mo3449to();
            return objMo3449to instanceof C14046bv ? objMo3449to.toString() : C14044b3.m66425h4(((Number) objMo3449to).doubleValue());
        }
        if (bMo3431dy == 3 || bMo3431dy == 4 || bMo3431dy == 5) {
            return (String) mo3449to();
        }
        return null;
    }

    /* JADX INFO: renamed from: ne */
    public final void m3447ne() {
        m3442k4(true, true);
        mo3436k4().mo5425k4().mo5386kk().mo67823x1(mo3436k4().mo5429x1(), mo3428c5());
    }

    /* JADX INFO: renamed from: rv */
    public final String m3448rv() {
        if (!m3456yj()) {
            return null;
        }
        int iMo3452x1 = mo3452x1();
        int iMo3452x12 = mo3452x1();
        int iMo3443kk = mo3443kk();
        int iMo3443kk2 = mo3443kk();
        List.Enumerator<InterfaceC1124fx> it = this.f3856du.iterator();
        while (it.hasNext()) {
            try {
                InterfaceC1124fx next = it.next();
                if (next.mo3452x1() < iMo3452x1) {
                    iMo3452x1 = next.mo3452x1();
                } else if (next.mo3452x1() > iMo3452x12) {
                    iMo3452x12 = next.mo3452x1();
                }
                if (next.mo3443kk() < iMo3443kk) {
                    iMo3443kk = next.mo3443kk();
                } else if (next.mo3443kk() > iMo3443kk2) {
                    iMo3443kk2 = next.mo3443kk();
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
        return C14113y2.m67408k4(C14113y2.m67408k4(C13712k4.m63643k4(iMo3443kk), C14057f9.m66591x1(iMo3452x1)), C18241k5.f55433h, C14113y2.m67408k4(C13712k4.m63643k4(iMo3443kk2), C14057f9.m66591x1(iMo3452x12)));
    }

    @Override // com.aspose.slides.InterfaceC1124fx
    /* JADX INFO: renamed from: to */
    public final Object mo3449to() {
        if (mo3436k4().mo5425k4().mo5385k4()) {
            if (this.f3855ck) {
                throw new CellCircularReferenceException("", mo3438k4(0, true));
            }
            m3426v4();
        }
        Object obj = this.f3861k4;
        if (obj != null) {
            return obj;
        }
        if (this.f3865up != null) {
            m3417ar();
            return this.f3861k4;
        }
        if (obj == null) {
            m3417ar();
        }
        return this.f3861k4;
    }

    /* JADX INFO: renamed from: up */
    public final boolean m3451up() {
        return this.f3861k4 == null && this.f3865up == null && C14113y2.m67411k4(this.f3862kk) && this.f3864to == null && this.f3859h4 == null;
    }

    @Override // com.aspose.slides.InterfaceC1124fx
    /* JADX INFO: renamed from: x1 */
    public final int mo3452x1() {
        return this.f3854c5;
    }

    /* JADX INFO: renamed from: x6 */
    public final String m3455x6() {
        com.aspose.slides.internal.p332p7.qy7 qy7Var = this.f3859h4;
        if (qy7Var != null) {
            return qy7Var.m39779du();
        }
        if (C14113y2.m67411k4(this.f3862kk) && this.f3864to != null) {
            m3418bv();
        }
        return this.f3862kk;
    }

    /* JADX INFO: renamed from: yj */
    public final boolean m3456yj() {
        List<InterfaceC1124fx> list = this.f3856du;
        return list != null && list.size() > 0;
    }

    @Override // com.aspose.slides.InterfaceC1124fx
    /* JADX INFO: renamed from: k4 */
    public final InterfaceC14836y7 mo3436k4() {
        return this.f3857dy;
    }

    /* JADX INFO: renamed from: kk */
    public final void m3444kk(int i) {
        this.f3860jd = i;
    }

    /* JADX INFO: renamed from: to */
    public final void m3450to(int i) {
        this.f3867yj = i;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m3453x1(int i) {
        this.f3854c5 = i;
    }

    @Override // com.aspose.slides.InterfaceC1124fx
    /* JADX INFO: renamed from: k4 */
    public final String mo3437k4(int i) {
        if (m3432fa() == i) {
            return m3455x6();
        }
        if (C14113y2.m67411k4(m3455x6())) {
            return null;
        }
        InterfaceC0782az interfaceC0782azM3419k4 = m3419k4(m3455x6(), m3432fa(), new IGenericList[]{null});
        return i == 0 ? interfaceC0782azM3419k4.mo3872k4(mo3428c5()) : interfaceC0782azM3419k4.toString();
    }

    @Override // com.aspose.slides.InterfaceC1124fx
    /* JADX INFO: renamed from: x1 */
    public final void mo3454x1(InterfaceC1124fx interfaceC1124fx) {
        this.f3864to = interfaceC1124fx;
        m3447ne();
    }

    @Override // com.aspose.slides.InterfaceC1124fx
    /* JADX INFO: renamed from: k4 */
    public final String mo3438k4(int i, boolean z) {
        String strM67408k4 = i == 0 ? C14113y2.m67408k4(C13712k4.m63643k4(mo3443kk()), C14057f9.m66591x1(mo3452x1())) : C14113y2.m67402k4("R{0}C{1}", Integer.valueOf(mo3452x1()), Integer.valueOf(mo3443kk()));
        return z ? C14113y2.m67402k4("'{0}'!{1}", mo3436k4().mo5429x1(), strM67408k4) : strM67408k4;
    }

    @Override // com.aspose.slides.InterfaceC1124fx
    /* JADX INFO: renamed from: k4 */
    public final void mo3439k4(InterfaceC1124fx interfaceC1124fx) {
        List<InterfaceC1124fx> list = this.f3856du;
        if (list == null) {
            return;
        }
        list.removeItem(interfaceC1124fx);
    }

    /* JADX INFO: renamed from: k4 */
    private void m3420k4(InterfaceC14836y7 interfaceC14836y7) {
        this.f3857dy = interfaceC14836y7;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m3440k4(Object obj) {
        if (this.f3861k4 == obj) {
            return;
        }
        m3423u4();
        this.f3861k4 = obj;
        m3422qq();
        mo3436k4().mo5425k4().mo5386kk().mo67823x1(mo3436k4().mo5429x1(), mo3428c5());
    }

    /* JADX INFO: renamed from: k4 */
    private void m3421k4(String str) {
        if (C14113y2.m67363du(this.f3862kk, str)) {
            return;
        }
        this.f3862kk = str;
        m3447ne();
    }

    /* JADX INFO: renamed from: k4 */
    public final void m3441k4(String str, int i) {
        if (str != null) {
            str = C14113y2.m67440x1(str);
        }
        if (m3432fa() == i && C14113y2.m67363du(this.f3862kk, str)) {
            return;
        }
        m3425uz();
        this.f3867yj = i;
        m3421k4(str);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m3442k4(boolean z, boolean z2) {
        if (z2) {
            this.f3858fa = false;
        }
        m3427wl();
        if (z) {
            m3426v4();
        }
    }
}
