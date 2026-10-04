package com.aspose.words.internal;

import com.aspose.words.internal.zzZ5Q;

/* JADX INFO: loaded from: classes5.dex */
abstract class zzYX9<T extends zzZ5Q> implements zzZ52<T> {
    public zzYX9() {
        zzZ0L.isReady();
        if (zzZ5L.zzXH0()) {
            throw new zzZ0H("Attempt to create unapproved factory in approved only mode");
        }
    }

    public abstract zzYUR zzY(zzZ46 zzz46, T t);

    @Override // com.aspose.words.internal.zzZ52
    public final zzZ4T<T> zzZ(zzZ46 zzz46, final T t) {
        if (zzZ5L.zzXH0()) {
            throw new zzZ0H("Attempt to create unapproved algorithm in approved only mode", t.zzXGV());
        }
        final zzYUR zzyurZzY = zzY(zzz46, t);
        return (zzZ4T<T>) new zzZ4T<T>() { // from class: com.aspose.words.internal.zzYX9.1
            private int zzX0(byte[] bArr) {
                return zzyurZzY.doFinal(bArr, 0);
            }

            @Override // com.aspose.words.internal.zzZ4T
            public final void reset() {
                zzyurZzY.reset();
            }

            @Override // com.aspose.words.internal.zzZ4T
            public final byte[] zzXGP() {
                byte[] bArr = new byte[zzyurZzY.zzXDn()];
                zzX0(bArr);
                return bArr;
            }

            @Override // com.aspose.words.internal.zzZ4T
            public final zzZ41 zzXGQ() {
                return new zzYU5(zzyurZzY);
            }

            @Override // com.aspose.words.internal.zzZ4T
            public final int zzXGR() {
                return zzyurZzY.zzXDn();
            }
        };
    }
}
