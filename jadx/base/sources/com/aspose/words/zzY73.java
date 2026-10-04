package com.aspose.words;

import android.support.v4.media.session.PlaybackStateCompat;
import com.aspose.words.ref.RefInt;
import com.huawei.hms.network.embedded.C18163eb;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
final class zzY73 extends Forms2OleControl {
    private ArrayList<zzY72> zzX70;
    private zzYO8 zzZxa;

    public zzY73(String str) {
        super(str);
        this.zzX70 = new ArrayList<>();
        zzYO8 zzyo8Zzh = zzYO8.zzh(144.0d, 108.0d);
        this.zzZxa = zzyo8Zzh;
        zzZ(zzyo8Zzh);
        this.zzYvV.set(31330, 0);
    }

    private ArrayList<String> zzY0j() {
        ArrayList<String> arrayList = new ArrayList<>();
        for (zzY72 zzy72 : this.zzX70) {
            arrayList.add(zzy72.zzY0h() > 0 ? com.aspose.words.internal.zzZKN.zzS(zzy72.zzY0h(), 1) : "");
        }
        return arrayList;
    }

    private ArrayList<String> zzY0k() {
        ArrayList<String> arrayList = new ArrayList<>();
        Iterator<zzY72> it = this.zzX70.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().getTag());
        }
        return arrayList;
    }

    private ArrayList<String> zzY0l() {
        ArrayList<String> arrayList = new ArrayList<>();
        Iterator<zzY72> it = this.zzX70.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().getName());
        }
        return arrayList;
    }

    private ArrayList<String> zzY0m() {
        ArrayList<String> arrayList = new ArrayList<>();
        Iterator<zzY72> it = this.zzX70.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().zzY0i());
        }
        return arrayList;
    }

    private ArrayList<String> zzZA() {
        ArrayList<String> arrayList = new ArrayList<>();
        Iterator<zzY72> it = this.zzX70.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().getCaption());
        }
        return arrayList;
    }

    @Override // com.aspose.words.OleControl
    public final String getClsidVirtual() {
        return "eae50eb0-4a62-11ce-bed6-00aa00611080";
    }

    @Override // com.aspose.words.Forms2OleControl
    public final int getType() {
        return 9;
    }

    @Override // com.aspose.words.Forms2OleControl
    public final int zz1E() {
        return 18;
    }

    @Override // com.aspose.words.OleControl
    public final int zzV(com.aspose.words.internal.zzZOW zzzow) throws Exception {
        int position = (int) zzzow.zzq().getPosition();
        this.zzYvV.zzQ(31360, Integer.valueOf(this.zzX70.size()));
        zzzow.zzK((short) 512);
        zzzow.zzZa(2, 1);
        zzzow.zzZa(4, 1);
        zzZLX zzzlx = new zzZLX(zzzow, this.zzYvV);
        int i = (int) (((long) ((int) (((long) ((int) ((zzzlx.zzX9(31330, 4) ? 1L : 0L) | 524304))) | (zzzlx.zzX9(31005, 4) ? 2L : 0L)))) | (zzzlx.zzX9(31000, 4) ? 4L : 0L));
        RefInt refInt = new RefInt(0);
        byte[][] bArrZzZ = zzZLX.zzZ(zzZA(), refInt);
        int i2 = refInt.get();
        if ((((long) i2) & 4294967295L) > 0) {
            zzzlx.write(i2);
        }
        int i3 = (int) (((long) ((int) (((long) ((int) (((long) ((int) (((long) ((int) (((long) i) | (zzzlx.zzX9(31045, 1) ? 64L : 0L)))) | (zzzlx.zzX9(31335, 4) ? 256L : 0L)))) | (zzzlx.zzX9(31340, 4) ? 512L : 0L)))) | (zzzlx.zzX9(31345, 4) ? 2048L : 0L)))) | (zzzlx.zzX9(31350, 4) ? 4096L : 0L));
        refInt.set(i2);
        byte[][] bArrZzZ2 = zzZLX.zzZ(zzY0m(), refInt);
        int i4 = refInt.get();
        if ((((long) i4) & 4294967295L) > 0) {
            zzzlx.write(i4);
        }
        refInt.set(i4);
        byte[][] bArrZzZ3 = zzZLX.zzZ(zzY0l(), refInt);
        int i5 = refInt.get();
        if ((((long) i5) & 4294967295L) > 0) {
            zzzlx.write(i5);
        }
        int i6 = (int) (((long) ((int) (((long) i3) | (zzzlx.zzX9(31010, 4) ? PlaybackStateCompat.ACTION_SET_REPEAT_MODE : 0L)))) | (zzzlx.zzX9(31355, 4) ? PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED : 0L));
        refInt.set(i5);
        byte[][] bArrZzZ4 = zzZLX.zzZ(zzY0k(), refInt);
        int i7 = refInt.get();
        if ((((long) i7) & 4294967295L) > 0) {
            zzzlx.write(i7);
        }
        int i8 = (int) ((zzzlx.zzX9(31360, 4) ? 4194304L : 0L) | ((long) i6));
        refInt.set(i7);
        byte[][] bArrZzZ5 = zzZLX.zzZ(zzY0j(), refInt);
        int i9 = refInt.get();
        if ((((long) i9) & 4294967295L) > 0) {
            zzzlx.write(i9);
        }
        long j = (int) ((zzzlx.zzX9(31070, 2) ? C18163eb.f54662y : 0L) | ((long) i8));
        long j2 = !this.zzYvV.zzPg(31450) ? 1024L : 0L;
        zzzlx.zzXB(4);
        int i10 = (int) (((long) ((int) (((long) ((int) (((long) ((int) (((long) ((int) (((long) ((int) (((long) ((int) (j | j2))) | (zzzlx.zzX9(31025, 8) ? 16L : 0L)))) | (zzzlx.zzZ(bArrZzZ) ? 32L : 0L)))) | (zzzlx.zzZ(bArrZzZ2) ? PlaybackStateCompat.ACTION_PREPARE_FROM_MEDIA_ID : 0L)))) | (zzzlx.zzZ(bArrZzZ3) ? PlaybackStateCompat.ACTION_PREPARE_FROM_URI : 0L)))) | (zzzlx.zzZ(bArrZzZ4) ? PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE : 0L)))) | (zzzlx.zzZ(bArrZzZ5) ? 8388608L : 0L));
        zzzlx.zzXB(4);
        zzzlx.zzX8(position, i10);
        if ((((int) (((long) i10) & 4294967295L)) & 16777216) != 0) {
            zzzlx.zzYd(zzZ6o());
        }
        zzZLW.zzZ(zzzow, this.zzYvV);
        Iterator<zzY72> it = this.zzX70.iterator();
        while (it.hasNext()) {
            zzzlx.write(it.next().zzY0g());
        }
        return (int) (zzzow.zzq().getPosition() - ((long) position));
    }

    @Override // com.aspose.words.OleControl
    public final void zzZ(com.aspose.words.internal.zzZOX zzzox) throws Exception {
        zzzox.zzX9();
        zzzox.zzX9();
        int iZzXb = (int) (((long) zzzox.zzXb()) & 4294967295L);
        zzZLY zzzly = new zzZLY(zzzox, this.zzYvV);
        zzzly.zzZjA = iZzXb;
        zzzly.zzf(1, 4, 31330);
        zzzly.zzf(2, 4, 31005);
        zzzly.zzf(4, 4, 31000);
        int iZzXf = zzzly.zzXf(32, 4);
        zzzly.zzf(64, 1, 31045);
        zzzly.zzf(256, 4, 31335);
        zzzly.zzf(512, 4, 31340);
        zzzly.zzf(2048, 4, 31345);
        zzzly.zzf(4096, 4, 31350);
        int iZzXf2 = zzzly.zzXf(32768, 4);
        int iZzXf3 = zzzly.zzXf(131072, 4);
        zzzly.zzf(262144, 4, 31010);
        zzzly.zzf(1048576, 4, 31355);
        int iZzXf4 = zzzly.zzXf(2097152, 4);
        zzzly.zzf(4194304, 4, 31360);
        int iZzXf5 = zzzly.zzXf(8388608, 4);
        zzzly.zzf(16777216, 2, 31070);
        this.zzYvV.zzQ(31450, Boolean.valueOf((iZzXb & 1024) != 0));
        this.zzYvV.zzQ(31460, Boolean.TRUE);
        zzzly.zzXc(16, 31025);
        zzZ(zzzly.zzXb(32, iZzXf), zzzly.zzXb(32768, iZzXf2), zzzly.zzXb(131072, iZzXf3), zzzly.zzXb(2097152, iZzXf4), zzzly.zzXb(8388608, iZzXf5));
        if ((iZzXb & 16777216) != 0) {
            zzzly.zzAD(31070);
        }
        zzZLW.zzZ(zzzox, this.zzYvV);
        int iIntValue = ((Integer) this.zzYvV.zzPj(31360)).intValue();
        for (int i = 0; i < (((long) iIntValue) & 4294967295L); i++) {
            if (i >= this.zzX70.size()) {
                this.zzX70.add(new zzY72(""));
            }
            this.zzX70.get(i).zzkn((int) (((long) zzzly.zzXf(4194304, 4)) & 4294967295L));
        }
    }

    private void zzZ(ArrayList<String> arrayList, ArrayList<String> arrayList2, ArrayList<String> arrayList3, ArrayList<String> arrayList4, ArrayList<String> arrayList5) {
        int iZzW = com.aspose.words.internal.zzAN.zzW(arrayList.size(), arrayList2.size(), arrayList3.size(), arrayList4.size(), arrayList5.size());
        for (int i = 0; i < iZzW; i++) {
            this.zzX70.add(new zzY72(""));
            if (i < arrayList.size()) {
                this.zzX70.get(i).setCaption(arrayList.get(i));
            }
            if (i < arrayList2.size()) {
                this.zzX70.get(i).zzAi(arrayList2.get(i));
            }
            if (i < arrayList3.size()) {
                this.zzX70.get(i).setName(arrayList3.get(i));
            }
            if (i < arrayList4.size()) {
                this.zzX70.get(i).setTag(arrayList4.get(i));
            }
            if (i < arrayList5.size()) {
                this.zzX70.get(i).zzXL(com.aspose.words.internal.zzZYD.zzXk(arrayList5.get(i)) ? arrayList5.get(i).charAt(0) : (char) 0);
            }
        }
    }
}
