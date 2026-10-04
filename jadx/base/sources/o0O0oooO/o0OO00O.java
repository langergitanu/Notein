package o0O0oooO;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.coroutines.Continuation;
import o00o00O0.C25252OooO0Oo;
import o0OOo0Oo.InterfaceC27322Oooo0o0;
import o0OOo0o.C27514o00o000;
import oO00ooO.C32443OooOOO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0O000o.InterfaceC32510OooOOo0;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0Oo.C33763OoooOOO;
import oO0o0Oo.InterfaceC33721OooO0o;
import oO0o0Oo.InterfaceC33723OooO0oO;
import oOO00oo.C34406OooO00o;

/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.RemoteConfigViewModel$observeUserAndConfigState$1", m80623f = "RemoteConfigViewModel.kt", m80624l = {54}, m80625m = "invokeSuspend")
public final class o0OO00O extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ o0O0O00 f90440OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f90441OooOo0o;

    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.RemoteConfigViewModel$observeUserAndConfigState$1$1", m80623f = "RemoteConfigViewModel.kt", m80624l = {}, m80625m = "invokeSuspend")
    public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32510OooOOo0<Boolean, String, Continuation<? super C32443OooOOO<? extends Boolean, ? extends String>>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public /* synthetic */ String f90442OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public /* synthetic */ boolean f90443OooOo0o;

        @Override // oO0O000o.InterfaceC32510OooOOo0
        public final Object invoke(Boolean bool, String str, Continuation<? super C32443OooOOO<? extends Boolean, ? extends String>> continuation) {
            boolean zBooleanValue = bool.booleanValue();
            OooO00o oooO00o = new OooO00o(3, continuation);
            oooO00o.f90443OooOo0o = zBooleanValue;
            oooO00o.f90442OooOo = str;
            return oooO00o.invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            boolean z = this.f90443OooOo0o;
            return new C32443OooOOO(Boolean.valueOf(z), this.f90442OooOo);
        }
    }

    public static final class OooO0O0<T> implements InterfaceC33723OooO0oO {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ o0O0O00 f90444OooOo0o;

        public OooO0O0(o0O0O00 o0o0o00) {
            this.f90444OooOo0o = o0o0o00;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // oO0o0Oo.InterfaceC33723OooO0oO
        public final Object emit(Object obj, Continuation continuation) {
            String value = (String) ((C32443OooOOO) obj).f116637OooOo;
            o0O0O00 o0o0o00 = this.f90444OooOo0o;
            C27514o00o000 c27514o00o000 = o0o0o00.f90437OooO0o0;
            try {
                c27514o00o000.getClass();
                InterfaceC27322Oooo0o0 interfaceC27322Oooo0o0 = c27514o00o000.f96432OooO00o;
                kotlin.jvm.internal.OooOOO0.OooO0oO(value, "value");
                interfaceC27322Oooo0o0.OooO0O0("rconfig_attr_uid", value);
                if (!o0o0o00.f90439OooO0oo) {
                    LinkedHashMap linkedHashMapOooO00o = o0o0o00.f90438OooO0oO.OooO00o();
                    for (Map.Entry entry : linkedHashMapOooO00o.entrySet()) {
                        String str = (String) entry.getKey();
                        String value2 = (String) entry.getValue();
                        String key = "rconfig_attr_" + str;
                        kotlin.jvm.internal.OooOOO0.OooO0oO(key, "key");
                        kotlin.jvm.internal.OooOOO0.OooO0oO(value2, "value");
                        interfaceC27322Oooo0o0.OooO0O0(key, value2);
                    }
                    o0o0o00.f90439OooO0oo = true;
                    C34406OooO00o.f123390OooO00o.OooO00o("Device attributes set for the first time: " + linkedHashMapOooO00o.size() + " attributes", new Object[0]);
                }
                C34406OooO00o.f123390OooO00o.OooO00o("Successfully set user attribute: uid=" + value, new Object[0]);
            } catch (Exception e) {
                C34406OooO00o.f123390OooO00o.OooO0Oo(e, "Failed to set remote config attributes", new Object[0]);
            }
            C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            return c32460OooOooO;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0OO00O(o0O0O00 o0o0o00, Continuation<? super o0OO00O> continuation) {
        super(2, continuation);
        this.f90440OooOo = o0o0o00;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new o0OO00O(this.f90440OooOo, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((o0OO00O) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f90441OooOo0o;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            o0O0O00 o0o0o00 = this.f90440OooOo;
            InterfaceC33721OooO0o interfaceC33721OooO0oOooOO0o = C25252OooO0Oo.OooOO0o(new C33763OoooOOO(o0o0o00.f90435OooO0Oo.f95374OooO00o.isInitialized(), o0o0o00.f90436OooO0o.OooO0OO(), new OooO00o(3, null)));
            OooO0O0 oooO0O0 = new OooO0O0(o0o0o00);
            this.f90441OooOo0o = 1;
            Object objCollect = interfaceC33721OooO0oOooOO0o.collect(new oo0o0Oo(oooO0O0), this);
            if (objCollect != enumC32485OooO00o) {
                objCollect = C32460OooOooO.f116667OooO00o;
            }
            if (objCollect == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
        }
        return C32460OooOooO.f116667OooO00o;
    }
}
