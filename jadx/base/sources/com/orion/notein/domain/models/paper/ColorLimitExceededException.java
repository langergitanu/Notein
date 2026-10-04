package com.orion.notein.domain.models.paper;

import androidx.appcompat.widget.C21532OooOOo;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m80611d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m80612d2 = {"Lcom/orion/notein/domain/models/paper/ColorLimitExceededException;", "Lcom/orion/notein/domain/models/paper/PaperColorException;", "limit", "", "<init>", "(I)V", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final class ColorLimitExceededException extends PaperColorException {
    public ColorLimitExceededException(int i) {
        super(C21532OooOOo.OooO0OO(i, "Custom color count reached limit: "), null);
    }
}
