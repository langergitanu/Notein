package com.google.firebase.iid;

import OooOO0.OooO0OO;
import OooOo.OooO00o;
import Oooo0oO.C21036OooOOo0;
import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Log;
import androidx.core.content.ContextCompat;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.microsoft.identity.common.internal.providers.oauth2.ResponseType;
import java.io.File;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
class Store {
    final Context context;
    final SharedPreferences store;
    private final Map<String, Long> subtypeCreationTimes = new OooO00o();

    public static class Token {
        private static final long REFRESH_PERIOD_MILLIS = TimeUnit.DAYS.toMillis(7);
        final String appVersion;
        final long timestamp;
        final String token;

        private Token(String str, String str2, long j) {
            this.token = str;
            this.appVersion = str2;
            this.timestamp = j;
        }

        public static String encode(String str, String str2, long j) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(ResponseType.TOKEN, str);
                jSONObject.put(RemoteConfigConstants.RequestFieldKey.APP_VERSION, str2);
                jSONObject.put("timestamp", j);
                return jSONObject.toString();
            } catch (JSONException e) {
                String strValueOf = String.valueOf(e);
                StringBuilder sb = new StringBuilder(strValueOf.length() + 24);
                sb.append("Failed to encode token: ");
                sb.append(strValueOf);
                Log.w("FirebaseInstanceId", sb.toString());
                return null;
            }
        }

        public static String getTokenOrNull(Token token) {
            if (token == null) {
                return null;
            }
            return token.token;
        }

        public static Token parse(String str) {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            if (!str.startsWith("{")) {
                return new Token(str, null, 0L);
            }
            try {
                JSONObject jSONObject = new JSONObject(str);
                return new Token(jSONObject.getString(ResponseType.TOKEN), jSONObject.getString(RemoteConfigConstants.RequestFieldKey.APP_VERSION), jSONObject.getLong("timestamp"));
            } catch (JSONException e) {
                String strValueOf = String.valueOf(e);
                StringBuilder sb = new StringBuilder(strValueOf.length() + 23);
                sb.append("Failed to parse token: ");
                sb.append(strValueOf);
                Log.w("FirebaseInstanceId", sb.toString());
                return null;
            }
        }

        public boolean needsRefresh(String str) {
            return System.currentTimeMillis() > this.timestamp + REFRESH_PERIOD_MILLIS || !str.equals(this.appVersion);
        }
    }

    public Store(Context context) {
        this.context = context;
        this.store = context.getSharedPreferences("com.google.android.gms.appid", 0);
        checkForRestore("com.google.android.gms.appid-no-backup");
    }

    private void checkForRestore(String str) {
        File file = new File(ContextCompat.getNoBackupFilesDir(this.context), "com.google.android.gms.appid-no-backup");
        if (file.exists()) {
            return;
        }
        try {
            if (!file.createNewFile() || isEmpty()) {
                return;
            }
            Log.i("FirebaseInstanceId", "App restored, clearing state");
            deleteAll();
        } catch (IOException e) {
            if (Log.isLoggable("FirebaseInstanceId", 3)) {
                String strValueOf = String.valueOf(e.getMessage());
                Log.d("FirebaseInstanceId", strValueOf.length() != 0 ? "Error creating file in no backup dir: ".concat(strValueOf) : new String("Error creating file in no backup dir: "));
            }
        }
    }

    public static String createSubtypeInfoKey(String str, String str2) {
        return androidx.concurrent.futures.OooO00o.OooO0OO(new StringBuilder(String.valueOf(str).length() + 6), str, "|S|cre");
    }

    private String createTokenKey(String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder(C21036OooOOo0.OooO00o(String.valueOf(str).length(), 4, String.valueOf(str2).length(), String.valueOf(str3).length()));
        OooO0OO.OooO0o0(sb, str, "|T|", str2, "|");
        sb.append(str3);
        return sb.toString();
    }

    private long getCreationTimeFromSharedPreferences(String str) {
        String string = this.store.getString(createSubtypeInfoKey(str, "cre"), null);
        if (string == null) {
            return 0L;
        }
        try {
            return Long.parseLong(string);
        } catch (NumberFormatException unused) {
            return 0L;
        }
    }

    private long writeCreationTimeToSharedPreferences(String str) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (this.store.contains(createSubtypeInfoKey(str, "cre"))) {
            return getCreationTimeFromSharedPreferences(str);
        }
        SharedPreferences.Editor editorEdit = this.store.edit();
        editorEdit.putString(createSubtypeInfoKey(str, "cre"), String.valueOf(jCurrentTimeMillis));
        editorEdit.commit();
        return jCurrentTimeMillis;
    }

    public synchronized void deleteAll() {
        this.subtypeCreationTimes.clear();
        this.store.edit().clear().commit();
    }

    public synchronized void deleteToken(String str, String str2, String str3) {
        String strCreateTokenKey = createTokenKey(str, str2, str3);
        SharedPreferences.Editor editorEdit = this.store.edit();
        editorEdit.remove(strCreateTokenKey);
        editorEdit.commit();
    }

    public synchronized long getCreationTime(String str) {
        Long l = this.subtypeCreationTimes.get(str);
        if (l != null) {
            return l.longValue();
        }
        return getCreationTimeFromSharedPreferences(str);
    }

    public synchronized Token getToken(String str, String str2, String str3) {
        return Token.parse(this.store.getString(createTokenKey(str, str2, str3), null));
    }

    public synchronized boolean isEmpty() {
        return this.store.getAll().isEmpty();
    }

    public synchronized void saveToken(String str, String str2, String str3, String str4, String str5) {
        String strEncode = Token.encode(str4, str5, System.currentTimeMillis());
        if (strEncode == null) {
            return;
        }
        SharedPreferences.Editor editorEdit = this.store.edit();
        editorEdit.putString(createTokenKey(str, str2, str3), strEncode);
        editorEdit.commit();
    }

    public synchronized long setCreationTime(String str) {
        long jWriteCreationTimeToSharedPreferences;
        jWriteCreationTimeToSharedPreferences = writeCreationTimeToSharedPreferences(str);
        this.subtypeCreationTimes.put(str, Long.valueOf(jWriteCreationTimeToSharedPreferences));
        return jWriteCreationTimeToSharedPreferences;
    }
}
