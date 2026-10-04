package com.huawei.hms.network.api;

import com.huawei.hms.framework.common.Logger;
import dalvik.system.PathClassLoader;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.List;

/* JADX INFO: renamed from: com.huawei.hms.network.api.b */
/* JADX INFO: loaded from: classes9.dex */
public class C18084b extends PathClassLoader {

    /* JADX INFO: renamed from: a */
    private static final String f54011a = "DelegatePathClassLoader";

    public C18084b(String str, String str2, ClassLoader classLoader) {
        super(str, str2, classLoader);
    }

    /* JADX INFO: renamed from: a */
    private static void m77732a(List list, Enumeration enumeration) {
        while (enumeration.hasMoreElements()) {
            list.add(enumeration.nextElement());
        }
    }

    @Override // java.lang.ClassLoader
    public final URL getResource(String str) {
        URL resource;
        ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
        if (systemClassLoader == null) {
            Logger.m76967w(f54011a, "Failed to get SystemClassLoader");
            resource = null;
        } else {
            resource = systemClassLoader.getResource(str);
        }
        return resource == null ? findResource(str) : resource;
    }

    @Override // java.lang.ClassLoader
    public final Enumeration getResources(String str) {
        String str2;
        ArrayList arrayList = new ArrayList();
        ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
        if (systemClassLoader != null) {
            try {
                m77732a(arrayList, systemClassLoader.getResources(str));
            } catch (IOException unused) {
                str2 = "Add Enumeration failed.";
                Logger.m76967w(f54011a, str2);
            }
            m77732a(arrayList, findResources(str));
            return Collections.enumeration(arrayList);
        }
        str2 = "Failed to get SystemClassLoader";
        Logger.m76967w(f54011a, str2);
        m77732a(arrayList, findResources(str));
        return Collections.enumeration(arrayList);
    }

    @Override // java.lang.ClassLoader
    public final Class loadClass(String str, boolean z) throws ClassNotFoundException {
        if (str.startsWith("java.")) {
            try {
                return super.loadClass(str, z);
            } catch (ClassNotFoundException unused) {
                Logger.m76967w(f54011a, "Load class failed.");
            }
        }
        try {
            return findClass(str);
        } catch (ClassNotFoundException unused2) {
            return super.loadClass(str, z);
        }
    }
}
