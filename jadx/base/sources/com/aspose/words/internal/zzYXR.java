package com.aspose.words.internal;

import com.aspose.slides.C22226Oooo0oo;
import java.security.SecureRandom;

/* JADX INFO: loaded from: classes5.dex */
public class zzYXR implements zzZ5W {
    private final String name;
    private final Enum zzWim;
    private final Enum zzWin;

    public zzYXR(String str) {
        this(str, (Enum) null, (zzYWM) null);
    }

    private static boolean zzs(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    @Override // com.aspose.words.internal.zzZ5W
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzYXR)) {
            return false;
        }
        zzYXR zzyxr = (zzYXR) obj;
        return zzs(this.zzWim, zzyxr.zzWim) && zzs(this.zzWin, zzyxr.zzWin) && this.name.equals(zzyxr.name);
    }

    @Override // com.aspose.words.internal.zzZ5W
    public final String getName() {
        return this.name;
    }

    @Override // com.aspose.words.internal.zzZ5W
    public int hashCode() {
        int iHashCode = this.name.hashCode() * 31;
        Enum r1 = this.zzWin;
        int iHashCode2 = (iHashCode + (r1 != null ? r1.hashCode() : 0)) * 31;
        Enum r12 = this.zzWim;
        return iHashCode2 + (r12 != null ? r12.hashCode() : 0);
    }

    public final byte[] zz5(byte[] bArr, int i) {
        return ((zzYWU) this.zzWin).zz5(bArr, i);
    }

    public final Enum zzXFR() {
        return this.zzWim;
    }

    public final Enum zzXFS() {
        return this.zzWin;
    }

    @Override // com.aspose.words.internal.zzZ5W
    public final boolean zzXH5() {
        Enum r0 = this.zzWin;
        return ((r0 instanceof zzYWU) && ((zzYWU) r0).zzXE1().zzXCM()) || this.name.equals("ChaCha20");
    }

    public final byte[] zzZ(int i, SecureRandom secureRandom) {
        return ((zzYWU) this.zzWin).zzZ(i, secureRandom);
    }

    public zzYXR(String str, Enum r3) {
        this(str, r3, (zzYWM) null);
    }

    public zzYXR(String str, Enum r3, zzYWM zzywm) {
        String str2;
        this.zzWin = r3;
        this.zzWim = zzywm;
        if (r3 instanceof zzYWU) {
            StringBuilder sbOooO0OO = C22226Oooo0oo.OooO0OO(str, "/");
            sbOooO0OO.append(((zzYWU) r3).zzXE1().zzXCN());
            if (zzywm != null) {
                str2 = "/" + zzywm.zzXE0().zzXCN();
            } else {
                str2 = "";
            }
            sbOooO0OO.append(str2);
            this.name = sbOooO0OO.toString();
            return;
        }
        this.name = str;
    }

    public zzYXR(zzYXR zzyxr, Enum r3) {
        this(zzyxr.name, r3, (zzYWM) null);
    }

    public zzYXR(zzYXR zzyxr, Enum r2, zzYWM zzywm) {
        this(zzyxr.name, r2, zzywm);
    }
}
