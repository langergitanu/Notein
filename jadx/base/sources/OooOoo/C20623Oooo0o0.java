package OooOoo;

import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.Continuation;
import o00Ooo.InterfaceC25074OooO0OO;
import o00Ooo.InterfaceC25088OooOoO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32477OooO00o;
import oO00ooo.AbstractC32484OooO0oo;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oOo0000O.InterfaceC34415OooO0oo;

/* JADX INFO: renamed from: OooOoo.Oooo0o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C20623Oooo0o0 {

    /* JADX INFO: renamed from: OooOoo.Oooo0o0$OooO00o */
    @InterfaceC32482OooO0o0(m80622c = "androidx.compose.foundation.gestures.ForEachGestureKt$awaitEachGesture$2", m80623f = "ForEachGesture.kt", m80624l = {104, 107, 112}, m80625m = "invokeSuspend")
    public static final class OooO00o extends AbstractC32484OooO0oo implements InterfaceC32508OooOOOo<InterfaceC25074OooO0OO, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public /* synthetic */ Object f59066OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f59067OooOo0o;

        /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
        public final /* synthetic */ AbstractC32484OooO0oo f59068OooOoO;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public final /* synthetic */ InterfaceC34415OooO0oo f59069OooOoO0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public OooO00o(InterfaceC34415OooO0oo interfaceC34415OooO0oo, InterfaceC32508OooOOOo<? super InterfaceC25074OooO0OO, ? super Continuation<? super C32460OooOooO>, ? extends Object> interfaceC32508OooOOOo, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f59069OooOoO0 = interfaceC34415OooO0oo;
            this.f59068OooOoO = (AbstractC32484OooO0oo) interfaceC32508OooOOOo;
        }

        /* JADX WARN: Type inference failed for: r1v0, types: [oO00ooo.OooO0oo, oO0O000o.OooOOOo] */
        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            OooO00o oooO00o = new OooO00o(this.f59069OooOoO0, this.f59068OooOoO, continuation);
            oooO00o.f59066OooOo = obj;
            return oooO00o;
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC25074OooO0OO interfaceC25074OooO0OO, Continuation<? super C32460OooOooO> continuation) {
            return ((OooO00o) create(interfaceC25074OooO0OO, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        /* JADX WARN: Code restructure failed: missing block: B:26:0x0057, code lost:
        
            if (r9 != r0) goto L12;
         */
        /* JADX WARN: Code restructure failed: missing block: B:33:0x006c, code lost:
        
            if (r9 == r0) goto L34;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:32:0x0064  */
        /* JADX WARN: Removed duplicated region for block: B:35:0x006f  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x0070  */
        /* JADX WARN: Removed duplicated region for block: B:40:0x0041 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Type inference failed for: r1v0, types: [int] */
        /* JADX WARN: Type inference failed for: r1v1 */
        /* JADX WARN: Type inference failed for: r1v10 */
        /* JADX WARN: Type inference failed for: r1v17 */
        /* JADX WARN: Type inference failed for: r1v18 */
        /* JADX WARN: Type inference failed for: r1v19 */
        /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, o00Ooo.OooO0OO] */
        /* JADX WARN: Type inference failed for: r1v20 */
        /* JADX WARN: Type inference failed for: r1v21 */
        /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, o00Ooo.OooO0OO] */
        /* JADX WARN: Type inference failed for: r1v6 */
        /* JADX WARN: Type inference failed for: r1v7, types: [oO00ooo.OooO0oo, oO0O000o.OooOOOo] */
        /* JADX WARN: Type inference failed for: r1v9 */
        /* JADX WARN: Type inference failed for: r9v12 */
        /* JADX WARN: Type inference failed for: r9v5, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r9v8 */
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
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x0057 -> B:12:0x0028). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x006c -> B:12:0x0028). Please report as a decompilation issue!!! */
        @Override // oO00ooo.AbstractC32477OooO00o
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            ?? r9;
            ?? r1;
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            ?? r12 = this.f59067OooOo0o;
            InterfaceC34415OooO0oo interfaceC34415OooO0oo = this.f59069OooOoO0;
            try {
            } catch (CancellationException e) {
                e = e;
                if (oO00o00.OooO0OO.OooO0o(interfaceC34415OooO0oo)) {
                    throw e;
                }
                this.f59066OooOo = r12;
                this.f59067OooOo0o = 3;
                Object objOooO00o = C20623Oooo0o0.OooO00o(r12, this);
                r1 = r12;
            }
            if (r12 == 0) {
                C32446OooOOOo.OooO0O0(obj);
                r9 = (InterfaceC25074OooO0OO) this.f59066OooOo;
                if (oO00o00.OooO0OO.OooO0o(interfaceC34415OooO0oo)) {
                }
            } else {
                if (r12 != 1) {
                    if (r12 == 2) {
                        InterfaceC25074OooO0OO interfaceC25074OooO0OO = (InterfaceC25074OooO0OO) this.f59066OooOo;
                        C32446OooOOOo.OooO0O0(obj);
                        r1 = interfaceC25074OooO0OO;
                    } else {
                        if (r12 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        InterfaceC25074OooO0OO interfaceC25074OooO0OO2 = (InterfaceC25074OooO0OO) this.f59066OooOo;
                        C32446OooOOOo.OooO0O0(obj);
                        r1 = interfaceC25074OooO0OO2;
                    }
                    r9 = r1;
                    if (oO00o00.OooO0OO.OooO0o(interfaceC34415OooO0oo)) {
                        return C32460OooOooO.f116667OooO00o;
                    }
                    try {
                    } catch (CancellationException e2) {
                        r12 = r9;
                        e = e2;
                        if (oO00o00.OooO0OO.OooO0o(interfaceC34415OooO0oo)) {
                        }
                    }
                    ?? r13 = this.f59068OooOoO;
                    this.f59066OooOo = r9;
                    this.f59067OooOo0o = 1;
                    if (r13.invoke(r9, this) != enumC32485OooO00o) {
                        r12 = r9;
                        this.f59066OooOo = r12;
                        this.f59067OooOo0o = 2;
                        Object objOooO00o2 = C20623Oooo0o0.OooO00o(r12, this);
                        r1 = r12;
                    }
                    return enumC32485OooO00o;
                }
                InterfaceC25074OooO0OO interfaceC25074OooO0OO3 = (InterfaceC25074OooO0OO) this.f59066OooOo;
                C32446OooOOOo.OooO0O0(obj);
                r12 = interfaceC25074OooO0OO3;
                this.f59066OooOo = r12;
                this.f59067OooOo0o = 2;
                Object objOooO00o22 = C20623Oooo0o0.OooO00o(r12, this);
                r1 = r12;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x005d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x005b -> B:21:0x005e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object OooO00o(InterfaceC25074OooO0OO interfaceC25074OooO0OO, AbstractC32477OooO00o abstractC32477OooO00o) {
        C20621Oooo0OO c20621Oooo0OO;
        int size;
        int i;
        if (abstractC32477OooO00o instanceof C20621Oooo0OO) {
            c20621Oooo0OO = (C20621Oooo0OO) abstractC32477OooO00o;
            int i2 = c20621Oooo0OO.f59062OooOoO0;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c20621Oooo0OO.f59062OooOoO0 = i2 - Integer.MIN_VALUE;
            } else {
                c20621Oooo0OO = new C20621Oooo0OO(abstractC32477OooO00o);
            }
        }
        Object objO00o0O = c20621Oooo0OO.f59060OooOo;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i3 = c20621Oooo0OO.f59062OooOoO0;
        if (i3 == 0) {
            C32446OooOOOo.OooO0O0(objO00o0O);
            kotlin.jvm.internal.OooOOO0.OooO0oO(interfaceC25074OooO0OO, "<this>");
            List<o00Ooo.OooOo00> list = interfaceC25074OooO0OO.o00Ooo().f85127OooO00o;
            int size2 = list.size();
            for (int i4 = 0; i4 < size2; i4++) {
                if (list.get(i4).f85147OooO0Oo) {
                    o00Ooo.OooOOOO oooOOOO = o00Ooo.OooOOOO.f85132OooOoO0;
                    c20621Oooo0OO.f59061OooOo0o = interfaceC25074OooO0OO;
                    c20621Oooo0OO.f59062OooOoO0 = 1;
                    objO00o0O = interfaceC25074OooO0OO.o00o0O(oooOOOO, c20621Oooo0OO);
                    if (objO00o0O == enumC32485OooO00o) {
                    }
                    List<o00Ooo.OooOo00> list2 = ((o00Ooo.OooOOO0) objO00o0O).f85127OooO00o;
                    size = list2.size();
                    i = 0;
                    while (i < size) {
                    }
                    return C32460OooOooO.f116667OooO00o;
                }
            }
            return C32460OooOooO.f116667OooO00o;
        }
        if (i3 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        interfaceC25074OooO0OO = c20621Oooo0OO.f59061OooOo0o;
        C32446OooOOOo.OooO0O0(objO00o0O);
        List<o00Ooo.OooOo00> list22 = ((o00Ooo.OooOOO0) objO00o0O).f85127OooO00o;
        size = list22.size();
        i = 0;
        while (i < size) {
            if (list22.get(i).f85147OooO0Oo) {
                o00Ooo.OooOOOO oooOOOO2 = o00Ooo.OooOOOO.f85132OooOoO0;
                c20621Oooo0OO.f59061OooOo0o = interfaceC25074OooO0OO;
                c20621Oooo0OO.f59062OooOoO0 = 1;
                objO00o0O = interfaceC25074OooO0OO.o00o0O(oooOOOO2, c20621Oooo0OO);
                if (objO00o0O == enumC32485OooO00o) {
                    return enumC32485OooO00o;
                }
                List<o00Ooo.OooOo00> list222 = ((o00Ooo.OooOOO0) objO00o0O).f85127OooO00o;
                size = list222.size();
                i = 0;
                while (i < size) {
                }
            } else {
                i++;
            }
        }
        return C32460OooOooO.f116667OooO00o;
    }

    public static final Object OooO0O0(InterfaceC25088OooOoO interfaceC25088OooOoO, InterfaceC32508OooOOOo<? super InterfaceC25074OooO0OO, ? super Continuation<? super C32460OooOooO>, ? extends Object> interfaceC32508OooOOOo, Continuation<? super C32460OooOooO> continuation) {
        Object objOoooooo = interfaceC25088OooOoO.Ooooooo(new OooO00o(continuation.getContext(), interfaceC32508OooOOOo, null), continuation);
        return objOoooooo == EnumC32485OooO00o.f116726OooOo0o ? objOoooooo : C32460OooOooO.f116667OooO00o;
    }
}
