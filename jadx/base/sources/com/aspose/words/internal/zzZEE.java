package com.aspose.words.internal;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZEE extends zzZEL {
    protected HashMap<String, String> zzWJM;
    protected String zzWJN;
    protected int[] zzWJO;
    protected final String zzWJP;

    public zzZEE(zzZEA zzzea, String str, zzZHB zzzhb) {
        super(zzzea, str, zzzhb, true);
        this.zzWJO = null;
        this.zzWJN = null;
        this.zzWJM = null;
        this.zzWJP = zzzhb.zzXPb();
    }

    private static String zzX(String str, String str2, zzZEC zzzec) throws zzZQS {
        if (str2 != null && str2.length() != 0) {
            if (zzzec.zzI(str, str2, true) == 1) {
                return str;
            }
            return null;
        }
        String strZzXLV = zzzec.zzXLV();
        if (strZzXLV == null || strZzXLV.length() == 0) {
            return "";
        }
        return null;
    }

    private String zzZ(String str, String str2, zzZEC zzzec) throws zzZQS {
        if (str2 == null || str2.length() == 0) {
            return "";
        }
        if (str != null) {
            return str;
        }
        String str3 = this.zzWJN;
        if (str3 != null && str3.equals(str2)) {
            return "";
        }
        HashMap<String, String> map = this.zzWJM;
        String str4 = map == null ? null : map.get(str2);
        if (str4 != null) {
            return str4;
        }
        if (this.zzWJO == null) {
            this.zzWJO = new int[]{1};
        }
        return zzzec.zzZ(this.zzWJP, str2, this.zzWJO);
    }

    @Override // com.aspose.words.internal.zzZQQ
    public final void zzW0(String str) throws zzZQS {
        if (!this.zzWK7) {
            zzZEK.zzxn("Trying to write a namespace declaration when there is no open start element.");
        }
        String prefix = this.zzWKj.getPrefix();
        if (prefix == null || prefix.length() <= 0) {
            return;
        }
        this.zzWKj.zzx5(str);
        zzxp(str);
    }

    @Override // com.aspose.words.internal.zzZEL
    public final void zzXE(String str, String str2) throws zzZQS {
        if (str2 != null && str2.length() != 0) {
            if (this.zzWJM == null) {
                this.zzWJM = new HashMap<>(16);
            }
            this.zzWJM.put(str2, str);
            return;
        }
        HashMap<String, String> map = this.zzWJM;
        if (map != null) {
            Iterator<Map.Entry<String, String>> it = map.entrySet().iterator();
            while (it.hasNext()) {
                if (it.next().getValue().equals(str)) {
                    it.remove();
                }
            }
        }
    }

    @Override // com.aspose.words.internal.zzZQQ
    public final void zzY(String str, String str2, String str3, String str4) throws zzZQS {
        if (!this.zzWK7) {
            zzZEK.zzxn(zzZH9.zzWP0);
        }
        zzM(str3, str2, zzY(str, str2, this.zzWKj), str4);
    }

    @Override // com.aspose.words.internal.zzZQQ
    public final void zzZZ(String str, String str2) throws zzZQS {
        if (str == null || str.length() == 0) {
            zzW0(str2);
            return;
        }
        if (!this.zzWK7) {
            zzZEK.zzxn("Trying to write a namespace declaration when there is no open start element.");
        }
        if (this.zzWKj.zzI(str, str2, true) == 0) {
            this.zzWKj.zzXz(str, str2);
            zzXG(str, str2);
        }
    }

    @Override // com.aspose.words.internal.zzZEL
    public final void zzi(String str, String str2, String str3) throws zzZQS {
        zzXH(str2, str);
        String strZzX = zzX(str, str3, this.zzWKj);
        if (strZzX != null) {
            zzYF6 zzyf6 = this.zzWKU;
            if (zzyf6 != null) {
                zzyf6.zzk(str2, str3, strZzX);
            }
            zzZEC zzzec = this.zzWKh;
            if (zzzec != null) {
                this.zzWKh = zzzec.zzY(this.zzWKj, strZzX, str2, str3);
                this.zzWKg--;
                this.zzWKj = zzzec;
            } else {
                this.zzWKj = this.zzWKj.zzg(strZzX, str2, str3);
            }
            zzXF(strZzX, str2);
            return;
        }
        if (str == null) {
            str = "";
        }
        String strZzZ = zzZ(str, str3, this.zzWKj);
        zzYF6 zzyf62 = this.zzWKU;
        if (zzyf62 != null) {
            zzyf62.zzk(str2, str3, strZzZ);
        }
        zzZEC zzzec2 = this.zzWKh;
        if (zzzec2 != null) {
            this.zzWKh = zzzec2.zzY(this.zzWKj, strZzZ, str2, str3);
            this.zzWKg--;
            this.zzWKj = zzzec2;
        } else {
            this.zzWKj = this.zzWKj.zzg(strZzZ, str2, str3);
        }
        this.zzWKj.setPrefix(strZzZ);
        zzXF(strZzZ, str2);
        if (strZzZ == null || strZzZ.length() == 0) {
            this.zzWKj.zzx5(str3);
            zzxp(str3);
        } else {
            this.zzWKj.zzXz(strZzZ, str3);
            zzXG(strZzZ, str3);
        }
    }

    @Override // com.aspose.words.internal.zzZEL
    public final void zzxq(String str) throws zzZQS {
        if (str == null || str.length() == 0) {
            str = null;
        }
        this.zzWJN = str;
    }

    private String zzY(String str, String str2, zzZEC zzzec) throws zzZQS {
        String strZzZ = null;
        if (str2 != null && str2.length() != 0) {
            if (str != null) {
                int iZzI = zzzec.zzI(str, str2, false);
                if (iZzI == 1) {
                    return str;
                }
                if (iZzI == 0) {
                    zzzec.zzXz(str, str2);
                    zzXG(str, str2);
                    return str;
                }
            }
            String strZzx7 = zzzec.zzx7(str2);
            if (strZzx7 != null) {
                return strZzx7;
            }
            if (str == null) {
                HashMap<String, String> map = this.zzWJM;
                str = map != null ? map.get(str2) : strZzx7;
            }
            if (str == null || (str.length() != 0 && zzzec.getNamespaceURI(str) == null)) {
                strZzZ = str;
            }
            if (strZzZ == null) {
                if (this.zzWJO == null) {
                    this.zzWJO = new int[]{1};
                }
                strZzZ = this.zzWKj.zzZ(this.zzWJP, str2, this.zzWJO);
            }
            zzzec.zzXz(strZzZ, str2);
            zzXG(strZzZ, str2);
        }
        return strZzZ;
    }
}
