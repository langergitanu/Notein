package com.orion.notein.richeditor.api.format;

import android.content.Context;

/* JADX INFO: loaded from: classes9.dex */
public abstract class RTText {
    private final RTFormat mRTFormat;
    private final CharSequence mRTText;

    public RTText(RTFormat rTFormat, CharSequence charSequence) {
        this.mRTFormat = rTFormat;
        this.mRTText = charSequence;
    }

    public RTText convertTo(Context context, RTFormat rTFormat) {
        if (rTFormat == this.mRTFormat) {
            return this;
        }
        throw new UnsupportedOperationException("Can't convert from " + this.mRTFormat.getClass().getSimpleName() + " to " + rTFormat.getClass().getSimpleName());
    }

    public RTFormat getFormat() {
        return this.mRTFormat;
    }

    public CharSequence getText() {
        return this.mRTText;
    }
}
