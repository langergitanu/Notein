package o0oOooO0;

import android.content.Context;
import com.orion.notein.App;
import com.orion.notein.domain.models.device.DeviceInfo;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.OooOOO0;
import o0000o0O.OooOO0;
import o0000oOO.AbstractC24338OooO0o0;
import o00o00O0.C25252OooO0Oo;
import o0OO0oO0.C26940OooO0o0;
import o0OO0oO0.OooO0o;
import o0Oo00o.C28028OooO0o;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33649OoooOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0Oo.InterfaceC33721OooO0o;
import oO0o0Oo.InterfaceC33723OooO0oO;
import oO0o0o0o.C33874OooO0OO;
import oO0o0o0o.ExecutorC33873OooO0O0;
import oOo0000O.OooO;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.internal.http.RealInterceptorChain;

/* JADX INFO: renamed from: o0oOooO0.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C31150OooO00o implements Interceptor {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final OooOO0<AbstractC24338OooO0o0> f111142OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final Context f111143OooO0O0;

    /* JADX INFO: renamed from: o0oOooO0.OooO00o$OooO00o, reason: collision with other inner class name */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.network.AuthTokenInterceptor$intercept$authorization$1", m80623f = "AuthTokenInterceptor.kt", m80624l = {42}, m80625m = "invokeSuspend")
    public static final class C20149OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super String>, Object> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f111145OooOo0o;

        /* JADX INFO: renamed from: o0oOooO0.OooO00o$OooO00o$OooO00o, reason: collision with other inner class name */
        public static final class C20150OooO00o implements InterfaceC33721OooO0o<String> {

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public final /* synthetic */ InterfaceC33721OooO0o f111146OooOo0o;

            /* JADX INFO: renamed from: o0oOooO0.OooO00o$OooO00o$OooO00o$OooO00o, reason: collision with other inner class name */
            public static final class C20151OooO00o<T> implements InterfaceC33723OooO0oO {

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public final /* synthetic */ InterfaceC33723OooO0oO f111147OooOo0o;

                /* JADX INFO: renamed from: o0oOooO0.OooO00o$OooO00o$OooO00o$OooO00o$OooO00o, reason: collision with other inner class name */
                @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.network.AuthTokenInterceptor$intercept$authorization$1$invokeSuspend$$inlined$map$1$2", m80623f = "AuthTokenInterceptor.kt", m80624l = {50}, m80625m = "emit")
                public static final class C20152OooO00o extends AbstractC32479OooO0OO {

                    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
                    public int f111148OooOo;

                    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                    public /* synthetic */ Object f111149OooOo0o;

                    public C20152OooO00o(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // oO00ooo.AbstractC32477OooO00o
                    public final Object invokeSuspend(Object obj) {
                        this.f111149OooOo0o = obj;
                        this.f111148OooOo |= Integer.MIN_VALUE;
                        return C20151OooO00o.this.emit(null, this);
                    }
                }

                public C20151OooO00o(InterfaceC33723OooO0oO interfaceC33723OooO0oO) {
                    this.f111147OooOo0o = interfaceC33723OooO0oO;
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                @Override // oO0o0Oo.InterfaceC33723OooO0oO
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, Continuation continuation) {
                    C20152OooO00o c20152OooO00o;
                    if (continuation instanceof C20152OooO00o) {
                        c20152OooO00o = (C20152OooO00o) continuation;
                        int i = c20152OooO00o.f111148OooOo;
                        if ((i & Integer.MIN_VALUE) != 0) {
                            c20152OooO00o.f111148OooOo = i - Integer.MIN_VALUE;
                        } else {
                            c20152OooO00o = new C20152OooO00o(continuation);
                        }
                    }
                    Object obj2 = c20152OooO00o.f111149OooOo0o;
                    EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                    int i2 = c20152OooO00o.f111148OooOo;
                    if (i2 == 0) {
                        C32446OooOOOo.OooO0O0(obj2);
                        String str = (String) ((AbstractC24338OooO0o0) obj).OooO0OO(App.f69542OooOoo);
                        if (str == null) {
                            str = "";
                        }
                        c20152OooO00o.f111148OooOo = 1;
                        if (this.f111147OooOo0o.emit(str, c20152OooO00o) == enumC32485OooO00o) {
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

            public C20150OooO00o(InterfaceC33721OooO0o interfaceC33721OooO0o) {
                this.f111146OooOo0o = interfaceC33721OooO0o;
            }

            @Override // oO0o0Oo.InterfaceC33721OooO0o
            public final Object collect(InterfaceC33723OooO0oO<? super String> interfaceC33723OooO0oO, Continuation continuation) {
                Object objCollect = this.f111146OooOo0o.collect(new C20151OooO00o(interfaceC33723OooO0oO), continuation);
                return objCollect == EnumC32485OooO00o.f116726OooOo0o ? objCollect : C32460OooOooO.f116667OooO00o;
            }
        }

        public C20149OooO00o(Continuation<? super C20149OooO00o> continuation) {
            super(2, continuation);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return C31150OooO00o.this.new C20149OooO00o(continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super String> continuation) {
            return ((C20149OooO00o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f111145OooOo0o;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(obj);
                return obj;
            }
            C32446OooOOOo.OooO0O0(obj);
            C20150OooO00o c20150OooO00o = new C20150OooO00o(C31150OooO00o.this.f111142OooO00o.getData());
            this.f111145OooOo0o = 1;
            Object objOooOOo = C25252OooO0Oo.OooOOo(c20150OooO00o, this);
            return objOooOOo == enumC32485OooO00o ? enumC32485OooO00o : objOooOOo;
        }
    }

    /* JADX INFO: renamed from: o0oOooO0.OooO00o$OooO0O0 */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.network.AuthTokenInterceptor$intercept$deviceInfo$1", m80623f = "AuthTokenInterceptor.kt", m80624l = {35}, m80625m = "invokeSuspend")
    public static final class OooO0O0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super DeviceInfo>, Object> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f111152OooOo0o;

        public OooO0O0(Continuation<? super OooO0O0> continuation) {
            super(2, continuation);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return C31150OooO00o.this.new OooO0O0(continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super DeviceInfo> continuation) {
            return ((OooO0O0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) throws Throwable {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f111152OooOo0o;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(obj);
                return obj;
            }
            C32446OooOOOo.OooO0O0(obj);
            OooO0o oooO0o = OooO0o.f93585OooO00o;
            Context context = C31150OooO00o.this.f111143OooO0O0;
            this.f111152OooOo0o = 1;
            C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
            Object objOooO0o = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C26940OooO0o0(context, null), this);
            return objOooO0o == enumC32485OooO00o ? enumC32485OooO00o : objOooO0o;
        }
    }

    public C31150OooO00o(OooOO0<AbstractC24338OooO0o0> ds, Context context) {
        OooOOO0.OooO0oO(ds, "ds");
        OooOOO0.OooO0oO(context, "context");
        this.f111142OooO00o = ds;
        this.f111143OooO0O0 = context;
    }

    @Override // okhttp3.Interceptor
    public final Response intercept(Interceptor.Chain chain) {
        RealInterceptorChain realInterceptorChain = (RealInterceptorChain) chain;
        OooO0O0 oooO0O0 = new OooO0O0(null);
        OooO oooO = OooO.f123416OooOo0o;
        String json = C28028OooO0o.OooO00o().toJson((DeviceInfo) C33609OooO0oo.OooO0Oo(oooO, oooO0O0));
        String str = (String) C33609OooO0oo.OooO0Oo(oooO, new C20149OooO00o(null));
        Request.Builder builderOooO00o = realInterceptorChain.f124446OooO0o0.OooO00o();
        builderOooO00o.OooO00o("Authorization", str);
        OooOOO0.OooO0Oo(json);
        builderOooO00o.OooO00o("device_info", json);
        builderOooO00o.OooO00o("X-App-Version", "394");
        return realInterceptorChain.OooO00o(builderOooO00o.OooO0O0());
    }
}
