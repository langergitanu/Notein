package com.aspose.words.internal;

import Oooo0oO.C21023OooO0Oo;
import Oooo0oO.o0Oo0oo;
import com.huawei.hms.network.embedded.C18241k5;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZEW implements zzYFC, zzZR2 {
    protected zzZEX zzWKW;
    protected zzZEU zzWKZ;
    protected final zzZEZ zzWLh;
    protected final zzZHC zzWML;
    protected final boolean zzWOV;
    protected zzZEV zzWL0 = null;
    protected int zz3 = 0;
    protected long zzWKY = 0;
    protected final zzZDW zzWKX = new zzZDW(64);
    protected boolean zzWKV = false;
    protected zzYF6 zzWKU = null;
    protected int zzWNQ = -1;
    protected String zzWKT = null;
    protected String zzWKS = null;
    protected String zzWKR = null;
    protected zzZR1 zzWKQ = null;
    protected zzZE7 zzWKP = null;
    protected zzZEX zzWKO = null;

    public zzZEW(zzZHC zzzhc, boolean z) {
        this.zzWML = zzzhc;
        this.zzWOV = z;
        this.zzWLh = new zzZEZ(zzzhc, z);
    }

    private static void zzUN(int i, int i2) {
        StringBuilder sb = new StringBuilder("Illegal namespace index ");
        sb.append(i >> 1);
        sb.append("; current scope only has ");
        throw new IllegalArgumentException(C21023OooO0Oo.OooO0OO(" namespace declarations.", i2 >> 1, sb));
    }

    private zzYF6 zzZ(zzYF6 zzyf6) {
        zzYF6 zzyf62 = this.zzWKU;
        if (zzyf62 == null) {
            this.zzWKU = zzyf6;
            return zzyf6;
        }
        this.zzWKU = new zzYFA(zzyf62, zzyf6);
        return zzyf6;
    }

    public final int getDepth() {
        return this.zz3;
    }

    public final String getLocalName() {
        if (this.zz3 != 0) {
            return this.zzWKW.zzZnu;
        }
        throw new IllegalStateException("Illegal access, empty stack.");
    }

    @Override // com.aspose.words.internal.zzYFC
    public final String getNamespaceURI(String str) {
        if (str != null) {
            return str.length() == 0 ? this.zz3 == 0 ? "" : this.zzWKW.zzWNf : str.equals("xml") ? "http://www.w3.org/XML/1998/namespace" : str.equals("xmlns") ? "http://www.w3.org/2000/xmlns/" : this.zzWKX.zzwW(str);
        }
        throw new IllegalArgumentException(zzZH9.zzWPJ);
    }

    @Override // com.aspose.words.internal.zzZR2
    public final String getPrefix(String str) {
        if (str == null || str.length() == 0) {
            throw new IllegalArgumentException("Illegal to pass null/empty prefix as argument.");
        }
        if (str.equals("http://www.w3.org/XML/1998/namespace")) {
            return "xml";
        }
        if (str.equals("http://www.w3.org/2000/xmlns/")) {
            return "xmlns";
        }
        String[] strArrZzXLz = this.zzWKX.zzXLz();
        int size = this.zzWKX.size();
        for (int i = size - 1; i > 0; i -= 2) {
            if (str.equals(strArrZzXLz[i])) {
                String str2 = strArrZzXLz[i - 1];
                for (int i2 = i + 1; i2 < size; i2 += 2) {
                    if (strArrZzXLz[i2] == str2) {
                        break;
                    }
                }
                return str2 == null ? "" : str2;
            }
        }
        return null;
    }

    public final boolean isEmpty() {
        return this.zz3 == 0;
    }

    @Override // com.aspose.words.internal.zzYFC
    public final int zzN(String str, String str2, String str3, String str4) throws zzZQS {
        return this.zzWLh.zzN(str, str2, str3, str4);
    }

    public final boolean zzXJ(String str, String str2) {
        if (this.zz3 == 0) {
            throw new IllegalStateException("Illegal access, empty stack.");
        }
        String str3 = this.zzWKW.zzZpC;
        if (str == null || str.length() == 0) {
            if (str3 != null && str3.length() > 0) {
                return false;
            }
        } else if (str3 != str && !str3.equals(str)) {
            return false;
        }
        String str4 = this.zzWKW.zzZnu;
        return str4 == str2 || str4.equals(str2);
    }

    public final void zzXK(String str, String str2) {
        if (str2 == null || str2.length() == 0) {
            str2 = null;
        }
        if (str == null || str.length() == 0) {
            this.zzWKW.zzWNf = str2;
            str = null;
        }
        this.zzWKX.zzXt(str, str2);
    }

    public final void zzXL(String str, String str2) throws zzZQS {
        int i = this.zz3 + 1;
        this.zz3 = i;
        if (i > this.zzWML.zzXPC()) {
            throw new zzZQS("Maximum Element Depth limit (" + this.zzWML.zzXPC() + ") Exceeded");
        }
        long j = this.zzWKY + 1;
        this.zzWKY = j;
        if (j > this.zzWML.zzXPB()) {
            throw new zzZQS("Maximum Element Count limit (" + this.zzWML.zzXPB() + ") Exceeded");
        }
        zzZEX zzzex = this.zzWKW;
        String str3 = zzzex == null ? "" : zzzex.zzWNf;
        if (zzzex != null) {
            zzzex.zzWL1++;
            int iZzXPD = this.zzWML.zzXPD();
            if (iZzXPD > 0 && this.zzWKW.zzWL1 > iZzXPD) {
                throw new zzZQS(o0Oo0oo.OooO0O0(iZzXPD, "Maximum Number of Child Elements limit (", ") Exceeded"));
            }
        }
        zzZEX zzzex2 = this.zzWKO;
        if (zzzex2 == null) {
            this.zzWKW = new zzZEX(this.zzWKW, this.zzWKX.size(), str, str2);
        } else {
            this.zzWKO = zzzex2.zzWL2;
            zzzex2.zzZ(this.zzWKW, this.zzWKX.size(), str, str2);
            this.zzWKW = zzzex2;
        }
        this.zzWKW.zzWNf = str3;
        this.zzWLh.reset();
        zzZEU zzzeu = this.zzWKZ;
        if (zzzeu != null) {
            this.zzWKV = zzzeu.zzXR(str, str2);
        }
    }

    public final int zzXMr() {
        return (this.zzWKX.size() - this.zzWKW.zzWL3) >> 1;
    }

    public final String zzXMs() {
        if (this.zz3 == 0) {
            throw new IllegalStateException("Illegal access, empty stack.");
        }
        zzZEX zzzex = this.zzWKW;
        String str = zzzex.zzZnu;
        String str2 = zzzex.zzZpC;
        return str2 == null ? str : o0Oo0oo.OooO0Oo(str2, C18241k5.f55433h, str);
    }

    public final String zzXMt() {
        if (this.zz3 != 0) {
            return this.zzWKW.zzWLK;
        }
        throw new IllegalStateException("Illegal access, empty stack.");
    }

    @Override // com.aspose.words.internal.zzYFC
    public final zzZQY zzXMu() {
        return this.zzWL0.zzlj();
    }

    public final int zzXMv() throws zzZQS {
        zzYF6 zzyf6 = this.zzWKU;
        if (zzyf6 == null) {
            return 4;
        }
        zzZEX zzzex = this.zzWKW;
        int iZzj = zzyf6.zzj(zzzex.zzZnu, zzzex.zzWLK, zzzex.zzZpC);
        if (this.zz3 == 1) {
            this.zzWKU.zzP7(true);
        }
        return iZzj;
    }

    public final int zzXMw() throws zzZQS {
        if (this.zz3 == 0) {
            throw new IllegalStateException("Calling validate() on empty stack.");
        }
        zzZEZ zzzez = this.zzWLh;
        int iZzXN3 = zzzez.zzXN3();
        String strZzwX = "http://www.w3.org/XML/1998/namespace";
        if (iZzXN3 > 0) {
            this.zzWKP = null;
            boolean zZzXPN = this.zzWML.zzXPN();
            for (int i = 0; i < iZzXN3; i++) {
                zzZF0 zzzf0ZzYV = zzzez.zzYV(i, zZzXPN);
                String str = zzzf0ZzYV.zzWLK;
                String str2 = zzzf0ZzYV.zzZnu;
                if (str2 == "xmlns") {
                    this.zzWL0.zzxJ(zzZH9.zzWPn);
                } else if (str2 != "xml") {
                    if (str == null || str.length() == 0) {
                        str = "";
                    }
                    if (str2 == null) {
                        this.zzWKW.zzWNf = str;
                    }
                    if (zZzXPN) {
                        if (str == "http://www.w3.org/XML/1998/namespace") {
                            this.zzWL0.zzV(zzZH9.zzWPm, str2, null);
                        } else if (str == "http://www.w3.org/2000/xmlns/") {
                            this.zzWL0.zzxJ(zzZH9.zzWPl);
                        }
                    } else if (str.equals("http://www.w3.org/XML/1998/namespace")) {
                        this.zzWL0.zzV(zzZH9.zzWPm, str2, null);
                    } else if (str.equals("http://www.w3.org/2000/xmlns/")) {
                        this.zzWL0.zzxJ(zzZH9.zzWPl);
                    }
                    this.zzWKX.zzXt(str2, str);
                } else if (!str.equals("http://www.w3.org/XML/1998/namespace")) {
                    this.zzWL0.zzV(zzZH9.zzWPo, str, null);
                }
            }
        }
        if (this.zzWKV) {
            this.zzWKZ.zzZ(this);
        }
        zzZEX zzzex = this.zzWKW;
        String str3 = zzzex.zzZpC;
        if (str3 == null) {
            strZzwX = zzzex.zzWNf;
        } else if (str3 != "xml" && ((strZzwX = this.zzWKX.zzwX(str3)) == null || strZzwX.length() == 0)) {
            this.zzWL0.zzV(zzZH9.zzWPq, str3, null);
        }
        this.zzWKW.zzWLK = strZzwX;
        int iZzZ = zzzez.zzZ(this.zzWL0, this.zzWKX);
        this.zzWNQ = iZzZ;
        zzYF6 zzyf6 = this.zzWKU;
        if (zzyf6 == null) {
            if (iZzZ < 0) {
                return 4;
            }
            zzzez.zzgF(iZzZ);
            return 4;
        }
        zzZEX zzzex2 = this.zzWKW;
        zzyf6.zzk(zzzex2.zzZnu, zzzex2.zzWLK, zzzex2.zzZpC);
        int count = zzzez.getCount();
        if (count > 0) {
            for (int i2 = 0; i2 < count; i2++) {
                zzzez.zzZ(i2, this.zzWKU);
            }
        }
        return this.zzWKU.zzXOx();
    }

    public final boolean zzXMx() throws zzZQS {
        zzZEX zzzex = this.zzWKW;
        if (zzzex == null) {
            throw new IllegalStateException("Popping from empty stack");
        }
        this.zz3--;
        zzZEX zzzex2 = zzzex.zzWL2;
        this.zzWKW = zzzex2;
        zzzex.zzZ(this.zzWKO);
        this.zzWKO = zzzex;
        int size = this.zzWKX.size() - zzzex.zzWL3;
        if (size > 0) {
            this.zzWKP = null;
            this.zzWKX.zzgg(size);
        }
        return zzzex2 != null;
    }

    public final zzZEZ zzXMy() {
        return this.zzWLh;
    }

    public final boolean zzXOz() {
        zzYF6 zzyf6 = this.zzWKU;
        if (zzyf6 == null) {
            return false;
        }
        if (zzyf6 instanceof zzZGJ) {
            return ((zzZGJ) zzyf6).zzXOz();
        }
        return true;
    }

    public final void zzY(zzZEV zzzev) {
        this.zzWL0 = zzzev;
    }

    public final String zzgt(int i) {
        int i2 = this.zzWKW.zzWL3;
        int size = this.zzWKX.size() - i2;
        int i3 = i << 1;
        if (i3 < 0 || i3 >= size) {
            zzUN(i3 >> 1, size >> 1);
        }
        return this.zzWKX.getString(i2 + i3 + 1);
    }

    public final String zzgu(int i) {
        int i2 = this.zzWKW.zzWL3;
        int size = this.zzWKX.size() - i2;
        int i3 = i << 1;
        if (i3 < 0 || i3 >= size) {
            zzUN(i3 >> 1, size >> 1);
        }
        return this.zzWKX.getString(i2 + i3);
    }

    public final boolean zzxK(String str) {
        if (str != null && str.length() == 0) {
            str = null;
        }
        int size = this.zzWKX.size();
        for (int i = this.zzWKW.zzWL3; i < size; i += 2) {
            if (this.zzWKX.getString(i) == str) {
                return true;
            }
        }
        return false;
    }

    @Override // com.aspose.words.internal.zzYFC
    public final void zzY(zzYF8 zzyf8) throws zzZQS {
        this.zzWL0.zzX(zzyf8);
    }

    public final void zzZ(zzYF6 zzyf6, zzZEU zzzeu) {
        this.zzWKZ = zzzeu;
        zzZ(zzyf6);
    }

    public final String getPrefix() {
        if (this.zz3 != 0) {
            return this.zzWKW.zzZpC;
        }
        throw new IllegalStateException("Illegal access, empty stack.");
    }
}
