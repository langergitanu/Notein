package com.huawei.cloud.client.util;

import com.huawei.cloud.base.util.Logger;
import com.huawei.cloud.client.exception.DriveCode;
import com.huawei.cloud.client.exception.DriveException;
import com.microsoft.identity.common.java.crypto.key.KeyUtil;
import java.io.ByteArrayInputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes8.dex */
public class HashFile {

    /* JADX INFO: renamed from: a */
    private static final Logger f52351a = Logger.getLogger("HashFile");

    /* JADX INFO: renamed from: a */
    private static String m75713a(InputStream inputStream) throws GeneralSecurityException, IOException {
        MessageDigest messageDigest = MessageDigest.getInstance(KeyUtil.HMAC_KEY_HASH_ALGORITHM);
        byte[] bArr = new byte[8192];
        while (true) {
            int i = inputStream.read(bArr);
            if (i == -1) {
                return byte2hex(messageDigest.digest());
            }
            messageDigest.update(bArr, 0, i);
        }
    }

    public static String byte2hex(byte[] bArr) {
        if (bArr == null) {
            f52351a.m75691i("toHex byteArray is null");
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (byte b : bArr) {
            int i = b & 255;
            if (Integer.toHexString(i).length() == 1) {
                sb.append("0");
                sb.append(Integer.toHexString(i));
            } else {
                sb.append(Integer.toHexString(i));
            }
        }
        return sb.toString();
    }

    public static String getHash(File file) throws Throwable {
        FileInputStream fileInputStream;
        FileInputStream fileInputStream2 = null;
        try {
            try {
                fileInputStream = new FileInputStream(file);
            } catch (Throwable th) {
                th = th;
            }
        } catch (IOException e) {
            e = e;
        } catch (GeneralSecurityException e2) {
            e = e2;
        }
        try {
            String strM75713a = m75713a((InputStream) fileInputStream);
            m75714a((Closeable) fileInputStream);
            return strM75713a;
        } catch (IOException e3) {
            e = e3;
            throw new DriveException(DriveCode.HASH_INVALID, "compute file hash error: " + e.getMessage());
        } catch (GeneralSecurityException e4) {
            e = e4;
            throw new DriveException(DriveCode.HASH_INVALID, "compute file hash error: " + e.getMessage());
        } catch (Throwable th2) {
            th = th2;
            fileInputStream2 = fileInputStream;
            m75714a((Closeable) fileInputStream2);
            throw th;
        }
    }

    /* JADX INFO: renamed from: a */
    private static void m75714a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e) {
                f52351a.m75693w("close error: " + e);
            }
        }
    }

    public static String getHash(byte[] bArr) throws Throwable {
        ByteArrayInputStream byteArrayInputStream;
        ByteArrayInputStream byteArrayInputStream2 = null;
        try {
            try {
                byteArrayInputStream = new ByteArrayInputStream(bArr);
            } catch (Throwable th) {
                th = th;
            }
        } catch (IOException e) {
            e = e;
        } catch (GeneralSecurityException e2) {
            e = e2;
        }
        try {
            String strM75713a = m75713a((InputStream) byteArrayInputStream);
            m75714a((Closeable) byteArrayInputStream);
            return strM75713a;
        } catch (IOException e3) {
            e = e3;
            throw new DriveException(DriveCode.HASH_INVALID, "compute file hash error: " + e.getMessage());
        } catch (GeneralSecurityException e4) {
            e = e4;
            throw new DriveException(DriveCode.HASH_INVALID, "compute file hash error: " + e.getMessage());
        } catch (Throwable th2) {
            th = th2;
            byteArrayInputStream2 = byteArrayInputStream;
            m75714a((Closeable) byteArrayInputStream2);
            throw th;
        }
    }
}
