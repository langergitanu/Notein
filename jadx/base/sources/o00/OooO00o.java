package o00;

import android.util.Log;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.HashMap;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes.dex */
public final class OooO00o {

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static final HashMap f80959OooO0o0 = new HashMap();

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final boolean f80960OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final File f80961OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final Lock f80962OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public FileChannel f80963OooO0Oo;

    public OooO00o(String str, File file, boolean z) {
        Lock lock;
        this.f80960OooO00o = z;
        this.f80961OooO0O0 = file != null ? new File(file, str.concat(".lck")) : null;
        HashMap map = f80959OooO0o0;
        synchronized (map) {
            try {
                Object reentrantLock = map.get(str);
                if (reentrantLock == null) {
                    reentrantLock = new ReentrantLock();
                    map.put(str, reentrantLock);
                }
                lock = (Lock) reentrantLock;
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f80962OooO0OO = lock;
    }

    public final void OooO00o(boolean z) {
        this.f80962OooO0OO.lock();
        if (z) {
            File file = this.f80961OooO0O0;
            try {
                if (file == null) {
                    throw new IOException("No lock directory was provided.");
                }
                File parentFile = file.getParentFile();
                if (parentFile != null) {
                    parentFile.mkdirs();
                }
                FileChannel channel = new FileOutputStream(file).getChannel();
                channel.lock();
                this.f80963OooO0Oo = channel;
            } catch (IOException e) {
                this.f80963OooO0Oo = null;
                Log.w("SupportSQLiteLock", "Unable to grab file lock.", e);
            }
        }
    }

    public final void OooO0O0() {
        try {
            FileChannel fileChannel = this.f80963OooO0Oo;
            if (fileChannel != null) {
                fileChannel.close();
            }
        } catch (IOException unused) {
        }
        this.f80962OooO0OO.unlock();
    }
}
