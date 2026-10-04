package com.aspose.words.internal;

import com.google.mlkit.p567nl.translate.TranslateLanguage;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
final class zzZBK {
    private static Long zzWHN = 0L;
    private static final Map zzWHM = new HashMap();
    static Locale zzWHL = zzXKq();

    private static Locale zzXKq() {
        if (TranslateLanguage.ENGLISH.equalsIgnoreCase(Locale.getDefault().getLanguage())) {
            return Locale.getDefault();
        }
        Locale[] availableLocales = Locale.getAvailableLocales();
        for (int i = 0; i != availableLocales.length; i++) {
            if (TranslateLanguage.ENGLISH.equalsIgnoreCase(availableLocales[i].getLanguage())) {
                return availableLocales[i];
            }
        }
        return Locale.getDefault();
    }

    public static Date zzY(Date date) throws ParseException {
        Locale locale = Locale.getDefault();
        if (locale == null) {
            return date;
        }
        Map map = zzWHM;
        synchronized (map) {
            try {
                Long lValueOf = (Long) map.get(locale);
                if (lValueOf == null) {
                    long time = new SimpleDateFormat("yyyyMMddHHmmssz").parse("19700101000000GMT+00:00").getTime();
                    lValueOf = time == 0 ? zzWHN : Long.valueOf(time);
                    map.put(locale, lValueOf);
                }
                if (lValueOf != zzWHN) {
                    return new Date(date.getTime() - lValueOf.longValue());
                }
                return date;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
