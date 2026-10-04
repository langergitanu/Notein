package o0O0O00;

import android.os.Build;
import android.text.StaticLayout;

/* JADX INFO: renamed from: o0O0O00.OooOO0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C25854OooOO0o implements InterfaceC25861OooOo0o {
    @Override // o0O0O00.InterfaceC25861OooOo0o
    public StaticLayout OooO00o(OooOo params) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(params, "params");
        StaticLayout.Builder builderObtain = StaticLayout.Builder.obtain(params.f88234OooO00o, 0, params.f88235OooO0O0, params.f88236OooO0OO, params.f88237OooO0Oo);
        builderObtain.setTextDirection(params.f88239OooO0o0);
        builderObtain.setAlignment(params.f88238OooO0o);
        builderObtain.setMaxLines(params.f88240OooO0oO);
        builderObtain.setEllipsize(params.f88241OooO0oo);
        builderObtain.setEllipsizedWidth(params.f88233OooO);
        builderObtain.setLineSpacing(0.0f, 1.0f);
        builderObtain.setIncludePad(params.f88243OooOO0O);
        builderObtain.setBreakStrategy(params.f88246OooOOO0);
        builderObtain.setHyphenationFrequency(params.f88248OooOOOo);
        builderObtain.setIndents(null, null);
        int i = Build.VERSION.SDK_INT;
        OooOOO0.OooO00o(builderObtain, params.f88242OooOO0);
        if (i >= 28) {
            OooOOO.OooO00o(builderObtain, params.f88244OooOO0o);
        }
        if (i >= 33) {
            C25859OooOo0.OooO0O0(builderObtain, params.f88245OooOOO, params.f88247OooOOOO);
        }
        StaticLayout staticLayoutBuild = builderObtain.build();
        kotlin.jvm.internal.OooOOO0.OooO0o(staticLayoutBuild, "obtain(params.text, para…  }\n            }.build()");
        return staticLayoutBuild;
    }
}
