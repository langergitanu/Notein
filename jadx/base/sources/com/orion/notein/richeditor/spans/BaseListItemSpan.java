package com.orion.notein.richeditor.spans;

import android.text.Spanned;

/* JADX INFO: loaded from: classes9.dex */
public abstract class BaseListItemSpan implements RTSpan {
    private int firstVisibleCharIndex(Spanned spanned, int i, int i2) {
        while (i < i2) {
            if (isVisibleChar(spanned.charAt(i))) {
                return i;
            }
            i++;
        }
        return -1;
    }

    private boolean isVisibleChar(char c) {
        return (c == 8203 || c == 65519) ? false : true;
    }

    public float determineTextSize(Spanned spanned, int i, int i2, float f) {
        int iFirstVisibleCharIndex = firstVisibleCharIndex(spanned, i, i2);
        if (iFirstVisibleCharIndex >= 0) {
            if (((AbsoluteSizeSpan[]) spanned.getSpans(iFirstVisibleCharIndex, iFirstVisibleCharIndex, AbsoluteSizeSpan.class)).length > 0) {
                return r1[r1.length - 1].getValue().intValue();
            }
        }
        return f;
    }
}
