package oo0oO0;

import OooOOO0.AbstractC20449OooO0Oo;
import com.orion.notein.data.p602db.entity.OutlineEntity;
import o000ooo.InterfaceC24749OooO0Oo;

/* JADX INFO: renamed from: oo0oO0.o00o000O, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C34885o00o000O extends AbstractC20449OooO0Oo {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ C34882o00o00 f125417OooOo0o;

    public C34885o00o000O(C34882o00o00 c34882o00o00) {
        this.f125417OooOo0o = c34882o00o00;
    }

    @Override // OooOOO0.AbstractC20449OooO0Oo
    public final void OooO(InterfaceC24749OooO0Oo interfaceC24749OooO0Oo, Object obj) {
        OutlineEntity outlineEntity = (OutlineEntity) obj;
        if (outlineEntity.getId() == null) {
            interfaceC24749OooO0Oo.OooO0oO(1);
        } else {
            interfaceC24749OooO0Oo.o000000O(1, outlineEntity.getId());
        }
        if (outlineEntity.getTitle() == null) {
            interfaceC24749OooO0Oo.OooO0oO(2);
        } else {
            interfaceC24749OooO0Oo.o000000O(2, outlineEntity.getTitle());
        }
        if (outlineEntity.getParentId() == null) {
            interfaceC24749OooO0Oo.OooO0oO(3);
        } else {
            interfaceC24749OooO0Oo.o000000O(3, outlineEntity.getParentId());
        }
        if (outlineEntity.getPageId() == null) {
            interfaceC24749OooO0Oo.OooO0oO(4);
        } else {
            interfaceC24749OooO0Oo.o000000O(4, outlineEntity.getPageId());
        }
        if (outlineEntity.getNoteId() == null) {
            interfaceC24749OooO0Oo.OooO0oO(5);
        } else {
            interfaceC24749OooO0Oo.o000000O(5, outlineEntity.getNoteId());
        }
        if (outlineEntity.getQuoteId() == null) {
            interfaceC24749OooO0Oo.OooO0oO(6);
        } else {
            interfaceC24749OooO0Oo.o000000O(6, outlineEntity.getQuoteId());
        }
        String strChildrenToString = this.f125417OooOo0o.f125410OooO0OO.childrenToString(outlineEntity.getChildren());
        if (strChildrenToString == null) {
            interfaceC24749OooO0Oo.OooO0oO(7);
        } else {
            interfaceC24749OooO0Oo.o000000O(7, strChildrenToString);
        }
        interfaceC24749OooO0Oo.OooO0o(8, outlineEntity.getCreationTime());
        interfaceC24749OooO0Oo.OooO0o(9, outlineEntity.getLastModificationTime());
    }

    @Override // OooOOO0.AbstractC20449OooO0Oo
    public final String OooOO0o() {
        return "INSERT OR REPLACE INTO `OutlineEntity` (`id`,`title`,`parent_id`,`page_id`,`note_id`,`quote_id`,`children`,`creation_time`,`last_modification_time`) VALUES (?,?,?,?,?,?,?,?,?)";
    }
}
