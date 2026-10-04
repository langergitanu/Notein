package com.google.android.play.integrity.internal;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.play.integrity.internal.at */
/* JADX INFO: loaded from: classes7.dex */
final class C16380at extends AbstractC16378ar {

    /* JADX INFO: renamed from: a */
    static final AbstractC16378ar f51565a = new C16380at(new Object[0], 0);

    /* JADX INFO: renamed from: b */
    final transient Object[] f51566b;

    public C16380at(Object[] objArr, int i) {
        this.f51566b = objArr;
    }

    @Override // com.google.android.play.integrity.internal.AbstractC16378ar, com.google.android.play.integrity.internal.AbstractC16375ao
    /* JADX INFO: renamed from: a */
    public final int mo75027a(Object[] objArr, int i) {
        System.arraycopy(this.f51566b, 0, objArr, 0, 0);
        return 0;
    }

    @Override // com.google.android.play.integrity.internal.AbstractC16375ao
    /* JADX INFO: renamed from: b */
    public final int mo75028b() {
        return 0;
    }

    @Override // com.google.android.play.integrity.internal.AbstractC16375ao
    /* JADX INFO: renamed from: c */
    public final int mo75029c() {
        return 0;
    }

    @Override // com.google.android.play.integrity.internal.AbstractC16375ao
    /* JADX INFO: renamed from: e */
    public final Object[] mo75031e() {
        return this.f51566b;
    }

    @Override // java.util.List
    public final Object get(int i) {
        C16372al.m75021a(i, 0, FirebaseAnalytics.Param.INDEX);
        Object obj = this.f51566b[i];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return 0;
    }
}
