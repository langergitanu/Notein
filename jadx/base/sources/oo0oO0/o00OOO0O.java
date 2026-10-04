package oo0oO0;

import com.orion.notein.data.p602db.NoteDatabase_Impl;
import com.orion.notein.data.p602db.entity.NotePdfLostInfoEntity;
import o000ooOO.C24734OooO0O0;
import o0OOo0o.C27419o000o00o;

/* JADX INFO: loaded from: classes9.dex */
public final class o00OOO0O implements o00OO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final NoteDatabase_Impl f125334OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final o00OOO0 f125335OooO0O0 = new o00OOO0(0);

    public o00OOO0O(NoteDatabase_Impl noteDatabase_Impl) {
        this.f125334OooO00o = noteDatabase_Impl;
    }

    @Override // oo0oO0.o00OO
    public final Object OooO00o(NotePdfLostInfoEntity notePdfLostInfoEntity, C27419o000o00o c27419o000o00o) {
        return C24734OooO0O0.OooO0oo(c27419o000o00o, this.f125334OooO00o, new C34717OooOoO0(1, this, notePdfLostInfoEntity), false, true);
    }

    @Override // oo0oO0.o00OO
    public final Object OooO0O0(String str, o0OOo0o.o000 o000Var) {
        return C24734OooO0O0.OooO0oo(o000Var, this.f125334OooO00o, new o00OOO00(str, 0), true, false);
    }
}
