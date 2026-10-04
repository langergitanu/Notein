package com.aspose.words.internal;

import android.support.v4.media.session.PlaybackStateCompat;

/* JADX INFO: loaded from: classes5.dex */
final class zzN3 {
    private long zzE2;
    private int zzE7 = 0;
    private int zzE6 = 0;
    private float zzE5 = 0.16666667f;
    private float zzE4 = 0.16666667f;
    private float zzE3 = 1.03f;
    private int zzE1 = 1;

    public static zzN3 zzX(zzO8 zzo8) throws Exception {
        zzN3 zzn3 = new zzN3();
        zzo8.zzXc();
        zzn3.zzE2 = ((long) zzo8.zzXc()) & 4294967295L;
        zzo8.zzXc();
        zzn3.zzE7 = zzo8.zzXc();
        zzn3.zzE6 = zzo8.zzXc();
        zzo8.zzXc();
        zzo8.zzXc();
        zzo8.zzXc();
        zzo8.zzXc();
        zzn3.zzE5 = Float.intBitsToFloat(zzo8.zzXc());
        zzn3.zzE4 = Float.intBitsToFloat(zzo8.zzXc());
        zzn3.zzE3 = Float.intBitsToFloat(zzo8.zzXc());
        zzn3.zzE1 = zzo8.zzXc();
        return zzn3;
    }

    public final boolean zzK2() {
        return (this.zzE2 & 16384) != 0;
    }

    public final boolean zzK3() {
        return (this.zzE2 & PlaybackStateCompat.ACTION_PLAY_FROM_URI) != 0;
    }

    public final boolean zzK4() {
        return (this.zzE2 & 4096) != 0;
    }

    public final boolean zzK5() {
        return (this.zzE2 & 2) != 0;
    }

    public final boolean zzK6() {
        return (this.zzE2 & 1) != 0;
    }

    public final int zzK7() {
        return this.zzE1;
    }

    public final float zzK8() {
        return this.zzE3;
    }

    public final float zzK9() {
        return this.zzE4;
    }

    public final float zzKa() {
        return this.zzE5;
    }

    public final int zzKb() {
        return this.zzE6;
    }

    public final int zzKc() {
        return this.zzE7;
    }
}
