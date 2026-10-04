package com.orion.notein.richeditor.spans;

import android.text.Layout;
import android.text.style.AlignmentSpan;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes9.dex */
public class AlignmentSpan extends AlignmentSpan.Standard implements RTSpan {
    private static Map<Layout.Alignment, Layout.Alignment> sRTLMapping;
    private Layout.Alignment mAlignment;
    private boolean mIsRTL;
    private boolean mIsValueChanged;

    static {
        HashMap map = new HashMap();
        sRTLMapping = map;
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        map.put(alignment, alignment);
        Map<Layout.Alignment, Layout.Alignment> map2 = sRTLMapping;
        Layout.Alignment alignment2 = Layout.Alignment.ALIGN_NORMAL;
        Layout.Alignment alignment3 = Layout.Alignment.ALIGN_OPPOSITE;
        map2.put(alignment2, alignment3);
        sRTLMapping.put(alignment3, alignment2);
    }

    public AlignmentSpan(Layout.Alignment alignment, boolean z) {
        super(z ? sRTLMapping.get(alignment) : alignment);
        this.mIsValueChanged = false;
        Layout.Alignment alignment2 = Layout.Alignment.ALIGN_NORMAL;
        this.mIsRTL = z;
        this.mAlignment = alignment;
    }

    public boolean confirmValueChanged() {
        boolean z = this.mIsValueChanged;
        this.mIsValueChanged = false;
        return z;
    }

    @Override // com.orion.notein.richeditor.spans.RTSpan
    public RTSpan copy(Object obj) {
        return new AlignmentSpan((Layout.Alignment) obj, this.mIsRTL);
    }

    @Override // android.text.style.AlignmentSpan.Standard, android.text.style.AlignmentSpan
    public Layout.Alignment getAlignment() {
        return this.mAlignment;
    }

    public void setAlignment(Layout.Alignment alignment) {
        if (Objects.equals(this.mAlignment, alignment)) {
            this.mIsValueChanged = false;
        } else {
            this.mIsValueChanged = true;
            this.mAlignment = alignment;
        }
    }

    @Override // com.orion.notein.richeditor.spans.RTSpan
    public RTSpan copy() {
        return new AlignmentSpan(getValue(), this.mIsRTL);
    }

    @Override // com.orion.notein.richeditor.spans.RTSpan
    public Layout.Alignment getValue() {
        Layout.Alignment alignment = getAlignment();
        return this.mIsRTL ? sRTLMapping.get(alignment) : alignment;
    }
}
