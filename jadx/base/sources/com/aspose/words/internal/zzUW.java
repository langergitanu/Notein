package com.aspose.words.internal;

import com.aspose.words.Cluster;
import com.aspose.words.Glyph;
import java.util.Iterator;

/* JADX INFO: loaded from: classes5.dex */
public final class zzUW {
    private zzD3<zzP8> zzSc;
    private zzDB zzSd;
    private boolean zzSe;
    private boolean zzSf;
    private zzPM zzYX;

    private zzUW(zzPM zzpm, zzDB zzdb, boolean z, boolean z2) throws Exception {
        this.zzYX = zzpm;
        this.zzSf = z;
        this.zzSe = z2;
        this.zzSd = zzdb;
        this.zzSc = zzUk();
    }

    private zzD3<zzP8> zzUi() throws Exception {
        zzD3<zzP8> zzd3ZzZ = new zzZXF().zzZ(this.zzYX.zzPl(), this.zzSd);
        for (int i = 0; i < this.zzSd.getCount(); i++) {
            int i2 = this.zzSd.get(i);
            if (zzd3ZzZ.zzVE(i2)) {
                zzP8 zzp8ZzD = zzd3ZzZ.get(i2);
                if (this.zzSf) {
                    zzp8ZzD = zz6G.zzY(zzp8ZzD, false);
                }
                if (this.zzSe) {
                    zzp8ZzD = zz6F.zzD(zzp8ZzD);
                }
                zzp8ZzD.zzY(zzZX2.zzR(this.zzYX.zzPg(), this.zzYX.zzPl().zzpO()));
                zzd3ZzZ.set(i2, zzp8ZzD);
            }
        }
        return zzd3ZzZ;
    }

    private String zzUj() {
        StringBuilder sb = new StringBuilder(this.zzSd.getCount());
        for (int i = 0; i < this.zzSd.getCount(); i++) {
            zzZNH.zzU(sb, zzZVS.zzS7(zzY(this.zzYX.zzPl(), this.zzSd.get(i))));
        }
        return sb.toString();
    }

    private zzD3<zzP8> zzUk() throws Exception {
        if (!zzZ(this.zzYX.zzPl())) {
            zzUj();
            zzJX.zzHM();
        }
        return zzUi();
    }

    private static int zzY(zzZXH zzzxh, int i) {
        return zzzxh.zzpP().zzSt(i).zzZD();
    }

    private static zzDB zzZ(zzZXH zzzxh, String str) {
        zzDB zzdb = new zzDB(str.length());
        Iterator itOooO00o = OooO0OO.OooO00o(str);
        while (itOooO00o.hasNext()) {
            int iZzZ = zzZ(zzzxh, ((Integer) itOooO00o.next()).intValue());
            if (!zzdb.contains(iZzZ)) {
                zzdb.add(iZzZ);
            }
        }
        return zzdb;
    }

    private static zzDB zzZ7(int i) {
        zzDB zzdb = new zzDB();
        zzdb.add(i);
        return zzdb;
    }

    public final zzP8 zzZ8(int i) {
        zzP8 zzp8 = this.zzSc.get(i);
        if (zzp8 == null) {
            return null;
        }
        return zzp8.zzO8();
    }

    public final zzP8 zzZ9(int i) {
        return zzZ8(zzZ(this.zzYX.zzPl(), i));
    }

    public zzUW(zzZXH zzzxh, float f, int i) throws Exception {
        this(zzZ(zzzxh, f), zzZ7(i), false, false);
    }

    public zzUW(zzPM zzpm, String str, boolean z, boolean z2) throws Exception {
        this(zzpm, zzZ(zzpm.zzPl(), str), z, z2);
    }

    public zzUW(zzJO zzjo) throws Exception {
        this(zzZ(zzjo.zzPl(), 20480.0f), zzZ(zzjo), false, false);
    }

    public zzUW(zzPM zzpm, Cluster[] clusterArr) throws Exception {
        this(zzpm, zzZ(clusterArr), false, false);
    }

    private static zzDB zzZ(Cluster[] clusterArr) {
        zzDB zzdb = new zzDB(clusterArr.length);
        for (Cluster cluster : clusterArr) {
            for (Glyph glyph : cluster.getGlyphs()) {
                if (!zzdb.contains(glyph.getGlyphIndex())) {
                    zzdb.add(glyph.getGlyphIndex());
                }
            }
        }
        return zzdb;
    }

    public zzUW(zzZXH zzzxh, float f, String str) throws Exception {
        this(zzZ(zzzxh, f), zzZ(zzzxh, str), false, false);
    }

    private static zzDB zzZ(zzJO zzjo) {
        zzDB zzdb = new zzDB(zzjo.zzHn().getCount());
        for (int i = 0; i < zzjo.zzHn().getCount(); i++) {
            zzdb.add(zzjo.zzHn().zzT3(i));
        }
        return zzdb;
    }

    private static zzPM zzZ(zzZXH zzzxh, float f) {
        return new zzPM(f, zzzxh.getStyle(), zzzxh);
    }

    public static int zzZ(zzZXH zzzxh, int i) {
        return zzzxh.zzpP().zzSx(i).getGlyphIndex();
    }

    private static boolean zzZ(zzZXH zzzxh) {
        return !"DFKai-SB".equals(zzzxh.zzPh());
    }
}
