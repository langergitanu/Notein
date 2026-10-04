package oo0oO0;

import OooOOO0.AbstractC20449OooO0Oo;
import com.orion.notein.data.p602db.entity.PageLayerEntity;
import o000ooo.InterfaceC24749OooO0Oo;

/* JADX INFO: renamed from: oo0oO0.o00oO000, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C34917o00oO000 extends AbstractC20449OooO0Oo {
    @Override // OooOOO0.AbstractC20449OooO0Oo
    public final void OooO(InterfaceC24749OooO0Oo interfaceC24749OooO0Oo, Object obj) {
        PageLayerEntity pageLayerEntity = (PageLayerEntity) obj;
        if (pageLayerEntity.getId() == null) {
            interfaceC24749OooO0Oo.OooO0oO(1);
        } else {
            interfaceC24749OooO0Oo.o000000O(1, pageLayerEntity.getId());
        }
        if (pageLayerEntity.getNoteId() == null) {
            interfaceC24749OooO0Oo.OooO0oO(2);
        } else {
            interfaceC24749OooO0Oo.o000000O(2, pageLayerEntity.getNoteId());
        }
        interfaceC24749OooO0Oo.OooO0o(3, pageLayerEntity.getVisible() ? 1L : 0L);
        if (pageLayerEntity.getExtras() == null) {
            interfaceC24749OooO0Oo.OooO0oO(4);
        } else {
            interfaceC24749OooO0Oo.o000000O(4, pageLayerEntity.getExtras());
        }
        if (pageLayerEntity.getName() == null) {
            interfaceC24749OooO0Oo.OooO0oO(5);
        } else {
            interfaceC24749OooO0Oo.o000000O(5, pageLayerEntity.getName());
        }
    }

    @Override // OooOOO0.AbstractC20449OooO0Oo
    public final String OooOO0o() {
        return "INSERT OR REPLACE INTO `PageLayerEntity` (`id`,`note_id`,`visible`,`extras`,`name`) VALUES (?,?,?,?,?)";
    }
}
