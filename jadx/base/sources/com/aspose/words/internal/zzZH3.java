package com.aspose.words.internal;

import com.orion.notein.richeditor.utils.p606io.IOUtils;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZH3 {
    final int zzTL;
    HashMap<zzZDZ, zzZH3> zzWOI = new HashMap<>();
    BitSet zzWOJ;
    final boolean zzWOK;

    private zzZH3(int i, BitSet bitSet) {
        this.zzTL = i;
        this.zzWOK = bitSet.get(0);
        this.zzWOJ = bitSet;
    }

    public static zzZH3 zzZ(zzZH4 zzzh4) {
        zzZGC zzzgcZzXP1 = zzzh4.zzXP1();
        zzZG4 zzzg4ZzXNN = zzZG4.zzXNN();
        zzZH5 zzzh5 = new zzZH5(zzzgcZzXP1, zzzg4ZzXNN);
        ArrayList arrayList = new ArrayList();
        arrayList.add(zzzg4ZzXNN);
        zzzh5.zzV(arrayList);
        int size = arrayList.size();
        BitSet[] bitSetArr = new BitSet[size];
        zzZDZ[] zzzdzArr = new zzZDZ[size];
        for (int i = 0; i < size; i++) {
            bitSetArr[i] = new BitSet(size);
            zzzdzArr[i] = ((zzZG4) arrayList.get(i)).zzWN3;
        }
        zzzh5.zzZ(bitSetArr);
        BitSet bitSet = new BitSet(size);
        zzzh5.zzZ(bitSet);
        zzZH3 zzzh3 = new zzZH3(0, bitSet);
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(zzzh3);
        HashMap map = new HashMap();
        map.put(bitSet, zzzh3);
        for (int i2 = 0; i2 < arrayList2.size(); i2++) {
            ((zzZH3) arrayList2.get(i2)).zzZ(zzzdzArr, bitSetArr, arrayList2, map);
        }
        return zzzh3;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("State #" + this.zzTL + ":\n");
        StringBuilder sb2 = new StringBuilder("  Accepting: ");
        sb2.append(this.zzWOK);
        sb.append(sb2.toString());
        sb.append("\n  Next states:\n");
        for (Map.Entry<zzZDZ, zzZH3> entry : this.zzWOI.entrySet()) {
            sb.append(entry.getKey());
            sb.append(" -> ");
            sb.append(entry.getValue().zzTL);
            sb.append(IOUtils.LINE_SEPARATOR_UNIX);
        }
        return sb.toString();
    }

    public final TreeSet<zzZDZ> zzXOV() {
        TreeSet<zzZDZ> treeSet = new TreeSet<>();
        Iterator<zzZDZ> it = this.zzWOI.keySet().iterator();
        while (it.hasNext()) {
            treeSet.add(it.next());
        }
        return treeSet;
    }

    public final zzZH3 zzY(zzZDZ zzzdz) {
        return this.zzWOI.get(zzzdz);
    }

    private void zzZ(zzZDZ[] zzzdzArr, BitSet[] bitSetArr, List<zzZH3> list, Map<BitSet, zzZH3> map) {
        BitSet bitSet = (BitSet) this.zzWOJ.clone();
        this.zzWOJ = null;
        int iNextSetBit = -1;
        while (true) {
            iNextSetBit = bitSet.nextSetBit(iNextSetBit + 1);
            if (iNextSetBit < 0) {
                return;
            }
            zzZDZ zzzdz = zzzdzArr[iNextSetBit];
            if (zzzdz != null) {
                BitSet bitSet2 = (BitSet) bitSetArr[iNextSetBit].clone();
                int iNextSetBit2 = iNextSetBit;
                while (true) {
                    iNextSetBit2 = bitSet.nextSetBit(iNextSetBit2 + 1);
                    if (iNextSetBit2 <= 0) {
                        break;
                    } else if (zzzdzArr[iNextSetBit2] == zzzdz) {
                        bitSet.clear(iNextSetBit2);
                        bitSet2.or(bitSetArr[iNextSetBit2]);
                    }
                }
                zzZH3 zzzh3 = map.get(bitSet2);
                if (zzzh3 == null) {
                    zzzh3 = new zzZH3(list.size(), bitSet2);
                    list.add(zzzh3);
                    map.put(bitSet2, zzzh3);
                }
                this.zzWOI.put(zzzdz, zzzh3);
            }
        }
    }
}
