package com.aspose.words;

import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
final class zzYQN implements Iterable<zzYQO> {
    private com.aspose.words.internal.zzZYG<zzYQO> zzXO8 = new com.aspose.words.internal.zzZYG<>(false);

    @Override // java.lang.Iterable
    public final Iterator<zzYQO> iterator() {
        return this.zzXO8.zzCJ().iterator();
    }

    public final void remove(String str) {
        this.zzXO8.zzXn(str);
    }

    public final zzYQO zzEl(String str) {
        return this.zzXO8.get(str);
    }

    public final void zzZ(zzYQO zzyqo) {
        this.zzXO8.zzW(zzyqo.getName(), zzyqo);
    }
}
