package com.orion.notein.richeditor.fonts;

import android.graphics.Typeface;
import java.util.Locale;

/* JADX INFO: loaded from: classes9.dex */
public class RTTypeface implements Comparable<RTTypeface> {
    protected String mName;
    private Typeface mTypeface;

    public RTTypeface(String str) {
        if (str == null) {
            throw new IllegalArgumentException("fontName mustn't be null");
        }
        this.mName = str;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof RTTypeface)) {
            return false;
        }
        return this.mName.equalsIgnoreCase(((RTTypeface) obj).getName());
    }

    public String getName() {
        return this.mName;
    }

    public Typeface getTypeface() {
        return this.mTypeface;
    }

    public void setName(String str) {
        this.mName = str;
    }

    @Override // java.lang.Comparable
    public int compareTo(RTTypeface rTTypeface) {
        Locale locale = Locale.getDefault();
        return this.mName.toLowerCase(locale).compareTo(rTTypeface.getName().toLowerCase(locale));
    }

    public RTTypeface(String str, Typeface typeface) {
        if (str == null) {
            throw new IllegalArgumentException("fontName mustn't be null");
        }
        if (typeface != null) {
            this.mName = str;
            this.mTypeface = typeface;
            return;
        }
        throw new IllegalArgumentException("typeface mustn't be null");
    }

    public RTTypeface() {
    }
}
