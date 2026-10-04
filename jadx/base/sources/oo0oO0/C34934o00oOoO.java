package oo0oO0;

import OooOOO0.AbstractC20449OooO0Oo;
import com.orion.notein.data.p602db.entity.PdfInfoEntity;
import o000ooo.InterfaceC24749OooO0Oo;

/* JADX INFO: renamed from: oo0oO0.o00oOoO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C34934o00oOoO extends AbstractC20449OooO0Oo {
    @Override // OooOOO0.AbstractC20449OooO0Oo
    public final void OooO(InterfaceC24749OooO0Oo interfaceC24749OooO0Oo, Object obj) {
        PdfInfoEntity pdfInfoEntity = (PdfInfoEntity) obj;
        if (pdfInfoEntity.getId() == null) {
            interfaceC24749OooO0Oo.OooO0oO(1);
        } else {
            interfaceC24749OooO0Oo.o000000O(1, pdfInfoEntity.getId());
        }
        if (pdfInfoEntity.getPdfPath() == null) {
            interfaceC24749OooO0Oo.OooO0oO(2);
        } else {
            interfaceC24749OooO0Oo.o000000O(2, pdfInfoEntity.getPdfPath());
        }
        if (pdfInfoEntity.getTnPath() == null) {
            interfaceC24749OooO0Oo.OooO0oO(3);
        } else {
            interfaceC24749OooO0Oo.o000000O(3, pdfInfoEntity.getTnPath());
        }
        if (pdfInfoEntity.getPassword() == null) {
            interfaceC24749OooO0Oo.OooO0oO(4);
        } else {
            interfaceC24749OooO0Oo.o000000O(4, pdfInfoEntity.getPassword());
        }
    }

    @Override // OooOOO0.AbstractC20449OooO0Oo
    public final String OooOO0o() {
        return "INSERT OR REPLACE INTO `PdfInfoEntity` (`id`,`pdf_path`,`tn_path`,`password`) VALUES (?,?,?,?)";
    }
}
