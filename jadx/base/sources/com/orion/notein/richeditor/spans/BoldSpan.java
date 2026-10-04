package com.orion.notein.richeditor.spans;

import android.text.style.StyleSpan;

/* JADX INFO: loaded from: classes9.dex */
public class BoldSpan extends StyleSpan implements RTSpan {
    public BoldSpan() {
        super(1);
    }

    @Override // com.orion.notein.richeditor.spans.RTSpan
    public RTSpan copy(Object obj) {
        return new BoldSpan();
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
