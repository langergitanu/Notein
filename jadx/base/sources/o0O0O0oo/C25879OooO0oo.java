package o0O0O0oo;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.view.View;
import com.lzf.easyfloat.data.FloatConfig;
import com.microsoft.identity.common.java.telemetry.TelemetryEventStrings;
import kotlin.jvm.internal.OooOOO0;

/* JADX INFO: renamed from: o0O0O0oo.OooO0oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C25879OooO0oo {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public int f88315OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Context f88316OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final FloatConfig f88317OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final Rect f88318OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f88319OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public int f88320OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public int f88321OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public int f88322OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public int f88323OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public float f88324OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public float f88325OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public int f88326OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public int f88327OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public int f88328OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public int f88329OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public int f88330OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public final int[] f88331OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public int f88332OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public int f88333OooOOoo;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public int f88334OooOo00;

    public C25879OooO0oo(Context context, FloatConfig config) {
        OooOOO0.OooO0oO(config, "config");
        this.f88316OooO00o = context;
        this.f88317OooO0O0 = config;
        this.f88318OooO0OO = new Rect();
        this.f88331OooOOo = new int[2];
    }

    public static int OooO00o(View view) {
        OooOOO0.OooO0oO(view, "view");
        Context applicationContext = view.getContext().getApplicationContext();
        OooOOO0.OooO0o(applicationContext, "view.context.applicationContext");
        Resources resources = applicationContext.getResources();
        int identifier = resources.getIdentifier("status_bar_height", "dimen", TelemetryEventStrings.C18741Os.OS_NAME);
        if (identifier > 0) {
            return resources.getDimensionPixelSize(identifier);
        }
        return 0;
    }
}
