package androidx.fragment.app;

import android.os.Bundle;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.C24039Oooo0o0;
import oO00ooO.C32435OooO0Oo;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32477OooO00o;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo0.C32486OooO0O0;
import oO00ooo0.C32487OooO0OO;
import oO00ooo0.C32488OooO0Oo;
import oO00ooo0.C32489OooO0o;
import oO00ooo0.C32490OooO0o0;
import oO00ooo0.C32491OooO0oO;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32507OooOO0o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0O000o.InterfaceC32510OooOOo0;
import oO0o0Oo.C33732OooOOo;
import oO0o0Oo.C33786o0ooOO0;
import oOo0000O.InterfaceC34415OooO0oo;

/* JADX INFO: renamed from: androidx.fragment.app.OooOoo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C21904OooOoo0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final /* synthetic */ int f64999OooO00o = 0;

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object OooO00o(C33786o0ooOO0 c33786o0ooOO0, InterfaceC32510OooOOo0 interfaceC32510OooOOo0, Throwable th, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C33732OooOOo c33732OooOOo;
        if (abstractC32479OooO0OO instanceof C33732OooOOo) {
            c33732OooOOo = (C33732OooOOo) abstractC32479OooO0OO;
            int i = c33732OooOOo.f121580OooOoO0;
            if ((i & Integer.MIN_VALUE) != 0) {
                c33732OooOOo.f121580OooOoO0 = i - Integer.MIN_VALUE;
            } else {
                c33732OooOOo = new C33732OooOOo(abstractC32479OooO0OO);
            }
        }
        Object obj = c33732OooOOo.f121578OooOo;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c33732OooOOo.f121580OooOoO0;
        try {
            if (i2 == 0) {
                C32446OooOOOo.OooO0O0(obj);
                c33732OooOOo.f121579OooOo0o = th;
                c33732OooOOo.f121580OooOoO0 = 1;
                if (interfaceC32510OooOOo0.invoke(c33786o0ooOO0, th, c33732OooOOo) == enumC32485OooO00o) {
                    return enumC32485OooO00o;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                th = c33732OooOOo.f121579OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
            }
            return C32460OooOooO.f116667OooO00o;
        } catch (Throwable th2) {
            if (th != null && th != th2) {
                C32435OooO0Oo.OooO00o(th2, th);
            }
            throw th2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Continuation OooO0O0(Continuation continuation, Continuation continuation2, InterfaceC32508OooOOOo interfaceC32508OooOOOo) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(interfaceC32508OooOOOo, "<this>");
        if (interfaceC32508OooOOOo instanceof AbstractC32477OooO00o) {
            return ((AbstractC32477OooO00o) interfaceC32508OooOOOo).create(continuation, continuation2);
        }
        InterfaceC34415OooO0oo context = continuation2.getContext();
        return context == oOo0000O.OooO.f123416OooOo0o ? new C32488OooO0Oo(continuation2, continuation, interfaceC32508OooOOOo) : new C32490OooO0o0(continuation2, context, interfaceC32508OooOOOo, continuation);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Continuation OooO0OO(InterfaceC32507OooOO0o interfaceC32507OooOO0o, Continuation completion) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(completion, "completion");
        if (interfaceC32507OooOO0o instanceof AbstractC32477OooO00o) {
            return ((AbstractC32477OooO00o) interfaceC32507OooOO0o).create(completion);
        }
        InterfaceC34415OooO0oo context = completion.getContext();
        return context == oOo0000O.OooO.f123416OooOo0o ? new C32486OooO0O0(interfaceC32507OooOO0o, completion) : new C32487OooO0OO(completion, context, interfaceC32507OooOO0o);
    }

    public static void OooO0Oo() {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
    }

    public static final void OooO0o(Bundle bundle, Fragment fragment, String str) {
        fragment.getParentFragmentManager().OooooOo(bundle, str);
    }

    public static Continuation OooO0o0(Continuation continuation) {
        Continuation<Object> continuationIntercepted;
        kotlin.jvm.internal.OooOOO0.OooO0oO(continuation, "<this>");
        AbstractC32479OooO0OO abstractC32479OooO0OO = continuation instanceof AbstractC32479OooO0OO ? (AbstractC32479OooO0OO) continuation : null;
        return (abstractC32479OooO0OO == null || (continuationIntercepted = abstractC32479OooO0OO.intercepted()) == null) ? continuation : continuationIntercepted;
    }

    public static final void OooO0oO(Fragment fragment, String str, InterfaceC32508OooOOOo interfaceC32508OooOOOo) {
        fragment.getParentFragmentManager().Oooooo0(str, fragment, new C21902OooOoOO(interfaceC32508OooOOOo));
    }

    public static Object OooO0oo(InterfaceC32508OooOOOo interfaceC32508OooOOOo, Object obj, Continuation continuation) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(interfaceC32508OooOOOo, "<this>");
        InterfaceC34415OooO0oo context = continuation.getContext();
        Continuation c32489OooO0o = context == oOo0000O.OooO.f123416OooOo0o ? new C32489OooO0o(continuation) : new C32491OooO0oO(continuation, context);
        C24039Oooo0o0.OooO0o0(2, interfaceC32508OooOOOo);
        return interfaceC32508OooOOOo.invoke(obj, c32489OooO0o);
    }
}
