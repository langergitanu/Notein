package androidx.ink.brush;

import androidx.ink.nativeloader.UsedByNative;
import kotlin.Metadata;
import o000OOoO.OooO00o;

/* JADX INFO: loaded from: classes.dex */
@UsedByNative
@Metadata(m80611d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0011\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0087 J\u0011\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0087 J\u0011\u0010\t\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0087 J\u0019\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0007H\u0087 J)\u0010\f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0007H\u0087 J\t\u0010\u0011\u001a\u00020\u0005H\u0087 ¨\u0006\u0012"}, m80612d2 = {"Landroidx/ink/brush/StockBrushesNative;", "", "<init>", "()V", "createMarker", "", "version", "", "createDashedLine", "createPressurePen", "createHighlighter", "selfOverlap", "createEmojiHighlighter", "clientTextureId", "", "showMiniEmojiTrail", "", "createPredictionFadeOutBehavior", "ink-brush"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final class StockBrushesNative {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final StockBrushesNative f65354OooO00o = new StockBrushesNative();

    static {
        OooO00o.f82887OooO00o.OooO00o();
    }

    @UsedByNative
    public final native long createDashedLine(int version);

    @UsedByNative
    public final native long createEmojiHighlighter(String clientTextureId, boolean showMiniEmojiTrail, int selfOverlap, int version);

    @UsedByNative
    public final native long createHighlighter(int selfOverlap, int version);

    @UsedByNative
    public final native long createMarker(int version);

    @UsedByNative
    public final native long createPredictionFadeOutBehavior();

    @UsedByNative
    public final native long createPressurePen(int version);
}
