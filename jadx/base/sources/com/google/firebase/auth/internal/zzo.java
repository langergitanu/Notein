package com.google.firebase.auth.internal;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import java.util.Iterator;

/* JADX INFO: loaded from: classes8.dex */
public final class zzo {
    private static zzo zza = new zzo();

    private zzo() {
    }

    private static SharedPreferences zza(Context context, String str) {
        return context.getSharedPreferences("com.google.firebase.auth.internal.browserSignInSessionStore." + str, 0);
    }

    public final synchronized String zzb(Context context, String str, String str2) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        SharedPreferences sharedPreferencesZza = zza(context, str);
        String str3 = "com.google.firebase.auth.internal.EVENT_ID." + str2 + ".OPERATION";
        String string = sharedPreferencesZza.getString(str3, null);
        String str4 = "com.google.firebase.auth.internal.EVENT_ID." + str2 + ".FIREBASE_APP_NAME";
        String string2 = sharedPreferencesZza.getString(str4, null);
        SharedPreferences.Editor editorEdit = sharedPreferencesZza.edit();
        editorEdit.remove(str3);
        editorEdit.remove(str4);
        editorEdit.apply();
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        return string2;
    }

    public final synchronized zzr zza(Context context, String str, String str2) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        SharedPreferences sharedPreferencesZza = zza(context, str);
        String str3 = "com.google.firebase.auth.internal.EVENT_ID." + str2 + ".SESSION_ID";
        String str4 = "com.google.firebase.auth.internal.EVENT_ID." + str2 + ".OPERATION";
        String str5 = "com.google.firebase.auth.internal.EVENT_ID." + str2 + ".PROVIDER_ID";
        String str6 = "com.google.firebase.auth.internal.EVENT_ID." + str2 + ".FIREBASE_APP_NAME";
        String string = sharedPreferencesZza.getString(str3, null);
        String string2 = sharedPreferencesZza.getString(str4, null);
        String string3 = sharedPreferencesZza.getString(str5, null);
        String string4 = sharedPreferencesZza.getString("com.google.firebase.auth.api.gms.config.tenant.id", null);
        String string5 = sharedPreferencesZza.getString(str6, null);
        SharedPreferences.Editor editorEdit = sharedPreferencesZza.edit();
        editorEdit.remove(str3);
        editorEdit.remove(str4);
        editorEdit.remove(str5);
        editorEdit.remove(str6);
        editorEdit.apply();
        if (string == null || string2 == null || string3 == null) {
            return null;
        }
        return new zzr(string, string2, string3, string4, string5);
    }

    public static zzo zza() {
        return zza;
    }

    private static void zza(SharedPreferences sharedPreferences) {
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        Iterator<String> it = sharedPreferences.getAll().keySet().iterator();
        while (it.hasNext()) {
            editorEdit.remove(it.next());
        }
        editorEdit.apply();
    }

    public final synchronized void zza(Context context, String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        Preconditions.checkNotEmpty(str3);
        Preconditions.checkNotEmpty(str7);
        SharedPreferences sharedPreferencesZza = zza(context, str);
        zza(sharedPreferencesZza);
        SharedPreferences.Editor editorEdit = sharedPreferencesZza.edit();
        editorEdit.putString("com.google.firebase.auth.internal.EVENT_ID." + str2 + ".SESSION_ID", str3);
        editorEdit.putString("com.google.firebase.auth.internal.EVENT_ID." + str2 + ".OPERATION", str4);
        editorEdit.putString("com.google.firebase.auth.internal.EVENT_ID." + str2 + ".PROVIDER_ID", str5);
        editorEdit.putString("com.google.firebase.auth.internal.EVENT_ID." + str2 + ".FIREBASE_APP_NAME", str7);
        editorEdit.putString("com.google.firebase.auth.api.gms.config.tenant.id", str6);
        editorEdit.apply();
    }

    public final synchronized void zza(Context context, String str, String str2, String str3, String str4) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        SharedPreferences sharedPreferencesZza = zza(context, str);
        zza(sharedPreferencesZza);
        SharedPreferences.Editor editorEdit = sharedPreferencesZza.edit();
        editorEdit.putString("com.google.firebase.auth.internal.EVENT_ID." + str2 + ".OPERATION", str3);
        editorEdit.putString("com.google.firebase.auth.internal.EVENT_ID." + str2 + ".FIREBASE_APP_NAME", str4);
        editorEdit.apply();
    }
}
