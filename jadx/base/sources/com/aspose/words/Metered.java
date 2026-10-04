package com.aspose.words;

import com.aspose.slides.PatternStyle;
import java.math.BigDecimal;

/* JADX INFO: loaded from: classes6.dex */
public class Metered {
    public static BigDecimal getConsumptionCredit() throws Exception {
        return zzYZ8.zzYDK().zzYDF();
    }

    public static BigDecimal getConsumptionQuantity() {
        return zzYZ8.zzYDK().zzYDG();
    }

    public static boolean isMeteredLicensed() {
        return zzYZ8.zzYDI() == zzYZ0.zzXZ1;
    }

    public String getProductName() throws Exception {
        return zzYZ8.zzYDK().getProductName();
    }

    public void setMeteredKey(String str, String str2) {
        if (str == null || str2 == null || str.length() == 0 || str2.length() == 0) {
            throw new IllegalArgumentException(com.aspose.words.internal.zzZO0.zzhV().zzYP(new byte[]{117, 80, 108, 98, 99, 105, 107, 32, 121, 101, 97, 32, 100, 110, 112, 32, 105, 114, 97, 118, 101, 116, 107, 32, 121, 101, 115, 32, 111, 104, 108, 117, 32, 100, 111, 110, 32, 116, 101, 98, 101, 32, 112, 109, 121, 116, PatternStyle.Divot}));
        }
        if (!new zzYZ8().zzYI(str, str2)) {
            throw new IllegalStateException(com.aspose.words.internal.zzZO0.zzhV().zzYP(new byte[]{117, 65, 104, 116, 110, 101, 105, 116, 97, 99, 105, 116, 110, 111, 102, 32, 105, 97, 101, 108, PatternStyle.Divot, 100}));
        }
    }
}
