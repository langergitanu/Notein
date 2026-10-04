package com.aspose.words;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
final class zzPS implements Iterable<zzPT> {
    private zzPQ zzZqn;
    static zzPS zzZqo = new zzPS();
    private static final com.aspose.words.internal.zzZHW zzUR = new com.aspose.words.internal.zzZHW("serif", "sans-serif", "cursive", "fantasy", "monospace");

    public zzPS() {
        zzPQ zzpq = new zzPQ();
        this.zzZqn = zzpq;
        zzpq.zzZWb();
    }

    private static String zzSw(String str) {
        int iZzTP = zzUR.zzTP(com.aspose.words.internal.zzZKN.zzU2(str));
        return iZzTP != 0 ? iZzTP != 1 ? iZzTP != 2 ? iZzTP != 3 ? iZzTP != 4 ? str : "Courier New" : "Arial" : "Comic Sans MS" : "Arial" : "Times New Roman";
    }

    private boolean zzT(zzPS zzps) {
        if (this.zzZqn.getCount() != zzps.zzZqn.getCount()) {
            return false;
        }
        for (zzPT zzpt : this.zzZqn) {
            if (!zzpt.zzZ(zzps.zzZqn.zzSx(zzpt.zzZWo())) || zzSy(zzpt.zzZWo()) != zzps.zzSy(zzpt.zzZWo())) {
                return false;
            }
        }
        return true;
    }

    private boolean zzZWf() {
        Iterator<zzPT> it = this.zzZqn.iterator();
        while (true) {
            if (!it.hasNext()) {
                return false;
            }
            zzPT next = it.next();
            for (int i = 0; i < next.zzZWj().getCount(); i++) {
                zzL6 zzl6 = (zzL6) com.aspose.words.internal.zzZKW.zzZ(next.zzZWj().zzMl(i), zzL6.class);
                if (zzl6 != null && !com.aspose.words.internal.zzZVR.zzWr(zzl6.getValue())) {
                    return true;
                }
            }
        }
    }

    public final boolean equals(Object obj) {
        if (com.aspose.words.internal.zzZKO.zzA(null, obj)) {
            return false;
        }
        if (com.aspose.words.internal.zzZKO.zzA(this, obj)) {
            return true;
        }
        return obj.getClass() == zzPS.class && zzT((zzPS) obj);
    }

    public final int getCount() {
        return this.zzZqn.getCount();
    }

    public final String getString(String str) {
        zzPT zzptZzSx = zzSx(str);
        return (zzptZzSx == null || !zzptZzSx.zzMt(1)) ? "" : ((zzM2) zzptZzSx.zzZWj().zzZVx()).getValue();
    }

    public final int hashCode() {
        int iHashCode = 0;
        for (zzPT zzpt : this.zzZqn) {
            iHashCode = (((iHashCode * 397) ^ zzpt.hashCode()) * 397) ^ zzSy(zzpt.zzZWo());
        }
        return iHashCode;
    }

    @Override // java.lang.Iterable
    public final Iterator<zzPT> iterator() {
        return this.zzZqn.iterator();
    }

    public final zzPS zzSA(String str) {
        if (!com.aspose.words.internal.zzZYD.zzXk(str) || ".".equals(str) || !zzZWf()) {
            return this;
        }
        zzPR zzpr = new zzPR(this);
        for (zzPT zzpt : this.zzZqn) {
            zzL2 zzl2 = new zzL2();
            boolean z = false;
            for (int i = 0; i < zzpt.zzZWj().getCount(); i++) {
                zzL4 zzl4ZzMl = zzpt.zzZWj().zzMl(i);
                zzL6 zzl6 = (zzL6) com.aspose.words.internal.zzZKW.zzZ(zzl4ZzMl, zzL6.class);
                if (zzl6 != null && !com.aspose.words.internal.zzZVR.zzWr(zzl6.getValue())) {
                    zzl4ZzMl = new zzL6(com.aspose.words.internal.zzZVR.zz7(str, zzl6.getValue()));
                    z = true;
                }
                zzl2.zzI(zzl4ZzMl);
            }
            if (z) {
                zzpr.zzU(new zzM3(zzpt.zzZWo(), new zzMP(zzl2), zzpt.zzZWi()));
            }
        }
        return zzpr.zzZWe();
    }

    public final com.aspose.words.internal.zzPV zzSB(String str) {
        zzPT zzptZzSx = zzSx(str);
        if (zzptZzSx == null || !zzptZzSx.zzMt(2)) {
            return null;
        }
        return ((zzQC) zzptZzSx.zzZWj().zzZVx()).zzZWw();
    }

    public final double zzSC(String str) {
        zzPT zzptZzSx = zzSx(str);
        if (zzptZzSx == null || !zzptZzSx.zzMt(5)) {
            return -1.7976931348623157E308d;
        }
        return ((zzMU) zzptZzSx.zzZWj().zzZVx()).getDoubleValue();
    }

    public final double zzSD(String str) {
        zzPT zzptZzSx = zzSx(str);
        if (zzptZzSx == null || !zzptZzSx.zzMt(3)) {
            return -1.7976931348623157E308d;
        }
        return ((zzNH) zzptZzSx.zzZWj().zzZVx()).getDoubleValue();
    }

    public final String zzSE(String str) {
        zzPT zzptZzSx = zzSx(str);
        return (zzptZzSx == null || !zzptZzSx.zzMt(6)) ? "" : ((zzL6) zzptZzSx.zzZWj().zzZVx()).getValue();
    }

    public final String zzSF(String str) {
        zzPT zzptZzSx = zzSx(str);
        return (zzptZzSx == null || !zzptZzSx.zzMt(0)) ? "" : ((zzOT) zzptZzSx.zzZWj().zzZVx()).getValue();
    }

    public final zzOJ zzSG(String str) {
        zzPT zzptZzSx = zzSx(str);
        return new zzOJ(zzptZzSx != null ? zzL5.zzW(zzptZzSx.zzZWj()) : 0.0d, !(zzptZzSx == null || zzSz(str)));
    }

    public final double zzSH(String str) {
        zzPT zzptZzSx = zzSx(str);
        if (zzptZzSx != null) {
            return zzL5.zzW(zzptZzSx.zzZWj());
        }
        return -1.7976931348623157E308d;
    }

    public final zzPT zzSx(String str) {
        return this.zzZqn.zzSx(str);
    }

    public final int zzSy(String str) {
        return this.zzZqn.zzSy(str);
    }

    public final boolean zzSz(String str) {
        return this.zzZqn.zzSu(str);
    }

    public final String zzZ(zzZYZ zzzyz) {
        zzPT zzptZzSx = zzSx("font-family");
        String strZzSw = "";
        if (zzptZzSx == null || !(zzptZzSx.zzZWj() instanceof zzPA)) {
            return "";
        }
        for (int i = 0; i < zzptZzSx.zzZWj().getCount(); i++) {
            zzL4 zzl4ZzMl = zzptZzSx.zzZWj().zzMl(i);
            int valueType = zzl4ZzMl.getValueType();
            if (valueType == 0) {
                strZzSw = zzSw(((zzOT) zzl4ZzMl).getValue());
            } else if (valueType != 1) {
                continue;
            } else {
                strZzSw = ((zzM2) zzl4ZzMl).getValue();
            }
            String strZzO4 = zzzyz.zzO4(strZzSw);
            if (strZzO4 != null) {
                return strZzO4;
            }
        }
        return strZzSw;
    }

    public final zzPQ zzZWg() {
        return this.zzZqn;
    }

    public final zzPS zzZWh() {
        Collection<zzM6> collectionZzZVC = zzMR.zzZVC();
        Iterator<zzM6> it = collectionZzZVC.iterator();
        while (it.hasNext()) {
            if (it.next().zzS(this)) {
                zzPR zzpr = new zzPR(this);
                Iterator<zzM6> it2 = collectionZzZVC.iterator();
                while (it2.hasNext()) {
                    it2.next().zzZ(zzpr);
                }
                return zzpr.zzZWe();
            }
        }
        return this;
    }

    public final String zzZXu() {
        com.aspose.words.internal.zzZQH<Map.Entry> zzzqh = new com.aspose.words.internal.zzZQH(new zzMQ());
        for (zzPT zzpt : this.zzZqn) {
            zzzqh.zzB(zzpt.zzZWo(), zzpt);
        }
        StringBuilder sb = new StringBuilder();
        for (Map.Entry entry : zzzqh) {
            if (sb.length() > 0) {
                com.aspose.words.internal.zzZNH.zzU(sb, "; ");
            }
            ((zzPT) entry.getValue()).zzG(sb);
        }
        return sb.toString();
    }

    public final boolean zzZy(String str, String str2) {
        return com.aspose.words.internal.zzZYD.zzi(zzSF(str), str2);
    }

    public zzPS(zzPT zzpt) {
        zzPQ zzpq = new zzPQ();
        this.zzZqn = zzpq;
        zzpq.zzY(zzpt);
        this.zzZqn.zzZWb();
    }

    public zzPS(zzPT... zzptArr) {
        zzPQ zzpq = new zzPQ();
        this.zzZqn = zzpq;
        zzpq.zzZ(zzptArr);
        this.zzZqn.zzZWb();
    }

    public zzPS(Iterable<zzPT> iterable) {
        zzPQ zzpq = new zzPQ();
        this.zzZqn = zzpq;
        zzpq.zzP(iterable);
        this.zzZqn.zzZWb();
    }

    public zzPS(zzPQ zzpq) {
        this.zzZqn = zzpq;
    }
}
