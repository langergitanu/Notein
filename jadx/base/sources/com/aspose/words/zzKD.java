package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
class zzKD {
    private StringBuilder zzZjE;
    private zzX5 zzZjF;
    protected com.aspose.words.internal.zzZQ9 zzZjG;

    public zzKD(com.aspose.words.internal.zzZQ9 zzzq9) {
        this(zzzq9, new zzZLA());
    }

    private int zz4(String str, int i) {
        char cCharAt = str.charAt(i);
        if (cCharAt == 'A') {
            zzLZ(this.zzZjG.getDay());
            return 1;
        }
        if (cCharAt != 'M') {
            if (cCharAt == 'O') {
                zzLZ(this.zzZjG.getMonth());
                return 1;
            }
            if (cCharAt == 'W') {
                com.aspose.words.internal.zzZNH.zzU(this.zzZjE, zzZTt());
                return 1;
            }
            if (cCharAt != 'Y') {
                if (cCharAt == 'a') {
                    int iZzJ = zzJ(str, i, 3);
                    com.aspose.words.internal.zzZNH.zzU(this.zzZjE, zzM2(iZzJ));
                    return iZzJ;
                }
                if (cCharAt == 'w') {
                    com.aspose.words.internal.zzZNH.zzU(this.zzZjE, zzZTu());
                    return 1;
                }
                if (cCharAt != 'y') {
                    if (cCharAt == 'R') {
                        int iZzJ2 = zzJ(str, i, 2);
                        zzLW(iZzJ2);
                        zzLX(iZzJ2);
                        return iZzJ2;
                    }
                    if (cCharAt != 'S') {
                        if (cCharAt != 'd') {
                            if (cCharAt == 'e') {
                                int iZzJ3 = zzJ(str, i, 2);
                                com.aspose.words.internal.zzZNH.zzU(this.zzZjE, zzY(iZzJ3, str, i));
                                return iZzJ3;
                            }
                            if (cCharAt == 'g') {
                                int iZzJ4 = zzJ(str, i, 3);
                                com.aspose.words.internal.zzZNH.zzU(this.zzZjE, zzM1(iZzJ4));
                                return iZzJ4;
                            }
                            if (cCharAt != 'h' && cCharAt != 'm') {
                                if (cCharAt == 'n') {
                                    int iZzJ5 = zzJ(str, i, 2);
                                    com.aspose.words.internal.zzZNH.zzU(this.zzZjE, zzZ7G.zzZ(iZzJ5, this.zzZjG, str, i));
                                    return iZzJ5;
                                }
                                if (cCharAt == 'r') {
                                    int iZzJ6 = zzJ(str, i, 2);
                                    zzLW(iZzJ6);
                                    zzZTq();
                                    return iZzJ6;
                                }
                                if (cCharAt != 's') {
                                    switch (cCharAt) {
                                        case 'C':
                                            zzLZ(this.zzZjG.getSecond());
                                            return 1;
                                        case 'D':
                                            break;
                                        case 'E':
                                            int iZzJ7 = zzJ(str, i, zzZTr());
                                            com.aspose.words.internal.zzZNH.zzU(this.zzZjE, zzM3(iZzJ7));
                                            return iZzJ7;
                                        default:
                                            switch (cCharAt) {
                                                case 'G':
                                                    int iZzJ8 = zzJ(str, i, 2);
                                                    com.aspose.words.internal.zzZNH.zzU(this.zzZjE, zzM0(iZzJ8));
                                                    break;
                                                case 'H':
                                                    break;
                                                case 'I':
                                                    zzLZ(this.zzZjG.getMinute());
                                                    break;
                                                default:
                                                    this.zzZjE.append(cCharAt);
                                                    break;
                                            }
                                            return 1;
                                    }
                                }
                            }
                        }
                    }
                    return zzK(str, i, 2);
                }
            }
        }
        return zzK(str, i, 4);
    }

    private int zz5(String str, int i) {
        String upperCase = str.substring(i).toUpperCase();
        int iZzZ = zzZ(upperCase, new String[]{"AM/PM", "PM/AM", "A/P", "P/A", "TT"}, false);
        return iZzZ > 0 ? iZzZ : zzZ(upperCase, new String[]{"JAM/JPM", "JPM/JAM", "AMPM", "PMAM"}, true);
    }

    private static int zzJ(String str, int i, int i2) {
        char cCharAt = str.charAt(i);
        int i3 = 1;
        for (int i4 = i + 1; i3 < i2 && i4 < str.length() && str.charAt(i4) == cCharAt; i4++) {
            i3++;
        }
        return i3;
    }

    private int zzK(String str, int i, int i2) {
        int iZzJ = zzJ(str, i, i2);
        com.aspose.words.internal.zzZNH.zzU(this.zzZjE, this.zzZjF.zzZ(this.zzZjG, str.charAt(i), iZzJ, str, i));
        return iZzJ;
    }

    private void zzLW(int i) {
        if (i > 1) {
            com.aspose.words.internal.zzZNH.zzU(this.zzZjE, zzr(this.zzZjG));
        }
    }

    private void zzLX(int i) {
        int hour = this.zzZjG.getHour();
        com.aspose.words.internal.zzZNH.zzU(this.zzZjE, i == 1 ? com.aspose.words.internal.zzCU.zzZR(hour) : Integer.toString(zzLY(hour)));
    }

    private static int zzLY(int i) {
        int i2 = i % 12;
        if (i2 != 0) {
            return i2;
        }
        return 12;
    }

    private void zzLZ(int i) {
        com.aspose.words.internal.zzZNH.zzU(this.zzZjE, com.aspose.words.internal.zzCU.zzZR(i));
    }

    private String zzM0(int i) {
        return zzM1(i + 1);
    }

    private String zzM1(int i) {
        return i != 1 ? i != 2 ? i != 3 ? "" : zzZ7G.zzi(this.zzZjG) : zzZ7G.zzh(this.zzZjG) : zzZ7G.zzg(this.zzZjG);
    }

    private String zzRQ(String str) {
        int i = 0;
        this.zzZjE.setLength(0);
        boolean z = false;
        while (i < str.length()) {
            char cCharAt = str.charAt(i);
            int iZz5 = 1;
            if (cCharAt == '\'') {
                z = !z;
            } else if (z) {
                this.zzZjE.append(cCharAt);
            } else {
                iZz5 = zz5(str, i);
                if (iZz5 <= 0) {
                    iZz5 = zz4(str, i);
                }
            }
            i += iZz5;
        }
        return this.zzZjE.toString();
    }

    private static int zzX(String str, String[] strArr) {
        for (String str2 : strArr) {
            com.aspose.words.internal.zzZYD.zzXk(str2);
            if (com.aspose.words.internal.zzZKN.zzS(str, str2, com.aspose.words.internal.zzZOF.ORDINAL$4894b8c8)) {
                return str2.length();
            }
        }
        return 0;
    }

    public static String zzZ(String str, com.aspose.words.internal.zzZQ9 zzzq9, int i, int i2) {
        zzX5 zzzla;
        if (i2 == 0) {
            zzzla = new zzZLA();
        } else if (i2 == 1) {
            zzzla = new zzZKL();
        } else if (i2 == 2) {
            zzzla = new zzZKR();
        } else {
            if (i2 != 3 && i2 != 4) {
                throw new IllegalArgumentException("Specified argument was out of the range of valid values.\r\nParameter name: calendarType");
            }
            zzzla = new zzZLA();
        }
        return (com.aspose.words.internal.zzBZ.zzZY(i, 17) ? new zzZ7G(zzzq9) : new zzKD(zzzq9, zzzla)).zzRQ(str);
    }

    private void zzZTq() {
        zzLZ(zzLY(this.zzZjG.getHour()));
    }

    private static String zzr(com.aspose.words.internal.zzZQ9 zzzq9) {
        return zzzq9.getHour() < 12 ? "上午" : "下午";
    }

    private static String zzs(com.aspose.words.internal.zzZQ9 zzzq9) {
        return com.aspose.words.internal.zzCU.zzP(zzzq9.getYear(), 4);
    }

    public String zzM2(int i) {
        return com.aspose.words.internal.zzZKN.zzS('a', i);
    }

    public String zzM3(int i) {
        return zzs(this.zzZjG);
    }

    public String zzY(int i, String str, int i2) {
        int year = this.zzZjG.getYear();
        String string = Integer.toString(year);
        return (i <= 1 || year >= 10) ? string : com.alibaba.sdk.android.oss.internal.OooO00o.OooO00o("0", string);
    }

    public int zzZTr() {
        return 4;
    }

    public String zzZTs() {
        return zzr(this.zzZjG);
    }

    public String zzZTt() {
        return this.zzZjG.zzkS() == 0 ? "日" : com.aspose.words.internal.zzCU.zzZR(this.zzZjG.zzkS());
    }

    public String zzZTu() {
        return "w";
    }

    private zzKD(com.aspose.words.internal.zzZQ9 zzzq9, zzX5 zzx5) {
        this.zzZjE = new StringBuilder();
        this.zzZjG = zzzq9;
        this.zzZjF = zzx5;
    }

    private int zzZ(String str, String[] strArr, boolean z) {
        String string;
        int iZzX = zzX(str, strArr);
        if (iZzX > 0) {
            if (z) {
                string = zzZTs();
            } else {
                string = this.zzZjG.toString("tt");
            }
            com.aspose.words.internal.zzZNH.zzU(this.zzZjE, string);
        }
        return iZzX;
    }
}
