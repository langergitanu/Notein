package com.google.mlkit.p567nl.translate.internal;

import Oooo0oO.o0Oo0oo;
import com.google.android.gms.internal.mlkit_translate.zzt;
import com.google.mlkit.p567nl.translate.TranslateLanguage;
import com.huawei.hms.network.embedded.C18115b5;
import com.microsoft.identity.common.java.eststelemetry.PublicApiId;
import java.util.Arrays;

/* JADX INFO: loaded from: classes8.dex */
public final class zzac {
    public static final /* synthetic */ int zza = 0;
    private static final zzt zzb = zzt.zzl("merged_dict_%1$s_%2$s_update.bin", "merged_dict_%1$s_%2$s_both.bin", "merged_dict_%1$s_%2$s_from_%3$s.bin", "merged_dict_%1$s_%2$s_from_%4$s.bin");

    public static zzt zza(String str) {
        String[] strArrZzd = zzd(str);
        int i = 0;
        String str2 = strArrZzd[0];
        String str3 = strArrZzd[1];
        String[] strArr = new String[zzb.size()];
        while (true) {
            zzt zztVar = zzb;
            if (i >= zztVar.size()) {
                return zzt.zzh(strArr);
            }
            strArr[i] = String.format((String) zztVar.get(i), str, PublicApiId.SINGLE_ACCOUNT_PCA_ACQUIRE_TOKEN_SILENT_WITH_SCOPES_AUTHORITY, str2, str3);
            i++;
        }
    }

    public static String zzb(String str) {
        return zzc(TranslateLanguage.ENGLISH, TranslateLanguage.zza(str));
    }

    public static String zzc(String str, String str2) {
        if ((!str.equals(TranslateLanguage.ENGLISH) && !str2.equals(TranslateLanguage.ENGLISH)) || str.equals(str2)) {
            throw new IllegalArgumentException();
        }
        String[] strArr = {str, str2};
        Arrays.sort(strArr);
        return o0Oo0oo.OooO0Oo(strArr[0], C18115b5.CONNECTOR, strArr[1]);
    }

    public static String[] zzd(String str) {
        if (str.matches("[a-z]{2,3}_[a-z]{2,3}")) {
            return str.split(C18115b5.CONNECTOR, -1);
        }
        throw new IllegalArgumentException("Model name expected to be matching [a-z]{2,3}_[a-z]{2,3}");
    }
}
