package com.aspose.slides.internal.p407st;

import android.support.v4.media.session.PlaybackStateCompat;

/* JADX INFO: renamed from: com.aspose.slides.internal.st.qk */
/* JADX INFO: loaded from: classes4.dex */
public class C10607qk extends C10464he {
    public C10607qk() {
        super(767, false, 0L);
    }

    /* JADX INFO: renamed from: c5 */
    public final void m51571c5(boolean z) {
        m51583kk(true);
        m51579h4(z);
    }

    /* JADX INFO: renamed from: ck */
    public final boolean m51573ck() {
        return !m51584kk() || m51587m9();
    }

    /* JADX INFO: renamed from: du */
    public final void m51574du(boolean z) {
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

    /* JADX INFO: renamed from: dy */
    public final void m51576dy(boolean z) {
        m51590x1(true);
        m51574du(z);
    }

    /* JADX INFO: renamed from: fa */
    public final boolean m51578fa() {
        return !m51589to() || m51577dy();
    }

    /* JADX INFO: renamed from: h4 */
    public final void m51579h4(boolean z) {
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

    /* JADX INFO: renamed from: jd */
    public final boolean m51581jd() {
        return !m51591x1() || m51580h4();
    }

    /* JADX INFO: renamed from: k4 */
    public final void m51582k4(boolean z) {
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

    /* JADX INFO: renamed from: kk */
    public final void m51583kk(boolean z) {
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

    /* JADX INFO: renamed from: ks */
    public final boolean m51585ks() {
        return m51575du() && m51572c5();
    }

    /* JADX INFO: renamed from: m9 */
    public final void m51586m9(boolean z) {
        m51582k4(true);
        m51588to(z);
    }

    /* JADX INFO: renamed from: to */
    public final void m51588to(boolean z) {
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

    /* JADX INFO: renamed from: x1 */
    public final void m51590x1(boolean z) {
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

    public C10607qk(long j) {
        super(767, false, j);
    }

    /* JADX INFO: renamed from: c5 */
    public final boolean m51572c5() {
        return (m51597ar() & 1) == 1;
    }

    /* JADX INFO: renamed from: du */
    public final boolean m51575du() {
        return (m51597ar() & 65536) == 65536;
    }

    /* JADX INFO: renamed from: dy */
    public final boolean m51577dy() {
        return (m51597ar() & 2) == 2;
    }

    /* JADX INFO: renamed from: h4 */
    public final boolean m51580h4() {
        return (m51597ar() & 16) == 16;
    }

    /* JADX INFO: renamed from: kk */
    public final boolean m51584kk() {
        return (m51597ar() & PlaybackStateCompat.ACTION_SET_REPEAT_MODE) == PlaybackStateCompat.ACTION_SET_REPEAT_MODE;
    }

    /* JADX INFO: renamed from: m9 */
    public final boolean m51587m9() {
        return (m51597ar() & 4) == 4;
    }

    /* JADX INFO: renamed from: to */
    public final boolean m51589to() {
        return (m51597ar() & PlaybackStateCompat.ACTION_PREPARE_FROM_URI) == PlaybackStateCompat.ACTION_PREPARE_FROM_URI;
    }

    /* JADX INFO: renamed from: x1 */
    public final boolean m51591x1() {
        return (m51597ar() & PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED) == PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED;
    }
}
