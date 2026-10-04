package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
class zzKN implements zzH0 {
    private String zzCn;
    private zzKO zzCo;

    public zzKN(zzKO zzko, String str) {
        this.zzCo = zzko;
        this.zzCn = str;
    }

    @Override // com.aspose.words.internal.zzF6
    public final Class getType() {
        return this.zzCo.getType();
    }

    public final zzKO zzIL() {
        return this.zzCo;
    }

    public final IllegalStateException zzZ(Exception exc) {
        return new IllegalStateException(zzZKN.format("An error has been encountered while evaluating the expression or statement '{0}'. {1}", this.zzCn, exc.getMessage()), exc);
    }

    @Override // com.aspose.words.internal.zzF6
    public final boolean zzs() {
        return this.zzCo.zzs();
    }

    @Override // com.aspose.words.internal.zzF6
    public final Object zzu() {
        return this.zzCo.zzu();
    }

    @Override // com.aspose.words.internal.zzF6
    public final Object zzv() {
        return this.zzCo.zzv();
    }

    @Override // com.aspose.words.internal.zzF6
    public final Class zzw() {
        return this.zzCo.zzw();
    }

    @Override // com.aspose.words.internal.zzH0
    public Object zzx() throws Exception {
        try {
            return this.zzCo.zzx();
        } catch (Exception e) {
            throw zzZ(e);
        }
    }
}
