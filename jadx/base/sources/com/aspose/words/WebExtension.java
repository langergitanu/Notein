package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
public class WebExtension {
    private zzH1 zzWVq;
    private boolean zzWVr;
    private String zzZh;
    private WebExtensionReference zzWVp = new WebExtensionReference();
    private WebExtensionBindingCollection zzWVo = new WebExtensionBindingCollection();
    private WebExtensionPropertyCollection zzWVn = new WebExtensionPropertyCollection();
    private WebExtensionReferenceCollection zzWVm = new WebExtensionReferenceCollection();

    public WebExtensionReferenceCollection getAlternateReferences() {
        return this.zzWVm;
    }

    public WebExtensionBindingCollection getBindings() {
        return this.zzWVo;
    }

    public String getId() {
        return this.zzZh;
    }

    public WebExtensionPropertyCollection getProperties() {
        return this.zzWVn;
    }

    public WebExtensionReference getReference() {
        return this.zzWVp;
    }

    public void isFrozen(boolean z) {
        this.zzWVr = z;
    }

    public void setId(String str) {
        this.zzZh = str;
    }

    public final void zzV(zzH1 zzh1) {
        this.zzWVq = zzh1;
    }

    public final zzH1 zzXSK() {
        return this.zzWVq;
    }

    public boolean isFrozen() {
        return this.zzWVr;
    }
}
