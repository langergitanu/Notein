package oo0oO0;

import OooOOO0.AbstractC20449OooO0Oo;
import com.orion.notein.data.p602db.entity.NoteinMessageEntity;
import o000ooo.InterfaceC24749OooO0Oo;

/* JADX INFO: renamed from: oo0oO0.o00OooO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C34875o00OooO0 extends AbstractC20449OooO0Oo {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ C34876o00OooOO f125395OooOo0o;

    public C34875o00OooO0(C34876o00OooOO c34876o00OooOO) {
        this.f125395OooOo0o = c34876o00OooOO;
    }

    @Override // OooOOO0.AbstractC20449OooO0Oo
    public final void OooO(InterfaceC24749OooO0Oo interfaceC24749OooO0Oo, Object obj) {
        NoteinMessageEntity noteinMessageEntity = (NoteinMessageEntity) obj;
        if (noteinMessageEntity.getId() == null) {
            interfaceC24749OooO0Oo.OooO0oO(1);
        } else {
            interfaceC24749OooO0Oo.o000000O(1, noteinMessageEntity.getId());
        }
        if (noteinMessageEntity.getUid() == null) {
            interfaceC24749OooO0Oo.OooO0oO(2);
        } else {
            interfaceC24749OooO0Oo.o000000O(2, noteinMessageEntity.getUid());
        }
        C34876o00OooOO c34876o00OooOO = this.f125395OooOo0o;
        String strMapToString = c34876o00OooOO.f125398OooO0OO.mapToString(noteinMessageEntity.getTitle());
        if (strMapToString == null) {
            interfaceC24749OooO0Oo.OooO0oO(3);
        } else {
            interfaceC24749OooO0Oo.o000000O(3, strMapToString);
        }
        String strMapToString2 = c34876o00OooOO.f125398OooO0OO.mapToString(noteinMessageEntity.getContent());
        if (strMapToString2 == null) {
            interfaceC24749OooO0Oo.OooO0oO(4);
        } else {
            interfaceC24749OooO0Oo.o000000O(4, strMapToString2);
        }
        if (noteinMessageEntity.getCreationTime() == null) {
            interfaceC24749OooO0Oo.OooO0oO(5);
        } else {
            interfaceC24749OooO0Oo.o000000O(5, noteinMessageEntity.getCreationTime());
        }
        interfaceC24749OooO0Oo.OooO0o(6, noteinMessageEntity.getType());
        interfaceC24749OooO0Oo.OooO0o(7, noteinMessageEntity.getUnread());
    }

    @Override // OooOOO0.AbstractC20449OooO0Oo
    public final String OooOO0o() {
        return "INSERT OR REPLACE INTO `NoteinMessageEntity` (`id`,`uid`,`title`,`content`,`creation_time`,`type`,`unread`) VALUES (?,?,?,?,?,?,?)";
    }
}
