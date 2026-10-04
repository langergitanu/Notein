package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* JADX INFO: loaded from: classes7.dex */
abstract class zbkn extends zbjz {
    final CharSequence zbb;
    int zbc = 0;
    int zbd = Integer.MAX_VALUE;

    public zbkn(zbko zbkoVar, CharSequence charSequence) {
        this.zbb = charSequence;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbjz
    public final /* bridge */ /* synthetic */ Object zba() {
        int iZbc;
        int i = this.zbc;
        while (true) {
            int i2 = this.zbc;
            if (i2 == -1) {
                zbb();
                return null;
            }
            int iZbd = zbd(i2);
            if (iZbd == -1) {
                iZbd = this.zbb.length();
                this.zbc = -1;
                iZbc = -1;
            } else {
                iZbc = zbc(iZbd);
                this.zbc = iZbc;
            }
            if (iZbc != i) {
                if (i < iZbd) {
                    this.zbb.charAt(i);
                }
                if (i < iZbd) {
                    this.zbb.charAt(iZbd - 1);
                }
                int i3 = this.zbd;
                if (i3 == 1) {
                    iZbd = this.zbb.length();
                    this.zbc = -1;
                    if (iZbd > i) {
                        this.zbb.charAt(iZbd - 1);
                    }
                } else {
                    this.zbd = i3 - 1;
                }
                return this.zbb.subSequence(i, iZbd).toString();
            }
            int i4 = iZbc + 1;
            this.zbc = i4;
            if (i4 > this.zbb.length()) {
                this.zbc = -1;
            }
        }
    }

    public abstract int zbc(int i);

    public abstract int zbd(int i);
}
