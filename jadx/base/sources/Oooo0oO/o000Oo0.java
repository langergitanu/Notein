package Oooo0oO;

import OooOOO0.AbstractC20449OooO0Oo;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class o000Oo0 implements Iterator<Object>, oO0O00.OooO00o {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final int f61229OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final C21093o0000o0O f61230OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final int f61231OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final C21068OoooOoO f61232OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public int f61233OooOoOO;

    public o000Oo0(C21093o0000o0O c21093o0000o0O, int i, C21068OoooOoO c21068OoooOoO, AbstractC20449OooO0Oo abstractC20449OooO0Oo) {
        this.f61230OooOo0o = c21093o0000o0O;
        this.f61229OooOo = i;
        this.f61232OooOoO0 = c21068OoooOoO;
        this.f61231OooOoO = c21093o0000o0O.f61159OooOoo;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        ArrayList<Object> arrayList = this.f61232OooOoO0.f61023OooO00o;
        return arrayList != null && this.f61233OooOoOO < arrayList.size();
    }

    @Override // java.util.Iterator
    public final Object next() {
        Object obj;
        ArrayList<Object> arrayList = this.f61232OooOoO0.f61023OooO00o;
        if (arrayList != null) {
            int i = this.f61233OooOoOO;
            this.f61233OooOoOO = i + 1;
            obj = arrayList.get(i);
        } else {
            obj = null;
        }
        boolean z = obj instanceof C21025OooO0o0;
        C21093o0000o0O c21093o0000o0O = this.f61230OooOo0o;
        if (z) {
            return new C21094o0000o0o(c21093o0000o0O, ((C21025OooO0o0) obj).f60884OooO00o, this.f61231OooOoO);
        }
        if (!(obj instanceof C21068OoooOoO)) {
            C21038OooOo.OooO0Oo("Unexpected group information structure");
            throw null;
        }
        return new o000O00(c21093o0000o0O, this.f61229OooOo, (C21068OoooOoO) obj, new o0000O());
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
