package oO0Ooo0O;

import androidx.core.location.LocationRequestCompat;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.Continuation;
import o0Oo00oO.C28035OooO00o;
import oO000o.C32084OooO0oo;
import oO000o.InterfaceC32083OooO0oO;
import oO000oo.C32131OooO0OO;
import oO000oo.C32132OooO0Oo;
import oO00O0o0.C32200OooOooO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32507OooOO0o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0O000o.InterfaceC32510OooOOo0;
import oO0Ooo0O.C33419OoooO0;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33644OoooO0;
import oO0o0OO.C33664o00000Oo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0OO.o00000OO;
import oOo00Oo0.C34502OooO00o;

/* JADX INFO: renamed from: oO0Ooo0O.OoooO0O, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "io.ktor.client.plugins.HttpTimeout$Plugin$install$1", m80623f = "HttpTimeout.kt", m80624l = {146, 174}, m80625m = "invokeSuspend")
public final class C33421OoooO0O extends AbstractC32476OooO implements InterfaceC32510OooOOo0<InterfaceC33425OoooOo0, C32132OooO0Oo, Continuation<? super ooOOOOOo.OooO0OO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public /* synthetic */ InterfaceC33425OoooOo0 f120822OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f120823OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ C33419OoooO0 f120824OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public /* synthetic */ C32132OooO0Oo f120825OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final /* synthetic */ oO000o0.OooO0o f120826OooOoOO;

    /* JADX INFO: renamed from: oO0Ooo0O.OoooO0O$OooO00o */
    public static final class OooO00o extends kotlin.jvm.internal.OooOOOO implements InterfaceC32507OooOO0o<Throwable, C32460OooOooO> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ o00000OO f120827OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(o00000OO o00000oo2) {
            super(1);
            this.f120827OooOo0o = o00000oo2;
        }

        @Override // oO0O000o.InterfaceC32507OooOO0o
        public final C32460OooOooO invoke(Throwable th) {
            this.f120827OooOo0o.cancel((CancellationException) null);
            return C32460OooOooO.f116667OooO00o;
        }
    }

    /* JADX INFO: renamed from: oO0Ooo0O.OoooO0O$OooO0O0 */
    @InterfaceC32482OooO0o0(m80622c = "io.ktor.client.plugins.HttpTimeout$Plugin$install$1$1$killer$1", m80623f = "HttpTimeout.kt", m80624l = {164}, m80625m = "invokeSuspend")
    public static final class OooO0O0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ Long f120828OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f120829OooOo0o;

        /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
        public final /* synthetic */ C33664o00000Oo f120830OooOoO;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public final /* synthetic */ C32132OooO0Oo f120831OooOoO0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(Long l, C32132OooO0Oo c32132OooO0Oo, C33664o00000Oo c33664o00000Oo, Continuation continuation) {
            super(2, continuation);
            this.f120828OooOo = l;
            this.f120831OooOoO0 = c32132OooO0Oo;
            this.f120830OooOoO = c33664o00000Oo;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return new OooO0O0(this.f120828OooOo, this.f120831OooOoO0, this.f120830OooOoO, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((OooO0O0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f120829OooOo0o;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                long jLongValue = this.f120828OooOo.longValue();
                this.f120829OooOo0o = 1;
                if (C33644OoooO0.OooO00o(jLongValue, this) == enumC32485OooO00o) {
                    return enumC32485OooO00o;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(obj);
            }
            C32132OooO0Oo request = this.f120831OooOoO0;
            kotlin.jvm.internal.OooOOO0.OooO0oO(request, "request");
            C32200OooOooO c32200OooOooO = request.f115203OooO00o;
            c32200OooOooO.OooO00o();
            StringBuilder sb = new StringBuilder(256);
            OoooO0O.OooOo.OooO0o(c32200OooOooO, sb);
            String string = sb.toString();
            kotlin.jvm.internal.OooOOO0.OooO0o(string, "appendTo(StringBuilder(256)).toString()");
            C33419OoooO0.OooO0O0 oooO0O0 = C33419OoooO0.f120809OooO0Oo;
            Map map = (Map) request.f115207OooO0o.OooO0OO(C32084OooO0oo.f114926OooO00o);
            C33419OoooO0.OooO00o oooO00o = (C33419OoooO0.OooO00o) (map != null ? map.get(oooO0O0) : null);
            C33415Oooo0oO c33415Oooo0oO = new C33415Oooo0oO(string, oooO00o != null ? oooO00o.f120814OooO00o : null);
            C33418OoooO.f120808OooO00o.OooO0oo("Request timeout: " + c32200OooOooO);
            String message = c33415Oooo0oO.getMessage();
            kotlin.jvm.internal.OooOOO0.OooO0Oo(message);
            this.f120830OooOoO.cancel(C28035OooO00o.OooO00o(message, c33415Oooo0oO));
            return C32460OooOooO.f116667OooO00o;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C33421OoooO0O(C33419OoooO0 c33419OoooO0, oO000o0.OooO0o oooO0o, Continuation<? super C33421OoooO0O> continuation) {
        super(3, continuation);
        this.f120824OooOoO = c33419OoooO0;
        this.f120826OooOoOO = oooO0o;
    }

    @Override // oO0O000o.InterfaceC32510OooOOo0
    public final Object invoke(InterfaceC33425OoooOo0 interfaceC33425OoooOo0, C32132OooO0Oo c32132OooO0Oo, Continuation<? super ooOOOOOo.OooO0OO> continuation) {
        C33421OoooO0O c33421OoooO0O = new C33421OoooO0O(this.f120824OooOoO, this.f120826OooOoOO, continuation);
        c33421OoooO0O.f120822OooOo = interfaceC33425OoooOo0;
        c33421OoooO0O.f120825OooOoO0 = c32132OooO0Oo;
        return c33421OoooO0O.invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f120823OooOo0o;
        if (i != 0) {
            if (i == 1) {
                C32446OooOOOo.OooO0O0(obj);
                return obj;
            }
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
            return obj;
        }
        C32446OooOOOo.OooO0O0(obj);
        InterfaceC33425OoooOo0 interfaceC33425OoooOo0 = this.f120822OooOo;
        C32132OooO0Oo c32132OooO0Oo = this.f120825OooOoO0;
        oO00O0o0.Oooo0 oooo0 = c32132OooO0Oo.f115203OooO00o.f115571OooO00o;
        kotlin.jvm.internal.OooOOO0.OooO0oO(oooo0, "<this>");
        String str = oooo0.f115583OooO00o;
        if (kotlin.jvm.internal.OooOOO0.OooO0O0(str, "ws") || kotlin.jvm.internal.OooOOO0.OooO0O0(str, "wss")) {
            this.f120822OooOo = null;
            this.f120823OooOo0o = 1;
            Object objOooO00o = interfaceC33425OoooOo0.OooO00o(c32132OooO0Oo, this);
            if (objOooO00o != enumC32485OooO00o) {
                return objOooO00o;
            }
        } else {
            C33419OoooO0.OooO0O0 oooO0O0 = C33419OoooO0.f120809OooO0Oo;
            C34502OooO00o<Map<InterfaceC32083OooO0oO<?>, Object>> c34502OooO00o = C32084OooO0oo.f114926OooO00o;
            oOo00Oo0.OooOOO0 oooOOO0 = c32132OooO0Oo.f115207OooO0o;
            Map map = (Map) oooOOO0.OooO0OO(c34502OooO00o);
            C33419OoooO0.OooO00o oooO00o = (C33419OoooO0.OooO00o) (map != null ? map.get(oooO0O0) : null);
            C33419OoooO0 c33419OoooO0 = this.f120824OooOoO;
            if (oooO00o == null && (c33419OoooO0.f120811OooO00o != null || c33419OoooO0.f120812OooO0O0 != null || c33419OoooO0.f120813OooO0OO != null)) {
                oooO00o = new C33419OoooO0.OooO00o();
                ((Map) oooOOO0.OooO0Oo(c34502OooO00o, C32131OooO0OO.f115202OooOo0o)).put(oooO0O0, oooO00o);
            }
            if (oooO00o != null) {
                Long l = oooO00o.f120815OooO0O0;
                if (l == null) {
                    l = c33419OoooO0.f120812OooO0O0;
                }
                C33419OoooO0.OooO00o.OooO00o(l);
                oooO00o.f120815OooO0O0 = l;
                Long l2 = oooO00o.f120816OooO0OO;
                if (l2 == null) {
                    l2 = c33419OoooO0.f120813OooO0OO;
                }
                C33419OoooO0.OooO00o.OooO00o(l2);
                oooO00o.f120816OooO0OO = l2;
                Long l3 = oooO00o.f120814OooO00o;
                if (l3 == null) {
                    l3 = c33419OoooO0.f120811OooO00o;
                }
                C33419OoooO0.OooO00o.OooO00o(l3);
                oooO00o.f120814OooO00o = l3;
                if (l3 == null) {
                    l3 = c33419OoooO0.f120811OooO00o;
                }
                if (l3 != null && l3.longValue() != LocationRequestCompat.PASSIVE_INTERVAL) {
                    c32132OooO0Oo.f115208OooO0o0.invokeOnCompletion(new OooO00o(C33609OooO0oo.OooO0OO(this.f120826OooOoOO, null, null, new OooO0O0(l3, c32132OooO0Oo, c32132OooO0Oo.f115208OooO0o0, null), 3)));
                }
            }
            this.f120822OooOo = null;
            this.f120823OooOo0o = 2;
            Object objOooO00o2 = interfaceC33425OoooOo0.OooO00o(c32132OooO0Oo, this);
            if (objOooO00o2 != enumC32485OooO00o) {
                return objOooO00o2;
            }
        }
        return enumC32485OooO00o;
    }
}
