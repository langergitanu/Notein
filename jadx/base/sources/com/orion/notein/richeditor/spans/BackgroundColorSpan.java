package com.orion.notein.richeditor.spans;

/* JADX INFO: loaded from: classes9.dex */
public class BackgroundColorSpan extends android.text.style.BackgroundColorSpan implements RTSpan {
    public BackgroundColorSpan(int i) {
        super(i);
    }

    @Override // com.orion.notein.richeditor.spans.RTSpan
    public RTSpan copy(Object obj) {
        return new BackgroundColorSpan(((Integer) obj).intValue());
    }

    @Override // com.orion.notein.richeditor.spans.RTSpan
    public RTSpan copy() {
        return copy(getValue());
    }

    @Override // com.orion.notein.richeditor.spans.RTSpan
    public Integer getValue() {
        return Integer.valueOf(getBackgroundColor());
    }
}
