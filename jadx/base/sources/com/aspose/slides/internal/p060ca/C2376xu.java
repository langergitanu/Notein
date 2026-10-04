package com.aspose.slides.internal.p060ca;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p060ca.AbstractC2176lg;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p407st.C10521l7;
import com.aspose.slides.p559ms.System.AbstractC14092to;

/* JADX INFO: renamed from: com.aspose.slides.internal.ca.xu */
/* JADX INFO: loaded from: classes3.dex */
public class C2376xu<RuleTableType extends AbstractC2176lg> extends AbstractC2282s0 {

    /* JADX INFO: renamed from: kk */
    private List<RuleTableType> f8220kk;

    /* JADX INFO: renamed from: x1 */
    private Class<RuleTableType> f8221x1;

    public C2376xu(Class<RuleTableType> cls, long j, long j2) {
        super(j, j2);
        this.f8220kk = new List<>();
        this.f8221x1 = cls;
    }

    /* JADX INFO: renamed from: k4 */
    public static <RuleTableType extends AbstractC2176lg> List<C2376xu<RuleTableType>> m11698k4(Class<RuleTableType> cls, long j, C2212n9 c2212n9, boolean z) {
        AbstractC2282s0 abstractC2282s0M11353k4;
        C10521l7 c10521l7 = (List<C2376xu<RuleTableType>>) new List();
        List<Integer> listM11354x1 = AbstractC2282s0.m11354x1(c2212n9);
        for (int i = 0; i < listM11354x1.size(); i++) {
            int iIntValue = listM11354x1.get_Item(i).intValue();
            if (z) {
                int i2 = iIntValue & 65535;
                abstractC2282s0M11353k4 = i2 == 0 ? null : AbstractC2282s0.m11353k4(new C2376xu(cls, j, i2), c2212n9);
            } else {
                abstractC2282s0M11353k4 = AbstractC2282s0.m11353k4(new C2376xu(cls, j, iIntValue & 65535), c2212n9);
            }
            c10521l7.addItem(abstractC2282s0M11353k4);
        }
        return c10521l7;
    }

    /* JADX INFO: renamed from: kk */
    private RuleTableType[] m11699kk() {
        return (RuleTableType[]) ((AbstractC2176lg[]) AbstractC14092to.m67212k4(AbstractC14092to.m67205k4(C7019kk.m27443k4((Class<?>) this.f8221x1), this.f8220kk.size())));
    }

    /* JADX INFO: renamed from: to */
    private RuleTableType m11700to() {
        try {
            return this.f8221x1.getConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$ArrayArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: x1 */
    public final RuleTableType[] m11701x1() {
        return (RuleTableType[]) ((AbstractC2176lg[]) this.f8220kk.toArray((RuleTableType[]) m11699kk()));
    }

    @Override // com.aspose.slides.internal.p060ca.AbstractC2282s0
    /* JADX INFO: renamed from: k4 */
    public void mo10153k4(C2212n9 c2212n9) {
        c2212n9.m11159k4(this.f7845k4 & 4294967295L);
        List<Integer> listM11354x1 = AbstractC2282s0.m11354x1(c2212n9);
        int i = 0;
        while (i < listM11354x1.size()) {
            AbstractC2176lg abstractC2176lgM11700to = m11700to();
            C2212n9 c2212n92 = c2212n9;
            abstractC2176lgM11700to.m11019k4(this.f7845k4 & 4294967295L, listM11354x1.get_Item(i).intValue() & 65535, c2212n92);
            this.f8220kk.addItem((RuleTableType) abstractC2176lgM11700to);
            i++;
            c2212n9 = c2212n92;
        }
    }
}
