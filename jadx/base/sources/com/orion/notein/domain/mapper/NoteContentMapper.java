package com.orion.notein.domain.mapper;

import android.os.Bundle;
import com.google.android.material.color.utilities.C22387OoooO00;
import com.google.android.material.color.utilities.C22388OoooO0O;
import com.google.android.material.color.utilities.C22389OoooOO0;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.orion.notein.data.p602db.entity.NoteContentEntity;
import com.orion.notein.data.p602db.entity.PageOffSet;
import com.orion.notein.domain.models.note.NoteContent;
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
import oOO00oo.C34406OooO00o;

/* JADX INFO: loaded from: classes9.dex */
public abstract class NoteContentMapper {
    private final Gson gson = new Gson();

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Page lambda$fillModel$0(String str) {
        Page page = new Page();
        page.setId(str);
        return page;
    }

    public void fillEntity(NoteContent noteContent, NoteContentEntity noteContentEntity) {
        noteContentEntity.setPageListJson(C28028OooO0o.OooO00o().toJson((List) noteContent.getPages().stream().map(new C22389OoooOO0(1)).collect(Collectors.toList())));
        noteContentEntity.setPageLayerListJson(C28028OooO0o.OooO00o().toJson(noteContent.getPageLayerIds()));
        noteContentEntity.setPageOffSet(new PageOffSet(noteContent.getUnboundedPageOffsetX(), noteContent.getUnboundedPageOffsetY()));
        try {
            noteContentEntity.setExtrasJson(this.gson.toJson(noteContent.getExtras()));
        } catch (Exception e) {
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooOOO0("NoteContentMapper");
            c20358OooO00o.OooO0O0(e);
        }
    }

    public void fillModel(NoteContentEntity noteContentEntity, NoteContent noteContent) {
        Page page = new Page();
        page.setId(noteContentEntity.getDefaultPageId());
        noteContent.setDefaultPage(page);
        if (noteContentEntity.getPdfInfoId() != null) {
            PdfInfo pdfInfo = new PdfInfo();
            pdfInfo.setId(noteContentEntity.getPdfInfoId());
            noteContent.setPdfInfo(pdfInfo);
        }
        Type type = new TypeToken<ArrayList<String>>() { // from class: com.orion.notein.domain.mapper.NoteContentMapper.1
        }.getType();
        ArrayList arrayList = (ArrayList) C28028OooO0o.OooO00o().fromJson(noteContentEntity.getPageListJson(), type);
        if (arrayList == null) {
            arrayList = new ArrayList();
        }
        noteContent.setPages((ArrayList) arrayList.stream().map(new C22387OoooO00(1)).collect(Collectors.toCollection(new OooO0O0())));
        ArrayList arrayList2 = (ArrayList) C28028OooO0o.OooO00o().fromJson(noteContentEntity.getPageLayerListJson(), type);
        if (arrayList2 == null || arrayList2.isEmpty()) {
            noteContent.setPageLayerIds((ArrayList) PageLayer.INSTANCE.getDefaultPageLayers(noteContent.getId()).stream().map(new C22388OoooO0O(1)).collect(Collectors.toCollection(new OooO0O0())));
        } else {
            noteContent.setPageLayerIds(arrayList2);
        }
        if (noteContentEntity.getActivatedPageLayerId() == null) {
            Stream<String> stream = noteContent.getPageLayerIds().stream();
            PageLayer.Companion companion = PageLayer.INSTANCE;
            Objects.requireNonNull(companion);
            String strOrElse = stream.filter(new OooO0OO(companion)).findFirst().orElse(null);
            if (strOrElse != null) {
                noteContent.setActivatedPageLayerId(strOrElse);
            } else {
                noteContent.setActivatedPageLayerId("default");
            }
        } else {
            noteContent.setActivatedPageLayerId(noteContentEntity.getActivatedPageLayerId());
        }
        PageOffSet pageOffSet = noteContentEntity.getPageOffSet();
        if (pageOffSet != null) {
            noteContent.setUnboundedPageOffsetX(pageOffSet.getOffsetX());
            noteContent.setUnboundedPageOffsetY(pageOffSet.getOffsetY());
        } else {
            noteContent.setUnboundedPageOffsetX(noteContentEntity.getUnboundedPageOffsetX());
            noteContent.setUnboundedPageOffsetY(noteContentEntity.getUnboundedPageOffsetY());
        }
        if (noteContentEntity.getZoom() < 0.1f) {
            noteContent.setZoom(1.0f);
        } else {
            noteContent.setZoom(noteContentEntity.getZoom());
        }
        try {
            noteContent.setExtras((Bundle) this.gson.fromJson(noteContentEntity.getExtrasJson(), Bundle.class));
        } catch (Exception e) {
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooOOO0("NoteContentMapper");
            c20358OooO00o.OooO0O0(e);
        }
    }

    public abstract NoteContentEntity toEntity(NoteContent noteContent);

    public abstract NoteContent toModel(NoteContentEntity noteContentEntity);
}
