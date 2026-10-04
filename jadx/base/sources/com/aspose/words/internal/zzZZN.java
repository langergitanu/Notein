package com.aspose.words.internal;

import android.graphics.Rect;
import android.graphics.RegionIterator;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZZN {

    public static class zzZ implements zzH1 {
        private zzZQ3 zzd8;

        private zzZ() {
        }

        @Override // com.aspose.words.internal.zzH1
        public final void zzFC() {
            zzZQ3 zzzq3 = new zzZQ3();
            this.zzd8 = zzzq3;
            zzzq3.zzkt();
        }

        @Override // com.aspose.words.internal.zzH1
        public final void zzFD() {
            zzZQ3 zzzq3 = new zzZQ3();
            this.zzd8 = zzzq3;
            zzzq3.zzks();
        }

        public final zzZQ3 zzS(zzON zzon) {
            try {
                zzon.zzZ(this);
                return this.zzd8;
            } catch (Exception unused) {
                zzZQ3 zzzq3 = this.zzd8;
                if (zzzq3 != null) {
                    zzzq3.close();
                }
                return this.zzd8;
            }
        }

        @Override // com.aspose.words.internal.zzH1
        public final void zzZ(zzOJ zzoj) {
            this.zzd8 = new zzZQ3(zzoj.zzOw());
        }

        public /* synthetic */ zzZ(byte b) {
            this();
        }

        @Override // com.aspose.words.internal.zzH1
        public final void zzZ(zzOX zzox) {
            this.zzd8 = new zzZQ3(zz6K.zzE(zzox.zzUu()));
        }

        @Override // com.aspose.words.internal.zzH1
        public final void zzZ(zzOM zzom) {
            zzZQ3 zzzq3ZzS = zzS(zzom.zzNj());
            try {
                this.zzd8 = zzS(zzom.zzNk());
                int iZzNi = zzom.zzNi();
                if (iZzNi == 1) {
                    this.zzd8.zzY(zzzq3ZzS);
                } else if (iZzNi == 2) {
                    this.zzd8.zzV(zzzq3ZzS);
                } else if (iZzNi == 3) {
                    this.zzd8.zzU(zzzq3ZzS);
                } else if (iZzNi == 4) {
                    this.zzd8.zzX(zzzq3ZzS);
                } else if (iZzNi == 5) {
                    this.zzd8.zzW(zzzq3ZzS);
                }
            } finally {
                if (zzzq3ZzS != null) {
                    zzzq3ZzS.close();
                }
            }
        }
    }

    private static zzZQ3 zzT(zzON zzon) {
        return new zzZ((byte) 0).zzS(zzon);
    }

    public static zzP8 zzU(zzON zzon) {
        try {
            return zzZ(zzT(zzon));
        } catch (Exception unused) {
            return null;
        }
    }

    private static zzP8 zzZ(zzZQ3 zzzq3) {
        zzP8 zzp8 = new zzP8();
        RegionIterator regionIterator = new RegionIterator(zzzq3.zzkr());
        Rect rect = new Rect();
        while (regionIterator.next(rect)) {
            zzp8.zzO7().add(zzP5.zzK(new zzZQ4(rect.left, rect.top, rect.width(), rect.height())));
        }
        return zzp8;
    }
}
