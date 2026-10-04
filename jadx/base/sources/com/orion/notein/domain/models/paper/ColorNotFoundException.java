package com.orion.notein.domain.models.paper;

import OooOoo.C20593OooO0Oo;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m80611d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m80612d2 = {"Lcom/orion/notein/domain/models/paper/ColorNotFoundException;", "Lcom/orion/notein/domain/models/paper/PaperColorException;", "color", "", "<init>", "(I)V", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final class ColorNotFoundException extends PaperColorException {
    public ColorNotFoundException(int i) {
        super(C20593OooO0Oo.OooO0O0("Color #", Integer.toHexString(i), " not found"), null);
    }
}
