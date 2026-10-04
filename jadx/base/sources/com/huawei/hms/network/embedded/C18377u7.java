package com.huawei.hms.network.embedded;

import OooOoo.C20593OooO0Oo;
import com.orion.notein.richeditor.utils.p606io.IOUtils;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

/* JADX INFO: renamed from: com.huawei.hms.network.embedded.u7 */
/* JADX INFO: loaded from: classes9.dex */
public final class C18377u7 {

    /* JADX INFO: renamed from: a */
    public final String[] f56290a;

    /* JADX INFO: renamed from: com.huawei.hms.network.embedded.u7$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public final List<String> f56291a = new ArrayList(20);

        /* JADX INFO: renamed from: a */
        public a m79622a(C18377u7 c18377u7) {
            int iM79619d = c18377u7.m79619d();
            for (int i = 0; i < iM79619d; i++) {
                m79629b(c18377u7.m79612a(i), c18377u7.m79614b(i));
            }
            return this;
        }

        /* JADX INFO: renamed from: b */
        public a m79628b(String str) {
            int iIndexOf = str.indexOf(C18241k5.f55433h, 1);
            return iIndexOf != -1 ? m79629b(str.substring(0, iIndexOf), str.substring(iIndexOf + 1)) : str.startsWith(C18241k5.f55433h) ? m79629b("", str.substring(1)) : m79629b("", str);
        }

        /* JADX INFO: renamed from: c */
        public a m79632c(String str, String str2) {
            C18377u7.m79610e(str);
            return m79629b(str, str2);
        }

        /* JADX INFO: renamed from: d */
        public a m79634d(String str) {
            int i = 0;
            while (i < this.f56291a.size()) {
                if (str.equalsIgnoreCase(this.f56291a.get(i))) {
                    this.f56291a.remove(i);
                    this.f56291a.remove(i);
                    i -= 2;
                }
                i += 2;
            }
            return this;
        }

        /* JADX INFO: renamed from: a */
        public a m79623a(String str) {
            int iIndexOf = str.indexOf(C18241k5.f55433h);
            if (iIndexOf != -1) {
                return m79624a(str.substring(0, iIndexOf).trim(), str.substring(iIndexOf + 1));
            }
            throw new IllegalArgumentException("Unexpected header: ".concat(str));
        }

        /* JADX INFO: renamed from: b */
        public a m79629b(String str, String str2) {
            this.f56291a.add(str);
            this.f56291a.add(str2.trim());
            return this;
        }

        /* JADX INFO: renamed from: c */
        public String m79633c(String str) {
            for (int size = this.f56291a.size() - 2; size >= 0; size -= 2) {
                if (str.equalsIgnoreCase(this.f56291a.get(size))) {
                    return this.f56291a.get(size + 1);
                }
            }
            return null;
        }

        /* JADX INFO: renamed from: d */
        public a m79635d(String str, String str2) {
            C18377u7.m79610e(str);
            C18377u7.m79609a(str2, str);
            m79634d(str);
            m79629b(str, str2);
            return this;
        }

        /* JADX INFO: renamed from: a */
        public a m79624a(String str, String str2) {
            C18377u7.m79610e(str);
            C18377u7.m79609a(str2, str);
            return m79629b(str, str2);
        }

        /* JADX INFO: renamed from: b */
        public a m79630b(String str, Instant instant) {
            if (instant != null) {
                return m79631b(str, new Date(instant.toEpochMilli()));
            }
            throw new NullPointerException(C20593OooO0Oo.OooO0O0("value for name ", str, " == null"));
        }

        /* JADX INFO: renamed from: a */
        public a m79625a(String str, Instant instant) {
            if (instant != null) {
                return m79626a(str, new Date(instant.toEpochMilli()));
            }
            throw new NullPointerException(C20593OooO0Oo.OooO0O0("value for name ", str, " == null"));
        }

        /* JADX INFO: renamed from: b */
        public a m79631b(String str, Date date) {
            if (date == null) {
                throw new NullPointerException(C20593OooO0Oo.OooO0O0("value for name ", str, " == null"));
            }
            m79635d(str, C18340r9.m79458a(date));
            return this;
        }

        /* JADX INFO: renamed from: a */
        public a m79626a(String str, Date date) {
            if (date == null) {
                throw new NullPointerException(C20593OooO0Oo.OooO0O0("value for name ", str, " == null"));
            }
            m79624a(str, C18340r9.m79458a(date));
            return this;
        }

        /* JADX INFO: renamed from: a */
        public C18377u7 m79627a() {
            return new C18377u7(this);
        }
    }

    public C18377u7(a aVar) {
        List<String> list = aVar.f56291a;
        this.f56290a = (String[]) list.toArray(new String[list.size()]);
    }

    /* JADX INFO: renamed from: a */
    public long m79611a() {
        String[] strArr = this.f56290a;
        long length = strArr.length * 2;
        int length2 = strArr.length;
        for (int i = 0; i < length2; i++) {
            length += (long) this.f56290a[i].length();
        }
        return length;
    }

    /* JADX INFO: renamed from: b */
    public String m79614b(int i) {
        return this.f56290a[(i * 2) + 1];
    }

    /* JADX INFO: renamed from: c */
    public a m79617c() {
        a aVar = new a();
        Collections.addAll(aVar.f56291a, this.f56290a);
        return aVar;
    }

    /* JADX INFO: renamed from: d */
    public int m79619d() {
        return this.f56290a.length / 2;
    }

    /* JADX INFO: renamed from: e */
    public Map<String, List<String>> m79621e() {
        TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
        int iM79619d = m79619d();
        for (int i = 0; i < iM79619d; i++) {
            String lowerCase = m79612a(i).toLowerCase(Locale.US);
            List arrayList = (List) treeMap.get(lowerCase);
            if (arrayList == null) {
                arrayList = new ArrayList(2);
                treeMap.put(lowerCase, arrayList);
            }
            arrayList.add(m79614b(i));
        }
        return treeMap;
    }

    public boolean equals(Object obj) {
        return (obj instanceof C18377u7) && Arrays.equals(((C18377u7) obj).f56290a, this.f56290a);
    }

    public int hashCode() {
        return Arrays.hashCode(this.f56290a);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        int iM79619d = m79619d();
        for (int i = 0; i < iM79619d; i++) {
            sb.append(m79612a(i));
            sb.append(": ");
            sb.append(m79614b(i));
            sb.append(IOUtils.LINE_SEPARATOR_UNIX);
        }
        return sb.toString();
    }

    public C18377u7(String[] strArr) {
        this.f56290a = strArr;
    }

    /* JADX INFO: renamed from: a */
    public static C18377u7 m79606a(Map<String, String> map) {
        if (map == null) {
            throw new NullPointerException("headers == null");
        }
        String[] strArr = new String[map.size() * 2];
        int i = 0;
        for (Map.Entry<String, String> entry : map.entrySet()) {
            if (entry.getKey() == null || entry.getValue() == null) {
                throw new IllegalArgumentException("Headers cannot be null");
            }
            String strTrim = entry.getKey().trim();
            String strTrim2 = entry.getValue().trim();
            m79610e(strTrim);
            m79609a(strTrim2, strTrim);
            strArr[i] = strTrim;
            strArr[i + 1] = strTrim2;
            i += 2;
        }
        return new C18377u7(strArr);
    }

    /* JADX INFO: renamed from: e */
    public static void m79610e(String str) {
        if (str == null) {
            throw new NullPointerException("name == null");
        }
        if (str.isEmpty()) {
            throw new IllegalArgumentException("name is empty");
        }
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if (cCharAt <= ' ' || cCharAt >= 127) {
                throw new IllegalArgumentException(C18313p8.m79366a("Unexpected char %#04x at %d in header name: %s", Integer.valueOf(cCharAt), Integer.valueOf(i), str));
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public Date m79615b(String str) {
        String strM79613a = m79613a(str);
        if (strM79613a != null) {
            return C18340r9.m79459a(strM79613a);
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public Instant m79618c(String str) {
        Date dateM79615b = m79615b(str);
        if (dateM79615b != null) {
            return dateM79615b.toInstant();
        }
        return null;
    }

    /* JADX INFO: renamed from: d */
    public List<String> m79620d(String str) {
        int iM79619d = m79619d();
        ArrayList arrayList = null;
        for (int i = 0; i < iM79619d; i++) {
            if (str.equalsIgnoreCase(m79612a(i))) {
                if (arrayList == null) {
                    arrayList = new ArrayList(2);
                }
                arrayList.add(m79614b(i));
            }
        }
        return arrayList != null ? Collections.unmodifiableList(arrayList) : Collections.EMPTY_LIST;
    }

    /* JADX INFO: renamed from: a */
    public static C18377u7 m79607a(String... strArr) {
        if (strArr == null) {
            throw new NullPointerException("namesAndValues == null");
        }
        if (strArr.length % 2 != 0) {
            throw new IllegalArgumentException("Expected alternating header names and values");
        }
        String[] strArr2 = (String[]) strArr.clone();
        for (int i = 0; i < strArr2.length; i++) {
            String str = strArr2[i];
            if (str == null) {
                throw new IllegalArgumentException("Headers cannot be null");
            }
            strArr2[i] = str.trim();
        }
        for (int i2 = 0; i2 < strArr2.length; i2 += 2) {
            String str2 = strArr2[i2];
            String str3 = strArr2[i2 + 1];
            m79610e(str2);
            m79609a(str3, str2);
        }
        return new C18377u7(strArr2);
    }

    /* JADX INFO: renamed from: b */
    public Set<String> m79616b() {
        TreeSet treeSet = new TreeSet(String.CASE_INSENSITIVE_ORDER);
        int iM79619d = m79619d();
        for (int i = 0; i < iM79619d; i++) {
            treeSet.add(m79612a(i));
        }
        return Collections.unmodifiableSet(treeSet);
    }

    /* JADX INFO: renamed from: a */
    public String m79612a(int i) {
        return this.f56290a[i * 2];
    }

    /* JADX INFO: renamed from: a */
    public String m79613a(String str) {
        return m79608a(this.f56290a, str);
    }

    /* JADX INFO: renamed from: a */
    public static String m79608a(String[] strArr, String str) {
        for (int length = strArr.length - 2; length >= 0; length -= 2) {
            if (str.equalsIgnoreCase(strArr[length])) {
                return strArr[length + 1];
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    public static void m79609a(String str, String str2) {
        if (str == null) {
            throw new NullPointerException(C20593OooO0Oo.OooO0O0("value for name ", str2, " == null"));
        }
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if ((cCharAt <= 31 && cCharAt != '\t') || cCharAt >= 127) {
                throw new IllegalArgumentException(C18313p8.m79366a("Unexpected char %#04x at %d in %s value: %s", Integer.valueOf(cCharAt), Integer.valueOf(i), str2, str));
            }
        }
    }
}
