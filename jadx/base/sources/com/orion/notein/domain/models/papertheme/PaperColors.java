package com.orion.notein.domain.models.papertheme;

import android.graphics.Color;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m80611d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0016\u0010\b\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007R\u0016\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0007R\u0016\u0010\f\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u0007R\u0016\u0010\u000e\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0007¨\u0006\u0010"}, m80612d2 = {"Lcom/orion/notein/domain/models/papertheme/PaperColors;", "", "<init>", "()V", "COLOR_01", "", "getCOLOR_01", "()I", "COLOR_02", "getCOLOR_02", "COLOR_03", "getCOLOR_03", "COLOR_04", "getCOLOR_04", "COLOR_05", "getCOLOR_05", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final class PaperColors {
    public static final PaperColors INSTANCE = new PaperColors();
    private static final int COLOR_01 = Color.parseColor("#FFFCF9F4");
    private static final int COLOR_02 = Color.parseColor("#FFFFEABD");
    private static final int COLOR_03 = Color.parseColor("#FFE7EFEF");
    private static final int COLOR_04 = Color.parseColor("#FFE7DFDE");
    private static final int COLOR_05 = Color.parseColor("#FF292829");

    private PaperColors() {
    }

    public final int getCOLOR_01() {
        return COLOR_01;
    }

    public final int getCOLOR_02() {
        return COLOR_02;
    }

    public final int getCOLOR_03() {
        return COLOR_03;
    }

    public final int getCOLOR_04() {
        return COLOR_04;
    }

    public final int getCOLOR_05() {
        return COLOR_05;
    }
}
