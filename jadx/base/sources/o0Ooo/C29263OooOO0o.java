package o0Ooo;

import android.widget.ImageView;
import com.orion.notein.p607ui.noteeditor.penbox.PenBoxChildFragment;
import o00O0oo0.C24969OooOO0;
import oO00ooO.C32460OooOooO;

/* JADX INFO: renamed from: o0Ooo.OooOO0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C29263OooOO0o implements oO0O000o.OooO00o {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ int f103766OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ PenBoxChildFragment f103767OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ int f103768OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ int f103769OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final /* synthetic */ int f103770OooOoOO;

    public /* synthetic */ C29263OooOO0o(PenBoxChildFragment penBoxChildFragment, int i, int i2, int i3, int i4) {
        this.f103767OooOo0o = penBoxChildFragment;
        this.f103766OooOo = i;
        this.f103769OooOoO0 = i2;
        this.f103768OooOoO = i3;
        this.f103770OooOoOO = i4;
    }

    @Override // oO0O000o.OooO00o
    public final Object invoke() {
        PenBoxChildFragment penBoxChildFragment = this.f103767OooOo0o;
        ImageView imageView = penBoxChildFragment.f75373OoooO;
        if (imageView == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("toolBoxIcon");
            throw null;
        }
        imageView.setImageResource(this.f103766OooOo);
        ImageView imageView2 = penBoxChildFragment.f75377OoooOO0;
        if (imageView2 == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("toolBoxTapePenTint");
            throw null;
        }
        int i = this.f103769OooOoO0;
        imageView2.setVisibility(i == 11 ? 0 : 8);
        int i2 = this.f103768OooOoO;
        if (i2 != 0) {
            ImageView imageView3 = penBoxChildFragment.f75402o000oOoO;
            if (imageView3 == null) {
                kotlin.jvm.internal.OooOOO0.OooOOOO("toolBoxIconTint");
                throw null;
            }
            imageView3.setImageResource(i2);
            ImageView imageView4 = penBoxChildFragment.f75402o000oOoO;
            if (imageView4 == null) {
                kotlin.jvm.internal.OooOOO0.OooOOOO("toolBoxIconTint");
                throw null;
            }
            int i3 = this.f103770OooOoOO;
            imageView4.setColorFilter(C24969OooOO0.OooO0OO(i3));
            ImageView imageView5 = penBoxChildFragment.f75402o000oOoO;
            if (imageView5 == null) {
                kotlin.jvm.internal.OooOOO0.OooOOOO("toolBoxIconTint");
                throw null;
            }
            imageView5.setVisibility(0);
            if (i == 11) {
                ImageView imageView6 = penBoxChildFragment.f75402o000oOoO;
                if (imageView6 == null) {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("toolBoxIconTint");
                    throw null;
                }
                imageView6.clearColorFilter();
                ImageView imageView7 = penBoxChildFragment.f75377OoooOO0;
                if (imageView7 == null) {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("toolBoxTapePenTint");
                    throw null;
                }
                imageView7.setColorFilter(C24969OooOO0.OooO0OO(i3));
            }
        } else {
            ImageView imageView8 = penBoxChildFragment.f75402o000oOoO;
            if (imageView8 == null) {
                kotlin.jvm.internal.OooOOO0.OooOOOO("toolBoxIconTint");
                throw null;
            }
            imageView8.setVisibility(8);
        }
        return C32460OooOooO.f116667OooO00o;
    }
}
