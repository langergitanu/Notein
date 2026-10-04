package oO00OOO;

import java.nio.charset.Charset;
import kotlin.coroutines.Continuation;
import oO00O0o0.C32183OooO0Oo;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0o0Oo.C33724OooO0oo;
import oO0o0Oo.InterfaceC33721OooO0o;
import oO0o0Oo.InterfaceC33723OooO0oO;

/* JADX INFO: renamed from: oO00OOO.OooO0o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C32232OooO0o0 implements InterfaceC33721OooO0o<oO00O0oO.OooO0OO> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ C32183OooO0Oo f115739OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ C33724OooO0oo f115740OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ oOOoOoOO.OooO00o f115741OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ Charset f115742OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final /* synthetic */ Object f115743OooOoOO;

    /* JADX INFO: renamed from: oO00OOO.OooO0o0$OooO00o */
    public static final class OooO00o<T> implements InterfaceC33723OooO0oO {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ C32183OooO0Oo f115744OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ InterfaceC33723OooO0oO f115745OooOo0o;

        /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
        public final /* synthetic */ oOOoOoOO.OooO00o f115746OooOoO;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public final /* synthetic */ Charset f115747OooOoO0;

        /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
        public final /* synthetic */ Object f115748OooOoOO;

        /* JADX INFO: renamed from: oO00OOO.OooO0o0$OooO00o$OooO00o, reason: collision with other inner class name */
        @InterfaceC32482OooO0o0(m80622c = "io.ktor.serialization.kotlinx.KotlinxSerializationConverter$serializeNullable$$inlined$map$1$2", m80623f = "KotlinxSerializationConverter.kt", m80624l = {224, 223}, m80625m = "emit")
        public static final class C20208OooO00o extends AbstractC32479OooO0OO {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public int f115749OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public /* synthetic */ Object f115750OooOo0o;

            /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
            public InterfaceC33723OooO0oO f115752OooOoO0;

            public C20208OooO00o(Continuation continuation) {
                super(continuation);
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                this.f115750OooOo0o = obj;
                this.f115749OooOo |= Integer.MIN_VALUE;
                return OooO00o.this.emit(null, this);
            }
        }

        public OooO00o(InterfaceC33723OooO0oO interfaceC33723OooO0oO, C32183OooO0Oo c32183OooO0Oo, Charset charset, oOOoOoOO.OooO00o oooO00o, Object obj) {
            this.f115745OooOo0o = interfaceC33723OooO0oO;
            this.f115744OooOo = c32183OooO0Oo;
            this.f115747OooOoO0 = charset;
            this.f115746OooOoO = oooO00o;
            this.f115748OooOoOO = obj;
        }

        /* JADX WARN: Code restructure failed: missing block: B:21:0x005e, code lost:
        
            if (r9.emit(r10, r0) == r1) goto L22;
         */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // oO0o0Oo.InterfaceC33723OooO0oO
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object emit(Object obj, Continuation continuation) {
            C20208OooO00o c20208OooO00o;
            InterfaceC33723OooO0oO interfaceC33723OooO0oO;
            if (continuation instanceof C20208OooO00o) {
                c20208OooO00o = (C20208OooO00o) continuation;
                int i = c20208OooO00o.f115749OooOo;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c20208OooO00o.f115749OooOo = i - Integer.MIN_VALUE;
                } else {
                    c20208OooO00o = new C20208OooO00o(continuation);
                }
            }
            Object obj2 = c20208OooO00o.f115750OooOo0o;
            Object obj3 = EnumC32485OooO00o.f116726OooOo0o;
            int i2 = c20208OooO00o.f115749OooOo;
            if (i2 == 0) {
                C32446OooOOOo.OooO0O0(obj2);
                InterfaceC33723OooO0oO interfaceC33723OooO0oO2 = this.f115745OooOo0o;
                c20208OooO00o.f115752OooOoO0 = interfaceC33723OooO0oO2;
                c20208OooO00o.f115749OooOo = 1;
                Object objOooO0O0 = ((OooO) obj).OooO0O0(this.f115744OooOo, this.f115747OooOoO0, this.f115746OooOoO, this.f115748OooOoOO);
                if (objOooO0O0 != obj3) {
                    obj2 = objOooO0O0;
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
            InterfaceC33723OooO0oO interfaceC33723OooO0oO3 = c20208OooO00o.f115752OooOoO0;
            C32446OooOOOo.OooO0O0(obj2);
            interfaceC33723OooO0oO = interfaceC33723OooO0oO3;
            c20208OooO00o.f115752OooOoO0 = null;
            c20208OooO00o.f115749OooOo = 2;
        }
    }

    public C32232OooO0o0(C33724OooO0oo c33724OooO0oo, C32183OooO0Oo c32183OooO0Oo, Charset charset, oOOoOoOO.OooO00o oooO00o, Object obj) {
        this.f115740OooOo0o = c33724OooO0oo;
        this.f115739OooOo = c32183OooO0Oo;
        this.f115742OooOoO0 = charset;
        this.f115741OooOoO = oooO00o;
        this.f115743OooOoOO = obj;
    }

    @Override // oO0o0Oo.InterfaceC33721OooO0o
    public final Object collect(InterfaceC33723OooO0oO<? super oO00O0oO.OooO0OO> interfaceC33723OooO0oO, Continuation continuation) {
        Object objCollect = this.f115740OooOo0o.collect(new OooO00o(interfaceC33723OooO0oO, this.f115739OooOo, this.f115742OooOoO0, this.f115741OooOoO, this.f115743OooOoOO), continuation);
        return objCollect == EnumC32485OooO00o.f116726OooOo0o ? objCollect : C32460OooOooO.f116667OooO00o;
    }
}
