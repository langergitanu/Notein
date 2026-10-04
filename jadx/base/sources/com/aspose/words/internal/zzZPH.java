package com.aspose.words.internal;

import com.aspose.words.StyleIdentifier;

/* JADX INFO: loaded from: classes5.dex */
final class zzZPH {
    zzZQ9 zzZZ7;
    int[] zzZZ8 = null;
    zzZPJ[] zzZZ9;
    zzZPU zzZZa;
    int zzZZb;
    int zzZZc;
    static int[] zzZZk = {0, 31, 59, 90, 120, 151, 181, 212, 243, StyleIdentifier.GRID_TABLE_1_LIGHT, 304, StyleIdentifier.LIST_TABLE_6_COLORFUL_ACCENT_1, StyleIdentifier.LIST_TABLE_2_ACCENT_6};
    static int[] zzZZj = {0, 31, 60, 91, 121, 152, 182, 213, 244, StyleIdentifier.GRID_TABLE_2, StyleIdentifier.GRID_TABLE_5_DARK_ACCENT_4, StyleIdentifier.LIST_TABLE_7_COLORFUL_ACCENT_1, StyleIdentifier.LIST_TABLE_3_ACCENT_6};

    public zzZPH(zzZPU zzzpu, zzZPJ[] zzzpjArr) {
        this.zzZZc = 9999;
        this.zzZZa = zzzpu;
        this.zzZZ9 = zzzpjArr;
        this.zzZZ7 = zzzpu.zzkp();
        zzZPJ zzzpj = this.zzZZ9[0];
        this.zzZZc = zzzpj.zzZZf;
        this.zzZZb = zzzpj.zzZZg;
    }

    private static long zzB(int i, int i2, int i3) {
        if (i > 0 && i <= 9999 && i2 > 0 && i2 <= 12) {
            int[] iArr = (i % 4 != 0 || (i % 100 == 0 && i % 400 != 0)) ? zzZZk : zzZZj;
            if (i3 > 0) {
                if (i3 <= iArr[i2] - iArr[i2 - 1]) {
                    int i4 = i - 1;
                    return ((((i4 / 400) + (((i4 / 4) + (i4 * StyleIdentifier.LIST_TABLE_2_ACCENT_6)) - (i4 / 100))) + r3) + i3) - 1;
                }
            }
        }
        throw new IllegalArgumentException("Parameter name: ArgumentOutOfRange_BadYearMonthDay");
    }

    private int zzE(long j, int i) {
        zzYx(j);
        int i2 = (int) (j / 864000000000L);
        int i3 = i2 / 146097;
        int i4 = i2 - (146097 * i3);
        int i5 = i4 / 36524;
        if (i5 == 4) {
            i5 = 3;
        }
        int i6 = i4 - (36524 * i5);
        int i7 = i6 / 1461;
        int i8 = i6 - (i7 * 1461);
        int i9 = i8 / StyleIdentifier.LIST_TABLE_2_ACCENT_6;
        if (i9 == 4) {
            i9 = 3;
        }
        if (i == 0) {
            return (i7 * 4) + (i5 * 100) + (i3 * 400) + i9 + 1;
        }
        int i10 = i8 - (i9 * StyleIdentifier.LIST_TABLE_2_ACCENT_6);
        if (i == 1) {
            return i10 + 1;
        }
        int[] iArr = (i9 != 3 || (i7 == 24 && i5 != 3)) ? zzZZk : zzZZj;
        int i11 = i10 >> 6;
        while (i10 >= iArr[i11]) {
            i11++;
        }
        return i == 2 ? i11 : (i10 - iArr[i11 - 1]) + 1;
    }

    private static long zzF(int i, int i2, int i3) {
        return zzB(i, i2, i3) * 864000000000L;
    }

    public static zzZPJ[] zzQV(int i) {
        switch (i) {
            case 0:
            case 1:
            case 2:
            case 6:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
                return new zzZPJ[0];
            case 3:
                return new zzZPJ[]{new zzZPJ(4, 627358176000000000L, 1988, 1, 8011), new zzZPJ(3, 607779936000000000L, 1925, 1, 64), new zzZPJ(2, 603234432000000000L, 1911, 1, 15), new zzZPJ(1, 589167648000000000L, 1867, 1, 45)};
            case 4:
                return new zzZPJ[]{new zzZPJ(1, 603052128000000000L, 1911, 1, 8088)};
            case 5:
                return new zzZPJ[]{new zzZPJ(1, 0L, -2333, 2334, 12332)};
            case 7:
                return new zzZPJ[]{new zzZPJ(1, 0L, -543, 544, 10542)};
            case 14:
                return new zzZPJ[]{new zzZPJ(4, 627358176000000000L, 1988, 1, 8011), new zzZPJ(3, 607779936000000000L, 1925, 1, 64)};
            default:
                throw new IllegalArgumentException("Calendar ID");
        }
    }

    private static long zzS(int i, int i2, int i3, int i4) {
        if (i < 0 || i >= 24 || i2 < 0 || i2 >= 60 || i3 < 0 || i3 >= 60) {
            throw new IllegalArgumentException("Parameter name: ArgumentOutOfRange_BadHourMinuteSecond");
        }
        if (i4 < 0 || i4 >= 1000) {
            throw new IllegalArgumentException("Parameter name: ArgumentOutOfRange_Range");
        }
        return (((long) i4) * 10000) + zzZNF.zzE(i, i2, i3);
    }

    private void zzYx(long j) {
        if (j < this.zzZZa.zzkp().zzkP() || j > this.zzZZa.zzko().zzkP()) {
            throw new IllegalArgumentException("Parameter name: ArgumentOutOfRange_CalendarRange");
        }
    }

    public final int zzG(zzZQ9 zzzq9) {
        long jZzkP = zzzq9.zzkP();
        int i = 0;
        while (true) {
            zzZPJ[] zzzpjArr = this.zzZZ9;
            if (i >= zzzpjArr.length) {
                throw new IllegalArgumentException("Parameter name: ArgumentOutOfRange_Era");
            }
            zzZPJ zzzpj = zzzpjArr[i];
            if (jZzkP >= zzzpj.zzZZi) {
                return zzzpj.zzZZA;
            }
            i++;
        }
    }

    public final int zzH(zzZQ9 zzzq9) {
        zzYx(zzzq9.zzkP());
        return (int) (((zzzq9.zzkP() / 864000000000L) + 1) % 7);
    }

    public final int zzI(zzZQ9 zzzq9) {
        return zzE(zzzq9.zzkP(), 3);
    }

    public final int zzZ(int i, zzZQ9 zzzq9) {
        long jZzkP = zzzq9.zzkP();
        int i2 = 0;
        while (true) {
            zzZPJ[] zzzpjArr = this.zzZZ9;
            if (i2 >= zzzpjArr.length) {
                throw new IllegalArgumentException("Argument_NoEra");
            }
            zzZPJ zzzpj = zzzpjArr[i2];
            if (jZzkP >= zzzpj.zzZZi) {
                return i - zzzpj.zzZZh;
            }
            i2++;
        }
    }

    public final int zzZj(int i, int i2) {
        if (i < 0) {
            throw new IllegalArgumentException("Parameter name: ArgumentOutOfRange_NeedNonNegNum");
        }
        if (i2 == 0) {
            i2 = this.zzZZa.zzkk();
        }
        int i3 = 0;
        while (true) {
            zzZPJ[] zzzpjArr = this.zzZZ9;
            if (i3 >= zzzpjArr.length) {
                throw new IllegalArgumentException("Parameter name: ArgumentOutOfRange_InvalidEraValue");
            }
            zzZPJ zzzpj = zzzpjArr[i3];
            if (i2 == zzzpj.zzZZA) {
                if (i < zzzpj.zzZZg || i > zzzpj.zzZZf) {
                    throw new IllegalArgumentException("Parameter name: ArgumentOutOfRange_Range");
                }
                return zzzpj.zzZZh + i;
            }
            i3++;
        }
    }

    public final boolean zzZl(int i, int i2) {
        int iZzZj = zzZj(i, i2);
        if (iZzZj % 4 == 0) {
            return iZzZj % 100 != 0 || iZzZj % 400 == 0;
        }
        return false;
    }

    public final int[] zzkj() {
        if (this.zzZZ8 == null) {
            this.zzZZ8 = new int[this.zzZZ9.length];
            int i = 0;
            while (true) {
                zzZPJ[] zzzpjArr = this.zzZZ9;
                if (i >= zzzpjArr.length) {
                    break;
                }
                this.zzZZ8[i] = zzzpjArr[i].zzZZA;
                i++;
            }
        }
        return (int[]) this.zzZZ8.clone();
    }

    public final int zzF(zzZQ9 zzzq9) {
        return zzE(zzzq9.zzkP(), 2);
    }

    public final zzZQ9 zzZ(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        long jZzF = zzF(zzZj(i, i8), i2, i3) + zzS(i4, i5, i6, i7);
        zzYx(jZzF);
        return new zzZQ9(jZzF);
    }

    public final int zzE(zzZQ9 zzzq9) {
        long jZzkP = zzzq9.zzkP();
        int i = 0;
        int iZzE = zzE(jZzkP, 0);
        while (true) {
            zzZPJ[] zzzpjArr = this.zzZZ9;
            if (i < zzzpjArr.length) {
                zzZPJ zzzpj = zzzpjArr[i];
                if (jZzkP >= zzzpj.zzZZi) {
                    return iZzE - zzzpj.zzZZh;
                }
                i++;
            } else {
                throw new IllegalArgumentException("Argument_NoEra");
            }
        }
    }
}
