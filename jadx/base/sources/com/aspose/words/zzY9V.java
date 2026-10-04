package com.aspose.words;

import com.microsoft.identity.common.java.cache.CacheKeyValueDelegate;

/* JADX INFO: loaded from: classes6.dex */
final class zzY9V extends zzYAU {
    private int zzXcQ;

    public zzY9V(int i) throws Exception {
        zzY9R.zzmX(i);
        this.zzXcQ = i;
        if (i == 11799) {
            setContentWidth(0);
        }
    }

    private int zzY4N() {
        if (com.aspose.words.internal.zzJF.zzZA(zzY6N().zzZr().zzPh())) {
            return 0;
        }
        return zzY6N().zzZr().zzY5(0);
    }

    private int zzY4O() {
        if (!zza7().zzYMB()) {
            return zzY6N().zzZr().zz5(ControlChar.zzZs5);
        }
        boolean zZzC = zzY6N().zzZr().zzPl().zzpP().zzC(160, false);
        boolean zZzOZ = zzY6N().zzZr().zzOZ();
        if (zZzC) {
            return zzY6N().zzZr().zz5(ControlChar.NON_BREAKING_SPACE);
        }
        int iZzYL5 = zzY6N().zzYL5();
        return zZzOZ ? iZzYL5 : iZzYL5 / 2;
    }

    private int zzY4P() throws Exception {
        zzVH(0, 1);
        return zzVH(zzYoJ(), 1);
    }

    private String zzY4Q() throws Exception {
        int i = this.zzXcQ;
        if (i == 9238) {
            return CacheKeyValueDelegate.CACHE_VALUE_SEPARATOR;
        }
        if (i == 9250) {
            return "\u00ad";
        }
        if (i != 9747) {
            if (i == 11799) {
                return CacheKeyValueDelegate.CACHE_VALUE_SEPARATOR;
            }
            if (i == 9752) {
                return "\u200c";
            }
            if (i == 9753) {
                return "\u200d";
            }
            if (i == 11284) {
                return "—";
            }
            if (i == 11285) {
                return "–";
            }
            switch (i) {
                case 10768:
                    return "\u2003";
                case 10769:
                    return "\u2002";
                case 10770:
                    return "\u2005";
                default:
                    switch (i) {
                        case 10782:
                            return "\u3000";
                        case 10783:
                            return "\u200a";
                        case 10784:
                            return "\ufeff";
                        case 10785:
                            break;
                        default:
                            throw new IllegalStateException("Invalid symbol type.");
                    }
                    break;
            }
        }
        return ControlChar.zzZs5;
    }

    @Override // com.aspose.words.zzYAU
    public final int getLength() {
        return 1;
    }

    @Override // com.aspose.words.zzYAU
    public final String getText() throws Exception {
        return zzY4Q();
    }

    @Override // com.aspose.words.zzYAU
    public final int zz0R() {
        return 1;
    }

    @Override // com.aspose.words.zzYAU
    public final int zzVH(int i, int i2) throws Exception {
        if (i == 0) {
            return 0;
        }
        return super.zzVH(i, i2);
    }

    public final int zzY4R() throws Exception {
        return this.zzXcV != 0 ? getWidth() : zzY4P() + zz63() + zz62();
    }

    @Override // com.aspose.words.zzYAU
    public final boolean zzY6g() throws Exception {
        return this.zzXcQ != 10785;
    }

    @Override // com.aspose.words.zzYAU
    public final boolean zzY6x() throws Exception {
        if (zzaa() == null) {
            return false;
        }
        return !zza7().getBalanceSingleByteDoubleByteWidth() || this.zzXcQ == 10782;
    }

    @Override // com.aspose.words.zzYAU
    public final boolean zzY6y() throws Exception {
        return zzaa() != null && zza7().getBalanceSingleByteDoubleByteWidth() && zzlQ(7);
    }

    @Override // com.aspose.words.zzYAU
    public final zzYAU zzY71() throws Exception {
        zzY9V zzy9v = new zzY9V(zzZo6());
        zzZB(zzy9v);
        return zzy9v;
    }

    @Override // com.aspose.words.zzYAU
    public final boolean zzY77() {
        return this.zzXcQ == 10782;
    }

    @Override // com.aspose.words.zzYAU
    public final int zzYoJ() throws Exception {
        int i = this.zzXcQ;
        if (i == 9747) {
            return zzY4O();
        }
        if (i == 9752 || i == 9753) {
            return 0;
        }
        switch (i) {
            case 10768:
                return zzY6N().zzZr().zz5("—");
            case 10769:
                return zzY6N().zzZr().zz5("–");
            case 10770:
                return zzY6N().zzZr().zz5("—") / 4;
            default:
                switch (i) {
                    case 10783:
                    case 10784:
                        return 0;
                    case 10785:
                        return zzY4N();
                    default:
                        return zzY6N().zzZr().zz5(zzY4Q());
                }
        }
    }

    @Override // com.aspose.words.zzYAU
    public final int zzZXS() throws Exception {
        if (Integer.MIN_VALUE == this.zzXcV) {
            this.zzXcV = zzY4P();
        }
        return this.zzXcV;
    }

    @Override // com.aspose.words.zzYAU
    public final int zzZo6() {
        return this.zzXcQ;
    }
}
