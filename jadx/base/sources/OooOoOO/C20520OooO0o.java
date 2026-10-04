package OooOoOO;

import kotlin.coroutines.Continuation;
import o0000Ooo.C24232OooO0o0;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32507OooOO0o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0OOo.C33702OooOOO;
import oO0o0OOo.InterfaceC33699OooOO0;
import oO0o0OOo.InterfaceC33701OooOO0o;

/* JADX INFO: renamed from: OooOoOO.OooO0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC32482OooO0o0(m80622c = "androidx.compose.animation.core.AnimateAsStateKt$animateValueAsState$3", m80623f = "AnimateAsState.kt", m80624l = {419}, m80625m = "invokeSuspend")
public final class C20520OooO0o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public int f58611OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public InterfaceC33701OooOO0o f58612OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ InterfaceC33699OooOO0<Object> f58613OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public /* synthetic */ Object f58614OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final /* synthetic */ C20518OooO0OO<Object, Object> f58615OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public final /* synthetic */ Oooo0oO.o00oO0O f58616OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final /* synthetic */ Oooo0oO.o00oO0O f58617OooOoo0;

    /* JADX INFO: renamed from: OooOoOO.OooO0o$OooO00o */
    @InterfaceC32482OooO0o0(m80622c = "androidx.compose.animation.core.AnimateAsStateKt$animateValueAsState$3$1", m80623f = "AnimateAsState.kt", m80624l = {428}, m80625m = "invokeSuspend")
    public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ Object f58618OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f58619OooOo0o;

        /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
        public final /* synthetic */ Oooo0oO.o00oO0O f58620OooOoO;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public final /* synthetic */ C20518OooO0OO<Object, Object> f58621OooOoO0;

        /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
        public final /* synthetic */ Oooo0oO.o00oO0O f58622OooOoOO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(Object obj, C20518OooO0OO c20518OooO0OO, Oooo0oO.o00oO0O o00oo0o, Oooo0oO.o00oO0O o00oo0o2, Continuation continuation) {
            super(2, continuation);
            this.f58618OooOo = obj;
            this.f58621OooOoO0 = c20518OooO0OO;
            this.f58620OooOoO = o00oo0o;
            this.f58622OooOoOO = o00oo0o2;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return new OooO00o(this.f58618OooOo, this.f58621OooOoO0, this.f58620OooOoO, this.f58622OooOoOO, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((OooO00o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f58619OooOo0o;
            C20518OooO0OO<Object, Object> c20518OooO0OO = this.f58621OooOoO0;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                T value = c20518OooO0OO.f58605OooO0o0.getValue();
                Object obj2 = this.f58618OooOo;
                if (!kotlin.jvm.internal.OooOOO0.OooO0O0(obj2, value)) {
                    C20555OoooO0<C24232OooO0o0> c20555OoooO0 = C20522OooO0oO.f58625OooO00o;
                    InterfaceC20526OooOO0o interfaceC20526OooOO0o = (InterfaceC20526OooOO0o) this.f58620OooOoO.getValue();
                    this.f58619OooOo0o = 1;
                    if (C20518OooO0OO.OooO0O0(c20518OooO0OO, obj2, interfaceC20526OooOO0o, this) == enumC32485OooO00o) {
                        return enumC32485OooO00o;
                    }
                }
                return C32460OooOooO.f116667OooO00o;
            }
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
            C20555OoooO0<C24232OooO0o0> c20555OoooO02 = C20522OooO0oO.f58625OooO00o;
            InterfaceC32507OooOO0o interfaceC32507OooOO0o = (InterfaceC32507OooOO0o) this.f58622OooOoOO.getValue();
            if (interfaceC32507OooOO0o != null) {
                interfaceC32507OooOO0o.invoke(c20518OooO0OO.OooO0OO());
            }
            return C32460OooOooO.f116667OooO00o;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20520OooO0o(InterfaceC33699OooOO0 interfaceC33699OooOO0, C20518OooO0OO c20518OooO0OO, Oooo0oO.o00oO0O o00oo0o, Oooo0oO.o00oO0O o00oo0o2, Continuation continuation) {
        super(2, continuation);
        this.f58613OooOoO = interfaceC33699OooOO0;
        this.f58615OooOoOO = c20518OooO0OO;
        this.f58617OooOoo0 = o00oo0o;
        this.f58616OooOoo = o00oo0o2;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        C20520OooO0o c20520OooO0o = new C20520OooO0o(this.f58613OooOoO, this.f58615OooOoOO, this.f58617OooOoo0, this.f58616OooOoo, continuation);
        c20520OooO0o.f58614OooOoO0 = obj;
        return c20520OooO0o;
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C20520OooO0o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0035 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0061  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0033 -> B:12:0x0036). Please report as a decompilation issue!!! */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        InterfaceC33701OooOO0o<Object> it;
        InterfaceC33636Oooo00o interfaceC33636Oooo00o;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f58611OooOo;
        InterfaceC33699OooOO0<Object> interfaceC33699OooOO0 = this.f58613OooOoO;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            InterfaceC33636Oooo00o interfaceC33636Oooo00o2 = (InterfaceC33636Oooo00o) this.f58614OooOoO0;
            it = interfaceC33699OooOO0.iterator();
            interfaceC33636Oooo00o = interfaceC33636Oooo00o2;
            this.f58614OooOoO0 = interfaceC33636Oooo00o;
            this.f58612OooOo0o = it;
            this.f58611OooOo = 1;
            obj = it.OooO00o(this);
            if (obj == enumC32485OooO00o) {
            }
            if (((Boolean) obj).booleanValue()) {
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            it = this.f58612OooOo0o;
            interfaceC33636Oooo00o = (InterfaceC33636Oooo00o) this.f58614OooOoO0;
            C32446OooOOOo.OooO0O0(obj);
            if (((Boolean) obj).booleanValue()) {
                Object next = it.next();
                Object objOooO0O0 = C33702OooOOO.OooO0O0(interfaceC33699OooOO0.OooO0oo());
                Object obj2 = objOooO0O0 == null ? next : objOooO0O0;
                C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new OooO00o(obj2, this.f58615OooOoOO, this.f58617OooOoo0, this.f58616OooOoo, null), 3);
                this.f58614OooOoO0 = interfaceC33636Oooo00o;
                this.f58612OooOo0o = it;
                this.f58611OooOo = 1;
                obj = it.OooO00o(this);
                if (obj == enumC32485OooO00o) {
                    return enumC32485OooO00o;
                }
                if (((Boolean) obj).booleanValue()) {
                    return C32460OooOooO.f116667OooO00o;
                }
            }
        }
    }
}
