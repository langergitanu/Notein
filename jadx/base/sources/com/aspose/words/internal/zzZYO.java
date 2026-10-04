package com.aspose.words.internal;

import java.util.Comparator;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZYO implements Comparator<String> {
    public static zzZYO zzca = new zzZYO();

    private zzZYO() {
    }

    @Override // java.util.Comparator
    public final /* synthetic */ int compare(String str, String str2) {
        return zzZKN.zzZJ(str, str2);
    }

    /* JADX INFO: renamed from: compare, reason: avoid collision after fix types in other method */
    public static int compare2(String str, String str2) {
        return zzZKN.zzZJ(str, str2);
    }
}
