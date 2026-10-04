package com.aspose.words;

import com.aspose.words.ref.Ref;

/* JADX INFO: loaded from: classes6.dex */
final class zzZP5 extends zzZP6 {
    private boolean zzYBk;
    private zzZB2 zzYBl;
    private int zzYS3;

    public zzZP5(Field field, String str) {
        this(field, str, true);
    }

    private zzZPH zzZbz() throws Exception {
        zzTL zztlZzZgh;
        String strZz8W;
        zzZB2 zzzb2 = this.zzYBl;
        if (zzzb2 != null && (strZz8W = (zztlZzZgh = zzzb2.zzZgh()).zz8W()) != null) {
            Ref<zzZQ8> ref = new Ref<>(new zzZQ8(strZz8W));
            boolean z = this.zzYBk && getField().getFormat().zzZ(zztlZzZgh, ref);
            zzZQ8 zzzq8 = ref.get();
            zzYWB zzywbZzZgF = this.zzYBl.zzZgF();
            return (zzywbZzZgF == null || z) ? new zzY5R(getField(), zzzq8, this.zzYS3) : new zzYW3(getField(), zzywbZzZgF);
        }
        return new zzY5R(getField(), "");
    }

    @Override // com.aspose.words.zzZP6
    public final void zzZhW() throws Exception {
        zzZbz().zzZcx();
        getField().zzZgn().zzZbm();
    }

    public zzZP5(Field field, String str, boolean z) {
        this(field, str != null ? new zzZPI(new zzY94(str)) : null, z);
    }

    public zzZP5(Field field, zzTL zztl) {
        this(field, zztl, true);
    }

    public zzZP5(Field field, zzTL zztl, boolean z) {
        this(field, zztl != null ? new zzZPI(zztl) : null, z);
    }

    public zzZP5(Field field, zzZB2 zzzb2) {
        this(field, zzzb2, true);
    }

    public zzZP5(Field field, String str, byte b) {
        this(field, str);
        this.zzYS3 = 1;
    }

    public zzZP5(Field field, zzZB2 zzzb2, boolean z) {
        super(field);
        this.zzYBl = zzzb2;
        this.zzYBk = z;
    }
}
