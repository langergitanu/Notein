package o0OOooOO;

import o0OOOO00.C27095OooOo0O;
import oO00ooO.C32445OooOOOO;
import oO00ooO.C32446OooOOOo;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo0.EnumC32485OooO00o;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33649OoooOOo;
import oO0o0o0o.C33874OooO0OO;
import oO0o0o0o.ExecutorC33873OooO0O0;

/* JADX INFO: renamed from: o0OOooOO.OooO0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C27968OooO0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final C27095OooOo0O f99158OooO00o;

    public C27968OooO0o(C27095OooOo0O c27095OooOo0O) {
        this.f99158OooO00o = c27095OooOo0O;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooO00o(int i, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C27967OooO0Oo c27967OooO0Oo;
        if (abstractC32479OooO0OO instanceof C27967OooO0Oo) {
            c27967OooO0Oo = (C27967OooO0Oo) abstractC32479OooO0OO;
            int i2 = c27967OooO0Oo.f99157OooOoO0;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c27967OooO0Oo.f99157OooOoO0 = i2 - Integer.MIN_VALUE;
            } else {
                c27967OooO0Oo = new C27967OooO0Oo(this, abstractC32479OooO0OO);
            }
        }
        Object objOooO0o = c27967OooO0Oo.f99156OooOo0o;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i3 = c27967OooO0Oo.f99157OooOoO0;
        if (i3 == 0) {
            C32446OooOOOo.OooO0O0(objOooO0o);
            C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
            ExecutorC33873OooO0O0 executorC33873OooO0O0 = ExecutorC33873OooO0O0.f122045OooOoO0;
            C27969OooO0o0 c27969OooO0o0 = new C27969OooO0o0(this, i, null);
            c27967OooO0Oo.f99157OooOoO0 = 1;
            objOooO0o = C33609OooO0oo.OooO0o(executorC33873OooO0O0, c27969OooO0o0, c27967OooO0Oo);
            if (objOooO0o == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(objOooO0o);
        }
        return ((C32445OooOOOO) objOooO0o).f116639OooOo0o;
    }
}
