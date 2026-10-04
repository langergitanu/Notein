package com.aspose.words;

import com.aspose.words.ref.RefInt;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
final class zzP9 extends zzM6 {
    private zzYBI[] zzZrT;

    public zzP9() {
        super("font", true);
    }

    private static zzPS zzS(zzL4 zzl4) {
        if (zzl4.zzP(zzL4.zzZl3) || zzl4.zzP(zzL4.zzZl2) || zzl4.zzP(zzL4.zzZl1) || zzl4.zzP(zzL4.zzZl0) || zzl4.zzP(zzL4.zzZkZ) || zzl4.zzP(zzL4.zzZkY)) {
            return zzPS.zzZqo;
        }
        return null;
    }

    @Override // com.aspose.words.zzM6
    public final zzMP zzZ(zzPS zzps) {
        zzPT zzptZzSx = zzps.zzSx("font-style");
        zzPT zzptZzSx2 = zzps.zzSx("font-size");
        zzPT zzptZzSx3 = zzps.zzSx("font-family");
        zzPT zzptZzSx4 = zzps.zzSx("font-variant");
        zzPT zzptZzSx5 = zzps.zzSx("font-weight");
        zzPT zzptZzSx6 = zzps.zzSx("line-height");
        return new zzP8(zzptZzSx != null ? zzptZzSx.zzZWj().zzZVx() : null, zzptZzSx4 != null ? zzptZzSx4.zzZWj().zzZVx() : null, zzptZzSx5 != null ? zzptZzSx5.zzZWj().zzZVx() : null, zzptZzSx2.zzZWj().zzZVx(), zzptZzSx6 != null ? zzptZzSx6.zzZWj().zzZVx() : null, zzptZzSx3.zzZWj().zzZVx());
    }

    @Override // com.aspose.words.zzM6
    public final zzYBI[] zzZXv() {
        zzYBI[] zzybiArr = this.zzZrT;
        if (zzybiArr != null) {
            return zzybiArr;
        }
        zzYBI[] zzybiArr2 = {new zzYBI("font-style", false), new zzYBI("font-variant", false), new zzYBI("font-weight", false), new zzYBI("font-size", true), new zzYBI("line-height", false), new zzYBI("font-family", true)};
        this.zzZrT = zzybiArr2;
        return zzybiArr2;
    }

    @Override // com.aspose.words.zzM6
    public final zzPS zzZ(zzL2 zzl2, boolean z, boolean z2) {
        boolean z3;
        boolean z4;
        zzPS zzpsZzS;
        if (zzl2.getCount() == 0) {
            return null;
        }
        if (zzl2.getCount() == 1 && (zzpsZzS = zzS(zzl2.zzMl(0))) != null) {
            return zzpsZzS;
        }
        zzL2 zzl22 = new zzL2(zzl2);
        zzPR zzpr = new zzPR();
        int count = zzl22.getCount() - 1;
        zzPT zzptZzZ = null;
        int i = 0;
        while (true) {
            if (count < 0) {
                z3 = z;
                z4 = z2;
                count = -1;
                break;
            }
            if ((count <= 0 || !zzl22.zzMl(count - 1).zzP(zzL4.zzZnq)) && zzl22.zzMl(count).getValueType() != 3) {
                zzOP zzopZzSj = zzMR.zzSj("font-size");
                RefInt refInt = new RefInt(i);
                z3 = z;
                z4 = z2;
                zzptZzZ = zzopZzSj.zzZ(zzl22, count, z3, z4, refInt);
                i = refInt.get();
                if (zzptZzZ != null) {
                    zzpr.zzY(zzptZzZ);
                    for (int i2 = 0; i2 < i; i2++) {
                        zzl22.removeAt(count);
                    }
                }
            } else {
                z3 = z;
                z4 = z2;
            }
            count--;
            z = z3;
            z2 = z4;
        }
        if (zzptZzZ == null || count > zzl22.getCount() - 1) {
            return null;
        }
        zzOP zzopZzSj2 = zzMR.zzSj("line-height");
        if (zzl22.zzMl(count).zzP(zzL4.zzZnq)) {
            zzl22.removeAt(count);
            if (count > zzl22.getCount() - 1) {
                return null;
            }
            RefInt refInt2 = new RefInt(i);
            zzPT zzptZzZ2 = zzopZzSj2.zzZ(zzl22, count, z3, z4, refInt2);
            i = refInt2.get();
            if (zzptZzZ2 == null) {
                return null;
            }
            zzpr.zzY(zzptZzZ2);
            for (int i3 = 0; i3 < i; i3++) {
                zzl22.removeAt(count);
            }
        } else {
            zzpr.zzV(zzopZzSj2.zzYc(z3));
        }
        if (count > zzl22.getCount() - 1) {
            return null;
        }
        zzOP zzopZzSj3 = zzMR.zzSj("font-family");
        RefInt refInt3 = new RefInt(i);
        zzPT zzptZzZ3 = zzopZzSj3.zzZ(zzl22, count, z3, z4, refInt3);
        int i4 = refInt3.get();
        if (zzptZzZ3 == null) {
            return null;
        }
        zzpr.zzY(zzptZzZ3);
        for (int i5 = 0; i5 < i4; i5++) {
            zzl22.removeAt(count);
        }
        ArrayList arrayList = new ArrayList();
        com.aspose.words.internal.zzZQG.zzZ((ArrayList<zzOP>) arrayList, zzMR.zzSj("font-style"));
        com.aspose.words.internal.zzZQG.zzZ((ArrayList<zzOP>) arrayList, zzMR.zzSj("font-variant"));
        com.aspose.words.internal.zzZQG.zzZ((ArrayList<zzOP>) arrayList, zzMR.zzSj("font-weight"));
        int i6 = 0;
        while (i6 < arrayList.size() && zzl22.getCount() != 0) {
            zzOP zzop = (zzOP) arrayList.get(i6);
            refInt3.set(i4);
            zzPT zzptZzZ4 = zzop.zzZ(zzl22, 0, z3, z4, refInt3);
            int i7 = refInt3.get();
            if (zzptZzZ4 != null) {
                zzpr.zzV(zzptZzZ4);
                arrayList.remove(i6);
                for (int i8 = 0; i8 < i7; i8++) {
                    zzl22.removeAt(0);
                }
                i6 = 0;
            } else {
                i6++;
            }
            i4 = i7;
        }
        if (zzl22.getCount() != 0) {
            return null;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            zzpr.zzV(((zzOO) ((zzOP) it.next())).zzYc(z3));
        }
        return zzpr.zzZWe();
    }
}
