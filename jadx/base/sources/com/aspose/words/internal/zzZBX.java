package com.aspose.words.internal;

import java.io.IOException;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZBX extends zzZCY {
    private static final byte[] zzWHO = new byte[0];

    public zzZBX(boolean z, int i, zzZDK zzzdk) {
        super(z, i, zzzdk);
    }

    @Override // com.aspose.words.internal.zzZD5
    public final int zzXL6() throws IOException {
        int iZzg3;
        if (this.zzWIa) {
            return zzZBC.zzg3(this.zzWIb) + 1;
        }
        int iZzXL6 = this.zzWI8.zzXL0().zzXL3().zzXL6();
        if (this.zzWI9) {
            iZzg3 = zzZBC.zzg3(this.zzWIb) + zzZBC.zzg4(iZzXL6);
        } else {
            iZzXL6--;
            iZzg3 = zzZBC.zzg3(this.zzWIb);
        }
        return iZzg3 + iZzXL6;
    }

    @Override // com.aspose.words.internal.zzZD5
    public final boolean zzXLa() {
        if (this.zzWIa || this.zzWI9) {
            return true;
        }
        return this.zzWI8.zzXL0().zzXL3().zzXLa();
    }

    @Override // com.aspose.words.internal.zzZCY, com.aspose.words.internal.zzZD5
    public final void zzZ(zzZD7 zzzd7) throws IOException {
        if (this.zzWIa) {
            zzzd7.zzY(160, this.zzWIb, zzWHO);
            return;
        }
        zzZD5 zzzd5ZzXL3 = this.zzWI8.zzXL0().zzXL3();
        if (!this.zzWI9) {
            zzzd7.writeTag(zzzd5ZzXL3.zzXLa() ? 160 : 128, this.zzWIb);
            zzzd7.zzY(zzzd5ZzXL3);
        } else {
            zzzd7.writeTag(160, this.zzWIb);
            zzzd7.zzg7(zzzd5ZzXL3.zzXL6());
            zzzd7.zzY((zzZDK) zzzd5ZzXL3);
        }
    }

    public zzZBX(zzZDK zzzdk) {
        super(true, 0, zzzdk);
    }
}
