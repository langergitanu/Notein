package com.orion.notein.richeditor.spans;

/* JADX INFO: loaded from: classes9.dex */
public class ForegroundColorSpan extends android.text.style.ForegroundColorSpan implements RTSpan {
    public ForegroundColorSpan(int i) {
        super(i);
    }

    @Override // com.orion.notein.richeditor.spans.RTSpan
    public RTSpan copy(Object obj) {
        return new ForegroundColorSpan(((Integer) obj).intValue());
    }

    @Override // com.orion.notein.richeditor.spans.RTSpan
    public RTSpan copy() {
        return copy(getValue());
    }

    @Override // com.orion.notein.richeditor.spans.RTSpan
    public Integer getValue() {
        return Integer.valueOf(getForegroundColor());
    }
}
