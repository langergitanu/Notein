package com.facebook.soloader;

import OooO0o.C20424OooO0Oo;
import android.text.TextUtils;
import android.util.Log;
import com.huawei.hms.network.embedded.C18241k5;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;

/* JADX INFO: renamed from: com.facebook.soloader.OooOOoo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C22315OooOOoo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Runtime f67507OooO00o = Runtime.getRuntime();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final Method f67508OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final String f67509OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final String f67510OooO0Oo;

    public C22315OooOOoo() {
        Method nativeLoadRuntimeMethod = SysUtil.getNativeLoadRuntimeMethod();
        this.f67508OooO0O0 = nativeLoadRuntimeMethod;
        String strJoin = null;
        String classLoaderLdLoadLibrary = nativeLoadRuntimeMethod != null ? SysUtil.getClassLoaderLdLoadLibrary() : null;
        this.f67509OooO0OO = classLoaderLdLoadLibrary;
        if (classLoaderLdLoadLibrary != null) {
            String[] strArrSplit = classLoaderLdLoadLibrary.split(C18241k5.f55433h);
            ArrayList arrayList = new ArrayList(strArrSplit.length);
            for (String str : strArrSplit) {
                if (!str.contains("!")) {
                    arrayList.add(str);
                }
            }
            strJoin = TextUtils.join(C18241k5.f55433h, arrayList);
        }
        this.f67510OooO0Oo = strJoin;
    }

    public static String OooO00o(String str) {
        try {
            File file = new File(str);
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            FileInputStream fileInputStream = new FileInputStream(file);
            try {
                byte[] bArr = new byte[4096];
                while (true) {
                    int i = fileInputStream.read(bArr);
                    if (i <= 0) {
                        String str2 = String.format("%32x", new BigInteger(1, messageDigest.digest()));
                        fileInputStream.close();
                        return str2;
                    }
                    messageDigest.update(bArr, 0, i);
                }
            } catch (Throwable th) {
                try {
                    fileInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (IOException | SecurityException | NoSuchAlgorithmException e) {
            return e.toString();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x002e, code lost:
    
        if (r3 == null) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0030, code lost:
    
        r1 = OooO0o.C20424OooO0Oo.OooO0o0("Error when loading library: ", r3, ", library hash is ");
        r1.append(OooO00o(r8));
        r1.append(", LD_LIBRARY_PATH is ");
        r1.append(r7);
        android.util.Log.e("SoFileLoaderImpl", r1.toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0050, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:?, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void OooO0O0(int i, String str) {
        if (this.f67508OooO0O0 == null) {
            System.load(str);
            return;
        }
        String str2 = (i & 4) == 4 ? this.f67509OooO0OO : this.f67510OooO0Oo;
        String str3 = null;
        try {
            try {
                synchronized (this.f67507OooO00o) {
                    try {
                        String str4 = (String) this.f67508OooO0O0.invoke(this.f67507OooO00o, str, SoLoader.class.getClassLoader(), str2);
                        try {
                            if (str4 != null) {
                                throw new C22318OooOo0o(str, "nativeLoad() returned error for " + str + ": " + str4);
                            }
                        } catch (Throwable th) {
                            th = th;
                            str3 = str4;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                    }
                }
                throw th;
            } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException unused) {
                throw new RuntimeException("nativeLoad() error during invocation for " + str + ": " + str3);
            }
        } catch (Throwable th3) {
            if (str3 != null) {
                StringBuilder sbOooO0o0 = C20424OooO0Oo.OooO0o0("Error when loading library: ", str3, ", library hash is ");
                sbOooO0o0.append(OooO00o(str));
                sbOooO0o0.append(", LD_LIBRARY_PATH is ");
                sbOooO0o0.append(str2);
                Log.e("SoFileLoaderImpl", sbOooO0o0.toString());
            }
            throw th3;
        }
    }
}
