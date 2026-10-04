package com.aspose.slides;

import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14093tq;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: loaded from: classes3.dex */
final class bz0 {

    /* JADX INFO: renamed from: k4 */
    private final ParagraphFormat[] f4258k4;

    /* JADX INFO: renamed from: kk */
    private final TextStyle f4259kk;

    /* JADX INFO: renamed from: to */
    private long f4260to;

    /* JADX INFO: renamed from: x1 */
    private C14093tq<Integer> f4261x1;

    public bz0(ParagraphFormat paragraphFormat, TextStyle textStyle) {
        this.f4261x1 = new C14093tq<>();
        this.f4259kk = textStyle;
        this.f4261x1 = new C14093tq<>();
        ParagraphFormat[] paragraphFormatArr = new ParagraphFormat[10];
        this.f4258k4 = paragraphFormatArr;
        paragraphFormatArr[0] = paragraphFormat;
    }

    /* JADX INFO: renamed from: h4 */
    private void m4352h4() {
        this.f4260to++;
    }

    /* JADX INFO: renamed from: du */
    public final long m4353du() {
        long version = this.f4260to;
        for (ParagraphFormat paragraphFormat : this.f4258k4) {
            if (paragraphFormat != null) {
                version = ((version & 4294967295L) + (paragraphFormat.getVersion() & 4294967295L)) & 4294967295L;
            }
        }
        return version;
    }

    public boolean equals(Object obj) {
        TextStyle textStyle = (TextStyle) C7019kk.m27452k4(obj, TextStyle.class);
        if (textStyle == null) {
            return false;
        }
        int i = 0;
        while (true) {
            ParagraphFormat[] paragraphFormatArr = this.f4258k4;
            if (i >= paragraphFormatArr.length) {
                return true;
            }
            if (!C14067j2.m66728k4(paragraphFormatArr[i], textStyle.m2990to()[i])) {
                return false;
            }
            i++;
        }
    }

    public int hashCode() {
        return super.hashCode();
    }

    /* JADX INFO: renamed from: k4 */
    public final IParagraphFormat m4354k4() {
        return this.f4258k4[0];
    }

    /* JADX INFO: renamed from: kk */
    public final IParagraphFormat m4360kk(int i) {
        int i2 = i + 1;
        if (this.f4258k4[i2] == null) {
            m4366x1(i2);
        }
        return this.f4258k4[i2];
    }

    /* JADX INFO: renamed from: to */
    public final ParagraphFormat m4363to(int i) {
        int i2 = i + 1;
        if (this.f4258k4[i2] != null) {
            return new ParagraphFormat(this.f4258k4[i2], this.f4259kk);
        }
        return null;
    }

    public String toString() {
        return C14113y2.m67408k4("TextStyle: ", this.f4261x1.toString());
    }

    /* JADX INFO: renamed from: x1 */
    public final ParagraphFormat m4365x1(int i, ParagraphFormat paragraphFormat) {
        if (paragraphFormat == null) {
            return m4363to(i);
        }
        ParagraphFormat paragraphFormat2 = this.f4258k4[i + 1];
        return paragraphFormat2 != null ? paragraphFormat2.m2203to(paragraphFormat) : paragraphFormat;
    }

    /* JADX INFO: renamed from: k4 */
    public final IParagraphFormat m4355k4(int i) {
        return this.f4258k4[i + 1];
    }

    /* JADX INFO: renamed from: kk */
    public final C14093tq<Integer> m4361kk() {
        return this.f4261x1;
    }

    /* JADX INFO: renamed from: to */
    public final void m4364to() {
        int i = 0;
        while (i < 9) {
            i++;
            this.f4258k4[i] = null;
        }
    }

    /* JADX INFO: renamed from: x1 */
    public final void m4366x1(int i) {
        this.f4258k4[i] = new ParagraphFormat(this.f4259kk);
        m4352h4();
    }

    /* JADX INFO: renamed from: k4 */
    public final ParagraphFormat m4356k4(ParagraphFormat paragraphFormat) {
        return paragraphFormat == null ? m4363to(-1) : this.f4258k4[0].m2203to(paragraphFormat);
    }

    /* JADX INFO: renamed from: kk */
    public final void m4362kk(TextStyle textStyle) {
        for (int i = 0; i < textStyle.m2990to().length; i++) {
            if (textStyle.m2990to()[i] != null) {
                ParagraphFormat[] paragraphFormatArr = this.f4258k4;
                ParagraphFormat paragraphFormat = paragraphFormatArr[i];
                if (paragraphFormat != null) {
                    paragraphFormat.m2199kk(textStyle.m2990to()[i]);
                } else {
                    paragraphFormatArr[i] = new ParagraphFormat(textStyle.m2990to()[i], this.f4259kk);
                }
            }
        }
        m4352h4();
    }

    /* JADX INFO: renamed from: x1 */
    public final void m4367x1(TextStyle textStyle) {
        for (int i = 0; i < textStyle.m2990to().length; i++) {
            if (textStyle.m2990to()[i] != null) {
                ParagraphFormat[] paragraphFormatArr = this.f4258k4;
                if (paragraphFormatArr[i] == null) {
                    paragraphFormatArr[i] = new ParagraphFormat(this.f4259kk);
                }
                this.f4258k4[i].m2195k4((IParagraphFormat) textStyle.m2990to()[i]);
            } else {
                this.f4258k4[i] = null;
            }
        }
        m4352h4();
    }

    /* JADX INFO: renamed from: k4 */
    public final void m4357k4(int i, ParagraphFormat paragraphFormat) {
        this.f4258k4[i] = new ParagraphFormat(paragraphFormat, this.f4259kk);
        m4352h4();
    }

    /* JADX INFO: renamed from: x1 */
    public final ParagraphFormat[] m4368x1() {
        return this.f4258k4;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m4358k4(TextStyle textStyle) {
        for (int i = 0; i < textStyle.m2990to().length; i++) {
            if (textStyle.m2990to()[i] != null) {
                ParagraphFormat[] paragraphFormatArr = this.f4258k4;
                if (paragraphFormatArr[i] == null) {
                    paragraphFormatArr[i] = new ParagraphFormat(this.f4259kk);
                }
                this.f4258k4[i].m2196k4(textStyle.m2990to()[i]);
            } else {
                this.f4258k4[i] = null;
            }
        }
        m4352h4();
    }

    /* JADX INFO: renamed from: k4 */
    public final void m4359k4(C14093tq<Integer> c14093tq) {
        c14093tq.CloneTo(this.f4261x1);
    }
}
