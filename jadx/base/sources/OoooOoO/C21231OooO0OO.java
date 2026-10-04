package OoooOoO;

import Oooo0oO.C21111o0ooOoO;
import OoooOoO.InterfaceC21233OooO0o;
import kotlin.jvm.internal.OooOOO0;
import kotlin.jvm.internal.OooOOOO;
import oO0O000o.InterfaceC32507OooOO0o;
import oO0O000o.InterfaceC32508OooOOOo;

/* JADX INFO: renamed from: OoooOoO.OooO0OO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C21231OooO0OO implements InterfaceC21233OooO0o {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final InterfaceC21233OooO0o f61598OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final InterfaceC21233OooO0o f61599OooOo0o;

    /* JADX INFO: renamed from: OoooOoO.OooO0OO$OooO00o */
    public static final class OooO00o extends OooOOOO implements InterfaceC32508OooOOOo<String, InterfaceC21233OooO0o.OooO0O0, String> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public static final OooO00o f61600OooOo0o = new OooO00o(2);

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final String invoke(String str, InterfaceC21233OooO0o.OooO0O0 oooO0O0) {
            String acc = str;
            InterfaceC21233OooO0o.OooO0O0 element = oooO0O0;
            OooOOO0.OooO0oO(acc, "acc");
            OooOOO0.OooO0oO(element, "element");
            if (acc.length() == 0) {
                return element.toString();
            }
            return acc + ", " + element;
        }
    }

    public C21231OooO0OO(InterfaceC21233OooO0o outer, InterfaceC21233OooO0o inner) {
        OooOOO0.OooO0oO(outer, "outer");
        OooOOO0.OooO0oO(inner, "inner");
        this.f61599OooOo0o = outer;
        this.f61598OooOo = inner;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // OoooOoO.InterfaceC21233OooO0o
    public final <R> R OooOOOO(R r, InterfaceC32508OooOOOo<? super R, ? super InterfaceC21233OooO0o.OooO0O0, ? extends R> operation) {
        OooOOO0.OooO0oO(operation, "operation");
        return (R) this.f61598OooOo.OooOOOO(this.f61599OooOo0o.OooOOOO(r, operation), operation);
    }

    @Override // OoooOoO.InterfaceC21233OooO0o
    public final boolean OooOo0o(InterfaceC32507OooOO0o<? super InterfaceC21233OooO0o.OooO0O0, Boolean> predicate) {
        OooOOO0.OooO0oO(predicate, "predicate");
        return this.f61599OooOo0o.OooOo0o(predicate) && this.f61598OooOo.OooOo0o(predicate);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C21231OooO0OO)) {
            return false;
        }
        C21231OooO0OO c21231OooO0OO = (C21231OooO0OO) obj;
        return OooOOO0.OooO0O0(this.f61599OooOo0o, c21231OooO0OO.f61599OooOo0o) && OooOOO0.OooO0O0(this.f61598OooOo, c21231OooO0OO.f61598OooOo);
    }

    public final int hashCode() {
        return (this.f61598OooOo.hashCode() * 31) + this.f61599OooOo0o.hashCode();
    }

    public final String toString() {
        return C21111o0ooOoO.OooO0OO((String) OooOOOO("", OooO00o.f61600OooOo0o), ']', new StringBuilder("["));
    }
}
