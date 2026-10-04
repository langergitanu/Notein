package com.aspose.slides.internal.p407st;

import android.support.v4.media.session.PlaybackStateCompat;

/* JADX INFO: renamed from: com.aspose.slides.internal.st.bs */
/* JADX INFO: loaded from: classes4.dex */
public class C10374bs extends C10464he {
    public C10374bs() {
        super(447, false, 0L);
    }

    /* JADX INFO: renamed from: c5 */
    public final void m50484c5(boolean z) {
        long j;
        long jM51597ar = m51597ar();
        if (z) {
            jM51597ar |= 2;
            j = 4294967295L;
        } else {
            j = 4294967293L;
        }
        m51598k4(jM51597ar & j);
    }

    /* JADX INFO: renamed from: ck */
    public final void m50485ck(boolean z) {
        m50491k4(true);
        m50489h4(z);
    }

    /* JADX INFO: renamed from: du */
    public final void m50486du(boolean z) {
        long j;
        long jM51597ar = m51597ar();
        if (z) {
            jM51597ar |= 65536;
            j = 4294967295L;
        } else {
            j = 4294901759L;
        }
        m51598k4(jM51597ar & j);
    }

    /* JADX INFO: renamed from: dy */
    public final void m50487dy(boolean z) {
        long j;
        long jM51597ar = m51597ar();
        if (z) {
            jM51597ar |= 4;
            j = 4294967295L;
        } else {
            j = 4294967291L;
        }
        m51598k4(jM51597ar & j);
    }

    /* JADX INFO: renamed from: fa */
    public final void m50488fa(boolean z) {
        m50499x1(true);
        m50495m9(z);
    }

    /* JADX INFO: renamed from: h4 */
    public final void m50489h4(boolean z) {
        long j;
        long jM51597ar = m51597ar();
        if (z) {
            jM51597ar |= 32;
            j = 4294967295L;
        } else {
            j = 4294967263L;
        }
        m51598k4(jM51597ar & j);
    }

    /* JADX INFO: renamed from: jd */
    public final void m50490jd(boolean z) {
        long j;
        long jM51597ar = m51597ar();
        if (z) {
            jM51597ar |= 1;
            j = 4294967295L;
        } else {
            j = 4294967294L;
        }
        m51598k4(jM51597ar & j);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m50491k4(boolean z) {
        long j;
        long jM51597ar = m51597ar();
        if (z) {
            jM51597ar |= PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE;
            j = 4294967295L;
        } else {
            j = 4292870143L;
        }
        m51598k4(jM51597ar & j);
    }

    /* JADX INFO: renamed from: kk */
    public final void m50492kk(boolean z) {
        long j;
        long jM51597ar = m51597ar();
        if (z) {
            jM51597ar |= PlaybackStateCompat.ACTION_SET_REPEAT_MODE;
            j = 4294967295L;
        } else {
            j = 4294705151L;
        }
        m51598k4(jM51597ar & j);
    }

    /* JADX INFO: renamed from: ks */
    public final void m50494ks(boolean z) {
        m50486du(true);
        m50490jd(z);
    }

    /* JADX INFO: renamed from: m9 */
    public final void m50495m9(boolean z) {
        long j;
        long jM51597ar = m51597ar();
        if (z) {
            jM51597ar |= 16;
            j = 4294967295L;
        } else {
            j = 4294967279L;
        }
        m51598k4(jM51597ar & j);
    }

    /* JADX INFO: renamed from: to */
    public final void m50496to(boolean z) {
        long j;
        long jM51597ar = m51597ar();
        if (z) {
            jM51597ar |= PlaybackStateCompat.ACTION_PREPARE_FROM_URI;
            j = 4294967295L;
        } else {
            j = 4294836223L;
        }
        m51598k4(jM51597ar & j);
    }

    /* JADX INFO: renamed from: up */
    public final void m50498up(boolean z) {
        m50492kk(true);
        m50487dy(z);
    }

    /* JADX INFO: renamed from: x1 */
    public final void m50499x1(boolean z) {
        long j;
        long jM51597ar = m51597ar();
        if (z) {
            jM51597ar |= PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED;
            j = 4294967295L;
        } else {
            j = 4293918719L;
        }
        m51598k4(jM51597ar & j);
    }

    /* JADX INFO: renamed from: yj */
    public final void m50501yj(boolean z) {
        m50496to(true);
        m50484c5(z);
    }

    public C10374bs(long j) {
        super(447, false, j);
    }

    /* JADX INFO: renamed from: kk */
    public final boolean m50493kk() {
        return (m51597ar() & 64) == 64;
    }

    /* JADX INFO: renamed from: to */
    public final boolean m50497to() {
        return m50500x1() && m50493kk();
    }

    /* JADX INFO: renamed from: x1 */
    public final boolean m50500x1() {
        return (m51597ar() & 4194304) == 4194304;
    }
}
