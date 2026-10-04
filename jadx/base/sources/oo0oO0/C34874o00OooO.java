package oo0oO0;

import Oooo0oo.AbstractC21138OooO0oo;
import com.orion.notein.data.p602db.entity.NoteinMessageEntity;
import o000ooo.InterfaceC24749OooO0Oo;

/* JADX INFO: renamed from: oo0oO0.o00OooO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C34874o00OooO extends AbstractC21138OooO0oo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ C34876o00OooOO f125394OooO00o;

    public C34874o00OooO(C34876o00OooOO c34876o00OooOO) {
        this.f125394OooO00o = c34876o00OooOO;
    }

    @Override // Oooo0oo.AbstractC21138OooO0oo
    public final String Oooo() {
        return "UPDATE OR ABORT `NoteinMessageEntity` SET `id` = ?,`uid` = ?,`title` = ?,`content` = ?,`creation_time` = ?,`type` = ?,`unread` = ? WHERE `id` = ?";
    }

    @Override // Oooo0oo.AbstractC21138OooO0oo
    public final void Oooo0OO(InterfaceC24749OooO0Oo interfaceC24749OooO0Oo, Object obj) {
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
        C34876o00OooOO c34876o00OooOO = this.f125394OooO00o;
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
        if (noteinMessageEntity.getId() == null) {
            interfaceC24749OooO0Oo.OooO0oO(8);
        } else {
            interfaceC24749OooO0Oo.o000000O(8, noteinMessageEntity.getId());
        }
    }
}
