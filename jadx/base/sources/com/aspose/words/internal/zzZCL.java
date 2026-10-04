package com.aspose.words.internal;

import java.io.IOException;
import java.util.Enumeration;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZCL extends zzZCY {
    public zzZCL(zzZDK zzzdk) {
        super(true, 0, zzzdk);
    }

    @Override // com.aspose.words.internal.zzZD5
    public final int zzXL6() throws IOException {
        int iZzg3;
        if (this.zzWIa) {
            return zzZBC.zzg3(this.zzWIb) + 1;
        }
        int iZzXL6 = this.zzWI8.zzXL0().zzXL6();
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
        Enumeration enumerationZzXKE;
        zzzd7.writeTag(160, this.zzWIb);
        zzzd7.write(128);
        if (!this.zzWIa) {
            if (this.zzWI9) {
                zzzd7.zzY(this.zzWI8);
            } else {
                zzZDK zzzdk = this.zzWI8;
                if (zzzdk instanceof zzZD9) {
                    enumerationZzXKE = zzzdk instanceof zzZCS ? ((zzZCS) zzzdk).zzXKE() : new zzZCS(((zzZD9) zzzdk).zzXL5()).zzXKE();
                } else if (zzzdk instanceof zzZD4) {
                    enumerationZzXKE = ((zzZD4) zzzdk).zzXKE();
                } else {
                    if (!(zzzdk instanceof zzZD2)) {
                        throw new zzZDH("not implemented: ".concat(this.zzWI8.getClass().getName()));
                    }
                    enumerationZzXKE = ((zzZD2) zzzdk).zzXKE();
                }
                while (enumerationZzXKE.hasMoreElements()) {
                    zzzd7.zzY((zzZDK) enumerationZzXKE.nextElement());
                }
            }
        }
        zzzd7.write(0);
        zzzd7.write(0);
    }

    public zzZCL(boolean z, int i, zzZDK zzzdk) {
        super(z, i, zzzdk);
    }
}
