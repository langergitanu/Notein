package com.aspose.words.internal;

import java.io.IOException;
import java.math.BigInteger;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
public final class zzYGZ {
    private static Set EMPTY_SET = Collections.unmodifiableSet(new HashSet());

    /* JADX INFO: renamed from: er */
    private zzZ8N f50841er;
    private zzZ7T zzWtv;

    public zzYGZ(zzZ8N zzz8n) {
        this.f50841er = zzz8n;
        this.zzWtv = zzz8n.zzXIH();
    }

    public final byte[] getEncoded() throws IOException {
        return this.f50841er.getEncoded();
    }

    public final zzZDA zzXII() {
        if (this.f50841er.zzXII() != null) {
            return this.f50841er.zzXII();
        }
        return null;
    }

    public final BigInteger zzXyq() {
        if (this.f50841er.zzXIJ() != null) {
            return this.f50841er.zzXIJ().zzXKZ();
        }
        return null;
    }

    public final byte[] zzXyr() {
        return this.f50841er.zzXIM().zzXIN();
    }

    public final zzZDA zzXys() {
        return this.f50841er.zzXIM().zzXJ3().zzXJk();
    }
}
