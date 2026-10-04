package com.aspose.words.internal;

import java.util.Iterator;

/* JADX INFO: loaded from: classes5.dex */
final class zzNS extends zzYN {
    public zzNS(zzHL zzhl) {
        super(zzhl);
    }

    private void zz2(double d) throws Exception {
        zzHK zzhk = zzYf().get(getCurrentIndex());
        if (zzhk.getType() == 0 && zzhk.zzYh() > zzYg()) {
            zzYF zzyf = new zzYF();
            zzYF zzyf2 = new zzYF();
            double width = 0.0d;
            boolean z = false;
            for (zzHN zzhn : ((zzHM) zzhk).zzY4()) {
                if (z) {
                    zzyf2.zzZ(zzhn);
                } else if (zzhn.getWidth() + width <= d) {
                    zzyf.zzZ(zzhn);
                    width += zzhn.getWidth();
                } else {
                    zzHN[] zzhnArrZzZ = zzZ(zzhn, d - width);
                    zzyf.zzZ(zzhnArrZzZ[0]);
                    zzHN zzhn2 = zzhnArrZzZ[1];
                    if (zzhn2 != null) {
                        zzyf2.zzZ(zzhn2);
                    }
                    z = true;
                }
            }
            if (zzyf2.zzY4().size() == 0) {
                return;
            }
            zzYf().set(getCurrentIndex(), zzyf);
            zzYf().add(getCurrentIndex() + 1, zzyf2);
        }
    }

    private zzHN[] zzZ(zzHN zzhn, double d) throws Exception {
        if (zzhn.zzYb() == 1) {
            return new zzHN[]{zzhn, null};
        }
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        Iterator<Integer> it = new zzZYE(zzhn.toString()).iterator();
        boolean z = false;
        while (it.hasNext()) {
            int iIntValue = it.next().intValue();
            if (z) {
                zzZNH.zzU(sb2, zzZVS.zzS7(iIntValue));
            } else {
                if (zzZ(zzhn, ((Object) sb) + zzZVS.zzS7(iIntValue)).getWidth() <= d) {
                    zzZNH.zzU(sb, zzZVS.zzS7(iIntValue));
                } else {
                    if (sb.length() == 0) {
                        zzZNH.zzU(sb, zzZVS.zzS7(iIntValue));
                    } else {
                        zzZNH.zzU(sb2, zzZVS.zzS7(iIntValue));
                    }
                    z = true;
                }
            }
        }
        return new zzHN[]{zzZ(zzhn, sb.toString()), sb2.length() != 0 ? zzZ(zzhn, sb2.toString()) : null};
    }

    @Override // com.aspose.words.internal.zzYN
    public final boolean zzS(double d) {
        return zzYh() + d > zzYg() + 0.02d;
    }

    @Override // com.aspose.words.internal.zzYN
    public final void zzYi() {
        if (zzYh() > zzYg()) {
            return;
        }
        super.zzYi();
    }

    @Override // com.aspose.words.internal.zzYN
    public final boolean zzYk() throws Exception {
        zzHK zzhk = zzYf().get(getCurrentIndex());
        if (zzhk.getType() == 2) {
            zzR(zzhk.zzY5() + zzYh());
            zzG(getCurrentIndex() + 1);
            return true;
        }
        if (zzhk.zzY5() > zzYg()) {
            zz2(zzYg());
        }
        zzHK zzhk2 = zzYf().get(getCurrentIndex());
        zzR(zzhk2.zzY5() + zzYh());
        zzG(getCurrentIndex() + 1);
        return false;
    }

    private zzYK zzZ(zzHN zzhn, String str) throws Exception {
        return new zzYL(zzhn.zzYa(), zzhn.zzZr(), str, zzhn.zzYb(), zzZZH.zzZ(zzhn.zzZr(), str, zzhn.zzZz(), false, zzYe().zzMk(), zzYe().zzMj()));
    }
}
