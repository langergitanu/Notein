package com.aspose.slides.internal.p060ca;

import com.aspose.slides.internal.p314oc.C7019kk;

/* JADX INFO: renamed from: com.aspose.slides.internal.ca.n7 */
/* JADX INFO: loaded from: classes3.dex */
public class C2211n7 extends AbstractC2281rv {

    /* JADX INFO: renamed from: du */
    private byte[] f7655du;

    /* JADX INFO: renamed from: h4 */
    private C2318u5 f7656h4;

    public C2211n7(C2120hx c2120hx) {
        super(c2120hx, null);
        m10978k4((AbstractC2167ks[]) new AbstractC2281rv[]{new C2005av(c2120hx, this, true, true), new C2057dw(c2120hx, this)});
        this.f7515x1 = new byte[0][];
        this.f7511k4 = new byte[0][];
    }

    @Override // com.aspose.slides.internal.p060ca.AbstractC2167ks
    /* JADX INFO: renamed from: k4 */
    public void mo10225k4(int i) {
        super.mo10225k4(i);
    }

    @Override // com.aspose.slides.internal.p060ca.AbstractC2281rv, com.aspose.slides.internal.p060ca.AbstractC2167ks
    /* JADX INFO: renamed from: kk */
    public void mo10227kk() {
        m11142k4(new C2318u5());
        m11143k4((byte[]) null);
        super.mo10227kk();
    }

    /* JADX INFO: renamed from: to */
    public final C2318u5 m11145to() {
        return this.f7656h4;
    }

    /* JADX INFO: renamed from: x6 */
    public final void m11146x6() {
        int[] iArr = {0};
        boolean zMo10302k4 = mo10302k4(0, new byte[][]{null}, iArr);
        int i = iArr[0];
        if (zMo10302k4) {
            super.mo10280x1(i, new int[]{0});
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m11142k4(C2318u5 c2318u5) {
        this.f7656h4 = c2318u5;
    }

    @Override // com.aspose.slides.internal.p060ca.AbstractC2281rv, com.aspose.slides.internal.p060ca.AbstractC2167ks, com.aspose.slides.internal.p060ca.InterfaceC2191m8
    /* JADX INFO: renamed from: k4 */
    public void mo10226k4(Object obj) {
        C2005av c2005av = (C2005av) C7019kk.m27452k4(obj, C2005av.class);
        if (c2005av != null) {
            m11145to().m11479k4(c2005av.m10224k4());
        }
        C2057dw c2057dw = (C2057dw) C7019kk.m27452k4(obj, C2057dw.class);
        if (c2057dw != null) {
            m11143k4(c2057dw.m10437k4());
        }
        super.mo10226k4(obj);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m11143k4(byte[] bArr) {
        this.f7655du = bArr;
    }

    @Override // com.aspose.slides.internal.p060ca.AbstractC2167ks
    /* JADX INFO: renamed from: k4 */
    public boolean mo10302k4(int i, byte[][] bArr, int[] iArr) {
        iArr[0] = i;
        bArr[0] = new byte[0];
        return true;
    }

    /* JADX INFO: renamed from: k4 */
    public final byte[] m11144k4() {
        return this.f7655du;
    }

    @Override // com.aspose.slides.internal.p060ca.AbstractC2167ks
    /* JADX INFO: renamed from: k4 */
    public byte[] mo10279k4(int i, int[] iArr) {
        iArr[0] = -1;
        if (i != this.f7514to.length - 1) {
            return null;
        }
        iArr[0] = i;
        return new byte[0];
    }
}
