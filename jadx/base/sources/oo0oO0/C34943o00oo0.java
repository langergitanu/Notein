package oo0oO0;

import OooOOO0.AbstractC20449OooO0Oo;
import com.orion.notein.data.p602db.entity.cache.PdfTextCacheEntity;
import o000ooo.InterfaceC24749OooO0Oo;

/* JADX INFO: renamed from: oo0oO0.o00oo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C34943o00oo0 extends AbstractC20449OooO0Oo {
    @Override // OooOOO0.AbstractC20449OooO0Oo
    public final void OooO(InterfaceC24749OooO0Oo interfaceC24749OooO0Oo, Object obj) {
        PdfTextCacheEntity pdfTextCacheEntity = (PdfTextCacheEntity) obj;
        if (pdfTextCacheEntity.getPdfFilePath() == null) {
            interfaceC24749OooO0Oo.OooO0oO(1);
        } else {
            interfaceC24749OooO0Oo.o000000O(1, pdfTextCacheEntity.getPdfFilePath());
        }
        if (pdfTextCacheEntity.getPdfFileMd5() == null) {
            interfaceC24749OooO0Oo.OooO0oO(2);
        } else {
            interfaceC24749OooO0Oo.o000000O(2, pdfTextCacheEntity.getPdfFileMd5());
        }
        interfaceC24749OooO0Oo.OooO0o(3, pdfTextCacheEntity.getPdfPageIndex());
        interfaceC24749OooO0Oo.OooO0o(4, pdfTextCacheEntity.getCreationTime());
        if (pdfTextCacheEntity.getText() == null) {
            interfaceC24749OooO0Oo.OooO0oO(5);
        } else {
            interfaceC24749OooO0Oo.o000000O(5, pdfTextCacheEntity.getText());
        }
        if (pdfTextCacheEntity.getElementsJson() == null) {
            interfaceC24749OooO0Oo.OooO0oO(6);
        } else {
            interfaceC24749OooO0Oo.o000000O(6, pdfTextCacheEntity.getElementsJson());
        }
    }

    @Override // OooOOO0.AbstractC20449OooO0Oo
    public final String OooOO0o() {
        return "INSERT OR REPLACE INTO `PdfTextCacheEntity` (`pdf_file_path`,`pdf_file_md5`,`pdf_page_index`,`creation_time`,`text`,`elements_json`) VALUES (?,?,?,?,?,?)";
    }
}
