package oo0oO0;

import Oooo0oo.AbstractC21138OooO0oo;
import com.orion.notein.data.p602db.entity.MergingLayerItemEntity;
import o000ooo.InterfaceC24749OooO0Oo;

/* JADX INFO: loaded from: classes9.dex */
public final class o0oOOo extends AbstractC21138OooO0oo {
    @Override // Oooo0oo.AbstractC21138OooO0oo
    public final String Oooo() {
        return "UPDATE OR ABORT `TextBoxEntity` SET `id` = ?,`layer_id` = ?,`creation_time` = ? WHERE `id` = ?";
    }

    @Override // Oooo0oo.AbstractC21138OooO0oo
    public final void Oooo0OO(InterfaceC24749OooO0Oo interfaceC24749OooO0Oo, Object obj) {
        MergingLayerItemEntity mergingLayerItemEntity = (MergingLayerItemEntity) obj;
        if (mergingLayerItemEntity.getId() == null) {
            interfaceC24749OooO0Oo.OooO0oO(1);
        } else {
            interfaceC24749OooO0Oo.o000000O(1, mergingLayerItemEntity.getId());
        }
        if (mergingLayerItemEntity.getLayerId() == null) {
            interfaceC24749OooO0Oo.OooO0oO(2);
        } else {
            interfaceC24749OooO0Oo.o000000O(2, mergingLayerItemEntity.getLayerId());
        }
        interfaceC24749OooO0Oo.OooO0o(3, mergingLayerItemEntity.getCreationTime());
        if (mergingLayerItemEntity.getId() == null) {
            interfaceC24749OooO0Oo.OooO0oO(4);
        } else {
            interfaceC24749OooO0Oo.o000000O(4, mergingLayerItemEntity.getId());
        }
    }
}
