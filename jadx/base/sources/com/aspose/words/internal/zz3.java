package com.aspose.words.internal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes5.dex */
public final class zz3 extends zz6 {
    private static zzF4 zzZ9;
    private Collection<zz4> zzZa;

    private zz3(Collection<zz4> collection) {
        collection.getClass();
        this.zzZa = collection;
    }

    public static void zzZ(zzZL zzzl, Collection<zz4> collection, zzF4 zzf4) throws Exception {
        zzZ9 = zzf4;
        zzZ(zzzl, collection);
    }

    public static void zzZ(zzZL zzzl, Collection<zz4> collection) throws Exception {
        if (collection == null || collection.size() == 0) {
            return;
        }
        zzzl.zzZ(new zz3(collection));
    }

    public static void zzZ(zzZL zzzl, zz4 zz4Var) throws Exception {
        ArrayList arrayList = new ArrayList(1);
        zzZQG.zzZ((ArrayList<zz4>) arrayList, zz4Var);
        zzzl.zzZ(new zz3(arrayList));
    }

    @Override // com.aspose.words.internal.zz6
    public final void zzZ(zzZG zzzg) throws Exception {
        Iterator<zz4> it = this.zzZa.iterator();
        while (it.hasNext()) {
            it.next().zzY(zzzg);
        }
    }

    @Override // com.aspose.words.internal.zz6
    public final void zzZ(zzZU zzzu) {
        Iterator<zz4> it = this.zzZa.iterator();
        while (it.hasNext()) {
            it.next().zzY(zzzu);
        }
    }

    @Override // com.aspose.words.internal.zz6
    public final void zzZ(zzZP zzzp) throws Exception {
        zzF4 zzf4;
        try {
            zzEI zzei = new zzEI(zzzp.getImageBytes());
            try {
                Iterator<zz4> it = this.zzZa.iterator();
                while (it.hasNext()) {
                    it.next().zzZ(zzei);
                }
                zzei.zzDU();
                zzzp.setImageBytes(zzei.getImageBytes());
                zzei.dispose();
            } catch (Throwable th) {
                zzei.dispose();
                throw th;
            }
        } catch (Exception e) {
            if ((e instanceof zzX8) && (zzf4 = zzZ9) != null) {
                zzf4.zzZ(0, 6, e.getMessage());
            }
            zzzp.setImageBytes(zzEF.zzDL());
            zzzp.zzZc();
        }
    }
}
