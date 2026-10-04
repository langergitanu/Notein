package androidx.profileinstaller;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.AssetFileDescriptor;
import android.os.Build;
import androidx.concurrent.futures.OooO;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Objects;

/* JADX INFO: renamed from: androidx.profileinstaller.OooO0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C22027OooO0Oo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final OooO<OooO0OO> f65743OooO00o = new OooO<>();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final Object f65744OooO0O0 = new Object();

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static OooO0OO f65745OooO0OO = null;

    /* JADX INFO: renamed from: androidx.profileinstaller.OooO0Oo$OooO00o */
    public static class OooO00o {
        public static PackageInfo OooO00o(Context context, PackageManager packageManager) throws PackageManager.NameNotFoundException {
            return packageManager.getPackageInfo(context.getPackageName(), PackageManager.PackageInfoFlags.of(0L));
        }
    }

    /* JADX INFO: renamed from: androidx.profileinstaller.OooO0Oo$OooO0O0 */
    public static class OooO0O0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final int f65746OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final int f65747OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final long f65748OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final long f65749OooO0Oo;

        public OooO0O0(int i, int i2, long j, long j2) {
            this.f65746OooO00o = i;
            this.f65747OooO0O0 = i2;
            this.f65748OooO0OO = j;
            this.f65749OooO0Oo = j2;
        }

        public static OooO0O0 OooO00o(File file) throws IOException {
            DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
            try {
                OooO0O0 oooO0O0 = new OooO0O0(dataInputStream.readInt(), dataInputStream.readInt(), dataInputStream.readLong(), dataInputStream.readLong());
                dataInputStream.close();
                return oooO0O0;
            } finally {
            }
        }

        public final void OooO0O0(File file) throws IOException {
            file.delete();
            DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(file));
            try {
                dataOutputStream.writeInt(this.f65746OooO00o);
                dataOutputStream.writeInt(this.f65747OooO0O0);
                dataOutputStream.writeLong(this.f65748OooO0OO);
                dataOutputStream.writeLong(this.f65749OooO0Oo);
                dataOutputStream.close();
            } catch (Throwable th) {
                try {
                    dataOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && (obj instanceof OooO0O0)) {
                OooO0O0 oooO0O0 = (OooO0O0) obj;
                if (this.f65747OooO0O0 == oooO0O0.f65747OooO0O0 && this.f65748OooO0OO == oooO0O0.f65748OooO0OO && this.f65746OooO00o == oooO0O0.f65746OooO00o && this.f65749OooO0Oo == oooO0O0.f65749OooO0Oo) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            return Objects.hash(Integer.valueOf(this.f65747OooO0O0), Long.valueOf(this.f65748OooO0OO), Integer.valueOf(this.f65746OooO00o), Long.valueOf(this.f65749OooO0Oo));
        }
    }

    /* JADX INFO: renamed from: androidx.profileinstaller.OooO0Oo$OooO0OO */
    public static class OooO0OO {
    }

    public static long OooO00o(Context context) throws PackageManager.NameNotFoundException {
        PackageManager packageManager = context.getApplicationContext().getPackageManager();
        return Build.VERSION.SDK_INT >= 33 ? OooO00o.OooO00o(context, packageManager).lastUpdateTime : packageManager.getPackageInfo(context.getPackageName(), 0).lastUpdateTime;
    }

    public static OooO0OO OooO0O0() {
        OooO0OO oooO0OO = new OooO0OO();
        f65745OooO0OO = oooO0OO;
        f65743OooO00o.set(oooO0OO);
        return f65745OooO0OO;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x00f4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:109:0x00a8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void OooO0OO(Context context, boolean z) {
        int i;
        boolean z2;
        int i2;
        long length;
        File file;
        OooO0O0 oooO0O0OooO00o;
        OooO0O0 oooO0O0;
        int i3;
        AssetFileDescriptor assetFileDescriptorOpenFd;
        if (z || f65745OooO0OO == null) {
            synchronized (f65744OooO0O0) {
                if (z) {
                    i = 0;
                    assetFileDescriptorOpenFd = context.getAssets().openFd("dexopt/baseline.prof");
                    if (assetFileDescriptorOpenFd.getLength() <= 0) {
                    }
                    assetFileDescriptorOpenFd.close();
                    i2 = Build.VERSION.SDK_INT;
                    if (i2 >= 28) {
                        File file2 = new File(new File("/data/misc/profiles/ref/", context.getPackageName()), "primary.prof");
                        long length2 = file2.length();
                        if (file2.exists()) {
                            File file3 = new File(new File("/data/misc/profiles/cur/0/", context.getPackageName()), "primary.prof");
                            length = file3.length();
                            if (file3.exists()) {
                                long jOooO00o = OooO00o(context);
                                file = new File(context.getFilesDir(), "profileInstalled");
                                if (file.exists()) {
                                }
                                if (oooO0O0OooO00o == null) {
                                    if (z2) {
                                    }
                                }
                                if (z) {
                                    i = 2;
                                }
                                if (oooO0O0OooO00o != null) {
                                    i = 3;
                                }
                                oooO0O0 = new OooO0O0(1, i, jOooO00o, length);
                                if (oooO0O0OooO00o != null) {
                                    oooO0O0.OooO0O0(file);
                                }
                                OooO0O0();
                                return;
                            }
                        }
                    }
                    OooO0O0();
                    return;
                }
                if (f65745OooO0OO != null) {
                    return;
                }
                i = 0;
                try {
                    assetFileDescriptorOpenFd = context.getAssets().openFd("dexopt/baseline.prof");
                    try {
                        z2 = assetFileDescriptorOpenFd.getLength() <= 0;
                        assetFileDescriptorOpenFd.close();
                    } finally {
                    }
                } catch (IOException unused) {
                    z2 = false;
                }
                i2 = Build.VERSION.SDK_INT;
                if (i2 >= 28 && i2 != 30) {
                    File file22 = new File(new File("/data/misc/profiles/ref/", context.getPackageName()), "primary.prof");
                    long length22 = file22.length();
                    boolean z3 = !file22.exists() && length22 > 0;
                    File file32 = new File(new File("/data/misc/profiles/cur/0/", context.getPackageName()), "primary.prof");
                    length = file32.length();
                    boolean z4 = !file32.exists() && length > 0;
                    try {
                        long jOooO00o2 = OooO00o(context);
                        file = new File(context.getFilesDir(), "profileInstalled");
                        if (file.exists()) {
                            oooO0O0OooO00o = null;
                        } else {
                            try {
                                oooO0O0OooO00o = OooO0O0.OooO00o(file);
                            } catch (IOException unused2) {
                                OooO0O0();
                                return;
                            }
                        }
                        if (oooO0O0OooO00o == null && oooO0O0OooO00o.f65748OooO0OO == jOooO00o2 && (i3 = oooO0O0OooO00o.f65747OooO0O0) != 2) {
                            i = i3;
                        } else if (z2) {
                            i = 327680;
                        } else if (z3) {
                            i = 1;
                        } else if (z4) {
                            i = 2;
                        }
                        if (z && z4 && i != 1) {
                            i = 2;
                        }
                        if (oooO0O0OooO00o != null && oooO0O0OooO00o.f65747OooO0O0 == 2 && i == 1 && length22 < oooO0O0OooO00o.f65749OooO0Oo) {
                            i = 3;
                        }
                        oooO0O0 = new OooO0O0(1, i, jOooO00o2, length);
                        if (oooO0O0OooO00o != null || !oooO0O0OooO00o.equals(oooO0O0)) {
                            try {
                                oooO0O0.OooO0O0(file);
                            } catch (IOException unused3) {
                            }
                        }
                        OooO0O0();
                        return;
                    } catch (PackageManager.NameNotFoundException unused4) {
                        OooO0O0();
                        return;
                    }
                }
                OooO0O0();
                return;
            }
        }
    }
}
