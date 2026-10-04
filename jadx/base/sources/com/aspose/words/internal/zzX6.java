package com.aspose.words.internal;

import java.util.Iterator;

/* JADX INFO: loaded from: classes5.dex */
public final class zzX6 implements zzFQ<String> {
    private zzZYG<String> zzUP;

    public zzX6() {
        this.zzUP = new zzZYG<>(false);
    }

    private static String zzR(Object obj) {
        return obj != null ? (String) obj : "{62C5CE33-64E0-4EEC-9E16-1CA57A484BD2}";
    }

    @Override // java.lang.Iterable
    public final Iterator<String> iterator() {
        return this.zzUP.zzCJ().iterator();
    }

    @Override // com.aspose.words.internal.zzFQ
    /* JADX INFO: renamed from: zzF, reason: merged with bridge method [inline-methods] */
    public final boolean add(String str) {
        String strZzR = zzR(str);
        if (this.zzUP.containsKey(strZzR)) {
            return false;
        }
        this.zzUP.zzW(strZzR, str);
        return true;
    }

    @Override // com.aspose.words.internal.zzFQ
    public final boolean contains(String str) {
        return this.zzUP.containsKey(zzR(str));
    }

    public zzX6(int i) {
        this.zzUP = new zzZYG<>(i, (byte) 0);
    }

    public zzX6(String... strArr) {
        this.zzUP = new zzZYG<>(7, (byte) 0);
        for (int i = 0; i < 7; i++) {
            add(strArr[i]);
        }
    }
}
