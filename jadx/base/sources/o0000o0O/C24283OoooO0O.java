package o0000o0O;

import java.io.FileOutputStream;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo0.EnumC32485OooO00o;

/* JADX INFO: renamed from: o0000o0O.OoooO0O, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C24283OoooO0O<T> extends C24275Oooo0OO<T> implements o0O0O00<T> {
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o0000o0O.o0O0O00
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooO0O0(Object obj, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C24281OoooO0 c24281OoooO0;
        FileOutputStream fileOutputStream;
        FileOutputStream fileOutputStream2;
        if (abstractC32479OooO0OO instanceof C24281OoooO0) {
            c24281OoooO0 = (C24281OoooO0) abstractC32479OooO0OO;
            int i = c24281OoooO0.f81718OooOoOO;
            if ((i & Integer.MIN_VALUE) != 0) {
                c24281OoooO0.f81718OooOoOO = i - Integer.MIN_VALUE;
            } else {
                c24281OoooO0 = new C24281OoooO0(this, abstractC32479OooO0OO);
            }
        }
        Object obj2 = c24281OoooO0.f81717OooOoO0;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c24281OoooO0.f81718OooOoOO;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(obj2);
            if (this.f81698OooO0OO.get()) {
                throw new IllegalStateException("This scope has already been closed.");
            }
            FileOutputStream fileOutputStream3 = new FileOutputStream(this.f81696OooO00o);
            try {
                o00O0O<T> o00o0o2 = this.f81697OooO0O0;
                o0Oo0oo o0oo0oo2 = new o0Oo0oo(fileOutputStream3);
                c24281OoooO0.f81715OooOo0o = fileOutputStream3;
                c24281OoooO0.f81714OooOo = fileOutputStream3;
                c24281OoooO0.f81718OooOoOO = 1;
                if (o00o0o2.writeTo(obj, o0oo0oo2, c24281OoooO0) == enumC32485OooO00o) {
                    return enumC32485OooO00o;
                }
                fileOutputStream2 = fileOutputStream3;
                fileOutputStream = fileOutputStream2;
            } catch (Throwable th) {
                th = th;
                fileOutputStream = fileOutputStream3;
                throw th;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            fileOutputStream2 = c24281OoooO0.f81714OooOo;
            fileOutputStream = c24281OoooO0.f81715OooOo0o;
            try {
                C32446OooOOOo.OooO0O0(obj2);
            } catch (Throwable th2) {
                th = th2;
                try {
                    throw th;
                } catch (Throwable th3) {
                    oO0O000.OooO00o.OooO00o(fileOutputStream, th);
                    throw th3;
                }
            }
        }
        fileOutputStream2.getFD().sync();
        C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
        oO0O000.OooO00o.OooO00o(fileOutputStream, null);
        return C32460OooOooO.f116667OooO00o;
    }
}
