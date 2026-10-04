package com.orion.notein.richeditor.spans;

/* JADX INFO: loaded from: classes9.dex */
public class AbsoluteSizeSpan extends android.text.style.AbsoluteSizeSpan implements RTSpan {
    public AbsoluteSizeSpan(int i) {
        super(i);
    }

    @Override // com.orion.notein.richeditor.spans.RTSpan
    public RTSpan copy(Object obj) {
        return new AbsoluteSizeSpan(((Integer) obj).intValue());
    }

    @Override // com.orion.notein.richeditor.spans.RTSpan
    public RTSpan copy() {
        return copy(getValue());
    }

    @Override // com.orion.notein.richeditor.spans.RTSpan
    public Integer getValue() {
        return Integer.valueOf(getSize());
    }
}
