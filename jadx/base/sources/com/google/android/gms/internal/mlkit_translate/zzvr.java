package com.google.android.gms.internal.mlkit_translate;

import Oooo0oO.C21111o0ooOoO;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.util.Log;
import com.google.android.gms.common.util.AndroidUtilsLight;
import com.google.android.gms.common.util.Hex;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
final class zzvr {
    private static final Pattern zza = Pattern.compile("^[^:]+:([0-9]+):(android|ios|web):([0-9a-f]+)");
    private final Context zzb;
    private final String zzc;
    private final String zzd;
    private final String zze;
    private final zzwb zzf;

    public zzvr(Context context, String str, String str2, String str3, long j, long j2, zzwb zzwbVar) {
        this.zzb = context;
        this.zzc = str;
        this.zzd = str2;
        Matcher matcher = zza.matcher(str);
        this.zze = matcher.matches() ? matcher.group(1) : null;
        this.zzf = zzwbVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:140:0x0472  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00a9 A[LOOP:0: B:13:0x00a3->B:15:0x00a9, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0135  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final zzvt zza(HttpURLConnection httpURLConnection, String str, String str2, Map map, String str3, Map map2, Date date, String str4, String str5, zzud zzudVar) throws zzwa {
        String strBytesToStringUppercase;
        InputStream errorStream;
        JSONObject jSONObject;
        JSONArray jSONArray;
        zzvt zzvtVarZzc;
        PackageInfo packageInfo;
        byte[] packageCertificateHashBytes;
        httpURLConnection.setDoOutput(true);
        TimeUnit timeUnit = TimeUnit.SECONDS;
        httpURLConnection.setConnectTimeout((int) timeUnit.toMillis(5L));
        httpURLConnection.setReadTimeout((int) timeUnit.toMillis(5L));
        httpURLConnection.setRequestProperty("If-None-Match", null);
        httpURLConnection.setRequestProperty("X-Goog-Api-Key", this.zzd);
        httpURLConnection.setRequestProperty("X-Android-Package", this.zzb.getPackageName());
        try {
            Context context = this.zzb;
            packageCertificateHashBytes = AndroidUtilsLight.getPackageCertificateHashBytes(context, context.getPackageName());
        } catch (PackageManager.NameNotFoundException e) {
            Log.e("MLKitRemoteConfigFetch", "No such package: ".concat(String.valueOf(this.zzb.getPackageName())), e);
        }
        if (packageCertificateHashBytes == null) {
            Log.e("MLKitRemoteConfigFetch", "Could not get fingerprint hash for package: " + this.zzb.getPackageName());
            strBytesToStringUppercase = null;
            httpURLConnection.setRequestProperty("X-Android-Cert", strBytesToStringUppercase);
            httpURLConnection.setRequestProperty("X-Google-GFE-Can-Retry", "yes");
            httpURLConnection.setRequestProperty("Content-Type", "application/json");
            httpURLConnection.setRequestProperty("Accept", "application/json");
            for (Map.Entry entry : ((zzw) map2).entrySet()) {
                httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
            }
            if (Log.isLoggable("MLKitRemoteConfigFetch", 3)) {
                for (Map.Entry<String, List<String>> entry2 : httpURLConnection.getRequestProperties().entrySet()) {
                    String key = entry2.getKey();
                    if (!zzb.zza(key).contains("api-key") && !zzb.zza(key).contains("android-cert")) {
                        Iterator<String> it = entry2.getValue().iterator();
                        while (it.hasNext()) {
                            Log.d("MLKitRemoteConfigFetch", "HTTP Request Header: " + key + ": " + it.next());
                        }
                    }
                }
            }
            HashMap map3 = new HashMap();
            if (str != null) {
                throw new zzvz("Fetch failed: Firebase instance id is null.");
            }
            map3.put(RemoteConfigConstants.RequestFieldKey.INSTANCE_ID, str);
            map3.put(RemoteConfigConstants.RequestFieldKey.INSTANCE_ID_TOKEN, str2);
            map3.put(RemoteConfigConstants.RequestFieldKey.APP_ID, this.zzc);
            Locale locale = this.zzb.getResources().getConfiguration().locale;
            map3.put("countryCode", locale.getCountry());
            map3.put("languageCode", locale.toString());
            map3.put(RemoteConfigConstants.RequestFieldKey.PLATFORM_VERSION, Integer.toString(Build.VERSION.SDK_INT));
            map3.put(RemoteConfigConstants.RequestFieldKey.TIME_ZONE, TimeZone.getDefault().getID());
            try {
                packageInfo = this.zzb.getPackageManager().getPackageInfo(this.zzb.getPackageName(), 0);
            } catch (PackageManager.NameNotFoundException unused) {
            }
            String str6 = packageInfo != null ? packageInfo.versionName : null;
            String strOooO0Oo = C21111o0ooOoO.OooO0Oo(str6, "-MLKit-null");
            Log.d("MLKitRemoteConfigFetch", "APP_VERSION: ".concat(strOooO0Oo));
            map3.put(RemoteConfigConstants.RequestFieldKey.APP_VERSION, strOooO0Oo);
            map3.put("packageName", this.zzb.getPackageName());
            map3.put(RemoteConfigConstants.RequestFieldKey.SDK_VERSION, "o:a:mlkit:1.0.0");
            map3.put(RemoteConfigConstants.RequestFieldKey.ANALYTICS_USER_PROPERTIES, new JSONObject(map));
            JSONObject jSONObject2 = new JSONObject(map3);
            if (Log.isLoggable("MLKitRemoteConfigFetch", 3)) {
                JSONObject jSONObject3 = new JSONObject();
                Iterator<String> itKeys = jSONObject2.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    try {
                        jSONObject3.put(next, jSONObject2.get(next));
                    } catch (JSONException e2) {
                        throw new IllegalStateException("shallowCopyJsonObject: concurrent mutation?", e2);
                    }
                }
                jSONObject3.remove(RemoteConfigConstants.RequestFieldKey.INSTANCE_ID_TOKEN);
                Log.d("MLKitRemoteConfigFetch", "HTTP Request Body: ".concat(jSONObject3.toString()));
            }
            byte[] bytes = jSONObject2.toString().getBytes(StandardCharsets.UTF_8);
            zzud zzudVar2 = new zzud();
            zzudVar2.zzg();
            try {
                Log.d("MLKitRemoteConfigFetch", "Getting remote config");
                Log.d("MLKitRemoteConfigFetch", "Connecting: ".concat(String.valueOf(httpURLConnection)));
                try {
                    httpURLConnection.setFixedLengthStreamingMode(bytes.length);
                    BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(httpURLConnection.getOutputStream());
                    bufferedOutputStream.write(bytes);
                    bufferedOutputStream.flush();
                    bufferedOutputStream.close();
                    httpURLConnection.connect();
                    int responseCode = httpURLConnection.getResponseCode();
                    try {
                        zzudVar2.zzf(responseCode);
                        Log.d("MLKitRemoteConfigFetch", "Remote config: got response code " + responseCode);
                        if (responseCode != 200) {
                            zzsi zzsiVar = zzsi.RPC_ERROR;
                            zzudVar2.zzd(zzsiVar);
                            zzudVar.zzb(zzsiVar);
                            if (Log.isLoggable("MLKitRemoteConfigFetch", 4)) {
                                for (Map.Entry<String, List<String>> entry3 : httpURLConnection.getHeaderFields().entrySet()) {
                                    for (String str7 : entry3.getValue()) {
                                        Log.i("MLKitRemoteConfigFetch", "HTTP Response Header: " + entry3.getKey() + ": " + str7);
                                    }
                                }
                            }
                            if (Log.isLoggable("MLKitRemoteConfigFetch", 5) && (errorStream = httpURLConnection.getErrorStream()) != null) {
                                Scanner scannerUseDelimiter = new Scanner(errorStream).useDelimiter("\\A");
                                if (scannerUseDelimiter.hasNext()) {
                                    Log.w("MLKitRemoteConfigFetch", "HTTP Error Stream: ".concat(String.valueOf(scannerUseDelimiter.next())));
                                }
                            }
                            try {
                                throw new zzwe(responseCode, httpURLConnection.getResponseMessage());
                            } catch (IOException e3) {
                                throw new zzwe(responseCode, "<error reading HTTP response>", e3);
                            }
                        }
                        if (Log.isLoggable("MLKitRemoteConfigFetch", 3)) {
                            for (Map.Entry<String, List<String>> entry4 : httpURLConnection.getHeaderFields().entrySet()) {
                                for (String str8 : entry4.getValue()) {
                                    Log.d("MLKitRemoteConfigFetch", "HTTP Response Header: " + entry4.getKey() + ": " + str8);
                                }
                            }
                        }
                        String headerField = httpURLConnection.getHeaderField("ETag");
                        try {
                            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream(), StandardCharsets.UTF_8));
                            StringBuilder sb = new StringBuilder();
                            while (true) {
                                int i = bufferedReader.read();
                                if (i == -1) {
                                    break;
                                }
                                sb.append((char) i);
                            }
                            JSONObject jSONObject4 = new JSONObject(sb.toString());
                            Log.d("MLKitRemoteConfigFetch", "Remote config: got response ETag: " + headerField);
                            Log.d("MLKitRemoteConfigFetch", "Remote config: got response: " + jSONObject4.toString());
                            Log.d("MLKitRemoteConfigFetch", "Remote config: disconnecting...");
                            httpURLConnection.disconnect();
                            Log.d("MLKitRemoteConfigFetch", "Remote config: disconnected");
                            if (jSONObject4.get("state").equals("NO_CHANGE")) {
                                zzvtVarZzc = zzvt.zzb(date);
                            } else {
                                try {
                                    zzvp zzvpVar = new zzvp(null);
                                    zzvpVar.zzc(date);
                                    try {
                                        jSONObject = jSONObject4.getJSONObject(RemoteConfigConstants.ResponseFieldKey.ENTRIES);
                                    } catch (JSONException unused2) {
                                        jSONObject = null;
                                    }
                                    if (jSONObject != null) {
                                        zzvpVar.zza(jSONObject);
                                    }
                                    try {
                                        jSONArray = jSONObject4.getJSONArray(RemoteConfigConstants.ResponseFieldKey.EXPERIMENT_DESCRIPTIONS);
                                    } catch (JSONException unused3) {
                                        jSONArray = null;
                                    }
                                    if (jSONArray != null) {
                                        zzvpVar.zzb(jSONArray);
                                    }
                                    zzvtVarZzc = zzvt.zzc(zzvpVar.zzd(), headerField);
                                } catch (JSONException e4) {
                                    zzsi zzsiVar2 = zzsi.RPC_RETURNED_INVALID_RESULT;
                                    zzudVar2.zzd(zzsiVar2);
                                    zzudVar.zzb(zzsiVar2);
                                    throw new zzvz("Fetch failed: fetch response could not be parsed.", e4);
                                }
                            }
                            return zzvtVarZzc;
                        } catch (IOException e5) {
                            zzsi zzsiVar3 = zzsi.RPC_ERROR;
                            zzudVar2.zzd(zzsiVar3);
                            zzudVar.zzb(zzsiVar3);
                            throw new zzvz("The client had an error while calling the backend!", e5);
                        } catch (JSONException e6) {
                            zzsi zzsiVar4 = zzsi.RPC_RETURNED_MALFORMED_RESULT;
                            zzudVar2.zzd(zzsiVar4);
                            zzudVar.zzb(zzsiVar4);
                            throw new zzvz("Error parsing the server output", e6);
                        }
                    } catch (Throwable th) {
                        Log.d("MLKitRemoteConfigFetch", "Remote config: disconnecting...");
                        httpURLConnection.disconnect();
                        Log.d("MLKitRemoteConfigFetch", "Remote config: disconnected");
                        throw th;
                    }
                } catch (IOException e7) {
                    zzsi zzsiVar5 = zzsi.NO_CONNECTION;
                    zzudVar2.zzd(zzsiVar5);
                    zzudVar.zzb(zzsiVar5);
                    throw new zzvz("Error connecting to ".concat(String.valueOf(httpURLConnection)), e7);
                }
            } finally {
                zzudVar2.zze();
                this.zzf.zzd(zzudVar2);
            }
        }
        strBytesToStringUppercase = Hex.bytesToStringUppercase(packageCertificateHashBytes, false);
        httpURLConnection.setRequestProperty("X-Android-Cert", strBytesToStringUppercase);
        httpURLConnection.setRequestProperty("X-Google-GFE-Can-Retry", "yes");
        httpURLConnection.setRequestProperty("Content-Type", "application/json");
        httpURLConnection.setRequestProperty("Accept", "application/json");
        while (r0.hasNext()) {
        }
        if (Log.isLoggable("MLKitRemoteConfigFetch", 3)) {
        }
        HashMap map32 = new HashMap();
        if (str != null) {
        }
    }

    public final HttpURLConnection zzb() throws zzwa {
        try {
            return (HttpURLConnection) new URL("https://firebaseremoteconfig.googleapis.com/v1/projects/" + this.zze + "/namespaces/firebase:fetch").openConnection();
        } catch (IOException e) {
            throw new zzwa(e.getMessage());
        }
    }
}
