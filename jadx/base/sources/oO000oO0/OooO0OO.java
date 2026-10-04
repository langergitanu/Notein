package oO000oO0;

import OooOoOO.C20519OooO0Oo;
import androidx.core.location.LocationRequestCompat;
import androidx.fragment.app.C21904OooOoo0;
import io.ktor.utils.p616io.C24005o00o0O;
import io.ktor.utils.p616io.InterfaceC23986Ooooo0o;
import java.io.Closeable;
import java.io.IOException;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.C24019OooOO0o;
import kotlin.jvm.internal.C24035Oooo00o;
import o0Oo0oOo.C28328OooOo0o;
import oO000o.C32085OooOO0o;
import oO000o.C32087OooOOo0;
import oO000o.InterfaceC32083OooO0oO;
import oO000oo.C32134OooO0o0;
import oO000oo.C32135OooO0oO;
import oO000oo0.C32137OooO00o;
import oO00O0o0.C32192OooOo0;
import oO00O0o0.C32193OooOo0O;
import oO00O0o0.C32194OooOo0o;
import oO00O0oO.OooO0OO;
import oO00ooO.C32442OooOO0o;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32447OooOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32507OooOO0o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0Ooo0O.C33418OoooO;
import oO0Ooo0O.C33419OoooO0;
import oO0o0OO.AbstractC33630OooOooO;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33614OooOOO0;
import oO0o0OO.C33649OoooOOo;
import oO0o0OO.C33662Ooooooo;
import oO0o0OO.EnumC33637Oooo0O0;
import oO0o0OO.InterfaceC33623OooOo0O;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0OO.InterfaceC33672o00ooo;
import oO0o0o0o.C33874OooO0OO;
import oO0o0o0o.C33880OooOO0;
import oO0o0o0o.ExecutorC33873OooO0O0;
import oO0oOOO0.C34108OooO00o;
import oO0oOOO0.C34109OooO0O0;
import oOO00OOo.InterfaceC34352OooO0O0;
import oOo0000O.InterfaceC34415OooO0oo;
import oOo00Oo0.C34514OooOOoo;
import oOo00OoO.InterfaceC34525OooO0o;
import okhttp3.Dispatcher;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.internal.connection.RealCall;
import okhttp3.internal.http.HttpMethod;

/* JADX INFO: loaded from: classes10.dex */
public final class OooO0OO extends oO000o.OooO0o {

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public static final C32447OooOOo f115098Oooo000 = C20519OooO0Oo.OooO0OO(OooO0O0.f115107OooOo0o);

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final oO000oO0.OooO0O0 f115099OooOoO;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final C32447OooOOo f115100OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public final InterfaceC34415OooO0oo f115101OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final Set<InterfaceC32083OooO0oO<?>> f115102OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public final InterfaceC34415OooO0oo f115103OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public final Map<C33419OoooO0.OooO00o, OkHttpClient> f115104OooOooo;

    @InterfaceC32482OooO0o0(m80622c = "io.ktor.client.engine.okhttp.OkHttpEngine$1", m80623f = "OkHttpEngine.kt", m80624l = {59}, m80625m = "invokeSuspend")
    public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f115106OooOo0o;

        public OooO00o(Continuation<? super OooO00o> continuation) {
            super(2, continuation);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return OooO0OO.this.new OooO00o(continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((OooO00o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) throws IOException {
            Iterator<Map.Entry<C33419OoooO0.OooO00o, OkHttpClient>> it;
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f115106OooOo0o;
            OooO0OO oooO0OO = OooO0OO.this;
            try {
                if (i == 0) {
                    C32446OooOOOo.OooO0O0(obj);
                    InterfaceC34415OooO0oo.OooO0O0 oooO0O0 = oooO0OO.f115101OooOoo.get(InterfaceC33672o00ooo.OooO00o.f121379OooOo0o);
                    kotlin.jvm.internal.OooOOO0.OooO0Oo(oooO0O0);
                    this.f115106OooOo0o = 1;
                    if (((InterfaceC33672o00ooo) oooO0O0).join(this) == enumC32485OooO00o) {
                        return enumC32485OooO00o;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C32446OooOOOo.OooO0O0(obj);
                }
                while (it.hasNext()) {
                    OkHttpClient value = it.next().getValue();
                    value.f124173OooOo.OooO00o();
                    ((ThreadPoolExecutor) value.f124174OooOo0o.OooO00o()).shutdown();
                }
                InterfaceC34415OooO0oo interfaceC34415OooO0ooO000O0oO = oooO0OO.o000O0oO();
                kotlin.jvm.internal.OooOOO0.OooO0o0(interfaceC34415OooO0ooO000O0oO, "null cannot be cast to non-null type java.io.Closeable");
                ((Closeable) interfaceC34415OooO0ooO000O0oO).close();
                return C32460OooOooO.f116667OooO00o;
            } finally {
                it = oooO0OO.f115104OooOooo.entrySet().iterator();
                while (it.hasNext()) {
                    OkHttpClient value2 = it.next().getValue();
                    value2.f124173OooOo.OooO00o();
                    ((ThreadPoolExecutor) value2.f124174OooOo0o.OooO00o()).shutdown();
                }
                InterfaceC34415OooO0oo interfaceC34415OooO0ooO000O0oO2 = oooO0OO.o000O0oO();
                kotlin.jvm.internal.OooOOO0.OooO0o0(interfaceC34415OooO0ooO000O0oO2, "null cannot be cast to non-null type java.io.Closeable");
                ((Closeable) interfaceC34415OooO0ooO000O0oO2).close();
            }
        }
    }

    public static final class OooO0O0 extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<OkHttpClient> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public static final OooO0O0 f115107OooOo0o = new OooO0O0(0);

        @Override // oO0O000o.OooO00o
        public final OkHttpClient invoke() {
            return new OkHttpClient(new OkHttpClient.Builder());
        }
    }

    /* JADX INFO: renamed from: oO000oO0.OooO0OO$OooO0OO, reason: collision with other inner class name */
    public /* synthetic */ class C20200OooO0OO extends C24019OooOO0o implements InterfaceC32507OooOO0o<C33419OoooO0.OooO00o, OkHttpClient> {
        @Override // oO0O000o.InterfaceC32507OooOO0o
        public final OkHttpClient invoke(C33419OoooO0.OooO00o oooO00o) {
            C33419OoooO0.OooO00o oooO00o2 = oooO00o;
            oO000oO0.OooO0O0 oooO0O0 = ((OooO0OO) this.receiver).f115099OooOoO;
            oooO0O0.getClass();
            OkHttpClient.Builder builderOooO0O0 = ((OkHttpClient) OooO0OO.f115098Oooo000.getValue()).OooO0O0();
            builderOooO0O0.f124202OooO00o = new Dispatcher();
            oooO0O0.f115095OooO00o.invoke(builderOooO0O0);
            if (oooO00o2 != null) {
                Long l = oooO00o2.f120815OooO0O0;
                if (l != null) {
                    long jLongValue = l.longValue();
                    InterfaceC34352OooO0O0 interfaceC34352OooO0O0 = C33418OoooO.f120808OooO00o;
                    if (jLongValue == LocationRequestCompat.PASSIVE_INTERVAL) {
                        jLongValue = 0;
                    }
                    builderOooO0O0.OooO00o(jLongValue, TimeUnit.MILLISECONDS);
                }
                Long l2 = oooO00o2.f120816OooO0OO;
                if (l2 != null) {
                    long jLongValue2 = l2.longValue();
                    InterfaceC34352OooO0O0 interfaceC34352OooO0O02 = C33418OoooO.f120808OooO00o;
                    long j = jLongValue2 == LocationRequestCompat.PASSIVE_INTERVAL ? 0L : jLongValue2;
                    TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                    builderOooO0O0.OooO0OO(j, timeUnit);
                    builderOooO0O0.OooO0o0(jLongValue2 != LocationRequestCompat.PASSIVE_INTERVAL ? jLongValue2 : 0L, timeUnit);
                }
            }
            return new OkHttpClient(builderOooO0O0);
        }
    }

    public static final class OooO0Oo extends kotlin.jvm.internal.OooOOOO implements InterfaceC32507OooOO0o<OkHttpClient, C32460OooOooO> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public static final OooO0Oo f115108OooOo0o = new OooO0Oo(1);

        @Override // oO0O000o.InterfaceC32507OooOO0o
        public final C32460OooOooO invoke(OkHttpClient okHttpClient) {
            OkHttpClient it = okHttpClient;
            kotlin.jvm.internal.OooOOO0.OooO0oO(it, "it");
            return C32460OooOooO.f116667OooO00o;
        }
    }

    /* JADX INFO: renamed from: oO000oO0.OooO0OO$OooO0o0, reason: case insensitive filesystem */
    public static final class C32108OooO0o0 extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<AbstractC33630OooOooO> {
        public C32108OooO0o0() {
            super(0);
        }

        @Override // oO0O000o.OooO00o
        public final AbstractC33630OooOooO invoke() {
            C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
            OooO0OO.this.f115099OooOoO.getClass();
            ExecutorC33873OooO0O0.f122045OooOoO0.getClass();
            return C33880OooOO0.f122052OooOoO0.o000OOo0(4);
        }
    }

    public OooO0OO(oO000oO0.OooO0O0 oooO0O0) {
        super("ktor-okhttp");
        this.f115099OooOoO = oooO0O0;
        this.f115100OooOoOO = C20519OooO0Oo.OooO0OO(new C32108OooO0o0());
        this.f115102OooOoo0 = oOo000Oo.OooOOO.OoooOo0(new InterfaceC32083OooO0oO[]{C33419OoooO0.f120809OooO0Oo, C32137OooO00o.f115235OooO00o});
        C20200OooO0OO c20200OooO0OO = new C20200OooO0OO(1, this, OooO0OO.class, "createOkHttpClient", "createOkHttpClient(Lio/ktor/client/plugins/HttpTimeout$HttpTimeoutCapabilityConfiguration;)Lokhttp3/OkHttpClient;", 0);
        OooO0Oo close = OooO0Oo.f115108OooOo0o;
        kotlin.jvm.internal.OooOOO0.OooO0oO(close, "close");
        Map<C33419OoooO0.OooO00o, OkHttpClient> mapSynchronizedMap = Collections.synchronizedMap(new C34514OooOOoo(c20200OooO0OO, close, oooO0O0.f115096OooO0O0));
        kotlin.jvm.internal.OooOOO0.OooO0o(mapSynchronizedMap, "synchronizedMap(LRUCache…upplier, close, maxSize))");
        this.f115104OooOooo = mapSynchronizedMap;
        InterfaceC34415OooO0oo.OooO0O0 oooO0O02 = super.OooOOO0().get(InterfaceC33672o00ooo.OooO00o.f121379OooOo0o);
        kotlin.jvm.internal.OooOOO0.OooO0Oo(oooO0O02);
        InterfaceC34415OooO0oo interfaceC34415OooO0ooOooO00o = C28328OooOo0o.OooO00o((InterfaceC33672o00ooo) oooO0O02);
        this.f115101OooOoo = interfaceC34415OooO0ooOooO00o;
        this.f115103OooOooO = super.OooOOO0().plus(interfaceC34415OooO0ooOooO00o);
        C33609OooO0oo.OooO0O0(C33662Ooooooo.f121350OooOo0o, super.OooOOO0(), EnumC33637Oooo0O0.f121319OooOoO0, new OooO00o(null));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooO00o(OkHttpClient okHttpClient, Request request, InterfaceC34415OooO0oo interfaceC34415OooO0oo, C32134OooO0o0 c32134OooO0o0, AbstractC32479OooO0OO abstractC32479OooO0OO) throws Throwable {
        C32110OooO0o0 c32110OooO0o0;
        OooO0OO oooO0OO;
        C32134OooO0o0 c32134OooO0o02;
        C34109OooO0O0 c34109OooO0O0;
        InterfaceC34415OooO0oo interfaceC34415OooO0oo2;
        Object obj;
        C32193OooOo0O c32193OooOo0O;
        InterfaceC34525OooO0o f124289OooOoO0;
        if (abstractC32479OooO0OO instanceof C32110OooO0o0) {
            c32110OooO0o0 = (C32110OooO0o0) abstractC32479OooO0OO;
            int i = c32110OooO0o0.f115121OooOoo;
            if ((i & Integer.MIN_VALUE) != 0) {
                c32110OooO0o0.f115121OooOoo = i - Integer.MIN_VALUE;
            } else {
                c32110OooO0o0 = new C32110OooO0o0(this, abstractC32479OooO0OO);
            }
        }
        Object obj2 = c32110OooO0o0.f115120OooOoOO;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c32110OooO0o0.f115121OooOoo;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(obj2);
            C34109OooO0O0 c34109OooO0O0OooO00o = C34108OooO00o.OooO00o(null);
            c32110OooO0o0.f115117OooOo0o = this;
            c32110OooO0o0.f115116OooOo = interfaceC34415OooO0oo;
            c32110OooO0o0.f115119OooOoO0 = c32134OooO0o0;
            c32110OooO0o0.f115118OooOoO = c34109OooO0O0OooO00o;
            c32110OooO0o0.f115121OooOoo = 1;
            C33614OooOOO0 c33614OooOOO0 = new C33614OooOOO0(1, C21904OooOoo0.OooO0o0(c32110OooO0o0));
            c33614OooOOO0.OooOOoo();
            RealCall realCallOooO00o = okHttpClient.OooO00o(request);
            realCallOooO00o.o0000O0O(new C32107OooO00o(c32134OooO0o0, c33614OooOOO0));
            c33614OooOOO0.OooOo0(new C32113OooOO0o(realCallOooO00o));
            Object objOooOOo = c33614OooOOO0.OooOOo();
            if (objOooOOo == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
            oooO0OO = this;
            c32134OooO0o02 = c32134OooO0o0;
            c34109OooO0O0 = c34109OooO0O0OooO00o;
            interfaceC34415OooO0oo2 = interfaceC34415OooO0oo;
            obj2 = objOooOOo;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C34109OooO0O0 c34109OooO0O02 = c32110OooO0o0.f115118OooOoO;
            c32134OooO0o02 = c32110OooO0o0.f115119OooOoO0;
            InterfaceC34415OooO0oo interfaceC34415OooO0oo3 = c32110OooO0o0.f115116OooOo;
            oooO0OO = c32110OooO0o0.f115117OooOo0o;
            C32446OooOOOo.OooO0O0(obj2);
            c34109OooO0O0 = c34109OooO0O02;
            interfaceC34415OooO0oo2 = interfaceC34415OooO0oo3;
        }
        Response response = (Response) obj2;
        ResponseBody responseBody = response.f124262OooOoo;
        InterfaceC34415OooO0oo.OooO0O0 oooO0O0 = interfaceC34415OooO0oo2.get(InterfaceC33672o00ooo.OooO00o.f121379OooOo0o);
        kotlin.jvm.internal.OooOOO0.OooO0Oo(oooO0O0);
        ((InterfaceC33672o00ooo) oooO0O0).invokeOnCompletion(new OooO0o(responseBody));
        if (responseBody == null || (f124289OooOoO0 = responseBody.getF124289OooOoO0()) == null) {
            InterfaceC23986Ooooo0o.f80771OooO00o.getClass();
            obj = (InterfaceC23986Ooooo0o) InterfaceC23986Ooooo0o.OooO00o.f80773OooO0O0.getValue();
        } else {
            obj = C24005o00o0O.OooO0Oo(C33662Ooooooo.f121350OooOo0o, interfaceC34415OooO0oo2, new OooOO0O(f124289OooOoO0, interfaceC34415OooO0oo2, c32134OooO0o02, null), 2).f80790OooOo;
        }
        Object obj3 = obj;
        oooO0OO.getClass();
        C32194OooOo0o c32194OooOo0o = new C32194OooOo0o(response.f124259OooOoO, response.f124260OooOoO0);
        Protocol protocol = response.f124257OooOo;
        kotlin.jvm.internal.OooOOO0.OooO0oO(protocol, "<this>");
        int iOrdinal = protocol.ordinal();
        if (iOrdinal == 0) {
            c32193OooOo0O = C32193OooOo0O.f115544OooO0o;
        } else if (iOrdinal == 1) {
            c32193OooOo0O = C32193OooOo0O.f115545OooO0o0;
        } else if (iOrdinal != 2) {
            c32193OooOo0O = C32193OooOo0O.f115543OooO0Oo;
            if (iOrdinal != 3 && iOrdinal != 4) {
                if (iOrdinal != 5) {
                    throw new C32442OooOO0o();
                }
                c32193OooOo0O = C32193OooOo0O.f115547OooO0oo;
            }
        } else {
            c32193OooOo0O = C32193OooOo0O.f115546OooO0oO;
        }
        return new C32135OooO0oO(c32194OooOo0o, c34109OooO0O0, new OooOOO0(response.f124263OooOoo0), c32193OooOo0O, obj3, interfaceC34415OooO0oo2);
    }

    @Override // oO000o.OooO0o, oO0o0OO.InterfaceC33636Oooo00o
    public final InterfaceC34415OooO0oo OooOOO0() {
        return this.f115103OooOooO;
    }

    @Override // oO000o.OooO0o, oO000o.OooO0O0
    public final Set<InterfaceC32083OooO0oO<?>> OoooOOo() {
        return this.f115102OooOoo0;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    @Override // oO000o.OooO0O0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OoooOo0(C32134OooO0o0 c32134OooO0o0, AbstractC32479OooO0OO abstractC32479OooO0OO) throws Throwable {
        C32109OooO0Oo c32109OooO0Oo;
        OooO0OO oooO0OO;
        RequestBody requestBodyOooO0O0;
        if (abstractC32479OooO0OO instanceof C32109OooO0Oo) {
            c32109OooO0Oo = (C32109OooO0Oo) abstractC32479OooO0OO;
            int i = c32109OooO0Oo.f115114OooOoOO;
            if ((i & Integer.MIN_VALUE) != 0) {
                c32109OooO0Oo.f115114OooOoOO = i - Integer.MIN_VALUE;
            } else {
                c32109OooO0Oo = new C32109OooO0Oo(this, abstractC32479OooO0OO);
            }
        }
        C32109OooO0Oo c32109OooO0Oo2 = c32109OooO0Oo;
        Object obj = c32109OooO0Oo2.f115113OooOoO0;
        Object obj2 = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c32109OooO0Oo2.f115114OooOoOO;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(obj);
            c32109OooO0Oo2.f115111OooOo0o = this;
            c32109OooO0Oo2.f115110OooOo = c32134OooO0o0;
            c32109OooO0Oo2.f115114OooOoOO = 1;
            Set<String> set = C32087OooOOo0.f114938OooO00o;
            InterfaceC34415OooO0oo.OooO0O0 oooO0O0 = c32109OooO0Oo2.getContext().get(C32085OooOO0o.f114931OooOo);
            kotlin.jvm.internal.OooOOO0.OooO0Oo(oooO0O0);
            obj = ((C32085OooOO0o) oooO0O0).f114932OooOo0o;
            if (obj != obj2) {
                oooO0OO = this;
            }
        }
        if (i2 != 1) {
            if (i2 == 2) {
                C32446OooOOOo.OooO0O0(obj);
                return obj;
            }
            if (i2 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
            return obj;
        }
        c32134OooO0o0 = c32109OooO0Oo2.f115110OooOo;
        oooO0OO = c32109OooO0Oo2.f115111OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        C32134OooO0o0 c32134OooO0o02 = c32134OooO0o0;
        InterfaceC34415OooO0oo callContext = (InterfaceC34415OooO0oo) obj;
        Request.Builder builder = new Request.Builder();
        builder.OooO0o(c32134OooO0o02.f115215OooO00o.f115593OooO);
        OooOO0 oooOO02 = new OooOO0(builder);
        oO00O0o0.OooOOO0 oooOOO0 = c32134OooO0o02.f115217OooO0OO;
        oO00O0oO.OooO0OO oooO0OO2 = c32134OooO0o02.f115218OooO0Oo;
        C32087OooOOo0.OooO00o(oooOOO0, oooO0OO2, oooOO02);
        C32192OooOo0 c32192OooOo0 = c32134OooO0o02.f115216OooO0O0;
        if (HttpMethod.OooO00o(c32192OooOo0.f115542OooO00o)) {
            kotlin.jvm.internal.OooOOO0.OooO0oO(callContext, "callContext");
            if (oooO0OO2 instanceof OooO0OO.OooO00o) {
                byte[] bArrOooO0o0 = ((OooO0OO.OooO00o) oooO0OO2).OooO0o0();
                RequestBody.Companion companion = RequestBody.INSTANCE;
                MediaType.Companion companion2 = MediaType.f124148OooO0o0;
                String strValueOf = String.valueOf(oooO0OO2.OooO0O0());
                companion2.getClass();
                MediaType mediaTypeOooO0O0 = MediaType.Companion.OooO0O0(strValueOf);
                int length = bArrOooO0o0.length;
                companion.getClass();
                requestBodyOooO0O0 = RequestBody.Companion.OooO0O0(mediaTypeOooO0O0, bArrOooO0o0, 0, length);
            } else if (oooO0OO2 instanceof OooO0OO.AbstractC20204OooO0OO) {
                requestBodyOooO0O0 = new OooOOOO(oooO0OO2.OooO00o(), new C32111OooO0oO(oooO0OO2));
            } else if (oooO0OO2 instanceof OooO0OO.OooO0Oo) {
                requestBodyOooO0O0 = new OooOOOO(oooO0OO2.OooO00o(), new OooO(callContext, oooO0OO2));
            } else {
                if (!(oooO0OO2 instanceof OooO0OO.OooO0O0)) {
                    throw new ooOOOOOo.OooO(androidx.concurrent.futures.OooO00o.OooO0Oo(C24035Oooo00o.f80943OooO00o, oooO0OO2.getClass(), new StringBuilder("Failed to write body: ")));
                }
                RequestBody.INSTANCE.getClass();
                requestBodyOooO0O0 = RequestBody.Companion.OooO0O0(null, new byte[0], 0, 0);
            }
        } else {
            requestBodyOooO0O0 = null;
        }
        builder.OooO0Oo(c32192OooOo0.f115542OooO00o, requestBodyOooO0O0);
        Request requestOooO0O0 = builder.OooO0O0();
        Map<C33419OoooO0.OooO00o, OkHttpClient> map = oooO0OO.f115104OooOooo;
        C33419OoooO0.OooO0O0 oooO0O02 = C33419OoooO0.f120809OooO0Oo;
        OkHttpClient okHttpClient = map.get(c32134OooO0o02.OooO00o());
        if (okHttpClient == null) {
            throw new IllegalStateException("OkHttpClient can't be constructed because HttpTimeout plugin is not installed");
        }
        c32109OooO0Oo2.f115111OooOo0o = null;
        c32109OooO0Oo2.f115110OooOo = null;
        c32109OooO0Oo2.f115114OooOoOO = 3;
        Object objOooO00o = oooO0OO.OooO00o(okHttpClient, requestOooO0O0, callContext, c32134OooO0o02, c32109OooO0Oo2);
        return objOooO00o == obj2 ? obj2 : objOooO00o;
    }

    @Override // oO000o.OooO0o, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        super.close();
        InterfaceC34415OooO0oo.OooO0O0 oooO0O0 = this.f115101OooOoo.get(InterfaceC33672o00ooo.OooO00o.f121379OooOo0o);
        kotlin.jvm.internal.OooOOO0.OooO0o0(oooO0O0, "null cannot be cast to non-null type kotlinx.coroutines.CompletableJob");
        ((InterfaceC33623OooOo0O) oooO0O0).complete();
    }

    @Override // oO000o.OooO0O0
    public final AbstractC33630OooOooO o000O0oO() {
        return (AbstractC33630OooOooO) this.f115100OooOoOO.getValue();
    }
}
