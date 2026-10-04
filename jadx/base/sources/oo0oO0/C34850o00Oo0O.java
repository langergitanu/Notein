package oo0oO0;

import OooOOO0.AbstractC20449OooO0Oo;
import com.orion.notein.data.p602db.entity.NoteinFirebaseUserEntity;
import o000ooo.InterfaceC24749OooO0Oo;

/* JADX INFO: renamed from: oo0oO0.o00Oo0O, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C34850o00Oo0O extends AbstractC20449OooO0Oo {
    @Override // OooOOO0.AbstractC20449OooO0Oo
    public final void OooO(InterfaceC24749OooO0Oo interfaceC24749OooO0Oo, Object obj) {
        NoteinFirebaseUserEntity noteinFirebaseUserEntity = (NoteinFirebaseUserEntity) obj;
        if (noteinFirebaseUserEntity.getId() == null) {
            interfaceC24749OooO0Oo.OooO0oO(1);
        } else {
            interfaceC24749OooO0Oo.o000000O(1, noteinFirebaseUserEntity.getId());
        }
        if (noteinFirebaseUserEntity.getFirebaseUid() == null) {
            interfaceC24749OooO0Oo.OooO0oO(2);
        } else {
            interfaceC24749OooO0Oo.o000000O(2, noteinFirebaseUserEntity.getFirebaseUid());
        }
        if (noteinFirebaseUserEntity.getConcatEmail() == null) {
            interfaceC24749OooO0Oo.OooO0oO(3);
        } else {
            interfaceC24749OooO0Oo.o000000O(3, noteinFirebaseUserEntity.getConcatEmail());
        }
        interfaceC24749OooO0Oo.OooO0o(4, noteinFirebaseUserEntity.getCreationTime());
    }

    @Override // OooOOO0.AbstractC20449OooO0Oo
    public final String OooOO0o() {
        return "INSERT OR REPLACE INTO `NoteinFirebaseUserEntity` (`id`,`firebase_uid`,`concat_email`,`creation_time`) VALUES (?,?,?,?)";
    }
}
