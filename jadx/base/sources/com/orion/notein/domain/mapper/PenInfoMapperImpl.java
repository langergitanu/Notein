package com.orion.notein.domain.mapper;

import com.orion.notein.data.p602db.entity.PenInfoEntity;
import com.orion.notein.domain.models.note.PenInfo;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public class PenInfoMapperImpl extends PenInfoMapper {
    @Override // com.orion.notein.domain.mapper.PenInfoMapper
    public PenInfoEntity toEntity(PenInfo penInfo) {
        if (penInfo == null) {
            return null;
        }
        List<Integer> colorList = penInfo.getColorList();
        ArrayList arrayList = colorList != null ? new ArrayList(colorList) : null;
        List<Float> widthList = penInfo.getWidthList();
        return new PenInfoEntity(penInfo.getId(), penInfo.getType(), penInfo.getColorIndex(), penInfo.getWidthIndex(), arrayList, widthList != null ? new ArrayList(widthList) : null, penInfo.getNoteId(), penInfo.getSelected(), penInfo.getExtra());
    }

    @Override // com.orion.notein.domain.mapper.PenInfoMapper
    public PenInfo toPenInfo(PenInfoEntity penInfoEntity) {
        if (penInfoEntity == null) {
            return null;
        }
        List<Integer> colorList = penInfoEntity.getColorList();
        ArrayList arrayList = colorList != null ? new ArrayList(colorList) : null;
        List<Float> widthList = penInfoEntity.getWidthList();
        return new PenInfo(penInfoEntity.getId(), penInfoEntity.getType(), penInfoEntity.getColorIndex(), penInfoEntity.getWidthIndex(), arrayList, widthList != null ? new ArrayList(widthList) : null, penInfoEntity.getNoteId(), penInfoEntity.getSelected(), penInfoEntity.getExtra());
    }
}
