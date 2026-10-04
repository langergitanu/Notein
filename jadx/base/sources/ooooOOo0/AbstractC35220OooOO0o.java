package ooooOOo0;

import androidx.fragment.app.C21904OooOoo0;
import kotlin.coroutines.Continuation;
import o0000oOO.C24333OooO00o;
import oO00ooo0.EnumC32485OooO00o;
import oO0o0OO.C33614OooOOO0;
import okhttp3.Call;
import okhttp3.ResponseBody;

/* JADX INFO: renamed from: ooooOOo0.OooOO0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public abstract class AbstractC35220OooOO0o<ResponseT, ReturnT> extends AbstractC35242OooOoo0<ReturnT> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final C35239OooOoO0 f126449OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final Call.Factory f126450OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final InterfaceC35214OooO0o<ResponseBody, ResponseT> f126451OooO0OO;

    /* JADX INFO: renamed from: ooooOOo0.OooOO0o$OooO00o */
    public static final class OooO00o<ResponseT, ReturnT> extends AbstractC35220OooOO0o<ResponseT, ReturnT> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final InterfaceC35212OooO0OO<ResponseT, ReturnT> f126452OooO0Oo;

        public OooO00o(C35239OooOoO0 c35239OooOoO0, Call.Factory factory, InterfaceC35214OooO0o<ResponseBody, ResponseT> interfaceC35214OooO0o, InterfaceC35212OooO0OO<ResponseT, ReturnT> interfaceC35212OooO0OO) {
            super(c35239OooOoO0, factory, interfaceC35214OooO0o);
            this.f126452OooO0Oo = interfaceC35212OooO0OO;
        }

        @Override // ooooOOo0.AbstractC35220OooOO0o
        public final Object OooO0OO(C35225OooOOo c35225OooOOo, Object[] objArr) {
            return this.f126452OooO0Oo.OooO0O0(c35225OooOOo);
        }
    }

    /* JADX INFO: renamed from: ooooOOo0.OooOO0o$OooO0O0 */
    public static final class OooO0O0<ResponseT> extends AbstractC35220OooOO0o<ResponseT, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final InterfaceC35212OooO0OO<ResponseT, InterfaceC35211OooO0O0<ResponseT>> f126453OooO0Oo;

        public OooO0O0(C35239OooOoO0 c35239OooOoO0, Call.Factory factory, InterfaceC35214OooO0o interfaceC35214OooO0o, InterfaceC35212OooO0OO interfaceC35212OooO0OO) {
            super(c35239OooOoO0, factory, interfaceC35214OooO0o);
            this.f126453OooO0Oo = interfaceC35212OooO0OO;
        }

        @Override // ooooOOo0.AbstractC35220OooOO0o
        public final Object OooO0OO(C35225OooOOo c35225OooOOo, Object[] objArr) throws Throwable {
            InterfaceC35211OooO0O0 interfaceC35211OooO0O0 = (InterfaceC35211OooO0O0) this.f126453OooO0Oo.OooO0O0(c35225OooOOo);
            Continuation continuation = (Continuation) objArr[objArr.length - 1];
            try {
                C33614OooOOO0 c33614OooOOO0 = new C33614OooOOO0(1, C21904OooOoo0.OooO0o0(continuation));
                c33614OooOOO0.OooOo0(new C35221OooOOO(interfaceC35211OooO0O0));
                interfaceC35211OooO0O0.OooOOo0(new C35223OooOOOO(c33614OooOOO0));
                Object objOooOOo = c33614OooOOO0.OooOOo();
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                return objOooOOo;
            } catch (Exception e) {
                return C35226OooOOo0.OooO00o(e, continuation);
            }
        }
    }

    /* JADX INFO: renamed from: ooooOOo0.OooOO0o$OooO0OO */
    public static final class OooO0OO<ResponseT> extends AbstractC35220OooOO0o<ResponseT, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final InterfaceC35212OooO0OO<ResponseT, InterfaceC35211OooO0O0<ResponseT>> f126454OooO0Oo;

        public OooO0OO(C35239OooOoO0 c35239OooOoO0, Call.Factory factory, InterfaceC35214OooO0o<ResponseBody, ResponseT> interfaceC35214OooO0o, InterfaceC35212OooO0OO<ResponseT, InterfaceC35211OooO0O0<ResponseT>> interfaceC35212OooO0OO) {
            super(c35239OooOoO0, factory, interfaceC35214OooO0o);
            this.f126454OooO0Oo = interfaceC35212OooO0OO;
        }

        @Override // ooooOOo0.AbstractC35220OooOO0o
        public final Object OooO0OO(C35225OooOOo c35225OooOOo, Object[] objArr) throws Throwable {
            InterfaceC35211OooO0O0 interfaceC35211OooO0O0 = (InterfaceC35211OooO0O0) this.f126454OooO0Oo.OooO0O0(c35225OooOOo);
            Continuation continuation = (Continuation) objArr[objArr.length - 1];
            try {
                C33614OooOOO0 c33614OooOOO0 = new C33614OooOOO0(1, C21904OooOoo0.OooO0o0(continuation));
                c33614OooOOO0.OooOo0(new C35224OooOOOo(interfaceC35211OooO0O0));
                interfaceC35211OooO0O0.OooOOo0(new C24333OooO00o(c33614OooOOO0));
                Object objOooOOo = c33614OooOOO0.OooOOo();
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                return objOooOOo;
            } catch (Exception e) {
                return C35226OooOOo0.OooO00o(e, continuation);
            }
        }
    }

    public AbstractC35220OooOO0o(C35239OooOoO0 c35239OooOoO0, Call.Factory factory, InterfaceC35214OooO0o<ResponseBody, ResponseT> interfaceC35214OooO0o) {
        this.f126449OooO00o = c35239OooOoO0;
        this.f126450OooO0O0 = factory;
        this.f126451OooO0OO = interfaceC35214OooO0o;
    }

    @Override // ooooOOo0.AbstractC35242OooOoo0
    public final ReturnT OooO00o(Object[] objArr) {
        return (ReturnT) OooO0OO(new C35225OooOOo(this.f126449OooO00o, objArr, this.f126450OooO0O0, this.f126451OooO0OO), objArr);
    }

    public abstract Object OooO0OO(C35225OooOOo c35225OooOOo, Object[] objArr);
}
