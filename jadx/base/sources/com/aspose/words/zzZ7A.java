package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZ7A {
    private int zzYh6;
    private boolean zzYh7;
    private boolean zzYh8;
    private int zzYh9;
    private String zzYha;
    private String zzYhb;
    private int zzYhc;
    private int zzYhd;
    private String zzYhe;
    private String zzYhf;

    private zzZ7A(zzZ3A zzz3a, boolean z) {
        this.zzYha = com.aspose.words.internal.zzZYD.zzXk(zzz3a.zzYMF()) ? zzz3a.zzYMF() : null;
        String strZzYMG = com.aspose.words.internal.zzZYD.zzXk(zzz3a.zzYMG()) ? zzz3a.zzYMG() : null;
        this.zzYhb = strZzYMG;
        if (strZzYMG == null && this.zzYha != null) {
            this.zzYhb = "";
        }
        if (this.zzYha == null && this.zzYhb != null) {
            this.zzYha = "";
        }
        this.zzYh9 = zzz3a.zzYME();
        this.zzYh8 = zzz3a.zzYMD();
        this.zzYh7 = zzz3a.getUseAltKinsokuLineBreakRules();
        this.zzYh6 = z ? zzz3a.zzYMm() : 0;
    }

    private void zzT(zzYAU zzyau, int i) throws Exception {
        int iZzw = zzw(zzyau);
        if (zzWT(iZzw, i)) {
            if (i == 1) {
                this.zzYhd = iZzw;
                this.zzYhf = zzZ(iZzw, this.zzYhb, true);
            } else {
                this.zzYhc = iZzw;
                this.zzYhe = zzZ(iZzw, this.zzYha, false);
            }
        }
    }

    private static boolean zzU(zzVE zzve) throws Exception {
        boolean zMoveNext = zzve.moveNext();
        while (zMoveNext && !zzy(zzve.zz14())) {
            zMoveNext = zzve.moveNext();
        }
        return zMoveNext;
    }

    private boolean zzWT(int i, int i2) {
        return i2 == 1 ? i != this.zzYhd : i != this.zzYhc;
    }

    private boolean zzWU(int i, int i2) {
        return (i == this.zzYhd && i2 == this.zzYhc) ? false : true;
    }

    private boolean zzYJ(char c) {
        return this.zzYhf.indexOf(c) == -1;
    }

    private boolean zzYK(char c) {
        return this.zzYhe.indexOf(c) == -1;
    }

    private String zzYUA() {
        return this.zzYh7 ? "([{·‘“〈《「『【〔〖（．［｛￡￥" : "$([{£¥·‘“〈《「『【〔〖〝﹙﹛﹝＄（．［｛￡￥";
    }

    private String zzYUw() {
        return this.zzYh7 ? "([\\{£¥‘“〈《「『【〔＄（［｛￦" : "$([\\{£¥‘“〈《「『【〔＄（［｛｢￡￥￦";
    }

    private String zzYUx() {
        return this.zzYh8 ? "!%),.:;?]}¢°’”‰′″℃、。々〉》」』】〕ぁぃぅぇぉっゃゅょゎ゛゜ゝゞァィゥェォッャュョヮヵヶ・ーヽヾ！％），．：；？］｝｡｣､･ｧｨｩｪｫｬｭｮｯｰﾞﾟ￠" : "!%),.:;?]}¢°’”‰′″℃、。々〉》」』】〕゛゜ゝゞ・ヽヾ！％），．：；？］｝｡｣､･ﾞﾟ￠";
    }

    private String zzYUy() {
        return this.zzYh7 ? "!),.:;?]}¢·–—’”•‥…‧′╴、。〉》」』】〕〞︰︱︳︴︶︸︺︼︾﹀﹂﹄﹏﹐﹑﹒﹔﹕﹖﹚﹜﹞！），．：；？｜｝､" : "!),.:;?]}¢·–—’”•‥…‧′╴、。〉》」』】〕〞︰︱︳︴︶︸︺︼︾﹀﹂﹄﹏﹐﹑﹒﹔﹕﹖﹗﹚﹜﹞！），．：；？］｜｝､";
    }

    private String zzYUz() {
        return this.zzYh7 ? "!),.:;?]}¨·ˇˉ―‖’”…∶、。〃〉》」』】〕〗！＂＇），．：；？］｀｜｝～￠" : "!%),.:;>?]}¢¨°·ˇˉ―‖’”…‰′″›℃∶、。〃〉》」』】〕〗〞︶︺︾﹀﹄﹚﹜﹞！＂％＇），．：；？］｀｜｝～￠";
    }

    public static zzZ7A zzZ(zzZ3A zzz3a) {
        return zzZ(zzz3a, false);
    }

    private String zzZT(int i, boolean z) {
        if (i != 17) {
            if (i != 18) {
                if (i != 1028) {
                    if (i != 2052) {
                        if (i != 3076) {
                            if (i != 4100) {
                                if (i != 5124) {
                                    if (i != 1041) {
                                        if (i != 1042) {
                                            return "";
                                        }
                                    }
                                }
                            }
                        }
                    }
                    return z ? zzYUA() : zzYUz();
                }
                return z ? "([{£¥‘“‵〈《「『【〔〝︵︷︹︻︽︿﹁﹃﹙﹛﹝（｛" : zzYUy();
            }
            return z ? zzYUw() : "!%),.:;?]}¢°’”′″℃〉》」』】〕！％），．：；？］｝￠";
        }
        return z ? "$([\\{£¥‘“〈《「『【〔＄（［｛｢￡￥" : zzYUx();
    }

    private static int zzw(zzYAU zzyau) throws Exception {
        if (zzyau.zzY6N().getLocaleIdFarEast() != 0) {
            return zzyau.zzY6N().getLocaleIdFarEast();
        }
        if (zz0.zzTC(zzyau.getText())) {
            return EditingLanguage.JAPANESE;
        }
        return 2052;
    }

    private static boolean zzx(zzYAU zzyau) throws Exception {
        return zzyau.zzZo6() == 9217 || zzyau.zzZo6() == 11284 || zzyau.zzZo6() == 11285;
    }

    private static boolean zzy(zzYAU zzyau) throws Exception {
        boolean wrapTrailSpaces = zzyau.zza7().getWrapTrailSpaces();
        if (zzyau.zzZo6() != 0) {
            return (!zzyau.zzY6p() || wrapTrailSpaces) && !zzyau.zzY7t();
        }
        return false;
    }

    public final boolean zzV(zzVE zzve) throws Exception {
        if (!((zzZ37) zzve.zz14().zzY6S().zzYTt()).zzYLH()) {
            return false;
        }
        zzVE zzve2 = new zzVE(zzve);
        if (zzU(zzve2)) {
            return zzZ(zzve2.zz0V(), 0);
        }
        return false;
    }

    public final boolean zzW(zzVE zzve) throws Exception {
        return ((zzZ37) zzve.zz14().zzY6S().zzYTt()).zzYLH() && zzZ(zzve.zz0V(), 0);
    }

    public final boolean zzX(zzVE zzve) throws Exception {
        if (!((zzZ37) zzve.zz14().zzY6S().zzYTt()).zzYLH()) {
            return false;
        }
        zzVE zzve2 = new zzVE(zzve);
        return zzZ(zzve2, false) && zzZ(zzve2.zz0V(), 1);
    }

    public final boolean zzY(zzVE zzve) throws Exception {
        if (!((zzZ37) zzve.zz14().zzY6S().zzYTt()).zzYLH()) {
            return false;
        }
        zzVE zzve2 = new zzVE(zzve);
        boolean zZzZ = zzZ(zzve2, true);
        zzVE zzve3 = new zzVE(zzve);
        return zzZ(zZzZ ? zzve2.zz0V() : null, zzU(zzve3) ? zzve3.zz0V() : null);
    }

    public static zzZ7A zzZ(zzZ3A zzz3a, boolean z) {
        if (zzz3a.zzYMA()) {
            return new zzZ7A(zzz3a, z);
        }
        return null;
    }

    private void zzU(zzYAU zzyau, zzYAU zzyau2) throws Exception {
        int iZzw = zzyau == null ? this.zzYhd : zzw(zzyau);
        int iZzw2 = zzyau2 == null ? this.zzYhc : zzw(zzyau2);
        if (zzWU(iZzw, iZzw2)) {
            this.zzYhd = iZzw;
            this.zzYhc = iZzw2;
            this.zzYhf = zzZ(iZzw, this.zzYhb, true);
            this.zzYhe = zzZ(this.zzYhc, this.zzYha, false);
        }
    }

    public final boolean zzZ(zzVE zzve) throws Exception {
        boolean zZzYLH = ((zzZ37) zzve.zz14().zzY6S().zzYTt()).zzYLH();
        zzVE zzve2 = new zzVE(zzve);
        boolean zZzZ = zzZ(zzve2, true);
        zzVE zzve3 = new zzVE(zzve);
        boolean zZzU = zzU(zzve3);
        if (zZzZ && zZzU) {
            zzVF zzvfZz0V = zzve2.zz0V();
            zzVF zzvfZz0V2 = zzve3.zz0V();
            if (zzvfZz0V.zz14().zzZo6() == 9754 || zzvfZz0V.zz14().zzZo6() == 9753 || zzvfZz0V2.zz14().zzZo6() == 9753 || !zzV(zzvfZz0V.zz14(), zzvfZz0V2.zz14())) {
                return false;
            }
            if (!zZzYLH || !zzZ(zzvfZz0V, zzvfZz0V2)) {
                return true;
            }
        }
        return false;
    }

    private static boolean zzV(zzYAU zzyau, zzYAU zzyau2) throws Exception {
        if (!zzx(zzyau) && !zzx(zzyau2)) {
            return false;
        }
        if (zzyau.zzY6D() || zzyau2.zzY6D()) {
            return !(zzZ3X.zzwK(zzyau.zzZo2()) || zzZ3X.zzwK(zzyau2.zzZo2())) || (zzZ3X.zzwL(zzyau.zzZo2()) || zzZ3X.zzwL(zzyau2.zzZo2()));
        }
        return false;
    }

    private boolean zzZ(zzVF zzvf, zzVF zzvf2) throws Exception {
        boolean z = zzvf != null && zzx(zzvf.zz14());
        boolean z2 = zzvf2 != null && zzx(zzvf2.zz14());
        zzU(z ? zzvf.zz14() : null, z2 ? zzvf2.zz14() : null);
        return (z && !zzYJ(zzvf.getCharacter())) || (z2 && !zzYK(zzvf2.getCharacter()));
    }

    private boolean zzZ(zzVF zzvf, int i) throws Exception {
        if (!zzx(zzvf.zz14())) {
            return false;
        }
        zzYAU zzyauZz14 = zzvf.zz14();
        char character = zzvf.getCharacter();
        zzT(zzyauZz14, i);
        return i == 1 ? !zzYJ(character) : !zzYK(character);
    }

    private static boolean zzZ(zzVE zzve, boolean z) throws Exception {
        boolean zMovePrevious;
        if (z && zzy(zzve.zz14())) {
            return true;
        }
        do {
            zMovePrevious = zzve.movePrevious();
            if (!zMovePrevious) {
                break;
            }
        } while (!zzy(zzve.zz14()));
        return zMovePrevious;
    }

    private String zzZ(int i, String str, boolean z) {
        if (i == this.zzYh9 && !this.zzYh8 && str != null) {
            return str;
        }
        if (zzZ3X.zzZb(i)) {
            return zzZT(i, z);
        }
        if (zzZ3X.zzZb(this.zzYh6)) {
            return zzZT(this.zzYh6, z);
        }
        return "";
    }
}
