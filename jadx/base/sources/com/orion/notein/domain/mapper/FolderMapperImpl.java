package com.orion.notein.domain.mapper;

import com.orion.notein.data.p602db.entity.FolderEntity;
import com.orion.notein.domain.models.folder.Folder;

/* JADX INFO: loaded from: classes9.dex */
public class FolderMapperImpl extends FolderMapper {
    @Override // com.orion.notein.domain.mapper.FolderMapper
    public FolderEntity toEntity(Folder folder) {
        if (folder == null) {
            return null;
        }
        FolderEntity folderEntity = new FolderEntity(folder.getId(), folder.getUserId(), folder.getTitle(), folder.getParentId(), folder.getRecoverParentId(), folder.getFavorite(), folder.getInTrashBin(), folder.getCreationTime(), folder.getLastModificationTime(), folder.getTnPath(), folder.getSortKey(), null);
        fillEntity(folder, folderEntity);
        return folderEntity;
    }

    @Override // com.orion.notein.domain.mapper.FolderMapper
    public Folder toFolder(FolderEntity folderEntity) {
        if (folderEntity == null) {
            return null;
        }
        Folder folder = new Folder();
        folder.setId(folderEntity.getId());
        folder.setUserId(folderEntity.getUserId());
        folder.setParentId(folderEntity.getParentId());
        folder.setRecoverParentId(folderEntity.getRecoverParentId());
        folder.setTitle(folderEntity.getTitle());
        folder.setFavorite(folderEntity.getFavorite());
        folder.setInTrashBin(folderEntity.getInTrashBin());
        folder.setCreationTime(folderEntity.getCreationTime());
        folder.setLastModificationTime(folderEntity.getLastModificationTime());
        folder.setTnPath(folderEntity.getTnPath());
        folder.setSortKey(folderEntity.getSortKey());
        fillModel(folderEntity, folder);
        return folder;
    }
}
