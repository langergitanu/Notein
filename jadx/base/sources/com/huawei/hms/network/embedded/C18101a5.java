package com.huawei.hms.network.embedded;

import androidx.concurrent.futures.OooO00o;
import com.huawei.hms.framework.common.ContextHolder;
import com.huawei.hms.framework.common.CreateFileUtil;
import com.huawei.hms.framework.common.Logger;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: renamed from: com.huawei.hms.network.embedded.a5 */
/* JADX INFO: loaded from: classes9.dex */
public class C18101a5 {

    /* JADX INFO: renamed from: b */
    public static final String f54153b = "FileRecordManager";

    /* JADX INFO: renamed from: c */
    public static final C18101a5 f54154c = new C18101a5();

    /* JADX INFO: renamed from: d */
    public static final String f54155d = "data.txt";

    /* JADX INFO: renamed from: e */
    public static final String f54156e = "line.separator";

    /* JADX INFO: renamed from: f */
    public static final String f54157f;

    /* JADX INFO: renamed from: a */
    public ExecutorService f54158a;

    /* JADX INFO: renamed from: com.huawei.hms.network.embedded.a5$a */
    public class a implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f54159a;

        public a(String str) {
            this.f54159a = str;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x004c A[Catch: IOException -> 0x0058, PHI: r2
          0x004c: PHI (r2v3 java.io.RandomAccessFile) = (r2v2 java.io.RandomAccessFile), (r2v4 java.io.RandomAccessFile) binds: [B:9:0x004a, B:13:0x0055] A[DONT_GENERATE, DONT_INLINE], TRY_ENTER, TRY_LEAVE, TryCatch #1 {IOException -> 0x0058, blocks: (B:4:0x003f, B:10:0x004c), top: B:22:0x0005 }] */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void run() {
            RandomAccessFile randomAccessFileNewRandomAccessFile = null;
            try {
                try {
                    try {
                        randomAccessFileNewRandomAccessFile = CreateFileUtil.newRandomAccessFile(C18101a5.f54157f, "rwd");
                        randomAccessFileNewRandomAccessFile.seek(randomAccessFileNewRandomAccessFile.length());
                        randomAccessFileNewRandomAccessFile.write((C18101a5.this.getDate() + this.f54159a + System.getProperty(C18101a5.f54156e)).getBytes("UTF-8"));
                        randomAccessFileNewRandomAccessFile.close();
                    } catch (IOException unused) {
                        Logger.m76967w(C18101a5.f54153b, "the randomAccessFile isn't colsed successfully!");
                    }
                } catch (FileNotFoundException unused2) {
                    Logger.m76967w(C18101a5.f54153b, "the file is not found");
                    if (randomAccessFileNewRandomAccessFile != null) {
                        randomAccessFileNewRandomAccessFile.close();
                    }
                } catch (IOException unused3) {
                    Logger.m76967w(C18101a5.f54153b, "the file write fail!");
                    if (randomAccessFileNewRandomAccessFile != null) {
                    }
                }
            } catch (Throwable th) {
                if (randomAccessFileNewRandomAccessFile != null) {
                    try {
                        randomAccessFileNewRandomAccessFile.close();
                    } catch (IOException unused4) {
                        Logger.m76967w(C18101a5.f54153b, "the randomAccessFile isn't colsed successfully!");
                    }
                }
                throw th;
            }
        }
    }

    static {
        StringBuilder sb = new StringBuilder();
        sb.append(ContextHolder.getAppContext().getExternalCacheDir());
        f54157f = OooO00o.OooO0OO(sb, File.separator, f54155d);
    }

    public C18101a5() {
        this.f54158a = null;
        this.f54158a = Executors.newSingleThreadExecutor();
    }

    public static C18101a5 getInstance() {
        return f54154c;
    }

    public String getDate() {
        String str = new SimpleDateFormat("yyyy-MM-dd&&HH:mm:ss:SSSS", Locale.ENGLISH).format(new Date());
        Logger.m76966v(f54153b, "the time is : %s", str);
        return str;
    }

    public void saveToLocalFile(String str) {
        Logger.m76966v(f54153b, "come into the savaToLocalFile! %s", f54157f);
        this.f54158a.execute(new a(str));
    }
}
