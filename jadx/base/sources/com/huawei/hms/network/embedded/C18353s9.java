package com.huawei.hms.network.embedded;

import com.aspose.slides.C22218Oooo;
import com.google.common.net.HttpHeaders;
import com.huawei.hms.network.embedded.C18358t1;
import com.huawei.hms.network.embedded.C18377u7;
import java.io.EOFException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

/* JADX INFO: renamed from: com.huawei.hms.network.embedded.s9 */
/* JADX INFO: loaded from: classes9.dex */
public final class C18353s9 {

    /* JADX INFO: renamed from: a */
    public static final C18303ob f56137a = C18303ob.m79299d("\"\\");

    /* JADX INFO: renamed from: b */
    public static final C18303ob f56138b = C18303ob.m79299d("\t ,=");

    /* JADX INFO: renamed from: a */
    public static int m79513a(C18261lb c18261lb, byte b) {
        int i = 0;
        while (!c18261lb.mo78389f() && c18261lb.m79093j(0L) == b) {
            i++;
            c18261lb.readByte();
        }
        return i;
    }

    /* JADX INFO: renamed from: b */
    public static int m79526b(String str, int i) {
        char cCharAt;
        while (i < str.length() && ((cCharAt = str.charAt(i)) == ' ' || cCharAt == '\t')) {
            i++;
        }
        return i;
    }

    /* JADX INFO: renamed from: c */
    public static Set<String> m79530c(C18377u7 c18377u7) {
        Set<String> treeSet = Collections.EMPTY_SET;
        int iM79619d = c18377u7.m79619d();
        for (int i = 0; i < iM79619d; i++) {
            if (HttpHeaders.VARY.equalsIgnoreCase(c18377u7.m79612a(i))) {
                String strM79614b = c18377u7.m79614b(i);
                if (treeSet.isEmpty()) {
                    treeSet = new TreeSet<>((Comparator<? super String>) String.CASE_INSENSITIVE_ORDER);
                }
                for (String str : strM79614b.split(",")) {
                    treeSet.add(str.trim());
                }
            }
        }
        return treeSet;
    }

    /* JADX INFO: renamed from: d */
    public static Set<String> m79533d(C18188g8 c18188g8) {
        return m79530c(c18188g8.m78591y());
    }

    /* JADX INFO: renamed from: e */
    public static C18377u7 m79534e(C18188g8 c18188g8) {
        return m79519a(c18188g8.m78573C().m78578H().m78304e(), c18188g8.m78591y());
    }

    /* JADX INFO: renamed from: a */
    public static int m79514a(String str, int i) {
        try {
            long j = Long.parseLong(str);
            if (j > 2147483647L) {
                return Integer.MAX_VALUE;
            }
            if (j < 0) {
                return 0;
            }
            return (int) j;
        } catch (NumberFormatException unused) {
            return i;
        }
    }

    /* JADX INFO: renamed from: b */
    public static String m79527b(C18261lb c18261lb) {
        try {
            long jMo78384c = c18261lb.mo78384c(f56138b);
            if (jMo78384c == -1) {
                jMo78384c = c18261lb.m79076B();
            }
            if (jMo78384c != 0) {
                return c18261lb.mo78388e(jMo78384c);
            }
            return null;
        } catch (EOFException unused) {
            throw new AssertionError();
        }
    }

    /* JADX INFO: renamed from: c */
    public static boolean m79531c(C18188g8 c18188g8) {
        return m79529b(c18188g8.m78591y());
    }

    /* JADX INFO: renamed from: a */
    public static int m79515a(String str, int i, String str2) {
        while (i < str.length() && str2.indexOf(str.charAt(i)) == -1) {
            i++;
        }
        return i;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m79528b(C18188g8 c18188g8) {
        if (c18188g8.m78578H().m78307h().equals("HEAD")) {
            return false;
        }
        int iM78589w = c18188g8.m78589w();
        return (((iM78589w >= 100 && iM78589w < 200) || iM78589w == 204 || iM78589w == 304) && m79516a(c18188g8) == -1 && !"chunked".equalsIgnoreCase(c18188g8.m78582b(HttpHeaders.TRANSFER_ENCODING))) ? false : true;
    }

    /* JADX INFO: renamed from: c */
    public static boolean m79532c(C18261lb c18261lb) {
        boolean z = false;
        while (!c18261lb.mo78389f()) {
            byte bM79093j = c18261lb.m79093j(0L);
            if (bM79093j != 44) {
                if (bM79093j != 32 && bM79093j != 9) {
                    break;
                }
                c18261lb.readByte();
            } else {
                c18261lb.readByte();
                z = true;
            }
        }
        return z;
    }

    /* JADX INFO: renamed from: a */
    public static long m79516a(C18188g8 c18188g8) {
        return m79517a(c18188g8.m78591y());
    }

    /* JADX INFO: renamed from: b */
    public static boolean m79529b(C18377u7 c18377u7) {
        return m79530c(c18377u7).contains(C18358t1.g.f56183c);
    }

    /* JADX INFO: renamed from: a */
    public static long m79517a(C18377u7 c18377u7) {
        return m79518a(c18377u7.m79613a("Content-Length"));
    }

    /* JADX INFO: renamed from: a */
    public static long m79518a(String str) {
        if (str == null) {
            return -1L;
        }
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            return -1L;
        }
    }

    /* JADX INFO: renamed from: a */
    public static C18377u7 m79519a(C18377u7 c18377u7, C18377u7 c18377u72) {
        Set<String> setM79530c = m79530c(c18377u72);
        if (setM79530c.isEmpty()) {
            return C18313p8.f55894c;
        }
        C18377u7.a aVar = new C18377u7.a();
        int iM79619d = c18377u7.m79619d();
        for (int i = 0; i < iM79619d; i++) {
            String strM79612a = c18377u7.m79612a(i);
            if (setM79530c.contains(strM79612a)) {
                aVar.m79624a(strM79612a, c18377u7.m79614b(i));
            }
        }
        return aVar.m79627a();
    }

    /* JADX INFO: renamed from: a */
    public static String m79520a(char c, int i) {
        char[] cArr = new char[i];
        Arrays.fill(cArr, c);
        return new String(cArr);
    }

    /* JADX INFO: renamed from: a */
    public static String m79521a(C18261lb c18261lb) {
        if (c18261lb.readByte() != 34) {
            throw new IllegalArgumentException();
        }
        C18261lb c18261lb2 = new C18261lb();
        while (true) {
            long jMo78384c = c18261lb.mo78384c(f56137a);
            if (jMo78384c == -1) {
                return null;
            }
            if (c18261lb.m79093j(jMo78384c) == 34) {
                c18261lb2.mo78029b(c18261lb, jMo78384c);
                c18261lb.readByte();
                return c18261lb2.mo78398o();
            }
            if (c18261lb.m79076B() == jMo78384c + 1) {
                return null;
            }
            c18261lb2.mo78029b(c18261lb, jMo78384c);
            c18261lb.readByte();
            c18261lb2.mo78029b(c18261lb, 1L);
        }
    }

    /* JADX INFO: renamed from: a */
    public static List<C18201h7> m79522a(C18377u7 c18377u7, String str) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < c18377u7.m79619d(); i++) {
            if (str.equalsIgnoreCase(c18377u7.m79612a(i))) {
                m79524a(arrayList, new C18261lb().mo78261a(c18377u7.m79614b(i)));
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: a */
    public static void m79523a(InterfaceC18285n7 interfaceC18285n7, C18416x7 c18416x7, C18377u7 c18377u7) {
        if (interfaceC18285n7 == InterfaceC18285n7.f55776a) {
            return;
        }
        List<C18271m7> listM79130a = C18271m7.m79130a(c18416x7, c18377u7);
        if (listM79130a.isEmpty()) {
            return;
        }
        interfaceC18285n7.mo79259a(c18416x7, listM79130a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:61:0x007a, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x007a, code lost:
    
        continue;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0085  */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m79524a(List<C18201h7> list, C18261lb c18261lb) {
        String strM79527b;
        int iM79513a;
        LinkedHashMap linkedHashMap;
        while (true) {
            String strM79527b2 = null;
            while (true) {
                if (strM79527b2 == null) {
                    m79532c(c18261lb);
                    strM79527b2 = m79527b(c18261lb);
                    if (strM79527b2 == null) {
                        return;
                    }
                }
                boolean zM79532c = m79532c(c18261lb);
                strM79527b = m79527b(c18261lb);
                if (strM79527b == null) {
                    if (c18261lb.mo78389f()) {
                        list.add(new C18201h7(strM79527b2, (Map<String, String>) Collections.EMPTY_MAP));
                        return;
                    }
                    return;
                }
                iM79513a = m79513a(c18261lb, (byte) 61);
                boolean zM79532c2 = m79532c(c18261lb);
                if (zM79532c || (!zM79532c2 && !c18261lb.mo78389f())) {
                    linkedHashMap = new LinkedHashMap();
                    int iM79513a2 = m79513a(c18261lb, (byte) 61) + iM79513a;
                    while (true) {
                        if (strM79527b == null) {
                            strM79527b = m79527b(c18261lb);
                            if (m79532c(c18261lb)) {
                                break;
                            }
                            iM79513a2 = m79513a(c18261lb, (byte) 61);
                            if (iM79513a2 != 0) {
                                break;
                            }
                            if (iM79513a2 > 1 || m79532c(c18261lb)) {
                                return;
                            }
                            String strM79527b3 = (c18261lb.mo78389f() || c18261lb.m79093j(0L) != 34) ? m79527b(c18261lb) : m79521a(c18261lb);
                            if (strM79527b3 == null || ((String) linkedHashMap.put(strM79527b, strM79527b3)) != null) {
                                return;
                            }
                            if (!m79532c(c18261lb) && !c18261lb.mo78389f()) {
                                return;
                            } else {
                                strM79527b = null;
                            }
                        } else if (iM79513a2 != 0) {
                        }
                    }
                }
                list.add(new C18201h7(strM79527b2, linkedHashMap));
                strM79527b2 = strM79527b;
            }
            StringBuilder sbOooO0OO = C22218Oooo.OooO0OO(strM79527b);
            sbOooO0OO.append(m79520a('=', iM79513a));
            list.add(new C18201h7(strM79527b2, (Map<String, String>) Collections.singletonMap(null, sbOooO0OO.toString())));
        }
    }

    /* JADX INFO: renamed from: a */
    public static boolean m79525a(C18188g8 c18188g8, C18377u7 c18377u7, C18160e8 c18160e8) {
        for (String str : m79533d(c18188g8)) {
            if (!Objects.equals(c18377u7.m79620d(str), c18160e8.m78301b(str))) {
                return false;
            }
        }
        return true;
    }
}
