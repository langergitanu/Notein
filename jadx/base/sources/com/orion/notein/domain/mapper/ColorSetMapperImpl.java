package com.orion.notein.domain.mapper;

import com.orion.notein.data.p602db.entity.ColorSetEntity;
import com.orion.notein.domain.models.note.ColorSet;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public class ColorSetMapperImpl implements ColorSetMapper {
    @Override // com.orion.notein.domain.mapper.ColorSetMapper
    public ColorSetEntity toEntity(ColorSet colorSet) {
        if (colorSet == null) {
            return null;
        }
        List<Integer> colors = colorSet.getColors();
        return new ColorSetEntity(colorSet.getId(), colorSet.getName(), colors != null ? new ArrayList(colors) : null, colorSet.getBackgroundColor(), colorSet.getForegroundColor(), colorSet.getType(), colorSet.getCreationTime(), colorSet.getCategory());
    }

    @Override // com.orion.notein.domain.mapper.ColorSetMapper
    public ColorSet toModel(ColorSetEntity colorSetEntity) {
        if (colorSetEntity == null) {
            return null;
        }
        List<Integer> colors = colorSetEntity.getColors();
        return new ColorSet(colorSetEntity.getId(), colorSetEntity.getName(), colors != null ? new ArrayList(colors) : null, colorSetEntity.getBackgroundColor(), colorSetEntity.getForegroundColor(), colorSetEntity.getType(), colorSetEntity.getCreationTime(), colorSetEntity.getCategory());
    }
}
