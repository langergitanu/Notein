package com.aspose.slides.p559ms.System;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Hashtable;
import com.aspose.slides.Collections.IDictionary;
import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.exceptions.FileNotFoundException;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.internal.p080dd.C3131h4;
import com.aspose.slides.internal.p080dd.C3141rv;
import com.aspose.slides.internal.p080dd.C3142to;
import com.aspose.slides.internal.p080dd.C3148wl;
import com.aspose.slides.internal.p234ko.C5892kk;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.microsoft.identity.common.adal.internal.AuthenticationConstants;
import com.orion.notein.richeditor.utils.p606io.FilenameUtils;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.UnknownHostException;

/* JADX INFO: renamed from: com.aspose.slides.ms.System.dq */
/* JADX INFO: loaded from: classes5.dex */
public class C14052dq {

    /* JADX INFO: renamed from: kk */
    private static int f47189kk;

    /* JADX INFO: renamed from: to */
    private static Hashtable f47190to;

    /* JADX INFO: renamed from: du */
    private static Hashtable f47187du = new Hashtable();

    /* JADX INFO: renamed from: k4 */
    public static String f47188k4 = C5892kk.f16659wl;

    /* JADX INFO: renamed from: x1 */
    public static boolean f47191x1 = C5892kk.f16671zj;

    /* JADX INFO: renamed from: c5 */
    private static Hashtable m66559c5() {
        String strSubstring;
        String strSubstring2;
        Hashtable hashtable;
        if (f47190to == null) {
            Runtime runtime = Runtime.getRuntime();
            String lowerCase = System.getProperty("os.name").toLowerCase();
            f47190to = new Hashtable();
            try {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(runtime.exec(lowerCase.contains("windows 9") ? "command.com /c set" : (lowerCase.contains("nt") || lowerCase.contains("windows")) ? "cmd.exe /c set" : "env").getInputStream()));
                while (true) {
                    String line = bufferedReader.readLine();
                    if (line == null) {
                        break;
                    }
                    int iIndexOf = line.indexOf(61);
                    if (iIndexOf != -1) {
                        strSubstring = line.substring(0, iIndexOf);
                        strSubstring2 = line.substring(iIndexOf + 1);
                        hashtable = f47190to;
                    } else {
                        int iIndexOf2 = line.indexOf(58);
                        if (iIndexOf2 != -1) {
                            strSubstring = line.substring(0, iIndexOf2);
                            strSubstring2 = line.substring(iIndexOf2 + 1);
                            hashtable = f47190to;
                        }
                    }
                    hashtable.set_Item(strSubstring.toLowerCase(), strSubstring2);
                }
            } catch (IOException e) {
                throw new com.aspose.slides.exceptions.IOException(e.getMessage(), e);
            }
        }
        return f47190to;
    }

    /* JADX INFO: renamed from: du */
    public static int m66560du() {
        return 0;
    }

    /* JADX INFO: renamed from: dy */
    public static IDictionary m66561dy() {
        return m66559c5();
    }

    /* JADX INFO: renamed from: h4 */
    public static String m66562h4() {
        return m66576x1();
    }

    /* JADX INFO: renamed from: k4 */
    private static C14103w6 m66563k4(int i, int i2, int i3, String str) {
        return m66564k4(i, new C14107wz(i2, i3), str);
    }

    /* JADX INFO: renamed from: kk */
    private static int m66569kk(String str) {
        int[] iArr = {0};
        C14057f9.m66590k4(str, iArr);
        return iArr[0];
    }

    /* JADX INFO: renamed from: m9 */
    public static String m66572m9() {
        return C5892kk.f16599ak;
    }

    /* JADX INFO: renamed from: to */
    public static C14103w6 m66573to() {
        String str = C5892kk.f16600ar;
        String str2 = C5892kk.f16652um;
        String str3 = C5892kk.f16603bv;
        if (C5892kk.f16671zj) {
            return C5892kk.f16667y2 ? m66563k4(1, 4, 0, str3) : C5892kk.f16634m4 ? m66563k4(1, 4, 10, str3) : C5892kk.f16625j5 ? m66563k4(1, 4, 90, str3) : C5892kk.f16633m2 ? m66563k4(3, 3, 0, str3) : C5892kk.f16637nv ? str2.equals(AuthenticationConstants.FOUR_POINT_ZERO) ? m66563k4(2, 4, 0, str3) : m66563k4(2, 3, 51, str3) : C5892kk.f16668y9 ? m66563k4(2, 5, 1, str3) : C5892kk.f16617gf ? m66563k4(2, 6, 0, str3) : C5892kk.f16622ig ? m66563k4(2, 6, 1, str3) : C5892kk.f16619gk ? m66563k4(2, 6, 2, str3) : C5892kk.f16663x5 ? m66563k4(2, 6, 3, str3) : C5892kk.f16598ai ? m66563k4(2, 5, 0, str3) : C5892kk.f16642ri ? m66563k4(2, 5, 2, str3) : C5892kk.f16607ca ? m66563k4(2, 6, 0, str3) : C5892kk.f16602bs ? m66563k4(2, 6, 1, str3) : C5892kk.f16621he ? m66563k4(2, 6, 2, str3) : C5892kk.f16627jw ? m66563k4(2, 10, 0, str3) : m66564k4(2, m66575x1(str2), str3);
        }
        if (C5892kk.f16647t6) {
            return m66564k4(6, m66575x1(str2), str3);
        }
        if (C5892kk.f16658w6) {
            return m66564k4(4, m66575x1(str2), str3);
        }
        if (C5892kk.f16614f9) {
            return m66564k4(7, m66575x1(str2), str3);
        }
        if (C5892kk.f16638os) {
            return m66564k4(8, m66575x1(str2), str3);
        }
        throw new InvalidOperationException(C14113y2.m67402k4("Unrecognized OS: {0}, {1}, {2}", str, str2, str3));
    }

    /* JADX INFO: renamed from: x1 */
    private static C14107wz m66575x1(String str) {
        String str2 = str.trim() + FilenameUtils.EXTENSION_SEPARATOR;
        List list = new List();
        String str3 = C14113y2.f47374k4;
        for (char c : str2.toCharArray()) {
            if (c == ' ') {
                break;
            }
            if ((c == '.' || c == '-') && !C14113y2.m67411k4(str3)) {
                list.add(str3);
                str3 = C14113y2.f47374k4;
            } else if (list.size() != 0 || Character.isDigit(c)) {
                str3 = str3 + c;
            }
        }
        int[] iArr = new int[4];
        iArr[0] = 0;
        iArr[1] = 0;
        iArr[2] = 0;
        iArr[3] = 0;
        int size = list.size();
        if (size > 4) {
            size = 4;
        }
        for (int i = 0; i < size; i++) {
            iArr[i] = m66569kk((String) list.get(i));
        }
        return (size == 1 || size == 2) ? new C14107wz(iArr[0], iArr[1]) : size != 3 ? size != 4 ? new C14107wz(0, 0) : new C14107wz(iArr[0], iArr[1], iArr[2], iArr[3]) : new C14107wz(iArr[0], iArr[1], iArr[2]);
    }

    /* JADX INFO: renamed from: k4 */
    private static C14103w6 m66564k4(int i, C14107wz c14107wz, String str) {
        return new C14103w6(i, c14107wz, str);
    }

    /* JADX INFO: renamed from: kk */
    public static String m66570kk() {
        return f47188k4;
    }

    /* JADX INFO: renamed from: to */
    private static String m66574to(String str) {
        try {
            Process processExec = Runtime.getRuntime().exec(str);
            processExec.waitFor();
            InputStream inputStream = processExec.getInputStream();
            byte[] bArr = new byte[inputStream.available()];
            inputStream.read(bArr);
            inputStream.close();
            String[] strArrSplit = new String(bArr).split("\\s\\s+");
            if (strArrSplit.length == 0) {
                return "";
            }
            String[] strArrSplit2 = strArrSplit[strArrSplit.length - 1].split("\\t");
            return strArrSplit2.length == 0 ? "" : strArrSplit2[strArrSplit2.length - 1];
        } catch (Exception e) {
            return e.getMessage();
        }
    }

    /* JADX INFO: renamed from: x1 */
    public static String m66576x1() {
        try {
            return InetAddress.getLocalHost().getHostName();
        } catch (UnknownHostException e) {
            throw new Exception(e.getMessage(), e);
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static String m66565k4() {
        return C3142to.m13417k4();
    }

    /* JADX INFO: renamed from: kk */
    private static String m66571kk(int i) {
        if (i != 0) {
            if (i == 2) {
                return m66574to("reg query \"HKCU\\Software\\Microsoft\\Windows\\CurrentVersion\\Explorer\\Shell Folders\" /v Programs");
            }
            if (i == 11) {
                return m66574to("reg query \"HKCU\\Software\\Microsoft\\Windows\\CurrentVersion\\Explorer\\Shell Folders\" /v \"Start Menu\"");
            }
            if (i == 13) {
                return m66574to("reg query \"HKCU\\Software\\Microsoft\\Windows\\CurrentVersion\\Explorer\\Shell Folders\" /v \"My Music\"");
            }
            if (i != 16) {
                if (i == 21) {
                    return m66574to("reg query \"HKCU\\Software\\Microsoft\\Windows\\CurrentVersion\\Explorer\\Shell Folders\" /v Templates");
                }
                if (i != 26) {
                    if (i == 28) {
                        return m66574to("reg query \"HKCU\\Software\\Microsoft\\Windows\\CurrentVersion\\Explorer\\Shell Folders\" /v \"Local AppData\"");
                    }
                    if (i == 43) {
                        return m66567k4("CommonProgramFiles");
                    }
                    switch (i) {
                        case 5:
                            return m66574to("reg query \"HKCU\\Software\\Microsoft\\Windows\\CurrentVersion\\Explorer\\Shell Folders\" /v Personal");
                        case 6:
                            return m66574to("reg query \"HKCU\\Software\\Microsoft\\Windows\\CurrentVersion\\Explorer\\Shell Folders\" /v Favorites");
                        case 7:
                            return m66574to("reg query \"HKCU\\Software\\Microsoft\\Windows\\CurrentVersion\\Explorer\\Shell Folders\" /v Startup");
                        case 8:
                            return m66574to("reg query \"HKCU\\Software\\Microsoft\\Windows\\CurrentVersion\\Explorer\\Shell Folders\" /v Recent");
                        case 9:
                            return m66574to("reg query \"HKCU\\Software\\Microsoft\\Windows\\CurrentVersion\\Explorer\\Shell Folders\" /v SendTo");
                        default:
                            switch (i) {
                                case 32:
                                    return m66574to("reg query \"HKCU\\Software\\Microsoft\\Windows\\CurrentVersion\\Explorer\\Shell Folders\" /v Cache");
                                case 33:
                                    return m66574to("reg query \"HKCU\\Software\\Microsoft\\Windows\\CurrentVersion\\Explorer\\Shell Folders\" /v Cookies");
                                case 34:
                                    return m66574to("reg query \"HKCU\\Software\\Microsoft\\Windows\\CurrentVersion\\Explorer\\Shell Folders\" /v History");
                                case 35:
                                    break;
                                default:
                                    switch (i) {
                                        case 37:
                                            return m66567k4("SystemRoot");
                                        case 38:
                                            return m66567k4("ProgramFiles");
                                        case 39:
                                            return m66574to("reg query \"HKCU\\Software\\Microsoft\\Windows\\CurrentVersion\\Explorer\\Shell Folders\" /v \"My Pictures\"");
                                        default:
                                            return "";
                                    }
                            }
                            break;
                    }
                }
                return m66574to("reg query \"HKCU\\Software\\Microsoft\\Windows\\CurrentVersion\\Explorer\\Shell Folders\" /v AppData");
            }
        }
        return m66574to("reg query \"HKCU\\Software\\Microsoft\\Windows\\CurrentVersion\\Explorer\\Shell Folders\" /v Desktop");
    }

    /* JADX INFO: renamed from: x1 */
    private static String m66577x1(int i) {
        String str = C5892kk.f16601b3;
        String strM13412x1 = C3141rv.m13412x1(C3141rv.m13412x1(str, ".local"), FirebaseAnalytics.Event.SHARE);
        String strM13412x12 = C3141rv.m13412x1(str, ".config");
        boolean z = C5892kk.f16614f9 || C5892kk.f16647t6;
        if (i != 0) {
            if (i != 2 && i != 11) {
                if (i == 13) {
                    return z ? C3141rv.m13412x1(str, "Music") : m66568k4(strM13412x12, str, "XDG_MUSIC_DIR", "Music");
                }
                if (i == 21) {
                    return m66568k4(strM13412x12, str, "XDG_TEMPLATES_DIR", "Templates");
                }
                if (i == 26) {
                    return strM13412x12;
                }
                if (i == 28) {
                    return strM13412x1;
                }
                if (i != 43) {
                    if (i != 16) {
                        if (i != 17) {
                            switch (i) {
                                case 5:
                                    return str;
                                case 6:
                                    return z ? C3141rv.m13412x1(C3141rv.m13412x1(str, "Library"), "Favorites") : C14113y2.f47374k4;
                                case 7:
                                case 8:
                                case 9:
                                    break;
                                default:
                                    switch (i) {
                                        case 32:
                                            return z ? C3141rv.m13412x1(C3141rv.m13412x1(str, "Library"), "Caches") : C14113y2.f47374k4;
                                        case 33:
                                        case 34:
                                            break;
                                        case 35:
                                            return "/usr/share";
                                        default:
                                            switch (i) {
                                                case 37:
                                                    break;
                                                case 38:
                                                    return z ? "/Applications" : C14113y2.f47374k4;
                                                case 39:
                                                    return z ? C3141rv.m13412x1(str, "Pictures") : m66568k4(strM13412x12, str, "XDG_PICTURES_DIR", "Pictures");
                                                default:
                                                    return "";
                                            }
                                            break;
                                    }
                                    break;
                            }
                        }
                    }
                }
            }
            return C14113y2.f47374k4;
        }
        return m66568k4(strM13412x12, str, "XDG_DESKTOP_DIR", "Desktop");
    }

    /* JADX INFO: renamed from: k4 */
    public static String m66566k4(int i) {
        return f47191x1 ? m66571kk(i) : m66577x1(i);
    }

    /* JADX INFO: renamed from: k4 */
    public static String m66567k4(String str) {
        return (String) m66559c5().get_Item(str.toLowerCase());
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0045, code lost:
    
        r5 = com.aspose.slides.p559ms.System.C14113y2.m67423kk(com.aspose.slides.p559ms.System.C14113y2.m67422kk(r5, r3 + 1), '\"');
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x005a, code lost:
    
        if (com.aspose.slides.p559ms.System.C14113y2.m67448x1(r5, "$HOME/") == false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x005c, code lost:
    
        r5 = com.aspose.slides.p559ms.System.C14113y2.m67422kk(r5, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x006a, code lost:
    
        if (com.aspose.slides.p559ms.System.C14113y2.m67448x1(r5, "/") != false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x006d, code lost:
    
        r0 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x006e, code lost:
    
        if (r0 == false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0070, code lost:
    
        r5 = com.aspose.slides.internal.p080dd.C3141rv.m13412x1(r6, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0074, code lost:
    
        r2.dispose();
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0077, code lost:
    
        return r5;
     */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String m66568k4(String str, String str2, String str3, String str4) {
        boolean z = true;
        String strM66567k4 = m66567k4(str3);
        if (strM66567k4 != null && !C14113y2.m67363du(strM66567k4, C14113y2.f47374k4)) {
            return strM66567k4;
        }
        String strM13412x1 = C3141rv.m13412x1(str, "user-dirs.dirs");
        if (!C3131h4.m13361kk(strM13412x1)) {
            return C3141rv.m13412x1(str2, str4);
        }
        try {
            C3148wl c3148wl = new C3148wl(strM13412x1);
            while (true) {
                try {
                    String strMo13429m9 = c3148wl.mo13429m9();
                    if (strMo13429m9 == null) {
                        c3148wl.dispose();
                        break;
                    }
                    String strM67440x1 = C14113y2.m67440x1(strMo13429m9);
                    int iM67429to = C14113y2.m67429to(strM67440x1, '=');
                    if (iM67429to > 8 && C14113y2.m67363du(C14113y2.m67443x1(strM67440x1, 0, iM67429to), str3)) {
                        break;
                    }
                } catch (Throwable th) {
                    c3148wl.dispose();
                    throw th;
                }
            }
        } catch (FileNotFoundException unused) {
        }
        return C3141rv.m13412x1(str2, str4);
    }
}
