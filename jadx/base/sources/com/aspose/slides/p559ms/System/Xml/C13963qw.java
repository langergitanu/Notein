package com.aspose.slides.p559ms.System.Xml;

import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.exceptions.IndexOutOfRangeException;
import com.aspose.slides.exceptions.NullReferenceException;
import com.aspose.slides.p559ms.System.C14052dq;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.ms.System.Xml.qw */
/* JADX INFO: loaded from: classes5.dex */
public class C13963qw extends AbstractC13883dt {

    /* JADX INFO: renamed from: x1 */
    private int f46787x1;

    /* JADX INFO: renamed from: kk */
    private int f46785kk = 31;

    /* JADX INFO: renamed from: k4 */
    private k4[] f46784k4 = new k4[31 + 1];

    /* JADX INFO: renamed from: to */
    private int f46786to = C14052dq.m66560du();

    /* JADX INFO: renamed from: com.aspose.slides.ms.System.Xml.qw$k4 */
    public static class k4 {

        /* JADX INFO: renamed from: k4 */
        public String f46788k4;

        /* JADX INFO: renamed from: kk */
        public k4 f46789kk;

        /* JADX INFO: renamed from: x1 */
        public int f46790x1;

        public k4(String str, int i, k4 k4Var) {
            this.f46788k4 = str;
            this.f46790x1 = i;
            this.f46789kk = k4Var;
        }
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13883dt
    /* JADX INFO: renamed from: k4 */
    public String mo65266k4(String str) {
        if (str == null) {
            throw new ArgumentNullException("key");
        }
        int length = str.length();
        if (length == 0) {
            return C14113y2.f47374k4;
        }
        int iCharAt = length + this.f46786to;
        for (int i = 0; i < str.length(); i++) {
            iCharAt += (iCharAt << 7) ^ str.charAt(i);
        }
        int i2 = iCharAt - (iCharAt >> 17);
        int i3 = i2 - (i2 >> 11);
        int i4 = i3 - (i3 >> 5);
        for (k4 k4Var = this.f46784k4[this.f46785kk & i4]; k4Var != null; k4Var = k4Var.f46789kk) {
            if (k4Var.f46790x1 == i4 && C14113y2.m67363du(k4Var.f46788k4, str)) {
                return k4Var.f46788k4;
            }
        }
        return m65810k4(str, i4);
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13883dt
    /* JADX INFO: renamed from: x1 */
    public String mo65268x1(String str) {
        if (str == null) {
            throw new ArgumentNullException("value");
        }
        if (str.length() == 0) {
            return C14113y2.f47374k4;
        }
        int length = str.length() + this.f46786to;
        for (int i = 0; i < str.length(); i++) {
            length += (length << 7) ^ str.charAt(i);
        }
        int i2 = length - (length >> 17);
        int i3 = i2 - (i2 >> 11);
        int i4 = i3 - (i3 >> 5);
        for (k4 k4Var = this.f46784k4[this.f46785kk & i4]; k4Var != null; k4Var = k4Var.f46789kk) {
            if (k4Var.f46790x1 == i4 && C14113y2.m67363du(k4Var.f46788k4, str)) {
                return k4Var.f46788k4;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: k4 */
    private String m65810k4(String str, int i) {
        int i2 = this.f46785kk & i;
        k4 k4Var = new k4(str, i, this.f46784k4[i2]);
        this.f46784k4[i2] = k4Var;
        int i3 = this.f46787x1;
        this.f46787x1 = i3 + 1;
        if (i3 == this.f46785kk) {
            m65811k4();
        }
        return k4Var.f46788k4;
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13883dt
    /* JADX INFO: renamed from: k4 */
    public String mo65267k4(char[] cArr, int i, int i2) {
        int i3;
        if (i2 == 0) {
            return C14113y2.f47374k4;
        }
        if (i2 < 0) {
            throw new ArgumentOutOfRangeException("The Len is negative");
        }
        if (cArr == null) {
            throw new NullReferenceException("The key is null");
        }
        if (i < 0 || i >= cArr.length || (i3 = i + i2) > cArr.length) {
            throw new IndexOutOfRangeException("The Index is out of range.");
        }
        if (i2 == 0) {
            return C14113y2.f47374k4;
        }
        int i4 = this.f46786to + i2;
        int i5 = i4 + ((i4 << 7) ^ cArr[i]);
        for (int i6 = i + 1; i6 < i3; i6++) {
            i5 += (i5 << 7) ^ cArr[i6];
        }
        int i7 = i5 - (i5 >> 17);
        int i8 = i7 - (i7 >> 11);
        int i9 = i8 - (i8 >> 5);
        for (k4 k4Var = this.f46784k4[this.f46785kk & i9]; k4Var != null; k4Var = k4Var.f46789kk) {
            if (k4Var.f46790x1 == i9 && m65812k4(k4Var.f46788k4, cArr, i, i2)) {
                return k4Var.f46788k4;
            }
        }
        return m65810k4(C14113y2.m67406k4(cArr, i, i2), i9);
    }

    /* JADX INFO: renamed from: k4 */
    private void m65811k4() {
        int i = this.f46785kk * 2;
        int i2 = i + 1;
        k4[] k4VarArr = new k4[i + 2];
        for (k4 k4Var : this.f46784k4) {
            while (k4Var != null) {
                int i3 = k4Var.f46790x1 & i2;
                k4 k4Var2 = k4Var.f46789kk;
                k4Var.f46789kk = k4VarArr[i3];
                k4VarArr[i3] = k4Var;
                k4Var = k4Var2;
            }
        }
        this.f46784k4 = k4VarArr;
        this.f46785kk = i2;
    }

    /* JADX INFO: renamed from: k4 */
    private static boolean m65812k4(String str, char[] cArr, int i, int i2) {
        if (str.length() != i2) {
            return false;
        }
        for (int i3 = 0; i3 < str.length(); i3++) {
            if (str.charAt(i3) != cArr[i + i3]) {
                return false;
            }
        }
        return true;
    }
}
