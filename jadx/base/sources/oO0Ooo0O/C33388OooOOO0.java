package oO0Ooo0O;

import io.ktor.utils.p616io.InterfaceC23986Ooooo0o;
import io.ktor.utils.p616io.jvm.javaio.C24002OooO0o0;
import java.io.IOException;
import java.io.InputStream;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.C24035Oooo00o;
import oO00OOoO.AbstractC32246OooO0o0;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32447OooOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32510OooOOo0;
import oO0Oo0Oo.C33201OooO0Oo;
import oO0Oo0Oo.C33204OooO0oO;
import oO0o0OO.InterfaceC33672o00ooo;

/* JADX INFO: renamed from: oO0Ooo0O.OooOOO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "io.ktor.client.plugins.DefaultTransformersJvmKt$platformResponseDefaultTransformers$1", m80623f = "DefaultTransformersJvm.kt", m80624l = {36}, m80625m = "invokeSuspend")
public final class C33388OooOOO0 extends AbstractC32476OooO implements InterfaceC32510OooOOo0<AbstractC32246OooO0o0<C33201OooO0Oo, ooOOOOOo.OooO0OO>, C33201OooO0Oo, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public /* synthetic */ AbstractC32246OooO0o0 f120706OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f120707OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public /* synthetic */ C33201OooO0Oo f120708OooOoO0;

    /* JADX INFO: renamed from: oO0Ooo0O.OooOOO0$OooO00o */
    public static final class OooO00o extends InputStream {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ AbstractC32246OooO0o0<C33201OooO0Oo, ooOOOOOo.OooO0OO> f120709OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ C24002OooO0o0 f120710OooOo0o;

        public OooO00o(C24002OooO0o0 c24002OooO0o0, AbstractC32246OooO0o0 abstractC32246OooO0o0) {
            this.f120710OooOo0o = c24002OooO0o0;
            this.f120709OooOo = abstractC32246OooO0o0;
        }

        @Override // java.io.InputStream
        public final int available() {
            return this.f120710OooOo0o.f80861OooOo0o.OooO0OO();
        }

        @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public final void close() throws IOException {
            super.close();
            this.f120710OooOo0o.close();
            C33204OooO0oO.OooO0OO(this.f120709OooOo.f115817OooOo0o.OooO0o0());
        }

        @Override // java.io.InputStream
        public final int read() {
            return this.f120710OooOo0o.read();
        }

        @Override // java.io.InputStream
        public final int read(byte[] b, int i, int i2) {
            kotlin.jvm.internal.OooOOO0.OooO0oO(b, "b");
            return this.f120710OooOo0o.read(b, i, i2);
        }
    }

    @Override // oO0O000o.InterfaceC32510OooOOo0
    public final Object invoke(AbstractC32246OooO0o0<C33201OooO0Oo, ooOOOOOo.OooO0OO> abstractC32246OooO0o0, C33201OooO0Oo c33201OooO0Oo, Continuation<? super C32460OooOooO> continuation) {
        C33388OooOOO0 c33388OooOOO0 = new C33388OooOOO0(3, continuation);
        c33388OooOOO0.f120706OooOo = abstractC32246OooO0o0;
        c33388OooOOO0.f120708OooOoO0 = c33201OooO0Oo;
        return c33388OooOOO0.invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f120707OooOo0o;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            AbstractC32246OooO0o0 abstractC32246OooO0o0 = this.f120706OooOo;
            C33201OooO0Oo c33201OooO0Oo = this.f120708OooOoO0;
            oOOoOoOO.OooO00o oooO00o = c33201OooO0Oo.f120151OooO00o;
            Object obj2 = c33201OooO0Oo.f120152OooO0O0;
            if (!(obj2 instanceof InterfaceC23986Ooooo0o)) {
                return C32460OooOooO.f116667OooO00o;
            }
            if (kotlin.jvm.internal.OooOOO0.OooO0O0(oooO00o.f123413OooO00o, C24035Oooo00o.f80943OooO00o.OooO0O0(InputStream.class))) {
                InterfaceC23986Ooooo0o interfaceC23986Ooooo0o = (InterfaceC23986Ooooo0o) obj2;
                InterfaceC33672o00ooo interfaceC33672o00ooo = (InterfaceC33672o00ooo) ((ooOOOOOo.OooO0OO) abstractC32246OooO0o0.f115817OooOo0o).OooOOO0().get(InterfaceC33672o00ooo.OooO00o.f121379OooOo0o);
                C32447OooOOo c32447OooOOo = io.ktor.utils.p616io.jvm.javaio.OooO0O0.f80853OooO00o;
                kotlin.jvm.internal.OooOOO0.OooO0oO(interfaceC23986Ooooo0o, "<this>");
                C33201OooO0Oo c33201OooO0Oo2 = new C33201OooO0Oo(oooO00o, new OooO00o(new C24002OooO0o0(interfaceC33672o00ooo, interfaceC23986Ooooo0o), abstractC32246OooO0o0));
                this.f120706OooOo = null;
                this.f120707OooOo0o = 1;
                if (abstractC32246OooO0o0.OooO0o0(c33201OooO0Oo2, this) == enumC32485OooO00o) {
                    return enumC32485OooO00o;
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
