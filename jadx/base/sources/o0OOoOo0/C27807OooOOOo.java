package o0OOoOo0;

import com.orion.notein.domain.models.Label;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0o0Oo.InterfaceC33721OooO0o;
import oO0o0Oo.InterfaceC33723OooO0oO;
import oOo000Oo.C34434OooOoO;

/* JADX INFO: renamed from: o0OOoOo0.OooOOOo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C27807OooOOOo implements InterfaceC33721OooO0o<List<? extends Label>> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ String f98215OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ InterfaceC33721OooO0o f98216OooOo0o;

    /* JADX INFO: renamed from: o0OOoOo0.OooOOOo$OooO00o */
    public static final class OooO00o<T> implements InterfaceC33723OooO0oO {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ String f98217OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ InterfaceC33723OooO0oO f98218OooOo0o;

        /* JADX INFO: renamed from: o0OOoOo0.OooOOOo$OooO00o$OooO00o, reason: collision with other inner class name */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.domain.usecase.label.GetItemsByLabelUseCase$findLabelsByFolderId$$inlined$map$1$2", m80623f = "GetItemsByLabelUseCase.kt", m80624l = {50}, m80625m = "emit")
        public static final class C19871OooO00o extends AbstractC32479OooO0OO {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public int f98219OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public /* synthetic */ Object f98220OooOo0o;

            public C19871OooO00o(Continuation continuation) {
                super(continuation);
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                this.f98220OooOo0o = obj;
                this.f98219OooOo |= Integer.MIN_VALUE;
                return OooO00o.this.emit(null, this);
            }
        }

        public OooO00o(InterfaceC33723OooO0oO interfaceC33723OooO0oO, String str) {
            this.f98218OooOo0o = interfaceC33723OooO0oO;
            this.f98217OooOo = str;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
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
            C19871OooO00o c19871OooO00o;
            if (continuation instanceof C19871OooO00o) {
                c19871OooO00o = (C19871OooO00o) continuation;
                int i = c19871OooO00o.f98219OooOo;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c19871OooO00o.f98219OooOo = i - Integer.MIN_VALUE;
                } else {
                    c19871OooO00o = new C19871OooO00o(continuation);
                }
            }
            Object obj2 = c19871OooO00o.f98220OooOo0o;
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i2 = c19871OooO00o.f98219OooOo;
            if (i2 == 0) {
                C32446OooOOOo.OooO0O0(obj2);
                Collection collection = (List) ((Map) obj).get(this.f98217OooOo);
                if (collection == null) {
                    collection = C34434OooOoO.f123453OooOo0o;
                }
                c19871OooO00o.f98219OooOo = 1;
                if (this.f98218OooOo0o.emit(collection, c19871OooO00o) == enumC32485OooO00o) {
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

    public C27807OooOOOo(InterfaceC33721OooO0o interfaceC33721OooO0o, String str) {
        this.f98216OooOo0o = interfaceC33721OooO0o;
        this.f98215OooOo = str;
    }

    @Override // oO0o0Oo.InterfaceC33721OooO0o
    public final Object collect(InterfaceC33723OooO0oO<? super List<? extends Label>> interfaceC33723OooO0oO, Continuation continuation) {
        Object objCollect = this.f98216OooOo0o.collect(new OooO00o(interfaceC33723OooO0oO, this.f98215OooOo), continuation);
        return objCollect == EnumC32485OooO00o.f116726OooOo0o ? objCollect : C32460OooOooO.f116667OooO00o;
    }
}
