package oo0oO0;

import Oooo0oo.AbstractC21138OooO0oo;
import com.orion.notein.data.p602db.entity.AiOcrTextPageEntity;
import o000ooo.InterfaceC24749OooO0Oo;

/* JADX INFO: renamed from: oo0oO0.OooOOo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C34710OooOOo extends AbstractC21138OooO0oo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ C34712OooOOoo f125012OooO00o;

    public C34710OooOOo(C34712OooOOoo c34712OooOOoo) {
        this.f125012OooO00o = c34712OooOOoo;
    }

    @Override // Oooo0oo.AbstractC21138OooO0oo
    public final String Oooo() {
        return "UPDATE OR ABORT `AiOcrTextPageEntity` SET `id` = ?,`source_type` = ?,`source_uri` = ?,`content` = ?,`creation_time` = ?,`last_modification_time` = ?,`extras` = ? WHERE `id` = ?";
    }

    @Override // Oooo0oo.AbstractC21138OooO0oo
    public final void Oooo0OO(InterfaceC24749OooO0Oo interfaceC24749OooO0Oo, Object obj) {
        AiOcrTextPageEntity aiOcrTextPageEntity = (AiOcrTextPageEntity) obj;
        if (aiOcrTextPageEntity.getId() == null) {
            interfaceC24749OooO0Oo.OooO0oO(1);
        } else {
            interfaceC24749OooO0Oo.o000000O(1, aiOcrTextPageEntity.getId());
        }
        interfaceC24749OooO0Oo.OooO0o(2, aiOcrTextPageEntity.getSourceType());
        if (aiOcrTextPageEntity.getSourceUri() == null) {
            interfaceC24749OooO0Oo.OooO0oO(3);
        } else {
            interfaceC24749OooO0Oo.o000000O(3, aiOcrTextPageEntity.getSourceUri());
        }
        if (aiOcrTextPageEntity.getContent() == null) {
            interfaceC24749OooO0Oo.OooO0oO(4);
        } else {
            interfaceC24749OooO0Oo.o000000O(4, aiOcrTextPageEntity.getContent());
        }
        interfaceC24749OooO0Oo.OooO0o(5, aiOcrTextPageEntity.getCreationTime());
        interfaceC24749OooO0Oo.OooO0o(6, aiOcrTextPageEntity.getLastModificationTime());
        String strBundleToString = this.f125012OooO00o.f125016OooO0OO.bundleToString(aiOcrTextPageEntity.getExtras());
        if (strBundleToString == null) {
            interfaceC24749OooO0Oo.OooO0oO(7);
        } else {
            interfaceC24749OooO0Oo.o000000O(7, strBundleToString);
        }
        if (aiOcrTextPageEntity.getId() == null) {
            interfaceC24749OooO0Oo.OooO0oO(8);
        } else {
            interfaceC24749OooO0Oo.o000000O(8, aiOcrTextPageEntity.getId());
        }
    }
}
