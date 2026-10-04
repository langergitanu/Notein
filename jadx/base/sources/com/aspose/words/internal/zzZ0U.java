package com.aspose.words.internal;

import com.aspose.words.internal.zzZ0S;

/* JADX INFO: loaded from: classes5.dex */
public abstract class zzZ0U<T extends zzZ0S> implements zzZ4N<T> {
    public abstract int zzb(byte[] bArr, int i);

    @Override // com.aspose.words.internal.zzZ4N
    public final byte[] zzfX(int i) {
        byte[] bArr = new byte[i];
        zzb(bArr, i);
        return bArr;
    }
}
