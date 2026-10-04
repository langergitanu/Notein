package com.aspose.words;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
final class zzY5C {
    private byte[] zzP;
    private zzYL9 zzX2O;
    private int zzX2P;
    private zzYLC zzZAl;
    private IWarningCallback zzZG0;
    private com.aspose.words.internal.zzG zzbp;
    private ArrayList<com.aspose.words.internal.zzZG> zzZ3E = new ArrayList<>();
    private com.aspose.words.internal.zzZQ4 zzG8 = com.aspose.words.internal.zzZQ4.zz2T;

    public zzY5C(IWarningCallback iWarningCallback) {
        this.zzZG0 = iWarningCallback;
    }

    private com.aspose.words.internal.zzG zzXVd() {
        com.aspose.words.internal.zzG zzg = new com.aspose.words.internal.zzG();
        zzg.zzX(new com.aspose.words.internal.zzZP(com.aspose.words.internal.zzZPY.zzG(this.zzG8.zzZm(), this.zzG8.zzZo()), com.aspose.words.internal.zzZPW.zzG(this.zzG8.getWidth(), this.zzG8.getHeight()), this.zzP));
        return zzg;
    }

    private com.aspose.words.internal.zzG zzXVe() {
        com.aspose.words.internal.zzG zzg = new com.aspose.words.internal.zzG();
        zzg.zzZ(this.zzZ3E);
        return zzg;
    }

    private com.aspose.words.internal.zzG zzXVf() {
        int i = this.zzX2P;
        if (i != 0) {
            if (i == 1) {
                return zzXVd();
            }
            if (i != 2) {
                if (i == 3) {
                    return this.zzbp;
                }
                throw new IllegalArgumentException("Specified argument was out of the range of valid values.\r\nParameter name: WhatToWrap");
            }
        }
        return zzXVe();
    }

    private com.aspose.words.internal.zzZQ4 zzXVg() throws Exception {
        return new com.aspose.words.internal.zzH().zzZ((com.aspose.words.internal.zzZL) zzXVf());
    }

    private void zzXVh() {
        this.zzX2O = new zzYL9(new zzYLC(this.zzG8));
    }

    private void zzXVi() throws Exception {
        this.zzX2O = zzX1.zzX(this.zzbp, this.zzG8);
    }

    private void zzXVj() {
        this.zzX2O = new zzYL9(new zzYLC(new long[]{com.aspose.words.internal.zzZPY.zzG(this.zzG8.zzZm(), this.zzG8.zzZo()), com.aspose.words.internal.zzZPY.zzG(this.zzG8.zzkw(), this.zzG8.zzZo()), com.aspose.words.internal.zzZPY.zzG(this.zzG8.zzkw(), this.zzG8.zzZn()), com.aspose.words.internal.zzZPY.zzG(this.zzG8.zzZm(), this.zzG8.zzZn())}));
    }

    private void zzXVk() throws Exception {
        if (this.zzZ3E.size() != 0) {
            zzXVl();
            zzYL9 zzyl9 = this.zzX2O;
            if (zzyl9 != null && zzyl9.zzYna() != 0) {
                return;
            }
        }
        zzYL9 zzyl9ZzZ = zzZ8E.zzZ(this.zzP, this.zzG8);
        this.zzX2O = zzyl9ZzZ;
        if (zzyl9ZzZ.zzYna() == 0) {
            zzXVj();
        }
    }

    private void zzXVl() throws Exception {
        Iterator<com.aspose.words.internal.zzZG> it = this.zzZ3E.iterator();
        while (it.hasNext()) {
            zzYL9 zzyl9Zzr = zzYM8.zzr(it.next());
            zzYL9 zzyl9 = this.zzX2O;
            if (zzyl9 == null) {
                this.zzX2O = new zzYL9(zzyl9Zzr);
            } else {
                zzyl9.zzV(zzyl9Zzr);
            }
        }
    }

    private void zzXVm() throws Exception {
        try {
            int i = this.zzX2P;
            if (i == 0) {
                zzXVl();
            } else if (i == 1) {
                zzXVk();
            } else if (i == 2) {
                zzXVl();
            } else if (i == 3) {
                zzXVi();
            } else {
                if (i != 4) {
                    throw new IllegalArgumentException("Specified argument was out of the range of valid values.\r\nParameter name: WhatToWrap");
                }
                zzXVh();
            }
            if (this.zzX2O == null) {
                this.zzX2O = new zzYL9();
            }
            zzYLC zzylcZzX = zzYLA.zzX(this.zzX2O);
            this.zzZAl = zzylcZzX;
            if (this.zzP == null) {
                zzYLB.zzW(zzylcZzX);
            }
        } catch (Exception unused) {
            this.zzZAl = new zzYLC(zzXVg());
            IWarningCallback iWarningCallback = this.zzZG0;
            if (iWarningCallback != null) {
                OooO00o.OooO0O0(iWarningCallback, 65536, 4, "Tight wrapping error. Using square instead.");
            }
        }
    }

    private void zzl(com.aspose.words.internal.zzZG zzzg) {
        com.aspose.words.internal.zzZQG.zzZ(this.zzZ3E, zzzg);
    }

    public final zzYLC zz6L() throws Exception {
        if (this.zzZAl == null) {
            zzXVm();
        }
        return this.zzZAl;
    }

    public final void zzS(com.aspose.words.internal.zzG zzg, com.aspose.words.internal.zzZQ4 zzzq4) {
        if (zzg == null) {
            throw new NullPointerException("Value cannot be null.\r\nParameter name: canvas");
        }
        this.zzZ3E.clear();
        this.zzP = null;
        this.zzX2P = 3;
        this.zzbp = zzg;
        this.zzG8 = zzzq4;
    }

    public final boolean zzXVn() {
        return (this.zzZ3E.size() <= 0 && this.zzP == null && this.zzbp == null && this.zzG8.isEmpty()) ? false : true;
    }

    public final void zzY(byte[] bArr, com.aspose.words.internal.zzZQ4 zzzq4) {
        if (bArr == null) {
            throw new NullPointerException("Value cannot be null.\r\nParameter name: imageBytes");
        }
        if (zzzq4.isEmpty()) {
            throw new NullPointerException("Value cannot be null.\r\nParameter name: imageBounds");
        }
        this.zzX2P = 1;
        this.zzP = bArr;
        this.zzG8 = zzzq4;
    }

    public final void zzYY(com.aspose.words.internal.zzZQ4 zzzq4) {
        this.zzZ3E.clear();
        this.zzP = null;
        this.zzbp = null;
        this.zzX2P = 4;
        this.zzG8 = zzzq4;
    }

    public final void zzm(com.aspose.words.internal.zzZG zzzg) {
        if (zzzg == null) {
            throw new NullPointerException("Value cannot be null.\r\nParameter name: path");
        }
        if (this.zzX2P != 2) {
            this.zzZ3E.clear();
            this.zzP = null;
            this.zzX2P = 2;
        }
        zzl(zzzg);
    }

    public final void zzn(com.aspose.words.internal.zzZG zzzg) {
        if (zzzg == null) {
            throw new NullPointerException("Value cannot be null.\r\nParameter name: path");
        }
        if (this.zzX2P != 0) {
            this.zzZ3E.clear();
            this.zzP = null;
            this.zzX2P = 0;
        }
        zzl(zzzg);
    }
}
