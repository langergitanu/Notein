package oo0oO0;

import Oooo0oo.AbstractC21138OooO0oo;
import com.orion.notein.data.p602db.entity.UpdatePageOffSetEntity;
import o000ooo.InterfaceC24749OooO0Oo;

/* JADX INFO: renamed from: oo0oO0.o00O0Ooo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C34823o00O0Ooo extends AbstractC21138OooO0oo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ C34826o00O0o00 f125283OooO00o;

    public C34823o00O0Ooo(C34826o00O0o00 c34826o00O0o00) {
        this.f125283OooO00o = c34826o00O0o00;
    }

    @Override // Oooo0oo.AbstractC21138OooO0oo
    public final String Oooo() {
        return "UPDATE OR ABORT `NoteContentEntity` SET `id` = ?,`page_offset_json` = ? WHERE `id` = ?";
    }

    @Override // Oooo0oo.AbstractC21138OooO0oo
    public final void Oooo0OO(InterfaceC24749OooO0Oo interfaceC24749OooO0Oo, Object obj) {
        UpdatePageOffSetEntity updatePageOffSetEntity = (UpdatePageOffSetEntity) obj;
        if (updatePageOffSetEntity.getId() == null) {
            interfaceC24749OooO0Oo.OooO0oO(1);
        } else {
            interfaceC24749OooO0Oo.o000000O(1, updatePageOffSetEntity.getId());
        }
        String json = this.f125283OooO00o.f125287OooO0OO.toJson(updatePageOffSetEntity.getPageOffset());
        if (json == null) {
            interfaceC24749OooO0Oo.OooO0oO(2);
        } else {
            interfaceC24749OooO0Oo.o000000O(2, json);
        }
        if (updatePageOffSetEntity.getId() == null) {
            interfaceC24749OooO0Oo.OooO0oO(3);
        } else {
            interfaceC24749OooO0Oo.o000000O(3, updatePageOffSetEntity.getId());
        }
    }
}
