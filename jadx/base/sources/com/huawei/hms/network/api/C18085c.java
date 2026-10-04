package com.huawei.hms.network.api;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import com.huawei.hms.framework.common.Logger;

/* JADX INFO: renamed from: com.huawei.hms.network.api.c */
/* JADX INFO: loaded from: classes9.dex */
public class C18085c extends ContextWrapper {

    /* JADX INFO: renamed from: e */
    private static final String f54012e = "NetworkKitContextWrapper";

    /* JADX INFO: renamed from: a */
    private final ClassLoader f54013a;

    /* JADX INFO: renamed from: b */
    private final Resources f54014b;

    /* JADX INFO: renamed from: c */
    private final Resources f54015c;

    /* JADX INFO: renamed from: d */
    PackageInfo f54016d;

    public C18085c(Context context, String[] strArr) {
        super(context);
        this.f54013a = new C18084b(C18083a.m77728a(context, strArr), C18083a.m77731b(context, strArr), context.getClassLoader());
        this.f54015c = m77733a(strArr);
        this.f54014b = context.getResources();
        Logger.m76963i(f54012e, "Create dynamicContext success.");
    }

    /* JADX INFO: renamed from: a */
    private Resources m77733a(String[] strArr) {
        if (strArr != null && strArr.length > 0) {
            PackageInfo packageArchiveInfo = getBaseContext().getPackageManager().getPackageArchiveInfo(strArr[0], 128);
            this.f54016d = packageArchiveInfo;
            ApplicationInfo applicationInfo = packageArchiveInfo.applicationInfo;
            String str = strArr[0];
            applicationInfo.publicSourceDir = str;
            applicationInfo.sourceDir = str;
            applicationInfo.splitPublicSourceDirs = strArr;
            applicationInfo.splitSourceDirs = strArr;
            try {
                return getBaseContext().getPackageManager().getResourcesForApplication(this.f54016d.applicationInfo);
            } catch (PackageManager.NameNotFoundException e) {
                Logger.m76961e(f54012e, "NameNotFoundException:", e);
            }
        }
        return null;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final ClassLoader getClassLoader() {
        return this.f54013a;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public String getPackageName() {
        return this.f54016d.packageName;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Resources getResources() {
        Resources resources = this.f54015c;
        return resources == null ? this.f54014b : resources;
    }
}
