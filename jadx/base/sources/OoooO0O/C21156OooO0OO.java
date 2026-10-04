package OoooO0O;

import java.util.Map;
import java.util.NoSuchElementException;
import oO0O00.InterfaceC32497OooO0Oo;

/* JADX INFO: renamed from: OoooO0O.OooO0OO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C21156OooO0OO<K, V> extends C21155OooO0O0<K, V> implements InterfaceC32497OooO0Oo.OooO00o {

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public V f61378OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final OooO<K, V> f61379OooOoO0;

    public C21156OooO0OO(OooO<K, V> oooO, K k, V v) {
        super(k, v);
        this.f61379OooOoO0 = oooO;
        this.f61378OooOoO = v;
    }

    @Override // OoooO0O.C21155OooO0O0, java.util.Map.Entry
    public final V getValue() {
        return this.f61378OooOoO;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // OoooO0O.C21155OooO0O0, java.util.Map.Entry
    public final V setValue(V v) {
        V v2 = this.f61378OooOoO;
        this.f61378OooOoO = v;
        C21160OooO0oO<K, V, Map.Entry<K, V>> c21160OooO0oO = this.f61379OooOoO0.f61375OooOo0o;
        C21158OooO0o<K, V> c21158OooO0o = c21160OooO0oO.f61392OooOoO;
        K k = this.f61377OooOo0o;
        if (!c21158OooO0o.containsKey(k)) {
            return v2;
        }
        boolean z = c21160OooO0oO.f61391OooOoO0;
        if (!z) {
            c21158OooO0o.put(k, v);
        } else {
            if (!z) {
                throw new NoSuchElementException();
            }
            AbstractC21167OooOo0 abstractC21167OooOo0 = c21160OooO0oO.f61390OooOo0o[c21160OooO0oO.f61389OooOo];
            Object obj = abstractC21167OooOo0.f61405OooOo0o[abstractC21167OooOo0.f61406OooOoO0];
            c21158OooO0o.put(k, v);
            c21160OooO0oO.OooO0Oo(obj != null ? obj.hashCode() : 0, c21158OooO0o.f61386OooOoO0, obj, 0);
        }
        c21160OooO0oO.f61394OooOoo = c21158OooO0o.f61387OooOoOO;
        return v2;
    }
}
