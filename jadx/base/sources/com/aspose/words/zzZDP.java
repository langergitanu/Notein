package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZDP extends zzZDS {
    private zzPS zzZq9;

    public zzZDP(zzPS zzps) {
        super("style");
        this.zzZq9 = zzps;
    }

    @Override // com.aspose.words.zzZDS
    public final String getValue() {
        return this.zzZq9.zzZWh().zzZXu();
    }

    @Override // com.aspose.words.zzZDS
    public final void zzZ(zzZI0 zzzi0) {
        if (this.zzZq9.getCount() != 0) {
            zzzi0.zzX(getName(), getValue());
        }
    }

    public final zzPS zzZWe() {
        return this.zzZq9;
    }
}
