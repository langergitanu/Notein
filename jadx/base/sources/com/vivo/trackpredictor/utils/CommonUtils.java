package com.vivo.trackpredictor.utils;

import android.content.Context;
import android.util.Log;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes10.dex */
public class CommonUtils {
    /* JADX WARN: Removed duplicated region for block: B:28:0x0069  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void copyAssetResource2File(Context context, String str, String str2) throws Throwable {
        Throwable th;
        FileOutputStream fileOutputStream;
        IOException e;
        InputStream inputStreamOpen = context.getAssets().open(str);
        File file = new File(str2);
        FileOutputStream fileOutputStream2 = null;
        try {
            try {
                fileOutputStream = new FileOutputStream(file);
                try {
                    byte[] bArr = new byte[1024];
                    while (true) {
                        int i = inputStreamOpen.read(bArr);
                        if (i == -1) {
                            fileOutputStream.flush();
                            inputStreamOpen.close();
                            fileOutputStream.close();
                            file.setReadable(true);
                            return;
                        }
                        fileOutputStream.write(bArr, 0, i);
                    }
                } catch (IOException e2) {
                    e = e2;
                    Log.e("", "IOException! " + e.getMessage());
                    inputStreamOpen.close();
                    if (fileOutputStream != null) {
                        fileOutputStream.close();
                    }
                    file.setReadable(true);
                }
            } catch (Throwable th2) {
                th = th2;
                inputStreamOpen.close();
                if (0 != 0) {
                    fileOutputStream2.close();
                }
                file.setReadable(true);
                throw th;
            }
        } catch (IOException e3) {
            fileOutputStream = null;
            e = e3;
        } catch (Throwable th3) {
            th = th3;
            inputStreamOpen.close();
            if (0 != 0) {
            }
            file.setReadable(true);
            throw th;
        }
    }
}
