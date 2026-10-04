package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZKR extends zzX5 {
    private static com.aspose.words.internal.zzZP1 zzYtH = com.aspose.words.internal.zzZXR.zzWZ("he-IL");

    public zzZKR() {
        super(new com.aspose.words.internal.zzZPG());
    }

    private String zzU(com.aspose.words.internal.zzZQ9 zzzq9, int i) {
        return i > 2 ? zzn(zzzq9) : zzm(zzzq9);
    }

    private String zzk(com.aspose.words.internal.zzZQ9 zzzq9) {
        return Integer.toString(zzjs().zzE(zzzq9));
    }

    private String zzl(com.aspose.words.internal.zzZQ9 zzzq9) {
        int iZzF = zzjs().zzF(zzzq9);
        if (zzjs().zzZl(zzjs().zzE(zzzq9), 0)) {
            if (iZzF > 5) {
                iZzF++;
            }
        } else if (iZzF > 6) {
            iZzF += 2;
        }
        switch (iZzF) {
            case 1:
                return "Tishrei";
            case 2:
                return "Cheshvan";
            case 3:
                return "Kislev";
            case 4:
                return "Tevet";
            case 5:
                return "Shevat";
            case 6:
                return "Adar";
            case 7:
                return "Adar Alef";
            case 8:
                return "Adar Beit";
            case 9:
                return "Nissan";
            case 10:
                return "Iyar";
            case 11:
                return "Sivan";
            case 12:
                return "Tamuz";
            case 13:
                return "Av";
            case 14:
                return "Elul";
            default:
                throw new IllegalArgumentException();
        }
    }

    private String zzm(com.aspose.words.internal.zzZQ9 zzzq9) {
        return Integer.toString(zzjs().zzI(zzzq9));
    }

    private String zzn(com.aspose.words.internal.zzZQ9 zzzq9) {
        switch (zzjs().zzH(zzzq9)) {
            case 0:
                return "Yom Rishon";
            case 1:
                return "Yom Sheni";
            case 2:
                return "Yom Shlishi";
            case 3:
                return "Yom Revi'i";
            case 4:
                return "Yom Chamishi";
            case 5:
                return "Yom Shishi";
            case 6:
                return "Shabat";
            default:
                throw new IllegalArgumentException();
        }
    }

    @Override // com.aspose.words.zzX5
    public final boolean zzP(char c, int i) {
        return (c == 'M' || c == 'd' || c == 'y') ? false : true;
    }

    @Override // com.aspose.words.zzX5
    public final String zzZ(com.aspose.words.internal.zzZQ9 zzzq9, char c, int i) {
        if (c == 'M') {
            return zzl(zzzq9);
        }
        if (c == 'd') {
            return zzU(zzzq9, i);
        }
        if (c == 'y') {
            return zzk(zzzq9);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.aspose.words.zzX5
    public final com.aspose.words.internal.zzZP1 zzj8() {
        return zzYtH;
    }
}
