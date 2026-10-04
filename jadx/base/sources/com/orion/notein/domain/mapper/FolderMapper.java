package com.orion.notein.domain.mapper;

import com.orion.notein.data.p602db.entity.FolderEntity;
import com.orion.notein.domain.models.folder.Folder;
import o0OOoooO.C27996OooO00o;

/* JADX INFO: loaded from: classes9.dex */
public abstract class FolderMapper {
    public void fillEntity(Folder folder, FolderEntity folderEntity) {
        if (folder.getCoverColor() != null) {
            folderEntity.setCoverColor(folder.getCoverColor());
        } else {
            int i = C27996OooO00o.f99274OooO00o;
            folderEntity.setCoverColor(Integer.valueOf(C27996OooO00o.f99274OooO00o));
        }
    }

    public void fillModel(FolderEntity folderEntity, Folder folder) {
        if (folderEntity.getCoverColor() != null) {
            folder.setCoverColor(folderEntity.getCoverColor());
        } else {
            int i = C27996OooO00o.f99274OooO00o;
            folder.setCoverColor(Integer.valueOf(C27996OooO00o.f99274OooO00o));
        }
    }

    public abstract FolderEntity toEntity(Folder folder);

    public abstract Folder toFolder(FolderEntity folderEntity);
}
