package com.aspose.words.internal;

import com.aspose.words.internal.zzZ4M;
import java.security.SecureRandom;

/* JADX INFO: loaded from: classes5.dex */
public interface zzZ4L<T extends zzZ4M> extends zzZ4M {
    byte[] getIV();

    T zzW(SecureRandom secureRandom);

    T zzXg(byte[] bArr);
}
