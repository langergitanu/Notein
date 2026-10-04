package com.orion.notein.richeditor;

import android.text.Spannable;

/* JADX INFO: loaded from: classes9.dex */
public interface RTEditTextListener {
    public static final int ACTION_SELECTION_CHANGED = 4;
    public static final int ACTION_SPAN_ADDED = 0;
    public static final int ACTION_SPAN_CHANGED = 3;
    public static final int ACTION_SPAN_REMOVED = 1;
    public static final int ACTION_TEXT_CHANGED = 5;

    void onFocusChanged(RTEditText rTEditText, boolean z);

    void onRichTextEditingChanged(RTEditText rTEditText, boolean z);

    void onSelectionChanged(RTEditText rTEditText, int i, int i2, int i3);

    void onTextChanged(RTEditText rTEditText, int i, Spannable spannable, Spannable spannable2, int i2, int i3, int i4, int i5);
}
