package com.orion.notein.domain.mapper;

import com.orion.notein.data.p602db.entity.AudioFileEntity;
import com.orion.notein.data.p602db.entity.AudioSyncRecordEntity;
import com.orion.notein.data.p602db.entity.NoteAudioFileIdsFieldEntity;
import com.orion.notein.domain.models.note.AudioFile;
import com.orion.notein.domain.models.note.AudioSyncRecord;
import com.orion.notein.domain.models.note.NoteAudioFileIdsField;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public class AudioMapperImpl implements AudioMapper {
    @Override // com.orion.notein.domain.mapper.AudioMapper
    public AudioSyncRecordEntity toEntity(AudioSyncRecord audioSyncRecord) {
        if (audioSyncRecord == null) {
            return null;
        }
        return new AudioSyncRecordEntity(audioSyncRecord.getId(), audioSyncRecord.getAudioId(), audioSyncRecord.getAudioPosition(), audioSyncRecord.getDisplayItemId(), audioSyncRecord.getDisplayItemType(), audioSyncRecord.getCreationTime(), audioSyncRecord.getLastModificationTime(), audioSyncRecord.getDeleted());
    }

    @Override // com.orion.notein.domain.mapper.AudioMapper
    public AudioSyncRecord toModel(AudioSyncRecordEntity audioSyncRecordEntity) {
        if (audioSyncRecordEntity == null) {
            return null;
        }
        return new AudioSyncRecord(audioSyncRecordEntity.getId(), audioSyncRecordEntity.getAudioId(), audioSyncRecordEntity.getAudioPosition(), audioSyncRecordEntity.getDisplayItemId(), audioSyncRecordEntity.getDisplayItemType(), audioSyncRecordEntity.getCreationTime(), audioSyncRecordEntity.getLastModificationTime(), audioSyncRecordEntity.getDeleted());
    }

    @Override // com.orion.notein.domain.mapper.AudioMapper
    public AudioFileEntity toEntity(AudioFile audioFile) {
        if (audioFile == null) {
            return null;
        }
        return new AudioFileEntity(audioFile.getId(), audioFile.getFilePath(), audioFile.getAudioName(), audioFile.getDuration(), audioFile.getPlaySpeed(), audioFile.getCreationTime(), audioFile.getLastModificationTime());
    }

    @Override // com.orion.notein.domain.mapper.AudioMapper
    public AudioFile toModel(AudioFileEntity audioFileEntity) {
        if (audioFileEntity == null) {
            return null;
        }
        return new AudioFile(audioFileEntity.getId(), audioFileEntity.getFilePath(), audioFileEntity.getAudioName(), audioFileEntity.getDuration(), audioFileEntity.getPlaySpeed(), audioFileEntity.getCreationTime(), audioFileEntity.getLastModificationTime());
    }

    @Override // com.orion.notein.domain.mapper.AudioMapper
    public NoteAudioFileIdsFieldEntity toEntity(NoteAudioFileIdsField noteAudioFileIdsField) {
        if (noteAudioFileIdsField == null) {
            return null;
        }
        List<String> fileIds = noteAudioFileIdsField.getFileIds();
        return new NoteAudioFileIdsFieldEntity(noteAudioFileIdsField.getId(), noteAudioFileIdsField.getNoteId(), fileIds != null ? new ArrayList(fileIds) : null);
    }

    @Override // com.orion.notein.domain.mapper.AudioMapper
    public NoteAudioFileIdsField toModel(NoteAudioFileIdsFieldEntity noteAudioFileIdsFieldEntity) {
        if (noteAudioFileIdsFieldEntity == null) {
            return null;
        }
        List<String> fileIds = noteAudioFileIdsFieldEntity.getFileIds();
        return new NoteAudioFileIdsField(noteAudioFileIdsFieldEntity.getId(), noteAudioFileIdsFieldEntity.getNoteId(), fileIds != null ? new ArrayList(fileIds) : null);
    }
}
