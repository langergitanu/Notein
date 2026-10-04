package com.huawei.hms.feature.dynamic.p576e;

import android.util.Log;
import dalvik.system.PathClassLoader;

/* JADX INFO: renamed from: com.huawei.hms.feature.dynamic.e.a */
/* JADX INFO: loaded from: classes6.dex */
public final class C17912a extends PathClassLoader {

    /* JADX INFO: renamed from: a */
    public static final String f53609a = "a";

    public C17912a(String str, ClassLoader classLoader) {
        super(str, classLoader);
    }

    @Override // java.lang.ClassLoader
    public final Class<?> loadClass(String str, boolean z) throws ClassNotFoundException {
        if (!str.startsWith("java.") && !str.startsWith("android.")) {
            try {
                return findClass(str);
            } catch (ClassNotFoundException unused) {
                Log.w(f53609a, "Cannot find The class:".concat(str));
            }
        }
        return super.loadClass(str, z);
    }
}
