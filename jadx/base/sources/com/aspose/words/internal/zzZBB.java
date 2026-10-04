package com.aspose.words.internal;

import com.aspose.words.internal.zzYM1;
import java.math.BigInteger;
import java.util.Enumeration;
import java.util.Hashtable;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZBB {
    static zzZ71 zzWHy = new zzZ71() { // from class: com.aspose.words.internal.zzZBB.1
        @Override // com.aspose.words.internal.zzZ71
        public final zzZ72 zzXKm() {
            BigInteger bigIntegerZzwO = zzZBB.zzwO("F1FD178C0B3AD58F10126DE8CE42435B3961ADBCABC8CA6DE8FCF353D86E9C03");
            BigInteger bigIntegerZzwO2 = zzZBB.zzwO("F1FD178C0B3AD58F10126DE8CE42435B3961ADBCABC8CA6DE8FCF353D86E9C00");
            BigInteger bigIntegerZzwO3 = zzZBB.zzwO("EE353FCA5428A9300D4ABA754A44C00FDFEC0C9AE4B1A1803075ED967B7BB73F");
            BigInteger bigIntegerZzwO4 = zzZBB.zzwO("F1FD178C0B3AD58F10126DE8CE42435B53DC67E140D2BF941FFDD459C6D655E1");
            BigInteger bigIntegerValueOf = BigInteger.valueOf(1L);
            zzYM1 zzym1ZzZ = zzZBB.zzZ(new zzYM1.zzV(bigIntegerZzwO, bigIntegerZzwO2, bigIntegerZzwO3, bigIntegerZzwO4, bigIntegerValueOf));
            return new zzZ72(zzym1ZzZ, new zzZ70(zzym1ZzZ, zzYGC.decode("04B6B3D4C356C139EB31183D4749D423958C27D2DCAF98B70164C97A2DD98F5CFF6142E0F7C8B204911F9271F0F3ECEF8C2701C307E8E4C9E183115A1554062CFB")), bigIntegerZzwO4, bigIntegerValueOf, (byte[]) null);
        }
    };
    static final Hashtable zzWHx = new Hashtable();
    static final Hashtable zzWHw = new Hashtable();
    static final Hashtable zzWHv = new Hashtable();

    static {
        zzZ("FRP256v1", zzZBA.zzWHu, zzWHy);
    }

    public static zzZ72 zzX(zzZDA zzzda) {
        zzZ71 zzz71 = (zzZ71) zzWHw.get(zzzda);
        if (zzz71 == null) {
            return null;
        }
        return zzz71.zzXHs();
    }

    public static Enumeration zzXKn() {
        return zzWHv.elements();
    }

    public static /* synthetic */ zzYM1 zzZ(zzYM1 zzym1) {
        return zzym1;
    }

    public static zzZDA zzwM(String str) {
        return (zzZDA) zzWHx.get(zzYGI.toLowerCase(str));
    }

    public static zzZ72 zzwN(String str) {
        zzZDA zzzdaZzwM = zzwM(str);
        if (zzzdaZzwM == null) {
            return null;
        }
        return zzX(zzzdaZzwM);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static BigInteger zzwO(String str) {
        return new BigInteger(1, zzYGC.decode(str));
    }

    private static void zzZ(String str, zzZDA zzzda, zzZ71 zzz71) {
        zzWHx.put(zzYGI.toLowerCase(str), zzzda);
        zzWHv.put(zzzda, str);
        zzWHw.put(zzzda, zzz71);
    }
}
