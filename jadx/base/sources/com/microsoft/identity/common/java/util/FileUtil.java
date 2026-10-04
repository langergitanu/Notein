package com.microsoft.identity.common.java.util;

import androidx.concurrent.futures.OooO00o;
import com.microsoft.identity.common.java.exception.ClientException;
import com.microsoft.identity.common.java.logging.Logger;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/* JADX INFO: loaded from: classes9.dex */
public class FileUtil {
    private static final String TAG = "FileUtil";

    private FileUtil() {
    }

    public static void deleteFile(File file) {
        if (file == null) {
            throw new NullPointerException("file is marked non-null but is null");
        }
        if (file.exists()) {
            StringBuilder sb = new StringBuilder();
            String str = TAG;
            sb.append(str);
            sb.append(":deleteKeyFile");
            Logger.verbose(sb.toString(), "Delete File");
            if (file.delete()) {
                return;
            }
            Logger.verbose(str + ":deleteKeyFile", "Failed to delete file.");
        }
    }

    public static byte[] readFromFile(File file, int i) throws ClientException {
        if (file == null) {
            throw new NullPointerException("file is marked non-null but is null");
        }
        if (!file.exists()) {
            return null;
        }
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                byte[] bArr = new byte[i];
                while (true) {
                    int i2 = fileInputStream.read(bArr);
                    if (i2 == -1) {
                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                        fileInputStream.close();
                        return byteArray;
                    }
                    byteArrayOutputStream.write(bArr, 0, i2);
                }
            } catch (Throwable th) {
                fileInputStream.close();
                throw th;
            }
        } catch (IOException e) {
            ClientException clientException = new ClientException("io_error", e.getMessage(), e);
            Logger.error(OooO00o.OooO0OO(new StringBuilder(), TAG, ":readKeyData"), clientException.getErrorCode(), e);
            throw clientException;
        }
    }

    public static void writeDataToFile(byte[] bArr, File file) throws ClientException {
        if (bArr == null) {
            throw new NullPointerException("data is marked non-null but is null");
        }
        if (file == null) {
            throw new NullPointerException("file is marked non-null but is null");
        }
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                fileOutputStream.write(bArr);
            } finally {
                fileOutputStream.close();
            }
        } catch (IOException e) {
            ClientException clientException = new ClientException("io_error", e.getMessage(), e);
            Logger.error(OooO00o.OooO0OO(new StringBuilder(), TAG, ":writeKeyData"), clientException.getErrorCode(), e);
            throw clientException;
        }
    }
}
