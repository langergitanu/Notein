package oO0o0Oo;

import androidx.fragment.app.C21904OooOoo0;
import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32510OooOOo0;
import oO0o0OoO.C33808OooOo;

/* JADX INFO: renamed from: oO0o0Oo.OooOOoo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C33734OooOOoo implements InterfaceC33721OooO0o<Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ AbstractC32476OooO f121582OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ InterfaceC33721OooO0o f121583OooOo0o;

    /* JADX INFO: renamed from: oO0o0Oo.OooOOoo$OooO00o */
    @InterfaceC32482OooO0o0(m80622c = "kotlinx.coroutines.flow.FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1", m80623f = "Emitters.kt", m80624l = {110, 117, 124}, m80625m = "collect")
    public static final class OooO00o extends AbstractC32479OooO0OO {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public int f121584OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public /* synthetic */ Object f121585OooOo0o;

        /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
        public Object f121586OooOoO;

        /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
        public InterfaceC33723OooO0oO f121588OooOoOO;

        public OooO00o(Continuation continuation) {
            super(continuation);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            this.f121585OooOo0o = obj;
            this.f121584OooOo |= Integer.MIN_VALUE;
            return C33734OooOOoo.this.collect(null, this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C33734OooOOoo(InterfaceC33721OooO0o interfaceC33721OooO0o, InterfaceC32510OooOOo0 interfaceC32510OooOOo0) {
        this.f121583OooOo0o = interfaceC33721OooO0o;
        this.f121582OooOo = (AbstractC32476OooO) interfaceC32510OooOOo0;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:56:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r2v4, types: [oO00ooo.OooO, oO0O000o.OooOOo0] */
    /* JADX WARN: Type inference failed for: r9v6, types: [oO00ooo.OooO, oO0O000o.OooOOo0] */
    @Override // oO0o0Oo.InterfaceC33721OooO0o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(InterfaceC33723OooO0oO<? super Object> interfaceC33723OooO0oO, Continuation<? super C32460OooOooO> continuation) {
        OooO00o oooO00o;
        C33734OooOOoo c33734OooOOoo;
        C33786o0ooOO0 c33786o0ooOO0;
        ?? r2;
        C33808OooOo c33808OooOo;
        Throwable th;
        C33808OooOo c33808OooOo2;
        ?? r9;
        if (continuation instanceof OooO00o) {
            oooO00o = (OooO00o) continuation;
            int i = oooO00o.f121584OooOo;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooO00o.f121584OooOo = i - Integer.MIN_VALUE;
            } else {
                oooO00o = new OooO00o(continuation);
            }
        }
        Object obj = oooO00o.f121585OooOo0o;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = oooO00o.f121584OooOo;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(obj);
            try {
                InterfaceC33721OooO0o interfaceC33721OooO0o = this.f121583OooOo0o;
                oooO00o.f121586OooOoO = this;
                oooO00o.f121588OooOoOO = interfaceC33723OooO0oO;
                oooO00o.f121584OooOo = 1;
                if (interfaceC33721OooO0o.collect(interfaceC33723OooO0oO, oooO00o) != enumC32485OooO00o) {
                    c33734OooOOoo = this;
                    c33808OooOo = new C33808OooOo(interfaceC33723OooO0oO, oooO00o.getContext());
                    r9 = c33734OooOOoo.f121582OooOo;
                    oooO00o.f121586OooOoO = c33808OooOo;
                    oooO00o.f121588OooOoOO = null;
                    oooO00o.f121584OooOo = 3;
                    if (r9.invoke(c33808OooOo, null, oooO00o) != enumC32485OooO00o) {
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                c33734OooOOoo = this;
                c33786o0ooOO0 = new C33786o0ooOO0(th);
                r2 = c33734OooOOoo.f121582OooOo;
                oooO00o.f121586OooOoO = th;
                oooO00o.f121588OooOoOO = null;
                oooO00o.f121584OooOo = 2;
                if (C21904OooOoo0.OooO00o(c33786o0ooOO0, r2, th, oooO00o) == enumC32485OooO00o) {
                    throw th;
                }
            }
            return enumC32485OooO00o;
        }
        if (i2 != 1) {
            if (i2 == 2) {
                Throwable th3 = (Throwable) oooO00o.f121586OooOoO;
                C32446OooOOOo.OooO0O0(obj);
                throw th3;
            }
            if (i2 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c33808OooOo2 = (C33808OooOo) oooO00o.f121586OooOoO;
            try {
                C32446OooOOOo.OooO0O0(obj);
                c33808OooOo2.releaseIntercepted();
                return C32460OooOooO.f116667OooO00o;
            } catch (Throwable th4) {
                th = th4;
                c33808OooOo2.releaseIntercepted();
                throw th;
            }
        }
        interfaceC33723OooO0oO = oooO00o.f121588OooOoOO;
        c33734OooOOoo = (C33734OooOOoo) oooO00o.f121586OooOoO;
        try {
            C32446OooOOOo.OooO0O0(obj);
            c33808OooOo = new C33808OooOo(interfaceC33723OooO0oO, oooO00o.getContext());
            try {
                r9 = c33734OooOOoo.f121582OooOo;
                oooO00o.f121586OooOoO = c33808OooOo;
                oooO00o.f121588OooOoOO = null;
                oooO00o.f121584OooOo = 3;
                if (r9.invoke(c33808OooOo, null, oooO00o) != enumC32485OooO00o) {
                    c33808OooOo2 = c33808OooOo;
                    c33808OooOo2.releaseIntercepted();
                    return C32460OooOooO.f116667OooO00o;
                }
            } catch (Throwable th5) {
                th = th5;
                c33808OooOo2 = c33808OooOo;
                c33808OooOo2.releaseIntercepted();
                throw th;
            }
        } catch (Throwable th6) {
            th = th6;
            c33786o0ooOO0 = new C33786o0ooOO0(th);
            r2 = c33734OooOOoo.f121582OooOo;
            oooO00o.f121586OooOoO = th;
            oooO00o.f121588OooOoOO = null;
            oooO00o.f121584OooOo = 2;
            if (C21904OooOoo0.OooO00o(c33786o0ooOO0, r2, th, oooO00o) == enumC32485OooO00o) {
            }
        }
        return enumC32485OooO00o;
    }
}
