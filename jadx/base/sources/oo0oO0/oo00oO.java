package oo0oO0;

import Oooo0oo.AbstractC21138OooO0oo;
import com.orion.notein.data.p602db.entity.OutlineUpdateQuoteEntity;
import o000ooo.InterfaceC24749OooO0Oo;

/* JADX INFO: loaded from: classes9.dex */
public final class oo00oO extends AbstractC21138OooO0oo {
    @Override // Oooo0oo.AbstractC21138OooO0oo
    public final String Oooo() {
        return "UPDATE OR ABORT `OutlineEntity` SET `id` = ?,`quote_id` = ? WHERE `id` = ?";
    }

    @Override // Oooo0oo.AbstractC21138OooO0oo
    public final void Oooo0OO(InterfaceC24749OooO0Oo interfaceC24749OooO0Oo, Object obj) {
        OutlineUpdateQuoteEntity outlineUpdateQuoteEntity = (OutlineUpdateQuoteEntity) obj;
        if (outlineUpdateQuoteEntity.getId() == null) {
            interfaceC24749OooO0Oo.OooO0oO(1);
        } else {
            interfaceC24749OooO0Oo.o000000O(1, outlineUpdateQuoteEntity.getId());
        }
        if (outlineUpdateQuoteEntity.getQuoteId() == null) {
            interfaceC24749OooO0Oo.OooO0oO(2);
        } else {
            interfaceC24749OooO0Oo.o000000O(2, outlineUpdateQuoteEntity.getQuoteId());
        }
        if (outlineUpdateQuoteEntity.getId() == null) {
            interfaceC24749OooO0Oo.OooO0oO(3);
        } else {
            interfaceC24749OooO0Oo.o000000O(3, outlineUpdateQuoteEntity.getId());
        }
    }
}
