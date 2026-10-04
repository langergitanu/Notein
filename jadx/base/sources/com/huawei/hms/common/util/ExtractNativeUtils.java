package com.huawei.hms.common.util;

import android.content.Context;
import com.aspose.words.WarningType;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* JADX INFO: loaded from: classes6.dex */
public class ExtractNativeUtils {

    /* JADX INFO: renamed from: a */
    public static final String f52513a = "ExtractNativeUtils";

    /* JADX INFO: renamed from: b */
    public static final int f52514b = 0;

    /* JADX INFO: renamed from: c */
    public static final int f52515c = -1;

    /* JADX INFO: renamed from: d */
    public static final int f52516d = 50;

    /* JADX INFO: renamed from: e */
    public static final int f52517e = 52428800;

    /* JADX INFO: renamed from: f */
    public static Pattern f52518f = Pattern.compile("lib/([^/]+)/(.*\\.so)$");

    /* JADX INFO: renamed from: com.huawei.hms.common.util.ExtractNativeUtils$b */
    public static class C17752b {

        /* JADX INFO: renamed from: a */
        public String f52519a;

        /* JADX INFO: renamed from: b */
        public ZipEntry f52520b;

        /* JADX INFO: renamed from: c */
        public String f52521c;

        public C17752b(ZipEntry zipEntry, String str, String str2) {
            this.f52520b = zipEntry;
            this.f52519a = str;
            this.f52521c = str2;
        }
    }

    /* JADX INFO: renamed from: a */
    public static int m75858a(File file, String str) throws Throwable {
        ZipFile zipFile;
        Logger.m75880i(f52513a, "begin extractNativeLibrary");
        int i = 0;
        ZipFile zipFile2 = null;
        try {
            try {
                zipFile = new ZipFile(file);
            } catch (IOException e) {
                e = e;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            try {
                Enumeration<? extends ZipEntry> enumerationEntries = zipFile.entries();
                HashMap map = new HashMap();
                int iM75859a = m75859a(enumerationEntries, (HashMap<String, HashSet<C17752b>>) map, 0);
                if (iM75859a == -1) {
                    Logger.m75877e(f52513a, "Unsafe zip name!");
                    try {
                        zipFile.close();
                        return -1;
                    } catch (IOException e2) {
                        Logger.m75878e(f52513a, "IOException:", e2);
                        return -1;
                    }
                }
                if (iM75859a > 50) {
                    Logger.m75877e(f52513a, "the total number is larger than the max");
                    try {
                        zipFile.close();
                        return -1;
                    } catch (IOException e3) {
                        Logger.m75878e(f52513a, "IOException:", e3);
                        return -1;
                    }
                }
                Iterator it = map.keySet().iterator();
                int iM75860a = 0;
                while (it.hasNext()) {
                    try {
                        Set<C17752b> set = (Set) map.get((String) it.next());
                        if (set == null) {
                            Logger.m75877e(f52513a, "Get nativeZipEntries failed.");
                            try {
                                zipFile.close();
                                return -1;
                            } catch (IOException e4) {
                                Logger.m75878e(f52513a, "IOException:", e4);
                                return -1;
                            }
                        }
                        for (C17752b c17752b : set) {
                            String str2 = str + File.separator + c17752b.f52521c;
                            FileUtil.m75868b(str2);
                            new File(str2).setExecutable(true, false);
                            iM75860a = m75860a(zipFile, c17752b, str2);
                            if (iM75860a != 0) {
                                try {
                                    zipFile.close();
                                    return iM75860a;
                                } catch (IOException e5) {
                                    Logger.m75878e(f52513a, "IOException:", e5);
                                    return iM75860a;
                                }
                            }
                            new File(str2, c17752b.f52519a).setReadable(true, false);
                        }
                    } catch (IOException e6) {
                        e = e6;
                        i = iM75860a;
                        zipFile2 = zipFile;
                        Logger.m75878e(f52513a, "catch IOException ", e);
                        if (zipFile2 == null) {
                            return i;
                        }
                        try {
                            zipFile2.close();
                            return i;
                        } catch (IOException e7) {
                            e = e7;
                            iM75860a = i;
                        }
                    }
                    Logger.m75878e(f52513a, "IOException:", e);
                    return iM75860a;
                }
                try {
                    zipFile.close();
                    return iM75860a;
                } catch (IOException e8) {
                    e = e8;
                }
            } catch (IOException e9) {
                e = e9;
            }
        } catch (Throwable th2) {
            th = th2;
            zipFile2 = zipFile;
            if (zipFile2 != null) {
                try {
                    zipFile2.close();
                } catch (IOException e10) {
                    Logger.m75878e(f52513a, "IOException:", e10);
                }
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: a */
    public static int m75859a(Enumeration enumeration, HashMap<String, HashSet<C17752b>> map, int i) {
        while (enumeration.hasMoreElements()) {
            ZipEntry zipEntry = (ZipEntry) enumeration.nextElement();
            String name = zipEntry.getName();
            if (name.contains("../")) {
                Logger.m75877e(f52513a, "Unsafe zip name!");
                return -1;
            }
            Matcher matcher = f52518f.matcher(name);
            if (matcher.matches()) {
                String strGroup = matcher.group(1);
                String strGroup2 = matcher.group(2);
                HashSet<C17752b> hashSet = map.get(strGroup);
                if (hashSet == null) {
                    hashSet = new HashSet<>();
                    map.put(strGroup, hashSet);
                }
                hashSet.add(new C17752b(zipEntry, strGroup2, strGroup));
                i++;
            }
        }
        return i;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:0|2|(2:78|3)|(2:87|4)|(2:5|(4:7|(1:90)(1:14)|77|55)(2:89|16))|82|17|21|77|55|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0062, code lost:
    
        r9 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0063, code lost:
    
        com.huawei.hms.common.util.Logger.m75878e(com.huawei.hms.common.util.ExtractNativeUtils.f52513a, "IOException", r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x002d, code lost:
    
        com.huawei.hms.common.util.Logger.m75877e(com.huawei.hms.common.util.ExtractNativeUtils.f52513a, "so file too big , " + r10.f52521c + " , " + r10.f52519a);
     */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00ae A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00b8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:91:? A[SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:54:0x00a4 -> B:77:0x00a7). Please report as a decompilation issue!!! */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int m75860a(ZipFile zipFile, C17752b c17752b, String str) throws Throwable {
        InputStream inputStream;
        InputStream inputStream2;
        byte[] bArr;
        FileOutputStream fileOutputStream;
        int i;
        int i2 = -1;
        FileOutputStream fileOutputStream2 = null;
        inputStream = null;
        inputStream = null;
        InputStream inputStream3 = null;
        fileOutputStream2 = null;
        fileOutputStream2 = null;
        try {
            try {
                bArr = new byte[4096];
                fileOutputStream = new FileOutputStream(new File(str, c17752b.f52519a));
            } catch (IOException e) {
                Logger.m75878e(f52513a, "IOException", e);
            }
        } catch (FileNotFoundException unused) {
            inputStream2 = null;
        } catch (IOException e2) {
            e = e2;
            inputStream = null;
        } catch (Throwable th) {
            th = th;
            inputStream = null;
        }
        try {
            inputStream3 = zipFile.getInputStream(c17752b.f52520b);
            i = 0;
        } catch (FileNotFoundException unused2) {
            inputStream2 = inputStream3;
            fileOutputStream2 = fileOutputStream;
            try {
                Logger.m75877e(f52513a, "FileNotFoundException");
                if (fileOutputStream2 != null) {
                    try {
                        fileOutputStream2.close();
                    } catch (IOException e3) {
                        Logger.m75878e(f52513a, "IOException", e3);
                    }
                }
                if (inputStream2 != null) {
                    inputStream2.close();
                }
                return i2;
            } catch (Throwable th2) {
                inputStream = inputStream2;
                th = th2;
                if (fileOutputStream2 != null) {
                    try {
                        fileOutputStream2.close();
                    } catch (IOException e4) {
                        Logger.m75878e(f52513a, "IOException", e4);
                    }
                }
                if (inputStream == null) {
                    throw th;
                }
                try {
                    inputStream.close();
                    throw th;
                } catch (IOException e5) {
                    Logger.m75878e(f52513a, "IOException", e5);
                    throw th;
                }
            }
        } catch (IOException e6) {
            e = e6;
            inputStream = inputStream3;
            fileOutputStream2 = fileOutputStream;
            try {
                Logger.m75878e(f52513a, "IOException", e);
                if (fileOutputStream2 != null) {
                    try {
                        fileOutputStream2.close();
                    } catch (IOException e7) {
                        Logger.m75878e(f52513a, "IOException", e7);
                    }
                }
                if (inputStream != null) {
                    inputStream.close();
                }
                return i2;
            } catch (Throwable th3) {
                th = th3;
                if (fileOutputStream2 != null) {
                }
                if (inputStream == null) {
                }
            }
        } catch (Throwable th4) {
            th = th4;
            inputStream = inputStream3;
            fileOutputStream2 = fileOutputStream;
            if (fileOutputStream2 != null) {
            }
            if (inputStream == null) {
            }
        }
        while (true) {
            int i3 = inputStream3.read(bArr);
            if (i3 <= 0) {
                i2 = 0;
                break;
            }
            i += i3;
            if (i > 52428800) {
                break;
            }
            fileOutputStream.write(bArr, 0, i3);
            return i2;
        }
        fileOutputStream.close();
        inputStream3.close();
        return i2;
    }

    /* JADX INFO: renamed from: a */
    public static boolean m75861a(Context context, String str) {
        try {
            if ((context.getPackageManager().getPackageArchiveInfo(str, 128).applicationInfo.flags & WarningType.HINT) == 268435456) {
                Logger.m75880i(f52513a, "The extract-native-flag has set, need to extract.");
                return true;
            }
            Logger.m75880i(f52513a, "The extract-native-flag has not set, No need to extract.");
            return false;
        } catch (Exception unused) {
            Logger.m75884w(f52513a, "Get package name failed: name not found.");
            return true;
        }
    }
}
