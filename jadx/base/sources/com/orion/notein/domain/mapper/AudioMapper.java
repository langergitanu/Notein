package com.orion.notein.domain.mapper;

import com.orion.notein.data.p602db.entity.AudioFileEntity;
import com.orion.notein.data.p602db.entity.AudioSyncRecordEntity;
import com.orion.notein.data.p602db.entity.NoteAudioFileIdsFieldEntity;
import com.orion.notein.domain.models.note.AudioFile;
import com.orion.notein.domain.models.note.AudioSyncRecord;
import com.orion.notein.domain.models.note.NoteAudioFileIdsField;

/* JADX INFO: loaded from: classes9.dex */
public interface AudioMapper {
    AudioFileEntity toEntity(AudioFile audioFile);

    AudioSyncRecordEntity toEntity(AudioSyncRecord audioSyncRecord);

    NoteAudioFileIdsFieldEntity toEntity(NoteAudioFileIdsField noteAudioFileIdsField);

    AudioFile toModel(AudioFileEntity audioFileEntity);

    AudioSyncRecord toModel(AudioSyncRecordEntity audioSyncRecordEntity);

    NoteAudioFileIdsField toModel(NoteAudioFileIdsFieldEntity noteAudioFileIdsFieldEntity);
}
