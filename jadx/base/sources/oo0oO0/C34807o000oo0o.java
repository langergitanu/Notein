package oo0oO0;

import OooOOO0.AbstractC20449OooO0Oo;
import com.orion.notein.data.p602db.entity.MyTemplateEntity;
import o000ooo.InterfaceC24749OooO0Oo;

/* JADX INFO: renamed from: oo0oO0.o000oo0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C34807o000oo0o extends AbstractC20449OooO0Oo {
    @Override // OooOOO0.AbstractC20449OooO0Oo
    public final void OooO(InterfaceC24749OooO0Oo interfaceC24749OooO0Oo, Object obj) {
        MyTemplateEntity myTemplateEntity = (MyTemplateEntity) obj;
        if (myTemplateEntity.getId() == null) {
            interfaceC24749OooO0Oo.OooO0oO(1);
        } else {
            interfaceC24749OooO0Oo.o000000O(1, myTemplateEntity.getId());
        }
        if (myTemplateEntity.getPaperThemeJson() == null) {
            interfaceC24749OooO0Oo.OooO0oO(2);
        } else {
            interfaceC24749OooO0Oo.o000000O(2, myTemplateEntity.getPaperThemeJson());
        }
        if (myTemplateEntity.getPaperSpecJson() == null) {
            interfaceC24749OooO0Oo.OooO0oO(3);
        } else {
            interfaceC24749OooO0Oo.o000000O(3, myTemplateEntity.getPaperSpecJson());
        }
        interfaceC24749OooO0Oo.OooO0o(4, myTemplateEntity.getCreationTime());
        interfaceC24749OooO0Oo.OooO0o(5, myTemplateEntity.getLastModificationTime());
        if (myTemplateEntity.getName() == null) {
            interfaceC24749OooO0Oo.OooO0oO(6);
        } else {
            interfaceC24749OooO0Oo.o000000O(6, myTemplateEntity.getName());
        }
    }

    @Override // OooOOO0.AbstractC20449OooO0Oo
    public final String OooOO0o() {
        return "INSERT OR IGNORE INTO `MyTemplateEntity` (`id`,`paper_theme`,`paper_spec`,`creation_time`,`last_modification_time`,`name`) VALUES (?,?,?,?,?,?)";
    }
}
