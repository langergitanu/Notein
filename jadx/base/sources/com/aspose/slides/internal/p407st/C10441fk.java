package com.aspose.slides.internal.p407st;

import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.internal.p080dd.C3134k4;
import com.aspose.slides.internal.p080dd.C3149x1;
import com.aspose.slides.internal.p294n9.C6765kp;
import com.aspose.slides.p559ms.System.C14042ak;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.st.fk */
/* JADX INFO: loaded from: classes4.dex */
public class C10441fk {

    /* JADX INFO: renamed from: dy */
    protected C10661u4 f36995dy;

    /* JADX INFO: renamed from: k4 */
    protected int f36998k4 = 0;

    /* JADX INFO: renamed from: x1 */
    protected int f37002x1 = 0;

    /* JADX INFO: renamed from: kk */
    protected int f36999kk = 65535;

    /* JADX INFO: renamed from: to */
    protected int f37001to = 65535;

    /* JADX INFO: renamed from: du */
    protected int f36994du = 65535;

    /* JADX INFO: renamed from: h4 */
    protected int f36996h4 = 65535;

    /* JADX INFO: renamed from: m9 */
    protected short f37000m9 = 0;

    /* JADX INFO: renamed from: c5 */
    protected short f36992c5 = 0;

    /* JADX INFO: renamed from: jd */
    protected byte f36997jd = 0;

    /* JADX INFO: renamed from: ck */
    protected int[] f36993ck = {1, 2, 4, 16, 32, 128, 512};

    /* JADX INFO: renamed from: kk */
    private int m50787kk(int i) {
        int i2 = i & 32439;
        if (i2 != 0) {
            return i2;
        }
        throw new InvalidOperationException();
    }

    /* JADX INFO: renamed from: ix */
    public final boolean m50788ix() {
        return this.f36998k4 == 0;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m50789k4(int i, byte b) {
        int iM50787kk = m50787kk(i);
        if (b == -1) {
            this.f36998k4 = (this.f36998k4 | iM50787kk) ^ iM50787kk;
            return;
        }
        this.f36998k4 = iM50787kk | this.f36998k4;
        int i2 = this.f37002x1 | i;
        this.f37002x1 = i2;
        if (b == 0) {
            this.f37002x1 = i ^ i2;
        }
    }

    /* JADX INFO: renamed from: ne */
    public final int m50797ne() {
        int i;
        if (m50795k4(15728639)) {
            i = m50795k4(65535) ? 6 : 4;
            if (m50795k4(65536)) {
                i += 2;
            }
            if (m50795k4(2097152)) {
                i += 2;
            }
            if (m50795k4(4194304)) {
                i += 2;
            }
            if (m50795k4(8388608)) {
                i += 2;
            }
            if (m50795k4(131072)) {
                i += 2;
            }
            if (m50795k4(262144)) {
                i += 4;
            }
            if (m50795k4(524288)) {
                i += 2;
            }
        } else {
            i = 4;
        }
        return m50795k4(1048576) ? i + 4 : i;
    }

    public String toString() {
        C6765kp c6765kp = new C6765kp();
        c6765kp.m26810x1(C14113y2.m67402k4("  CFMask: 0x{0:X}, {1}", Long.valueOf(((long) this.f36998k4) & 4294967295L), C14042ak.m66410k4(C10733yj.class, this.f36998k4)));
        if (m50795k4(15695543)) {
            if (m50795k4(32439)) {
                c6765kp.m26810x1(C14113y2.m67402k4("  FontStyleMask   : 0x{0:X}, {1}", Long.valueOf(((long) this.f37002x1) & 4294967295L), C14042ak.m66410k4(C10515ks.class, this.f37002x1)));
                if (m50795k4(1)) {
                    c6765kp.m26810x1(C14113y2.m67402k4("  Bold     : {0}", Boolean.valueOf(m50798x1(1) == 1)));
                }
                if (m50795k4(2)) {
                    c6765kp.m26810x1(C14113y2.m67402k4("  Italic   : {0}", Boolean.valueOf(m50798x1(2) == 1)));
                }
                if (m50795k4(4)) {
                    c6765kp.m26810x1(C14113y2.m67402k4("  Underline: {0}", Boolean.valueOf(m50798x1(4) == 1)));
                }
                if (m50795k4(16)) {
                    c6765kp.m26810x1(C14113y2.m67402k4("  Shadow   : {0}", Boolean.valueOf(m50798x1(16) == 1)));
                }
                if (m50795k4(32)) {
                    c6765kp.m26810x1(C14113y2.m67402k4("  Fehint   : {0}", Boolean.valueOf(m50798x1(32) == 1)));
                }
                if (m50795k4(128)) {
                    c6765kp.m26810x1(C14113y2.m67402k4("  Kumi     : {0}", Boolean.valueOf(m50798x1(128) == 1)));
                }
                if (m50795k4(512)) {
                    c6765kp.m26810x1(C14113y2.m67402k4("  Emboss   : {0}", Boolean.valueOf(m50798x1(512) == 1)));
                }
                if (m50795k4(15360)) {
                    c6765kp.m26810x1(C14113y2.m67402k4("  PP9RT    : 0x{0:X}", Long.valueOf((((long) (15360 & this.f37002x1)) & 4294967295L) >> 10)));
                }
            }
            if (m50795k4(65536)) {
                c6765kp.m26810x1(C14113y2.m67402k4("  FontRef: {0}", Integer.valueOf(this.f36999kk)));
            }
            if (m50795k4(2097152)) {
                c6765kp.m26810x1(C14113y2.m67402k4("  OldEaFontRef: {0}", Integer.valueOf(this.f37001to)));
            }
            if (m50795k4(4194304)) {
                c6765kp.m26810x1(C14113y2.m67402k4("  AnsiFontRef: {0}", Integer.valueOf(this.f36994du)));
            }
            if (m50795k4(8388608)) {
                c6765kp.m26810x1(C14113y2.m67402k4("  SymbolFontRef: {0}", Integer.valueOf(this.f36996h4)));
            }
            if (m50795k4(131072)) {
                c6765kp.m26810x1(C14113y2.m67402k4("  FontSize: {0}", Short.valueOf(this.f37000m9)));
            }
            if (m50795k4(262144)) {
                c6765kp.m26810x1(C14113y2.m67402k4("  Color: {0}", this.f36995dy));
            }
            if (m50795k4(524288)) {
                c6765kp.m26792k4(C14113y2.m67402k4("  Position: {0}", Short.valueOf(this.f36992c5)));
            }
        }
        if (m50795k4(1048576)) {
            c6765kp.m26792k4(C14113y2.m67402k4("  PP10RunID: {0}", Byte.valueOf(this.f36997jd)));
        }
        return c6765kp.toString();
    }

    /* JADX INFO: renamed from: x1 */
    public final byte m50798x1(int i) {
        if (m50795k4(m50787kk(i))) {
            return (i & this.f37002x1) != 0 ? (byte) 1 : (byte) 0;
        }
        return (byte) -1;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m50790k4(int i, boolean z) {
        int i2 = this.f36998k4 | i;
        this.f36998k4 = i2;
        if (z) {
            return;
        }
        this.f36998k4 = i ^ i2;
    }

    /* JADX INFO: renamed from: kk */
    public final boolean m50796kk(C10441fk c10441fk) {
        int i = this.f36998k4;
        if (i != c10441fk.f36998k4) {
            return false;
        }
        if (i == 0) {
            return true;
        }
        if (m50795k4(65535) && this.f37002x1 != c10441fk.f37002x1) {
            return false;
        }
        if (m50795k4(65536) && (this.f36999kk & 65535) != (c10441fk.f36999kk & 65535)) {
            return false;
        }
        if (m50795k4(2097152) && (this.f37001to & 65535) != (c10441fk.f37001to & 65535)) {
            return false;
        }
        if (m50795k4(4194304) && (this.f36994du & 65535) != (c10441fk.f36994du & 65535)) {
            return false;
        }
        if (m50795k4(8388608) && (this.f36996h4 & 65535) != (65535 & c10441fk.f36996h4)) {
            return false;
        }
        if (m50795k4(131072) && this.f37000m9 != c10441fk.f37000m9) {
            return false;
        }
        if (m50795k4(262144) && (this.f36995dy.m51792kk() & 4294967295L) != (4294967295L & c10441fk.f36995dy.m51792kk())) {
            return false;
        }
        if (!m50795k4(524288) || this.f36992c5 == c10441fk.f36992c5) {
            return !m50795k4(1048576) || (this.f36997jd & 255) == (c10441fk.f36997jd & 255);
        }
        return false;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m50799x1(C10441fk c10441fk) {
        if (c10441fk == null) {
            return;
        }
        int i = c10441fk.f36998k4;
        int i2 = i ^ (this.f36998k4 & i);
        if ((15695543 & i2) != 0) {
            if ((65535 & i2) != 0) {
                for (int i3 : this.f36993ck) {
                    if (m50798x1(i3) == -1) {
                        m50789k4(i3, c10441fk.m50798x1(i3));
                    }
                }
            }
            if ((65536 & i2) != 0) {
                this.f36999kk = c10441fk.f36999kk;
            }
            if ((2097152 & i2) != 0) {
                this.f37001to = c10441fk.f37001to;
            }
            if ((4194304 & i2) != 0) {
                this.f36994du = c10441fk.f36994du;
            }
            if ((8388608 & i2) != 0) {
                this.f36996h4 = c10441fk.f36996h4;
            }
            if ((131072 & i2) != 0) {
                this.f37000m9 = c10441fk.f37000m9;
            }
            if ((262144 & i2) != 0) {
                this.f36995dy = c10441fk.f36995dy.cloneT();
            }
            if ((524288 & i2) != 0) {
                this.f36992c5 = c10441fk.f36992c5;
            }
        }
        if ((i2 & 1048576) != 0) {
            this.f36997jd = c10441fk.f36997jd;
        }
        this.f36998k4 = c10441fk.f36998k4 | this.f36998k4;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m50791k4(C3134k4 c3134k4) {
        this.f36998k4 = (int) c3134k4.m13384uz();
        if (m50795k4(15728639)) {
            if (m50795k4(65535)) {
                this.f37002x1 = 65535 & c3134k4.m13382u4();
            }
            if (m50795k4(65536)) {
                this.f36999kk = c3134k4.m13382u4();
            }
            if (m50795k4(2097152)) {
                this.f37001to = c3134k4.m13382u4();
            }
            if (m50795k4(4194304)) {
                this.f36994du = c3134k4.m13382u4();
            }
            if (m50795k4(8388608)) {
                this.f36996h4 = c3134k4.m13382u4();
            }
            if (m50795k4(131072)) {
                this.f37000m9 = c3134k4.m13381rv();
            }
            if (m50795k4(262144)) {
                this.f36995dy = new C10661u4(c3134k4.m13384uz());
            }
            if (m50795k4(524288)) {
                this.f36992c5 = c3134k4.m13381rv();
            }
        }
        if (m50795k4(1048576)) {
            this.f36997jd = (byte) (c3134k4.m13384uz() & 15);
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m50792k4(C3149x1 c3149x1) {
        c3149x1.m13447k4(((long) this.f36998k4) & 4294967295L);
        if (m50795k4(15728639)) {
            if (m50795k4(65535)) {
                c3149x1.m13446k4(65535 & this.f37002x1);
            }
            if (m50795k4(65536)) {
                c3149x1.m13446k4(this.f36999kk);
            }
            if (m50795k4(2097152)) {
                c3149x1.m13446k4(this.f37001to);
            }
            if (m50795k4(4194304)) {
                c3149x1.m13446k4(this.f36994du);
            }
            if (m50795k4(8388608)) {
                c3149x1.m13446k4(this.f36996h4);
            }
            if (m50795k4(131072)) {
                c3149x1.m13448k4(this.f37000m9);
            }
            if (m50795k4(262144)) {
                c3149x1.m13447k4(this.f36995dy.m51792kk());
            }
            if (m50795k4(524288)) {
                c3149x1.m13448k4(this.f36992c5);
            }
        }
        if (m50795k4(1048576)) {
            c3149x1.m13447k4(this.f36997jd & 255);
        }
    }

    /* JADX INFO: renamed from: k4 */
    public void mo50793k4(C10441fk c10441fk) {
        if (c10441fk == null) {
            return;
        }
        int i = c10441fk.f36998k4 & this.f36998k4;
        if ((15695543 & i) != 0) {
            if ((i & 32439) != 0) {
                if (this.f37002x1 != c10441fk.f37002x1) {
                    int i2 = 0;
                    while (true) {
                        int[] iArr = this.f36993ck;
                        if (i2 >= iArr.length) {
                            break;
                        }
                        byte bM50798x1 = m50798x1(iArr[i2]);
                        byte bM50798x12 = c10441fk.m50798x1(this.f36993ck[i2]);
                        if (bM50798x1 != -1 && bM50798x1 == bM50798x12) {
                            m50789k4(this.f36993ck[i2], (byte) -1);
                        }
                        i2++;
                    }
                } else {
                    m50790k4(32439, false);
                }
            }
            if ((i & 65536) != 0 && this.f36999kk == c10441fk.f36999kk) {
                m50790k4(65536, false);
            }
            if ((i & 2097152) != 0 && this.f37001to == c10441fk.f37001to) {
                m50790k4(2097152, false);
            }
            if ((i & 4194304) != 0 && this.f36994du == c10441fk.f36994du) {
                m50790k4(4194304, false);
            }
            if ((i & 8388608) != 0 && this.f36996h4 == c10441fk.f36996h4) {
                m50790k4(8388608, false);
            }
            if ((i & 131072) != 0 && this.f37000m9 == c10441fk.f37000m9) {
                m50790k4(131072, false);
            }
            if ((i & 262144) != 0 && this.f36995dy.m51792kk() == c10441fk.f36995dy.m51792kk()) {
                m50790k4(262144, false);
            }
            if ((i & 524288) == 0 || this.f36992c5 != c10441fk.f36992c5) {
                return;
            }
            m50790k4(524288, false);
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m50794k4(C10597pu c10597pu) {
        if (c10597pu == null) {
            throw new ArgumentNullException("textCfException");
        }
        this.f36994du = c10597pu.f36994du;
        this.f36993ck = c10597pu.f36993ck;
        this.f36995dy = c10597pu.f36995dy;
        this.f36999kk = c10597pu.f36999kk;
        this.f37000m9 = c10597pu.f37000m9;
        this.f37002x1 = c10597pu.f37002x1;
        this.f36998k4 = c10597pu.f36998k4;
        this.f37001to = c10597pu.f37001to;
        this.f36992c5 = c10597pu.f36992c5;
        this.f36996h4 = c10597pu.f36996h4;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m50795k4(int i) {
        return (i & this.f36998k4) != 0;
    }
}
