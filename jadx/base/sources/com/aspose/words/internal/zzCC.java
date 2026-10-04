package com.aspose.words.internal;

import com.aspose.words.ref.Ref;
import com.aspose.words.ref.RefInt;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes5.dex */
final class zzCC {
    private zzGL zztC;
    ArrayList<zzCO> zztE;
    private int zztO = 3;
    private int zztL = 1;
    private zzZP1 zztP = zzCB.zztB;
    private int zztN = 0;
    private boolean zztD = true;
    private String zztK = "yyyy'-'MM'-'dd'T'HH':'mm':'ss.FFFFFFFK";

    private static void zzZ(zzCC zzcc, zzC8 zzc8, zzCO zzco) {
        if (zzco != null) {
            zzcc.zzCk().add(0, zzco);
        }
        zzcc.zztD = zzc8.zztD;
        if (zzc8.zzCi() != null) {
            zzcc.zztC = zzc8.zzCi();
        }
        zzcc.zztO = zzc8.zztO;
        zzcc.zztL = zzc8.zztL;
        zzcc.zztK = zzc8.zztK;
        zzZP1 zzzp1 = zzc8.zztP;
        if (zzzp1 != null) {
            zzcc.zztP = zzzp1;
        }
        zzcc.zztN = zzc8.zztN;
    }

    public final ArrayList<zzCO> zzCk() {
        if (this.zztE == null) {
            this.zztE = new ArrayList<>();
        }
        return this.zztE;
    }

    public final Object zzY(zzCF zzcf, Class cls) throws Exception {
        zzZ4.zzY((Object) zzcf, "reader");
        Ref<zzZP1> ref = new Ref<>(null);
        RefInt refInt = new RefInt(0);
        RefInt refInt2 = new RefInt(0);
        RefInt refInt3 = new RefInt(0);
        Ref<String> ref2 = new Ref<>(null);
        zzZ(zzcf, ref, refInt, refInt2, refInt3, ref2);
        zzZP1 zzzp1 = ref.get();
        int i = refInt.get();
        int i2 = refInt2.get();
        int i3 = refInt3.get();
        String str = ref2.get();
        Object objZzZ = new zzC9(this).zzZ(zzcf, cls, this.zztD);
        zzZ(zzcf, zzzp1, i, i2, i3, str);
        return objZzZ;
    }

    private void zzZ(zzCF zzcf, Ref<zzZP1> ref, RefInt refInt, RefInt refInt2, RefInt refInt3, Ref<String> ref2) {
        ref.set(zzcf.zzCr());
        zzcf.zzV(this.zztP);
        refInt.set(zzcf.zzCu());
        zzcf.zzVx(this.zztO);
        refInt2.set(zzcf.zztL);
        zzcf.zzVw(this.zztL);
        refInt3.set(zzcf.zzCs());
        zzcf.zzVv(this.zztN);
        ref2.set(zzcf.zzCt());
        zzcf.zzYB(this.zztK);
    }

    private static void zzZ(zzCF zzcf, zzZP1 zzzp1, int i, int i2, int i3, String str) {
        zzcf.zzV(zzzp1);
        zzcf.zzVx(i);
        zzcf.zzVw(i2);
        zzcf.zzVv(i3);
        zzcf.zzYB(str);
    }

    public static zzCC zzZ(zzC8 zzc8, zzCO zzco) {
        zzCC zzcc = new zzCC();
        if (zzc8 != null) {
            zzZ(zzcc, zzc8, zzco);
        }
        return zzcc;
    }
}
