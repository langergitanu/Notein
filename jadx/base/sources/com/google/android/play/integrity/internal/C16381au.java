package com.google.android.play.integrity.internal;

import java.util.Iterator;

/* JADX INFO: renamed from: com.google.android.play.integrity.internal.au */
/* JADX INFO: loaded from: classes7.dex */
final class C16381au extends AbstractC16379as {

    /* JADX INFO: renamed from: a */
    static final C16381au f51567a;

    /* JADX INFO: renamed from: d */
    private static final Object[] f51568d;

    /* JADX INFO: renamed from: b */
    final transient Object[] f51569b;

    /* JADX INFO: renamed from: c */
    final transient Object[] f51570c;

    static {
        Object[] objArr = new Object[0];
        f51568d = objArr;
        f51567a = new C16381au(objArr, 0, objArr, 0, 0);
    }

    public C16381au(Object[] objArr, int i, Object[] objArr2, int i2, int i3) {
        this.f51569b = objArr;
        this.f51570c = objArr2;
    }

    @Override // com.google.android.play.integrity.internal.AbstractC16375ao
    /* JADX INFO: renamed from: a */
    public final int mo75027a(Object[] objArr, int i) {
        System.arraycopy(this.f51569b, 0, objArr, 0, 0);
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

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj == null) {
            return false;
        }
        int length = this.f51570c.length;
        return false;
    }

    @Override // com.google.android.play.integrity.internal.AbstractC16379as, com.google.android.play.integrity.internal.AbstractC16375ao
    /* JADX INFO: renamed from: d */
    public final AbstractC16382av iterator() {
        return m75035f().listIterator(0);
    }

    @Override // com.google.android.play.integrity.internal.AbstractC16375ao
    /* JADX INFO: renamed from: e */
    public final Object[] mo75031e() {
        return this.f51569b;
    }

    @Override // com.google.android.play.integrity.internal.AbstractC16379as
    /* JADX INFO: renamed from: g */
    public final AbstractC16378ar mo75036g() {
        int i = AbstractC16378ar.f51563d;
        return C16380at.f51565a;
    }

    @Override // com.google.android.play.integrity.internal.AbstractC16379as, java.util.Collection, java.util.Set
    public final int hashCode() {
        return 0;
    }

    @Override // com.google.android.play.integrity.internal.AbstractC16379as
    /* JADX INFO: renamed from: i */
    public final boolean mo75037i() {
        return true;
    }

    @Override // com.google.android.play.integrity.internal.AbstractC16379as, com.google.android.play.integrity.internal.AbstractC16375ao, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return m75035f().listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 0;
    }
}
