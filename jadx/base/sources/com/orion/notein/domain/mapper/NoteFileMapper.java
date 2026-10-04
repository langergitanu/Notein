package com.orion.notein.domain.mapper;

import android.text.TextUtils;
import com.google.api.services.drive.model.File;
import com.orion.notein.data.p602db.entity.NoteFileEntity;
import com.orion.notein.domain.models.cloudsync.CloudMetaExtra;
import com.orion.notein.domain.models.folder.Folder;
import com.orion.notein.domain.models.note.NoteFile;
import com.orion.notein.domain.models.note.NoteMeta;
import com.orion.notein.domain.models.papertheme.MyTemplate;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
public abstract class NoteFileMapper {
    public void fillEntity(NoteFileEntity noteFileEntity, NoteFile noteFile) {
        String mimeType = noteFileEntity.getMimeType();
        if (TextUtils.isEmpty(mimeType)) {
            return;
        }
        noteFile.setMimeType(mimeType);
    }

    public void fillEntityByGoogleFile(File file, NoteFileEntity noteFileEntity) {
        Map<String, String> properties = file.getProperties();
        if (properties != null) {
            String str = properties.get(NoteMeta.PROPERTY_NOTE_ID);
            if (str != null) {
                noteFileEntity.setNoteId(str);
            }
            String str2 = properties.get(NoteMeta.PROPERTY_LAST_MODIFICATION_TIME);
            if (!TextUtils.isEmpty(str2)) {
                noteFileEntity.setLastModificationTime(Long.parseLong(str2));
            }
            String str3 = properties.get(NoteMeta.PROPERTY_PARENT_ID);
            Integer numValueOf = null;
            if (TextUtils.isEmpty(str3) || CloudMetaExtra.DEFINE_NON_PARENT_ID.equals(str3)) {
                noteFileEntity.setParentId(null);
            } else {
                noteFileEntity.setParentId(str3);
            }
            String str4 = properties.get(NoteMeta.PROPERTY_SORT_KEY);
            if (TextUtils.isEmpty(str4) || CloudMetaExtra.DEFINE_NON_PARENT_ID.equals(str4)) {
                noteFileEntity.setSortKey(null);
            } else {
                try {
                    numValueOf = Integer.valueOf(Integer.parseInt(str4));
                } catch (Exception unused) {
                }
                noteFileEntity.setSortKey(numValueOf);
            }
            String str5 = properties.get(NoteMeta.PROPERTY_FAVORITE);
            if (!TextUtils.isEmpty(str5)) {
                noteFileEntity.setFavorite(Boolean.parseBoolean(str5));
            }
            noteFileEntity.setTitle(properties.get(NoteMeta.PROPERTY_TITLE));
            String str6 = properties.get(NoteMeta.PROPERTY_IN_TRASH_BIN);
            if (!TextUtils.isEmpty(str6)) {
                noteFileEntity.setInTrashBin(Boolean.parseBoolean(str6));
            }
            String str7 = properties.get(MyTemplate.PROPERTY_TEMPLATE_ID);
            if (str7 != null) {
                noteFileEntity.setTemplateId(str7);
            }
            String str8 = properties.get(Folder.PROPERTY_FOLDER_ID);
            if (str8 != null) {
                noteFileEntity.setFolderId(str8);
            }
            String str9 = properties.get("dbVersion");
            if (str9 != null) {
                noteFileEntity.setDbVersion(Integer.parseInt(str9));
            }
            String str10 = properties.get(NoteMeta.PROPERTY_USING_OWN_PDF);
            if (TextUtils.isEmpty(str10)) {
                noteFileEntity.setUsingOwnPdf(false);
            } else {
                noteFileEntity.setUsingOwnPdf(Boolean.parseBoolean(str10));
            }
            String str11 = properties.get(NoteMeta.PROPERTY_LOCK_ADDED);
            if (TextUtils.isEmpty(str11)) {
                noteFileEntity.setLockAdded(false);
            } else {
                noteFileEntity.setLockAdded(Boolean.parseBoolean(str11));
            }
        }
    }

    public abstract NoteFile toNoteFile(NoteFileEntity noteFileEntity);

    public abstract NoteFileEntity toNoteFileEntity(com.huawei.cloud.services.drive.model.File file);

    public abstract NoteFileEntity toNoteFileEntityFromGoogleFile(File file);

    public abstract NoteFile toOneDriveNoteFile(NoteFileEntity noteFileEntity);

    public void fillEntity(com.huawei.cloud.services.drive.model.File file, NoteFileEntity noteFileEntity) {
        Map<String, String> properties = file.getProperties();
        if (properties != null) {
            String str = properties.get(NoteMeta.PROPERTY_NOTE_ID);
            if (str != null) {
                noteFileEntity.setNoteId(str);
            }
            String str2 = properties.get(NoteMeta.PROPERTY_LAST_MODIFICATION_TIME);
            if (!TextUtils.isEmpty(str2)) {
                noteFileEntity.setLastModificationTime(Long.parseLong(str2));
            }
            String str3 = properties.get(NoteMeta.PROPERTY_PARENT_ID);
            Integer numValueOf = null;
            if (!TextUtils.isEmpty(str3) && !CloudMetaExtra.DEFINE_NON_PARENT_ID.equals(str3)) {
                noteFileEntity.setParentId(str3);
            } else {
                noteFileEntity.setParentId(null);
            }
            String str4 = properties.get(NoteMeta.PROPERTY_SORT_KEY);
            if (!TextUtils.isEmpty(str4) && !CloudMetaExtra.DEFINE_NON_PARENT_ID.equals(str4)) {
                try {
                    numValueOf = Integer.valueOf(Integer.parseInt(str4));
                } catch (Exception unused) {
                }
                noteFileEntity.setSortKey(numValueOf);
            } else {
                noteFileEntity.setSortKey(null);
            }
            String str5 = properties.get(NoteMeta.PROPERTY_FAVORITE);
            if (!TextUtils.isEmpty(str5)) {
                noteFileEntity.setFavorite(Boolean.parseBoolean(str5));
            }
            noteFileEntity.setTitle(properties.get(NoteMeta.PROPERTY_TITLE));
            String str6 = properties.get(NoteMeta.PROPERTY_IN_TRASH_BIN);
            if (!TextUtils.isEmpty(str6)) {
                noteFileEntity.setInTrashBin(Boolean.parseBoolean(str6));
            }
            String str7 = properties.get(MyTemplate.PROPERTY_TEMPLATE_ID);
            if (str7 != null) {
                noteFileEntity.setTemplateId(str7);
            }
            String str8 = properties.get(Folder.PROPERTY_FOLDER_ID);
            if (str8 != null) {
                noteFileEntity.setFolderId(str8);
            }
            String str9 = properties.get("dbVersion");
            if (str9 != null) {
                noteFileEntity.setDbVersion(Integer.parseInt(str9));
            }
            String str10 = properties.get(NoteMeta.PROPERTY_USING_OWN_PDF);
            if (!TextUtils.isEmpty(str10)) {
                noteFileEntity.setUsingOwnPdf(Boolean.parseBoolean(str10));
            } else {
                noteFileEntity.setUsingOwnPdf(false);
            }
            String str11 = properties.get(NoteMeta.PROPERTY_LOCK_ADDED);
            if (!TextUtils.isEmpty(str11)) {
                noteFileEntity.setLockAdded(Boolean.parseBoolean(str11));
            } else {
                noteFileEntity.setLockAdded(false);
            }
        }
        noteFileEntity.setExtra(file.getDescription());
    }
}
