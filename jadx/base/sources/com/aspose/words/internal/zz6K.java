package com.aspose.words.internal;

import android.graphics.Path;
import com.aspose.words.internal.zzZIV;

/* JADX INFO: loaded from: classes5.dex */
public final class zz6K {

    public static class zzZ implements zzH2 {
        private boolean zzGx;
        private zzZQ8 zzlH;
        private final zzZIV.zzZ zzlG = new zzZIV.zzZ();
        private final zzZIV.zzZ zzlF = new zzZIV.zzZ();

        public zzZ(zzZQ8 zzzq8) {
            this.zzlH = zzzq8;
        }

        private static float zzb(float f) {
            if (f > -1.0E-6f && f < 0.0f) {
                return 0.0f;
            }
            if (f <= 0.0f || f >= 1.0E-6f) {
                return f;
            }
            return 0.0f;
        }

        private void zzwR() {
            double dAbs = Math.abs(this.zzlG.f51311y - this.zzlF.f51311y);
            double dAbs2 = Math.abs(this.zzlG.f51310x - this.zzlF.f51310x);
            if (dAbs < 0.1d && dAbs / dAbs2 < 0.001d) {
                this.zzlF.f51311y = this.zzlG.f51311y;
            }
            if (dAbs2 < 0.1d && dAbs2 / dAbs < 0.001d) {
                this.zzlF.f51310x = this.zzlG.f51310x;
            }
            zzZIV.zzZ zzz = this.zzlG;
            zzZIV.zzZ zzz2 = this.zzlF;
            zzz.f51310x = zzz2.f51310x;
            zzz.f51311y = zzz2.f51311y;
        }

        @Override // com.aspose.words.internal.zzH2
        public final boolean zzY(zzP5 zzp5) {
            if (this.zzGx || !zzp5.isClosed()) {
                return true;
            }
            this.zzlH.close();
            return true;
        }

        @Override // com.aspose.words.internal.zzH2
        public final boolean zzZ(zzP5 zzp5) {
            this.zzGx = true;
            return true;
        }

        @Override // com.aspose.words.internal.zzH2
        public final boolean zzZ(zzOS zzos) {
            if (zzos.zzNu().getCount() == 0) {
                return true;
            }
            long[] array = zzos.zzNu().toArray();
            for (long j : array) {
                if (this.zzGx) {
                    long j2 = array[0];
                    this.zzlF.f51310x = zzb(Float.intBitsToFloat((int) j2));
                    this.zzlF.f51311y = zzb(zzZPY.zzYC(j2));
                    zzZIV.zzZ zzz = this.zzlG;
                    zzZIV.zzZ zzz2 = this.zzlF;
                    zzz.f51310x = zzz2.f51310x;
                    zzz.f51311y = zzz2.f51311y;
                    this.zzlH.moveTo((float) zzz2.f51310x, (float) zzz2.f51311y);
                    this.zzGx = false;
                } else {
                    this.zzlF.f51310x = zzb(Float.intBitsToFloat((int) j));
                    this.zzlF.f51311y = zzb(zzZPY.zzYC(j));
                    zzwR();
                    zzZQ8 zzzq8 = this.zzlH;
                    zzZIV.zzZ zzz3 = this.zzlF;
                    zzzq8.lineTo((float) zzz3.f51310x, (float) zzz3.f51311y);
                }
            }
            return true;
        }

        @Override // com.aspose.words.internal.zzH2
        public final boolean zzZ(zzPZ zzpz) {
            float fZzb = zzb(Float.intBitsToFloat((int) zzpz.zzPX()));
            float fZzb2 = zzb(zzZPY.zzYC(zzpz.zzPX()));
            if (this.zzGx) {
                this.zzlH.moveTo(fZzb, fZzb2);
                this.zzGx = false;
            }
            this.zzlH.lineTo(fZzb, fZzb2);
            float fZzb3 = zzb(Float.intBitsToFloat((int) zzpz.zzPL()));
            float fZzb4 = zzb(zzZPY.zzYC(zzpz.zzPL()));
            float fZzb5 = zzb(Float.intBitsToFloat((int) zzpz.zzPK()));
            float fZzb6 = zzb(zzZPY.zzYC(zzpz.zzPK()));
            float fZzb7 = zzb(Float.intBitsToFloat((int) zzpz.zzPW()));
            float fZzb8 = zzb(zzZPY.zzYC(zzpz.zzPW()));
            this.zzlH.cubicTo(fZzb3, fZzb4, fZzb5, fZzb6, fZzb7, fZzb8);
            zzZIV.zzZ zzz = this.zzlG;
            zzz.f51310x = fZzb7;
            zzz.f51311y = fZzb8;
            return true;
        }
    }

    public static zzZQ8 zzE(zzP8 zzp8) {
        zzZQ8 zzzq8 = new zzZQ8();
        zzzq8.setFillType(zzp8.zzO6() == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
        try {
            zzp8.zzY(new zzZ(zzzq8));
            return zzzq8;
        } catch (Exception unused) {
            return null;
        }
    }
}
