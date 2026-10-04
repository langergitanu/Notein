package com.orion.notein.domain.mapper;

import com.google.android.material.color.utilities.C22388OoooO0O;
import com.google.android.material.color.utilities.C22389OoooOO0;
import com.google.android.material.color.utilities.C22454o000oOoO;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.orion.notein.data.p602db.entity.NoteEntity;
import com.orion.notein.domain.models.note.Note;
import com.orion.notein.domain.models.note.PdfInfo;
import com.orion.notein.domain.models.page.Page;
import com.orion.notein.domain.models.page.PageLayer;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import o0Oo00o.C28028OooO0o;

/* JADX INFO: loaded from: classes9.dex */
public abstract class NoteMapper {
    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Page lambda$fillModel$0(String str) {
        Page page = new Page();
        page.setId(str);
        return page;
    }

    public void fillEntity(Note note, NoteEntity noteEntity) {
        noteEntity.setPageListJson(new Gson().toJson((List) note.getPages().stream().map(new C22389OoooOO0(1)).collect(Collectors.toList())));
        noteEntity.setPageLayerListJson(C28028OooO0o.OooO00o().toJson(note.getPageLayerIds()));
    }

    public void fillModel(NoteEntity noteEntity, Note note) {
        Page page = new Page();
        page.setId(noteEntity.getDefaultPageId());
        note.setDefaultPage(page);
        if (noteEntity.getZoom() < 0.1f) {
            note.setZoom(1.0f);
        }
        if (noteEntity.getPdfInfoId() != null) {
            PdfInfo pdfInfo = new PdfInfo();
            pdfInfo.setId(noteEntity.getPdfInfoId());
            note.setPdfInfo(pdfInfo);
        }
        Gson gson = new Gson();
        Type type = new TypeToken<ArrayList<String>>() { // from class: com.orion.notein.domain.mapper.NoteMapper.1
        }.getType();
        ArrayList arrayList = (ArrayList) gson.fromJson(noteEntity.getPageListJson(), type);
        if (arrayList == null) {
            arrayList = new ArrayList();
        }
        note.setPages((ArrayList) arrayList.stream().map(new C22454o000oOoO(1)).collect(Collectors.toCollection(new OooO0O0())));
        ArrayList arrayList2 = (ArrayList) C28028OooO0o.OooO00o().fromJson(noteEntity.getPageLayerListJson(), type);
        if (arrayList2 == null || arrayList2.isEmpty()) {
            note.setPageLayerIds((ArrayList) PageLayer.INSTANCE.getDefaultPageLayers(note.getId()).stream().map(new C22388OoooO0O(1)).collect(Collectors.toCollection(new OooO0O0())));
        } else {
            note.setPageLayerIds(arrayList2);
        }
        if (noteEntity.getActivatedPageLayerId() != null) {
            note.setActivatedPageLayerId(noteEntity.getActivatedPageLayerId());
            return;
        }
        Stream<String> stream = note.getPageLayerIds().stream();
        PageLayer.Companion companion = PageLayer.INSTANCE;
        Objects.requireNonNull(companion);
        String strOrElse = stream.filter(new OooO0OO(companion)).findFirst().orElse(null);
        if (strOrElse != null) {
            note.setActivatedPageLayerId(strOrElse);
        } else {
            note.setActivatedPageLayerId("default");
        }
    }

    public abstract NoteEntity toEntity(Note note);

    public abstract Note toNote(NoteEntity noteEntity);
}
