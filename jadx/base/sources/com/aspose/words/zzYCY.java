package com.aspose.words;

import com.google.android.gms.auth.api.accounttransfer.AccountTransferStatusCodes;
import com.huawei.hms.support.api.entity.common.CommonConstant;

/* JADX INFO: loaded from: classes6.dex */
final class zzYCY extends zzYL2 implements zzZ97 {
    private zzY9J zzXH2;

    public zzYCY(zzZZB zzzzb) throws Exception {
        super(zzzzb);
        this.zzXH2 = new zzY9J(this, null, zzzzb.zzYUr);
    }

    private zzY5Y zzYg4() {
        Object objZzPk = this.zzZF0.zzPk(2380);
        if (objZzPk == null) {
            objZzPk = new zzY5Y();
            this.zzZF0.zzQ(2380, objZzPk);
        }
        return (zzY5Y) com.aspose.words.internal.zzZKW.zzZ(objZzPk, zzY5Y.class);
    }

    private TextColumn zzo5(int i) {
        zzY5Y zzy5yZzYg4 = zzYg4();
        while (zzy5yZzYg4.getCount() <= i) {
            zzy5yZzYg4.zzZ(new TextColumn());
        }
        return zzy5yZzYg4.get(i);
    }

    public final void zzZ(byte[] bArr, zzYCZ zzycz) throws Exception {
        if (zzYmN().zzZrB()) {
            return;
        }
        this.zzZF0 = zzycz;
        this.zzXH2.zzXK(bArr);
        zzYL2.zzU(zzycz);
    }

    @Override // com.aspose.words.zzZ97
    public final boolean zzZ(int i, int i2, int i3, com.aspose.words.internal.zzZOX zzzox) throws Exception {
        if (i2 != 4) {
            return true;
        }
        this.zzW6 = zzzox;
        switch (i) {
            case 133:
                zzT("Section formatting modifier 0x{0:x4} is not supported for DOC format by Aspose.Words.", Integer.valueOf(i));
                return true;
            case 179:
            case 12840:
                this.zzZF0.zzQ(2450, Boolean.valueOf(zzzox.readByte() == 1));
                return true;
            case 12288:
                this.zzZF0.zzQ(CommonConstant.RETCODE.SMS_RETRIEVER_PARAM_FAILED, Integer.valueOf(zzzox.readByte() & 255));
                return true;
            case EditingLanguage.ARABIC_LEBANON /* 12289 */:
                this.zzZF0.zzQ(2190, Integer.valueOf(zzzox.readByte() & 255));
                return true;
            case 12293:
                this.zzZF0.zzQ(2360, Boolean.valueOf(zzzox.readByte() == 1));
                return true;
            case 12294:
                this.zzZF0.zzQ(2390, Boolean.valueOf(zzzox.readByte() == 1));
                return true;
            case EditingLanguage.ENGLISH_ZIMBABWE /* 12297 */:
                this.zzZF0.zzQ(2030, Integer.valueOf(zzzox.readByte() & 255));
                return true;
            case EditingLanguage.SPANISH_ECUADOR /* 12298 */:
                this.zzZF0.zzQ(2040, Boolean.valueOf(zzzox.readByte() != 0));
                return true;
            case 12302:
                this.zzZF0.zzQ(CommonConstant.RETCODE.CLEAR_ACCESSTOKEN_FAIL_NOT_MATCH, Integer.valueOf(zzzox.readByte() & 255));
                return true;
            case 12305:
                boolean z = zzzox.readByte() == 1;
                this.zzZF0.zzQ(2050, Boolean.valueOf(z));
                if (z) {
                    this.zzZF0.zzQ(2200, 0);
                }
                return true;
            case 12306:
                this.zzZF0.zzQ(2100, Boolean.valueOf(zzzox.readByte() != 1));
                return true;
            case 12307:
                this.zzZF0.zzQ(EditingLanguage.MALAY_BRUNEI_DARUSSALAM, Integer.valueOf(zzzox.readByte() & 255));
                return true;
            case 12308:
                this.zzZF0.zzQ(2650, Integer.valueOf(zzzox.readByte() & 255));
                return true;
            case 12313:
                this.zzZF0.zzQ(EditingLanguage.FRENCH_BELGIUM, Boolean.valueOf(zzzox.readByte() == 1));
                return true;
            case 12314:
                int i4 = zzzox.readByte() & 255;
                if (i4 <= 3) {
                    this.zzZF0.zzQ(2340, Integer.valueOf(i4));
                }
                return true;
            case 12317:
                this.zzZF0.zzQ(2210, Integer.valueOf(zzzox.readByte() & 255));
                return true;
            case 12347:
                this.zzZF0.zzQ(2500, Integer.valueOf(zzzox.readByte() & 255));
                return true;
            case 12348:
                this.zzZF0.zzQ(2510, Integer.valueOf(zzzox.readByte() & 255));
                return true;
            case 12350:
                this.zzZF0.zzQ(2610, Integer.valueOf(zzzox.readByte() & 255));
                return true;
            case 12842:
                this.zzZF0.zzQ(2410, Boolean.valueOf(zzzox.readByte() == 1));
                return true;
            case 12857:
                zzzox.readByte();
                return true;
            case 20487:
                this.zzZF0.zzQ(EditingLanguage.PORTUGUESE_PORTUGAL, Integer.valueOf(zzzox.zzXa()));
                return true;
            case 20488:
                this.zzZF0.zzQ(2080, Integer.valueOf(zzzox.zzXa()));
                return true;
            case 20491:
                this.zzZF0.zzQ(2350, Integer.valueOf(zzzox.zzXa() + 1));
                return true;
            case AccountTransferStatusCodes.NO_DATA_AVAILABLE /* 20501 */:
                this.zzZF0.zzQ(2120, Integer.valueOf(zzzox.zzXa()));
                return true;
            case 20507:
                this.zzZF0.zzQ(2180, Integer.valueOf(zzzox.zzXa() + 1));
                return true;
            case 20508:
                this.zzZF0.zzQ(2200, Integer.valueOf(zzzox.zzXa()));
                return true;
            case 20518:
                this.zzZF0.zzQ(2090, Integer.valueOf(zzzox.zzXa()));
                return true;
            case 20530:
                this.zzZF0.zzQ(2430, Integer.valueOf(zzzox.zzXa()));
                return true;
            case 20531:
                this.zzZF0.zzQ(2440, Integer.valueOf(zzzox.zzXa()));
                return true;
            case 20543:
                this.zzZF0.zzQ(2520, Integer.valueOf(zzzox.zzXa()));
                return true;
            case 20544:
                this.zzZF0.zzQ(2530, Integer.valueOf(zzzox.zzXa()));
                return true;
            case 20545:
                this.zzZF0.zzQ(2620, Integer.valueOf(zzzox.zzXa()));
                return true;
            case 20546:
                this.zzZF0.zzQ(2630, Integer.valueOf(zzzox.zzXa()));
                return true;
            case 21039:
                short sZzX9 = zzzox.zzX9();
                this.zzZF0.zzQ(2220, Integer.valueOf(sZzX9 & 7));
                this.zzZF0.zzQ(2230, Boolean.valueOf(((sZzX9 & 24) >> 3) == 0));
                this.zzZF0.zzQ(2240, Integer.valueOf((sZzX9 & 224) >> 5));
                return true;
            case 28715:
                zzWj(2130, 2);
                return true;
            case 28716:
                zzWj(2140, 2);
                return true;
            case 28717:
                zzWj(2150, 2);
                return true;
            case 28718:
                zzWj(2160, 2);
                return true;
            case 28720:
                this.zzZF0.zzQ(2420, Integer.valueOf(zzzox.zzXc()));
                return true;
            case 28730:
                this.zzZF0.zzQ(2250, Integer.valueOf(zzzox.zzXc()));
                return true;
            case 28740:
                this.zzZF0.zzQ(2200, Integer.valueOf(zzzox.zzXc()));
                return true;
            case 36876:
                this.zzZF0.zzQ(2370, Integer.valueOf(zzzox.zzXa()));
                return true;
            case 36886:
                this.zzZF0.zzQ(2400, Integer.valueOf(zzzox.zzX9() & 65535));
                return true;
            case 36899:
                this.zzZF0.zzQ(2300, Integer.valueOf(zzzox.zzXa()));
                return true;
            case 36900:
                this.zzZF0.zzQ(2310, Integer.valueOf(zzzox.zzXa()));
                return true;
            case 36913:
                this.zzZF0.zzQ(2170, Integer.valueOf(zzzox.zzXa()));
                return true;
            case 45079:
                this.zzZF0.zzQ(2320, Integer.valueOf(zzzox.zzX9() & 65535));
                return true;
            case 45080:
                this.zzZF0.zzQ(2330, Integer.valueOf(zzzox.zzX9() & 65535));
                return true;
            case 45087:
                this.zzZF0.zzQ(2260, Integer.valueOf(zzzox.zzXa()));
                return true;
            case 45088:
                this.zzZF0.zzQ(2270, Integer.valueOf(zzzox.zzXa()));
                return true;
            case 45089:
                this.zzZF0.zzQ(2280, Integer.valueOf(zzzox.zzXa()));
                return true;
            case 45090:
                this.zzZF0.zzQ(2290, Integer.valueOf(zzzox.zzXa()));
                return true;
            case 45093:
                this.zzZF0.zzQ(2312, Integer.valueOf(zzzox.zzXa()));
                return true;
            case 53812:
                zzWj(2130, 3);
                return true;
            case 53813:
                zzWj(2140, 3);
                return true;
            case 53814:
                zzWj(2150, 3);
                return true;
            case 53815:
                zzWj(2160, 3);
                return true;
            case 53827:
                zzYCZ zzycz = new zzYCZ();
                zzY5Y zzy5y = (zzY5Y) com.aspose.words.internal.zzZKW.zzZ(this.zzZF0.get(2380), zzY5Y.class);
                if (zzy5y != null) {
                    zzycz.zzQ(2380, (zzY5Y) zzy5y.deepCloneComplexAttr());
                }
                zzV(zzycz);
                return true;
            case 61955:
                zzo5(zzzox.readByte() & 255).zzjM(this.zzW6.zzXa());
                return true;
            case 61956:
                zzo5(zzzox.readByte() & 255).zzjL(this.zzW6.zzXa());
                return true;
            default:
                zzY("Unknown formatting modifier 0x{0:x4} occurred while reading DOC file.", Integer.valueOf(i));
                return false;
        }
    }
}
