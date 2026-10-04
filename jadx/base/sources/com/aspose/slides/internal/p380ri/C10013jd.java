package com.aspose.slides.internal.p380ri;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.aspose.slides.internal.ri.jd */
/* JADX INFO: loaded from: classes4.dex */
public final class C10013jd {

    /* JADX INFO: renamed from: k4 */
    static Map<String, List<String>> f36023k4 = new HashMap();

    /* JADX INFO: renamed from: x1 */
    static Map<String, List<Object>> f36024x1 = new HashMap();

    private C10013jd() {
    }

    /* JADX INFO: renamed from: k4 */
    public static synchronized Iterator<Object> m49143k4(Class<?> cls) {
        String strM49145kk = m49145kk(cls);
        List<Object> list = f36024x1.get(strM49145kk);
        if (list != null) {
            return list.iterator();
        }
        ArrayList arrayList = new ArrayList();
        f36024x1.put(strM49145kk, arrayList);
        ClassLoader classLoaderM49146x1 = m49146x1(cls);
        if (classLoaderM49146x1 != null) {
            Iterator<String> it = m49144k4(cls, classLoaderM49146x1).iterator();
            while (it.hasNext()) {
                try {
                    arrayList.add(classLoaderM49146x1.loadClass(it.next()).newInstance());
                } catch (Exception unused) {
                }
            }
        }
        return arrayList.iterator();
    }

    /* JADX INFO: renamed from: kk */
    private static String m49145kk(Class<?> cls) {
        return "META-INF/services/".concat(cls.getName());
    }

    /* JADX INFO: renamed from: x1 */
    private static ClassLoader m49146x1(Class<?> cls) {
        ClassLoader classLoader;
        try {
            classLoader = cls.getClassLoader();
        } catch (SecurityException unused) {
            classLoader = null;
        }
        if (classLoader == null) {
            classLoader = C10013jd.class.getClassLoader();
        }
        return classLoader == null ? ClassLoader.getSystemClassLoader() : classLoader;
    }

    /* JADX INFO: renamed from: k4 */
    private static List<String> m49144k4(Class<?> cls, ClassLoader classLoader) {
        ArrayList arrayList = new ArrayList();
        if (classLoader != null) {
            try {
                Enumeration<URL> resources = classLoader.getResources(m49145kk(cls));
                while (resources.hasMoreElements()) {
                    try {
                        InputStream inputStreamOpenStream = resources.nextElement().openStream();
                        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStreamOpenStream, "UTF-8"));
                        while (true) {
                            try {
                                String line = bufferedReader.readLine();
                                if (line != null) {
                                    int iIndexOf = line.indexOf(35);
                                    if (iIndexOf != -1) {
                                        line = line.substring(0, iIndexOf);
                                    }
                                    String strTrim = line.trim();
                                    if (strTrim.length() != 0) {
                                        arrayList.add(strTrim);
                                    }
                                } else {
                                    try {
                                        break;
                                    } catch (IOException unused) {
                                    }
                                }
                            } catch (Throwable th) {
                                try {
                                    bufferedReader.close();
                                } catch (IOException unused2) {
                                }
                                if (inputStreamOpenStream != null) {
                                    try {
                                        inputStreamOpenStream.close();
                                    } catch (IOException unused3) {
                                    }
                                }
                                throw th;
                            }
                        }
                        bufferedReader.close();
                        if (inputStreamOpenStream != null) {
                            inputStreamOpenStream.close();
                        }
                    } catch (IOException | Exception unused4) {
                        continue;
                    }
                }
            } catch (IOException unused5) {
            }
        }
        return arrayList;
    }
}
