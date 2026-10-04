package com.aspose.slides.internal.p060ca;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.Stack;
import com.aspose.slides.internal.p294n9.AbstractC6747ar;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.orion.notein.richeditor.utils.p606io.IOUtils;

/* JADX INFO: renamed from: com.aspose.slides.internal.ca.k4 */
/* JADX INFO: loaded from: classes3.dex */
public class C2154k4 extends AbstractC2281rv implements InterfaceC2067eg {

    /* JADX INFO: renamed from: du */
    private C2295sq f7443du;

    /* JADX INFO: renamed from: h4 */
    private Stack<Double> f7444h4;

    public C2154k4(C2120hx c2120hx, AbstractC2281rv abstractC2281rv) {
        super(c2120hx, abstractC2281rv);
        this.f7515x1 = new byte[0][];
        this.f7511k4 = new byte[][]{AbstractC6747ar.m26650yj().mo26677to(IOUtils.LINE_SEPARATOR_WINDOWS), AbstractC6747ar.m26650yj().mo26677to("\r"), AbstractC6747ar.m26650yj().mo26677to(IOUtils.LINE_SEPARATOR_UNIX)};
        List list = new List();
        list.addItem(new C2026c4(this, c2120hx.m10701k4()));
        list.addItem(new C2359x1(c2120hx, this));
        list.addItem(new C2359x1(c2120hx, this));
        m10978k4((AbstractC2167ks[]) list.toArray(new AbstractC2167ks[0]));
    }

    /* JADX INFO: renamed from: k4 */
    public final C2295sq m10868k4() {
        return this.f7443du;
    }

    @Override // com.aspose.slides.internal.p060ca.AbstractC2281rv, com.aspose.slides.internal.p060ca.AbstractC2167ks
    /* JADX INFO: renamed from: kk */
    public void mo10227kk() {
        this.f7443du = new C2295sq();
        this.f7444h4 = new Stack<>();
        ((C2026c4) m10972dy()[0]).m10977k4(true);
        super.mo10227kk();
    }

    @Override // com.aspose.slides.internal.p060ca.InterfaceC2067eg
    /* JADX INFO: renamed from: x1 */
    public final Stack<Double> mo10228x1() {
        return this.f7444h4;
    }

    @Override // com.aspose.slides.internal.p060ca.AbstractC2167ks
    /* JADX INFO: renamed from: k4 */
    public void mo10225k4(int i) {
        super.mo10225k4(i);
    }

    @Override // com.aspose.slides.internal.p060ca.AbstractC2281rv, com.aspose.slides.internal.p060ca.AbstractC2167ks, com.aspose.slides.internal.p060ca.InterfaceC2191m8
    /* JADX INFO: renamed from: k4 */
    public void mo10226k4(Object obj) {
        C2026c4 c2026c4 = (C2026c4) C7019kk.m27452k4(obj, C2026c4.class);
        if (c2026c4 != null) {
            this.f7443du.m11423k4(c2026c4.m10301k4());
        } else {
            C2359x1 c2359x1 = (C2359x1) C7019kk.m27452k4(obj, C2359x1.class);
            if (c2359x1 != null) {
                this.f7443du.m11422k4((Object) c2359x1.m11643k4());
                this.f7443du.m11421k4(0);
            }
        }
        super.mo10226k4(obj);
    }

    @Override // com.aspose.slides.internal.p060ca.AbstractC2167ks
    /* JADX INFO: renamed from: k4 */
    public boolean mo10302k4(int i, byte[][] bArr, int[] iArr) {
        iArr[0] = i;
        bArr[0] = new byte[0];
        return true;
    }
}
