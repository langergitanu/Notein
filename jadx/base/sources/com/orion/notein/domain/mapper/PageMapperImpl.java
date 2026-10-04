package com.orion.notein.domain.mapper;

import com.orion.notein.data.p602db.entity.PageEntity;
import com.orion.notein.domain.models.page.Page;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public class PageMapperImpl extends PageMapper {
    @Override // com.orion.notein.domain.mapper.PageMapper
    public PageEntity toEntity(Page page) {
        if (page == null) {
            return null;
        }
        boolean unbounded = page.getUnbounded();
        int source = page.getSource();
        boolean inTrashBin = page.getInTrashBin();
        List<String> historyPageIdList = page.getHistoryPageIdList();
        PageEntity pageEntity = new PageEntity(page.getId(), page.getNoteId(), null, page.getPaperOrientation(), null, 0, null, null, page.getCreationTime(), page.getLastModificationTime(), page.getTnPath(), unbounded, source, page.getRecoverNoteId(), page.getRecoverNoteTitle(), page.getRecoverIndex(), inTrashBin, historyPageIdList != null ? new ArrayList(historyPageIdList) : null, 0);
        fillEntity(page, pageEntity);
        return pageEntity;
    }

    @Override // com.orion.notein.domain.mapper.PageMapper
    public Page toPage(PageEntity pageEntity) {
        if (pageEntity == null) {
            return null;
        }
        Page page = new Page();
        page.setId(pageEntity.getId());
        page.setNoteId(pageEntity.getNoteId());
        page.setPaperOrientation(pageEntity.getPaperOrientation());
        page.setTnPath(pageEntity.getTnPath());
        page.setUnbounded(pageEntity.getUnbounded());
        page.setSource(pageEntity.getSource());
        page.setCreationTime(pageEntity.getCreationTime());
        page.setLastModificationTime(pageEntity.getLastModificationTime());
        page.setRecoverNoteId(pageEntity.getRecoverNoteId());
        page.setRecoverNoteTitle(pageEntity.getRecoverNoteTitle());
        page.setRecoverIndex(pageEntity.getRecoverIndex());
        page.setInTrashBin(pageEntity.getInTrashBin());
        List<String> historyPageIdList = pageEntity.getHistoryPageIdList();
        if (historyPageIdList != null) {
            page.setHistoryPageIdList(new ArrayList(historyPageIdList));
        }
        fillModel(pageEntity, page);
        return page;
    }
}
