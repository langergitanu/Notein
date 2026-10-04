package com.aspose.words;

import com.google.android.gms.auth.api.accounttransfer.AccountTransferStatusCodes;
import com.huawei.hms.support.api.entity.common.CommonConstant;

/* JADX INFO: loaded from: classes6.dex */
final class zzYCX extends zzYL1 {
    public zzYCX(zzZZ2 zzzz2) throws Exception {
        super(zzzz2);
    }

    private void zzYcb() throws Exception {
        if (this.zzZF0.zzVE(2220) || this.zzZF0.zzVE(2230) || this.zzZF0.zzVE(2240)) {
            this.zzZzR.zzVA(21039, ((Integer) this.zzZF0.zzPj(2220)).intValue() | ((!((Boolean) this.zzZF0.zzPj(2230)).booleanValue() ? 1 : 0) << 3) | (((Integer) this.zzZF0.zzPj(2240)).intValue() << 5));
        }
    }

    private void zzYui() throws Exception {
        Object objZzPk = this.zzZF0.zzPk(2350);
        if (objZzPk != null) {
            if (((Integer) objZzPk).intValue() != 0) {
                this.zzZzR.zzVA(20491, r0.intValue() - 1);
            }
        }
        zzWh(12293, 2360);
        zzWe(36876, 2370);
        zzY5Y zzy5y = (zzY5Y) this.zzZF0.zzPk(2380);
        if (zzy5y != null) {
            for (int i = 0; i < zzy5y.getCount(); i++) {
                this.zzZzR.zzVB(61955, i);
                this.zzZzR.zzK((short) zzy5y.get(i).zzXW3());
                if (i < zzy5y.getCount() - 1) {
                    this.zzZzR.zzVB(61956, i);
                    this.zzZzR.zzK((short) zzy5y.get(i).zzXW2());
                }
            }
        }
    }

    public final zzYE1 zzS(zzYCZ zzycz) throws Exception {
        return new zzYE1(zzT(zzycz));
    }

    @Override // com.aspose.words.zzYL1
    public final void zzYpe() throws Exception {
        zzYCZ zzycz = (zzYCZ) this.zzZF0;
        if (zzycz.getRestartPageNumbering() && !zzycz.contains(2200)) {
            zzycz.setPageStartingNumber(((Integer) zzYCZ.zzOt(2200)).intValue());
        }
        zzWf(EditingLanguage.ENGLISH_ZIMBABWE, 2030);
        zzWf(12302, CommonConstant.RETCODE.CLEAR_ACCESSTOKEN_FAIL_NOT_MATCH);
        zzWf(12288, CommonConstant.RETCODE.SMS_RETRIEVER_PARAM_FAILED);
        zzWh(EditingLanguage.SPANISH_ECUADOR, 2040);
        zzWh(12305, 2050);
        zzWh(12313, EditingLanguage.FRENCH_BELGIUM);
        zzWe(20487, EditingLanguage.PORTUGUESE_PORTUGAL);
        zzWe(20488, 2080);
        zzWe(20518, 2090);
        zzWg(12306, 2100);
        zzWf(12307, EditingLanguage.MALAY_BRUNEI_DARUSSALAM);
        zzWe(AccountTransferStatusCodes.NO_DATA_AVAILABLE, 2120);
        zzWb(28715, 2130);
        zzWb(28716, 2140);
        zzWb(28717, 2150);
        zzWb(28718, 2160);
        zzWe(36913, 2170);
        if (this.zzZF0.zzVE(2180)) {
            this.zzZzR.zzVA(20507, ((Integer) this.zzZF0.zzPj(2180)).intValue() - 1);
        }
        zzWf(EditingLanguage.ARABIC_LEBANON, 2190);
        zzWe(20508, 2200);
        zzWf(12317, 2210);
        zzYcb();
        zzWa(53812, 2130);
        zzWa(53813, 2140);
        zzWa(53814, 2150);
        zzWa(53815, 2160);
        zzWc(28730, 2250);
        zzWe(45087, 2260);
        zzWe(45088, 2270);
        zzWe(45089, 2280);
        zzWe(45090, 2290);
        zzWe(36899, 2300);
        zzWe(36900, 2310);
        zzWe(45093, 2312);
        zzWd(45079, 2320);
        zzWd(45080, 2330);
        zzWf(12314, 2340);
        zzYui();
        zzWh(12294, 2390);
        zzWd(36886, 2400);
        zzWh(12842, 2410);
        zzWc(28720, 2420);
        zzWe(20530, 2430);
        zzWe(20531, 2440);
        zzWh(12840, 2450);
        zzWf(12347, 2500);
        zzWf(12348, 2510);
        zzWf(12350, 2610);
        zzWe(20543, 2520);
        zzWe(20544, 2530);
        zzWe(20545, 2620);
        zzWe(20546, 2630);
        zzW7(53827, 12857);
    }

    @Override // com.aspose.words.zzYL1
    public final void zzqA(int i) {
        throw new UnsupportedOperationException();
    }
}
