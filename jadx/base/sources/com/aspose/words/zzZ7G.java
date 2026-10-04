package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZ7G extends zzKD {
    private static com.aspose.words.internal.zzZQ9 zzYhx;
    private static zzZ[] zzYhy;

    public static class zzZ {
        private String mName;
        private String zzYhu;
        private String zzYhv;
        private com.aspose.words.internal.zzZQ9 zzYhw;

        public zzZ(com.aspose.words.internal.zzZQ9 zzzq9, String str, String str2, String str3) {
            this.zzYhw = zzzq9;
            this.mName = str;
            this.zzYhv = str2;
            this.zzYhu = str3;
        }

        public final String getName() {
            return this.mName;
        }

        public final String zzYUI() {
            return this.zzYhu;
        }

        public final String zzYUJ() {
            return this.zzYhv;
        }

        public final com.aspose.words.internal.zzZQ9 zzYUK() {
            return this.zzYhw;
        }
    }

    static {
        zzZ[] zzzArr = {new zzZ(new com.aspose.words.internal.zzZQ9(2019, 5, 1), "令和", "令", "R"), new zzZ(new com.aspose.words.internal.zzZQ9(1989, 1, 8), "平成", "平", "H"), new zzZ(new com.aspose.words.internal.zzZQ9(1926, 12, 25), "昭和", "昭", "S"), new zzZ(new com.aspose.words.internal.zzZQ9(1912, 7, 30), "大正", "大", "T"), new zzZ(new com.aspose.words.internal.zzZQ9(1868, 1, 1), "明治", "明", "M")};
        zzYhy = zzzArr;
        zzYhx = zzzArr[4].zzYUK();
    }

    public zzZ7G(com.aspose.words.internal.zzZQ9 zzzq9) {
        super(zzzq9);
    }

    public static String zzZ(int i, com.aspose.words.internal.zzZQ9 zzzq9, String str, int i2) {
        if (com.aspose.words.internal.zzZQ9.zzW(zzYhx, zzzq9)) {
            return "";
        }
        int iZze = zze(zzzq9);
        return (iZze == 1 && str.substring(i2).contains("年")) ? "元" : (i <= 1 || iZze >= 10) ? Integer.toString(iZze) : com.aspose.words.internal.zzZKN.format("0{0}", Integer.valueOf(iZze));
    }

    private static String zzd(com.aspose.words.internal.zzZQ9 zzzq9) {
        switch (zzzq9.zzkS()) {
            case 0:
                return "日";
            case 1:
                return "月";
            case 2:
                return "火";
            case 3:
                return "水";
            case 4:
                return "木";
            case 5:
                return "金";
            case 6:
                return "土";
            default:
                return "";
        }
    }

    private static int zze(com.aspose.words.internal.zzZQ9 zzzq9) {
        zzZ zzzZzf = zzf(zzzq9);
        if (zzzZzf != null) {
            return (zzzq9.getYear() - zzzZzf.zzYUK().getYear()) + 1;
        }
        throw new IllegalArgumentException("Japanese Era is not defined for the given date.\r\nParameter name: date\r\nParameter value: " + zzzq9);
    }

    private static zzZ zzf(com.aspose.words.internal.zzZQ9 zzzq9) {
        for (zzZ zzz : zzYhy) {
            if (com.aspose.words.internal.zzZQ9.zzV(zzzq9, zzz.zzYUK())) {
                return zzz;
            }
        }
        return null;
    }

    public static String zzg(com.aspose.words.internal.zzZQ9 zzzq9) {
        zzZ zzzZzf = zzf(zzzq9);
        return zzzZzf != null ? zzzZzf.zzYUI() : "";
    }

    public static String zzh(com.aspose.words.internal.zzZQ9 zzzq9) {
        zzZ zzzZzf = zzf(zzzq9);
        return zzzZzf != null ? zzzZzf.zzYUJ() : "";
    }

    public static String zzi(com.aspose.words.internal.zzZQ9 zzzq9) {
        zzZ zzzZzf = zzf(zzzq9);
        return zzzZzf != null ? zzzZzf.getName() : "";
    }

    @Override // com.aspose.words.zzKD
    public final String zzM2(int i) {
        return 3 == i ? zzd(this.zzZjG) : super.zzM2(i);
    }

    @Override // com.aspose.words.zzKD
    public final String zzM3(int i) {
        return i > 1 ? super.zzM3(i) : com.aspose.words.internal.zzZQ9.zzX(zzYhx, this.zzZjG) ? com.aspose.words.internal.zzCU.zzZR(zze(this.zzZjG)) : "";
    }

    @Override // com.aspose.words.zzKD
    public final String zzY(int i, String str, int i2) {
        return zzZ(i, this.zzZjG, str, i2);
    }

    @Override // com.aspose.words.zzKD
    public final int zzZTr() {
        return 2;
    }

    @Override // com.aspose.words.zzKD
    public final String zzZTs() {
        return this.zzZjG.getHour() < 12 ? "午前" : "午後";
    }

    @Override // com.aspose.words.zzKD
    public final String zzZTt() {
        return zzd(this.zzZjG);
    }

    @Override // com.aspose.words.zzKD
    public final String zzZTu() {
        return zzd(this.zzZjG);
    }
}
