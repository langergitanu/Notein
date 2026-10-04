package com.aspose.words;

import com.aspose.words.ref.Ref;
import java.util.HashMap;

/* JADX INFO: loaded from: classes6.dex */
final class zzVW {
    private HashMap<String, zzVV> zzZx4;
    private int zzZx5;

    private zzVW(HashMap<String, zzVV> map, int i) {
        this.zzZx4 = map;
        this.zzZx5 = i;
    }

    public static zzVW zzZ(com.aspose.words.internal.zzZOX zzzox, zzVR zzvr) throws Exception {
        HashMap map = new HashMap();
        int iZz1t = zzvr.zz1t();
        long position = zzzox.zzq().getPosition();
        int i = 0;
        while (iZz1t >= 0) {
            long jZz1u = ((((long) zzvr.zz1u()) & 4294967295L) * ((long) iZz1t)) + position;
            zzzox.zzq().zzH(jZz1u);
            String str = new String(zzzox.zzQG(4));
            if ("PMGI".equals(str)) {
                zzzox.zzq().zzH(((((long) zzvr.zz1u()) & 4294967295L) - 4) + zzzox.zzq().getPosition());
            } else {
                if (!"PMGL".equals(str)) {
                    throw new IllegalStateException("Unknown chunk type.");
                }
                zzVM zzvmZzL = zzVM.zzL(zzzox);
                long jZz1u2 = (jZz1u + (4294967295L & ((long) zzvr.zz1u()))) - ((long) zzvmZzL.zz1e());
                while (zzzox.zzq().getPosition() < jZz1u2) {
                    zzVV zzvvZzQ = zzVV.zzQ(zzzox);
                    if (com.aspose.words.internal.zzZYD.zzXk(zzvvZzQ.getPath())) {
                        com.aspose.words.internal.zzZQF.zzY(map, zzvvZzQ.getPath(), zzvvZzQ);
                        String path = zzvvZzQ.getPath();
                        int i2 = com.aspose.words.internal.zzZOF.ORDINAL$4894b8c8;
                        if (com.aspose.words.internal.zzZKN.zzW(path, ".html", i2) || com.aspose.words.internal.zzZKN.zzW(zzvvZzQ.getPath(), ".htm", i2)) {
                            i++;
                        }
                    }
                }
                iZz1t = zzvmZzL.zz1d();
            }
        }
        return new zzVW(map, i);
    }

    public final int zz1A() {
        return this.zzZx5;
    }

    public final zzVV zzT1(String str) {
        Ref ref = new Ref(null);
        boolean z = (com.aspose.words.internal.zzZYD.zzXk(str) && com.aspose.words.internal.zzZQF.zzZ(this.zzZx4, str, ref)) ? false : true;
        zzVV zzvv = (zzVV) ref.get();
        if (z) {
            return null;
        }
        return zzvv;
    }

    public final boolean zzT2(String str) {
        return zzT1(str) != null;
    }
}
