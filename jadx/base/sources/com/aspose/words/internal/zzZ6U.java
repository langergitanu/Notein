package com.aspose.words.internal;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
final class zzZ6U {
    private static Set EMPTY_SET = Collections.unmodifiableSet(new HashSet());
    private static List EMPTY_LIST = Collections.unmodifiableList(new ArrayList());

    public static zzZD5 zzXk(byte[] bArr) throws IOException {
        zzZD5 zzzd5ZzXo = zzZD5.zzXo(bArr);
        if (zzzd5ZzXo != null) {
            return zzzd5ZzXo;
        }
        throw new IOException("no content found");
    }
}
