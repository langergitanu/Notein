package io.ktor.client.engine.cio;

import OooooO0.C21286OooO0O0;
import OooooOO.C21355Ooooooo;
import com.google.common.net.HttpHeaders;
import io.ktor.utils.p616io.C23992OoooooO;
import io.ktor.utils.p616io.InterfaceC23990Oooooo;
import io.ktor.utils.p616io.Oooo0;
import java.util.List;
import kotlin.coroutines.Continuation;
import oO000oo.C32128OooO;
import oO000oo.C32132OooO0Oo;
import oO000oo.C32134OooO0o0;
import oO000oo.C32135OooO0oO;
import oO00O0o0.C32187OooOO0o;
import oO00O0o0.C32190OooOOo0;
import oO00O0o0.C32194OooOo0o;
import oO00O0o0.C32206Oooo0OO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0oOOO0.C34109OooO0O0;
import oOo0000O.InterfaceC34415OooO0oo;
import oOo00Oo0.C34502OooO00o;

/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "io.ktor.client.engine.cio.Endpoint$processExpectContinue$2", m80623f = "Endpoint.kt", m80624l = {146, 148, 153, 160, 164, 173, 176}, m80625m = "invokeSuspend")
public final class OooOOOO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32135OooO0oO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ C32134OooO0o0 f80413OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f80414OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ boolean f80415OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ InterfaceC23990Oooooo f80416OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final /* synthetic */ C34109OooO0O0 f80417OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public final /* synthetic */ Oooo0 f80418OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final /* synthetic */ Oooo0 f80419OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public final /* synthetic */ InterfaceC34415OooO0oo f80420OooOooO;

    @InterfaceC32482OooO0o0(m80622c = "io.ktor.client.engine.cio.Endpoint$processExpectContinue$2$responseReady$1", m80623f = "Endpoint.kt", m80624l = {149}, m80625m = "invokeSuspend")
    public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ Oooo0 f80421OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f80422OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(Oooo0 oooo0, Continuation continuation) {
            super(2, continuation);
            this.f80421OooOo = oooo0;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return new OooO00o(this.f80421OooOo, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((OooO00o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f80422OooOo0o;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                this.f80422OooOo0o = 1;
                if (this.f80421OooOo.OooOoOO(this) == enumC32485OooO00o) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooOOOO(C32134OooO0o0 c32134OooO0o0, InterfaceC23990Oooooo interfaceC23990Oooooo, boolean z, C34109OooO0O0 c34109OooO0O0, Oooo0 oooo0, Oooo0 oooo02, InterfaceC34415OooO0oo interfaceC34415OooO0oo, Continuation continuation) {
        super(2, continuation);
        this.f80413OooOo = c32134OooO0o0;
        this.f80416OooOoO0 = interfaceC23990Oooooo;
        this.f80415OooOoO = z;
        this.f80417OooOoOO = c34109OooO0O0;
        this.f80419OooOoo0 = oooo0;
        this.f80418OooOoo = oooo02;
        this.f80420OooOooO = interfaceC34415OooO0oo;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        Oooo0 oooo0 = this.f80418OooOoo;
        InterfaceC34415OooO0oo interfaceC34415OooO0oo = this.f80420OooOooO;
        return new OooOOOO(this.f80413OooOo, this.f80416OooOoO0, this.f80415OooOoO, this.f80417OooOoOO, this.f80419OooOoo0, oooo0, interfaceC34415OooO0oo, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32135OooO0oO> continuation) {
        return ((OooOOOO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0059 A[PHI: r2
      0x0059: PHI (r2v5 java.lang.Object) = (r2v4 java.lang.Object), (r2v11 java.lang.Object) binds: [B:16:0x0055, B:10:0x002d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0103 A[RETURN] */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objOooOO0O;
        Object objOooO0o;
        C32194OooOo0o c32194OooOo0o;
        Object objOooO0o2;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f80414OooOo0o;
        C32134OooO0o0 c32134OooO0o0 = this.f80413OooOo;
        Oooo0 oooo0 = this.f80418OooOoo;
        C34109OooO0O0 c34109OooO0O0 = this.f80417OooOoOO;
        Oooo0 oooo02 = this.f80419OooOoo0;
        InterfaceC23990Oooooo interfaceC23990Oooooo = this.f80416OooOoO0;
        InterfaceC34415OooO0oo interfaceC34415OooO0oo = this.f80420OooOooO;
        switch (i) {
            case 0:
                C32446OooOOOo.OooO0O0(obj);
                this.f80414OooOo0o = 1;
                if (C23945OooOoOO.OooO0OO(c32134OooO0o0, interfaceC23990Oooooo, this.f80415OooOoO, true, this) != enumC32485OooO00o) {
                    OooO00o oooO00o = new OooO00o(oooo02, null);
                    this.f80414OooOo0o = 2;
                    objOooOO0O = C21355Ooooooo.OooOO0O(1000L, oooO00o, this);
                    if (objOooOO0O != enumC32485OooO00o) {
                        if (((C32460OooOooO) objOooOO0O) == null) {
                            this.f80414OooOo0o = 3;
                            objOooO0o = C33609OooO0oo.OooO0o(interfaceC34415OooO0oo, new OooOo00(oooo02, oooo0, interfaceC34415OooO0oo, c34109OooO0O0, c32134OooO0o0, null), this);
                            if (objOooO0o != enumC32485OooO00o) {
                                C32135OooO0oO c32135OooO0oO = (C32135OooO0oO) objOooO0o;
                                c32194OooOo0o = c32135OooO0oO.f115222OooO00o;
                                if (!c32194OooOo0o.equals(C32194OooOo0o.f115563Oooo0OO)) {
                                    C32132OooO0Oo c32132OooO0Oo = new C32132OooO0Oo();
                                    c32132OooO0Oo.OooO0Oo(c32134OooO0o0.f115216OooO0O0);
                                    c32132OooO0Oo.f115206OooO0Oo = c32134OooO0o0.f115218OooO0Oo;
                                    C34502OooO00o<oOOoOoOO.OooO00o> c34502OooO00o = C32128OooO.f115196OooO00o;
                                    oOo00Oo0.OooOOO0 oooOOO0 = c32132OooO0Oo.f115207OooO0o;
                                    c32132OooO0Oo.OooO0OO((oOOoOoOO.OooO00o) oooOOO0.OooO0OO(c34502OooO00o));
                                    C32206Oooo0OO.OooO0o0(c32132OooO0Oo.f115203OooO00o, c32134OooO0o0.f115215OooO00o);
                                    oO00O0o0.OooOOO0 oooOOO02 = c32134OooO0o0.f115217OooO0OO;
                                    C32187OooOO0o c32187OooOO0o = c32132OooO0Oo.f115205OooO0OO;
                                    c32187OooOO0o.OooO0OO(oooOOO02);
                                    C21286OooO0O0.OooO0o0(oooOOO0, c32134OooO0o0.f115219OooO0o);
                                    List<String> list = C32190OooOOo0.f115537OooO00o;
                                    c32187OooOO0o.f123698OooO00o.remove(HttpHeaders.EXPECT);
                                    C32134OooO0o0 c32134OooO0o0OooO00o = c32132OooO0Oo.OooO00o();
                                    this.f80414OooOo0o = 4;
                                    Object objOooO0o3 = C33609OooO0oo.OooO0o(interfaceC34415OooO0oo, new C23943OooOoO(c32134OooO0o0OooO00o, this.f80416OooOoO0, this.f80415OooOoO, true, interfaceC34415OooO0oo, null), this);
                                    if (objOooO0o3 != enumC32485OooO00o) {
                                        objOooO0o3 = C32460OooOooO.f116667OooO00o;
                                    }
                                    if (objOooO0o3 != enumC32485OooO00o) {
                                        this.f80414OooOo0o = 7;
                                        objOooO0o2 = C33609OooO0oo.OooO0o(interfaceC34415OooO0oo, new OooOo00(oooo02, oooo0, interfaceC34415OooO0oo, c34109OooO0O0, c32134OooO0o0, null), this);
                                        if (objOooO0o2 != enumC32485OooO00o) {
                                            return objOooO0o2;
                                        }
                                    }
                                } else {
                                    if (!c32194OooOo0o.equals(C32194OooOo0o.f115552OooOoO0)) {
                                        C23992OoooooO.OooO0O0(interfaceC23990Oooooo);
                                        return c32135OooO0oO;
                                    }
                                    this.f80414OooOo0o = 5;
                                    if (C23945OooOoOO.OooO0O0(c32134OooO0o0, interfaceC23990Oooooo, interfaceC34415OooO0oo, true, this) != enumC32485OooO00o) {
                                    }
                                }
                            }
                        } else {
                            this.f80414OooOo0o = 6;
                            if (C23945OooOoOO.OooO0O0(c32134OooO0o0, interfaceC23990Oooooo, interfaceC34415OooO0oo, true, this) != enumC32485OooO00o) {
                            }
                        }
                    }
                }
                return enumC32485OooO00o;
            case 1:
                C32446OooOOOo.OooO0O0(obj);
                OooO00o oooO00o2 = new OooO00o(oooo02, null);
                this.f80414OooOo0o = 2;
                objOooOO0O = C21355Ooooooo.OooOO0O(1000L, oooO00o2, this);
                if (objOooOO0O != enumC32485OooO00o) {
                }
                return enumC32485OooO00o;
            case 2:
                C32446OooOOOo.OooO0O0(obj);
                objOooOO0O = obj;
                if (((C32460OooOooO) objOooOO0O) == null) {
                }
                return enumC32485OooO00o;
            case 3:
                C32446OooOOOo.OooO0O0(obj);
                objOooO0o = obj;
                C32135OooO0oO c32135OooO0oO2 = (C32135OooO0oO) objOooO0o;
                c32194OooOo0o = c32135OooO0oO2.f115222OooO00o;
                if (!c32194OooOo0o.equals(C32194OooOo0o.f115563Oooo0OO)) {
                }
                return enumC32485OooO00o;
            case 4:
            case 5:
            case 6:
                C32446OooOOOo.OooO0O0(obj);
                this.f80414OooOo0o = 7;
                objOooO0o2 = C33609OooO0oo.OooO0o(interfaceC34415OooO0oo, new OooOo00(oooo02, oooo0, interfaceC34415OooO0oo, c34109OooO0O0, c32134OooO0o0, null), this);
                if (objOooO0o2 != enumC32485OooO00o) {
                    return enumC32485OooO00o;
                }
                break;
            case 7:
                C32446OooOOOo.OooO0O0(obj);
                return obj;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
