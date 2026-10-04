package com.aspose.slides.internal.p513xw;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p048bv.C1869to;

/* JADX INFO: renamed from: com.aspose.slides.internal.xw.g8 */
/* JADX INFO: loaded from: classes5.dex */
public class C12698g8<TParentElement> extends C12695em<TParentElement> {

    /* JADX INFO: renamed from: k4 */
    private int f42236k4;

    public C12698g8(List<TParentElement> list) {
        this(list, 0, list.size());
    }

    @Override // com.aspose.slides.internal.p513xw.C12695em, com.aspose.slides.internal.p048bv.InterfaceC1870up
    /* JADX INFO: renamed from: du */
    public C12717os mo9760kk() {
        this.f42236k4--;
        return super.mo9760kk();
    }

    @Override // com.aspose.slides.internal.p513xw.C12695em
    /* JADX INFO: renamed from: k4 */
    public InterfaceC12711lr mo58936k4(Object obj) {
        return ((AbstractC12723s7) obj).m59135wl();
    }

    @Override // com.aspose.slides.internal.p513xw.C12695em
    /* JADX INFO: renamed from: to */
    public boolean mo58938to() {
        if (this.f42236k4 > 0) {
            return super.mo58938to();
        }
        m58937m9();
        return false;
    }

    @Override // com.aspose.slides.internal.p513xw.C12695em
    /* JADX INFO: renamed from: x1 */
    public C12717os mo58939x1(Object obj) {
        return ((AbstractC12723s7) obj).m59134uz();
    }

    public C12698g8(List<TParentElement> list, int i, int i2) {
        super(new C1869to(list, i));
        this.f42236k4 = i2 - i;
    }
}
