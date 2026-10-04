package com.orion.notein.domain.mapper;

import com.google.gson.reflect.TypeToken;
import com.orion.notein.data.p602db.entity.p603ai.NoteAiContentEntity;
import com.orion.notein.domain.models.p605ai.NoteAiContent;
import java.util.ArrayList;
import o0Oo00o.C28028OooO0o;

/* JADX INFO: loaded from: classes9.dex */
public abstract class NoteAiContentMapper {
    public void fillEntity(NoteAiContent noteAiContent, NoteAiContentEntity noteAiContentEntity) {
        noteAiContentEntity.setSummaryIdListJson(C28028OooO0o.OooO00o().toJson(noteAiContent.getSummaryIdList()));
    }

    public void fillModel(NoteAiContentEntity noteAiContentEntity, NoteAiContent noteAiContent) {
        ArrayList arrayList = (ArrayList) C28028OooO0o.OooO00o().fromJson(noteAiContentEntity.getSummaryIdListJson(), new TypeToken<ArrayList<String>>() { // from class: com.orion.notein.domain.mapper.NoteAiContentMapper.1
        }.getType());
        if (arrayList == null) {
            arrayList = new ArrayList();
        }
        noteAiContent.setSummaryIdList(arrayList);
    }

    public abstract NoteAiContentEntity toEntity(NoteAiContent noteAiContent);

    public abstract NoteAiContent toModel(NoteAiContentEntity noteAiContentEntity);
}
