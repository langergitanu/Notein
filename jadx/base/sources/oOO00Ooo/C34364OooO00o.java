package oOO00Ooo;

import android.content.Context;
import android.text.TextUtils;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.atomic.AtomicBoolean;
import oOO00o0.C34370OooO0o0;
import org.xmlpull.v1.XmlSerializer;

/* JADX INFO: renamed from: oOO00Ooo.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C34364OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static FileOutputStream f123341OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static FileInputStream f123342OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static Properties f123343OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static volatile String f123344OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static final AtomicBoolean f123345OooO0o0 = new AtomicBoolean(false);

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0090, code lost:
    
        r5 = o0O00.OooO00o.OooO00o(r9, r5);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:112:? A[Catch: all -> 0x0064, DONT_GENERATE, FINALLY_INSNS, SYNTHETIC, TryCatch #0 {, blocks: (B:19:0x0060, B:25:0x0070, B:27:0x0074, B:23:0x0067, B:38:0x009a, B:42:0x00a7, B:44:0x00ab, B:40:0x009e, B:52:0x00c4, B:56:0x00d1, B:69:0x00f2, B:54:0x00c8, B:74:0x0101, B:78:0x010e, B:81:0x0119, B:80:0x0112, B:76:0x0105, B:63:0x00e1, B:67:0x00ee, B:65:0x00e5, B:50:0x00bb, B:61:0x00d8), top: B:86:0x0012, inners: #1, #2, #3, #6, #7, #8, #9, #10, #12, #14 }] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0070 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x010e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x00a7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r9v0, types: [android.content.Context] */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v11, types: [java.io.FileInputStream] */
    /* JADX WARN: Type inference failed for: r9v12 */
    /* JADX WARN: Type inference failed for: r9v13 */
    /* JADX WARN: Type inference failed for: r9v14 */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v4, types: [java.io.FileInputStream] */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v8 */
    /* JADX WARN: Type inference failed for: r9v9, types: [java.io.FileInputStream] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String OooO00o(Context context) {
        String property;
        int i = 0;
        if (f123345OooO0o0.compareAndSet(false, true)) {
            synchronized (C34364OooO00o.class) {
                FileOutputStream fileOutputStream = null;
                fileInputStreamOpenFileInput = null;
                FileInputStream fileInputStreamOpenFileInput = null;
                fileOutputStream = null;
                fileOutputStream = null;
                fileOutputStream = null;
                try {
                    try {
                        try {
                            Properties properties = new Properties();
                            StringBuilder sb = new StringBuilder();
                            sb.append(context.getFilesDir().getPath());
                            sb.append("/settings.properties");
                            FileOutputStream fileOutputStreamOpenFileOutput = !new File(sb.toString()).exists() ? context.openFileOutput("settings.properties", 0) : null;
                            try {
                                fileInputStreamOpenFileInput = context.openFileInput("settings.properties");
                                if (fileInputStreamOpenFileInput != null) {
                                    properties.load(fileInputStreamOpenFileInput);
                                } else {
                                    C34370OooO0o0.OooO0Oo("FileUtil", "getProperties inStream is null");
                                }
                                property = properties.getProperty("encryptversion");
                                if (!TextUtils.isEmpty(property)) {
                                    String[] strArr = new String[2];
                                    System.arraycopy(o0O000O.OooO00o.f88128OooO00o, 0, strArr, 0, 2);
                                    while (true) {
                                        if (i >= 2) {
                                            break;
                                        }
                                        if ("encryptversion".equals(strArr[i])) {
                                            break;
                                        }
                                        i++;
                                    }
                                    if (fileOutputStreamOpenFileOutput != null) {
                                        try {
                                            fileOutputStreamOpenFileOutput.close();
                                        } catch (IOException unused) {
                                            C34370OooO0o0.OooO0OO("FileUtil", "getProperties IOException / ");
                                        }
                                        if (fileInputStreamOpenFileInput != null) {
                                            try {
                                                fileInputStreamOpenFileInput.close();
                                            } catch (IOException unused2) {
                                                C34370OooO0o0.OooO0OO("FileUtil", "getProperties IOException / ");
                                            }
                                        }
                                    } else if (fileInputStreamOpenFileInput != null) {
                                    }
                                } else if (fileOutputStreamOpenFileOutput != null) {
                                    try {
                                        fileOutputStreamOpenFileOutput.close();
                                    } catch (IOException unused3) {
                                        C34370OooO0o0.OooO0OO("FileUtil", "getProperties IOException / ");
                                    }
                                    if (fileInputStreamOpenFileInput != null) {
                                        try {
                                            fileInputStreamOpenFileInput.close();
                                        } catch (IOException unused4) {
                                            C34370OooO0o0.OooO0OO("FileUtil", "getProperties IOException / ");
                                        }
                                    }
                                } else if (fileInputStreamOpenFileInput != null) {
                                }
                            } catch (FileNotFoundException unused5) {
                                context = fileInputStreamOpenFileInput;
                                fileOutputStream = fileOutputStreamOpenFileOutput;
                                C34370OooO0o0.OooO0OO("FileUtil", "Can not find the file settings.properties");
                                if (fileOutputStream != null) {
                                    try {
                                        fileOutputStream.close();
                                    } catch (IOException unused6) {
                                        C34370OooO0o0.OooO0OO("FileUtil", "getProperties IOException / ");
                                    }
                                }
                                if (context != 0) {
                                    context.close();
                                    context = context;
                                }
                                property = "";
                                f123344OooO0Oo = property;
                                return f123344OooO0Oo;
                            } catch (Throwable unused7) {
                                context = fileInputStreamOpenFileInput;
                                fileOutputStream = fileOutputStreamOpenFileOutput;
                                C34370OooO0o0.OooO0OO("FileUtil", "Throwable / ");
                                if (fileOutputStream != null) {
                                    try {
                                        fileOutputStream.close();
                                    } catch (IOException unused8) {
                                        C34370OooO0o0.OooO0OO("FileUtil", "getProperties IOException / ");
                                    }
                                }
                                if (context != 0) {
                                    context.close();
                                    context = context;
                                }
                                property = "";
                                f123344OooO0Oo = property;
                                return f123344OooO0Oo;
                            }
                        } finally {
                        }
                    } catch (FileNotFoundException unused9) {
                        context = 0;
                    } catch (Throwable unused10) {
                        context = 0;
                    }
                } catch (IOException unused11) {
                    context = "FileUtil";
                    C34370OooO0o0.OooO0OO("FileUtil", "getProperties IOException / ");
                }
            }
            f123344OooO0Oo = property;
        }
        return f123344OooO0Oo;
    }

    public static void OooO0O0(Context context, String str) throws IOException {
        String strOooO0O0;
        File filesDir = context.getFilesDir();
        if (filesDir == null || filesDir.getPath() == null) {
            return;
        }
        if (new File(filesDir.getPath() + "/settings.properties").exists()) {
            FileInputStream fileInputStreamOpenFileInput = context.openFileInput("settings.properties");
            f123342OooO0O0 = fileInputStreamOpenFileInput;
            if (fileInputStreamOpenFileInput != null) {
                f123343OooO0OO.load(fileInputStreamOpenFileInput);
            } else {
                C34370OooO0o0.OooO0Oo("FileUtil", "inStream is null");
            }
        }
        f123341OooO00o = context.openFileOutput("settings.properties", 0);
        String[] strArr = new String[2];
        System.arraycopy(o0O000O.OooO00o.f88128OooO00o, 0, strArr, 0, 2);
        int i = 0;
        while (true) {
            if (i >= 2) {
                strOooO0O0 = str;
                break;
            } else {
                if ("encryptversion".equals(strArr[i])) {
                    strOooO0O0 = o0O00.OooO00o.OooO0O0(context, str);
                    break;
                }
                i++;
            }
        }
        int i2 = 0;
        while (strOooO0O0.length() > 8388588 && i2 < 3) {
            i2++;
            C34370OooO0o0.OooO0Oo("FileUtil", i2 + " mValue.length() is " + strOooO0O0.length());
            int i3 = 0;
            while (true) {
                if (i3 >= 2) {
                    break;
                }
                if ("encryptversion".equals(strArr[i3])) {
                    strOooO0O0 = o0O00.OooO00o.OooO0O0(context, str);
                    break;
                }
                i3++;
            }
        }
        if (strOooO0O0.length() > 8388588) {
            C34370OooO0o0.OooO0OO("FileUtil", "final mValue.length() is " + strOooO0O0.length());
        } else {
            f123343OooO0OO.setProperty("encryptversion", strOooO0O0);
            FileOutputStream fileOutputStream = f123341OooO00o;
            if (fileOutputStream != null) {
                f123343OooO0OO.store(fileOutputStream, "accountagent");
            } else {
                C34370OooO0o0.OooO0Oo("FileUtil", "outStream is null");
            }
        }
    }

    public static void OooO0OO(XmlSerializer xmlSerializer, String str, String str2) {
        try {
            xmlSerializer.startTag("", str);
            xmlSerializer.text(str2);
            xmlSerializer.endTag("", str);
        } catch (IOException unused) {
            C34370OooO0o0.OooO0OO("FileUtil", "IOException ");
        } catch (IllegalArgumentException unused2) {
            C34370OooO0o0.OooO0OO("FileUtil", "IllegalArgumentException  ");
        } catch (IllegalStateException unused3) {
            C34370OooO0o0.OooO0OO("FileUtil", "IllegalStateException ");
        } catch (Exception unused4) {
            C34370OooO0o0.OooO0OO("FileUtil", "Exception ");
        }
    }

    public static boolean OooO0Oo(File file) {
        File[] fileArrListFiles;
        C34370OooO0o0.OooO0Oo("FileUtil", "deleteFile : file.getName");
        if (!file.exists()) {
            return true;
        }
        if (file.isDirectory() && (fileArrListFiles = file.listFiles()) != null) {
            for (File file2 : fileArrListFiles) {
                OooO0Oo(file2);
            }
        }
        return file.delete();
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x006f A[Catch: all -> 0x0020, IOException -> 0x0073, DONT_GENERATE, FINALLY_INSNS, TRY_LEAVE, TryCatch #2 {IOException -> 0x0073, blocks: (B:40:0x006b, B:42:0x006f), top: B:54:0x006b, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:67:? A[Catch: all -> 0x0020, DONT_GENERATE, FINALLY_INSNS, SYNTHETIC, TryCatch #0 {, blocks: (B:7:0x000a, B:9:0x0018, B:11:0x001c, B:16:0x0029, B:18:0x002d, B:32:0x0053, B:15:0x0022, B:35:0x005c, B:37:0x0060, B:40:0x006b, B:42:0x006f, B:45:0x007a, B:44:0x0073, B:39:0x0064, B:23:0x003a, B:25:0x003e, B:28:0x004b, B:30:0x004f, B:27:0x0044, B:46:0x007b, B:8:0x0015, B:22:0x0033), top: B:51:0x0005, inners: #1, #2, #3, #4, #5, #6, #7 }] */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:32:0x0053
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1182)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void OooO0o(android.content.Context r2, java.lang.String r3) {
        /*
            oOO00Ooo.C34364OooO00o.f123344OooO0Oo = r3
            java.lang.Class<oOO00Ooo.OooO00o> r0 = oOO00Ooo.C34364OooO00o.class
            monitor-enter(r0)
            if (r2 == 0) goto L7b
            if (r3 == 0) goto L7b
            r1 = 0
            oOO00Ooo.C34364OooO00o.f123341OooO00o = r1     // Catch: java.lang.Throwable -> L20
            oOO00Ooo.C34364OooO00o.f123342OooO0O0 = r1     // Catch: java.lang.Throwable -> L20
            java.util.Properties r1 = new java.util.Properties     // Catch: java.lang.Throwable -> L20
            r1.<init>()     // Catch: java.lang.Throwable -> L20
            oOO00Ooo.C34364OooO00o.f123343OooO0OO = r1     // Catch: java.lang.Throwable -> L20
            OooO0O0(r2, r3)     // Catch: java.lang.Throwable -> L31 java.lang.Exception -> L33
            java.io.FileOutputStream r2 = oOO00Ooo.C34364OooO00o.f123341OooO00o     // Catch: java.lang.Throwable -> L20 java.io.IOException -> L22
            if (r2 == 0) goto L29
            r2.close()     // Catch: java.lang.Throwable -> L20 java.io.IOException -> L22
            goto L29
        L20:
            r2 = move-exception
            goto L84
        L22:
            java.lang.String r2 = "FileUtil"
            java.lang.String r3 = "setProperties IOException"
            oOO00o0.C34370OooO0o0.OooO0OO(r2, r3)     // Catch: java.lang.Throwable -> L20
        L29:
            java.io.FileInputStream r2 = oOO00Ooo.C34364OooO00o.f123342OooO0O0     // Catch: java.lang.Throwable -> L20 java.io.IOException -> L53
            if (r2 == 0) goto L5a
            r2.close()     // Catch: java.lang.Throwable -> L20 java.io.IOException -> L53
            goto L5a
        L31:
            r2 = move-exception
            goto L5c
        L33:
            java.lang.String r2 = "FileUtil"
            java.lang.String r3 = "IOException"
            oOO00o0.C34370OooO0o0.OooO0OO(r2, r3)     // Catch: java.lang.Throwable -> L31
            java.io.FileOutputStream r2 = oOO00Ooo.C34364OooO00o.f123341OooO00o     // Catch: java.lang.Throwable -> L20 java.io.IOException -> L44
            if (r2 == 0) goto L4b
            java.io.FileOutputStream r2 = oOO00Ooo.C34364OooO00o.f123341OooO00o     // Catch: java.lang.Throwable -> L20 java.io.IOException -> L44
            r2.close()     // Catch: java.lang.Throwable -> L20 java.io.IOException -> L44
            goto L4b
        L44:
            java.lang.String r2 = "FileUtil"
            java.lang.String r3 = "setProperties IOException"
            oOO00o0.C34370OooO0o0.OooO0OO(r2, r3)     // Catch: java.lang.Throwable -> L20
        L4b:
            java.io.FileInputStream r2 = oOO00Ooo.C34364OooO00o.f123342OooO0O0     // Catch: java.lang.Throwable -> L20 java.io.IOException -> L53
            if (r2 == 0) goto L5a
            r2.close()     // Catch: java.lang.Throwable -> L20 java.io.IOException -> L53
            goto L5a
        L53:
            java.lang.String r2 = "FileUtil"
            java.lang.String r3 = "IOException"
            oOO00o0.C34370OooO0o0.OooO0OO(r2, r3)     // Catch: java.lang.Throwable -> L20
        L5a:
            monitor-exit(r0)
            return
        L5c:
            java.io.FileOutputStream r3 = oOO00Ooo.C34364OooO00o.f123341OooO00o     // Catch: java.lang.Throwable -> L20 java.io.IOException -> L64
            if (r3 == 0) goto L6b
            r3.close()     // Catch: java.lang.Throwable -> L20 java.io.IOException -> L64
            goto L6b
        L64:
            java.lang.String r3 = "FileUtil"
            java.lang.String r1 = "setProperties IOException"
            oOO00o0.C34370OooO0o0.OooO0OO(r3, r1)     // Catch: java.lang.Throwable -> L20
        L6b:
            java.io.FileInputStream r3 = oOO00Ooo.C34364OooO00o.f123342OooO0O0     // Catch: java.lang.Throwable -> L20 java.io.IOException -> L73
            if (r3 == 0) goto L7a
            r3.close()     // Catch: java.lang.Throwable -> L20 java.io.IOException -> L73
            goto L7a
        L73:
            java.lang.String r3 = "FileUtil"
            java.lang.String r1 = "IOException"
            oOO00o0.C34370OooO0o0.OooO0OO(r3, r1)     // Catch: java.lang.Throwable -> L20
        L7a:
            throw r2     // Catch: java.lang.Throwable -> L20
        L7b:
            java.lang.String r2 = "FileUtil"
            java.lang.String r3 = "at least 1 param is null"
            oOO00o0.C34370OooO0o0.OooO0Oo(r2, r3)     // Catch: java.lang.Throwable -> L20
            monitor-exit(r0)
            return
        L84:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L20
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: oOO00Ooo.C34364OooO00o.OooO0o(android.content.Context, java.lang.String):void");
    }

    public static boolean OooO0o0(String str, byte[] bArr) throws Throwable {
        if (str == null || TextUtils.isEmpty(str) || TextUtils.isEmpty("accounts.xml") || bArr == null) {
            return false;
        }
        FileOutputStream fileOutputStream = null;
        try {
            try {
                try {
                    File file = new File(str);
                    if (!file.exists() && !file.mkdirs()) {
                        return false;
                    }
                    FileOutputStream fileOutputStream2 = new FileOutputStream(new File(str.concat("accounts.xml")));
                    try {
                        fileOutputStream2.write(bArr);
                        fileOutputStream2.close();
                        return true;
                    } catch (FileNotFoundException unused) {
                        fileOutputStream = fileOutputStream2;
                    } catch (IOException unused2) {
                        fileOutputStream = fileOutputStream2;
                        C34370OooO0o0.OooO0OO("FileUtil", "writeAgreement IOException");
                        if (fileOutputStream == null) {
                            return false;
                        }
                        try {
                            fileOutputStream.close();
                            return false;
                        } catch (IOException unused3) {
                            C34370OooO0o0.OooO0OO("FileUtil", "IOException ");
                            return false;
                        }
                    } catch (RuntimeException unused4) {
                        fileOutputStream = fileOutputStream2;
                        C34370OooO0o0.OooO0OO("FileUtil", "RuntimeException ");
                        if (fileOutputStream != null) {
                            fileOutputStream.close();
                        }
                        return true;
                    } catch (Exception unused5) {
                        fileOutputStream = fileOutputStream2;
                        C34370OooO0o0.OooO0OO("FileUtil", "Exception ");
                        if (fileOutputStream != null) {
                            fileOutputStream.close();
                        }
                        return true;
                    } catch (Throwable th) {
                        fileOutputStream = fileOutputStream2;
                        th = th;
                        if (fileOutputStream != null) {
                            try {
                                fileOutputStream.close();
                            } catch (IOException unused6) {
                                C34370OooO0o0.OooO0OO("FileUtil", "IOException ");
                            }
                        }
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (FileNotFoundException unused7) {
            } catch (IOException unused8) {
            } catch (RuntimeException unused9) {
            } catch (Exception unused10) {
            }
            C34370OooO0o0.OooO0OO("FileUtil", "writeAgreement FileNotFoundException");
            if (fileOutputStream == null) {
                return false;
            }
            try {
                fileOutputStream.close();
                return false;
            } catch (IOException unused11) {
                C34370OooO0o0.OooO0OO("FileUtil", "IOException ");
                return false;
            }
        } catch (IOException unused12) {
            C34370OooO0o0.OooO0OO("FileUtil", "IOException ");
        }
    }
}
