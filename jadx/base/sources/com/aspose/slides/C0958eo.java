package com.aspose.slides;

import com.aspose.slides.p559ms.System.C14057f9;
import com.aspose.slides.p559ms.System.C14113y2;
import com.huawei.hms.network.embedded.C18241k5;

/* JADX INFO: renamed from: com.aspose.slides.eo */
/* JADX INFO: loaded from: classes3.dex */
class C0958eo implements InterfaceC0761as {

    /* JADX INFO: renamed from: k4 */
    private final boolean f4839k4;

    /* JADX INFO: renamed from: kk */
    private final int f4840kk;

    /* JADX INFO: renamed from: x1 */
    private String f4841x1;

    public C0958eo(int i, boolean z) {
        this.f4840kk = i;
        this.f4839k4 = z;
    }

    @Override // com.aspose.slides.InterfaceC0761as
    /* JADX INFO: renamed from: du */
    public final String mo3717du(C0909dp c0909dp) {
        if (mo3722to()) {
            String strM63643k4 = C13712k4.m63643k4(m5607x1());
            return C14113y2.m67408k4("$", strM63643k4, ":$", strM63643k4);
        }
        String strM63643k42 = C13712k4.m63643k4(m5607x1() + c0909dp.m5202kk().m5607x1());
        return C14113y2.m67408k4(strM63643k42, C18241k5.f55433h, strM63643k42);
    }

    @Override // com.aspose.slides.InterfaceC0761as
    /* JADX INFO: renamed from: k4 */
    public final InterfaceC0761as mo3718k4(C0909dp c0909dp) {
        int iM5607x1 = mo3722to() ? m5607x1() : c0909dp.m5202kk().m5607x1() + m5607x1();
        if (iM5607x1 > 0) {
            return new C0958eo(iM5607x1, true, mo3720k4());
        }
        throw new CellInvalidFormulaException("Calculated column number of an absolute reference has invalid value.");
    }

    @Override // com.aspose.slides.InterfaceC0761as
    /* JADX INFO: renamed from: kk */
    public final boolean mo3721kk(C0909dp c0909dp) {
        return m5607x1() == c0909dp.m5202kk().m5607x1();
    }

    @Override // com.aspose.slides.InterfaceC0761as
    /* JADX INFO: renamed from: to */
    public final boolean mo3722to() {
        return this.f4839k4;
    }

    public String toString() {
        return mo3722to() ? C14113y2.m67442x1("C", m5607x1()) : m5607x1() != 0 ? C14113y2.m67400k4("C", C14113y2.m67408k4("[", C14057f9.m66591x1(m5607x1()), "]")) : "C";
    }

    /* JADX INFO: renamed from: x1 */
    public final int m5607x1() {
        return this.f4840kk;
    }

    public C0958eo(int i, boolean z, String str) {
        this(i, z);
        this.f4841x1 = str;
    }

    @Override // com.aspose.slides.InterfaceC0761as
    /* JADX INFO: renamed from: k4 */
    public final InterfaceC14885zh mo3719k4(InterfaceC14249or interfaceC14249or) {
        return interfaceC14249or.mo68755k4(this);
    }

    @Override // com.aspose.slides.InterfaceC0761as
    /* JADX INFO: renamed from: x1 */
    public final C0909dp mo3723x1(C0909dp c0909dp) {
        if (m5607x1() != c0909dp.m5202kk().m5607x1()) {
            return new C0909dp(c0909dp.m5204x1().m4031x1(), m5607x1(), mo3720k4());
        }
        throw new CellCircularReferenceException("", c0909dp.toString());
    }

    @Override // com.aspose.slides.InterfaceC0761as
    /* JADX INFO: renamed from: k4 */
    public final String mo3720k4() {
        return this.f4841x1;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m5606k4(C0958eo c0958eo) {
        return C14113y2.m67363du(mo3720k4(), c0958eo.mo3720k4()) && m5607x1() == c0958eo.m5607x1() && mo3722to() == c0958eo.mo3722to();
    }
}
