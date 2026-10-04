package oo0oO0;

import OooOOO0.AbstractC20449OooO0Oo;
import com.orion.notein.data.p602db.entity.StrokeEntity;
import o000ooo.InterfaceC24749OooO0Oo;

/* JADX INFO: loaded from: classes9.dex */
public final class o0O00OOO extends AbstractC20449OooO0Oo {
    @Override // OooOOO0.AbstractC20449OooO0Oo
    public final void OooO(InterfaceC24749OooO0Oo interfaceC24749OooO0Oo, Object obj) {
        StrokeEntity strokeEntity = (StrokeEntity) obj;
        if (strokeEntity.getId() == null) {
            interfaceC24749OooO0Oo.OooO0oO(1);
        } else {
            interfaceC24749OooO0Oo.o000000O(1, strokeEntity.getId());
        }
        if (strokeEntity.getPageId() == null) {
            interfaceC24749OooO0Oo.OooO0oO(2);
        } else {
            interfaceC24749OooO0Oo.o000000O(2, strokeEntity.getPageId());
        }
        if (strokeEntity.getLayerId() == null) {
            interfaceC24749OooO0Oo.OooO0oO(3);
        } else {
            interfaceC24749OooO0Oo.o000000O(3, strokeEntity.getLayerId());
        }
        interfaceC24749OooO0Oo.OooO0o(4, strokeEntity.getCreationTime());
        if (strokeEntity.getRecordJson() == null) {
            interfaceC24749OooO0Oo.OooO0oO(5);
        } else {
            interfaceC24749OooO0Oo.o000000O(5, strokeEntity.getRecordJson());
        }
        if (strokeEntity.getInkStrokeJson() == null) {
            interfaceC24749OooO0Oo.OooO0oO(6);
        } else {
            interfaceC24749OooO0Oo.o000000O(6, strokeEntity.getInkStrokeJson());
        }
        if (strokeEntity.getInkStrokeBlob() == null) {
            interfaceC24749OooO0Oo.OooO0oO(7);
        } else {
            interfaceC24749OooO0Oo.o0000O0(strokeEntity.getInkStrokeBlob());
        }
        if (strokeEntity.getLeft() == null) {
            interfaceC24749OooO0Oo.OooO0oO(8);
        } else {
            interfaceC24749OooO0Oo.OooOOOO(strokeEntity.getLeft().floatValue(), 8);
        }
        if (strokeEntity.getTop() == null) {
            interfaceC24749OooO0Oo.OooO0oO(9);
        } else {
            interfaceC24749OooO0Oo.OooOOOO(strokeEntity.getTop().floatValue(), 9);
        }
        if (strokeEntity.getRight() == null) {
            interfaceC24749OooO0Oo.OooO0oO(10);
        } else {
            interfaceC24749OooO0Oo.OooOOOO(strokeEntity.getRight().floatValue(), 10);
        }
        if (strokeEntity.getBottom() == null) {
            interfaceC24749OooO0Oo.OooO0oO(11);
        } else {
            interfaceC24749OooO0Oo.OooOOOO(strokeEntity.getBottom().floatValue(), 11);
        }
    }

    @Override // OooOOO0.AbstractC20449OooO0Oo
    public final String OooOO0o() {
        return "INSERT OR REPLACE INTO `StrokeEntity` (`id`,`page_id`,`layer_id`,`creation_time`,`record_json`,`ink_stroke_json`,`ink_stroke_blob`,`left`,`top`,`right`,`bottom`) VALUES (?,?,?,?,?,?,?,?,?,?,?)";
    }
}
