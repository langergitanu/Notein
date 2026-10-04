package com.aspose.words;

import com.huawei.hms.support.api.entity.common.CommonConstant;

/* JADX INFO: loaded from: classes6.dex */
final class zzYXJ implements zzZAS {
    private String mName;
    private zzZIF zzXXm;
    private zzYXJ zzXXn;
    private int zzYZy;
    private com.aspose.words.internal.zzZYT<String> zzYtv;

    public zzYXJ(String str) {
        this(str, null);
    }

    public static zzYXJ zzHI(String str) {
        return new zzYXJ(str);
    }

    public static zzYXJ zzZ(String str, zzYXJ zzyxj) {
        return new zzYXJ(str, zzyxj);
    }

    @Override // com.aspose.words.zzZBM
    public final String getAttributeValue(String str, String str2) {
        return this.zzYtv.containsKey(str) ? this.zzYtv.get(str) : str2;
    }

    @Override // com.aspose.words.zzZBM
    public final String getLanguage() {
        zzYXJ zzyxj = this;
        do {
            String str = (String) com.aspose.words.internal.zzQW.zzZ((com.aspose.words.internal.zzZYT) zzyxj.zzYtv, CommonConstant.ReqAccessTokenParam.LANGUAGE_LABEL);
            if (str != null) {
                return str;
            }
            zzyxj = zzyxj.zzXXn;
        } while (zzyxj != null);
        return "";
    }

    @Override // com.aspose.words.zzZBM
    public final boolean isImplicit() {
        return false;
    }

    @Override // com.aspose.words.zzZBM
    public final String zzKM(String str) {
        return (String) com.aspose.words.internal.zzQW.zzZ((com.aspose.words.internal.zzZYT) this.zzYtv, str);
    }

    public final zzYXJ zzYE(String str, String str2) {
        this.zzYtv.zzB(str, str2);
        return this;
    }

    @Override // com.aspose.words.zzZBM
    public final String zzZ2F() {
        return "";
    }

    @Override // com.aspose.words.zzZBM
    public final String zzZ2G() {
        return "http://www.w3.org/1999/xhtml";
    }

    @Override // com.aspose.words.zzZAS
    public final boolean zzZ2H() {
        return false;
    }

    @Override // com.aspose.words.zzZAS
    public final boolean zzZ2I() {
        return false;
    }

    @Override // com.aspose.words.zzZAS
    public final boolean zzZ2J() {
        return false;
    }

    @Override // com.aspose.words.zzZBM
    public final String[] zzZ2K() {
        return zzL5.zzS8(getAttributeValue("class", ""));
    }

    @Override // com.aspose.words.zzZAS
    public final boolean zzZ2L() {
        return this.zzXXm.getCount() == 1;
    }

    @Override // com.aspose.words.zzZBM
    public final zzZBM[] zzZ2M() {
        return this.zzXXm.zzZ2v();
    }

    @Override // com.aspose.words.zzZBM
    public final zzZBM zzZ2N() {
        if (this.zzXXn != null && this.zzYZy < r0.zzXXm.getCount() - 1) {
            return this.zzXXn.zzXXm.zzzK(this.zzYZy + 1);
        }
        return null;
    }

    @Override // com.aspose.words.zzZBM
    public final zzZBM zzZ2O() {
        int i;
        zzYXJ zzyxj = this.zzXXn;
        if (zzyxj != null && (i = this.zzYZy) > 0) {
            return zzyxj.zzXXm.zzzK(i - 1);
        }
        return null;
    }

    @Override // com.aspose.words.zzZBM
    public final zzZBM zzZ2P() {
        if (this.zzXXm.getCount() != 0) {
            return this.zzXXm.zzzK(0);
        }
        return null;
    }

    @Override // com.aspose.words.zzZBM
    public final zzZBM zzZ2Q() {
        return this.zzXXn;
    }

    @Override // com.aspose.words.zzZBM
    public final String zzZTQ() {
        return this.mName;
    }

    @Override // com.aspose.words.zzZAS
    public final boolean zzZXc() {
        return false;
    }

    @Override // com.aspose.words.zzZAS
    public final boolean zzZXd() {
        return false;
    }

    private zzYXJ(String str, zzYXJ zzyxj) {
        com.aspose.words.internal.zzZYD.zzXk(str);
        this.mName = str;
        this.zzYtv = new com.aspose.words.internal.zzZYT<>(false);
        this.zzXXm = new zzZIF();
        if (zzyxj == null) {
            this.zzYZy = -1;
        } else {
            this.zzYZy = zzyxj.zzXXm.zzP(this);
            this.zzXXn = zzyxj;
        }
    }
}
