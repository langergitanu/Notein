package com.aspose.words;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
public class OdsoFieldMapDataCollection implements Iterable<OdsoFieldMapData> {
    private ArrayList<OdsoFieldMapData> zzZm = new ArrayList<>();

    public int add(OdsoFieldMapData odsoFieldMapData) {
        com.aspose.words.internal.zzZ4.zzY((Object) odsoFieldMapData, "value");
        com.aspose.words.internal.zzZQG.zzZ(this.zzZm, odsoFieldMapData);
        return this.zzZm.size() - 1;
    }

    public void clear() {
        this.zzZm.clear();
    }

    public OdsoFieldMapData get(int i) {
        return this.zzZm.get(i);
    }

    public int getCount() {
        return this.zzZm.size();
    }

    @Override // java.lang.Iterable
    public Iterator<OdsoFieldMapData> iterator() {
        return this.zzZm.iterator();
    }

    public void removeAt(int i) {
        this.zzZm.remove(i);
    }

    public void set(int i, OdsoFieldMapData odsoFieldMapData) {
        com.aspose.words.internal.zzZ4.zzY((Object) odsoFieldMapData, "value");
        this.zzZm.set(i, odsoFieldMapData);
    }

    public final void zzYyg() {
        int iZzIH;
        if (getCount() == 0) {
            return;
        }
        OdsoFieldMapData[] odsoFieldMapDataArr = new OdsoFieldMapData[30];
        for (OdsoFieldMapData odsoFieldMapData : this) {
            if (odsoFieldMapData.getType() != 1 && (iZzIH = zzZ2L.zzIH(odsoFieldMapData.getMappedName())) != -1) {
                odsoFieldMapDataArr[iZzIH] = odsoFieldMapData;
            }
        }
        for (int i = 0; i < 30; i++) {
            if (odsoFieldMapDataArr[i] == null) {
                odsoFieldMapDataArr[i] = new OdsoFieldMapData();
            }
        }
        clear();
        for (int i2 = 0; i2 < 30; i2++) {
            add(odsoFieldMapDataArr[i2]);
        }
    }
}
