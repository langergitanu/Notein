package com.aspose.slides;

import com.aspose.slides.internal.p077d8.C3041c6;

/* JADX INFO: loaded from: classes3.dex */
public class Metered {
    public static double getConsumptionCredit() throws Exception {
        return C3041c6.m12809k4().m12822du();
    }

    public static double getConsumptionQuantity() {
        return C3041c6.m12809k4().m12825to();
    }

    public void setMeteredKey(String str, String str2) {
        if (str == null || str2 == null || str.length() == 0 || str2.length() == 0) {
            throw new IllegalArgumentException("Public key and private key should not be empty.");
        }
        if (!new C3041c6().m12824k4(str, str2)) {
            throw new IllegalStateException("Authentication failed.");
        }
    }
}
