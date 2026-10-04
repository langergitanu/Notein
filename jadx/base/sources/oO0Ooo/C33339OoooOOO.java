package oO0Ooo;

import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import oOo000Oo.C34434OooOoO;
import oOoo0.InterfaceC34597OooO0o0;
import ooOOoOoo.AbstractC35162OooO0o0;
import ooOOoOoo.AbstractC35182OooOoO0;
import ooOOoOoo.C35160OooO0Oo;
import ooOOoOoo.C35167OooOO0o;
import ooOOoOoo.C35172OooOOo;

/* JADX INFO: renamed from: oO0Ooo.OoooOOO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C33339OoooOOO extends AbstractC35162OooO0o0<AbstractC33338OoooOO0<?>, AbstractC33338OoooOO0<?>> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public static final OooO00o f120598OooOo = new OooO00o();

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public static final C33339OoooOOO f120599OooOoO0 = new C33339OoooOOO(C34434OooOoO.f123453OooOo0o);

    /* JADX INFO: renamed from: oO0Ooo.OoooOOO$OooO00o */
    public static final class OooO00o extends AbstractC35182OooOoO0<AbstractC33338OoooOO0<?>, AbstractC33338OoooOO0<?>> {
        public static C33339OoooOOO OooO0OO(List list) {
            return list.isEmpty() ? C33339OoooOOO.f120599OooOoO0 : new C33339OoooOOO(list);
        }

        @Override // ooOOoOoo.AbstractC35182OooOoO0
        public final int OooO00o(ConcurrentHashMap concurrentHashMap, String str, AbstractC35182OooOoO0.OooO00o oooO00o) {
            int iIntValue;
            kotlin.jvm.internal.OooOOO0.OooO0oO(concurrentHashMap, "<this>");
            Integer num = (Integer) concurrentHashMap.get(str);
            if (num != null) {
                return num.intValue();
            }
            synchronized (concurrentHashMap) {
                try {
                    Integer num2 = (Integer) concurrentHashMap.get(str);
                    if (num2 == null) {
                        Object objInvoke = oooO00o.invoke(str);
                        concurrentHashMap.putIfAbsent(str, Integer.valueOf(((Number) objInvoke).intValue()));
                        num2 = (Integer) objInvoke;
                    }
                    iIntValue = num2.intValue();
                } catch (Throwable th) {
                    throw th;
                }
            }
            return iIntValue;
        }
    }

    public C33339OoooOOO() {
        throw null;
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
    public C33339OoooOOO(List<? extends AbstractC33338OoooOO0<?>> list) {
        C35167OooOO0o c35167OooOO0o = C35167OooOO0o.f126242OooOo0o;
        kotlin.jvm.internal.OooOOO0.OooO0o0(c35167OooOO0o, "null cannot be cast to non-null type org.jetbrains.kotlin.util.ArrayMap<T of org.jetbrains.kotlin.util.AttributeArrayOwner>");
        this.f126231OooOo0o = c35167OooOO0o;
        for (AbstractC33338OoooOO0<?> abstractC33338OoooOO0 : list) {
            InterfaceC34597OooO0o0 tClass = abstractC33338OoooOO0.OooO0O0();
            kotlin.jvm.internal.OooOOO0.OooO0oO(tClass, "tClass");
            int iOooO0O0 = f120598OooOo.OooO0O0(tClass);
            int iOooO0O02 = this.f126231OooOo0o.OooO0O0();
            if (iOooO0O02 != 0) {
                if (iOooO0O02 == 1) {
                    oO0O00.OooO00o oooO00o = this.f126231OooOo0o;
                    kotlin.jvm.internal.OooOOO0.OooO0o0(oooO00o, "null cannot be cast to non-null type org.jetbrains.kotlin.util.OneElementArrayMap<T of org.jetbrains.kotlin.util.AttributeArrayOwner>");
                    C35172OooOOo c35172OooOOo = (C35172OooOOo) oooO00o;
                    int i = c35172OooOOo.f126249OooOo;
                    if (i == iOooO0O0) {
                        this.f126231OooOo0o = new C35172OooOOo(iOooO0O0, abstractC33338OoooOO0);
                    } else {
                        C35160OooO0Oo c35160OooO0Oo = new C35160OooO0Oo();
                        c35160OooO0Oo.f126228OooOo0o = new Object[20];
                        c35160OooO0Oo.f126227OooOo = 0;
                        this.f126231OooOo0o = c35160OooO0Oo;
                        c35160OooO0Oo.OooO0Oo(i, c35172OooOOo.f126250OooOo0o);
                    }
                }
                this.f126231OooOo0o.OooO0Oo(iOooO0O0, abstractC33338OoooOO0);
            } else {
                this.f126231OooOo0o = new C35172OooOOo(iOooO0O0, abstractC33338OoooOO0);
            }
        }
    }
}
