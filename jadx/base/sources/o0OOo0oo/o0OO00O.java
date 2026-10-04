package o0OOo0oo;

import o0OOoO00.C27723OooO0O0;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo0.EnumC32485OooO00o;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33649OoooOOo;
import oO0o0o0o.C33874OooO0OO;
import oO0o0o0o.ExecutorC33873OooO0O0;

/* JADX INFO: loaded from: classes9.dex */
public final class o0OO00O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final C27723OooO0O0 f97649OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final C27629OooOOoo f97650OooO0O0;

    public o0OO00O(C27723OooO0O0 facade, C27629OooOOoo c27629OooOOoo) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(facade, "facade");
        this.f97649OooO00o = facade;
        this.f97650OooO0O0 = c27629OooOOoo;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0069, code lost:
    
        if (r6 == r1) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooO00o(AbstractC32479OooO0OO abstractC32479OooO0OO) throws Throwable {
        o0Oo0oo o0oo0oo2;
        o0OO00O o0oo00o2;
        if (abstractC32479OooO0OO instanceof o0Oo0oo) {
            o0oo0oo2 = (o0Oo0oo) abstractC32479OooO0OO;
            int i = o0oo0oo2.f97656OooOoO;
            if ((i & Integer.MIN_VALUE) != 0) {
                o0oo0oo2.f97656OooOoO = i - Integer.MIN_VALUE;
            } else {
                o0oo0oo2 = new o0Oo0oo(this, abstractC32479OooO0OO);
            }
        }
        Object obj = o0oo0oo2.f97654OooOo;
        Object obj2 = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = o0oo0oo2.f97656OooOoO;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(obj);
            o0oo0oo2.f97655OooOo0o = this;
            o0oo0oo2.f97656OooOoO = 1;
            Object objOooOOO0 = this.f97649OooO00o.f97800OooO00o.OooOOO0(true, o0oo0oo2);
            if (objOooOOO0 != obj2) {
                objOooOOO0 = C32460OooOooO.f116667OooO00o;
            }
            if (objOooOOO0 != obj2) {
                o0oo00o2 = this;
            }
            return obj2;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
            return C32460OooOooO.f116667OooO00o;
        }
        o0oo00o2 = o0oo0oo2.f97655OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        C27629OooOOoo c27629OooOOoo = o0oo00o2.f97650OooO0O0;
        o0oo0oo2.f97655OooOo0o = null;
        o0oo0oo2.f97656OooOoO = 2;
        C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
        Object objOooO0o = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C27627OooOOo(c27629OooOOoo, null), o0oo0oo2);
        if (objOooO0o != obj2) {
            objOooO0o = C32460OooOooO.f116667OooO00o;
        }
    }
}
