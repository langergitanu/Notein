package com.aspose.words.internal;

import com.aspose.words.internal.zzZ4M;
import com.aspose.words.internal.zzZ58;
import java.security.SecureRandom;

/* JADX INFO: loaded from: classes5.dex */
abstract class zzYXA<T extends zzZ4M, K extends zzZ58> implements zzZ55<T, K> {

    public class zzY implements zzZ53<T> {
        private final K zzW5R;
        private zzYUC zzW5T;
        private final T zzWil;
        private final SecureRandom zzWk5;
        private final zzZ5W zzWlz;

        public zzY(K k, T t, SecureRandom secureRandom) {
            this.zzWlz = t.zzXGV();
            this.zzW5R = k;
            this.zzWil = t;
            this.zzWk5 = secureRandom;
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // com.aspose.words.internal.zzZ50
        /* JADX INFO: renamed from: zzP, reason: merged with bridge method [inline-methods] */
        public zzZ53<T> zzX(SecureRandom secureRandom) {
            return new zzY(this.zzW5R, this.zzWil, secureRandom);
        }

        private void zzXDj() {
            if (this.zzW5T == null) {
                this.zzW5T = zzYXA.this.zzZ(true, this.zzW5R, this.zzWil, this.zzWk5);
            }
        }

        @Override // com.aspose.words.internal.zzZ54
        public final byte[] zzg(byte[] bArr, int i) {
            zzYVO.zzX(this.zzWlz);
            zzXDj();
            return this.zzW5T.zzv(bArr, 0, i);
        }
    }

    public class zzZ implements zzZ57<T> {
        private final zzYUC zzW5T;
        private final T zzWil;
        private final zzZ5W zzWlz;

        public zzZ(zzZ5W zzz5w, T t, zzYUC zzyuc) {
            this.zzWlz = zzz5w;
            this.zzWil = t;
            this.zzW5T = zzyuc;
        }

        @Override // com.aspose.words.internal.zzZ57
        public final byte[] zzh(byte[] bArr, int i) throws zzZ5B {
            zzYVO.zzX(this.zzWlz);
            try {
                return this.zzW5T.zzu(bArr, 0, i);
            } catch (Exception e) {
                throw new zzZ5B(OooOO0.OooO0OO.OooO0Oo(e, new StringBuilder("Unable to unwrap key: ")), e);
            }
        }
    }

    public zzYXA() {
        zzZ0L.isReady();
        if (zzZ5L.zzXH0()) {
            throw new zzZ0H("Attempt to create unapproved factory in approved only mode");
        }
    }

    @Override // com.aspose.words.internal.zzZ55
    public final zzZ57<T> zzY(K k, T t) {
        return new zzZ(t.zzXGV(), t, zzZ(false, k, t, null));
    }

    public abstract zzYUC zzZ(boolean z, K k, T t, SecureRandom secureRandom);

    @Override // com.aspose.words.internal.zzZ55
    public final zzZ54<T> zzZ(K k, T t) {
        return new zzY(k, t, null);
    }
}
