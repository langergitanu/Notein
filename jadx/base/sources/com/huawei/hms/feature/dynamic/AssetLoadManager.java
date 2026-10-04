package com.huawei.hms.feature.dynamic;

import OooOo.C20485OooOoO;
import android.content.Context;
import android.content.res.AssetManager;
import android.os.Bundle;
import android.text.TextUtils;
import com.android.billingclient.api.C22172OooOoO;
import com.huawei.hms.common.util.ExtractNativeUtils;
import com.huawei.hms.common.util.FileUtil;
import com.huawei.hms.common.util.Logger;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileOutputStream;

/* JADX INFO: loaded from: classes6.dex */
public class AssetLoadManager {

    /* JADX INFO: renamed from: a */
    public static final String f53491a = "AssetLoadManager";

    /* JADX INFO: renamed from: b */
    public static final String f53492b = "dynamic_modules";

    /* JADX INFO: renamed from: c */
    public static final String f53493c = ".apk";

    /* JADX INFO: renamed from: d */
    public static final String f53494d = "com.huawei.hms.feature.dynamic.descriptors.";

    /* JADX INFO: renamed from: e */
    public static final String f53495e = ".AssetModuleDescriptor";

    /* JADX INFO: renamed from: a */
    public static int m76906a(Context context, String str) {
        if (context == null || TextUtils.isEmpty(str)) {
            Logger.m75877e(f53491a, "Invalid context or moduleName.");
            return 0;
        }
        try {
            return context.getClassLoader().loadClass(f53494d + str + f53495e).getDeclaredField("MODULE_VERSION").getInt(null);
        } catch (ClassNotFoundException unused) {
            Logger.m75884w(f53491a, "Cannot get the class of module descriptor for " + str);
            return 0;
        } catch (Exception e) {
            Logger.m75885w(f53491a, "Get local asset module info failed.", e);
            return 0;
        }
    }

    /* JADX INFO: renamed from: b */
    public static Bundle m76909b(Context context, String str) throws Throwable {
        try {
            String[] list = context.getAssets().list("dynamic_modules" + File.separator + str);
            if (list != null && list.length != 0) {
                String str2 = list[0];
                int iM76906a = m76906a(context, str);
                String strM76908a = m76908a(context, str, iM76906a, str2);
                if (!TextUtils.isEmpty(strM76908a) && new File(strM76908a).exists()) {
                    if (ExtractNativeUtils.m75861a(context, strM76908a) && ExtractNativeUtils.m75858a(new File(strM76908a), FileUtil.m75869c(strM76908a)) != 0) {
                        Logger.m75884w(f53491a, "Extract native to current dir failed.");
                        return new Bundle();
                    }
                    Bundle bundle = new Bundle();
                    bundle.putString(InterfaceC17909b.f53584j, str);
                    bundle.putString(InterfaceC17909b.f53588n, strM76908a);
                    bundle.putInt(InterfaceC17909b.f53587m, iM76906a);
                    Logger.m75880i(f53491a, "Get dynamic module info from asset success: ModuleName:" + str + ", ModuleVersion:" + iM76906a + ", ModulePath:" + strM76908a);
                    return bundle;
                }
                Logger.m75884w(f53491a, "Decompress module from assets failed.");
                return new Bundle();
            }
            Logger.m75884w(f53491a, "No module apk in asset path.");
            return new Bundle();
        } catch (Exception e) {
            Logger.m75881i(f53491a, "getModuleFromAsset failed.", e);
            return new Bundle();
        }
    }

    public static Bundle getAssetModuleInfo(Context context, String str) throws Throwable {
        if (context == null || TextUtils.isEmpty(str)) {
            Logger.m75884w(f53491a, "The context or moduleName is null.");
            return new Bundle();
        }
        try {
            StringBuilder sb = new StringBuilder();
            sb.append(ModuleCopy.getProtectedPath(context));
            String str2 = File.separator;
            sb.append(str2);
            sb.append("dynamic_modules");
            sb.append(str2);
            sb.append(str);
            File file = new File(sb.toString());
            if (file.exists()) {
                Bundle bundleM76907a = m76907a(context, file, str);
                if (bundleM76907a.getInt(InterfaceC17909b.f53587m) > 0) {
                    Logger.m75880i(f53491a, "Successfully get module info from decompressed asset path.");
                    return bundleM76907a;
                }
            }
            Bundle bundleM76909b = m76909b(context, str);
            if (bundleM76909b.getInt(InterfaceC17909b.f53587m) > 0) {
                Logger.m75880i(f53491a, "Successfully get module info from asset.");
                return bundleM76909b;
            }
        } catch (Exception e) {
            Logger.m75881i(f53491a, "getDataModuleInfo failed.", e);
        }
        return new Bundle();
    }

    /* JADX INFO: renamed from: a */
    public static Bundle m76907a(Context context, File file, String str) {
        String[] list = file.list();
        if (list == null || list.length == 0) {
            Logger.m75884w(f53491a, "No version in module path.");
            return new Bundle();
        }
        int i = 0;
        for (String str2 : list) {
            if (Integer.parseInt(str2) > i) {
                i = Integer.parseInt(str2);
            }
        }
        if (i == 0) {
            Logger.m75884w(f53491a, "Cannot get module version path.");
            return new Bundle();
        }
        ModuleCopy.clearLowVersionModule(i, file.getAbsolutePath(), list, f53491a);
        if (m76906a(context, str) > i) {
            Logger.m75880i(f53491a, "There is a higher loader version in assets.");
            return new Bundle();
        }
        StringBuilder sb = new StringBuilder();
        sb.append(file.getAbsolutePath());
        String str3 = File.separator;
        sb.append(str3);
        sb.append(i);
        sb.append(str3);
        sb.append(str);
        sb.append(".apk");
        File file2 = new File(sb.toString());
        if (!file2.exists()) {
            Logger.m75884w(f53491a, "Cannot find module apk in asset decompressed path.");
            return new Bundle();
        }
        Bundle bundleOooO00o = C22172OooOoO.OooO00o(InterfaceC17909b.f53584j, str);
        bundleOooO00o.putString(InterfaceC17909b.f53588n, file2.getAbsolutePath());
        bundleOooO00o.putInt(InterfaceC17909b.f53587m, i);
        StringBuilder sbOooO0OO = C20485OooOoO.OooO0OO(i, "Get module info from decompressed asset path success: ModuleName:", str, ", ModuleVersion:", ", ModulePath:");
        sbOooO0OO.append(file2.getAbsolutePath());
        Logger.m75880i(f53491a, sbOooO0OO.toString());
        return bundleOooO00o;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r9v0, types: [int] */
    /* JADX INFO: renamed from: a */
    public static String m76908a(Context context, String str, int i, String str2) throws Throwable {
        BufferedInputStream bufferedInputStream;
        FileOutputStream fileOutputStream;
        String str3;
        ?? r2 = 0;
        r2 = 0;
        try {
            try {
                AssetManager assets = context.getAssets();
                StringBuilder sb = new StringBuilder("dynamic_modules");
                str3 = File.separator;
                sb.append(str3);
                sb.append(str);
                sb.append(str3);
                sb.append(str2);
                bufferedInputStream = new BufferedInputStream(assets.open(sb.toString()));
            } catch (Throwable th) {
                th = th;
                r2 = i;
            }
            try {
                String str4 = ModuleCopy.getProtectedPath(context) + str3 + "dynamic_modules" + str3 + str + str3 + ((int) i);
                if (new File(str4).exists() || new File(str4).mkdirs()) {
                    String str5 = str4 + str3 + str + ".apk";
                    fileOutputStream = new FileOutputStream(new File(str5));
                    try {
                        byte[] bArr = new byte[4096];
                        while (true) {
                            int i2 = bufferedInputStream.read(bArr, 0, 4096);
                            if (i2 == -1) {
                                Logger.m75880i(f53491a, "Decompress module:" + str + " from assets success.");
                                ModuleCopy.closeQuietly(bufferedInputStream);
                                ModuleCopy.closeQuietly(fileOutputStream);
                                return str5;
                            }
                            fileOutputStream.write(bArr, 0, i2);
                        }
                    } catch (Exception e) {
                        e = e;
                        Logger.m75885w(f53491a, "Cannot find module:" + str + " in assets.", e);
                        ModuleCopy.closeQuietly(bufferedInputStream);
                        ModuleCopy.closeQuietly(fileOutputStream);
                        return null;
                    }
                } else {
                    Logger.m75884w(f53491a, "mkdirs local loaderPath failed.");
                    ModuleCopy.closeQuietly(bufferedInputStream);
                    ModuleCopy.closeQuietly(null);
                    return null;
                }
            } catch (Exception e2) {
                e = e2;
                fileOutputStream = null;
            } catch (Throwable th2) {
                th = th2;
                ModuleCopy.closeQuietly(bufferedInputStream);
                ModuleCopy.closeQuietly(r2);
                throw th;
            }
        } catch (Exception e3) {
            e = e3;
            fileOutputStream = null;
            bufferedInputStream = null;
        } catch (Throwable th3) {
            th = th3;
            bufferedInputStream = null;
        }
    }
}
