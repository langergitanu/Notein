package com.aspose.slides.internal.p181ig;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p263m2.InterfaceC6311x1;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.C14117yj;
import com.aspose.slides.p559ms.System.IDisposable;

/* JADX INFO: renamed from: com.aspose.slides.internal.ig.y2 */
/* JADX INFO: loaded from: classes.dex */
public class C4879y2 implements IDisposable {

    /* JADX INFO: renamed from: k4 */
    private List<Character> f13477k4;

    /* JADX INFO: renamed from: to */
    private int f13479to;

    /* JADX INFO: renamed from: x1 */
    private int f13480x1;

    /* JADX INFO: renamed from: kk */
    private int f13478kk = -1;

    /* JADX INFO: renamed from: du */
    private int f13476du = -1;

    public C4879y2(InterfaceC6311x1 interfaceC6311x1) {
        char[] charArray = interfaceC6311x1.mo17112k4().mo13427dy().toCharArray();
        List<Character> list = new List<>();
        for (char c : charArray) {
            list.add(Character.valueOf(c));
        }
        this.f13477k4 = list;
        this.f13480x1 = list.size();
    }

    /* JADX INFO: renamed from: c5 */
    public final String m20165c5() {
        int i = this.f13478kk;
        String strM20164k4 = m20164k4(i, this.f13480x1 - i);
        this.f13478kk = this.f13480x1;
        return strM20164k4;
    }

    /* JADX INFO: renamed from: ck */
    public final void m20166ck() {
        this.f13479to = this.f13478kk;
    }

    @Override // com.aspose.slides.p559ms.System.IDisposable
    public final void dispose() {
    }

    /* JADX INFO: renamed from: du */
    public final void m20167du() {
        this.f13476du = m20174k4();
    }

    /* JADX INFO: renamed from: dy */
    public final void m20169dy() {
        this.f13478kk--;
    }

    /* JADX INFO: renamed from: fa */
    public final void m20170fa() {
        this.f13478kk = this.f13479to;
    }

    /* JADX INFO: renamed from: h4 */
    public final void m20171h4() {
        this.f13476du = -1;
    }

    /* JADX INFO: renamed from: jd */
    public final void m20173jd() {
        this.f13478kk++;
    }

    /* JADX INFO: renamed from: k4 */
    public final int m20174k4() {
        return this.f13478kk;
    }

    /* JADX INFO: renamed from: kk */
    public final int m20180kk(String str) {
        char cCharAt = str.charAt(0);
        int i = this.f13478kk;
        while (i < this.f13480x1) {
            if (cCharAt != this.f13477k4.get_Item(i).charValue()) {
                do {
                    i++;
                    if (i >= this.f13480x1) {
                        break;
                    }
                } while (cCharAt != this.f13477k4.get_Item(i).charValue());
            }
            int i2 = i + 1;
            int length = (str.length() + i2) - 1;
            int i3 = this.f13480x1;
            if (i < i3 && length <= i3) {
                int i4 = i2;
                for (int i5 = 1; i4 < length && str.charAt(i5) == this.f13477k4.get_Item(i4).charValue(); i5++) {
                    i4++;
                }
                if (i4 == length) {
                    return i - this.f13478kk;
                }
            }
            i = i2;
        }
        return -1;
    }

    /* JADX INFO: renamed from: ks */
    public final String m20184ks() {
        char cCharValue;
        char cCharValue2;
        int i = this.f13478kk;
        while (true) {
            int i2 = this.f13478kk;
            if (i2 >= this.f13480x1 || (((cCharValue2 = this.f13477k4.get_Item(i2).charValue()) < 'A' || cCharValue2 > 'Z') && (cCharValue2 < 'a' || cCharValue2 > 'z'))) {
                break;
            }
            this.f13478kk++;
        }
        while (!m20181kk() && (cCharValue = this.f13477k4.get_Item(this.f13478kk).charValue()) >= '0' && cCharValue <= '9') {
            this.f13478kk++;
        }
        return m20164k4(i, this.f13478kk - i);
    }

    /* JADX INFO: renamed from: m9 */
    public final char m20185m9() {
        char cCharValue = this.f13477k4.get_Item(this.f13478kk).charValue();
        this.f13478kk++;
        return cCharValue;
    }

    /* JADX INFO: renamed from: rv */
    public final boolean m20186rv() {
        if (m20181kk()) {
            return false;
        }
        char cCharValue = this.f13477k4.get_Item(this.f13478kk).charValue();
        if (cCharValue < 'A' || cCharValue > 'Z') {
            return cCharValue >= 'a' && cCharValue <= 'z';
        }
        return true;
    }

    /* JADX INFO: renamed from: to */
    public final int m20187to() {
        return this.f13480x1;
    }

    public String toString() {
        int i = this.f13478kk;
        return m20164k4(i, this.f13480x1 - i);
    }

    /* JADX INFO: renamed from: up */
    public final String m20189up() {
        char cCharValue;
        int i = this.f13478kk;
        while (true) {
            int i2 = this.f13478kk;
            if (i2 >= this.f13480x1 || (((cCharValue = this.f13477k4.get_Item(i2).charValue()) < '0' || cCharValue > '9') && ((cCharValue < 'A' || cCharValue > 'F') && (cCharValue < 'a' || cCharValue > 'f')))) {
                break;
            }
            this.f13478kk++;
        }
        return m20164k4(i, this.f13478kk - i);
    }

    /* JADX INFO: renamed from: x1 */
    public final char m20190x1() {
        return this.f13477k4.get_Item(this.f13478kk).charValue();
    }

    /* JADX INFO: renamed from: x6 */
    public final boolean m20194x6() {
        char cCharValue;
        return !m20181kk() && (cCharValue = this.f13477k4.get_Item(this.f13478kk).charValue()) >= '0' && cCharValue <= '9';
    }

    /* JADX INFO: renamed from: yj */
    public final String m20195yj() {
        char cCharValue;
        int i = this.f13478kk;
        while (true) {
            int i2 = this.f13478kk;
            if (i2 >= this.f13480x1 || (cCharValue = this.f13477k4.get_Item(i2).charValue()) < '0' || cCharValue > '9') {
                break;
            }
            this.f13478kk++;
        }
        return m20164k4(i, this.f13478kk - i);
    }

    /* JADX INFO: renamed from: k4 */
    private String m20164k4(int i, int i2) {
        Character[] chArr = new Character[i2];
        this.f13477k4.copyTo(i, chArr, 0, i2);
        char[] cArr = new char[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            cArr[i3] = chArr[i3].charValue();
        }
        return C14113y2.m67405k4(cArr);
    }

    /* JADX INFO: renamed from: du */
    public final boolean m20168du(String str) {
        int length = str.length();
        if (length > (this.f13480x1 - this.f13478kk) - 1) {
            return false;
        }
        for (int i = 0; i < length; i++) {
            if (C14117yj.m67521ix(str.charAt(i)) != C14117yj.m67521ix(this.f13477k4.get_Item(this.f13478kk + i + 1).charValue())) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: h4 */
    public final boolean m20172h4(String str) {
        if (!m20168du(str)) {
            return false;
        }
        this.f13478kk = str.length() + this.f13478kk;
        return true;
    }

    /* JADX INFO: renamed from: kk */
    public final boolean m20181kk() {
        return this.f13478kk >= this.f13480x1;
    }

    /* JADX INFO: renamed from: to */
    public final boolean m20188to(String str) {
        return m20182kk(str, false);
    }

    /* JADX INFO: renamed from: x1 */
    public final String m20191x1(String str) {
        return m20175k4(str, true);
    }

    /* JADX INFO: renamed from: k4 */
    public final String m20175k4(String str, boolean z) {
        int iM20180kk = m20180kk(str);
        if (iM20180kk != -1) {
            String strM20164k4 = m20164k4(this.f13478kk, iM20180kk);
            this.f13478kk += iM20180kk;
            return strM20164k4;
        }
        if (z) {
            return m20165c5();
        }
        return null;
    }

    /* JADX INFO: renamed from: kk */
    public final boolean m20182kk(String str, boolean z) {
        if (!m20193x1(str, z)) {
            return false;
        }
        this.f13478kk = str.length() + this.f13478kk;
        return true;
    }

    /* JADX INFO: renamed from: x1 */
    public final String m20192x1(char... cArr) {
        int i = this.f13478kk;
        boolean z = false;
        while (this.f13478kk < this.f13480x1) {
            int i2 = 0;
            while (true) {
                if (i2 >= cArr.length) {
                    break;
                }
                if (this.f13477k4.get_Item(this.f13478kk).charValue() == cArr[i2]) {
                    z = true;
                    break;
                }
                i2++;
            }
            if (z) {
                break;
            }
            this.f13478kk++;
        }
        int i3 = this.f13478kk;
        return i3 > i ? m20164k4(i, i3 - i) : C14113y2.f47374k4;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001e, code lost:
    
        r4.f13478kk++;
     */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String m20176k4(char... cArr) {
        int i = this.f13478kk;
        loop0: while (this.f13478kk < this.f13480x1) {
            for (char c : cArr) {
                if (this.f13477k4.get_Item(this.f13478kk).charValue() == c) {
                    break;
                }
            }
        }
        int i2 = this.f13478kk;
        return i2 > i ? m20164k4(i, i2 - i) : C14113y2.f47374k4;
    }

    /* JADX INFO: renamed from: kk */
    public final boolean m20183kk(char... cArr) {
        if (m20181kk()) {
            return false;
        }
        char cCharValue = this.f13477k4.get_Item(this.f13478kk).charValue();
        for (char c : cArr) {
            if (c == cCharValue) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: x1 */
    public final boolean m20193x1(String str, boolean z) {
        int length = str.length();
        if (z) {
            if (length > this.f13480x1 - this.f13478kk) {
                return false;
            }
            for (int i = 0; i < length; i++) {
                if (str.charAt(i) != this.f13477k4.get_Item(this.f13478kk + i).charValue()) {
                    return false;
                }
            }
        } else {
            if (length > (this.f13480x1 - this.f13478kk) - 1) {
                return false;
            }
            for (int i2 = 0; i2 < length; i2++) {
                if (str.charAt(i2) != this.f13477k4.get_Item(this.f13478kk + i2 + 1).charValue()) {
                    return false;
                }
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m20177k4(int i) {
        if (i < 0) {
            this.f13478kk = -1;
            return;
        }
        int i2 = this.f13480x1;
        if (i > i2) {
            this.f13478kk = i2;
        } else {
            this.f13478kk = i;
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m20178k4(String str) {
        if (this.f13476du != -1) {
            for (int i = 0; i < str.length(); i++) {
                char cCharAt = str.charAt(i);
                List<Character> list = this.f13477k4;
                int i2 = this.f13476du + 1;
                this.f13476du = i2;
                list.insertItem(i2, Character.valueOf(cCharAt));
            }
            this.f13480x1 = str.length() + this.f13480x1;
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m20179k4(char c) {
        return !m20181kk() && this.f13477k4.get_Item(this.f13478kk).charValue() == c;
    }
}
