package com.aspose.words;

import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
final class zzA1 {
    private zzAV zzZ6Z;

    public zzA1(zzAV zzav) {
        this.zzZ6Z = zzav;
    }

    public final com.aspose.words.internal.zzZL zzZ(zz50 zz50Var, ShapeBase shapeBase, boolean z) throws Exception {
        if (shapeBase == null) {
            return new com.aspose.words.internal.zzG();
        }
        zz8Z zz8z = new zz8Z(zz50Var, this.zzZ6Z);
        com.aspose.words.internal.zzG zzg = new com.aspose.words.internal.zzG();
        zzg.zzX(zz90.zzY(zz8z));
        zzA3 zza3 = new zzA3(zz50Var, this.zzZ6Z);
        Iterator<T> it = shapeBase.getChildNodes(0, false).iterator();
        while (it.hasNext()) {
            zz2O zz2oZzY = (zz2O) com.aspose.words.internal.zzZKW.zzZ(((ShapeBase) it.next()).zzY9i(), zz2O.class);
            if (zz2oZzY != null) {
                if (z) {
                    zz2oZzY = zza3.zzY(zz2oZzY);
                }
                zzg.zzX(zzZ(zz2oZzY, new zz1P(zz2oZzY, true).zzZ(zz50Var)));
            }
        }
        zzg.zzX(zz90.zzZ(zz8z));
        return zzg;
    }

    private static com.aspose.words.internal.zzZL zzZ(zz2O zz2o, com.aspose.words.internal.zzZL zzzl) throws Exception {
        if (zz2o.zzZyc() == null || zz2o.zzZyc().zzZxV() == null || zz2o.zzZyc().zzZxV().zzZxZ() == null) {
            return zzzl;
        }
        zz6P zz6pZzZxZ = zz2o.zzZyc().zzZxV().zzZxZ();
        com.aspose.words.internal.zzZR zzzr = new com.aspose.words.internal.zzZR(new com.aspose.words.internal.zzH().zzZ(zzzl), zz6pZzZxZ.getId(), zz6pZzZxZ.zzZe(), zz6pZzZxZ.zzZzU());
        com.aspose.words.internal.zzG zzg = (com.aspose.words.internal.zzG) com.aspose.words.internal.zzZKW.zzZ(zzzl, com.aspose.words.internal.zzG.class);
        if (zzg != null) {
            zzg.zzZ(zzzr);
            return zzzl;
        }
        com.aspose.words.internal.zzG zzg2 = new com.aspose.words.internal.zzG();
        zzg2.zzX(zzzl);
        zzg2.zzZ(zzzr);
        return zzg2;
    }
}
