package com.google.android.gms.internal.p624firebaseauthapi;

import com.microsoft.identity.common.java.cache.CacheKeyValueDelegate;
import java.util.Locale;

/* JADX INFO: loaded from: classes7.dex */
public final class zzafd {
    public static String zza() {
        Locale locale = Locale.getDefault();
        StringBuilder sb = new StringBuilder();
        zza(sb, locale);
        Locale locale2 = Locale.US;
        if (!locale.equals(locale2)) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            zza(sb, locale2);
        }
        return sb.toString();
    }

    private static void zza(StringBuilder sb, Locale locale) {
        String language = locale.getLanguage();
        if (language != null) {
            sb.append(language);
            String country = locale.getCountry();
            if (country != null) {
                sb.append(CacheKeyValueDelegate.CACHE_VALUE_SEPARATOR);
                sb.append(country);
            }
        }
    }
}
