package com.orion.notein.domain.models.page;

import com.orion.notein.domain.models.papertheme.ColorPaperTheme;
import com.orion.notein.domain.models.papertheme.LambdaPaperTheme;
import com.orion.notein.domain.models.papertheme.PaperTheme;
import com.orion.notein.domain.models.papertheme.ThemeCategory;
import com.orion.notein.domain.models.papertheme.paperstyle.PaperStyle;
import kotlin.Metadata;
import o0OOOO00.OooOO0O;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m80611d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\b\u0010\u0000\u001a\u00020\u0001H\u0002¨\u0006\u0002"}, m80612d2 = {"defaultPagePaddingTheme", "Lcom/orion/notein/domain/models/papertheme/PaperTheme;", "app_google_playRelease"}, m80613k = 2, m80614mv = {2, 1, 0}, m80616xi = 48)
public final class PagePaddingStyleKt {
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final PaperTheme defaultPagePaddingTheme() {
        ColorPaperTheme colorPaperTheme = new ColorPaperTheme(null, -1, 1, 0 == true ? 1 : 0);
        ThemeCategory themeCategory = OooOO0O.f94356OooOO0;
        return new LambdaPaperTheme(colorPaperTheme, OooOO0O.f94361OooOOOO, PaperOrientation.VERTICAL, null, PaperStyle.INSTANCE.getBLANK_PAPER(), null, 40, null);
    }
}
