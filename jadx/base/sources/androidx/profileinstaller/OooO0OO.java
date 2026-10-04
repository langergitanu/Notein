package androidx.profileinstaller;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import android.os.Build;
import android.util.Log;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.Serializable;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.Arrays;
import java.util.concurrent.Executor;
import o000oOoo.C24642OooO0O0;
import o000oOoo.C24643OooO0OO;
import o000oOoo.C24645OooO0o;

/* JADX INFO: loaded from: classes.dex */
public final class OooO0OO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final OooO00o f65742OooO00o = new OooO00o();

    public class OooO00o implements InterfaceC19032OooO0OO {
        @Override // androidx.profileinstaller.OooO0OO.InterfaceC19032OooO0OO
        public final void OooO00o(int i, Serializable serializable) {
        }

        @Override // androidx.profileinstaller.OooO0OO.InterfaceC19032OooO0OO
        public final void OooO0O0() {
        }
    }

    public class OooO0O0 implements InterfaceC19032OooO0OO {
        @Override // androidx.profileinstaller.OooO0OO.InterfaceC19032OooO0OO
        public final void OooO00o(int i, Serializable serializable) {
            String str;
            switch (i) {
                case 1:
                    str = "RESULT_INSTALL_SUCCESS";
                    break;
                case 2:
                    str = "RESULT_ALREADY_INSTALLED";
                    break;
                case 3:
                    str = "RESULT_UNSUPPORTED_ART_VERSION";
                    break;
                case 4:
                    str = "RESULT_NOT_WRITABLE";
                    break;
                case 5:
                    str = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
                    break;
                case 6:
                    str = "RESULT_BASELINE_PROFILE_NOT_FOUND";
                    break;
                case 7:
                    str = "RESULT_IO_EXCEPTION";
                    break;
                case 8:
                    str = "RESULT_PARSE_EXCEPTION";
                    break;
                case 9:
                default:
                    str = "";
                    break;
                case 10:
                    str = "RESULT_INSTALL_SKIP_FILE_SUCCESS";
                    break;
                case 11:
                    str = "RESULT_DELETE_SKIP_FILE_SUCCESS";
                    break;
            }
            if (i == 6 || i == 7 || i == 8) {
                Log.e("ProfileInstaller", str, (Throwable) serializable);
            } else {
                Log.d("ProfileInstaller", str);
            }
        }

        @Override // androidx.profileinstaller.OooO0OO.InterfaceC19032OooO0OO
        public final void OooO0O0() {
            Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
        }
    }

    /* JADX INFO: renamed from: androidx.profileinstaller.OooO0OO$OooO0OO, reason: collision with other inner class name */
    public interface InterfaceC19032OooO0OO {
        void OooO00o(int i, Serializable serializable);

        void OooO0O0();
    }

    public static void OooO00o(PackageInfo packageInfo, File file) {
        try {
            DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(new File(file, "profileinstaller_profileWrittenFor_lastUpdateTime.dat")));
            try {
                dataOutputStream.writeLong(packageInfo.lastUpdateTime);
                dataOutputStream.close();
            } finally {
            }
        } catch (IOException unused) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x02ba  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x02d0 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:242:0x02d4  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x0105 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:271:0x0161 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x01be A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0153  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void OooO0O0(Context context, Executor executor, InterfaceC19032OooO0OO interfaceC19032OooO0OO, boolean z) {
        char c;
        FileInputStream fileInputStreamOooO00o;
        C24642OooO0O0[] c24642OooO0O0ArrOooO0oO;
        C24642OooO0O0[] c24642OooO0O0Arr;
        C24642OooO0O0[] c24642OooO0O0Arr2;
        byte[] bArr;
        boolean z2;
        Throwable th;
        Throwable th2;
        boolean z3;
        byte[] bArr2;
        ByteArrayOutputStream byteArrayOutputStream;
        androidx.profileinstaller.OooO0O0 oooO0O0;
        FileInputStream fileInputStreamOooO00o2;
        boolean z4;
        Context applicationContext = context.getApplicationContext();
        String packageName = applicationContext.getPackageName();
        ApplicationInfo applicationInfo = applicationContext.getApplicationInfo();
        AssetManager assets = applicationContext.getAssets();
        String name = new File(applicationInfo.sourceDir).getName();
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
            File filesDir = context.getFilesDir();
            if (!z) {
                File file = new File(filesDir, "profileinstaller_profileWrittenFor_lastUpdateTime.dat");
                if (file.exists()) {
                    try {
                        DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
                        try {
                            long j = dataInputStream.readLong();
                            dataInputStream.close();
                            z4 = j == packageInfo.lastUpdateTime;
                            if (z4) {
                                interfaceC19032OooO0OO.OooO00o(2, null);
                            }
                        } finally {
                        }
                    } catch (IOException unused) {
                        z4 = false;
                    }
                    if (z4) {
                    }
                } else {
                    z4 = false;
                    if (z4) {
                        Log.d("ProfileInstaller", "Skipping profile installation for " + context.getPackageName());
                        C22027OooO0Oo.OooO0OO(context, false);
                        return;
                    }
                }
            }
            Log.d("ProfileInstaller", "Installing profile for " + context.getPackageName());
            File file2 = new File(new File("/data/misc/profiles/cur/0", packageName), "primary.prof");
            androidx.profileinstaller.OooO0O0 oooO0O02 = new androidx.profileinstaller.OooO0O0(assets, executor, interfaceC19032OooO0OO, name, file2);
            byte[] bArr3 = oooO0O02.f65736OooO0OO;
            if (bArr3 != null) {
                if (file2.exists()) {
                    if (!file2.canWrite()) {
                        oooO0O02.OooO0O0(4, null);
                    }
                    oooO0O02.f65738OooO0o = true;
                    byte[] bArr4 = C24645OooO0o.f83477OooO00o;
                    try {
                        fileInputStreamOooO00o = oooO0O02.OooO00o(assets, "dexopt/baseline.prof");
                    } catch (FileNotFoundException e) {
                        interfaceC19032OooO0OO.OooO00o(6, e);
                        fileInputStreamOooO00o = null;
                    } catch (IOException e2) {
                        interfaceC19032OooO0OO.OooO00o(7, e2);
                        fileInputStreamOooO00o = null;
                    }
                    c = '\b';
                    try {
                        try {
                        } catch (IOException e3) {
                            interfaceC19032OooO0OO.OooO00o(7, e3);
                        }
                        if (fileInputStreamOooO00o != null) {
                            try {
                                try {
                                } catch (IllegalStateException e4) {
                                    interfaceC19032OooO0OO.OooO00o(8, e4);
                                    fileInputStreamOooO00o.close();
                                    c24642OooO0O0ArrOooO0oO = null;
                                    oooO0O02.f65740OooO0oO = c24642OooO0O0ArrOooO0oO;
                                    c24642OooO0O0Arr = oooO0O02.f65740OooO0oO;
                                    if (c24642OooO0O0Arr != null) {
                                    }
                                    InterfaceC19032OooO0OO interfaceC19032OooO0OO2 = oooO0O02.f65735OooO0O0;
                                    c24642OooO0O0Arr2 = oooO0O02.f65740OooO0oO;
                                    if (c24642OooO0O0Arr2 != null) {
                                    }
                                    bArr = oooO0O02.f65741OooO0oo;
                                    if (bArr != null) {
                                    }
                                    if (z2) {
                                    }
                                    z3 = z2;
                                    C22027OooO0Oo.OooO0OO(context, (z3 || !z) ? 0 : c);
                                }
                            } catch (IOException e5) {
                                interfaceC19032OooO0OO.OooO00o(7, e5);
                                fileInputStreamOooO00o.close();
                                c24642OooO0O0ArrOooO0oO = null;
                                oooO0O02.f65740OooO0oO = c24642OooO0O0ArrOooO0oO;
                                c24642OooO0O0Arr = oooO0O02.f65740OooO0oO;
                                if (c24642OooO0O0Arr != null) {
                                }
                                InterfaceC19032OooO0OO interfaceC19032OooO0OO22 = oooO0O02.f65735OooO0O0;
                                c24642OooO0O0Arr2 = oooO0O02.f65740OooO0oO;
                                if (c24642OooO0O0Arr2 != null) {
                                }
                                bArr = oooO0O02.f65741OooO0oo;
                                if (bArr != null) {
                                }
                                if (z2) {
                                }
                                z3 = z2;
                                C22027OooO0Oo.OooO0OO(context, (z3 || !z) ? 0 : c);
                            }
                            if (!Arrays.equals(bArr4, C24643OooO0OO.OooO0O0(fileInputStreamOooO00o, 4))) {
                                throw new IllegalStateException("Invalid magic");
                            }
                            c24642OooO0O0ArrOooO0oO = C24645OooO0o.OooO0oO(fileInputStreamOooO00o, C24643OooO0OO.OooO0O0(fileInputStreamOooO00o, 4), oooO0O02.f65739OooO0o0);
                            try {
                                fileInputStreamOooO00o.close();
                            } catch (IOException e6) {
                                interfaceC19032OooO0OO.OooO00o(7, e6);
                            }
                            oooO0O02.f65740OooO0oO = c24642OooO0O0ArrOooO0oO;
                        }
                        c24642OooO0O0Arr = oooO0O02.f65740OooO0oO;
                        if (c24642OooO0O0Arr != null && Build.VERSION.SDK_INT >= 31) {
                            try {
                                fileInputStreamOooO00o2 = oooO0O02.OooO00o(assets, "dexopt/baseline.profm");
                            } catch (FileNotFoundException e7) {
                                interfaceC19032OooO0OO.OooO00o(9, e7);
                            } catch (IOException e8) {
                                interfaceC19032OooO0OO.OooO00o(7, e8);
                            } catch (IllegalStateException e9) {
                                oooO0O02.f65740OooO0oO = null;
                                interfaceC19032OooO0OO.OooO00o(8, e9);
                            }
                            if (fileInputStreamOooO00o2 == null) {
                                try {
                                    if (!Arrays.equals(C24645OooO0o.f83478OooO0O0, C24643OooO0OO.OooO0O0(fileInputStreamOooO00o2, 4))) {
                                        throw new IllegalStateException("Invalid magic");
                                    }
                                    oooO0O02.f65740OooO0oO = C24645OooO0o.OooO0Oo(fileInputStreamOooO00o2, C24643OooO0OO.OooO0O0(fileInputStreamOooO00o2, 4), bArr3, c24642OooO0O0Arr);
                                    fileInputStreamOooO00o2.close();
                                    oooO0O0 = oooO0O02;
                                    if (oooO0O0 != null) {
                                        oooO0O02 = oooO0O0;
                                    }
                                } finally {
                                }
                            } else {
                                if (fileInputStreamOooO00o2 != null) {
                                    fileInputStreamOooO00o2.close();
                                }
                                oooO0O0 = null;
                                if (oooO0O0 != null) {
                                }
                            }
                        }
                        InterfaceC19032OooO0OO interfaceC19032OooO0OO222 = oooO0O02.f65735OooO0O0;
                        c24642OooO0O0Arr2 = oooO0O02.f65740OooO0oO;
                        if (c24642OooO0O0Arr2 != null && (bArr2 = oooO0O02.f65736OooO0OO) != null) {
                            if (oooO0O02.f65738OooO0o) {
                                throw new IllegalStateException("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
                            }
                            try {
                                byteArrayOutputStream = new ByteArrayOutputStream();
                                try {
                                    byteArrayOutputStream.write(bArr4);
                                    byteArrayOutputStream.write(bArr2);
                                } finally {
                                }
                            } catch (IOException e10) {
                                interfaceC19032OooO0OO222.OooO00o(7, e10);
                            } catch (IllegalStateException e11) {
                                interfaceC19032OooO0OO222.OooO00o(8, e11);
                            }
                            if (C24645OooO0o.OooO(byteArrayOutputStream, bArr2, c24642OooO0O0Arr2)) {
                                oooO0O02.f65741OooO0oo = byteArrayOutputStream.toByteArray();
                                byteArrayOutputStream.close();
                                oooO0O02.f65740OooO0oO = null;
                            } else {
                                interfaceC19032OooO0OO222.OooO00o(5, null);
                                oooO0O02.f65740OooO0oO = null;
                                byteArrayOutputStream.close();
                            }
                        }
                        bArr = oooO0O02.f65741OooO0oo;
                        if (bArr != null) {
                            z2 = false;
                            c = 1;
                        } else {
                            try {
                                if (!oooO0O02.f65738OooO0o) {
                                    throw new IllegalStateException("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
                                }
                                try {
                                    try {
                                        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
                                        try {
                                            try {
                                                FileOutputStream fileOutputStream = new FileOutputStream(oooO0O02.f65737OooO0Oo);
                                                try {
                                                    try {
                                                        FileChannel channel = fileOutputStream.getChannel();
                                                        try {
                                                            FileLock fileLockTryLock = channel.tryLock();
                                                            try {
                                                                try {
                                                                    if (fileLockTryLock != null) {
                                                                        try {
                                                                            if (fileLockTryLock.isValid()) {
                                                                                byte[] bArr5 = new byte[512];
                                                                                while (true) {
                                                                                    int i = byteArrayInputStream.read(bArr5);
                                                                                    if (i <= 0) {
                                                                                        break;
                                                                                    } else {
                                                                                        fileOutputStream.write(bArr5, 0, i);
                                                                                    }
                                                                                }
                                                                                c = 1;
                                                                                oooO0O02.OooO0O0(1, null);
                                                                                fileLockTryLock.close();
                                                                                channel.close();
                                                                                fileOutputStream.close();
                                                                                byteArrayInputStream.close();
                                                                                oooO0O02.f65741OooO0oo = null;
                                                                                oooO0O02.f65740OooO0oO = null;
                                                                                z2 = true;
                                                                            }
                                                                        } catch (Throwable th3) {
                                                                            th = th3;
                                                                            Throwable th4 = th;
                                                                            if (fileLockTryLock == null) {
                                                                                throw th4;
                                                                            }
                                                                            try {
                                                                                fileLockTryLock.close();
                                                                                throw th4;
                                                                            } catch (Throwable th5) {
                                                                                th4.addSuppressed(th5);
                                                                                throw th4;
                                                                            }
                                                                        }
                                                                    }
                                                                    throw new IOException("Unable to acquire a lock on the underlying file channel.");
                                                                } catch (Throwable th6) {
                                                                    th = th6;
                                                                    Throwable th7 = th;
                                                                    if (channel == null) {
                                                                        throw th7;
                                                                    }
                                                                    try {
                                                                        channel.close();
                                                                        throw th7;
                                                                    } catch (Throwable th8) {
                                                                        th7.addSuppressed(th8);
                                                                        throw th7;
                                                                    }
                                                                }
                                                            } catch (Throwable th9) {
                                                                th = th9;
                                                            }
                                                        } catch (Throwable th10) {
                                                            th = th10;
                                                        }
                                                    } catch (Throwable th11) {
                                                        th = th11;
                                                        th2 = th;
                                                        try {
                                                            fileOutputStream.close();
                                                            throw th2;
                                                        } catch (Throwable th12) {
                                                            th2.addSuppressed(th12);
                                                            throw th2;
                                                        }
                                                    }
                                                } catch (Throwable th13) {
                                                    th = th13;
                                                    th2 = th;
                                                    fileOutputStream.close();
                                                    throw th2;
                                                }
                                            } catch (Throwable th14) {
                                                th = th14;
                                                th = th;
                                                try {
                                                    byteArrayInputStream.close();
                                                    throw th;
                                                } catch (Throwable th15) {
                                                    th.addSuppressed(th15);
                                                    throw th;
                                                }
                                            }
                                        } catch (Throwable th16) {
                                            th = th16;
                                            th = th;
                                            byteArrayInputStream.close();
                                            throw th;
                                        }
                                    } catch (FileNotFoundException e12) {
                                        e = e12;
                                        oooO0O02.OooO0O0(6, e);
                                        z2 = false;
                                        if (z2) {
                                        }
                                        z3 = z2;
                                        C22027OooO0Oo.OooO0OO(context, (z3 || !z) ? 0 : c);
                                    } catch (IOException e13) {
                                        e = e13;
                                        oooO0O02.OooO0O0(7, e);
                                        z2 = false;
                                        if (z2) {
                                        }
                                        z3 = z2;
                                        C22027OooO0Oo.OooO0OO(context, (z3 || !z) ? 0 : c);
                                    }
                                } catch (FileNotFoundException e14) {
                                    e = e14;
                                    c = 1;
                                    oooO0O02.OooO0O0(6, e);
                                    z2 = false;
                                    if (z2) {
                                    }
                                    z3 = z2;
                                    C22027OooO0Oo.OooO0OO(context, (z3 || !z) ? 0 : c);
                                } catch (IOException e15) {
                                    e = e15;
                                    c = 1;
                                    oooO0O02.OooO0O0(7, e);
                                    z2 = false;
                                    if (z2) {
                                    }
                                    z3 = z2;
                                    C22027OooO0Oo.OooO0OO(context, (z3 || !z) ? 0 : c);
                                }
                            } finally {
                                oooO0O02.f65741OooO0oo = null;
                                oooO0O02.f65740OooO0oO = null;
                            }
                        }
                        if (z2) {
                            OooO00o(packageInfo, filesDir);
                        }
                        z3 = z2;
                    } finally {
                    }
                } else {
                    try {
                        if (!file2.createNewFile()) {
                            oooO0O02.OooO0O0(4, null);
                        }
                        oooO0O02.f65738OooO0o = true;
                        byte[] bArr42 = C24645OooO0o.f83477OooO00o;
                        fileInputStreamOooO00o = oooO0O02.OooO00o(assets, "dexopt/baseline.prof");
                        c = '\b';
                        if (fileInputStreamOooO00o != null) {
                        }
                        c24642OooO0O0Arr = oooO0O02.f65740OooO0oO;
                        if (c24642OooO0O0Arr != null) {
                            fileInputStreamOooO00o2 = oooO0O02.OooO00o(assets, "dexopt/baseline.profm");
                            if (fileInputStreamOooO00o2 == null) {
                            }
                        }
                        InterfaceC19032OooO0OO interfaceC19032OooO0OO2222 = oooO0O02.f65735OooO0O0;
                        c24642OooO0O0Arr2 = oooO0O02.f65740OooO0oO;
                        if (c24642OooO0O0Arr2 != null) {
                            if (oooO0O02.f65738OooO0o) {
                            }
                        }
                        bArr = oooO0O02.f65741OooO0oo;
                        if (bArr != null) {
                        }
                        if (z2) {
                        }
                        z3 = z2;
                    } catch (IOException unused2) {
                        c = 1;
                        oooO0O02.OooO0O0(4, null);
                    }
                }
                C22027OooO0Oo.OooO0OO(context, (z3 || !z) ? 0 : c);
            }
            oooO0O02.OooO0O0(3, Integer.valueOf(Build.VERSION.SDK_INT));
            c = 1;
            z3 = false;
            C22027OooO0Oo.OooO0OO(context, (z3 || !z) ? 0 : c);
        } catch (PackageManager.NameNotFoundException e16) {
            interfaceC19032OooO0OO.OooO00o(7, e16);
            C22027OooO0Oo.OooO0OO(context, false);
        }
    }
}
