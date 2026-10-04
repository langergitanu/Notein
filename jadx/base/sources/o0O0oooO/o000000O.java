package o0O0oooO;

import java.util.List;
import o0O0Ooo.C25904OooO0O0;
import o0O0Ooo.InterfaceC25905OooO0OO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo0.EnumC32485OooO00o;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33649OoooOOo;
import oO0o0o0o.C33874OooO0OO;
import oO0o0o0o.ExecutorC33873OooO0O0;
import oOO00oo.C34406OooO00o;
import oOo000Oo.C34429OooOOo0;

/* JADX INFO: loaded from: classes9.dex */
public final class o000000O implements InterfaceC25905OooO0OO {

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final List<C25904OooO0O0> f90154OooO0OO = C34429OooOOo0.OooOO0o(new C25904OooO0O0("Xiaomi Smart Pen", "6421", "60138"), new C25904OooO0O0("Redmi Smart Pen", "34", "20099"));

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final o0OOo0o.o00000O f90155OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public volatile List<C25904OooO0O0> f90156OooO0O0;

    public o000000O(o0OOo0o.o00000O getRemoteConfigUseCase) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(getRemoteConfigUseCase, "getRemoteConfigUseCase");
        this.f90155OooO00o = getRemoteConfigUseCase;
    }

    @Override // o0O0Ooo.InterfaceC25905OooO0OO
    public final List<C25904OooO0O0> OooO00o() {
        return this.f90156OooO0O0;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o0O0Ooo.InterfaceC25905OooO0OO
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooO0O0(AbstractC32479OooO0OO abstractC32479OooO0OO) throws Throwable {
        C26338o000OOo c26338o000OOo;
        o000000O o000000o2;
        o000000O o000000o3;
        if (abstractC32479OooO0OO instanceof C26338o000OOo) {
            c26338o000OOo = (C26338o000OOo) abstractC32479OooO0OO;
            int i = c26338o000OOo.f90385OooOoOO;
            if ((i & Integer.MIN_VALUE) != 0) {
                c26338o000OOo.f90385OooOoOO = i - Integer.MIN_VALUE;
            } else {
                c26338o000OOo = new C26338o000OOo(this, abstractC32479OooO0OO);
            }
        }
        Object objOooO0o = c26338o000OOo.f90384OooOoO0;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c26338o000OOo.f90385OooOoOO;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(objOooO0o);
            if (this.f90156OooO0O0 != null) {
                return C32460OooOooO.f116667OooO00o;
            }
            C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
            ExecutorC33873OooO0O0 executorC33873OooO0O0 = ExecutorC33873OooO0O0.f122045OooOoO0;
            o000000 o000000Var = new o000000(this, null);
            c26338o000OOo.f90382OooOo0o = this;
            c26338o000OOo.f90381OooOo = this;
            c26338o000OOo.f90385OooOoOO = 1;
            objOooO0o = C33609OooO0oo.OooO0o(executorC33873OooO0O0, o000000Var, c26338o000OOo);
            if (objOooO0o == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
            o000000o2 = this;
            o000000o3 = o000000o2;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o000000o3 = c26338o000OOo.f90381OooOo;
            o000000o2 = c26338o000OOo.f90382OooOo0o;
            C32446OooOOOo.OooO0O0(objOooO0o);
        }
        o000000o3.f90156OooO0O0 = (List) objOooO0o;
        C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
        c20358OooO00o.OooOOO0("StylusHardwareInfoProvider");
        List<C25904OooO0O0> list = o000000o2.f90156OooO0O0;
        Integer num = list != null ? new Integer(list.size()) : null;
        c20358OooO00o.OooO0o0("Stylus hardware info loaded: size=" + num + ", list=" + o000000o2.f90156OooO0O0, new Object[0]);
        return C32460OooOooO.f116667OooO00o;
    }
}
