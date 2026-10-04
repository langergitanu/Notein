package com.aspose.slides;

import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.C14057f9;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.C14116yg;
import com.huawei.hms.network.embedded.C18241k5;

/* JADX INFO: loaded from: classes3.dex */
class xdd implements InterfaceC0761as {

    /* JADX INFO: renamed from: k4 */
    private String f50058k4;

    /* JADX INFO: renamed from: kk */
    private final InterfaceC0761as f50059kk;

    /* JADX INFO: renamed from: x1 */
    private final InterfaceC0761as f50060x1;

    public xdd(InterfaceC0761as interfaceC0761as, InterfaceC0761as interfaceC0761as2) {
        this.f50060x1 = interfaceC0761as;
        this.f50059kk = interfaceC0761as2;
    }

    @Override // com.aspose.slides.InterfaceC0761as
    /* JADX INFO: renamed from: du */
    public final String mo3717du(C0909dp c0909dp) {
        if (C7019kk.m27469x1(m73330x1(), C0909dp.class) && C7019kk.m27469x1(m73329kk(), C0909dp.class)) {
            return m73327x1((C0909dp) m73330x1(), (C0909dp) m73329kk(), c0909dp);
        }
        if (C7019kk.m27469x1(m73330x1(), b6d.class) && C7019kk.m27469x1(m73329kk(), b6d.class)) {
            return m73326x1((b6d) m73330x1(), (b6d) m73329kk(), c0909dp);
        }
        if (C7019kk.m27469x1(m73330x1(), C0958eo.class) && C7019kk.m27469x1(m73329kk(), C0958eo.class)) {
            return m73328x1((C0958eo) m73330x1(), (C0958eo) m73329kk(), c0909dp);
        }
        throw new CellInvalidReferenceException("The cell range reference is not supported for A1-style.", toString());
    }

    @Override // com.aspose.slides.InterfaceC0761as
    /* JADX INFO: renamed from: k4 */
    public final InterfaceC0761as mo3718k4(C0909dp c0909dp) {
        return new xdd(m73330x1().mo3718k4(c0909dp), m73329kk().mo3718k4(c0909dp), c0909dp.mo3720k4());
    }

    /* JADX INFO: renamed from: kk */
    public final InterfaceC0761as m73329kk() {
        return this.f50059kk;
    }

    @Override // com.aspose.slides.InterfaceC0761as
    /* JADX INFO: renamed from: to */
    public final boolean mo3722to() {
        return m73330x1().mo3722to() && m73329kk().mo3722to();
    }

    public String toString() {
        return C14113y2.m67402k4("{0}:{1}", m73330x1(), m73329kk());
    }

    /* JADX INFO: renamed from: x1 */
    public final InterfaceC0761as m73330x1() {
        return this.f50060x1;
    }

    public xdd(InterfaceC0761as interfaceC0761as, InterfaceC0761as interfaceC0761as2, String str) {
        this(interfaceC0761as, interfaceC0761as2);
        this.f50058k4 = str;
    }

    @Override // com.aspose.slides.InterfaceC0761as
    /* JADX INFO: renamed from: k4 */
    public final InterfaceC14885zh mo3719k4(InterfaceC14249or interfaceC14249or) {
        return interfaceC14249or.mo68756k4(this);
    }

    @Override // com.aspose.slides.InterfaceC0761as
    /* JADX INFO: renamed from: kk */
    public final boolean mo3721kk(C0909dp c0909dp) {
        if (C7019kk.m27469x1(m73330x1(), C0909dp.class) && C7019kk.m27469x1(m73329kk(), C0909dp.class)) {
            return m73324k4((C0909dp) m73330x1(), (C0909dp) m73329kk(), c0909dp);
        }
        if (C7019kk.m27469x1(m73330x1(), b6d.class) && C7019kk.m27469x1(m73329kk(), b6d.class)) {
            return m73323k4((b6d) m73330x1(), (b6d) m73329kk(), c0909dp);
        }
        if (C7019kk.m27469x1(m73330x1(), C0958eo.class) && C7019kk.m27469x1(m73329kk(), C0958eo.class)) {
            return m73325k4((C0958eo) m73330x1(), (C0958eo) m73329kk(), c0909dp);
        }
        throw new CellInvalidReferenceException("The cell range reference is not supported for cell projections.", toString());
    }

    @Override // com.aspose.slides.InterfaceC0761as
    /* JADX INFO: renamed from: x1 */
    public final C0909dp mo3723x1(C0909dp c0909dp) {
        if (!C7019kk.m27469x1(m73330x1(), C0909dp.class) || !C7019kk.m27469x1(m73329kk(), C0909dp.class)) {
            return null;
        }
        C0909dp c0909dp2 = (C0909dp) m73330x1();
        C0909dp c0909dp3 = (C0909dp) m73329kk();
        int iM4031x1 = c0909dp2.m5204x1().m4031x1();
        int iM5607x1 = c0909dp2.m5202kk().m5607x1();
        int iM4031x12 = c0909dp3.m5204x1().m4031x1();
        int iM5607x12 = c0909dp3.m5202kk().m5607x1();
        if (iM4031x1 == iM4031x12) {
            int iM67507x1 = C14116yg.m67507x1(iM5607x1, iM5607x12);
            int iM67483k4 = C14116yg.m67483k4(iM5607x1, iM5607x12);
            int iM5607x13 = c0909dp.m5202kk().m5607x1();
            if (iM5607x13 < iM67507x1 || iM5607x13 > iM67483k4) {
                return null;
            }
            return new C0909dp(iM4031x1, iM5607x13, c0909dp.mo3720k4());
        }
        if (iM5607x1 != iM5607x12) {
            return null;
        }
        int iM67507x12 = C14116yg.m67507x1(iM4031x1, iM4031x12);
        int iM67483k42 = C14116yg.m67483k4(iM4031x1, iM4031x12);
        int iM4031x13 = c0909dp.m5204x1().m4031x1();
        if (iM4031x13 < iM67507x12 || iM4031x13 > iM67483k42) {
            return null;
        }
        return new C0909dp(iM4031x13, iM5607x1, mo3720k4());
    }

    /* JADX INFO: renamed from: x1 */
    private String m73326x1(b6d b6dVar, b6d b6dVar2, C0909dp c0909dp) {
        boolean zMo3722to = b6dVar.mo3722to();
        int iM4031x1 = b6dVar.m4031x1();
        String strM67408k4 = zMo3722to ? C14113y2.m67408k4("$", C14057f9.m66591x1(iM4031x1)) : C14057f9.m66591x1(iM4031x1 + c0909dp.m5204x1().m4031x1());
        boolean zMo3722to2 = b6dVar2.mo3722to();
        int iM4031x12 = b6dVar2.m4031x1();
        return C14113y2.m67408k4(strM67408k4, C18241k5.f55433h, zMo3722to2 ? C14113y2.m67408k4("$", C14057f9.m66591x1(iM4031x12)) : C14057f9.m66591x1(iM4031x12 + c0909dp.m5204x1().m4031x1()));
    }

    @Override // com.aspose.slides.InterfaceC0761as
    /* JADX INFO: renamed from: k4 */
    public final String mo3720k4() {
        return this.f50058k4;
    }

    /* JADX INFO: renamed from: k4 */
    private boolean m73323k4(b6d b6dVar, b6d b6dVar2, C0909dp c0909dp) {
        return c0909dp.m5204x1().m4031x1() >= C14116yg.m67507x1(b6dVar.m4031x1(), b6dVar2.m4031x1()) && c0909dp.m5204x1().m4031x1() <= C14116yg.m67483k4(b6dVar.m4031x1(), b6dVar2.m4031x1());
    }

    /* JADX INFO: renamed from: x1 */
    private String m73327x1(C0909dp c0909dp, C0909dp c0909dp2, C0909dp c0909dp3) {
        return C14113y2.m67408k4(c0909dp.mo3717du(c0909dp3), C18241k5.f55433h, c0909dp2.mo3717du(c0909dp3));
    }

    /* JADX INFO: renamed from: k4 */
    private boolean m73324k4(C0909dp c0909dp, C0909dp c0909dp2, C0909dp c0909dp3) {
        int iM67507x1 = C14116yg.m67507x1(c0909dp.m5204x1().m4031x1(), c0909dp2.m5204x1().m4031x1());
        int iM67483k4 = C14116yg.m67483k4(c0909dp.m5204x1().m4031x1(), c0909dp2.m5204x1().m4031x1());
        int iM67507x12 = C14116yg.m67507x1(c0909dp.m5202kk().m5607x1(), c0909dp2.m5202kk().m5607x1());
        int iM67483k42 = C14116yg.m67483k4(c0909dp.m5202kk().m5607x1(), c0909dp2.m5202kk().m5607x1());
        int iM4031x1 = c0909dp3.m5204x1().m4031x1();
        int iM5607x1 = c0909dp3.m5202kk().m5607x1();
        return iM4031x1 >= iM67507x1 && iM4031x1 <= iM67483k4 && iM5607x1 >= iM67507x12 && iM5607x1 <= iM67483k42;
    }

    /* JADX INFO: renamed from: x1 */
    private String m73328x1(C0958eo c0958eo, C0958eo c0958eo2, C0909dp c0909dp) {
        boolean zMo3722to = c0958eo.mo3722to();
        int iM5607x1 = c0958eo.m5607x1();
        String strM67408k4 = zMo3722to ? C14113y2.m67408k4("$", C13712k4.m63643k4(iM5607x1)) : C13712k4.m63643k4(iM5607x1 + c0909dp.m5202kk().m5607x1());
        boolean zMo3722to2 = c0958eo2.mo3722to();
        int iM5607x12 = c0958eo2.m5607x1();
        return C14113y2.m67408k4(strM67408k4, C18241k5.f55433h, zMo3722to2 ? C14113y2.m67408k4("$", C13712k4.m63643k4(iM5607x12)) : C13712k4.m63643k4(iM5607x12 + c0909dp.m5202kk().m5607x1()));
    }

    /* JADX INFO: renamed from: k4 */
    private boolean m73325k4(C0958eo c0958eo, C0958eo c0958eo2, C0909dp c0909dp) {
        return c0909dp.m5202kk().m5607x1() >= C14116yg.m67507x1(c0958eo.m5607x1(), c0958eo2.m5607x1()) && c0909dp.m5202kk().m5607x1() <= C14116yg.m67483k4(c0958eo.m5607x1(), c0958eo2.m5607x1());
    }
}
