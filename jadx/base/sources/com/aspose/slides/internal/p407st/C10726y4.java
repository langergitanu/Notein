package com.aspose.slides.internal.p407st;

import android.support.v4.media.session.PlaybackStateCompat;

/* JADX INFO: renamed from: com.aspose.slides.internal.st.y4 */
/* JADX INFO: loaded from: classes4.dex */
public class C10726y4 extends C10464he {
    public C10726y4() {
        super(575, false, 0L);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m52047k4(boolean z) {
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

    /* JADX INFO: renamed from: kk */
    public final void m52048kk(boolean z) {
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

    /* JADX INFO: renamed from: x1 */
    public final void m52050x1(boolean z) {
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

    public C10726y4(long j) {
        super(575, false, j);
    }

    /* JADX INFO: renamed from: kk */
    public final boolean m52049kk() {
        return (m51597ar() & 2) == 2;
    }

    /* JADX INFO: renamed from: x1 */
    public final boolean m52051x1() {
        return (m51597ar() & PlaybackStateCompat.ACTION_PREPARE_FROM_URI) == PlaybackStateCompat.ACTION_PREPARE_FROM_URI;
    }
}
