package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZKL extends zzX5 {
    private static com.aspose.words.internal.zzZP1 zzYtH = com.aspose.words.internal.zzZXR.zzWZ("ar-SA");

    public zzZKL() {
        super(new com.aspose.words.internal.zzZPD());
    }

    private String zzj(com.aspose.words.internal.zzZQ9 zzzq9) {
        switch (zzjs().zzH(zzzq9)) {
            case 0:
                return "AlAhad";
            case 1:
                return "AlEthnien";
            case 2:
                return "AthThulatha";
            case 3:
                return "AlArbia'a";
            case 4:
                return "AlKhamis";
            case 5:
                return "AlJumaa";
            case 6:
                return "AsSabt";
            default:
                throw new IllegalArgumentException();
        }
    }

    private String zzl(com.aspose.words.internal.zzZQ9 zzzq9) {
        switch (zzjs().zzF(zzzq9)) {
            case 1:
                return "Muharram";
            case 2:
                return "Safar";
            case 3:
                return "Rabi' Awwal";
            case 4:
                return "Rabi' Thani";
            case 5:
                return "Jamada El Oula";
            case 6:
                return "Jamada El Thaniah";
            case 7:
                return "Rajab";
            case 8:
                return "Sha'ban";
            case 9:
                return "Ramadan";
            case 10:
                return "Shawwal";
            case 11:
                return "Thoul Ki'dah";
            case 12:
                return "Thoul Hijjah";
            default:
                throw new IllegalArgumentException();
        }
    }

    @Override // com.aspose.words.zzX5
    public final boolean zzP(char c, int i) {
        return c != 'M' ? c != 'd' || i <= 2 : i <= 2;
    }

    @Override // com.aspose.words.zzX5
    public final String zzZ(com.aspose.words.internal.zzZQ9 zzzq9, char c, int i) {
        if (c == 'M') {
            return zzl(zzzq9);
        }
        if (c == 'd') {
            return zzj(zzzq9);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.aspose.words.zzX5
    public final com.aspose.words.internal.zzZP1 zzj8() {
        return zzYtH;
    }
}
