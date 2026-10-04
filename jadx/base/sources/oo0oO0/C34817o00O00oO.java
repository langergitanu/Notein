package oo0oO0;

import Oooo0oo.AbstractC21138OooO0oo;
import com.orion.notein.data.p602db.entity.NoteSortKeyUpdateEntity;
import o000ooo.InterfaceC24749OooO0Oo;

/* JADX INFO: renamed from: oo0oO0.o00O00oO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C34817o00O00oO extends AbstractC21138OooO0oo {
    @Override // Oooo0oo.AbstractC21138OooO0oo
    public final String Oooo() {
        return "UPDATE OR ABORT `FolderEntity` SET `id` = ?,`sort_key` = ? WHERE `id` = ?";
    }

    @Override // Oooo0oo.AbstractC21138OooO0oo
    public final void Oooo0OO(InterfaceC24749OooO0Oo interfaceC24749OooO0Oo, Object obj) {
        NoteSortKeyUpdateEntity noteSortKeyUpdateEntity = (NoteSortKeyUpdateEntity) obj;
        if (noteSortKeyUpdateEntity.getId() == null) {
            interfaceC24749OooO0Oo.OooO0oO(1);
        } else {
            interfaceC24749OooO0Oo.o000000O(1, noteSortKeyUpdateEntity.getId());
        }
        interfaceC24749OooO0Oo.OooO0o(2, noteSortKeyUpdateEntity.getSortKey());
        if (noteSortKeyUpdateEntity.getId() == null) {
            interfaceC24749OooO0Oo.OooO0oO(3);
        } else {
            interfaceC24749OooO0Oo.o000000O(3, noteSortKeyUpdateEntity.getId());
        }
    }
}
