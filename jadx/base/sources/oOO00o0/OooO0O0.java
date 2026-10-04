package oOO00o0;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Environment;
import android.text.TextUtils;
import android.util.Log;
import java.io.File;
import java.io.IOException;
import oOO00Ooo.C34365OooO0O0;

/* JADX INFO: loaded from: classes10.dex */
public abstract class OooO0O0 {

    public static class OooO00o {
        public static void OooO00o(Context context) {
            File externalFilesDir;
            String canonicalPath;
            File[] fileArrListFiles;
            StringBuilder sb = new StringBuilder();
            if (("mounted".equals(Environment.getExternalStorageState()) || !Environment.isExternalStorageRemovable()) && (externalFilesDir = context.getExternalFilesDir(null)) != null) {
                try {
                    canonicalPath = externalFilesDir.getCanonicalPath();
                } catch (IOException unused) {
                    C34370OooO0o0.OooO0Oo("ILogX", "Exception");
                    canonicalPath = null;
                }
            } else {
                canonicalPath = null;
            }
            String strOooO0OO = androidx.concurrent.futures.OooO00o.OooO0OO(sb, canonicalPath, "/Log/");
            File file = new File(strOooO0OO);
            String str = (file.exists() || file.mkdirs()) ? strOooO0OO : null;
            if (TextUtils.isEmpty(str)) {
                return;
            }
            C34370OooO0o0.OooO0Oo("ILogX", "deleteOldLogFiles File");
            File file2 = new File(str);
            if (file2.exists() && file2.isDirectory() && (fileArrListFiles = file2.listFiles()) != null) {
                for (File file3 : fileArrListFiles) {
                    if ((file3.getName().contains("apphnid.txt") || file3.getName().contains("apphnid.txt.bak") || file3.getName().contains("honorid_advanced_log.txt")) && !file3.delete()) {
                        Log.i("deleteDirInnerPicFile", "delete file fail");
                    }
                }
            }
        }

        public static String OooO0O0(Context context) {
            String canonicalPath;
            StringBuilder sb = new StringBuilder();
            try {
                canonicalPath = context.getFilesDir().getCanonicalPath();
            } catch (IOException unused) {
                C34370OooO0o0.OooO0Oo("ILogX", "getCanonicalPath is IOException");
                canonicalPath = null;
            }
            String strOooO0OO = androidx.concurrent.futures.OooO00o.OooO0OO(sb, canonicalPath, "/Log/");
            File file = new File(strOooO0OO);
            if (file.exists() || file.mkdirs()) {
                return strOooO0OO;
            }
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x004c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String OooO00o(Context context) {
        String str;
        if (context != null) {
            C34365OooO0O0.OooO00o(context).getClass();
            if ("com.hihonor.id".equals(context.getPackageName())) {
                try {
                    str = "HONORID_APK_log[" + context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName + "]:";
                } catch (PackageManager.NameNotFoundException e) {
                    Log.e("honorid", "getVersionTag error".concat(e.getClass().getSimpleName()));
                    str = "";
                }
            } else {
                str = "";
            }
        }
        return TextUtils.isEmpty(str) ? "HonorID_openSDK_log[6.0.3.005]" : str;
    }
}
