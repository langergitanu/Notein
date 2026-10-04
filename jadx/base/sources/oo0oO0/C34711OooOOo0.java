package oo0oO0;

import OooOOO0.AbstractC20449OooO0Oo;
import com.orion.notein.data.p602db.entity.AiOcrTextPageEntity;
import o000ooo.InterfaceC24749OooO0Oo;

/* JADX INFO: renamed from: oo0oO0.OooOOo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C34711OooOOo0 extends AbstractC20449OooO0Oo {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ C34712OooOOoo f125013OooOo0o;

    public C34711OooOOo0(C34712OooOOoo c34712OooOOoo) {
        this.f125013OooOo0o = c34712OooOOoo;
    }

    @Override // OooOOO0.AbstractC20449OooO0Oo
    public final void OooO(InterfaceC24749OooO0Oo interfaceC24749OooO0Oo, Object obj) {
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
        String strBundleToString = this.f125013OooOo0o.f125016OooO0OO.bundleToString(aiOcrTextPageEntity.getExtras());
        if (strBundleToString == null) {
            interfaceC24749OooO0Oo.OooO0oO(7);
        } else {
            interfaceC24749OooO0Oo.o000000O(7, strBundleToString);
        }
    }

    @Override // OooOOO0.AbstractC20449OooO0Oo
    public final String OooOO0o() {
        return "INSERT OR REPLACE INTO `AiOcrTextPageEntity` (`id`,`source_type`,`source_uri`,`content`,`creation_time`,`last_modification_time`,`extras`) VALUES (?,?,?,?,?,?,?)";
    }
}
