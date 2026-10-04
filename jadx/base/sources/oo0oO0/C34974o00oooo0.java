package oo0oO0;

import OooOOO0.AbstractC20449OooO0Oo;
import com.orion.notein.data.p602db.entity.ShapeEntity;
import o000ooo.InterfaceC24749OooO0Oo;

/* JADX INFO: renamed from: oo0oO0.o00oooo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C34974o00oooo0 extends AbstractC20449OooO0Oo {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ C34973o00oooo f125594OooOo0o;

    public C34974o00oooo0(C34973o00oooo c34973o00oooo) {
        this.f125594OooOo0o = c34973o00oooo;
    }

    @Override // OooOOO0.AbstractC20449OooO0Oo
    public final void OooO(InterfaceC24749OooO0Oo interfaceC24749OooO0Oo, Object obj) {
        ShapeEntity shapeEntity = (ShapeEntity) obj;
        if (shapeEntity.getId() == null) {
            interfaceC24749OooO0Oo.OooO0oO(1);
        } else {
            interfaceC24749OooO0Oo.o000000O(1, shapeEntity.getId());
        }
        if (shapeEntity.getPageId() == null) {
            interfaceC24749OooO0Oo.OooO0oO(2);
        } else {
            interfaceC24749OooO0Oo.o000000O(2, shapeEntity.getPageId());
        }
        interfaceC24749OooO0Oo.OooO0o(3, shapeEntity.getColor());
        interfaceC24749OooO0Oo.OooOOOO(shapeEntity.getWidth(), 4);
        String strPointsToString = this.f125594OooOo0o.f125592OooO0OO.pointsToString(shapeEntity.getPoints());
        if (strPointsToString == null) {
            interfaceC24749OooO0Oo.OooO0oO(5);
        } else {
            interfaceC24749OooO0Oo.o000000O(5, strPointsToString);
        }
        interfaceC24749OooO0Oo.OooO0o(6, shapeEntity.getType());
        interfaceC24749OooO0Oo.OooO0o(7, shapeEntity.getBlendMode());
        if (shapeEntity.getLayerId() == null) {
            interfaceC24749OooO0Oo.OooO0oO(8);
        } else {
            interfaceC24749OooO0Oo.o000000O(8, shapeEntity.getLayerId());
        }
        interfaceC24749OooO0Oo.OooO0o(9, shapeEntity.getTapeLike() ? 1L : 0L);
        interfaceC24749OooO0Oo.OooO0o(10, shapeEntity.getStyle());
        interfaceC24749OooO0Oo.OooO0o(11, shapeEntity.getOpacityOfFillColor());
        interfaceC24749OooO0Oo.OooO0o(12, shapeEntity.getCreationTime());
        if (shapeEntity.getLeft() == null) {
            interfaceC24749OooO0Oo.OooO0oO(13);
        } else {
            interfaceC24749OooO0Oo.OooOOOO(shapeEntity.getLeft().floatValue(), 13);
        }
        if (shapeEntity.getTop() == null) {
            interfaceC24749OooO0Oo.OooO0oO(14);
        } else {
            interfaceC24749OooO0Oo.OooOOOO(shapeEntity.getTop().floatValue(), 14);
        }
        if (shapeEntity.getRight() == null) {
            interfaceC24749OooO0Oo.OooO0oO(15);
        } else {
            interfaceC24749OooO0Oo.OooOOOO(shapeEntity.getRight().floatValue(), 15);
        }
        if (shapeEntity.getBottom() == null) {
            interfaceC24749OooO0Oo.OooO0oO(16);
        } else {
            interfaceC24749OooO0Oo.OooOOOO(shapeEntity.getBottom().floatValue(), 16);
        }
    }

    @Override // OooOOO0.AbstractC20449OooO0Oo
    public final String OooOO0o() {
        return "INSERT OR IGNORE INTO `ShapeEntity` (`id`,`page_id`,`color`,`width`,`points`,`type`,`blend_mode`,`layer_id`,`tape_like`,`style`,`opacity_of_fill_color`,`creation_time`,`left`,`top`,`right`,`bottom`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
    }
}
