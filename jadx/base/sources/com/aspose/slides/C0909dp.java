package com.aspose.slides;

import com.aspose.slides.p559ms.System.C14057f9;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.dp */
/* JADX INFO: loaded from: classes3.dex */
class C0909dp implements InterfaceC0761as {

    /* JADX INFO: renamed from: k4 */
    private String f4635k4;

    /* JADX INFO: renamed from: kk */
    private final C0958eo f4636kk;

    /* JADX INFO: renamed from: x1 */
    private final b6d f4637x1;

    public C0909dp(int i, int i2) {
        this.f4637x1 = new b6d(i, true);
        this.f4636kk = new C0958eo(i2, true);
    }

    @Override // com.aspose.slides.InterfaceC0761as
    /* JADX INFO: renamed from: du */
    public final String mo3717du(C0909dp c0909dp) {
        String strM67408k4 = m5202kk().mo3722to() ? C14113y2.m67408k4("$", C13712k4.m63643k4(m5202kk().m5607x1())) : C13712k4.m63643k4(m5202kk().m5607x1() + c0909dp.m5202kk().m5607x1());
        String strM67408k42 = m5204x1().mo3722to() ? C14113y2.m67408k4("$", C14057f9.m66591x1(m5204x1().m4031x1())) : C14057f9.m66591x1(m5204x1().m4031x1() + c0909dp.m5204x1().m4031x1());
        return !C14113y2.m67363du(mo3720k4(), c0909dp.mo3720k4()) ? C14113y2.m67408k4(C14113y2.m67408k4("'", mo3720k4(), "'!"), strM67408k4, strM67408k42) : C14113y2.m67408k4(strM67408k4, strM67408k42);
    }

    @Override // com.aspose.slides.InterfaceC0761as
    /* JADX INFO: renamed from: k4 */
    public final InterfaceC0761as mo3718k4(C0909dp c0909dp) {
        return new C0909dp((b6d) m5204x1().mo3718k4(c0909dp), (C0958eo) m5202kk().mo3718k4(c0909dp), mo3720k4());
    }

    /* JADX INFO: renamed from: kk */
    public final C0958eo m5202kk() {
        return this.f4636kk;
    }

    @Override // com.aspose.slides.InterfaceC0761as
    /* JADX INFO: renamed from: to */
    public final boolean mo3722to() {
        return m5204x1().mo3722to() && m5202kk().mo3722to();
    }

    public String toString() {
        return C14113y2.m67408k4(m5204x1().toString(), m5202kk().toString());
    }

    /* JADX INFO: renamed from: x1 */
    public final b6d m5204x1() {
        return this.f4637x1;
    }

    public C0909dp(int i, int i2, String str) {
        this(i, i2);
        this.f4635k4 = str;
    }

    @Override // com.aspose.slides.InterfaceC0761as
    /* JADX INFO: renamed from: k4 */
    public final InterfaceC14885zh mo3719k4(InterfaceC14249or interfaceC14249or) {
        return interfaceC14249or.mo68754k4(this);
    }

    @Override // com.aspose.slides.InterfaceC0761as
    /* JADX INFO: renamed from: kk */
    public final boolean mo3721kk(C0909dp c0909dp) {
        return m5203to(c0909dp);
    }

    /* JADX INFO: renamed from: to */
    public final boolean m5203to(C0909dp c0909dp) {
        return m5204x1().m4030k4(c0909dp.m5204x1()) && m5202kk().m5606k4(c0909dp.m5202kk());
    }

    @Override // com.aspose.slides.InterfaceC0761as
    /* JADX INFO: renamed from: x1 */
    public final C0909dp mo3723x1(C0909dp c0909dp) {
        if (m5204x1().m4031x1() != c0909dp.m5204x1().m4031x1() || m5202kk().m5607x1() != c0909dp.m5202kk().m5607x1() || !C14113y2.m67363du(mo3720k4(), c0909dp.mo3720k4())) {
            return new C0909dp(m5204x1().m4031x1(), m5202kk().m5607x1(), mo3720k4());
        }
        throw new CellCircularReferenceException("", c0909dp.mo3720k4() + c0909dp.m5204x1() + c0909dp.m5202kk());
    }

    public C0909dp(b6d b6dVar, C0958eo c0958eo) {
        this.f4637x1 = b6dVar;
        this.f4636kk = c0958eo;
    }

    @Override // com.aspose.slides.InterfaceC0761as
    /* JADX INFO: renamed from: k4 */
    public final String mo3720k4() {
        return this.f4635k4;
    }

    public C0909dp(b6d b6dVar, C0958eo c0958eo, String str) {
        this(b6dVar, c0958eo);
        this.f4635k4 = str;
    }
}
