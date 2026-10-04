package oo0oO0;

import OooOOO0.AbstractC20449OooO0Oo;
import com.orion.notein.data.p602db.entity.NotePlaceholderEntity;
import o000ooo.InterfaceC24749OooO0Oo;

/* JADX INFO: loaded from: classes9.dex */
public final class o00OOOO0 extends AbstractC20449OooO0Oo {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ o00OOOOo f125337OooOo0o;

    public o00OOOO0(o00OOOOo o00ooooo2) {
        this.f125337OooOo0o = o00ooooo2;
    }

    @Override // OooOOO0.AbstractC20449OooO0Oo
    public final void OooO(InterfaceC24749OooO0Oo interfaceC24749OooO0Oo, Object obj) {
        NotePlaceholderEntity notePlaceholderEntity = (NotePlaceholderEntity) obj;
        if (notePlaceholderEntity.getId() == null) {
            interfaceC24749OooO0Oo.OooO0oO(1);
        } else {
            interfaceC24749OooO0Oo.o000000O(1, notePlaceholderEntity.getId());
        }
        if (notePlaceholderEntity.getParentId() == null) {
            interfaceC24749OooO0Oo.OooO0oO(2);
        } else {
            interfaceC24749OooO0Oo.o000000O(2, notePlaceholderEntity.getParentId());
        }
        if (notePlaceholderEntity.getTitle() == null) {
            interfaceC24749OooO0Oo.OooO0oO(3);
        } else {
            interfaceC24749OooO0Oo.o000000O(3, notePlaceholderEntity.getTitle());
        }
        interfaceC24749OooO0Oo.OooO0o(4, notePlaceholderEntity.getCreationTime());
        if (notePlaceholderEntity.getFilePath() == null) {
            interfaceC24749OooO0Oo.OooO0oO(5);
        } else {
            interfaceC24749OooO0Oo.o000000O(5, notePlaceholderEntity.getFilePath());
        }
        o00OOOOo o00ooooo2 = this.f125337OooOo0o;
        String strUriToString = o00ooooo2.f125340OooO0OO.uriToString(notePlaceholderEntity.getUri());
        if (strUriToString == null) {
            interfaceC24749OooO0Oo.OooO0oO(6);
        } else {
            interfaceC24749OooO0Oo.o000000O(6, strUriToString);
        }
        interfaceC24749OooO0Oo.OooO0o(7, notePlaceholderEntity.getState());
        String strExtraToString = o00ooooo2.f125340OooO0OO.extraToString(notePlaceholderEntity.getExtras());
        if (strExtraToString == null) {
            interfaceC24749OooO0Oo.OooO0oO(8);
        } else {
            interfaceC24749OooO0Oo.o000000O(8, strExtraToString);
        }
    }

    @Override // OooOOO0.AbstractC20449OooO0Oo
    public final String OooOO0o() {
        return "INSERT OR REPLACE INTO `NotePlaceholderEntity` (`id`,`parent_id`,`title`,`creation_time`,`file_path`,`uri`,`state`,`extras`) VALUES (?,?,?,?,?,?,?,?)";
    }
}
