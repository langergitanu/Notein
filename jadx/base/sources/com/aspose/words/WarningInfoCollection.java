package com.aspose.words;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
public class WarningInfoCollection implements IWarningCallback, Iterable<WarningInfo> {
    private ArrayList<WarningInfo> zzZm = new ArrayList<>();

    public void clear() {
        this.zzZm.clear();
    }

    public WarningInfo get(int i) {
        return this.zzZm.get(i);
    }

    public int getCount() {
        return this.zzZm.size();
    }

    @Override // java.lang.Iterable
    public Iterator<WarningInfo> iterator() {
        return this.zzZm.iterator();
    }

    @Override // com.aspose.words.IWarningCallback
    public void warning(WarningInfo warningInfo) {
        com.aspose.words.internal.zzZQG.zzZ(this.zzZm, warningInfo);
    }
}
