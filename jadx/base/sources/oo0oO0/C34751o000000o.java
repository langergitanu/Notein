package oo0oO0;

import OooOOO0.AbstractC20449OooO0Oo;
import com.orion.notein.data.p602db.entity.DualLinkSourceEntity;
import o000ooo.InterfaceC24749OooO0Oo;

/* JADX INFO: renamed from: oo0oO0.o000000o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C34751o000000o extends AbstractC20449OooO0Oo {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ o00000 f125111OooOo0o;

    public C34751o000000o(o00000 o00000Var) {
        this.f125111OooOo0o = o00000Var;
    }

    @Override // OooOOO0.AbstractC20449OooO0Oo
    public final void OooO(InterfaceC24749OooO0Oo interfaceC24749OooO0Oo, Object obj) {
        DualLinkSourceEntity dualLinkSourceEntity = (DualLinkSourceEntity) obj;
        if (dualLinkSourceEntity.getId() == null) {
            interfaceC24749OooO0Oo.OooO0oO(1);
        } else {
            interfaceC24749OooO0Oo.o000000O(1, dualLinkSourceEntity.getId());
        }
        if (dualLinkSourceEntity.getNoteId() == null) {
            interfaceC24749OooO0Oo.OooO0oO(2);
        } else {
            interfaceC24749OooO0Oo.o000000O(2, dualLinkSourceEntity.getNoteId());
        }
        if (dualLinkSourceEntity.getPageId() == null) {
            interfaceC24749OooO0Oo.OooO0oO(3);
        } else {
            interfaceC24749OooO0Oo.o000000O(3, dualLinkSourceEntity.getPageId());
        }
        interfaceC24749OooO0Oo.OooO0o(4, dualLinkSourceEntity.getType());
        o00000 o00000Var = this.f125111OooOo0o;
        String strRectToString = o00000Var.f125104OooO0OO.rectToString(dualLinkSourceEntity.getBounds());
        if (strRectToString == null) {
            interfaceC24749OooO0Oo.OooO0oO(5);
        } else {
            interfaceC24749OooO0Oo.o000000O(5, strRectToString);
        }
        String strRectListToString = o00000Var.f125104OooO0OO.rectListToString(dualLinkSourceEntity.getTextBounds());
        if (strRectListToString == null) {
            interfaceC24749OooO0Oo.OooO0oO(6);
        } else {
            interfaceC24749OooO0Oo.o000000O(6, strRectListToString);
        }
        if (dualLinkSourceEntity.getDualLinkRefId() == null) {
            interfaceC24749OooO0Oo.OooO0oO(7);
        } else {
            interfaceC24749OooO0Oo.o000000O(7, dualLinkSourceEntity.getDualLinkRefId());
        }
        if (dualLinkSourceEntity.getDualLinkRefNoteId() == null) {
            interfaceC24749OooO0Oo.OooO0oO(8);
        } else {
            interfaceC24749OooO0Oo.o000000O(8, dualLinkSourceEntity.getDualLinkRefNoteId());
        }
        interfaceC24749OooO0Oo.OooO0o(9, dualLinkSourceEntity.getCreationTime());
        interfaceC24749OooO0Oo.OooO0o(10, dualLinkSourceEntity.getLastModificationTime());
        if (dualLinkSourceEntity.getLeft() == null) {
            interfaceC24749OooO0Oo.OooO0oO(11);
        } else {
            interfaceC24749OooO0Oo.OooOOOO(dualLinkSourceEntity.getLeft().floatValue(), 11);
        }
        if (dualLinkSourceEntity.getTop() == null) {
            interfaceC24749OooO0Oo.OooO0oO(12);
        } else {
            interfaceC24749OooO0Oo.OooOOOO(dualLinkSourceEntity.getTop().floatValue(), 12);
        }
        if (dualLinkSourceEntity.getRight() == null) {
            interfaceC24749OooO0Oo.OooO0oO(13);
        } else {
            interfaceC24749OooO0Oo.OooOOOO(dualLinkSourceEntity.getRight().floatValue(), 13);
        }
        if (dualLinkSourceEntity.getBottom() == null) {
            interfaceC24749OooO0Oo.OooO0oO(14);
        } else {
            interfaceC24749OooO0Oo.OooOOOO(dualLinkSourceEntity.getBottom().floatValue(), 14);
        }
    }

    @Override // OooOOO0.AbstractC20449OooO0Oo
    public final String OooOO0o() {
        return "INSERT OR REPLACE INTO `DualLinkSourceEntity` (`id`,`note_id`,`page_id`,`type`,`bounds`,`text_bounds`,`ref_id`,`ref_note_id`,`creation_time`,`last_modification_time`,`left`,`top`,`right`,`bottom`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
    }
}
