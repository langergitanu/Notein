package com.google.android.gms.internal.mlkit_translate;

import android.content.Context;
import android.util.Log;
import androidx.core.content.ContextCompat;
import androidx.core.util.AtomicFile;
import com.google.firebase.components.Component;
import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentFactory;
import com.google.firebase.components.Dependency;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.Charset;
import java.util.Date;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public final class zzwd {
    private static final Object zza;
    private final Context zzb;

    static {
        Component.builder(zzwd.class).add(Dependency.required((Class<?>) Context.class)).factory(new ComponentFactory() { // from class: com.google.android.gms.internal.mlkit_translate.zzwc
            @Override // com.google.firebase.components.ComponentFactory
            public final Object create(ComponentContainer componentContainer) {
                return new zzwd((Context) componentContainer.get(Context.class));
            }
        }).build();
        zza = new Object();
    }

    public zzwd(Context context) {
        this.zzb = context;
    }

    private final File zzc() {
        File noBackupFilesDir = ContextCompat.getNoBackupFilesDir(this.zzb);
        if (noBackupFilesDir == null || !noBackupFilesDir.isDirectory()) {
            Log.w("MLKitRemoteConfigSaver", "noBackupFilesDir doesn't exist, using regular files directory instead");
            noBackupFilesDir = this.zzb.getFilesDir();
            if (noBackupFilesDir != null && !noBackupFilesDir.isDirectory()) {
                try {
                    if (!noBackupFilesDir.mkdirs()) {
                        Log.w("MLKitRemoteConfigSaver", "mkdirs failed: " + noBackupFilesDir.toString());
                    }
                } catch (SecurityException e) {
                    Log.w("MLKitRemoteConfigSaver", "mkdirs threw an exception: ".concat(noBackupFilesDir.toString()), e);
                }
            }
        }
        return new File(noBackupFilesDir, "com.google.mlkit.RemoteConfig");
    }

    public final zzvq zza(zzud zzudVar) {
        zzvq zzvqVar;
        synchronized (zza) {
            File fileZzc = zzc();
            zzvqVar = null;
            try {
                String str = new String(new AtomicFile(fileZzc).readFully(), Charset.forName("UTF-8"));
                try {
                    JSONObject jSONObject = new JSONObject(str);
                    try {
                        zzvqVar = new zzvq(jSONObject.getJSONObject("configs_key"), new Date(jSONObject.getLong("fetch_time_key")), jSONObject.getJSONArray("abt_experiments_key"));
                    } catch (JSONException e) {
                        zzudVar.zzc(zzsi.FILE_READ_RETURNED_INVALID_DATA);
                        Log.e("MLKitRemoteConfigSaver", "Error parsing remote config settings JSON object:\n".concat(jSONObject.toString()), e);
                    }
                } catch (JSONException e2) {
                    zzudVar.zzc(zzsi.FILE_READ_RETURNED_MALFORMED_DATA);
                    Log.e("MLKitRemoteConfigSaver", "Error parsing remote config settings JSON string:\n".concat(str), e2);
                }
            } catch (IOException e3) {
                if (!fileZzc.exists()) {
                    Log.i("MLKitRemoteConfigSaver", "remote config settings file not yet present: " + fileZzc.toString());
                    return null;
                }
                zzudVar.zzc(zzsi.FILE_READ_FAILED);
                Log.w("MLKitRemoteConfigSaver", "Error reading remote config settings file: " + fileZzc.toString(), e3);
                return null;
            }
        }
        return zzvqVar;
    }

    public final void zzb(zzvq zzvqVar, zzud zzudVar) {
        File fileZzc;
        AtomicFile atomicFile;
        FileOutputStream fileOutputStreamStartWrite;
        String string = zzvqVar.toString();
        synchronized (zza) {
            try {
                try {
                    fileZzc = zzc();
                } catch (IOException e) {
                    e = e;
                    fileZzc = null;
                }
                try {
                    Log.i("MLKitRemoteConfigSaver", "Creating remote config settings: " + fileZzc.toString());
                    atomicFile = new AtomicFile(fileZzc);
                    fileOutputStreamStartWrite = atomicFile.startWrite();
                } catch (IOException e2) {
                    e = e2;
                    zzudVar.zzc(zzsi.FILE_WRITE_FAILED);
                    Log.e("MLKitRemoteConfigSaver", "Error writing to remote config settings file ".concat(String.valueOf(fileZzc)), e);
                }
                try {
                    PrintWriter printWriter = new PrintWriter(fileOutputStreamStartWrite);
                    printWriter.println(string);
                    printWriter.flush();
                    atomicFile.finishWrite(fileOutputStreamStartWrite);
                    Log.d("MLKitRemoteConfigSaver", "Succeeded writing remote config settings: " + fileZzc.toString() + ":\n" + string);
                } catch (Throwable th) {
                    atomicFile.failWrite(fileOutputStreamStartWrite);
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
