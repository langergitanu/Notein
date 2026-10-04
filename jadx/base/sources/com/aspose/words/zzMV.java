package com.aspose.words;

import androidx.appcompat.view.menu.C21505OooO0Oo;
import com.google.mlkit.p567nl.translate.TranslateLanguage;
import com.orion.notein.domain.models.backup.BackupFile;
import com.orion.notein.richeditor.utils.p606io.IOUtils;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
final class zzMV {
    private static final com.aspose.words.internal.zzZHW zzUR = new com.aspose.words.internal.zzZHW("import", "namespace", "page", BackupFile.EXTENSION_NOTEIN_FILE, "cm", "mm", TranslateLanguage.PORTUGUESE, "pc", "px", "em", "ex", "rem");
    private boolean zzZpf;
    private zzNP zzZpi;
    private boolean zzZpl;
    private zzMF zzZpk = new zzMF();
    private zzNO zzZpj = new zzNO();
    private boolean zzZph = true;
    private boolean zzZpg = true;

    private zzMV(int i, zzNP zznp, boolean z) {
        this.zzZpl = i == 2;
        this.zzZpi = zznp;
        this.zzZpf = z;
    }

    public static zzPS zz6(String str, int i) {
        return new zzMV(i, null, false).zzX(new zzLC(str), false);
    }

    private static boolean zzMm(int i) {
        return i == 0 || i == 2 || i == 3;
    }

    private static int zzMn(int i) {
        if (i == 1 || i == 18) {
            return 19;
        }
        if (i != 20) {
            return i != 22 ? 24 : 23;
        }
        return 21;
    }

    private zzLT zzQ(ArrayList<zzLH> arrayList, ArrayList<zzLH> arrayList2) {
        zzMD[] zzmdArrZzp = zzp(arrayList);
        if (zzmdArrZzp.length == 0) {
            return null;
        }
        return new zzLT(zzmdArrZzp, zzX(new zzO8(arrayList2), false));
    }

    private zzN0 zzR(ArrayList<zzLH> arrayList, ArrayList<zzLH> arrayList2) {
        zzMZ zzmzZzT = zzT(new zzO8(arrayList));
        if (zzmzZzT == null) {
            return null;
        }
        return new zzN0(zzmzZzT, zzX(new zzO8(arrayList2), true));
    }

    private static zzOS zzS(ArrayList<zzLH> arrayList, ArrayList<zzLH> arrayList2) {
        if (arrayList2 != null) {
            return null;
        }
        zzO8 zzo8 = new zzO8(arrayList);
        zzLH zzlhZzZU9 = zzo8.zzZU9();
        if (zzlhZzZU9.getType() == 4 || zzlhZzZU9.getType() == 6) {
            return new zzOS(((zzLJ) zzlhZzZU9).getText(), zzR(zzo8));
        }
        return null;
    }

    private static zzNR zzSl(String str) {
        int iZzZc;
        if (str.length() == 4 && (iZzZc = com.aspose.words.internal.zzJB.zzZc(str)) >= 0 && iZzZc <= 65535) {
            return new zzNR(iZzZc);
        }
        return null;
    }

    private static int zzSm(String str) {
        switch (zzUR.zzTP(com.aspose.words.internal.zzZYD.zzXl(str))) {
            case 3:
                return 1;
            case 4:
                return 2;
            case 5:
                return 3;
            case 6:
                return 4;
            case 7:
                return 5;
            case 8:
                return 6;
            case 9:
                return 7;
            case 10:
                return 8;
            case 11:
                return 9;
            default:
                return 0;
        }
    }

    public static zzNV zzSn(String str) {
        return zzR(new zzLC(str));
    }

    private static zzL4 zzSo(String str) {
        zzLC zzlc = new zzLC(str);
        zzlc.zzZUa();
        zzL4 zzl4ZzV = zzV(zzlc, false);
        if (zzl4ZzV == null || zzl4ZzV.getValueType() == 7 || zzl4ZzV.getValueType() == 8 || !zzlc.zzZU9().zzYC()) {
            return null;
        }
        return zzl4ZzV;
    }

    public static zzL4 zzSp(String str) {
        return zzSo(str);
    }

    private void zzT(ArrayList<zzLH> arrayList, ArrayList<zzLH> arrayList2) {
        String text;
        String strZzZw;
        if (arrayList2 != null) {
            return;
        }
        zzO8 zzo8 = new zzO8(arrayList);
        zzLH zzlhZzZU9 = zzo8.zzZU9();
        if (zzlhZzZU9.getType() == 0) {
            text = ((zzLJ) zzlhZzZU9).getText();
            zzlhZzZU9 = zzo8.zzZU9();
        } else {
            text = "";
        }
        if (zzlhZzZU9.getType() == 4 || zzlhZzZU9.getType() == 6) {
            String text2 = ((zzLJ) zzlhZzZU9).getText();
            if (zzo8.zzZU9().zzYC()) {
                zzNQ zznqZzSr = com.aspose.words.internal.zzZYD.zzXk(text) ? this.zzZpj.zzSr(text) : this.zzZpj.zzZVO();
                if (zznqZzSr == null || !zznqZzSr.zzZVP()) {
                    zzNP zznp = this.zzZpi;
                    strZzZw = zznp != null ? zznp.zzZw(text2, text) : text;
                } else {
                    zzNP zznp2 = this.zzZpi;
                    strZzZw = zznp2 != null ? zznp2.zzZv(zznqZzSr.getName(), text2) : zznqZzSr.getPrefix();
                }
                this.zzZpj.zzZ(text, new zzNQ(strZzZw, text2));
                this.zzZpg = false;
            }
        }
    }

    private static void zzU(zzLG zzlg) {
        boolean z = false;
        while (!z) {
            int type = zzlg.zzZVU().getType();
            if (type != 16) {
                if (type == 20) {
                    zzY(zzlg, (ArrayList<zzLH>) null);
                } else if (type != 24) {
                    zzlg.zzZVT();
                    zzZ(zzlg, (ArrayList<zzLH>) null);
                }
            }
            z = true;
        }
    }

    private static ArrayList<zzLH> zzV(zzLG zzlg) {
        ArrayList<zzLH> arrayList = new ArrayList<>();
        zzLH zzlhZzZVU = zzlg.zzZVU();
        while (zzlhZzZVU.getType() != 24 && zzlhZzZVU.getType() != 16 && zzlhZzZVU.getType() != 20) {
            zzlg.zzZVT();
            zzZ(zzlg, arrayList);
            zzlhZzZVU = zzlg.zzZVU();
        }
        zzlg.zzZVT();
        return arrayList;
    }

    private zzLT zzW(zzLG zzlg) {
        ArrayList<zzLH> arrayList = new ArrayList<>();
        boolean z = false;
        do {
            int type = zzlg.zzZVU().getType();
            if (type == 20) {
                ArrayList<zzLH> arrayList2 = new ArrayList<>();
                zzY(zzlg, arrayList2);
                return zzQ(arrayList, arrayList2);
            }
            if (type != 24) {
                zzlg.zzZVT();
                zzZ(zzlg, arrayList);
            } else {
                zzlg.zzZVT();
                z = true;
            }
        } while (!z);
        return null;
    }

    private ArrayList<zzMG> zzX(zzLG zzlg) {
        while (zzlg.hasMoreTokens()) {
            zzLH zzlhZzZVU = zzlg.zzZVU();
            if (!this.zzZpk.isTopLevel() || (zzlhZzZVU.getType() != 14 && zzlhZzZVU.getType() != 13)) {
                if (this.zzZpk.isTopLevel() || zzlhZzZVU.getType() != 21) {
                    int type = zzlhZzZVU.getType();
                    if (type != 2) {
                        if (type != 12) {
                            zzlg.zzZVT();
                            zzZ(zzW(zzlg));
                        }
                    } else if ("media".equals(com.aspose.words.internal.zzZYD.zzXl(((zzLJ) zzlhZzZVU).getText()))) {
                        ArrayList<zzLH> arrayListZzV = zzV(zzlg);
                        if (zzlg.zzZVU().getType() == 20) {
                            zzr(arrayListZzV);
                        }
                    } else {
                        zzlg.zzZVT();
                        zzZ(zzY(zzlg, this.zzZpk.isTopLevel()));
                    }
                } else {
                    zzZVE();
                }
            }
        }
        while (!this.zzZpk.isTopLevel()) {
            zzZVE();
        }
        return this.zzZpk.zzZVo();
    }

    private zzMG zzY(zzLG zzlg, boolean z) {
        ArrayList<zzLH> arrayList;
        String strZzXl = com.aspose.words.internal.zzZYD.zzXl(((zzLJ) zzlg.zzZVU()).getText());
        ArrayList<zzLH> arrayListZzV = zzV(zzlg);
        if (zzlg.zzZVU().getType() == 20) {
            arrayList = new ArrayList<>();
            zzY(zzlg, arrayList);
        } else {
            arrayList = null;
        }
        return zzZ(strZzXl, arrayListZzV, arrayList, z);
    }

    public static ArrayList<zzMG> zzZ(String str, int i, zzNP zznp, boolean z) {
        return new zzMV(i, zznp, z).zzX(new zzLC(str));
    }

    private void zzZVE() {
        zzNU zznuZzZ = zzZ(this.zzZpk.zzZVn(), this.zzZpk.zzZVo());
        this.zzZpk.zzZVE();
        zzZ(zznuZzZ);
    }

    private static zzL2 zzo(ArrayList<zzLH> arrayList) {
        ArrayList arrayList2 = new ArrayList();
        zzO8 zzo8 = new zzO8(arrayList);
        StringBuilder sb = new StringBuilder();
        boolean z = false;
        boolean z2 = false;
        while (true) {
            zzLH zzlhZzZU9 = zzo8.zzZU9();
            if (!zzlhZzZU9.zzYC() && zzlhZzZU9.getType() != 17) {
                if (zzlhZzZU9.getType() == 4) {
                    if (sb.length() > 0) {
                        return new zzL2();
                    }
                    if (arrayList2.size() > 0) {
                        com.aspose.words.internal.zzZQG.zzZ((ArrayList<zzQ8>) arrayList2, zzL4.zzZnr);
                    }
                    com.aspose.words.internal.zzZQG.zzZ((ArrayList<zzM2>) arrayList2, new zzM2(((zzLJ) zzlhZzZU9).getText()));
                } else {
                    if (zzlhZzZU9.getType() != 0) {
                        return new zzL2();
                    }
                    if (sb.length() == 0 && z) {
                        return new zzL2();
                    }
                    if (sb.length() > 0) {
                        sb.append(ControlChar.SPACE_CHAR);
                        z2 = true;
                    }
                    com.aspose.words.internal.zzZNH.zzU(sb, ((zzLJ) zzlhZzZU9).getText());
                }
                z = true;
            } else {
                if (!z) {
                    return new zzL2();
                }
                if (sb.length() > 0) {
                    if (arrayList2.size() > 0) {
                        com.aspose.words.internal.zzZQG.zzZ((ArrayList<zzQ8>) arrayList2, zzL4.zzZnr);
                    }
                    com.aspose.words.internal.zzZQG.zzZ((ArrayList<Object>) arrayList2, z2 ? new zzM2(sb.toString()) : new zzOT(sb.toString()));
                    sb.setLength(0);
                    z2 = false;
                }
                if (zzlhZzZU9.zzYC()) {
                    return new zzL2((zzL4[]) arrayList2.toArray(new zzL4[0]));
                }
                z = false;
            }
        }
    }

    private zzMD[] zzp(ArrayList<zzLH> arrayList) {
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        for (int i = 0; i <= arrayList.size(); i++) {
            if (i >= arrayList.size() || arrayList.get(i).getType() == 17) {
                if (arrayList3.size() > 0 && ((zzLH) C21505OooO0Oo.OooO00o(1, arrayList3)).isWhitespace()) {
                    Class.getSimpleName();
                }
                zzMD zzmdZzZ = zzMB.zzZ((ArrayList<zzLH>) arrayList3, this.zzZpj);
                if (zzmdZzZ == null) {
                    return new zzMD[0];
                }
                com.aspose.words.internal.zzZQG.zzZ((ArrayList<zzMD>) arrayList2, zzmdZzZ);
                arrayList3.clear();
            } else if (arrayList3.size() > 0 || !arrayList.get(i).isWhitespace()) {
                com.aspose.words.internal.zzZQG.zzZ((ArrayList<zzLH>) arrayList3, arrayList.get(i));
            }
        }
        return (zzMD[]) arrayList2.toArray(new zzMD[0]);
    }

    private static boolean zzq(ArrayList<zzLH> arrayList) {
        int size = arrayList.size() - 1;
        while (true) {
            if (size < 0) {
                size = -1;
                break;
            }
            zzLH zzlh = arrayList.get(size);
            if (!zzlh.isWhitespace() && zzlh.getType() == 0 && "important".equals(com.aspose.words.internal.zzZYD.zzXl(((zzLJ) zzlh).getText()))) {
                break;
            }
            size--;
        }
        if (size <= 0) {
            return false;
        }
        for (int i = size - 1; i >= 0; i--) {
            zzLH zzlh2 = arrayList.get(i);
            if (!zzlh2.isWhitespace() && zzlh2.zzZe('!')) {
                com.aspose.words.internal.zzZQG.zzV(arrayList, i, arrayList.size() - i);
                return true;
            }
        }
        return false;
    }

    private void zzr(ArrayList<zzLH> arrayList) {
        this.zzZpk.zzZ(zzR(new zzO8(arrayList)));
        this.zzZpg = false;
        this.zzZph = false;
    }

    private void zzZ(zzMG zzmg) {
        if (zzmg == null) {
            return;
        }
        com.aspose.words.internal.zzZQG.zzZ(this.zzZpk.zzZVo(), zzmg);
        if (!this.zzZpk.isTopLevel() || (zzmg instanceof zzOS)) {
            return;
        }
        this.zzZpg = false;
        this.zzZph = false;
    }

    private static zzNV zzR(zzLG zzlg) {
        zzLH zzlhZzZU9;
        if (zzlg.zzZU9().zzYC()) {
            return new zzNV(true);
        }
        zzlg.zzZVT();
        ArrayList arrayList = new ArrayList();
        boolean z = false;
        do {
            String strZzXl = null;
            while (true) {
                zzlhZzZU9 = zzlg.zzZU9();
                if (zzlhZzZU9.zzYC() || zzlhZzZU9.getType() == 17) {
                    break;
                }
                zzlg.zzZVT();
                arrayList.clear();
                zzZ(zzlg, (ArrayList<zzLH>) arrayList);
                if (strZzXl == null && arrayList.size() == 1 && ((zzLH) arrayList.get(0)).getType() == 0) {
                    strZzXl = com.aspose.words.internal.zzZYD.zzXl(((zzLJ) zzlhZzZU9).getText());
                } else {
                    strZzXl = "";
                }
            }
            if ("all".equals(strZzXl) || "screen".equals(strZzXl)) {
                z = true;
            }
        } while (!zzlhZzZU9.zzYC());
        return new zzNV(z);
    }

    private static String zzS(zzLG zzlg) {
        String str;
        zzLH zzlhZzZVU = zzlg.zzZVU();
        if (zzlhZzZVU.getType() == 0) {
            String text = ((zzLJ) zzlhZzZVU).getText();
            if ("auto".equals(com.aspose.words.internal.zzZYD.zzXl(text))) {
                text = "";
            }
            str = text;
            zzlhZzZVU = zzlg.zzZVU();
        } else {
            str = null;
        }
        while (zzlhZzZVU.getType() == 15) {
            zzLH zzlhZzZVU2 = zzlg.zzZVU();
            if (zzlhZzZVU2.getType() != 0) {
                return null;
            }
            String strZzXl = com.aspose.words.internal.zzZYD.zzXl(((zzLJ) zzlhZzZVU2).getText());
            if (!"first".equals(strZzXl) && !"left".equals(strZzXl) && !"right".equals(strZzXl) && !"blank".equals(strZzXl)) {
                return null;
            }
            zzlhZzZVU = zzlg.zzZVU();
            str = "";
        }
        zzlg.zzZVT();
        return str;
    }

    private zzPS zzZ(zzLG zzlg, String str) {
        com.aspose.words.internal.zzZYD.zzXk(str);
        zzLH zzlhZzZU9 = zzlg.zzZU9();
        if (zzlhZzZU9.getType() != 15) {
            if (zzlhZzZU9.getType() == 16 || zzlhZzZU9.zzYC()) {
                return null;
            }
            zzlg.zzZVT();
            return null;
        }
        ArrayList<zzLH> arrayList = new ArrayList<>();
        zzLH zzlhZzZU92 = zzlg.zzZU9();
        while (zzlhZzZU92.getType() != 16 && !zzlhZzZU92.zzYC()) {
            zzlg.zzZVT();
            zzZ(zzlg, arrayList);
            zzlhZzZU92 = zzlg.zzZVU();
        }
        boolean zZzq = zzq(arrayList);
        if (arrayList.size() > 0 && ((zzLH) C21505OooO0Oo.OooO00o(1, arrayList)).isWhitespace()) {
            Class.getSimpleName();
        }
        return zzZ(str, arrayList, zZzq);
    }

    private static void zzY(zzLG zzlg, ArrayList<zzLH> arrayList) {
        zzZ(zzlg, 21, arrayList);
        zzlg.zzZVU();
    }

    private static zzL4 zzV(zzLG zzlg, boolean z) {
        zzLH zzlhZzZVU = zzlg.zzZVU();
        if (zzlhZzZVU.zzZe(IOUtils.DIR_SEPARATOR_UNIX)) {
            return zzL4.zzZnq;
        }
        int type = zzlhZzZVU.getType();
        if (type == 0) {
            String text = ((zzLJ) zzlhZzZVU).getText();
            zzQC zzqcZzSM = zzQE.zzSM(text);
            return zzqcZzSM != null ? zzqcZzSM : new zzOT(text);
        }
        if (type != 1) {
            if (type == 3) {
                String text2 = ((zzLJ) zzlhZzZVU).getText();
                zzNR zznrZzSl = z ? zzSl(text2) : null;
                return zznrZzSl == null ? zzQE.zzSL(text2) : zznrZzSl;
            }
            if (type == 4) {
                return new zzM2(((zzLJ) zzlhZzZVU).getText());
            }
            if (type == 6) {
                return new zzL6(((zzLJ) zzlhZzZVU).getText());
            }
            if (type != 17) {
                switch (type) {
                    case 9:
                        return new zzNH(((zzNI) zzlhZzZVU).getValue());
                    case 10:
                        return new zzMU(((zzNI) zzlhZzZVU).getValue());
                    case 11:
                        zzPM zzpm = (zzPM) zzlhZzZVU;
                        if ("deg".equals(com.aspose.words.internal.zzZYD.zzXl(zzpm.zzZW9()))) {
                            return new zzPP(zzpm.getValue());
                        }
                        int iZzSm = zzSm(zzpm.zzZW9());
                        if (iZzSm != 0) {
                            return new zzOI(zzpm.getValue(), iZzSm);
                        }
                        return null;
                    default:
                        return null;
                }
            }
            return zzL4.zzZnr;
        }
        String strZzXl = com.aspose.words.internal.zzZYD.zzXl(((zzLJ) zzlhZzZVU).getText());
        if ("rgb".equals(strZzXl)) {
            return zzQE.zzZ(zzlg);
        }
        if ("hsl".equals(strZzXl)) {
            return zzQE.zzY(zzlg);
        }
        ArrayList arrayList = new ArrayList();
        while (true) {
            zzLH zzlhZzZU9 = zzlg.zzZU9();
            if (zzlhZzZU9.zzYC()) {
                return null;
            }
            if (zzlhZzZU9.getType() == 19) {
                return new zzP1(strZzXl, new zzL2((zzL4[]) arrayList.toArray(new zzL4[0])));
            }
            zzlg.zzZVT();
            zzL4 zzl4ZzV = zzV(zzlg, z);
            if (zzl4ZzV == null) {
                return null;
            }
            com.aspose.words.internal.zzZQG.zzZ((ArrayList<zzL4>) arrayList, zzl4ZzV);
        }
    }

    private static zzL2 zzW(zzLG zzlg, boolean z) {
        ArrayList arrayList = new ArrayList();
        while (zzlg.hasMoreTokens()) {
            zzlg.zzZUa();
            zzL4 zzl4ZzV = zzV(zzlg, z);
            if (zzl4ZzV == null) {
                return new zzL2();
            }
            com.aspose.words.internal.zzZQG.zzZ((ArrayList<zzL4>) arrayList, zzl4ZzV);
        }
        return new zzL2((zzL4[]) arrayList.toArray(new zzL4[0]));
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x002a, code lost:
    
        if (r4 == 17) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x002e, code lost:
    
        if (r4 == 24) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0030, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0031, code lost:
    
        if (r2 != null) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0033, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x003a, code lost:
    
        if ("".equals(r2) != false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x003c, code lost:
    
        com.aspose.words.internal.zzZQG.zzZ((java.util.ArrayList<java.lang.String>) r0, r2);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static zzMZ zzT(zzLG zzlg) {
        zzLH zzlhZzZU9;
        if (zzlg.zzZU9().zzYC()) {
            return new zzMZ(null);
        }
        zzlg.zzZVT();
        ArrayList arrayList = new ArrayList();
        do {
            String strZzS = null;
            while (true) {
                zzlhZzZU9 = zzlg.zzZU9();
                int type = zzlhZzZU9.getType();
                if (type != 0 && type != 15) {
                    break;
                }
                if (strZzS != null) {
                    return null;
                }
                zzlg.zzZVT();
                strZzS = zzS(zzlg);
            }
        } while (!zzlhZzZU9.zzYC());
        return new zzMZ((String[]) arrayList.toArray(new String[0]));
    }

    private zzPS zzX(zzLG zzlg, boolean z) {
        zzPR zzpr = new zzPR();
        while (true) {
            zzLH zzlhZzZU9 = zzlg.zzZU9();
            if (!zzlhZzZU9.zzYC()) {
                if (z && zzlhZzZU9.getType() == 2) {
                    zzU(zzlg);
                } else {
                    int type = zzlhZzZU9.getType();
                    if (type == 0) {
                        zzPS zzpsZzZ = zzZ(zzlg, ((zzLJ) zzlhZzZU9).getText());
                        if (zzpsZzZ != null) {
                            zzpr.zzN(zzpsZzZ);
                        }
                    } else if (type != 16) {
                        zzlg.zzZVT();
                        while (true) {
                            zzLH zzlhZzZVU = zzlg.zzZVU();
                            if (zzlhZzZVU.getType() == 16 || zzlhZzZVU.zzYC()) {
                                break;
                            }
                            zzlg.zzZVT();
                            zzZ(zzlg, (ArrayList<zzLH>) null);
                        }
                    }
                }
            } else {
                return zzpr.zzZWe();
            }
        }
    }

    private zzMG zzZ(String str, ArrayList<zzLH> arrayList, ArrayList<zzLH> arrayList2, boolean z) {
        com.aspose.words.internal.zzZYD.zzXm(str);
        int iZzTP = zzUR.zzTP(str);
        if (iZzTP == 0) {
            if (this.zzZpg) {
                return zzS(arrayList, arrayList2);
            }
            return null;
        }
        if (iZzTP != 1) {
            if (iZzTP != 2) {
                return null;
            }
            return zzR(arrayList, arrayList2);
        }
        if (this.zzZph && z) {
            zzT(arrayList, arrayList2);
        }
        return null;
    }

    private static void zzZ(zzLG zzlg, ArrayList<zzLH> arrayList) {
        zzLH zzlhZzZVU = zzlg.zzZVU();
        zzlhZzZVU.zzYC();
        if (arrayList != null) {
            com.aspose.words.internal.zzZQG.zzZ(arrayList, zzlhZzZVU);
        }
        int iZzMn = zzMn(zzlhZzZVU.getType());
        if (iZzMn != 24) {
            zzZ(zzlg, iZzMn, arrayList);
            if (zzlg.hasMoreTokens()) {
                zzLH zzlhZzZVU2 = zzlg.zzZVU();
                if (arrayList != null) {
                    com.aspose.words.internal.zzZQG.zzZ(arrayList, zzlhZzZVU2);
                }
            }
        }
    }

    private static void zzZ(zzLG zzlg, int i, ArrayList<zzLH> arrayList) {
        zzLF zzlf = null;
        while (true) {
            zzLH zzlhZzZVU = zzlg.zzZVU();
            if (zzlhZzZVU.zzYC()) {
                return;
            }
            if (zzlf != null && !zzlf.isEmpty()) {
                if (zzlhZzZVU.getType() == zzlf.zzCR()) {
                    zzlf.zzZP();
                }
            } else if (zzlhZzZVU.getType() == i) {
                zzlg.zzZVT();
                return;
            }
            if (arrayList != null) {
                com.aspose.words.internal.zzZQG.zzZ(arrayList, zzlhZzZVU);
            }
            int iZzMn = zzMn(zzlhZzZVU.getType());
            if (iZzMn != 24) {
                if (zzlf == null) {
                    zzlf = new zzLF();
                }
                zzlf.zzVF(iZzMn);
            }
        }
    }

    private static zzNU zzZ(zzNV zznv, ArrayList<zzMG> arrayList) {
        Iterator<zzMG> it = arrayList.iterator();
        int i = 0;
        int i2 = 0;
        while (it.hasNext()) {
            if (!zzMm(it.next().getType())) {
                i2++;
            }
        }
        zzMG[] zzmgArr = new zzMG[arrayList.size() - i2];
        for (zzMG zzmg : arrayList) {
            if (zzMm(zzmg.getType())) {
                zzmgArr[i] = zzmg;
                i++;
            }
        }
        return new zzNU(zznv, zzmgArr);
    }

    private zzPS zzZ(String str, ArrayList<zzLH> arrayList, boolean z) {
        zzL2 zzl2ZzW;
        zzMS zzmsZzSk = zzMR.zzSk(com.aspose.words.internal.zzZYD.zzXl(str));
        if ("font-family".equals(zzmsZzSk.getName())) {
            zzl2ZzW = zzo(arrayList);
        } else {
            zzl2ZzW = zzW(new zzO8(arrayList), this.zzZpf);
        }
        if (zzl2ZzW.getCount() != 0) {
            return zzmsZzSk.zzY(zzl2ZzW, z, this.zzZpl);
        }
        return null;
    }
}
