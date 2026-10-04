package com.aspose.slides.internal.p060ca;

import com.aspose.slides.internal.p294n9.AbstractC6747ar;
import com.aspose.slides.internal.p314oc.C7019kk;

/* JADX INFO: renamed from: com.aspose.slides.internal.ca.kk */
/* JADX INFO: loaded from: classes3.dex */
public class C2162kk extends AbstractC2281rv {

    /* JADX INFO: renamed from: du */
    private byte[] f7489du;

    /* JADX INFO: renamed from: h4 */
    private C2227o9 f7490h4;

    public C2162kk(C2120hx c2120hx) {
        super(c2120hx, null);
        m10978k4(new AbstractC2167ks[]{new C2213na(c2120hx, this), new C2086fh(c2120hx, this), new C2042d4(c2120hx, this), new C2154k4(c2120hx, this)});
        this.f7515x1 = new byte[][]{AbstractC6747ar.m26650yj().mo26677to("StartFontMetrics")};
        this.f7511k4 = new byte[][]{AbstractC6747ar.m26650yj().mo26677to("EndFontMetrics")};
    }

    /* JADX INFO: renamed from: k4 */
    public final C2227o9 m10930k4() {
        return this.f7490h4;
    }

    @Override // com.aspose.slides.internal.p060ca.AbstractC2281rv, com.aspose.slides.internal.p060ca.AbstractC2167ks
    /* JADX INFO: renamed from: kk */
    public void mo10227kk() {
        m10931k4(new C2227o9());
        m10932k4((byte[]) null);
        super.mo10227kk();
    }

    /* JADX INFO: renamed from: to */
    public final void m10933to() {
        int[] iArr = {0};
        boolean zMo10302k4 = mo10302k4(0, new byte[][]{null}, iArr);
        int i = iArr[0];
        if (zMo10302k4) {
            super.mo10280x1(i, new int[]{0});
        }
    }

    @Override // com.aspose.slides.internal.p060ca.AbstractC2167ks
    /* JADX INFO: renamed from: k4 */
    public void mo10225k4(int i) {
        super.mo10225k4(i);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m10931k4(C2227o9 c2227o9) {
        this.f7490h4 = c2227o9;
    }

    @Override // com.aspose.slides.internal.p060ca.AbstractC2281rv, com.aspose.slides.internal.p060ca.AbstractC2167ks, com.aspose.slides.internal.p060ca.InterfaceC2191m8
    /* JADX INFO: renamed from: k4 */
    public void mo10226k4(Object obj) {
        C2295sq c2295sq;
        C2227o9 c2227o9M10530to;
        C2154k4 c2154k4 = (C2154k4) C7019kk.m27452k4(obj, C2154k4.class);
        if (c2154k4 != null) {
            m10930k4().m11186k4().m11479k4(c2154k4.m10868k4());
        } else {
            C2213na c2213na = (C2213na) C7019kk.m27452k4(obj, C2213na.class);
            if (c2213na != null) {
                c2295sq = new C2295sq();
                c2295sq.m11423k4("StartCharMetrics");
                c2227o9M10530to = c2213na.m11167k4();
            } else {
                C2042d4 c2042d4 = (C2042d4) C7019kk.m27452k4(obj, C2042d4.class);
                if (c2042d4 != null) {
                    c2295sq = new C2295sq();
                    c2295sq.m11423k4("StartComposites");
                    c2227o9M10530to = c2042d4.m10354k4();
                } else {
                    C2086fh c2086fh = (C2086fh) C7019kk.m27452k4(obj, C2086fh.class);
                    if (c2086fh != null) {
                        C2295sq c2295sq2 = new C2295sq();
                        c2295sq2.m11423k4("StartKernPairs");
                        c2295sq2.m11422k4(c2086fh.m10529k4());
                        c2295sq2.m11421k4(3);
                        m10930k4().m11186k4().m11479k4(c2295sq2);
                        c2295sq = new C2295sq();
                        c2295sq.m11423k4("StartTrackKern");
                        c2227o9M10530to = c2086fh.m10530to();
                    }
                }
            }
            c2295sq.m11422k4(c2227o9M10530to);
            c2295sq.m11421k4(3);
            m10930k4().m11186k4().m11479k4(c2295sq);
        }
        super.mo10226k4(obj);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m10932k4(byte[] bArr) {
        this.f7489du = bArr;
    }
}
