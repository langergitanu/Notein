package com.aspose.words;

import com.huawei.hms.network.embedded.C18241k5;
import com.orion.notein.richeditor.utils.p606io.IOUtils;

/* JADX INFO: loaded from: classes6.dex */
class zzYEQ extends zzYER {
    private static final com.aspose.words.internal.zzZHW zzUR = new com.aspose.words.internal.zzZHW("\\u", "\\page", "\\column", "\\line", "\\tab", "\\emdash", "\\endash", "\\emspace", "\\enspace", "\\qmspace", "\\bullet", "\\lquote", "\\rquote", "\\ldblquote", "\\rdblquote", "\\'", "\\~", "\\-", "\\_", "\\\\", "\\{", "\\}", "\\:", "\\ltrmark", "\\rtlmark", "\\zwbo", "\\zwnbo", "\\zwj", "\\zwnj", "\\|", "\\sectnum", "\\chftn", "\\chatn", "\\chftnsep", "\\chftnsepc");
    private com.aspose.words.internal.zzZO0 zzMW;
    private int zzdV;

    public zzYEQ(com.aspose.words.internal.zzZOP zzzop) {
        super(zzzop);
        setCodePage(1252);
    }

    private void zzXR(char c) throws Exception {
        super.zzYeN().zzXU(c);
    }

    private void zzYez() throws Exception {
        switch (zzUR.zzTP(super.zzYeN().getName())) {
            case 0:
                super.zzYeN().zzXU((char) super.zzYeN().zzYeT());
                break;
            case 1:
                zzXR('\f');
                break;
            case 2:
                zzXR(ControlChar.COLUMN_BREAK_CHAR);
                break;
            case 3:
                zzXR(ControlChar.LINE_BREAK_CHAR);
                break;
            case 4:
                zzXR('\t');
                break;
            case 5:
                zzXR((char) 8212);
                break;
            case 6:
                zzXR((char) 8211);
                break;
            case 7:
                zzXR((char) 8195);
                break;
            case 8:
                zzXR(ControlChar.DEFAULT_TEXT_INPUT_CHAR);
                break;
            case 9:
                zzXR((char) 8197);
                break;
            case 10:
                zzXR((char) 8226);
                break;
            case 11:
                zzXR((char) 8216);
                break;
            case 12:
                zzXR((char) 8217);
                break;
            case 13:
                zzXR((char) 8220);
                break;
            case 14:
                zzXR((char) 8221);
                break;
            case 16:
                zzXR(ControlChar.NON_BREAKING_SPACE_CHAR);
                break;
            case 17:
                zzXR(ControlChar.OPTIONAL_HYPHEN_CHAR);
                break;
            case 18:
                zzXR(ControlChar.NON_BREAKING_HYPHEN_CHAR);
                break;
            case 19:
                zzXR(IOUtils.DIR_SEPARATOR_WINDOWS);
                break;
            case 20:
                zzXR('{');
                break;
            case 21:
                zzXR('}');
                break;
            case 22:
                zzXR(IOUtils.DIR_SEPARATOR_WINDOWS);
                super.zzYeN().zzBG(C18241k5.f55433h);
                break;
            case 23:
                zzXR((char) 8206);
                break;
            case 24:
                zzXR((char) 8207);
                break;
            case 25:
                zzXR((char) 8204);
                break;
            case 26:
                zzXR((char) 8205);
                break;
            case 27:
                zzXR((char) 65279);
                break;
            case 28:
                zzXR((char) 8203);
                break;
            case 29:
                zzXR(IOUtils.DIR_SEPARATOR_WINDOWS);
                break;
            case 30:
                zzXR('\f');
                break;
            case 31:
                zzXR((char) 2);
                break;
            case 32:
                zzXR((char) 5);
                break;
            case 33:
                zzXR((char) 3);
                break;
            case 34:
                zzXR((char) 4);
                break;
        }
    }

    public final void setCodePage(int i) {
        if (i == 0) {
            i = 1252;
        }
        if (i != this.zzdV) {
            this.zzMW = com.aspose.words.internal.zzZO0.zzQz(i);
            this.zzdV = i;
        }
    }

    @Override // com.aspose.words.zzYER
    public void zzYeR() throws Exception {
        super.zzYeR();
        int iZzYb = super.zzYeN().zzYb();
        if (iZzYb == 1) {
            zzYez();
        } else {
            if (iZzYb != 4) {
                return;
            }
            super.zzYeN().zzJ(this.zzMW);
        }
    }
}
