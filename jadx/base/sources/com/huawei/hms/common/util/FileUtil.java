package com.huawei.hms.common.util;

import android.content.Context;
import android.util.Log;
import com.aspose.slides.C22218Oooo;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;

/* JADX INFO: loaded from: classes6.dex */
public class FileUtil {

    /* JADX INFO: renamed from: a */
    public static final String f52522a = "dl_FileUtil";

    /* JADX INFO: renamed from: a */
    public static String m75865a(Context context) {
        return context.createDeviceProtectedStorageContext().getDataDir().getAbsolutePath();
    }

    /* JADX INFO: renamed from: b */
    public static boolean m75868b(String str) {
        try {
            File file = new File(str);
            if (file.exists()) {
                return true;
            }
            return file.mkdirs();
        } catch (Exception e) {
            Log.e(f52522a, "makeDirectory Exception: " + e.getMessage());
            return false;
        }
    }

    /* JADX INFO: renamed from: c */
    public static String m75869c(String str) {
        int iLastIndexOf = str.lastIndexOf(File.separator);
        return iLastIndexOf <= 0 ? str : str.substring(0, iLastIndexOf);
    }

    /* JADX INFO: renamed from: a */
    public static void m75866a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
                Logger.m75877e(f52522a, "An exception occurred while closing the 'Closeable' object.");
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0032  */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean m75867a(String str) {
        boolean z;
        File file = new File(str);
        if (file.isDirectory()) {
            z = true;
            for (String str2 : file.list()) {
                if (z) {
                    StringBuilder sbOooO0OO = C22218Oooo.OooO0OO(str);
                    sbOooO0OO.append(File.separator);
                    sbOooO0OO.append(str2);
                    z = m75867a(sbOooO0OO.toString());
                }
            }
        } else {
            z = true;
        }
        return z && file.delete();
    }
}
