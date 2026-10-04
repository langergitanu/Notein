package o0o0OO;

import com.orion.notein.p607ui.p609vo.TiledPagePreviewVO;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0o0Oo.C33769Ooooo0o;
import oO0o0Oo.InterfaceC33721OooO0o;
import oO0o0Oo.InterfaceC33723OooO0oO;
import oOo000Oo.C34434OooOoO;

/* JADX INFO: renamed from: o0o0OO.OooOoO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C30379OooOoO0 implements InterfaceC33721OooO0o<List<? extends TiledPagePreviewVO>> {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ C33769Ooooo0o f108435OooOo0o;

    /* JADX INFO: renamed from: o0o0OO.OooOoO0$OooO00o */
    public static final class OooO00o<T> implements InterfaceC33723OooO0oO {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ InterfaceC33723OooO0oO f108436OooOo0o;

        /* JADX INFO: renamed from: o0o0OO.OooOoO0$OooO00o$OooO00o, reason: collision with other inner class name */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.pageeditor.viewmodel.TiledPageViewModel$special$$inlined$map$2$2", m80623f = "TiledPageViewModel.kt", m80624l = {50}, m80625m = "emit")
        public static final class C20071OooO00o extends AbstractC32479OooO0OO {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public int f108437OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public /* synthetic */ Object f108438OooOo0o;

            public C20071OooO00o(Continuation continuation) {
                super(continuation);
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                this.f108438OooOo0o = obj;
                this.f108437OooOo |= Integer.MIN_VALUE;
                return OooO00o.this.emit(null, this);
            }
        }

        public OooO00o(InterfaceC33723OooO0oO interfaceC33723OooO0oO) {
            this.f108436OooOo0o = interfaceC33723OooO0oO;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        /* JADX WARN: Type inference failed for: r6v2, types: [oO0o0Oo.OooO0oO] */
        /* JADX WARN: Type inference failed for: r7v2, types: [oOo000Oo.OooOoO] */
        /* JADX WARN: Type inference failed for: r7v3, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r7v4, types: [java.util.ArrayList] */
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
        @Override // oO0o0Oo.InterfaceC33723OooO0oO
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object emit(Object obj, Continuation continuation) {
            C20071OooO00o c20071OooO00o;
            ?? arrayList;
            if (continuation instanceof C20071OooO00o) {
                c20071OooO00o = (C20071OooO00o) continuation;
                int i = c20071OooO00o.f108437OooOo;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c20071OooO00o.f108437OooOo = i - Integer.MIN_VALUE;
                } else {
                    c20071OooO00o = new C20071OooO00o(continuation);
                }
            }
            Object obj2 = c20071OooO00o.f108438OooOo0o;
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i2 = c20071OooO00o.f108437OooOo;
            if (i2 == 0) {
                C32446OooOOOo.OooO0O0(obj2);
                List list = (List) obj;
                if (list != null) {
                    arrayList = new ArrayList();
                    for (T t : list) {
                        if (((TiledPagePreviewVO) t).isSelected()) {
                            arrayList.add(t);
                        }
                    }
                } else {
                    arrayList = C34434OooOoO.f123453OooOo0o;
                }
                c20071OooO00o.f108437OooOo = 1;
                if (this.f108436OooOo0o.emit(arrayList, c20071OooO00o) == enumC32485OooO00o) {
                    return enumC32485OooO00o;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(obj2);
            }
            return C32460OooOooO.f116667OooO00o;
        }
    }

    public C30379OooOoO0(C33769Ooooo0o c33769Ooooo0o) {
        this.f108435OooOo0o = c33769Ooooo0o;
    }

    @Override // oO0o0Oo.InterfaceC33721OooO0o
    public final Object collect(InterfaceC33723OooO0oO<? super List<? extends TiledPagePreviewVO>> interfaceC33723OooO0oO, Continuation continuation) {
        Object objCollect = this.f108435OooOo0o.f121747OooOo0o.collect(new OooO00o(interfaceC33723OooO0oO), continuation);
        return objCollect == EnumC32485OooO00o.f116726OooOo0o ? objCollect : C32460OooOooO.f116667OooO00o;
    }
}
