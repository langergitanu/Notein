package com.aspose.words;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
public final class VbaModuleCollection implements Iterable<VbaModule> {
    private VbaProject zzX0y;
    private ArrayList<VbaModule> zzX0x = new ArrayList<>();
    private com.aspose.words.internal.zzZYT<VbaModule> zzX0w = new com.aspose.words.internal.zzZYT<>();

    public VbaModuleCollection(VbaProject vbaProject) {
        this.zzX0y = vbaProject;
    }

    public final void add(VbaModule vbaModule) {
        zzZ(vbaModule);
        this.zzX0y.zzXU4();
    }

    public final VbaModule get(int i) {
        return this.zzX0x.get(i);
    }

    public final int getCount() {
        return this.zzX0x.size();
    }

    @Override // java.lang.Iterable
    @ReservedForInternalUse
    @Deprecated
    public final Iterator<VbaModule> iterator() {
        return this.zzX0x.iterator();
    }

    public final void remove(VbaModule vbaModule) {
        if (vbaModule == null) {
            throw new NullPointerException("Value cannot be null.\r\nParameter name: module");
        }
        if (this.zzX0x.indexOf(vbaModule) < 0) {
            throw new IllegalArgumentException("Specified argument was out of the range of valid values.\r\nParameter name: module");
        }
        this.zzX0w.remove(vbaModule.getName());
        this.zzX0x.remove(vbaModule);
        this.zzX0y.zzXU4();
    }

    public final VbaModuleCollection zzY(VbaProject vbaProject) {
        VbaModuleCollection vbaModuleCollection = new VbaModuleCollection(vbaProject);
        Iterator<VbaModule> it = this.zzX0x.iterator();
        while (it.hasNext()) {
            vbaModuleCollection.zzZ(it.next().deepClone());
        }
        return vbaModuleCollection;
    }

    public final void zzZ(VbaModule vbaModule) {
        if (!com.aspose.words.internal.zzZYD.zzXk(vbaModule.getName())) {
            throw new IllegalArgumentException("A module name must be specified before adding to the VBA Project.");
        }
        if (this.zzX0w.containsKey(vbaModule.getName())) {
            throw new IllegalArgumentException("Cannot add a VbaModule because a module with the same name already exists.");
        }
        vbaModule.zzZ(this.zzX0y);
        com.aspose.words.internal.zzZQG.zzZ(this.zzX0x, vbaModule);
        this.zzX0w.zzB(vbaModule.getName(), vbaModule);
    }

    public final VbaModule get(String str) {
        return (VbaModule) com.aspose.words.internal.zzQW.zzZ((com.aspose.words.internal.zzZYT) this.zzX0w, str);
    }
}
