package com.aspose.slides.internal.p407st;

import android.support.v4.media.session.PlaybackStateCompat;
import androidx.core.app.FrameMetricsAggregator;

/* JADX INFO: renamed from: com.aspose.slides.internal.st.yo */
/* JADX INFO: loaded from: classes4.dex */
public class C10736yo extends C10464he {
    public C10736yo() {
        super(FrameMetricsAggregator.EVERY_DURATION, false, 0L);
    }

    /* JADX INFO: renamed from: c5 */
    public final void m52081c5(boolean z) {
        m52092k4(true);
        m52084du(z);
    }

    /* JADX INFO: renamed from: ck */
    public final void m52083ck(boolean z) {
        m52093kk(true);
        m52095m9(z);
    }

    /* JADX INFO: renamed from: du */
    public final void m52084du(boolean z) {
        long j;
        long jM51597ar = m51597ar();
        if (z) {
            jM51597ar |= 64;
            j = 4294967295L;
        } else {
            j = 4294967231L;
        }
        m51598k4(jM51597ar & j);
    }

    /* JADX INFO: renamed from: dy */
    public final void m52086dy(boolean z) {
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

    /* JADX INFO: renamed from: fa */
    public final void m52088fa(boolean z) {
        m52097to(true);
        m52086dy(z);
    }

    /* JADX INFO: renamed from: h4 */
    public final void m52089h4(boolean z) {
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

    /* JADX INFO: renamed from: jd */
    public final void m52091jd(boolean z) {
        m52099x1(true);
        m52089h4(z);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m52092k4(boolean z) {
        long j;
        long jM51597ar = m51597ar();
        if (z) {
            jM51597ar |= 4194304;
            j = 4294967295L;
        } else {
            j = 4290772991L;
        }
        m51598k4(jM51597ar & j);
    }

    /* JADX INFO: renamed from: kk */
    public final void m52093kk(boolean z) {
        long j;
        long jM51597ar = m51597ar();
        if (z) {
            jM51597ar |= PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE_ENABLED;
            j = 4294967295L;
        } else {
            j = 4294443007L;
        }
        m51598k4(jM51597ar & j);
    }

    /* JADX INFO: renamed from: m9 */
    public final void m52095m9(boolean z) {
        long j;
        long jM51597ar = m51597ar();
        if (z) {
            jM51597ar |= 8;
            j = 4294967295L;
        } else {
            j = 4294967287L;
        }
        m51598k4(jM51597ar & j);
    }

    /* JADX INFO: renamed from: to */
    public final void m52097to(boolean z) {
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

    /* JADX INFO: renamed from: x1 */
    public final void m52099x1(boolean z) {
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

    public C10736yo(long j) {
        super(FrameMetricsAggregator.EVERY_DURATION, false, j);
    }

    /* JADX INFO: renamed from: c5 */
    public final boolean m52082c5() {
        return !m52094kk() || m52090h4();
    }

    /* JADX INFO: renamed from: du */
    public final boolean m52085du() {
        return (m51597ar() & 64) == 64;
    }

    /* JADX INFO: renamed from: dy */
    public final boolean m52087dy() {
        return m52100x1() && m52085du();
    }

    /* JADX INFO: renamed from: h4 */
    public final boolean m52090h4() {
        return (m51597ar() & 32) == 32;
    }

    /* JADX INFO: renamed from: kk */
    public final boolean m52094kk() {
        return (m51597ar() & PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE) == PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE;
    }

    /* JADX INFO: renamed from: m9 */
    public final boolean m52096m9() {
        return (m51597ar() & 8) == 8;
    }

    /* JADX INFO: renamed from: to */
    public final boolean m52098to() {
        return (m51597ar() & PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE_ENABLED) == PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE_ENABLED;
    }

    /* JADX INFO: renamed from: x1 */
    public final boolean m52100x1() {
        return (m51597ar() & 4194304) == 4194304;
    }
}
