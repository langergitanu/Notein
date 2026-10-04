package com.aspose.words.internal;

import com.aspose.words.internal.zzZ4M;
import java.security.SecureRandom;

/* JADX INFO: loaded from: classes5.dex */
abstract class zzYXC<T extends zzZ4M> implements zzZ5T<T> {

    public class zzZ implements zzZ48<T> {
        private final zzZ5V zzW5V;
        private zzYVC zzWeQ;
        private final T zzWil;
        private final SecureRandom zzWk5;

        public zzZ(zzZ5V zzz5v, T t, SecureRandom secureRandom) {
            this.zzW5V = zzz5v;
            this.zzWil = t;
            this.zzWk5 = secureRandom;
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // com.aspose.words.internal.zzZ50
        /* JADX INFO: renamed from: zzF, reason: merged with bridge method [inline-methods] */
        public zzZ48<T> zzX(SecureRandom secureRandom) {
            zzYVO.zzX(this.zzWil.zzXGV());
            return new zzZ(this.zzW5V, this.zzWil, secureRandom);
        }

        private zzYVC zzXDk() {
            if (this.zzWeQ == null) {
                this.zzWeQ = zzYXC.this.zzZ(this.zzW5V, this.zzWil, this.zzWk5);
            }
            return this.zzWeQ;
        }

        @Override // com.aspose.words.internal.zzZ4C
        public final int zzXGI() {
            zzYVO.zzX(this.zzWil.zzXGV());
            return zzXDk().zzXDX();
        }

        @Override // com.aspose.words.internal.zzZ4C
        public final int zzXGJ() {
            zzYVO.zzX(this.zzWil.zzXGV());
            zzYVC zzyvcZzXDk = zzXDk();
            return zzYXC.zzY(zzyvcZzXDk) ? zzyvcZzXDk.zzXDY() + 1 : zzyvcZzXDk.zzXDY();
        }

        @Override // com.aspose.words.internal.zzZ49
        public final byte[] zze(byte[] bArr, int i) throws zzZ4H {
            try {
                zzYVO.zzX(this.zzWil.zzXGV());
                return zzXDk().zzy(bArr, 0, i);
            } catch (Exception e) {
                throw new zzZ4H(OooOO0.OooO0OO.OooO0Oo(e, new StringBuilder("Unable to encrypt block: ")), e);
            }
        }
    }

    public zzYXC() {
        zzZ0L.isReady();
        if (zzZ5L.zzXH0()) {
            throw new zzZ0H("Attempt to create unapproved factory in approved only mode");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.aspose.words.internal.zzZ5T
    /* JADX INFO: renamed from: zzX, reason: merged with bridge method [inline-methods] */
    public zzZ48<T> zzZ(zzZ5V zzz5v, T t) {
        if (zzZ5L.zzXH0()) {
            throw new zzZ0H("Attempt to create unapproved algorithm in approved only mode", t.zzXGV());
        }
        return new zzZ(zzz5v, t, null);
    }

    public static boolean zzY(zzYVC zzyvc) {
        return ((zzyvc instanceof zzYU8) || (zzyvc instanceof zzYU9)) ? false : true;
    }

    public abstract zzYVC zzZ(zzZ5V zzz5v, T t, SecureRandom secureRandom);
}
