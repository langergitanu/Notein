package com.google.android.play.integrity.internal;

import com.google.firebase.analytics.FirebaseAnalytics;

/* JADX INFO: renamed from: com.google.android.play.integrity.internal.aq */
/* JADX INFO: loaded from: classes7.dex */
final class C16377aq extends AbstractC16378ar {

    /* JADX INFO: renamed from: a */
    final transient int f51559a;

    /* JADX INFO: renamed from: b */
    final transient int f51560b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ AbstractC16378ar f51561c;

    public C16377aq(AbstractC16378ar abstractC16378ar, int i, int i2) {
        this.f51561c = abstractC16378ar;
        this.f51559a = i;
        this.f51560b = i2;
    }

    @Override // com.google.android.play.integrity.internal.AbstractC16375ao
    /* JADX INFO: renamed from: b */
    public final int mo75028b() {
        return this.f51561c.mo75029c() + this.f51559a + this.f51560b;
    }

    @Override // com.google.android.play.integrity.internal.AbstractC16375ao
    /* JADX INFO: renamed from: c */
    public final int mo75029c() {
        return this.f51561c.mo75029c() + this.f51559a;
    }

    @Override // com.google.android.play.integrity.internal.AbstractC16375ao
    /* JADX INFO: renamed from: e */
    public final Object[] mo75031e() {
        return this.f51561c.mo75031e();
    }

    @Override // com.google.android.play.integrity.internal.AbstractC16378ar, java.util.List
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public final AbstractC16378ar subList(int i, int i2) {
        C16372al.m75023c(i, i2, this.f51560b);
        int i3 = this.f51559a;
        return this.f51561c.subList(i + i3, i2 + i3);
    }

    @Override // java.util.List
    public final Object get(int i) {
        C16372al.m75021a(i, this.f51560b, FirebaseAnalytics.Param.INDEX);
        return this.f51561c.get(i + this.f51559a);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f51560b;
    }
}
