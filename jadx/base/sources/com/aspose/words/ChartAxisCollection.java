package com.aspose.words;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
public class ChartAxisCollection implements Iterable<ChartAxis> {
    private zzD8 zzZz1;

    public ChartAxisCollection(zzD8 zzd8) {
        this.zzZz1 = zzd8;
    }

    private ArrayList<ChartAxis> zz3G() {
        return this.zzZz1.zzZHX().zz45().zz3G();
    }

    public ChartAxis get(int i) {
        return zz3G().get(i);
    }

    public int getCount() {
        return zz3G().size();
    }

    @Override // java.lang.Iterable
    public Iterator<ChartAxis> iterator() {
        return zz3G().iterator();
    }
}
