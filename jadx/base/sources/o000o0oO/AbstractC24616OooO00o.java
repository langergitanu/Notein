package o000o0oO;

import android.net.Uri;
import android.view.InputEvent;
import com.google.common.util.concurrent.ListenableFuture;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.OooOOO0;
import o000o0o.C24613OooO0OO;
import o000o0oo.AbstractC24621OooO0OO;
import o000o0oo.C24619OooO00o;
import o000o0oo.C24630OooOOO;
import o000o0oo.C24631OooOOO0;
import o000o0oo.C24632OooOOOO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33633Oooo0;
import oO0o0OO.C33649OoooOOo;
import oO0o0OO.InterfaceC33636Oooo00o;

/* JADX INFO: renamed from: o000o0oO.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC24616OooO00o {

    /* JADX INFO: renamed from: o000o0oO.OooO00o$OooO00o, reason: collision with other inner class name */
    public static final class C19639OooO00o extends AbstractC24616OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final AbstractC24621OooO0OO f83401OooO00o;

        /* JADX INFO: renamed from: o000o0oO.OooO00o$OooO00o$OooO00o, reason: collision with other inner class name */
        @InterfaceC32482OooO0o0(m80622c = "androidx.privacysandbox.ads.adservices.java.measurement.MeasurementManagerFutures$Api33Ext5JavaImpl$getMeasurementApiStatusAsync$1", m80623f = "MeasurementManagerFutures.kt", m80624l = {190}, m80625m = "invokeSuspend")
        public static final class C19640OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super Integer>, Object> {

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public int f83403OooOo0o;

            public C19640OooO00o(Continuation<? super C19640OooO00o> continuation) {
                super(2, continuation);
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return C19639OooO00o.this.new C19640OooO00o(continuation);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super Integer> continuation) {
                return ((C19640OooO00o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i = this.f83403OooOo0o;
                if (i != 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C32446OooOOOo.OooO0O0(obj);
                    return obj;
                }
                C32446OooOOOo.OooO0O0(obj);
                C19639OooO00o c19639OooO00o = C19639OooO00o.this;
                this.f83403OooOo0o = 1;
                Object objOooO00o = c19639OooO00o.f83401OooO00o.OooO00o(this);
                return objOooO00o == enumC32485OooO00o ? enumC32485OooO00o : objOooO00o;
            }
        }

        /* JADX INFO: renamed from: o000o0oO.OooO00o$OooO00o$OooO0O0 */
        @InterfaceC32482OooO0o0(m80622c = "androidx.privacysandbox.ads.adservices.java.measurement.MeasurementManagerFutures$Api33Ext5JavaImpl$registerSourceAsync$1", m80623f = "MeasurementManagerFutures.kt", m80624l = {143}, m80625m = "invokeSuspend")
        public static final class OooO0O0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public int f83405OooOo0o;

            /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
            public final /* synthetic */ InputEvent f83406OooOoO;

            /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
            public final /* synthetic */ Uri f83407OooOoO0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO0O0(Uri uri, InputEvent inputEvent, Continuation<? super OooO0O0> continuation) {
                super(2, continuation);
                this.f83407OooOoO0 = uri;
                this.f83406OooOoO = inputEvent;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return C19639OooO00o.this.new OooO0O0(this.f83407OooOoO0, this.f83406OooOoO, continuation);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                return ((OooO0O0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i = this.f83405OooOo0o;
                if (i == 0) {
                    C32446OooOOOo.OooO0O0(obj);
                    C19639OooO00o c19639OooO00o = C19639OooO00o.this;
                    this.f83405OooOo0o = 1;
                    if (c19639OooO00o.f83401OooO00o.OooO0O0(this.f83407OooOoO0, this.f83406OooOoO, this) == enumC32485OooO00o) {
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

        /* JADX INFO: renamed from: o000o0oO.OooO00o$OooO00o$OooO0OO */
        @InterfaceC32482OooO0o0(m80622c = "androidx.privacysandbox.ads.adservices.java.measurement.MeasurementManagerFutures$Api33Ext5JavaImpl$registerSourceAsync$2", m80623f = "MeasurementManagerFutures.kt", m80624l = {154}, m80625m = "invokeSuspend")
        public static final class OooO0OO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public int f83409OooOo0o;

            public OooO0OO(C24631OooOOO0 c24631OooOOO0, Continuation<? super OooO0OO> continuation) {
                super(2, continuation);
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return C19639OooO00o.this.new OooO0OO(null, continuation);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                return ((OooO0OO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i = this.f83409OooOo0o;
                if (i == 0) {
                    C32446OooOOOo.OooO0O0(obj);
                    C19639OooO00o c19639OooO00o = C19639OooO00o.this;
                    this.f83409OooOo0o = 1;
                    if (c19639OooO00o.f83401OooO00o.OooO0OO(null, this) == enumC32485OooO00o) {
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

        /* JADX INFO: renamed from: o000o0oO.OooO00o$OooO00o$OooO0Oo, reason: case insensitive filesystem */
        @InterfaceC32482OooO0o0(m80622c = "androidx.privacysandbox.ads.adservices.java.measurement.MeasurementManagerFutures$Api33Ext5JavaImpl$registerTriggerAsync$1", m80623f = "MeasurementManagerFutures.kt", m80624l = {162}, m80625m = "invokeSuspend")
        public static final class C24617OooO0Oo extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public int f83411OooOo0o;

            /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
            public final /* synthetic */ Uri f83412OooOoO0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C24617OooO0Oo(Uri uri, Continuation<? super C24617OooO0Oo> continuation) {
                super(2, continuation);
                this.f83412OooOoO0 = uri;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return C19639OooO00o.this.new C24617OooO0Oo(this.f83412OooOoO0, continuation);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                return ((C24617OooO0Oo) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i = this.f83411OooOo0o;
                if (i == 0) {
                    C32446OooOOOo.OooO0O0(obj);
                    C19639OooO00o c19639OooO00o = C19639OooO00o.this;
                    this.f83411OooOo0o = 1;
                    if (c19639OooO00o.f83401OooO00o.OooO0Oo(this.f83412OooOoO0, this) == enumC32485OooO00o) {
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

        public C19639OooO00o(AbstractC24621OooO0OO abstractC24621OooO0OO) {
            this.f83401OooO00o = abstractC24621OooO0OO;
        }

        @Override // o000o0oO.AbstractC24616OooO00o
        public ListenableFuture<Integer> OooO00o() {
            return C24613OooO0OO.OooO00o(C33609OooO0oo.OooO00o(C33633Oooo0.OooO00o(C33649OoooOOo.f121328OooO00o), null, new C19640OooO00o(null), 3));
        }

        @Override // o000o0oO.AbstractC24616OooO00o
        public ListenableFuture<C32460OooOooO> OooO0O0(Uri trigger) {
            OooOOO0.OooO0oO(trigger, "trigger");
            return C24613OooO0OO.OooO00o(C33609OooO0oo.OooO00o(C33633Oooo0.OooO00o(C33649OoooOOo.f121328OooO00o), null, new C24617OooO0Oo(trigger, null), 3));
        }

        public ListenableFuture<C32460OooOooO> OooO0OO(C24619OooO00o deletionRequest) {
            OooOOO0.OooO0oO(deletionRequest, "deletionRequest");
            throw null;
        }

        public ListenableFuture<C32460OooOooO> OooO0Oo(Uri attributionSource, InputEvent inputEvent) {
            OooOOO0.OooO0oO(attributionSource, "attributionSource");
            return C24613OooO0OO.OooO00o(C33609OooO0oo.OooO00o(C33633Oooo0.OooO00o(C33649OoooOOo.f121328OooO00o), null, new OooO0O0(attributionSource, inputEvent, null), 3));
        }

        public ListenableFuture<C32460OooOooO> OooO0o(C24630OooOOO request) {
            OooOOO0.OooO0oO(request, "request");
            throw null;
        }

        public ListenableFuture<C32460OooOooO> OooO0o0(C24631OooOOO0 request) {
            OooOOO0.OooO0oO(request, "request");
            return C24613OooO0OO.OooO00o(C33609OooO0oo.OooO00o(C33633Oooo0.OooO00o(C33649OoooOOo.f121328OooO00o), null, new OooO0OO(request, null), 3));
        }

        public ListenableFuture<C32460OooOooO> OooO0oO(C24632OooOOOO request) {
            OooOOO0.OooO0oO(request, "request");
            throw null;
        }
    }

    public abstract ListenableFuture<Integer> OooO00o();

    public abstract ListenableFuture<C32460OooOooO> OooO0O0(Uri uri);
}
