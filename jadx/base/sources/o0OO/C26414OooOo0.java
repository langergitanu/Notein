package o0OO;

import com.orion.notein.data.p602db.entity.NotePdfLostInfoEntity;
import o0OOo0Oo.InterfaceC27312OooOoo;
import o0OOo0o.C27419o000o00o;
import o0OOo0o.o000;
import oO00ooO.C32460OooOooO;
import oO00ooo0.EnumC32485OooO00o;
import oo0oO0.o00OO;

/* JADX INFO: renamed from: o0OO.OooOo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C26414OooOo0 implements InterfaceC27312OooOoo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final o00OO f90695OooO00o;

    public C26414OooOo0(o00OO dao) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(dao, "dao");
        this.f90695OooO00o = dao;
    }

    @Override // o0OOo0Oo.InterfaceC27312OooOoo
    public final Object OooO00o(NotePdfLostInfoEntity notePdfLostInfoEntity, C27419o000o00o c27419o000o00o) {
        Object objOooO00o = this.f90695OooO00o.OooO00o(notePdfLostInfoEntity, c27419o000o00o);
        return objOooO00o == EnumC32485OooO00o.f116726OooOo0o ? objOooO00o : C32460OooOooO.f116667OooO00o;
    }

    @Override // o0OOo0Oo.InterfaceC27312OooOoo
    public final Object OooO0O0(String str, o000 o000Var) {
        return this.f90695OooO00o.OooO0O0(str, o000Var);
    }
}
