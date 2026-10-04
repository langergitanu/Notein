package o0oo000O;

import android.content.ContentUris;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Environment;
import android.os.storage.StorageManager;
import android.provider.DocumentsContract;
import android.provider.MediaStore;
import android.text.TextUtils;
import android.util.Log;
import androidx.core.content.FileProvider;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.huawei.hms.network.embedded.C18241k5;
import java.io.File;
import java.lang.reflect.Array;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: o0oo000O.OooOOo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C31194OooOOo0 {
    public static Uri OooO00o(Context context, File file) {
        if (!C31190OooO0oo.OooOOo(file)) {
            return null;
        }
        return FileProvider.getUriForFile(context, context.getPackageName() + ".fileProvider", file);
    }

    public static File OooO0O0(Context context, Uri uri, String str, String[] strArr, String str2) {
        if ("com.google.android.apps.photos.content".equals(uri.getAuthority())) {
            if (!TextUtils.isEmpty(uri.getLastPathSegment())) {
                return new File(uri.getLastPathSegment());
            }
        } else if ("com.tencent.mtt.fileprovider".equals(uri.getAuthority())) {
            String path = uri.getPath();
            if (!TextUtils.isEmpty(path)) {
                return new File(Environment.getExternalStorageDirectory(), path.substring(10, path.length()));
            }
        } else if ("com.huawei.hidisk.fileprovider".equals(uri.getAuthority())) {
            String path2 = uri.getPath();
            if (!TextUtils.isEmpty(path2)) {
                return new File(path2.replace("/root", ""));
            }
        }
        Cursor cursorQuery = context.getContentResolver().query(uri, new String[]{"_data"}, str, strArr, null);
        try {
            if (cursorQuery == null) {
                Log.d("UriUtils", uri.toString() + " parse failed(cursor is null). -> " + str2);
                return null;
            }
            try {
                if (!cursorQuery.moveToFirst()) {
                    Log.d("UriUtils", uri.toString() + " parse failed(moveToFirst return false). -> " + str2);
                    cursorQuery.close();
                    return null;
                }
                int columnIndex = cursorQuery.getColumnIndex("_data");
                if (columnIndex > -1) {
                    File file = new File(cursorQuery.getString(columnIndex));
                    cursorQuery.close();
                    return file;
                }
                Log.d("UriUtils", uri.toString() + " parse failed(columnIndex: " + columnIndex + " is wrong). -> " + str2);
                cursorQuery.close();
                return null;
            } catch (Exception unused) {
                Log.d("UriUtils", uri.toString() + " parse failed. -> " + str2);
                cursorQuery.close();
                return null;
            }
        } catch (Throwable th) {
            cursorQuery.close();
            throw th;
        }
    }

    /* JADX WARN: Type inference failed for: r8v3, types: [java.lang.String, java.lang.String[]] */
    public static File OooO0OO(Context context, Uri uri) {
        char c;
        Uri uri2;
        File fileOooO0O0;
        File file;
        String str;
        File file2;
        Log.d("UriUtils", uri.toString());
        String authority = uri.getAuthority();
        String scheme = uri.getScheme();
        String path = uri.getPath();
        File file3 = null;
        int i = 0;
        if (path != null) {
            String[] strArr = {"/external/", "/external_path/"};
            for (int i2 = 0; i2 < 2; i2++) {
                String str2 = strArr[i2];
                if (path.startsWith(str2)) {
                    File file4 = new File(Environment.getExternalStorageDirectory().getAbsolutePath() + path.replace(str2, "/"));
                    if (file4.exists()) {
                        Log.d("UriUtils", uri.toString() + " -> " + str2);
                        return file4;
                    }
                }
            }
            c = 1;
            if (path.startsWith("/files_path/")) {
                file2 = new File(context.getFilesDir().getAbsolutePath() + path.replace("/files_path/", "/"));
            } else if (path.startsWith("/cache_path/")) {
                file2 = new File(context.getCacheDir().getAbsolutePath() + path.replace("/cache_path/", "/"));
            } else if (path.startsWith("/external_files_path/")) {
                file2 = new File(context.getExternalFilesDir(null).getAbsolutePath() + path.replace("/external_files_path/", "/"));
            } else if (path.startsWith("/external_cache_path/")) {
                file2 = new File(context.getExternalCacheDir().getAbsolutePath() + path.replace("/external_cache_path/", "/"));
            } else {
                file2 = null;
            }
            if (file2 != null && file2.exists()) {
                Log.d("UriUtils", uri.toString() + " -> " + path);
                return file2;
            }
        } else {
            c = 1;
        }
        if ("file".equals(scheme)) {
            if (path != null) {
                return new File(path);
            }
            Log.d("UriUtils", uri.toString() + " parse failed. -> 0");
            return null;
        }
        if (!DocumentsContract.isDocumentUri(context, uri)) {
            if (FirebaseAnalytics.Param.CONTENT.equals(scheme)) {
                return OooO0O0(context, uri, null, null, "2");
            }
            Log.d("UriUtils", uri.toString() + " parse failed. -> 3");
            return null;
        }
        if (!"com.android.externalstorage.documents".equals(authority)) {
            Object obj = null;
            if (!"com.android.providers.downloads.documents".equals(authority)) {
                if (!"com.android.providers.media.documents".equals(authority)) {
                    if (FirebaseAnalytics.Param.CONTENT.equals(scheme)) {
                        return OooO0O0(context, uri, null, null, "1_3");
                    }
                    Log.d("UriUtils", uri.toString() + " parse failed. -> 1_4");
                    return null;
                }
                String[] strArrSplit = DocumentsContract.getDocumentId(uri).split(C18241k5.f55433h);
                String str3 = strArrSplit[0];
                if ("image".equals(str3)) {
                    uri2 = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
                } else if ("video".equals(str3)) {
                    uri2 = MediaStore.Video.Media.EXTERNAL_CONTENT_URI;
                } else {
                    if (!"audio".equals(str3)) {
                        Log.d("UriUtils", uri.toString() + " parse failed. -> 1_2");
                        return null;
                    }
                    uri2 = MediaStore.Audio.Media.EXTERNAL_CONTENT_URI;
                }
                return OooO0O0(context, uri2, "_id=?", new String[]{strArrSplit[c]}, "1_2");
            }
            String documentId = DocumentsContract.getDocumentId(uri);
            if (TextUtils.isEmpty(documentId)) {
                Log.d("UriUtils", uri.toString() + " parse failed(id is null). -> 1_1");
                return null;
            }
            if (documentId.startsWith("raw:")) {
                return new File(documentId.substring(4));
            }
            if (documentId.startsWith("msf:")) {
                documentId = documentId.split(C18241k5.f55433h)[c];
            }
            try {
                long j = Long.parseLong(documentId);
                String[] strArr2 = {"content://downloads/public_downloads", "content://downloads/all_downloads", "content://downloads/my_downloads"};
                while (i < 3) {
                    try {
                        ?? r8 = obj;
                        fileOooO0O0 = OooO0O0(context, ContentUris.withAppendedId(Uri.parse(strArr2[i]), j), r8, r8, "1_1");
                    } catch (Exception unused) {
                    }
                    if (fileOooO0O0 != null) {
                        return fileOooO0O0;
                    }
                    i++;
                    obj = null;
                }
                Log.d("UriUtils", uri.toString() + " parse failed. -> 1_1");
                return null;
            } catch (Exception unused2) {
                return null;
            }
        }
        String[] strArrSplit2 = DocumentsContract.getDocumentId(uri).split(C18241k5.f55433h);
        String str4 = strArrSplit2[0];
        if ("primary".equalsIgnoreCase(str4)) {
            return new File(Environment.getExternalStorageDirectory() + "/" + strArrSplit2[c]);
        }
        StorageManager storageManager = (StorageManager) context.getSystemService("storage");
        try {
            Class<?> cls = Class.forName("android.os.storage.StorageVolume");
            Method method = storageManager.getClass().getMethod("getVolumeList", new Class[0]);
            Method method2 = cls.getMethod("getUuid", new Class[0]);
            Method method3 = cls.getMethod("getState", new Class[0]);
            Method method4 = cls.getMethod("getPath", new Class[0]);
            Method method5 = cls.getMethod("isPrimary", new Class[0]);
            Method method6 = cls.getMethod("isEmulated", new Class[0]);
            Object objInvoke = method.invoke(storageManager, new Object[0]);
            int length = Array.getLength(objInvoke);
            int i3 = 0;
            while (i3 < length) {
                Object obj2 = Array.get(objInvoke, i3);
                file = file3;
                try {
                    Object obj3 = objInvoke;
                    if ("mounted".equals(method3.invoke(obj2, new Object[0])) || "mounted_ro".equals(method3.invoke(obj2, new Object[0]))) {
                        if ((!((Boolean) method5.invoke(obj2, new Object[0])).booleanValue() || !((Boolean) method6.invoke(obj2, new Object[0])).booleanValue()) && (str = (String) method2.invoke(obj2, new Object[0])) != null && str.equals(str4)) {
                            return new File(method4.invoke(obj2, new Object[0]) + "/" + strArrSplit2[c]);
                        }
                    }
                    i3++;
                    objInvoke = obj3;
                    file3 = file;
                } catch (Exception e) {
                    e = e;
                    Log.d("UriUtils", uri.toString() + " parse failed. " + e.toString() + " -> 1_0");
                    Log.d("UriUtils", uri.toString() + " parse failed. -> 1_0");
                    return file;
                }
            }
            file = file3;
        } catch (Exception e2) {
            e = e2;
            file = file3;
        }
        Log.d("UriUtils", uri.toString() + " parse failed. -> 1_0");
        return file;
    }
}
