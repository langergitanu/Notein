package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
final class zzQ extends zzAF {
    private static Object zz8 = new Object();
    static zzAF zz7 = new zzQ();

    private zzQ() {
    }

    @Override // com.aspose.words.internal.zzAF
    public final zzAD zzZ(zzZVP[] zzzvpArr) {
        if (zzzvpArr.length != 0) {
            return null;
        }
        return new zzAD(this, zz8, 1, new zzZYT(), zzR.class);
    }

    @Override // com.aspose.words.internal.zzAF
    public final zzAD zzZ(Object obj, String str, zzZVP zzzvp) {
        zzZYT zzzyt = (zzZYT) obj;
        if (!zzzyt.containsKey(str)) {
            if (zzzvp.zzTU()) {
                zzzvp = zzZVO.zzX(zzzvp.getType(), zzzvp.zzv(), zzzvp.zzu());
            }
            zzAD zzad = new zzAD(this, Integer.valueOf(zzzyt.getCount()), zzzvp);
            zzzyt.zzB(str, zzad);
            return zzad;
        }
        throw new zzCX(zzZKN.format("Can not redefine field '{0}' on anonymous type.", str));
    }

    @Override // com.aspose.words.internal.zzAF
    public final zzAD zzZ(Object obj, String str) {
        return (zzAD) zzQW.zzZ((zzZYT) obj, str);
    }

    @Override // com.aspose.words.internal.zzAF
    public final Object zzZ(zzAD zzad, Object obj, Object obj2) {
        if (obj == zz8) {
            return new zzR(((zzZYT) zzad.zzAF().zzv()).getCount());
        }
        return ((zzR) obj2).zzr()[((Integer) obj).intValue()];
    }

    @Override // com.aspose.words.internal.zzAF
    public final void zzZ(zzAD zzad, Object obj, Object obj2, Object obj3) {
        ((zzR) obj2).zzr()[((Integer) obj).intValue()] = obj3;
    }

    @Override // com.aspose.words.internal.zzAF
    public final boolean zzZ(Class cls) {
        return cls == zzR.class;
    }
}
