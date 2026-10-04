package com.google.android.gms.internal.mlkit_translate;

import OooO0O0.OooO00o;
import android.util.Log;
import com.microsoft.identity.common.internal.providers.oauth2.ResponseType;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.OooOOO0;
import okhttp3.Headers;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;

/* JADX INFO: loaded from: classes7.dex */
public final class zztz {
    private static final MediaType zzb;
    public final zzua zza;
    private final OkHttpClient zzc;
    private zzuh zzd;
    private final zzue zze;
    private final String zzf;

    static {
        MediaType.f124148OooO0o0.getClass();
        zzb = MediaType.Companion.OooO0O0("application/json; charset=utf-8");
    }

    public zztz(zzua zzuaVar, zzue zzueVar) {
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        builder.OooO00o(10000L, timeUnit);
        builder.OooO0OO(10000L, timeUnit);
        builder.OooO0o0(10000L, timeUnit);
        this.zzc = new OkHttpClient(builder);
        this.zza = zzuaVar;
        this.zze = zzueVar;
        this.zzd = null;
        this.zzf = "https://firebaseinstallations.googleapis.com/v1";
    }

    private static long zze(long j, String str) {
        return (Long.parseLong(str.replaceFirst("s$", "")) * 1000) + j;
    }

    private final String zzf(Headers headers, String str, String str2, zzud zzudVar, zzud zzudVar2) {
        String strString;
        RequestBody body = RequestBody.create(zzb, str2);
        Request.Builder builder = new Request.Builder();
        OooOOO0.OooO0oO(headers, "headers");
        builder.f124246OooO0OO = headers.OooO0o0();
        builder.OooO0o(str);
        OooOOO0.OooO0oO(body, "body");
        builder.OooO0Oo("POST", body);
        try {
            Response responseExecute = this.zzc.OooO00o(builder.OooO0O0()).execute();
            int i = responseExecute.f124259OooOoO;
            zzudVar2.zzf(i);
            ResponseBody responseBody = responseExecute.f124262OooOoo;
            if (i >= 200 && i < 300) {
                try {
                    try {
                        String strString2 = responseBody.string();
                        responseBody.close();
                        return strString2;
                    } finally {
                    }
                } catch (IOException e) {
                    Log.e("MLKitFbInstsRestClient", "Error retrieving response body from HTTPS POST request to <" + str + ">", e);
                    zzsi zzsiVar = zzsi.RPC_ERROR;
                    zzudVar2.zzd(zzsiVar);
                    zzudVar.zzb(zzsiVar);
                    return null;
                }
            }
            Log.e("MLKitFbInstsRestClient", "Got HTTP status " + i + " from HTTPS POST request to <" + str + ">");
            try {
                try {
                    strString = responseBody.string();
                    responseBody.close();
                } catch (IOException unused) {
                    strString = "<none>";
                }
                Log.d("MLKitFbInstsRestClient", "HTTP Response Body:\n".concat(String.valueOf(strString)));
                zzsi zzsiVar2 = zzsi.RPC_ERROR;
                zzudVar2.zzd(zzsiVar2);
                zzudVar.zzb(zzsiVar2);
                return null;
            } finally {
                if (responseBody != null) {
                    try {
                        responseBody.close();
                    } catch (Throwable th) {
                        th.addSuppressed(th);
                    }
                }
            }
        } catch (IOException e2) {
            Log.e("MLKitFbInstsRestClient", "Connection error (or timeout) sending HTTPS POST request to <" + str + ">", e2);
            zzsi zzsiVar3 = zzsi.NO_CONNECTION;
            zzudVar2.zzd(zzsiVar3);
            zzudVar.zzb(zzsiVar3);
            return null;
        }
    }

    public final zzuh zza() {
        return this.zzd;
    }

    /* JADX WARN: Not initialized variable reg: 16, insn: 0x012c: MOVE (r6 I:??[OBJECT, ARRAY]) = (r16 I:??[OBJECT, ARRAY]), block:B:13:0x012c */
    public final /* synthetic */ boolean zzb(zztw zztwVar, zzud zzudVar) throws Throwable {
        boolean z;
        zzud zzudVar2;
        zzce zzceVarZzb;
        zzud zzudVar3;
        zzce zzceVar;
        String strOooO0O0 = OooO00o.OooO0O0(this.zzf, "/projects/", this.zza.zzc(), "/installations");
        Headers.Builder builder = new Headers.Builder();
        builder.OooO00o("x-goog-api-key", this.zza.zza());
        Headers headersOooO0OO = builder.OooO0OO();
        String strOooO00o = androidx.core.database.OooO00o.OooO00o("{fid: '", zztwVar.zza(), "', appId: '", this.zza.zzb(), "', authVersion: 'FIS_v2', sdkVersion: 'o:a:mlkit:1.0.0'}");
        long jCurrentTimeMillis = System.currentTimeMillis();
        zzud zzudVar4 = new zzud();
        zzudVar4.zzg();
        String strZzf = zzf(headersOooO0OO, strOooO0O0, strOooO00o, zzudVar, zzudVar4);
        zzudVar4.zze();
        try {
            if (strZzf == null) {
                z = false;
            } else {
                try {
                    try {
                        zzceVarZzb = zzcg.zzb(strZzf).zzb();
                    } catch (Throwable th) {
                        th = th;
                        zzudVar4 = zzudVar2;
                    }
                } catch (zzci e) {
                    e = e;
                    Log.e("MLKitFbInstsRestClient", "Error parsing JSON object returned from <" + strOooO0O0 + ">:\n" + strZzf, e);
                    zzsi zzsiVar = zzsi.RPC_RETURNED_MALFORMED_RESULT;
                    zzudVar4.zzd(zzsiVar);
                    zzudVar.zzb(zzsiVar);
                    z = false;
                    this.zze.zza(zzoq.INSTALLATION_ID_FIS_CREATE_INSTALLATION, zzudVar4);
                    return z;
                } catch (IllegalStateException e2) {
                    e = e2;
                    Log.e("MLKitFbInstsRestClient", "Error parsing JSON object returned from <" + strOooO0O0 + ">:\n" + strZzf, e);
                    zzsi zzsiVar2 = zzsi.RPC_RETURNED_MALFORMED_RESULT;
                    zzudVar4.zzd(zzsiVar2);
                    zzudVar.zzb(zzsiVar2);
                    z = false;
                    this.zze.zza(zzoq.INSTALLATION_ID_FIS_CREATE_INSTALLATION, zzudVar4);
                    return z;
                } catch (NullPointerException e3) {
                    e = e3;
                    Log.e("MLKitFbInstsRestClient", "Error parsing JSON object returned from <" + strOooO0O0 + ">:\n" + strZzf, e);
                    zzsi zzsiVar22 = zzsi.RPC_RETURNED_MALFORMED_RESULT;
                    zzudVar4.zzd(zzsiVar22);
                    zzudVar.zzb(zzsiVar22);
                    z = false;
                    this.zze.zza(zzoq.INSTALLATION_ID_FIS_CREATE_INSTALLATION, zzudVar4);
                    return z;
                }
                try {
                    String strZze = zzceVarZzb.zzd("name").zze();
                    zzudVar3 = zzudVar4;
                    try {
                        zztw zztwVar2 = new zztw(zzceVarZzb.zzd("fid").zze());
                        String strZze2 = zzceVarZzb.zzd("refreshToken").zze();
                        zzce zzceVarZzc = zzceVarZzb.zzc("authToken");
                        zzceVar = zzceVarZzb;
                        try {
                            String strZze3 = zzceVarZzc.zzd(ResponseType.TOKEN).zze();
                            String strZze4 = zzceVarZzc.zzd("expiresIn").zze();
                            long jZze = zze(jCurrentTimeMillis, strZze4);
                            Log.i("MLKitFbInstsRestClient", "installation name: " + strZze);
                            Log.d("MLKitFbInstsRestClient", "fid: " + zztwVar2.zza());
                            Log.d("MLKitFbInstsRestClient", "refresh_token: " + strZze2);
                            Log.d("MLKitFbInstsRestClient", "auth token: ".concat(String.valueOf(zzceVarZzc)));
                            Log.d("MLKitFbInstsRestClient", "auth token expires in: " + strZze4);
                            Log.d("MLKitFbInstsRestClient", "auth token expiry: " + jZze);
                            this.zzd = new zzuh(zztwVar2, strZze2, strZze3, jZze);
                            z = true;
                            zzudVar4 = zzudVar3;
                        } catch (ClassCastException e4) {
                            e = e4;
                            Log.e("MLKitFbInstsRestClient", "Error traversing JSON object returned from url <" + strOooO0O0 + ">:\nraw json:\n" + strZzf + "\nparsed json:\n" + zzceVar.toString(), e);
                            zzsi zzsiVar3 = zzsi.RPC_RETURNED_INVALID_RESULT;
                            zzudVar4 = zzudVar3;
                            zzudVar4.zzd(zzsiVar3);
                            zzudVar.zzb(zzsiVar3);
                            z = false;
                        } catch (IllegalStateException e5) {
                            e = e5;
                            Log.e("MLKitFbInstsRestClient", "Error traversing JSON object returned from url <" + strOooO0O0 + ">:\nraw json:\n" + strZzf + "\nparsed json:\n" + zzceVar.toString(), e);
                            zzsi zzsiVar32 = zzsi.RPC_RETURNED_INVALID_RESULT;
                            zzudVar4 = zzudVar3;
                            zzudVar4.zzd(zzsiVar32);
                            zzudVar.zzb(zzsiVar32);
                            z = false;
                        } catch (NullPointerException e6) {
                            e = e6;
                            Log.e("MLKitFbInstsRestClient", "Error traversing JSON object returned from url <" + strOooO0O0 + ">:\nraw json:\n" + strZzf + "\nparsed json:\n" + zzceVar.toString(), e);
                            zzsi zzsiVar322 = zzsi.RPC_RETURNED_INVALID_RESULT;
                            zzudVar4 = zzudVar3;
                            zzudVar4.zzd(zzsiVar322);
                            zzudVar.zzb(zzsiVar322);
                            z = false;
                        }
                    } catch (ClassCastException e7) {
                        e = e7;
                        zzceVar = zzceVarZzb;
                        Log.e("MLKitFbInstsRestClient", "Error traversing JSON object returned from url <" + strOooO0O0 + ">:\nraw json:\n" + strZzf + "\nparsed json:\n" + zzceVar.toString(), e);
                        zzsi zzsiVar3222 = zzsi.RPC_RETURNED_INVALID_RESULT;
                        zzudVar4 = zzudVar3;
                        zzudVar4.zzd(zzsiVar3222);
                        zzudVar.zzb(zzsiVar3222);
                        z = false;
                        this.zze.zza(zzoq.INSTALLATION_ID_FIS_CREATE_INSTALLATION, zzudVar4);
                        return z;
                    } catch (IllegalStateException e8) {
                        e = e8;
                        zzceVar = zzceVarZzb;
                        Log.e("MLKitFbInstsRestClient", "Error traversing JSON object returned from url <" + strOooO0O0 + ">:\nraw json:\n" + strZzf + "\nparsed json:\n" + zzceVar.toString(), e);
                        zzsi zzsiVar32222 = zzsi.RPC_RETURNED_INVALID_RESULT;
                        zzudVar4 = zzudVar3;
                        zzudVar4.zzd(zzsiVar32222);
                        zzudVar.zzb(zzsiVar32222);
                        z = false;
                        this.zze.zza(zzoq.INSTALLATION_ID_FIS_CREATE_INSTALLATION, zzudVar4);
                        return z;
                    } catch (NullPointerException e9) {
                        e = e9;
                        zzceVar = zzceVarZzb;
                        Log.e("MLKitFbInstsRestClient", "Error traversing JSON object returned from url <" + strOooO0O0 + ">:\nraw json:\n" + strZzf + "\nparsed json:\n" + zzceVar.toString(), e);
                        zzsi zzsiVar322222 = zzsi.RPC_RETURNED_INVALID_RESULT;
                        zzudVar4 = zzudVar3;
                        zzudVar4.zzd(zzsiVar322222);
                        zzudVar.zzb(zzsiVar322222);
                        z = false;
                        this.zze.zza(zzoq.INSTALLATION_ID_FIS_CREATE_INSTALLATION, zzudVar4);
                        return z;
                    }
                } catch (ClassCastException e10) {
                    e = e10;
                    zzudVar3 = zzudVar4;
                    zzceVar = zzceVarZzb;
                    Log.e("MLKitFbInstsRestClient", "Error traversing JSON object returned from url <" + strOooO0O0 + ">:\nraw json:\n" + strZzf + "\nparsed json:\n" + zzceVar.toString(), e);
                    zzsi zzsiVar3222222 = zzsi.RPC_RETURNED_INVALID_RESULT;
                    zzudVar4 = zzudVar3;
                    zzudVar4.zzd(zzsiVar3222222);
                    zzudVar.zzb(zzsiVar3222222);
                    z = false;
                    this.zze.zza(zzoq.INSTALLATION_ID_FIS_CREATE_INSTALLATION, zzudVar4);
                    return z;
                } catch (IllegalStateException e11) {
                    e = e11;
                    zzudVar3 = zzudVar4;
                    zzceVar = zzceVarZzb;
                    Log.e("MLKitFbInstsRestClient", "Error traversing JSON object returned from url <" + strOooO0O0 + ">:\nraw json:\n" + strZzf + "\nparsed json:\n" + zzceVar.toString(), e);
                    zzsi zzsiVar32222222 = zzsi.RPC_RETURNED_INVALID_RESULT;
                    zzudVar4 = zzudVar3;
                    zzudVar4.zzd(zzsiVar32222222);
                    zzudVar.zzb(zzsiVar32222222);
                    z = false;
                    this.zze.zza(zzoq.INSTALLATION_ID_FIS_CREATE_INSTALLATION, zzudVar4);
                    return z;
                } catch (NullPointerException e12) {
                    e = e12;
                    zzudVar3 = zzudVar4;
                    zzceVar = zzceVarZzb;
                    Log.e("MLKitFbInstsRestClient", "Error traversing JSON object returned from url <" + strOooO0O0 + ">:\nraw json:\n" + strZzf + "\nparsed json:\n" + zzceVar.toString(), e);
                    zzsi zzsiVar322222222 = zzsi.RPC_RETURNED_INVALID_RESULT;
                    zzudVar4 = zzudVar3;
                    zzudVar4.zzd(zzsiVar322222222);
                    zzudVar.zzb(zzsiVar322222222);
                    z = false;
                    this.zze.zza(zzoq.INSTALLATION_ID_FIS_CREATE_INSTALLATION, zzudVar4);
                    return z;
                } catch (Throwable th2) {
                    th = th2;
                    this.zze.zza(zzoq.INSTALLATION_ID_FIS_CREATE_INSTALLATION, zzudVar4);
                    throw th;
                }
            }
            this.zze.zza(zzoq.INSTALLATION_ID_FIS_CREATE_INSTALLATION, zzudVar4);
            return z;
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public final boolean zzc(final zzud zzudVar) throws InterruptedException {
        if (this.zzd == null) {
            return false;
        }
        boolean zZza = zzwh.zza(new zzwg() { // from class: com.google.android.gms.internal.mlkit_translate.zztx
            @Override // com.google.android.gms.internal.mlkit_translate.zzwg
            public final boolean zza() {
                return this.zza.zzd(zzudVar);
            }
        });
        if (!zZza) {
            zzudVar.zzc(zzsi.RPC_EXPONENTIAL_BACKOFF_FAILED);
        }
        return zZza;
    }

    public final boolean zzd(zzud zzudVar) {
        zzce zzceVarZzb;
        boolean z;
        String str = this.zzf + "/projects/" + this.zza.zzc() + "/installations/" + this.zzd.zzb().zza() + "/authTokens:generate";
        Headers.Builder builder = new Headers.Builder();
        builder.OooO00o("authorization", "FIS_v2 ".concat(String.valueOf(this.zzd.zzc())));
        builder.OooO00o("x-goog-api-key", this.zza.zza());
        Headers headersOooO0OO = builder.OooO0OO();
        long jCurrentTimeMillis = System.currentTimeMillis();
        zzud zzudVar2 = new zzud();
        zzudVar2.zzg();
        String strZzf = zzf(headersOooO0OO, str, "{installation:{sdkVersion:'o:a:mlkit:1.0.0'}}", zzudVar, zzudVar2);
        zzudVar2.zze();
        if (strZzf == null) {
            z = false;
        } else {
            try {
                try {
                    zzceVarZzb = zzcg.zzb(strZzf).zzb();
                } catch (zzci e) {
                    Log.e("MLKitFbInstsRestClient", "Error parsing JSON object returned from <" + str + ">:\n" + strZzf, e);
                    zzsi zzsiVar = zzsi.RPC_RETURNED_MALFORMED_RESULT;
                    zzudVar2.zzd(zzsiVar);
                    zzudVar.zzb(zzsiVar);
                }
                try {
                    String strZze = zzceVarZzb.zzd(ResponseType.TOKEN).zze();
                    String strZze2 = zzceVarZzb.zzd("expiresIn").zze();
                    long jZze = zze(jCurrentTimeMillis, strZze2);
                    Log.d("MLKitFbInstsRestClient", "refreshed auth token: " + strZze);
                    Log.d("MLKitFbInstsRestClient", "auth token expires in: " + strZze2);
                    Log.d("MLKitFbInstsRestClient", "auth token expiry: " + jZze);
                    this.zzd = new zzuh(this.zzd.zzb(), this.zzd.zzc(), strZze, jZze);
                    z = true;
                } catch (ClassCastException | IllegalStateException | NullPointerException e2) {
                    zzsi zzsiVar2 = zzsi.RPC_RETURNED_INVALID_RESULT;
                    zzudVar2.zzd(zzsiVar2);
                    zzudVar.zzb(zzsiVar2);
                    Log.e("MLKitFbInstsRestClient", "Error traversing JSON object returned from <" + str + ">:\nraw json:\n" + strZzf + "\nparsed json:\n" + zzceVarZzb.toString(), e2);
                    z = false;
                }
            } finally {
                this.zze.zza(zzoq.INSTALLATION_ID_FIS_GENERATE_AUTH_TOKEN, zzudVar2);
            }
        }
        return z;
    }
}
