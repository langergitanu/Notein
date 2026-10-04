package com.aspose.slides.p559ms.System.Xml;

import com.aspose.slides.PatternStyle;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.aspose.slides.p559ms.System.C14113y2;
import com.google.common.primitives.UnsignedBytes;

/* JADX INFO: renamed from: com.aspose.slides.ms.System.Xml.xk */
/* JADX INFO: loaded from: classes5.dex */
public class C14017xk extends C13891ek {

    /* JADX INFO: renamed from: kk */
    protected static C13921jw f47082kk;

    /* JADX INFO: renamed from: to */
    protected static C13921jw f47083to;

    /* JADX INFO: renamed from: b3 */
    private String f47084b3;

    /* JADX INFO: renamed from: k4 */
    protected C13887dy f47085k4;

    /* JADX INFO: renamed from: lr */
    private boolean f47086lr;

    /* JADX INFO: renamed from: v4 */
    private long f47087v4;

    /* JADX INFO: renamed from: wy */
    private boolean f47088wy;

    /* JADX INFO: renamed from: x1 */
    protected long f47089x1;

    /* JADX INFO: renamed from: yd */
    private byte[] f47090yd;

    public C14017xk(AbstractC3150x6 abstractC3150x6, C13907h0 c13907h0) {
        super(abstractC3150x6, c13907h0);
        m66310k4(c13907h0);
    }

    /* JADX INFO: renamed from: c5 */
    private void m66308c5(char[] cArr, int i, int i2) {
        int i3;
        if (this.f47086lr) {
            if (i2 - i > 0 && cArr[i] != '{') {
                m66311m9();
            }
            this.f47086lr = false;
        }
        byte[] bArr = this.f46465du;
        int iM65295h4 = this.f46463c5;
        char c = 0;
        while (true) {
            int i4 = (i2 - i) + iM65295h4;
            int i5 = this.f46482yj;
            if (i4 > i5) {
                i4 = i5;
            }
            while (iM65295h4 < i4) {
                byte[] bArr2 = this.f46466dy.f47099k4;
                char c2 = cArr[i];
                if ((bArr2[c2] & UnsignedBytes.MAX_POWER_OF_TWO) == 0 || c2 >= 128) {
                    c = c2;
                    break;
                }
                bArr[iM65295h4] = (byte) c2;
                i++;
                iM65295h4++;
                c = c2;
            }
            if (i >= i2) {
                this.f46463c5 = iM65295h4;
                return;
            }
            if (iM65295h4 >= i4) {
                this.f46463c5 = iM65295h4;
                ac_();
                iM65295h4 = 1;
            } else {
                if (c != '\t') {
                    if (c == '\n') {
                        iM65295h4 = C13891ek.m65295h4(bArr, iM65295h4);
                    } else if (c == '\r') {
                        iM65295h4 = C13891ek.m65303m9(bArr, iM65295h4);
                    } else if (c == '\"') {
                        iM65295h4 = C13891ek.m65305to(bArr, iM65295h4);
                    } else if (c != '<' && c != '>') {
                        if (c == '&') {
                            int i6 = i + 1;
                            if (i6 == i2) {
                                this.f47086lr = true;
                            } else if (cArr[i6] != '{') {
                                iM65295h4 = C13891ek.m65302kk(bArr, iM65295h4);
                            }
                            i3 = iM65295h4 + 1;
                            bArr[iM65295h4] = (byte) c;
                            iM65295h4 = i3;
                        } else if (c != '\'') {
                            C13891ek.m65307x1(cArr, new int[]{i}, i2, this.f47090yd, new int[]{0});
                        }
                    }
                    i++;
                }
                i3 = iM65295h4 + 1;
                bArr[iM65295h4] = (byte) c;
                iM65295h4 = i3;
                i++;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x0085  */
    /* JADX INFO: renamed from: dy */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void m66309dy(char[] cArr, int i, int i2) {
        char c;
        char[] cArr2;
        int i3;
        int iM65295h4;
        if (this.f47086lr) {
            if (i2 - i > 0 && cArr[i] != '{') {
                m66311m9();
            }
            this.f47086lr = false;
        }
        byte[] bArr = this.f46465du;
        int i4 = this.f46463c5;
        char c2 = 0;
        while (true) {
            int i5 = (i2 - i) + i4;
            int i6 = this.f46482yj;
            if (i5 > i6) {
                i5 = i6;
            }
            while (i4 < i5) {
                byte[] bArr2 = this.f46466dy.f47099k4;
                char c3 = cArr[i];
                if ((bArr2[c3] & UnsignedBytes.MAX_POWER_OF_TWO) == 0 || c3 > 127) {
                    c = c3;
                    break;
                }
                bArr[i4] = (byte) c3;
                i++;
                i4++;
                c2 = c3;
            }
            c = c2;
            if (i >= i2) {
                this.f46463c5 = i4;
                return;
            }
            if (i4 >= i5) {
                this.f46463c5 = i4;
                ac_();
                i4 = 1;
            } else if (c == '\t') {
                cArr2 = cArr;
                i3 = i2;
                iM65295h4 = i4 + 1;
                bArr[i4] = (byte) c;
                i4 = iM65295h4;
                i++;
                cArr = cArr2;
                i2 = i3;
            } else {
                if (c == '\n') {
                    cArr2 = cArr;
                    i3 = i2;
                    iM65295h4 = C13891ek.m65295h4(bArr, i4);
                } else if (c == '\r') {
                    cArr2 = cArr;
                    i3 = i2;
                    iM65295h4 = C13891ek.m65303m9(bArr, i4);
                } else if (c == '\"') {
                    cArr2 = cArr;
                    i3 = i2;
                    iM65295h4 = C13891ek.m65305to(bArr, i4);
                } else if (c != '<' && c != '>') {
                    if (c != '&') {
                        if (c != '\'') {
                            int[] iArr = {i};
                            int[] iArr2 = {i4};
                            char[] cArr3 = cArr;
                            m65314k4(cArr3, iArr, i2, bArr, iArr2);
                            i = iArr[0];
                            i4 = iArr2[0];
                            cArr = cArr3;
                        }
                        cArr2 = cArr;
                        i3 = i2;
                        iM65295h4 = i4 + 1;
                        bArr[i4] = (byte) c;
                    } else {
                        cArr2 = cArr;
                        i3 = i2;
                        int i7 = i + 1;
                        if (i7 == i3) {
                            this.f47086lr = true;
                        } else if (cArr2[i7] != '{') {
                            iM65295h4 = C13891ek.m65302kk(bArr, i4);
                        }
                        iM65295h4 = i4 + 1;
                        bArr[i4] = (byte) c;
                    }
                }
                i4 = iM65295h4;
                i++;
                cArr = cArr2;
                i2 = i3;
            }
            c2 = c;
        }
    }

    /* JADX INFO: renamed from: m9 */
    private void m66311m9() {
        byte[] bArr = this.f46465du;
        int i = this.f46463c5;
        int i2 = i + 1;
        this.f46463c5 = i2;
        bArr[i] = 97;
        int i3 = i + 2;
        this.f46463c5 = i3;
        bArr[i2] = 109;
        int i4 = i + 3;
        this.f46463c5 = i4;
        bArr[i3] = 112;
        this.f46463c5 = i + 4;
        bArr[i4] = 59;
    }

    @Override // com.aspose.slides.p559ms.System.Xml.C13891ek, com.aspose.slides.p559ms.System.Xml.AbstractC13965r5
    /* JADX INFO: renamed from: k4 */
    public void mo21899k4() {
        byte[] bArr = this.f46465du;
        int i = this.f46463c5;
        int i2 = i + 1;
        this.f46463c5 = i2;
        bArr[i] = 62;
        this.f46464ck = i2;
        if ((this.f47089x1 & 32) != 0) {
            m66312kk();
        }
    }

    /* JADX INFO: renamed from: kk */
    public final void m66312kk() {
        m65311jd("<META http-equiv=\"Content-Type\"");
        if (this.f47084b3 == null) {
            this.f47084b3 = "text/html";
        }
        m65311jd(" content=\"");
        m65311jd(this.f47084b3);
        m65311jd("; charset=");
        m65311jd(this.f46472m9.mo26657jd());
        m65311jd("\">");
    }

    @Override // com.aspose.slides.p559ms.System.Xml.C13891ek, com.aspose.slides.p559ms.System.Xml.AbstractC13958qb
    /* JADX INFO: renamed from: to */
    public void mo21915to(String str, String str2, String str3) {
        if (str3.length() == 0) {
            int i = this.f46478up;
            int i2 = this.f46463c5;
            if (i == i2) {
                byte[] bArr = this.f46465du;
                this.f46463c5 = i2 + 1;
                bArr[i2] = 32;
            }
            m65311jd(str2);
            if ((this.f47089x1 & 7) != 0) {
                long jM65496k4 = ((long) (f47083to.m65496k4(str2) & 255)) & this.f47089x1 & 4294967295L;
                this.f47087v4 = jM65496k4;
                if ((jM65496k4 & 2) != 0) {
                    this.f46481x6 = true;
                    return;
                }
            } else {
                this.f47087v4 = 0L;
            }
            byte[] bArr2 = this.f46465du;
            int i3 = this.f46463c5;
            int i4 = i3 + 1;
            this.f46463c5 = i4;
            bArr2[i3] = 61;
            this.f46463c5 = i3 + 2;
            bArr2[i4] = 34;
        } else {
            super.mo21915to(str, str2, str3);
            this.f47087v4 = 0L;
        }
        this.f46481x6 = true;
    }

    @Override // com.aspose.slides.p559ms.System.Xml.C13891ek, com.aspose.slides.p559ms.System.Xml.AbstractC13958qb
    /* JADX INFO: renamed from: x1 */
    public void mo21917x1() {
        if ((this.f47087v4 & 2) != 0) {
            this.f46478up = this.f46463c5;
        } else {
            if (this.f47086lr) {
                m66311m9();
                this.f47086lr = false;
            }
            byte[] bArr = this.f46465du;
            int i = this.f46463c5;
            this.f46463c5 = i + 1;
            bArr[i] = 34;
        }
        this.f46481x6 = false;
        this.f46478up = this.f46463c5;
    }

    @Override // com.aspose.slides.p559ms.System.Xml.C13891ek, com.aspose.slides.p559ms.System.Xml.AbstractC13965r5, com.aspose.slides.p559ms.System.Xml.AbstractC13958qb
    /* JADX INFO: renamed from: k4 */
    public void mo21900k4(char c) {
        throw new InvalidOperationException(C13968ri.m65818k4("Operation is not valid due to the current state of the object."));
    }

    @Override // com.aspose.slides.p559ms.System.Xml.C13891ek, com.aspose.slides.p559ms.System.Xml.AbstractC13958qb
    /* JADX INFO: renamed from: kk */
    public void mo21910kk(String str) {
        throw new InvalidOperationException(C13968ri.m65818k4("Operation is not valid due to the current state of the object."));
    }

    @Override // com.aspose.slides.p559ms.System.Xml.C13891ek, com.aspose.slides.p559ms.System.Xml.AbstractC13958qb
    /* JADX INFO: renamed from: x1 */
    public void mo21918x1(String str) {
        char[] cArrM67365dy = C14113y2.m67365dy(str);
        int length = cArrM67365dy.length;
        if (this.f46481x6) {
            m66313kk(cArrM67365dy, 0, length);
        } else {
            m66314x1(cArrM67365dy, 0, length);
        }
    }

    @Override // com.aspose.slides.p559ms.System.Xml.C13891ek, com.aspose.slides.p559ms.System.Xml.AbstractC13965r5, com.aspose.slides.p559ms.System.Xml.AbstractC13958qb
    /* JADX INFO: renamed from: k4 */
    public void mo21901k4(char c, char c2) {
        throw new InvalidOperationException(C13968ri.m65818k4("Operation is not valid due to the current state of the object."));
    }

    @Override // com.aspose.slides.p559ms.System.Xml.C13891ek, com.aspose.slides.p559ms.System.Xml.AbstractC13965r5
    /* JADX INFO: renamed from: kk */
    public void mo21911kk(String str, String str2, String str3) {
        if (str3.length() != 0) {
            super.mo21911kk(str, str2, str3);
        } else if ((this.f47089x1 & 8) == 0) {
            byte[] bArr = this.f46465du;
            int i = this.f46463c5;
            int i2 = i + 1;
            this.f46463c5 = i2;
            bArr[i] = 60;
            this.f46463c5 = i + 2;
            bArr[i2] = PatternStyle.Shingle;
            m65311jd(str2);
            byte[] bArr2 = this.f46465du;
            int i3 = this.f46463c5;
            this.f46463c5 = i3 + 1;
            bArr2[i3] = 62;
        }
        this.f47089x1 = this.f47085k4.m65273k4() & 255;
    }

    @Override // com.aspose.slides.p559ms.System.Xml.C13891ek, com.aspose.slides.p559ms.System.Xml.AbstractC13965r5
    /* JADX INFO: renamed from: x1 */
    public void mo21920x1(String str, String str2, String str3) {
        if (str3.length() != 0) {
            super.mo21920x1(str, str2, str3);
        } else if ((this.f47089x1 & 8) == 0) {
            byte[] bArr = this.f46465du;
            int i = this.f46463c5;
            int i2 = i + 1;
            this.f46463c5 = i2;
            bArr[i] = 60;
            this.f46463c5 = i + 2;
            bArr[i2] = PatternStyle.Shingle;
            m65311jd(str2);
            byte[] bArr2 = this.f46465du;
            int i3 = this.f46463c5;
            this.f46463c5 = i3 + 1;
            bArr2[i3] = 62;
        }
        this.f47089x1 = this.f47085k4.m65273k4() & 255;
    }

    @Override // com.aspose.slides.p559ms.System.Xml.C13891ek, com.aspose.slides.p559ms.System.Xml.AbstractC13965r5
    /* JADX INFO: renamed from: k4 */
    public void mo21902k4(int i) {
    }

    /* JADX INFO: renamed from: kk */
    public final void m66313kk(char[] cArr, int i, int i2) {
        long j = this.f47087v4;
        if ((7 & j) == 0) {
            if ((this.f47089x1 & 128) != 0) {
                m65318to(cArr, i, i2);
                return;
            } else {
                m66309dy(cArr, i, i2);
                return;
            }
        }
        if ((2 & j) != 0) {
            return;
        }
        if ((j & 5) == 0 || this.f47088wy) {
            m66309dy(cArr, i, i2);
        } else {
            m66308c5(cArr, i, i2);
        }
    }

    /* JADX INFO: renamed from: x1 */
    public final void m66314x1(char[] cArr, int i, int i2) {
        if ((this.f47089x1 & 16) != 0) {
            m65310h4(cArr, i, i2);
        } else {
            m65309du(cArr, i, i2);
        }
    }

    /* JADX INFO: renamed from: k4 */
    private void m66310k4(C13907h0 c13907h0) {
        if (f47082kk == null) {
            f47083to = new C13921jw(AbstractC13882dq.f46446x1);
            f47082kk = new C13921jw(AbstractC13882dq.f46445k4);
        }
        this.f47085k4 = new C13887dy(10);
        this.f47090yd = new byte[5];
        this.f47089x1 = 0L;
        this.f47084b3 = c13907h0.m65435ne();
        this.f47088wy = c13907h0.m65437rv();
    }

    @Override // com.aspose.slides.p559ms.System.Xml.C13891ek, com.aspose.slides.p559ms.System.Xml.AbstractC13965r5
    /* JADX INFO: renamed from: k4 */
    public void mo21905k4(String str) {
    }

    @Override // com.aspose.slides.p559ms.System.Xml.C13891ek, com.aspose.slides.p559ms.System.Xml.AbstractC13958qb
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
        byte[] bArr2 = this.f46465du;
        int i3 = this.f46463c5;
        this.f46463c5 = i3 + 1;
        bArr2[i3] = 32;
        m65312k4(str2, 63);
        byte[] bArr3 = this.f46465du;
        int i4 = this.f46463c5;
        int i5 = i4 + 1;
        this.f46463c5 = i5;
        bArr3[i4] = 62;
        if (i5 > this.f46482yj) {
            ac_();
        }
    }

    @Override // com.aspose.slides.p559ms.System.Xml.C13891ek, com.aspose.slides.p559ms.System.Xml.AbstractC13958qb
    /* JADX INFO: renamed from: k4 */
    public void mo12953k4(String str, String str2, String str3) {
        this.f47085k4.m65274k4((byte) this.f47089x1);
        if (str3.length() != 0) {
            this.f47089x1 = 128L;
            super.mo12953k4(str, str2, str3);
            return;
        }
        this.f47089x1 = f47082kk.m65496k4(str2) & 255;
        byte[] bArr = this.f46465du;
        int i = this.f46463c5;
        this.f46463c5 = i + 1;
        bArr[i] = 60;
        m65311jd(str2);
        this.f46478up = this.f46463c5;
    }

    @Override // com.aspose.slides.p559ms.System.Xml.C13891ek, com.aspose.slides.p559ms.System.Xml.AbstractC13965r5, com.aspose.slides.p559ms.System.Xml.AbstractC13958qb
    /* JADX INFO: renamed from: k4 */
    public void mo21908k4(String str, String str2, String str3, String str4) {
        m65311jd("<!DOCTYPE ");
        if ("HTML".equals(str)) {
            m65311jd("HTML");
        } else {
            m65311jd("html");
        }
        if (str2 != null) {
            m65311jd(" PUBLIC \"");
            m65311jd(str2);
            if (str3 != null) {
                m65311jd("\" \"");
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

    @Override // com.aspose.slides.p559ms.System.Xml.C13891ek, com.aspose.slides.p559ms.System.Xml.AbstractC13965r5, com.aspose.slides.p559ms.System.Xml.AbstractC13958qb
    /* JADX INFO: renamed from: k4 */
    public void mo21909k4(char[] cArr, int i, int i2) {
        int i3 = i2 + i;
        if (this.f46481x6) {
            m65318to(cArr, i, i3);
        } else {
            m65309du(cArr, i, i3);
        }
    }
}
