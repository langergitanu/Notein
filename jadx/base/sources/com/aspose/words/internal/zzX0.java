package com.aspose.words.internal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes5.dex */
final class zzX0 {
    private zzZQC<zzX2> zzU4 = new zzZQC<>();
    private zzFS zzUa;

    public static class zzZ implements Comparator<zzZQD<zzX1>> {
        private zzZ() {
        }

        private static int zzZ(zzZQD<zzX1> zzzqd, zzZQD<zzX1> zzzqd2) {
            if (zzzqd.getValue().getRowIndex() < zzzqd2.getValue().getRowIndex()) {
                return -1;
            }
            if (zzzqd.getValue().getRowIndex() > zzzqd2.getValue().getRowIndex()) {
                return 1;
            }
            return zzzqd.getValue().getColumnIndex() - zzzqd2.getValue().getColumnIndex();
        }

        @Override // java.util.Comparator
        public final /* synthetic */ int compare(zzZQD<zzX1> zzzqd, zzZQD<zzX1> zzzqd2) {
            return zzZ(zzzqd, zzzqd2);
        }

        public /* synthetic */ zzZ(byte b) {
            this();
        }
    }

    public zzX0(zzFS zzfs) {
        this.zzUa = zzfs;
    }

    private zzX2 zzP(Object obj) {
        Object objZzu = this.zzUa.zzu(obj);
        while (objZzu != null) {
            zzX2 zzx2ZzQ = zzQ(objZzu);
            if (zzx2ZzQ != null) {
                return zzx2ZzQ;
            }
            objZzu = this.zzUa.zzu(objZzu);
        }
        return null;
    }

    private zzX2 zzQ(Object obj) {
        for (zzX2 zzx2 : this.zzU4) {
            if (zzx2.zzVv() == obj) {
                return zzx2;
            }
        }
        return null;
    }

    private void zzX(zzX1 zzx1, boolean z) {
        Object objZzVv = zzx1.zzVv();
        this.zzUa.zzD(objZzVv);
        zzX2 zzx2 = new zzX2(objZzVv);
        zzx2.zzZ(zzx1, z);
        this.zzU4.push(zzx2);
    }

    private static void zzY(zzX2 zzx2) {
        zzZQE<zzX1> zzzqeZzVu = zzx2.zzVu();
        if (zzx2.zzVs()) {
            zzZ(zzzqeZzVu);
        }
        HashMap map = new HashMap();
        while (true) {
            map.clear();
            zzZQE<zzX1> zzzqe = new zzZQE<>();
            zzZQD<zzX1> zzzqdZzl6 = zzzqeZzVu.zzl6();
            zzX1 zzx1 = null;
            boolean z = false;
            while (zzzqdZzl6 != null) {
                zzX1 value = zzzqdZzl6.getValue();
                boolean z2 = value.zzVo() == 2;
                zzX1 zzx12 = (zzX1) zzQW.zzZ(map, Integer.valueOf(value.getColumnIndex()));
                if (zzx12 != null && zzx12.zzVq() == value.getRowIndex() && zzZ(zzx12, value, false) && zzZ(zzzqdZzl6, zzx12.getColumnSpan())) {
                    while (value.zzVp() < zzx12.zzVp()) {
                        zzzqdZzl6 = zzzqdZzl6.zzl5();
                        value.zzY(zzzqdZzl6.getValue(), true);
                    }
                    zzx12.zzY(value, false);
                    z = z || z2;
                    zzx1 = null;
                } else if (zzx1 != null && zzx1.zzVp() == value.getColumnIndex() && zzZ(zzx1, value, true)) {
                    zzx1.zzY(value, true);
                    z = z || z2;
                } else {
                    zzx1 = value.zzVo() != 1 ? value : null;
                    if (value.zzVo() != 0) {
                        map.put(Integer.valueOf(value.getColumnIndex()), value);
                    }
                    if (z2) {
                        zzzqe.addLast(value);
                    }
                }
                zzzqdZzl6 = zzzqdZzl6.zzl5();
            }
            if (!z) {
                return;
            } else {
                zzzqeZzVu = zzzqe;
            }
        }
    }

    public final void zzVl() {
        zzZ((zzX2) null);
    }

    public final void zzZ(Object obj, int i, boolean z, Object obj2) {
        zzX1 zzx1 = new zzX1(obj, i, obj2, this.zzUa);
        Object objZzVv = zzx1.zzVv();
        if (this.zzU4.size() == 0) {
            zzX(zzx1, z);
            return;
        }
        zzX2 zzx2Peek = this.zzU4.peek();
        if (zzx2Peek.zzVv() == objZzVv) {
            zzZ(zzx2Peek, zzx1, z);
            return;
        }
        zzX2 zzx2ZzQ = zzQ(objZzVv);
        if (zzx2ZzQ != null) {
            zzZ(zzx2ZzQ);
            zzZ(zzx2ZzQ, zzx1, z);
            return;
        }
        zzX2 zzx2ZzP = zzP(objZzVv);
        if (zzx2ZzP != null) {
            zzZ(zzx2ZzP);
            zzX(zzx1, z);
        } else {
            zzZ((zzX2) null);
            zzX(zzx1, z);
        }
    }

    private void zzZ(zzX2 zzx2) {
        while (this.zzU4.size() > 0) {
            if (zzx2 != null && this.zzU4.peek() == zzx2) {
                return;
            } else {
                zzY(this.zzU4.pop());
            }
        }
    }

    private static void zzZ(zzX2 zzx2, zzX1 zzx1, boolean z) {
        zzX1 zzx1ZzVt = zzx2.zzVt();
        if (zzx1ZzVt != null && zzZKO.equals(zzx1.zzVr(), zzx1ZzVt.zzVr())) {
            throw new IllegalStateException("Using of several merging operations in the same cell is forbidden.");
        }
        zzx2.zzZ(zzx1, z);
    }

    private static void zzZ(zzZQE<zzX1> zzzqe) {
        ArrayList arrayList = new ArrayList(zzzqe.size());
        for (zzZQD<zzX1> zzzqdZzl6 = zzzqe.zzl6(); zzzqdZzl6 != null; zzzqdZzl6 = zzzqdZzl6.zzl5()) {
            zzZQG.zzZ((ArrayList<zzZQD<zzX1>>) arrayList, zzzqdZzl6);
        }
        Collections.sort(arrayList, new zzZ((byte) 0));
        zzzqe.clear();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            zzzqe.zzZ((zzZQD) it.next());
        }
    }

    private static boolean zzZ(zzZQD<zzX1> zzzqd, int i) {
        zzX1 value = zzzqd.getValue();
        int columnSpan = value.getColumnSpan();
        for (zzZQD<zzX1> zzzqdZzl5 = zzzqd.zzl5(); zzzqdZzl5 != null && columnSpan < i; zzzqdZzl5 = zzzqdZzl5.zzl5()) {
            zzX1 value2 = zzzqdZzl5.getValue();
            if (value2.getColumnIndex() != value.getColumnIndex() + columnSpan || !zzZ(value, value2, true)) {
                return false;
            }
            columnSpan += value2.getColumnSpan();
        }
        return columnSpan == i;
    }

    private static boolean zzZ(zzX1 zzx1, zzX1 zzx12, boolean z) {
        if (zzx1.zzVo() != zzx12.zzVo()) {
            return false;
        }
        if (!z ? zzx1.getColumnIndex() == zzx12.getColumnIndex() : zzx1.getRowIndex() == zzx12.getRowIndex()) {
            if (zzx1.zzVo() != 2 ? !(zzx12.zzv(!z) || zzx1.zzv(!z)) : !(z && zzx1.getRowSpan() != zzx12.getRowSpan())) {
                if (zzZKO.equals(zzx1.zzVn(), zzx12.zzVn())) {
                    return zzZKN.equals(zzZKN.zzTX(zzx1.zzVm()), zzZKN.zzTX(zzx12.zzVm()));
                }
            }
        }
        return false;
    }
}
