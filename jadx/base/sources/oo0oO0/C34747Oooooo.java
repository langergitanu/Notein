package oo0oO0;

import Oooo0oo.AbstractC21138OooO0oo;
import com.orion.notein.data.p602db.entity.CommentSortKeyUpdateEntity;
import o000ooo.InterfaceC24749OooO0Oo;

/* JADX INFO: renamed from: oo0oO0.Oooooo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C34747Oooooo extends AbstractC21138OooO0oo {
    @Override // Oooo0oo.AbstractC21138OooO0oo
    public final String Oooo() {
        return "UPDATE OR ABORT `CommentEntity` SET `id` = ?,`sort_key` = ? WHERE `id` = ?";
    }

    @Override // Oooo0oo.AbstractC21138OooO0oo
    public final void Oooo0OO(InterfaceC24749OooO0Oo interfaceC24749OooO0Oo, Object obj) {
        CommentSortKeyUpdateEntity commentSortKeyUpdateEntity = (CommentSortKeyUpdateEntity) obj;
        if (commentSortKeyUpdateEntity.getId() == null) {
            interfaceC24749OooO0Oo.OooO0oO(1);
        } else {
            interfaceC24749OooO0Oo.o000000O(1, commentSortKeyUpdateEntity.getId());
        }
        interfaceC24749OooO0Oo.OooO0o(2, commentSortKeyUpdateEntity.getSortKey());
        if (commentSortKeyUpdateEntity.getId() == null) {
            interfaceC24749OooO0Oo.OooO0oO(3);
        } else {
            interfaceC24749OooO0Oo.o000000O(3, commentSortKeyUpdateEntity.getId());
        }
    }
}
