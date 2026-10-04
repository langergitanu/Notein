package o00O0O00;

import androidx.window.sidecar.SidecarDisplayFeature;
import kotlin.jvm.internal.OooOOO0;
import kotlin.jvm.internal.OooOOOO;
import oO0O000o.InterfaceC32507OooOO0o;

/* JADX INFO: renamed from: o00O0O00.OooO0o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C24831OooO0o0 extends OooOOOO implements InterfaceC32507OooOO0o<SidecarDisplayFeature, Boolean> {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public static final C24831OooO0o0 f84214OooOo0o = new C24831OooO0o0(1);

    @Override // oO0O000o.InterfaceC32507OooOO0o
    /* JADX INFO: renamed from: OooO00o, reason: merged with bridge method [inline-methods] */
    public final Boolean invoke(SidecarDisplayFeature require) {
        OooOOO0.OooO0oO(require, "$this$require");
        return Boolean.valueOf(require.getRect().left == 0 || require.getRect().top == 0);
    }
}
