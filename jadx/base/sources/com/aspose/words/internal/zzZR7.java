package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZR7 extends zzZR9<zzZR8> {

    public static class zzZ {
        private int maxWidth;
        private zzGQ zz3J;
        private long zz3M;
        private boolean zz3N;
        private boolean zz3O;
        private Integer zz3P;
        private double zz3L = 96.0d;
        private double zz3K = 96.0d;

        private static void zzV(String str, long j) {
            if (j < 0) {
                throw new IllegalArgumentException(String.format("Parameter %s should be non-negative but %d received", str, Long.valueOf(j)));
            }
        }

        public final zzZ zzW(Integer num) {
            this.zz3P = num;
            return this;
        }

        public final zzZ zzYO(long j) {
            zzV("scaledSize", j);
            this.zz3M = j;
            return this;
        }

        public final zzZ zzZ(zzGQ zzgq) {
            this.zz3J = zzgq;
            return this;
        }

        public final zzZ zzZa(boolean z) {
            this.zz3N = z;
            return this;
        }

        public final zzZ zzZn(double d) {
            this.zz3K = d;
            return this;
        }

        public final zzZ zzZo(double d) {
            this.zz3L = d;
            return this;
        }

        public final long zzlA() {
            return this.zz3M;
        }

        public final boolean zzlB() {
            return this.zz3N;
        }

        public final boolean zzlC() {
            return this.zz3O;
        }

        public final Integer zzlD() {
            return this.zz3P;
        }

        public final double zzlv() {
            return this.zz3K;
        }

        public final double zzlw() {
            return this.zz3L;
        }

        public final zzGQ zzlx() {
            return this.zz3J;
        }

        public final zzZ zzly() {
            zzV("maxWidth", 2048L);
            this.maxWidth = 2048;
            return this;
        }

        public final int zzlz() {
            return this.maxWidth;
        }
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public final zzZR8 zzlE() {
        if (this.zz3T.isEmpty()) {
            this.zz3T.add(new zzZR4());
        }
        return (zzZR8) zzlH();
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public final zzZR7 zzlF() {
        this.zz3T.add(new zzEM());
        return this;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public final zzZR7 zzlG() {
        this.zz3T.add(new zzZR4());
        return this;
    }
}
