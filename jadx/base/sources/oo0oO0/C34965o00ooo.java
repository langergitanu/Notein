package oo0oO0;

import com.orion.notein.data.p602db.NoteDatabase_Impl;
import com.orion.notein.data.p602db.entity.DownloadedMaterialEntity;
import o000ooOO.C24734OooO0O0;
import o0OO0ooO.C26954OooO0O0;
import o0OO0ooO.C26955OooO0OO;
import o0OO0ooO.C26959OooO0oO;
import o0OO0ooO.C26960OooO0oo;
import o0oo0Oo.C31254OooOOo;
import o0oo0Oo.C31259OooOo00;

/* JADX INFO: renamed from: oo0oO0.o00ooo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C34965o00ooo implements InterfaceC34847o00Oo0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final NoteDatabase_Impl f125577OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final C34893o00o0O f125578OooO0O0 = new C34893o00o0O();

    public C34965o00ooo(NoteDatabase_Impl noteDatabase_Impl) {
        this.f125577OooO00o = noteDatabase_Impl;
    }

    @Override // oo0oO0.InterfaceC34847o00Oo0
    public final Object OooO0O0(String str, C26954OooO0O0 c26954OooO0O0) {
        return C24734OooO0O0.OooO0oo(c26954OooO0O0, this.f125577OooO00o, new C31254OooOOo(str, 1), false, true);
    }

    @Override // oo0oO0.InterfaceC34847o00Oo0
    public final Object OooO0OO(String str, C26960OooO0oo c26960OooO0oo) {
        return C24734OooO0O0.OooO0oo(c26960OooO0oo, this.f125577OooO00o, new o0o0O00O.OooO0O0(str, 1), true, false);
    }

    @Override // oo0oO0.InterfaceC34847o00Oo0
    public final Object OooO0Oo(DownloadedMaterialEntity downloadedMaterialEntity, C26959OooO0oO c26959OooO0oO) {
        return C24734OooO0O0.OooO0oo(c26959OooO0oO, this.f125577OooO00o, new C34869o00Ooo(0, this, downloadedMaterialEntity), false, true);
    }

    @Override // oo0oO0.InterfaceC34847o00Oo0
    public final Object OooO0o0(String str, C26955OooO0OO c26955OooO0OO) {
        return C24734OooO0O0.OooO0oo(c26955OooO0OO, this.f125577OooO00o, new C31259OooOo00(str, 1), true, false);
    }
}
