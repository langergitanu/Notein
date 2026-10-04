package com.aspose.slides.p559ms.System.Xml;

import com.aspose.slides.PatternStyle;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.IndexOutOfRangeException;
import com.aspose.slides.exceptions.XmlException;
import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.aspose.slides.internal.p294n9.AbstractC6747ar;
import com.aspose.slides.internal.p463vm.C11683c5;
import com.aspose.slides.internal.p463vm.C11697x1;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.C14057f9;
import com.aspose.slides.p559ms.System.C14058fa;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.C14114y9;
import com.google.common.primitives.SignedBytes;
import com.google.common.primitives.UnsignedBytes;
import com.google.mlkit.p567nl.translate.TranslateLanguage;

/* JADX INFO: renamed from: com.aspose.slides.ms.System.Xml.ek */
/* JADX INFO: loaded from: classes5.dex */
public class C13891ek extends AbstractC13965r5 {

    /* JADX INFO: renamed from: ar */
    protected int f46461ar;

    /* JADX INFO: renamed from: bv */
    protected boolean f46462bv;

    /* JADX INFO: renamed from: c5 */
    protected int f46463c5;

    /* JADX INFO: renamed from: ck */
    protected int f46464ck;

    /* JADX INFO: renamed from: du */
    protected byte[] f46465du;

    /* JADX INFO: renamed from: dy */
    protected C14022y4 f46466dy;

    /* JADX INFO: renamed from: fa */
    protected int f46467fa;

    /* JADX INFO: renamed from: h4 */
    protected AbstractC3150x6 f46468h4;

    /* JADX INFO: renamed from: ix */
    protected boolean f46469ix;

    /* JADX INFO: renamed from: jd */
    protected int f46470jd;

    /* JADX INFO: renamed from: ks */
    protected boolean f46471ks;

    /* JADX INFO: renamed from: m9 */
    protected AbstractC6747ar f46472m9;

    /* JADX INFO: renamed from: ne */
    protected int f46473ne;

    /* JADX INFO: renamed from: qq */
    protected int f46474qq;

    /* JADX INFO: renamed from: rv */
    protected boolean f46475rv;

    /* JADX INFO: renamed from: u4 */
    protected boolean f46476u4;

    /* JADX INFO: renamed from: um */
    protected boolean f46477um;

    /* JADX INFO: renamed from: up */
    protected int f46478up;

    /* JADX INFO: renamed from: uz */
    protected String f46479uz;

    /* JADX INFO: renamed from: wl */
    protected boolean f46480wl;

    /* JADX INFO: renamed from: x6 */
    protected boolean f46481x6;

    /* JADX INFO: renamed from: yj */
    protected int f46482yj;

    public C13891ek(AbstractC3150x6 abstractC3150x6, C13907h0 c13907h0) {
        this(c13907h0);
        this.f46468h4 = abstractC3150x6;
        this.f46472m9 = c13907h0.m65424k4();
        this.f46465du = new byte[this.f46482yj + 32];
        if (!abstractC3150x6.canSeek() || abstractC3150x6.getPosition() == 0) {
            byte[] bArrMo26655dy = this.f46472m9.mo26655dy();
            if (bArrMo26655dy.length != 0) {
                C14058fa.m66593k4(AbstractC14092to.m67208k4((Object) bArrMo26655dy), 0, AbstractC14092to.m67208k4((Object) this.f46465du), 1, bArrMo26655dy.length);
                this.f46463c5 += bArrMo26655dy.length;
                this.f46470jd += bArrMo26655dy.length;
            }
        }
        if (c13907h0.m65443wl()) {
            mo21902k4(this.f46474qq);
            this.f46477um = true;
        }
    }

    /* JADX INFO: renamed from: c5 */
    public static int m65292c5(byte[] bArr, int i) {
        bArr[i] = 93;
        bArr[i + 1] = 93;
        bArr[i + 2] = 62;
        return i + 3;
    }

    /* JADX INFO: renamed from: du */
    public static int m65293du(byte[] bArr, int i) {
        bArr[i] = 38;
        bArr[i + 1] = 35;
        bArr[i + 2] = 120;
        bArr[i + 3] = 57;
        bArr[i + 4] = 59;
        return i + 5;
    }

    /* JADX INFO: renamed from: dy */
    public static int m65294dy(byte[] bArr, int i) {
        bArr[i] = 60;
        bArr[i + 1] = 33;
        bArr[i + 2] = 91;
        bArr[i + 3] = 67;
        bArr[i + 4] = 68;
        bArr[i + 5] = 65;
        bArr[i + 6] = 84;
        bArr[i + 7] = 65;
        bArr[i + 8] = 91;
        return i + 9;
    }

    /* JADX INFO: renamed from: h4 */
    public static int m65295h4(byte[] bArr, int i) {
        bArr[i] = 38;
        bArr[i + 1] = 35;
        bArr[i + 2] = 120;
        bArr[i + 3] = 65;
        bArr[i + 4] = 59;
        return i + 5;
    }

    /* JADX INFO: renamed from: k4 */
    public static int m65296k4(int i, byte[] bArr, int i2) {
        if (i < 2048) {
            bArr[i2] = (byte) ((i >> 6) | (-64));
        } else {
            bArr[i2] = (byte) ((i >> 12) | (-32));
            i2++;
            bArr[i2] = (byte) (((i >> 6) & 63) | (-128));
        }
        bArr[i2 + 1] = (byte) ((i & 63) | 128);
        return i2 + 2;
    }

    /* JADX INFO: renamed from: kk */
    public static int m65302kk(byte[] bArr, int i) {
        bArr[i] = 38;
        bArr[i + 1] = 97;
        bArr[i + 2] = 109;
        bArr[i + 3] = 112;
        bArr[i + 4] = 59;
        return i + 5;
    }

    /* JADX INFO: renamed from: m9 */
    public static int m65303m9(byte[] bArr, int i) {
        bArr[i] = 38;
        bArr[i + 1] = 35;
        bArr[i + 2] = 120;
        bArr[i + 3] = 68;
        bArr[i + 4] = 59;
        return i + 5;
    }

    /* JADX INFO: renamed from: to */
    public static int m65305to(byte[] bArr, int i) {
        bArr[i] = 38;
        bArr[i + 1] = 113;
        bArr[i + 2] = 117;
        bArr[i + 3] = 111;
        bArr[i + 4] = 116;
        bArr[i + 5] = 59;
        return i + 6;
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13965r5, com.aspose.slides.p559ms.System.Xml.AbstractC13958qb
    /* JADX INFO: renamed from: a_ */
    public void mo21891a_(char[] cArr, int i, int i2) {
        m65315m9(cArr, i, i2 + i);
        this.f46470jd = this.f46463c5;
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13965r5
    public boolean aa_() {
        return true;
    }

    public void ac_() {
        try {
            try {
                if (!this.f46471ks) {
                    this.f46468h4.write(this.f46465du, 1, this.f46463c5 - 1);
                }
            } catch (RuntimeException e) {
                this.f46471ks = true;
                throw e;
            }
        } finally {
            byte[] bArr = this.f46465du;
            byte b = bArr[this.f46463c5 - 1];
            bArr[0] = b;
            if (m65301k4(b)) {
                byte[] bArr2 = this.f46465du;
                int i = this.f46463c5;
                bArr2[1] = bArr2[i];
                bArr2[2] = bArr2[i + 1];
                bArr2[3] = bArr2[i + 2];
            }
            int i2 = this.f46470jd;
            int i3 = this.f46463c5;
            this.f46470jd = i2 == i3 ? 1 : 0;
            this.f46478up = this.f46478up == i3 ? 1 : 0;
            this.f46464ck = 0;
            this.f46467fa = 0;
            this.f46463c5 = 1;
        }
    }

    /* JADX INFO: renamed from: ck */
    public final void m65308ck(String str) {
        if (str.length() == 0) {
            if (this.f46463c5 >= this.f46482yj) {
                ac_();
                return;
            }
            return;
        }
        char[] cArrM67365dy = C14113y2.m67365dy(str);
        int length = str.length();
        byte[] bArr = this.f46465du;
        int iM65319x1 = this.f46463c5;
        int i = 0;
        char c = 0;
        while (true) {
            int i2 = (length - i) + iM65319x1;
            int i3 = this.f46482yj;
            if (i2 > i3) {
                i2 = i3;
            }
            while (iM65319x1 < i2) {
                byte[] bArr2 = this.f46466dy.f47099k4;
                char c2 = cArrM67365dy[i];
                if ((bArr2[c2] & UnsignedBytes.MAX_POWER_OF_TWO) == 0 || c2 == ']' || c2 > 127) {
                    c = c2;
                    break;
                }
                bArr[iM65319x1] = (byte) c2;
                iM65319x1++;
                i++;
                c = c2;
            }
            if (i >= length) {
                this.f46463c5 = iM65319x1;
                return;
            }
            if (iM65319x1 >= i2) {
                this.f46463c5 = iM65319x1;
                ac_();
                iM65319x1 = 1;
            } else {
                if (c != '\t') {
                    if (c != '\n') {
                        if (c != '\r') {
                            if (c != '\"' && c != '<') {
                                if (c == '>') {
                                    if (this.f46475rv && bArr[iM65319x1 - 1] == 93) {
                                        iM65319x1 = m65294dy(bArr, m65292c5(bArr, iM65319x1));
                                    }
                                    bArr[iM65319x1] = 62;
                                    iM65319x1++;
                                } else if (c == ']') {
                                    if (bArr[iM65319x1 - 1] == 93) {
                                        this.f46475rv = true;
                                    } else {
                                        this.f46475rv = false;
                                    }
                                    bArr[iM65319x1] = 93;
                                } else if (c != '&' && c != '\'') {
                                    if (C14022y4.m66325kk((int) c)) {
                                        iM65319x1 = m65300k4(cArrM67365dy, i, length, bArr, iM65319x1);
                                        i += 2;
                                    } else {
                                        iM65319x1 = (c <= 127 || c >= 65534) ? m65297k4((int) c, bArr, iM65319x1, false) : m65296k4(c, bArr, iM65319x1);
                                        i++;
                                    }
                                }
                            }
                        } else if (this.f46473ne == 0) {
                            int i4 = i + 1;
                            try {
                                if (cArrM67365dy[i4] == '\n') {
                                    i = i4;
                                }
                            } catch (IndexOutOfRangeException | ArrayIndexOutOfBoundsException unused) {
                            }
                            iM65319x1 = m65319x1(iM65319x1);
                        } else {
                            bArr[iM65319x1] = (byte) c;
                        }
                        iM65319x1++;
                    } else {
                        if (this.f46473ne != 0) {
                            bArr[iM65319x1] = (byte) c;
                            iM65319x1++;
                        }
                        iM65319x1 = m65319x1(iM65319x1);
                    }
                    i++;
                }
                bArr[iM65319x1] = (byte) c;
                iM65319x1++;
                i++;
            }
        }
    }

    /* JADX INFO: renamed from: jd */
    public final void m65311jd(String str) {
        char[] cArrM67365dy = C14113y2.m67365dy(str);
        m65310h4(cArrM67365dy, 0, cArrM67365dy.length);
    }

    /* JADX INFO: renamed from: x1 */
    public final int m65319x1(int i) {
        this.f46463c5 = i;
        m65311jd(this.f46479uz);
        return this.f46463c5;
    }

    public C13891ek(C13907h0 c13907h0) {
        this.f46466dy = C14022y4.m66318k4().Clone();
        this.f46463c5 = 1;
        this.f46470jd = 1;
        this.f46482yj = 6144;
        this.f46473ne = c13907h0.m65431kk();
        this.f46476u4 = c13907h0.m65445x1();
        this.f46479uz = c13907h0.m65438to();
        this.f46480wl = c13907h0.m65423jd();
        this.f46469ix = c13907h0.m65419dy();
        this.f46474qq = c13907h0.m65442uz();
        this.f46461ar = c13907h0.m65441up();
        this.f46462bv = c13907h0.m65446x6();
        if (this.f46480wl && this.f46473ne == 0) {
            m65313k4(this.f46479uz, "NewLineChars", false);
        }
    }

    /* JADX INFO: renamed from: k4 */
    private int m65297k4(int i, byte[] bArr, int i2, boolean z) {
        if (this.f46480wl) {
            throw C13850af.m65137x1((char) i, (char) 0);
        }
        if (z) {
            return m65299k4(bArr, i2, (char) i);
        }
        if (i >= 128) {
            return m65296k4(i, bArr, i2);
        }
        bArr[i2] = (byte) i;
        return i2 + 1;
    }

    /* JADX INFO: renamed from: m9 */
    private void m65304m9() {
    }

    /* JADX INFO: renamed from: x1 */
    public static int m65306x1(byte[] bArr, int i) {
        bArr[i] = 38;
        bArr[i + 1] = 103;
        bArr[i + 2] = 116;
        bArr[i + 3] = 59;
        return i + 4;
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13958qb
    /* JADX INFO: renamed from: du */
    public void mo21893du() {
        try {
            ac_();
            m65304m9();
            this.f46471ks = true;
            AbstractC3150x6 abstractC3150x6 = this.f46468h4;
            if (abstractC3150x6 != null) {
                try {
                    abstractC3150x6.flush();
                    try {
                        if (this.f46469ix) {
                            this.f46468h4.close();
                        }
                    } finally {
                    }
                } catch (Throwable th) {
                    try {
                        if (this.f46469ix) {
                            this.f46468h4.close();
                        }
                        throw th;
                    } finally {
                    }
                }
            }
        } catch (Throwable th2) {
            this.f46471ks = true;
            AbstractC3150x6 abstractC3150x62 = this.f46468h4;
            if (abstractC3150x62 != null) {
                try {
                    abstractC3150x62.flush();
                    try {
                        if (this.f46469ix) {
                            this.f46468h4.close();
                        }
                    } finally {
                    }
                } catch (Throwable th3) {
                    try {
                        if (this.f46469ix) {
                            this.f46468h4.close();
                        }
                        throw th3;
                    } finally {
                    }
                }
            }
            throw th2;
        }
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13965r5, com.aspose.slides.p559ms.System.Xml.AbstractC13958qb
    /* JADX INFO: renamed from: dy */
    public void mo21895dy(String str) {
        m65315m9(C14113y2.m67365dy(str), 0, str.length());
        this.f46470jd = this.f46463c5;
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13958qb
    /* JADX INFO: renamed from: h4 */
    public void mo21896h4() {
        ac_();
        m65304m9();
        AbstractC3150x6 abstractC3150x6 = this.f46468h4;
        if (abstractC3150x6 != null) {
            abstractC3150x6.flush();
        }
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13958qb
    /* JADX INFO: renamed from: kk */
    public void mo21910kk(String str) {
        byte[] bArr = this.f46465du;
        int i = this.f46463c5;
        this.f46463c5 = i + 1;
        bArr[i] = 38;
        m65311jd(str);
        byte[] bArr2 = this.f46465du;
        int i2 = this.f46463c5;
        int i3 = i2 + 1;
        this.f46463c5 = i3;
        bArr2[i2] = 59;
        if (i3 > this.f46482yj) {
            ac_();
        }
        this.f46470jd = this.f46463c5;
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13965r5
    /* JADX INFO: renamed from: to */
    public void mo65316to() {
        this.f46481x6 = false;
        byte[] bArr = this.f46465du;
        int i = this.f46463c5;
        int i2 = i + 1;
        this.f46463c5 = i2;
        bArr[i] = 34;
        this.f46478up = i2;
    }

    /* JADX INFO: renamed from: k4 */
    public static int m65298k4(byte[] bArr, int i) {
        bArr[i] = 38;
        bArr[i + 1] = 108;
        bArr[i + 2] = 116;
        bArr[i + 3] = 59;
        return i + 4;
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13965r5, com.aspose.slides.p559ms.System.Xml.AbstractC13958qb
    /* JADX INFO: renamed from: du */
    public void mo21894du(String str) {
        int i;
        if (this.f46462bv && (i = this.f46463c5) == this.f46467fa) {
            this.f46463c5 = i - 3;
        } else {
            byte[] bArr = this.f46465du;
            int i2 = this.f46463c5;
            int i3 = i2 + 1;
            this.f46463c5 = i3;
            bArr[i2] = 60;
            int i4 = i2 + 2;
            this.f46463c5 = i4;
            bArr[i3] = 33;
            int i5 = i2 + 3;
            this.f46463c5 = i5;
            bArr[i4] = 91;
            int i6 = i2 + 4;
            this.f46463c5 = i6;
            bArr[i5] = 67;
            int i7 = i2 + 5;
            this.f46463c5 = i7;
            bArr[i6] = 68;
            int i8 = i2 + 6;
            this.f46463c5 = i8;
            bArr[i7] = 65;
            int i9 = i2 + 7;
            this.f46463c5 = i9;
            bArr[i8] = 84;
            int i10 = i2 + 8;
            this.f46463c5 = i10;
            bArr[i9] = 65;
            this.f46463c5 = i2 + 9;
            bArr[i10] = 91;
        }
        m65308ck(str);
        byte[] bArr2 = this.f46465du;
        int i11 = this.f46463c5;
        int i12 = i11 + 1;
        this.f46463c5 = i12;
        bArr2[i11] = 93;
        int i13 = i11 + 2;
        this.f46463c5 = i13;
        bArr2[i12] = 93;
        int i14 = i11 + 3;
        this.f46463c5 = i14;
        bArr2[i13] = 62;
        this.f46470jd = i14;
        this.f46467fa = i14;
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13958qb
    /* JADX INFO: renamed from: h4 */
    public void mo21897h4(String str) {
        byte[] bArr = this.f46465du;
        int i = this.f46463c5;
        int i2 = i + 1;
        this.f46463c5 = i2;
        bArr[i] = 60;
        int i3 = i + 2;
        this.f46463c5 = i3;
        bArr[i2] = 33;
        int i4 = i + 3;
        this.f46463c5 = i4;
        bArr[i3] = PatternStyle.DottedGrid;
        this.f46463c5 = i + 4;
        bArr[i4] = PatternStyle.DottedGrid;
        m65312k4(str, 45);
        byte[] bArr2 = this.f46465du;
        int i5 = this.f46463c5;
        int i6 = i5 + 1;
        this.f46463c5 = i6;
        bArr2[i5] = PatternStyle.DottedGrid;
        int i7 = i5 + 2;
        this.f46463c5 = i7;
        bArr2[i6] = PatternStyle.DottedGrid;
        this.f46463c5 = i5 + 3;
        bArr2[i7] = 62;
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13965r5
    /* JADX INFO: renamed from: kk */
    public void mo21911kk(String str, String str2, String str3) {
        byte[] bArr = this.f46465du;
        int i = this.f46463c5;
        int i2 = i + 1;
        this.f46463c5 = i2;
        bArr[i] = 60;
        this.f46463c5 = i + 2;
        bArr[i2] = PatternStyle.Shingle;
        if (str != null && str.length() != 0) {
            m65311jd(str);
            byte[] bArr2 = this.f46465du;
            int i3 = this.f46463c5;
            this.f46463c5 = i3 + 1;
            bArr2[i3] = 58;
        }
        m65311jd(str2);
        byte[] bArr3 = this.f46465du;
        int i4 = this.f46463c5;
        this.f46463c5 = i4 + 1;
        bArr3[i4] = 62;
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13965r5, com.aspose.slides.p559ms.System.Xml.AbstractC13958qb
    /* JADX INFO: renamed from: m9 */
    public void mo21913m9(String str) {
        char[] cArrM67365dy = C14113y2.m67365dy(str);
        int length = cArrM67365dy.length;
        if (this.f46481x6) {
            m65318to(cArrM67365dy, 0, length);
        } else {
            m65309du(cArrM67365dy, 0, length);
        }
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13965r5
    /* JADX INFO: renamed from: to */
    public void mo65317to(String str) {
        if (str.length() == 0) {
            m65311jd(" xmlns=\"");
        } else {
            m65311jd(" xmlns:");
            m65311jd(str);
            byte[] bArr = this.f46465du;
            int i = this.f46463c5;
            int i2 = i + 1;
            this.f46463c5 = i2;
            bArr[i] = 61;
            this.f46463c5 = i + 2;
            bArr[i2] = 34;
        }
        this.f46481x6 = true;
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13958qb
    /* JADX INFO: renamed from: x1 */
    public void mo21917x1() {
        byte[] bArr = this.f46465du;
        int i = this.f46463c5;
        int i2 = i + 1;
        this.f46463c5 = i2;
        bArr[i] = 34;
        this.f46481x6 = false;
        this.f46478up = i2;
    }

    /* JADX INFO: renamed from: k4 */
    private static int m65299k4(byte[] bArr, int i, char c) {
        int i2;
        String strM66588k4 = C14057f9.m66588k4(c, "X", C11683c5.m55033ck());
        bArr[i] = 38;
        bArr[i + 1] = 35;
        bArr[i + 2] = 120;
        int i3 = i + 3;
        int i4 = 0;
        while (true) {
            i2 = i3 + 1;
            try {
                int i5 = i4 + 1;
                if (bArr[i3] != ((byte) C14113y2.m67365dy(strM66588k4)[i4])) {
                    break;
                }
                i3 = i2;
                i4 = i5;
            } catch (IndexOutOfRangeException | ArrayIndexOutOfBoundsException unused) {
            }
        }
        bArr[i3] = 59;
        return i2;
    }

    /* JADX INFO: renamed from: du */
    public final void m65309du(char[] cArr, int i, int i2) {
        byte[] bArr = this.f46465du;
        int iM65319x1 = this.f46463c5;
        char c = 0;
        while (true) {
            int i3 = (i2 - i) + iM65319x1;
            int i4 = this.f46482yj;
            if (i3 > i4) {
                i3 = i4;
            }
            while (iM65319x1 < i3) {
                byte[] bArr2 = this.f46466dy.f47099k4;
                char c2 = cArr[i];
                if ((bArr2[c2] & UnsignedBytes.MAX_POWER_OF_TWO) == 0 || c2 > 127) {
                    c = c2;
                    break;
                }
                bArr[iM65319x1] = (byte) c2;
                iM65319x1++;
                i++;
                c = c2;
            }
            if (i >= i2) {
                this.f46463c5 = iM65319x1;
                this.f46470jd = iM65319x1;
                this.f46464ck = 0;
                return;
            }
            if (iM65319x1 >= i3) {
                this.f46463c5 = iM65319x1;
                ac_();
                iM65319x1 = 1;
            } else {
                if (c != '\t') {
                    if (c == '\n') {
                        if (this.f46473ne != 0) {
                            bArr[iM65319x1] = (byte) c;
                            iM65319x1++;
                        }
                        iM65319x1 = m65319x1(iM65319x1);
                    } else if (c == '\r') {
                        int i5 = this.f46473ne;
                        if (i5 == 0) {
                            int i6 = i + 1;
                            try {
                                if (cArr[i6] == '\n') {
                                    i = i6;
                                }
                            } catch (IndexOutOfRangeException | ArrayIndexOutOfBoundsException unused) {
                            }
                            iM65319x1 = m65319x1(iM65319x1);
                        } else if (i5 == 1) {
                            iM65319x1 = m65303m9(bArr, iM65319x1);
                        } else if (i5 == 2) {
                            bArr[iM65319x1] = (byte) c;
                            iM65319x1++;
                        }
                    } else if (c != '\"') {
                        if (c == '<') {
                            iM65319x1 = m65298k4(bArr, iM65319x1);
                        } else if (c == '>') {
                            iM65319x1 = m65306x1(bArr, iM65319x1);
                        } else if (c == '&') {
                            iM65319x1 = m65302kk(bArr, iM65319x1);
                        } else if (c != '\'') {
                            if (C14022y4.m66325kk((int) c)) {
                                iM65319x1 = m65300k4(cArr, i, i2, bArr, iM65319x1);
                                i += 2;
                            } else {
                                iM65319x1 = (c <= 127 || c >= 65534) ? m65297k4((int) c, bArr, iM65319x1, true) : m65296k4(c, bArr, iM65319x1);
                                i++;
                            }
                        }
                    }
                    i++;
                }
                bArr[iM65319x1] = (byte) c;
                iM65319x1++;
                i++;
            }
        }
    }

    /* JADX INFO: renamed from: h4 */
    public final void m65310h4(char[] cArr, int i, int i2) {
        byte[] bArr = this.f46465du;
        int iM65300k4 = this.f46463c5;
        char c = 0;
        while (true) {
            int i3 = (i2 - i) + iM65300k4;
            int i4 = this.f46482yj;
            if (i3 > i4) {
                i3 = i4;
            }
            while (iM65300k4 < i3 && (c = cArr[i]) <= 127) {
                i++;
                bArr[iM65300k4] = (byte) c;
                iM65300k4++;
            }
            if (i >= i2) {
                this.f46463c5 = iM65300k4;
                return;
            }
            if (iM65300k4 >= i3) {
                this.f46463c5 = iM65300k4;
                ac_();
                iM65300k4 = 1;
            } else if (C14022y4.m66325kk((int) c)) {
                iM65300k4 = m65300k4(cArr, i, i2, bArr, iM65300k4);
                i += 2;
            } else {
                iM65300k4 = (c <= 127 || c >= 65534) ? m65297k4((int) c, bArr, iM65300k4, false) : m65296k4(c, bArr, iM65300k4);
                i++;
            }
        }
    }

    /* JADX INFO: renamed from: m9 */
    public final void m65315m9(char[] cArr, int i, int i2) {
        byte[] bArr = this.f46465du;
        int iM65319x1 = this.f46463c5;
        char c = 0;
        while (true) {
            int i3 = (i2 - i) + iM65319x1;
            int i4 = this.f46482yj;
            if (i3 > i4) {
                i3 = i4;
            }
            while (iM65319x1 < i3) {
                byte[] bArr2 = this.f46466dy.f47099k4;
                char c2 = cArr[i];
                if ((bArr2[c2] & SignedBytes.MAX_POWER_OF_TWO) == 0 || c2 > 127) {
                    c = c2;
                    break;
                }
                bArr[iM65319x1] = (byte) c2;
                iM65319x1++;
                i++;
                c = c2;
            }
            if (i >= i2) {
                this.f46463c5 = iM65319x1;
                return;
            }
            if (iM65319x1 >= i3) {
                this.f46463c5 = iM65319x1;
                ac_();
                iM65319x1 = 1;
            } else {
                if (c != '\t') {
                    if (c == '\n') {
                        if (this.f46473ne != 0) {
                            bArr[iM65319x1] = (byte) c;
                            iM65319x1++;
                        }
                        iM65319x1 = m65319x1(iM65319x1);
                    } else if (c != '\r') {
                        if (c != '&' && c != '<' && c != ']') {
                            if (C14022y4.m66325kk((int) c)) {
                                iM65319x1 = m65300k4(cArr, i, i2, bArr, iM65319x1);
                                i += 2;
                            } else {
                                iM65319x1 = (c <= 127 || c >= 65534) ? m65297k4((int) c, bArr, iM65319x1, false) : m65296k4(c, bArr, iM65319x1);
                                i++;
                            }
                        }
                    } else if (this.f46473ne == 0) {
                        int i5 = i + 1;
                        try {
                            if (cArr[i5] == '\n') {
                                i = i5;
                            }
                        } catch (IndexOutOfRangeException | ArrayIndexOutOfBoundsException unused) {
                        }
                        iM65319x1 = m65319x1(iM65319x1);
                    } else {
                        bArr[iM65319x1] = (byte) c;
                        iM65319x1++;
                    }
                    i++;
                }
                bArr[iM65319x1] = (byte) c;
                iM65319x1++;
                i++;
            }
        }
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13958qb
    /* JADX INFO: renamed from: to */
    public void mo21915to(String str, String str2, String str3) {
        int i = this.f46478up;
        int i2 = this.f46463c5;
        if (i == i2) {
            byte[] bArr = this.f46465du;
            this.f46463c5 = i2 + 1;
            bArr[i2] = 32;
        }
        if (str != null && str.length() > 0) {
            m65311jd(str);
            byte[] bArr2 = this.f46465du;
            int i3 = this.f46463c5;
            this.f46463c5 = i3 + 1;
            bArr2[i3] = 58;
        }
        m65311jd(str2);
        byte[] bArr3 = this.f46465du;
        int i4 = this.f46463c5;
        int i5 = i4 + 1;
        this.f46463c5 = i5;
        bArr3[i4] = 61;
        this.f46463c5 = i4 + 2;
        bArr3[i5] = 34;
        this.f46481x6 = true;
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13958qb
    /* JADX INFO: renamed from: x1 */
    public void mo21918x1(String str) {
        char[] cArrM67365dy = C14113y2.m67365dy(str);
        int length = cArrM67365dy.length;
        if (this.f46481x6) {
            m65318to(cArrM67365dy, 0, length);
        } else {
            m65309du(cArrM67365dy, 0, length);
        }
    }

    /* JADX INFO: renamed from: k4 */
    private static int m65300k4(char[] cArr, int i, int i2, byte[] bArr, int i3) {
        char c = cArr[i];
        if (c > 56319) {
            throw C13850af.m65136x1(c);
        }
        int i4 = i + 1;
        if (i4 >= i2) {
            throw new ArgumentException(C13968ri.m65818k4("The surrogate pair is invalid. Missing a low surrogate character."));
        }
        char c2 = cArr[i4];
        if (c2 < 56320 || c2 > 57343) {
            throw C13850af.m65078k4(c2, c);
        }
        int iM66317k4 = C14022y4.m66317k4(c2, c);
        bArr[i3] = (byte) ((iM66317k4 >> 18) | 240);
        bArr[i3 + 1] = (byte) (((iM66317k4 >> 12) & 63) | 128);
        bArr[i3 + 2] = (byte) (((iM66317k4 >> 6) & 63) | 128);
        bArr[i3 + 3] = (byte) ((iM66317k4 & 63) | 128);
        return i3 + 4;
    }

    /* JADX INFO: renamed from: to */
    public final void m65318to(char[] cArr, int i, int i2) {
        byte[] bArr = this.f46465du;
        int iM65293du = this.f46463c5;
        char c = 0;
        while (true) {
            int i3 = (i2 - i) + iM65293du;
            int i4 = this.f46482yj;
            if (i3 > i4) {
                i3 = i4;
            }
            while (iM65293du < i3) {
                byte[] bArr2 = this.f46466dy.f47099k4;
                char c2 = cArr[i];
                if ((bArr2[c2] & UnsignedBytes.MAX_POWER_OF_TWO) == 0 || c2 > 127) {
                    c = c2;
                    break;
                }
                bArr[iM65293du] = (byte) c2;
                iM65293du++;
                i++;
                c = c2;
            }
            if (i >= i2) {
                this.f46463c5 = iM65293du;
                return;
            }
            if (iM65293du >= i3) {
                this.f46463c5 = iM65293du;
                ac_();
                iM65293du = 1;
            } else if (c != '\t') {
                if (c != '\n') {
                    if (c != '\r') {
                        if (c == '\"') {
                            iM65293du = m65305to(bArr, iM65293du);
                        } else if (c == '<') {
                            iM65293du = m65298k4(bArr, iM65293du);
                        } else if (c == '>') {
                            iM65293du = m65306x1(bArr, iM65293du);
                        } else if (c == '&') {
                            iM65293du = m65302kk(bArr, iM65293du);
                        } else if (c == '\'') {
                            bArr[iM65293du] = (byte) c;
                            iM65293du++;
                        } else if (C14022y4.m66325kk((int) c)) {
                            iM65293du = m65300k4(cArr, i, i2, bArr, iM65293du);
                            i += 2;
                        } else {
                            iM65293du = (c <= 127 || c >= 65534) ? m65297k4((int) c, bArr, iM65293du, true) : m65296k4(c, bArr, iM65293du);
                        }
                        i++;
                    } else if (this.f46473ne == 2) {
                        bArr[iM65293du] = (byte) c;
                        iM65293du++;
                        i++;
                    } else {
                        iM65293du = m65303m9(bArr, iM65293du);
                        i++;
                    }
                } else if (this.f46473ne == 2) {
                    bArr[iM65293du] = (byte) c;
                    iM65293du++;
                    i++;
                } else {
                    iM65293du = m65295h4(bArr, iM65293du);
                    i++;
                }
            } else if (this.f46473ne == 2) {
                bArr[iM65293du] = (byte) c;
                iM65293du++;
                i++;
            } else {
                iM65293du = m65293du(bArr, iM65293du);
                i++;
            }
        }
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13965r5
    /* JADX INFO: renamed from: x1 */
    public void mo21919x1(String str, String str2) {
        mo65317to(str);
        mo21918x1(str2);
        mo65316to();
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13965r5
    /* JADX INFO: renamed from: k4 */
    public void mo21899k4() {
        byte[] bArr = this.f46465du;
        int i = this.f46463c5;
        int i2 = i + 1;
        this.f46463c5 = i2;
        bArr[i] = 62;
        this.f46464ck = i2;
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13965r5
    /* JADX INFO: renamed from: x1 */
    public void mo21920x1(String str, String str2, String str3) {
        int i = this.f46464ck;
        int i2 = this.f46463c5;
        if (i == i2) {
            byte[] bArr = this.f46465du;
            this.f46463c5 = i2;
            bArr[i2 - 1] = 32;
            int i3 = i2 + 1;
            this.f46463c5 = i3;
            bArr[i2] = PatternStyle.Shingle;
            this.f46463c5 = i2 + 2;
            bArr[i3] = 62;
            return;
        }
        byte[] bArr2 = this.f46465du;
        int i4 = i2 + 1;
        this.f46463c5 = i4;
        bArr2[i2] = 60;
        this.f46463c5 = i2 + 2;
        bArr2[i4] = PatternStyle.Shingle;
        if (str != null && str.length() != 0) {
            m65311jd(str);
            byte[] bArr3 = this.f46465du;
            int i5 = this.f46463c5;
            this.f46463c5 = i5 + 1;
            bArr3[i5] = 58;
        }
        m65311jd(str2);
        byte[] bArr4 = this.f46465du;
        int i6 = this.f46463c5;
        this.f46463c5 = i6 + 1;
        bArr4[i6] = 62;
    }

    /* JADX INFO: renamed from: x1 */
    public static void m65307x1(char[] cArr, int[] iArr, int i, byte[] bArr, int[] iArr2) {
        char c = cArr[iArr[0]];
        if (c <= 127) {
            int i2 = iArr2[0];
            bArr[i2] = (byte) c;
            iArr2[0] = i2 + 1;
            iArr[0] = iArr[0] + 1;
            return;
        }
        if (C14022y4.m66325kk((int) c)) {
            iArr2[0] = m65300k4(cArr, iArr[0], i, bArr, iArr2[0]);
            iArr[0] = iArr[0] + 2;
        } else {
            iArr2[0] = m65296k4(c, bArr, iArr2[0]);
            iArr[0] = iArr[0] + 1;
        }
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13965r5, com.aspose.slides.p559ms.System.Xml.AbstractC13958qb
    /* JADX INFO: renamed from: k4 */
    public void mo21900k4(char c) {
        String strM66588k4 = C14057f9.m66588k4(c, "X", C11683c5.m55033ck());
        if (this.f46480wl && !this.f46466dy.m66329du(c)) {
            throw C13850af.m65137x1(c, (char) 0);
        }
        byte[] bArr = this.f46465du;
        int i = this.f46463c5;
        int i2 = i + 1;
        this.f46463c5 = i2;
        bArr[i] = 38;
        int i3 = i + 2;
        this.f46463c5 = i3;
        bArr[i2] = 35;
        this.f46463c5 = i + 3;
        bArr[i3] = 120;
        m65311jd(strM66588k4);
        byte[] bArr2 = this.f46465du;
        int i4 = this.f46463c5;
        int i5 = i4 + 1;
        this.f46463c5 = i5;
        bArr2[i4] = 59;
        if (i5 > this.f46482yj) {
            ac_();
        }
        this.f46470jd = this.f46463c5;
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13965r5, com.aspose.slides.p559ms.System.Xml.AbstractC13958qb
    /* JADX INFO: renamed from: k4 */
    public void mo21901k4(char c, char c2) {
        int iM66317k4 = C14022y4.m66317k4(c, c2);
        byte[] bArr = this.f46465du;
        int i = this.f46463c5;
        int i2 = i + 1;
        this.f46463c5 = i2;
        bArr[i] = 38;
        int i3 = i + 2;
        this.f46463c5 = i3;
        bArr[i2] = 35;
        this.f46463c5 = i + 3;
        bArr[i3] = 120;
        m65311jd(C14057f9.m66588k4(iM66317k4, "X", C11683c5.m55033ck()));
        byte[] bArr2 = this.f46465du;
        int i4 = this.f46463c5;
        int i5 = i4 + 1;
        this.f46463c5 = i5;
        bArr2[i4] = 59;
        this.f46470jd = i5;
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13965r5
    /* JADX INFO: renamed from: k4 */
    public void mo21902k4(int i) {
        if (this.f46476u4 || this.f46477um) {
            return;
        }
        m65311jd("<?xml version=\"");
        m65311jd("1.0");
        if (this.f46472m9 != null) {
            m65311jd("\" encoding=\"");
            m65311jd(this.f46472m9.mo26657jd());
        }
        if (i != 0) {
            m65311jd("\" standalone=\"");
            m65311jd(i == 1 ? "yes" : TranslateLanguage.NORWEGIAN);
        }
        m65311jd("\"?>");
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13965r5
    /* JADX INFO: renamed from: k4 */
    public void mo21905k4(String str) {
        if (this.f46476u4 || this.f46477um) {
            return;
        }
        mo21907k4("xml", str);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m65312k4(String str, int i) {
        int i2;
        int i3;
        int i4;
        if (str.length() == 0) {
            if (this.f46463c5 >= this.f46482yj) {
                ac_();
                return;
            }
            return;
        }
        char[] cArrM67365dy = C14113y2.m67365dy(str);
        int length = str.length();
        byte[] bArr = this.f46465du;
        int iM65319x1 = this.f46463c5;
        int i5 = 0;
        char c = 0;
        while (true) {
            int i6 = (length - i5) + iM65319x1;
            int i7 = this.f46482yj;
            if (i6 > i7) {
                i6 = i7;
            }
            while (iM65319x1 < i6) {
                byte[] bArr2 = this.f46466dy.f47099k4;
                char c2 = cArrM67365dy[i5];
                if ((bArr2[c2] & SignedBytes.MAX_POWER_OF_TWO) == 0 || c2 == i || c2 > 127) {
                    c = c2;
                    break;
                }
                bArr[iM65319x1] = (byte) c2;
                iM65319x1++;
                i5++;
                c = c2;
            }
            if (i5 >= length) {
                this.f46463c5 = iM65319x1;
                return;
            }
            if (iM65319x1 >= i6) {
                this.f46463c5 = iM65319x1;
                ac_();
                iM65319x1 = 1;
            } else {
                if (c != '\t') {
                    if (c != '\n') {
                        if (c != '\r') {
                            if (c != '&') {
                                if (c == '-') {
                                    bArr[iM65319x1] = PatternStyle.DottedGrid;
                                    i2 = iM65319x1 + 1;
                                    if (c == i && ((i3 = i5 + 1) == length || cArrM67365dy[i3] == '-')) {
                                        bArr[i2] = 32;
                                        iM65319x1 += 2;
                                    }
                                    iM65319x1 = i2;
                                } else if (c != '<') {
                                    if (c == '?') {
                                        bArr[iM65319x1] = 63;
                                        i2 = iM65319x1 + 1;
                                        if (c == i && (i4 = i5 + 1) < length && cArrM67365dy[i4] == '>') {
                                            bArr[i2] = 32;
                                            iM65319x1 += 2;
                                        }
                                        iM65319x1 = i2;
                                    } else if (c == ']') {
                                        bArr[iM65319x1] = 93;
                                    } else if (C14022y4.m66325kk((int) c)) {
                                        iM65319x1 = m65300k4(cArrM67365dy, i5, length, bArr, iM65319x1);
                                        i5 += 2;
                                    } else {
                                        iM65319x1 = (c <= 127 || c >= 65534) ? m65297k4((int) c, bArr, iM65319x1, false) : m65296k4(c, bArr, iM65319x1);
                                        i5++;
                                    }
                                }
                            }
                        } else if (this.f46473ne == 0) {
                            int i8 = i5 + 1;
                            try {
                                if (cArrM67365dy[i8] == '\n') {
                                    i5 = i8;
                                }
                            } catch (IndexOutOfRangeException | ArrayIndexOutOfBoundsException unused) {
                            }
                            iM65319x1 = m65319x1(iM65319x1);
                        } else {
                            bArr[iM65319x1] = (byte) c;
                        }
                        iM65319x1++;
                    } else {
                        if (this.f46473ne != 0) {
                            bArr[iM65319x1] = (byte) c;
                            iM65319x1++;
                        }
                        iM65319x1 = m65319x1(iM65319x1);
                    }
                    i5++;
                }
                bArr[iM65319x1] = (byte) c;
                iM65319x1++;
                i5++;
            }
        }
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13958qb
    /* JADX INFO: renamed from: k4 */
    public void mo21907k4(String str, String str2) {
        byte[] bArr = this.f46465du;
        int i = this.f46463c5;
        int i2 = i + 1;
        this.f46463c5 = i2;
        bArr[i] = 60;
        this.f46463c5 = i + 2;
        bArr[i2] = 63;
        m65311jd(str);
        if (str2.length() > 0) {
            byte[] bArr2 = this.f46465du;
            int i3 = this.f46463c5;
            this.f46463c5 = i3 + 1;
            bArr2[i3] = 32;
            m65312k4(str2, 63);
        }
        byte[] bArr3 = this.f46465du;
        int i4 = this.f46463c5;
        int i5 = i4 + 1;
        this.f46463c5 = i5;
        bArr3[i4] = 63;
        this.f46463c5 = i4 + 2;
        bArr3[i5] = 62;
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13958qb
    /* JADX INFO: renamed from: k4 */
    public void mo12953k4(String str, String str2, String str3) {
        byte[] bArr = this.f46465du;
        int i = this.f46463c5;
        this.f46463c5 = i + 1;
        bArr[i] = 60;
        if (str != null && str.length() != 0) {
            m65311jd(str);
            byte[] bArr2 = this.f46465du;
            int i2 = this.f46463c5;
            this.f46463c5 = i2 + 1;
            bArr2[i2] = 58;
        }
        m65311jd(str2);
        this.f46478up = this.f46463c5;
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13965r5, com.aspose.slides.p559ms.System.Xml.AbstractC13958qb
    /* JADX INFO: renamed from: k4 */
    public void mo21908k4(String str, String str2, String str3, String str4) {
        m65311jd("<!DOCTYPE ");
        m65311jd(str);
        if (str2 != null) {
            m65311jd(" PUBLIC \"");
            m65311jd(str2);
            m65311jd("\" \"");
            if (str3 != null) {
                m65311jd(str3);
            }
            byte[] bArr = this.f46465du;
            int i = this.f46463c5;
            this.f46463c5 = i + 1;
            bArr[i] = 34;
        } else if (str3 != null) {
            m65311jd(" SYSTEM \"");
            m65311jd(str3);
            byte[] bArr2 = this.f46465du;
            int i2 = this.f46463c5;
            this.f46463c5 = i2 + 1;
            bArr2[i2] = 34;
        } else {
            byte[] bArr3 = this.f46465du;
            int i3 = this.f46463c5;
            this.f46463c5 = i3 + 1;
            bArr3[i3] = 32;
        }
        if (str4 != null) {
            byte[] bArr4 = this.f46465du;
            int i4 = this.f46463c5;
            this.f46463c5 = i4 + 1;
            bArr4[i4] = 91;
            m65311jd(str4);
            byte[] bArr5 = this.f46465du;
            int i5 = this.f46463c5;
            this.f46463c5 = i5 + 1;
            bArr5[i5] = 93;
        }
        byte[] bArr6 = this.f46465du;
        int i6 = this.f46463c5;
        this.f46463c5 = i6 + 1;
        bArr6[i6] = 62;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m65313k4(String str, String str2, boolean z) {
        char cCharAt;
        if (z) {
            if (!this.f46466dy.m66334k4(str)) {
                throw new ArgumentException(C13968ri.m65819k4("XmlWriterSettings.{0} can contain only valid XML white space characters when XmlWriterSettings.CheckCharacters and XmlWriterSettings.NewLineOnAttributes are true.", str2));
            }
            return;
        }
        int i = 0;
        while (i < str.length()) {
            if (!this.f46466dy.m66337m9(str.charAt(i)) && (cCharAt = str.charAt(i)) != '\t' && cCharAt != '\n' && cCharAt != '\r') {
                if (cCharAt == '&' || cCharAt == '<' || cCharAt == ']') {
                    throw new ArgumentException(C13968ri.m65819k4("XmlWriterSettings.{0} can contain only valid XML text content characters when XmlWriterSettings.CheckCharacters is true. {1}", str2, C13968ri.m65819k4("'{0}', hexadecimal value {1}, is an invalid character.", XmlException.buildCharExceptionArgs(str, i))));
                }
                if (C14022y4.m66321k4((int) str.charAt(i))) {
                    i++;
                    if (i >= str.length() || !C14022y4.m66327x1((int) str.charAt(i))) {
                        throw new ArgumentException(C13968ri.m65819k4("XmlWriterSettings.{0} can contain only valid XML text content characters when XmlWriterSettings.CheckCharacters is true. {1}", str2, C13968ri.m65818k4("The surrogate pair is invalid. Missing a low surrogate character.")));
                    }
                } else if (C14022y4.m66327x1((int) str.charAt(i))) {
                    throw new ArgumentException(C13968ri.m65819k4("XmlWriterSettings.{0} can contain only valid XML text content characters when XmlWriterSettings.CheckCharacters is true. {1}", str2, C13968ri.m65819k4("Invalid high surrogate character (0x{0}). A high surrogate character must have a value from range (0xD800 - 0xDBFF).", C14114y9.m67461k4(str.charAt(i), "X", C11697x1.m55250kk()))));
                }
            }
            i++;
        }
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13965r5, com.aspose.slides.p559ms.System.Xml.AbstractC13958qb
    /* JADX INFO: renamed from: k4 */
    public void mo21909k4(char[] cArr, int i, int i2) {
        int i3 = i2 + i;
        if (this.f46481x6) {
            m65318to(cArr, i, i3);
        } else {
            m65309du(cArr, i, i3);
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m65314k4(char[] cArr, int[] iArr, int i, byte[] bArr, int[] iArr2) {
        char c = cArr[iArr[0]];
        if (C14022y4.m66325kk((int) c)) {
            iArr2[0] = m65300k4(cArr, iArr[0], i, bArr, iArr2[0]);
            iArr[0] = iArr[0] + 2;
        } else if (c <= 127 || c >= 65534) {
            iArr2[0] = m65297k4((int) c, bArr, iArr2[0], false);
            iArr[0] = iArr[0] + 1;
        } else {
            iArr2[0] = m65296k4(c, bArr, iArr2[0]);
            iArr[0] = iArr[0] + 1;
        }
    }

    /* JADX INFO: renamed from: k4 */
    private static boolean m65301k4(byte b) {
        return (b & 248) == 240;
    }
}
