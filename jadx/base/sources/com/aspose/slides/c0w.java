package com.aspose.slides;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.IGenericEqualityComparer;
import com.aspose.slides.exceptions.InvalidOperationException;

/* JADX INFO: loaded from: classes3.dex */
class c0w<TObj, TEqualityComparer extends IGenericEqualityComparer<TObj>, TNoValue> implements idf<TObj, TNoValue> {

    /* JADX INFO: renamed from: k4 */
    private final Dictionary<TObj, TObj> f4267k4;

    /* JADX INFO: renamed from: x1 */
    private final Dictionary<TObj, Integer> f4268x1 = new Dictionary<>(new oaq());

    public c0w(TEqualityComparer tequalitycomparer) {
        this.f4267k4 = new Dictionary<>(tequalitycomparer);
    }

    /* JADX INFO: renamed from: x1 */
    private void m4416x1(TObj tobj) {
        if (!this.f4268x1.containsKey(tobj)) {
            throw new InvalidOperationException("Consistency of value registry is broken");
        }
        if (!this.f4267k4.containsKey(tobj)) {
            throw new InvalidOperationException("Consistency of value registry is broken");
        }
        this.f4268x1.set_Item(tobj, Integer.valueOf(r0.get_Item(tobj).intValue() - 1));
        if (this.f4268x1.get_Item(tobj).intValue() == 0) {
            this.f4267k4.removeItemByKey(tobj);
            this.f4268x1.removeItemByKey(tobj);
        }
    }

    @Override // com.aspose.slides.idf
    /* JADX INFO: renamed from: k4 */
    public final void mo4417k4(TObj tobj, AbstractC0740ab<TObj> abstractC0740ab) {
        if (mo4419k4(tobj)) {
            abstractC0740ab.mo2597k4(tobj);
            m4416x1(tobj);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.aspose.slides.idf
    /* JADX INFO: renamed from: k4 */
    public final void mo4418k4(TObj[] tobjArr) {
        Object[] objArr = {null};
        boolean zTryGetValue = this.f4267k4.tryGetValue(tobjArr[0], objArr);
        Object obj = objArr[0];
        if (zTryGetValue) {
            if (!this.f4268x1.containsKey(obj)) {
                throw new InvalidOperationException("Consistency of value registry is broken");
            }
            tobjArr[0] = obj;
            Dictionary<TObj, Integer> dictionary = this.f4268x1;
            dictionary.set_Item(obj, Integer.valueOf(((Integer) dictionary.get_Item(obj)).intValue() + 1));
            return;
        }
        if (this.f4268x1.containsKey(tobjArr[0])) {
            throw new InvalidOperationException("Consistency of value registry is broken");
        }
        Dictionary<TObj, TObj> dictionary2 = this.f4267k4;
        Object[] objArr2 = tobjArr[0];
        dictionary2.addItem(objArr2, objArr2);
        this.f4268x1.addItem(tobjArr[0], 1);
    }

    @Override // com.aspose.slides.idf
    /* JADX INFO: renamed from: k4 */
    public final boolean mo4419k4(TObj tobj) {
        if (tobj == null) {
            return false;
        }
        return this.f4268x1.containsKey(tobj);
    }
}
