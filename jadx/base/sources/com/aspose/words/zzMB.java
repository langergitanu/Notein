package com.aspose.words;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.orion.notein.richeditor.utils.p606io.FilenameUtils;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
final class zzMB {
    private static final com.aspose.words.internal.zzZHW zzUR = new com.aspose.words.internal.zzZHW("before", "after", "first-line", "first-letter", CommonConstant.ReqAccessTokenParam.LANGUAGE_LABEL, "nth-child", "nth-last-child", "nth-of-type", "nth-last-of-type", "root", "empty", "first-child", "last-child", "first-of-type", "last-of-type", "only-child", "only-of-type", "link", AppMeasurementSdk.ConditionalUserProperty.ACTIVE, "visited", "hover");
    private zzNO zzZoH;
    private zzLH zzZoI;
    private zzLH zzZpQ;
    private ArrayList<zzLH> zzZpR;
    private int zzZpS;

    private zzMB(ArrayList<zzLH> arrayList, zzNO zzno) {
        this.zzZpR = arrayList;
        this.zzZoH = zzno;
    }

    private void advance() {
        if (this.zzZpS < this.zzZpR.size()) {
            int i = this.zzZpS;
            this.zzZpS = i + 1;
            this.zzZpQ = this.zzZoI;
            int i2 = i + 2;
            this.zzZoI = i2 < this.zzZpR.size() ? this.zzZpR.get(i2) : zzLH.zzZo4;
        }
    }

    private zzLH zzMh(int i) {
        zzLH zzlh = this.zzZpQ;
        if (zzlh.getType() != i) {
            return null;
        }
        advance();
        return zzlh;
    }

    private static zzM5 zzY(String str, ArrayList<zzLH> arrayList) {
        switch (zzUR.zzTP(com.aspose.words.internal.zzZYD.zzXl(str))) {
            case 4:
                String strZzs = zzOL.zzs(arrayList);
                if (strZzs != null) {
                    return new zzOK(strZzs);
                }
                return null;
            case 5:
                zzOR zzorZzt = zzOQ.zzt(arrayList);
                if (zzorZzt != null) {
                    return new zzNM(zzorZzt);
                }
                return null;
            case 6:
                zzOR zzorZzt2 = zzOQ.zzt(arrayList);
                if (zzorZzt2 != null) {
                    return new zzNL(zzorZzt2);
                }
                return null;
            case 7:
                zzOR zzorZzt3 = zzOQ.zzt(arrayList);
                if (zzorZzt3 != null) {
                    return new zzNJ(zzorZzt3);
                }
                return null;
            case 8:
                zzOR zzorZzt4 = zzOQ.zzt(arrayList);
                if (zzorZzt4 != null) {
                    return new zzNK(zzorZzt4);
                }
                return null;
            default:
                return null;
        }
    }

    public static zzMD zzZ(ArrayList<zzLH> arrayList, zzNO zzno) {
        return new zzMB(arrayList, zzno).zzZVj();
    }

    private boolean zzZUW() {
        int i = this.zzZpS + 2;
        if (i >= this.zzZpR.size()) {
            return false;
        }
        return this.zzZpR.get(i).zzZe('=');
    }

    private boolean zzZUX() {
        return this.zzZpQ.zzZe(FilenameUtils.EXTENSION_SEPARATOR) && this.zzZoI.getType() == 0;
    }

    private void zzZUY() {
        if (this.zzZpQ.isWhitespace()) {
            advance();
        }
    }

    private zzM5 zzZUZ() {
        zzNQ zznqZzZ = zzZ(this.zzZoH.zzZVO());
        if (zznqZzZ == null) {
            return null;
        }
        if (this.zzZpQ.zzZe('*')) {
            advance();
            return new zzL8(zznqZzZ);
        }
        if (this.zzZpQ.getType() != 0) {
            return null;
        }
        zzLJ zzlj = (zzLJ) this.zzZpQ;
        advance();
        return new zzLA(zznqZzZ, com.aspose.words.internal.zzZYD.zzXl(zzlj.getText()));
    }

    private zzM5 zzZV0() {
        zzOW zzow = (zzOW) zzMh(3);
        if (zzow == null || !zzow.zzZW2()) {
            return null;
        }
        return new zzOU(zzow.getText());
    }

    private zzQG zzZV1() {
        advance();
        zzLJ zzlj = (zzLJ) zzMh(0);
        if (zzlj == null) {
            return null;
        }
        return new zzQG(zzlj.getText());
    }

    private String zzZV2() {
        zzLH zzlh = this.zzZpQ;
        int type = zzlh.getType();
        if (type != 0 && type != 4) {
            return null;
        }
        advance();
        return ((zzLJ) zzlh).getText();
    }

    private zzM5 zzZV3() {
        zzLJ zzlj;
        if (zzMh(22) == null) {
            return null;
        }
        zzZUY();
        zzNQ zznqZzZ = zzZ(zzNQ.zzZpA);
        if (zznqZzZ == null || (zzlj = (zzLJ) zzMh(0)) == null) {
            return null;
        }
        zzZUY();
        zzM5 zzm5ZzZ = zzZ(zznqZzZ, com.aspose.words.internal.zzZYD.zzXl(zzlj.getText()));
        if (zzMh(23) == null) {
            return null;
        }
        return zzm5ZzZ;
    }

    private zzM5 zzZV4() {
        zzLJ zzlj = (zzLJ) zzMh(0);
        if (zzlj == null) {
            return null;
        }
        String text = zzlj.getText();
        int iZzTP = zzUR.zzTP(com.aspose.words.internal.zzZYD.zzXl(text));
        int i = 1;
        if (iZzTP != 0) {
            if (iZzTP == 1) {
                i = 2;
            } else if (iZzTP != 2) {
                i = 3;
                if (iZzTP != 3) {
                    return null;
                }
            } else {
                i = 4;
            }
        }
        return new zzMM(i, com.aspose.words.internal.zzZYD.zzXl(text));
    }

    private zzM5 zzZV5() {
        zzLJ zzlj = (zzLJ) zzMh(0);
        if (zzlj == null) {
            return null;
        }
        String strZzXl = com.aspose.words.internal.zzZYD.zzXl(zzlj.getText());
        switch (zzUR.zzTP(strZzXl)) {
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0049, code lost:
    
        if (zzMh(19) != null) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x004b, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0054, code lost:
    
        return zzY(r1.getText(), r3);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private zzM5 zzZV6() {
        zzLJ zzlj = (zzLJ) zzMh(1);
        if (zzlj != null) {
            zzZUY();
            ArrayList arrayList = new ArrayList();
            loop0: while (true) {
                boolean z = false;
                while (this.zzZpQ.getType() != 19 && !this.zzZpQ.zzYC()) {
                    if (!this.zzZpQ.isWhitespace()) {
                        com.aspose.words.internal.zzZQG.zzZ((ArrayList<zzLH>) arrayList, this.zzZpQ);
                        advance();
                        z = true;
                    } else {
                        if (!z) {
                            return null;
                        }
                        com.aspose.words.internal.zzZQG.zzZ((ArrayList<zzLH>) arrayList, this.zzZpQ);
                        advance();
                    }
                }
                break loop0;
            }
        } else {
            return null;
        }
    }

    private zzM5 zzZV7() {
        if (zzMh(15) == null) {
            return null;
        }
        int type = this.zzZpQ.getType();
        if (type == 0) {
            int iZzTP = zzUR.zzTP(com.aspose.words.internal.zzZYD.zzXl(((zzLJ) this.zzZpQ).getText()));
            return (iZzTP == 0 || iZzTP == 1 || iZzTP == 2 || iZzTP == 3) ? zzZV4() : zzZV5();
        }
        if (type == 1) {
            return "not".equals(com.aspose.words.internal.zzZYD.zzXl(((zzLJ) this.zzZpQ).getText())) ? zzZV9() : zzZV6();
        }
        if (type != 15) {
            return null;
        }
        advance();
        return zzZV4();
    }

    private zzM5 zzZV8() {
        if (zzZUX()) {
            return zzZV1();
        }
        if (this.zzZpQ.zzZe('*') || this.zzZpQ.zzZe('|')) {
            return zzZUZ();
        }
        int type = this.zzZpQ.getType();
        if (type == 0) {
            return zzZUZ();
        }
        if (type == 3) {
            return zzZV0();
        }
        if (type == 15) {
            return zzZV7();
        }
        if (type != 22) {
            return null;
        }
        return zzZV3();
    }

    private zzNN zzZV9() {
        if (zzMh(1) == null) {
            return null;
        }
        zzZUY();
        zzM5 zzm5ZzZV8 = zzZV8();
        if (zzm5ZzZV8 == null || (zzm5ZzZV8 instanceof zzMM) || (zzm5ZzZV8 instanceof zzNN)) {
            return null;
        }
        zzZUY();
        if (zzMh(19) == null) {
            return null;
        }
        return new zzNN(zzm5ZzZV8);
    }

    private zzM5 zzZVa() {
        return (this.zzZpQ.getType() == 0 || this.zzZpQ.zzZe('*') || this.zzZpQ.zzZe('|')) ? zzZUZ() : zzZVb();
    }

    private zzM5 zzZVb() {
        if (zzZUX()) {
            return zzZV1();
        }
        int type = this.zzZpQ.getType();
        if (type == 3) {
            return zzZV0();
        }
        if (type == 15) {
            return zzZV7();
        }
        if (type != 22) {
            return null;
        }
        return zzZV3();
    }

    private ArrayList<zzM5> zzZVc() {
        zzM5 zzm5ZzZVb;
        ArrayList<zzM5> arrayList = new ArrayList<>();
        while (!this.zzZpQ.zzZe('+') && !this.zzZpQ.zzZe('>') && !this.zzZpQ.zzZe('~') && !this.zzZpQ.isWhitespace() && !this.zzZpQ.zzYC()) {
            if ((!zzZUX() && this.zzZpQ.getType() != 3 && this.zzZpQ.getType() != 22 && this.zzZpQ.getType() != 15) || (zzm5ZzZVb = zzZVb()) == null) {
                return null;
            }
            com.aspose.words.internal.zzZQG.zzZ(arrayList, zzm5ZzZVb);
        }
        return arrayList;
    }

    private zzQB zzZVd() {
        ArrayList<zzM5> arrayListZzZVc;
        zzM5 zzm5ZzZVa = zzZVa();
        if (zzm5ZzZVa == null || (arrayListZzZVc = zzZVc()) == null) {
            return null;
        }
        if (arrayListZzZVc.size() == 0) {
            return zzm5ZzZVa;
        }
        arrayListZzZVc.add(0, zzm5ZzZVa);
        zzM5 zzq5 = arrayListZzZVc.get(arrayListZzZVc.size() - 1);
        int size = arrayListZzZVc.size() - 2;
        while (size >= 0) {
            zzM5 zzm5 = arrayListZzZVc.get(size);
            if (zzm5 instanceof zzMM) {
                return null;
            }
            size--;
            zzq5 = new zzQ5(zzm5, zzq5);
        }
        return zzq5;
    }

    private zzPN zzZVe() {
        zzQB zzqbZzZVd;
        if (zzMh(12) == null || (zzqbZzZVd = zzZVd()) == null) {
            return null;
        }
        return new zzPN(zzqbZzZVd);
    }

    private zzS6 zzZVf() {
        zzLH zzlhZzMh = zzMh(8);
        if (zzlhZzMh == null || ((zzPO) zzlhZzMh).zzqe() != '+') {
            return null;
        }
        zzZUY();
        zzQB zzqbZzZVd = zzZVd();
        if (zzqbZzZVd == null) {
            return null;
        }
        return new zzS6(zzqbZzZVd);
    }

    private zzQI zzZVg() {
        zzLH zzlhZzMh = zzMh(8);
        if (zzlhZzMh == null || ((zzPO) zzlhZzMh).zzqe() != '>') {
            return null;
        }
        zzZUY();
        zzQB zzqbZzZVd = zzZVd();
        if (zzqbZzZVd == null) {
            return null;
        }
        return new zzQI(zzqbZzZVd);
    }

    private zzP0 zzZVh() {
        zzLH zzlhZzMh = zzMh(8);
        if (zzlhZzMh == null || ((zzPO) zzlhZzMh).zzqe() != '~') {
            return null;
        }
        zzZUY();
        zzQB zzqbZzZVd = zzZVd();
        if (zzqbZzZVd == null) {
            return null;
        }
        return new zzP0(zzqbZzZVd);
    }

    private ArrayList<zzQ9> zzZVi() {
        Object objZzZVe;
        ArrayList<zzQ9> arrayList = new ArrayList<>();
        while (!this.zzZpQ.zzYC()) {
            if (this.zzZpQ.isWhitespace() && (this.zzZoI.zzZe('+') || this.zzZoI.zzZe('>') || this.zzZoI.zzZe('~'))) {
                zzZUY();
            }
            zzLH zzlh = this.zzZpQ;
            if (zzlh.zzZe('+')) {
                objZzZVe = zzZVf();
            } else if (zzlh.zzZe('>')) {
                objZzZVe = zzZVg();
            } else if (zzlh.zzZe('~')) {
                objZzZVe = zzZVh();
            } else {
                if (!zzlh.isWhitespace()) {
                    return null;
                }
                objZzZVe = zzZVe();
            }
            if (objZzZVe == null) {
                return null;
            }
            com.aspose.words.internal.zzZQG.zzZ(arrayList, objZzZVe);
        }
        return arrayList;
    }

    private zzMD zzZVj() {
        ArrayList<zzQ9> arrayListZzZVi;
        this.zzZpS = 0;
        ArrayList<zzLH> arrayList = this.zzZpR;
        if (arrayList == null || arrayList.size() <= 0) {
            return null;
        }
        this.zzZpQ = this.zzZpS < this.zzZpR.size() ? this.zzZpR.get(this.zzZpS) : zzLH.zzZo4;
        int i = this.zzZpS + 1;
        this.zzZoI = i < this.zzZpR.size() ? this.zzZpR.get(i) : zzLH.zzZo4;
        zzQB zzqbZzZVd = zzZVd();
        if (zzqbZzZVd == null || (arrayListZzZVi = zzZVi()) == null) {
            return null;
        }
        if (arrayListZzZVi.size() <= 0) {
            return zzqbZzZVd;
        }
        if (zzqbZzZVd.zzZWv()) {
            return null;
        }
        for (int i2 = 0; i2 < arrayListZzZVi.size() - 1; i2++) {
            if (arrayListZzZVi.get(i2).zzZWu().zzZWv()) {
                return null;
            }
        }
        return new zzQ7(zzqbZzZVd, arrayListZzZVi);
    }

    private zzM5 zzZ(zzNQ zznq, String str) {
        if (this.zzZpQ.getType() == 8) {
            char cZzqe = ((zzPO) this.zzZpQ).zzqe();
            if (cZzqe == '^' || cZzqe == '$' || cZzqe == '*' || cZzqe == '~' || cZzqe == '|') {
                advance();
                if (!this.zzZpQ.zzZe('=')) {
                    return null;
                }
            }
            advance();
            zzZUY();
            String strZzZV2 = zzZV2();
            if (strZzZV2 == null) {
                return null;
            }
            zzZUY();
            if (cZzqe == '$') {
                return new zzS0(zznq, str, strZzZV2);
            }
            if (cZzqe == '*') {
                return new zzS1(zznq, str, strZzZV2);
            }
            if (cZzqe == '=') {
                return new zzRZ(zznq, str, strZzZV2);
            }
            if (cZzqe == '^') {
                return new zzS3(zznq, str, strZzZV2);
            }
            if (cZzqe == '|') {
                return new zzS5(zznq, str, strZzZV2);
            }
            if (cZzqe != '~') {
                return null;
            }
            return new zzRY(zznq, str, strZzZV2);
        }
        if (this.zzZpQ.getType() == 23) {
            return new zzS4(zznq, str);
        }
        return null;
    }

    private zzNQ zzZ(zzNQ zznq) {
        if (!this.zzZpQ.zzZe('*') && this.zzZpQ.getType() != 0) {
            if (!this.zzZpQ.zzZe('|')) {
                return null;
            }
            advance();
            return zzNQ.zzZpA;
        }
        if (this.zzZoI.zzZe('|') && !zzZUW()) {
            if (this.zzZpQ.getType() == 0) {
                zznq = this.zzZoH.zzSr(((zzLJ) this.zzZpQ).getText());
                if (zznq == null) {
                    return null;
                }
            } else {
                zznq = zzNQ.zzZpB;
            }
            advance();
            advance();
        }
        return zznq;
    }
}
