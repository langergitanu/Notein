package com.aspose.words;

import com.huawei.hms.network.embedded.C18358t1;
import java.util.HashMap;

/* JADX INFO: loaded from: classes6.dex */
final class zzZE7 {
    private HashMap<String, zzZDQ> zzYkG;
    private HashMap<zzPS, zzZDP> zzYkH;
    private zzZDN zzYkI;
    private zzZDN zzYkJ;

    public zzZE7() {
        this(null);
    }

    private void zzS(zzZDN zzzdn) {
        zzZDN zzzdn2 = this.zzYkI;
        zzZ(zzzdn2 != null ? zzzdn2.zzYXk().getCount() : 0, zzzdn);
    }

    public final void endElement(String str) {
        com.aspose.words.internal.zzZKN.equals(this.zzYkI.getName(), str);
        zzp();
    }

    public final void startDocument() {
        if (this.zzYkJ != null) {
            throw new IllegalStateException();
        }
        zzS(new zzZDO());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        zzZ(this.zzYkJ, 0, sb);
        return sb.toString();
    }

    public final void writeString(String str) {
        zzY(new zzZDI(str));
    }

    public final void zzH(zzPS zzps) {
        this.zzYkI.zzYXj().zzJH("style");
        zzZDP zzzdp = (zzZDP) com.aspose.words.internal.zzQW.zzZ(this.zzYkH, zzps);
        if (zzzdp == null) {
            zzzdp = new zzZDP(zzps);
            this.zzYkH.put(zzps, zzzdp);
        }
        this.zzYkI.zzYXj().zzZ(zzzdp);
    }

    public final void zzKK(String str) {
        zzY(new zzZJ7(str));
    }

    public final void zzX(String str, String str2) {
        com.aspose.words.internal.zzZKN.zzX(str, "style", com.aspose.words.internal.zzZOF.ORDINAL_IGNORE_CASE$4894b8c8);
        String str3 = str + "=" + str2;
        zzZDQ zzzdq = (zzZDQ) com.aspose.words.internal.zzQW.zzZ(this.zzYkG, str3);
        if (zzzdq == null) {
            zzzdq = new zzZDQ(str, str2);
            com.aspose.words.internal.zzZQF.zzY(this.zzYkG, str3, zzzdq);
        }
        this.zzYkI.zzYXj().zzZ(zzzdq);
    }

    public final void zzY(String str, boolean z) {
        zzY(new zzZFJ(str, z));
    }

    public final zzZDN zzYXW() {
        return this.zzYkJ;
    }

    public final zzZDN zzYXX() {
        return this.zzYkI;
    }

    public final void zzZ(int i, zzZDN zzzdn) {
        boolean z = false;
        if (this.zzYkJ == null) {
            if ((zzzdn instanceof zzZDO) || (zzzdn instanceof zzZDL)) {
                this.zzYkJ = zzzdn;
                z = true;
            } else {
                this.zzYkJ = new zzZDL();
            }
            this.zzYkI = this.zzYkJ;
        }
        if (z) {
            return;
        }
        if (i >= 0) {
            this.zzYkI.zzYXk().getCount();
        }
        this.zzYkI.zzYXk().zzZ(i, zzzdn);
        this.zzYkI = zzzdn;
    }

    public final void zzZ2r() {
        zzY(new zzZJ8());
    }

    public final void zzZD(String str, int i) {
        zzX(str, com.aspose.words.internal.zzJB.zzWD(i));
    }

    public final void zzZN(String str, int i) {
        zzS(new zzZDN(str, i));
    }

    public final void zzp() {
        zzZDN zzzdn = this.zzYkI;
        if (zzzdn == this.zzYkJ) {
            throw new IllegalStateException();
        }
        zzzdn.zzYXl();
        this.zzYkI = this.zzYkI.zzYXe();
    }

    public zzZE7(zzZDN zzzdn) {
        this.zzYkH = new HashMap<>();
        this.zzYkG = new HashMap<>();
        this.zzYkJ = zzzdn;
        this.zzYkI = zzzdn;
    }

    private void zzY(zzZDK zzzdk) {
        this.zzYkI.zzYXk().zzX(zzzdk);
    }

    private void zzZ(zzZDN zzzdn, int i, StringBuilder sb) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(com.aspose.words.internal.zzZKN.zzS(ControlChar.SPACE_CHAR, i * 2));
        sb2.append(zzzdn.getName());
        sb2.append(zzzdn == this.zzYkI ? C18358t1.g.f56183c : "");
        com.aspose.words.internal.zzZNH.zzV(sb, sb2.toString());
        for (zzZDK zzzdk : zzzdn.zzYXk()) {
            if (zzzdk instanceof zzZDN) {
                zzZ((zzZDN) zzzdk, i + 1, sb);
            }
        }
    }
}
