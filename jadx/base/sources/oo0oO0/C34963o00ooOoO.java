package oo0oO0;

import OooOOO0.AbstractC20449OooO0Oo;
import com.orion.notein.data.p602db.entity.QuoteTextAnnoEntity;
import o000ooo.InterfaceC24749OooO0Oo;

/* JADX INFO: renamed from: oo0oO0.o00ooOoO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C34963o00ooOoO extends AbstractC20449OooO0Oo {
    @Override // OooOOO0.AbstractC20449OooO0Oo
    public final void OooO(InterfaceC24749OooO0Oo interfaceC24749OooO0Oo, Object obj) {
        QuoteTextAnnoEntity quoteTextAnnoEntity = (QuoteTextAnnoEntity) obj;
        if (quoteTextAnnoEntity.getId() == null) {
            interfaceC24749OooO0Oo.OooO0oO(1);
        } else {
            interfaceC24749OooO0Oo.o000000O(1, quoteTextAnnoEntity.getId());
        }
        if (quoteTextAnnoEntity.getUsername() == null) {
            interfaceC24749OooO0Oo.OooO0oO(2);
        } else {
            interfaceC24749OooO0Oo.o000000O(2, quoteTextAnnoEntity.getUsername());
        }
        interfaceC24749OooO0Oo.OooO0o(3, quoteTextAnnoEntity.getType());
        if (quoteTextAnnoEntity.getText() == null) {
            interfaceC24749OooO0Oo.OooO0oO(4);
        } else {
            interfaceC24749OooO0Oo.o000000O(4, quoteTextAnnoEntity.getText());
        }
        interfaceC24749OooO0Oo.OooO0o(5, quoteTextAnnoEntity.getCreationTime());
        interfaceC24749OooO0Oo.OooO0o(6, quoteTextAnnoEntity.getLastModifiedTime());
    }

    @Override // OooOOO0.AbstractC20449OooO0Oo
    public final String OooOO0o() {
        return "INSERT OR REPLACE INTO `QuoteTextAnnoEntity` (`id`,`username`,`type`,`text`,`creation_time`,`last_modified_time`) VALUES (?,?,?,?,?,?)";
    }
}
