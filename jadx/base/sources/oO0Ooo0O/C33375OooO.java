package oO0Ooo0O;

import io.ktor.utils.p616io.InterfaceC23986Ooooo0o;
import java.io.InputStream;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.C24035Oooo00o;
import oO000oo.C32132OooO0Oo;
import oO00O0o0.C32183OooO0Oo;
import oO00O0o0.C32187OooOO0o;
import oO00O0o0.C32190OooOOo0;
import oO00O0o0.InterfaceC32191OooOOoo;
import oO00O0oO.C32214OooO0Oo;
import oO00O0oO.OooO0OO;
import oO00OOoO.AbstractC32246OooO0o0;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32510OooOOo0;

/* JADX INFO: renamed from: oO0Ooo0O.OooO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "io.ktor.client.plugins.DefaultTransformKt$defaultTransformers$1", m80623f = "DefaultTransform.kt", m80624l = {57}, m80625m = "invokeSuspend")
public final class C33375OooO extends AbstractC32476OooO implements InterfaceC32510OooOOo0<AbstractC32246OooO0o0<Object, C32132OooO0Oo>, Object, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public /* synthetic */ AbstractC32246OooO0o0 f120666OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f120667OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public /* synthetic */ Object f120668OooOoO0;

    /* JADX INFO: renamed from: oO0Ooo0O.OooO$OooO00o */
    public static final class OooO00o extends OooO0OO.OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final C32183OooO0Oo f120669OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final long f120670OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final /* synthetic */ Object f120671OooO0OO;

        public OooO00o(C32183OooO0Oo c32183OooO0Oo, Object obj) {
            this.f120671OooO0OO = obj;
            if (c32183OooO0Oo == null) {
                C32183OooO0Oo c32183OooO0Oo2 = C32183OooO0Oo.OooO00o.f115523OooO00o;
                c32183OooO0Oo = C32183OooO0Oo.OooO00o.f115524OooO0O0;
            }
            this.f120669OooO00o = c32183OooO0Oo;
            this.f120670OooO0O0 = ((byte[]) obj).length;
        }

        @Override // oO00O0oO.OooO0OO
        public final Long OooO00o() {
            return Long.valueOf(this.f120670OooO0O0);
        }

        @Override // oO00O0oO.OooO0OO
        public final C32183OooO0Oo OooO0O0() {
            return this.f120669OooO00o;
        }

        @Override // oO00O0oO.OooO0OO.OooO00o
        public final byte[] OooO0o0() {
            return (byte[]) this.f120671OooO0OO;
        }
    }

    /* JADX INFO: renamed from: oO0Ooo0O.OooO$OooO0O0 */
    public static final class OooO0O0 extends OooO0OO.AbstractC20204OooO0OO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final Long f120672OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final C32183OooO0Oo f120673OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final /* synthetic */ Object f120674OooO0OO;

        public OooO0O0(AbstractC32246OooO0o0<Object, C32132OooO0Oo> abstractC32246OooO0o0, C32183OooO0Oo c32183OooO0Oo, Object obj) {
            this.f120674OooO0OO = obj;
            C32187OooOO0o c32187OooOO0o = abstractC32246OooO0o0.f115817OooOo0o.f115205OooO0OO;
            List<String> list = C32190OooOOo0.f115537OooO00o;
            String strOooO0o0 = c32187OooOO0o.OooO0o0("Content-Length");
            this.f120672OooO00o = strOooO0o0 != null ? Long.valueOf(Long.parseLong(strOooO0o0)) : null;
            if (c32183OooO0Oo == null) {
                C32183OooO0Oo c32183OooO0Oo2 = C32183OooO0Oo.OooO00o.f115523OooO00o;
                c32183OooO0Oo = C32183OooO0Oo.OooO00o.f115524OooO0O0;
            }
            this.f120673OooO0O0 = c32183OooO0Oo;
        }

        @Override // oO00O0oO.OooO0OO
        public final Long OooO00o() {
            return this.f120672OooO00o;
        }

        @Override // oO00O0oO.OooO0OO
        public final C32183OooO0Oo OooO0O0() {
            return this.f120673OooO0O0;
        }

        @Override // oO00O0oO.OooO0OO.AbstractC20204OooO0OO
        public final InterfaceC23986Ooooo0o OooO0o0() {
            return (InterfaceC23986Ooooo0o) this.f120674OooO0OO;
        }
    }

    @Override // oO0O000o.InterfaceC32510OooOOo0
    public final Object invoke(AbstractC32246OooO0o0<Object, C32132OooO0Oo> abstractC32246OooO0o0, Object obj, Continuation<? super C32460OooOooO> continuation) {
        C33375OooO c33375OooO = new C33375OooO(3, continuation);
        c33375OooO.f120666OooOo = abstractC32246OooO0o0;
        c33375OooO.f120668OooOoO0 = obj;
        return c33375OooO.invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        oO00O0oO.OooO0OO c33386OooOO0o;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f120667OooOo0o;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            AbstractC32246OooO0o0 abstractC32246OooO0o0 = this.f120666OooOo;
            Object body = this.f120668OooOoO0;
            C32187OooOO0o c32187OooOO0o = ((C32132OooO0Oo) abstractC32246OooO0o0.f115817OooOo0o).f115205OooO0OO;
            List<String> list = C32190OooOOo0.f115537OooO00o;
            String strOooO0o0 = c32187OooOO0o.OooO0o0("Accept");
            TContext tcontext = abstractC32246OooO0o0.f115817OooOo0o;
            if (strOooO0o0 == null) {
                ((C32132OooO0Oo) tcontext).f115205OooO0OO.OooO0O0("Accept", "*/*");
            }
            C32183OooO0Oo c32183OooO0OoOooO0O0 = oO00O0o0.OooOo00.OooO0O0((InterfaceC32191OooOOoo) tcontext);
            if (body instanceof String) {
                String str = (String) body;
                if (c32183OooO0OoOooO0O0 == null) {
                    c32183OooO0OoOooO0O0 = C32183OooO0Oo.OooO0OO.f115525OooO00o;
                }
                c33386OooOO0o = new C32214OooO0Oo(str, c32183OooO0OoOooO0O0);
            } else if (body instanceof byte[]) {
                c33386OooOO0o = new OooO00o(c32183OooO0OoOooO0O0, body);
            } else if (body instanceof InterfaceC23986Ooooo0o) {
                c33386OooOO0o = new OooO0O0(abstractC32246OooO0o0, c32183OooO0OoOooO0O0, body);
            } else if (body instanceof oO00O0oO.OooO0OO) {
                c33386OooOO0o = (oO00O0oO.OooO0OO) body;
            } else {
                C32132OooO0Oo context = (C32132OooO0Oo) tcontext;
                kotlin.jvm.internal.OooOOO0.OooO0oO(context, "context");
                kotlin.jvm.internal.OooOOO0.OooO0oO(body, "body");
                c33386OooOO0o = body instanceof InputStream ? new C33386OooOO0o(context, c32183OooO0OoOooO0O0, body) : null;
            }
            if ((c33386OooOO0o != null ? c33386OooOO0o.OooO0O0() : null) != null) {
                C32132OooO0Oo c32132OooO0Oo = (C32132OooO0Oo) tcontext;
                c32132OooO0Oo.f115205OooO0OO.f123698OooO00o.remove("Content-Type");
                C33385OooOO0O.f120702OooO00o.OooO0oo("Transformed with default transformers request body for " + c32132OooO0Oo.f115203OooO00o + " from " + C24035Oooo00o.f80943OooO00o.OooO0O0(body.getClass()));
                this.f120666OooOo = null;
                this.f120667OooOo0o = 1;
                if (abstractC32246OooO0o0.OooO0o0(c33386OooOO0o, this) == enumC32485OooO00o) {
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
