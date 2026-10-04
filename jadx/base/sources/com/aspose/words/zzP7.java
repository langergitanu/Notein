package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzP7 extends zzOO {
    public zzP7() {
        super("font-size", true, zzL4.zzZlB, zzL3.zzZ(zzL3.zzX(zzL4.zzZlW, zzL4.zzZlV, zzL4.zzZlU, zzL4.zzZlB, zzL4.zzZlR, zzL4.zzZlS, zzL4.zzZlT, zzL4.zzZlQ, zzL4.zzZlL, zzL4.zzZlM), zzL3.zzZkg, zzL3.zzZkf));
    }

    private static zzL4 zzR(zzL4 zzl4) {
        double d;
        int valueType = zzl4.getValueType();
        if (valueType != 0) {
            return valueType != 5 ? zzl4 : new zzOI(((zzMU) zzl4).getDoubleValue() / 100.0d, 7);
        }
        if (zzl4.zzP(zzL4.zzZlW)) {
            d = 7.0d;
        } else if (zzl4.zzP(zzL4.zzZlV)) {
            d = 7.5d;
        } else if (zzl4.zzP(zzL4.zzZlU)) {
            d = 10.0d;
        } else if (zzl4.zzP(zzL4.zzZlB)) {
            d = 12.0d;
        } else if (zzl4.zzP(zzL4.zzZlT)) {
            d = 13.5d;
        } else if (zzl4.zzP(zzL4.zzZlS)) {
            d = 18.0d;
        } else if (zzl4.zzP(zzL4.zzZlR)) {
            d = 24.0d;
        } else if (zzl4.zzP(zzL4.zzZlQ)) {
            d = 36.0d;
        } else {
            if (zzl4.zzP(zzL4.zzZlL)) {
                zzl4 = new zzOI(1.2d, 7);
            } else if (zzl4.zzP(zzL4.zzZlM)) {
                zzl4 = new zzOI(0.8333333333333334d, 7);
            }
            d = -1.0d;
        }
        return d > 0.0d ? new zzOI(d, 4) : zzl4;
    }

    @Override // com.aspose.words.zzOP
    public final zzMP zzZ(zzMP zzmp, zzQK zzqk) {
        if (zzmp.getCount() != 1) {
            return zzmp;
        }
        zzL4 zzl4ZzZVx = zzmp.zzZVx();
        zzL4 zzl4ZzR = zzR(zzl4ZzZVx);
        if (!com.aspose.words.internal.zzZKO.zzA(zzl4ZzR, zzl4ZzZVx)) {
            zzmp = new zzMP(zzl4ZzR);
        }
        zzOI zzoi = (zzOI) com.aspose.words.internal.zzZKW.zzZ(zzmp.zzZVx(), zzOI.class);
        if (zzoi == null || !zzoi.isRelative()) {
            return zzmp;
        }
        double dZzZ = zzL5.zzZ(zzoi, zzqk.zzZWF(), zzL5.zzL(zzqk.zzZWG()));
        return !com.aspose.words.internal.zzAN.zzL(dZzZ, -1.7976931348623157E308d) ? new zzMP(new zzOI(dZzZ, 4)) : zzmp;
    }
}
