package com.aspose.words;

import com.aspose.words.ref.Ref;

/* JADX INFO: loaded from: classes6.dex */
final class zzZP3 extends zzZP6 {
    public zzZP3(Field field) {
        super(field);
    }

    @Override // com.aspose.words.zzZP6
    public final void zzZhW() throws Exception {
        zzY94 zzy94 = new zzY94(getField().getResult());
        Ref<zzZQ8> ref = new Ref<>(null);
        boolean zZzZ = getField().getFormat().zzZ(zzy94, ref);
        zzZQ8 zzzq8 = ref.get();
        if (zZzZ) {
            new zzY5R(getField(), zzzq8).zzZcx();
        } else {
            zzZB1 formatApplier = getField().getFormat().zzZdZ().getFormatApplier();
            if (formatApplier != null) {
                formatApplier.zzZ(getField().zzZgF());
            }
        }
        getField().zzZgn().zzZbm();
    }
}
