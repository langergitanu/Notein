package com.aspose.slides.internal.p080dd;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.DirectoryNotFoundException;
import com.aspose.slides.exceptions.IOException;
import com.aspose.slides.p559ms.System.C14113y2;
import com.huawei.hms.network.embedded.C18358t1;
import com.microsoft.identity.client.internal.MsalUtils;
import java.io.File;
import java.io.FilenameFilter;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: com.aspose.slides.internal.dd.to */
/* JADX INFO: loaded from: classes3.dex */
public class C3142to {

    /* JADX INFO: renamed from: com.aspose.slides.internal.dd.to$k4 */
    public static class k4 implements FilenameFilter {

        /* JADX INFO: renamed from: k4 */
        private Pattern f9306k4;

        /* JADX INFO: renamed from: x1 */
        private boolean f9307x1;

        public k4(String str, boolean z) {
            Pattern patternCompile;
            if (str == "*.*") {
                patternCompile = Pattern.compile("^.*$");
            } else {
                patternCompile = Pattern.compile("^" + str.replace(".", "\\.").replace(C18358t1.g.f56183c, ".*").replace(MsalUtils.QUERY_STRING_SYMBOL, ".") + "$", 2);
            }
            this.f9306k4 = patternCompile;
            this.f9307x1 = z;
        }

        @Override // java.io.FilenameFilter
        public boolean accept(File file, String str) {
            Pattern patternCompile;
            File file2 = new File(C3141rv.m13412x1(file.getAbsolutePath(), str));
            if (!(this.f9307x1 && file2.isFile()) && (this.f9307x1 || !file2.isDirectory())) {
                return false;
            }
            if (!file2.isFile() || C14113y2.m67359c5(str, ".")) {
                patternCompile = this.f9306k4;
                str = file2.getName();
            } else {
                String strPattern = this.f9306k4.pattern();
                if (strPattern.endsWith("\\..*$")) {
                    strPattern = C14113y2.m67401k4(strPattern, "\\..*$", ".*$");
                }
                if (strPattern.endsWith("\\.$")) {
                    strPattern = C14113y2.m67401k4(strPattern, "\\.$", "$");
                }
                patternCompile = Pattern.compile(strPattern);
            }
            return patternCompile.matcher(str).find();
        }
    }

    /* JADX INFO: renamed from: du */
    public static String[] m13414du(String str) {
        if (str != null) {
            return m13425x1(str, "*.*");
        }
        throw new ArgumentNullException("path");
    }

    /* JADX INFO: renamed from: h4 */
    public static boolean m13415h4(String str) {
        if ("/".equals(str)) {
            return true;
        }
        return str.length() == 3 && C14113y2.m67424kk(str, ":\\");
    }

    /* JADX INFO: renamed from: k4 */
    public static C3128du m13416k4(String str) {
        if (str == null) {
            throw new ArgumentNullException("path");
        }
        if (str.length() == 0) {
            throw new ArgumentException("Path is empty");
        }
        if (C14113y2.m67440x1(str).length() == 0) {
            throw new ArgumentException("Only blank characters in path");
        }
        File file = new File(str);
        if (file.mkdirs() || (file.isDirectory() && file.exists())) {
            return new C3128du(str, true);
        }
        throw new IOException("DirectoryInfo was not created");
    }

    /* JADX INFO: renamed from: kk */
    public static boolean m13421kk(String str) {
        if (str != null && str.length() != 0) {
            try {
                return new File(str).isDirectory();
            } catch (SecurityException unused) {
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: m9 */
    public static C3128du m13422m9(String str) {
        if (str == null) {
            throw new ArgumentNullException("path");
        }
        if (m13415h4(str)) {
            return null;
        }
        String strM13400h4 = C3141rv.m13400h4(str);
        if (strM13400h4 == null || strM13400h4.length() == 0) {
            strM13400h4 = m13417k4();
        }
        return new C3128du(strM13400h4);
    }

    /* JADX INFO: renamed from: to */
    public static String[] m13423to(String str) {
        return m13420k4(str, C18358t1.g.f56183c);
    }

    /* JADX INFO: renamed from: x1 */
    public static void m13424x1(String str) {
        if (str == null || C14113y2.m67440x1(str).equals(C14113y2.f47374k4)) {
            throw new ArgumentNullException("path");
        }
        File file = new File(str);
        if (!file.exists()) {
            throw new DirectoryNotFoundException("Directory was not found");
        }
        if (!file.isDirectory()) {
            throw new IOException("Target path is not directory");
        }
        if (!file.delete()) {
            throw new IOException("Directory was not deleted");
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static String m13417k4() {
        return new File(new File(".").getAbsolutePath()).getParent();
    }

    /* JADX INFO: renamed from: x1 */
    public static String[] m13425x1(String str, String str2) {
        if (str == null) {
            throw new ArgumentNullException("path");
        }
        File file = new File(str);
        k4 k4Var = new k4(str2, true);
        String[] strArr = new String[0];
        String[] list = file.list(k4Var);
        if (list != null) {
            int length = list.length;
            strArr = new String[length];
            for (int i = 0; i < length; i++) {
                strArr[i] = C3141rv.m13412x1(str, list[i]);
            }
        }
        return strArr;
    }

    /* JADX INFO: renamed from: k4 */
    public static void m13418k4(File file) {
        if (file.isDirectory()) {
            for (File file2 : file.listFiles()) {
                if (file2.isDirectory()) {
                    m13418k4(file2);
                } else {
                    file2.delete();
                }
            }
        }
        file.delete();
    }

    /* JADX INFO: renamed from: k4 */
    public static void m13419k4(String str, boolean z) {
        File file = new File(str);
        if (z) {
            m13418k4(file);
        } else {
            m13424x1(str);
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static String[] m13420k4(String str, String str2) {
        if (str == null) {
            throw new ArgumentNullException("path");
        }
        File file = new File(str);
        k4 k4Var = new k4(str2, false);
        String[] strArr = new String[0];
        String[] list = file.list(k4Var);
        if (list == null) {
            return strArr;
        }
        int length = list.length;
        String[] strArr2 = new String[length];
        for (int i = 0; i < length; i++) {
            strArr2[i] = C3141rv.m13412x1(str, list[i]);
        }
        return strArr2;
    }
}
