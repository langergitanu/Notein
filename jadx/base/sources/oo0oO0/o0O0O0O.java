package oo0oO0;

import com.orion.notein.data.p602db.NoteDatabase_Impl;
import com.orion.notein.data.p602db.entity.ToolBoxInfoEntity;
import o000ooOO.C24734OooO0O0;
import o0Ooo0oo.C29517o0000OO0;

/* JADX INFO: loaded from: classes9.dex */
public final class o0O0O0O implements o0O00oO0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final NoteDatabase_Impl f125629OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final o00OOO0 f125630OooO0O0 = new o00OOO0(1);

    public o0O0O0O(NoteDatabase_Impl noteDatabase_Impl) {
        this.f125629OooO00o = noteDatabase_Impl;
    }

    @Override // oo0oO0.o0O00oO0
    public final Object OooO00o(ToolBoxInfoEntity[] toolBoxInfoEntityArr, C29517o0000OO0 c29517o0000OO0) {
        toolBoxInfoEntityArr.getClass();
        return C24734OooO0O0.OooO0oo(c29517o0000OO0, this.f125629OooO00o, new C34717OooOoO0(2, this, toolBoxInfoEntityArr), false, true);
    }

    @Override // oo0oO0.o0O00oO0
    public final ToolBoxInfoEntity OooO0O0(String str) {
        return (ToolBoxInfoEntity) C24734OooO0O0.OooO0o(this.f125629OooO00o, true, false, new o00OOO00(str, 1));
    }
}
