package com.aspose.words.internal;

import com.huawei.hms.network.embedded.C18437z2;

/* JADX INFO: loaded from: classes5.dex */
public final class zzDI extends zzDQ {
    private static final zzZHW zzUR = new zzZHW("channel", "integer", "decimal", "double", "boolean");

    private zzDI(zzDO zzdo) {
        super(zzdo);
    }

    private int zzCW() {
        return zzDP.zzYI(zzD9().zzV("name", ""));
    }

    private zzEB zzCX() {
        zzE9 zze9 = new zzE9(zzCW());
        zzZ(zze9);
        return zze9;
    }

    private zzEB zzCY() {
        return new zzEA(zzCW());
    }

    private zzEB zzCZ() {
        String strZzV = zzD9().zzV(C18437z2.f56754h, "decimal");
        int iZzTP = zzUR.zzTP(strZzV);
        if (iZzTP == 1 || iZzTP == 2 || iZzTP == 3) {
            return zzCX();
        }
        if (iZzTP == 4) {
            return zzCY();
        }
        throw new zzDS(zzZKN.format("Invalid channel type: {0}.", strZzV));
    }

    private zzDJ zzD0() {
        zzDJ zzdj = new zzDJ();
        while (zzD9().zzQ("traceFormat")) {
            if (zzUR.zzTP(zzD9().getLocalName()) != 0) {
                throw new zzDS("Invalid traceFormat element.");
            }
            zzZQG.zzZ(zzdj.zzDu(), zzCZ());
        }
        return zzdj;
    }

    public static zzDJ zzV(zzDO zzdo) {
        return new zzDI(zzdo).zzD0();
    }

    private void zzZ(zzE9 zze9) {
        zze9.zzVN(zzDP.zzYH(zzD9().zzV("units", "")));
        zze9.zzZN(zzD9().zzZ("max", Double.NaN));
        zze9.zzZO(zzD9().zzZ("min", Double.NaN));
        if (zzZKN.zzX(zzD9().zzV("orientation", "+ve"), "-ve", zzZOF.ORDINAL_IGNORE_CASE$4894b8c8)) {
            zze9.setOrientation(1);
        }
    }
}
