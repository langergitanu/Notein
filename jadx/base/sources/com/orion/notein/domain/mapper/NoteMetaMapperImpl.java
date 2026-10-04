package com.orion.notein.domain.mapper;

import com.orion.notein.data.p602db.entity.NoteMetaEntity;
import com.orion.notein.domain.models.note.NoteMeta;
import com.orion.notein.domain.models.note.PdfInfo;

/* JADX INFO: loaded from: classes9.dex */
public class NoteMetaMapperImpl extends NoteMetaMapper {
    private String metaPdfInfoId(NoteMeta noteMeta) {
        PdfInfo pdfInfo;
        String id;
        if (noteMeta == null || (pdfInfo = noteMeta.getPdfInfo()) == null || (id = pdfInfo.getId()) == null) {
            return null;
        }
        return id;
    }

    @Override // com.orion.notein.domain.mapper.NoteMetaMapper
    public NoteMetaEntity toEntity(NoteMeta noteMeta) {
        if (noteMeta == null) {
            return null;
        }
        return new NoteMetaEntity(noteMeta.getId(), noteMeta.getUserId(), noteMeta.getTitle(), noteMeta.getParentId(), noteMeta.getRecoverParentId(), noteMeta.getFavorite(), noteMeta.getTnPath(), noteMeta.getTnWidth(), noteMeta.getTnHeight(), noteMeta.getInTrashBin(), noteMeta.getCreationTime(), noteMeta.getLastModificationTime(), noteMeta.getSortKey(), metaPdfInfoId(noteMeta), noteMeta.getTotalPagesCount(), noteMeta.getUnboundedNote(), noteMeta.getUsingOwnPdf(), noteMeta.getLockAdded(), noteMeta.getLastOpenedTime());
    }

    @Override // com.orion.notein.domain.mapper.NoteMetaMapper
    public NoteMeta toModel(NoteMetaEntity noteMetaEntity) {
        if (noteMetaEntity == null) {
            return null;
        }
        NoteMeta noteMeta = new NoteMeta();
        noteMeta.setId(noteMetaEntity.getId());
        noteMeta.setUserId(noteMetaEntity.getUserId());
        noteMeta.setTitle(noteMetaEntity.getTitle());
        noteMeta.setParentId(noteMetaEntity.getParentId());
        noteMeta.setRecoverParentId(noteMetaEntity.getRecoverParentId());
        noteMeta.setFavorite(noteMetaEntity.getFavorite());
        noteMeta.setTnPath(noteMetaEntity.getTnPath());
        noteMeta.setTnWidth(noteMetaEntity.getTnWidth());
        noteMeta.setTnHeight(noteMetaEntity.getTnHeight());
        noteMeta.setInTrashBin(noteMetaEntity.getInTrashBin());
        noteMeta.setTotalPagesCount(noteMetaEntity.getTotalPagesCount());
        noteMeta.setCreationTime(noteMetaEntity.getCreationTime());
        noteMeta.setLastModificationTime(noteMetaEntity.getLastModificationTime());
        noteMeta.setSortKey(noteMetaEntity.getSortKey());
        noteMeta.setUnboundedNote(noteMetaEntity.getUnboundedNote());
        noteMeta.setUsingOwnPdf(noteMetaEntity.getUsingOwnPdf());
        noteMeta.setLockAdded(noteMetaEntity.getLockAdded());
        noteMeta.setLastOpenedTime(noteMetaEntity.getLastOpenedTime());
        fillModel(noteMetaEntity, noteMeta);
        return noteMeta;
    }
}
