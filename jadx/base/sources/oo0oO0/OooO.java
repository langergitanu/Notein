package oo0oO0;

import OooOOO0.AbstractC20449OooO0Oo;
import com.orion.notein.data.p602db.entity.AiOcrSessionEntity;
import o000ooo.InterfaceC24749OooO0Oo;

/* JADX INFO: loaded from: classes9.dex */
public final class OooO extends AbstractC20449OooO0Oo {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ OooOO0O f124985OooOo0o;

    public OooO(OooOO0O oooOO0O) {
        this.f124985OooOo0o = oooOO0O;
    }

    @Override // OooOOO0.AbstractC20449OooO0Oo
    public final void OooO(InterfaceC24749OooO0Oo interfaceC24749OooO0Oo, Object obj) {
        AiOcrSessionEntity aiOcrSessionEntity = (AiOcrSessionEntity) obj;
        if (aiOcrSessionEntity.getId() == null) {
            interfaceC24749OooO0Oo.OooO0oO(1);
        } else {
            interfaceC24749OooO0Oo.o000000O(1, aiOcrSessionEntity.getId());
        }
        if (aiOcrSessionEntity.getTitle() == null) {
            interfaceC24749OooO0Oo.OooO0oO(2);
        } else {
            interfaceC24749OooO0Oo.o000000O(2, aiOcrSessionEntity.getTitle());
        }
        if (aiOcrSessionEntity.getUserId() == null) {
            interfaceC24749OooO0Oo.OooO0oO(3);
        } else {
            interfaceC24749OooO0Oo.o000000O(3, aiOcrSessionEntity.getUserId());
        }
        String strChildrenToString = this.f124985OooOo0o.f125000OooO0OO.childrenToString(aiOcrSessionEntity.getPageIds());
        if (strChildrenToString == null) {
            interfaceC24749OooO0Oo.OooO0oO(4);
        } else {
            interfaceC24749OooO0Oo.o000000O(4, strChildrenToString);
        }
        if (aiOcrSessionEntity.getInputSourceJson() == null) {
            interfaceC24749OooO0Oo.OooO0oO(5);
        } else {
            interfaceC24749OooO0Oo.o000000O(5, aiOcrSessionEntity.getInputSourceJson());
        }
        interfaceC24749OooO0Oo.OooO0o(6, aiOcrSessionEntity.getCreationTime());
        interfaceC24749OooO0Oo.OooO0o(7, aiOcrSessionEntity.getLastModificationTime());
    }

    @Override // OooOOO0.AbstractC20449OooO0Oo
    public final String OooOO0o() {
        return "INSERT OR REPLACE INTO `AiOcrSessionEntity` (`id`,`title`,`user_id`,`page_ids`,`input_source_json`,`creation_time`,`last_modification_time`) VALUES (?,?,?,?,?,?,?)";
    }
}
