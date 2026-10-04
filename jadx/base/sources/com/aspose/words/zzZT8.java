package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZT8 {
    private com.aspose.words.internal.zzZYV<zzZT9> zzhu = new com.aspose.words.internal.zzZYV<>();

    private static boolean zzE5(int i) {
        return i == 260 || i == 261 || i == 390 || i == 391 || i == 453 || i == 454;
    }

    private static zzZT9 zzY(int i, int i2, IWarningCallback iWarningCallback) {
        if (i != 325 && i != 326 && i != 337 && i != 338) {
            if (i != 909 && i != 910) {
                switch (i) {
                    case 192:
                    case 197:
                    case StyleIdentifier.INTENSE_EMPHASIS /* 261 */:
                    case StyleIdentifier.TABLE_GRID_LIGHT /* 272 */:
                    case 391:
                    case 919:
                    case 922:
                        break;
                    case 407:
                    case 1284:
                    case 1288:
                        break;
                    case 780:
                        return new zzZSO(i, i2);
                    case 1792:
                        return new zzZTB(i, i2);
                    default:
                        switch (i) {
                            default:
                                switch (i) {
                                    case 896:
                                    case 897:
                                        break;
                                    case 898:
                                        return new zzZTD(i, i2);
                                    case 899:
                                        break;
                                    default:
                                        switch (i) {
                                            case 1921:
                                            case 1922:
                                            case 1923:
                                            case 1924:
                                            case 1925:
                                            case 1926:
                                            case 1927:
                                            case 1928:
                                                return new zzZSS(i, i2);
                                            default:
                                                zzY1Z.zzZ(iWarningCallback, 10, "Unknown OfficeArt property found 0x{0:x4}, ignored.", Integer.valueOf(i));
                                                return new zzZSR(i, i2);
                                        }
                                }
                            case StyleIdentifier.LIST_TABLE_6_COLORFUL_ACCENT_2 /* 341 */:
                            case StyleIdentifier.LIST_TABLE_7_COLORFUL_ACCENT_2 /* 342 */:
                            case StyleIdentifier.LIST_TABLE_1_LIGHT_ACCENT_3 /* 343 */:
                                return new zzZU1(i, i2);
                        }
                        break;
                }
            }
            return new zzZSS(i, i2);
        }
        return new zzZU1(i, i2);
    }

    public final void clear() {
        this.zzhu.clear();
    }

    public final int getCount() {
        return this.zzhu.getCount();
    }

    public final void zzC(int i, String str) {
        zzZ(new zzZSS(i, str));
    }

    public final zzZT9 zzE6(int i) {
        return this.zzhu.zzVY(i);
    }

    public final int zzV(com.aspose.words.internal.zzZOW zzzow) throws Exception {
        int position = (int) zzzow.zzq().getPosition();
        for (int i = 0; i < this.zzhu.getCount(); i++) {
            zzZT9 zzzt9ZzVY = this.zzhu.zzVY(i);
            int id = zzzt9ZzVY.getId();
            if (zzE5(zzzt9ZzVY.getId())) {
                id |= 16384;
            }
            if (zzzt9ZzVY.isComplex()) {
                id |= 32768;
            }
            zzzow.zzK((short) id);
            zzzow.zzl(zzzt9ZzVY.isComplex() ? ((zzZTQ) zzzt9ZzVY).zzZiF() : zzzt9ZzVY.zzZiG());
        }
        for (int i2 = 0; i2 < this.zzhu.getCount(); i2++) {
            zzZT9 zzzt9ZzVY2 = this.zzhu.zzVY(i2);
            if (zzzt9ZzVY2.isComplex()) {
                ((zzZTQ) zzzt9ZzVY2).zzS(zzzow);
            }
        }
        return ((int) zzzow.zzq().getPosition()) - position;
    }

    public final void zzXM(int i, int i2) {
        zzZ(new zzZSV(i, i2));
    }

    public final void zzZ(zzZT9 zzzt9) {
        this.zzhu.add(zzzt9.getId(), zzzt9);
    }

    public final zzZT9 zzZij() {
        return this.zzhu.get(StyleIdentifier.SUBTLE_REFERENCE);
    }

    public final void zzZ(com.aspose.words.internal.zzZOX zzzox, int i, IWarningCallback iWarningCallback) throws Exception {
        zzZT9 zzzsv;
        for (int i2 = 0; i2 < i; i2++) {
            short sZzX9 = zzzox.zzX9();
            int i3 = sZzX9 & 16383;
            boolean z = (Short.MIN_VALUE & sZzX9) != 0;
            int iZzXc = zzzox.zzXc();
            if (z) {
                int i4 = sZzX9 & 16320;
                zzzsv = (i4 == 448 || i4 == 1344 || i4 == 1408 || i4 == 1472 || i4 == 1536 || i4 == 1600) ? zzZ(i3, iZzXc, iWarningCallback) : zzY(i3, iZzXc, iWarningCallback);
            } else {
                zzzsv = new zzZSV(i3, iZzXc);
            }
            if (this.zzhu.zzVE(zzzsv.getId())) {
                zzY1Z.zzZ(iWarningCallback, 10, "OfficeArt property with duplicated Id {0} was read, ignored.", Integer.valueOf(i3));
            } else {
                zzZ(zzzsv);
            }
        }
        for (int i5 = 0; i5 < this.zzhu.getCount(); i5++) {
            zzZT9 zzzt9ZzVY = this.zzhu.zzVY(i5);
            if (zzzt9ZzVY.isComplex()) {
                ((zzZTQ) zzzt9ZzVY).zzC(zzzox);
            }
        }
    }

    private static zzZT9 zzZ(int i, int i2, IWarningCallback iWarningCallback) {
        int i3 = ((i & (-64)) - 448) + i;
        if (i3 == 454) {
            return new zzZSS(i, i2);
        }
        if (i3 != 463) {
            zzY1Z.zzZ(iWarningCallback, 10, "Unknown OfficeArt property found 0x{0:x4}, ignored.", Integer.valueOf(i));
            return new zzZSR(i, i2);
        }
        return new zzZU1(i, i2);
    }
}
