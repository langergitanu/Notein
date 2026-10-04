package com.google.android.play.integrity.internal;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: com.google.android.play.integrity.internal.an */
/* JADX INFO: loaded from: classes7.dex */
abstract class AbstractC16374an extends AbstractC16383aw {

    /* JADX INFO: renamed from: a */
    private final int f51555a;

    /* JADX INFO: renamed from: b */
    private int f51556b;

    public AbstractC16374an(int i, int i2) {
        C16372al.m75022b(i2, i, FirebaseAnalytics.Param.INDEX);
        this.f51555a = i;
        this.f51556b = i2;
    }

    /* JADX INFO: renamed from: a */
    public abstract Object mo75026a(int i);

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f51556b < this.f51555a;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f51556b > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i = this.f51556b;
        this.f51556b = i + 1;
        return mo75026a(i);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f51556b;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i = this.f51556b - 1;
        this.f51556b = i;
        return mo75026a(i);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f51556b - 1;
    }
}
