package com.facebook.soloader;

import OooOooo.C20806OooooOo;
import Oooo0oO.o0Oo0oo;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Bundle;
import android.os.StrictMode;
import android.os.Trace;
import android.text.TextUtils;
import android.util.Log;
import com.aspose.words.WarningType;
import com.facebook.soloader.C22307OooO0Oo;
import com.facebook.soloader.SysUtil;
import com.huawei.hms.network.embedded.C18115b5;
import com.huawei.hms.network.embedded.C18241k5;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import o00ooOo.C25781OooO0OO;
import o00ooOo.C25782OooO0Oo;
import o00ooOo0.C25787OooO00o;

/* JADX INFO: loaded from: classes5.dex */
public class SoLoader {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static C22315OooOOoo f67524OooO0O0;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public static int f67533OooOO0o;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final ReentrantReadWriteLock f67525OooO0OO = new ReentrantReadWriteLock();

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static Context f67526OooO0Oo = null;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static volatile AbstractC22320OooOoO0[] f67528OooO0o0 = null;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public static final AtomicInteger f67527OooO0o = new AtomicInteger(0);

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public static C25782OooO0Oo f67529OooO0oO = null;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public static final HashSet<String> f67530OooO0oo = new HashSet<>();

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public static final HashMap f67522OooO = new HashMap();

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public static final Set<String> f67531OooOO0 = Collections.newSetFromMap(new ConcurrentHashMap());

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public static boolean f67532OooOO0O = true;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public static int f67534OooOOO0 = 0;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final boolean f67523OooO00o = true;

    public static final class OooO00o extends UnsatisfiedLinkError {
    }

    public static synchronized void OooO(Context context) {
        if (context != null) {
            try {
                Context applicationContext = context.getApplicationContext();
                if (applicationContext == null) {
                    Log.w("SoLoader", "context.getApplicationContext returned null, holding reference to original context.ApplicationSoSource fallbacks to: " + context.getApplicationInfo().nativeLibraryDir);
                } else {
                    context = applicationContext;
                }
                f67526OooO0Oo = context;
                f67529OooO0oO = new C25782OooO0Oo(context);
            } catch (Throwable th) {
                throw th;
            }
        }
        if (f67524OooO0O0 != null) {
            return;
        }
        f67524OooO0O0 = new C22315OooOOoo();
    }

    public static void OooO00o(int i, ArrayList arrayList) {
        com.facebook.soloader.OooO00o oooO00o = new com.facebook.soloader.OooO00o(f67526OooO0Oo, i);
        OooOOO.OooO00o("SoLoader", "Adding application source: " + oooO00o.toString());
        arrayList.add(0, oooO00o);
    }

    public static void OooO0O0(Context context, ArrayList arrayList) throws IOException {
        if ((f67533OooOO0o & 8) != 0) {
            File fileOooO0oO = AbstractC22322OooOoo0.OooO0oO(context, "lib-main");
            try {
                if (fileOooO0oO.exists()) {
                    SysUtil.OooO0O0(fileOooO0oO);
                    return;
                }
                return;
            } catch (Throwable th) {
                Log.w("SoLoader", "Failed to delete " + fileOooO0oO.getCanonicalPath(), th);
                return;
            }
        }
        File file = new File(context.getApplicationInfo().sourceDir);
        ArrayList arrayList2 = new ArrayList();
        C22307OooO0Oo c22307OooO0Oo = new C22307OooO0Oo(context, file, "lib-main");
        arrayList2.add(c22307OooO0Oo);
        OooOOO.OooO00o("SoLoader", "adding backup source from : " + c22307OooO0Oo.toString());
        if (context.getApplicationInfo().splitSourceDirs != null) {
            OooOOO.OooO00o("SoLoader", "adding backup sources from split apks");
            String[] strArr = context.getApplicationInfo().splitSourceDirs;
            int length = strArr.length;
            int i = 0;
            int i2 = 0;
            while (i < length) {
                File file2 = new File(strArr[i]);
                StringBuilder sb = new StringBuilder("lib-");
                int i3 = i2 + 1;
                sb.append(i2);
                C22307OooO0Oo c22307OooO0Oo2 = new C22307OooO0Oo(context, file2, sb.toString());
                OooOOO.OooO00o("SoLoader", "adding backup source: " + c22307OooO0Oo2.toString());
                C22307OooO0Oo.OooO00o oooO00o = new C22307OooO0Oo.OooO00o(c22307OooO0Oo2, c22307OooO0Oo2, false);
                try {
                    boolean z = oooO00o.OooOOo0().length != 0;
                    oooO00o.close();
                    if (z) {
                        arrayList2.add(c22307OooO0Oo2);
                    }
                    i++;
                    i2 = i3;
                } catch (Throwable th2) {
                    try {
                        oooO00o.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                    throw th2;
                }
            }
        }
        arrayList.addAll(0, arrayList2);
    }

    public static void OooO0OO(ArrayList<AbstractC22320OooOoO0> arrayList) {
        String strOooO0Oo = SysUtil.MarshmallowSysdeps.is64Bit() ? "/system/lib64:/vendor/lib64" : "/system/lib:/vendor/lib";
        String str = System.getenv("LD_LIBRARY_PATH");
        if (str != null && !str.equals("")) {
            strOooO0Oo = o0Oo0oo.OooO0Oo(str, C18241k5.f55433h, strOooO0Oo);
        }
        for (String str2 : new HashSet(Arrays.asList(strOooO0Oo.split(C18241k5.f55433h)))) {
            OooOOO.OooO00o("SoLoader", "adding system library source: " + str2);
            arrayList.add(new OooO0o(new File(str2), 2));
        }
    }

    public static void OooO0Oo(String str, int i, StrictMode.ThreadPolicy threadPolicy) throws UnsatisfiedLinkError {
        boolean z;
        ReentrantReadWriteLock reentrantReadWriteLock = f67525OooO0OO;
        reentrantReadWriteLock.readLock().lock();
        try {
            if (f67528OooO0o0 == null) {
                Log.e("SoLoader", "Could not load: " + str + " because SoLoader is not initialized");
                throw new UnsatisfiedLinkError("SoLoader not initialized, couldn't find DSO to load: " + str);
            }
            reentrantReadWriteLock.readLock().unlock();
            if (threadPolicy == null) {
                threadPolicy = StrictMode.allowThreadDiskReads();
                z = true;
            } else {
                z = false;
            }
            if (f67523OooO00o) {
                Api18TraceUtils.OooO00o("SoLoader.loadLibrary[", str, "]");
            }
            try {
                reentrantReadWriteLock.readLock().lock();
                try {
                    try {
                        for (AbstractC22320OooOoO0 abstractC22320OooOoO0 : f67528OooO0o0) {
                            if (abstractC22320OooOoO0.OooO0Oo(str, i, threadPolicy) != 0) {
                                if (z) {
                                    return;
                                } else {
                                    return;
                                }
                            }
                        }
                        throw C22317OooOo0O.OooO00o(str, f67526OooO0Oo, f67528OooO0o0);
                    } catch (IOException e) {
                        C22318OooOo0o c22318OooOo0o = new C22318OooOo0o(str, e.toString());
                        c22318OooOo0o.initCause(e);
                        throw c22318OooOo0o;
                    }
                } finally {
                }
            } finally {
                if (f67523OooO00o) {
                    Trace.endSection();
                }
                if (z) {
                    StrictMode.setThreadPolicy(threadPolicy);
                }
            }
        } finally {
        }
    }

    public static synchronized C25781OooO0OO OooO0o() {
        C25782OooO0Oo c25782OooO0Oo;
        c25782OooO0Oo = f67529OooO0oO;
        return c25782OooO0Oo == null ? null : c25782OooO0Oo.OooO00o();
    }

    public static int OooO0o0(Context context) {
        int i = f67534OooOOO0;
        if (i != 0) {
            return i;
        }
        if (context == null) {
            OooOOO.OooO00o("SoLoader", "context is null, fallback to THIRD_PARTY_APP appType");
            return 1;
        }
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        int i2 = applicationInfo.flags;
        int i3 = (i2 & 1) != 0 ? (i2 & 128) != 0 ? 3 : 2 : 1;
        OooOOO.OooO00o("SoLoader", "ApplicationInfo.flags is: " + applicationInfo.flags + " appType is: " + i3);
        return i3;
    }

    public static void OooO0oO() {
        if (f67528OooO0o0 != null) {
            return;
        }
        ReentrantReadWriteLock reentrantReadWriteLock = f67525OooO0OO;
        reentrantReadWriteLock.writeLock().lock();
        try {
            if (f67528OooO0o0 == null) {
                f67528OooO0o0 = new AbstractC22320OooOoO0[0];
            }
            reentrantReadWriteLock.writeLock().unlock();
        } catch (Throwable th) {
            f67525OooO0OO.writeLock().unlock();
            throw th;
        }
    }

    public static boolean OooO0oo(Context context) {
        String packageName;
        Bundle bundle = null;
        try {
            packageName = context.getPackageName();
        } catch (Exception e) {
            e = e;
            packageName = null;
        }
        try {
            bundle = context.getPackageManager().getApplicationInfo(packageName, 128).metaData;
        } catch (Exception e2) {
            e = e2;
            Log.w("SoLoader", "Unexpected issue with package manager (" + packageName + ")", e);
        }
        return bundle == null || bundle.getBoolean("com.facebook.soloader.enabled", true);
    }

    public static void OooOO0(Context context, int i) throws IOException {
        int i2;
        int i3;
        ReentrantReadWriteLock.WriteLock writeLock;
        if (f67528OooO0o0 != null) {
            return;
        }
        ReentrantReadWriteLock reentrantReadWriteLock = f67525OooO0OO;
        reentrantReadWriteLock.writeLock().lock();
        try {
            if (f67528OooO0o0 != null) {
                writeLock = reentrantReadWriteLock.writeLock();
            } else {
                f67533OooOO0o = i;
                ArrayList arrayList = new ArrayList();
                if ((i & 512) != 0) {
                    C22319OooOoO c22319OooOoO = new C22319OooOoO();
                    OooOOO.OooO00o("SoLoader", "adding systemLoadWrapper source: " + c22319OooOoO);
                    arrayList.add(0, c22319OooOoO);
                } else {
                    OooO0OO(arrayList);
                    if (context != null) {
                        if ((i & 1) != 0) {
                            int i4 = f67534OooOOO0;
                            if (i4 != 1) {
                                if (i4 != 2 && i4 != 3) {
                                    throw new RuntimeException("Unsupported app type, we should not reach here");
                                }
                                i3 = 1;
                            } else {
                                i3 = 0;
                            }
                            OooO00o(i3, arrayList);
                            OooOOO.OooO00o("SoLoader", "Adding exo package source: lib-main");
                            arrayList.add(0, new OooOO0O(context, "lib-main"));
                        } else {
                            if (f67534OooOOO0 == 2 || (context.getApplicationInfo().flags & WarningType.HINT) == 0) {
                                C22308OooO0o0 c22308OooO0o0 = new C22308OooO0o0(context);
                                OooOOO.OooO00o("SoLoader", "validating/adding directApk source: " + c22308OooO0o0.toString());
                                if (!c22308OooO0o0.f67488OooO0OO.isEmpty()) {
                                    arrayList.add(0, c22308OooO0o0);
                                }
                            }
                            int i5 = f67534OooOOO0;
                            if (i5 != 1) {
                                if (i5 != 2 && i5 != 3) {
                                    throw new RuntimeException("Unsupported app type, we should not reach here");
                                }
                                i2 = 1;
                            } else {
                                i2 = 0;
                            }
                            OooO00o(i2, arrayList);
                            OooO0O0(context, arrayList);
                        }
                    }
                }
                AbstractC22320OooOoO0[] abstractC22320OooOoO0Arr = (AbstractC22320OooOoO0[]) arrayList.toArray(new AbstractC22320OooOoO0[arrayList.size()]);
                reentrantReadWriteLock.writeLock().lock();
                try {
                    int i6 = f67533OooOO0o;
                    int i7 = (i6 & 2) != 0 ? 1 : 0;
                    if ((i6 & 256) != 0) {
                        i7 |= 4;
                    }
                    reentrantReadWriteLock.writeLock().unlock();
                    int length = abstractC22320OooOoO0Arr.length;
                    while (true) {
                        int i8 = length - 1;
                        if (length <= 0) {
                            break;
                        }
                        OooOOO.OooO00o("SoLoader", "Preparing SO source: " + abstractC22320OooOoO0Arr[i8]);
                        boolean z = f67523OooO00o;
                        if (z) {
                            Api18TraceUtils.OooO00o("SoLoader", C18115b5.CONNECTOR, abstractC22320OooOoO0Arr[i8].getClass().getSimpleName());
                        }
                        abstractC22320OooOoO0Arr[i8].OooO0o0(i7);
                        if (z) {
                            Trace.endSection();
                        }
                        length = i8;
                    }
                    f67528OooO0o0 = abstractC22320OooOoO0Arr;
                    f67527OooO0o.getAndIncrement();
                    OooOOO.OooO00o("SoLoader", "init finish: " + f67528OooO0o0.length + " SO sources prepared");
                    writeLock = f67525OooO0OO.writeLock();
                } finally {
                    reentrantReadWriteLock.writeLock().unlock();
                }
            }
            writeLock.unlock();
        } catch (Throwable th) {
            reentrantReadWriteLock = f67525OooO0OO;
            throw th;
        }
    }

    public static boolean OooOO0O() {
        if (f67528OooO0o0 != null) {
            return true;
        }
        ReentrantReadWriteLock reentrantReadWriteLock = f67525OooO0OO;
        reentrantReadWriteLock.readLock().lock();
        try {
            boolean z = f67528OooO0o0 != null;
            reentrantReadWriteLock.readLock().unlock();
            return z;
        } catch (Throwable th) {
            f67525OooO0OO.readLock().unlock();
            throw th;
        }
    }

    public static boolean OooOO0o(String str, String str2, int i, StrictMode.ThreadPolicy threadPolicy) {
        Object obj;
        if (!TextUtils.isEmpty(str2) && f67531OooOO0.contains(str2)) {
            return false;
        }
        synchronized (SoLoader.class) {
            try {
                HashSet<String> hashSet = f67530OooO0oo;
                if (hashSet.contains(str)) {
                    return false;
                }
                HashMap map = f67522OooO;
                if (map.containsKey(str)) {
                    obj = map.get(str);
                } else {
                    Object obj2 = new Object();
                    map.put(str, obj2);
                    obj = obj2;
                }
                ReentrantReadWriteLock reentrantReadWriteLock = f67525OooO0OO;
                reentrantReadWriteLock.readLock().lock();
                try {
                    synchronized (obj) {
                        synchronized (SoLoader.class) {
                            if (hashSet.contains(str)) {
                                reentrantReadWriteLock.readLock().unlock();
                                return false;
                            }
                            try {
                                OooOOO.OooO00o("SoLoader", "About to load: " + str);
                                OooO0Oo(str, i, threadPolicy);
                                OooOOO.OooO00o("SoLoader", "Loaded: " + str);
                                synchronized (SoLoader.class) {
                                    hashSet.add(str);
                                }
                                if ((i & 16) == 0 && !TextUtils.isEmpty(str2)) {
                                    f67531OooOO0.contains(str2);
                                }
                                reentrantReadWriteLock.readLock().unlock();
                                return true;
                            } catch (UnsatisfiedLinkError e) {
                                String message = e.getMessage();
                                if (message == null || !message.contains("unexpected e_machine:")) {
                                    throw e;
                                }
                                OooO00o oooO00o = new OooO00o("APK was built for a different platform. Supported ABIs: " + Arrays.toString(SysUtil.MarshmallowSysdeps.getSupportedAbis()) + " error: " + message.substring(message.lastIndexOf("unexpected e_machine:")));
                                oooO00o.initCause(e);
                                throw oooO00o;
                            }
                        }
                    }
                } catch (Throwable th) {
                    f67525OooO0OO.readLock().unlock();
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static void init(Context context, int i) throws IOException {
        if (OooOO0O()) {
            Log.w("SoLoader", "SoLoader already initialized");
            return;
        }
        Log.w("SoLoader", "Initializing SoLoader: " + i);
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskWrites = StrictMode.allowThreadDiskWrites();
        try {
            boolean zOooO0oo = OooO0oo(context);
            f67532OooOO0O = zOooO0oo;
            if (zOooO0oo) {
                int iOooO0o0 = OooO0o0(context);
                f67534OooOOO0 = iOooO0o0;
                if ((i & 128) == 0) {
                    if (iOooO0o0 == 2 || (context != null && (context.getApplicationInfo().flags & WarningType.HINT) == 0)) {
                        i |= 8;
                    }
                }
                OooO(context);
                OooOO0(context, i);
                OooOOO.OooO0O0("SoLoader", "Init SoLoader delegate");
                C25787OooO00o.OooO00o(new C20806OooooOo());
            } else {
                OooO0oO();
                OooOOO.OooO0O0("SoLoader", "Init System Loader delegate");
                C25787OooO00o.OooO00o(new o00000O.OooO0O0());
            }
            Log.w("SoLoader", "SoLoader initialized: " + i);
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskWrites);
        } catch (Throwable th) {
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskWrites);
            throw th;
        }
    }
}
