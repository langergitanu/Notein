package o0O0O00;

import android.graphics.text.LineBreakConfig;
import android.text.StaticLayout;

/* JADX INFO: renamed from: o0O0O00.OooOo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C25859OooOo0 {
    public static final boolean OooO00o(StaticLayout layout) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(layout, "layout");
        return layout.isFallbackLineSpacingEnabled();
    }

    public static final void OooO0O0(StaticLayout.Builder builder, int i, int i2) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(builder, "builder");
        LineBreakConfig lineBreakConfigBuild = OooOo00.OooO00o().setLineBreakStyle(i).setLineBreakWordStyle(i2).build();
        kotlin.jvm.internal.OooOOO0.OooO0o(lineBreakConfigBuild, "Builder()\n              …\n                .build()");
        builder.setLineBreakConfig(lineBreakConfigBuild);
    }
}
