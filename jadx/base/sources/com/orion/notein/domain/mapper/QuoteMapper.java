package com.orion.notein.domain.mapper;

import com.orion.notein.data.p602db.entity.QuoteEntity;
import com.orion.notein.data.p602db.entity.QuoteTextAnnoEntity;
import com.orion.notein.domain.models.page.Quote;
import com.orion.notein.domain.models.page.QuoteTextAnno;

/* JADX INFO: loaded from: classes9.dex */
public abstract class QuoteMapper {
    public void fillModel(QuoteEntity quoteEntity, Quote quote) {
        int type = quote.getType();
        if (type == 0) {
            quote.setType(4);
            quote.setBgColor(quoteEntity.getColor());
        } else {
            if (type != 1) {
                return;
            }
            quote.setType(4);
            quote.setUnderlineColor(quoteEntity.getColor());
        }
    }

    public abstract QuoteEntity toEntity(Quote quote);

    public abstract Quote toQuote(QuoteEntity quoteEntity);

    public abstract QuoteTextAnno toQuoteTextAnno(QuoteTextAnnoEntity quoteTextAnnoEntity);

    public abstract QuoteTextAnnoEntity toQuoteTextAnnoEntity(QuoteTextAnno quoteTextAnno);
}
