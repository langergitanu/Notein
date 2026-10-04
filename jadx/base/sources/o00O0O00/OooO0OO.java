package o00O0O00;

import androidx.window.sidecar.SidecarDisplayFeature;
import kotlin.jvm.internal.OooOOO0;
import kotlin.jvm.internal.OooOOOO;
import oO0O000o.InterfaceC32507OooOO0o;

/* JADX INFO: loaded from: classes.dex */
public final class OooO0OO extends OooOOOO implements InterfaceC32507OooOO0o<SidecarDisplayFeature, Boolean> {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public static final OooO0OO f84210OooOo0o = new OooO0OO(1);

    @Override // oO0O000o.InterfaceC32507OooOO0o
    /* JADX INFO: renamed from: OooO00o, reason: merged with bridge method [inline-methods] */
    public final Boolean invoke(SidecarDisplayFeature require) {
        OooOOO0.OooO0oO(require, "$this$require");
        return Boolean.valueOf((require.getRect().width() == 0 && require.getRect().height() == 0) ? false : true);
    }
}
