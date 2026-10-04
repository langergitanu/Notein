package o0OOoo0O;

import com.orion.notein.domain.models.note.ColorSet;
import o00OO0oO.C25003OooO0O0;
import oO00ooO.C32446OooOOOo;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo0.EnumC32485OooO00o;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33649OoooOOo;
import oO0o0o0o.C33874OooO0OO;
import oO0o0o0o.ExecutorC33873OooO0O0;

/* JADX INFO: renamed from: o0OOoo0O.OooO0o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C27837OooO0o0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final o0OO0o0O.OooO f98345OooO00o;

    public C27837OooO0o0(o0OO0o0O.OooO oooO) {
        this.f98345OooO00o = oooO;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooO00o(String str, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C27835OooO0Oo c27835OooO0Oo;
        if (abstractC32479OooO0OO instanceof C27835OooO0Oo) {
            c27835OooO0Oo = (C27835OooO0Oo) abstractC32479OooO0OO;
            int i = c27835OooO0Oo.f98339OooOoO0;
            if ((i & Integer.MIN_VALUE) != 0) {
                c27835OooO0Oo.f98339OooOoO0 = i - Integer.MIN_VALUE;
            } else {
                c27835OooO0Oo = new C27835OooO0Oo(this, abstractC32479OooO0OO);
            }
        }
        Object objOooO0o = c27835OooO0Oo.f98338OooOo0o;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c27835OooO0Oo.f98339OooOoO0;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(objOooO0o);
            c27835OooO0Oo.f98339OooOoO0 = 1;
            C25003OooO0O0 c25003OooO0O0 = this.f98345OooO00o.f93457OooO00o;
            C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
            objOooO0o = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new o0OO0o0O.OooO0OO(c25003OooO0O0, str, null), c27835OooO0Oo);
            if (objOooO0o == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(objOooO0o);
        }
        return Boolean.valueOf(((ColorSet) objOooO0o) != null);
    }
}
