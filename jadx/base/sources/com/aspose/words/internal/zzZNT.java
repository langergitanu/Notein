package com.aspose.words.internal;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZNT {
    private zzZNU zzZW6;
    private Matcher zzZW7;
    private boolean zzZW9;

    public zzZNT(Pattern pattern) {
        this.zzZW7 = pattern.matcher("");
    }

    private String zzUZ(String str) {
        if (str == null) {
            throw new NullPointerException("replacement");
        }
        int iStart = this.zzZW7.start();
        int iEnd = this.zzZW7.end();
        this.zzZW7.reset();
        this.zzZW7.region(iStart, iEnd);
        if (!this.zzZW7.find()) {
            return this.zzZW7.toString();
        }
        StringBuffer stringBuffer = new StringBuffer();
        this.zzZW7.appendReplacement(stringBuffer, str);
        return stringBuffer.substring(iStart);
    }

    public static Matcher zzZ(zzZNT zzznt) {
        if (zzznt == null) {
            return null;
        }
        return zzznt.zzZW7;
    }

    public final int getIndex() {
        return this.zzZW7.start();
    }

    public final int getLength() {
        if (this.zzZW9) {
            return this.zzZW7.end() - this.zzZW7.start();
        }
        return 0;
    }

    public final String getValue() {
        return this.zzZW9 ? this.zzZW7.group() : "";
    }

    public final String replaceAll(String str, String str2) {
        zzV1(str);
        return this.zzZW7.replaceAll(str2);
    }

    public final String toString() {
        return getValue();
    }

    public final zzZNT zzV(String str, int i, int i2) {
        this.zzZW7.reset(str);
        this.zzZW7.region(i, i2 + i);
        this.zzZW9 = this.zzZW7.find();
        return this;
    }

    public final String zzV0(String str) {
        return this.zzZW9 ? zzUZ(str) : "";
    }

    public final zzZNT zzV1(String str) {
        this.zzZW7.reset(str);
        this.zzZW9 = this.zzZW7.find();
        return this;
    }

    public final String zzY(String str, String str2, int i) {
        zzV1(str);
        while (i > 0) {
            zzV1(str);
            str = this.zzZW7.replaceFirst(str2);
            i--;
        }
        return str;
    }

    public final Matcher zzhI() {
        return this.zzZW7;
    }

    public final zzZNU zzhJ() {
        if (this.zzZW6 == null) {
            this.zzZW6 = new zzZNU(this);
        }
        return this.zzZW6;
    }

    public final zzZNT zzhK() {
        this.zzZW9 = this.zzZW7.find();
        return this;
    }

    public final boolean zzhL() {
        return this.zzZW9;
    }

    public final zzZNT zzu(String str, int i) {
        this.zzZW7.reset(str);
        this.zzZW7.region(i, str.length());
        this.zzZW9 = this.zzZW7.find();
        return this;
    }

    public zzZNT(Pattern pattern, String str, int i) {
        Matcher matcher = pattern.matcher(str);
        this.zzZW7 = matcher;
        matcher.region(i, str.length());
        this.zzZW9 = this.zzZW7.find();
    }
}
