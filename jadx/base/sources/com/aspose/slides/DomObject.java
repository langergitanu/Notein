package com.aspose.slides;

/* JADX INFO: loaded from: classes3.dex */
public abstract class DomObject<TParent> implements InterfaceC14397rj {

    /* JADX INFO: renamed from: h4 */
    final TParent f2127h4;

    public DomObject(TParent tparent) {
        this.f2127h4 = tparent;
    }

    @Override // com.aspose.slides.InterfaceC14397rj
    public InterfaceC14397rj getParent_Immediate() {
        return (InterfaceC14397rj) this.f2127h4;
    }
}
