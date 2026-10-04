package oo0oO0;

import OooOOO0.AbstractC20449OooO0Oo;
import com.orion.notein.data.p602db.entity.LabelEntity;
import o000ooo.InterfaceC24749OooO0Oo;

/* JADX INFO: renamed from: oo0oO0.o000Oo0O, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C34780o000Oo0O extends AbstractC20449OooO0Oo {
    @Override // OooOOO0.AbstractC20449OooO0Oo
    public final void OooO(InterfaceC24749OooO0Oo interfaceC24749OooO0Oo, Object obj) {
        LabelEntity labelEntity = (LabelEntity) obj;
        interfaceC24749OooO0Oo.OooO0o(1, labelEntity.getId());
        if (labelEntity.getName() == null) {
            interfaceC24749OooO0Oo.OooO0oO(2);
        } else {
            interfaceC24749OooO0Oo.o000000O(2, labelEntity.getName());
        }
        interfaceC24749OooO0Oo.OooO0o(3, labelEntity.getColor());
        interfaceC24749OooO0Oo.OooO0o(4, labelEntity.getCreatedTime());
        interfaceC24749OooO0Oo.OooO0o(5, labelEntity.getModifiedTime());
        interfaceC24749OooO0Oo.OooOOOO(labelEntity.getIndex(), 6);
    }

    @Override // OooOOO0.AbstractC20449OooO0Oo
    public final String OooOO0o() {
        return "INSERT OR REPLACE INTO `labels` (`id`,`name`,`color`,`createdTime`,`modifiedTime`,`index`) VALUES (nullif(?, 0),?,?,?,?,?)";
    }
}
