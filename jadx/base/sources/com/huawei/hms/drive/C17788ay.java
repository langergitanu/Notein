package com.huawei.hms.drive;

import OooOoo.C20593OooO0Oo;
import com.huawei.hms.network.embedded.C18241k5;
import com.orion.notein.richeditor.utils.p606io.IOUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: renamed from: com.huawei.hms.drive.ay */
/* JADX INFO: loaded from: classes6.dex */
public final class C17788ay {

    /* JADX INFO: renamed from: a */
    private final String[] f52750a;

    public C17788ay(a aVar) {
        List<String> list = aVar.f52751a;
        this.f52750a = (String[]) list.toArray(new String[list.size()]);
    }

    /* JADX INFO: renamed from: a */
    public String m76074a(String str) {
        return m76069a(this.f52750a, str);
    }

    /* JADX INFO: renamed from: b */
    public String m76076b(int i) {
        return this.f52750a[(i * 2) + 1];
    }

    /* JADX INFO: renamed from: c */
    public Map<String, List<String>> m76078c() {
        TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
        int iM76072a = m76072a();
        for (int i = 0; i < iM76072a; i++) {
            String lowerCase = m76073a(i).toLowerCase(Locale.US);
            List arrayList = (List) treeMap.get(lowerCase);
            if (arrayList == null) {
                arrayList = new ArrayList(2);
                treeMap.put(lowerCase, arrayList);
            }
            arrayList.add(m76076b(i));
        }
        return treeMap;
    }

    public boolean equals(Object obj) {
        return (obj instanceof C17788ay) && Arrays.equals(((C17788ay) obj).f52750a, this.f52750a);
    }

    public int hashCode() {
        return Arrays.hashCode(this.f52750a);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        int iM76072a = m76072a();
        for (int i = 0; i < iM76072a; i++) {
            sb.append(m76073a(i));
            sb.append(": ");
            sb.append(m76076b(i));
            sb.append(IOUtils.LINE_SEPARATOR_UNIX);
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: com.huawei.hms.drive.ay$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        final List<String> f52751a = new ArrayList(20);

        /* JADX INFO: renamed from: a */
        public a m76079a(String str) {
            int iIndexOf = str.indexOf(C18241k5.f55433h, 1);
            return iIndexOf != -1 ? m76083b(str.substring(0, iIndexOf), str.substring(iIndexOf + 1)) : str.startsWith(C18241k5.f55433h) ? m76083b("", str.substring(1)) : m76083b("", str);
        }

        /* JADX INFO: renamed from: b */
        public a m76083b(String str, String str2) {
            this.f52751a.add(str);
            this.f52751a.add(str2.trim());
            return this;
        }

        /* JADX INFO: renamed from: c */
        public a m76084c(String str, String str2) {
            C17788ay.m76071c(str);
            C17788ay.m76070a(str2, str);
            m76082b(str);
            m76083b(str, str2);
            return this;
        }

        /* JADX INFO: renamed from: b */
        public a m76082b(String str) {
            int i = 0;
            while (i < this.f52751a.size()) {
                if (str.equalsIgnoreCase(this.f52751a.get(i))) {
                    this.f52751a.remove(i);
                    this.f52751a.remove(i);
                    i -= 2;
                }
                i += 2;
            }
            return this;
        }

        /* JADX INFO: renamed from: a */
        public a m76080a(String str, String str2) {
            C17788ay.m76071c(str);
            C17788ay.m76070a(str2, str);
            return m76083b(str, str2);
        }

        /* JADX INFO: renamed from: a */
        public C17788ay m76081a() {
            return new C17788ay(this);
        }
    }

    /* JADX INFO: renamed from: a */
    public int m76072a() {
        return this.f52750a.length / 2;
    }

    /* JADX INFO: renamed from: b */
    public List<String> m76077b(String str) {
        int iM76072a = m76072a();
        ArrayList arrayList = null;
        for (int i = 0; i < iM76072a; i++) {
            if (str.equalsIgnoreCase(m76073a(i))) {
                if (arrayList == null) {
                    arrayList = new ArrayList(2);
                }
                arrayList.add(m76076b(i));
            }
        }
        return arrayList != null ? Collections.unmodifiableList(arrayList) : Collections.EMPTY_LIST;
    }

    /* JADX INFO: renamed from: a */
    public String m76073a(int i) {
        return this.f52750a[i * 2];
    }

    /* JADX INFO: renamed from: a */
    private static String m76069a(String[] strArr, String str) {
        for (int length = strArr.length - 2; length >= 0; length -= 2) {
            if (str.equalsIgnoreCase(strArr[length])) {
                return strArr[length + 1];
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    public static void m76070a(String str, String str2) {
        if (str != null) {
            int length = str.length();
            for (int i = 0; i < length; i++) {
                char cCharAt = str.charAt(i);
                if ((cCharAt <= 31 && cCharAt != '\t') || cCharAt >= 127) {
                    throw new IllegalArgumentException(C17806bp.m76330a("Unexpected char %#04x at %d in %s value: %s", Integer.valueOf(cCharAt), Integer.valueOf(i), str2, str));
                }
            }
            return;
        }
        throw new NullPointerException(C20593OooO0Oo.OooO0O0("value for name ", str2, " == null"));
    }

    /* JADX INFO: renamed from: c */
    public static void m76071c(String str) {
        if (str != null) {
            if (!str.isEmpty()) {
                int length = str.length();
                for (int i = 0; i < length; i++) {
                    char cCharAt = str.charAt(i);
                    if (cCharAt <= ' ' || cCharAt >= 127) {
                        throw new IllegalArgumentException(C17806bp.m76330a("Unexpected char %#04x at %d in header name: %s", Integer.valueOf(cCharAt), Integer.valueOf(i), str));
                    }
                }
                return;
            }
            throw new IllegalArgumentException("name is empty");
        }
        throw new NullPointerException("name == null");
    }

    /* JADX INFO: renamed from: b */
    public a m76075b() {
        a aVar = new a();
        Collections.addAll(aVar.f52751a, this.f52750a);
        return aVar;
    }
}
