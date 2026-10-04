package oo0oO0;

import Oooo0oo.AbstractC21138OooO0oo;
import com.orion.notein.data.p602db.entity.AiOcrSessionEntity;
import o000ooo.InterfaceC24749OooO0Oo;

/* JADX INFO: loaded from: classes9.dex */
public final class OooOO0 extends AbstractC21138OooO0oo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ OooOO0O f124997OooO00o;

    public OooOO0(OooOO0O oooOO0O) {
        this.f124997OooO00o = oooOO0O;
    }

    @Override // Oooo0oo.AbstractC21138OooO0oo
    public final String Oooo() {
        return "UPDATE OR ABORT `AiOcrSessionEntity` SET `id` = ?,`title` = ?,`user_id` = ?,`page_ids` = ?,`input_source_json` = ?,`creation_time` = ?,`last_modification_time` = ? WHERE `id` = ?";
    }

    @Override // Oooo0oo.AbstractC21138OooO0oo
    public final void Oooo0OO(InterfaceC24749OooO0Oo interfaceC24749OooO0Oo, Object obj) {
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
        String strChildrenToString = this.f124997OooO00o.f125000OooO0OO.childrenToString(aiOcrSessionEntity.getPageIds());
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
        if (aiOcrSessionEntity.getId() == null) {
            interfaceC24749OooO0Oo.OooO0oO(8);
        } else {
            interfaceC24749OooO0Oo.o000000O(8, aiOcrSessionEntity.getId());
        }
    }
}
