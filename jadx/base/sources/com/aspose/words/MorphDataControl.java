package com.aspose.words;

import android.support.v4.media.session.PlaybackStateCompat;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import com.huawei.hms.network.embedded.C18163eb;

/* JADX INFO: loaded from: classes6.dex */
public abstract class MorphDataControl extends Forms2OleControl {
    public MorphDataControl(String str) {
        super(str, new zzYXD());
    }

    @Override // com.aspose.words.OleControl
    public final int zzV(com.aspose.words.internal.zzZOW zzzow) throws Exception {
        int position = (int) zzzow.zzq().getPosition();
        zzzow.zzK((short) 512);
        zzzow.zzZa(2, 1);
        zzzow.zzZa(4, 1);
        zzzow.zzZa(4, 1);
        zzZLX zzzlx = new zzZLX(zzzow, this.zzYvV);
        int i = (int) (((long) ((int) (((long) ((int) (((long) ((int) (((long) ((int) (((long) ((int) (((long) ((int) (((long) ((int) (((long) ((int) (((long) ((int) (((long) ((int) (((long) ((int) (((long) ((int) (((long) ((int) (((long) ((int) (((long) ((int) (((long) ((int) (((long) ((int) (((long) ((int) (((long) ((int) ((zzzlx.zzX9(31010, 4) ? 1L : 0L) | (-2147483648L)))) | (zzzlx.zzX9(31005, 4) ? 2L : 0L)))) | (zzzlx.zzX9(31000, 4) ? 4L : 0L)))) | (zzzlx.zzX9(31075, 4) ? 8L : 0L)))) | (zzzlx.zzX9(31020, 1) ? 16L : 0L)))) | (zzzlx.zzX9(31080, 1) ? 32L : 0L)))) | (zzzlx.zzX9(31085, 1) ? 64L : 0L)))) | (zzzlx.zzX9(31045, 1) ? 128L : 0L)))) | (zzzlx.zzX9(31090, 2) ? 512L : 0L)))) | (zzzlx.zzX9(31095, 4) ? 1024L : 0L)))) | (zzzlx.zzX9(31100, 2) ? 2048L : 0L)))) | (zzzlx.zzX9(31105, 2) ? 4096L : 0L)))) | (zzzlx.zzX9(31110, 2) ? PlaybackStateCompat.ACTION_PLAY_FROM_URI : 0L)))) | (zzzlx.zzX9(31115, 2) ? 16384L : 0L)))) | (zzzlx.zzX9(31120, 2) ? PlaybackStateCompat.ACTION_PREPARE_FROM_MEDIA_ID : 0L)))) | (zzzlx.zzX9(31125, 1) ? 65536L : 0L)))) | (zzzlx.zzX9(31130, 1) ? PlaybackStateCompat.ACTION_PREPARE_FROM_URI : 0L)))) | (zzzlx.zzX9(31135, 1) ? PlaybackStateCompat.ACTION_SET_REPEAT_MODE : 0L)))) | (zzzlx.zzX9(31140, 1) ? PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED : 0L)))) | (zzzlx.zzX9(31145, 1) ? PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE : 0L));
        byte[] bArrZzLg = zzzlx.zzLg(getValue());
        byte[] bArrZzLg2 = zzzlx.zzLg(getCaption());
        long j = (int) (((long) ((int) (((long) ((int) (((long) ((int) (((long) ((int) (((long) i) | (zzzlx.zzX9(31040, 4) ? C18163eb.f54662y : 0L)))) | (zzzlx.zzX9(31050, 4) ? 33554432L : 0L)))) | (zzzlx.zzX9(31055, 4) ? 67108864L : 0L)))) | (zzzlx.zzX9(31070, 2) ? 134217728L : 0L)))) | (zzzlx.zzX9(31060, 2) ? 268435456L : 0L));
        long j2 = zzzlx.zzX9(31065, 2) ? 536870912L : 0L;
        byte[] bArrZzLg3 = zzzlx.zzLg(getGroupName());
        zzzlx.zzXB(4);
        int i2 = (int) (((long) ((int) (((long) ((int) (((long) ((int) (j2 | j))) | (zzzlx.zzX9(31025, 8) ? 256L : 0L)))) | (zzzlx.zzt(bArrZzLg, 4) ? 4194304L : 0L)))) | (zzzlx.zzt(bArrZzLg2, 4) ? 8388608L : 0L));
        boolean zZzt = zzzlx.zzt(bArrZzLg3, 4);
        zzzlx.zzXB(4);
        zzzlx.zzd(position, i2, zZzt ? 1 : 0);
        int i3 = (int) (((long) i2) & 4294967295L);
        if ((134217728 & i3) != 0) {
            zzzlx.zzYd(zzZ6o());
        }
        if ((i3 & WarningType.HINT) != 0) {
            zzzlx.zzYd(zzZ6n());
        }
        zzZLW.zzZ(zzzow, this.zzYvV);
        return (int) (zzzow.zzq().getPosition() - ((long) position));
    }

    @Override // com.aspose.words.OleControl
    public final void zzZ(com.aspose.words.internal.zzZOX zzzox) throws Exception {
        zzzox.zzXa();
        zzzox.zzXa();
        int iZzXb = (int) (((long) zzzox.zzXb()) & 4294967295L);
        int iZzXb2 = (int) (((long) zzzox.zzXb()) & 4294967295L);
        zzZLY zzzly = new zzZLY(zzzox, this.zzYvV);
        zzzly.zzZjA = iZzXb;
        zzzly.zzf(1, 4, 31010);
        zzzly.zzf(2, 4, 31005);
        zzzly.zzf(4, 4, 31000);
        zzzly.zzf(8, 4, 31075);
        zzzly.zzf(16, 1, 31020);
        zzzly.zzf(32, 1, 31080);
        zzzly.zzf(64, 1, 31085);
        zzzly.zzf(128, 1, 31045);
        zzzly.zzf(512, 2, 31090);
        zzzly.zzf(1024, 4, 31095);
        zzzly.zzf(2048, 2, 31100);
        zzzly.zzf(4096, 2, 31105);
        zzzly.zzf(8192, 2, 31110);
        zzzly.zzf(16384, 2, 31115);
        zzzly.zzf(32768, 2, 31120);
        zzzly.zzf(65536, 1, 31125);
        zzzly.zzf(131072, 1, 31130);
        zzzly.zzf(262144, 1, 31135);
        zzzly.zzf(1048576, 1, 31140);
        zzzly.zzf(2097152, 1, 31145);
        int iZzXf = zzzly.zzXf(4194304, 4);
        int iZzXf2 = zzzly.zzXf(8388608, 4);
        zzzly.zzf(16777216, 4, 31040);
        zzzly.zzf(33554432, 4, 31050);
        zzzly.zzf(AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL, 4, 31055);
        zzzly.zzf(134217728, 2, 31070);
        zzzly.zzf(WarningType.HINT, 2, 31060);
        zzzly.zzf(536870912, 2, 31065);
        zzzly.zzZjA = iZzXb2;
        int iZzXf3 = zzzly.zzXf(1, 4);
        zzzly.zzZjA = iZzXb;
        zzzly.zzXc(256, 31025);
        zzzly.zze(4194304, iZzXf, 31030);
        zzzly.zze(8388608, iZzXf2, 31015);
        zzzly.zzZjA = iZzXb2;
        zzzly.zze(1, iZzXf3, 31155);
        zzzly.zzAE(4);
        if ((iZzXb & 134217728) != 0) {
            zzzly.zzAD(31070);
        }
        if ((iZzXb & WarningType.HINT) != 0) {
            zzzly.zzAD(31060);
        }
        zzZLW.zzZ(zzzox, this.zzYvV);
    }

    public final void zztJ(int i) {
        this.zzYvV.zzQ(31085, Integer.valueOf(i));
    }
}
