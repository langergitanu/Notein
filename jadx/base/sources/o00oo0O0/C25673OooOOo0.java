package o00oo0O0;

import o00o0o.AbstractC25434OooO00o;
import o00o0o.InterfaceC25436OooO0OO;
import o00oo00O.C25648OooO0O0;
import o00oo0O0.InterfaceC25665OooOO0;

/* JADX INFO: renamed from: o00oo0O0.OooOOo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C25673OooOOo0 implements InterfaceC25436OooO0OO<Object> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ InterfaceC25665OooOO0.OooO00o f87619OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ C25672OooOOo f87620OooO0O0;

    public C25673OooOOo0(C25672OooOOo c25672OooOOo, InterfaceC25665OooOO0.OooO00o oooO00o) {
        this.f87620OooO0O0 = c25672OooOOo;
        this.f87619OooO00o = oooO00o;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x003c  */
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
    @Override // o00o0o.InterfaceC25436OooO0OO
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void release(Object obj) {
        boolean z;
        Object obj2;
        C25672OooOOo c25672OooOOo = this.f87620OooO0O0;
        InterfaceC25665OooOO0.OooO00o oooO00o = this.f87619OooO00o;
        c25672OooOOo.getClass();
        synchronized (c25672OooOOo) {
            synchronized (c25672OooOOo) {
                z = false;
                OooOoo0.OooOo00.OooO0o(oooO00o.f87601OooO0OO > 0);
                oooO00o.f87601OooO0OO--;
            }
            AbstractC25434OooO00o.OooOooo(c25672OooOOo.OooO(oooO00o));
            if (!z) {
                oooO00o = null;
            }
            if (oooO00o != null && (obj2 = oooO00o.f87603OooO0o0) != null) {
                ((C25648OooO0O0) obj2).OooO00o(oooO00o.f87599OooO00o, true);
            }
            c25672OooOOo.OooO0oO();
            c25672OooOOo.OooO0o0();
        }
        synchronized (c25672OooOOo) {
            try {
                if (!oooO00o.f87602OooO0Oo && oooO00o.f87601OooO0OO == 0) {
                    c25672OooOOo.f87613OooO0O0.OooO0OO(oooO00o.f87599OooO00o, oooO00o);
                    z = true;
                }
            } finally {
            }
        }
        AbstractC25434OooO00o.OooOooo(c25672OooOOo.OooO(oooO00o));
        if (!z) {
        }
        if (oooO00o != null) {
            ((C25648OooO0O0) obj2).OooO00o(oooO00o.f87599OooO00o, true);
        }
        c25672OooOOo.OooO0oO();
        c25672OooOOo.OooO0o0();
    }
}
