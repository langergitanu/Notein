package com.aspose.slides.internal.p463vm;

import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.p559ms.System.C14113y2;
import com.huawei.hms.network.embedded.C18293o1;
import java.text.CollationKey;
import java.text.Collator;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.aspose.slides.internal.vm.k4 */
/* JADX INFO: loaded from: classes4.dex */
public class C11690k4 {

    /* JADX INFO: renamed from: h4 */
    private static final boolean f39551h4;

    /* JADX INFO: renamed from: to */
    private static final Map<Integer, Map<k4<Integer, Integer>, Collator>> f39552to = new HashMap();

    /* JADX INFO: renamed from: du */
    private final Map<Long, Collator> f39553du = new HashMap();

    /* JADX INFO: renamed from: k4 */
    private C11697x1 f39554k4;

    /* JADX INFO: renamed from: kk */
    private Map<k4<Integer, Integer>, Collator> f39555kk;

    /* JADX INFO: renamed from: x1 */
    private int f39556x1;

    /* JADX INFO: renamed from: com.aspose.slides.internal.vm.k4$k4 */
    public class k4<T1, T2> {

        /* JADX INFO: renamed from: kk */
        private T2 f39558kk;

        /* JADX INFO: renamed from: x1 */
        private T1 f39559x1;

        public k4(T1 t1, T2 t2) {
            this.f39559x1 = t1;
            this.f39558kk = t2;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null) {
                return false;
            }
            k4 k4Var = (k4) obj;
            return this.f39559x1.equals(k4Var.f39559x1) && this.f39558kk.equals(k4Var.f39558kk);
        }

        public int hashCode() {
            return this.f39558kk.hashCode() + (this.f39559x1.hashCode() * 31);
        }
    }

    static {
        f39551h4 = Collator.getInstance() == Collator.getInstance();
    }

    private C11690k4() {
    }

    /* JADX INFO: renamed from: x1 */
    private int m55126x1(String str, int i, int i2, String str2, int i3, int i4, long j) {
        String strSubstring = str.substring(i, i2 + i);
        String strSubstring2 = str2.substring(i3, i4 + i3);
        int i5 = 1;
        if (j == 1073741824 || j == 268435456) {
            return m55124k4(strSubstring, strSubstring2, j == 268435456);
        }
        int i6 = ((j & 1) == 1 || (j & 268435456) == 268435456) ? (j & 2) == 2 ? 0 : 1 : 2;
        if ((j & 8) == 8 || (j & 4) == 4 || (j & 16) == 16) {
            i5 = 2;
        } else if ((j & 2) != 2) {
            i5 = 0;
        }
        return m55125k4(i6, i5).compare(strSubstring, strSubstring2);
    }

    public boolean equals(Object obj) {
        C11690k4 c11690k4 = obj instanceof C11690k4 ? (C11690k4) obj : null;
        return c11690k4 != null && c11690k4.f39556x1 == this.f39556x1;
    }

    public int hashCode() {
        return m55127k4();
    }

    /* JADX INFO: renamed from: k4 */
    public int m55127k4() {
        return this.f39556x1;
    }

    /* JADX INFO: renamed from: kk */
    public boolean m55134kk(String str, String str2, long j) {
        if (str == null) {
            throw new ArgumentNullException("source");
        }
        if (str2 == null) {
            throw new ArgumentNullException("suffix");
        }
        if ((1342177311 & j) == j) {
            return str.length() >= str2.length() && m55128k4(str, str.length() - str2.length(), str2.length(), str2, 0, str2.length(), j) == 0;
        }
        throw new ArgumentException("options");
    }

    /* JADX INFO: renamed from: to */
    public int m55135to(String str, String str2, long j) {
        return m55131k4(str, str2, 0, str.length(), j);
    }

    public String toString() {
        return "CompareInfo - " + this.f39556x1;
    }

    public C11690k4(C11697x1 c11697x1) {
        this.f39554k4 = c11697x1;
        this.f39556x1 = c11697x1.m55262dy();
    }

    /* JADX INFO: renamed from: k4 */
    public int m55128k4(String str, int i, int i2, String str2, int i3, int i4, long j) {
        if ((1879048223 & j) != j) {
            throw new ArgumentException("options");
        }
        if (str == null) {
            return str2 == null ? 0 : -1;
        }
        if (str2 == null) {
            return 1;
        }
        if ((str.length() == 0 || i == str.length() || i2 == 0) && (str2.length() == 0 || i3 == str2.length() || i4 == 0)) {
            return 0;
        }
        if (i < 0 || i2 < 0 || i3 < 0 || i4 < 0) {
            throw new ArgumentException("Parameter name: Offsets and lengths must not be less than zero");
        }
        if (i > str.length()) {
            throw new ArgumentException("Parameter name: Offset1 is greater than or equal to the length of string1");
        }
        if (i3 > str2.length()) {
            throw new ArgumentException("Parameter name: Offset2 is greater than or equal to the length of string2");
        }
        if (i2 > str.length() - i) {
            throw new ArgumentException("Parameter name: Length1 is greater than the number of characters from offset1 to the end of string1");
        }
        if (i4 <= str2.length() - i3) {
            return m55126x1(str, i, i2, str2, i3, i4, j);
        }
        throw new ArgumentException("Parameter name: Length2 is greater than the number of characters from offset2 to the end of string2");
    }

    /* JADX INFO: renamed from: x1 */
    public int m55136x1(String str, String str2, int i, int i2) {
        return m55137x1(str, str2, i, i2, 0L);
    }

    /* JADX INFO: renamed from: k4 */
    public int m55129k4(String str, String str2) {
        return m55132k4(str, str2, 0L);
    }

    /* JADX INFO: renamed from: x1 */
    public int m55137x1(String str, String str2, int i, int i2, long j) {
        int i3;
        if (str == null) {
            throw new ArgumentNullException("source");
        }
        if (str2 == null) {
            throw new ArgumentNullException("value");
        }
        if (i < 0) {
            throw new ArgumentOutOfRangeException("startIndex");
        }
        if (i2 < 0 || (i3 = i - i2) < -1) {
            throw new ArgumentOutOfRangeException(C18293o1.f55803f);
        }
        if ((1342177311 & j) != j) {
            throw new ArgumentException("options");
        }
        if (i2 == 0) {
            return -1;
        }
        int length = str2.length();
        if (length == 0) {
            return i;
        }
        if (str.length() == str2.length()) {
            return m55132k4(str, str2, j) == 0 ? 0 : -1;
        }
        for (int i4 = i; i4 > i3; i4--) {
            if (m55132k4(C14113y2.m67443x1(str, i4, Math.min(str2.length(), str.length() - i4)), str2, j) == 0 && i4 <= i && i4 >= i3 && (r4 + i4) - 1 <= i && length <= i2) {
                return i4;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: k4 */
    public int m55130k4(String str, String str2, int i, int i2) {
        return m55131k4(str, str2, i, i2, 0L);
    }

    /* JADX INFO: renamed from: x1 */
    public boolean m55138x1(String str, String str2, long j) {
        if (str == null) {
            throw new ArgumentNullException("source");
        }
        if (str2 == null) {
            throw new ArgumentNullException(RequestParameters.PREFIX);
        }
        if ((1342177311 & j) == j) {
            return str.length() >= str2.length() && m55128k4(str, 0, str2.length(), str2, 0, str2.length(), j) == 0;
        }
        throw new ArgumentException("options");
    }

    /* JADX INFO: renamed from: k4 */
    public int m55131k4(String str, String str2, int i, int i2, long j) {
        if (str == null) {
            throw new ArgumentNullException("source");
        }
        if (str2 == null) {
            throw new ArgumentNullException("value");
        }
        if (i < 0) {
            throw new ArgumentOutOfRangeException("startIndex");
        }
        if (i2 < 0 || str.length() - i < i2) {
            throw new ArgumentOutOfRangeException(C18293o1.f55803f);
        }
        if ((1342177311 & j) != j) {
            throw new ArgumentException("options");
        }
        if (str2.length() != 0) {
            if (i2 == 0) {
                return -1;
            }
            if (str.length() != str2.length()) {
                int i3 = i;
                while (true) {
                    int i4 = i + i2;
                    if (i3 >= i4) {
                        return -1;
                    }
                    int length = str2.length();
                    if (m55132k4(C14113y2.m67443x1(str, i3, Math.min(length, str.length() - i3)), str2, j) == 0 && i3 >= i && length + i3 <= i4) {
                        return i3;
                    }
                    i3++;
                }
            } else if (m55128k4(str, i, i2, str2, 0, str2.length(), j) != 0) {
                return -1;
            }
        }
        return i;
    }

    /* JADX INFO: renamed from: k4 */
    public int m55132k4(String str, String str2, long j) {
        if ((1879048223 & j) != j) {
            throw new ArgumentException("options");
        }
        if (str == null) {
            return str2 == null ? 0 : -1;
        }
        if (str2 == null) {
            return 1;
        }
        if (str.length() == 0 && str2.length() == 0) {
            return 0;
        }
        return m55126x1(str, 0, str.length(), str2, 0, str2.length(), j);
    }

    /* JADX INFO: renamed from: k4 */
    private int m55124k4(String str, String str2, boolean z) {
        if (z) {
            str = C14113y2.m67444x1(str, C11697x1.m55250kk());
            str2 = C14113y2.m67444x1(str2, C11697x1.m55250kk());
        }
        int iCharAt = 0;
        int i = 0;
        while (true) {
            if (i >= str.length() || i >= str2.length()) {
                break;
            }
            if (str.charAt(i) != str2.charAt(i)) {
                iCharAt = str.charAt(i) - str2.charAt(i);
                break;
            }
            i++;
        }
        return (iCharAt != 0 || str.length() == str2.length()) ? iCharAt : str.length() - str2.length() > 0 ? 1 : -1;
    }

    /* JADX INFO: renamed from: k4 */
    public CollationKey m55133k4(String str, long j) {
        int i = 2;
        int i2 = (j & 1) == 1 ? (j & 2) == 2 ? 0 : 1 : 2;
        if ((j & 8) != 8 && (j & 4) != 4 && (j & 16) != 16) {
            i = (j & 2) == 2 ? 1 : 0;
        }
        return m55125k4(i2, i).getCollationKey(str);
    }

    /* JADX INFO: renamed from: k4 */
    private Collator m55125k4(int i, int i2) {
        Collator collator;
        if (this.f39555kk == null) {
            Map<Integer, Map<k4<Integer, Integer>, Collator>> map = f39552to;
            synchronized (map) {
                try {
                    if (this.f39555kk == null) {
                        Map<k4<Integer, Integer>, Collator> map2 = map.get(Integer.valueOf(this.f39556x1));
                        if (map2 == null) {
                            map2 = new HashMap<>(12);
                            map.put(Integer.valueOf(this.f39556x1), map2);
                        }
                        this.f39555kk = map2;
                    }
                } finally {
                }
            }
        }
        synchronized (this.f39555kk) {
            try {
                k4<Integer, Integer> k4Var = new k4<>(Integer.valueOf(i), Integer.valueOf(i2));
                Collator collator2 = this.f39555kk.get(k4Var);
                if (collator2 == null) {
                    collator2 = Collator.getInstance(C11697x1.m55246k4(this.f39554k4));
                    if (f39551h4) {
                        collator2 = (Collator) collator2.clone();
                    }
                    collator2.setStrength(i);
                    collator2.setDecomposition(i2);
                    this.f39555kk.put(k4Var, collator2);
                }
                long id = Thread.currentThread().getId();
                collator = this.f39553du.get(Long.valueOf(id));
                if (collator == null || collator.getStrength() != collator2.getStrength() || collator.getDecomposition() != collator2.getDecomposition()) {
                    collator = (Collator) collator2.clone();
                    Map<Long, Collator> map3 = this.f39553du;
                    Long lValueOf = Long.valueOf(id);
                    map3.put(lValueOf, collator);
                }
            } finally {
            }
        }
        return collator;
    }
}
