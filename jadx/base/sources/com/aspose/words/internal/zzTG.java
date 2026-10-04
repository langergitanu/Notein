package com.aspose.words.internal;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes5.dex */
abstract class zzTG extends zzZWZ {
    protected int zzQy;
    public zzZYV<Integer> zzQz;

    public zzTG(zzZYV<Integer> zzzyv, int i) {
        this.zzQz = zzzyv;
        this.zzQy = i;
    }

    public static zzTG zzY(zzY0 zzy0) throws Exception {
        if ((zzy0.zzX9() & 65535) == 0) {
            return zzZ(zzy0, zzZ(zzy0, zzy0.zzX9() & 65535));
        }
        throw new IllegalStateException("Unexpected cmap table version.");
    }

    private static zzTF[] zzZ(zzY0 zzy0, int i) throws Exception {
        long position = zzy0.zzq().getPosition() - 4;
        zzTF[] zztfArr = new zzTF[i];
        for (int i2 = 0; i2 < i; i2++) {
            int iZzX9 = zzy0.zzX9() & 65535;
            int iZzX92 = zzy0.zzX9() & 65535;
            int iZzXc = zzy0.zzXc();
            long position2 = zzy0.zzq().getPosition();
            long j = ((long) iZzXc) + position;
            zzy0.zzq().zzH(j);
            int iZzX93 = zzy0.zzX9() & 65535;
            zzy0.zzq().zzH(position2);
            zztfArr[i2] = new zzTF(iZzX9, iZzX92, iZzX93, j);
        }
        return zztfArr;
    }

    public abstract boolean zzTx();

    public abstract zzTE[] zzTy();

    @Override // com.aspose.words.internal.zzZWZ
    public final void zzX(zzXZ zzxz) throws Exception {
        zzTE[] zzteArrZzTy = zzTy();
        ArrayList arrayList = new ArrayList();
        for (zzTE zzte : zzteArrZzTy) {
            zzZQG.zzZ((ArrayList<byte[]>) arrayList, zzte.zzVf());
        }
        zzxz.zzj(0);
        zzxz.zzj(zzteArrZzTy.length);
        int length = (zzteArrZzTy.length * 8) + 4;
        for (int i = 0; i < zzteArrZzTy.length; i++) {
            zzxz.zzj(zzteArrZzTy[i].zzTw());
            zzxz.zzj(zzteArrZzTy[i].zzTv());
            zzxz.zzk(length);
            length += ((byte[]) arrayList.get(i)).length;
        }
        for (int i2 = 0; i2 < zzteArrZzTy.length; i2++) {
            zzxz.writeBytes((byte[]) arrayList.get(i2));
        }
    }

    private static zzTF zzY(zzTF[] zztfArr, int i, int i2) {
        for (zzTF zztf : zztfArr) {
            if (zztf.zzTw() == i && zztf.getFormat() == i2) {
                return zztf;
            }
        }
        return null;
    }

    private static zzTG zzZ(zzY0 zzy0, zzTF[] zztfArr) throws Exception {
        zzTF zztfZzZ = zzZ(zztfArr, 10, 12);
        if (zztfZzZ != null) {
            zzTD zztdZzZ = zzTD.zzZ(zzy0, zztfZzZ);
            return new zzT9(zztdZzZ.zzTt(), zztdZzZ.zzTu());
        }
        zzTF zztfZzZ2 = zzZ(zztfArr, 0, 4);
        if (zztfZzZ2 != null) {
            zzTB zztbZzX = zzTB.zzX(zzy0, zztfZzZ2);
            return new zzTA(zztbZzX.zzTt(), zztbZzX.zzTu(), zztfZzZ2.zzTw(), zztfZzZ2.zzTv());
        }
        zzTF zztfZzZ3 = zzZ(zztfArr, 1, 4);
        if (zztfZzZ3 != null) {
            zzTB zztbZzX2 = zzTB.zzX(zzy0, zztfZzZ3);
            return new zzTA(zztbZzX2.zzTt(), zztbZzX2.zzTu(), zztfZzZ3.zzTw(), zztfZzZ3.zzTv());
        }
        zzTF zztfZzY = zzY(zztfArr, 0, 4);
        if (zztfZzY != null) {
            zzTB zztbZzX3 = zzTB.zzX(zzy0, zztfZzY);
            return new zzTA(zztbZzX3.zzTt(), zztbZzX3.zzTu(), 3, 1);
        }
        zzTF zztfZzY2 = zzY(zztfArr, 3, 2);
        if (zztfZzY2 != null) {
            zzTC zztcZzY = zzTC.zzY(zzy0, zztfZzY2);
            return new zzTA(zztcZzY.zzTt(), zztcZzY.zzTu(), 3, 1);
        }
        throw new IllegalStateException("Cannot find a required cmap encoding record.");
    }

    private static zzTF zzZ(zzTF[] zztfArr, int i, int i2) {
        for (zzTF zztf : zztfArr) {
            if (zztf.zzTw() == 3 && zztf.zzTv() == i && zztf.getFormat() == i2) {
                return zztf;
            }
        }
        return null;
    }

    public final zzZX5 zzZ(zzID zzid, zzZVG zzzvg, int i) {
        zzZX9 zzzx9;
        zzZX5 zzzx5 = new zzZX5();
        for (int i2 = 0; i2 < i; i2++) {
            zzIE zzieZzWl = zzid.zzWl(i2);
            if (zzzvg != null) {
                zzZVH zzzvhZzS0 = zzzvg.zzS0(i2);
                zzzx9 = new zzZX9(i2, zzieZzWl.zzxH, zzieZzWl.zzxG, zzzvhZzS0.zz7p, zzzvhZzS0.zz7o);
            } else {
                short s = zzieZzWl.zzxH;
                short s2 = zzieZzWl.zzxG;
                zzzx9 = new zzZX9(i2, s, s2, s, s2);
            }
            zzzx5.zzZ(zzzx9);
        }
        zzzx5.zzY(zzzx5.zzSu(0));
        zzzx5.zzZv(65535, 0);
        for (int i3 = 0; i3 < this.zzQz.getCount(); i3++) {
            zzzx5.zzZv(this.zzQz.zzT3(i3), this.zzQz.zzVY(i3).intValue());
        }
        return zzzx5;
    }
}
