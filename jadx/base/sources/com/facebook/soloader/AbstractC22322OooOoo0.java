package com.facebook.soloader;

import android.content.Context;
import android.os.Parcel;
import android.util.Log;
import androidx.core.content.C21638OooO0Oo;
import com.facebook.soloader.SysUtil;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.io.SyncFailedException;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.soloader.OooOoo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC22322OooOoo0 extends OooO0o implements com.facebook.soloader.OooO0O0 {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final Context f67513OooO0Oo;

    /* JADX INFO: renamed from: com.facebook.soloader.OooOoo0$OooO00o */
    public class OooO00o implements Runnable {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ File f67514OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ boolean f67515OooOo0o;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public final /* synthetic */ OooOOO0 f67517OooOoO0;

        public OooO00o(boolean z, File file, OooOOO0 oooOOO0) {
            this.f67515OooOo0o = z;
            this.f67514OooOo = file;
            this.f67517OooOoO0 = oooOOO0;
        }

        @Override // java.lang.Runnable
        public final void run() {
            OooOOO0 oooOOO0 = this.f67517OooOoO0;
            OooOOO.OooO0O0("fb-UnpackingSoSource", "starting syncer worker");
            AbstractC22322OooOoo0 abstractC22322OooOoo0 = AbstractC22322OooOoo0.this;
            boolean z = this.f67515OooOo0o;
            try {
                if (z) {
                    try {
                        SysUtil.OooO0OO(abstractC22322OooOoo0.f67483OooO00o);
                    } catch (Throwable th) {
                        OooOOO.OooO0O0("fb-UnpackingSoSource", "releasing dso store lock for " + abstractC22322OooOoo0.f67483OooO00o + " (from syncer thread)");
                        oooOOO0.close();
                        throw th;
                    }
                }
                AbstractC22322OooOoo0.OooOO0(this.f67514OooOo, (byte) 1, z);
                OooOOO.OooO0O0("fb-UnpackingSoSource", "releasing dso store lock for " + abstractC22322OooOoo0.f67483OooO00o + " (from syncer thread)");
                oooOOO0.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    /* JADX INFO: renamed from: com.facebook.soloader.OooOoo0$OooO0O0 */
    public static class OooO0O0 {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final String f67518OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final String f67519OooOo0o;

        public OooO0O0(String str, String str2) {
            this.f67519OooOo0o = str;
            this.f67518OooOo = str2;
        }
    }

    /* JADX INFO: renamed from: com.facebook.soloader.OooOoo0$OooO0OO */
    public static final class OooO0OO implements Closeable {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final InputStream f67520OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final OooO0O0 f67521OooOo0o;

        public OooO0OO(OooO0O0 oooO0O0, InputStream inputStream) {
            this.f67521OooOo0o = oooO0O0;
            this.f67520OooOo = inputStream;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() throws IOException {
            this.f67520OooOo.close();
        }
    }

    /* JADX INFO: renamed from: com.facebook.soloader.OooOoo0$OooO0Oo, reason: case insensitive filesystem */
    public static abstract class AbstractC22323OooO0Oo implements Closeable {
        public static void OooO00o(OooO0OO oooO0OO, byte[] bArr, File file) throws IOException {
            RandomAccessFile randomAccessFile;
            int i;
            StringBuilder sb = new StringBuilder("extracting DSO ");
            OooO0O0 oooO0O0 = oooO0OO.f67521OooOo0o;
            InputStream inputStream = oooO0OO.f67520OooOo;
            sb.append(oooO0O0.f67519OooOo0o);
            String string = sb.toString();
            if (Log.isLoggable("fb-UnpackingSoSource", 4)) {
                Log.i("fb-UnpackingSoSource", string);
            }
            File file2 = new File(file, oooO0O0.f67519OooOo0o);
            try {
                try {
                    RandomAccessFile randomAccessFile2 = new RandomAccessFile(file2, "rw");
                    try {
                        int iAvailable = inputStream.available();
                        if (iAvailable > 1) {
                            randomAccessFile = randomAccessFile2;
                            try {
                                SysUtil.LollipopSysdeps.fallocateIfSupported(randomAccessFile2.getFD(), iAvailable);
                            } catch (Throwable th) {
                                th = th;
                                Throwable th2 = th;
                                try {
                                    randomAccessFile.close();
                                    throw th2;
                                } catch (Throwable th3) {
                                    th2.addSuppressed(th3);
                                    throw th2;
                                }
                            }
                        } else {
                            randomAccessFile = randomAccessFile2;
                        }
                        int i2 = 0;
                        while (i2 < Integer.MAX_VALUE && (i = inputStream.read(bArr, 0, Math.min(bArr.length, Integer.MAX_VALUE - i2))) != -1) {
                            randomAccessFile.write(bArr, 0, i);
                            i2 += i;
                        }
                        randomAccessFile.setLength(randomAccessFile.getFilePointer());
                        if (!file2.setExecutable(true, false)) {
                            throw new IOException("cannot make file executable: " + file2);
                        }
                        randomAccessFile.close();
                        if (!file2.exists() || file2.setWritable(false)) {
                            return;
                        }
                        Log.e("SoLoader", "Error removing " + file2 + " write permission from directory " + file + " (writable: " + file.canWrite() + ")");
                    } catch (Throwable th4) {
                        th = th4;
                        randomAccessFile = randomAccessFile2;
                    }
                } catch (IOException e) {
                    Log.e("fb-UnpackingSoSource", "error extracting dso  " + file2 + " due to: " + e);
                    SysUtil.OooO0O0(file2);
                    throw e;
                }
            } catch (Throwable th5) {
                if (file2.exists() && !file2.setWritable(false)) {
                    Log.e("SoLoader", "Error removing " + file2 + " write permission from directory " + file + " (writable: " + file.canWrite() + ")");
                }
                throw th5;
            }
        }

        public abstract OooO0O0[] OooO0OO() throws IOException;

        public abstract void OooOOO0(File file) throws IOException;

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
        }
    }

    public AbstractC22322OooOoo0(Context context, String str) {
        super(OooO0oO(context, str), 1);
        this.f67513OooO0Oo = context;
    }

    public static File OooO0oO(Context context, String str) {
        return new File(com.aspose.slides.OooOOO.OooO0O0(new StringBuilder(), context.getApplicationInfo().dataDir, "/", str));
    }

    public static void OooOO0(File file, byte b, boolean z) throws IOException {
        try {
            RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
            try {
                randomAccessFile.seek(0L);
                randomAccessFile.write(b);
                randomAccessFile.setLength(randomAccessFile.getFilePointer());
                if (z) {
                    randomAccessFile.getFD().sync();
                }
                randomAccessFile.close();
            } finally {
            }
        } catch (SyncFailedException e) {
            Log.w("fb-UnpackingSoSource", "state file sync failed", e);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00c4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean OooO(OooOOO0 oooOOO0, int i) throws IOException {
        byte b;
        RandomAccessFile randomAccessFile;
        boolean z;
        RandomAccessFile randomAccessFile2;
        File file = this.f67483OooO00o;
        File file2 = new File(file, "dso_state");
        byte[] bArrOooO0o = OooO0o();
        boolean z2 = true;
        boolean z3 = (i & 2) != 0;
        if (!z3) {
            try {
                randomAccessFile2 = new RandomAccessFile(new File(file, "dso_deps"), "rw");
                try {
                } finally {
                }
            } catch (IOException e) {
                Log.w("fb-UnpackingSoSource", "failed to compare whether deps changed", e);
            }
            if (randomAccessFile2.length() != 0) {
                int length = (int) randomAccessFile2.length();
                byte[] bArr = new byte[length];
                if (randomAccessFile2.read(bArr) != length) {
                    OooOOO.OooO0O0("fb-UnpackingSoSource", "short read of so store deps file: marking unclean");
                } else {
                    z = !Arrays.equals(bArr, bArrOooO0o);
                    randomAccessFile2.close();
                    if (z) {
                        randomAccessFile = new RandomAccessFile(file2, "rw");
                        try {
                            if (randomAccessFile.length() == 1) {
                                try {
                                    b = randomAccessFile.readByte();
                                } catch (IOException e2) {
                                    OooOOO.OooO0O0("fb-UnpackingSoSource", "dso store " + file + " regeneration interrupted: " + e2.getMessage());
                                }
                                if (b == 1) {
                                    OooOOO.OooO0O0("fb-UnpackingSoSource", "dso store " + file + " regeneration not needed: state file clean");
                                } else {
                                    b = 0;
                                }
                                randomAccessFile.close();
                            }
                        } finally {
                        }
                    } else {
                        b = 0;
                    }
                }
            }
            randomAccessFile2.close();
            z = true;
            if (z) {
            }
        }
        if (b == 1) {
            return false;
        }
        boolean z4 = (i & 4) == 0;
        OooOOO.OooO0O0("fb-UnpackingSoSource", "so store dirty: regenerating");
        OooOO0(file2, (byte) 0, z4);
        File[] fileArrListFiles = file.listFiles(new C22321OooOoOO());
        if (fileArrListFiles == null) {
            throw new IOException(C21638OooO0Oo.OooO00o(file, "unable to list directory "));
        }
        int length2 = fileArrListFiles.length;
        int i2 = 0;
        while (i2 < length2) {
            File file3 = fileArrListFiles[i2];
            OooOOO.OooO0O0("fb-UnpackingSoSource", "Deleting " + file3);
            SysUtil.OooO0O0(file3);
            i2++;
            z2 = z2;
        }
        boolean z5 = z2;
        AbstractC22323OooO0Oo abstractC22323OooO0OoOooO0oo = OooO0oo(z3);
        try {
            abstractC22323OooO0OoOooO0oo.OooOOO0(file);
            abstractC22323OooO0OoOooO0oo.close();
            randomAccessFile = new RandomAccessFile(new File(file, "dso_deps"), "rw");
            try {
                randomAccessFile.write(bArrOooO0o);
                randomAccessFile.setLength(randomAccessFile.getFilePointer());
                randomAccessFile.close();
                OooO00o oooO00o = new OooO00o(z4, file2, oooOOO0);
                if ((i & 1) != 0 ? z5 : false) {
                    new Thread(oooO00o, "SoSync:" + file.getName()).start();
                } else {
                    oooO00o.run();
                }
                return z5;
            } finally {
            }
        } finally {
        }
    }

    @Override // com.facebook.soloader.OooO0O0
    public final void OooO00o() {
        File file = this.f67483OooO00o;
        try {
            SysUtil.OooO0Oo(file, new File(file, "dso_lock")).close();
        } catch (Exception e) {
            Log.e("fb-UnpackingSoSource", "Encountered exception during wait for unpacking trying to acquire file lock for " + getClass().getName() + " (" + file + "): ", e);
        }
    }

    public byte[] OooO0o() throws IOException {
        Parcel parcelObtain = Parcel.obtain();
        AbstractC22323OooO0Oo abstractC22323OooO0OoOooO0oo = OooO0oo(false);
        try {
            OooO0O0[] oooO0O0ArrOooO0OO = abstractC22323OooO0OoOooO0oo.OooO0OO();
            parcelObtain.writeInt(oooO0O0ArrOooO0OO.length);
            for (OooO0O0 oooO0O0 : oooO0O0ArrOooO0OO) {
                parcelObtain.writeString(oooO0O0.f67519OooOo0o);
                parcelObtain.writeString(oooO0O0.f67518OooOo);
            }
            abstractC22323OooO0OoOooO0oo.close();
            byte[] bArrMarshall = parcelObtain.marshall();
            parcelObtain.recycle();
            return bArrMarshall;
        } catch (Throwable th) {
            try {
                abstractC22323OooO0OoOooO0oo.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // com.facebook.soloader.AbstractC22320OooOoO0
    public final void OooO0o0(int i) throws IOException {
        File file = this.f67483OooO00o;
        if (!file.mkdirs() && !file.isDirectory()) {
            throw new IOException(C21638OooO0Oo.OooO00o(file, "cannot mkdir: "));
        }
        if (!file.canWrite() && !file.setWritable(true)) {
            throw new IOException("error adding " + file.getCanonicalPath() + " write permission");
        }
        OooOOO0 oooOOO0 = null;
        try {
            try {
                OooOOO0 oooOOO0OooO0Oo = SysUtil.OooO0Oo(file, new File(file, "dso_lock"));
                try {
                    OooOOO.OooO0O0("fb-UnpackingSoSource", "locked dso store " + file);
                    if (!file.canWrite() && !file.setWritable(true)) {
                        throw new IOException("error adding " + file.getCanonicalPath() + " write permission");
                    }
                    if (!OooO(oooOOO0OooO0Oo, i)) {
                        String str = "dso store is up-to-date: " + file;
                        if (Log.isLoggable("fb-UnpackingSoSource", 4)) {
                            Log.i("fb-UnpackingSoSource", str);
                        }
                        oooOOO0 = oooOOO0OooO0Oo;
                    }
                    if (oooOOO0 != null) {
                        OooOOO.OooO0O0("fb-UnpackingSoSource", "releasing dso store lock for " + file);
                        oooOOO0.close();
                    } else {
                        OooOOO.OooO0O0("fb-UnpackingSoSource", "not releasing dso store lock for " + file + " (syncer thread started)");
                    }
                    if (!file.canWrite() || file.setWritable(false)) {
                        return;
                    }
                    throw new IOException("error removing " + file.getCanonicalPath() + " write permission");
                } catch (Throwable th) {
                    th = th;
                    oooOOO0 = oooOOO0OooO0Oo;
                    if (oooOOO0 != null) {
                        OooOOO.OooO0O0("fb-UnpackingSoSource", "releasing dso store lock for " + file);
                        oooOOO0.close();
                    } else {
                        OooOOO.OooO0O0("fb-UnpackingSoSource", "not releasing dso store lock for " + file + " (syncer thread started)");
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                if (!file.canWrite() || file.setWritable(false)) {
                    throw th2;
                }
                throw new IOException("error removing " + file.getCanonicalPath() + " write permission");
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public abstract AbstractC22323OooO0Oo OooO0oo(boolean z) throws IOException;
}
