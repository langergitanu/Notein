package o0oOooO0;

import android.content.Intent;
import com.orion.notein.App;
import java.io.IOException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.OooOOO0;
import o0000o0O.OooOO0;
import o0000oOO.AbstractC24338OooO0o0;
import o00o00O0.C25252OooO0Oo;
import o0O0oooO.AbstractApplicationC26277OooOoOO;
import o0OOOo0.C27174OooO0O0;
import o0Oo00o.C28028OooO0o;
import oO00O0o0.C32194OooOo0o;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0Oo.InterfaceC33721OooO0o;
import oO0o0Oo.InterfaceC33723OooO0oO;
import oOO00oo.C34406OooO00o;
import oOo0000O.OooO;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.internal.http.RealInterceptorChain;

/* JADX INFO: renamed from: o0oOooO0.OooO0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C31151OooO0O0 implements Interceptor {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final OooOO0<AbstractC24338OooO0o0> f111153OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final AbstractApplicationC26277OooOoOO f111154OooO0O0;

    /* JADX INFO: renamed from: o0oOooO0.OooO0O0$OooO00o */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.network.DeviceForbiddenInterceptor$intercept$token$1", m80623f = "DeviceForbiddenInterceptor.kt", m80624l = {39}, m80625m = "invokeSuspend")
    public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super String>, Object> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f111156OooOo0o;

        /* JADX INFO: renamed from: o0oOooO0.OooO0O0$OooO00o$OooO00o, reason: collision with other inner class name */
        public static final class C20153OooO00o implements InterfaceC33721OooO0o<String> {

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public final /* synthetic */ InterfaceC33721OooO0o f111157OooOo0o;

            /* JADX INFO: renamed from: o0oOooO0.OooO0O0$OooO00o$OooO00o$OooO00o, reason: collision with other inner class name */
            public static final class C20154OooO00o<T> implements InterfaceC33723OooO0oO {

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public final /* synthetic */ InterfaceC33723OooO0oO f111158OooOo0o;

                /* JADX INFO: renamed from: o0oOooO0.OooO0O0$OooO00o$OooO00o$OooO00o$OooO00o, reason: collision with other inner class name */
                @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.network.DeviceForbiddenInterceptor$intercept$token$1$invokeSuspend$$inlined$map$1$2", m80623f = "DeviceForbiddenInterceptor.kt", m80624l = {50}, m80625m = "emit")
                public static final class C20155OooO00o extends AbstractC32479OooO0OO {

                    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
                    public int f111159OooOo;

                    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                    public /* synthetic */ Object f111160OooOo0o;

                    public C20155OooO00o(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // oO00ooo.AbstractC32477OooO00o
                    public final Object invokeSuspend(Object obj) {
                        this.f111160OooOo0o = obj;
                        this.f111159OooOo |= Integer.MIN_VALUE;
                        return C20154OooO00o.this.emit(null, this);
                    }
                }

                public C20154OooO00o(InterfaceC33723OooO0oO interfaceC33723OooO0oO) {
                    this.f111158OooOo0o = interfaceC33723OooO0oO;
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                @Override // oO0o0Oo.InterfaceC33723OooO0oO
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, Continuation continuation) {
                    C20155OooO00o c20155OooO00o;
                    if (continuation instanceof C20155OooO00o) {
                        c20155OooO00o = (C20155OooO00o) continuation;
                        int i = c20155OooO00o.f111159OooOo;
                        if ((i & Integer.MIN_VALUE) != 0) {
                            c20155OooO00o.f111159OooOo = i - Integer.MIN_VALUE;
                        } else {
                            c20155OooO00o = new C20155OooO00o(continuation);
                        }
                    }
                    Object obj2 = c20155OooO00o.f111160OooOo0o;
                    EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                    int i2 = c20155OooO00o.f111159OooOo;
                    if (i2 == 0) {
                        C32446OooOOOo.OooO0O0(obj2);
                        String str = (String) ((AbstractC24338OooO0o0) obj).OooO0OO(App.f69542OooOoo);
                        if (str == null) {
                            str = "";
                        }
                        c20155OooO00o.f111159OooOo = 1;
                        if (this.f111158OooOo0o.emit(str, c20155OooO00o) == enumC32485OooO00o) {
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

            public C20153OooO00o(InterfaceC33721OooO0o interfaceC33721OooO0o) {
                this.f111157OooOo0o = interfaceC33721OooO0o;
            }

            @Override // oO0o0Oo.InterfaceC33721OooO0o
            public final Object collect(InterfaceC33723OooO0oO<? super String> interfaceC33723OooO0oO, Continuation continuation) {
                Object objCollect = this.f111157OooOo0o.collect(new C20154OooO00o(interfaceC33723OooO0oO), continuation);
                return objCollect == EnumC32485OooO00o.f116726OooOo0o ? objCollect : C32460OooOooO.f116667OooO00o;
            }
        }

        public OooO00o(Continuation<? super OooO00o> continuation) {
            super(2, continuation);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return C31151OooO0O0.this.new OooO00o(continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super String> continuation) {
            return ((OooO00o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f111156OooOo0o;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(obj);
                return obj;
            }
            C32446OooOOOo.OooO0O0(obj);
            C20153OooO00o c20153OooO00o = new C20153OooO00o(C31151OooO0O0.this.f111153OooO00o.getData());
            this.f111156OooOo0o = 1;
            Object objOooOOo = C25252OooO0Oo.OooOOo(c20153OooO00o, this);
            return objOooOOo == enumC32485OooO00o ? enumC32485OooO00o : objOooOOo;
        }
    }

    public C31151OooO0O0(OooOO0 ds, AbstractApplicationC26277OooOoOO abstractApplicationC26277OooOoOO) {
        OooOOO0.OooO0oO(ds, "ds");
        this.f111153OooO00o = ds;
        this.f111154OooO0O0 = abstractApplicationC26277OooOoOO;
    }

    @Override // okhttp3.Interceptor
    public final Response intercept(Interceptor.Chain chain) throws IOException {
        Request request;
        RealInterceptorChain realInterceptorChain = (RealInterceptorChain) chain;
        Response responseOooO00o = realInterceptorChain.OooO00o(realInterceptorChain.f124446OooO0o0);
        try {
            request = responseOooO00o.f124258OooOo0o;
        } catch (Exception unused) {
        }
        if (((String) C33609OooO0oo.OooO0Oo(OooO.f123416OooOo0o, new OooO00o(null))).length() == 0) {
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooOOO0("DeviceForbiddenInterceptor");
            c20358OooO00o.OooO0o0("No handled kicking device for no-logged user, request is " + request.f124238OooO00o, new Object[0]);
            return responseOooO00o;
        }
        int i = responseOooO00o.f124259OooOoO;
        int i2 = C32194OooOo0o.f115558Oooo0.f115566OooOo0o;
        AbstractApplicationC26277OooOoOO abstractApplicationC26277OooOoOO = this.f111154OooO0O0;
        if (i == i2) {
            C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
            c20358OooO00o2.OooOOO0("DeviceForbiddenInterceptor");
            c20358OooO00o2.OooOO0O("Unauthorized, request path: ".concat(request.f124238OooO00o.OooO0O0()), new Object[0]);
            Intent intent = new Intent();
            intent.setAction("unauthorized");
            abstractApplicationC26277OooOoOO.sendBroadcast(intent);
        }
        if (OooOOO0.OooO0O0(((C27174OooO0O0) C28028OooO0o.OooO00o().fromJson(responseOooO00o.OooOOo0().string(), C27174OooO0O0.class)).getErrorCode(), "70001")) {
            C34406OooO00o.C20358OooO00o c20358OooO00o3 = C34406OooO00o.f123390OooO00o;
            c20358OooO00o3.OooOOO0("DeviceForbiddenInterceptor");
            c20358OooO00o3.OooO0o0("Session expired, request path: ".concat(request.f124238OooO00o.OooO0O0()), new Object[0]);
            Intent intent2 = new Intent();
            intent2.setAction("kick_device");
            abstractApplicationC26277OooOoOO.sendBroadcast(intent2);
        }
        return responseOooO00o;
    }
}
