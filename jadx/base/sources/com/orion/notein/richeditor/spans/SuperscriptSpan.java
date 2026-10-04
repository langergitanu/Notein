package com.orion.notein.richeditor.spans;

/* JADX INFO: loaded from: classes9.dex */
public class SuperscriptSpan extends android.text.style.SuperscriptSpan implements RTSpan {
    @Override // com.orion.notein.richeditor.spans.RTSpan
    public RTSpan copy(Object obj) {
        return new SuperscriptSpan();
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
