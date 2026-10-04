package com.google.android.gms.internal.mlkit_language_id_bundled;

import com.google.firebase.analytics.FirebaseAnalytics;

/* JADX INFO: loaded from: classes7.dex */
final class zbh extends zbi {
    final transient int zba;
    final transient int zbb;
    final /* synthetic */ zbi zbc;

    public zbh(zbi zbiVar, int i, int i2) {
        this.zbc = zbiVar;
        this.zba = i;
        this.zbb = i2;
    }

    @Override // java.util.List
    public final Object get(int i) {
        zbc.zba(i, this.zbb, FirebaseAnalytics.Param.INDEX);
        return this.zbc.get(i + this.zba);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zbb;
    }

    @Override // com.google.android.gms.internal.mlkit_language_id_bundled.zbf
    public final int zbb() {
        return this.zbc.zbc() + this.zba + this.zbb;
    }

    @Override // com.google.android.gms.internal.mlkit_language_id_bundled.zbf
    public final int zbc() {
        return this.zbc.zbc() + this.zba;
    }

    @Override // com.google.android.gms.internal.mlkit_language_id_bundled.zbf
    public final Object[] zbe() {
        return this.zbc.zbe();
    }

    @Override // com.google.android.gms.internal.mlkit_language_id_bundled.zbi, java.util.List
    /* JADX INFO: renamed from: zbf */
    public final zbi subList(int i, int i2) {
        zbc.zbc(i, i2, this.zbb);
        int i3 = this.zba;
        return this.zbc.subList(i + i3, i2 + i3);
    }
}
