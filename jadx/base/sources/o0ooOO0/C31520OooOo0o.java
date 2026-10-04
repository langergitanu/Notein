package o0ooOO0;

import java.util.Comparator;
import o000OoO.C24536OooO0Oo;
import o0Oo0oo.C28393OooOOOo;

/* JADX INFO: renamed from: o0ooOO0.OooOo0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C31520OooOo0o<T> implements Comparator {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ C31519OooOo0O f112711OooOo0o;

    public C31520OooOo0o(C31519OooOo0O c31519OooOo0O) {
        this.f112711OooOo0o = c31519OooOo0O;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Comparator
    public final int compare(T t, T t2) {
        int iCompare = this.f112711OooOo0o.compare(t, t2);
        return iCompare != 0 ? iCompare : C24536OooO0Oo.OooO0O0(Integer.valueOf(((C28393OooOOOo) t).f100656OooO0oO), Integer.valueOf(((C28393OooOOOo) t2).f100656OooO0oO));
    }
}
