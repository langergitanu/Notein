package com.aspose.words.internal;

import Oooo0oO.o0Oo0oo;
import com.huawei.hms.network.embedded.C18241k5;
import java.io.IOException;

/* JADX INFO: loaded from: classes5.dex */
public abstract class zzZEL extends zzZEB {
    protected int zzWKg;
    protected zzZEC zzWKh;
    protected zzZR2 zzWKi;
    protected zzZEC zzWKj;
    protected final zzZHE zzWKk;
    protected final boolean zzWKl;
    protected static final String zzWLu = zzZE4.zzXLJ();
    protected static final String zzWLt = zzZE4.zzXLI();

    public zzZEL(zzZEA zzzea, String str, zzZHB zzzhb, boolean z) {
        super(zzzea, str, zzzhb);
        this.zzWKj = zzZEC.zzXLU();
        this.zzWKi = null;
        this.zzWKh = null;
        this.zzWKg = 0;
        this.zzWKl = z;
        this.zzWKk = zzzhb.zzXP6();
    }

    private void zzOU(boolean z) throws zzZQS {
        if (this.zzWK7 && this.zzWK6) {
            this.zzWK6 = false;
            zzOV(true);
        }
        if (this.zzKF != 2) {
            zzZEK.zzxl("No open start element, when trying to write end element");
        }
        zzZEC zzzec = this.zzWKj;
        String prefix = zzzec.getPrefix();
        String localName = zzzec.getLocalName();
        String namespaceURI = zzzec.getNamespaceURI();
        this.zzWKj = zzzec.zzXLT();
        if (this.zzWKg < 8) {
            zzzec.zzZ(this.zzWKh);
            this.zzWKh = zzzec;
            this.zzWKg++;
        }
        if (this.zzWK7) {
            zzYF6 zzyf6 = this.zzWKU;
            if (zzyf6 != null) {
                this.zzWL4 = zzyf6.zzXOx();
            }
            this.zzWK7 = false;
            try {
                zzZHE zzzhe = this.zzWKk;
                if (zzzhe != null) {
                    z = zzzhe.zzXPV();
                }
                if (z) {
                    this.zzWKf.zzXM0();
                    if (this.zzWKj.zzXLS()) {
                        this.zzKF = 3;
                    }
                    zzYF6 zzyf62 = this.zzWKU;
                    if (zzyf62 != null) {
                        this.zzWL4 = zzyf62.zzj(localName, namespaceURI, prefix);
                        return;
                    }
                    return;
                }
                this.zzWKf.zzXM1();
            } catch (IOException e) {
                throw new zzZFU(e);
            }
        }
        try {
            this.zzWKf.zzXA(prefix, localName);
            if (this.zzWKj.zzXLS()) {
                this.zzKF = 3;
            }
            zzYF6 zzyf63 = this.zzWKU;
            if (zzyf63 != null) {
                this.zzWL4 = zzyf63.zzj(localName, namespaceURI, prefix);
            }
        } catch (IOException e2) {
            throw new zzZFU(e2);
        }
    }

    private void zzxo(String str) throws zzZQS {
        this.zzWK8 = true;
        this.zzWK7 = true;
        try {
            this.zzWKf.zzxg(str);
        } catch (IOException e) {
            throw new zzZFU(e);
        }
    }

    @Override // com.aspose.words.internal.zzYFC
    public final String getNamespaceURI(String str) {
        return this.zzWKj.getNamespaceURI(str);
    }

    public final void setPrefix(String str, String str2) throws zzZQS {
        if (str == null) {
            throw new NullPointerException("Can not pass null 'prefix' value");
        }
        if (str.length() == 0) {
            zzxq(str2);
            return;
        }
        if (str2 == null) {
            throw new NullPointerException("Can not pass null 'uri' value");
        }
        if (str.equals(zzWLu)) {
            if (!str2.equals("http://www.w3.org/XML/1998/namespace")) {
                zzZEK.zzH(zzZH9.zzWPo, str2);
            }
        } else if (str.equals(zzWLt)) {
            if (!str2.equals("http://www.w3.org/2000/xmlns/")) {
                zzZEK.zzH(zzZH9.zzWPn, str2);
            }
        } else if (str2.equals("http://www.w3.org/XML/1998/namespace")) {
            zzZEK.zzH(zzZH9.zzWPm, str);
        } else if (str2.equals("http://www.w3.org/2000/xmlns/")) {
            zzZEK.zzH(zzZH9.zzWPl, str);
        }
        if (!this.zzWQ6 && str2.length() == 0) {
            zzZEK.zzxn(zzZH9.zzWPk);
        }
        zzXE(str, str2);
    }

    @Override // com.aspose.words.internal.zzZQQ
    public final void zz0(String str, String str2) throws zzZQS {
        if (!this.zzWK7 && this.zzWKa) {
            zzZEK.zzxl(zzZH9.zzWP0);
        }
        zzM(str, null, null, str2);
    }

    public final void zzM(String str, String str2, String str3, String str4) throws zzZQS {
        if (this.zzWK9) {
            this.zzWKj.zzXy(str2, str);
        }
        zzYF6 zzyf6 = this.zzWKU;
        if (zzyf6 != null) {
            zzyf6.zzP(str, str2, str3, str4);
        }
        try {
            int length = str4.length();
            if (length >= 12) {
                char[] cArrZzXP5 = this.zzWKe;
                if (cArrZzXP5 == null) {
                    cArrZzXP5 = this.zzWM6.zzXP5();
                    this.zzWKe = cArrZzXP5;
                }
                if (length <= cArrZzXP5.length) {
                    str4.getChars(0, length, cArrZzXP5, 0);
                    if (str3 == null || str3.length() <= 0) {
                        this.zzWKf.zzX(str, cArrZzXP5, length);
                        return;
                    } else {
                        this.zzWKf.zzZ(str3, str, cArrZzXP5, length);
                        return;
                    }
                }
            }
            if (str3 == null || str3.length() <= 0) {
                this.zzWKf.zz0(str, str4);
            } else {
                this.zzWKf.zzh(str3, str, str4);
            }
        } catch (IOException e) {
            throw new zzZFU(e);
        }
    }

    @Override // com.aspose.words.internal.zzZQQ
    public final void zzO(String str, String str2, String str3) throws zzZQS {
        zzi(str, str2, str3);
        this.zzWK6 = false;
    }

    @Override // com.aspose.words.internal.zzZEK
    public final void zzOV(boolean z) throws zzZQS {
        this.zzWK7 = false;
        try {
            if (z) {
                this.zzWKf.zzXM0();
            } else {
                this.zzWKf.zzXM1();
            }
            zzYF6 zzyf6 = this.zzWKU;
            if (zzyf6 != null) {
                this.zzWL4 = zzyf6.zzXOx();
            }
            if (z) {
                zzZEC zzzec = this.zzWKj;
                zzZEC zzzecZzXLT = zzzec.zzXLT();
                this.zzWKj = zzzecZzXLT;
                if (zzzecZzXLT.zzXLS()) {
                    this.zzKF = 3;
                }
                zzYF6 zzyf62 = this.zzWKU;
                if (zzyf62 != null) {
                    this.zzWL4 = zzyf62.zzj(zzzec.getLocalName(), zzzec.getNamespaceURI(), zzzec.getPrefix());
                }
                if (this.zzWKg < 8) {
                    zzzec.zzZ(this.zzWKh);
                    this.zzWKh = zzzec;
                    this.zzWKg++;
                }
            }
        } catch (IOException e) {
            throw new zzZFU(e);
        }
    }

    @Override // com.aspose.words.internal.zzZQQ
    public final void zzW1(String str) throws zzZQS {
        zzXH(str, null);
        zzYF6 zzyf6 = this.zzWKU;
        if (zzyf6 != null) {
            zzyf6.zzk(str, "", "");
        }
        this.zzWK6 = false;
        zzZEC zzzec = this.zzWKh;
        if (zzzec != null) {
            this.zzWKh = zzzec.zzZ(this.zzWKj, str);
            this.zzWKg--;
            this.zzWKj = zzzec;
        } else {
            this.zzWKj = this.zzWKj.zzx6(str);
        }
        zzxo(str);
    }

    public abstract void zzXE(String str, String str2) throws zzZQS;

    public final void zzXF(String str, String str2) throws zzZQS {
        this.zzWK8 = true;
        this.zzWK7 = true;
        if (str != null) {
            try {
                if (str.length() > 0) {
                    this.zzWKf.zzXB(str, str2);
                    return;
                }
            } catch (IOException e) {
                throw new zzZFU(e);
            }
        }
        this.zzWKf.zzxg(str2);
    }

    public final void zzXG(String str, String str2) throws zzZQS {
        try {
            int length = str2.length();
            if (length >= 12) {
                char[] cArrZzXP5 = this.zzWKe;
                if (cArrZzXP5 == null) {
                    cArrZzXP5 = this.zzWM6.zzXP5();
                    this.zzWKe = cArrZzXP5;
                }
                if (length <= cArrZzXP5.length) {
                    str2.getChars(0, length, cArrZzXP5, 0);
                    this.zzWKf.zzZ("xmlns", str, cArrZzXP5, length);
                    return;
                }
            }
            this.zzWKf.zzh("xmlns", str, str2);
        } catch (IOException e) {
            throw new zzZFU(e);
        }
    }

    public final void zzXH(String str, String str2) throws zzZQS {
        if (this.zzWK7) {
            zzOV(this.zzWK6);
            return;
        }
        int i = this.zzKF;
        if (i == 1) {
            zzXD(str, str2);
            return;
        }
        if (i == 3) {
            if (this.zzWKa) {
                if (str2 != null && str2.length() != 0) {
                    str = o0Oo0oo.OooO0Oo(str2, C18241k5.f55433h, str);
                }
                zzZEK.zzG(zzZH9.zzWP3, str);
            }
            this.zzKF = 2;
        }
    }

    @Override // com.aspose.words.internal.zzZEK
    public final String zzXMs() {
        return this.zzWKj.zzXLR();
    }

    @Override // com.aspose.words.internal.zzYFO, com.aspose.words.internal.zzYFV
    public final void zzf6() throws zzZQS {
        zzOU(false);
    }

    public abstract void zzi(String str, String str2, String str3) throws zzZQS;

    @Override // com.aspose.words.internal.zzZEK, com.aspose.words.internal.zzZQQ
    public final void zzle() throws zzZQS {
        zzOU(this.zzWKb);
    }

    public final void zzxp(String str) throws zzZQS {
        int length;
        if (str == null) {
            length = 0;
        } else {
            try {
                length = str.length();
            } catch (IOException e) {
                throw new zzZFU(e);
            }
        }
        if (length >= 12) {
            char[] cArrZzXP5 = this.zzWKe;
            if (cArrZzXP5 == null) {
                cArrZzXP5 = this.zzWM6.zzXP5();
                this.zzWKe = cArrZzXP5;
            }
            if (length <= cArrZzXP5.length) {
                str.getChars(0, length, cArrZzXP5, 0);
                this.zzWKf.zzX("xmlns", cArrZzXP5, length);
                return;
            }
        }
        this.zzWKf.zz0("xmlns", str);
    }

    public abstract void zzxq(String str) throws zzZQS;
}
