package com.google.android.play.integrity.internal;

import java.util.Iterator;
import java.util.Set;

/* JADX INFO: renamed from: com.google.android.play.integrity.internal.as */
/* JADX INFO: loaded from: classes7.dex */
public abstract class AbstractC16379as extends AbstractC16375ao implements Set {

    /* JADX INFO: renamed from: a */
    private transient AbstractC16378ar f51564a;

    /* JADX INFO: renamed from: h */
    public static AbstractC16379as m75034h() {
        return C16381au.f51567a;
    }

    @Override // com.google.android.play.integrity.internal.AbstractC16375ao, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* JADX INFO: renamed from: d */
    public abstract AbstractC16382av iterator();

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC16379as) {
            ((AbstractC16379as) obj).mo75037i();
            if (obj.hashCode() != 0) {
                return false;
            }
        }
        if (obj == this) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            try {
                if (size() == set.size()) {
                    return containsAll(set);
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public final AbstractC16378ar m75035f() {
        AbstractC16378ar abstractC16378ar = this.f51564a;
        if (abstractC16378ar != null) {
            return abstractC16378ar;
        }
        AbstractC16378ar abstractC16378arMo75036g = mo75036g();
        this.f51564a = abstractC16378arMo75036g;
        return abstractC16378arMo75036g;
    }

    /* JADX INFO: renamed from: g */
    public AbstractC16378ar mo75036g() {
        throw null;
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        Iterator it = iterator();
        int iHashCode = 0;
        while (it.hasNext()) {
            Object next = it.next();
            iHashCode += next != null ? next.hashCode() : 0;
        }
        return iHashCode;
    }

    /* JADX INFO: renamed from: i */
    public boolean mo75037i() {
        throw null;
    }
}
