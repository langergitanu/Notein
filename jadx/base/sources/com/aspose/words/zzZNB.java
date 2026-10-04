package com.aspose.words;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/* JADX INFO: loaded from: classes6.dex */
final class zzZNB implements Comparator<zzZNO> {
    private static Node zzP(zzZNO zzzno) {
        int iZzZ99 = zzzno.zzZ99();
        if (iZzZ99 == 21514) {
            return ((zzYAS) ((zzYMM) ((zzZ55) zzzno.zzZ90()).zza9()).zzZ9r()).zzY67();
        }
        if (iZzZ99 == 21537) {
            return ((zzYAS) ((zzYMM) zzzno.zzZ90()).zzZ9r()).zzY67();
        }
        if (iZzZ99 == 21595) {
            return ((zzYIC) ((zzY6N) zzzno.zzZ90()).zzZXY()).zz69().zzY67();
        }
        throw new IllegalArgumentException("Cannot get document node property from the specified reference object.\r\nParameter name: floater");
    }

    public static void zzS(ArrayList<zzZNO> arrayList) {
        Collections.sort(arrayList, new zzZNB());
    }

    private static int zzX(zzZNO zzzno, zzZNO zzzno2) {
        try {
            Node nodeZzP = zzP(zzzno);
            Node nodeZzP2 = zzP(zzzno2);
            if (nodeZzP.equals(nodeZzP2)) {
                return 0;
            }
            return Node.zzD(nodeZzP, nodeZzP2) ? -1 : 1;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override // java.util.Comparator
    public final /* synthetic */ int compare(zzZNO zzzno, zzZNO zzzno2) {
        return zzX(zzzno, zzzno2);
    }
}
