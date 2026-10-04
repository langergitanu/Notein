package com.aspose.words.internal;

import org.w3c.dom.Attr;
import org.w3c.dom.Element;

/* JADX INFO: loaded from: classes5.dex */
final class zzZSR extends zzZSP implements zzF0 {
    private Element zz6f;

    public zzZSR(Element element) {
        super(element);
        this.zz6f = element;
    }

    @Override // com.aspose.words.internal.zzF0
    public final void zzZ(zzEZ zzez) {
        this.zz6f.setAttributeNode((Attr) ((zzZSP) zzez).zzEl());
        zzW(zzez);
    }
}
