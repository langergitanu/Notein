package com.orion.notein.richeditor.spans;

import android.text.style.LeadingMarginSpan;

/* JADX INFO: loaded from: classes9.dex */
public class IndentationSpan extends LeadingMarginSpan.Standard implements RTSpan {
    private final boolean mIgnoreSpan;
    private final int mIndentation;

    public IndentationSpan(int i, boolean z, boolean z2, boolean z3) {
        super(i);
        this.mIndentation = i;
        this.mIgnoreSpan = z && z3 && !z2;
    }

    @Override // com.orion.notein.richeditor.spans.RTSpan
    public RTSpan copy(Object obj) {
        return new IndentationSpan(((Integer) obj).intValue(), this.mIgnoreSpan);
    }

    @Override // android.text.style.LeadingMarginSpan.Standard, android.text.style.LeadingMarginSpan
    public int getLeadingMargin(boolean z) {
        if (this.mIgnoreSpan) {
            return 0;
        }
        return this.mIndentation;
    }

    @Override // com.orion.notein.richeditor.spans.RTSpan
    public RTSpan copy() {
        return new IndentationSpan(this.mIndentation, this.mIgnoreSpan);
    }

    @Override // com.orion.notein.richeditor.spans.RTSpan
    public Integer getValue() {
        return Integer.valueOf(this.mIndentation);
    }

    private IndentationSpan(int i, boolean z) {
        super(i);
        this.mIndentation = i;
        this.mIgnoreSpan = z;
    }
}
