package oO0o0Oo;

import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo0.EnumC32485OooO00o;
import oO0o0OoO.C33808OooOo;

/* JADX INFO: renamed from: oO0o0Oo.o00oO0O, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C33782o00oO0O<T> implements InterfaceC33723OooO0oO<T> {
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r1v1, types: [int, oO00ooo.OooO0OO] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C32460OooOooO OooO00o(AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C33783o00oO0o c33783o00oO0o;
        if (abstractC32479OooO0OO instanceof C33783o00oO0o) {
            c33783o00oO0o = (C33783o00oO0o) abstractC32479OooO0OO;
            int i = c33783o00oO0o.f121809OooOoOO;
            if ((i & Integer.MIN_VALUE) != 0) {
                c33783o00oO0o.f121809OooOoOO = i - Integer.MIN_VALUE;
            } else {
                c33783o00oO0o = new C33783o00oO0o(this, abstractC32479OooO0OO);
            }
        }
        Object obj = c33783o00oO0o.f121808OooOoO0;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        ?? r1 = c33783o00oO0o.f121809OooOoOO;
        try {
            if (r1 == 0) {
                C32446OooOOOo.OooO0O0(obj);
                C33808OooOo c33808OooOo = new C33808OooOo(null, c33783o00oO0o.getContext());
                c33783o00oO0o.f121806OooOo0o = this;
                c33783o00oO0o.f121805OooOo = c33808OooOo;
                c33783o00oO0o.f121809OooOoOO = 1;
                throw null;
            }
            if (r1 != 1) {
                if (r1 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(obj);
                return C32460OooOooO.f116667OooO00o;
            }
            C33808OooOo c33808OooOo2 = c33783o00oO0o.f121805OooOo;
            C33782o00oO0O c33782o00oO0O = c33783o00oO0o.f121806OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            c33808OooOo2.releaseIntercepted();
            c33782o00oO0O.getClass();
            return C32460OooOooO.f116667OooO00o;
        } catch (Throwable th) {
            r1.releaseIntercepted();
            throw th;
        }
    }

    @Override // oO0o0Oo.InterfaceC33723OooO0oO
    public final Object emit(T t, Continuation<? super C32460OooOooO> continuation) {
        throw null;
    }
}
