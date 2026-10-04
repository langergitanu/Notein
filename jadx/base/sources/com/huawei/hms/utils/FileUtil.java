package com.huawei.hms.utils;

import android.content.Context;
import com.huawei.hms.network.embedded.C18101a5;
import com.huawei.hms.support.log.HMSLog;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes9.dex */
public abstract class FileUtil {
    public static final String LOCAL_REPORT_FILE = "hms/HwMobileServiceReport.txt";
    public static final String LOCAL_REPORT_FILE_CONFIG = "hms/config.txt";
    public static final long LOCAL_REPORT_FILE_MAX_SIZE = 10240;

    /* JADX INFO: renamed from: a */
    public static boolean f56991a = false;

    /* JADX INFO: renamed from: b */
    public static ScheduledExecutorService f56992b = Executors.newSingleThreadScheduledExecutor();

    /* JADX INFO: renamed from: com.huawei.hms.utils.FileUtil$a */
    public static class RunnableC18496a implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ File f56993a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ long f56994b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ String f56995c;

        public RunnableC18496a(File file, long j, String str) {
            this.f56993a = file;
            this.f56994b = j;
            this.f56995c = str;
        }

        @Override // java.lang.Runnable
        public void run() throws Throwable {
            File file = this.f56993a;
            if (file == null) {
                HMSLog.m80172e("FileUtil", "In writeFile Failed to get local file.");
                return;
            }
            File parentFile = file.getParentFile();
            if (parentFile == null || !(parentFile.mkdirs() || parentFile.isDirectory())) {
                HMSLog.m80172e("FileUtil", "In writeFile, Failed to create directory.");
                return;
            }
            RandomAccessFile randomAccessFile = null;
            try {
                try {
                    long length = this.f56993a.length();
                    if (length > this.f56994b) {
                        String canonicalPath = this.f56993a.getCanonicalPath();
                        if (!this.f56993a.delete()) {
                            HMSLog.m80172e("FileUtil", "last file delete failed.");
                        }
                        randomAccessFile = new RandomAccessFile(new File(canonicalPath), "rw");
                    } else {
                        RandomAccessFile randomAccessFile2 = new RandomAccessFile(this.f56993a, "rw");
                        try {
                            randomAccessFile2.seek(length);
                            randomAccessFile = randomAccessFile2;
                        } catch (IOException e) {
                            e = e;
                            randomAccessFile = randomAccessFile2;
                            HMSLog.m80173e("FileUtil", "writeFile exception:", e);
                        } catch (Throwable th) {
                            th = th;
                            randomAccessFile = randomAccessFile2;
                            IOUtils.closeQuietly(randomAccessFile);
                            throw th;
                        }
                    }
                    randomAccessFile.writeBytes(this.f56995c + System.getProperty(C18101a5.f54156e));
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (IOException e2) {
                e = e2;
            }
            IOUtils.closeQuietly(randomAccessFile);
        }
    }

    public static boolean verifyHash(String str, File file) throws Throwable {
        byte[] bArrDigest = SHA256.digest(file);
        return bArrDigest != null && HEX.encodeHexString(bArrDigest, true).equalsIgnoreCase(str);
    }

    public static void writeFile(File file, String str, long j) {
        f56992b.execute(new RunnableC18496a(file, j, str));
    }

    public static void writeFileReport(Context context, File file, File file2, String str, long j, int i) {
        if (file != null && file.isFile() && file.exists()) {
            if (!f56991a) {
                if (file2 != null && file2.exists() && !file2.delete()) {
                    HMSLog.m80172e("FileUtil", "file delete failed.");
                }
                f56991a = true;
            }
            writeFile(file2, str + "|" + j + "|" + i, LOCAL_REPORT_FILE_MAX_SIZE);
        }
    }
}
