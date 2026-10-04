package com.aspose.words.internal;

import com.aspose.words.Cluster;
import com.aspose.words.Glyph;
import java.util.HashMap;

/* JADX INFO: loaded from: classes5.dex */
abstract class zzZSK {
    private zzZS8 zz5O;
    private zzZSF zz5P;
    private zzZSI zz5Q;
    private int zz5W;
    private int zz5X;
    private String zz76;
    private zzF4 zzv;
    private zzZWJ zzxD = null;
    private StringBuilder zzdC = new StringBuilder();
    private zzER<zzZS9> zz5V = new zzER<>();
    private zzD3<byte[]> zz5U = new zzD3<>();
    private zzZYT<zzJO> zz5T = new zzZYT<>();
    private HashMap<String, String> zz5S = new HashMap<>();
    private HashMap<String, String> zz5R = new HashMap<>();
    private zzQR zzj8 = new zzQR();

    public zzZSK(String str, int i, zzF4 zzf4, boolean z) {
        if (zzf4 == null) {
            throw new NullPointerException("Value cannot be null.\r\nParameter name: warningCallback");
        }
        this.zz76 = str;
        this.zzv = zzf4;
        this.zz5O = new zzZS8(i, zzf4);
        this.zz5Q = zzZSI.zzZd(z);
        this.zz5P = zzZSF.zzZc(z);
    }

    private zzJO zzJ(zzZXH zzzxh) throws Exception {
        String strZzL = zzL(zzzxh);
        zzJO zzjo = (zzJO) zzQW.zzZ((zzZYT) this.zz5T, strZzL);
        if (zzjo != null) {
            return zzjo;
        }
        zzJO zzjoZzpn = zzzxh.zzpn();
        this.zz5T.set(strZzL, zzjoZzpn);
        return zzjoZzpn;
    }

    private static String zzV(int i, zzZXH zzzxh) {
        return zzJB.zzr((i * 100.0f) / zzzxh.zzpO());
    }

    private byte[] zzYY(byte[] bArr) throws Exception {
        int iHashCode = bArr.hashCode();
        byte[] bArr2 = this.zz5U.get(iHashCode);
        if (bArr2 != null) {
            return bArr2;
        }
        byte[] bArrZzZW = this.zz5O.zzZW(bArr);
        this.zz5U.set(iHashCode, bArrZzZW);
        return bArrZzZW;
    }

    private int zzmp() {
        int i = this.zz5W + 1;
        this.zz5W = i;
        return i;
    }

    public final zzZWJ zzG9() {
        if (this.zzxD == null) {
            this.zzxD = new zzZWJ();
        }
        return this.zzxD;
    }

    public String zzK(zzZXH zzzxh) throws Exception {
        return zzL(zzzxh);
    }

    public String zzL(zzZXH zzzxh) throws Exception {
        String str = (String) zzQW.zzZ(this.zz5S, zzzxh.zzpw());
        if (str != null) {
            return str;
        }
        String strZzW6 = zzW6(zzZKN.format("{0}.{1}", zzZZS.zzY(zzzxh.zzpw()).toString("D"), zzmC() ? "odttf" : "ttf"));
        zzZQF.zzY(this.zz5S, zzzxh.zzpw(), strZzW6);
        return strZzW6;
    }

    public zzZS9 zzR(byte[] bArr, zzEP zzep) throws Exception {
        byte[] bArrZzYY = zzYY(bArr);
        zzZS9 zzzs9ZzY = this.zz5V.zzY(bArrZzYY, zzep);
        if (zzzs9ZzY != null) {
            return zzzs9ZzY;
        }
        byte[] bArrZzW = this.zz5O.zzW(bArrZzYY, zzep);
        zzZS9 zzzs9 = new zzZS9(zzYZ(bArrZzW), zzEF.zzZT(bArrZzW), bArrZzW);
        this.zz5V.zzZ(bArrZzYY, zzep, zzzs9);
        return zzzs9;
    }

    public final void zzT(int i, String str) {
        this.zzv.zzZ(i, 4, str);
    }

    public final String zzW6(String str) {
        return zzZVR.zz3(this.zz76, str);
    }

    public final String zzW7(String str) {
        String str2 = (String) zzQW.zzZ(this.zz5R, str);
        if (str2 != null) {
            return str2;
        }
        int i = this.zz5X;
        this.zz5X = i + 1;
        String str3 = zzZKN.format("bookmark_{0}", Integer.valueOf(i));
        this.zz5R.put(str, str3);
        return str3;
    }

    public String zzYZ(byte[] bArr) throws Exception {
        return zzW6(zzZKN.format("image{0}.{1}", Integer.valueOf(zzmp()), zzKE.zzWX(zzEF.zzZU(bArr))));
    }

    public final void zzZ(zzZXH zzzxh, Cluster[] clusterArr) throws Exception {
        zzJO zzjoZzJ = zzJ(zzzxh);
        for (Cluster cluster : clusterArr) {
            for (Glyph glyph : cluster.getGlyphs()) {
                int iZzWQ = zzjoZzJ.zzWQ(glyph.getGlyphIndex());
                if (cluster.getCodepoints().length == 1 && cluster.getGlyphs().length == 1) {
                    zzjoZzJ.zzg(cluster.getCodepoints()[0], iZzWQ);
                }
            }
        }
    }

    public abstract boolean zzmC();

    public void zzmD() throws Exception {
    }

    public final zzER<zzZS9> zzmk() {
        return this.zz5V;
    }

    public final zzZSF zzml() {
        return this.zz5P;
    }

    public final zzZSI zzmm() {
        return this.zz5Q;
    }

    public final zzZS8 zzmn() {
        return this.zz5O;
    }

    public final zzZYT<zzJO> zzmo() {
        return this.zz5T;
    }

    public final zzQR zzv9() {
        return this.zzj8;
    }

    public final String zzZ(zzZXH zzzxh, Cluster[] clusterArr, boolean z) throws Exception {
        zzJO zzjoZzJ = zzJ(zzzxh);
        StringBuilder sb = new StringBuilder();
        for (Cluster cluster : clusterArr) {
            zzZNH.zzU(sb, zzZ(cluster));
            for (Glyph glyph : cluster.getGlyphs()) {
                Integer num = zzjoZzJ.zzHn().get(glyph.getGlyphIndex());
                num.intValue();
                zzZNH.zzZ(sb, "{0},{1}{2};", num, zzV(zzZKQ.max(glyph.getAdvance(), (short) 0), zzzxh), zzZ(glyph, zzzxh, z));
            }
        }
        if (sb.length() > 0) {
            sb.setLength(sb.length() - 1);
        }
        return sb.toString();
    }

    private static String zzZ(Cluster cluster) {
        int i = 0;
        for (int i2 : cluster.getCodepoints()) {
            i = zzZVS.zzS4(i2) ? i + 2 : i + 1;
        }
        if (i == 1 && cluster.getGlyphs().length == 1) {
            return "";
        }
        return zzZKN.format("({0}:{1})", Integer.valueOf(i), Integer.valueOf(cluster.getGlyphs().length));
    }

    private static String zzZ(Glyph glyph, zzZXH zzzxh, boolean z) {
        if (glyph.getAdvanceOffset() == 0 && glyph.getAscenderOffset() == 0) {
            return "";
        }
        return zzZKN.format(",{0},{1}", zzV(z ? -glyph.getAdvanceOffset() : glyph.getAdvanceOffset(), zzzxh), zzV(glyph.getAscenderOffset(), zzzxh));
    }

    public final void zzZ(zzQR zzqr) {
        this.zzj8 = zzqr;
    }
}
