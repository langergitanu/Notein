package com.aspose.words;

import com.aspose.words.ref.RefInt;
import java.util.HashMap;

/* JADX INFO: loaded from: classes6.dex */
final class zzZN1 {
    private static HashMap<String, Integer> zzYwM = new HashMap<>();

    static {
        zzZ6W();
        zzZ6Y();
        zzZ6X();
    }

    public static int zzZ(String str, zzYFT zzyft) {
        RefInt refInt = new RefInt(0);
        boolean zZzZ = com.aspose.words.internal.zzZQF.zzZ(zzYwM, str, refInt);
        int i = refInt.get();
        if (zZzZ) {
            return i;
        }
        zzyft.zzT(65536, com.aspose.words.internal.zzZKN.format("Invalid embedded font style name: {0}.", str));
        return 0;
    }

    private static void zzZ6W() {
        com.aspose.words.internal.zzZQF.zzY(zzYwM, "normal", 0);
        com.aspose.words.internal.zzZQF.zzY(zzYwM, "regular", 0);
        com.aspose.words.internal.zzZQF.zzY(zzYwM, "bold", 1);
        com.aspose.words.internal.zzZQF.zzY(zzYwM, "italic", 2);
        com.aspose.words.internal.zzZQF.zzY(zzYwM, "bolditalic", 3);
        com.aspose.words.internal.zzZQF.zzY(zzYwM, "bold italic", 3);
    }

    private static void zzZ6X() {
        com.aspose.words.internal.zzZQF.zzY(zzYwM, "standaard", 0);
        com.aspose.words.internal.zzZQF.zzY(zzYwM, "gedurfd", 1);
        com.aspose.words.internal.zzZQF.zzY(zzYwM, "italiek", 2);
        com.aspose.words.internal.zzZQF.zzY(zzYwM, "gedurfd italiek", 3);
    }

    private static void zzZ6Y() {
        com.aspose.words.internal.zzZQF.zzY(zzYwM, "normaali", 0);
        com.aspose.words.internal.zzZQF.zzY(zzYwM, "säännöllinen", 0);
        com.aspose.words.internal.zzZQF.zzY(zzYwM, "lihavoitu", 1);
        com.aspose.words.internal.zzZQF.zzY(zzYwM, "kursivoitu", 2);
        com.aspose.words.internal.zzZQF.zzY(zzYwM, "lihavoitukursivoitu", 3);
        com.aspose.words.internal.zzZQF.zzY(zzYwM, "lihavoitu kursivoitu", 3);
    }
}
