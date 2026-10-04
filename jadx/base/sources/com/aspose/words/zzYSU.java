package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzYSU {
    private static com.aspose.words.internal.zzD3<Object> zzXRa;
    private zzYSU zzXR9;
    private com.aspose.words.internal.zzD3<Object> zzZfA = new com.aspose.words.internal.zzD3<>();

    static {
        com.aspose.words.internal.zzD3<Object> zzd3 = new com.aspose.words.internal.zzD3<>();
        zzXRa = zzd3;
        zzd3.set(0, Double.valueOf(90.0d));
        com.aspose.words.internal.zzD3<Object> zzd32 = zzXRa;
        Boolean bool = Boolean.TRUE;
        zzd32.set(1, bool);
        zzXRa.set(2, bool);
        zzXRa.set(3, 0);
        zzXRa.set(4, Double.valueOf(-1.7976931348623157E308d));
        com.aspose.words.internal.zzD3<Object> zzd33 = zzXRa;
        Boolean bool2 = Boolean.FALSE;
        zzd33.set(5, bool2);
        zzXRa.set(6, 0);
        zzXRa.set(7, bool2);
        zzXRa.set(8, bool2);
        zzXRa.set(10, bool2);
        zzXRa.set(11, bool2);
        zzXRa.set(12, 0);
        zzXRa.set(13, bool2);
        com.aspose.words.internal.zzD3<Object> zzd34 = zzXRa;
        Double dValueOf = Double.valueOf(Double.NaN);
        zzd34.set(14, dValueOf);
        zzXRa.set(15, "");
        zzXRa.set(16, dValueOf);
        zzXRa.set(17, dValueOf);
        zzXRa.set(18, bool2);
        zzXRa.set(19, dValueOf);
        zzXRa.set(20, "");
        zzXRa.set(21, 100);
        zzXRa.set(22, bool2);
        com.aspose.words.internal.zzD3<Object> zzd35 = zzXRa;
        Double dValueOf2 = Double.valueOf(0.0d);
        zzd35.set(23, dValueOf2);
        zzXRa.set(24, bool);
        zzXRa.set(25, 0);
        zzXRa.set(26, dValueOf);
        zzXRa.set(27, -1);
        zzXRa.set(28, bool2);
        zzXRa.set(29, 0);
        zzXRa.set(30, 0);
        zzXRa.set(31, 12);
        zzXRa.set(32, bool2);
        zzXRa.set(33, bool2);
        zzXRa.set(34, bool2);
        zzXRa.set(35, dValueOf);
        zzXRa.set(36, bool2);
        zzXRa.set(37, dValueOf);
        zzXRa.set(38, dValueOf);
        zzXRa.set(39, 0);
        zzXRa.set(40, 0);
        zzXRa.set(41, bool2);
        zzXRa.set(42, 0);
        zzXRa.set(43, bool2);
        zzXRa.set(44, bool2);
        zzXRa.set(45, bool2);
        zzXRa.set(46, 0);
        zzXRa.set(47, bool2);
        zzXRa.set(48, 0);
        zzXRa.set(49, 0);
        zzXRa.set(50, 0);
        zzXRa.set(51, bool2);
        zzXRa.set(52, dValueOf);
        zzXRa.set(53, 0);
        zzXRa.set(54, 0);
        zzXRa.set(55, dValueOf);
        zzXRa.set(56, bool2);
        zzXRa.set(57, bool2);
        zzXRa.set(58, bool2);
        zzXRa.set(59, bool);
        zzXRa.set(60, bool2);
        zzXRa.set(61, bool2);
        zzXRa.set(62, 0);
        zzXRa.set(63, 0);
        zzXRa.set(64, bool2);
        zzXRa.set(65, bool);
        zzXRa.set(66, dValueOf2);
    }

    public final Object zzPk(int i) {
        return this.zzZfA.get(i);
    }

    public final void zzQ(int i, Object obj) {
        this.zzZfA.set(i, obj);
    }

    public final void zzZ(zzYSU zzysu) {
        this.zzXR9 = zzysu;
    }

    public final Object zzsO(int i) {
        zzYSU zzysu = this;
        do {
            Object objZzPk = zzysu.zzPk(i);
            if (objZzPk != null) {
                return objZzPk;
            }
            zzysu = zzysu.zzXR9;
        } while (zzysu != null);
        return zzXRa.get(i);
    }
}
