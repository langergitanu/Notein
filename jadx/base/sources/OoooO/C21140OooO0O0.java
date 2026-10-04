package OoooO;

import Oooo0oO.C21082o00000oO;
import OoooO00.InterfaceC21153OooO0o0;
import OoooO0O.C21157OooO0Oo;
import OoooO0O.OooOo00;
import OoooOO0.C21173OooO0O0;
import java.util.Iterator;
import kotlin.jvm.internal.OooOOO0;
import oOo000Oo.OooOO0;

/* JADX INFO: renamed from: OoooO.OooO0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C21140OooO0O0<E> extends OooOO0<E> implements InterfaceC21153OooO0o0<E> {

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public static final C21140OooO0O0 f61335OooOoO;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final Object f61336OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final Object f61337OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final C21157OooO0Oo<E, C21139OooO00o> f61338OooOoO0;

    static {
        C21173OooO0O0 c21173OooO0O0 = C21173OooO0O0.f61416OooO00o;
        f61335OooOoO = new C21140OooO0O0(c21173OooO0O0, c21173OooO0O0, C21157OooO0Oo.f61380OooOoO0);
    }

    public C21140OooO0O0(Object obj, Object obj2, C21157OooO0Oo<E, C21139OooO00o> c21157OooO0Oo) {
        this.f61337OooOo0o = obj;
        this.f61336OooOo = obj2;
        this.f61338OooOoO0 = c21157OooO0Oo;
    }

    @Override // oOo000Oo.AbstractC34419OooO0O0
    public final int OooO0O0() {
        C21157OooO0Oo<E, C21139OooO00o> c21157OooO0Oo = this.f61338OooOoO0;
        c21157OooO0Oo.getClass();
        return c21157OooO0Oo.f61381OooOo;
    }

    @Override // java.util.Collection, java.util.Set, OoooO00.InterfaceC21153OooO0o0
    public final C21140OooO0O0 add(Object obj) {
        C21157OooO0Oo<E, C21139OooO00o> c21157OooO0Oo = this.f61338OooOoO0;
        if (c21157OooO0Oo.containsKey((E) obj)) {
            return this;
        }
        if (isEmpty()) {
            return new C21140OooO0O0(obj, obj, c21157OooO0Oo.OooO0O0(obj, new C21139OooO00o()));
        }
        Object obj2 = this.f61336OooOo;
        C21139OooO00o c21139OooO00o = c21157OooO0Oo.get((E) obj2);
        OooOOO0.OooO0Oo(c21139OooO00o);
        return new C21140OooO0O0(this.f61337OooOo0o, obj, c21157OooO0Oo.OooO0O0(obj2, new C21139OooO00o(c21139OooO00o.f61333OooO00o, obj)).OooO0O0(obj, new C21139OooO00o(obj2, C21173OooO0O0.f61416OooO00o)));
    }

    @Override // oOo000Oo.AbstractC34419OooO0O0, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f61338OooOoO0.containsKey(obj);
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator<E> iterator() {
        return new C21141OooO0OO(this.f61337OooOo0o, this.f61338OooOoO0);
    }

    @Override // OoooO00.InterfaceC21153OooO0o0
    public final C21140OooO0O0 o0000oO(C21082o00000oO.OooO0OO oooO0OO) {
        C21157OooO0Oo<E, C21139OooO00o> c21157OooO0OoOooO0O0 = this.f61338OooOoO0;
        C21139OooO00o c21139OooO00o = c21157OooO0OoOooO0O0.get(oooO0OO);
        if (c21139OooO00o == null) {
            return this;
        }
        int iHashCode = oooO0OO != null ? oooO0OO.hashCode() : 0;
        OooOo00<E, C21139OooO00o> oooOo00 = c21157OooO0OoOooO0O0.f61382OooOo0o;
        OooOo00<E, C21139OooO00o> oooOo00OooOo0O = oooOo00.OooOo0O(iHashCode, oooO0OO, 0);
        if (oooOo00 != oooOo00OooOo0O) {
            c21157OooO0OoOooO0O0 = oooOo00OooOo0O == null ? C21157OooO0Oo.f61380OooOoO0 : new C21157OooO0Oo<>(oooOo00OooOo0O, c21157OooO0OoOooO0O0.f61381OooOo - 1);
        }
        C21173OooO0O0 c21173OooO0O0 = C21173OooO0O0.f61416OooO00o;
        Object obj = c21139OooO00o.f61333OooO00o;
        boolean z = obj != c21173OooO0O0;
        Object obj2 = c21139OooO00o.f61334OooO0O0;
        if (z) {
            C21139OooO00o c21139OooO00o2 = c21157OooO0OoOooO0O0.get(obj);
            OooOOO0.OooO0Oo(c21139OooO00o2);
            c21157OooO0OoOooO0O0 = c21157OooO0OoOooO0O0.OooO0O0(obj, new C21139OooO00o(c21139OooO00o2.f61333OooO00o, obj2));
        }
        if (obj2 != c21173OooO0O0) {
            C21139OooO00o c21139OooO00o3 = c21157OooO0OoOooO0O0.get(obj2);
            OooOOO0.OooO0Oo(c21139OooO00o3);
            c21157OooO0OoOooO0O0 = c21157OooO0OoOooO0O0.OooO0O0(obj2, new C21139OooO00o(obj, c21139OooO00o3.f61334OooO0O0));
        }
        Object obj3 = obj != c21173OooO0O0 ? this.f61337OooOo0o : obj2;
        if (obj2 != c21173OooO0O0) {
            obj = this.f61336OooOo;
        }
        return new C21140OooO0O0(obj3, obj, c21157OooO0OoOooO0O0);
    }
}
