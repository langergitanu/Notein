package com.aspose.words;

import com.huawei.hms.support.api.entity.common.CommonConstant;

/* JADX INFO: loaded from: classes6.dex */
final class zzZK7 {
    private com.aspose.words.internal.zzD7 zzYtt = new com.aspose.words.internal.zzD7();
    private com.aspose.words.internal.zzD7 zzYts = new com.aspose.words.internal.zzD7();
    private com.aspose.words.internal.zzD7 zzYtr = new com.aspose.words.internal.zzD7();
    private com.aspose.words.internal.zzZQC<zzZV8> zzYtq = new com.aspose.words.internal.zzZQC<>();
    private com.aspose.words.internal.zzZQC<zzZV8> zzYtp = new com.aspose.words.internal.zzZQC<>();

    private void zzU(zzZAS zzzas) {
        this.zzYtq.push("ins".equals(zzzas.zzZTQ()) ? zzZ(zzzas, 0) : zzZ(this.zzYtq));
        this.zzYtp.push("del".equals(zzzas.zzZTQ()) ? zzZ(zzzas, 1) : zzZ(this.zzYtp));
    }

    private static zzZV8 zzZ(zzZAS zzzas, int i) {
        return new zzZV8(i, zzzas.getAttributeValue("cite", ""), com.aspose.words.internal.zzJB.zzZy(zzzas.getAttributeValue("datetime", "")));
    }

    public final int getLocaleId() {
        if (this.zzYtt.getCount() != 0) {
            return this.zzYtt.zzCR();
        }
        return 1024;
    }

    public final int getLocaleIdBi() {
        if (this.zzYts.getCount() != 0) {
            return this.zzYts.zzCR();
        }
        return 1024;
    }

    public final int getLocaleIdFarEast() {
        if (this.zzYtr.getCount() != 0) {
            return this.zzYtr.zzCR();
        }
        return 1024;
    }

    public final void zzV(zzZAS zzzas, zzPS zzps) {
        zzU(zzzas, zzps);
        zzU(zzzas);
    }

    public final zzZV8 zzZ4p() {
        if (this.zzYtp.size() != 0) {
            return this.zzYtp.peek();
        }
        return null;
    }

    public final zzZV8 zzZ4q() {
        if (this.zzYtq.size() != 0) {
            return this.zzYtq.peek();
        }
        return null;
    }

    public final void zzZVt() {
        this.zzYtq.pop();
        this.zzYtp.pop();
        this.zzYtt.zzCQ();
        this.zzYts.zzCQ();
        this.zzYtr.zzCQ();
    }

    private static zzZV8 zzZ(com.aspose.words.internal.zzZQC<zzZV8> zzzqc) {
        if (zzzqc.size() != 0) {
            return zzzqc.peek();
        }
        return null;
    }

    private void zzU(zzZAS zzzas, zzPS zzps) {
        int iZzKu;
        int localeId = getLocaleId();
        int localeIdBi = getLocaleIdBi();
        int localeIdFarEast = getLocaleIdFarEast();
        String strZzKM = zzzas.zzKM(CommonConstant.ReqAccessTokenParam.LANGUAGE_LABEL);
        if (com.aspose.words.internal.zzZYD.zzXk(strZzKM) && (iZzKu = zzZGF.zzKu(strZzKM)) != 127) {
            if (zzL5.zzM(zzps) == 2) {
                localeIdBi = iZzKu;
            } else {
                localeId = iZzKu;
                localeIdFarEast = localeId;
            }
        }
        this.zzYtt.zzVF(localeId);
        this.zzYts.zzVF(localeIdBi);
        this.zzYtr.zzVF(localeIdFarEast);
    }
}
