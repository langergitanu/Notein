package com.aspose.words.internal;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.Properties;

/* JADX INFO: loaded from: classes5.dex */
class zzZQZ {
    static /* synthetic */ Class zz3w = null;
    private static boolean zz3x = false;

    public static abstract class zzZ {
        private zzZ() {
        }

        public abstract ClassLoader getContextClassLoader();
    }

    static {
        try {
            zz3x = System.getProperty("xml.stream.debug") != null;
        } catch (Exception unused) {
        }
    }

    public static Object zz1(String str, String str2) throws zzZR0 {
        return zzZ(str, str2, zzlm());
    }

    private static /* synthetic */ Class zzW2(String str) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e) {
            throw new NoClassDefFoundError(e.getMessage());
        }
    }

    private static void zzW3(String str) {
        if (zz3x) {
            PrintStream printStream = System.err;
            StringBuffer stringBuffer = new StringBuffer("STREAM: ");
            stringBuffer.append(str);
            printStream.println(stringBuffer.toString());
        }
    }

    private static Object zzZ(String str, ClassLoader classLoader) throws zzZR0 {
        try {
            return (classLoader == null ? Class.forName(str) : classLoader.loadClass(str)).newInstance();
        } catch (ClassNotFoundException e) {
            StringBuffer stringBuffer = new StringBuffer("Provider ");
            stringBuffer.append(str);
            stringBuffer.append(" not found");
            throw new zzZR0(stringBuffer.toString(), e);
        } catch (Exception e2) {
            StringBuffer stringBuffer2 = new StringBuffer("Provider ");
            stringBuffer2.append(str);
            stringBuffer2.append(" could not be instantiated: ");
            stringBuffer2.append(e2);
            throw new zzZR0(stringBuffer2.toString(), e2);
        }
    }

    private static ClassLoader zzlm() throws zzZR0 {
        try {
            StringBuffer stringBuffer = new StringBuffer();
            Class clsZzW2 = zz3w;
            if (clsZzW2 == null) {
                clsZzW2 = zzW2("com.aspose.words.internal.zzZQZ");
                zz3w = clsZzW2;
            }
            stringBuffer.append(clsZzW2.getName());
            stringBuffer.append("$ClassLoaderFinderConcrete");
            return ((zzZ) Class.forName(stringBuffer.toString()).newInstance()).getContextClassLoader();
        } catch (ClassNotFoundException unused) {
            Class clsZzW22 = zz3w;
            if (clsZzW22 == null) {
                clsZzW22 = zzW2("com.aspose.words.internal.zzZQZ");
                zz3w = clsZzW22;
            }
            return clsZzW22.getClassLoader();
        } catch (Exception e) {
            throw new zzZR0(e.toString(), e);
        } catch (LinkageError unused2) {
            Class clsZzW23 = zz3w;
            if (clsZzW23 == null) {
                clsZzW23 = zzW2("com.aspose.words.internal.zzZQZ");
                zz3w = clsZzW23;
            }
            return clsZzW23.getClassLoader();
        }
    }

    private static Object zzZ(String str, String str2, ClassLoader classLoader) throws zzZR0 {
        InputStream resourceAsStream;
        try {
            String property = System.getProperty(str);
            if (property != null) {
                zzW3("found system property".concat(property));
                return zzZ(property, classLoader);
            }
        } catch (SecurityException unused) {
        }
        try {
            String property2 = System.getProperty("java.home");
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append(property2);
            String str3 = File.separator;
            stringBuffer.append(str3);
            stringBuffer.append("lib");
            stringBuffer.append(str3);
            stringBuffer.append("jaxp.properties");
            File file = new File(stringBuffer.toString());
            if (file.exists()) {
                Properties properties = new Properties();
                properties.load(new FileInputStream(file));
                String property3 = properties.getProperty(str);
                if (property3 != null && property3.length() > 0) {
                    zzW3("found java.home property ".concat(property3));
                    return zzZ(property3, classLoader);
                }
            }
        } catch (Exception e) {
            if (zz3x) {
                e.printStackTrace();
            }
        }
        StringBuffer stringBuffer2 = new StringBuffer("META-INF/services/");
        stringBuffer2.append(str);
        String string = stringBuffer2.toString();
        try {
            if (classLoader == null) {
                resourceAsStream = ClassLoader.getSystemResourceAsStream(string);
            } else {
                resourceAsStream = classLoader.getResourceAsStream(string);
            }
            if (resourceAsStream != null) {
                StringBuffer stringBuffer3 = new StringBuffer("found ");
                stringBuffer3.append(string);
                zzW3(stringBuffer3.toString());
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(resourceAsStream, "UTF-8"));
                String line = bufferedReader.readLine();
                bufferedReader.close();
                if (line != null && !"".equals(line)) {
                    zzW3("loaded from services: ".concat(line));
                    return zzZ(line, classLoader);
                }
            }
        } catch (Exception e2) {
            if (zz3x) {
                e2.printStackTrace();
            }
        }
        if (str2 != null) {
            zzW3("loaded from fallback value: ".concat(str2));
            return zzZ(str2, classLoader);
        }
        StringBuffer stringBuffer4 = new StringBuffer("Provider for ");
        stringBuffer4.append(str);
        stringBuffer4.append(" cannot be found");
        throw new zzZR0(stringBuffer4.toString(), null);
    }
}
