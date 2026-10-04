package com.aspose.words;

import java.util.Locale;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes6.dex */
public final class CurrentThreadSettings {
    private CurrentThreadSettings() {
    }

    public static Locale getLocale() {
        return com.aspose.words.internal.zzZNG.zzpZ().getLocale();
    }

    public static TimeZone getTimeZone() {
        return com.aspose.words.internal.zzZNG.getTimeZone();
    }

    public static void setLocale(String str) {
        com.aspose.words.internal.zzZNG.zzUP(str);
    }

    public static void setTimeZone(TimeZone timeZone) {
        com.aspose.words.internal.zzZNG.setTimeZone(timeZone);
    }

    public static void setLocale(Locale locale) {
        com.aspose.words.internal.zzZNG.zzS(new com.aspose.words.internal.zzZP1(locale));
    }
}
