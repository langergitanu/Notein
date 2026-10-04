package com.aspose.slides.internal.p294n9;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.exceptions.IndexOutOfRangeException;
import com.aspose.slides.exceptions.NullReferenceException;
import com.aspose.slides.p559ms.System.C14052dq;
import com.aspose.slides.p559ms.System.C14064he;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.InterfaceC14073kp;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Arrays;

/* JADX INFO: renamed from: com.aspose.slides.internal.n9.kp */
/* JADX INFO: loaded from: classes4.dex */
public final class C6765kp {

    /* JADX INFO: renamed from: k4 */
    private int f18685k4;

    /* JADX INFO: renamed from: kk */
    private String f18686kk;

    /* JADX INFO: renamed from: to */
    private int f18687to;

    /* JADX INFO: renamed from: x1 */
    private char[] f18688x1;

    public C6765kp() {
        this((String) null);
    }

    /* JADX INFO: renamed from: to */
    private void m26776to(int i) {
        char[] cArr = this.f18688x1;
        if (i > cArr.length) {
            int length = cArr.length;
            if (i > length) {
                if (length < 16) {
                    length = 16;
                }
                length <<= 1;
                if (i > length) {
                    length = i;
                }
                if (length >= Integer.MAX_VALUE || length < 0) {
                    length = Integer.MAX_VALUE;
                }
                int i2 = this.f18687to;
                if (length > i2 && i <= i2) {
                    length = i2;
                }
                if (length > i2) {
                    throw new ArgumentOutOfRangeException("size", "capacity was less than the current size.");
                }
            }
            this.f18688x1 = new char[length];
            int i3 = this.f18685k4;
            if (i3 > 0) {
                m26777x1(0, cArr, 0, i3);
            }
        }
        this.f18686kk = null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C6765kp.class != obj.getClass()) {
            return false;
        }
        return m26803k4((C6765kp) obj);
    }

    public int hashCode() {
        int i = this.f18685k4 * 31;
        char[] cArr = this.f18688x1;
        return i + (cArr != null ? Arrays.hashCode(cArr) : 0);
    }

    /* JADX INFO: renamed from: k4 */
    public int m26778k4() {
        char[] cArr = this.f18688x1;
        return cArr.length == 0 ? Math.min(this.f18687to, 16) : cArr.length;
    }

    /* JADX INFO: renamed from: kk */
    public C6765kp m26804kk() {
        return m26792k4(C14052dq.f47188k4);
    }

    public String toString() {
        int i = this.f18685k4;
        if (i == 0) {
            return C14113y2.f47374k4;
        }
        if (this.f18686kk == null) {
            char[] cArr = this.f18688x1;
            this.f18686kk = cArr.length == i ? new String(cArr) : new String(cArr, 0, i);
        }
        return this.f18686kk;
    }

    /* JADX INFO: renamed from: x1 */
    public char m26806x1(int i) {
        if (i >= this.f18685k4 || i < 0) {
            throw new IndexOutOfRangeException();
        }
        return this.f18688x1[i];
    }

    public C6765kp(int i) {
        this(C14113y2.f47374k4, 0, 0, i);
    }

    /* JADX INFO: renamed from: k4 */
    public C6765kp m26779k4(byte b) {
        return m26792k4(Byte.toString(b));
    }

    /* JADX INFO: renamed from: kk */
    public C6765kp m26805kk(int i) {
        return m26792k4(Integer.toString(i));
    }

    /* JADX INFO: renamed from: x1 */
    public int m26807x1() {
        return this.f18685k4;
    }

    public C6765kp(String str) {
        str = str == null ? C14113y2.f47374k4 : str;
        this.f18685k4 = str.length();
        this.f18688x1 = str.toCharArray();
        this.f18686kk = str;
        this.f18687to = Integer.MAX_VALUE;
    }

    /* JADX INFO: renamed from: kk */
    private void m26774kk(int i, char c) {
        char[] cArr = this.f18688x1;
        if (i > cArr.length) {
            throw new ArgumentOutOfRangeException("idx");
        }
        cArr[i] = c;
    }

    /* JADX INFO: renamed from: k4 */
    public C6765kp m26780k4(char c) {
        int i = this.f18685k4 + 1;
        if (this.f18686kk != null || this.f18688x1.length < i) {
            m26776to(i);
        }
        m26774kk(this.f18685k4, c);
        this.f18685k4 = i;
        return this;
    }

    /* JADX INFO: renamed from: x1 */
    public C6765kp m26808x1(int i, char c) {
        int i2 = this.f18685k4;
        if (i > i2 || i < 0) {
            throw new ArgumentOutOfRangeException(FirebaseAnalytics.Param.INDEX);
        }
        m26776to(i2 + 1);
        m26775kk(i + 1, this.f18688x1, i, this.f18685k4 - i);
        m26774kk(i, c);
        this.f18685k4++;
        return this;
    }

    public C6765kp(String str, int i) {
        this(str == null ? "" : str, 0, str == null ? 0 : str.length(), i);
    }

    /* JADX INFO: renamed from: kk */
    private void m26775kk(int i, char[] cArr, int i2, int i3) {
        System.arraycopy(cArr, i2, this.f18688x1, i, i3);
    }

    /* JADX INFO: renamed from: k4 */
    public C6765kp m26781k4(char c, char c2) {
        return m26782k4(c, c2, 0, this.f18685k4);
    }

    /* JADX INFO: renamed from: x1 */
    public C6765kp m26809x1(int i, int i2) {
        if (i >= 0 && i2 >= 0) {
            int i3 = this.f18685k4;
            if (i <= i3 - i2) {
                if (this.f18686kk != null) {
                    m26776to(i3);
                }
                int i4 = this.f18685k4;
                int i5 = i + i2;
                if (i4 - i5 > 0) {
                    m26777x1(i, this.f18688x1, i5, i4 - i5);
                }
                this.f18685k4 -= i2;
                return this;
            }
        }
        throw new ArgumentOutOfRangeException();
    }

    public C6765kp(String str, int i, int i2, int i3) {
        this(str, i, i2, i3, Integer.MAX_VALUE);
    }

    /* JADX INFO: renamed from: k4 */
    public C6765kp m26782k4(char c, char c2, int i, int i2) {
        if (i > this.f18685k4 - i2 || i < 0 || i2 < 0) {
            throw new ArgumentOutOfRangeException();
        }
        if (this.f18686kk != null) {
            m26776to(this.f18688x1.length);
        }
        for (int i3 = i; i3 < i + i2; i3++) {
            if (this.f18688x1[i3] == c) {
                m26774kk(i3, c2);
            }
        }
        return this;
    }

    /* JADX INFO: renamed from: x1 */
    public C6765kp m26810x1(String str) {
        return m26792k4(str).m26792k4(C14052dq.f47188k4);
    }

    private C6765kp(String str, int i, int i2, int i3, int i4) {
        str = str == null ? "" : str;
        if (i < 0) {
            throw new ArgumentOutOfRangeException("startIndex", Integer.valueOf(i), "StartIndex cannot be less than zero.");
        }
        if (i2 < 0) {
            throw new ArgumentOutOfRangeException("length", Integer.valueOf(i2), "Length cannot be less than zero.");
        }
        if (i3 < 0) {
            throw new ArgumentOutOfRangeException("capacity", Integer.valueOf(i3), "capacity must be greater than zero.");
        }
        if (i4 < 1) {
            throw new ArgumentOutOfRangeException("maxCapacity", "maxCapacity is less than one.");
        }
        if (i3 > i4) {
            throw new ArgumentOutOfRangeException("capacity", "Capacity exceeds maximum capacity.");
        }
        if (i > str.length() - i2) {
            throw new ArgumentOutOfRangeException("startIndex", Integer.valueOf(i), "StartIndex and length must refer to a location within the string.");
        }
        if (i3 == 0) {
            if (i4 > 16) {
                i3 = 16;
            } else {
                this.f18688x1 = new char[0];
                this.f18686kk = C14113y2.f47374k4;
            }
        }
        this.f18687to = i4;
        if (this.f18688x1 == null) {
            this.f18688x1 = new char[i2 > i3 ? i2 : i3];
        }
        if (i2 > 0) {
            m26773k4(0, str, i, i2);
        }
        this.f18685k4 = i2;
    }

    /* JADX INFO: renamed from: x1 */
    private void m26777x1(int i, char[] cArr, int i2, int i3) {
        System.arraycopy(cArr, i2, this.f18688x1, i, i3);
    }

    /* JADX INFO: renamed from: k4 */
    public C6765kp m26783k4(char c, int i) {
        if (i < 0) {
            throw new ArgumentOutOfRangeException();
        }
        m26776to(this.f18685k4 + i);
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = this.f18685k4;
            this.f18685k4 = i3 + 1;
            m26774kk(i3, c);
        }
        return this;
    }

    /* JADX INFO: renamed from: k4 */
    public C6765kp m26784k4(double d) {
        return m26792k4(Double.toString(d));
    }

    /* JADX INFO: renamed from: k4 */
    public C6765kp m26785k4(float f) {
        return m26792k4(C14064he.m66704h4(f));
    }

    /* JADX INFO: renamed from: k4 */
    public C6765kp m26786k4(int i, String str) {
        if (i > this.f18685k4 || i < 0) {
            throw new ArgumentOutOfRangeException();
        }
        if (str != null && str.length() != 0) {
            m26776to(str.length() + this.f18685k4);
            m26775kk(str.length() + i, this.f18688x1, i, this.f18685k4 - i);
            m26773k4(i, str, 0, str.length());
            this.f18685k4 = str.length() + this.f18685k4;
        }
        return this;
    }

    /* JADX INFO: renamed from: k4 */
    public C6765kp m26787k4(int i, String str, int i2) {
        if (i2 < 0) {
            throw new ArgumentOutOfRangeException();
        }
        if (str != null && !C14113y2.m67363du(str, C14113y2.f47374k4)) {
            for (int i3 = 0; i3 < i2; i3++) {
                m26786k4(i, str);
            }
        }
        return this;
    }

    /* JADX INFO: renamed from: k4 */
    public C6765kp m26788k4(int i, char[] cArr, int i2, int i3) {
        if (cArr == null) {
            if (i2 == 0 && i3 == 0) {
                return this;
            }
            throw new ArgumentNullException("value");
        }
        if (i3 < 0 || i2 < 0 || i2 > cArr.length - i3) {
            throw new ArgumentOutOfRangeException();
        }
        return m26786k4(i, C14113y2.m67406k4(cArr, i2, i3));
    }

    /* JADX INFO: renamed from: k4 */
    public C6765kp m26789k4(long j) {
        return m26792k4(Long.toString(j));
    }

    /* JADX INFO: renamed from: k4 */
    public static C6765kp m26772k4(C6765kp c6765kp, String str, Object... objArr) {
        if (c6765kp == null) {
            throw new NullReferenceException();
        }
        if (str == null || objArr == null) {
            throw new ArgumentNullException(str == null ? "format" : "args");
        }
        return c6765kp.m26796k4(str, objArr);
    }

    /* JADX INFO: renamed from: k4 */
    public C6765kp m26790k4(InterfaceC14073kp interfaceC14073kp, String str, Object... objArr) {
        C14113y2.m67388k4(this, interfaceC14073kp, str, objArr);
        return this;
    }

    /* JADX INFO: renamed from: k4 */
    public C6765kp m26791k4(Object obj) {
        return obj == null ? this : m26792k4(obj.toString());
    }

    /* JADX INFO: renamed from: k4 */
    public C6765kp m26792k4(String str) {
        if (str == null) {
            return this;
        }
        if (this.f18685k4 == 0 && str.length() < this.f18687to && str.length() > this.f18688x1.length) {
            this.f18685k4 = str.length();
            this.f18688x1 = str.toCharArray();
            this.f18686kk = str;
            return this;
        }
        int length = str.length() + this.f18685k4;
        if (this.f18686kk != null || this.f18688x1.length < length) {
            m26776to(length);
        }
        m26773k4(this.f18685k4, str, 0, str.length());
        this.f18685k4 = length;
        return this;
    }

    /* JADX INFO: renamed from: k4 */
    public C6765kp m26793k4(String str, int i, int i2) {
        if (str == null) {
            if (i == 0 || i2 == 0) {
                return this;
            }
            throw new ArgumentNullException("value");
        }
        if (i2 < 0 || i < 0 || i > str.length() - i2) {
            throw new ArgumentOutOfRangeException();
        }
        int i3 = this.f18685k4 + i2;
        if (this.f18686kk != null || this.f18688x1.length < i3) {
            m26776to(i3);
        }
        m26773k4(this.f18685k4, str, i, i2);
        this.f18685k4 = i3;
        return this;
    }

    /* JADX INFO: renamed from: k4 */
    public C6765kp m26794k4(String str, String str2) {
        return m26795k4(str, str2, 0, this.f18685k4);
    }

    /* JADX INFO: renamed from: k4 */
    public C6765kp m26795k4(String str, String str2, int i, int i2) {
        if (str == null) {
            throw new ArgumentNullException("The old value cannot be null.");
        }
        if (i < 0 || i2 < 0 || i > this.f18685k4 - i2) {
            throw new ArgumentOutOfRangeException();
        }
        if (str.length() == 0) {
            throw new ArgumentException("The old value cannot be zero length.");
        }
        char[] cArr = new char[i2];
        System.arraycopy(this.f18688x1, i, cArr, 0, i2);
        String str3 = new String(cArr);
        String strM67401k4 = C14113y2.m67401k4(str3, str, str2);
        if (C14113y2.m67363du(strM67401k4, str3)) {
            return this;
        }
        m26776to((this.f18685k4 - i2) + strM67401k4.length());
        if (strM67401k4.length() < i2) {
            m26777x1(strM67401k4.length() + i, this.f18688x1, i + i2, (this.f18685k4 - i) - i2);
        } else if (strM67401k4.length() > i2) {
            m26775kk(strM67401k4.length() + i, this.f18688x1, i + i2, (this.f18685k4 - i) - i2);
        }
        m26773k4(i, strM67401k4, 0, strM67401k4.length());
        this.f18685k4 = (this.f18685k4 - i2) + strM67401k4.length();
        return this;
    }

    /* JADX INFO: renamed from: k4 */
    public C6765kp m26796k4(String str, Object... objArr) {
        return m26790k4((InterfaceC14073kp) null, str, objArr);
    }

    /* JADX INFO: renamed from: k4 */
    public C6765kp m26797k4(boolean z) {
        return m26792k4(Boolean.toString(z));
    }

    /* JADX INFO: renamed from: k4 */
    public C6765kp m26798k4(char[] cArr) {
        if (cArr == null) {
            return this;
        }
        int length = this.f18685k4 + cArr.length;
        if (this.f18686kk != null || this.f18688x1.length < length) {
            m26776to(length);
        }
        m26777x1(this.f18685k4, cArr, 0, cArr.length);
        this.f18685k4 = length;
        return this;
    }

    /* JADX INFO: renamed from: k4 */
    public C6765kp m26799k4(char[] cArr, int i, int i2) {
        if (cArr == null) {
            if (i == 0 && i2 == 0) {
                return this;
            }
            throw new ArgumentNullException("value");
        }
        if (i2 < 0 || i < 0 || i > cArr.length - i2) {
            throw new ArgumentOutOfRangeException();
        }
        int i3 = this.f18685k4 + i2;
        m26776to(i3);
        m26777x1(this.f18685k4, cArr, i, i2);
        this.f18685k4 = i3;
        return this;
    }

    /* JADX INFO: renamed from: k4 */
    public String m26800k4(int i, int i2) {
        if (i < 0 || i2 < 0 || i > this.f18685k4 - i2) {
            throw new ArgumentOutOfRangeException();
        }
        String string = toString();
        return (i == 0 && i2 == this.f18685k4) ? string : C14113y2.m67443x1(string, i, i2);
    }

    /* JADX INFO: renamed from: k4 */
    public void m26801k4(int i) {
        if (i < 0 || i > this.f18687to) {
            throw new ArgumentOutOfRangeException();
        }
        int i2 = this.f18685k4;
        if (i == i2) {
            return;
        }
        if (i >= i2) {
            m26783k4((char) 0, i - i2);
        } else {
            m26776to(i);
            this.f18685k4 = i;
        }
    }

    /* JADX INFO: renamed from: k4 */
    public void m26802k4(int i, char c) {
        int i2 = this.f18685k4;
        if (i >= i2 || i < 0) {
            throw new IndexOutOfRangeException();
        }
        if (this.f18686kk != null) {
            m26776to(i2);
        }
        m26774kk(i, c);
    }

    /* JADX INFO: renamed from: k4 */
    private void m26773k4(int i, String str, int i2, int i3) {
        m26777x1(i, str.toCharArray(), i2, i3);
    }

    /* JADX INFO: renamed from: k4 */
    public boolean m26803k4(C6765kp c6765kp) {
        return c6765kp != null && this.f18685k4 == c6765kp.m26807x1() && C14113y2.m67363du(toString(), c6765kp.toString());
    }
}
