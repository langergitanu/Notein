package oo0oO0;

import Oooo0oo.AbstractC21138OooO0oo;
import com.orion.notein.data.p602db.entity.NotePlaceholderEntity;
import o000ooo.InterfaceC24749OooO0Oo;

/* JADX INFO: loaded from: classes9.dex */
public final class o00OOOO extends AbstractC21138OooO0oo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ o00OOOOo f125336OooO00o;

    public o00OOOO(o00OOOOo o00ooooo2) {
        this.f125336OooO00o = o00ooooo2;
    }

    @Override // Oooo0oo.AbstractC21138OooO0oo
    public final String Oooo() {
        return "UPDATE OR ABORT `NotePlaceholderEntity` SET `id` = ?,`parent_id` = ?,`title` = ?,`creation_time` = ?,`file_path` = ?,`uri` = ?,`state` = ?,`extras` = ? WHERE `id` = ?";
    }

    @Override // Oooo0oo.AbstractC21138OooO0oo
    public final void Oooo0OO(InterfaceC24749OooO0Oo interfaceC24749OooO0Oo, Object obj) {
        NotePlaceholderEntity notePlaceholderEntity = (NotePlaceholderEntity) obj;
        if (notePlaceholderEntity.getId() == null) {
            interfaceC24749OooO0Oo.OooO0oO(1);
        } else {
            interfaceC24749OooO0Oo.o000000O(1, notePlaceholderEntity.getId());
        }
        if (notePlaceholderEntity.getParentId() == null) {
            interfaceC24749OooO0Oo.OooO0oO(2);
        } else {
            interfaceC24749OooO0Oo.o000000O(2, notePlaceholderEntity.getParentId());
        }
        if (notePlaceholderEntity.getTitle() == null) {
            interfaceC24749OooO0Oo.OooO0oO(3);
        } else {
            interfaceC24749OooO0Oo.o000000O(3, notePlaceholderEntity.getTitle());
        }
        interfaceC24749OooO0Oo.OooO0o(4, notePlaceholderEntity.getCreationTime());
        if (notePlaceholderEntity.getFilePath() == null) {
            interfaceC24749OooO0Oo.OooO0oO(5);
        } else {
            interfaceC24749OooO0Oo.o000000O(5, notePlaceholderEntity.getFilePath());
        }
        o00OOOOo o00ooooo2 = this.f125336OooO00o;
        String strUriToString = o00ooooo2.f125340OooO0OO.uriToString(notePlaceholderEntity.getUri());
        if (strUriToString == null) {
            interfaceC24749OooO0Oo.OooO0oO(6);
        } else {
            interfaceC24749OooO0Oo.o000000O(6, strUriToString);
        }
        interfaceC24749OooO0Oo.OooO0o(7, notePlaceholderEntity.getState());
        String strExtraToString = o00ooooo2.f125340OooO0OO.extraToString(notePlaceholderEntity.getExtras());
        if (strExtraToString == null) {
            interfaceC24749OooO0Oo.OooO0oO(8);
        } else {
            interfaceC24749OooO0Oo.o000000O(8, strExtraToString);
        }
        if (notePlaceholderEntity.getId() == null) {
            interfaceC24749OooO0Oo.OooO0oO(9);
        } else {
            interfaceC24749OooO0Oo.o000000O(9, notePlaceholderEntity.getId());
        }
    }
}
