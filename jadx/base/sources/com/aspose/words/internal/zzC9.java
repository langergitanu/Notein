package com.aspose.words.internal;

import org.w3c.dom.Document;

/* JADX INFO: loaded from: classes5.dex */
final class zzC9 extends zzCA {
    public zzC9(zzCC zzcc) {
        super(zzcc);
    }

    private zzCO zzL(Class cls) {
        if (cls != Document.class) {
            return null;
        }
        this.zztz.zzCk().size();
        return this.zztz.zzCk().size() > 0 ? (zzZSQ) this.zztz.zzCk().get(0) : new zzZSQ();
    }

    public final Object zzZ(zzCF zzcf, Class cls, boolean z) throws Exception {
        if (zzcf == null) {
            throw new NullPointerException("Value cannot be null.\r\nParameter name: reader");
        }
        zzCO zzcoZzL = zzL(cls);
        try {
            if (zzcf.zzYb() == 0) {
                if (!zzcf.zzZY(zzcoZzL != null)) {
                    return null;
                }
            }
            Object objZzZ = zzcoZzL.zzZ(zzcf, cls);
            if (z) {
                while (zzcf.read()) {
                    if (zzcf.zzYb() != 5) {
                        throw zzCD.zzY(zzcf, "Additional text found in JSON string after finishing deserializing object.");
                    }
                }
            }
            return objZzZ;
        } catch (Exception e) {
            zzZKW.zzZ(zzcf, zzGK.class);
            if (zzY(zzcf.getPath(), e)) {
                zzCj();
                return null;
            }
            zzCj();
            throw e;
        }
    }
}
