package com.aspose.slides.internal.p407st;

import android.support.v4.media.session.PlaybackStateCompat;

/* JADX INFO: renamed from: com.aspose.slides.internal.st.wz */
/* JADX INFO: loaded from: classes4.dex */
public class C10701wz extends C10464he {
    public C10701wz() {
        super(703, false, 0L);
    }

    /* JADX INFO: renamed from: du */
    public final void m51956du(boolean z) {
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

    /* JADX INFO: renamed from: h4 */
    public final void m51957h4(boolean z) {
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

    /* JADX INFO: renamed from: k4 */
    public final void m51958k4(boolean z) {
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

    /* JADX INFO: renamed from: kk */
    public final void m51959kk(boolean z) {
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

    /* JADX INFO: renamed from: to */
    public final void m51961to(boolean z) {
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

    /* JADX INFO: renamed from: x1 */
    public final void m51962x1(boolean z) {
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

    public C10701wz(long j) {
        super(703, false, j);
    }

    /* JADX INFO: renamed from: kk */
    public final boolean m51960kk() {
        return (m51597ar() & 8) == 8;
    }

    /* JADX INFO: renamed from: x1 */
    public final boolean m51963x1() {
        return (m51597ar() & PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE_ENABLED) == PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE_ENABLED;
    }
}
