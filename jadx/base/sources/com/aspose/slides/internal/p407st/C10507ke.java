package com.aspose.slides.internal.p407st;

import com.aspose.slides.C22213OooOoOO;
import com.aspose.slides.internal.p080dd.C3134k4;
import com.aspose.slides.internal.p080dd.C3149x1;
import com.aspose.slides.internal.p294n9.C6765kp;
import com.aspose.slides.p559ms.System.C14042ak;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.st.ke */
/* JADX INFO: loaded from: classes4.dex */
public class C10507ke {

    /* JADX INFO: renamed from: dy */
    private int f37143dy = 0;

    /* JADX INFO: renamed from: k4 */
    protected C10390cl f37145k4 = null;

    /* JADX INFO: renamed from: x1 */
    protected int f37149x1 = 0;

    /* JADX INFO: renamed from: kk */
    protected int f37146kk = 0;

    /* JADX INFO: renamed from: to */
    protected boolean f37148to = false;

    /* JADX INFO: renamed from: du */
    protected byte f37142du = 0;

    /* JADX INFO: renamed from: h4 */
    protected boolean f37144h4 = false;

    /* JADX INFO: renamed from: m9 */
    protected long[] f37147m9 = null;

    /* JADX INFO: renamed from: c5 */
    public final boolean m51100c5() {
        return this.f37143dy == 0;
    }

    /* JADX INFO: renamed from: dy */
    public final int m51101dy() {
        int iM50562k4 = m51105k4(1) ? this.f37145k4.m50562k4() + 4 : 4;
        if (m51105k4(2)) {
            iM50562k4 += 2;
        }
        if (m51105k4(4)) {
            iM50562k4 += 2;
        }
        if (m51105k4(64)) {
            iM50562k4 += 2;
        }
        if (m51105k4(32)) {
            iM50562k4 += 4;
        }
        return m51105k4(512) ? C22213OooOoOO.OooO0O0(this.f37147m9.length, 4, 4, iM50562k4) : iM50562k4;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m51102k4(int i, boolean z) {
        int i2 = this.f37143dy | i;
        this.f37143dy = i2;
        if (z) {
            return;
        }
        this.f37143dy = i ^ i2;
    }

    public String toString() {
        C6765kp c6765kp = new C6765kp();
        c6765kp.m26810x1(C14113y2.m67402k4("  SIMask: 0x{0:X}, {1}", Long.valueOf(((long) this.f37143dy) & 4294967295L), C14042ak.m66410k4(C10436fb.class, this.f37143dy)));
        if (m51105k4(1)) {
            c6765kp.m26810x1(C14113y2.m67402k4("  SpellInfo: {0}", this.f37145k4));
        }
        if (m51105k4(2)) {
            c6765kp.m26810x1(C14113y2.m67402k4("  Language: {0}", Integer.valueOf(this.f37149x1)));
        }
        if (m51105k4(4)) {
            c6765kp.m26810x1(C14113y2.m67402k4("  AltLanguage: {0}", Integer.valueOf(this.f37146kk)));
        }
        if (m51105k4(64)) {
            c6765kp.m26810x1(C14113y2.m67402k4("  Bidirectional: {0}", Boolean.valueOf(this.f37148to)));
        }
        if (m51105k4(32)) {
            c6765kp.m26810x1(C14113y2.m67402k4("  PP10RunID: 0x{0:X}", Byte.valueOf(this.f37142du)));
            c6765kp.m26810x1(C14113y2.m67402k4("  GrammarError: {0}", Boolean.valueOf(this.f37144h4)));
        }
        if (m51105k4(512)) {
            c6765kp.m26792k4(C14113y2.m67402k4("  SmartTags: {0:X} item(s) [", Integer.valueOf(this.f37147m9.length)));
            int i = 0;
            while (true) {
                long[] jArr = this.f37147m9;
                if (i >= jArr.length) {
                    break;
                }
                c6765kp.m26792k4(i > 0 ? C14113y2.m67402k4(", 0x{0}", Long.valueOf(jArr[i])) : C14113y2.m67402k4("0x{0}", Long.valueOf(jArr[i])));
                i++;
            }
            c6765kp.m26810x1("]");
        }
        return c6765kp.toString();
    }

    /* JADX INFO: renamed from: k4 */
    public final void m51103k4(C3134k4 c3134k4) {
        this.f37143dy = (int) c3134k4.m13384uz();
        if (m51105k4(1)) {
            this.f37145k4 = new C10390cl(c3134k4);
        }
        if (m51105k4(2)) {
            this.f37149x1 = c3134k4.m13382u4();
        }
        if (m51105k4(4)) {
            this.f37146kk = c3134k4.m13382u4();
        }
        if (m51105k4(64)) {
            this.f37148to = c3134k4.m13381rv() != 0;
        }
        if (m51105k4(32)) {
            long jM13384uz = c3134k4.m13384uz();
            this.f37142du = (byte) (15 & jM13384uz);
            this.f37144h4 = (jM13384uz & 2147483648L) != 0;
        }
        if (m51105k4(512)) {
            int iM13386x6 = c3134k4.m13386x6();
            this.f37147m9 = new long[iM13386x6];
            for (int i = 0; i < iM13386x6; i++) {
                this.f37147m9[i] = c3134k4.m13384uz();
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m51104k4(C3149x1 c3149x1) {
        c3149x1.m13447k4(((long) this.f37143dy) & 4294967295L);
        if (m51105k4(1)) {
            this.f37145k4.m50564k4(c3149x1);
        }
        if (m51105k4(2)) {
            c3149x1.m13446k4(this.f37149x1);
        }
        if (m51105k4(4)) {
            c3149x1.m13446k4(this.f37146kk);
        }
        if (m51105k4(64)) {
            c3149x1.m13446k4((this.f37148to ? 1 : 0) & 65535);
        }
        if (m51105k4(32)) {
            c3149x1.m13447k4((((long) (this.f37142du & 255)) + ((this.f37144h4 ? 2147483648L : 0L) & 4294967295L)) & 4294967295L);
        }
        if (!m51105k4(512)) {
            return;
        }
        c3149x1.m13447k4(((long) this.f37147m9.length) & 4294967295L);
        int i = 0;
        while (true) {
            long[] jArr = this.f37147m9;
            if (i >= jArr.length) {
                return;
            }
            c3149x1.m13447k4(jArr[i]);
            i++;
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m51105k4(int i) {
        return (i & this.f37143dy) != 0;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m51106k4(C10507ke c10507ke) {
        int i = this.f37143dy;
        if (i != c10507ke.f37143dy) {
            return false;
        }
        if (i == 0) {
            return true;
        }
        if (m51105k4(1) && !this.f37145k4.m50566k4(c10507ke.f37145k4)) {
            return false;
        }
        if (m51105k4(2) && (this.f37149x1 & 65535) != (c10507ke.f37149x1 & 65535)) {
            return false;
        }
        if (m51105k4(4) && (this.f37146kk & 65535) != (65535 & c10507ke.f37146kk)) {
            return false;
        }
        if (m51105k4(64) && this.f37148to != c10507ke.f37148to) {
            return false;
        }
        if (m51105k4(32) && ((this.f37142du & 255) != (c10507ke.f37142du & 255) || this.f37144h4 != c10507ke.f37144h4)) {
            return false;
        }
        if (m51105k4(512)) {
            if (this.f37147m9.length == c10507ke.f37147m9.length) {
                int i2 = 0;
                while (true) {
                    long[] jArr = this.f37147m9;
                    if (i2 >= jArr.length) {
                        break;
                    }
                    if ((jArr[i2] & 4294967295L) != (c10507ke.f37147m9[i2] & 4294967295L)) {
                        return false;
                    }
                    i2++;
                }
            } else {
                return false;
            }
        }
        return true;
    }
}
