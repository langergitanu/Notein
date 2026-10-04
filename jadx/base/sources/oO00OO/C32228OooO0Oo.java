package oO00OO;

import io.ktor.utils.p616io.InterfaceC23986Ooooo0o;
import java.nio.charset.Charset;
import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0o0Oo.C33724OooO0oo;
import oO0o0Oo.InterfaceC33721OooO0o;
import oO0o0Oo.InterfaceC33723OooO0oO;

/* JADX INFO: renamed from: oO00OO.OooO0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C32228OooO0Oo implements InterfaceC33721OooO0o<Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Charset f115686OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ C33724OooO0oo f115687OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ InterfaceC23986Ooooo0o f115688OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ oOOoOoOO.OooO00o f115689OooOoO0;

    /* JADX INFO: renamed from: oO00OO.OooO0Oo$OooO00o */
    public static final class OooO00o<T> implements InterfaceC33723OooO0oO {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ Charset f115690OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ InterfaceC33723OooO0oO f115691OooOo0o;

        /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
        public final /* synthetic */ InterfaceC23986Ooooo0o f115692OooOoO;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public final /* synthetic */ oOOoOoOO.OooO00o f115693OooOoO0;

        /* JADX INFO: renamed from: oO00OO.OooO0Oo$OooO00o$OooO00o, reason: collision with other inner class name */
        @InterfaceC32482OooO0o0(m80622c = "io.ktor.serialization.ContentConverterKt$deserialize$$inlined$map$1$2", m80623f = "ContentConverter.kt", m80624l = {224, 223}, m80625m = "emit")
        public static final class C20206OooO00o extends AbstractC32479OooO0OO {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public int f115694OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public /* synthetic */ Object f115695OooOo0o;

            /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
            public InterfaceC33723OooO0oO f115697OooOoO0;

            public C20206OooO00o(Continuation continuation) {
                super(continuation);
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                this.f115695OooOo0o = obj;
                this.f115694OooOo |= Integer.MIN_VALUE;
                return OooO00o.this.emit(null, this);
            }
        }

        public OooO00o(InterfaceC33723OooO0oO interfaceC33723OooO0oO, Charset charset, oOOoOoOO.OooO00o oooO00o, InterfaceC23986Ooooo0o interfaceC23986Ooooo0o) {
            this.f115691OooOo0o = interfaceC33723OooO0oO;
            this.f115690OooOo = charset;
            this.f115693OooOoO0 = oooO00o;
            this.f115692OooOoO = interfaceC23986Ooooo0o;
        }

        /* JADX WARN: Code restructure failed: missing block: B:21:0x005c, code lost:
        
            if (r8.emit(r9, r0) == r1) goto L22;
         */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // oO0o0Oo.InterfaceC33723OooO0oO
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object emit(Object obj, Continuation continuation) {
            C20206OooO00o c20206OooO00o;
            InterfaceC33723OooO0oO interfaceC33723OooO0oO;
            if (continuation instanceof C20206OooO00o) {
                c20206OooO00o = (C20206OooO00o) continuation;
                int i = c20206OooO00o.f115694OooOo;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c20206OooO00o.f115694OooOo = i - Integer.MIN_VALUE;
                } else {
                    c20206OooO00o = new C20206OooO00o(continuation);
                }
            }
            Object obj2 = c20206OooO00o.f115695OooOo0o;
            Object obj3 = EnumC32485OooO00o.f116726OooOo0o;
            int i2 = c20206OooO00o.f115694OooOo;
            if (i2 == 0) {
                C32446OooOOOo.OooO0O0(obj2);
                InterfaceC33723OooO0oO interfaceC33723OooO0oO2 = this.f115691OooOo0o;
                c20206OooO00o.f115697OooOoO0 = interfaceC33723OooO0oO2;
                c20206OooO00o.f115694OooOo = 1;
                Object objOooO00o = ((OooO0OO) obj).OooO00o(this.f115690OooOo, this.f115693OooOoO0, this.f115692OooOoO, c20206OooO00o);
                if (objOooO00o != obj3) {
                    obj2 = objOooO00o;
                    interfaceC33723OooO0oO = interfaceC33723OooO0oO2;
                }
                return obj3;
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(obj2);
                return C32460OooOooO.f116667OooO00o;
            }
            InterfaceC33723OooO0oO interfaceC33723OooO0oO3 = c20206OooO00o.f115697OooOoO0;
            C32446OooOOOo.OooO0O0(obj2);
            interfaceC33723OooO0oO = interfaceC33723OooO0oO3;
            c20206OooO00o.f115697OooOoO0 = null;
            c20206OooO00o.f115694OooOo = 2;
        }
    }

    public C32228OooO0Oo(C33724OooO0oo c33724OooO0oo, Charset charset, oOOoOoOO.OooO00o oooO00o, InterfaceC23986Ooooo0o interfaceC23986Ooooo0o) {
        this.f115687OooOo0o = c33724OooO0oo;
        this.f115686OooOo = charset;
        this.f115689OooOoO0 = oooO00o;
        this.f115688OooOoO = interfaceC23986Ooooo0o;
    }

    @Override // oO0o0Oo.InterfaceC33721OooO0o
    public final Object collect(InterfaceC33723OooO0oO<? super Object> interfaceC33723OooO0oO, Continuation continuation) {
        Object objCollect = this.f115687OooOo0o.collect(new OooO00o(interfaceC33723OooO0oO, this.f115686OooOo, this.f115689OooOoO0, this.f115688OooOoO), continuation);
        return objCollect == EnumC32485OooO00o.f116726OooOo0o ? objCollect : C32460OooOooO.f116667OooO00o;
    }
}
