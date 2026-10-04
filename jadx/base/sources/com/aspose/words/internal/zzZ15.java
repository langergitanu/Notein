package com.aspose.words.internal;

import com.aspose.words.internal.zzZ5Q;

/* JADX INFO: loaded from: classes5.dex */
public abstract class zzZ15<T extends zzZ5Q> implements zzZ52<T> {
    public zzZ15() {
        zzZ0L.isReady();
    }

    @Override // com.aspose.words.internal.zzZ52
    /* JADX INFO: renamed from: zzX, reason: merged with bridge method [inline-methods] */
    public final zzZ0Y<T> zzZ(zzZ46 zzz46, final T t) {
        final zzYUR zzyurZzY = zzY(zzz46, t);
        return (zzZ0Y<T>) new zzZ0Y<T>() { // from class: com.aspose.words.internal.zzZ15.1
            @Override // com.aspose.words.internal.zzZ4T
            public final void reset() {
                zzyurZzY.reset();
            }

            @Override // com.aspose.words.internal.zzZ0Y
            public final int zzX0(byte[] bArr) {
                return zzyurZzY.doFinal(bArr, 0);
            }

            @Override // com.aspose.words.internal.zzZ4T
            public final zzZ41 zzXGQ() {
                return new zzYU5(zzyurZzY);
            }

            @Override // com.aspose.words.internal.zzZ0Y, com.aspose.words.internal.zzZ4T
            public final int zzXGR() {
                return zzyurZzY.zzXDn();
            }
        };
    }

    public abstract zzYUR zzY(zzZ46 zzz46, T t);
}
