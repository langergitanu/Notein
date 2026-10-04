package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
public abstract class zzPL extends zzOG {
    private zzPI[] zzHx;
    private float[] zzHy;
    private float[] zzHz;

    public zzPL(int i) {
        super(i);
    }

    public final float[] zzON() {
        return this.zzHz;
    }

    public final float[] zzOO() {
        return this.zzHy;
    }

    public final zzPI[] zzOP() {
        return this.zzHx;
    }

    @Override // com.aspose.words.internal.zzOG, com.aspose.words.internal.zzPY
    public zzPY zzPI() {
        zzPL zzpl = (zzPL) super.zzPI();
        float[] fArr = this.zzHz;
        if (fArr != null) {
            zzpl.zzHz = (float[]) fArr.clone();
        }
        float[] fArr2 = this.zzHy;
        if (fArr2 != null) {
            zzpl.zzHy = (float[]) fArr2.clone();
        }
        zzPI[] zzpiArr = this.zzHx;
        if (zzpiArr != null) {
            zzpl.zzHx = new zzPI[zzpiArr.length];
            int i = 0;
            while (true) {
                zzPI[] zzpiArr2 = this.zzHx;
                if (i >= zzpiArr2.length) {
                    break;
                }
                zzpl.zzHx[i] = zzpiArr2[i].zzOF();
                i++;
            }
        }
        return zzpl;
    }

    public final void zzY(zzPI[] zzpiArr) {
        this.zzHx = zzpiArr;
    }

    public final void zzZ(float[] fArr) {
        this.zzHy = fArr;
    }

    public final void zzY(float[] fArr) {
        this.zzHz = fArr;
    }

    @Override // com.aspose.words.internal.zzPY
    public void zzZ(zzH5 zzh5) throws Exception {
        if (this.zzHx == null) {
            return;
        }
        int i = 0;
        while (true) {
            zzPI[] zzpiArr = this.zzHx;
            if (i >= zzpiArr.length) {
                return;
            }
            zzPI zzpi = zzpiArr[i];
            zzpi.zzY(zzh5.zzZ(zzpi.zzZy()));
            i++;
        }
    }
}
