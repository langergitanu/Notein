package oo0oO0;

import Oooo0oo.AbstractC21138OooO0oo;
import com.orion.notein.data.p602db.entity.PageLayerEntity;
import o000ooo.InterfaceC24749OooO0Oo;

/* JADX INFO: renamed from: oo0oO0.o00oO00O, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C34918o00oO00O extends AbstractC21138OooO0oo {
    @Override // Oooo0oo.AbstractC21138OooO0oo
    public final String Oooo() {
        return "DELETE FROM `PageLayerEntity` WHERE `id` = ?";
    }

    @Override // Oooo0oo.AbstractC21138OooO0oo
    public final void Oooo0OO(InterfaceC24749OooO0Oo interfaceC24749OooO0Oo, Object obj) {
        PageLayerEntity pageLayerEntity = (PageLayerEntity) obj;
        if (pageLayerEntity.getId() == null) {
            interfaceC24749OooO0Oo.OooO0oO(1);
        } else {
            interfaceC24749OooO0Oo.o000000O(1, pageLayerEntity.getId());
        }
    }
}
