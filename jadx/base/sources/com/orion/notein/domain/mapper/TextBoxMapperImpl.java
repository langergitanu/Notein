package com.orion.notein.domain.mapper;

import com.orion.notein.data.p602db.entity.TextBoxEntity;
import com.orion.notein.domain.models.page.TextBox;

/* JADX INFO: loaded from: classes9.dex */
public class TextBoxMapperImpl extends TextBoxMapper {
    @Override // com.orion.notein.domain.mapper.TextBoxMapper
    public TextBoxEntity toEntity(TextBox textBox) {
        if (textBox == null) {
            return null;
        }
        TextBoxEntity textBoxEntity = new TextBoxEntity(textBox.getId(), textBox.getPageId(), textBox.getText(), textBox.getTextSize(), textBox.getBoxWidth(), textBox.getBoxHeight(), textBox.getLineHeight(), textBox.getBackgroundColor(), null, 0, textBox.getLayerId(), textBox.getDefaultTextColor(), textBox.getCreationTime(), null, null, null, null, null);
        fillEntity(textBox, textBoxEntity);
        return textBoxEntity;
    }

    @Override // com.orion.notein.domain.mapper.TextBoxMapper
    public TextBox toModel(TextBoxEntity textBoxEntity) {
        if (textBoxEntity == null) {
            return null;
        }
        TextBox textBox = new TextBox(textBoxEntity.getId(), textBoxEntity.getPageId(), textBoxEntity.getText(), textBoxEntity.getTextSize(), textBoxEntity.getBoxWidth(), textBoxEntity.getBoxHeight(), null, textBoxEntity.getLineHeight(), textBoxEntity.getBackgroundColor(), textBoxEntity.getLayerId() != null ? textBoxEntity.getLayerId() : "default", textBoxEntity.getCreationTime(), textBoxEntity.getDefaultTextColor(), null);
        fillModel(textBoxEntity, textBox);
        return textBox;
    }
}
