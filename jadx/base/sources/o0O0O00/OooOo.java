package o0O0O00;

import android.text.Layout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes.dex */
public final class OooOo {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final int f88233OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final CharSequence f88234OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final int f88235OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final TextPaint f88236OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final int f88237OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final Layout.Alignment f88238OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final TextDirectionHeuristic f88239OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final int f88240OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final TextUtils.TruncateAt f88241OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final int f88242OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final boolean f88243OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public final boolean f88244OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public final int f88245OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public final int f88246OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public final int f88247OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public final int f88248OooOOOo;

    public OooOo(CharSequence text, int i, TextPaint paint, int i2, TextDirectionHeuristic textDir, Layout.Alignment alignment, int i3, TextUtils.TruncateAt truncateAt, int i4, int i5, boolean z, boolean z2, int i6, int i7, int i8, int i9) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(text, "text");
        kotlin.jvm.internal.OooOOO0.OooO0oO(paint, "paint");
        kotlin.jvm.internal.OooOOO0.OooO0oO(textDir, "textDir");
        kotlin.jvm.internal.OooOOO0.OooO0oO(alignment, "alignment");
        this.f88234OooO00o = text;
        this.f88235OooO0O0 = i;
        this.f88236OooO0OO = paint;
        this.f88237OooO0Oo = i2;
        this.f88239OooO0o0 = textDir;
        this.f88238OooO0o = alignment;
        this.f88240OooO0oO = i3;
        this.f88241OooO0oo = truncateAt;
        this.f88233OooO = i4;
        this.f88242OooOO0 = i5;
        this.f88243OooOO0O = z;
        this.f88244OooOO0o = z2;
        this.f88246OooOOO0 = i6;
        this.f88245OooOOO = i7;
        this.f88247OooOOOO = i8;
        this.f88248OooOOOo = i9;
        if (i < 0) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        int length = text.length();
        if (i < 0 || i > length) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (i3 < 0) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (i2 < 0) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (i4 < 0) {
            throw new IllegalArgumentException("Failed requirement.");
        }
    }
}
