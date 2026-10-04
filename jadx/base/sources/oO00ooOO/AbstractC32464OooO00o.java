package oO00ooOO;

import java.util.Map;
import java.util.Map.Entry;
import kotlin.jvm.internal.OooOOO0;

/* JADX INFO: renamed from: oO00ooOO.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public abstract class AbstractC32464OooO00o<E extends Map.Entry<? extends K, ? extends V>, K, V> extends oOo000Oo.OooO<E> {
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry<? extends K, ? extends V> element = (Map.Entry) obj;
        OooOOO0.OooO0oO(element, "element");
        return ((C32468OooO0Oo) this).f116710OooOo0o.OooO0oO(element);
    }

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
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry element = (Map.Entry) obj;
        OooOOO0.OooO0oO(element, "element");
        C32466OooO0OO<K, V> c32466OooO0OO = ((C32468OooO0Oo) this).f116710OooOo0o;
        c32466OooO0OO.getClass();
        c32466OooO0OO.OooO0Oo();
        int iOooO = c32466OooO0OO.OooO((K) element.getKey());
        if (iOooO >= 0) {
            V[] vArr = c32466OooO0OO.f116690OooOo;
            OooOOO0.OooO0Oo(vArr);
            if (OooOOO0.OooO0O0(vArr[iOooO], element.getValue())) {
                c32466OooO0OO.OooOOO(iOooO);
                return true;
            }
        }
        return false;
    }
}
