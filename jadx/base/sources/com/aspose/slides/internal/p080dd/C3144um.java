package com.aspose.slides.internal.p080dd;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.exceptions.ObjectDisposedException;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.words.ControlChar;

/* JADX INFO: renamed from: com.aspose.slides.internal.dd.um */
/* JADX INFO: loaded from: classes3.dex */
public class C3144um extends AbstractC3151yd {

    /* JADX INFO: renamed from: k4 */
    static char[] f9312k4;

    /* JADX INFO: renamed from: kk */
    private int f9313kk;

    /* JADX INFO: renamed from: to */
    private int f9314to;

    /* JADX INFO: renamed from: x1 */
    private String f9315x1;

    public C3144um(String str) {
        if (str == null) {
            throw new ArgumentNullException("s");
        }
        this.f9315x1 = str;
        this.f9313kk = 0;
        this.f9314to = str.length();
    }

    @Override // com.aspose.slides.internal.p080dd.AbstractC3151yd
    /* JADX INFO: renamed from: du */
    public int mo13055du() {
        if (this.f9315x1 == null) {
            m13426k4();
        }
        int i = this.f9313kk;
        if (i >= this.f9314to) {
            return -1;
        }
        return this.f9315x1.charAt(i);
    }

    @Override // com.aspose.slides.internal.p080dd.AbstractC3151yd
    /* JADX INFO: renamed from: dy */
    public String mo13427dy() {
        if (this.f9315x1 == null) {
            m13426k4();
        }
        String str = this.f9315x1;
        int i = this.f9313kk;
        String strM67443x1 = C14113y2.m67443x1(str, i, this.f9314to - i);
        this.f9313kk = this.f9314to;
        return strM67443x1;
    }

    @Override // com.aspose.slides.internal.p080dd.AbstractC3151yd
    /* JADX INFO: renamed from: h4 */
    public int mo13056h4() {
        if (this.f9315x1 == null) {
            m13426k4();
        }
        int i = this.f9313kk;
        if (i >= this.f9314to) {
            return -1;
        }
        String str = this.f9315x1;
        this.f9313kk = i + 1;
        return str.charAt(i);
    }

    @Override // com.aspose.slides.internal.p080dd.AbstractC3151yd
    /* JADX INFO: renamed from: k4 */
    public int mo13058k4(char[] cArr, int i, int i2) {
        if (this.f9315x1 == null) {
            m13426k4();
        }
        if (cArr == null) {
            throw new ArgumentNullException("buffer");
        }
        if (cArr.length - i < i2) {
            throw new ArgumentException();
        }
        if (i < 0 || i2 < 0) {
            throw new ArgumentOutOfRangeException();
        }
        int i3 = this.f9313kk;
        int i4 = this.f9314to;
        if (i3 > i4 - i2) {
            i2 = i4 - i3;
        }
        C14113y2.m67409k4(this.f9315x1, i3, cArr, i, i2);
        this.f9313kk += i2;
        return i2;
    }

    @Override // com.aspose.slides.internal.p080dd.AbstractC3151yd
    /* JADX INFO: renamed from: m9 */
    public String mo13429m9() {
        int i;
        if (this.f9315x1 == null) {
            m13426k4();
        }
        if (this.f9313kk >= this.f9315x1.length()) {
            return null;
        }
        if (f9312k4 == null) {
            f9312k4 = new char[]{'\n', ControlChar.PARAGRAPH_BREAK_CHAR};
        }
        int iM67385k4 = C14113y2.m67385k4(this.f9315x1, f9312k4, this.f9313kk);
        if (iM67385k4 == -1) {
            return mo13427dy();
        }
        boolean z = this.f9315x1.charAt(iM67385k4) == '\r' && (i = iM67385k4 + 1) < this.f9315x1.length() && this.f9315x1.charAt(i) == '\n';
        String str = this.f9315x1;
        int i2 = this.f9313kk;
        String strM67443x1 = C14113y2.m67443x1(str, i2, iM67385k4 - i2);
        this.f9313kk = iM67385k4 + (z ? 2 : 1);
        return strM67443x1;
    }

    @Override // com.aspose.slides.internal.p080dd.AbstractC3151yd
    /* JADX INFO: renamed from: to */
    public void mo13059to() {
        mo13428k4(true);
    }

    /* JADX INFO: renamed from: k4 */
    public static void m13426k4() {
        throw new ObjectDisposedException("StringReader", "Cannot read from a closed StringReader");
    }

    @Override // com.aspose.slides.internal.p080dd.AbstractC3151yd
    /* JADX INFO: renamed from: k4 */
    public void mo13428k4(boolean z) {
        this.f9315x1 = null;
        super.mo13428k4(z);
    }
}
