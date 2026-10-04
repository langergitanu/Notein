package o000o0oo;

import android.adservices.measurement.MeasurementManager;
import android.net.Uri;
import android.view.InputEvent;
import androidx.core.os.OutcomeReceiverKt;
import androidx.fragment.app.C21904OooOoo0;
import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.C33614OooOOO0;
import oO0o0OO.C33633Oooo0;
import oO0o0OO.InterfaceC33636Oooo00o;

/* JADX INFO: renamed from: o000o0oo.OooOO0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C24629OooOO0o extends AbstractC24621OooO0OO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final MeasurementManager f83414OooO00o;

    /* JADX INFO: renamed from: o000o0oo.OooOO0o$OooO00o */
    @InterfaceC32482OooO0o0(m80622c = "androidx.privacysandbox.ads.adservices.measurement.MeasurementManagerImplCommon$registerSource$4", m80623f = "MeasurementManagerImplCommon.kt", m80624l = {}, m80625m = "invokeSuspend")
    public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public /* synthetic */ Object f83416OooOo0o;

        public OooO00o(C24631OooOOO0 c24631OooOOO0, Continuation continuation) {
            super(2, continuation);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            OooO00o oooO00o = C24629OooOO0o.this.new OooO00o(null, continuation);
            oooO00o.f83416OooOo0o = obj;
            return oooO00o;
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            ((OooO00o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            throw null;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            throw null;
        }
    }

    public C24629OooOO0o(MeasurementManager mMeasurementManager) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(mMeasurementManager, "mMeasurementManager");
        this.f83414OooO00o = mMeasurementManager;
    }

    public static Object OooO(C24629OooOO0o c24629OooOO0o, C24631OooOOO0 c24631OooOOO0, Continuation<? super C32460OooOooO> continuation) {
        Object objOooO0o0 = C33633Oooo0.OooO0o0(c24629OooOO0o.new OooO00o(c24631OooOOO0, null), continuation);
        return objOooO0o0 == EnumC32485OooO00o.f116726OooOo0o ? objOooO0o0 : C32460OooOooO.f116667OooO00o;
    }

    public static Object OooO0o(C24629OooOO0o c24629OooOO0o, C24619OooO00o c24619OooO00o, Continuation<? super C32460OooOooO> continuation) {
        new C33614OooOOO0(1, C21904OooOoo0.OooO0o0(continuation)).OooOOoo();
        MeasurementManager measurementManager = c24629OooOO0o.f83414OooO00o;
        throw null;
    }

    public static Object OooO0oO(C24629OooOO0o c24629OooOO0o, Continuation<? super Integer> continuation) throws Throwable {
        C33614OooOOO0 c33614OooOOO0 = new C33614OooOOO0(1, C21904OooOoo0.OooO0o0(continuation));
        c33614OooOOO0.OooOOoo();
        c24629OooOO0o.f83414OooO00o.getMeasurementApiStatus(new o0000OO0.OooO(), OutcomeReceiverKt.asOutcomeReceiver(c33614OooOOO0));
        Object objOooOOo = c33614OooOOO0.OooOOo();
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        return objOooOOo;
    }

    public static Object OooO0oo(C24629OooOO0o c24629OooOO0o, Uri uri, InputEvent inputEvent, Continuation<? super C32460OooOooO> continuation) throws Throwable {
        C33614OooOOO0 c33614OooOOO0 = new C33614OooOOO0(1, C21904OooOoo0.OooO0o0(continuation));
        c33614OooOOO0.OooOOoo();
        c24629OooOO0o.f83414OooO00o.registerSource(uri, inputEvent, new o0000OO0.OooO(), OutcomeReceiverKt.asOutcomeReceiver(c33614OooOOO0));
        Object objOooOOo = c33614OooOOO0.OooOOo();
        return objOooOOo == EnumC32485OooO00o.f116726OooOo0o ? objOooOOo : C32460OooOooO.f116667OooO00o;
    }

    public static Object OooOO0(C24629OooOO0o c24629OooOO0o, Uri uri, Continuation<? super C32460OooOooO> continuation) throws Throwable {
        C33614OooOOO0 c33614OooOOO0 = new C33614OooOOO0(1, C21904OooOoo0.OooO0o0(continuation));
        c33614OooOOO0.OooOOoo();
        c24629OooOO0o.f83414OooO00o.registerTrigger(uri, new o0000OO0.OooO(), OutcomeReceiverKt.asOutcomeReceiver(c33614OooOOO0));
        Object objOooOOo = c33614OooOOO0.OooOOo();
        return objOooOOo == EnumC32485OooO00o.f116726OooOo0o ? objOooOOo : C32460OooOooO.f116667OooO00o;
    }

    public static Object OooOO0o(C24629OooOO0o c24629OooOO0o, C24630OooOOO c24630OooOOO, Continuation<? super C32460OooOooO> continuation) {
        new C33614OooOOO0(1, C21904OooOoo0.OooO0o0(continuation)).OooOOoo();
        MeasurementManager measurementManager = c24629OooOO0o.f83414OooO00o;
        throw null;
    }

    public static Object OooOOO(C24629OooOO0o c24629OooOO0o, C24632OooOOOO c24632OooOOOO, Continuation<? super C32460OooOooO> continuation) {
        new C33614OooOOO0(1, C21904OooOoo0.OooO0o0(continuation)).OooOOoo();
        MeasurementManager measurementManager = c24629OooOO0o.f83414OooO00o;
        throw null;
    }

    @Override // o000o0oo.AbstractC24621OooO0OO
    public Object OooO00o(Continuation<? super Integer> continuation) {
        return OooO0oO(this, continuation);
    }

    @Override // o000o0oo.AbstractC24621OooO0OO
    public Object OooO0O0(Uri uri, InputEvent inputEvent, Continuation<? super C32460OooOooO> continuation) {
        return OooO0oo(this, uri, inputEvent, continuation);
    }

    @Override // o000o0oo.AbstractC24621OooO0OO
    public Object OooO0OO(C24631OooOOO0 c24631OooOOO0, Continuation<? super C32460OooOooO> continuation) {
        return OooO(this, c24631OooOOO0, continuation);
    }

    @Override // o000o0oo.AbstractC24621OooO0OO
    public Object OooO0Oo(Uri uri, Continuation<? super C32460OooOooO> continuation) {
        return OooOO0(this, uri, continuation);
    }

    public Object OooO0o0(C24619OooO00o c24619OooO00o, Continuation<? super C32460OooOooO> continuation) {
        return OooO0o(this, c24619OooO00o, continuation);
    }

    public Object OooOO0O(C24630OooOOO c24630OooOOO, Continuation<? super C32460OooOooO> continuation) {
        return OooOO0o(this, c24630OooOOO, continuation);
    }

    public Object OooOOO0(C24632OooOOOO c24632OooOOOO, Continuation<? super C32460OooOooO> continuation) {
        return OooOOO(this, c24632OooOOOO, continuation);
    }
}
