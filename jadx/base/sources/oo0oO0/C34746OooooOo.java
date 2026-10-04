package oo0oO0;

import OooOOO0.AbstractC20449OooO0Oo;
import com.orion.notein.data.p602db.entity.CommentEntity;
import o000ooo.InterfaceC24749OooO0Oo;

/* JADX INFO: renamed from: oo0oO0.OooooOo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C34746OooooOo extends AbstractC20449OooO0Oo {
    @Override // OooOOO0.AbstractC20449OooO0Oo
    public final void OooO(InterfaceC24749OooO0Oo interfaceC24749OooO0Oo, Object obj) {
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
    }

    @Override // OooOOO0.AbstractC20449OooO0Oo
    public final String OooOO0o() {
        return "INSERT OR REPLACE INTO `CommentEntity` (`id`,`title`,`page_id`,`note_id`,`quote_id`,`creation_time`,`last_modification_time`,`sort_key`) VALUES (?,?,?,?,?,?,?,?)";
    }
}
