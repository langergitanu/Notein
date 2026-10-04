package com.aspose.slides.p559ms.System.Xml;

import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.internal.p080dd.AbstractC3124b3;
import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.words.ControlChar;
import com.google.common.primitives.UnsignedBytes;
import com.orion.notein.richeditor.utils.p606io.IOUtils;

/* JADX INFO: renamed from: com.aspose.slides.ms.System.Xml.wy */
/* JADX INFO: loaded from: classes5.dex */
public class C14008wy extends C13893ew {

    /* JADX INFO: renamed from: kk */
    protected static C13921jw f47054kk;

    /* JADX INFO: renamed from: to */
    protected static C13921jw f47055to;

    /* JADX INFO: renamed from: bz */
    private String f47056bz;

    /* JADX INFO: renamed from: dq */
    private long f47057dq;

    /* JADX INFO: renamed from: e0 */
    private byte[] f47058e0;

    /* JADX INFO: renamed from: k4 */
    protected C13887dy f47059k4;

    /* JADX INFO: renamed from: qm */
    private boolean f47060qm;

    /* JADX INFO: renamed from: ts */
    private boolean f47061ts;

    /* JADX INFO: renamed from: x1 */
    protected long f47062x1;

    public C14008wy(AbstractC3124b3 abstractC3124b3, C13907h0 c13907h0) {
        super(abstractC3124b3, c13907h0);
        m66287k4(c13907h0);
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x0081  */
    /* JADX INFO: renamed from: fa */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void m66286fa(char[] cArr, int i) {
        char c;
        int i2;
        char[] cArr2;
        int i3;
        if (this.f47061ts) {
            if (i > 0 && cArr[0] != '{') {
                m66288m9();
            }
            this.f47061ts = false;
        }
        char[] cArr3 = this.f46497ix;
        int iM65326dy = this.f46491c5;
        int i4 = 0;
        char c2 = 0;
        while (true) {
            int i5 = (i - i4) + iM65326dy;
            int i6 = this.f46517yj;
            if (i5 > i6) {
                i5 = i6;
            }
            while (true) {
                if (iM65326dy >= i5) {
                    c = c2;
                    break;
                }
                byte[] bArr = this.f46494dy.f47099k4;
                char c3 = cArr[i4];
                if ((bArr[c3] & UnsignedBytes.MAX_POWER_OF_TWO) == 0) {
                    c = c3;
                    break;
                }
                cArr3[iM65326dy] = c3;
                i4++;
                iM65326dy++;
                c2 = c3;
            }
            if (i4 >= i) {
                this.f46491c5 = iM65326dy;
                return;
            }
            if (iM65326dy >= i5) {
                this.f46491c5 = iM65326dy;
                ab_();
                iM65326dy = 1;
            } else if (c == '\t') {
                i2 = i;
                cArr2 = cArr;
                i3 = iM65326dy + 1;
                cArr3[iM65326dy] = c;
                iM65326dy = i3;
                i4++;
                cArr = cArr2;
                i = i2;
            } else {
                if (c == '\n') {
                    i2 = i;
                    cArr2 = cArr;
                    iM65326dy = C13893ew.m65326dy(cArr3, iM65326dy);
                } else if (c == '\r') {
                    i2 = i;
                    cArr2 = cArr;
                    iM65326dy = C13893ew.m65323c5(cArr3, iM65326dy);
                } else if (c == '\"') {
                    i2 = i;
                    cArr2 = cArr;
                    iM65326dy = C13893ew.m65327h4(cArr3, iM65326dy);
                } else if (c != '<' && c != '>') {
                    if (c != '&') {
                        if (c != '\'') {
                            int[] iArr = {i4};
                            int[] iArr2 = {iM65326dy};
                            char[] cArr4 = cArr;
                            i2 = i;
                            m65345k4(cArr4, iArr, i2, cArr3, iArr2);
                            cArr2 = cArr4;
                            i4 = iArr[0];
                            iM65326dy = iArr2[0];
                            cArr = cArr2;
                            i = i2;
                        }
                        i2 = i;
                        cArr2 = cArr;
                        i3 = iM65326dy + 1;
                        cArr3[iM65326dy] = c;
                        iM65326dy = i3;
                    } else {
                        i2 = i;
                        cArr2 = cArr;
                        int i7 = i4 + 1;
                        if (i7 == i2) {
                            this.f47061ts = true;
                        } else if (cArr2[i7] != '{') {
                            iM65326dy = C13893ew.m65325du(cArr3, iM65326dy);
                        }
                        i3 = iM65326dy + 1;
                        cArr3[iM65326dy] = c;
                        iM65326dy = i3;
                    }
                }
                i4++;
                cArr = cArr2;
                i = i2;
            }
            c2 = c;
        }
    }

    /* JADX INFO: renamed from: m9 */
    private void m66288m9() {
        char[] cArr = this.f46497ix;
        int i = this.f46491c5;
        int i2 = i + 1;
        this.f46491c5 = i2;
        cArr[i] = 'a';
        int i3 = i + 2;
        this.f46491c5 = i3;
        cArr[i2] = 'm';
        int i4 = i + 3;
        this.f46491c5 = i4;
        cArr[i3] = 'p';
        this.f46491c5 = i + 4;
        cArr[i4] = ';';
    }

    /* JADX INFO: renamed from: up */
    private void m66289up(char[] cArr, int i) {
        int i2;
        if (this.f47061ts) {
            if (i > 0 && cArr[0] != '{') {
                m66288m9();
            }
            this.f47061ts = false;
        }
        char[] cArr2 = this.f46497ix;
        int iM65326dy = this.f46491c5;
        int i3 = 0;
        char c = 0;
        while (true) {
            int i4 = (i - i3) + iM65326dy;
            int i5 = this.f46517yj;
            if (i4 > i5) {
                i4 = i5;
            }
            while (iM65326dy < i4) {
                byte[] bArr = this.f46494dy.f47099k4;
                char c2 = cArr[i3];
                if ((bArr[c2] & UnsignedBytes.MAX_POWER_OF_TWO) == 0 || c2 >= 128) {
                    c = c2;
                    break;
                }
                cArr2[iM65326dy] = c2;
                i3++;
                iM65326dy++;
                c = c2;
            }
            if (i3 >= i) {
                this.f46491c5 = iM65326dy;
                return;
            }
            if (iM65326dy >= i4) {
                this.f46491c5 = iM65326dy;
                ab_();
                iM65326dy = 1;
            } else {
                if (c != '\t') {
                    if (c == '\n') {
                        iM65326dy = C13893ew.m65326dy(cArr2, iM65326dy);
                    } else if (c == '\r') {
                        iM65326dy = C13893ew.m65323c5(cArr2, iM65326dy);
                    } else if (c == '\"') {
                        iM65326dy = C13893ew.m65327h4(cArr2, iM65326dy);
                    } else if (c != '<' && c != '>') {
                        if (c == '&') {
                            int i6 = i3 + 1;
                            if (i6 == i) {
                                this.f47061ts = true;
                            } else if (cArr[i6] != '{') {
                                iM65326dy = C13893ew.m65325du(cArr2, iM65326dy);
                            }
                            i2 = iM65326dy + 1;
                            cArr2[iM65326dy] = c;
                            iM65326dy = i2;
                        } else if (c != '\'') {
                            byte[] bArr2 = this.f47058e0;
                            int[] iArr = {i3};
                            int[] iArr2 = {0};
                            C13891ek.m65307x1(cArr, iArr, i, bArr2, iArr2);
                            i3 = iArr[0];
                            for (int i7 = iArr2[0]; i7 < 0; i7++) {
                                cArr2[iM65326dy] = '%';
                                int i8 = iM65326dy + 2;
                                cArr2[iM65326dy + 1] = "0123456789ABCDEF".charAt((bArr2[i7] & 255) >> 4);
                                iM65326dy += 3;
                                cArr2[i8] = "0123456789ABCDEF".charAt(bArr2[i7] & 15);
                            }
                        }
                    }
                    i3++;
                }
                i2 = iM65326dy + 1;
                cArr2[iM65326dy] = c;
                iM65326dy = i2;
                i3++;
            }
        }
    }

    @Override // com.aspose.slides.p559ms.System.Xml.C13893ew, com.aspose.slides.p559ms.System.Xml.AbstractC13965r5
    /* JADX INFO: renamed from: k4 */
    public void mo21899k4() {
        char[] cArr = this.f46497ix;
        int i = this.f46491c5;
        int i2 = i + 1;
        this.f46491c5 = i2;
        cArr[i] = '>';
        this.f46492ck = i2;
        if ((this.f47062x1 & 32) != 0) {
            m66291kk();
        }
    }

    /* JADX INFO: renamed from: kk */
    public final void m66291kk() {
        m65341jd("<META http-equiv=\"Content-Type\"");
        if (this.f47056bz == null) {
            this.f47056bz = "text/html";
        }
        m65341jd(" content=\"");
        m65341jd(this.f47056bz);
        m65341jd("; charset=");
        m65341jd(this.f46503m9.mo26657jd());
        m65341jd("\">");
    }

    @Override // com.aspose.slides.p559ms.System.Xml.C13893ew, com.aspose.slides.p559ms.System.Xml.AbstractC13958qb
    /* JADX INFO: renamed from: to */
    public void mo21915to(String str, String str2, String str3) {
        if (str3.length() == 0) {
            if (this.f46512wl && this.f46505qq) {
                m65344k4(false);
            }
            int i = this.f46509up;
            int i2 = this.f46491c5;
            if (i == i2) {
                char[] cArr = this.f46497ix;
                this.f46491c5 = i2 + 1;
                cArr[i2] = ControlChar.SPACE_CHAR;
            }
            m65341jd(str2);
            if ((this.f47062x1 & 7) != 0) {
                long jM65496k4 = ((long) (f47055to.m65496k4(str2) & 255)) & this.f47062x1 & 4294967295L;
                this.f47057dq = jM65496k4;
                if ((jM65496k4 & 2) != 0) {
                    this.f46515x6 = true;
                    return;
                }
            } else {
                this.f47057dq = 0L;
            }
            char[] cArr2 = this.f46497ix;
            int i3 = this.f46491c5;
            int i4 = i3 + 1;
            this.f46491c5 = i4;
            cArr2[i3] = '=';
            this.f46491c5 = i3 + 2;
            cArr2[i4] = '\"';
        } else {
            super.mo21915to(str, str2, str3);
            this.f47057dq = 0L;
        }
        this.f46515x6 = true;
    }

    @Override // com.aspose.slides.p559ms.System.Xml.C13893ew, com.aspose.slides.p559ms.System.Xml.AbstractC13958qb
    /* JADX INFO: renamed from: x1 */
    public void mo21917x1() {
        if ((this.f47057dq & 2) != 0) {
            this.f46509up = this.f46491c5;
        } else {
            if (this.f47061ts) {
                m66288m9();
                this.f47061ts = false;
            }
            if (this.f46512wl && this.f46505qq) {
                m65344k4(false);
            }
            char[] cArr = this.f46497ix;
            int i = this.f46491c5;
            this.f46491c5 = i + 1;
            cArr[i] = '\"';
        }
        this.f46515x6 = false;
        this.f46509up = this.f46491c5;
    }

    public C14008wy(AbstractC3150x6 abstractC3150x6, C13907h0 c13907h0) {
        super(abstractC3150x6, c13907h0);
        m66287k4(c13907h0);
    }

    @Override // com.aspose.slides.p559ms.System.Xml.C13893ew, com.aspose.slides.p559ms.System.Xml.AbstractC13965r5, com.aspose.slides.p559ms.System.Xml.AbstractC13958qb
    /* JADX INFO: renamed from: k4 */
    public void mo21900k4(char c) {
        throw new InvalidOperationException(C13968ri.m65818k4("Operation is not valid due to the current state of the object."));
    }

    @Override // com.aspose.slides.p559ms.System.Xml.C13893ew, com.aspose.slides.p559ms.System.Xml.AbstractC13958qb
    /* JADX INFO: renamed from: kk */
    public void mo21910kk(String str) {
        throw new InvalidOperationException(C13968ri.m65818k4("Operation is not valid due to the current state of the object."));
    }

    @Override // com.aspose.slides.p559ms.System.Xml.C13893ew, com.aspose.slides.p559ms.System.Xml.AbstractC13958qb
    /* JADX INFO: renamed from: x1 */
    public void mo21918x1(String str) {
        if (this.f46512wl && !this.f46505qq) {
            m65344k4(true);
        }
        char[] cArrM67365dy = C14113y2.m67365dy(str);
        int length = str.length();
        if (this.f46515x6) {
            m66292x1(cArrM67365dy, length);
        } else {
            m66290k4(cArrM67365dy, length);
        }
    }

    @Override // com.aspose.slides.p559ms.System.Xml.C13893ew, com.aspose.slides.p559ms.System.Xml.AbstractC13965r5, com.aspose.slides.p559ms.System.Xml.AbstractC13958qb
    /* JADX INFO: renamed from: k4 */
    public void mo21901k4(char c, char c2) {
        throw new InvalidOperationException(C13968ri.m65818k4("Operation is not valid due to the current state of the object."));
    }

    @Override // com.aspose.slides.p559ms.System.Xml.C13893ew, com.aspose.slides.p559ms.System.Xml.AbstractC13965r5
    /* JADX INFO: renamed from: kk */
    public void mo21911kk(String str, String str2, String str3) {
        if (str3.length() == 0) {
            if (this.f46512wl && this.f46505qq) {
                m65344k4(false);
            }
            if ((this.f47062x1 & 8) == 0) {
                char[] cArr = this.f46497ix;
                int i = this.f46491c5;
                int i2 = i + 1;
                this.f46491c5 = i2;
                cArr[i] = '<';
                this.f46491c5 = i + 2;
                cArr[i2] = IOUtils.DIR_SEPARATOR_UNIX;
                m65341jd(str2);
                char[] cArr2 = this.f46497ix;
                int i3 = this.f46491c5;
                this.f46491c5 = i3 + 1;
                cArr2[i3] = '>';
            }
        } else {
            super.mo21911kk(str, str2, str3);
        }
        this.f47062x1 = this.f47059k4.m65273k4() & 255;
    }

    @Override // com.aspose.slides.p559ms.System.Xml.C13893ew, com.aspose.slides.p559ms.System.Xml.AbstractC13965r5
    /* JADX INFO: renamed from: x1 */
    public void mo21920x1(String str, String str2, String str3) {
        if (str3.length() == 0) {
            if (this.f46512wl && this.f46505qq) {
                m65344k4(false);
            }
            if ((this.f47062x1 & 8) == 0) {
                char[] cArr = this.f46497ix;
                int i = this.f46491c5;
                int i2 = i + 1;
                this.f46491c5 = i2;
                cArr[i] = '<';
                this.f46491c5 = i + 2;
                cArr[i2] = IOUtils.DIR_SEPARATOR_UNIX;
                m65341jd(str2);
                char[] cArr2 = this.f46497ix;
                int i3 = this.f46491c5;
                this.f46491c5 = i3 + 1;
                cArr2[i3] = '>';
            }
        } else {
            super.mo21920x1(str, str2, str3);
        }
        this.f47062x1 = this.f47059k4.m65273k4() & 255;
    }

    @Override // com.aspose.slides.p559ms.System.Xml.C13893ew, com.aspose.slides.p559ms.System.Xml.AbstractC13965r5
    /* JADX INFO: renamed from: k4 */
    public void mo21902k4(int i) {
    }

    /* JADX INFO: renamed from: x1 */
    public final void m66292x1(char[] cArr, int i) {
        long j = this.f47057dq;
        if ((7 & j) == 0) {
            if ((this.f47062x1 & 128) != 0) {
                m65346kk(cArr, 0, i);
                return;
            } else {
                m66286fa(cArr, i);
                return;
            }
        }
        if ((2 & j) != 0) {
            return;
        }
        if ((j & 5) == 0 || this.f47060qm) {
            m66286fa(cArr, i);
        } else {
            m66289up(cArr, i);
        }
    }

    /* JADX INFO: renamed from: k4 */
    private void m66287k4(C13907h0 c13907h0) {
        if (f47054kk == null) {
            f47055to = new C13921jw(AbstractC13882dq.f46446x1);
            f47054kk = new C13921jw(AbstractC13882dq.f46445k4);
        }
        this.f47059k4 = new C13887dy(10);
        this.f47058e0 = new byte[5];
        this.f47062x1 = 0L;
        this.f47056bz = c13907h0.m65435ne();
        this.f47060qm = c13907h0.m65437rv();
    }

    @Override // com.aspose.slides.p559ms.System.Xml.C13893ew, com.aspose.slides.p559ms.System.Xml.AbstractC13965r5
    /* JADX INFO: renamed from: k4 */
    public void mo21905k4(String str) {
    }

    @Override // com.aspose.slides.p559ms.System.Xml.C13893ew, com.aspose.slides.p559ms.System.Xml.AbstractC13958qb
    /* JADX INFO: renamed from: k4 */
    public void mo21907k4(String str, String str2) {
        if (this.f46512wl && this.f46505qq) {
            m65344k4(false);
        }
        char[] cArr = this.f46497ix;
        int i = this.f46491c5;
        int i2 = i + 1;
        this.f46491c5 = i2;
        cArr[i] = '<';
        this.f46491c5 = i + 2;
        cArr[i2] = '?';
        m65341jd(str);
        char[] cArr2 = this.f46497ix;
        int i3 = this.f46491c5;
        this.f46491c5 = i3 + 1;
        cArr2[i3] = ControlChar.SPACE_CHAR;
        m65342k4(str2, 63);
        char[] cArr3 = this.f46497ix;
        int i4 = this.f46491c5;
        int i5 = i4 + 1;
        this.f46491c5 = i5;
        cArr3[i4] = '>';
        if (i5 > this.f46517yj) {
            ab_();
        }
    }

    @Override // com.aspose.slides.p559ms.System.Xml.C13893ew, com.aspose.slides.p559ms.System.Xml.AbstractC13958qb
    /* JADX INFO: renamed from: k4 */
    public void mo12953k4(String str, String str2, String str3) {
        this.f47059k4.m65274k4((byte) this.f47062x1);
        if (str3.length() != 0) {
            this.f47062x1 = 128L;
            super.mo12953k4(str, str2, str3);
            return;
        }
        if (this.f46512wl && this.f46505qq) {
            m65344k4(false);
        }
        this.f47062x1 = f47054kk.m65496k4(str2) & 255;
        char[] cArr = this.f46497ix;
        int i = this.f46491c5;
        this.f46491c5 = i + 1;
        cArr[i] = '<';
        m65341jd(str2);
        this.f46509up = this.f46491c5;
    }

    @Override // com.aspose.slides.p559ms.System.Xml.C13893ew, com.aspose.slides.p559ms.System.Xml.AbstractC13965r5, com.aspose.slides.p559ms.System.Xml.AbstractC13958qb
    /* JADX INFO: renamed from: k4 */
    public void mo21908k4(String str, String str2, String str3, String str4) {
        if (this.f46512wl && this.f46505qq) {
            m65344k4(false);
        }
        m65341jd("<!DOCTYPE ");
        if ("HTML".equals(str)) {
            m65341jd("HTML");
        } else {
            m65341jd("html");
        }
        if (str2 != null) {
            m65341jd(" PUBLIC \"");
            m65341jd(str2);
            if (str3 != null) {
                m65341jd("\" \"");
                m65341jd(str3);
            }
            char[] cArr = this.f46497ix;
            int i = this.f46491c5;
            this.f46491c5 = i + 1;
            cArr[i] = '\"';
        } else if (str3 != null) {
            m65341jd(" SYSTEM \"");
            m65341jd(str3);
            char[] cArr2 = this.f46497ix;
            int i2 = this.f46491c5;
            this.f46491c5 = i2 + 1;
            cArr2[i2] = '\"';
        } else {
            char[] cArr3 = this.f46497ix;
            int i3 = this.f46491c5;
            this.f46491c5 = i3 + 1;
            cArr3[i3] = ControlChar.SPACE_CHAR;
        }
        if (str4 != null) {
            char[] cArr4 = this.f46497ix;
            int i4 = this.f46491c5;
            this.f46491c5 = i4 + 1;
            cArr4[i4] = '[';
            m65341jd(str4);
            char[] cArr5 = this.f46497ix;
            int i5 = this.f46491c5;
            this.f46491c5 = i5 + 1;
            cArr5[i5] = ']';
        }
        char[] cArr6 = this.f46497ix;
        int i6 = this.f46491c5;
        this.f46491c5 = i6 + 1;
        cArr6[i6] = '>';
    }

    /* JADX INFO: renamed from: k4 */
    public final void m66290k4(char[] cArr, int i) {
        if ((this.f47062x1 & 16) != 0) {
            m65339du(cArr, 0, i);
        } else {
            m65347to(cArr, 0, i);
        }
    }

    @Override // com.aspose.slides.p559ms.System.Xml.C13893ew, com.aspose.slides.p559ms.System.Xml.AbstractC13965r5, com.aspose.slides.p559ms.System.Xml.AbstractC13958qb
    /* JADX INFO: renamed from: k4 */
    public void mo21909k4(char[] cArr, int i, int i2) {
        if (this.f46512wl && !this.f46505qq) {
            m65344k4(true);
        }
        int i3 = i2 + i;
        if (this.f46515x6) {
            m65346kk(cArr, i, i3);
        } else {
            m65347to(cArr, i, i3);
        }
    }
}
