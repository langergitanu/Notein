package o0Oo0o0o;

import android.content.Context;
import androidx.core.content.ContextCompat;
import com.orion.notein.domain.models.papertheme.ColorPaperTheme;
import com.orion.notein.domain.models.papertheme.LambdaPaperTheme;
import com.orion.notein.domain.models.papertheme.paperstyle.NonePaperStyle;
import com.orion.notein.global.R;

/* JADX INFO: renamed from: o0Oo0o0o.OoooO0O, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C28264OoooO0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final /* synthetic */ int f100141OooO00o = 0;

    public static final LambdaPaperTheme OooO00o(LambdaPaperTheme lambdaPaperTheme, Context context) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(lambdaPaperTheme, "<this>");
        if (!(lambdaPaperTheme.getBaseTheme() instanceof ColorPaperTheme)) {
            return lambdaPaperTheme;
        }
        return LambdaPaperTheme.copy$default(lambdaPaperTheme, ColorPaperTheme.copy$default((ColorPaperTheme) lambdaPaperTheme.getBaseTheme(), null, ContextCompat.getColor(context, R.color.paper_config_none_paper_theme_bg_color), 1, null), null, null, null, null, null, 62, null);
    }

    public static final LambdaPaperTheme OooO0O0(LambdaPaperTheme lambdaPaperTheme, Context context) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(lambdaPaperTheme, "<this>");
        return lambdaPaperTheme.getPaperStyle() instanceof NonePaperStyle ? LambdaPaperTheme.copy$default(lambdaPaperTheme, null, null, null, null, new NonePaperStyle(ContextCompat.getColor(context, R.color.paper_config_none_paper_theme_text_color)), null, 47, null) : lambdaPaperTheme;
    }
}
