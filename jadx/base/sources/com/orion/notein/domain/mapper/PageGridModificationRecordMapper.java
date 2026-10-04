package com.orion.notein.domain.mapper;

import com.google.firebase.messaging.Constants;
import com.orion.notein.data.p602db.entity.cache.PageGridModificationRecordEntity;
import com.orion.notein.domain.models.cache.PageGridModificationRecord;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m80611d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0005H&¨\u0006\n"}, m80612d2 = {"Lcom/orion/notein/domain/mapper/PageGridModificationRecordMapper;", "", "<init>", "()V", "toEntity", "Lcom/orion/notein/data/db/entity/cache/PageGridModificationRecordEntity;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/orion/notein/domain/models/cache/PageGridModificationRecord;", "toModel", "entity", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public abstract class PageGridModificationRecordMapper {
    public abstract PageGridModificationRecordEntity toEntity(PageGridModificationRecord data);

    public abstract PageGridModificationRecord toModel(PageGridModificationRecordEntity entity);
}
