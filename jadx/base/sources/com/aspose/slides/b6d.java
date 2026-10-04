package com.aspose.slides;

import com.aspose.slides.p559ms.System.C14057f9;
import com.aspose.slides.p559ms.System.C14113y2;
import com.huawei.hms.network.embedded.C18241k5;

/* JADX INFO: loaded from: classes3.dex */
class b6d implements InterfaceC0761as {

    /* JADX INFO: renamed from: k4 */
    private final boolean f4131k4;

    /* JADX INFO: renamed from: kk */
    private final int f4132kk;

    /* JADX INFO: renamed from: x1 */
    private String f4133x1;

    public b6d(int i, boolean z) {
        this.f4132kk = i;
        this.f4131k4 = z;
    }

    @Override // com.aspose.slides.InterfaceC0761as
    /* JADX INFO: renamed from: du */
    public final String mo3717du(C0909dp c0909dp) {
        if (mo3722to()) {
            return C14113y2.m67408k4("$", C14057f9.m66591x1(m4031x1()), ":$", C14057f9.m66591x1(m4031x1()));
        }
        int iM4031x1 = m4031x1() + c0909dp.m5204x1().m4031x1();
        return C14113y2.m67408k4(C14057f9.m66591x1(iM4031x1), C18241k5.f55433h, C14057f9.m66591x1(iM4031x1));
    }

    @Override // com.aspose.slides.InterfaceC0761as
    /* JADX INFO: renamed from: k4 */
    public final InterfaceC0761as mo3718k4(C0909dp c0909dp) {
        int iM4031x1 = mo3722to() ? m4031x1() : c0909dp.m5204x1().m4031x1() + m4031x1();
        if (iM4031x1 > 0) {
            return new b6d(iM4031x1, true, mo3720k4());
        }
        throw new CellInvalidFormulaException("Calculated row number of an absolute reference has invalid value.");
    }

    @Override // com.aspose.slides.InterfaceC0761as
    /* JADX INFO: renamed from: kk */
    public final boolean mo3721kk(C0909dp c0909dp) {
        return m4031x1() == c0909dp.m5204x1().m4031x1();
    }

    @Override // com.aspose.slides.InterfaceC0761as
    /* JADX INFO: renamed from: to */
    public final boolean mo3722to() {
        return this.f4131k4;
    }

    public String toString() {
        return mo3722to() ? C14113y2.m67442x1("R", m4031x1()) : m4031x1() != 0 ? C14113y2.m67400k4("R", C14113y2.m67408k4("[", C14057f9.m66591x1(m4031x1()), "]")) : "R";
    }

    /* JADX INFO: renamed from: x1 */
    public final int m4031x1() {
        return this.f4132kk;
    }

    public b6d(int i, boolean z, String str) {
        this(i, z);
        this.f4133x1 = str;
    }

    @Override // com.aspose.slides.InterfaceC0761as
    /* JADX INFO: renamed from: k4 */
    public final InterfaceC14885zh mo3719k4(InterfaceC14249or interfaceC14249or) {
        return interfaceC14249or.mo68753k4(this);
    }

    @Override // com.aspose.slides.InterfaceC0761as
    /* JADX INFO: renamed from: x1 */
    public final C0909dp mo3723x1(C0909dp c0909dp) {
        if (m4031x1() != c0909dp.m5204x1().m4031x1()) {
            return new C0909dp(m4031x1(), c0909dp.m5202kk().m5607x1(), mo3720k4());
        }
        throw new CellCircularReferenceException("", c0909dp.toString());
    }

    @Override // com.aspose.slides.InterfaceC0761as
    /* JADX INFO: renamed from: k4 */
    public final String mo3720k4() {
        return this.f4133x1;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m4030k4(b6d b6dVar) {
        return C14113y2.m67363du(mo3720k4(), b6dVar.mo3720k4()) && m4031x1() == b6dVar.m4031x1() && mo3722to() == b6dVar.mo3722to();
    }
}
