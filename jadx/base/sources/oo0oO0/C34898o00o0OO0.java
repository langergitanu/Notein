package oo0oO0;

import Oooo0oo.AbstractC21138OooO0oo;
import com.orion.notein.data.p602db.entity.PageConverter;
import o000ooo.InterfaceC24749OooO0Oo;

/* JADX INFO: renamed from: oo0oO0.o00o0OO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C34898o00o0OO0 extends AbstractC21138OooO0oo {
    @Override // Oooo0oo.AbstractC21138OooO0oo
    public final String Oooo() {
        return "UPDATE OR ABORT `PageEntity` SET `id` = ?,`rotation_direction_index` = ? WHERE `id` = ?";
    }

    @Override // Oooo0oo.AbstractC21138OooO0oo
    public final void Oooo0OO(InterfaceC24749OooO0Oo interfaceC24749OooO0Oo, Object obj) {
        PageConverter.PageRotationEntity pageRotationEntity = (PageConverter.PageRotationEntity) obj;
        if (pageRotationEntity.getId() == null) {
            interfaceC24749OooO0Oo.OooO0oO(1);
        } else {
            interfaceC24749OooO0Oo.o000000O(1, pageRotationEntity.getId());
        }
        interfaceC24749OooO0Oo.OooO0o(2, pageRotationEntity.getRotationDirectionIndex());
        if (pageRotationEntity.getId() == null) {
            interfaceC24749OooO0Oo.OooO0oO(3);
        } else {
            interfaceC24749OooO0Oo.o000000O(3, pageRotationEntity.getId());
        }
    }
}
