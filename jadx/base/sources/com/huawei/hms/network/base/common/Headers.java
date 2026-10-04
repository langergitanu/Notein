package com.huawei.hms.network.base.common;

import OooOoo.C20593OooO0Oo;
import com.aspose.slides.internal.p332p7.C22237OooO0o0;
import com.huawei.hms.framework.common.StringUtils;
import com.huawei.hms.network.embedded.C18241k5;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

/* JADX INFO: loaded from: classes9.dex */
public final class Headers {

    /* JADX INFO: renamed from: a */
    private final String[] f54022a;

    public static final class Builder {

        /* JADX INFO: renamed from: a */
        final List<String> f54023a = new ArrayList(20);

        /* JADX INFO: renamed from: a */
        private void m77739a(String str, String str2) {
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
                    throw new IllegalArgumentException(StringUtils.format("Unexpected char %#04x at %d in header name: %s", Integer.valueOf(cCharAt), Integer.valueOf(i), str));
                }
            }
            if (str2 == null) {
                throw new NullPointerException(C20593OooO0Oo.OooO0O0("value for name ", str, " == null"));
            }
            int length2 = str2.length();
            for (int i2 = 0; i2 < length2; i2++) {
                char cCharAt2 = str2.charAt(i2);
                if ((cCharAt2 <= 31 && cCharAt2 != '\t') || cCharAt2 >= 127) {
                    throw new IllegalArgumentException(StringUtils.format("Unexpected char %#04x at %d in %s value: %s", Integer.valueOf(cCharAt2), Integer.valueOf(i2), str, str2));
                }
            }
        }

        public Builder add(String str) {
            int iIndexOf = str.indexOf(C18241k5.f55433h);
            if (iIndexOf != -1) {
                return add(str.substring(0, iIndexOf).trim(), str.substring(iIndexOf + 1));
            }
            throw new IllegalArgumentException("Unexpected header: ".concat(str));
        }

        public Builder addLenient(String str) {
            int iIndexOf = str.indexOf(C18241k5.f55433h, 1);
            return iIndexOf != -1 ? addLenient(str.substring(0, iIndexOf), str.substring(iIndexOf + 1)) : str.startsWith(C18241k5.f55433h) ? addLenient("", str.substring(1)) : addLenient("", str);
        }

        public Headers build() {
            return new Headers(this);
        }

        public String get(String str) {
            for (int size = this.f54023a.size() - 2; size >= 0; size -= 2) {
                if (str.equalsIgnoreCase(this.f54023a.get(size))) {
                    return this.f54023a.get(size + 1);
                }
            }
            return null;
        }

        public Builder removeAll(String str) {
            int i = 0;
            while (i < this.f54023a.size()) {
                if (str.equalsIgnoreCase(this.f54023a.get(i))) {
                    this.f54023a.remove(i);
                    this.f54023a.remove(i);
                    i -= 2;
                }
                i += 2;
            }
            return this;
        }

        public Builder set(String str, String str2) {
            m77739a(str, str2);
            removeAll(str);
            addLenient(str, str2);
            return this;
        }

        public Builder add(String str, String str2) {
            m77739a(str, str2);
            return addLenient(str, str2);
        }

        public Builder addLenient(String str, String str2) {
            this.f54023a.add(str);
            this.f54023a.add(str2.trim());
            return this;
        }
    }

    private Headers(Builder builder) {
        List<String> list = builder.f54023a;
        this.f54022a = (String[]) list.toArray(new String[list.size()]);
    }

    /* JADX INFO: renamed from: a */
    private static String m77736a(String[] strArr, String str) {
        for (int length = strArr.length - 2; length >= 0; length -= 2) {
            if (str.equalsIgnoreCase(strArr[length])) {
                return strArr[length + 1];
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: of */
    public static Headers m77737of(Map<String, List<String>> map) {
        if (map == null) {
            throw new NullPointerException("headers == null");
        }
        ArrayList arrayList = new ArrayList(map.size() * 2);
        for (Map.Entry<String, List<String>> entry : map.entrySet()) {
            if (entry.getKey() == null || entry.getValue() == null) {
                throw new IllegalArgumentException("Headers cannot be null");
            }
            String strTrim = entry.getKey().trim();
            Iterator<String> it = entry.getValue().iterator();
            while (it.hasNext()) {
                String strTrim2 = it.next().trim();
                if (strTrim.length() == 0 || strTrim.indexOf(0) != -1 || strTrim2.indexOf(0) != -1) {
                    throw new IllegalArgumentException(C22237OooO0o0.OooO00o("Unexpected header: ", strTrim, ": ", strTrim2));
                }
                arrayList.add(strTrim);
                arrayList.add(strTrim2);
            }
        }
        return new Headers((String[]) arrayList.toArray(new String[arrayList.size()]));
    }

    public long byteCount() {
        String[] strArr = this.f54022a;
        long length = strArr.length * 2;
        int length2 = strArr.length;
        for (int i = 0; i < length2; i++) {
            length += (long) this.f54022a[i].length();
        }
        return length;
    }

    public boolean equals(Object obj) {
        return (obj instanceof Headers) && Arrays.equals(((Headers) obj).f54022a, this.f54022a);
    }

    public String get(String str) {
        return m77736a(this.f54022a, str);
    }

    public int hashCode() {
        return Arrays.hashCode(this.f54022a);
    }

    public String name(int i) {
        return this.f54022a[i * 2];
    }

    public Set<String> names() {
        TreeSet treeSet = new TreeSet(String.CASE_INSENSITIVE_ORDER);
        int size = size();
        for (int i = 0; i < size; i++) {
            treeSet.add(name(i));
        }
        return Collections.unmodifiableSet(treeSet);
    }

    public Builder newBuilder() {
        Builder builder = new Builder();
        Collections.addAll(builder.f54023a, this.f54022a);
        return builder;
    }

    public int size() {
        return this.f54022a.length / 2;
    }

    public Map<String, List<String>> toMultimap() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int size = size();
        for (int i = 0; i < size; i++) {
            String strName = name(i);
            List arrayList = (List) linkedHashMap.get(strName);
            if (arrayList == null) {
                arrayList = new ArrayList(2);
                linkedHashMap.put(strName, arrayList);
            }
            arrayList.add(value(i));
        }
        return linkedHashMap;
    }

    public String toString() {
        return super.toString();
    }

    public String value(int i) {
        return this.f54022a[(i * 2) + 1];
    }

    public List<String> values(String str) {
        int size = size();
        ArrayList arrayList = null;
        for (int i = 0; i < size; i++) {
            if (str.equalsIgnoreCase(name(i))) {
                if (arrayList == null) {
                    arrayList = new ArrayList(2);
                }
                arrayList.add(value(i));
            }
        }
        return arrayList != null ? Collections.unmodifiableList(arrayList) : Collections.EMPTY_LIST;
    }

    private Headers(String[] strArr) {
        this.f54022a = strArr;
    }

    /* JADX INFO: renamed from: of */
    public static Headers m77738of(String... strArr) {
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
            if (str2.length() == 0 || str2.indexOf(0) != -1 || str3.indexOf(0) != -1) {
                throw new IllegalArgumentException(C22237OooO0o0.OooO00o("Unexpected header: ", str2, ": ", str3));
            }
        }
        return new Headers(strArr2);
    }
}
