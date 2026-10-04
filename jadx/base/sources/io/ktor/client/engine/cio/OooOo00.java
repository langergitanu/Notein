package io.ktor.client.engine.cio;

import androidx.core.location.LocationRequestCompat;
import com.google.common.net.HttpHeaders;
import io.ktor.utils.p616io.C23988OooooOO;
import io.ktor.utils.p616io.C24005o00o0O;
import io.ktor.utils.p616io.InterfaceC23967Oooo00O;
import io.ktor.utils.p616io.InterfaceC23986Ooooo0o;
import io.ktor.utils.p616io.InterfaceC23990Oooooo;
import io.ktor.utils.p616io.o000OOo;
import java.io.EOFException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import kotlin.coroutines.Continuation;
import oO000oo.C32134OooO0o0;
import oO000oo.C32135OooO0oO;
import oO00O0o.C32182OooOOo0;
import oO00O0o.OooO0o;
import oO00O0o0.C32190OooOOo0;
import oO00O0o0.C32192OooOo0;
import oO00O0o0.C32193OooOo0O;
import oO00O0o0.C32194OooOo0o;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0O0o.C33599OooOo0O;
import oO0o0OO.C33633Oooo0;
import oO0o0OO.C33635Oooo00O;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0Ooo.C33822OooO0OO;
import oO0oOOO0.C34109OooO0O0;
import oOo0000O.InterfaceC34415OooO0oo;
import oOo000Oo.C34429OooOOo0;
import oOo00OO0.C34480OooO0Oo;

/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "io.ktor.client.engine.cio.UtilsKt$readResponse$2", m80623f = "utils.kt", m80624l = {159}, m80625m = "invokeSuspend")
public final class OooOo00 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32135OooO0oO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ InterfaceC23986Ooooo0o f80448OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f80449OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ InterfaceC34415OooO0oo f80450OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ InterfaceC23990Oooooo f80451OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final /* synthetic */ C34109OooO0O0 f80452OooOoOO;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final /* synthetic */ C32134OooO0o0 f80453OooOoo0;

    @InterfaceC32482OooO0o0(m80622c = "io.ktor.client.engine.cio.UtilsKt$readResponse$2$1$body$httpBodyParser$1", m80623f = "utils.kt", m80624l = {187}, m80625m = "invokeSuspend")
    public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<o000OOo, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public /* synthetic */ Object f80454OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f80455OooOo0o;

        /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
        public final /* synthetic */ long f80456OooOoO;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public final /* synthetic */ C32193OooOo0O f80457OooOoO0;

        /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
        public final /* synthetic */ String f80458OooOoOO;

        /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
        public final /* synthetic */ InterfaceC23986Ooooo0o f80459OooOoo;

        /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
        public final /* synthetic */ oO00O0o.OooO0o f80460OooOoo0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(C32193OooOo0O c32193OooOo0O, long j, String str, oO00O0o.OooO0o oooO0o, InterfaceC23986Ooooo0o interfaceC23986Ooooo0o, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f80457OooOoO0 = c32193OooOo0O;
            this.f80456OooOoO = j;
            this.f80458OooOoOO = str;
            this.f80460OooOoo0 = oooO0o;
            this.f80459OooOoo = interfaceC23986Ooooo0o;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            OooO00o oooO00o = new OooO00o(this.f80457OooOoO0, this.f80456OooOoO, this.f80458OooOoOO, this.f80460OooOoo0, this.f80459OooOoo, continuation);
            oooO00o.f80454OooOo = obj;
            return oooO00o;
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(o000OOo o000ooo2, Continuation<? super C32460OooOooO> continuation) {
            return ((OooO00o) create(o000ooo2, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        /* JADX WARN: Removed duplicated region for block: B:38:0x00b2  */
        /* JADX WARN: Removed duplicated region for block: B:56:0x00ec  */
        /* JADX WARN: Removed duplicated region for block: B:61:0x00fe A[RETURN] */
        @Override // oO00ooo.AbstractC32477OooO00o
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object objOooO0O0;
            boolean z;
            Object obj2 = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f80455OooOo0o;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                InterfaceC23967Oooo00O interfaceC23967Oooo00OOooO0OO = ((o000OOo) this.f80454OooOo).OooO0OO();
                this.f80455OooOo0o = 1;
                String str = this.f80458OooOoOO;
                InterfaceC23986Ooooo0o interfaceC23986Ooooo0o = this.f80459OooOoo;
                if (str == null) {
                    long j = this.f80456OooOoO;
                    if (j != -1) {
                        objOooO0O0 = C23988OooooOO.OooO0O0(interfaceC23986Ooooo0o, interfaceC23967Oooo00OOooO0OO, j, this);
                        if (objOooO0O0 != EnumC32485OooO00o.f116726OooOo0o) {
                            objOooO0O0 = C32460OooOooO.f116667OooO00o;
                        }
                    } else {
                        oO00O0o.OooO0o oooO0o = this.f80460OooOoo0;
                        if (oooO0o != null && oooO0o.f115471OooO00o) {
                            objOooO0O0 = C23988OooooOO.OooO0O0(interfaceC23986Ooooo0o, interfaceC23967Oooo00OOooO0OO, LocationRequestCompat.PASSIVE_INTERVAL, this);
                            if (objOooO0O0 != EnumC32485OooO00o.f116726OooOo0o) {
                                objOooO0O0 = C32460OooOooO.f116667OooO00o;
                            }
                        } else {
                            if (oooO0o == null) {
                                if (kotlin.jvm.internal.OooOOO0.OooO0O0(this.f80457OooOoO0, C32193OooOo0O.f115544OooO0o)) {
                                }
                            }
                            interfaceC23967Oooo00OOooO0OO.OooO0Oo(new IllegalStateException("Failed to parse request body: request body length should be specified,\nchunked transfer encoding should be used or\nkeep-alive should be disabled (connection: close)"));
                            objOooO0O0 = C32460OooOooO.f116667OooO00o;
                        }
                    }
                    if (objOooO0O0 == obj2) {
                        return obj2;
                    }
                } else {
                    if (oOo00OO0.OooO0o.OooO00o(str, "chunked")) {
                        z = true;
                    } else if (oOo00OO0.OooO0o.OooO00o(str, "identity")) {
                        z = false;
                    } else {
                        Iterator it = C33599OooOo0O.OoooOO0(str, new String[]{","}).iterator();
                        z = false;
                        while (it.hasNext()) {
                            String lowerCase = C33599OooOo0O.Oooooo0((String) it.next()).toString().toLowerCase(Locale.ROOT);
                            kotlin.jvm.internal.OooOOO0.OooO0o(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                            if (lowerCase.equals("chunked")) {
                                if (z) {
                                    throw new IllegalArgumentException("Double-chunked TE is not supported: " + ((Object) str));
                                }
                                z = true;
                            } else if (!lowerCase.equals("identity")) {
                                throw new IllegalArgumentException("Unsupported transfer encoding ".concat(lowerCase));
                            }
                        }
                    }
                    if (z) {
                        objOooO0O0 = oO00O0o.OooO00o.OooO00o(interfaceC23986Ooooo0o, interfaceC23967Oooo00OOooO0OO, this);
                        Object obj3 = EnumC32485OooO00o.f116726OooOo0o;
                        if (objOooO0O0 != obj3) {
                            objOooO0O0 = C32460OooOooO.f116667OooO00o;
                        }
                        if (objOooO0O0 != obj3) {
                            objOooO0O0 = C32460OooOooO.f116667OooO00o;
                        }
                    }
                    if (objOooO0O0 == obj2) {
                    }
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooOo00(InterfaceC23986Ooooo0o interfaceC23986Ooooo0o, InterfaceC23990Oooooo interfaceC23990Oooooo, InterfaceC34415OooO0oo interfaceC34415OooO0oo, C34109OooO0O0 c34109OooO0O0, C32134OooO0o0 c32134OooO0o0, Continuation<? super OooOo00> continuation) {
        super(2, continuation);
        this.f80448OooOo = interfaceC23986Ooooo0o;
        this.f80451OooOoO0 = interfaceC23990Oooooo;
        this.f80450OooOoO = interfaceC34415OooO0oo;
        this.f80452OooOoOO = c34109OooO0O0;
        this.f80453OooOoo0 = c32134OooO0o0;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new OooOo00(this.f80448OooOo, this.f80451OooOoO0, this.f80450OooOoO, this.f80452OooOoOO, this.f80453OooOoo0, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32135OooO0oO> continuation) {
        return ((OooOo00) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objOooO0Oo;
        Object obj2;
        String string;
        int i = 1;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = this.f80449OooOo0o;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(obj);
            this.f80449OooOo0o = 1;
            objOooO0Oo = oO00O0o.OooOOO.OooO0Oo(this.f80448OooOo, this);
            if (objOooO0Oo == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
            objOooO0Oo = obj;
        }
        C32182OooOOo0 c32182OooOOo0 = (C32182OooOOo0) objOooO0Oo;
        if (c32182OooOOo0 == null) {
            throw new EOFException("Failed to parse HTTP response: unexpected EOF");
        }
        oO00O0o.OooO oooO = c32182OooOOo0.f115505OooOo0o;
        InterfaceC23990Oooooo output = this.f80451OooOoO0;
        C32134OooO0o0 c32134OooO0o0 = this.f80453OooOoo0;
        try {
            C32194OooOo0o c32194OooOo0o = new C32194OooOo0o(c32182OooOOo0.f115506OooOoO, c32182OooOOo0.f115508OooOoOO.toString());
            List<String> list = C32190OooOOo0.f115537OooO00o;
            C34480OooO0Oo.OooO00o OooO00o2 = oooO.OooO00o("Content-Length");
            long j = (OooO00o2 == null || (string = OooO00o2.toString()) == null) ? -1L : Long.parseLong(string);
            C34480OooO0Oo.OooO00o OooO00o3 = oooO.OooO00o(HttpHeaders.TRANSFER_ENCODING);
            String string2 = OooO00o3 != null ? OooO00o3.toString() : null;
            oO00O0o.OooO0o oooO0o = oO00O0o.OooO0o.f115470OooO0o0;
            oO00O0o.OooO0o oooO0oOooO00o = OooO0o.OooO0OO.OooO00o(oooO.OooO00o(HttpHeaders.CONNECTION));
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            int i3 = oooO.f115448OooO0O0;
            int i4 = 0;
            while (i4 < i3) {
                String string3 = oooO.OooO0O0(i4).toString();
                int i5 = i;
                String string4 = oooO.OooO0o0(i4).toString();
                oO00O0o.OooO oooO2 = oooO;
                List list2 = (List) linkedHashMap.get(string3);
                if ((list2 != null ? Boolean.valueOf(list2.add(string4)) : null) == null) {
                    linkedHashMap.put(string3, C34429OooOOo0.OooOOO(string4));
                }
                i4++;
                oooO = oooO2;
                i = i5;
            }
            int i6 = i;
            oO00O0o0.OooOOO0 oooOOO0 = new oO00O0o0.OooOOO0(linkedHashMap);
            C32193OooOo0O c32193OooOo0OOooO00o = C32193OooOo0O.OooO00o.OooO00o(c32182OooOOo0.f115507OooOoO0);
            boolean zEquals = c32194OooOo0o.equals(C32194OooOo0o.f115551OooOoO);
            InterfaceC23986Ooooo0o input = this.f80448OooOo;
            InterfaceC34415OooO0oo coroutineContext = this.f80450OooOoO;
            C34109OooO0O0 c34109OooO0O0 = this.f80452OooOoOO;
            if (zEquals) {
                kotlin.jvm.internal.OooOOO0.OooO0oO(input, "input");
                kotlin.jvm.internal.OooOOO0.OooO0oO(output, "output");
                kotlin.jvm.internal.OooOOO0.OooO0oO(coroutineContext, "coroutineContext");
                C32135OooO0oO c32135OooO0oO = new C32135OooO0oO(c32194OooOo0o, c34109OooO0O0, oooOOO0, c32193OooOo0OOooO00o, new oO00Oo.OooOO0(input, output, coroutineContext), coroutineContext);
                c32182OooOOo0.close();
                return c32135OooO0oO;
            }
            if (kotlin.jvm.internal.OooOOO0.OooO0O0(c32134OooO0o0.f115216OooO0O0, C32192OooOo0.f115540OooO0Oo) || C34429OooOOo0.OooOO0o(C32194OooOo0o.f115559Oooo000, C32194OooOo0o.f115555OooOoo0).contains(c32194OooOo0o)) {
                InterfaceC23986Ooooo0o.f80771OooO00o.getClass();
                obj2 = (InterfaceC23986Ooooo0o) InterfaceC23986Ooooo0o.OooO00o.f80773OooO0O0.getValue();
            } else {
                if (c32194OooOo0o.f115566OooOo0o / 100 == i6) {
                    InterfaceC23986Ooooo0o.f80771OooO00o.getClass();
                    obj2 = (InterfaceC23986Ooooo0o) InterfaceC23986Ooooo0o.OooO00o.f80773OooO0O0.getValue();
                } else {
                    C33822OooO0OO c33822OooO0OOOooO00o = C33633Oooo0.OooO00o(coroutineContext.plus(new C33635Oooo00O("Response")));
                    OooO00o oooO00o = new OooO00o(c32193OooOo0OOooO00o, j, string2, oooO0oOooO00o, input, null);
                    c32193OooOo0OOooO00o = c32193OooOo0OOooO00o;
                    obj2 = C24005o00o0O.OooO0Oo(c33822OooO0OOOooO00o, null, oooO00o, 1).f80790OooOo;
                }
            }
            C32135OooO0oO c32135OooO0oO2 = new C32135OooO0oO(c32194OooOo0o, c34109OooO0O0, oooOOO0, c32193OooOo0OOooO00o, obj2, coroutineContext);
            c32182OooOOo0.close();
            return c32135OooO0oO2;
        } finally {
        }
    }
}
