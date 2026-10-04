package com.aspose.words.internal;

import com.aspose.words.internal.zzZ4M;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes5.dex */
abstract class zzYXE<T extends zzZ4M> implements zzZ5Z<T> {

    public class zzY implements zzZ4Y<T> {
        private final zzYTS zzWiJ;
        private final T zzWil;

        public zzY(zzZ46 zzz46, T t) {
            this.zzWil = t;
            this.zzWiJ = zzYXE.this.zzZ(true, zzz46, t);
        }

        @Override // com.aspose.words.internal.zzZ4U
        public final zzZ5N zzR(OutputStream outputStream) {
            return new zzYU7(outputStream, this.zzWiJ);
        }

        @Override // com.aspose.words.internal.zzZ4X
        public final T zzXH6() {
            return this.zzWil;
        }

        @Override // com.aspose.words.internal.zzZ60
        public final zzZ41 zzXH7() {
            return new zzZ(this.zzWiJ);
        }

        @Override // com.aspose.words.internal.zzZ4X
        public final int zzfY(int i) {
            return this.zzWiJ.zzfY(i);
        }

        @Override // com.aspose.words.internal.zzZ4X
        public final int zzfZ(int i) {
            return this.zzWiJ.getOutputSize(i);
        }
    }

    public class zzZ extends zzZ41 {
        private zzYTS zzWiJ;

        public zzZ(zzYTS zzyts) {
            this.zzWiJ = zzyts;
        }

        @Override // java.io.OutputStream
        public final void write(byte[] bArr, int i, int i2) throws IOException {
            this.zzWiJ.zzq(bArr, i, i2);
        }

        @Override // java.io.OutputStream
        public final void write(int i) throws IOException {
            this.zzWiJ.zzc((byte) i);
        }
    }

    public zzYXE() {
        zzZ0L.isReady();
        if (zzZ5L.zzXH0()) {
            throw new zzZ0H("Attempt to create unapproved factory in approved only mode.");
        }
    }

    @Override // com.aspose.words.internal.zzZ5Z
    public final zzZ4Z<T> zzY(zzZ46 zzz46, final T t) {
        if (zzZ5L.zzXH0()) {
            throw new zzZ0H("Attempt to create unapproved algorithm in approved only mode", t.zzXGV());
        }
        final zzYTS zzytsZzZ = zzZ(false, zzz46, t);
        return (zzZ4Z<T>) new zzZ4Z<T>() { // from class: com.aspose.words.internal.zzYXE.1
            @Override // com.aspose.words.internal.zzZ4W
            public final zzZ5N zzS(OutputStream outputStream) {
                return new zzYU7(outputStream, zzytsZzZ);
            }

            @Override // com.aspose.words.internal.zzZ4X
            public final T zzXH6() {
                return (T) t;
            }

            @Override // com.aspose.words.internal.zzZ60
            public final zzZ41 zzXH7() {
                return new zzZ(zzytsZzZ);
            }

            @Override // com.aspose.words.internal.zzZ4X
            public final int zzfY(int i) {
                return zzytsZzZ.zzfY(i);
            }

            @Override // com.aspose.words.internal.zzZ4X
            public final int zzfZ(int i) {
                return zzytsZzZ.getOutputSize(i);
            }
        };
    }

    public abstract zzYTS zzZ(boolean z, zzZ46 zzz46, T t);

    @Override // com.aspose.words.internal.zzZ5Z
    public final zzZ4Y<T> zzZ(zzZ46 zzz46, T t) {
        if (zzZ5L.zzXH0()) {
            throw new zzZ0H("Attempt to create unapproved algorithm in approved only mode", t.zzXGV());
        }
        return new zzY(zzz46, t);
    }
}
