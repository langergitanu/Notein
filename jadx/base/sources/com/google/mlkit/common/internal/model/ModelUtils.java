package com.google.mlkit.common.internal.model;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import com.google.android.gms.common.internal.GmsLogger;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.mlkit_common.zzh;
import com.google.android.gms.internal.mlkit_common.zzi;
import com.google.android.gms.internal.mlkit_common.zzu;
import com.google.mlkit.common.model.LocalModel;
import com.google.mlkit.common.sdkinternal.MlKitContext;
import com.google.mlkit.common.sdkinternal.SharedPrefManager;
import com.microsoft.identity.common.java.crypto.key.KeyUtil;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
public class ModelUtils {
    private static final GmsLogger zza = new GmsLogger("ModelUtils", "");

    public static abstract class AutoMLManifest {
        public abstract String getLabelsFile();

        public abstract String getModelFile();

        public abstract String getModelType();
    }

    public static abstract class ModelLoggingInfo {
        public static ModelLoggingInfo zza(long j, String str, boolean z) {
            return new AutoValue_ModelUtils_ModelLoggingInfo(j, zzu.zzb(str), z);
        }

        public abstract String getHash();

        public abstract long getSize();

        public abstract boolean isManifestModel();
    }

    private ModelUtils() {
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x0109 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ModelLoggingInfo getModelLoggingInfo(Context context, LocalModel localModel) throws Throwable {
        long length;
        Throwable th;
        IOException e;
        InputStream inputStreamZzb;
        String strZzc;
        String assetFilePath = localModel.getAssetFilePath();
        String absoluteFilePath = localModel.getAbsoluteFilePath();
        Uri uri = localModel.getUri();
        InputStream inputStream = null;
        if (assetFilePath != null) {
            if (localModel.isManifestFile() && (assetFilePath = zzb(context, assetFilePath, true)) == null) {
                return null;
            }
            try {
                AssetFileDescriptor assetFileDescriptorOpenFd = context.getAssets().openFd(assetFilePath);
                try {
                    length = assetFileDescriptorOpenFd.getLength();
                    assetFileDescriptorOpenFd.close();
                } finally {
                }
            } catch (IOException e2) {
                zza.m74907e("ModelUtils", "Failed to open model file", e2);
                return null;
            }
        } else if (absoluteFilePath != null) {
            if (localModel.isManifestFile() && (absoluteFilePath = zzb(context, absoluteFilePath, false)) == null) {
                return null;
            }
            length = new File(absoluteFilePath).length();
        } else {
            if (uri == null) {
                zza.m74906e("ModelUtils", "Local model doesn't have any valid path.");
                return null;
            }
            try {
                AssetFileDescriptor assetFileDescriptorZza = zzi.zza(context, uri, "r");
                try {
                    length = assetFileDescriptorZza.getLength();
                    assetFileDescriptorZza.close();
                } finally {
                }
            } catch (IOException e3) {
                zza.m74907e("ModelUtils", "Failed to open model file", e3);
                return null;
            }
        }
        SharedPrefManager sharedPrefManager = (SharedPrefManager) MlKitContext.getInstance().get(SharedPrefManager.class);
        String string = assetFilePath != null ? assetFilePath : absoluteFilePath != null ? absoluteFilePath : ((Uri) Preconditions.checkNotNull(uri)).toString();
        String strZzb = sharedPrefManager.zzb(string, length);
        if (strZzb != null) {
            return ModelLoggingInfo.zza(length, strZzb, localModel.isManifestFile());
        }
        try {
            if (assetFilePath != null) {
                inputStreamZzb = context.getAssets().open(assetFilePath);
            } else if (absoluteFilePath != null) {
                inputStreamZzb = new FileInputStream(new File(absoluteFilePath));
            } else {
                Uri uri2 = (Uri) Preconditions.checkNotNull(uri);
                int i = zzi.zza;
                inputStreamZzb = zzi.zzb(context, uri2, zzh.zza);
            }
            if (inputStreamZzb != null) {
                try {
                    try {
                        strZzc = zzc(inputStreamZzb);
                    } catch (IOException e4) {
                        e = e4;
                        zza.m74907e("ModelUtils", "Failed to open model file", e);
                        if (inputStreamZzb != null) {
                            try {
                                inputStreamZzb.close();
                            } catch (IOException e5) {
                                zza.m74907e("ModelUtils", "Failed to close model file", e5);
                            }
                        }
                        return null;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    inputStream = inputStreamZzb;
                    if (inputStream != null) {
                        try {
                            inputStream.close();
                        } catch (IOException e6) {
                            zza.m74907e("ModelUtils", "Failed to close model file", e6);
                        }
                    }
                    throw th;
                }
            } else {
                strZzc = null;
            }
            if (strZzc != null) {
                sharedPrefManager.zzc(string, length, strZzc);
            }
            ModelLoggingInfo modelLoggingInfoZza = ModelLoggingInfo.zza(length, strZzc, localModel.isManifestFile());
            if (inputStreamZzb != null) {
                try {
                    inputStreamZzb.close();
                    return modelLoggingInfoZza;
                } catch (IOException e7) {
                    zza.m74907e("ModelUtils", "Failed to close model file", e7);
                }
            }
            return modelLoggingInfoZza;
        } catch (IOException e8) {
            e = e8;
            inputStreamZzb = null;
        } catch (Throwable th3) {
            th = th3;
            if (inputStream != null) {
            }
            throw th;
        }
    }

    public static String getSHA256(File file) {
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            try {
                String strZzc = zzc(fileInputStream);
                fileInputStream.close();
                return strZzc;
            } finally {
            }
        } catch (IOException e) {
            zza.m74906e("ModelUtils", "Failed to create FileInputStream for model: ".concat(e.toString()));
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x002d, code lost:
    
        if (new java.io.File(r6).exists() == false) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static AutoMLManifest parseManifestFile(String str, boolean z, Context context) {
        byte[] bArr;
        String strValueOf = String.valueOf(str);
        GmsLogger gmsLogger = zza;
        gmsLogger.m74904d("ModelUtils", "Manifest file path: ".concat(strValueOf));
        if (z) {
            try {
                InputStream inputStreamOpen = context.getAssets().open(str);
                if (inputStreamOpen != null) {
                    inputStreamOpen.close();
                }
                try {
                    if (str.isEmpty()) {
                        bArr = new byte[0];
                    } else {
                        InputStream inputStreamOpen2 = z ? context.getAssets().open(str) : new FileInputStream(new File(str));
                        try {
                            int iAvailable = inputStreamOpen2.available();
                            byte[] bArr2 = new byte[iAvailable];
                            inputStreamOpen2.read(bArr2, 0, iAvailable);
                            inputStreamOpen2.close();
                            bArr = bArr2;
                        } catch (Throwable th) {
                            if (inputStreamOpen2 != null) {
                                try {
                                    inputStreamOpen2.close();
                                } catch (Throwable th2) {
                                    th.addSuppressed(th2);
                                }
                            }
                            throw th;
                        }
                    }
                    String str2 = new String(bArr, "UTF-8");
                    gmsLogger.m74904d("ModelUtils", "Json string from the manifest file: ".concat(str2));
                    JSONObject jSONObject = new JSONObject(str2);
                    return new AutoValue_ModelUtils_AutoMLManifest(jSONObject.getString("modelType"), jSONObject.getString("modelFile"), jSONObject.getString("labelsFile"));
                } catch (IOException e) {
                    e = e;
                    zza.m74907e("ModelUtils", "Error parsing the manifest file.", e);
                    return null;
                } catch (JSONException e2) {
                    e = e2;
                    zza.m74907e("ModelUtils", "Error parsing the manifest file.", e);
                    return null;
                }
            } catch (IOException unused) {
                zza.m74906e("ModelUtils", "Manifest file does not exist.");
                return null;
            }
        }
    }

    public static boolean zza(File file, String str) {
        String sha256 = getSHA256(file);
        zza.m74904d("ModelUtils", "Calculated hash value is: ".concat(String.valueOf(sha256)));
        return str.equals(sha256);
    }

    private static String zzb(Context context, String str, boolean z) {
        AutoMLManifest manifestFile = parseManifestFile(str, z, context);
        if (manifestFile != null) {
            return new File(new File(str).getParent(), manifestFile.getModelFile()).toString();
        }
        zza.m74906e("ModelUtils", "Failed to parse manifest file.");
        return null;
    }

    private static String zzc(InputStream inputStream) {
        int i;
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(KeyUtil.HMAC_KEY_HASH_ALGORITHM);
            byte[] bArr = new byte[1048576];
            while (true) {
                int i2 = inputStream.read(bArr);
                if (i2 == -1) {
                    break;
                }
                messageDigest.update(bArr, 0, i2);
            }
            byte[] bArrDigest = messageDigest.digest();
            StringBuilder sb = new StringBuilder();
            for (byte b : bArrDigest) {
                String hexString = Integer.toHexString(b & 255);
                if (hexString.length() == 1) {
                    sb.append('0');
                }
                sb.append(hexString);
            }
            return sb.toString();
        } catch (IOException unused) {
            zza.m74906e("ModelUtils", "Failed to read model file");
            return null;
        } catch (NoSuchAlgorithmException unused2) {
            zza.m74906e("ModelUtils", "Do not have SHA-256 algorithm");
            return null;
        }
    }
}
