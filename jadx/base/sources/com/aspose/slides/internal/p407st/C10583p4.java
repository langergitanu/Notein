package com.aspose.slides.internal.p407st;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.internal.p077d8.C3085sv;
import com.aspose.slides.internal.p080dd.C3134k4;
import com.aspose.slides.internal.p080dd.C3141rv;
import com.aspose.slides.internal.p080dd.C3149x1;
import com.aspose.slides.internal.p294n9.AbstractC6747ar;
import com.aspose.slides.internal.p294n9.C6765kp;
import com.aspose.slides.p559ms.System.C14047bz;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.st.p4 */
/* JADX INFO: loaded from: classes4.dex */
public final class C10583p4 extends AbstractC10716xo {

    /* JADX INFO: renamed from: du */
    private byte[] f37275du;

    /* JADX INFO: renamed from: k4 */
    private int f37276k4;

    /* JADX INFO: renamed from: kk */
    private String f37277kk;

    /* JADX INFO: renamed from: to */
    private int f37278to = 65535;

    /* JADX INFO: renamed from: x1 */
    private String f37279x1;

    public C10583p4() {
        m51459k4((String) null);
        m51462x1(null);
    }

    /* JADX INFO: renamed from: kk */
    private static int m51452kk(String str) {
        int i = 0;
        if (str == null) {
            return 0;
        }
        while (true) {
            int i2 = (65535 & i) * 3;
            if (str.length() <= i2 + 3 || str.charAt(i2) != '.' || str.charAt(i2 + 1) != '.') {
                break;
            }
            int i3 = i2 + 2;
            if (str.charAt(i3) != '\\' && str.charAt(i3) != '/') {
                break;
            }
            i++;
        }
        return i;
    }

    /* JADX INFO: renamed from: c5 */
    public final long m51453c5() {
        String str = this.f37277kk;
        return ((long) ((str == null || str.length() <= 0) ? 0 : this.f37277kk.length() * 2)) & 4294967295L;
    }

    /* JADX INFO: renamed from: du */
    public final long m51454du() {
        String str = this.f37279x1;
        return ((long) ((str != null ? str.length() - ((this.f37276k4 & 65535) * 3) : 0) + 1)) & 4294967295L;
    }

    /* JADX INFO: renamed from: dy */
    public final long m51455dy() {
        String str = this.f37277kk;
        return ((long) ((str == null || str.length() <= 0) ? 0 : (this.f37277kk.length() * 2) + 6)) & 4294967295L;
    }

    /* JADX INFO: renamed from: h4 */
    public final String m51456h4() {
        return this.f37279x1;
    }

    /* JADX INFO: renamed from: jd */
    public final String m51457jd() {
        return this.f37277kk;
    }

    @Override // com.aspose.slides.internal.p407st.AbstractC10716xo
    /* JADX INFO: renamed from: k4 */
    public C14047bz mo50989k4() {
        return C10517kw.f37163x1;
    }

    /* JADX INFO: renamed from: m9 */
    public final int m51460m9() {
        return C3085sv.m13071k4(this.f37278to);
    }

    @Override // com.aspose.slides.internal.p407st.AbstractC10716xo
    /* JADX INFO: renamed from: to */
    public String mo50993to() {
        return m51457jd() != null ? m51457jd() : m51456h4();
    }

    /* JADX INFO: renamed from: x1 */
    public final int m51461x1() {
        return C3085sv.m13071k4(this.f37276k4);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m51458k4(int i) {
        this.f37278to = i;
    }

    @Override // com.aspose.slides.internal.p407st.AbstractC10716xo
    /* JADX INFO: renamed from: kk */
    public long mo50992kk() {
        return ((((((((((((((m51454du() & 4294967295L) + 6) & 4294967295L) + 2) & 4294967295L) + 2) & 4294967295L) + 16) & 4294967295L) + 4) & 4294967295L) + 4) & 4294967295L) + (((m51455dy() & 4294967295L) > 0 ? m51455dy() : 0L) & 4294967295L)) & 4294967295L;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m51462x1(String str) {
        this.f37277kk = str;
    }

    @Override // com.aspose.slides.internal.p407st.AbstractC10716xo
    /* JADX INFO: renamed from: k4 */
    public void mo50990k4(C3134k4 c3134k4) {
        int iM13382u4 = c3134k4.m13382u4();
        long jM13384uz = c3134k4.m13384uz();
        C6765kp c6765kp = new C6765kp();
        if ((jM13384uz & 4294967295L) > 1) {
            c6765kp.m26792k4(AbstractC6747ar.m26644to(1252).m26681x1(c3134k4.m13372dy(((int) jM13384uz) - 1)));
            for (int i = 0; i < (65535 & iM13382u4); i++) {
                c6765kp.m26808x1(0, C3141rv.f9302kk);
                c6765kp.m26786k4(0, "..");
            }
            m51459k4(c6765kp.toString());
        }
        c3134k4.m13387yj();
        m51458k4(c3134k4.m13382u4());
        c3134k4.m13382u4();
        c3134k4.m13372dy(16);
        c3134k4.m13372dy(4);
        long jM13384uz2 = c3134k4.m13384uz() & 4294967295L;
        if (jM13384uz2 > 0) {
            long jM13384uz3 = c3134k4.m13384uz();
            c3134k4.m13382u4();
            int i2 = (int) jM13384uz3;
            m51462x1(AbstractC6747ar.m26643rv().m26681x1(c3134k4.m13372dy(i2)));
            if (jM13384uz2 > (4294967295L & ((jM13384uz3 & 4294967295L) + 6))) {
                this.f37275du = c3134k4.m13372dy((((int) r0) - 6) - i2);
            }
        }
    }

    @Override // com.aspose.slides.internal.p407st.AbstractC10716xo
    /* JADX INFO: renamed from: k4 */
    public void mo50991k4(C3149x1 c3149x1) {
        c3149x1.m13446k4(C3085sv.m13071k4(m51461x1()));
        c3149x1.m13447k4(m51454du());
        if ((m51454du() & 4294967295L) > 1) {
            c3149x1.m13450k4(AbstractC6747ar.m26644to(1252).mo26677to(C14113y2.m67422kk(m51456h4(), (m51461x1() & 65535) * 3)));
        }
        c3149x1.m13443k4((byte) 0);
        c3149x1.m13446k4(C3085sv.m13071k4(m51460m9()));
        c3149x1.m13446k4(C3085sv.m13071k4(57005));
        c3149x1.m13450k4(new byte[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0});
        c3149x1.m13450k4(new byte[]{0, 0, 0, 0});
        c3149x1.m13447k4(m51455dy());
        if ((m51455dy() & 4294967295L) > 0) {
            c3149x1.m13447k4(m51453c5());
            c3149x1.m13446k4(3);
            c3149x1.m13450k4(AbstractC6747ar.m26643rv().mo26677to(m51457jd()));
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m51459k4(String str) {
        if (str != null) {
            int iM51452kk = m51452kk(str);
            if (str.length() - ((65535 & iM51452kk) * 3) > 32767) {
                throw new ArgumentException("AnsiPath length can't be more than 32767 (with null-terminator inclusive).");
            }
            this.f37276k4 = iM51452kk;
        } else {
            this.f37276k4 = 0;
            str = null;
        }
        this.f37279x1 = str;
    }
}
