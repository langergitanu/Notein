package oo0oO0;

import OooOOO0.AbstractC20449OooO0Oo;
import com.orion.notein.data.p602db.entity.p603ai.NoteSummaryEntity;
import o000ooo.InterfaceC24749OooO0Oo;

/* JADX INFO: renamed from: oo0oO0.o000oooo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C34814o000oooo extends AbstractC20449OooO0Oo {
    @Override // OooOOO0.AbstractC20449OooO0Oo
    public final void OooO(InterfaceC24749OooO0Oo interfaceC24749OooO0Oo, Object obj) {
        NoteSummaryEntity noteSummaryEntity = (NoteSummaryEntity) obj;
        if (noteSummaryEntity.getId() == null) {
            interfaceC24749OooO0Oo.OooO0oO(1);
        } else {
            interfaceC24749OooO0Oo.o000000O(1, noteSummaryEntity.getId());
        }
        if (noteSummaryEntity.getSummary() == null) {
            interfaceC24749OooO0Oo.OooO0oO(2);
        } else {
            interfaceC24749OooO0Oo.o000000O(2, noteSummaryEntity.getSummary());
        }
    }

    @Override // OooOOO0.AbstractC20449OooO0Oo
    public final String OooOO0o() {
        return "INSERT OR REPLACE INTO `NoteSummaryEntity` (`md5`,`summary`) VALUES (?,?)";
    }
}
