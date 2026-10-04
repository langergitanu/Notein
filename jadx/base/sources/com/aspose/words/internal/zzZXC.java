package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
final class zzZXC {
    private String mName;
    private int zz9L;
    private int zz9M;
    private int zzQx;
    private int zzTJ;

    public static zzZXC zzZ(zzY0 zzy0, long j, int i) throws Exception {
        String strZzZn;
        int iZzX9 = zzy0.zzX9() & 65535;
        int iZzX92 = zzy0.zzX9() & 65535;
        int iZzX93 = zzy0.zzX9() & 65535;
        int iZzX94 = zzy0.zzX9() & 65535;
        int iZzX95 = zzy0.zzX9() & 65535;
        int iZzX96 = 65535 & zzy0.zzX9();
        zzZXK zzzxkZzZx = zzZXK.zzZx(iZzX9, iZzX92);
        if (zzzxkZzZx != null) {
            int position = (int) zzy0.zzq().getPosition();
            zzy0.zzq().zzH(j + ((long) i) + ((long) iZzX96));
            strZzZn = zzzxkZzZx.zzZn(zzy0.zzn(iZzX95));
            zzy0.zzq().zzH(position);
        } else {
            strZzZn = null;
        }
        if (!zzZYD.zzXk(strZzZn)) {
            return null;
        }
        zzZXC zzzxc = new zzZXC();
        zzzxc.zzQx = iZzX9;
        zzzxc.zzTJ = iZzX92;
        zzzxc.zz9M = iZzX93;
        zzzxc.zz9L = iZzX94;
        zzzxc.mName = strZzZn;
        return zzzxc;
    }

    public final String getName() {
        return this.mName;
    }

    public final int zzTv() {
        return this.zzTJ;
    }

    public final int zzTw() {
        return this.zzQx;
    }

    public final int zzp5() {
        return this.zz9L;
    }

    public final int zzp6() {
        return this.zz9M;
    }
}
