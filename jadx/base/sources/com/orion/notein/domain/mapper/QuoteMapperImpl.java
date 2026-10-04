package com.orion.notein.domain.mapper;

import android.graphics.RectF;
import com.orion.notein.data.p602db.entity.QuoteEntity;
import com.orion.notein.data.p602db.entity.QuoteTextAnnoEntity;
import com.orion.notein.domain.models.page.Quote;
import com.orion.notein.domain.models.page.QuoteTextAnno;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public class QuoteMapperImpl extends QuoteMapper {
    @Override // com.orion.notein.domain.mapper.QuoteMapper
    public QuoteEntity toEntity(Quote quote) {
        if (quote == null) {
            return null;
        }
        int type = quote.getType();
        int bgColor = quote.getBgColor();
        int underlineColor = quote.getUnderlineColor();
        List<RectF> rectList = quote.getRectList();
        ArrayList arrayList = rectList != null ? new ArrayList(rectList) : null;
        List<String> annoItemIdList = quote.getAnnoItemIdList();
        return new QuoteEntity(quote.getId(), quote.getPageId(), type, 0, bgColor, underlineColor, quote.getLabelRect(), arrayList, quote.getText(), annoItemIdList != null ? new ArrayList(annoItemIdList) : null, quote.getLinkType(), quote.getLinkId(), quote.getLayerId(), quote.getCreationTime(), false, false);
    }

    @Override // com.orion.notein.domain.mapper.QuoteMapper
    public Quote toQuote(QuoteEntity quoteEntity) {
        if (quoteEntity == null) {
            return null;
        }
        String layerId = quoteEntity.getLayerId() != null ? quoteEntity.getLayerId() : "default";
        int type = quoteEntity.getType();
        int bgColor = quoteEntity.getBgColor();
        int underlineColor = quoteEntity.getUnderlineColor();
        List<RectF> rectList = quoteEntity.getRectList();
        ArrayList arrayList = rectList != null ? new ArrayList(rectList) : null;
        List<String> annoItemIdList = quoteEntity.getAnnoItemIdList();
        Quote quote = new Quote(quoteEntity.getId(), quoteEntity.getPageId(), type, bgColor, underlineColor, quoteEntity.getLabelRect(), arrayList, quoteEntity.getText(), annoItemIdList != null ? new ArrayList(annoItemIdList) : null, quoteEntity.getLinkType(), quoteEntity.getLinkId(), layerId, quoteEntity.getCreationTime(), false, false);
        fillModel(quoteEntity, quote);
        return quote;
    }

    @Override // com.orion.notein.domain.mapper.QuoteMapper
    public QuoteTextAnno toQuoteTextAnno(QuoteTextAnnoEntity quoteTextAnnoEntity) {
        if (quoteTextAnnoEntity == null) {
            return null;
        }
        return new QuoteTextAnno(quoteTextAnnoEntity.getId(), quoteTextAnnoEntity.getUsername(), quoteTextAnnoEntity.getType(), quoteTextAnnoEntity.getText(), quoteTextAnnoEntity.getCreationTime());
    }

    @Override // com.orion.notein.domain.mapper.QuoteMapper
    public QuoteTextAnnoEntity toQuoteTextAnnoEntity(QuoteTextAnno quoteTextAnno) {
        if (quoteTextAnno == null) {
            return null;
        }
        return new QuoteTextAnnoEntity(quoteTextAnno.getId(), quoteTextAnno.getUsername(), quoteTextAnno.getType(), quoteTextAnno.getText(), quoteTextAnno.getCreationTime(), 0L);
    }
}
