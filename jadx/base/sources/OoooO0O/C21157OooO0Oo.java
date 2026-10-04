package OoooO0O;

import OoooO.C21139OooO00o;
import OoooO00.InterfaceC21152OooO0Oo;
import OoooO0O.OooOo00;
import oOo000Oo.AbstractC34423OooO0o0;

/* JADX INFO: renamed from: OoooO0O.OooO0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C21157OooO0Oo<K, V> extends AbstractC34423OooO0o0<K, V> implements InterfaceC21152OooO0Oo<K, V> {

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public static final C21157OooO0Oo f61380OooOoO0 = new C21157OooO0Oo(OooOo00.f61407OooO0o0, 0);

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final int f61381OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final OooOo00<K, V> f61382OooOo0o;

    public C21157OooO0Oo(OooOo00<K, V> oooOo00, int i) {
        this.f61382OooOo0o = oooOo00;
        this.f61381OooOo = i;
    }

    @Override // OoooO00.InterfaceC21152OooO0Oo
    /* JADX INFO: renamed from: OooO00o, reason: merged with bridge method [inline-methods] */
    public C21158OooO0o<K, V> builder() {
        return new C21158OooO0o<>(this);
    }

    public final C21157OooO0Oo OooO0O0(Object obj, C21139OooO00o c21139OooO00o) {
        OooOo00.OooO00o oooO00oOooOo0 = this.f61382OooOo0o.OooOo0(obj != null ? obj.hashCode() : 0, obj, c21139OooO00o, 0);
        return oooO00oOooOo0 == null ? this : new C21157OooO0Oo(oooO00oOooOo0.f61412OooO00o, this.f61381OooOo + oooO00oOooOo0.f61413OooO0O0);
    }

    @Override // java.util.Map
    public boolean containsKey(K k) {
        return this.f61382OooOo0o.OooO0Oo(k != null ? k.hashCode() : 0, 0, k);
    }

    @Override // java.util.Map
    public V get(K k) {
        return (V) this.f61382OooOo0o.OooO0oO(k != null ? k.hashCode() : 0, 0, k);
    }
}
