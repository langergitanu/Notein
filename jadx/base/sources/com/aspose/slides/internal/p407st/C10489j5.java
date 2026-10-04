package com.aspose.slides.internal.p407st;

import android.support.v4.media.session.PlaybackStateCompat;

/* JADX INFO: renamed from: com.aspose.slides.internal.st.j5 */
/* JADX INFO: loaded from: classes4.dex */
public class C10489j5 extends C10464he {
    public C10489j5() {
        super(959, false, 0L);
    }

    /* JADX INFO: renamed from: du */
    public final void m50984du(boolean z) {
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
    public final void m50985k4(boolean z) {
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
    public final void m50986kk(boolean z) {
        long j;
        long jM51597ar = m51597ar();
        if (z) {
            jM51597ar |= 512;
            j = 4294967295L;
        } else {
            j = 4294966783L;
        }
        m51598k4(jM51597ar & j);
    }

    /* JADX INFO: renamed from: to */
    public final void m50987to(boolean z) {
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
    public final void m50988x1(boolean z) {
        long j;
        long jM51597ar = m51597ar();
        if (z) {
            jM51597ar |= PlaybackStateCompat.ACTION_PREPARE_FROM_MEDIA_ID;
            j = 4294967295L;
        } else {
            j = 4294934527L;
        }
        m51598k4(jM51597ar & j);
    }

    public C10489j5(long j) {
        super(959, false, j);
    }
}
