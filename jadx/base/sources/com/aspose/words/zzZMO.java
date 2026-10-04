package com.aspose.words;

import android.support.v4.media.session.PlaybackStateCompat;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import com.google.common.primitives.UnsignedBytes;
import com.huawei.hms.network.embedded.C18163eb;

/* JADX INFO: loaded from: classes6.dex */
class zzZMO extends Forms2OleControl {
    private Forms2OleControlCollection zzYwn;
    private zzYO8 zzZxa;

    public zzZMO(String str) {
        super(str, new zzZMN());
        this.zzYwn = new Forms2OleControlCollection();
        zzYO8 zzyo8Zzh = zzYO8.zzh(216.0d, 216.0d);
        this.zzZxa = zzyo8Zzh;
        zzZ(zzyo8Zzh);
    }

    private void zzK(com.aspose.words.internal.zzZOW zzzow) throws Exception {
        zzL(zzzow);
        zzzow.zzl(getChildNodes().getCount());
        int position = (int) zzzow.zzq().getPosition();
        zzzow.zzk(0);
        if (getChildNodes().getCount() == 0) {
            return;
        }
        int iZzX = zzX(zzzow, getChildNodes().getCount()) % 4;
        zzzow.writeBytes(new byte[iZzX == 0 ? 0 : 4 - iZzX]);
        for (int i = 0; i < getChildNodes().getCount(); i++) {
            zzYO9.zzY(zzzow, getChildNodes().get(i));
        }
        int position2 = (((int) zzzow.zzq().getPosition()) - position) - 4;
        zzzow.zzZa(position, 0);
        zzzow.zzl(position2);
        zzzow.zzZa(0, 2);
    }

    private void zzL(com.aspose.words.internal.zzZOW zzzow) throws Exception {
        if ((((Integer) this.zzYvV.zzPj(31205)).intValue() & 32768) == 0) {
            zzzow.zzJ((short) 0);
        }
    }

    private void zzT(com.aspose.words.internal.zzAA zzaa) throws Exception {
        com.aspose.words.internal.zzZOR zzzor = new com.aspose.words.internal.zzZOR();
        com.aspose.words.internal.zzZOW zzzow = new com.aspose.words.internal.zzZOW(zzzor);
        com.aspose.words.internal.zzIM zzim = new com.aspose.words.internal.zzIM();
        for (int i = 0; i < getChildNodes().getCount(); i++) {
            zzZ(getChildNodes().get(i), (com.aspose.words.internal.zzIM<Integer>) zzim);
            if (getChildNodes().get(i).isComposite()) {
                zzaa.set(com.aspose.words.internal.zzZKN.format("i{0:d2}", Integer.valueOf(getChildNodes().get(i).getIdInternal())), getChildNodes().get(i).getOleObject().zzYrr());
            } else {
                getChildNodes().get(i).zzAF(getChildNodes().get(i).zzV(zzzow));
            }
        }
        zzaa.set("o", zzzor);
    }

    private void zzp(com.aspose.words.internal.zzZOX zzzox) throws Exception {
        int iZzX9 = (((Integer) this.zzYvV.zzPj(31205)).intValue() & 32768) != 0 ? 0 : zzzox.zzX9() & 65535;
        zzYB6[] zzyb6Arr = new zzYB6[iZzX9];
        for (int i = 0; i < iZzX9; i++) {
            zzyb6Arr[i] = new zzYB6(zzzox);
        }
    }

    private static int zzq(com.aspose.words.internal.zzZOX zzzox) throws Exception {
        long position = zzzox.zzq().getPosition();
        zzzox.readByte();
        if ((zzzox.readByte() & UnsignedBytes.MAX_POWER_OF_TWO) != 0) {
            zzzox.readByte();
        }
        return (int) (zzzox.zzq().getPosition() - position);
    }

    private void zzra() {
        int iIntValue = ((Integer) this.zzYvV.zzPj(31205)).intValue();
        this.zzYvV.set(31205, Integer.valueOf(zzZMD.zzZ(this.zzYvV) ? iIntValue & (-16385) : iIntValue | 16384));
        if (!this.zzYvV.contains(31245)) {
            this.zzYvV.zzQ(31245, 32000);
        }
        if (!this.zzYvV.contains(31255)) {
            this.zzYvV.zzQ(31255, new zzYO8(0, 0));
        }
        this.zzYvV.set(31275, Integer.valueOf((this.zzYvV.contains(31275) ? ((Integer) this.zzYvV.get(31275)).intValue() : 35) | 262144));
    }

    @Override // com.aspose.words.Forms2OleControl
    public Forms2OleControlCollection getChildNodes() {
        return this.zzYwn;
    }

    @Override // com.aspose.words.OleControl
    public String getClsidVirtual() {
        return "c62a69f0-16dc-11ce-9e98-00aa00574a4f";
    }

    @Override // com.aspose.words.Forms2OleControl
    public int getType() {
        return 13;
    }

    @Override // com.aspose.words.Forms2OleControl
    public boolean isComposite() {
        return true;
    }

    @Override // com.aspose.words.Forms2OleControl
    public final int zz1E() {
        return 7;
    }

    public final void zzU(com.aspose.words.internal.zzAA zzaa) throws Exception {
        com.aspose.words.internal.zzZOR zzzor = new com.aspose.words.internal.zzZOR();
        com.aspose.words.internal.zzZOW zzzow = new com.aspose.words.internal.zzZOW(zzzor);
        zzV(zzzow);
        zzT(zzaa);
        zzK(zzzow);
        if ((((Integer) this.zzYvV.zzPj(31205)).intValue() & 16384) != 0) {
            zzZMD.zzZ(zzzow, this.zzYvV);
        }
        zzaa.set("f", zzzor);
    }

    @Override // com.aspose.words.OleControl
    public final int zzV(com.aspose.words.internal.zzZOW zzzow) throws Exception {
        int position = (int) zzzow.zzq().getPosition();
        zzra();
        zzzow.zzJ((short) 1024);
        zzzow.zzZa(2, 1);
        zzzow.zzZa(4, 1);
        zzZLX zzzlx = new zzZLX(zzzow, this.zzYvV);
        int i = (int) (((long) ((int) (((long) ((int) (((long) ((int) (((long) ((int) (((long) ((int) (((long) ((int) (((long) ((int) (((long) ((int) (((long) ((int) (((long) ((int) (((long) ((int) (zzzlx.zzX9(31005, 4) ? 2L : 0L))) | (zzzlx.zzX9(31000, 4) ? 4L : 0L)))) | (zzzlx.zzX9(31200, 4) ? 8L : 0L)))) | (zzzlx.zzX9(31205, 4) ? 64L : 0L)))) | (zzzlx.zzX9(31020, 1) ? 128L : 0L)))) | (zzzlx.zzX9(31045, 1) ? 256L : 0L)))) | (zzzlx.zzX9(31080, 1) ? 512L : 0L)))) | (zzzlx.zzX9(31210, 4) ? PlaybackStateCompat.ACTION_PLAY_FROM_URI : 0L)))) | (zzzlx.zzX9(31070, 2) ? PlaybackStateCompat.ACTION_PREPARE_FROM_MEDIA_ID : 0L)))) | (zzzlx.zzX9(31215, 1) ? 65536L : 0L)))) | (zzzlx.zzX9(31055, 1) ? PlaybackStateCompat.ACTION_PREPARE_FROM_URI : 0L)))) | (zzzlx.zzX9(31050, 4) ? PlaybackStateCompat.ACTION_SET_REPEAT_MODE : 0L));
        byte[] bArrZzLg = zzzlx.zzLg(getCaption());
        long j = (int) (((long) ((int) (((long) ((int) ((zzzlx.zzX9(31235, 1) ? 33554432L : 0L) | ((long) ((int) (((long) ((int) (((long) ((int) (((long) ((int) (((long) i) | (zzzlx.zzX9(31220, 2) ? PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED : 0L)))) | (zzzlx.zzX9(31060, 2) ? PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE : 0L)))) | (zzzlx.zzX9(31225, 4) ? 4194304L : 0L)))) | (zzzlx.zzX9(31230, 1) ? 8388608L : 0L))))))) | (zzzlx.zzX9(31240, 4) ? 67108864L : 0L)))) | (zzzlx.zzX9(31245, 4) ? 134217728L : 0L));
        long j2 = ((Boolean) this.zzYvV.zzPj(31405)).booleanValue() ? C18163eb.f54662y : 0L;
        zzzlx.zzXB(4);
        int i2 = (int) (((long) ((int) (((long) ((int) (((long) ((int) (((long) ((int) (j | j2))) | (zzzlx.zzX9(31025, 8) ? 1024L : 0L)))) | (zzzlx.zzX9(31255, 8) ? 2048L : 0L)))) | (zzzlx.zzX9(31260, 8) ? 4096L : 0L)))) | (zzzlx.zzt(bArrZzLg, 4) ? PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE_ENABLED : 0L));
        zzzlx.zzXB(4);
        zzzlx.zzd(position, i2, -1);
        int i3 = (int) (((long) i2) & 4294967295L);
        if ((32768 & i3) != 0) {
            zzzlx.zzYd(zzZ6o());
        }
        if ((1048576 & i3) != 0) {
            zzzlx.zzZ5J();
        }
        if ((i3 & 2097152) != 0) {
            zzzlx.zzYd(zzZ6n());
        }
        return (int) (zzzow.zzq().getPosition() - ((long) position));
    }

    @Override // com.aspose.words.Forms2OleControl, com.aspose.words.OleControl
    public void zzW(com.aspose.words.internal.zzAA zzaa) throws Exception {
        zzU(zzaa);
    }

    @Override // com.aspose.words.Forms2OleControl, com.aspose.words.OleControl
    public void zzX(com.aspose.words.internal.zzAA zzaa) throws Exception {
        zzV(zzaa);
    }

    @Override // com.aspose.words.OleControl
    public final void zzZ(com.aspose.words.internal.zzZOX zzzox) throws Exception {
        zzzox.zzX9();
        zzzox.zzX9();
        int iZzXb = (int) (((long) zzzox.zzXb()) & 4294967295L);
        zzZLY zzzly = new zzZLY(zzzox, this.zzYvV);
        zzzly.zzZjA = iZzXb;
        zzzly.zzf(2, 4, 31005);
        zzzly.zzf(4, 4, 31000);
        zzzly.zzf(8, 4, 31200);
        zzzly.zzf(64, 4, 31205);
        zzzly.zzf(128, 1, 31020);
        zzzly.zzf(256, 1, 31045);
        zzzly.zzf(512, 1, 31080);
        zzzly.zzf(8192, 4, 31210);
        zzzly.zzXe(32768, 2);
        zzzly.zzf(65536, 1, 31215);
        zzzly.zzf(131072, 1, 31055);
        zzzly.zzf(262144, 4, 31050);
        int iZzXf = zzzly.zzXf(524288, 4);
        zzzly.zzXe(1048576, 2);
        zzzly.zzXe(2097152, 2);
        zzzly.zzf(4194304, 4, 31225);
        zzzly.zzf(8388608, 1, 31230);
        zzzly.zzf(33554432, 1, 31235);
        zzzly.zzf(AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL, 4, 31240);
        zzzly.zzf(134217728, 4, 31245);
        this.zzYvV.zzQ(31405, Boolean.valueOf((16777216 & iZzXb) != 0));
        zzzly.zzXc(1024, 31025);
        zzzly.zzXc(2048, 31255);
        zzzly.zzXc(4096, 31260);
        zzzly.zze(524288, iZzXf, 31015);
        zzzly.zzAE(4);
        if ((32768 & iZzXb) != 0) {
            zzzly.zzAD(31070);
        }
        if ((iZzXb & 1048576) != 0) {
            zzzly.zzZ5K();
        }
        if ((iZzXb & 2097152) != 0) {
            zzzly.zzAD(31060);
        }
    }

    private static int zzX(com.aspose.words.internal.zzZOW zzzow, int i) throws Exception {
        long position = zzzow.zzq().getPosition();
        zzzow.writeByte((byte) 0);
        boolean z = i > 1;
        zzzow.writeByte((byte) (i | (z ? 128 : 0)));
        if (z) {
            zzzow.writeByte((byte) 1);
        }
        return (int) (zzzow.zzq().getPosition() - position);
    }

    private void zzZ(com.aspose.words.internal.zzZOX zzzox, com.aspose.words.internal.zzAA zzaa) throws Exception {
        zzp(zzzox);
        int iZzXb = (int) (((long) zzzox.zzXb()) & 4294967295L);
        zzzox.zzXb();
        if (iZzXb == 0) {
            return;
        }
        int iZzq = zzq(zzzox) % 4;
        zzzox.zzq().zzH(zzzox.zzq().getPosition() + ((long) (iZzq == 0 ? 0 : 4 - iZzq)));
        zzYO9[] zzyo9Arr = new zzYO9[iZzXb];
        for (int i = 0; i < iZzXb; i++) {
            zzyo9Arr[i] = new zzYO9(zzzox);
        }
        com.aspose.words.internal.zzZOX zzzox2 = new com.aspose.words.internal.zzZOX(zzaa.zzYu("o"));
        int iZzYrl = 0;
        for (int i2 = 0; i2 < iZzXb; i2++) {
            zzYO9 zzyo9 = zzyo9Arr[i2];
            getChildNodes().zzZ(zzZ(zzyo9, zzzox2, zzaa));
            iZzYrl += zzyo9.zzYrl();
            zzzox2.zzq().zzH(iZzYrl);
        }
    }

    public final void zzV(com.aspose.words.internal.zzAA zzaa) throws Exception {
        com.aspose.words.internal.zzZOX zzzox = new com.aspose.words.internal.zzZOX(zzaa.zzYu("f"));
        zzZ(zzzox);
        zzZ(zzzox, zzaa);
        if ((((Integer) this.zzYvV.zzPj(31205)).intValue() & 16384) != 0) {
            zzZMD.zzZ(zzzox, this.zzYvV);
        }
    }

    private static Forms2OleControl zzZ(zzYO9 zzyo9, com.aspose.words.internal.zzZOX zzzox, com.aspose.words.internal.zzAA zzaa) throws Exception {
        Forms2OleControl forms2OleControlZzYrm = zzyo9.zzYrm();
        if (forms2OleControlZzYrm.isComposite()) {
            forms2OleControlZzYrm.zzX((com.aspose.words.internal.zzAA) zzaa.get(zzyo9.zzYrk()));
            return forms2OleControlZzYrm;
        }
        forms2OleControlZzYrm.zzZ(zzzox);
        return forms2OleControlZzYrm;
    }

    private static void zzZ(Forms2OleControl forms2OleControl, com.aspose.words.internal.zzIM<Integer> zzim) {
        int idInternal = forms2OleControl.getIdInternal();
        while (zzim.contains(Integer.valueOf(idInternal))) {
            idInternal++;
        }
        zzim.add(Integer.valueOf(idInternal));
        forms2OleControl.setIdInternal(idInternal);
    }
}
