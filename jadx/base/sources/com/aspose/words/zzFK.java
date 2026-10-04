package com.aspose.words;

import com.orion.notein.richeditor.utils.p606io.IOUtils;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
final class zzFK implements Cloneable {
    private int zzZdZ;
    private zzCB zzZe0;
    private zzCB zzZe1;

    private Object memberwiseClone() {
        try {
            return clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(e);
        }
    }

    private boolean zzZN5() {
        return (this.zzZe0 == null || zzZN4() == null || this.zzZdZ != zzZN4().zzZG9()) ? false : true;
    }

    public final void zzV(zzCE zzce) {
        zzZ(zzce != null ? new zzCB(zzce) : null);
    }

    public final void zzY(zzCB zzcb) {
        this.zzZdZ = zzZN4().zzZG9();
        this.zzZe0 = zzcb;
    }

    public final void zzZ(zzCB zzcb) {
        this.zzZe1 = zzcb;
        this.zzZe0 = null;
    }

    public final zzCB zzZN3() {
        return this.zzZe1;
    }

    public final zzCE zzZN4() {
        zzCB zzcb = this.zzZe1;
        if (zzcb != null) {
            return zzcb.zzZN4();
        }
        return null;
    }

    public final zzCE zzZN6() {
        if (zzZN4() == null || zzZN4().getValueType() != 3) {
            return null;
        }
        if (zzZN5()) {
            return this.zzZe0.zzZN4();
        }
        zzCE zzce = new zzCE(1);
        for (zzEA zzea : zzZN4()) {
            StringBuilder sb = new StringBuilder();
            Iterator<Object> it = zzea.zzZLe().iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                if (sb.length() > 0) {
                    com.aspose.words.internal.zzZNH.zzU(sb, IOUtils.LINE_SEPARATOR_WINDOWS);
                }
                com.aspose.words.internal.zzZNH.zzU(sb, str);
            }
            zzce.zzP(new zzD4(zzea.getIndex(), sb.toString()));
        }
        zzY(new zzCB(zzce));
        return zzce;
    }

    public final zzFK zzZN7() {
        zzFK zzfk = (zzFK) memberwiseClone();
        zzCB zzcb = this.zzZe1;
        if (zzcb != null) {
            zzfk.zzZe1 = zzcb.zzZG2();
        }
        if (zzZN5()) {
            zzfk.zzY(this.zzZe0.zzZG2());
            return zzfk;
        }
        zzfk.zzZe0 = null;
        return zzfk;
    }
}
