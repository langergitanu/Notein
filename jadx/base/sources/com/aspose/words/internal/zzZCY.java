package com.aspose.words.internal;

import Oooo0oO.C21111o0ooOoO;
import androidx.appcompat.widget.C21532OooOOo;
import com.aspose.slides.C22206OooOOo0;
import java.io.IOException;

/* JADX INFO: loaded from: classes5.dex */
public abstract class zzZCY extends zzZD5 implements zzZCX {
    zzZDK zzWI8;
    boolean zzWI9;
    boolean zzWIa = false;
    int zzWIb;

    public zzZCY(boolean z, int i, zzZDK zzzdk) {
        this.zzWI9 = true;
        this.zzWI8 = null;
        if (zzzdk instanceof zzZDL) {
            this.zzWI9 = true;
        } else {
            this.zzWI9 = z;
        }
        this.zzWIb = i;
        if (this.zzWI9) {
            this.zzWI8 = zzzdk;
        } else {
            zzzdk.zzXL0();
            this.zzWI8 = zzzdk;
        }
    }

    public static zzZCY zzX(zzZCY zzzcy) {
        return (zzZCY) zzzcy.zzXKw();
    }

    public static zzZCY zzYw(Object obj) {
        if (obj == null || (obj instanceof zzZCY)) {
            return (zzZCY) obj;
        }
        if (!(obj instanceof byte[])) {
            throw new IllegalArgumentException(C22206OooOOo0.OooO0OO(obj, "unknown object in getInstance: "));
        }
        try {
            return zzYw(zzZD5.zzXo((byte[]) obj));
        } catch (IOException e) {
            throw new IllegalArgumentException(C21111o0ooOoO.OooO00o(e, new StringBuilder("failed to construct tagged object from byte[]: ")));
        }
    }

    @Override // com.aspose.words.internal.zzZD5, com.aspose.words.internal.zzZDB
    public int hashCode() {
        int i = this.zzWIb;
        zzZDK zzzdk = this.zzWI8;
        return zzzdk != null ? i ^ zzzdk.hashCode() : i;
    }

    public final boolean isEmpty() {
        return this.zzWIa;
    }

    public String toString() {
        return "[" + this.zzWIb + "]" + this.zzWI8;
    }

    @Override // com.aspose.words.internal.zzZBI
    public final zzZD5 zzXKI() {
        return zzXL0();
    }

    public final zzZD5 zzXKw() {
        zzZDK zzzdk = this.zzWI8;
        if (zzzdk != null) {
            return zzzdk.zzXL0();
        }
        return null;
    }

    public final boolean zzXKx() {
        return this.zzWI9;
    }

    @Override // com.aspose.words.internal.zzZCX
    public final int zzXKy() {
        return this.zzWIb;
    }

    @Override // com.aspose.words.internal.zzZD5
    public final zzZD5 zzXL2() {
        return new zzZBL(this.zzWI9, this.zzWIb, this.zzWI8);
    }

    @Override // com.aspose.words.internal.zzZD5
    public final zzZD5 zzXL3() {
        return new zzZBX(this.zzWI9, this.zzWIb, this.zzWI8);
    }

    @Override // com.aspose.words.internal.zzZCX
    public final zzZDK zzYR(int i, boolean z) throws IOException {
        if (i == 4) {
            return zzZD9.zzY(this, z);
        }
        if (i == 16) {
            return zzZD4.zzX(this, z).zzXKD();
        }
        if (i == 17) {
            return zzZD2.zzW(this, z).zzXKB();
        }
        if (z) {
            return zzXKw();
        }
        throw new zzZDH(C21532OooOOo.OooO0OO(i, "implicit tagging not implemented for tag: "));
    }

    @Override // com.aspose.words.internal.zzZD5
    public abstract void zzZ(zzZD7 zzzd7) throws IOException;

    @Override // com.aspose.words.internal.zzZD5
    public final boolean zzZ(zzZD5 zzzd5) {
        if (!(zzzd5 instanceof zzZCY)) {
            return false;
        }
        zzZCY zzzcy = (zzZCY) zzzd5;
        if (this.zzWIb != zzzcy.zzWIb || this.zzWIa != zzzcy.zzWIa || this.zzWI9 != zzzcy.zzWI9) {
            return false;
        }
        zzZDK zzzdk = this.zzWI8;
        return zzzdk == null ? zzzcy.zzWI8 == null : zzzdk.zzXL0().equals(zzzcy.zzWI8.zzXL0());
    }
}
