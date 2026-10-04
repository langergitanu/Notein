package oo0oO0;

import com.orion.notein.data.p602db.NoteDatabase_Impl;
import com.orion.notein.data.p602db.entity.UserEntity;
import o000oo0o.C24718OooOO0o;
import o000oo0o.C24720OooOOO0;
import o000ooOO.C24734OooO0O0;
import o0OOOO0o.C27114OooOooo;
import o0o0OOO.C30470OooOOO0;
import o0o0OOO.C30471OooOOOO;
import oO00ooo.AbstractC32479OooO0OO;

/* JADX INFO: renamed from: oo0oO0.o0O0O0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C34987o0O0O0o implements o0O0O0Oo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final NoteDatabase_Impl f125631OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final o0O0O0o0 f125632OooO0O0 = new o0O0O0o0();

    public C34987o0O0O0o(NoteDatabase_Impl noteDatabase_Impl) {
        this.f125631OooO00o = noteDatabase_Impl;
    }

    @Override // oo0oO0.o0O0O0Oo
    public final void OooO00o(String str) {
        C24734OooO0O0.OooO0o(this.f125631OooO00o, false, true, new C34720OooOoo0(str, 1));
    }

    @Override // oo0oO0.o0O0O0Oo
    public final C24718OooOO0o OooO0O0(String str) {
        C30471OooOOOO c30471OooOOOO = new C30471OooOOOO(str, 1);
        return C24720OooOOO0.OooO00o(this.f125631OooO00o, new String[]{"UserEntity"}, c30471OooOOOO);
    }

    @Override // oo0oO0.o0O0O0Oo
    public final Object OooO0OO(UserEntity[] userEntityArr, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        return C24734OooO0O0.OooO0oo(abstractC32479OooO0OO, this.f125631OooO00o, new C34721OooOooO(this, userEntityArr, 2), false, true);
    }

    @Override // oo0oO0.o0O0O0Oo
    public final Object OooO0Oo(String str, C27114OooOooo c27114OooOooo) {
        return C24734OooO0O0.OooO0oo(c27114OooOooo, this.f125631OooO00o, new C30470OooOOO0(str, 1), true, false);
    }
}
