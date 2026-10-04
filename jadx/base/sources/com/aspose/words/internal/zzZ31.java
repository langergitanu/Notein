package com.aspose.words.internal;

import java.util.Enumeration;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZ31 {
    public static zzZ2W zzN(zzZDA zzzda) {
        zzZ72 zzz72ZzX = zzZ39.zzX(zzzda);
        if (zzz72ZzX == null) {
            zzz72ZzX = zzZ77.zzX(zzzda);
        }
        if (zzz72ZzX != null) {
            return new zzZ2W(zzzda, zzz72ZzX.zzXHv(), zzz72ZzX.zzXHu(), zzz72ZzX.zzXIz(), zzz72ZzX.zzXHt(), zzz72ZzX.getSeed());
        }
        zzZ33 zzz33ZzU = zzZAD.zzU(zzzda);
        if (zzz33ZzU == null) {
            zzz33ZzU = zzZ8J.zzU(zzzda);
        }
        if (zzz33ZzU != null) {
            return new zzZ2W(zzzda, zzz33ZzU.zzXHv(), zzz33ZzU.zzXHu(), zzz33ZzU.zzXIz(), zzz33ZzU.zzXHt(), zzz33ZzU.getSeed());
        }
        return null;
    }

    public static zzZDA zzY(zzZ33 zzz33) {
        Enumeration enumerationZzXKn = zzZ77.zzXKn();
        while (enumerationZzXKn.hasMoreElements()) {
            final String str = (String) enumerationZzXKn.nextElement();
            if (zzZ77.zzwN(str).zzXIz().equals(zzz33.zzXIz()) && zzZ(new zzZ32() { // from class: com.aspose.words.internal.zzZ31.1
                @Override // com.aspose.words.internal.zzZ32
                public final String zzXGl() {
                    return str;
                }
            }).equals(zzz33)) {
                return zzZ77.zzwM(str);
            }
        }
        return null;
    }

    public static zzZ2W zzZ(zzZ32 zzz32) {
        zzZ72 zzz72ZzwN = zzZ39.zzwN(zzz32.zzXGl());
        if (zzz72ZzwN == null) {
            zzz72ZzwN = zzZ77.zzwN(zzz32.zzXGl());
        }
        if (zzz72ZzwN != null) {
            return new zzZ2W(zzZ77.zzwM(zzz32.zzXGl()), zzz72ZzwN.zzXHv(), zzz72ZzwN.zzXHu(), zzz72ZzwN.zzXIz(), zzz72ZzwN.zzXHt(), zzz72ZzwN.getSeed());
        }
        zzZ33 zzz33ZzwK = zzZAD.zzwK(zzz32.zzXGl());
        if (zzz33ZzwK != null) {
            return new zzZ2W(zzZAD.zzwM(zzz32.zzXGl()), zzz33ZzwK.zzXHv(), zzz33ZzwK.zzXHu(), zzz33ZzwK.zzXIz(), zzz33ZzwK.zzXHt(), zzz33ZzwK.getSeed());
        }
        return null;
    }
}
