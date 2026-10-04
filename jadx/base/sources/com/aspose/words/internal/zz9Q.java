package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
final class zz9Q {
    public static zz9V zzU(zzO8 zzo8) throws Exception {
        int position = ((int) zzo8.zzq().getPosition()) - 8;
        int iZzXc = zzo8.zzXc();
        zzo8.zzXc();
        int iZzXc2 = zzo8.zzXc();
        zzo8.zzXc();
        int iZzXc3 = zzo8.zzXc();
        int iZzXc4 = zzo8.zzXc();
        zzo8.zzq().zzH(iZzXc2 + position);
        zzXO zzxoZzY = zzQX.zzY(zzo8);
        if (zzxoZzY.zzWM() != 1) {
            zz9P zz9p = new zz9P(zzPV.zzI5);
            zz9p.zzWe(iZzXc);
            return zz9p;
        }
        zzPV[] zzpvArr = {zz9R.zzqX, zz9R.zzqW};
        zzo8.zzq().zzH(position + iZzXc3);
        zz9R zz9r = new zz9R(zzEF.zzZ(zzxoZzY, zzpvArr, zzo8, iZzXc4));
        zz9r.zzWe(iZzXc);
        return zz9r;
    }

    public static zz9V zzV(zzO8 zzo8) throws Exception {
        int position = ((int) zzo8.zzq().getPosition()) - 8;
        int iZzXc = zzo8.zzXc();
        zzo8.zzXc();
        int iZzXc2 = zzo8.zzXc();
        int iZzXc3 = zzo8.zzXc();
        zzo8.zzXc();
        int iZzXc4 = zzo8.zzXc();
        zzo8.zzq().zzH(position + iZzXc2);
        zz9S zz9s = new zz9S(zzEF.zzZ(zzo8, iZzXc3, iZzXc4));
        zz9s.zzWe(iZzXc);
        return zz9s;
    }

    public static zz9V zzW(zzO8 zzo8) throws Exception {
        int iZzXc = zzo8.zzXc();
        int iZzXc2 = (int) (((long) zzo8.zzXc()) & 4294967295L);
        zzPV zzpvZzMW = zzo8.zzMW();
        zz9V zz9p = iZzXc2 != 0 ? iZzXc2 != 1 ? iZzXc2 != 2 ? new zz9P(zzPV.zzKa) : new zz9U(zzo8.zzXc(), zzpvZzMW) : new zz9T() : new zz9P(zzpvZzMW);
        zz9p.zzWe(iZzXc);
        return zz9p;
    }

    public static zz9V zzY(zzZV1 zzzv1) throws Exception {
        zzzv1.zzXa();
        short sZzXa = zzzv1.zzXa();
        short sZzXa2 = zzzv1.zzXa();
        short sZzXa3 = zzzv1.zzXa();
        byte bZzX6 = zzzv1.zzX6();
        byte bZzX62 = zzzv1.zzX6();
        zzzv1.zzn(4);
        zzzv1.zzn(18);
        int i = bZzX62 & 255;
        return new zz9S(zzEF.zzZ(sZzXa, sZzXa2, 0, 0, bZzX6 & 255, i, sZzXa3, zzzv1.zzn(((((sZzXa * i) + 15) >> 4) << 1) * sZzXa2), new zzPV[]{zzPV.zzI5, zzPV.zzKa}));
    }

    public static zz9V zzZ(zzZV1 zzzv1) throws Exception {
        short sZzXa = zzzv1.zzXa();
        zzPV zzpvZzMW = zzzv1.zzMW();
        return sZzXa != 0 ? sZzXa != 1 ? sZzXa != 2 ? new zz9P(zzPV.zzKa) : new zz9U(zzzv1.zzXa(), zzpvZzMW) : new zz9T() : new zz9P(zzpvZzMW);
    }

    public static zz9V zzZ(zzZV1 zzzv1, int i) throws Exception {
        short sZzXa = zzzv1.zzXa();
        zzzv1.zzXa();
        int i2 = i - 4;
        long position = zzzv1.zzq().getPosition();
        zzXO zzxoZzY = zzQX.zzY(zzzv1);
        if (sZzXa == 3 && zzxoZzY.zzWM() == 1 && zzxoZzY.zzWN() == 8) {
            return new zz9R(zzEF.zzZ(zzxoZzY, zzW(zzzv1.zzMW(), zzzv1.zzMW()), zzzv1, (i - 44) - zzxoZzY.zzWN()));
        }
        zzzv1.zzq().zzH(position);
        return new zz9S(zzEF.zzZ(zzzv1, i2));
    }

    private static zzPV[] zzW(zzPV zzpv, zzPV zzpv2) {
        if (zzV(zzpv, zzpv2)) {
            return new zzPV[]{zz9R.zzqX, zz9R.zzqW};
        }
        return new zzPV[]{zz9R.zzqW, zz9R.zzqX};
    }

    public static boolean zzV(zzPV zzpv, zzPV zzpv2) {
        return zzpv.zzPA() + (zzpv.zzPB() + zzpv.zzPC()) < zzpv2.zzPA() + (zzpv2.zzPB() + zzpv2.zzPC());
    }
}
