package com.aspose.words.internal;

import com.aspose.slides.C22226Oooo0oo;
import com.aspose.words.internal.zzZ1D;
import java.security.SecureRandom;

/* JADX INFO: loaded from: classes5.dex */
public class zzZ1P implements zzZ5W {
    private final String name;
    private final Enum zzWim;
    private final Enum zzWin;

    public zzZ1P(String str) {
        this(str, (Enum) null, (zzZ00) null);
    }

    @Override // com.aspose.words.internal.zzZ5W
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzZ1P)) {
            return false;
        }
        zzZ1P zzz1p = (zzZ1P) obj;
        Enum r1 = this.zzWim;
        if (r1 == null ? zzz1p.zzWim != null : !r1.equals(zzz1p.zzWim)) {
            return false;
        }
        Enum r12 = this.zzWin;
        if (r12 == null ? zzz1p.zzWin == null : r12.equals(zzz1p.zzWin)) {
            return this.name.equals(zzz1p.name);
        }
        return false;
    }

    @Override // com.aspose.words.internal.zzZ5W
    public final String getName() {
        return this.name;
    }

    @Override // com.aspose.words.internal.zzZ5W
    public int hashCode() {
        int iHashCode = this.name.hashCode() * 31;
        Enum r1 = this.zzWim;
        int iHashCode2 = (iHashCode + (r1 != null ? r1.hashCode() : 0)) * 31;
        Enum r12 = this.zzWin;
        return iHashCode2 + (r12 != null ? r12.hashCode() : 0);
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
        return (r0 instanceof zzZ05) && ((zzZ05) r0).zzXE1().zzXCM();
    }

    public final byte[] zzZ(int i, SecureRandom secureRandom) {
        return ((zzZ05) this.zzWin).zzZ(i, secureRandom);
    }

    public zzZ1P(String str, Enum r3) {
        this(str, r3, (zzZ00) null);
    }

    private zzZ1P(String str, Enum r4, zzZ00 zzz00) {
        String str2;
        this.zzWin = r4;
        this.zzWim = zzz00;
        if (r4 instanceof zzZ05) {
            StringBuilder sbOooO0OO = C22226Oooo0oo.OooO0OO(str, "/");
            sbOooO0OO.append(((zzZ05) r4).zzXE1().zzXCN());
            if (zzz00 != null) {
                str2 = "/" + zzz00.zzXE0().zzXCN();
            } else {
                str2 = "";
            }
            sbOooO0OO.append(str2);
            this.name = sbOooO0OO.toString();
            return;
        }
        if (r4 instanceof zzZ1D.zzJ) {
            this.name = androidx.concurrent.futures.OooO00o.OooO0OO(C22226Oooo0oo.OooO0OO(str, "("), ((zzZ1D.zzJ) r4).zzXF4().name, ")");
        } else if (r4 instanceof zzZ1D.zzZ) {
            this.name = androidx.concurrent.futures.OooO00o.OooO0OO(C22226Oooo0oo.OooO0OO(str, "("), ((zzZ1D.zzZ) r4).zzXF4().name, ")");
        } else {
            this.name = str;
        }
    }

    public zzZ1P(zzZ1P zzz1p, Enum r3) {
        this(zzz1p.name, r3, (zzZ00) null);
    }

    public zzZ1P(zzZ1P zzz1p, Enum r2, zzZ00 zzz00) {
        this(zzz1p.name, r2, zzz00);
    }
}
