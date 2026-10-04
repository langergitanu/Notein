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

/* JADX INFO: loaded from: classes7.dex */
public final class zzug {
    private static final Object zza;
    private final Context zzb;

    static {
        Component.builder(zzug.class).add(Dependency.required((Class<?>) Context.class)).factory(new ComponentFactory() { // from class: com.google.android.gms.internal.mlkit_translate.zzuf
            @Override // com.google.firebase.components.ComponentFactory
            public final Object create(ComponentContainer componentContainer) {
                return new zzug((Context) componentContainer.get(Context.class));
            }
        }).build();
        zza = new Object();
    }

    public zzug(Context context) {
        this.zzb = context;
    }

    public final zzuh zza(zzud zzudVar) {
        zzuh zzuhVar;
        zzuh zzuhVar2;
        zzce zzceVar;
        zztw zztwVar;
        String strZze;
        String strZze2;
        long jZzc;
        synchronized (zza) {
            try {
                File fileZzb = zzb(zzudVar);
                try {
                    String str = new String(new AtomicFile(fileZzb).readFully(), Charset.forName("UTF-8"));
                    try {
                        zzcb zzcbVarZzb = zzcg.zzb(str);
                        if (zzcbVarZzb instanceof zzce) {
                            zzce zzceVarZzb = zzcbVarZzb.zzb();
                            try {
                                zztwVar = new zztw(zzceVarZzb.zzd("fid").zze());
                                strZze = zzceVarZzb.zzd("refreshToken").zze();
                                strZze2 = zzceVarZzb.zzd("temporaryToken").zze();
                                zzuhVar = null;
                                try {
                                    jZzc = zzceVarZzb.zzd("temporaryTokenExpiryTimestamp").zzc();
                                    zzceVar = zzceVarZzb;
                                } catch (ClassCastException | IllegalStateException | NullPointerException e) {
                                    e = e;
                                    zzceVar = zzceVarZzb;
                                }
                            } catch (ClassCastException | IllegalStateException | NullPointerException e2) {
                                e = e2;
                                zzceVar = zzceVarZzb;
                                zzuhVar = null;
                            }
                            try {
                                Log.d("MLKitInstallationIdSaver", "fid: " + zztwVar.toString());
                                Log.d("MLKitInstallationIdSaver", "refresh_token: " + strZze);
                                Log.d("MLKitInstallationIdSaver", "temporary_token: " + strZze2);
                                Log.d("MLKitInstallationIdSaver", "temporary token expiry: " + jZzc);
                                zzuhVar2 = new zzuh(zztwVar, strZze, strZze2, jZzc);
                            } catch (ClassCastException e3) {
                                e = e3;
                                zzudVar.zzc(zzsi.FILE_READ_RETURNED_INVALID_DATA);
                                Log.e("MLKitInstallationIdSaver", "Error traversing installation info JSON object:\nraw json:\n" + str + "\nparsed json:\n" + zzceVar.toString(), e);
                                zzuhVar2 = zzuhVar;
                            } catch (IllegalStateException e4) {
                                e = e4;
                                zzudVar.zzc(zzsi.FILE_READ_RETURNED_INVALID_DATA);
                                Log.e("MLKitInstallationIdSaver", "Error traversing installation info JSON object:\nraw json:\n" + str + "\nparsed json:\n" + zzceVar.toString(), e);
                                zzuhVar2 = zzuhVar;
                            } catch (NullPointerException e5) {
                                e = e5;
                                zzudVar.zzc(zzsi.FILE_READ_RETURNED_INVALID_DATA);
                                Log.e("MLKitInstallationIdSaver", "Error traversing installation info JSON object:\nraw json:\n" + str + "\nparsed json:\n" + zzceVar.toString(), e);
                                zzuhVar2 = zzuhVar;
                            }
                        } else {
                            Log.e("MLKitInstallationIdSaver", "Error parsing installation info JSON element:\n".concat(String.valueOf(zzcbVarZzb)));
                            zzudVar.zzc(zzsi.FILE_READ_RETURNED_MALFORMED_DATA);
                            zzuhVar2 = null;
                        }
                    } catch (zzci e6) {
                        zzuhVar = null;
                        Log.e("MLKitInstallationIdSaver", "Error parsing installation info JSON object:\n".concat(str), e6);
                        zzudVar.zzc(zzsi.FILE_READ_RETURNED_MALFORMED_DATA);
                    }
                } catch (IOException e7) {
                    if (!fileZzb.exists()) {
                        Log.i("MLKitInstallationIdSaver", "Installation id file not yet present: " + fileZzb.toString());
                        return null;
                    }
                    zzudVar.zzc(zzsi.FILE_READ_FAILED);
                    Log.w("MLKitInstallationIdSaver", "Error reading installation id file: " + fileZzb.toString(), e7);
                    return null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzuhVar2;
    }

    public final File zzb(zzud zzudVar) {
        File noBackupFilesDir = ContextCompat.getNoBackupFilesDir(this.zzb);
        if (noBackupFilesDir == null || !noBackupFilesDir.isDirectory()) {
            Log.w("MLKitInstallationIdSaver", "noBackupFilesDir doesn't exist, using regular files directory instead");
            noBackupFilesDir = this.zzb.getFilesDir();
            if (noBackupFilesDir != null && !noBackupFilesDir.isDirectory()) {
                try {
                    if (!noBackupFilesDir.mkdirs()) {
                        Log.w("MLKitInstallationIdSaver", "mkdirs failed: " + noBackupFilesDir.toString());
                        zzudVar.zzd(zzsi.DIRECTORY_CREATION_FAILED);
                    }
                } catch (SecurityException e) {
                    Log.w("MLKitInstallationIdSaver", "mkdirs threw an exception: ".concat(noBackupFilesDir.toString()), e);
                    zzudVar.zzd(zzsi.DIRECTORY_CREATION_FAILED);
                }
            }
        }
        return new File(noBackupFilesDir, "com.google.mlkit.InstallationId");
    }

    public final void zzc(zzuh zzuhVar, zzud zzudVar) {
        File fileZzb;
        String str = String.format("{\n \"fid\": \"%s\",\n \"refreshToken\": \"%s\",\n \"temporaryToken\": \"%s\",\n \"temporaryTokenExpiryTimestamp\": \"%d\"\n}\n", zzuhVar.zzb().zza(), zzuhVar.zzc(), zzuhVar.zzd(), Long.valueOf(zzuhVar.zza()));
        synchronized (zza) {
            try {
                try {
                    fileZzb = zzb(zzudVar);
                } catch (IOException e) {
                    e = e;
                    fileZzb = null;
                }
                try {
                    Log.i("MLKitInstallationIdSaver", "Creating installation id: " + fileZzb.toString());
                    AtomicFile atomicFile = new AtomicFile(fileZzb);
                    FileOutputStream fileOutputStreamStartWrite = atomicFile.startWrite();
                    try {
                        PrintWriter printWriter = new PrintWriter(fileOutputStreamStartWrite);
                        printWriter.println(str);
                        printWriter.flush();
                        atomicFile.finishWrite(fileOutputStreamStartWrite);
                        Log.d("MLKitInstallationIdSaver", "Succeeded writing installation id: " + fileZzb.toString() + ":\n" + str);
                    } catch (Throwable th) {
                        atomicFile.failWrite(fileOutputStreamStartWrite);
                        throw th;
                    }
                } catch (IOException e2) {
                    e = e2;
                    zzudVar.zzc(zzsi.FILE_WRITE_FAILED);
                    Log.e("MLKitInstallationIdSaver", "Error writing to installation id file ".concat(String.valueOf(fileZzb)), e);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
