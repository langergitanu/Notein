package com.facebook.soloader;

import android.content.Context;
import android.os.StrictMode;
import android.text.TextUtils;
import android.util.Log;
import com.aspose.slides.C22226Oooo0oo;
import com.facebook.soloader.SysUtil;
import com.orion.notein.domain.models.cloudsync.CloudMetaExtra;
import java.io.File;
import java.io.IOException;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* JADX INFO: renamed from: com.facebook.soloader.OooO0o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C22308OooO0o0 extends AbstractC22320OooOoO0 implements InterfaceC22313OooOOo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final HashMap f67486OooO00o = new HashMap();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final HashMap f67487OooO0O0 = new HashMap();

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final HashSet f67488OooO0OO;

    public C22308OooO0o0(Context context) {
        HashSet hashSet = new HashSet();
        String strOooO = OooO(context.getApplicationInfo().sourceDir);
        if (strOooO != null) {
            hashSet.add(strOooO);
        }
        if (context.getApplicationInfo().splitSourceDirs != null) {
            for (String str : context.getApplicationInfo().splitSourceDirs) {
                String strOooO2 = OooO(str);
                if (strOooO2 != null) {
                    hashSet.add(strOooO2);
                }
            }
        }
        this.f67488OooO0OO = hashSet;
    }

    public static String OooO(String str) {
        String[] supportedAbis = SysUtil.MarshmallowSysdeps.getSupportedAbis();
        if (str == null || str.isEmpty()) {
            Log.w("SoLoader", "Cannot compute fallback path, apk path is ".concat(str == null ? CloudMetaExtra.DEFINE_NON_PARENT_ID : "empty"));
            return null;
        }
        if (supportedAbis == null || supportedAbis.length == 0) {
            Log.w("SoLoader", "Cannot compute fallback path, supportedAbis is ".concat(supportedAbis == null ? CloudMetaExtra.DEFINE_NON_PARENT_ID : "empty"));
            return null;
        }
        StringBuilder sbOooO0OO = C22226Oooo0oo.OooO0OO(str, "!/lib/");
        sbOooO0OO.append(supportedAbis[0]);
        return sbOooO0OO.toString();
    }

    @Override // com.facebook.soloader.InterfaceC22313OooOOo
    public final AbstractC22320OooOoO0 OooO0O0(Context context) {
        C22308OooO0o0 c22308OooO0o0 = new C22308OooO0o0(context);
        try {
            c22308OooO0o0.OooOO0();
            return c22308OooO0o0;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // com.facebook.soloader.AbstractC22320OooOoO0
    public final String OooO0OO() {
        return "DirectApkSoSource";
    }

    @Override // com.facebook.soloader.AbstractC22320OooOoO0
    public final int OooO0Oo(String str, int i, StrictMode.ThreadPolicy threadPolicy) throws IOException {
        if (SoLoader.f67524OooO0O0 == null) {
            throw new IllegalStateException("SoLoader.init() not yet called");
        }
        int i2 = i;
        for (String str2 : this.f67488OooO0OO) {
            Set set = (Set) this.f67486OooO00o.get(str2);
            if (TextUtils.isEmpty(str2) || set == null || !set.contains(str)) {
                OooOOO.OooO0O0("SoLoader", str + " not found on " + str2);
            } else {
                Set<String> setOooO0oo = OooO0oo(str2, str);
                if (setOooO0oo == null) {
                    ZipFile zipFile = new ZipFile(str2.substring(0, str2.indexOf(33)));
                    try {
                        Enumeration<? extends ZipEntry> enumerationEntries = zipFile.entries();
                        while (enumerationEntries.hasMoreElements()) {
                            ZipEntry zipEntryNextElement = enumerationEntries.nextElement();
                            if (zipEntryNextElement != null) {
                                if (zipEntryNextElement.getName().endsWith("/" + str)) {
                                    OooOO0 oooOO02 = new OooOO0(zipFile, zipEntryNextElement);
                                    try {
                                        for (String str3 : C22312OooOOOo.OooO00o(str, oooOO02)) {
                                            if (!str3.startsWith("/")) {
                                                OooO0o(str2, str, str3);
                                            }
                                        }
                                        oooOO02.close();
                                    } catch (Throwable th) {
                                        try {
                                            oooOO02.close();
                                            throw th;
                                        } catch (Throwable th2) {
                                            th.addSuppressed(th2);
                                            throw th;
                                        }
                                    }
                                } else {
                                    continue;
                                }
                            }
                        }
                        zipFile.close();
                        setOooO0oo = OooO0oo(str2, str);
                    } finally {
                    }
                }
                if (setOooO0oo != null) {
                    Iterator<String> it = setOooO0oo.iterator();
                    while (it.hasNext()) {
                        SoLoader.OooOO0o(it.next(), null, i2 | 1, threadPolicy);
                    }
                }
                try {
                    i2 |= 4;
                    SoLoader.f67524OooO0O0.OooO0O0(i2, str2 + File.separator + str);
                    OooOOO.OooO00o("SoLoader", str + " found on " + str2);
                    return 1;
                } catch (UnsatisfiedLinkError e) {
                    Log.w("SoLoader", str + " not found on " + str2 + " flag: " + i2, e);
                }
            }
        }
        return 0;
    }

    public final void OooO0o(String str, String str2, String str3) {
        synchronized (this.f67487OooO0O0) {
            try {
                String str4 = str + str2;
                if (!this.f67487OooO0O0.containsKey(str4)) {
                    this.f67487OooO0O0.put(str4, new HashSet());
                }
                ((Set) this.f67487OooO0O0.get(str4)).add(str3);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.facebook.soloader.AbstractC22320OooOoO0
    public final void OooO0o0(int i) throws IOException {
        OooOO0();
    }

    public final void OooO0oO(String str, String str2) {
        synchronized (this.f67486OooO00o) {
            try {
                if (!this.f67486OooO00o.containsKey(str)) {
                    this.f67486OooO00o.put(str, new HashSet());
                }
                ((Set) this.f67486OooO00o.get(str)).add(str2);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final Set<String> OooO0oo(String str, String str2) {
        Set<String> set;
        synchronized (this.f67487OooO0O0) {
            set = (Set) this.f67487OooO0O0.get(str + str2);
        }
        return set;
    }

    public final void OooOO0() throws IOException {
        int iIndexOf;
        int i;
        String strSubstring = null;
        for (String str : this.f67488OooO0OO) {
            if (!TextUtils.isEmpty(str) && (iIndexOf = str.indexOf(33)) >= 0 && (i = iIndexOf + 2) < str.length()) {
                strSubstring = str.substring(i);
            }
            if (!TextUtils.isEmpty(strSubstring)) {
                ZipFile zipFile = new ZipFile(str.substring(0, str.indexOf(33)));
                try {
                    Enumeration<? extends ZipEntry> enumerationEntries = zipFile.entries();
                    while (enumerationEntries.hasMoreElements()) {
                        ZipEntry zipEntryNextElement = enumerationEntries.nextElement();
                        if (zipEntryNextElement != null && zipEntryNextElement.getMethod() == 0 && zipEntryNextElement.getName().startsWith(strSubstring) && zipEntryNextElement.getName().endsWith(".so")) {
                            OooO0oO(str, zipEntryNextElement.getName().substring(strSubstring.length() + 1));
                        }
                    }
                    zipFile.close();
                } catch (Throwable th) {
                    try {
                        zipFile.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
        }
    }

    @Override // com.facebook.soloader.AbstractC22320OooOoO0
    public final String toString() {
        return "DirectApkSoSource[root = " + this.f67488OooO0OO.toString() + ']';
    }
}
