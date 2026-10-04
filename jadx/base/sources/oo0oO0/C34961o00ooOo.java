package oo0oO0;

import OooOOO0.AbstractC20449OooO0Oo;
import android.graphics.RectF;
import com.orion.notein.data.p602db.entity.QuoteConverter;
import com.orion.notein.data.p602db.entity.QuoteEntity;
import java.util.List;
import o000ooo.InterfaceC24749OooO0Oo;

/* JADX INFO: renamed from: oo0oO0.o00ooOo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C34961o00ooOo extends AbstractC20449OooO0Oo {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ C34964o00ooOoo f125571OooOo0o;

    public C34961o00ooOo(C34964o00ooOoo c34964o00ooOoo) {
        this.f125571OooOo0o = c34964o00ooOoo;
    }

    @Override // OooOOO0.AbstractC20449OooO0Oo
    public final void OooO(InterfaceC24749OooO0Oo interfaceC24749OooO0Oo, Object obj) {
        QuoteEntity quoteEntity = (QuoteEntity) obj;
        if (quoteEntity.getId() == null) {
            interfaceC24749OooO0Oo.OooO0oO(1);
        } else {
            interfaceC24749OooO0Oo.o000000O(1, quoteEntity.getId());
        }
        if (quoteEntity.getPageId() == null) {
            interfaceC24749OooO0Oo.OooO0oO(2);
        } else {
            interfaceC24749OooO0Oo.o000000O(2, quoteEntity.getPageId());
        }
        interfaceC24749OooO0Oo.OooO0o(3, quoteEntity.getType());
        interfaceC24749OooO0Oo.OooO0o(4, quoteEntity.getColor());
        interfaceC24749OooO0Oo.OooO0o(5, quoteEntity.getBgColor());
        interfaceC24749OooO0Oo.OooO0o(6, quoteEntity.getUnderlineColor());
        C34964o00ooOoo c34964o00ooOoo = this.f125571OooOo0o;
        String strLabelRectToString = c34964o00ooOoo.f125575OooO0OO.labelRectToString(quoteEntity.getLabelRect());
        if (strLabelRectToString == null) {
            interfaceC24749OooO0Oo.OooO0oO(7);
        } else {
            interfaceC24749OooO0Oo.o000000O(7, strLabelRectToString);
        }
        List<RectF> rectList = quoteEntity.getRectList();
        QuoteConverter quoteConverter = c34964o00ooOoo.f125575OooO0OO;
        String strRectListToString = quoteConverter.rectListToString(rectList);
        if (strRectListToString == null) {
            interfaceC24749OooO0Oo.OooO0oO(8);
        } else {
            interfaceC24749OooO0Oo.o000000O(8, strRectListToString);
        }
        if (quoteEntity.getText() == null) {
            interfaceC24749OooO0Oo.OooO0oO(9);
        } else {
            interfaceC24749OooO0Oo.o000000O(9, quoteEntity.getText());
        }
        String strAnnoItemIdListToString = quoteConverter.annoItemIdListToString(quoteEntity.getAnnoItemIdList());
        if (strAnnoItemIdListToString == null) {
            interfaceC24749OooO0Oo.OooO0oO(10);
        } else {
            interfaceC24749OooO0Oo.o000000O(10, strAnnoItemIdListToString);
        }
        interfaceC24749OooO0Oo.OooO0o(11, quoteEntity.getLinkType());
        if (quoteEntity.getLinkId() == null) {
            interfaceC24749OooO0Oo.OooO0oO(12);
        } else {
            interfaceC24749OooO0Oo.o000000O(12, quoteEntity.getLinkId());
        }
        if (quoteEntity.getLayerId() == null) {
            interfaceC24749OooO0Oo.OooO0oO(13);
        } else {
            interfaceC24749OooO0Oo.o000000O(13, quoteEntity.getLayerId());
        }
        interfaceC24749OooO0Oo.OooO0o(14, quoteEntity.getCreationTime());
        interfaceC24749OooO0Oo.OooO0o(15, quoteEntity.isVerticalPdfText() ? 1L : 0L);
        interfaceC24749OooO0Oo.OooO0o(16, quoteEntity.isRtlOrBttPdfText() ? 1L : 0L);
    }

    @Override // OooOOO0.AbstractC20449OooO0Oo
    public final String OooOO0o() {
        return "INSERT OR REPLACE INTO `QuoteEntity` (`id`,`page_id`,`type`,`color`,`bg_color`,`underline_color`,`label_rect`,`rect_list`,`text`,`anno_item_id_list`,`link_type`,`link_id`,`layer_id`,`creation_time`,`is_vertical_pdf_text`,`is_rtl_or_btt_pdf_text`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
    }
}
