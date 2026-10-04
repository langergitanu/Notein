package com.aspose.words.internal;

import android.graphics.Bitmap;
import com.google.common.primitives.UnsignedBytes;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZR5 extends zzZR9<zzZR6> {

    public static class zzZ {
        private Bitmap zz3C;
        private zzZQ5 zz3D;
        private Integer zz3I;
        private boolean zz3O;
        private byte zz3H = UnsignedBytes.MAX_POWER_OF_TWO;
        private Integer zz3G = 1;
        private Integer zz3F = 0;
        private Integer zz3E = 80;
        private double zz3L = 96.0d;
        private double zz3K = 96.0d;

        public final zzZ zzC(byte b) {
            this.zz3H = b;
            return this;
        }

        public final zzZ zzO(Bitmap bitmap) {
            this.zz3C = bitmap;
            return this;
        }

        public final zzZ zzR(zzZQ5 zzzq5) {
            this.zz3D = zzzq5;
            return this;
        }

        public final zzZ zzS(Integer num) {
            this.zz3G = num;
            return this;
        }

        public final zzZ zzT(Integer num) {
            this.zz3I = num;
            return this;
        }

        public final zzZ zzU(Integer num) {
            this.zz3E = num;
            return this;
        }

        public final zzZ zzV(Integer num) {
            this.zz3F = num;
            return this;
        }

        public final zzZ zzZ9(boolean z) {
            this.zz3O = z;
            return this;
        }

        public final zzZ zzZl(double d) {
            this.zz3K = d;
            return this;
        }

        public final zzZ zzZm(double d) {
            this.zz3L = d;
            return this;
        }

        public final Bitmap zzln() {
            return this.zz3C;
        }

        public final Integer zzlo() {
            return this.zz3G;
        }

        public final Integer zzlp() {
            return this.zz3I;
        }

        public final Integer zzlq() {
            return this.zz3E;
        }

        public final Integer zzlr() {
            return this.zz3F;
        }

        public final Byte zzls() {
            return Byte.valueOf(this.zz3H);
        }

        public final double zzlv() {
            return this.zz3K;
        }

        public final double zzlw() {
            return this.zz3L;
        }
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public final zzZR6 zzlt() {
        if (this.zz3T.isEmpty()) {
            this.zz3T.add(new zzZR3());
        }
        return (zzZR6) zzlH();
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public final zzZR5 zzlu() {
        this.zz3T.add(new zzZR3());
        return this;
    }
}
