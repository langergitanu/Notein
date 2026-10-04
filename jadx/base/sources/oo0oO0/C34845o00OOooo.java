package oo0oO0;

import OooOOO0.AbstractC20449OooO0Oo;
import com.orion.notein.data.p602db.entity.NoteinAiQuotaRecordEntityV2;
import o000ooo.InterfaceC24749OooO0Oo;

/* JADX INFO: renamed from: oo0oO0.o00OOooo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C34845o00OOooo extends AbstractC20449OooO0Oo {
    @Override // OooOOO0.AbstractC20449OooO0Oo
    public final void OooO(InterfaceC24749OooO0Oo interfaceC24749OooO0Oo, Object obj) {
        NoteinAiQuotaRecordEntityV2 noteinAiQuotaRecordEntityV2 = (NoteinAiQuotaRecordEntityV2) obj;
        if (noteinAiQuotaRecordEntityV2.getId() == null) {
            interfaceC24749OooO0Oo.OooO0oO(1);
        } else {
            interfaceC24749OooO0Oo.o000000O(1, noteinAiQuotaRecordEntityV2.getId());
        }
        if (noteinAiQuotaRecordEntityV2.getUserId() == null) {
            interfaceC24749OooO0Oo.OooO0oO(2);
        } else {
            interfaceC24749OooO0Oo.o000000O(2, noteinAiQuotaRecordEntityV2.getUserId());
        }
        interfaceC24749OooO0Oo.OooO0o(3, noteinAiQuotaRecordEntityV2.getAmount());
        if (noteinAiQuotaRecordEntityV2.getSourceType() == null) {
            interfaceC24749OooO0Oo.OooO0oO(4);
        } else {
            interfaceC24749OooO0Oo.o000000O(4, noteinAiQuotaRecordEntityV2.getSourceType());
        }
        if (noteinAiQuotaRecordEntityV2.getLinkPurchaseToken() == null) {
            interfaceC24749OooO0Oo.OooO0oO(5);
        } else {
            interfaceC24749OooO0Oo.o000000O(5, noteinAiQuotaRecordEntityV2.getLinkPurchaseToken());
        }
        if (noteinAiQuotaRecordEntityV2.getUsageMetadataJson() == null) {
            interfaceC24749OooO0Oo.OooO0oO(6);
        } else {
            interfaceC24749OooO0Oo.o000000O(6, noteinAiQuotaRecordEntityV2.getUsageMetadataJson());
        }
        interfaceC24749OooO0Oo.OooO0o(7, noteinAiQuotaRecordEntityV2.getCreatedAt());
    }

    @Override // OooOOO0.AbstractC20449OooO0Oo
    public final String OooOO0o() {
        return "INSERT OR REPLACE INTO `NoteinAiQuotaRecordEntityV2` (`id`,`user_id`,`amount`,`source_type`,`link_purchase_token`,`usage_metadata_json`,`created_at`) VALUES (?,?,?,?,?,?,?)";
    }
}
