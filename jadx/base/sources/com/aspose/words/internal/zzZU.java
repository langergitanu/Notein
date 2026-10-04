package com.aspose.words.internal;

import com.aspose.words.Cluster;
import java.util.Iterator;

/* JADX INFO: loaded from: classes5.dex */
public class zzZU extends zzZL implements zzHR, zzHT, zzHU {
    private boolean zzYQ;
    private Cluster[] zzYR;
    private boolean zzYS;
    private float zzYT;
    private zzZR zzYU;
    private long zzYV;
    private zzPV zzYW;
    private zzPM zzYX;
    private zzP8 zzZC;
    private zzP9 zzZD;
    private long zzZN;
    private zzPV zzZf;
    private String zzZi;

    public zzZU(zzPM zzpm, zzPY zzpy, long j, String str) {
        this(zzpm, zzpy instanceof zzOI ? ((zzOI) zzpy).zzZy() : zzPV.zzKa, zzPV.zzHZ, j, str, 0.0f);
    }

    public final void clearText() {
        this.zzYR = new Cluster[0];
        this.zzZi = "";
        this.zzYV = 0L;
    }

    public final long getSize() {
        return this.zzYV;
    }

    public final String getText() {
        return this.zzZi;
    }

    public final boolean isHidden() {
        return this.zzYQ;
    }

    public final void setSize(long j) {
        this.zzYV = j;
    }

    @Override // com.aspose.words.internal.zzZL
    public final zzZL zz1() {
        zzZU zzzu = (zzZU) super.zz1();
        zzP9 zzp9 = this.zzZD;
        if (zzp9 != null) {
            zzzu.zzZD = zzp9.zzOh();
        }
        zzP8 zzp8 = this.zzZC;
        if (zzp8 != null) {
            zzzu.zzZC = zzp8.zzO8();
        }
        zzPM zzpm = this.zzYX;
        if (zzpm != null) {
            zzzu.zzYX = new zzPM(zzpm.zzPg(), this.zzYX.zzPk(), this.zzYX.zzPl());
        }
        Cluster[] clusterArr = this.zzYR;
        if (clusterArr != null) {
            zzzu.zzYR = new Cluster[clusterArr.length];
            int i = 0;
            while (true) {
                Cluster[] clusterArr2 = this.zzYR;
                if (i >= clusterArr2.length) {
                    break;
                }
                zzzu.zzYR[i] = clusterArr2[i].deepClone();
                i++;
            }
        }
        return zzzu;
    }

    @Override // com.aspose.words.internal.zzHR
    public final void zzW(zzP9 zzp9) {
        this.zzZD = zzp9;
    }

    public final void zzX(zzPV zzpv) {
        this.zzYW = zzpv;
    }

    public final void zzY(zzPV zzpv) {
        this.zzZf = zzpv;
    }

    @Override // com.aspose.words.internal.zzZL
    public final void zzZ(zz6 zz6Var) throws Exception {
        zz6Var.zzZ(this);
    }

    public final long zzZE() {
        return zzZPY.zzG(Float.intBitsToFloat((int) this.zzZN), zzZo());
    }

    @Override // com.aspose.words.internal.zzHU
    public final zzP8 zzZN() {
        return this.zzZC;
    }

    @Override // com.aspose.words.internal.zzHR, com.aspose.words.internal.zzHU
    public final zzP9 zzZO() {
        return this.zzZD;
    }

    public final long zzZT() {
        return this.zzZN;
    }

    public final Cluster[] zzZh() {
        return this.zzYR;
    }

    public final void zzZi() {
        float ascentPoints = this.zzYX.getAscentPoints();
        float descentPoints = this.zzYX.getDescentPoints() / 2.0f;
        zzP9 zzp9 = this.zzZD;
        zzP9 zzp92 = zzp9 == null ? new zzP9() : zzp9.getLocked() ? this.zzZD.zzOh() : this.zzZD;
        zzp92.zzY(ascentPoints, descentPoints, 0);
        zzp92.zzZ(270.0f, this.zzZN, 0);
        zzp92.lock();
        this.zzZD = zzp92;
    }

    public final zzZQ4 zzZj() {
        return new zzZQ4(zzZm(), zzZo(), Float.intBitsToFloat((int) this.zzYV), zzZPW.zzYz(this.zzYV));
    }

    public final float zzZk() {
        return this.zzYT;
    }

    public final zzZR zzZl() {
        return this.zzYU;
    }

    public final float zzZm() {
        return Float.intBitsToFloat((int) this.zzZN);
    }

    public final float zzZn() {
        return this.zzYX.getDescentPoints() + zzZPY.zzYC(this.zzZN);
    }

    public final float zzZo() {
        return zzZPY.zzYC(this.zzZN) - this.zzYX.getAscentPoints();
    }

    public final String zzZp() {
        if (this.zzYS && this.zzZi.length() > 0) {
            if (zzUX.zzN(this.zzZi.charAt(0))) {
                zzDB zzdb = new zzDB();
                Iterator<Integer> it = new zzZYE(this.zzZi).iterator();
                while (it.hasNext()) {
                    int iIntValue = it.next().intValue();
                    zzdb.add(iIntValue);
                    if (zzZVS.zzS3(iIntValue)) {
                        zzZVU.zzc((char) iIntValue);
                    }
                }
                zzdb.reverse();
                StringBuilder sb = new StringBuilder();
                for (int i = 0; i < zzdb.getCount(); i++) {
                    zzZNH.zzU(sb, zzZVS.zzS7(zzdb.get(i)));
                }
                return sb.toString();
            }
        }
        return this.zzZi;
    }

    public final zzPV zzZq() {
        return this.zzYW;
    }

    public final zzPM zzZr() {
        return this.zzYX;
    }

    public final zzP9 zzZs() {
        zzP9 zzp9 = new zzP9();
        zzp9.zzY(Float.intBitsToFloat((int) this.zzZN), zzZPY.zzYC(this.zzZN), 0);
        zzp9.zzZ(new zzP9(1.0f, 0.0f, -0.34906584f, 1.0f, 0.0f, 0.0f), 0);
        zzp9.zzY(-Float.intBitsToFloat((int) this.zzZN), -zzZPY.zzYC(this.zzZN), 0);
        return zzp9;
    }

    public final zzPV zzZy() {
        return this.zzZf;
    }

    public final boolean zzZz() {
        return this.zzYS;
    }

    public final void zzY(long j) {
        this.zzZN = j;
    }

    @Override // com.aspose.words.internal.zzHT
    public final void zzZ(zzP8 zzp8) {
        this.zzZC = zzp8;
    }

    public zzZU(zzPM zzpm, zzPV zzpv, zzPV zzpv2, long j, String str, float f) {
        this(zzpm, zzpv, zzpv2, j, str, zzpm.zz6(str), f);
    }

    public final void zzZ(zzZR zzzr) {
        this.zzYU = zzzr;
    }

    public zzZU(zzPM zzpm, zzPV zzpv, zzPV zzpv2, long j, String str, long j2, float f) {
        this(zzpm, zzpv, zzpv2, j, str, j2, f, false);
    }

    public zzZU(zzPM zzpm, zzPV zzpv, zzPV zzpv2, long j, String str, long j2, float f, boolean z) {
        this(zzpm, zzpv, zzpv2, j, str, j2, f, z, null);
    }

    public zzZU(zzPM zzpm, zzPV zzpv, zzPV zzpv2, long j, String str, long j2, float f, boolean z, Cluster[] clusterArr) {
        this(zzpm, zzpv, zzpv2, j, str, j2, f, z, clusterArr, false);
    }

    public zzZU(zzPM zzpm, zzPV zzpv, zzPV zzpv2, long j, String str, long j2, float f, boolean z, Cluster[] clusterArr, boolean z2) {
        this.zzZN = 0L;
        this.zzYV = 0L;
        if (zzpm == null) {
            throw new NullPointerException("Value cannot be null.\r\nParameter name: font");
        }
        if (zzpv == null) {
            throw new NullPointerException("Value cannot be null.\r\nParameter name: color");
        }
        if (zzpv2 == null) {
            throw new NullPointerException("Value cannot be null.\r\nParameter name: outlineColor");
        }
        if (str != null) {
            this.zzYX = zzpm;
            this.zzZf = zzpv;
            this.zzYW = zzpv2;
            this.zzZN = j;
            this.zzZi = zzpm.zzPl().zzWU(str);
            this.zzYV = j2;
            this.zzYT = f;
            this.zzYS = z;
            this.zzYR = clusterArr;
            this.zzYQ = z2;
            return;
        }
        throw new NullPointerException("Value cannot be null.\r\nParameter name: text");
    }
}
