package com.orion.notein.domain.mapper;

import com.orion.notein.data.p602db.entity.NoteinMessageEntity;
import com.orion.notein.domain.models.message.NoteinMessage;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
public class NoteinMessageMapperImpl extends NoteinMessageMapper {
    @Override // com.orion.notein.domain.mapper.NoteinMessageMapper
    public NoteinMessageEntity toEntity(NoteinMessage noteinMessage) {
        if (noteinMessage == null) {
            return null;
        }
        Map<String, String> title = noteinMessage.getTitle();
        HashMap map = title != null ? new HashMap(title) : null;
        Map<String, String> content = noteinMessage.getContent();
        return new NoteinMessageEntity(noteinMessage.getId(), noteinMessage.getUid(), map, content != null ? new HashMap(content) : null, noteinMessage.getCreationTime(), noteinMessage.getType(), noteinMessage.getUnread());
    }

    @Override // com.orion.notein.domain.mapper.NoteinMessageMapper
    public NoteinMessage toNoteinMessage(NoteinMessageEntity noteinMessageEntity) {
        if (noteinMessageEntity == null) {
            return null;
        }
        Map<String, String> title = noteinMessageEntity.getTitle();
        HashMap map = title != null ? new HashMap(title) : null;
        Map<String, String> content = noteinMessageEntity.getContent();
        return new NoteinMessage(noteinMessageEntity.getId(), noteinMessageEntity.getUid(), map, content != null ? new HashMap(content) : null, noteinMessageEntity.getCreationTime(), noteinMessageEntity.getType(), noteinMessageEntity.getUnread());
    }
}
