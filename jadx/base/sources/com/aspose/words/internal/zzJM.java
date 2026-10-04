package com.aspose.words.internal;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public final class zzJM extends zzJO {
    public zzJM(zzZXH zzzxh) {
        super(zzzxh);
        zzHm();
    }

    private void zzHm() {
        Iterator<zzZX9> it = zzPl().zzpP().zzoS().zzCJ().iterator();
        while (it.hasNext()) {
            zzWQ(it.next().getGlyphIndex());
        }
        zzD3<zzZX9>.zzZ zzzZzCK = zzPl().zzpP().zzoR().zzCK();
        while (zzzZzCK.moveNext()) {
            zzg(zzzZzCK.zzCM(), zzzZzCK.zzCI().getGlyphIndex());
        }
    }

    @Override // com.aspose.words.internal.zzJO
    public final void zzF(zzZOP zzzop) {
        throw new UnsupportedOperationException("True Type simple subset is not supported in PostScript use True Type Compact subset instead.");
    }

    @Override // com.aspose.words.internal.zzJO
    public final void zzG(zzZOP zzzop) throws Exception {
        if (zzPl().zzHH()) {
            zzZOR zzzor = new zzZOR();
            try {
                new zzZXF().zzZ(zzPl(), zzzor);
                zzzor.zzH(0L);
                zzY(zzzor, zzzop);
                return;
            } finally {
                zzzor.close();
            }
        }
        zzZOP zzzopOpenStream = zzPl().zzpB().openStream();
        try {
            zzY(zzzopOpenStream, zzzop);
        } finally {
            if (zzzopOpenStream != null) {
                zzzopOpenStream.close();
            }
        }
    }

    @Override // com.aspose.words.internal.zzJO
    public final boolean zzHo() {
        return true;
    }

    @Override // com.aspose.words.internal.zzJO
    public final int zzWO(int i) {
        return i;
    }

    @Override // com.aspose.words.internal.zzJO
    public final void zzY(zzZOP zzzop) throws Exception {
        if (zzPl().zzHH()) {
            new zzZXF().zzZ(zzPl(), zzzop);
            return;
        }
        zzZOP zzzopOpenStream = zzPl().zzpB().openStream();
        try {
            zzZYQ.zzX(zzzopOpenStream, zzzop);
        } finally {
            if (zzzopOpenStream != null) {
                zzzopOpenStream.close();
            }
        }
    }

    private static void zzY(zzZOP zzzop, zzZOP zzzop2) throws Exception {
        zzZZ0 zzzz0 = new zzZZ0(zzzop);
        zzzz0.zzLh();
        zzZT2 zzzt2 = new zzZT2(zzzz0.zzrg().getVersion());
        Iterator<Map.Entry<K, V>> it = zzzz0.zzrf().iterator();
        while (it.hasNext()) {
            String str = (String) ((Map.Entry) it.next()).getKey();
            zzzt2.zzZ(str, zzzz0.zzXw(str));
        }
        zzzt2.zzC(zzzop2);
    }
}
