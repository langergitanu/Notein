package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzY4A {
    private zzZ6H zzX11;
    private zzZ62 zzX12 = null;
    private zzZ71 zzZFF;

    public zzY4A(zzZ71 zzz71) {
        this.zzZFF = zzz71;
    }

    private com.aspose.words.internal.zzPV zzI(Font font) {
        com.aspose.words.internal.zzPV zzpvZzZ7m = font.zzZ7m();
        return zzpvZzZ7m.isEmpty() ? this.zzZFF.zz7(font.zz8Q()) : zzpvZzZ7m;
    }

    public static boolean zzjq(int i) {
        return i == 11 || i == 27 || i == 43;
    }

    public static boolean zzjr(int i) {
        return i == 3 || i == 43;
    }

    public final void zzB(zzZ6H zzz6h) throws Exception {
        this.zzX11 = zzz6h;
        if (this.zzX12 != null) {
            com.aspose.words.internal.zzPV zzpvZzI = zzI(zzz6h.getFont());
            if (this.zzX12.zzW(zzz6h) || !(zzz6h.getFont().getHidden() || zzz6h.zzM8())) {
                this.zzX12.zzZ(zzz6h, false, this.zzZFF);
                this.zzX12 = zzz6h.zzM8() ? new zzZ62(zzz6h, zzpvZzI) : null;
            } else if (this.zzX12.zzY(zzz6h, zzpvZzI)) {
                this.zzX12.zzZ(zzz6h, false);
                this.zzX12.zzZ(zzz6h, zzpvZzI);
            }
        } else if (zzz6h.zzYRX() > 0.0f && (zzz6h.zzM8() || zzz6h.getFont().getHidden())) {
            this.zzX12 = new zzZ62(zzz6h, zzI(zzz6h.getFont()));
        }
        zzZ62 zzz62 = this.zzX12;
        if (zzz62 != null) {
            zzz62.zzY(zzz6h);
        }
        if (zzz6h.zzM8() && zzz6h.zzYRU()) {
            this.zzX12.zzZ(zzz6h, true, this.zzZFF);
            this.zzX12 = null;
        }
    }

    public final boolean zzXUh() {
        return this.zzX12 != null;
    }

    public final void zzXUi() throws Exception {
        if (zzXUh()) {
            zzZ62 zzz62 = this.zzX12;
            zzZ6H zzz6h = this.zzX11;
            zzz62.zzZ(zzz6h, zzz6h.zzM8() || this.zzX11.getFont().getHidden(), this.zzZFF);
            this.zzX12 = null;
        }
    }
}
