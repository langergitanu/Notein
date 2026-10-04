package com.aspose.words;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
final class zzYI1 extends zzYI2 {
    private static final com.aspose.words.internal.zzZHW zzUR = new com.aspose.words.internal.zzZHW("\\brdrw", "\\brdrcf", "\\brsp", "\\brdrframe", "\\brdrsh", "\\brdrart");

    public zzYI1(zzYFT zzyft) {
        super(zzyft);
    }

    @Override // com.aspose.words.zzYI2
    public final boolean zzV(zzYET zzyet) throws Exception {
        if (zzYja().zzYgn().size() == 0) {
            return false;
        }
        String name = zzyet.getName();
        for (Border border : zzYja().zzYgn()) {
            if ("\\brdrnone".equals(name)) {
                border.zzYN(true);
                return true;
            }
            int iZzCg = zzYGD.zzCg(name);
            if (iZzCg != Integer.MIN_VALUE) {
                if (iZzCg == 2) {
                    iZzCg = 1;
                }
                border.zzOV(iZzCg);
                return true;
            }
        }
        return false;
    }

    @Override // com.aspose.words.zzYI2
    public final boolean zzW(zzYET zzyet) throws Exception {
        ArrayList<Border> arrayListZzYgn = zzYja().zzYgn();
        if (arrayListZzYgn.size() == 0) {
            return false;
        }
        String name = zzyet.getName();
        for (Border border : arrayListZzYgn) {
            int iZzTP = zzUR.zzTP(name);
            if (iZzTP != 0) {
                if (iZzTP == 1) {
                    border.zzm(zzYja().zzYgw().zzp0(zzyet.zzYeT()));
                } else if (iZzTP == 2) {
                    border.zzZ4(((double) zzyet.zzYeT()) / 20.0d);
                } else if (iZzTP == 3) {
                    border.zzYO(true);
                } else if (iZzTP == 4) {
                    border.setShadow(true);
                } else {
                    if (iZzTP != 5) {
                        return false;
                    }
                    border.zzOV(zzYEO.zznz(zzyet.zzYeT()));
                }
            } else if (!border.zz8F()) {
                int iZzYeT = zzyet.zzYeT();
                border.zzZ5(border.zz8T() ? zzYEO.zznA(iZzYeT) : ((double) iZzYeT) / 20.0d);
                border.zz8V();
            }
        }
        return true;
    }
}
