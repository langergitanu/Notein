package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.IGenericList;
import com.aspose.slides.p559ms.System.C14116yg;

/* JADX INFO: loaded from: classes3.dex */
class i0y implements InterfaceC14885zh {

    /* JADX INFO: renamed from: du */
    private final int f5601du;

    /* JADX INFO: renamed from: h4 */
    private final int f5602h4;

    /* JADX INFO: renamed from: k4 */
    private IGenericList<InterfaceC1124fx> f5603k4;

    /* JADX INFO: renamed from: kk */
    private final int f5604kk;

    /* JADX INFO: renamed from: to */
    private final int f5605to;

    /* JADX INFO: renamed from: x1 */
    private final InterfaceC14836y7 f5606x1;

    public i0y(InterfaceC14836y7 interfaceC14836y7, int i, int i2, int i3, int i4) {
        this.f5606x1 = interfaceC14836y7;
        this.f5604kk = C14116yg.m67507x1(i, i3);
        this.f5605to = C14116yg.m67507x1(i2, i4);
        this.f5601du = C14116yg.m67483k4(i, i3);
        this.f5602h4 = C14116yg.m67483k4(i2, i4);
        m7363fa();
    }

    /* JADX INFO: renamed from: fa */
    private void m7363fa() {
        if (this.f5603k4 != null) {
            return;
        }
        this.f5603k4 = mo7372k4().mo5424k4(mo7377x1(), mo7373kk(), m7369jd(), m7365ck());
    }

    @Override // com.aspose.slides.InterfaceC14885zh
    /* JADX INFO: renamed from: c5 */
    public final InterfaceC0761as mo7364c5() {
        InterfaceC1124fx interfaceC1124fxMo5426k4 = mo7372k4().mo5426k4(mo7377x1(), mo7373kk());
        if (mo7377x1() == m7369jd() && mo7373kk() == m7365ck()) {
            return interfaceC1124fxMo5426k4.mo3428c5();
        }
        InterfaceC1124fx interfaceC1124fxMo5426k42 = mo7372k4().mo5426k4(m7369jd(), m7365ck());
        return new xdd(interfaceC1124fxMo5426k4.mo3428c5(), interfaceC1124fxMo5426k42.mo3428c5(), interfaceC1124fxMo5426k42.mo3436k4().mo5429x1());
    }

    /* JADX INFO: renamed from: ck */
    public final int m7365ck() {
        return this.f5602h4;
    }

    @Override // com.aspose.slides.InterfaceC14885zh
    /* JADX INFO: renamed from: du */
    public final boolean mo7366du() {
        return mo7373kk() == m7365ck();
    }

    @Override // com.aspose.slides.InterfaceC14885zh
    /* JADX INFO: renamed from: dy */
    public final int mo7367dy() {
        return this.f5603k4.size();
    }

    @Override // com.aspose.slides.InterfaceC14885zh
    /* JADX INFO: renamed from: h4 */
    public final int mo7368h4() {
        return (m7369jd() - mo7377x1()) + 1;
    }

    @Override // java.lang.Iterable
    public final IGenericEnumerator<InterfaceC1124fx> iterator() {
        return this.f5603k4.iterator();
    }

    /* JADX INFO: renamed from: jd */
    public final int m7369jd() {
        return this.f5601du;
    }

    @Override // com.aspose.slides.InterfaceC14885zh
    /* JADX INFO: renamed from: k4 */
    public final InterfaceC1124fx mo7370k4(int i) {
        return this.f5603k4.get_Item(i);
    }

    @Override // com.aspose.slides.InterfaceC14885zh
    /* JADX INFO: renamed from: kk */
    public final int mo7373kk() {
        return this.f5605to;
    }

    @Override // com.aspose.slides.InterfaceC14885zh
    /* JADX INFO: renamed from: m9 */
    public final int mo7375m9() {
        return (m7365ck() - mo7373kk()) + 1;
    }

    @Override // com.aspose.slides.InterfaceC14885zh
    /* JADX INFO: renamed from: to */
    public final boolean mo7376to() {
        return mo7377x1() == m7369jd();
    }

    @Override // com.aspose.slides.InterfaceC14885zh
    /* JADX INFO: renamed from: x1 */
    public final int mo7377x1() {
        return this.f5604kk;
    }

    @Override // com.aspose.slides.InterfaceC14885zh
    /* JADX INFO: renamed from: k4 */
    public final InterfaceC1124fx mo7371k4(int i, int i2) {
        return mo7372k4().mo5426k4((mo7377x1() + i) - 1, (mo7373kk() + i2) - 1);
    }

    @Override // com.aspose.slides.InterfaceC14885zh
    /* JADX INFO: renamed from: kk */
    public final InterfaceC14885zh mo7374kk(int i) {
        int iMo7373kk = (mo7373kk() + i) - 1;
        return new i0y(mo7372k4(), mo7377x1(), iMo7373kk, m7369jd(), iMo7373kk);
    }

    @Override // com.aspose.slides.InterfaceC14885zh
    /* JADX INFO: renamed from: x1 */
    public final InterfaceC14885zh mo7378x1(int i) {
        int iMo7377x1 = (mo7377x1() + i) - 1;
        return new i0y(mo7372k4(), iMo7377x1, mo7373kk(), iMo7377x1, m7365ck());
    }

    @Override // com.aspose.slides.InterfaceC14885zh
    /* JADX INFO: renamed from: k4 */
    public final InterfaceC14836y7 mo7372k4() {
        return this.f5606x1;
    }
}
