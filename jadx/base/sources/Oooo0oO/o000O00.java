package Oooo0oO;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class o000O00 implements Iterable<Object>, oO0O00.OooO00o {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final int f61210OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final C21093o0000o0O f61211OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final o0000O f61212OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final C21068OoooOoO f61213OooOoO0;

    public o000O00(C21093o0000o0O c21093o0000o0O, int i, C21068OoooOoO c21068OoooOoO, o0000O o0000o2) {
        this.f61211OooOo0o = c21093o0000o0O;
        this.f61210OooOo = i;
        this.f61213OooOoO0 = c21068OoooOoO;
        this.f61212OooOoO = o0000o2;
        c21068OoooOoO.getClass();
    }

    @Override // java.lang.Iterable
    public final Iterator<Object> iterator() {
        return new o000Oo0(this.f61211OooOo0o, this.f61210OooOo, this.f61213OooOoO0, this.f61212OooOoO);
    }
}
