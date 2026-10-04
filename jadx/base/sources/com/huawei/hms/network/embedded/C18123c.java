package com.huawei.hms.network.embedded;

import androidx.core.content.C21638OooO0Oo;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.Reader;
import java.io.StringWriter;
import java.nio.charset.Charset;

/* JADX INFO: renamed from: com.huawei.hms.network.embedded.c */
/* JADX INFO: loaded from: classes9.dex */
public final class C18123c {

    /* JADX INFO: renamed from: a */
    public static final Charset f54348a = Charset.forName("US-ASCII");

    /* JADX INFO: renamed from: b */
    public static final Charset f54349b = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: a */
    public static String m78030a(Reader reader) throws IOException {
        try {
            StringWriter stringWriter = new StringWriter();
            char[] cArr = new char[1024];
            while (true) {
                int i = reader.read(cArr);
                if (i == -1) {
                    String string = stringWriter.toString();
                    reader.close();
                    return string;
                }
                stringWriter.write(cArr, 0, i);
            }
        } catch (Throwable th) {
            reader.close();
            throw th;
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m78031a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e) {
                throw e;
            } catch (Exception unused) {
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m78032a(File file) throws IOException {
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null) {
            throw new IOException(C21638OooO0Oo.OooO00o(file, "not a readable directory: "));
        }
        for (File file2 : fileArrListFiles) {
            if (file2.isDirectory()) {
                m78032a(file2);
            }
            if (!file2.delete()) {
                throw new IOException(C21638OooO0Oo.OooO00o(file2, "failed to delete file: "));
            }
        }
    }
}
