package com.huawei.hms.hatool;

import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.util.zip.Deflater;

/* JADX INFO: renamed from: com.huawei.hms.hatool.t0 */
/* JADX INFO: loaded from: classes8.dex */
public final class C18021t0 {
    /* JADX INFO: renamed from: a */
    public static String m77531a(File file) throws Throwable {
        FileInputStream fileInputStream;
        FileInputStream fileInputStream2 = null;
        try {
            try {
                fileInputStream = new FileInputStream(file);
            } catch (Throwable th) {
                th = th;
            }
        } catch (FileNotFoundException unused) {
        } catch (IOException unused2) {
        }
        try {
            C18013p0 c18013p0 = new C18013p0(1024);
            byte[] bArr = new byte[1024];
            while (true) {
                int i = fileInputStream.read(bArr);
                if (i == -1) {
                    break;
                }
                c18013p0.m77498a(bArr, i);
            }
            if (c18013p0.m77500b() == 0) {
                m77533a((Closeable) fileInputStream);
                return "";
            }
            String str = new String(c18013p0.m77499a(), "UTF-8");
            m77533a((Closeable) fileInputStream);
            return str;
        } catch (FileNotFoundException unused3) {
            fileInputStream2 = fileInputStream;
            C18030y.m77591f("hmsSdk", "getInfoFromFile(): No files need to be read");
            m77533a((Closeable) fileInputStream2);
            return "";
        } catch (IOException unused4) {
            fileInputStream2 = fileInputStream;
            C18030y.m77591f("hmsSdk", "getInfoFromFile(): stream.read or new string exception");
            m77533a((Closeable) fileInputStream2);
            return "";
        } catch (Throwable th2) {
            th = th2;
            fileInputStream2 = fileInputStream;
            m77533a((Closeable) fileInputStream2);
            throw th;
        }
    }

    /* JADX INFO: renamed from: a */
    public static String m77532a(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            byte[] bArr = new byte[1024];
            while (true) {
                int i = inputStream.read(bArr);
                if (i == -1) {
                    String string = byteArrayOutputStream.toString("UTF-8");
                    m77533a((Closeable) byteArrayOutputStream);
                    return string;
                }
                byteArrayOutputStream.write(bArr, 0, i);
            }
        } catch (Throwable th) {
            m77533a((Closeable) byteArrayOutputStream);
            throw th;
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m77533a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
                C18030y.m77591f("hmsSdk", "closeQuietly(): Exception when closing the closeable!");
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m77534a(File file, String str) throws Throwable {
        String str2;
        FileOutputStream fileOutputStream;
        FileOutputStream fileOutputStream2 = null;
        try {
            try {
                fileOutputStream = new FileOutputStream(file);
            } catch (Throwable th) {
                th = th;
            }
        } catch (FileNotFoundException unused) {
        } catch (IOException unused2) {
        }
        try {
            fileOutputStream.write(str.getBytes("UTF-8"));
            fileOutputStream.flush();
        } catch (FileNotFoundException unused3) {
            fileOutputStream2 = fileOutputStream;
            str2 = "saveInfoToFile(): No files need to be read";
            C18030y.m77591f("hmsSdk", str2);
            fileOutputStream = fileOutputStream2;
        } catch (IOException unused4) {
            fileOutputStream2 = fileOutputStream;
            str2 = "saveInfoToFile(): io exc from write info to file!";
            C18030y.m77591f("hmsSdk", str2);
            fileOutputStream = fileOutputStream2;
        } catch (Throwable th2) {
            th = th2;
            fileOutputStream2 = fileOutputStream;
            m77533a((Closeable) fileOutputStream2);
            throw th;
        }
        m77533a((Closeable) fileOutputStream);
    }

    /* JADX INFO: renamed from: a */
    public static void m77535a(OutputStream outputStream) {
        if (outputStream != null) {
            try {
                outputStream.close();
            } catch (IOException unused) {
                C18030y.m77591f("hmsSdk", "closeStream(): Exception: close OutputStream error!");
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m77536a(HttpURLConnection httpURLConnection) {
        try {
            httpURLConnection.getInputStream().close();
        } catch (Exception unused) {
            C18030y.m77591f("hmsSdk", "closeQuietly(): Exception when connHttp.getInputStream()!,There may be no network, or no INTERNET permission");
        }
        httpURLConnection.disconnect();
        C18030y.m77580a("hmsSdk", " connHttp disconnect");
    }

    /* JADX INFO: renamed from: a */
    public static byte[] m77537a(byte[] bArr) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        Deflater deflater = new Deflater();
        deflater.setInput(bArr);
        deflater.finish();
        byte[] bArr2 = new byte[1024];
        while (!deflater.finished()) {
            byteArrayOutputStream.write(bArr2, 0, deflater.deflate(bArr2));
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        deflater.end();
        m77535a((OutputStream) byteArrayOutputStream);
        return byteArray;
    }
}
