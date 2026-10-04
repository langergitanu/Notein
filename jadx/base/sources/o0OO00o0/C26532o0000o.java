package o0OO00o0;

import com.google.gson.Gson;
import com.orion.notein.domain.models.foundation.RatioPointF;
import kotlin.coroutines.Continuation;
import o0000oOO.AbstractC24338OooO0o0;
import oO00ooO.C32445OooOOOO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0o0Oo.InterfaceC33721OooO0o;
import oO0o0Oo.InterfaceC33723OooO0oO;

/* JADX INFO: renamed from: o0OO00o0.o0000o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C26532o0000o implements InterfaceC33721OooO0o<RatioPointF> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ AbstractC24338OooO0o0.OooO00o f91348OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ InterfaceC33721OooO0o f91349OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ C26577o000oo0O f91350OooOoO0;

    /* JADX INFO: renamed from: o0OO00o0.o0000o$OooO00o */
    public static final class OooO00o<T> implements InterfaceC33723OooO0oO {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ AbstractC24338OooO0o0.OooO00o f91351OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ InterfaceC33723OooO0oO f91352OooOo0o;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public final /* synthetic */ C26577o000oo0O f91353OooOoO0;

        /* JADX INFO: renamed from: o0OO00o0.o0000o$OooO00o$OooO00o, reason: collision with other inner class name */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.GlobalSettingRepoImpl$getPositionBias$$inlined$map$1$2", m80623f = "GlobalSettingRepoImpl.kt", m80624l = {50}, m80625m = "emit")
        public static final class C19776OooO00o extends AbstractC32479OooO0OO {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public int f91354OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public /* synthetic */ Object f91355OooOo0o;

            public C19776OooO00o(Continuation continuation) {
                super(continuation);
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                this.f91355OooOo0o = obj;
                this.f91354OooOo |= Integer.MIN_VALUE;
                return OooO00o.this.emit(null, this);
            }
        }

        public OooO00o(InterfaceC33723OooO0oO interfaceC33723OooO0oO, AbstractC24338OooO0o0.OooO00o oooO00o, C26577o000oo0O c26577o000oo0O) {
            this.f91352OooOo0o = interfaceC33723OooO0oO;
            this.f91351OooOo = oooO00o;
            this.f91353OooOoO0 = c26577o000oo0O;
        }

        /* JADX WARN: Multi-variable type inference failed */
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
            C19776OooO00o c19776OooO00o;
            Object objOooO00o;
            if (continuation instanceof C19776OooO00o) {
                c19776OooO00o = (C19776OooO00o) continuation;
                int i = c19776OooO00o.f91354OooOo;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c19776OooO00o.f91354OooOo = i - Integer.MIN_VALUE;
                } else {
                    c19776OooO00o = new C19776OooO00o(continuation);
                }
            }
            Object obj2 = c19776OooO00o.f91355OooOo0o;
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i2 = c19776OooO00o.f91354OooOo;
            if (i2 == 0) {
                C32446OooOOOo.OooO0O0(obj2);
                String str = (String) ((AbstractC24338OooO0o0) obj).OooO0OO(this.f91351OooOo);
                if (str != null) {
                    try {
                        objOooO00o = (RatioPointF) ((Gson) this.f91353OooOoO0.f91600OooO0OO.getValue()).fromJson(str, (Class) RatioPointF.class);
                    } catch (Throwable th) {
                        objOooO00o = C32446OooOOOo.OooO00o(th);
                    }
                    obj = (RatioPointF) (objOooO00o instanceof C32445OooOOOO.OooO00o ? null : objOooO00o);
                }
                c19776OooO00o.f91354OooOo = 1;
                if (this.f91352OooOo0o.emit(obj, c19776OooO00o) == enumC32485OooO00o) {
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

    public C26532o0000o(InterfaceC33721OooO0o interfaceC33721OooO0o, AbstractC24338OooO0o0.OooO00o oooO00o, C26577o000oo0O c26577o000oo0O) {
        this.f91349OooOo0o = interfaceC33721OooO0o;
        this.f91348OooOo = oooO00o;
        this.f91350OooOoO0 = c26577o000oo0O;
    }

    @Override // oO0o0Oo.InterfaceC33721OooO0o
    public final Object collect(InterfaceC33723OooO0oO<? super RatioPointF> interfaceC33723OooO0oO, Continuation continuation) {
        Object objCollect = this.f91349OooOo0o.collect(new OooO00o(interfaceC33723OooO0oO, this.f91348OooOo, this.f91350OooOoO0), continuation);
        return objCollect == EnumC32485OooO00o.f116726OooOo0o ? objCollect : C32460OooOooO.f116667OooO00o;
    }
}
