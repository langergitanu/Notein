package com.huawei.hms.network.embedded;

import android.support.v4.media.session.PlaybackStateCompat;

/* JADX INFO: renamed from: com.huawei.hms.network.embedded.gc */
/* JADX INFO: loaded from: classes9.dex */
public final class C18192gc {

    /* JADX INFO: renamed from: a */
    public static final long f54991a = 65536;

    /* JADX INFO: renamed from: b */
    public static C18178fc f54992b;

    /* JADX INFO: renamed from: c */
    public static long f54993c;

    /* JADX INFO: renamed from: a */
    public static C18178fc m78639a() {
        synchronized (C18192gc.class) {
            try {
                C18178fc c18178fc = f54992b;
                if (c18178fc == null) {
                    return new C18178fc();
                }
                f54992b = c18178fc.f54870f;
                c18178fc.f54870f = null;
                f54993c -= PlaybackStateCompat.ACTION_PLAY_FROM_URI;
                return c18178fc;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m78640a(C18178fc c18178fc) {
        if (c18178fc.f54870f != null || c18178fc.f54871g != null) {
            throw new IllegalArgumentException();
        }
        if (c18178fc.f54868d) {
            return;
        }
        synchronized (C18192gc.class) {
            try {
                long j = f54993c;
                if (j + PlaybackStateCompat.ACTION_PLAY_FROM_URI <= 65536) {
                    f54993c = j + PlaybackStateCompat.ACTION_PLAY_FROM_URI;
                    c18178fc.f54870f = f54992b;
                    c18178fc.f54867c = 0;
                    c18178fc.f54866b = 0;
                    f54992b = c18178fc;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
