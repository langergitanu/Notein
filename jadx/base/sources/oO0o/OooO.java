package oO0o;

import java.util.Iterator;
import oO0oO00.C33961OooOooo;

/* JADX INFO: loaded from: classes10.dex */
public final class OooO implements Iterable<String>, oO0O00.OooO00o {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ C33961OooOooo f121092OooOo0o;

    public OooO(C33961OooOooo c33961OooOooo) {
        this.f121092OooOo0o = c33961OooOooo;
    }

    @Override // java.lang.Iterable
    public final Iterator<String> iterator() {
        return new C33533OooO0oo(this.f121092OooOo0o);
    }
}
