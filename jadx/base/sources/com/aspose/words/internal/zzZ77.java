package com.aspose.words.internal;

import java.util.Enumeration;
import java.util.Vector;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZ77 {
    public static zzZ72 zzX(zzZDA zzzda) {
        zzZ72 zzz72ZzX = zzZ75.zzX(zzzda);
        if (zzz72ZzX == null) {
            zzz72ZzX = zzZ8U.zzX(zzzda);
        }
        if (zzz72ZzX == null) {
            zzz72ZzX = zzZ8S.zzX(zzzda);
        }
        if (zzz72ZzX == null) {
            zzz72ZzX = zzZBB.zzX(zzzda);
        }
        return zzz72ZzX == null ? zzZ(zzZAD.zzU(zzzda)) : zzz72ZzX;
    }

    public static Enumeration zzXKn() {
        Vector vector = new Vector();
        zzZ(vector, zzZ75.zzXKn());
        zzZ(vector, zzZ8U.zzXKn());
        zzZ(vector, zzZ9P.zzXKn());
        zzZ(vector, zzZ8S.zzXKn());
        zzZ(vector, zzZBB.zzXKn());
        zzZ(vector, zzZAD.zzXKn());
        return vector.elements();
    }

    private static void zzZ(Vector vector, Enumeration enumeration) {
        while (enumeration.hasMoreElements()) {
            vector.addElement(enumeration.nextElement());
        }
    }

    public static zzZDA zzwM(String str) {
        zzZDA zzzdaZzwM = zzZ75.zzwM(str);
        if (zzzdaZzwM == null) {
            zzzdaZzwM = zzZ8U.zzwM(str);
        }
        if (zzzdaZzwM == null) {
            zzzdaZzwM = zzZ9P.zzwM(str);
        }
        if (zzzdaZzwM == null) {
            zzzdaZzwM = zzZ8S.zzwM(str);
        }
        if (zzzdaZzwM == null) {
            zzzdaZzwM = zzZBB.zzwM(str);
        }
        return zzzdaZzwM == null ? zzZAD.zzwM(str) : zzzdaZzwM;
    }

    public static zzZ72 zzwN(String str) {
        zzZ72 zzz72ZzwN = zzZ75.zzwN(str);
        if (zzz72ZzwN == null) {
            zzz72ZzwN = zzZ8U.zzwN(str);
        }
        if (zzz72ZzwN == null) {
            zzz72ZzwN = zzZ9P.zzwN(str);
        }
        if (zzz72ZzwN == null) {
            zzz72ZzwN = zzZ8S.zzwN(str);
        }
        if (zzz72ZzwN == null) {
            zzz72ZzwN = zzZBB.zzwN(str);
        }
        return zzz72ZzwN == null ? zzZ(zzZAD.zzwK(str)) : zzz72ZzwN;
    }

    private static zzZ72 zzZ(zzZ33 zzz33) {
        if (zzz33 == null) {
            return null;
        }
        return new zzZ72(zzz33.zzXHv(), zzz33.zzXHu(), zzz33.zzXIz(), zzz33.zzXHt(), zzz33.getSeed());
    }
}
