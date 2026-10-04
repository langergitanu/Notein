package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
final class zzTD extends zzTE {
    public zzTD(int i, int i2, zzZYV<Integer> zzzyv, int i3) {
        super(i, i2, i3, zzzyv);
    }

    public static zzTD zzZ(zzY0 zzy0, zzTF zztf) throws Exception {
        zzy0.zzq().zzH(zztf.getPosition());
        zzy0.zzX9();
        zzy0.zzX9();
        zzy0.zzXc();
        int iZzXc = zzy0.zzXc();
        int iZzXc2 = zzy0.zzXc();
        zzZYV zzzyv = new zzZYV();
        for (int i = 0; i < iZzXc2; i++) {
            int iZzXc3 = zzy0.zzXc();
            int iZzXc4 = zzy0.zzXc();
            int iZzXc5 = zzy0.zzXc();
            if (iZzXc3 > iZzXc4 || iZzXc3 < 0 || iZzXc5 < 0) {
                throw new IllegalStateException("Invalid Format12 'cmap' table entry.");
            }
            while (iZzXc3 <= iZzXc4) {
                zzzyv.set(iZzXc3, Integer.valueOf(iZzXc5));
                iZzXc3++;
                iZzXc5++;
            }
        }
        zzzyv.set(65535, 0);
        return new zzTD(zztf.zzTw(), zztf.zzTv(), zzzyv, iZzXc);
    }

    @Override // com.aspose.words.internal.zzTE
    public final void zzX(zzXZ zzxz) throws Exception {
        zzxz.zzi(12);
        zzxz.zzi(0);
        zzxz.zzl((zzTt().getCount() * 12) + 16);
        zzxz.zzl(zzTu());
        zzxz.zzl(zzTt().getCount());
        for (int i = 0; i < zzTt().getCount(); i++) {
            int iZzT3 = zzTt().zzT3(i);
            int iIntValue = zzTt().zzVY(i).intValue();
            zzxz.zzl(iZzT3);
            zzxz.zzl(iZzT3);
            zzxz.zzl(iIntValue);
        }
    }
}
