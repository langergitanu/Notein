package o0OOo0o;

import androidx.fragment.app.ActivityC21897OooOo0;
import com.orion.notein.App;
import kotlin.coroutines.Continuation;
import o0000oOO.AbstractC24338OooO0o0;
import o00o00O0.C25252OooO0Oo;
import o0Oo0O00.C28051OooO00o;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0Oo.InterfaceC33721OooO0o;
import oO0o0Oo.InterfaceC33723OooO0oO;

/* JADX INFO: renamed from: o0OOo0o.OooO0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.domain.usecase.AppStartupUseCase$enableCheckUpdate$1", m80623f = "AppStartupUseCase.kt", m80624l = {83}, m80625m = "invokeSuspend")
public final class C27329OooO0Oo extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super Boolean>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ ActivityC21897OooOo0 f95091OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f95092OooOo0o;

    /* JADX INFO: renamed from: o0OOo0o.OooO0Oo$OooO00o */
    public static final class OooO00o implements InterfaceC33721OooO0o<Boolean> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ InterfaceC33721OooO0o f95093OooOo0o;

        /* JADX INFO: renamed from: o0OOo0o.OooO0Oo$OooO00o$OooO00o, reason: collision with other inner class name */
        public static final class C19858OooO00o<T> implements InterfaceC33723OooO0oO {

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public final /* synthetic */ InterfaceC33723OooO0oO f95094OooOo0o;

            /* JADX INFO: renamed from: o0OOo0o.OooO0Oo$OooO00o$OooO00o$OooO00o, reason: collision with other inner class name */
            @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.domain.usecase.AppStartupUseCase$enableCheckUpdate$1$invokeSuspend$$inlined$map$1$2", m80623f = "AppStartupUseCase.kt", m80624l = {50}, m80625m = "emit")
            public static final class C19859OooO00o extends AbstractC32479OooO0OO {

                /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
                public int f95095OooOo;

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public /* synthetic */ Object f95096OooOo0o;

                public C19859OooO00o(Continuation continuation) {
                    super(continuation);
                }

                @Override // oO00ooo.AbstractC32477OooO00o
                public final Object invokeSuspend(Object obj) {
                    this.f95096OooOo0o = obj;
                    this.f95095OooOo |= Integer.MIN_VALUE;
                    return C19858OooO00o.this.emit(null, this);
                }
            }

            public C19858OooO00o(InterfaceC33723OooO0oO interfaceC33723OooO0oO) {
                this.f95094OooOo0o = interfaceC33723OooO0oO;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // oO0o0Oo.InterfaceC33723OooO0oO
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object emit(Object obj, Continuation continuation) {
                C19859OooO00o c19859OooO00o;
                if (continuation instanceof C19859OooO00o) {
                    c19859OooO00o = (C19859OooO00o) continuation;
                    int i = c19859OooO00o.f95095OooOo;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        c19859OooO00o.f95095OooOo = i - Integer.MIN_VALUE;
                    } else {
                        c19859OooO00o = new C19859OooO00o(continuation);
                    }
                }
                Object obj2 = c19859OooO00o.f95096OooOo0o;
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i2 = c19859OooO00o.f95095OooOo;
                if (i2 == 0) {
                    C32446OooOOOo.OooO0O0(obj2);
                    Boolean bool = (Boolean) ((AbstractC24338OooO0o0) obj).OooO0OO(App.f69602oo000o);
                    Boolean boolValueOf = Boolean.valueOf(bool != null ? bool.booleanValue() : true);
                    c19859OooO00o.f95095OooOo = 1;
                    if (this.f95094OooOo0o.emit(boolValueOf, c19859OooO00o) == enumC32485OooO00o) {
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

        public OooO00o(InterfaceC33721OooO0o interfaceC33721OooO0o) {
            this.f95093OooOo0o = interfaceC33721OooO0o;
        }

        @Override // oO0o0Oo.InterfaceC33721OooO0o
        public final Object collect(InterfaceC33723OooO0oO<? super Boolean> interfaceC33723OooO0oO, Continuation continuation) {
            Object objCollect = this.f95093OooOo0o.collect(new C19858OooO00o(interfaceC33723OooO0oO), continuation);
            return objCollect == EnumC32485OooO00o.f116726OooOo0o ? objCollect : C32460OooOooO.f116667OooO00o;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27329OooO0Oo(ActivityC21897OooOo0 activityC21897OooOo0, Continuation continuation) {
        super(2, continuation);
        this.f95091OooOo = activityC21897OooOo0;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C27329OooO0Oo(this.f95091OooOo, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super Boolean> continuation) {
        return ((C27329OooO0Oo) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f95092OooOo0o;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
            return obj;
        }
        C32446OooOOOo.OooO0O0(obj);
        OooO00o oooO00o = new OooO00o(C28051OooO00o.OooO00o(this.f95091OooOo).getData());
        this.f95092OooOo0o = 1;
        Object objOooOOo = C25252OooO0Oo.OooOOo(oooO00o, this);
        return objOooOOo == enumC32485OooO00o ? enumC32485OooO00o : objOooOOo;
    }
}
