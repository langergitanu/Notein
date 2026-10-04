package com.orion.notein.richeditor.utils;

import Oooo0oO.C21023OooO0Oo;
import android.widget.EditText;
import java.io.Serializable;

/* JADX INFO: loaded from: classes9.dex */
public class Selection implements Serializable {
    private static final long serialVersionUID = 8415527424030047664L;
    private int mEnd;
    private int mStart;

    public Selection(int i, int i2) {
        this.mStart = i;
        this.mEnd = i2;
        if (i > i2) {
            this.mEnd = i;
            this.mStart = i2;
        }
    }

    public int end() {
        return this.mEnd;
    }

    public boolean isEmpty() {
        return this.mStart == this.mEnd;
    }

    public Selection offset(int i, int i2) {
        this.mStart = Math.max(0, this.mStart - i);
        this.mEnd += i2;
        return this;
    }

    public int start() {
        return this.mStart;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        sb.append(this.mStart);
        sb.append(", ");
        return C21023OooO0Oo.OooO0OO("]", this.mEnd, sb);
    }

    public Selection(EditText editText) {
        this(editText.getSelectionStart(), editText.getSelectionEnd());
    }
}
