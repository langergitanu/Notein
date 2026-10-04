package oo0oO0;

import Oooo0oo.AbstractC21138OooO0oo;
import com.orion.notein.data.p602db.entity.CommentEntity;
import o000ooo.InterfaceC24749OooO0Oo;

/* JADX INFO: renamed from: oo0oO0.Oooooo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C34748Oooooo0 extends AbstractC21138OooO0oo {
    @Override // Oooo0oo.AbstractC21138OooO0oo
    public final String Oooo() {
        return "UPDATE OR ABORT `CommentEntity` SET `id` = ?,`title` = ?,`page_id` = ?,`note_id` = ?,`quote_id` = ?,`creation_time` = ?,`last_modification_time` = ?,`sort_key` = ? WHERE `id` = ?";
    }

    @Override // Oooo0oo.AbstractC21138OooO0oo
    public final void Oooo0OO(InterfaceC24749OooO0Oo interfaceC24749OooO0Oo, Object obj) {
        CommentEntity commentEntity = (CommentEntity) obj;
        if (commentEntity.getId() == null) {
            interfaceC24749OooO0Oo.OooO0oO(1);
        } else {
            interfaceC24749OooO0Oo.o000000O(1, commentEntity.getId());
        }
        if (commentEntity.getTitle() == null) {
            interfaceC24749OooO0Oo.OooO0oO(2);
        } else {
            interfaceC24749OooO0Oo.o000000O(2, commentEntity.getTitle());
        }
        if (commentEntity.getPageId() == null) {
            interfaceC24749OooO0Oo.OooO0oO(3);
        } else {
            interfaceC24749OooO0Oo.o000000O(3, commentEntity.getPageId());
        }
        if (commentEntity.getNoteId() == null) {
            interfaceC24749OooO0Oo.OooO0oO(4);
        } else {
            interfaceC24749OooO0Oo.o000000O(4, commentEntity.getNoteId());
        }
        if (commentEntity.getQuoteId() == null) {
            interfaceC24749OooO0Oo.OooO0oO(5);
        } else {
            interfaceC24749OooO0Oo.o000000O(5, commentEntity.getQuoteId());
        }
        interfaceC24749OooO0Oo.OooO0o(6, commentEntity.getCreationTime());
        interfaceC24749OooO0Oo.OooO0o(7, commentEntity.getLastModificationTime());
        if (commentEntity.getSortKey() == null) {
            interfaceC24749OooO0Oo.OooO0oO(8);
        } else {
            interfaceC24749OooO0Oo.OooO0o(8, commentEntity.getSortKey().intValue());
        }
        if (commentEntity.getId() == null) {
            interfaceC24749OooO0Oo.OooO0oO(9);
        } else {
            interfaceC24749OooO0Oo.o000000O(9, commentEntity.getId());
        }
    }
}
