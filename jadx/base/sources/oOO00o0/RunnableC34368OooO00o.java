package oOO00o0;

import android.util.Log;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: oOO00o0.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class RunnableC34368OooO00o implements Runnable {

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public File f123351OooOoO0;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final LinkedBlockingQueue f123350OooOo0o = new LinkedBlockingQueue();

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public volatile boolean f123349OooOo = true;

    public static void OooO00o(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
                Log.d("FileLogger", "Exception when closing the closeable.");
            }
        }
    }

    public final void OooO0O0(String str) {
        if (this.f123351OooOoO0.length() + ((long) str.length()) > 3145728) {
            if (this.f123351OooOoO0.renameTo(new File(this.f123351OooOoO0.getPath() + ".bak"))) {
                return;
            }
            Log.w("FileLogger", "Failed to backup the log file.");
        }
    }

    public final void OooO0OO(String str) throws Throwable {
        BufferedOutputStream bufferedOutputStream;
        OutputStreamWriter outputStreamWriter;
        FileOutputStream fileOutputStream;
        FileOutputStream fileOutputStream2 = null;
        try {
            try {
                fileOutputStream = new FileOutputStream(this.f123351OooOoO0, true);
                try {
                    bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
                    try {
                        outputStreamWriter = new OutputStreamWriter(bufferedOutputStream, "UTF-8");
                        try {
                            outputStreamWriter.write(str);
                            outputStreamWriter.flush();
                        } catch (FileNotFoundException unused) {
                            fileOutputStream2 = fileOutputStream;
                            Log.d("FileLogger", "Exception when writing the log file.");
                            fileOutputStream = fileOutputStream2;
                        } catch (IOException unused2) {
                            fileOutputStream2 = fileOutputStream;
                            Log.d("FileLogger", "Exception when writing the log file.");
                            fileOutputStream = fileOutputStream2;
                        } catch (Throwable th) {
                            th = th;
                            fileOutputStream2 = fileOutputStream;
                            OooO00o(outputStreamWriter);
                            OooO00o(bufferedOutputStream);
                            OooO00o(fileOutputStream2);
                            throw th;
                        }
                    } catch (FileNotFoundException unused3) {
                        outputStreamWriter = null;
                    } catch (IOException unused4) {
                        outputStreamWriter = null;
                    } catch (Throwable th2) {
                        th = th2;
                        outputStreamWriter = null;
                    }
                } catch (FileNotFoundException unused5) {
                    bufferedOutputStream = null;
                    outputStreamWriter = null;
                } catch (IOException unused6) {
                    bufferedOutputStream = null;
                    outputStreamWriter = null;
                } catch (Throwable th3) {
                    th = th3;
                    bufferedOutputStream = null;
                    outputStreamWriter = null;
                }
            } catch (Throwable th4) {
                th = th4;
            }
        } catch (FileNotFoundException unused7) {
            bufferedOutputStream = null;
            outputStreamWriter = null;
        } catch (IOException unused8) {
            bufferedOutputStream = null;
            outputStreamWriter = null;
        } catch (Throwable th5) {
            th = th5;
            bufferedOutputStream = null;
            outputStreamWriter = null;
        }
        OooO00o(outputStreamWriter);
        OooO00o(bufferedOutputStream);
        OooO00o(fileOutputStream);
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        this.f123349OooOo = true;
        if (this.f123351OooOoO0 != null) {
            while (this.f123349OooOo) {
                try {
                    String str = (String) this.f123350OooOo0o.poll(1L, TimeUnit.SECONDS);
                    if (str != null) {
                        OooO0O0(str);
                        OooO0OO(str);
                    }
                } catch (InterruptedException unused) {
                    Log.d("FileLogger", "run InterruptedException.");
                } catch (Exception unused2) {
                    Log.d("FileLogger", "run Exception.");
                }
            }
        }
        Log.i("FileLogger", "The log logger is closed.");
    }
}
