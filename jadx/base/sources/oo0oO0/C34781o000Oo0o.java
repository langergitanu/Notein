package oo0oO0;

import OooOOO0.AbstractC20449OooO0Oo;
import com.orion.notein.data.p602db.entity.ItemLabelCrossRef;
import o000ooo.InterfaceC24749OooO0Oo;

/* JADX INFO: renamed from: oo0oO0.o000Oo0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C34781o000Oo0o extends AbstractC20449OooO0Oo {
    @Override // OooOOO0.AbstractC20449OooO0Oo
    public final void OooO(InterfaceC24749OooO0Oo interfaceC24749OooO0Oo, Object obj) {
        ItemLabelCrossRef itemLabelCrossRef = (ItemLabelCrossRef) obj;
        interfaceC24749OooO0Oo.OooO0o(1, itemLabelCrossRef.getLabelId());
        interfaceC24749OooO0Oo.OooO0o(2, itemLabelCrossRef.getItemType());
        if (itemLabelCrossRef.getItemId() == null) {
            interfaceC24749OooO0Oo.OooO0oO(3);
        } else {
            interfaceC24749OooO0Oo.o000000O(3, itemLabelCrossRef.getItemId());
        }
        if (itemLabelCrossRef.getExtraInfo() == null) {
            interfaceC24749OooO0Oo.OooO0oO(4);
        } else {
            interfaceC24749OooO0Oo.o000000O(4, itemLabelCrossRef.getExtraInfo());
        }
        interfaceC24749OooO0Oo.OooO0o(5, itemLabelCrossRef.getCreatedTime());
        interfaceC24749OooO0Oo.OooO0o(6, itemLabelCrossRef.getModifiedTime());
    }

    @Override // OooOOO0.AbstractC20449OooO0Oo
    public final String OooOO0o() {
        return "INSERT OR REPLACE INTO `item_label_cross_ref` (`labelId`,`itemType`,`itemId`,`extraInfo`,`createdTime`,`modifiedTime`) VALUES (?,?,?,?,?,?)";
    }
}
