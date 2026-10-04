package com.aspose.words.internal;

import com.microsoft.identity.common.java.telemetry.TelemetryEventStrings;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public class zzO {
    private zzZOP zz0;
    private boolean zzZY;
    private zzZL1 zzZZ;

    public zzO(zzZOP zzzop) throws Exception {
        this(zzzop, true, false);
    }

    private String zz4() {
        return this.zzZY ? this.zzZZ.getName() : this.zzZZ.getLocalName();
    }

    public static boolean zzN(String str) {
        return "1".equals(str) || TelemetryEventStrings.Value.TRUE.equals(str) || "t".equals(str);
    }

    public final String getLocalName() {
        return this.zzZZ.getLocalName();
    }

    public final String getName() {
        return this.zzZZ.getName();
    }

    public final String getNamespaceURI() {
        return this.zzZZ.getNamespaceURI();
    }

    public final int getNodeType() {
        return this.zzZZ.getNodeType();
    }

    public final String getPrefix() {
        return this.zzZZ.getPrefix();
    }

    public final String getValue() {
        return this.zzZZ.getValue();
    }

    public final String readString() {
        return this.zzZZ.readString();
    }

    public final zzZOP zz5() {
        return this.zz0;
    }

    public final zzZL1 zz6() {
        return this.zzZZ;
    }

    public final int zz7() {
        return (int) (zzJB.zzZf(this.zzZZ.getValue()) & 4294967295L);
    }

    public boolean zz8() {
        return zzN(this.zzZZ.getValue());
    }

    public final double zz9() {
        return zzJB.parseDouble(this.zzZZ.getValue());
    }

    public final String zzM(String str) {
        return this.zzZZ.zzM(str);
    }

    public final int zzO(String str) {
        String strZzV = zzV(str, null);
        if (strZzV != null) {
            return zzJB.zzZt(strZzV);
        }
        return 0;
    }

    public final boolean zzP(String str) {
        return this.zzZZ.getNodeType() == 2 && zzZKN.equals(zz4(), str);
    }

    public final boolean zzQ(String str) {
        return zzY(str, 0);
    }

    public final String zzS(boolean z) {
        return (z ? this.zzZZ.readString().replace("\r", "") : this.zzZZ.readString()).replace("_x000d_", "\r").replace("_x000D_", "\r").replace("_x000b_", "\u000b").replace("_x000B_", "\u000b");
    }

    public final boolean zzT(boolean z) {
        while (this.zzZZ.zzi()) {
            if (!"xmlns".equals(this.zzZZ.getPrefix()) || !z) {
                return true;
            }
        }
        return false;
    }

    public final String zzV(String str, String str2) {
        while (true) {
            if (!this.zzZZ.zzi()) {
                break;
            }
            if (zzZKN.equals(zz4(), str)) {
                str2 = this.zzZZ.getValue();
                break;
            }
        }
        this.zzZZ.zzj();
        return str2;
    }

    public final int zzX(String str, int i) {
        String strZzV = zzV(str, null);
        return strZzV != null ? zzJB.zzZv(strZzV) : i;
    }

    public final boolean zzY(String str, int i) {
        this.zzZZ.zzj();
        if (this.zzZZ.zzc() && zzZKN.equals(zz4(), str)) {
            return false;
        }
        while (this.zzZZ.read()) {
            int nodeType = this.zzZZ.getNodeType();
            if (nodeType == 1) {
                return true;
            }
            if (nodeType != 2) {
                if (nodeType != 3) {
                    if (nodeType != 4) {
                        if (nodeType != 6) {
                            if (nodeType != 9) {
                                if (nodeType != 12) {
                                    if (nodeType == 24 && (i & 2) != 0) {
                                        return true;
                                    }
                                }
                            } else if ((i & 16) != 0) {
                                return true;
                            }
                        } else if ((i & 4) != 0) {
                            return true;
                        }
                    }
                    if ((i & 1) != 0) {
                        return true;
                    }
                } else if ((i & 8) != 0) {
                    return true;
                }
            } else if (zzP(str)) {
                return false;
            }
        }
        return false;
    }

    public final double zzZ(String str, double d) {
        String strZzV = zzV(str, null);
        return strZzV != null ? zzJB.parseDouble(strZzV) : d;
    }

    public final int zza() {
        return zzJB.zzZt(this.zzZZ.getValue());
    }

    public final int zzb() {
        return zzJB.zzZv(this.zzZZ.getValue());
    }

    public final boolean zzc() {
        return this.zzZZ.zzc();
    }

    public final void zzd() {
        this.zzZZ.read();
        this.zzZZ.read();
        if (zzP(this.zzZZ.getLocalName())) {
            return;
        }
        this.zzZZ.read();
    }

    public final Map<String, String> zze() {
        HashMap map = new HashMap();
        while (this.zzZZ.zzi()) {
            if ("xmlns".equals(this.zzZZ.getPrefix())) {
                zzZQF.zzY(map, this.zzZZ.getLocalName(), this.zzZZ.getValue());
            }
        }
        this.zzZZ.zzj();
        return map;
    }

    public final String zzf() {
        return zzZ((zzEY) null, (zzZSO) null);
    }

    public final boolean zzg() {
        return zzJB.zzZb(this.zzZZ.readString());
    }

    public final int zzh() {
        return zzJB.zzZv(this.zzZZ.readString());
    }

    public final boolean zzi() {
        return zzT(true);
    }

    public final boolean zzj() {
        return this.zzZZ.zzj();
    }

    public void zzk() {
        this.zzZZ.zzj();
        if (this.zzZZ.zzc()) {
            return;
        }
        String strZz4 = zz4();
        while (!zzP(strZz4)) {
            this.zzZZ.read();
            if (this.zzZZ.getNodeType() == 1) {
                this.zzZZ.zzfo();
            }
        }
    }

    public zzO(zzZOP zzzop, boolean z, boolean z2) throws Exception {
        this.zzZY = z2;
        zzzop.zzH(0L);
        zzZL1 zzzl1ZzZS = zzZSN.zzZS(zzzop);
        this.zzZZ = zzzl1ZzZS;
        if (z) {
            zzzl1ZzZS.zzfp();
        }
        this.zz0 = zzzop;
    }

    public final boolean zzX(String str, boolean z) {
        String strZzV = zzV(str, null);
        return strZzV == null ? z : zzN(strZzV);
    }

    public final zzZOZ zzZ(String str, zzZOZ zzzoz) {
        String strZzV = zzV(str, null);
        return zzZYD.zzXk(strZzV) ? new zzZOZ(strZzV) : zzzoz;
    }

    public final String zzZ(zzEY zzey, zzZSO zzzso) {
        String strZzZ = zzZSN.zzZ(this.zzZZ, zzey, zzzso);
        while (true) {
            if (this.zzZZ.getNodeType() != 6 && this.zzZZ.getNodeType() != 4 && this.zzZZ.getNodeType() != 5 && this.zzZZ.getNodeType() != 24) {
                return strZzZ;
            }
            this.zzZZ.read();
        }
    }

    public zzO(zzZOP zzzop, boolean z) throws Exception {
        this(zzzop, z, false);
    }

    public zzO(String str, Map<String, String> map, boolean z) {
        zzZL1 zzzl1ZzZ = zzZSN.zzZ(str, map);
        this.zzZZ = zzzl1ZzZ;
        zzzl1ZzZ.zzfp();
        this.zzZY = z;
    }

    public zzO(String str, Map<String, String> map) {
        this(str, map, false);
    }
}
