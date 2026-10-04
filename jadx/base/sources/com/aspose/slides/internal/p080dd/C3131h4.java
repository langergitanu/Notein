package com.aspose.slides.internal.p080dd;

import com.alibaba.sdk.android.oss.internal.OooO00o;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.DirectoryNotFoundException;
import com.aspose.slides.exceptions.FileNotFoundException;
import com.aspose.slides.exceptions.IOException;
import com.aspose.slides.internal.p294n9.AbstractC6747ar;
import com.aspose.slides.p559ms.System.C14113y2;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/* JADX INFO: renamed from: com.aspose.slides.internal.dd.h4 */
/* JADX INFO: loaded from: classes3.dex */
public class C3131h4 {
    /* JADX INFO: renamed from: c5 */
    public static String m13346c5(String str) {
        C3148wl c3148wl = new C3148wl(str);
        try {
            return c3148wl.mo13427dy();
        } finally {
            c3148wl.dispose();
        }
    }

    /* JADX INFO: renamed from: du */
    public static C3148wl m13347du(String str) {
        return new C3148wl(str);
    }

    /* JADX INFO: renamed from: dy */
    public static String[] m13348dy(String str) {
        C3148wl c3148wlM13347du = m13347du(str);
        try {
            return m13359k4(c3148wlM13347du);
        } finally {
            if (c3148wlM13347du != null) {
                c3148wlM13347du.dispose();
            }
        }
    }

    /* JADX INFO: renamed from: h4 */
    public static C3130fa m13349h4(String str) {
        return new C3130fa(str, 4, 2, 0);
    }

    /* JADX INFO: renamed from: k4 */
    public static C3130fa m13350k4(String str) {
        return new C3130fa(str, 2, 3);
    }

    /* JADX INFO: renamed from: kk */
    public static void m13360kk(String str, String str2) {
        if (str == null) {
            throw new ArgumentNullException("sourceFileName");
        }
        if (str2 == null) {
            throw new ArgumentNullException("destFileName");
        }
        if (str.length() == 0) {
            throw new ArgumentException("An empty file name is not valid.", "sourceFileName");
        }
        if (C14113y2.m67440x1(str).length() == 0) {
            throw new ArgumentException("The file name is not valid.");
        }
        if (str2.length() == 0) {
            throw new ArgumentException("An empty file name is not valid.", "destFileName");
        }
        if (C14113y2.m67440x1(str2).length() == 0) {
            throw new ArgumentException("The file name is not valid.");
        }
        File file = new File(str);
        File file2 = new File(str2);
        if (!file.exists()) {
            throw new FileNotFoundException("No such source file: ".concat(str), str);
        }
        if (!file.isFile()) {
            throw new IOException("Can't move directory: ".concat(str));
        }
        if (file2.exists()) {
            throw new IOException("Such directory already exist: " + file2.getAbsolutePath());
        }
        if (!file.renameTo(file2)) {
            throw new IOException("File was not moved");
        }
    }

    /* JADX INFO: renamed from: m9 */
    public static byte[] m13362m9(String str) {
        C3130fa c3130faM13363to = m13363to(str);
        try {
            long length = c3130faM13363to.getLength();
            if (length > 2147483647L) {
                throw new IOException("Reading more than 2GB with this call is not supported");
            }
            int i = (int) length;
            byte[] bArr = new byte[i];
            int i2 = 0;
            while (i > 0) {
                int i3 = c3130faM13363to.read(bArr, i2, i);
                if (i3 == 0) {
                    throw new IOException("Unexpected end of stream");
                }
                i2 += i3;
                i -= i3;
            }
            c3130faM13363to.dispose();
            return bArr;
        } catch (Throwable th) {
            if (c3130faM13363to != null) {
                c3130faM13363to.dispose();
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: to */
    public static C3130fa m13363to(String str) {
        return new C3130fa(str, 3, 1, 1);
    }

    /* JADX INFO: renamed from: x1 */
    public static void m13365x1(String str) {
        if (str == null) {
            throw new ArgumentNullException("path");
        }
        if (C14113y2.m67440x1(str).length() == 0) {
            throw new ArgumentException("path");
        }
        String strM13400h4 = C3141rv.m13400h4(str);
        if (!C14113y2.m67411k4(strM13400h4) && !C3142to.m13421kk(strM13400h4)) {
            throw new DirectoryNotFoundException(C14113y2.m67402k4("Could not find a part of the path \"{0}\".", str));
        }
        File file = new File(str);
        if (file.isFile() && file.exists() && !file.delete()) {
            throw new IOException("File was not deleted: ".concat(str));
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static C3130fa m13351k4(String str, int i) {
        return new C3130fa(str, i, i == 6 ? 2 : 3, 0);
    }

    /* JADX INFO: renamed from: kk */
    public static boolean m13361kk(String str) {
        if (str == null || str.length() == 0) {
            return false;
        }
        File file = new File(str);
        try {
            if (file.isFile()) {
                if (file.exists()) {
                    return true;
                }
            }
        } catch (SecurityException unused) {
        }
        return false;
    }

    /* JADX INFO: renamed from: to */
    public static void m13364to(String str, String str2) {
        m13356k4(str, str2, AbstractC6747ar.m26635ix());
    }

    /* JADX INFO: renamed from: x1 */
    public static void m13366x1(String str, String str2) throws Throwable {
        m13357k4(str, str2, false);
    }

    /* JADX INFO: renamed from: k4 */
    public static C3130fa m13352k4(String str, int i, int i2) {
        return new C3130fa(str, i, i2, 0);
    }

    /* JADX INFO: renamed from: k4 */
    public static C3130fa m13353k4(String str, int i, int i2, int i3) {
        return new C3130fa(str, i, i2, i3);
    }

    /* JADX INFO: renamed from: k4 */
    public static String m13354k4(String str, AbstractC6747ar abstractC6747ar) {
        C3148wl c3148wl = new C3148wl(str, abstractC6747ar);
        try {
            return c3148wl.mo13427dy();
        } finally {
            c3148wl.dispose();
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static void m13355k4(String str, String str2) {
        C3123ar c3123ar = new C3123ar(str, true);
        try {
            c3123ar.mo13304k4(str2);
        } finally {
            c3123ar.dispose();
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static void m13356k4(String str, String str2, AbstractC6747ar abstractC6747ar) {
        C3123ar c3123ar = new C3123ar(str, false, abstractC6747ar);
        try {
            c3123ar.mo13304k4(str2);
        } finally {
            c3123ar.dispose();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v19, types: [java.io.FileInputStream] */
    /* JADX WARN: Type inference failed for: r6v20, types: [java.io.FileInputStream] */
    /* JADX WARN: Type inference failed for: r6v24 */
    /* JADX WARN: Type inference failed for: r6v25 */
    /* JADX WARN: Type inference failed for: r6v26 */
    /* JADX WARN: Type inference failed for: r6v27 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v15, types: [java.io.FileOutputStream] */
    /* JADX WARN: Type inference failed for: r7v17 */
    /* JADX WARN: Type inference failed for: r7v25 */
    /* JADX WARN: Type inference failed for: r7v26 */
    /* JADX INFO: renamed from: k4 */
    public static void m13357k4(String str, String str2, boolean z) throws Throwable {
        Throwable th;
        java.io.IOException e;
        java.io.FileNotFoundException e2;
        if (str == null) {
            throw new ArgumentNullException("sourceFileName");
        }
        if (str2 == null) {
            throw new ArgumentNullException("destFileName");
        }
        if (str.length() == 0) {
            throw new ArgumentException("An empty file name is not valid.", "sourceFileName");
        }
        if (C14113y2.m67440x1(str).length() == 0) {
            throw new ArgumentException("The file name is not valid.");
        }
        if (str2.length() == 0) {
            throw new ArgumentException("An empty file name is not valid.", "destFileName");
        }
        if (C14113y2.m67440x1(str2).length() == 0) {
            throw new ArgumentException("The file name is not valid.");
        }
        File file = new File(str);
        File file2 = new File(str2);
        if (!file.exists()) {
            throw new FileNotFoundException("FileCopy: no such source file: ".concat(str), str);
        }
        if (!file.isFile()) {
            throw new IOException("FileCopy: can't copy directory: ".concat(str));
        }
        if (!file.canRead()) {
            throw new IOException("FileCopy: source file is unreadable: ".concat(str));
        }
        boolean zEquals = str.equals(str2);
        if (zEquals) {
            throw new IOException("Can't copy file to itsalf : ".concat(str));
        }
        ?? r6 = zEquals;
        if (file2.isDirectory()) {
            String name = file.getName();
            file2 = new File(file2, name);
            r6 = name;
        }
        ?? fileInputStream = r6;
        ?? r7 = z;
        if (!file2.exists()) {
            String parent = file2.getParent();
            if (parent == null) {
                parent = System.getProperty("user.dir");
            }
            File file3 = new File(parent);
            if (!file3.exists()) {
                throw new IOException(OooO00o.OooO00o("FileCopy: destination directory doesn't exist: ", parent));
            }
            boolean zIsFile = file3.isFile();
            if (zIsFile) {
                throw new IOException(OooO00o.OooO00o("FileCopy: destination is not a directory: ", parent));
            }
            boolean zCanWrite = file3.canWrite();
            fileInputStream = zCanWrite;
            r7 = zIsFile;
            if (!zCanWrite) {
                throw new IOException(OooO00o.OooO00o("FileCopy: destination directory is unwriteable: ", parent));
            }
        } else if (!z) {
            throw new IOException("Destination file alresdy exist :" + file2.getAbsolutePath());
        }
        try {
            try {
                fileInputStream = new FileInputStream(file);
            } catch (Throwable th2) {
                th = th2;
            }
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(file2);
                try {
                    byte[] bArr = new byte[4096];
                    while (true) {
                        int i = fileInputStream.read(bArr);
                        if (i != -1) {
                            fileOutputStream.write(bArr, 0, i);
                        } else {
                            try {
                                break;
                            } catch (java.io.IOException unused) {
                            }
                        }
                    }
                    fileInputStream.close();
                    try {
                        fileOutputStream.close();
                    } catch (java.io.IOException unused2) {
                    }
                } catch (java.io.FileNotFoundException e3) {
                    e2 = e3;
                    throw new FileNotFoundException(e2.getMessage());
                } catch (java.io.IOException e4) {
                    e = e4;
                    throw new IOException(e.getMessage());
                }
            } catch (java.io.FileNotFoundException e5) {
                e2 = e5;
            } catch (java.io.IOException e6) {
                e = e6;
            } catch (Throwable th3) {
                r7 = 0;
                th = th3;
                if (fileInputStream != 0) {
                    try {
                        fileInputStream.close();
                    } catch (java.io.IOException unused3) {
                    }
                }
                if (r7 == 0) {
                    throw th;
                }
                try {
                    r7.close();
                    throw th;
                } catch (java.io.IOException unused4) {
                    throw th;
                }
            }
        } catch (java.io.FileNotFoundException e7) {
            e2 = e7;
        } catch (java.io.IOException e8) {
            e = e8;
        } catch (Throwable th4) {
            r7 = 0;
            th = th4;
            fileInputStream = 0;
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static void m13358k4(String str, byte[] bArr) {
        C3130fa c3130faM13350k4 = m13350k4(str);
        try {
            c3130faM13350k4.write(bArr, 0, bArr.length);
            c3130faM13350k4.dispose();
        } catch (Throwable th) {
            if (c3130faM13350k4 != null) {
                c3130faM13350k4.dispose();
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static String[] m13359k4(C3148wl c3148wl) {
        List list = new List();
        while (!c3148wl.m13439kk()) {
            list.addItem(c3148wl.mo13429m9());
        }
        return (String[]) list.toArray(new String[0]);
    }
}
