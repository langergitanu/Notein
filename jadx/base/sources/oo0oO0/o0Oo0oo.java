package oo0oO0;

import OooOOO0.AbstractC20449OooO0Oo;
import com.orion.notein.data.p602db.entity.DualLinkRefEntity;
import o000ooo.InterfaceC24749OooO0Oo;

/* JADX INFO: loaded from: classes9.dex */
public final class o0Oo0oo extends AbstractC20449OooO0Oo {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ oo0o0Oo f125643OooOo0o;

    public o0Oo0oo(oo0o0Oo oo0o0oo) {
        this.f125643OooOo0o = oo0o0oo;
    }

    @Override // OooOOO0.AbstractC20449OooO0Oo
    public final void OooO(InterfaceC24749OooO0Oo interfaceC24749OooO0Oo, Object obj) {
        DualLinkRefEntity dualLinkRefEntity = (DualLinkRefEntity) obj;
        if (dualLinkRefEntity.getId() == null) {
            interfaceC24749OooO0Oo.OooO0oO(1);
        } else {
            interfaceC24749OooO0Oo.o000000O(1, dualLinkRefEntity.getId());
        }
        if (dualLinkRefEntity.getNoteId() == null) {
            interfaceC24749OooO0Oo.OooO0oO(2);
        } else {
            interfaceC24749OooO0Oo.o000000O(2, dualLinkRefEntity.getNoteId());
        }
        if (dualLinkRefEntity.getPageId() == null) {
            interfaceC24749OooO0Oo.OooO0oO(3);
        } else {
            interfaceC24749OooO0Oo.o000000O(3, dualLinkRefEntity.getPageId());
        }
        String strRectToString = this.f125643OooOo0o.f125677OooO0OO.rectToString(dualLinkRefEntity.getBounds());
        if (strRectToString == null) {
            interfaceC24749OooO0Oo.OooO0oO(4);
        } else {
            interfaceC24749OooO0Oo.o000000O(4, strRectToString);
        }
        if (dualLinkRefEntity.getItemId() == null) {
            interfaceC24749OooO0Oo.OooO0oO(5);
        } else {
            interfaceC24749OooO0Oo.o000000O(5, dualLinkRefEntity.getItemId());
        }
        if (dualLinkRefEntity.getDualLinkSourceId() == null) {
            interfaceC24749OooO0Oo.OooO0oO(6);
        } else {
            interfaceC24749OooO0Oo.o000000O(6, dualLinkRefEntity.getDualLinkSourceId());
        }
        if (dualLinkRefEntity.getDualLinkSourceNoteId() == null) {
            interfaceC24749OooO0Oo.OooO0oO(7);
        } else {
            interfaceC24749OooO0Oo.o000000O(7, dualLinkRefEntity.getDualLinkSourceNoteId());
        }
        interfaceC24749OooO0Oo.OooO0o(8, dualLinkRefEntity.getCreationTime());
        interfaceC24749OooO0Oo.OooO0o(9, dualLinkRefEntity.getLastModificationTime());
        if (dualLinkRefEntity.getLeft() == null) {
            interfaceC24749OooO0Oo.OooO0oO(10);
        } else {
            interfaceC24749OooO0Oo.OooOOOO(dualLinkRefEntity.getLeft().floatValue(), 10);
        }
        if (dualLinkRefEntity.getTop() == null) {
            interfaceC24749OooO0Oo.OooO0oO(11);
        } else {
            interfaceC24749OooO0Oo.OooOOOO(dualLinkRefEntity.getTop().floatValue(), 11);
        }
        if (dualLinkRefEntity.getRight() == null) {
            interfaceC24749OooO0Oo.OooO0oO(12);
        } else {
            interfaceC24749OooO0Oo.OooOOOO(dualLinkRefEntity.getRight().floatValue(), 12);
        }
        if (dualLinkRefEntity.getBottom() == null) {
            interfaceC24749OooO0Oo.OooO0oO(13);
        } else {
            interfaceC24749OooO0Oo.OooOOOO(dualLinkRefEntity.getBottom().floatValue(), 13);
        }
    }

    @Override // OooOOO0.AbstractC20449OooO0Oo
    public final String OooOO0o() {
        return "INSERT OR REPLACE INTO `DualLinkRefEntity` (`id`,`note_id`,`page_id`,`bounds`,`item_id`,`source_id`,`source_note_id`,`creation_time`,`last_modification_time`,`left`,`top`,`right`,`bottom`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?)";
    }
}
