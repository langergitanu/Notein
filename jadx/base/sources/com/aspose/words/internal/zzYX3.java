package com.aspose.words.internal;

import com.aspose.words.internal.zzZ4M;
import java.io.OutputStream;
import java.security.SecureRandom;

/* JADX INFO: loaded from: classes5.dex */
abstract class zzYX3<T extends zzZ4M> implements zzZ44<T> {

    public class zzZ implements zzZ4U<T>, zzZ50<zzZ4U<T>> {
        private final zzZ46 zzW5O;
        private final T zzWil;
        private final zzYV5 zzWit;

        public zzZ(zzZ46 zzz46, T t, SecureRandom secureRandom) {
            this.zzW5O = zzz46;
            this.zzWil = t;
            this.zzWit = zzYX3.this.zzZ(true, zzz46, t, secureRandom);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // com.aspose.words.internal.zzZ50
        /* JADX INFO: renamed from: zzS, reason: merged with bridge method [inline-methods] */
        public zzZ4U<T> zzX(SecureRandom secureRandom) {
            return new zzZ(this.zzW5O, this.zzWil, secureRandom);
        }

        @Override // com.aspose.words.internal.zzZ4U
        public final zzZ5N zzR(OutputStream outputStream) {
            return this.zzWit.zzXCK() instanceof zzYUE ? new zzYU7(outputStream, (zzYUE) this.zzWit.zzXCK()) : new zzYU7(outputStream, this.zzWit);
        }

        @Override // com.aspose.words.internal.zzZ4X
        public final T zzXH6() {
            return this.zzWil;
        }

        @Override // com.aspose.words.internal.zzZ4X
        public final int zzfY(int i) {
            return this.zzWit.zzfY(i);
        }

        @Override // com.aspose.words.internal.zzZ4X
        public final int zzfZ(int i) {
            return this.zzWit.getOutputSize(i);
        }
    }

    public zzYX3() {
        zzZ0L.isReady();
        if (zzZ5L.zzXH0()) {
            throw new zzZ0H("Attempt to create unapproved factory in approved mode");
        }
    }

    @Override // com.aspose.words.internal.zzZ44
    public final zzZ4W<T> zzW(zzZ46 zzz46, final T t) {
        if (zzZ5L.zzXH0()) {
            throw new zzZ0H("Attempt to create unapproved algorithm in approved mode", t.zzXGV());
        }
        final zzYV5 zzyv5ZzZ = zzZ(false, zzz46, t, null);
        return (zzZ4W<T>) new zzZ4W<T>() { // from class: com.aspose.words.internal.zzYX3.1
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.aspose.words.internal.zzZ4W
            /* JADX INFO: renamed from: zzQ, reason: merged with bridge method [inline-methods] */
            public zzYU7 zzS(OutputStream outputStream) {
                return zzyv5ZzZ.zzXCK() instanceof zzYUE ? new zzYU7(outputStream, (zzYUE) zzyv5ZzZ.zzXCK()) : new zzYU7(outputStream, zzyv5ZzZ);
            }

            @Override // com.aspose.words.internal.zzZ4X
            public final T zzXH6() {
                return (T) t;
            }

            @Override // com.aspose.words.internal.zzZ4X
            public final int zzfY(int i) {
                return zzyv5ZzZ.zzfY(i);
            }

            @Override // com.aspose.words.internal.zzZ4X
            public final int zzfZ(int i) {
                return zzyv5ZzZ.getOutputSize(i);
            }
        };
    }

    @Override // com.aspose.words.internal.zzZ44
    public final zzZ4U<T> zzX(zzZ46 zzz46, T t) {
        if (zzZ5L.zzXH0()) {
            throw new zzZ0H("Attempt to create unapproved algorithm in approved mode", t.zzXGV());
        }
        return new zzZ(zzz46, t, null);
    }

    public abstract zzYV5 zzZ(boolean z, zzZ46 zzz46, T t, SecureRandom secureRandom);
}
