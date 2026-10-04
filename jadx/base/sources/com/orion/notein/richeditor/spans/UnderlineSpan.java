package com.orion.notein.richeditor.spans;

/* JADX INFO: loaded from: classes9.dex */
public class UnderlineSpan extends android.text.style.UnderlineSpan implements RTSpan {
    @Override // com.orion.notein.richeditor.spans.RTSpan
    public RTSpan copy(Object obj) {
        return new UnderlineSpan();
    }

    @Override // com.orion.notein.richeditor.spans.RTSpan
    public RTSpan copy() {
        return copy(getValue());
    }

    @Override // com.orion.notein.richeditor.spans.RTSpan
    public Boolean getValue() {
        return Boolean.TRUE;
    }
}
