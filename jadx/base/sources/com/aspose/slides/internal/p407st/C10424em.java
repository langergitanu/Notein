package com.aspose.slides.internal.p407st;

import android.support.v4.media.session.PlaybackStateCompat;
import com.aspose.words.StyleIdentifier;

/* JADX INFO: renamed from: com.aspose.slides.internal.st.em */
/* JADX INFO: loaded from: classes4.dex */
public class C10424em extends C10464he {
    public C10424em() {
        super(StyleIdentifier.GRID_TABLE_5_DARK_ACCENT_6, false, 0L);
    }

    /* JADX INFO: renamed from: du */
    public final void m50761du(boolean z) {
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

    /* JADX INFO: renamed from: h4 */
    public final void m50762h4(boolean z) {
        m50763k4(true);
        m50766to(z);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m50763k4(boolean z) {
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
    public final void m50764kk(boolean z) {
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

    /* JADX INFO: renamed from: m9 */
    public final void m50765m9(boolean z) {
        m50767x1(true);
        m50761du(z);
    }

    /* JADX INFO: renamed from: to */
    public final void m50766to(boolean z) {
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
    public final void m50767x1(boolean z) {
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

    public C10424em(long j) {
        super(StyleIdentifier.GRID_TABLE_5_DARK_ACCENT_6, false, j);
    }
}
