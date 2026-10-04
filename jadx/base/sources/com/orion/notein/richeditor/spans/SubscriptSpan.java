package com.orion.notein.richeditor.spans;

/* JADX INFO: loaded from: classes9.dex */
public class SubscriptSpan extends android.text.style.SubscriptSpan implements RTSpan {
    @Override // com.orion.notein.richeditor.spans.RTSpan
    public RTSpan copy(Object obj) {
        return new SubscriptSpan();
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
