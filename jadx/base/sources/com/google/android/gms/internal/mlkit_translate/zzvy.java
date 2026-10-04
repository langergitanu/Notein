package com.google.android.gms.internal.mlkit_translate;

import android.content.Context;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import java.io.IOException;
import java.util.Date;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public final class zzvy {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final /* synthetic */ int f67621OooO00o = 0;
    public static final long zza;
    private static final ExecutorService zzb;
    private static zzvy zzc;
    private final Context zzd;
    private final Executor zze;
    private final zzub zzf;
    private final zzvr zzg;
    private volatile zzw zzh;
    private volatile zzw zzi;
    private final Map zzj;
    private final zzwd zzk;
    private final zzwb zzl;

    static {
        Executors.newSingleThreadExecutor();
        zzb = Executors.newSingleThreadExecutor();
        zza = TimeUnit.HOURS.toSeconds(12L);
    }

    private zzvy(Context context, zzub zzubVar, zzwb zzwbVar, zzua zzuaVar) {
        ExecutorService executorService = zzb;
        this.zzj = new TreeMap();
        this.zzd = context.getApplicationContext();
        this.zzf = zzubVar;
        this.zze = executorService;
        this.zzl = zzwbVar;
        this.zzg = new zzvr(context, zzuaVar.zzb(), zzuaVar.zza(), "firebase", 5L, 5L, zzwbVar);
        this.zzk = new zzwd(context);
    }

    public static synchronized zzvy zze(Context context) {
        try {
            if (zzc == null) {
                zzc = new zzvy(context, zzub.zzb(context), new zzwb(context), zzui.zza);
            }
        } catch (Throwable th) {
            throw th;
        }
        return zzc;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static zzw zzj(JSONObject jSONObject) throws JSONException {
        String string;
        zzvu zzvuVar = new zzvu(jSONObject);
        zzv zzvVar = new zzv();
        Iterator<String> itKeys = zzvuVar.zza.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            try {
                String string2 = jSONObject.getString(next);
                if (string2 == null) {
                    string = null;
                } else if (string2.isEmpty()) {
                    string = "";
                } else {
                    string = new JSONObject("{ \"value\": " + string2 + " }").getString("value");
                }
                zzvVar.zza(next, string);
            } catch (JSONException e) {
                Log.e("MLKit RemoteConfigRestC", "Getting JSON string value for remote config key " + next + " failed", e);
                throw e;
            }
        }
        return zzvVar.zzb();
    }

    public final Task zza(final long j) {
        final Date date = new Date(System.currentTimeMillis());
        final zzud zzudVar = new zzud();
        zzudVar.zzg();
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        final boolean z = true;
        this.zze.execute(new Runnable(date, j, zzudVar, z, taskCompletionSource) { // from class: com.google.android.gms.internal.mlkit_translate.zzvw
            public final /* synthetic */ Date zzb;
            public final /* synthetic */ long zzc;
            public final /* synthetic */ zzud zzd;
            public final /* synthetic */ TaskCompletionSource zze;

            {
                this.zze = taskCompletionSource;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzh(this.zzb, this.zzc, this.zzd, true, this.zze);
            }
        });
        return taskCompletionSource.getTask().onSuccessTask(this.zze, new SuccessContinuation() { // from class: com.google.android.gms.internal.mlkit_translate.zzvv
            @Override // com.google.android.gms.tasks.SuccessContinuation
            public final Task then(Object obj) {
                this.zza.zzg();
                return Tasks.forResult(null);
            }
        });
    }

    public final String zzf(String str) {
        String str2;
        zzw zzwVar = this.zzh;
        if (zzwVar != null && zzwVar.containsKey(str)) {
            return (String) zzwVar.get(str);
        }
        synchronized (this.zzj) {
            str2 = (String) this.zzj.get(str);
        }
        return str2;
    }

    public final void zzg() {
        zzud zzudVar = new zzud();
        zzudVar.zzg();
        this.zzh = this.zzi;
        zzudVar.zze();
        this.zzl.zzb(zzudVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x004a A[Catch: all -> 0x0026, zzwa -> 0x0029, InterruptedException -> 0x002c, RuntimeException -> 0x002f, TryCatch #2 {all -> 0x0026, blocks: (B:3:0x0002, B:26:0x0070, B:27:0x007a, B:29:0x0095, B:31:0x009c, B:35:0x00c7, B:37:0x00d2, B:36:0x00cd, B:33:0x00ba, B:21:0x004a, B:23:0x0068, B:6:0x000d, B:7:0x0011, B:8:0x0015, B:18:0x0033, B:39:0x00d6), top: B:48:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00c7 A[Catch: all -> 0x0026, zzwa -> 0x0029, InterruptedException -> 0x002c, RuntimeException -> 0x002f, TryCatch #2 {all -> 0x0026, blocks: (B:3:0x0002, B:26:0x0070, B:27:0x007a, B:29:0x0095, B:31:0x009c, B:35:0x00c7, B:37:0x00d2, B:36:0x00cd, B:33:0x00ba, B:21:0x004a, B:23:0x0068, B:6:0x000d, B:7:0x0011, B:8:0x0015, B:18:0x0033, B:39:0x00d6), top: B:48:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00cd A[Catch: all -> 0x0026, zzwa -> 0x0029, InterruptedException -> 0x002c, RuntimeException -> 0x002f, TryCatch #2 {all -> 0x0026, blocks: (B:3:0x0002, B:26:0x0070, B:27:0x007a, B:29:0x0095, B:31:0x009c, B:35:0x00c7, B:37:0x00d2, B:36:0x00cd, B:33:0x00ba, B:21:0x004a, B:23:0x0068, B:6:0x000d, B:7:0x0011, B:8:0x0015, B:18:0x0033, B:39:0x00d6), top: B:48:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0070 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final /* synthetic */ void zzh(Date date, long j, zzud zzudVar, boolean z, TaskCompletionSource taskCompletionSource) {
        Pair pairCreate;
        zzw zzwVarZzb;
        zzvx zzvxVar;
        try {
            try {
                zzvq zzvqVarZza = this.zzk.zza(zzudVar);
                if (zzvqVarZza == null) {
                    pairCreate = null;
                    if (pairCreate != null) {
                        zzwVarZzb = null;
                        if (zzwVarZzb == null) {
                            try {
                                Log.d("MLKit RemoteConfigRestC", "Getting installation id...");
                                this.zzf.zzd();
                                Log.d("MLKit RemoteConfigRestC", "Got installation id. Checking temporary token for expiry...");
                                String strZzc = this.zzf.zzc();
                                Log.d("MLKit RemoteConfigRestC", "Got valid temporary auth token. Fetching remote config...");
                                zzvxVar = new zzvx(this, strZzc, date, zzudVar);
                            } catch (IOException e) {
                                zzudVar.zzd(zzsi.UNKNOWN_ERROR);
                                Log.e("MLKit RemoteConfigRestC", "Initializing installation id failed", e);
                            }
                            if (zzwh.zza(zzvxVar)) {
                                zzwVarZzb = zzvxVar.zzb();
                                Log.d("MLKit RemoteConfigRestC", "writeAndSetFetchedConfig: ".concat(String.valueOf(zzwVarZzb)));
                                this.zzk.zzb(zzvxVar.zzc(), zzudVar);
                                this.zzi = zzwVarZzb;
                            } else {
                                zzudVar.zzd(zzsi.RPC_EXPONENTIAL_BACKOFF_FAILED);
                                zzwVarZzb = null;
                            }
                        }
                        if (zzwVarZzb != null) {
                            Log.e("MLKit RemoteConfigRestC", "Remote config was null!");
                        } else {
                            Log.d("MLKit RemoteConfigRestC", "Got remote config.");
                        }
                        taskCompletionSource.setResult(null);
                    } else {
                        zzwVarZzb = (zzw) pairCreate.first;
                        if (date.after(new Date(((Date) pairCreate.second).getTime() + TimeUnit.SECONDS.toMillis(j)))) {
                            Log.i("MLKit RemoteConfigRestC", "Saved remote config is past its expiration time.");
                            zzwVarZzb = null;
                        }
                        if (zzwVarZzb == null) {
                        }
                        if (zzwVarZzb != null) {
                        }
                        taskCompletionSource.setResult(null);
                    }
                } else {
                    JSONObject jSONObjectZzc = zzvqVarZza.zzc();
                    try {
                        zzw zzwVarZzj = zzj(jSONObjectZzc);
                        this.zzi = zzwVarZzj;
                        zzg();
                        zzudVar.zzh();
                        pairCreate = Pair.create(zzwVarZzj, zzvqVarZza.zzb());
                    } catch (JSONException e2) {
                        zzudVar.zzc(zzsi.FILE_READ_RETURNED_MALFORMED_DATA);
                        Log.e("MLKit RemoteConfigRestC", "Saved remote config setting has invalid format: ".concat(String.valueOf(jSONObjectZzc)), e2);
                        pairCreate = null;
                    }
                    if (pairCreate != null) {
                    }
                }
            } catch (Throwable th) {
                zzudVar.zze();
                this.zzl.zzc(zzudVar);
                throw th;
            }
        } catch (zzwa e3) {
            e = e3;
            Log.e("MLKit RemoteConfigRestC", "Fetch failed", e);
            taskCompletionSource.setException(e);
        } catch (InterruptedException e4) {
            e = e4;
            Log.e("MLKit RemoteConfigRestC", "Fetch failed", e);
            taskCompletionSource.setException(e);
        } catch (RuntimeException e5) {
            e = e5;
            Log.e("MLKit RemoteConfigRestC", "Fetch failed", e);
            taskCompletionSource.setException(e);
        }
        zzudVar.zze();
        this.zzl.zzc(zzudVar);
    }

    public final void zzi(int i) {
        Map map = this.zzj;
        Map mapZza = zzvs.zza(this.zzd, i);
        synchronized (map) {
            this.zzj.putAll(mapZza);
        }
    }
}
