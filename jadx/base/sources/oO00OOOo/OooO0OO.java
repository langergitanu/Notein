package oO00OOOo;

import kotlin.jvm.internal.OooOOO0;
import kotlin.jvm.internal.OooOOOO;
import oO000oOO.C32116OooO0O0;
import oO000oOO.C32117OooO0OO;
import oO000oOO.OooOO0O;
import oO00O0o0.C32183OooO0Oo;
import oO00O0o0.InterfaceC32184OooO0o0;
import oO00OOO.C32234OooO0oo;
import oO00ooO.C32460OooOooO;
import oO0O000o.InterfaceC32507OooOO0o;
import oOo00O0O.AbstractC34457OooO0OO;
import oOo00O0O.C34467OooOo0;
import oOo00O0O.OooOo00;

/* JADX INFO: loaded from: classes10.dex */
public final class OooO0OO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final OooOo00 f115764OooO00o = C34467OooOo0.OooO00o(OooO00o.f115765OooOo0o);

    public static final class OooO00o extends OooOOOO implements InterfaceC32507OooOO0o<oOo00O0O.OooO0o, C32460OooOooO> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public static final OooO00o f115765OooOo0o = new OooO00o(1);

        @Override // oO0O000o.InterfaceC32507OooOO0o
        public final C32460OooOooO invoke(oOo00O0O.OooO0o oooO0o) {
            oOo00O0O.OooO0o Json = oooO0o;
            OooOOO0.OooO0oO(Json, "$this$Json");
            Json.f123496OooO00o = true;
            Json.f123499OooO0Oo = true;
            Json.f123495OooO = true;
            Json.f123504OooOO0 = true;
            return C32460OooOooO.f116667OooO00o;
        }
    }

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
    public static void OooO00o(C32116OooO0O0.OooO00o oooO00o, AbstractC34457OooO0OO json, int i) {
        if ((i & 1) != 0) {
            json = f115764OooO00o;
        }
        C32183OooO0Oo contentType = C32183OooO0Oo.OooO00o.f115523OooO00o;
        OooOOO0.OooO0oO(oooO00o, "<this>");
        OooOOO0.OooO0oO(json, "json");
        OooOOO0.OooO0oO(contentType, "contentType");
        C32234OooO0oo c32234OooO0oo = new C32234OooO0oo(json);
        oO00OO.OooO00o configuration = oO00OO.OooO00o.f115685OooOo0o;
        OooOOO0.OooO0oO(configuration, "configuration");
        InterfaceC32184OooO0o0 c32117OooO0OO = contentType.equals(contentType) ? OooOO0O.f115179OooO00o : new C32117OooO0OO(contentType);
        configuration.invoke(c32234OooO0oo);
        oooO00o.f115152OooO0O0.add(new C32116OooO0O0.OooO00o.C20201OooO00o(c32234OooO0oo, contentType, c32117OooO0OO));
    }
}
