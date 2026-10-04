package oO0o0OO;

import Oooo0oO.C21111o0ooOoO;
import oOo0000O.AbstractC34408OooO00o;
import oOo0000O.InterfaceC34415OooO0oo;

/* JADX INFO: renamed from: oO0o0OO.Oooo00O, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C33635Oooo00O extends AbstractC34408OooO00o {

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public static final OooO00o f121314OooOoO0 = new OooO00o();

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final String f121315OooOo;

    /* JADX INFO: renamed from: oO0o0OO.Oooo00O$OooO00o */
    public static final class OooO00o implements InterfaceC34415OooO0oo.OooO0OO<C33635Oooo00O> {
    }

    public C33635Oooo00O(String str) {
        super(f121314OooOoO0);
        this.f121315OooOo = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C33635Oooo00O) && kotlin.jvm.internal.OooOOO0.OooO0O0(this.f121315OooOo, ((C33635Oooo00O) obj).f121315OooOo);
    }

    public final int hashCode() {
        return this.f121315OooOo.hashCode();
    }

    public final String toString() {
        return C21111o0ooOoO.OooO0OO(this.f121315OooOo, ')', new StringBuilder("CoroutineName("));
    }
}
