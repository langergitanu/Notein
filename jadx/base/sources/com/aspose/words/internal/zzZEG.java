package com.aspose.words.internal;

import java.io.IOException;
import java.util.TreeSet;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZEG extends zzZEB {
    TreeSet<String> zzWJS;
    final zzZDW zzWJT;

    public zzZEG(zzZEA zzzea, String str, zzZHB zzzhb) {
        super(zzzea, str, zzzhb);
        this.zzWJT = new zzZDW(32);
    }

    private void zzOS(boolean z) throws zzZQS {
        if (this.zzWK7 && this.zzWK6) {
            this.zzWK6 = false;
            zzOV(true);
        }
        if (this.zzKF != 2) {
            zzZEK.zzxl("No open start element, when trying to write end element");
        }
        String strZzXLy = this.zzWJT.zzXLy();
        if (this.zzWK7) {
            zzYF6 zzyf6 = this.zzWKU;
            if (zzyf6 != null) {
                this.zzWL4 = zzyf6.zzXOx();
            }
            this.zzWK7 = false;
            TreeSet<String> treeSet = this.zzWJS;
            if (treeSet != null) {
                treeSet.clear();
            }
            try {
                if (z) {
                    this.zzWKf.zzXM0();
                    if (this.zzWJT.isEmpty()) {
                        this.zzKF = 3;
                    }
                    zzYF6 zzyf62 = this.zzWKU;
                    if (zzyf62 != null) {
                        this.zzWL4 = zzyf62.zzj(strZzXLy, "", "");
                        return;
                    }
                    return;
                }
                this.zzWKf.zzXM1();
            } catch (IOException e) {
                zzZEK.zzX(e);
            }
        }
        try {
            this.zzWKf.zzxf(strZzXLy);
        } catch (IOException e2) {
            zzZEK.zzX(e2);
        }
        if (this.zzWJT.isEmpty()) {
            this.zzKF = 3;
        }
        zzYF6 zzyf63 = this.zzWKU;
        if (zzyf63 != null) {
            this.zzWL4 = zzyf63.zzj(strZzXLy, "", "");
        }
    }

    private void zzx8(String str) throws zzZQS {
        this.zzWK8 = true;
        if (this.zzWK7) {
            zzOV(this.zzWK6);
        } else {
            int i = this.zzKF;
            if (i == 1) {
                zzXD(str, null);
            } else if (i == 3) {
                if (this.zzWKa) {
                    zzZEK.zzG(zzZH9.zzWP3, str);
                }
                this.zzKF = 2;
            }
        }
        zzYF6 zzyf6 = this.zzWKU;
        if (zzyf6 != null) {
            zzyf6.zzk(str, "", "");
        }
        this.zzWK7 = true;
        this.zzWJT.zzB1(str);
        try {
            this.zzWKf.zzxg(str);
        } catch (IOException e) {
            zzZEK.zzX(e);
        }
    }

    @Override // com.aspose.words.internal.zzYFC
    public final String getNamespaceURI(String str) {
        return null;
    }

    @Override // com.aspose.words.internal.zzZQQ
    public final void zz0(String str, String str2) throws zzZQS {
        if (!this.zzWK7 && this.zzWKa) {
            zzZEK.zzxl(zzZH9.zzWP0);
        }
        if (this.zzWK9) {
            if (this.zzWJS == null) {
                this.zzWJS = new TreeSet<>();
            }
            if (!this.zzWJS.add(str)) {
                zzZEK.zzxk("Trying to write attribute '" + str + "' twice");
            }
        }
        zzYF6 zzyf6 = this.zzWKU;
        if (zzyf6 != null) {
            zzyf6.zzP(str, "", "", str2);
        }
        try {
            this.zzWKf.zz0(str, str2);
        } catch (IOException e) {
            zzZEK.zzX(e);
        }
    }

    @Override // com.aspose.words.internal.zzZQQ
    public final void zzO(String str, String str2, String str3) throws zzZQS {
        zzW1(str2);
    }

    @Override // com.aspose.words.internal.zzZEK
    public final void zzOV(boolean z) throws zzZQS {
        this.zzWK7 = false;
        TreeSet<String> treeSet = this.zzWJS;
        if (treeSet != null) {
            treeSet.clear();
        }
        try {
            if (z) {
                this.zzWKf.zzXM0();
            } else {
                this.zzWKf.zzXM1();
            }
        } catch (IOException e) {
            zzZEK.zzX(e);
        }
        zzYF6 zzyf6 = this.zzWKU;
        if (zzyf6 != null) {
            this.zzWL4 = zzyf6.zzXOx();
        }
        if (z) {
            String strZzXLy = this.zzWJT.zzXLy();
            if (this.zzWJT.isEmpty()) {
                this.zzKF = 3;
            }
            zzYF6 zzyf62 = this.zzWKU;
            if (zzyf62 != null) {
                this.zzWL4 = zzyf62.zzj(strZzXLy, "", "");
            }
        }
    }

    @Override // com.aspose.words.internal.zzZQQ
    public final void zzW0(String str) throws zzZQS {
        zzZEK.zzxm("Can not call writeDefaultNamespace namespaces with non-namespace writer.");
    }

    @Override // com.aspose.words.internal.zzZQQ
    public final void zzW1(String str) throws zzZQS {
        zzx8(str);
        this.zzWK6 = false;
    }

    @Override // com.aspose.words.internal.zzZEK
    public final String zzXMs() {
        return this.zzWJT.isEmpty() ? "#root" : this.zzWJT.zzXLA();
    }

    @Override // com.aspose.words.internal.zzZQQ
    public final void zzY(String str, String str2, String str3, String str4) throws zzZQS {
        zz0(str3, str4);
    }

    @Override // com.aspose.words.internal.zzZQQ
    public final void zzZZ(String str, String str2) throws zzZQS {
        zzZEK.zzxm("Can not set write namespaces with non-namespace writer.");
    }

    @Override // com.aspose.words.internal.zzYFO, com.aspose.words.internal.zzYFV
    public final void zzf6() throws zzZQS {
        zzOS(false);
    }

    @Override // com.aspose.words.internal.zzZEK, com.aspose.words.internal.zzZQQ
    public final void zzle() throws zzZQS {
        zzOS(this.zzWKb);
    }
}
