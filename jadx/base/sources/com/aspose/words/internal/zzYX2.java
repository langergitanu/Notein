package com.aspose.words.internal;

import com.aspose.words.internal.zzZ4M;
import java.io.OutputStream;
import java.security.SecureRandom;

/* JADX INFO: loaded from: classes5.dex */
abstract class zzYX2<T extends zzZ4M> implements zzZ44<T> {

    public class zzZ implements zzZ4U<T>, zzZ50<zzZ4U<T>> {
        private final zzYUE zzW5L;
        private final zzZ46 zzW5O;
        private final T zzWil;

        public zzZ(zzZ46 zzz46, T t, SecureRandom secureRandom) {
            this.zzW5O = zzz46;
            this.zzWil = t;
            this.zzW5L = zzYX2.this.zzY(true, zzz46, t);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // com.aspose.words.internal.zzZ50
        /* JADX INFO: renamed from: zzS, reason: merged with bridge method [inline-methods] */
        public zzZ4U<T> zzX(SecureRandom secureRandom) {
            return new zzZ(this.zzW5O, this.zzWil, secureRandom);
        }

        @Override // com.aspose.words.internal.zzZ4U
        public final zzZ5N zzR(OutputStream outputStream) {
            return new zzYU7(outputStream, this.zzW5L);
        }

        @Override // com.aspose.words.internal.zzZ4X
        public final T zzXH6() {
            return this.zzWil;
        }

        @Override // com.aspose.words.internal.zzZ4X
        public final int zzfY(int i) {
            return i;
        }

        @Override // com.aspose.words.internal.zzZ4X
        public final int zzfZ(int i) {
            return i;
        }
    }

    public zzYX2() {
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
        final zzYUE zzyueZzY = zzY(false, zzz46, t);
        return (zzZ4W<T>) new zzZ4W<T>() { // from class: com.aspose.words.internal.zzYX2.1
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.aspose.words.internal.zzZ4W
            /* JADX INFO: renamed from: zzQ, reason: merged with bridge method [inline-methods] */
            public zzYU7 zzS(OutputStream outputStream) {
                return new zzYU7(outputStream, zzyueZzY);
            }

            @Override // com.aspose.words.internal.zzZ4X
            public final T zzXH6() {
                return (T) t;
            }

            @Override // com.aspose.words.internal.zzZ4X
            public final int zzfY(int i) {
                return i;
            }

            @Override // com.aspose.words.internal.zzZ4X
            public final int zzfZ(int i) {
                return i;
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

    public abstract zzYUE zzY(boolean z, zzZ46 zzz46, T t);
}
